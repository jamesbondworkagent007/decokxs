package com.okinc.kline.ui.mvp;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.exoplayer2.C;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C38358pVv;
import o.C39562pug;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.oLY;
import o.pEF;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$loadFormulaKline$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ KlineFormulaData $formulaInfo;
    final /* synthetic */ Ref.BooleanRef $hasSetCandleData;
    final /* synthetic */ Ref.BooleanRef $isInitial;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ boolean $showErrorUi;
    final /* synthetic */ int $time;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketDetailPresent$loadFormulaKline$1(LifecycleOwner lifecycleOwner, C39562pug c39562pug, KlineFormulaData klineFormulaData, int i, Ref.BooleanRef booleanRef, Function1<? super Boolean, Unit> function1, boolean z, Ref.BooleanRef booleanRef2, Continuation<? super MarketDetailPresent$loadFormulaKline$1> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.this$0 = c39562pug;
        this.$formulaInfo = klineFormulaData;
        this.$time = i;
        this.$isInitial = booleanRef;
        this.$callback = function1;
        this.$showErrorUi = z;
        this.$hasSetCandleData = booleanRef2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$loadFormulaKline$1(this.$lifecycleOwner, this.this$0, this.$formulaInfo, this.$time, this.$isInitial, this.$callback, this.$showErrorUi, this.$hasSetCandleData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailPresent$loadFormulaKline$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.mvp.MarketDetailPresent$loadFormulaKline$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KlineFormulaData $formulaInfo;
        final /* synthetic */ Ref.BooleanRef $hasSetCandleData;
        final /* synthetic */ Ref.BooleanRef $isInitial;
        final /* synthetic */ boolean $showErrorUi;
        final /* synthetic */ int $time;
        int label;
        final /* synthetic */ C39562pug this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C39562pug c39562pug, KlineFormulaData klineFormulaData, int i, Ref.BooleanRef booleanRef, Function1<? super Boolean, Unit> function1, boolean z, Ref.BooleanRef booleanRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c39562pug;
            this.$formulaInfo = klineFormulaData;
            this.$time = i;
            this.$isInitial = booleanRef;
            this.$callback = function1;
            this.$showErrorUi = z;
            this.$hasSetCandleData = booleanRef2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$formulaInfo, this.$time, this.$isInitial, this.$callback, this.$showErrorUi, this.$hasSetCandleData, continuation);
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
                C38358pVv c38358pVv = this.this$0.AubY;
                String strEncode = URLEncoder.encode(this.$formulaInfo.getCalcExpression(), C.UTF8_NAME);
                Intrinsics.checkNotNullExpressionValue(strEncode, "");
                String strEncode2 = URLEncoder.encode(this.$formulaInfo.getInstIdArray(), C.UTF8_NAME);
                Intrinsics.checkNotNullExpressionValue(strEncode2, "");
                Flow<Pair<List<Boolean>, List<oLY>>> flowEZpvd = c38358pVv.EZpvd(strEncode, strEncode2, pEF.OLrzqt.OLrzqt(this.$time));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$isInitial, this.$callback, this.$showErrorUi, this.this$0, this.$hasSetCandleData);
                this.label = 1;
                if (flowEZpvd.collect(anonymousClass5, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.kline.ui.mvp.MarketDetailPresent$loadFormulaKline$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ Ref.BooleanRef AEQbTJ;
            public final /* synthetic */ Ref.BooleanRef EZpvd;
            public final /* synthetic */ C39562pug KWHzl;
            public final /* synthetic */ boolean OLrzqt;
            public final /* synthetic */ Function1<Boolean, Unit> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass5(Ref.BooleanRef booleanRef, Function1<? super Boolean, Unit> function1, boolean z, C39562pug c39562pug, Ref.BooleanRef booleanRef2) {
                this.EZpvd = booleanRef;
                this.copydefault = function1;
                this.OLrzqt = z;
                this.KWHzl = c39562pug;
                this.AEQbTJ = booleanRef2;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Pair<? extends List<Boolean>, ? extends List<? extends oLY>> pair, Continuation<? super Unit> continuation) throws Throwable {
                MarketDetailPresent$loadFormulaKline$1$1$1$emit$1 marketDetailPresent$loadFormulaKline$1$1$1$emit$1;
                AnonymousClass5<T> anonymousClass5;
                if (continuation instanceof MarketDetailPresent$loadFormulaKline$1$1$1$emit$1) {
                    marketDetailPresent$loadFormulaKline$1$1$1$emit$1 = (MarketDetailPresent$loadFormulaKline$1$1$1$emit$1) continuation;
                    int i = marketDetailPresent$loadFormulaKline$1$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        marketDetailPresent$loadFormulaKline$1$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        marketDetailPresent$loadFormulaKline$1$1$1$emit$1 = new MarketDetailPresent$loadFormulaKline$1$1$1$emit$1(this, continuation);
                    }
                }
                Object objWithContext = marketDetailPresent$loadFormulaKline$1$1$1$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = marketDetailPresent$loadFormulaKline$1$1$1$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    List<Boolean> listComponent1 = pair.component1();
                    List<? extends oLY> listComponent2 = pair.component2();
                    if (this.EZpvd.element && listComponent1.get(0).booleanValue()) {
                        this.EZpvd.element = false;
                        Function1<Boolean, Unit> function1 = this.copydefault;
                        if (function1 != null) {
                            function1.invoke(listComponent1.get(1));
                        }
                        if (!listComponent1.get(1).booleanValue()) {
                            if (this.OLrzqt) {
                                InterfaceC39563puh.Application application = this.KWHzl.wlaJM;
                                if (application != null) {
                                    application.gwTjWJ();
                                }
                            } else {
                                InterfaceC39563puh.Application application2 = this.KWHzl.wlaJM;
                                if (application2 != null) {
                                    application2.RKDWNf();
                                }
                            }
                        }
                    }
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1 marketDetailPresent$loadFormulaKline$1$1$1$convertedData$1 = new MarketDetailPresent$loadFormulaKline$1$1$1$convertedData$1(this.KWHzl, listComponent2, null);
                    marketDetailPresent$loadFormulaKline$1$1$1$emit$1.L$0 = this;
                    marketDetailPresent$loadFormulaKline$1$1$1$emit$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, marketDetailPresent$loadFormulaKline$1$1$1$convertedData$1, marketDetailPresent$loadFormulaKline$1$1$1$emit$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass5 = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objWithContext);
                        return Unit.INSTANCE;
                    }
                    anonymousClass5 = (AnonymousClass5) marketDetailPresent$loadFormulaKline$1$1$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                MarketDetailPresent$loadFormulaKline$1$1$1$1 marketDetailPresent$loadFormulaKline$1$1$1$1 = new MarketDetailPresent$loadFormulaKline$1$1$1$1((List) objWithContext, anonymousClass5.AEQbTJ, anonymousClass5.KWHzl, null);
                marketDetailPresent$loadFormulaKline$1$1$1$emit$1.L$0 = null;
                marketDetailPresent$loadFormulaKline$1$1$1$emit$1.label = 2;
                if (BuildersKt.withContext(main, marketDetailPresent$loadFormulaKline$1$1$1$1, marketDetailPresent$loadFormulaKline$1$1$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$formulaInfo, this.$time, this.$isInitial, this.$callback, this.$showErrorUi, this.$hasSetCandleData, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
