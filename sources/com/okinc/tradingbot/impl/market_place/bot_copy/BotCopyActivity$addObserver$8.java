package com.okinc.tradingbot.impl.market_place.bot_copy;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.market_place.bot_copy.BotCopyActivity$addObserver$8;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.ActivityC51071vgB;
import o.C32866mlf;
import o.C51141vhS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotCopyActivity$addObserver$8 extends SuspendLambda implements Function2<StgyCopyPresenter.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC51071vgB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotCopyActivity$addObserver$8(ActivityC51071vgB activityC51071vgB, Continuation<? super BotCopyActivity$addObserver$8> continuation) {
        super(2, continuation);
        this.this$0 = activityC51071vgB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotCopyActivity$addObserver$8 botCopyActivity$addObserver$8 = new BotCopyActivity$addObserver$8(this.this$0, continuation);
        botCopyActivity$addObserver$8.L$0 = obj;
        return botCopyActivity$addObserver$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StgyCopyPresenter.Activity activity, Continuation<? super Unit> continuation) {
        return ((BotCopyActivity$addObserver$8) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            StgyCopyPresenter.Activity activity = (StgyCopyPresenter.Activity) this.L$0;
            if (activity instanceof StgyCopyPresenter.Activity.TaskDescription) {
                this.this$0.EZpvd();
                final ActivityC51071vgB activityC51071vgB = this.this$0;
                C32866mlf.onEvent$default("CopyBotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vgU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BotCopyActivity$addObserver$8.invokeSuspend$lambda$0(activityC51071vgB, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
            } else if (activity instanceof StgyCopyPresenter.Activity.ActionBar) {
                C51141vhS.Activity activity2 = C51141vhS.Companion;
                ActivityC51071vgB activityC51071vgB2 = this.this$0;
                activity2.EZpvd(activityC51071vgB2.valueOf, activityC51071vgB2.djBIcL).show(this.this$0.getSupportFragmentManager(), "BotCopyActivity");
                this.this$0.OLrzqt("use");
            } else {
                if (!(activity instanceof StgyCopyPresenter.Activity.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.dismissLoading();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ActivityC51071vgB activityC51071vgB, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "custom_parameters", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", activityC51071vgB.djBIcL, false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", activityC51071vgB.gEmmrt(), false, 4, null);
        return Unit.INSTANCE;
    }
}
