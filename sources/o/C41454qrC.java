package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.market.quotation.domain.dex.SubscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexTickersUseCase$onExecute$1;
import com.okinc.market.quotation.domain.dex.SubscribeDexTickersUseCase$onExecute$2;
import com.okinc.market.quotation.domain.dex.SubscribeDexTickersUseCase$onExecute$3;
import com.okinc.market.quotation.domain.dex.SubscribeDexTickersUseCase$onExecute$5;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.ticker.model.DexTickerPo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41454qrC implements InterfaceC49404uns<kotlin.Pair<? extends java.util.List<? extends InterfaceC41655qus>, ? extends DexPeriodEnum>, Flow<? extends TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>>> {
    public final CoroutineDispatcher EZpvd;
    public final qUX OLrzqt;
    public final C41437qqm copydefault;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final long AEQbTJ = C38364pWa.KWHzl.OLrzqt();

    /* JADX INFO: renamed from: o.qrC$ActionBar */
    public static final class ActionBar implements Flow<TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C41454qrC EZpvd;

        /* JADX INFO: renamed from: o.qrC$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C41454qrC EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C41454qrC c41454qrC) {
                this.copydefault = flowCollector;
                this.EZpvd = c41454qrC;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SubscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1 subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof SubscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1) {
                    subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1 = (SubscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1 = new SubscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo> twoKeyMapEZpvd = this.EZpvd.copydefault.EZpvd();
                    C41434qqj.KWHzl.AEQbTJ("SubscribeDexTickersUseCase", "Emitting ticker update [size: " + twoKeyMapEZpvd.size() + "]");
                    subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(twoKeyMapEZpvd, subscribeDexTickersUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, C41454qrC c41454qrC) {
            this.AEQbTJ = flow;
            this.EZpvd = c41454qrC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public C41454qrC(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41437qqm c41437qqm, @NotNull qUX qux) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41437qqm, "");
        Intrinsics.checkNotNullParameter(qux, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c41437qqm;
        this.OLrzqt = qux;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41655qus>, ? extends DexPeriodEnum> pair, @NotNull Continuation<? super Flow<TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, pair, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((kotlin.Pair<? extends java.util.List<? extends InterfaceC41655qus>, ? extends DexPeriodEnum>) obj, (Continuation<? super Flow<TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qrC$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41655qus>, ? extends DexPeriodEnum> pair, @NotNull Continuation<? super Flow<TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>>> continuation) throws java.lang.Throwable {
        SubscribeDexTickersUseCase$onExecute$1 subscribeDexTickersUseCase$onExecute$1;
        C41454qrC c41454qrC;
        if (continuation instanceof SubscribeDexTickersUseCase$onExecute$1) {
            subscribeDexTickersUseCase$onExecute$1 = (SubscribeDexTickersUseCase$onExecute$1) continuation;
            int i = subscribeDexTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeDexTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeDexTickersUseCase$onExecute$1 = new SubscribeDexTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = subscribeDexTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = subscribeDexTickersUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.List<? extends InterfaceC41655qus> listComponent1 = pair.component1();
            DexPeriodEnum dexPeriodEnumComponent2 = pair.component2();
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("SubscribeDexTickersUseCase", "Starting ticker subscription process [dexVoList = " + listComponent1.size() + ", period = " + dexPeriodEnumComponent2 + "]");
            if (listComponent1.isEmpty()) {
                C41434qqj.w$default(c41434qqj, "SubscribeDexTickersUseCase", "No DEX tokens provided for ticker subscription", null, 4, null);
                return FlowKt.emptyFlow();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent1, 10));
            for (InterfaceC41655qus interfaceC41655qus : listComponent1) {
                arrayList.add(C56390yDp.OLrzqt(interfaceC41655qus.copydefault().getChainId(), interfaceC41655qus.copydefault().getTokenContractAddress()));
            }
            qUX qux = this.OLrzqt;
            subscribeDexTickersUseCase$onExecute$1.L$0 = this;
            subscribeDexTickersUseCase$onExecute$1.label = 1;
            objCopydefault = qux.copydefault(arrayList, subscribeDexTickersUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41454qrC = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41454qrC = (C41454qrC) subscribeDexTickersUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return FlowKt.flowOn(FlowKt.onStart(new ActionBar(FlowKt.sample(FlowKt.m7441catch(FlowKt.onEach((Flow) objCopydefault, new SubscribeDexTickersUseCase$onExecute$2(c41454qrC, null)), new SubscribeDexTickersUseCase$onExecute$3(null)), AEQbTJ), c41454qrC), new SubscribeDexTickersUseCase$onExecute$5(c41454qrC, null)), c41454qrC.EZpvd);
    }
}
