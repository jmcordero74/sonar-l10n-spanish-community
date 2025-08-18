package org.sonar.plugins.l10n;

import org.junit.Test;
import org.junit.Assert;
import org.sonar.api.internal.PluginContextImpl;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.utils.Version;
import org.sonar.test.i18n.I18nMatchers;

public class SpanishPackPluginTest {

  @Test
  public void bundles_should_be_up_to_date() {
    I18nMatchers.assertBundlesUpToDate();
  }

  // coverage
  @Test
  public void testChinesePackPlugin() {
    SpanishPackPlugin spanishPackPlugin = new SpanishPackPlugin();

    String pluginName = spanishPackPlugin.toString();
    Assert.assertEquals("SpanishPackPlugin", pluginName);

    SonarRuntime runtime = SonarRuntimeImpl.forSonarQube(Version.create(8, 5),
      SonarQubeSide.SCANNER, SonarEdition.COMMUNITY);
    Plugin.Context context = new PluginContextImpl.Builder().setSonarRuntime(runtime).build();
    spanishPackPlugin.define(context);
  }
}
