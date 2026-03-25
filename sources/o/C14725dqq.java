package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14725dqq {
    public static /* synthetic */ void loadFixSizeBorderImage$default(android.widget.ImageView imageView, java.lang.String str, int i, float f, float f2, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i3 & 8) != 0) {
            f2 = 36.0f;
        }
        float f4 = f2;
        if ((i3 & 16) != 0) {
            i2 = ContextCompat.getColor(imageView.getContext(), C32113mPz.ActionBar.KWHzl);
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            z = false;
        }
        copydefault(imageView, str, i, f3, f4, i4, z);
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, float f, float f2, int i2, boolean z) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt;
        Intrinsics.checkNotNullParameter(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (f2 != 0.0f) {
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(f2, context);
            if (layoutParams.width != iCopydefault) {
                layoutParams.height = iCopydefault;
                layoutParams.width = iCopydefault;
            }
        }
        if (str == null || str.length() == 0) {
            c5335NtOLrzqt = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
        } else {
            c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str);
        }
        Intrinsics.copydefault(c5335NtOLrzqt);
        C57660ymc c57660ymc = new C57660ymc(imageView.getContext(), f, i2, false);
        C5335Nt c5335NtAEQbTJ = c5335NtOLrzqt.EZpvd((NN<android.graphics.Bitmap>) c57660ymc).AEQbTJ(c57660ymc);
        C5448Sc c5448Sc = new C5448Sc();
        c5448Sc.AEQbTJ(i);
        c5448Sc.copydefault(i);
        c5448Sc.KWHzl(i);
        if (z) {
            c5448Sc.gEmmrt();
            c5448Sc.copydefault(AbstractC5360Os.OLrzqt);
        }
        c5335NtAEQbTJ.OLrzqt((RX<?>) c5448Sc).copydefault((RY) new StateListAnimator(imageView, i)).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.dqq$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ int KWHzl;

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            return false;
        }

        public StateListAnimator(android.widget.ImageView imageView, int i) {
            this.AEQbTJ = imageView;
            this.KWHzl = i;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.AEQbTJ.setImageResource(this.KWHzl);
            return true;
        }
    }

    public static final Unit AEQbTJ(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.gEmmrt();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadBlockiesIcon$default(android.widget.ImageView imageView, java.lang.String str, int i, Function1 function1, float f, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C13754dXa.Activity.aKErDB;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: o.dqv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C14725dqq.AEQbTJ((C5335Nt) obj2);
                }
            };
        }
        copydefault(imageView, str, i, function1, f);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x0020 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, @androidx.annotation.DrawableRes int i, @NotNull Function1<? super C5335Nt<android.graphics.drawable.Drawable>, Unit> function1, float f) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        DefaultConstructorMarker wxl = 0;
        wxl = 0;
        if (f != 0.0f && layoutParams.width != (iDp2px$default = C55298xhM.dp2px$default(f, null, 1, null))) {
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
        }
        if (str != null && str.length() != 0) {
            wxl = new wXL(str, 0, 2, wxl);
        }
        C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).KWHzl(wxl).AEQbTJ(i).KWHzl(i).copydefault(i);
        function1.invoke(c5335NtCopydefault);
        c5335NtCopydefault.EZpvd(imageView);
    }

    public static final Unit OLrzqt(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.gEmmrt();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadImageUrl$default(android.widget.ImageView imageView, java.lang.String str, int i, Function1 function1, float f, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: o.dqx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C14725dqq.OLrzqt((C5335Nt) obj2);
                }
            };
        }
        AEQbTJ(imageView, str, i, function1, f);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, @NotNull Function1<? super C5335Nt<android.graphics.drawable.Drawable>, Unit> function1, float f) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (f != 0.0f && layoutParams.width != (iDp2px$default = C55298xhM.dp2px$default(f, null, 1, null))) {
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
        }
        C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).EZpvd(str).KWHzl(i).AEQbTJ(i).copydefault(i);
        function1.invoke(c5335NtCopydefault);
        c5335NtCopydefault.EZpvd(imageView);
    }
}
