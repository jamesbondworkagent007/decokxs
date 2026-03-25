package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C14866dtY extends AbstractC14833dss {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC13469dMm AYXKKw;
    public C58216yxB AEQbTJ = new C58216yxB();
    public final java.lang.String KWHzl = "DAppRouter.lua";
    public final int copydefault = dLX.Fragment.djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB KWHzl() {
        return this.AEQbTJ;
    }

    public boolean az_() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13469dMm abstractC13469dMm = this.AYXKKw;
        Intrinsics.copydefault(abstractC13469dMm);
        android.widget.FrameLayout frameLayout = abstractC13469dMm.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    @Override // o.AbstractC14833dss, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ.dispose();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = (AbstractC13469dMm) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("okluadiscover", "/discover/route", AEQbTJ());
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        java.util.HashMap<java.lang.String, java.lang.Object> mapOLrzqt;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (mapOLrzqt = C14922dub.OLrzqt(arguments)) == null) ? new java.util.HashMap<>() : mapOLrzqt;
    }

    /* JADX INFO: renamed from: o.dtY$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
