package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.AggregateItem;
import com.okinc.business.invest_biz.data.bean.DexEntranceCommonV2Sort;
import com.okinc.business.invest_biz.data.bean.ProductJumpParam;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.json.Json;
import o.AbstractC58260yxt;
import o.C26468jcr;
import o.C26519jdp;
import o.C27493jwI;
import o.C33129mqd;
import o.C43248rlh;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC23635iDr;
import o.InterfaceC26463jcm;
import o.InterfaceC26469jcs;
import o.InterfaceC58229yxO;
import o.InterfaceC9738bbJ;
import o.InterfaceC9852bdR;
import o.iFY;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductListVM extends ViewModel {
    public DexEntranceProductQuery AEQbTJ;
    public final CoroutineScope AYXKKw;
    public C26468jcr AhwBna;
    public final Long AkhnZx;
    public final StateFlow<InterfaceC26469jcs> DbNXlk;
    public final MutableSharedFlow<InterfaceC26463jcm> EZpvd;
    public final Json KWHzl;
    public final MutableStateFlow<InterfaceC26469jcs> OLrzqt;
    public final InterfaceC23635iDr copydefault;
    public final iFY djBIcL;
    public final MutableStateFlow<DexEntranceCommonV2Sort> fetchVPNInfo;
    public final MutableSharedFlow<Unit> gEmmrt;
    public final String isConnected;
    public final SharedFlow<InterfaceC26463jcm> valueOf;
    public final C26519jdp values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String KWHzl(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<DexEntranceCommonV2Sort> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEntranceProductQuery KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC26463jcm> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(DexEntranceProductQuery dexEntranceProductQuery) {
        this.AEQbTJ = dexEntranceProductQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26468jcr copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26469jcs> gEmmrt() {
        return this.DbNXlk;
    }

    @yCM
    public DexEntranceProductListVM(@NotNull iFY ify, @NotNull C26519jdp c26519jdp, @NotNull Json json, @NotNull InterfaceC23635iDr interfaceC23635iDr, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(ify, "");
        Intrinsics.checkNotNullParameter(c26519jdp, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(interfaceC23635iDr, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = ify;
        this.values = c26519jdp;
        this.KWHzl = json;
        this.copydefault = interfaceC23635iDr;
        MutableStateFlow<InterfaceC26469jcs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26469jcs.StateListAnimator.AEQbTJ);
        this.OLrzqt = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        this.fetchVPNInfo = StateFlowKt.MutableStateFlow(null);
        MutableSharedFlow<InterfaceC26463jcm> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.gEmmrt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), SupervisorKt.SupervisorJob((Job) ViewModelKt.getViewModelScope(this).getCoroutineContext().get(Job.Key)));
        this.AhwBna = new C26468jcr(null, 0, false, false, 15, null);
        this.AkhnZx = (Long) savedStateHandle.get("KEY_CHAIN_ID");
        this.isConnected = (String) savedStateHandle.get("KEY_TOKEN_ADDRESS");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListVM$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DexEntranceProductListVM.this.new AnonymousClass1(continuation);
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
                MutableStateFlow<DexEntranceCommonV2Sort> mutableStateFlowEZpvd = DexEntranceProductListVM.this.EZpvd();
                final DexEntranceProductListVM dexEntranceProductListVM = DexEntranceProductListVM.this;
                FlowCollector<? super DexEntranceCommonV2Sort> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListVM.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(DexEntranceCommonV2Sort dexEntranceCommonV2Sort, Continuation<? super Unit> continuation) {
                        if (dexEntranceCommonV2Sort != null) {
                            dexEntranceProductListVM.copydefault(dexEntranceCommonV2Sort);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (mutableStateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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

    public final void AYXKKw() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceProductListVM$setupForWidget$1(this, null), 3, null);
    }

    public final void djBIcL() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceProductListVM$refresh$1(this, null), 3, null);
    }

    public final void AhwBna() {
        if (this.AhwBna.KWHzl()) {
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceProductListVM$loadMore$1(this, null), 3, null);
        } else {
            C27493jwI.safeLaunch$default(this.AYXKKw, null, null, new DexEntranceProductListVM$loadMore$2(this, null), 3, null);
        }
    }

    public final void copydefault(@NotNull DexEntranceCommonV2Sort dexEntranceCommonV2Sort) {
        Intrinsics.checkNotNullParameter(dexEntranceCommonV2Sort, "");
        AEQbTJ(InterfaceC26469jcs.StateListAnimator.AEQbTJ);
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceProductListVM$refreshInternally$1(this, dexEntranceCommonV2Sort, null), 3, null);
    }

    public final void AEQbTJ(@NotNull InterfaceC26469jcs interfaceC26469jcs) {
        Intrinsics.checkNotNullParameter(interfaceC26469jcs, "");
        this.OLrzqt.setValue(interfaceC26469jcs);
    }

    public final Object AEQbTJ(@NotNull InterfaceC26463jcm interfaceC26463jcm, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.EZpvd.emit(interfaceC26463jcm, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull DexEntranceCommonV2Sort dexEntranceCommonV2Sort, int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        DexEntranceProductListVM$fetchData$1 dexEntranceProductListVM$fetchData$1;
        DexEntranceProductQuery dexEntranceProductQuery;
        Object objAEQbTJ;
        int i2;
        DexEntranceProductListVM dexEntranceProductListVM;
        String strGEmmrt;
        String strGEmmrt2;
        Object obj;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof DexEntranceProductListVM$fetchData$1) {
            dexEntranceProductListVM$fetchData$1 = (DexEntranceProductListVM$fetchData$1) continuation;
            int i3 = dexEntranceProductListVM$fetchData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dexEntranceProductListVM$fetchData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dexEntranceProductListVM$fetchData$1 = new DexEntranceProductListVM$fetchData$1(this, continuation);
            }
        }
        Object obj2 = dexEntranceProductListVM$fetchData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = dexEntranceProductListVM$fetchData$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj2);
            if (this.fetchVPNInfo == null || (dexEntranceProductQuery = this.AEQbTJ) == null) {
                AEQbTJ(InterfaceC26469jcs.TaskDescription.KWHzl);
                return Unit.INSTANCE;
            }
            int iAhwBna = C33129mqd.AhwBna(dexEntranceProductQuery != null ? C56443yFo.AEQbTJ(dexEntranceProductQuery.getTabId()) : null);
            DexEntranceProductQuery dexEntranceProductQuery2 = this.AEQbTJ;
            long jValueOf = C33129mqd.valueOf(dexEntranceProductQuery2 != null ? C56443yFo.KWHzl(dexEntranceProductQuery2.getChainId()) : null);
            DexEntranceProductQuery dexEntranceProductQuery3 = this.AEQbTJ;
            String strGEmmrt3 = C33129mqd.gEmmrt(dexEntranceProductQuery3 != null ? dexEntranceProductQuery3.getTokenAddress() : null);
            String sortBy = dexEntranceCommonV2Sort.getSortBy();
            String str = (sortBy == null || (strGEmmrt2 = C33129mqd.gEmmrt(sortBy)) == null) ? "" : strGEmmrt2;
            String property = dexEntranceCommonV2Sort.getProperty();
            DexEntranceProductQuery dexEntranceProductQuery4 = new DexEntranceProductQuery(iAhwBna, jValueOf, strGEmmrt3, C56443yFo.AEQbTJ(i), (property == null || (strGEmmrt = C33129mqd.gEmmrt(property)) == null) ? "" : strGEmmrt, str, null, null, 192, null);
            iFY ify = this.djBIcL;
            dexEntranceProductListVM$fetchData$1.L$0 = this;
            dexEntranceProductListVM$fetchData$1.I$0 = i;
            dexEntranceProductListVM$fetchData$1.label = 1;
            objAEQbTJ = ify.AEQbTJ(dexEntranceProductQuery4, dexEntranceProductListVM$fetchData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            i2 = i;
            dexEntranceProductListVM = this;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                i2 = dexEntranceProductListVM$fetchData$1.I$0;
                obj = dexEntranceProductListVM$fetchData$1.L$1;
                dexEntranceProductListVM = (DexEntranceProductListVM) dexEntranceProductListVM$fetchData$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objAEQbTJ = obj;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                    if (i2 == 1) {
                        dexEntranceProductListVM.AEQbTJ(InterfaceC26469jcs.TaskDescription.KWHzl);
                    } else {
                        InterfaceC26463jcm.Application application = InterfaceC26463jcm.Application.AEQbTJ;
                        dexEntranceProductListVM$fetchData$1.L$0 = objAEQbTJ;
                        dexEntranceProductListVM$fetchData$1.L$1 = null;
                        dexEntranceProductListVM$fetchData$1.label = 3;
                        if (dexEntranceProductListVM.AEQbTJ(application, dexEntranceProductListVM$fetchData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = dexEntranceProductListVM$fetchData$1.I$0;
            dexEntranceProductListVM = (DexEntranceProductListVM) dexEntranceProductListVM$fetchData$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objAEQbTJ = ((Result) obj2).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            AggregateData aggregateData = (AggregateData) objAEQbTJ;
            ArrayList arrayList = new ArrayList();
            if (i2 != 1) {
                arrayList.addAll(dexEntranceProductListVM.AhwBna.copydefault());
            }
            List<AggregateItem> listEZpvd = aggregateData.EZpvd();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList2.add(dexEntranceProductListVM.values.KWHzl((AggregateItem) it.next()));
            }
            arrayList.addAll(arrayList2);
            C26468jcr c26468jcr = new C26468jcr(arrayList, i2, aggregateData.KWHzl(), aggregateData.EZpvd().size() < 20);
            dexEntranceProductListVM.AhwBna = c26468jcr;
            dexEntranceProductListVM.AEQbTJ(new InterfaceC26469jcs.ActionBar(c26468jcr));
            InterfaceC26463jcm.TaskDescription taskDescription = InterfaceC26463jcm.TaskDescription.EZpvd;
            dexEntranceProductListVM$fetchData$1.L$0 = dexEntranceProductListVM;
            dexEntranceProductListVM$fetchData$1.L$1 = objAEQbTJ;
            dexEntranceProductListVM$fetchData$1.I$0 = i2;
            dexEntranceProductListVM$fetchData$1.label = 2;
            if (dexEntranceProductListVM.AEQbTJ(taskDescription, dexEntranceProductListVM$fetchData$1) == objCopydefault) {
                return objCopydefault;
            }
            obj = objAEQbTJ;
            objAEQbTJ = obj;
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceProductListVM$updateSort$1(this, str, str2, null), 3, null);
    }

    public final ProductJumpParam OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                Json json = this.KWHzl;
                json.getSerializersModule();
                return (ProductJumpParam) json.decodeFromString(ProductJumpParam.Companion.serializer(), str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void AEQbTJ(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DexEntranceProductListVM$traceDexEarnItemClick$1(this, j, str, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(final long j, Continuation<? super String> continuation) throws Throwable {
        DexEntranceProductListVM$getWalletString$1 dexEntranceProductListVM$getWalletString$1;
        if (continuation instanceof DexEntranceProductListVM$getWalletString$1) {
            dexEntranceProductListVM$getWalletString$1 = (DexEntranceProductListVM$getWalletString$1) continuation;
            int i = dexEntranceProductListVM$getWalletString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexEntranceProductListVM$getWalletString$1.label = i - Integer.MIN_VALUE;
            } else {
                dexEntranceProductListVM$getWalletString$1 = new DexEntranceProductListVM$getWalletString$1(this, continuation);
            }
        }
        Object objAwait = dexEntranceProductListVM$getWalletString$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexEntranceProductListVM$getWalletString$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
            final Function1 function1 = new Function1() { // from class: o.jaS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexEntranceProductListVM.EZpvd(j, (InterfaceC9738bbJ) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtAhwBna = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.jaU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DexEntranceProductListVM.copydefault(function1, obj);
                }
            }).AhwBna(new InterfaceC58229yxO() { // from class: o.jaW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DexEntranceProductListVM.KWHzl((java.lang.Throwable) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAhwBna, "");
            dexEntranceProductListVM$getWalletString$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, dexEntranceProductListVM$getWalletString$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "");
        return objAwait;
    }

    public static final String EZpvd(long j, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.EZpvd(j);
    }

    public static final String copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (String) function1.invoke(obj);
    }
}
