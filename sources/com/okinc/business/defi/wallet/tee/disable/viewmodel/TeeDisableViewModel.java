package com.okinc.business.defi.wallet.tee.disable.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C17869fVh;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.fVJ;
import o.gKO;
import o.gKU;
import o.gKV;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeDisableViewModel extends ViewModel {
    public final Flow<gKV> AEQbTJ;
    public final fVJ AYXKKw;
    public final C12827cuN AhwBna;
    public final SharedFlow<Result<Unit>> EZpvd;
    public final MutableSharedFlow<Result<Unit>> KWHzl;
    public final SavedStateHandle OLrzqt;
    public final C17869fVh copydefault;
    public final MutableStateFlow<AbstractC12782ctV> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<gKV> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<Unit>> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public TeeDisableViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C12827cuN c12827cuN, @NotNull C17869fVh c17869fVh, @NotNull fVJ fvj) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c17869fVh, "");
        Intrinsics.checkNotNullParameter(fvj, "");
        this.OLrzqt = savedStateHandle;
        this.AhwBna = c12827cuN;
        this.copydefault = c17869fVh;
        this.AYXKKw = fvj;
        MutableStateFlow<AbstractC12782ctV> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        this.AEQbTJ = new Activity(FlowKt.filterNotNull(MutableStateFlow), this);
        MutableSharedFlow<Result<Unit>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.disable.viewmodel.TeeDisableViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TeeDisableViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    TeeDisableViewModel teeDisableViewModel = TeeDisableViewModel.this;
                    Result.Application application = Result.Companion;
                    String str = (String) teeDisableViewModel.OLrzqt.get("wallet_id");
                    if (str == null) {
                        return Unit.INSTANCE;
                    }
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = teeDisableViewModel.AhwBna.OLrzqt(str, false);
                    this.label = 1;
                    obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            TeeDisableViewModel teeDisableViewModel2 = TeeDisableViewModel.this;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                teeDisableViewModel2.gEmmrt.setValue((AbstractC12782ctV) objM7377constructorimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<gKV> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ TeeDisableViewModel OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.disable.viewmodel.TeeDisableViewModel$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ TeeDisableViewModel OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, TeeDisableViewModel teeDisableViewModel) {
                this.copydefault = flowCollector;
                this.OLrzqt = teeDisableViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                TeeDisableViewModel$special$$inlined$map$1$2$1 teeDisableViewModel$special$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof TeeDisableViewModel$special$$inlined$map$1$2$1) {
                    teeDisableViewModel$special$$inlined$map$1$2$1 = (TeeDisableViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = teeDisableViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        teeDisableViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        teeDisableViewModel$special$$inlined$map$1$2$1 = new TeeDisableViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object objCopydefault = teeDisableViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault2 = C56442yFn.copydefault();
                int i2 = teeDisableViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objCopydefault);
                    FlowCollector flowCollector2 = this.copydefault;
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                    List listAhwBna = (List) this.OLrzqt.OLrzqt.get("extra_chain_index_list");
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                    String strDbNXlk = abstractC12782ctV.DbNXlk();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listAhwBna.iterator();
                    while (it.hasNext()) {
                        ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, ((Number) it.next()).longValue(), null, 2, null);
                        String address = chainAddress != null ? chainAddress.getAddress() : null;
                        if (address != null) {
                            arrayList.add(address);
                        }
                    }
                    gKU gku = new gKU(strDbNXlk, arrayList, null, null, 12, null);
                    teeDisableViewModel$special$$inlined$map$1$2$1.L$0 = flowCollector2;
                    teeDisableViewModel$special$$inlined$map$1$2$1.label = 1;
                    objCopydefault = gko.copydefault(gku, teeDisableViewModel$special$$inlined$map$1$2$1);
                    flowCollector = flowCollector2;
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objCopydefault);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) teeDisableViewModel$special$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    flowCollector = flowCollector3;
                }
                teeDisableViewModel$special$$inlined$map$1$2$1.L$0 = null;
                teeDisableViewModel$special$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(objCopydefault, teeDisableViewModel$special$$inlined$map$1$2$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, TeeDisableViewModel teeDisableViewModel) {
            this.AEQbTJ = flow;
            this.OLrzqt = teeDisableViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super gKV> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TeeDisableViewModel$disableTee$1(this, str, null), 3, null);
    }
}
