package o;

import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34816njb extends AbstractC43061riF {
    public static final ActionBar Companion = new ActionBar(null);
    public final java.lang.String KWHzl = "DiscoverCategoryHome.lua";
    public final int EZpvd = qZH.ActionBar.ixgjPv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.njb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.njb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C34816njb EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (C34816njb) jSA.EZpvd(new C34816njb(), C56390yDp.OLrzqt("data", str));
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GiPPlLRPuVlr);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C7328ahk c7328ahkAkhnZx = AkhnZx();
        if (c7328ahkAkhnZx != null) {
            c7328ahkAkhnZx.AEQbTJ(OLrzqt());
        }
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/category", C56424yEw.djBIcL(C56390yDp.OLrzqt("category", requireArguments().getString("data", ""))));
    }
}
