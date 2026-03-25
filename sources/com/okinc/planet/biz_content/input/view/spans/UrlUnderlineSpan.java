package com.okinc.planet.biz_content.input.view.spans;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class UrlUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setUnderlineText(true);
    }
}
