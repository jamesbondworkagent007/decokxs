package com.okinc.okmarket.ui.market.remind.fragment;

import android.text.Editable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33129mqd;
import o.C42933rfk;
import o.C43296rmc;
import o.C46693tbw;
import o.C46825teV;
import o.C46901tfs;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pTB;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initUIStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initUIStatus$2(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initUIStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initUIStatus$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initUIStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<String> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$2$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1 priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1) {
                    priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1 = (PriceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1 = new PriceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    String promptThreshold = ((C46901tfs) obj).AEQbTJ().getPromptThreshold();
                    priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(promptThreshold, priceRemindEditFragment$initUIStatus$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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

        public Activity(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Activity(this.this$0.isConnected().copydefault()));
            final C46825teV c46825teV = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$2.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    C46693tbw c46693tbw;
                    C55001xbh c55001xbhAEQbTJ;
                    C42933rfk c42933rfkAYXKKw;
                    C46693tbw c46693tbw2;
                    String localized$default;
                    C46693tbw c46693tbw3;
                    C55001xbh c55001xbhAEQbTJ2;
                    C42933rfk c42933rfkAYXKKw2;
                    C46693tbw c46693tbw4;
                    C55001xbh c55001xbhAEQbTJ3;
                    String strValueOf;
                    C42933rfk c42933rfkAYXKKw3;
                    C46693tbw c46693tbw5;
                    C55001xbh c55001xbhAEQbTJ4;
                    C46693tbw c46693tbw6;
                    C55001xbh c55001xbhAEQbTJ5;
                    if (str.length() == 0) {
                        C42933rfk c42933rfkAYXKKw4 = c46825teV.AYXKKw();
                        Editable text = (c42933rfkAYXKKw4 == null || (c46693tbw6 = c42933rfkAYXKKw4.fetchVPNInfo) == null || (c55001xbhAEQbTJ5 = c46693tbw6.AEQbTJ()) == null) ? null : c55001xbhAEQbTJ5.getText();
                        if (text != null && text.length() != 0 && (c42933rfkAYXKKw3 = c46825teV.AYXKKw()) != null && (c46693tbw5 = c42933rfkAYXKKw3.fetchVPNInfo) != null && (c55001xbhAEQbTJ4 = c46693tbw5.AEQbTJ()) != null) {
                            c55001xbhAEQbTJ4.setLocalizedNumericText(str);
                        }
                    }
                    C43296rmc.EZpvd(c46825teV.getTAG(), "promptThreshold: " + str);
                    String strReplace$default = C59449zhJ.replace$default(str, "%", "", false, 4, (Object) null);
                    if (strReplace$default.length() <= 0 || (c42933rfkAYXKKw2 = c46825teV.AYXKKw()) == null || (c46693tbw4 = c42933rfkAYXKKw2.fetchVPNInfo) == null || (c55001xbhAEQbTJ3 = c46693tbw4.AEQbTJ()) == null || (strValueOf = c55001xbhAEQbTJ3.valueOf()) == null || strValueOf.length() > 0) {
                        C42933rfk c42933rfkAYXKKw5 = c46825teV.AYXKKw();
                        if (Intrinsics.EZpvd((Object) ((c42933rfkAYXKKw5 == null || (c46693tbw = c42933rfkAYXKKw5.fetchVPNInfo) == null || (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) == null) ? null : c55001xbhAEQbTJ.valueOf()), (Object) "0")) {
                            try {
                                Double.parseDouble(strReplace$default);
                                localized$default = pTB.formatLocalized$default(strReplace$default, null, 1, null);
                            } catch (Exception unused) {
                                localized$default = strReplace$default;
                            }
                            C42933rfk c42933rfkAYXKKw6 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw6 != null && (c46693tbw3 = c42933rfkAYXKKw6.fetchVPNInfo) != null && (c55001xbhAEQbTJ2 = c46693tbw3.AEQbTJ()) != null) {
                                c55001xbhAEQbTJ2.setLocalizedNumericText(localized$default);
                            }
                        }
                    }
                    if ((c46825teV.isConnected().copydefault().getValue().AEQbTJ().getPromptType() == 3 || c46825teV.isConnected().copydefault().getValue().AEQbTJ().getPromptType() == 4) && (c42933rfkAYXKKw = c46825teV.AYXKKw()) != null && (c46693tbw2 = c42933rfkAYXKKw.fetchVPNInfo) != null) {
                        c46693tbw2.setPercentageBarProgress(C33129mqd.djBIcL(strReplace$default));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == objCopydefault) {
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
}
