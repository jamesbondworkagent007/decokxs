package o;

import com.okinc.share.bean.ShareConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49271ulR extends AbstractC49274ulU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C48960ufY KWHzl;
    public final int OLrzqt = C48931uew.Application.OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ulP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49271ulR.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ulT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49271ulR.AhwBna(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.ulR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C49271ulR copydefault(@NotNull ShareConfig shareConfig, int i, boolean z) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            C49271ulR c49271ulR = new C49271ulR();
            AbstractC48908ueZ.Companion.AEQbTJ(shareConfig, i, z, c49271ulR);
            return c49271ulR;
        }
    }

    public static final android.widget.ImageView AEQbTJ(C49271ulR c49271ulR) {
        C48960ufY c48960ufY = c49271ulR.KWHzl;
        if (c48960ufY == null) {
            Intrinsics.gEmmrt("");
            c48960ufY = null;
        }
        android.widget.ImageView imageView = c48960ufY.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.AbstractC49274ulU
    public android.widget.ImageView OLrzqt() {
        return (android.widget.ImageView) this.copydefault.getValue();
    }

    public static final android.widget.FrameLayout AhwBna(C49271ulR c49271ulR) {
        C48960ufY c48960ufY = c49271ulR.KWHzl;
        if (c48960ufY == null) {
            Intrinsics.gEmmrt("");
            c48960ufY = null;
        }
        return c48960ufY.EZpvd;
    }

    @Override // o.AbstractC49274ulU
    public android.view.ViewGroup copydefault() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.ViewGroup) value;
    }

    @Override // o.AbstractC49274ulU, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C48960ufY.KWHzl(view);
        super.initView(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.ulS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49271ulR.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(C49271ulR c49271ulR) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49271ulR, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
