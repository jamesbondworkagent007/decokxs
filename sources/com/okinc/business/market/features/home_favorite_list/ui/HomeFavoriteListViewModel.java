package com.okinc.business.market.features.home_favorite_list.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25352ivB;
import o.C25389ivm;
import o.C25983jNp;
import o.C27670jza;
import o.C27770kCs;
import o.C28409kaI;
import o.C28410kaJ;
import o.C28414kaN;
import o.C28416kaP;
import o.C28419kaS;
import o.C28422kaV;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.InterfaceC28457kbD;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.kMU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel extends ViewModel {
    public final MutableStateFlow<Integer> AEQbTJ;
    public final C25983jNp AYXKKw;
    public final StateFlow<HomeFavoriteListFilter> AhwBna;
    public final C28419kaS AkhnZx;
    public boolean AuCTel;
    public List<? extends kMU> DbNXlk;
    public final MutableStateFlow<InterfaceC28457kbD> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<HomeFavoriteListFilter> OLrzqt;
    public final MutableSharedFlow<Boolean> copydefault;
    public final C27670jza djBIcL;
    public final kKG ejfBZ;
    public final StateFlow<InterfaceC28457kbD> fARcdN;
    public final C27770kCs fIwbmz;
    public final C28416kaP fJNWhG;
    public final C28414kaN fetchVPNInfo;
    public final C28410kaJ gEmmrt;
    public final StateFlow<Integer> isConnected;
    public final C28409kaI valueOf;
    public final SharedFlow<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<HomeFavoriteListFilter> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28457kbD> djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AuCTel;
    }

    @yCM
    public HomeFavoriteListViewModel(@NotNull kKG kkg, @NotNull C28410kaJ c28410kaJ, @NotNull C28419kaS c28419kaS, @NotNull C28409kaI c28409kaI, @NotNull C28414kaN c28414kaN, @NotNull C27770kCs c27770kCs, @NotNull C28416kaP c28416kaP, @NotNull C25983jNp c25983jNp, @NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28410kaJ, "");
        Intrinsics.checkNotNullParameter(c28419kaS, "");
        Intrinsics.checkNotNullParameter(c28409kaI, "");
        Intrinsics.checkNotNullParameter(c28414kaN, "");
        Intrinsics.checkNotNullParameter(c27770kCs, "");
        Intrinsics.checkNotNullParameter(c28416kaP, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.ejfBZ = kkg;
        this.gEmmrt = c28410kaJ;
        this.AkhnZx = c28419kaS;
        this.valueOf = c28409kaI;
        this.fetchVPNInfo = c28414kaN;
        this.fIwbmz = c27770kCs;
        this.fJNWhG = c28416kaP;
        this.AYXKKw = c25983jNp;
        this.djBIcL = c27670jza;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<InterfaceC28457kbD> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28457kbD.ActionBar.KWHzl);
        this.EZpvd = MutableStateFlow;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<HomeFavoriteListFilter> MutableStateFlow2 = StateFlowKt.MutableStateFlow(HomeFavoriteListFilter.Companion.KWHzl());
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        this.DbNXlk = yDY.AhwBna();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$checkIfShownGuide$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeFavoriteListViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<List<C28422kaV>> stateFlowEZpvd = HomeFavoriteListViewModel.this.fetchVPNInfo.EZpvd();
                final HomeFavoriteListViewModel homeFavoriteListViewModel = HomeFavoriteListViewModel.this;
                FlowCollector<? super List<C28422kaV>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListViewModel.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C28422kaV> list, Continuation<? super Unit> continuation) {
                        if (homeFavoriteListViewModel.EZpvd.getValue() instanceof InterfaceC28457kbD.StateListAnimator) {
                            HomeFavoriteListViewModel homeFavoriteListViewModel2 = homeFavoriteListViewModel;
                            homeFavoriteListViewModel2.KWHzl(list, homeFavoriteListViewModel2.OLrzqt().getValue(), false);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void gEmmrt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$initChainList$1(this, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(HomeFavoriteListViewModel homeFavoriteListViewModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        homeFavoriteListViewModel.EZpvd(z, z2, z3);
    }

    public final void EZpvd(boolean z, boolean z2, boolean z3) {
        if (z2) {
            InterfaceC28457kbD value = this.EZpvd.getValue();
            InterfaceC28457kbD.StateListAnimator stateListAnimator = value instanceof InterfaceC28457kbD.StateListAnimator ? (InterfaceC28457kbD.StateListAnimator) value : null;
            if (stateListAnimator == null) {
                return;
            } else {
                this.EZpvd.setValue(InterfaceC28457kbD.StateListAnimator.copy$default(stateListAnimator, null, true, 1, null));
            }
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$loadData$2(this, z, z3, null), 3, null);
    }

    public final void EZpvd(@NotNull TimeIntervalType timeIntervalType, @NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        applyNewFilter$default(this, HomeFavoriteListFilter.copy$default(this.AhwBna.getValue(), marketChainBean.getChainId(), 0, timeIntervalType, null, false, marketChainBean, null, 90, null), null, false, 6, null);
    }

    public final void EZpvd(@NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        applyNewFilter$default(this, HomeFavoriteListFilter.copy$default(this.AhwBna.getValue(), marketChainBean.getChainId(), 0, null, null, false, marketChainBean, null, 94, null), null, false, 6, null);
    }

    public final void EZpvd(@NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        applyNewFilter$default(this, HomeFavoriteListFilter.copy$default(this.AhwBna.getValue(), null, 0, timeIntervalType, null, false, null, null, 123, null), null, false, 6, null);
    }

    public final void OLrzqt(@NotNull RankingType rankingType, boolean z) {
        Intrinsics.checkNotNullParameter(rankingType, "");
        if ((this.fARcdN.getValue() instanceof InterfaceC28457kbD.StateListAnimator) && (!((InterfaceC28457kbD.StateListAnimator) r0).KWHzl().KWHzl().isEmpty())) {
            AEQbTJ(HomeFavoriteListFilter.copy$default(this.AhwBna.getValue(), null, 0, null, rankingType, z, null, null, 103, null), Boolean.TRUE, false);
        }
    }

    public final void fetchVPNInfo() {
        applyNewFilter$default(this, HomeFavoriteListFilter.copy$default(HomeFavoriteListFilter.Companion.KWHzl(), null, this.AhwBna.getValue().gEmmrt(), null, null, false, null, this.AhwBna.getValue().AhwBna(), 61, null), null, false, 6, null);
    }

    public final void isConnected() {
        C28414kaN c28414kaN = this.fetchVPNInfo;
        c28414kaN.copydefault(c28414kaN.EZpvd().getValue());
    }

    public final void AkhnZx() {
        this.fetchVPNInfo.OLrzqt();
    }

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$dismissGuide$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull FavoriteAction favoriteAction, @NotNull List<HomeToken> list, @NotNull List<Integer> list2, @NotNull List<Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        HomeFavoriteListViewModel$updateFavoriteStatus$1 homeFavoriteListViewModel$updateFavoriteStatus$1;
        if (continuation instanceof HomeFavoriteListViewModel$updateFavoriteStatus$1) {
            homeFavoriteListViewModel$updateFavoriteStatus$1 = (HomeFavoriteListViewModel$updateFavoriteStatus$1) continuation;
            int i = homeFavoriteListViewModel$updateFavoriteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeFavoriteListViewModel$updateFavoriteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                homeFavoriteListViewModel$updateFavoriteStatus$1 = new HomeFavoriteListViewModel$updateFavoriteStatus$1(this, continuation);
            }
        }
        HomeFavoriteListViewModel$updateFavoriteStatus$1 homeFavoriteListViewModel$updateFavoriteStatus$12 = homeFavoriteListViewModel$updateFavoriteStatus$1;
        Object obj = homeFavoriteListViewModel$updateFavoriteStatus$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeFavoriteListViewModel$updateFavoriteStatus$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27770kCs c27770kCs = this.fIwbmz;
        homeFavoriteListViewModel$updateFavoriteStatus$12.label = 1;
        Object objEZpvd = c27770kCs.EZpvd(favoriteAction, list, list2, list3, homeFavoriteListViewModel$updateFavoriteStatus$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: updateFavoriteStatus-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m6593updateFavoriteStatusyxL6bBk$default(HomeFavoriteListViewModel homeFavoriteListViewModel, FavoriteAction favoriteAction, List list, List list2, List list3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return homeFavoriteListViewModel.AEQbTJ(favoriteAction, list, list4, list3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull HomeToken homeToken, @NotNull Continuation<? super Result<Boolean>> continuation) {
        HomeFavoriteListViewModel$pinWatchlistItem$1 homeFavoriteListViewModel$pinWatchlistItem$1;
        if (continuation instanceof HomeFavoriteListViewModel$pinWatchlistItem$1) {
            homeFavoriteListViewModel$pinWatchlistItem$1 = (HomeFavoriteListViewModel$pinWatchlistItem$1) continuation;
            int i = homeFavoriteListViewModel$pinWatchlistItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeFavoriteListViewModel$pinWatchlistItem$1.label = i - Integer.MIN_VALUE;
            } else {
                homeFavoriteListViewModel$pinWatchlistItem$1 = new HomeFavoriteListViewModel$pinWatchlistItem$1(this, continuation);
            }
        }
        Object obj = homeFavoriteListViewModel$pinWatchlistItem$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeFavoriteListViewModel$pinWatchlistItem$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C28416kaP c28416kaP = this.fJNWhG;
        String strOLrzqt = homeToken.OLrzqt();
        String strAYXKKw = homeToken.AYXKKw();
        int iGEmmrt = this.AhwBna.getValue().gEmmrt();
        homeFavoriteListViewModel$pinWatchlistItem$1.label = 1;
        Object objEZpvd = c28416kaP.EZpvd(strOLrzqt, strAYXKKw, iGEmmrt, homeFavoriteListViewModel$pinWatchlistItem$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    public final void OLrzqt(@NotNull HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(homeToken, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$handlePinWatchlistItem$1(this, homeToken, null), 3, null);
    }

    public static /* synthetic */ void applyNewFilter$default(HomeFavoriteListViewModel homeFavoriteListViewModel, HomeFavoriteListFilter homeFavoriteListFilter, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        homeFavoriteListViewModel.AEQbTJ(homeFavoriteListFilter, bool, z);
    }

    public final void AEQbTJ(@NotNull HomeFavoriteListFilter homeFavoriteListFilter, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$applyNewFilter$1(homeFavoriteListFilter, this, bool, z, null), 3, null);
    }

    public static /* synthetic */ void onNewData$default(HomeFavoriteListViewModel homeFavoriteListViewModel, List list, HomeFavoriteListFilter homeFavoriteListFilter, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        homeFavoriteListViewModel.KWHzl(list, homeFavoriteListFilter, z);
    }

    public final void KWHzl(@NotNull List<C28422kaV> list, @NotNull HomeFavoriteListFilter homeFavoriteListFilter, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
        if (this.AuCTel) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new HomeFavoriteListViewModel$onNewData$1(this, list, homeFavoriteListFilter, z, null), 2, null);
        }
    }

    public final void AEQbTJ(int i) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeFavoriteListViewModel$onGroupSelected$1(this, i, null), 3, null);
    }

    public static /* synthetic */ void updateWatchlistGroups$default(HomeFavoriteListViewModel homeFavoriteListViewModel, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        homeFavoriteListViewModel.AEQbTJ(list, z);
    }

    public final String AhwBna() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.ejfBZ.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.DbNXlk();
        }
        return null;
    }

    public final void AEQbTJ() {
        this.AEQbTJ.setValue(null);
    }

    public final void AEQbTJ(@NotNull List<CommonGroupData> list, boolean z) {
        Object next;
        int iAhwBna;
        String strAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        this.AuCTel = true;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CommonGroupData commonGroupData : list) {
            arrayList.add(new HomeChainFilterUiModel(C33129mqd.gEmmrt(Integer.valueOf(commonGroupData.OLrzqt())), C25352ivB.copydefault(commonGroupData.AEQbTJ(), 14), null, 4, null));
        }
        HomeFavoriteListFilter value = this.AhwBna.getValue();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (C33129mqd.AhwBna(((HomeChainFilterUiModel) next).AEQbTJ()) == this.AhwBna.getValue().gEmmrt()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) next;
        if (homeChainFilterUiModel == null || (strAEQbTJ = homeChainFilterUiModel.AEQbTJ()) == null) {
            HomeChainFilterUiModel homeChainFilterUiModel2 = (HomeChainFilterUiModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            iAhwBna = C33129mqd.AhwBna(homeChainFilterUiModel2 != null ? homeChainFilterUiModel2.AEQbTJ() : null);
        } else {
            iAhwBna = C33129mqd.AhwBna(strAEQbTJ);
        }
        int i = iAhwBna;
        boolean zEZpvd = Intrinsics.EZpvd(value.AhwBna(), arrayList);
        boolean z2 = value.gEmmrt() != i;
        if ((true ^ zEZpvd) || z2) {
            applyNewFilter$default(this, HomeFavoriteListFilter.copy$default(this.AhwBna.getValue(), null, i, null, null, false, null, arrayList, 61, null), Boolean.valueOf(z), false, 4, null);
        }
    }
}
