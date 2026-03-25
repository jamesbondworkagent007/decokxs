package o;

import android.view.View;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFQ {
    public static /* synthetic */ void fastDoubleClickListener$default(android.view.View view, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        EZpvd(view, j, function1);
    }

    public static final void EZpvd(android.view.View view, final long j, @NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pFR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    pFQ.KWHzl(j, function1, view2);
                }
            });
        }
    }

    public static final void KWHzl(long j, Function1 function1, android.view.View view) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object tag = view.getTag(C35964oKf.StateListAnimator.OxbLUn);
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (jElapsedRealtime - (l != null ? l.longValue() : 0L) > j) {
            view.setTag(C35964oKf.StateListAnimator.OxbLUn, java.lang.Long.valueOf(jElapsedRealtime));
            Intrinsics.copydefault(view);
            function1.invoke(view);
        }
    }

    public static final void AEQbTJ(android.widget.TextView textView, int i) {
        if (textView != null) {
            textView.setCompoundDrawables(null, KWHzl(i), null, null);
        }
    }

    public static final void KWHzl(android.widget.TextView textView, int i) {
        if (textView != null) {
            textView.setCompoundDrawablesRelative(null, null, KWHzl(i), null);
        }
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c5335NtEZpvd.OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.copydefault(f, context))).AEQbTJ(i).copydefault(i)).EZpvd(imageView);
    }

    public static final android.graphics.drawable.Drawable KWHzl(int i) {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(i);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, drawableKWHzl.getMinimumWidth(), drawableKWHzl.getMinimumHeight());
        }
        return drawableKWHzl;
    }
}
