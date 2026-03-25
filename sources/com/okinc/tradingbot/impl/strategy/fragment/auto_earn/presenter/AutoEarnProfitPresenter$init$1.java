package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C43422row;
import o.C54143wym;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnProfitPresenter$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AutoEarnProfitPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnProfitPresenter$init$1(AutoEarnProfitPresenter autoEarnProfitPresenter, Continuation<? super AutoEarnProfitPresenter$init$1> continuation) {
        super(2, continuation);
        this.this$0 = autoEarnProfitPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoEarnProfitPresenter$init$1 autoEarnProfitPresenter$init$1 = new AutoEarnProfitPresenter$init$1(this.this$0, continuation);
        autoEarnProfitPresenter$init$1.L$0 = obj;
        return autoEarnProfitPresenter$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoEarnProfitPresenter$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        AutoEarnProfitPresenter autoEarnProfitPresenter;
        AutoEarnProfitPresenter autoEarnProfitPresenter2;
        C54143wym.Activity activity;
        AutoEarnProfitPresenter.TaskDescription taskDescriptionKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            autoEarnProfitPresenter2 = this.this$0;
            Result.Application application2 = Result.Companion;
            TacticsData tacticsDataValueOf = autoEarnProfitPresenter2.valueOf();
            if (tacticsDataValueOf == null) {
                activity = null;
                if (activity == null && (taskDescriptionKWHzl = autoEarnProfitPresenter2.ejfBZ.KWHzl(activity)) != null) {
                    objM7377constructorimpl = Result.m7377constructorimpl(taskDescriptionKWHzl);
                    obj2 = objM7377constructorimpl;
                    AutoEarnProfitPresenter autoEarnProfitPresenter3 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                        MutableStateFlow mutableStateFlow = autoEarnProfitPresenter3.EZpvd;
                        this.L$0 = obj2;
                        this.label = 2;
                        if (mutableStateFlow.emit(null, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    AutoEarnProfitPresenter autoEarnProfitPresenter4 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    return Unit.INSTANCE;
                }
                throw new OKServerException(0, C43422row.OLrzqt(), null, null, 13, null);
            }
            C54143wym c54143wym = autoEarnProfitPresenter2.AYXKKw;
            C54143wym.StateListAnimator stateListAnimator = new C54143wym.StateListAnimator(tacticsDataValueOf.getAlgoId(), autoEarnProfitPresenter2.DbNXlk(), "");
            this.L$0 = autoEarnProfitPresenter2;
            this.label = 1;
            obj = c54143wym.KWHzl(stateListAnimator, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoEarnProfitPresenter = (AutoEarnProfitPresenter) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    AutoEarnProfitPresenter.refresh$default(autoEarnProfitPresenter, null, 1, null);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                AutoEarnProfitPresenter autoEarnProfitPresenter42 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    AutoEarnProfitPresenter.TaskDescription taskDescription = (AutoEarnProfitPresenter.TaskDescription) obj2;
                    AutoEarnOverView autoEarnOverView = (AutoEarnOverView) CollectionsKt___CollectionsKt.firstOrNull(taskDescription.KWHzl());
                    autoEarnProfitPresenter42.EZpvd(C33129mqd.gEmmrt(autoEarnOverView != null ? autoEarnOverView.getCcy() : null));
                    MutableStateFlow mutableStateFlow2 = autoEarnProfitPresenter42.EZpvd;
                    this.L$0 = obj2;
                    this.L$1 = autoEarnProfitPresenter42;
                    this.label = 3;
                    if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    autoEarnProfitPresenter = autoEarnProfitPresenter42;
                    AutoEarnProfitPresenter.refresh$default(autoEarnProfitPresenter, null, 1, null);
                }
                return Unit.INSTANCE;
            }
            autoEarnProfitPresenter2 = (AutoEarnProfitPresenter) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        activity = (C54143wym.Activity) obj;
        if (activity == null) {
        }
        throw new OKServerException(0, C43422row.OLrzqt(), null, null, 13, null);
    }
}
