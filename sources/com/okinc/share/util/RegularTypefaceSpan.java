package com.okinc.share.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RegularTypefaceSpan extends UnderlineSpan {
    public String EZpvd;

    @Override // android.text.style.UnderlineSpan, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.text.style.UnderlineSpan, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        OLrzqt(textPaint);
    }

    public final void OLrzqt(Paint paint) {
        String str = this.EZpvd;
        if (str != null) {
            Intrinsics.copydefault((Object) str);
            paint.setTypeface(Typeface.create(str, 0));
        }
    }
}
