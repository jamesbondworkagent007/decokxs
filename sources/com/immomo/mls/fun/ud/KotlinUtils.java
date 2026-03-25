package com.immomo.mls.fun.ud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BulletSpan;
import com.okinc.network.okg.tag.RequestTagEnum;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KotlinUtils {
    public static final KotlinUtils copydefault = new KotlinUtils();

    private KotlinUtils() {
    }

    public final String OLrzqt(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return jsonObject.toString();
    }

    public final RequestTagEnum EZpvd(boolean z) {
        if (z) {
            return RequestTagEnum.WEB3;
        }
        return RequestTagEnum.NONE;
    }

    public final SpannableStringBuilder AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Spanned spannedFromHtml = Html.fromHtml(str, 63);
        CharSequence charSequence = str;
        if (spannedFromHtml != null) {
            CharSequence charSequenceOLrzqt = StringsKt__StringsKt.OLrzqt(spannedFromHtml, '\n');
            charSequence = str;
            if (charSequenceOLrzqt != null) {
                charSequence = charSequenceOLrzqt;
            }
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        BulletSpan[] bulletSpanArr = (BulletSpan[]) spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), BulletSpan.class);
        if (bulletSpanArr != null) {
            for (BulletSpan bulletSpan : bulletSpanArr) {
                int spanStart = spannableStringBuilderValueOf.getSpanStart(bulletSpan);
                int spanEnd = spannableStringBuilderValueOf.getSpanEnd(bulletSpan);
                spannableStringBuilderValueOf.removeSpan(bulletSpan);
                spannableStringBuilderValueOf.setSpan(new IndentBulletSpan(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null)), spanStart, spanEnd, 17);
            }
        }
        return spannableStringBuilderValueOf;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class IndentBulletSpan extends BulletSpan {
        public final int AEQbTJ;

        public IndentBulletSpan(int i) {
            super(i);
            this.AEQbTJ = i;
        }

        @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            return super.getLeadingMargin(z) + this.AEQbTJ;
        }

        @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i, int i2, int i3, int i4, int i5, @NotNull CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            super.drawLeadingMargin(canvas, paint, i + this.AEQbTJ, i2, i3, i4, i5, charSequence, i6, i7, z, layout);
        }
    }
}
