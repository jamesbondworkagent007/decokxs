package o;

import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46742tcs {
    public static /* synthetic */ void loadImageWithBorder$default(android.widget.ImageView imageView, java.lang.String str, C46746tcw c46746tcw, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c46746tcw = new C46746tcw(null, null, 0.0f, 0, 15, null);
        }
        copydefault(imageView, str, c46746tcw);
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull C46746tcw c46746tcw) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c46746tcw, "");
        if (EZpvd(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), c46746tcw.OLrzqt(), c46746tcw.AEQbTJ(), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().EZpvd(c46746tcw.KWHzl()).OLrzqt(c46746tcw.KWHzl()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c46746tcw.EZpvd() != null) {
                c5335NtOLrzqt.AEQbTJ(c46746tcw.EZpvd());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c46746tcw.KWHzl());
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.aHXSQp);
        if (EZpvd(imageView.getContext())) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().EZpvd(new C33484mxN(imageView.getContext()))).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawableKWHzl).OLrzqt(drawableKWHzl));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(drawableKWHzl);
    }

    public static final boolean EZpvd(android.content.Context context) {
        if (context != null) {
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (activity.isDestroyed() || activity.isFinishing()) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.KWHzl(imageView).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp)).gEmmrt().EZpvd(imageView);
    }
}
