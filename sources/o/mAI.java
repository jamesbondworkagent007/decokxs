package o;

import android.os.Build;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.engagelab.privates.core.constants.MTCoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mAI implements mAN {
    public final InterfaceC56387yDm AEQbTJ;
    public int AYXKKw;
    public InterfaceC31682mAP AhwBna;
    public WindowManager.LayoutParams EZpvd;
    public final C55336xhy KWHzl;
    public wZH OLrzqt;
    public final android.content.Context copydefault;
    public int djBIcL;
    public android.view.WindowManager gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC31682mAP interfaceC31682mAP) {
        Intrinsics.checkNotNullParameter(interfaceC31682mAP, "");
        this.AhwBna = interfaceC31682mAP;
    }

    public mAI(@NotNull android.content.Context context, @NotNull C55336xhy c55336xhy, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c55336xhy, "");
        this.copydefault = context;
        this.KWHzl = c55336xhy;
        this.djBIcL = i;
        this.valueOf = i2;
        this.AYXKKw = i3;
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        this.gEmmrt = (android.view.WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.EZpvd = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 131624;
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = this.djBIcL;
        int i4 = this.valueOf;
        if (i4 > 0) {
            layoutParams.x = i4;
        }
        int i5 = this.AYXKKw;
        if (i5 > 0) {
            layoutParams.y = i5;
        }
        C55336xhy.setContentLayoutParams$default(c55336xhy, 0, 0, 3, null);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mAI.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public final void KWHzl() {
        wZH wzhOLrzqt = wZH.OLrzqt(android.view.LayoutInflater.from(this.copydefault), null, false);
        Intrinsics.checkNotNullExpressionValue(wzhOLrzqt, "");
        wzhOLrzqt.OLrzqt.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        this.KWHzl.EZpvd(this);
        wzhOLrzqt.OLrzqt.AEQbTJ(this.KWHzl);
        this.gEmmrt.addView(wzhOLrzqt.getRoot(), this.EZpvd);
        wzhOLrzqt.OLrzqt.post(new java.lang.Runnable() { // from class: o.mAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                mAI.AYXKKw(this.AEQbTJ);
            }
        });
        this.OLrzqt = wzhOLrzqt;
    }

    public static final void AYXKKw(mAI mai) {
        InterfaceC31682mAP interfaceC31682mAP = mai.AhwBna;
        if (interfaceC31682mAP != null) {
            interfaceC31682mAP.EZpvd();
        }
    }

    public final java.lang.Runnable OLrzqt() {
        return (java.lang.Runnable) this.AEQbTJ.getValue();
    }

    public static final java.lang.Runnable OLrzqt(final mAI mai) {
        return new java.lang.Runnable() { // from class: o.mAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                mAI.EZpvd(this.KWHzl);
            }
        };
    }

    public static final void EZpvd(mAI mai) {
        wZH wzh = mai.OLrzqt;
        if (wzh == null) {
            return;
        }
        android.view.WindowManager windowManager = mai.gEmmrt;
        Intrinsics.copydefault(wzh);
        windowManager.removeView(wzh.getRoot());
        mai.KWHzl.OLrzqt(true);
        mai.OLrzqt = null;
        C57656ymY.OLrzqt.valueOf();
    }

    public final void copydefault() {
        C55288xhC root;
        wZH wzh = this.OLrzqt;
        if (wzh == null || (root = wzh.getRoot()) == null) {
            return;
        }
        root.postDelayed(OLrzqt(), 250L);
    }

    @Override // o.mAN
    public void AEQbTJ() {
        copydefault();
    }
}
