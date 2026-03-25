package com.okinc.okmarket.ui.market.remind.fragment;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C42933rfk;
import o.C43296rmc;
import o.C46693tbw;
import o.C46825teV;
import o.C46901tfs;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTB;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initUIStatus$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initUIStatus$6(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initUIStatus$6> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initUIStatus$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initUIStatus$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<String> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C46825teV EZpvd;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$6$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C46825teV EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C46825teV c46825teV) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c46825teV;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1 priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1;
                String str;
                Object objM7377constructorimpl;
                String str2;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1) {
                    priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1 = (PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1 = new PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == 3 || iIntValue == 4) {
                        str = "%";
                    } else {
                        try {
                            Result.Application application = Result.Companion;
                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.EZpvd.AkhnZx(), new String[]{"-"}, false, 0, 6, (Object) null);
                            if (!(!listSplit$default.isEmpty()) || listSplit$default.size() <= 1 || (str2 = (String) listSplit$default.get(1)) == null) {
                                str2 = "";
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(str2);
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        str = (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "" : objM7377constructorimpl);
                    }
                    priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(str, priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$2$2$1) == objCopydefault) {
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

        public Activity(Flow flow, C46825teV c46825teV) {
            this.AEQbTJ = flow;
            this.EZpvd = c46825teV;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<Integer> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$6$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1 priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1) {
                    priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1 = (PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1 = new PriceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(((C46901tfs) obj).AEQbTJ().getPromptType());
                    priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, priceRemindEditFragment$initUIStatus$6$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Activity activity = new Activity(FlowKt.distinctUntilChanged(new Application(this.this$0.isConnected().copydefault())), this.this$0);
            final C46825teV c46825teV = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$6.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    C46693tbw c46693tbw;
                    C55001xbh c55001xbhAEQbTJ;
                    C46693tbw c46693tbw2;
                    C55001xbh c55001xbhAEQbTJ2;
                    C46693tbw c46693tbw3;
                    C42933rfk c42933rfkAYXKKw = c46825teV.AYXKKw();
                    if (c42933rfkAYXKKw != null && (c46693tbw3 = c42933rfkAYXKKw.fetchVPNInfo) != null) {
                        c46693tbw3.setUnit(str);
                    }
                    String promptThreshold = c46825teV.isConnected().copydefault().getValue().AEQbTJ().getPromptThreshold();
                    C46825teV c46825teV2 = c46825teV;
                    if (promptThreshold.length() > 0) {
                        C42933rfk c42933rfkAYXKKw2 = c46825teV2.AYXKKw();
                        if (!Intrinsics.EZpvd((Object) ((c42933rfkAYXKKw2 == null || (c46693tbw2 = c42933rfkAYXKKw2.fetchVPNInfo) == null || (c55001xbhAEQbTJ2 = c46693tbw2.AEQbTJ()) == null) ? null : c55001xbhAEQbTJ2.valueOf()), (Object) pTB.formatLocalized$default(c46825teV2.isConnected().copydefault().getValue().AEQbTJ().getPromptThreshold(), null, 1, null))) {
                            C43296rmc.EZpvd(c46825teV2.getTAG(), "promptThreshold 1: " + promptThreshold);
                            try {
                                Double.parseDouble(promptThreshold);
                                promptThreshold = pTB.formatLocalized$default(promptThreshold, null, 1, null);
                            } catch (Exception unused) {
                            }
                            C42933rfk c42933rfkAYXKKw3 = c46825teV2.AYXKKw();
                            if (c42933rfkAYXKKw3 != null && (c46693tbw = c42933rfkAYXKKw3.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) != null) {
                                c55001xbhAEQbTJ.setLocalizedNumericText(promptThreshold);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (activity.collect(flowCollector, this) == objCopydefault) {
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
