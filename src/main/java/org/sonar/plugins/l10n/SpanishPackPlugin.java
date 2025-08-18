package org.sonar.plugins.l10n;

import org.sonar.api.Plugin;

import java.util.Collections;

public final class SpanishPackPlugin implements Plugin {

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
  @Override
  public void define(Context context) {
    context.addExtensions(Collections.emptyList());
  }
}
