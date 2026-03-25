package o;

import com.okinc.share.bean.ShareConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49265ulL extends AbstractC49274ulU {
    public C49015uga EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int copydefault = C48931uew.Application.EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ulO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49265ulL.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ulQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49265ulL.gEmmrt(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.ulL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C49265ulL KWHzl(@NotNull ShareConfig shareConfig, int i, boolean z) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            C49265ulL c49265ulL = new C49265ulL();
            AbstractC48908ueZ.Companion.AEQbTJ(shareConfig, i, z, c49265ulL);
            return c49265ulL;
        }
    }

    public static final android.widget.ImageView EZpvd(C49265ulL c49265ulL) {
        C49015uga c49015uga = c49265ulL.EZpvd;
        if (c49015uga == null) {
            Intrinsics.gEmmrt("");
            c49015uga = null;
        }
        android.widget.ImageView imageView = c49015uga.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    @Override // o.AbstractC49274ulU
    public android.widget.ImageView OLrzqt() {
        return (android.widget.ImageView) this.KWHzl.getValue();
    }

    public static final android.widget.FrameLayout gEmmrt(C49265ulL c49265ulL) {
        C49015uga c49015uga = c49265ulL.EZpvd;
        if (c49015uga == null) {
            Intrinsics.gEmmrt("");
            c49015uga = null;
        }
        return c49015uga.KWHzl;
    }

    @Override // o.AbstractC49274ulU
    public android.view.ViewGroup copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.ViewGroup) value;
    }

    @Override // o.AbstractC49274ulU, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C49015uga.copydefault(view);
        super.initView(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.ulM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49265ulL.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C49265ulL c49265ulL) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49265ulL, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC49274ulU, o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        return super.getPreviewContainer();
    }
}
