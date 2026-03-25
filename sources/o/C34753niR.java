package o;

import com.immomo.mls.InitData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34753niR extends AbstractC34822njh {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.niT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34753niR.copydefault(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "CRFeedDiscoverFeedHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.spnCvw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX DEBUG: Possible override for method o.njh.KWHzl()V */
    public final java.lang.String KWHzl() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String copydefault(C34753niR c34753niR) {
        java.lang.String string;
        android.os.Bundle arguments = c34753niR.getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GiPPlLRPuVlr);
        }
        return null;
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/CRDiscoverFeed", C56423yEv.EZpvd(C56390yDp.OLrzqt("content", KWHzl())));
    }
}
