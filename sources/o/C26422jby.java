package o;

import androidx.core.os.BundleKt;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZoneType;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDetailData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jby, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26422jby extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jbw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26422jby.KWHzl(this.copydefault);
        }
    });
    public iHF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.DTwDnp;
    }

    /* JADX INFO: renamed from: o.jby$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jby.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C26422jby EZpvd(int i, @NotNull InvestHotZonePlatform investHotZonePlatform, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(investHotZonePlatform, "");
            Intrinsics.checkNotNullParameter(str, "");
            C26422jby c26422jby = new C26422jby();
            c26422jby.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("tabId", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("tabData", investHotZonePlatform), C56390yDp.OLrzqt("eventSource", str)));
            return c26422jby;
        }
    }

    private final C43316rmw KWHzl() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    public static final C43316rmw KWHzl(C26422jby c26422jby) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(StateListAnimator.class, new C26377jbF());
        c43316rmw.register(Activity.class, new C26423jbz());
        c43316rmw.register(iTF.class, new iTD());
        java.lang.String string = c26422jby.getString(C25493ixk.FragmentManager.pauseLocationServices);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c43316rmw.register(C24073iTx.class, new C24074iTy(string, 0, 106.0f, 2, null));
        return c43316rmw;
    }

    public final java.lang.String OLrzqt() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("eventSource", "") : null;
        return string == null ? "" : string;
    }

    public final InvestHotZonePlatform AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        InvestHotZonePlatform investHotZonePlatform = arguments != null ? (InvestHotZonePlatform) arguments.getParcelable("tabData") : null;
        if (investHotZonePlatform instanceof InvestHotZonePlatform) {
            return investHotZonePlatform;
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = iHF.copydefault(view);
        copydefault();
    }

    private final void copydefault() {
        iHF ihf = this.copydefault;
        if (ihf == null) {
            Intrinsics.gEmmrt("");
            ihf = null;
        }
        ihf.copydefault.setAdapter(KWHzl());
        iHF ihf2 = this.copydefault;
        if (ihf2 == null) {
            Intrinsics.gEmmrt("");
            ihf2 = null;
        }
        ihf2.copydefault.setOverScrollMode(2);
        KWHzl().AhwBna(EZpvd());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Object> EZpvd() {
        java.util.List<InvestHotZoneType> typeInfoList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (AEQbTJ() == null) {
            arrayList.add(C24073iTx.KWHzl);
        } else {
            InvestHotZonePlatform investHotZonePlatformAEQbTJ = AEQbTJ();
            java.util.List<InvestHotZoneType> typeInfoList2 = investHotZonePlatformAEQbTJ != null ? investHotZonePlatformAEQbTJ.getTypeInfoList() : null;
            if (typeInfoList2 == null || typeInfoList2.isEmpty()) {
            }
        }
        InvestHotZonePlatform investHotZonePlatformAEQbTJ2 = AEQbTJ();
        if (investHotZonePlatformAEQbTJ2 != null && (typeInfoList = investHotZonePlatformAEQbTJ2.getTypeInfoList()) != null) {
            for (InvestHotZoneType investHotZoneType : typeInfoList) {
                arrayList.add(new StateListAnimator(investHotZoneType.getTypeName()));
                java.util.Iterator<T> it = investHotZoneType.getInvestmentInfo().iterator();
                while (it.hasNext()) {
                    arrayList.add(new Activity((InvestMultiTabEventPageProductDetailData) it.next(), OLrzqt()));
                }
                arrayList.add(iTF.KWHzl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.jby$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvestMultiTabEventPageSectionData(title=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.jby$Activity */
    public static final class Activity {
        public final java.lang.String OLrzqt;
        public final InvestMultiTabEventPageProductDetailData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investMultiTabEventPageProductDetailData = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.OLrzqt;
            }
            return activity.AEQbTJ(investMultiTabEventPageProductDetailData, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(investMultiTabEventPageProductDetailData, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(investMultiTabEventPageProductDetailData, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestMultiTabEventPageProductDetailData copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvestMultiTabEventPageProductData(data=" + this.copydefault + ", eventTrackingValue=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(investMultiTabEventPageProductDetailData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = investMultiTabEventPageProductDetailData;
            this.OLrzqt = str;
        }
    }
}
