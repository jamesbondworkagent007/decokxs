package com.okinc.business.market.features.home_token_list.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.WatchlistTokenData;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C26109jSg;
import o.C27770kCs;
import o.C27788kDj;
import o.C28539kcg;
import o.C28542kcj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.InterfaceC28519kcM;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListViewModel extends ViewModel {
    public final MutableSharedFlow<List<HomeToken>> AEQbTJ;
    public final C28539kcg AYXKKw;
    public final StateFlow<InterfaceC28519kcM> AhwBna;
    public final MutableStateFlow<InterfaceC28519kcM> EZpvd;
    public AdvancedFilter KWHzl;
    public final C28542kcj OLrzqt;
    public final C26109jSg copydefault;
    public final C27788kDj djBIcL;
    public final C27770kCs gEmmrt;
    public final SharedFlow<List<HomeToken>> valueOf;
    public final kKG values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<HomeToken>> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28519kcM> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public HomeTokenListViewModel(@NotNull C28542kcj c28542kcj, @NotNull C28539kcg c28539kcg, @NotNull C27770kCs c27770kCs, @NotNull C26109jSg c26109jSg, @NotNull C27788kDj c27788kDj, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c28542kcj, "");
        Intrinsics.checkNotNullParameter(c28539kcg, "");
        Intrinsics.checkNotNullParameter(c27770kCs, "");
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        Intrinsics.checkNotNullParameter(c27788kDj, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.OLrzqt = c28542kcj;
        this.AYXKKw = c28539kcg;
        this.gEmmrt = c27770kCs;
        this.copydefault = c26109jSg;
        this.djBIcL = c27788kDj;
        this.values = kkg;
        MutableStateFlow<InterfaceC28519kcM> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28519kcM.TaskDescription.AEQbTJ);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<List<HomeToken>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.home_token_list.ui.HomeTokenListViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeTokenListViewModel.this.new AnonymousClass1(continuation);
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
                SharedFlow<List<HomeToken>> sharedFlowCopydefault = HomeTokenListViewModel.this.AYXKKw.copydefault();
                final HomeTokenListViewModel homeTokenListViewModel = HomeTokenListViewModel.this;
                FlowCollector<? super List<HomeToken>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListViewModel.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<HomeToken> list, Continuation<? super Unit> continuation) {
                        Object objEmit = homeTokenListViewModel.AEQbTJ.emit(list, continuation);
                        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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

    public static /* synthetic */ void loadData$default(HomeTokenListViewModel homeTokenListViewModel, AdvancedFilter advancedFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        homeTokenListViewModel.EZpvd(advancedFilter, z);
    }

    public final void EZpvd(@NotNull AdvancedFilter advancedFilter, boolean z) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        if (!Intrinsics.EZpvd(advancedFilter, this.KWHzl) || z) {
            this.KWHzl = advancedFilter;
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeTokenListViewModel$loadData$1(this, advancedFilter, null), 3, null);
        }
    }

    public final void EZpvd() {
        this.EZpvd.setValue(InterfaceC28519kcM.Application.AEQbTJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull AdvancedFilter advancedFilter, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        HomeTokenListViewModel$startWs$1 homeTokenListViewModel$startWs$1;
        if (continuation instanceof HomeTokenListViewModel$startWs$1) {
            homeTokenListViewModel$startWs$1 = (HomeTokenListViewModel$startWs$1) continuation;
            int i = homeTokenListViewModel$startWs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeTokenListViewModel$startWs$1.label = i - Integer.MIN_VALUE;
            } else {
                homeTokenListViewModel$startWs$1 = new HomeTokenListViewModel$startWs$1(this, continuation);
            }
        }
        Object obj = homeTokenListViewModel$startWs$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeTokenListViewModel$startWs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28539kcg c28539kcg = this.AYXKKw;
            homeTokenListViewModel$startWs$1.label = 1;
            if (c28539kcg.KWHzl(advancedFilter, homeTokenListViewModel$startWs$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        this.AYXKKw.OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull FavoriteAction favoriteAction, @NotNull List<HomeToken> list, @NotNull List<Integer> list2, @NotNull List<Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        HomeTokenListViewModel$updateFavoriteStatus$1 homeTokenListViewModel$updateFavoriteStatus$1;
        if (continuation instanceof HomeTokenListViewModel$updateFavoriteStatus$1) {
            homeTokenListViewModel$updateFavoriteStatus$1 = (HomeTokenListViewModel$updateFavoriteStatus$1) continuation;
            int i = homeTokenListViewModel$updateFavoriteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeTokenListViewModel$updateFavoriteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                homeTokenListViewModel$updateFavoriteStatus$1 = new HomeTokenListViewModel$updateFavoriteStatus$1(this, continuation);
            }
        }
        HomeTokenListViewModel$updateFavoriteStatus$1 homeTokenListViewModel$updateFavoriteStatus$12 = homeTokenListViewModel$updateFavoriteStatus$1;
        Object obj = homeTokenListViewModel$updateFavoriteStatus$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeTokenListViewModel$updateFavoriteStatus$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27788kDj c27788kDj = this.djBIcL;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (HomeToken homeToken : list) {
            arrayList.add(new WatchlistTokenData(homeToken.OLrzqt(), homeToken.AYXKKw()));
        }
        c27788kDj.EZpvd(arrayList, !list2.isEmpty());
        C27770kCs c27770kCs = this.gEmmrt;
        homeTokenListViewModel$updateFavoriteStatus$12.label = 1;
        Object objEZpvd = c27770kCs.EZpvd(favoriteAction, list, list2, list3, homeTokenListViewModel$updateFavoriteStatus$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.market.features.home_token_list.ui.HomeTokenListViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: updateFavoriteStatus-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m6597updateFavoriteStatusyxL6bBk$default(HomeTokenListViewModel homeTokenListViewModel, FavoriteAction favoriteAction, List list, List list2, List list3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return homeTokenListViewModel.KWHzl(favoriteAction, list, list4, list3, continuation);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeTokenListViewModel$signalFavoriteListChange$1(this, null), 3, null);
    }

    public final String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.values.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.DbNXlk();
        }
        return null;
    }
}
