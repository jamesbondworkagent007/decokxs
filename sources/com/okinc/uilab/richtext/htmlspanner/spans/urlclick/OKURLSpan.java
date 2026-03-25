package com.okinc.uilab.richtext.htmlspanner.spans.urlclick;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55228xfw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKURLSpan extends URLSpan {
    public final int EZpvd;
    public final InterfaceC55228xfw copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKURLSpan(@NotNull String str, int i, InterfaceC55228xfw interfaceC55228xfw) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.copydefault = interfaceC55228xfw;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.EZpvd);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC55228xfw interfaceC55228xfw = this.copydefault;
        if (interfaceC55228xfw == null || interfaceC55228xfw.OLrzqt(getURL())) {
            return;
        }
        super.onClick(view);
    }
}
