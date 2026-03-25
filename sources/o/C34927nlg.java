package o;

import com.immomo.mls.InitData;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34927nlg extends AbstractC34936nlp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final int copydefault = qZH.ActionBar.ixgjPv;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nlj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34927nlg.OLrzqt(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "MarketFeedDetailPage.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.nlg$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
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
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.nlp.KWHzl()V */
    public final android.os.Bundle KWHzl() {
        return (android.os.Bundle) this.EZpvd.getValue();
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle bundleKWHzl = KWHzl();
        if (bundleKWHzl == null || (string = bundleKWHzl.getString("id")) == null) {
            string = "";
        }
        android.os.Bundle bundleKWHzl2 = KWHzl();
        boolean z = bundleKWHzl2 != null ? bundleKWHzl2.getBoolean("showTranslatedContent") : true;
        pUU.KWHzl("qjf", "showTranslatedContent = " + z);
        android.os.Bundle bundleKWHzl3 = KWHzl();
        if (bundleKWHzl3 == null || (string2 = bundleKWHzl3.getString("data")) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
            string2 = null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("contentId", string);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapDjBIcL = C56424yEw.djBIcL(pairOLrzqt, C56390yDp.OLrzqt("isPreviewMode", bool), C56390yDp.OLrzqt("isWebViewDark", bool), C56390yDp.OLrzqt("showTranslatedContent", java.lang.Boolean.valueOf(z)));
        if (string2 != null) {
            mapDjBIcL.put("prefetchData", string2);
        }
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/detail", mapDjBIcL);
    }

    public static final android.os.Bundle OLrzqt(C34927nlg c34927nlg) {
        ImageShareParams imageShareParamsRequireShareParams;
        boolean z = c34927nlg instanceof C34929nli;
        java.lang.Object obj = c34927nlg;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = c34927nlg.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C34929nli)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C34929nli)) {
                parentFragment = null;
            }
            obj = (C34929nli) parentFragment;
        }
        C34929nli c34929nli = (C34929nli) obj;
        if (c34929nli == null || (imageShareParamsRequireShareParams = c34929nli.requireShareParams()) == null) {
            return null;
        }
        return imageShareParamsRequireShareParams.getExtras();
    }
}
