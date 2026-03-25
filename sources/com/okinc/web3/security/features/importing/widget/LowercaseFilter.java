package com.okinc.web3.security.features.importing.widget;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
final class LowercaseFilter implements InputFilter {
    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lowerCase, i, i2);
        Spanned spanned2 = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned2 != null) {
            TextUtils.copySpansFrom(spanned2, i, i2, Object.class, spannableStringBuilder, 0);
        }
        return spannableStringBuilder;
    }
}
