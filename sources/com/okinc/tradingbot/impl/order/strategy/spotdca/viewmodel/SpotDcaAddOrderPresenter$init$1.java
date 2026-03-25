package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceBody;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C43422row;
import o.C53201wgy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderPresenter$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SpotDcaAddOrderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaAddOrderPresenter$init$1(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, Continuation<? super SpotDcaAddOrderPresenter$init$1> continuation) {
        super(2, continuation);
        this.this$0 = spotDcaAddOrderPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotDcaAddOrderPresenter$init$1 spotDcaAddOrderPresenter$init$1 = new SpotDcaAddOrderPresenter$init$1(this.this$0, continuation);
        spotDcaAddOrderPresenter$init$1.L$0 = obj;
        return spotDcaAddOrderPresenter$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDcaAddOrderPresenter$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:14:0x0042, B:22:0x0082, B:25:0x0088, B:27:0x00b3, B:28:0x00b8, B:29:0x00c8, B:17:0x004f, B:19:0x0057), top: B:53:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter;
        SpotDcaAddOrderPresenter.Fragment fragment;
        MutableSharedFlow mutableSharedFlow;
        SpotDcaAddOrderPresenter.TaskDescription.Activity activity;
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter2;
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter3;
        C53201wgy.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            spotDcaAddOrderPresenter3 = this.this$0;
            Result.Application application3 = Result.Companion;
            TacticsData tacticsDataGEmmrt = spotDcaAddOrderPresenter3.gEmmrt();
            if (tacticsDataGEmmrt != null) {
                C53201wgy c53201wgy = spotDcaAddOrderPresenter3.gEmmrt;
                C53201wgy.Activity activity2 = new C53201wgy.Activity(new AvailableBalanceBody(tacticsDataGEmmrt.getAlgoId()), tacticsDataGEmmrt.getInstId(), spotDcaAddOrderPresenter3.isConnected().AEQbTJ("spot_dca"));
                this.L$0 = spotDcaAddOrderPresenter3;
                this.label = 1;
                obj = c53201wgy.KWHzl(activity2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                application = null;
                if (application != null) {
                    spotDcaAddOrderPresenter3.AEQbTJ.postValue(application.OLrzqt());
                    spotDcaAddOrderPresenter3.copydefault.postValue(application.AEQbTJ());
                    spotDcaAddOrderPresenter3.OLrzqt.postValue(application.EZpvd());
                    SpotDcaAddOrderPresenter.Fragment fragmentKWHzl = spotDcaAddOrderPresenter3.fJNWhG.KWHzl(application);
                    if (fragmentKWHzl != null) {
                        objM7377constructorimpl = Result.m7377constructorimpl(fragmentKWHzl);
                        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter4 = this.this$0;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            MutableSharedFlow mutableSharedFlow2 = spotDcaAddOrderPresenter4.EZpvd;
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator stateListAnimator = new SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator(message);
                            this.L$0 = objM7377constructorimpl;
                            this.label = 2;
                            if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        obj2 = objM7377constructorimpl;
                        spotDcaAddOrderPresenter = this.this$0;
                        if (Result.m7384isSuccessimpl(obj2)) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                throw new OKServerException(0, C43422row.OLrzqt(), null, null, 13, null);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Object obj3 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = obj3;
                    spotDcaAddOrderPresenter = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        fragment = (SpotDcaAddOrderPresenter.Fragment) obj2;
                        MutableStateFlow mutableStateFlow = spotDcaAddOrderPresenter.KWHzl;
                        this.L$0 = obj2;
                        this.L$1 = spotDcaAddOrderPresenter;
                        this.L$2 = fragment;
                        this.label = 3;
                        if (mutableStateFlow.emit(fragment, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow = spotDcaAddOrderPresenter.EZpvd;
                        activity = new SpotDcaAddOrderPresenter.TaskDescription.Activity(fragment.EZpvd());
                        this.L$0 = obj2;
                        this.L$1 = spotDcaAddOrderPresenter;
                        this.L$2 = null;
                        this.label = 4;
                        if (mutableSharedFlow.emit(activity, this) != objCopydefault) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    spotDcaAddOrderPresenter2 = (SpotDcaAddOrderPresenter) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    spotDcaAddOrderPresenter2.AEQbTJ();
                    return Unit.INSTANCE;
                }
                fragment = (SpotDcaAddOrderPresenter.Fragment) this.L$2;
                SpotDcaAddOrderPresenter spotDcaAddOrderPresenter5 = (SpotDcaAddOrderPresenter) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                spotDcaAddOrderPresenter = spotDcaAddOrderPresenter5;
                mutableSharedFlow = spotDcaAddOrderPresenter.EZpvd;
                activity = new SpotDcaAddOrderPresenter.TaskDescription.Activity(fragment.EZpvd());
                this.L$0 = obj2;
                this.L$1 = spotDcaAddOrderPresenter;
                this.L$2 = null;
                this.label = 4;
                if (mutableSharedFlow.emit(activity, this) != objCopydefault) {
                    return objCopydefault;
                }
                spotDcaAddOrderPresenter2 = spotDcaAddOrderPresenter;
                spotDcaAddOrderPresenter2.AEQbTJ();
                return Unit.INSTANCE;
            }
            spotDcaAddOrderPresenter3 = (SpotDcaAddOrderPresenter) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        application = (C53201wgy.Application) obj;
        if (application != null) {
        }
        throw new OKServerException(0, C43422row.OLrzqt(), null, null, 13, null);
    }
}
