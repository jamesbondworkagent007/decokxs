package o;

import com.immomo.mls.InitData;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47821txO extends AbstractC43061riF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean KWHzl;
    public final int copydefault = C47501trL.Application.gkJEwt;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.txM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47821txO.copydefault(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.txO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txO.ActionBar.<init>():void type: THIS */
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
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DcMfJKsgNvtZ);
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
        view.post(new java.lang.Runnable() { // from class: o.txL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47821txO.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(C47821txO c47821txO) {
        if (c47821txO.KWHzl) {
            return;
        }
        c47821txO.KWHzl = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47821txO, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final android.os.Bundle valueOf() {
        return (android.os.Bundle) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return KWHzl();
    }

    public final java.lang.String KWHzl() {
        android.os.Bundle bundleValueOf = valueOf();
        return Intrinsics.EZpvd((java.lang.Object) (bundleValueOf != null ? bundleValueOf.getString("luaPageName") : null), (java.lang.Object) "/feed/tokenInsight") ? "MarketTokenAIInsightHome.lua" : "MarketFeedDetailPage.lua";
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        android.os.Bundle bundleValueOf = valueOf();
        java.lang.String str = "";
        if (bundleValueOf == null || (string = bundleValueOf.getString("id")) == null) {
            string = "";
        }
        android.os.Bundle bundleValueOf2 = valueOf();
        if (bundleValueOf2 == null || (string2 = bundleValueOf2.getString("luaPageName")) == null) {
            string2 = "/feed/detail";
        }
        android.os.Bundle bundleValueOf3 = valueOf();
        boolean z = bundleValueOf3 != null ? bundleValueOf3.getBoolean("showTranslatedContent") : true;
        pUU.KWHzl("qjf", "showTranslatedContent = " + z + ",luaPageName = " + string2 + " ");
        android.os.Bundle bundleValueOf4 = valueOf();
        if (bundleValueOf4 == null || (string3 = bundleValueOf4.getString("data")) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) string3)) {
            string3 = null;
        }
        android.os.Bundle bundleValueOf5 = valueOf();
        if (bundleValueOf5 != null && (string4 = bundleValueOf5.getString("token")) != null) {
            str = string4;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("contentId", string);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapDjBIcL = C56424yEw.djBIcL(pairOLrzqt, C56390yDp.OLrzqt("isPreviewMode", bool), C56390yDp.OLrzqt("isWebViewDark", bool), C56390yDp.OLrzqt("showTranslatedContent", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("token", str));
        if (string3 != null) {
            mapDjBIcL.put("prefetchData", string3);
        }
        return C43056riA.AEQbTJ.EZpvd("market", string2, mapDjBIcL);
    }

    public static final android.os.Bundle copydefault(C47821txO c47821txO) {
        ImageShareParams imageShareParamsRequireShareParams;
        boolean z = c47821txO instanceof C47813txG;
        java.lang.Object obj = c47821txO;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = c47821txO.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C47813txG)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C47813txG)) {
                parentFragment = null;
            }
            obj = (C47813txG) parentFragment;
        }
        C47813txG c47813txG = (C47813txG) obj;
        if (c47813txG == null || (imageShareParamsRequireShareParams = c47813txG.requireShareParams()) == null) {
            return null;
        }
        return imageShareParamsRequireShareParams.getExtras();
    }
}
