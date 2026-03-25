package com.okinc.business.market.features.smart_money.signal.ui.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC29483kuW;
import o.C25389ivm;
import o.C25624jAh;
import o.C28264kUz;
import o.C28586kda;
import o.C29481kuU;
import o.C29503kuq;
import o.C29510kux;
import o.C29558kvs;
import o.C29625kxF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25627jAk;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalActivityViewModel extends ViewModel {
    public final C28264kUz AEQbTJ;
    public final StateFlow<AbstractC29483kuW> AYXKKw;
    public final C29503kuq AhwBna;
    public final MutableStateFlow<C29625kxF> EZpvd;
    public final MutableStateFlow<AbstractC29483kuW> KWHzl;
    public final MutableStateFlow<C29558kvs> OLrzqt;
    public final C29510kux copydefault;
    public final C28586kda djBIcL;
    public C29481kuU gEmmrt;
    public final StateFlow<C29625kxF> isConnected;
    public final C25624jAh valueOf;
    public final StateFlow<C29558kvs> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC29483kuW> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29558kvs> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29625kxF> OLrzqt() {
        return this.isConnected;
    }

    @yCM
    public SignalActivityViewModel(@NotNull C29503kuq c29503kuq, @NotNull C29510kux c29510kux, @NotNull C25624jAh c25624jAh, @NotNull C28264kUz c28264kUz, @NotNull C28586kda c28586kda) {
        Intrinsics.checkNotNullParameter(c29503kuq, "");
        Intrinsics.checkNotNullParameter(c29510kux, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(c28264kUz, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        this.AhwBna = c29503kuq;
        this.copydefault = c29510kux;
        this.valueOf = c25624jAh;
        this.AEQbTJ = c28264kUz;
        this.djBIcL = c28586kda;
        MutableStateFlow<C29558kvs> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29558kvs(false, true, false, null, 13, null));
        this.OLrzqt = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC29483kuW> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<C29625kxF> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C29625kxF(true, null, null, 6, null));
        this.EZpvd = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignalActivityViewModel.this.new AnonymousClass1(continuation);
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
                Application application = new Application(SignalActivityViewModel.this.AhwBna.AEQbTJ());
                final SignalActivityViewModel signalActivityViewModel = SignalActivityViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<SignalUiModel> list, Continuation<? super Unit> continuation) {
                        signalActivityViewModel.KWHzl.setValue(new AbstractC29483kuW.StateListAnimator(list));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (application.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel$1$Application */
        public static final class Application implements Flow<List<? extends SignalUiModel>> {
            public final /* synthetic */ Flow KWHzl;

            /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel$1$Application$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    SignalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                    if (continuation instanceof SignalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SignalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i = signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SignalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        List list = (List) obj;
                        if (list != null) {
                            signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(list, signalActivityViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public Application(Flow flow) {
                this.KWHzl = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends SignalUiModel>> flowCollector, Continuation continuation) {
                Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }
    }

    public final boolean EZpvd(@NotNull C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(c29481kuU, "");
        C29481kuU c29481kuU2 = this.gEmmrt;
        if (c29481kuU2 == null) {
            return false;
        }
        return (Intrinsics.EZpvd(c29481kuU2.copydefault(), c29481kuU.copydefault()) && Intrinsics.EZpvd(c29481kuU2.OLrzqt(), c29481kuU.OLrzqt()) && Intrinsics.EZpvd(c29481kuU2.AEQbTJ(), c29481kuU.AEQbTJ()) && Intrinsics.EZpvd(c29481kuU2.KWHzl(), c29481kuU.KWHzl()) && Intrinsics.EZpvd(c29481kuU2.AhwBna(), c29481kuU.AhwBna())) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadData$default(SignalActivityViewModel signalActivityViewModel, List list, String str, String str2, C29481kuU c29481kuU, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        signalActivityViewModel.OLrzqt(list, str, str2, c29481kuU);
    }

    public final void OLrzqt(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c29481kuU, "");
        boolean z = str.length() == 0;
        if (z) {
            this.gEmmrt = c29481kuU;
            this.AhwBna.EZpvd();
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalActivityViewModel$loadData$1(z, this, list, str, str2, c29481kuU, null), 3, null);
    }

    public final void OLrzqt(@NotNull SignalUiModel signalUiModel) {
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalActivityViewModel$loadSmartMoneyAddresses$1(this, signalUiModel, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Result<? extends InterfaceC25627jAk>> continuation) {
        SignalActivityViewModel$trade$1 signalActivityViewModel$trade$1;
        if (continuation instanceof SignalActivityViewModel$trade$1) {
            signalActivityViewModel$trade$1 = (SignalActivityViewModel$trade$1) continuation;
            int i = signalActivityViewModel$trade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalActivityViewModel$trade$1.label = i - Integer.MIN_VALUE;
            } else {
                signalActivityViewModel$trade$1 = new SignalActivityViewModel$trade$1(this, continuation);
            }
        }
        Object obj = signalActivityViewModel$trade$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalActivityViewModel$trade$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C25624jAh c25624jAh = this.valueOf;
        signalActivityViewModel$trade$1.label = 1;
        Object objEZpvd = c25624jAh.EZpvd(str, str2, signalActivityViewModel$trade$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    public final void AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalActivityViewModel$subscribeWs$1(this, list, null), 3, null);
    }

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalActivityViewModel$unSubscribeWs$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        EZpvd();
        super.onCleared();
    }
}
