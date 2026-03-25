package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$getPublisherData$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$getPublisherData$2;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$getPublisherData$3;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$navigateToTab$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$onFeedTabReselected$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$onPageSelected$1$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$shouldShowAutoUpgradeDialog$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$updateFeedContainerPage$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$updateOrbitStatus$1;
import com.okinc.planet.biz_home.viewmodel.PlanetRootViewModel$updateTabs$1;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.utils.IMUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47911tyz extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<AbstractC47909tyx> AEQbTJ;
    public int AYXKKw;
    public final tAD AhwBna;
    public final MutableStateFlow<C47861tyB> EZpvd;
    public final MutableSharedFlow<AbstractC47907tyv> OLrzqt;
    public final SharedFlow<AbstractC47909tyx> copydefault;
    public final SharedFlow<AbstractC47907tyv> djBIcL;
    public final StateFlow<C47861tyB> fetchVPNInfo;
    public final InterfaceC46387tSl gEmmrt;
    public int valueOf;
    public final InterfaceC47278tmy values = (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C47861tyB> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC47909tyx> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C47861tyB> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC47907tyv> gEmmrt() {
        return this.djBIcL;
    }

    public C47911tyz() {
        tPF tpf = tPF.copydefault;
        this.gEmmrt = tpf.alsFma();
        this.AhwBna = tpf.fsSxsn();
        MutableStateFlow<C47861tyB> MutableStateFlow = StateFlowKt.MutableStateFlow(new C47861tyB(null, 0, false, false, false, false, 0, 0, 255, null));
        this.EZpvd = MutableStateFlow;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<AbstractC47909tyx> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AbstractC47907tyv> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        AhwBna();
        if (IMUtils.KWHzl.copydefault()) {
            valueOf();
        }
    }

    /* JADX INFO: renamed from: o.tyz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void valueOf() {
        tWM twm = (tWM) C43251rlk.OLrzqt(tWM.class);
        if (twm != null && twm.valueOf() && this.values.values()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PlanetRootViewModel$getPublisherData$1(null), 2, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PlanetRootViewModel$getPublisherData$2(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PlanetRootViewModel$getPublisherData$3(this, null), 2, null);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super OrbitBeanResp> continuation) {
        return this.gEmmrt.EZpvd(continuation);
    }

    public final void AhwBna() {
        pUU.EZpvd("IMUtils", "init");
        java.util.List<PlanetSubPage> listKWHzl = KWHzl();
        int iAEQbTJ = AEQbTJ(listKWHzl);
        this.AYXKKw = iAEQbTJ;
        MutableStateFlow<C47861tyB> mutableStateFlow = this.EZpvd;
        C47861tyB value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : listKWHzl, (253 & 2) != 0 ? value.EZpvd : iAEQbTJ, (253 & 4) != 0 ? value.AEQbTJ : listKWHzl.contains(PlanetSubPage.CHAT), (253 & 8) != 0 ? value.valueOf : listKWHzl.contains(PlanetSubPage.FEED), (253 & 16) != 0 ? value.gEmmrt : AkhnZx(), (253 & 32) != 0 ? value.AYXKKw : true, (253 & 64) != 0 ? value.KWHzl : 0, (253 & 128) != 0 ? value.OLrzqt : 0));
    }

    public final java.util.List<PlanetSubPage> KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        IMUtils iMUtils = IMUtils.KWHzl;
        boolean zOLrzqt = iMUtils.OLrzqt();
        PlanetSubPage planetSubPage = PlanetSubPage.CHAT;
        boolean zIsAvailable = planetSubPage.isAvailable();
        User userOLrzqt = this.values.OLrzqt();
        if (userOLrzqt != null && userOLrzqt.isMainAccount() && iMUtils.EZpvd()) {
            arrayList.add(PlanetSubPage.LeaderBoard);
        }
        if (iMUtils.copydefault()) {
            arrayList.add(PlanetSubPage.FEED);
        }
        if (zOLrzqt && zIsAvailable) {
            arrayList.add(planetSubPage);
        }
        pUU.KWHzl("PlanetRootViewModel", "isChatEnabled = " + zOLrzqt + " ,isLeaderBoardEnable = " + iMUtils.EZpvd() + " ,isFeedEnable = " + iMUtils.copydefault());
        return arrayList;
    }

    public final int AEQbTJ(java.util.List<? extends PlanetSubPage> list) {
        if (list.isEmpty()) {
            return 0;
        }
        PlanetSubPage planetSubPageEZpvd = C47904tys.EZpvd.EZpvd();
        if (!list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt(((PlanetSubPage) it.next()).name(), planetSubPageEZpvd != null ? planetSubPageEZpvd.name() : null, true)) {
                    return CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends PlanetSubPage>) ((java.util.List<? extends java.lang.Object>) list), planetSubPageEZpvd);
                }
            }
        }
        return KWHzl(list);
    }

    public final int KWHzl(java.util.List<? extends PlanetSubPage> list) {
        if (list.isEmpty()) {
            return 0;
        }
        PlanetSubPage planetSubPage = PlanetSubPage.LeaderBoard;
        if (list.contains(planetSubPage)) {
            return list.indexOf(planetSubPage);
        }
        PlanetSubPage planetSubPage2 = PlanetSubPage.FEED;
        if (list.contains(planetSubPage2)) {
            return list.indexOf(planetSubPage2);
        }
        return 0;
    }

    public final boolean AkhnZx() {
        return IMUtils.KWHzl.OLrzqt() && isConnected();
    }

    public final boolean isConnected() {
        com.okinc.okuser.data.UserInfo info;
        User userOLrzqt = this.values.OLrzqt();
        return (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null || !info.isSubUser()) && this.values.values();
    }

    public final void KWHzl(int i) {
        if (i == this.AYXKKw) {
            return;
        }
        this.AYXKKw = i;
        AEQbTJ(i);
        PlanetSubPage planetSubPage = (PlanetSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd.getValue().OLrzqt(), i);
        C47904tys.EZpvd.OLrzqt(planetSubPage);
        if (planetSubPage != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetRootViewModel$onPageSelected$1$1(this, planetSubPage, i, null), 3, null);
        }
    }

    public final void ejfBZ() {
        pUU.EZpvd("IMUtils", "update");
        OLrzqt(KWHzl(), !Intrinsics.EZpvd(r0, this.EZpvd.getValue().OLrzqt()));
    }

    public final void OLrzqt(java.util.List<? extends PlanetSubPage> list, boolean z) {
        C47861tyB value = this.EZpvd.getValue();
        PlanetSubPage planetSubPage = (PlanetSubPage) CollectionsKt___CollectionsKt.AkhnZx(value.OLrzqt(), this.AYXKKw);
        C47904tys c47904tys = C47904tys.EZpvd;
        PlanetSubPage planetSubPageEZpvd = c47904tys.EZpvd();
        int iIndexOf = planetSubPage != null ? list.indexOf(planetSubPage) : -1;
        int iIndexOf2 = planetSubPageEZpvd != null ? list.indexOf(planetSubPageEZpvd) : -1;
        if (iIndexOf < 0) {
            if (iIndexOf2 >= 0) {
                iIndexOf = iIndexOf2;
            } else {
                iIndexOf = (planetSubPage != null && list.contains(planetSubPage)) ? list.indexOf(planetSubPage) : KWHzl(list);
            }
        }
        int iValueOf = C56548yJl.valueOf(iIndexOf, java.lang.Math.max(0, list.size() - 1));
        this.AYXKKw = iValueOf;
        c47904tys.OLrzqt((PlanetSubPage) CollectionsKt___CollectionsKt.AkhnZx(list, iValueOf));
        this.EZpvd.setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : list, (253 & 2) != 0 ? value.EZpvd : iValueOf, (253 & 4) != 0 ? value.AEQbTJ : list.contains(PlanetSubPage.CHAT), (253 & 8) != 0 ? value.valueOf : list.contains(PlanetSubPage.FEED), (253 & 16) != 0 ? value.gEmmrt : AkhnZx(), (253 & 32) != 0 ? value.AYXKKw : z, (253 & 64) != 0 ? value.KWHzl : 0, (253 & 128) != 0 ? value.OLrzqt : 0));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetRootViewModel$updateTabs$1(this, list, iValueOf, null), 3, null);
    }

    public final void EZpvd(@NotNull PlanetSubPage planetSubPage) {
        Intrinsics.checkNotNullParameter(planetSubPage, "");
        int iIndexOf = this.EZpvd.getValue().OLrzqt().indexOf(planetSubPage);
        if (iIndexOf >= 0) {
            this.AYXKKw = iIndexOf;
            C47904tys.EZpvd.OLrzqt(planetSubPage);
            AEQbTJ(iIndexOf);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetRootViewModel$navigateToTab$1(this, planetSubPage, iIndexOf, null), 3, null);
            return;
        }
        pUU.valueOf("PlanetRootViewModel", "Cannot navigate to unavailable tab: " + planetSubPage);
    }

    public final void EZpvd(int i) {
        this.valueOf = i;
        FeedPage feedPage = (FeedPage) yDV.gEmmrt(FeedPage.values(), i);
        if (feedPage == null) {
            feedPage = FeedPage.FOR_YOU;
        }
        MutableStateFlow<C47861tyB> mutableStateFlow = this.EZpvd;
        C47861tyB value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : null, (253 & 2) != 0 ? value.EZpvd : 0, (253 & 4) != 0 ? value.AEQbTJ : false, (253 & 8) != 0 ? value.valueOf : false, (253 & 16) != 0 ? value.gEmmrt : false, (253 & 32) != 0 ? value.AYXKKw : false, (253 & 64) != 0 ? value.KWHzl : 0, (253 & 128) != 0 ? value.OLrzqt : feedPage.getTitleResId()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetRootViewModel$updateFeedContainerPage$1(this, i, null), 3, null);
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetRootViewModel$onFeedTabReselected$1(this, null), 3, null);
    }

    public final PlanetSubPage OLrzqt() {
        return (PlanetSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd.getValue().OLrzqt(), this.AYXKKw);
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> DbNXlk() {
        java.lang.Integer hasVisitedOrbitGuide;
        if (this.values.values()) {
            C46386tSk c46386tSk = C46386tSk.copydefault;
            if (!C46386tSk.shouldShowOrbitIntroduction$default(c46386tSk, null, 1, null)) {
                User userOLrzqt = this.values.OLrzqt();
                if (c46386tSk.wlaJM(userOLrzqt != null ? userOLrzqt.getUid() : null)) {
                    OrbitBeanResp orbitBeanRespEZpvd = this.gEmmrt.EZpvd();
                    if (orbitBeanRespEZpvd != null && (hasVisitedOrbitGuide = orbitBeanRespEZpvd.getHasVisitedOrbitGuide()) != null && hasVisitedOrbitGuide.intValue() == 0 && !C46388tSm.Companion.KWHzl().AYXKKw()) {
                        User userOLrzqt2 = this.values.OLrzqt();
                        c46386tSk.getNewProxyInstance(userOLrzqt2 != null ? userOLrzqt2.getUid() : null);
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        User userOLrzqt3 = this.values.OLrzqt();
                        return C56390yDp.OLrzqt(bool, userOLrzqt3 != null ? userOLrzqt3.getUid() : null);
                    }
                    User userOLrzqt4 = this.values.OLrzqt();
                    c46386tSk.getNewProxyInstance(userOLrzqt4 != null ? userOLrzqt4.getUid() : null);
                }
            }
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        User userOLrzqt5 = this.values.OLrzqt();
        return C56390yDp.OLrzqt(bool2, userOLrzqt5 != null ? userOLrzqt5.getUid() : null);
    }

    public final void fJNWhG() {
        OrbitBeanResp orbitBeanRespEZpvd;
        java.lang.Integer hasVisitedOrbitGuide;
        if (this.values.values()) {
            C46386tSk c46386tSk = C46386tSk.copydefault;
            if (C46386tSk.shouldShowOrbitIntroduction$default(c46386tSk, null, 1, null)) {
                return;
            }
            User userOLrzqt = this.values.OLrzqt();
            if (c46386tSk.wlaJM(userOLrzqt != null ? userOLrzqt.getUid() : null) || (orbitBeanRespEZpvd = this.gEmmrt.EZpvd()) == null || (hasVisitedOrbitGuide = orbitBeanRespEZpvd.getHasVisitedOrbitGuide()) == null || hasVisitedOrbitGuide.intValue() != 0 || C46388tSm.Companion.KWHzl().AYXKKw()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PlanetRootViewModel$updateOrbitStatus$1(this, null), 2, null);
        }
    }

    public final boolean values() {
        OrbitBeanResp orbitBeanRespEZpvd;
        java.lang.Integer orbitUpgradeType;
        OrbitBeanResp orbitBeanRespEZpvd2;
        java.lang.Integer hasVisitedOrbitPopup;
        if (!this.values.values()) {
            return false;
        }
        C46386tSk c46386tSk = C46386tSk.copydefault;
        User userOLrzqt = this.values.OLrzqt();
        if (c46386tSk.wlaJM(userOLrzqt != null ? userOLrzqt.getUid() : null)) {
            return false;
        }
        User userOLrzqt2 = this.values.OLrzqt();
        if (!c46386tSk.iwGUEr(userOLrzqt2 != null ? userOLrzqt2.getUid() : null) || (orbitBeanRespEZpvd = this.gEmmrt.EZpvd()) == null || (orbitUpgradeType = orbitBeanRespEZpvd.getOrbitUpgradeType()) == null || orbitUpgradeType.intValue() != 1 || (orbitBeanRespEZpvd2 = this.gEmmrt.EZpvd()) == null || (hasVisitedOrbitPopup = orbitBeanRespEZpvd2.getHasVisitedOrbitPopup()) == null || hasVisitedOrbitPopup.intValue() != 0) {
            return false;
        }
        User userOLrzqt3 = this.values.OLrzqt();
        c46386tSk.hDKMBd(userOLrzqt3 != null ? userOLrzqt3.getUid() : null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PlanetRootViewModel$shouldShowAutoUpgradeDialog$1(this, null), 2, null);
        return true;
    }

    public final void copydefault() {
        if (this.EZpvd.getValue().EZpvd()) {
            MutableStateFlow<C47861tyB> mutableStateFlow = this.EZpvd;
            C47861tyB value = mutableStateFlow.getValue();
            mutableStateFlow.setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : null, (253 & 2) != 0 ? value.EZpvd : 0, (253 & 4) != 0 ? value.AEQbTJ : false, (253 & 8) != 0 ? value.valueOf : false, (253 & 16) != 0 ? value.gEmmrt : false, (253 & 32) != 0 ? value.AYXKKw : false, (253 & 64) != 0 ? value.KWHzl : 0, (253 & 128) != 0 ? value.OLrzqt : 0));
        }
    }

    private final void AEQbTJ(int i) {
        C47861tyB value = this.EZpvd.getValue();
        if (value.AEQbTJ() != i) {
            this.EZpvd.setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : null, (253 & 2) != 0 ? value.EZpvd : i, (253 & 4) != 0 ? value.AEQbTJ : false, (253 & 8) != 0 ? value.valueOf : false, (253 & 16) != 0 ? value.gEmmrt : false, (253 & 32) != 0 ? value.AYXKKw : false, (253 & 64) != 0 ? value.KWHzl : 0, (253 & 128) != 0 ? value.OLrzqt : 0));
        }
    }
}
