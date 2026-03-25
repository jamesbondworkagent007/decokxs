package o;

import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39518ptp {
    public static final java.lang.CharSequence copydefault(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @androidx.annotation.ColorInt final int i, @androidx.annotation.ColorInt final int i2, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        return C33061mpO.setupSpanStyles$default(charSequence, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pto
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39518ptp.OLrzqt(context, i, i2, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(android.content.Context context, int i, int i2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new mAD(0.0f, 0, i, C33052mpF.AEQbTJ(2, context), new RectF(C33052mpF.EZpvd(4, context), C33052mpF.EZpvd(2, context), C33052mpF.EZpvd(4, context), C33052mpF.EZpvd(2, context)), null, C33052mpF.EZpvd(2.0f, context), i2, 32, null));
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.AkhnZx));
        list.add(new android.text.style.TypefaceSpan(com.google.android.exoplayer2.C.SANS_SERIF_NAME));
        return Unit.INSTANCE;
    }
}
