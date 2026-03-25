package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$updateLimitByMarketData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C21668hHx;
import o.C23272hvB;
import o.C28222kTk;
import o.C30565ldZ;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$updateLimitByMarketData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C21668hHx $this_updateLimitByMarketData;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedLimitBy.values().length];
            try {
                iArr[AdvancedLimitBy.Price.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$updateLimitByMarketData$1(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C21668hHx c21668hHx, Continuation<? super AdvancedPlaceOrderFragment$updateLimitByMarketData$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderFragment;
        this.$this_updateLimitByMarketData = c21668hHx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderFragment$updateLimitByMarketData$1(this.this$0, this.$this_updateLimitByMarketData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$updateLimitByMarketData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<C28222kTk> {
        public final /* synthetic */ C21668hHx KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$updateLimitByMarketData$1$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C21668hHx KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C21668hHx c21668hHx) {
                this.EZpvd = flowCollector;
                this.KWHzl = c21668hHx;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1 advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1;
                String strCopydefault;
                if (continuation instanceof AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1) {
                    advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1 = (AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1 = new AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    C28222kTk c28222kTk = (C28222kTk) obj;
                    AppCompatTextView appCompatTextViewGEmmrt = this.KWHzl.DbNXlk.gEmmrt();
                    Object tag = appCompatTextViewGEmmrt != null ? appCompatTextViewGEmmrt.getTag() : null;
                    AdvancedLimitBy advancedLimitBy = tag instanceof AdvancedLimitBy ? (AdvancedLimitBy) tag : null;
                    int i3 = advancedLimitBy == null ? -1 : StateListAnimator.KWHzl[advancedLimitBy.ordinal()];
                    if (i3 != 1 && i3 == 2) {
                        strCopydefault = c28222kTk.EZpvd();
                    } else {
                        strCopydefault = c28222kTk.copydefault();
                    }
                    if (C30565ldZ.EZpvd(strCopydefault)) {
                        advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, advancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C21668hHx c21668hHx) {
            this.OLrzqt = flow;
            this.KWHzl = c21668hHx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C28222kTk> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowTake = FlowKt.take(new ActionBar(this.this$0.djBIcL().djBIcL(), this.$this_updateLimitByMarketData), 1);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$this_updateLimitByMarketData, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$updateLimitByMarketData$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<C28222kTk, Continuation<? super Unit>, Object> {
        final /* synthetic */ C21668hHx $this_updateLimitByMarketData;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvancedPlaceOrderFragment this$0;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$updateLimitByMarketData$1$2$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AdvancedLimitBy.values().length];
                try {
                    iArr[AdvancedLimitBy.Price.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C21668hHx c21668hHx, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = advancedPlaceOrderFragment;
            this.$this_updateLimitByMarketData = c21668hHx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$this_updateLimitByMarketData, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C28222kTk c28222kTk, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(c28222kTk, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            final String strCopydefault;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C28222kTk c28222kTk = (C28222kTk) this.L$0;
                if (!this.this$0.AEQbTJ().RJOkX() || this.$this_updateLimitByMarketData.DbNXlk.fetchVPNInfo()) {
                    return Unit.INSTANCE;
                }
                C55001xbh c55001xbhAhwBna = this.$this_updateLimitByMarketData.DbNXlk.AhwBna();
                if (c55001xbhAhwBna != null && c55001xbhAhwBna.isFocused()) {
                    return Unit.INSTANCE;
                }
                AppCompatTextView appCompatTextViewGEmmrt = this.$this_updateLimitByMarketData.DbNXlk.gEmmrt();
                Object tag = appCompatTextViewGEmmrt != null ? appCompatTextViewGEmmrt.getTag() : null;
                AdvancedLimitBy advancedLimitBy = tag instanceof AdvancedLimitBy ? (AdvancedLimitBy) tag : null;
                int i = advancedLimitBy == null ? -1 : TaskDescription.KWHzl[advancedLimitBy.ordinal()];
                if (i != 1 && i == 2) {
                    strCopydefault = c28222kTk.EZpvd();
                } else {
                    strCopydefault = c28222kTk.copydefault();
                }
                final C55001xbh c55001xbhAhwBna2 = this.$this_updateLimitByMarketData.DbNXlk.AhwBna();
                if (c55001xbhAhwBna2 != null) {
                    final AdvancedPlaceOrderFragment advancedPlaceOrderFragment = this.this$0;
                    c55001xbhAhwBna2.post(new Runnable() { // from class: o.lgL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AdvancedPlaceOrderFragment$updateLimitByMarketData$1.AnonymousClass2.invokeSuspend$lambda$1$lambda$0(c55001xbhAhwBna2, strCopydefault, advancedPlaceOrderFragment);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(C55001xbh c55001xbh, String str, AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
            c55001xbh.requestFocus();
            c55001xbh.setPlainNumericText(C23272hvB.KWHzl.AEQbTJ(str, String.valueOf(C30565ldZ.KWHzl(str))));
            c55001xbh.clearFocus();
            advancedPlaceOrderFragment.djBIcL = false;
        }
    }
}
