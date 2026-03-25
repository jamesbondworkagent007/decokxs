package com.okinc.tradingbot.impl.strategy.dialog;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$setupViewModel$2;
import com.okinc.unify_trade.biz.ConfirmInfoForSpotGridAddInvestment;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C43393roT;
import o.C47988uAv;
import o.C53913wuU;
import o.C53980wvi;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.uQN;
import o.wTC;
import o.wYK;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotGridAddInvestmentDialog$setupViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C53913wuU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridAddInvestmentDialog$setupViewModel$2(C53913wuU c53913wuU, Continuation<? super SpotGridAddInvestmentDialog$setupViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = c53913wuU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotGridAddInvestmentDialog$setupViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotGridAddInvestmentDialog$setupViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$setupViewModel$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C53913wuU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C53913wuU c53913wuU, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c53913wuU;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$setupViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06671 extends SuspendLambda implements Function2<Pair<? extends ConfirmInfoForSpotGridAddInvestment, ? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C53913wuU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06671(C53913wuU c53913wuU, Continuation<? super C06671> continuation) {
                super(2, continuation);
                this.this$0 = c53913wuU;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06671 c06671 = new C06671(this.this$0, continuation);
                c06671.L$0 = obj;
                return c06671;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends ConfirmInfoForSpotGridAddInvestment, ? extends String> pair, Continuation<? super Unit> continuation) {
                return invoke2((Pair<ConfirmInfoForSpotGridAddInvestment, String>) pair, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<ConfirmInfoForSpotGridAddInvestment, String> pair, Continuation<? super Unit> continuation) {
                return ((C06671) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                final String strAkhnZx;
                uQN uqn;
                C47988uAv c47988uAv;
                C47988uAv c47988uAv2;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Pair pair = (Pair) this.L$0;
                    if (pair.getFirst() != null) {
                        uQN uqn2 = this.this$0.isConnected;
                        if (!C33129mqd.OLrzqt((CharSequence) ((uqn2 == null || (c47988uAv2 = uqn2.OLrzqt) == null) ? null : c47988uAv2.AkhnZx())) || (uqn = this.this$0.isConnected) == null || (c47988uAv = uqn.OLrzqt) == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) {
                            strAkhnZx = "0";
                        }
                        C53980wvi.ActionBar actionBar = C53980wvi.Companion;
                        Object first = pair.getFirst();
                        Intrinsics.copydefault(first);
                        ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestment = (ConfirmInfoForSpotGridAddInvestment) first;
                        String strCopydefault = this.this$0.isConnected().copydefault("grid");
                        int iValueOf = this.this$0.valueOf();
                        TacticsData tacticsDataDbNXlk = this.this$0.DbNXlk();
                        SmartEarnParam simpleEarn = tacticsDataDbNXlk != null ? tacticsDataDbNXlk.getSimpleEarn() : null;
                        final C53913wuU c53913wuU = this.this$0;
                        actionBar.EZpvd(confirmInfoForSpotGridAddInvestment, strCopydefault, iValueOf, new Function0() { // from class: o.wvf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return SpotGridAddInvestmentDialog$setupViewModel$2.AnonymousClass1.C06671.invokeSuspend$lambda$1(c53913wuU, strAkhnZx);
                            }
                        }, simpleEarn).show(this.this$0.getChildFragmentManager(), "SpotGridIncreaseConfirmDialog");
                    } else {
                        String str = (String) pair.getSecond();
                        if (str != null) {
                            C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(C53913wuU c53913wuU, String str) {
                wYK wyk;
                TacticsData tacticsDataDbNXlk = c53913wuU.DbNXlk();
                if (tacticsDataDbNXlk != null) {
                    wTC wtcAhwBna = c53913wuU.AhwBna();
                    String algoId = tacticsDataDbNXlk.getAlgoId();
                    uQN uqn = c53913wuU.isConnected;
                    wtcAhwBna.copydefault(algoId, str, (uqn == null || (wyk = uqn.AYXKKw) == null) ? false : wyk.isChecked(), Dispatchers.getIO(), (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<ConfirmInfoForSpotGridAddInvestment, String>> sharedFlowEZpvd = this.this$0.AhwBna().EZpvd();
                C06671 c06671 = new C06671(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowEZpvd, c06671, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
