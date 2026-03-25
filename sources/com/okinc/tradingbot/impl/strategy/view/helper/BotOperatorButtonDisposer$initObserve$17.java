package com.okinc.tradingbot.impl.strategy.view.helper;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.aiBot.dto.InvestLimitDto;
import com.okinc.tradingbot.impl.aiBot.dto.ModelInfoDto;
import com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer$initObserve$17;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.ActivityC52122vzt;
import o.C33070mpX;
import o.C33129mqd;
import o.C33488mxR;
import o.C43056riA;
import o.C48033uCm;
import o.C53418wlC;
import o.C53809wsW;
import o.C53875wtj;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC52662wTs;
import o.ViewOnClickListenerC54939xaY;
import o.uCG;
import o.uCJ;
import o.uCN;
import o.uEG;
import o.uHJ;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorButtonDisposer$initObserve$17 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $owner;
    int label;
    final /* synthetic */ BotOperatorButtonDisposer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOperatorButtonDisposer$initObserve$17(LifecycleOwner lifecycleOwner, BotOperatorButtonDisposer botOperatorButtonDisposer, Continuation<? super BotOperatorButtonDisposer$initObserve$17> continuation) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.this$0 = botOperatorButtonDisposer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotOperatorButtonDisposer$initObserve$17(this.$owner, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOperatorButtonDisposer$initObserve$17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer$initObserve$17$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BotOperatorButtonDisposer this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BotOperatorButtonDisposer botOperatorButtonDisposer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = botOperatorButtonDisposer;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SharedFlow<BotOperatorViewModel.ActionBar> sharedFlowAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BotOperatorViewModel botOperatorViewModelCopydefault = this.this$0.copydefault();
                if (botOperatorViewModelCopydefault == null || (sharedFlowAEQbTJ = botOperatorViewModelCopydefault.AEQbTJ()) == null) {
                    return Unit.INSTANCE;
                }
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
                this.label = 1;
                if (sharedFlowAEQbTJ.collect(anonymousClass5, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer$initObserve$17$1$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ BotOperatorButtonDisposer EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(BotOperatorButtonDisposer botOperatorButtonDisposer) {
                this.EZpvd = botOperatorButtonDisposer;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r9v11, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final Object emit(final BotOperatorViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
                T next;
                String strOLrzqt;
                this.EZpvd.AhwBna();
                String strAEQbTJ = null;
                strAEQbTJ = null;
                if (actionBar instanceof BotOperatorViewModel.ActionBar.PendingIntent) {
                    FragmentManager fragmentManagerValueOf = this.EZpvd.valueOf();
                    if (fragmentManagerValueOf != null) {
                        final BotOperatorButtonDisposer botOperatorButtonDisposer = this.EZpvd;
                        if (fragmentManagerValueOf.isDestroyed()) {
                            return Unit.INSTANCE;
                        }
                        C53875wtj.TaskDescription taskDescription = C53875wtj.Companion;
                        String algoId = ((BotOperatorViewModel.ActionBar.PendingIntent) actionBar).copydefault().getAlgoId();
                        boolean z = botOperatorButtonDisposer.AEQbTJ instanceof uHJ;
                        BotOperatorViewModel botOperatorViewModelCopydefault = botOperatorButtonDisposer.copydefault();
                        final C53875wtj c53875wtjCopydefault = taskDescription.copydefault(algoId, z, botOperatorViewModelCopydefault != null ? botOperatorViewModelCopydefault.copydefault() : null);
                        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
                        c53875wtjCopydefault.AEQbTJ(interfaceC52662wTs != null ? interfaceC52662wTs.OLrzqt() : null);
                        c53875wtjCopydefault.EZpvd(new Function2() { // from class: o.wST
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return BotOperatorButtonDisposer$initObserve$17.AnonymousClass1.AnonymousClass5.EZpvd(botOperatorButtonDisposer, (C53809wsW) obj, (TacticsData) obj2);
                            }
                        });
                        c53875wtjCopydefault.EZpvd(new Function1() { // from class: o.wSU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return BotOperatorButtonDisposer$initObserve$17.AnonymousClass1.AnonymousClass5.AEQbTJ(actionBar, c53875wtjCopydefault, (java.lang.String) obj);
                            }
                        });
                        c53875wtjCopydefault.show(fragmentManagerValueOf, C53875wtj.class.getSimpleName());
                    }
                } else if (actionBar instanceof BotOperatorViewModel.ActionBar.Activity) {
                    FragmentManager fragmentManagerValueOf2 = this.EZpvd.valueOf();
                    if (fragmentManagerValueOf2 != null) {
                        uCG.Activity activityCopydefault = ((BotOperatorViewModel.ActionBar.Activity) actionBar).copydefault();
                        uEG.Activity activity = uEG.Companion;
                        List<InvestLimitDto> listAhwBna = activityCopydefault.EZpvd().AhwBna();
                        AiOrderReq aiOrderReqKWHzl = activityCopydefault.KWHzl();
                        TpSlLimitDto tpSlLimitDtoAuCTel = activityCopydefault.EZpvd().AuCTel();
                        Iterator<T> it = activityCopydefault.EZpvd().AEQbTJ().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((ModelInfoDto) next).copydefault(), (Object) activityCopydefault.KWHzl().getAiModel())) {
                                break;
                            }
                        }
                        ModelInfoDto modelInfoDto = next;
                        if (modelInfoDto != null && (strOLrzqt = modelInfoDto.OLrzqt()) != null) {
                            strAEQbTJ = C53418wlC.AEQbTJ(strOLrzqt);
                        }
                        activity.AEQbTJ(fragmentManagerValueOf2, listAhwBna, aiOrderReqKWHzl, tpSlLimitDtoAuCTel, strAEQbTJ == null ? "" : strAEQbTJ, C56443yFo.KWHzl(activityCopydefault.EZpvd().fJNWhG()), C56443yFo.KWHzl(activityCopydefault.EZpvd().AkhnZx()));
                    }
                } else if (actionBar instanceof BotOperatorViewModel.ActionBar.TaskDescription) {
                    uCJ.StateListAnimator stateListAnimatorKWHzl = ((BotOperatorViewModel.ActionBar.TaskDescription) actionBar).KWHzl();
                    Context contextAEQbTJ = this.EZpvd.AEQbTJ();
                    if (contextAEQbTJ != null) {
                        ActivityC52122vzt.Companion.OLrzqt(contextAEQbTJ, new BotTradeData("ai_bot", "", "", (Parcelable) stateListAnimatorKWHzl.OLrzqt(), false, (String) null, (String) null, false, (List) null, 496, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotOperatorButton", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                    }
                } else if (actionBar instanceof BotOperatorViewModel.ActionBar.C0676ActionBar) {
                    Context contextAEQbTJ2 = this.EZpvd.AEQbTJ();
                    if (contextAEQbTJ2 != null) {
                        uCN.StateListAnimator stateListAnimatorCopydefault = ((BotOperatorViewModel.ActionBar.C0676ActionBar) actionBar).copydefault();
                        C43056riA.AEQbTJ.OLrzqt(contextAEQbTJ2, "okluatradingeco", "/bot/ai/backtest_params", C56424yEw.gEmmrt(C56390yDp.OLrzqt("backtestAiThinkingIntervals", stateListAnimatorCopydefault.OLrzqt()), C56390yDp.OLrzqt("orderParams", C33488mxR.EZpvd(stateListAnimatorCopydefault.copydefault()))));
                    }
                } else if (actionBar instanceof BotOperatorViewModel.ActionBar.Application) {
                    BotOperatorViewModel.ActionBar.Application application = (BotOperatorViewModel.ActionBar.Application) actionBar;
                    int i = application.AEQbTJ() ? C48033uCm.Fragment.finit : C48033uCm.Fragment.RcXXUw;
                    InterfaceC52662wTs interfaceC52662wTs2 = this.EZpvd.AEQbTJ;
                    if (interfaceC52662wTs2 != null) {
                        InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs2, C33070mpX.AYXKKw(i), 3, false, 4, null);
                    }
                    InterfaceC52662wTs interfaceC52662wTs3 = this.EZpvd.AEQbTJ;
                    if (interfaceC52662wTs3 != null) {
                        interfaceC52662wTs3.OLrzqt(application.copydefault(), application.KWHzl());
                    }
                } else {
                    if (!(actionBar instanceof BotOperatorViewModel.ActionBar.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithFailedIcon$default(((BotOperatorViewModel.ActionBar.StateListAnimator) actionBar).copydefault(), 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            public static final Unit EZpvd(BotOperatorButtonDisposer botOperatorButtonDisposer, C53809wsW c53809wsW, TacticsData tacticsData) {
                Intrinsics.checkNotNullParameter(c53809wsW, "");
                Intrinsics.checkNotNullParameter(tacticsData, "");
                BotOperatorButtonDisposer.dispose$default(botOperatorButtonDisposer, c53809wsW.OLrzqt(), tacticsData, botOperatorButtonDisposer.EZpvd, botOperatorButtonDisposer.AYXKKw, null, null, 48, null);
                return Unit.INSTANCE;
            }

            public static final Unit AEQbTJ(BotOperatorViewModel.ActionBar actionBar, C53875wtj c53875wtj, String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.EZpvd((Object) ((BotOperatorViewModel.ActionBar.PendingIntent) actionBar).copydefault().getState(), (Object) "pause")) {
                    c53875wtj.EZpvd(str, 1);
                } else {
                    Context context = c53875wtj.getContext();
                    if (context != null && C33129mqd.OLrzqt((CharSequence) str)) {
                        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OAUGar));
                        viewOnClickListenerC54939xaY.EZpvd(str);
                        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.QBiWsm), new View.OnClickListener() { // from class: o.wSQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                BotOperatorButtonDisposer$initObserve$17.AnonymousClass1.AnonymousClass5.copydefault(viewOnClickListenerC54939xaY, view);
                            }
                        });
                        viewOnClickListenerC54939xaY.show();
                    }
                }
                return Unit.INSTANCE;
            }

            public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
                viewOnClickListenerC54939xaY.dismiss();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = this.$owner;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
