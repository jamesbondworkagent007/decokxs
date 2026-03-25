package com.okinc.okmarket.ui.market.remind.fragment;

import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33070mpX;
import o.C42933rfk;
import o.C46645tbA;
import o.C46690tbt;
import o.C46693tbw;
import o.C46825teV;
import o.C46901tfs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qZH;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceRemindEditFragment$initUIStatus$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46825teV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRemindEditFragment$initUIStatus$8(C46825teV c46825teV, Continuation<? super PriceRemindEditFragment$initUIStatus$8> continuation) {
        super(2, continuation);
        this.this$0 = c46825teV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceRemindEditFragment$initUIStatus$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceRemindEditFragment$initUIStatus$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<Integer> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$8$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PriceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1 priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof PriceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1) {
                    priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1 = (PriceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1 = new PriceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(((C46901tfs) obj).AEQbTJ().getPromptType());
                    priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, priceRemindEditFragment$initUIStatus$8$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
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
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$8.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return AEQbTJ(((Number) obj2).intValue(), continuation);
                }

                public final Object AEQbTJ(int i2, Continuation<? super Unit> continuation) {
                    TextView textView;
                    TextView textView2;
                    TextView textView3;
                    TextView textView4;
                    TextView textView5;
                    C46645tbA c46645tbA;
                    C46645tbA c46645tbA2;
                    C46693tbw c46693tbw;
                    LinearLayoutCompat linearLayoutCompat;
                    TextView textView6;
                    switch (i2) {
                        case 1:
                            C42933rfk c42933rfkAYXKKw = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw != null && (textView = c42933rfkAYXKKw.AuCTel) != null) {
                                textView.setText(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOKBmQN));
                            }
                            c46825teV.EZpvd(true);
                            break;
                        case 2:
                            C42933rfk c42933rfkAYXKKw2 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw2 != null && (textView2 = c42933rfkAYXKKw2.AuCTel) != null) {
                                textView2.setText(C33070mpX.AYXKKw(qZH.PendingIntent.fDu));
                            }
                            c46825teV.EZpvd(true);
                            break;
                        case 3:
                            C42933rfk c42933rfkAYXKKw3 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw3 != null && (textView3 = c42933rfkAYXKKw3.AuCTel) != null) {
                                textView3.setText(C33070mpX.AYXKKw(qZH.PendingIntent.xxhdY));
                            }
                            c46825teV.EZpvd(false);
                            break;
                        case 4:
                            C42933rfk c42933rfkAYXKKw4 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw4 != null && (textView4 = c42933rfkAYXKKw4.AuCTel) != null) {
                                textView4.setText(C33070mpX.AYXKKw(qZH.PendingIntent.ilfrrN));
                            }
                            c46825teV.EZpvd(false);
                            break;
                        case 5:
                            C42933rfk c42933rfkAYXKKw5 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw5 != null && (textView5 = c42933rfkAYXKKw5.AuCTel) != null) {
                                textView5.setText(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOKBmQNaCIdOM));
                            }
                            c46825teV.EZpvd(true);
                            break;
                        case 6:
                            C42933rfk c42933rfkAYXKKw6 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw6 != null && (textView6 = c42933rfkAYXKKw6.AuCTel) != null) {
                                textView6.setText(C33070mpX.AYXKKw(qZH.PendingIntent.OJuSTm));
                            }
                            C42933rfk c42933rfkAYXKKw7 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw7 != null && (linearLayoutCompat = c42933rfkAYXKKw7.valueOf) != null) {
                                linearLayoutCompat.setVisibility(8);
                            }
                            C42933rfk c42933rfkAYXKKw8 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw8 != null && (c46693tbw = c42933rfkAYXKKw8.fetchVPNInfo) != null) {
                                c46693tbw.setVisibility(8);
                            }
                            C42933rfk c42933rfkAYXKKw9 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw9 != null && (c46645tbA2 = c42933rfkAYXKKw9.AhwBna) != null) {
                                c46645tbA2.setVisibility(0);
                            }
                            AlertRemindPo alertRemindPoAEQbTJ = c46825teV.isConnected().copydefault().getValue().AEQbTJ();
                            C42933rfk c42933rfkAYXKKw10 = c46825teV.AYXKKw();
                            if (c42933rfkAYXKKw10 != null && (c46645tbA = c42933rfkAYXKKw10.AhwBna) != null) {
                                c46645tbA.setIndicator(new C46690tbt(alertRemindPoAEQbTJ.getIndicatorType(), alertRemindPoAEQbTJ.getTimePeriod(), alertRemindPoAEQbTJ.getSignalType(), alertRemindPoAEQbTJ.getCondition1(), alertRemindPoAEQbTJ.getCondition2(), alertRemindPoAEQbTJ.getPresetCondition()));
                            }
                            break;
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
