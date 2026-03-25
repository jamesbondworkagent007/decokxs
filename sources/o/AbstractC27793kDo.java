package o;

import android.view.View;
import com.okinc.business.market.utils.MarketHomeTabType;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import o.C33570myu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC27793kDo extends AbstractC32998moE implements mAS {
    public java.lang.Integer AYXKKw;
    public final /* synthetic */ C27796kDr gEmmrt = new C27796kDr();
    public boolean djBIcL = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.view.View view, @NotNull MarketHomeTabType marketHomeTabType) {
        Intrinsics.checkNotNullParameter(marketHomeTabType, "");
        this.gEmmrt.AEQbTJ(view, marketHomeTabType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.djBIcL = z;
    }

    public float bk_() {
        return 448.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL() {
        this.gEmmrt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.gEmmrt.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.djBIcL;
    }

    @Override // o.mAS
    public float AYXKKw() {
        return C33570myu.AEQbTJ();
    }

    @Override // o.mAS
    public float EZpvd() {
        return this.AYXKKw != null ? r0.intValue() : C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), bk_());
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(view, new C33570myu.ActionBar() { // from class: o.kDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33570myu.ActionBar
            public final boolean AEQbTJ(android.view.View view2) {
                return AbstractC27793kDo.copydefault(this.EZpvd, view2);
            }
        });
    }

    public static final boolean copydefault(AbstractC27793kDo abstractC27793kDo, android.view.View view) {
        int height = view.getHeight();
        if (height == 0) {
            return false;
        }
        java.lang.Integer num = abstractC27793kDo.AYXKKw;
        if (num != null && height == num.intValue()) {
            return false;
        }
        abstractC27793kDo.AYXKKw = java.lang.Integer.valueOf(height);
        java.lang.String simpleName = abstractC27793kDo.getClass().getSimpleName();
        java.lang.Integer num2 = abstractC27793kDo.AYXKKw;
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        Intrinsics.copydefault(abstractC27793kDo.AYXKKw);
        pUU.KWHzl("TransformViewPager", simpleName + "-->post->EVENT_REQUEST_LAYOUT->height:" + num2 + "--->dp:" + C33518mxv.KWHzl(applicationOLrzqt, r2.intValue()));
        abstractC27793kDo.AhwBna();
        return false;
    }

    /* JADX INFO: renamed from: o.kDo$Application */
    public static final class Application implements View.OnLayoutChangeListener {
        public final /* synthetic */ C33570myu.ActionBar AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;

        public Application(C33570myu.ActionBar actionBar, android.view.View view) {
            this.AEQbTJ = actionBar;
            this.KWHzl = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.AEQbTJ.AEQbTJ(this.KWHzl)) {
                this.KWHzl.removeOnLayoutChangeListener(this);
            }
        }
    }

    public final void EZpvd(android.view.View view, C33570myu.ActionBar actionBar) {
        view.addOnLayoutChangeListener(new Application(actionBar, view));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL();
    }

    public void AhwBna() {
        RxBus.KWHzl("event_update_layout");
    }
}
