package com.okinc.business.market.features.coindetail.ui.snipers;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C26029jPh;
import o.C26041jPt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26043jPv;
import o.jNS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SniperHoldersViewModel extends ViewModel {
    public final MutableStateFlow<InterfaceC26043jPv> EZpvd;
    public final jNS KWHzl;
    public final StateFlow<InterfaceC26043jPv> copydefault;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HoldActivity.values().length];
            try {
                iArr[HoldActivity.HOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HoldActivity.TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HoldActivity.SELL_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HoldActivity.SELL_PART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HoldActivity.BUY_MORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26043jPv> KWHzl() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail.ui.snipers.SniperHoldersViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SniperHoldersViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail.ui.snipers.SniperHoldersViewModel$1$Application */
        public static final class Application implements Flow<C26029jPh> {
            public final /* synthetic */ Flow EZpvd;

            /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail.ui.snipers.SniperHoldersViewModel$1$Application$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(FlowCollector flowCollector) {
                    this.KWHzl = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    SniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                    if (continuation instanceof SniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i = sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.KWHzl;
                        C26029jPh c26029jPh = (C26029jPh) obj;
                        if (c26029jPh != null) {
                            sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(c26029jPh, sniperHoldersViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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
                this.EZpvd = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super C26029jPh> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Application application = new Application(SniperHoldersViewModel.this.KWHzl.copydefault());
                final SniperHoldersViewModel sniperHoldersViewModel = SniperHoldersViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperHoldersViewModel.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C26029jPh c26029jPh, Continuation<? super Unit> continuation) {
                        sniperHoldersViewModel.EZpvd.setValue(sniperHoldersViewModel.copydefault(c26029jPh));
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
    }

    @yCM
    public SniperHoldersViewModel(@NotNull jNS jns) {
        Intrinsics.checkNotNullParameter(jns, "");
        this.KWHzl = jns;
        MutableStateFlow<InterfaceC26043jPv> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26043jPv.StateListAnimator.KWHzl);
        this.EZpvd = MutableStateFlow;
        this.copydefault = MutableStateFlow;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SniperHoldersViewModel$startWss$1(this, str, str2, null), 3, null);
    }

    public final void copydefault() {
        this.KWHzl.KWHzl();
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SniperHoldersViewModel$loadData$1(this, str, str2, null), 3, null);
    }

    public final InterfaceC26043jPv copydefault(C26029jPh c26029jPh) {
        int size = c26029jPh.AEQbTJ().size();
        List<C26041jPt> listAEQbTJ = c26029jPh.AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listAEQbTJ) {
            HoldActivity holdActivityOLrzqt = ((C26041jPt) obj).OLrzqt();
            Object arrayList = linkedHashMap.get(holdActivityOLrzqt);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(holdActivityOLrzqt, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        String strValueOf = "0";
        String strValueOf2 = strValueOf;
        String strValueOf3 = strValueOf2;
        String strValueOf4 = strValueOf3;
        String strValueOf5 = strValueOf4;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i = ActionBar.AEQbTJ[((HoldActivity) entry.getKey()).ordinal()];
            if (i == 1) {
                strValueOf = String.valueOf(((List) entry.getValue()).size());
            } else if (i == 2) {
                strValueOf2 = String.valueOf(((List) entry.getValue()).size());
            } else if (i == 3) {
                strValueOf3 = String.valueOf(((List) entry.getValue()).size());
            } else if (i == 4) {
                strValueOf4 = String.valueOf(((List) entry.getValue()).size());
            } else if (i == 5) {
                strValueOf5 = String.valueOf(((List) entry.getValue()).size());
            }
        }
        return new InterfaceC26043jPv.ActionBar(c26029jPh.OLrzqt(), c26029jPh.copydefault(), c26029jPh.AEQbTJ(), strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, String.valueOf(size));
    }
}
