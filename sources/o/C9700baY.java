package o;

import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9700baY {
    public static /* synthetic */ void loadFixSizeBorderImage$default(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, int i, float f, float f2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        if ((i2 & 8) != 0) {
            f2 = 36.0f;
        }
        EZpvd(imageView, drawable, i, f, f2);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, int i, float f, float f2) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ;
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (f2 != 0.0f && layoutParams.width != (iDp2px$default = C33052mpF.dp2px$default(f2, null, 1, null))) {
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
        }
        if (drawable == null) {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
        } else {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).AEQbTJ(drawable);
        }
        Intrinsics.copydefault(c5335NtAEQbTJ);
        android.content.Context context = imageView.getContext();
        int i2 = C52761wXj.Activity.invokespecialDPHOMC;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C57660ymc c57660ymc = new C57660ymc(context, f, C33070mpX.OLrzqt(i2, context2), false, 8, null);
        c5335NtAEQbTJ.EZpvd((NN<android.graphics.Bitmap>) c57660ymc).AEQbTJ(c57660ymc).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i)).copydefault((RY) new TaskDescription(imageView, i)).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.baY$TaskDescription */
    public static final class TaskDescription implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView KWHzl;
        public final /* synthetic */ int OLrzqt;

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            return false;
        }

        public TaskDescription(android.widget.ImageView imageView, int i) {
            this.KWHzl = imageView;
            this.OLrzqt = i;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.KWHzl.setImageResource(this.OLrzqt);
            return true;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43386roM.EZpvd.EZpvd() + "/cdn/wallet/logo/icon_custom_default_" + str + ".png";
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true) && C33129mqd.OLrzqt((java.lang.CharSequence) C33491mxU.OLrzqt(str));
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Regex("^\\d+$").matches(str) || new Regex("^0(x|X)[a-fA-F0-9]+$").matches(str);
    }

    public static final boolean EZpvd(android.content.Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
