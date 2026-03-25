package com.okinc.lexical.link;

import android.text.style.URLSpan;
import android.view.View;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.Intrinsics;
import o.pHR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LexicalLinkSpan extends URLSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LexicalLinkSpan(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View view) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(view, "");
        super.onClick(view);
        pHR phr = pHR.copydefault;
        String url = getURL();
        Intrinsics.checkNotNullExpressionValue(url, "");
        phr.AEQbTJ(url);
    }
}
