package com.okinc.business.trade.features.home.ui.autosell;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.trade.features.home.ui.viewmodel.TradeAutoSellStrategyViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30505lcS;
import o.ActivityC30497lcK;
import o.C30488lcB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC30497lcK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1(ActivityC30497lcK activityC30497lcK, Continuation<? super TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC30497lcK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModelValues = this.this$0.values();
            this.label = 1;
            obj = tradeAutoSellStrategyViewModelValues.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C30488lcB.Activity activity = C30488lcB.Companion;
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            AbstractC30505lcS value = this.this$0.values().AEQbTJ().getValue();
            AbstractC30505lcS.TaskDescription taskDescription = value instanceof AbstractC30505lcS.TaskDescription ? (AbstractC30505lcS.TaskDescription) value : null;
            activity.OLrzqt(supportFragmentManager, taskDescription != null ? taskDescription.KWHzl() : null);
        }
        return Unit.INSTANCE;
    }
}
