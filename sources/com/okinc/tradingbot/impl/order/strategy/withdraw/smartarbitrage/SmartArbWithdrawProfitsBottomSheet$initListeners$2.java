package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradeuilib.imgs.CdnResourceType;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$2;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33069mpW;
import o.C33070mpX;
import o.C48033uCm;
import o.C49722uts;
import o.C53613wom;
import o.C54946xaf;
import o.C55284xgz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.uLP;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsBottomSheet$initListeners$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C53613wom this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsBottomSheet$initListeners$2(C53613wom c53613wom, Continuation<? super SmartArbWithdrawProfitsBottomSheet$initListeners$2> continuation) {
        super(2, continuation);
        this.this$0 = c53613wom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbWithdrawProfitsBottomSheet$initListeners$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbWithdrawProfitsBottomSheet$initListeners$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C53613wom this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C53613wom c53613wom, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c53613wom;
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

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06591 extends SuspendLambda implements Function2<SmartArbWithdrawProfitsViewModel.Application, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C53613wom this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06591(C53613wom c53613wom, Continuation<? super C06591> continuation) {
                super(2, continuation);
                this.this$0 = c53613wom;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06591 c06591 = new C06591(this.this$0, continuation);
                c06591.L$0 = obj;
                return c06591;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SmartArbWithdrawProfitsViewModel.Application application, Continuation<? super Unit> continuation) {
                return ((C06591) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                View root;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SmartArbWithdrawProfitsViewModel.Application application = (SmartArbWithdrawProfitsViewModel.Application) this.L$0;
                    if (application instanceof SmartArbWithdrawProfitsViewModel.Application.TaskDescription) {
                        TacticsData tacticsDataDjBIcL = this.this$0.djBIcL();
                        if (tacticsDataDjBIcL != null) {
                            final C53613wom c53613wom = this.this$0;
                            Context context = c53613wom.getContext();
                            SmartArbWithdrawProfitsViewModel.Application.TaskDescription taskDescription = (SmartArbWithdrawProfitsViewModel.Application.TaskDescription) application;
                            BotPreShareBottomSheet botPreShareBottomSheetOLrzqt = BotPreShareBottomSheet.Companion.OLrzqt(new BotPreShareBottomSheet.UiParam(C33070mpX.AYXKKw(C48033uCm.Fragment.onProviderDisabled), C33069mpW.copydefault(C48033uCm.Fragment.onStatusChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", taskDescription.copydefault()))), uLP.AEQbTJ(taskDescription.AEQbTJ()), tacticsDataDjBIcL, null, context != null ? C49722uts.OLrzqt("lottie/tradingbot/bot_withdraw_profit.lottie", context, CdnResourceType.Lottie, true) : null, 16, null), new Function1() { // from class: o.woz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return SmartArbWithdrawProfitsBottomSheet$initListeners$2.AnonymousClass1.C06591.invokeSuspend$lambda$3$lambda$1(c53613wom, (TacticsData) obj2);
                                }
                            }, new Function0() { // from class: o.wox
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return SmartArbWithdrawProfitsBottomSheet$initListeners$2.AnonymousClass1.C06591.invokeSuspend$lambda$3$lambda$2(c53613wom);
                                }
                            });
                            FragmentManager parentFragmentManager = c53613wom.getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                            botPreShareBottomSheetOLrzqt.show(parentFragmentManager);
                        }
                    } else if (application instanceof SmartArbWithdrawProfitsViewModel.Application.StateListAnimator) {
                        C55284xgz.Activity activity = C55284xgz.Companion;
                        Context context2 = this.this$0.EZpvd().getRoot().getContext();
                        C54946xaf binding = this.this$0.getBinding();
                        if (binding == null || (root = binding.getRoot()) == null) {
                            root = this.this$0.EZpvd().getRoot();
                            Intrinsics.checkNotNullExpressionValue(root, "");
                        }
                        C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(context2, root, C33070mpX.AYXKKw(C48033uCm.Fragment.sElUiK));
                        if (c55284xgzAEQbTJ != null) {
                            C53613wom c53613wom2 = this.this$0;
                            c55284xgzAEQbTJ.isConnected(2);
                            C54946xaf binding2 = c53613wom2.getBinding();
                            c55284xgzAEQbTJ.AEQbTJ(binding2 != null ? binding2.OLrzqt : null);
                            c55284xgzAEQbTJ.hDKMBd();
                        }
                    } else if (application instanceof SmartArbWithdrawProfitsViewModel.Application.LoaderManager) {
                        C53613wom c53613wom3 = this.this$0;
                        Context context3 = c53613wom3.EZpvd().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        C53613wom.showEstLiquidationPrice$default(c53613wom3, context3, null, 2, null);
                    } else if (application instanceof SmartArbWithdrawProfitsViewModel.Application.ActionBar) {
                        SmartArbWithdrawProfitsViewModel.Application.ActionBar actionBar = (SmartArbWithdrawProfitsViewModel.Application.ActionBar) application;
                        C53613wom.showWithdrawableStakingProfitsDialog$default(this.this$0, actionBar.OLrzqt(), actionBar.KWHzl(), null, 4, null);
                    } else if (application instanceof SmartArbWithdrawProfitsViewModel.Application.C0662Application) {
                        C53613wom.showWithdrawableArbitrageProfitsDialog$default(this.this$0, ((SmartArbWithdrawProfitsViewModel.Application.C0662Application) application).EZpvd(), null, 2, null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$3$lambda$1(C53613wom c53613wom, TacticsData tacticsData) {
                Function0 function0 = c53613wom.gEmmrt;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$3$lambda$2(C53613wom c53613wom) {
                c53613wom.dismiss();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<SmartArbWithdrawProfitsViewModel.Application> sharedFlowFJNWhG = this.this$0.valueOf().fJNWhG();
                C06591 c06591 = new C06591(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowFJNWhG, c06591, this) == objCopydefault) {
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
            C53613wom c53613wom = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c53613wom, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c53613wom, state, anonymousClass1, this) == objCopydefault) {
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
