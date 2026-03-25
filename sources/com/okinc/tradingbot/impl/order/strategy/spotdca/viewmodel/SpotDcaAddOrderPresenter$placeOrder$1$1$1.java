package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.tradingbot.impl.order.strategy.data.StrategyOrderType;
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
import o.C33129mqd;
import o.C53200wgx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderPresenter$placeOrder$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ StrategyOrderType $orderType;
    final /* synthetic */ String $price;
    final /* synthetic */ TacticsData $tacticsData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpotDcaAddOrderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaAddOrderPresenter$placeOrder$1$1$1(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, TacticsData tacticsData, String str, String str2, StrategyOrderType strategyOrderType, Continuation<? super SpotDcaAddOrderPresenter$placeOrder$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = spotDcaAddOrderPresenter;
        this.$tacticsData = tacticsData;
        this.$price = str;
        this.$amount = str2;
        this.$orderType = strategyOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotDcaAddOrderPresenter$placeOrder$1$1$1 spotDcaAddOrderPresenter$placeOrder$1$1$1 = new SpotDcaAddOrderPresenter$placeOrder$1$1$1(this.this$0, this.$tacticsData, this.$price, this.$amount, this.$orderType, continuation);
        spotDcaAddOrderPresenter$placeOrder$1$1$1.L$0 = obj;
        return spotDcaAddOrderPresenter$placeOrder$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDcaAddOrderPresenter$placeOrder$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        SpotDcaAddOrderPresenter.Fragment fragmentM7101copypoI0buE$default;
        Object value2;
        SpotDcaAddOrderPresenter.Fragment fragment;
        Object value3;
        SpotDcaAddOrderPresenter.Fragment fragment2;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotDcaAddOrderPresenter spotDcaAddOrderPresenter = this.this$0;
            TacticsData tacticsData = this.$tacticsData;
            String str = this.$price;
            String str2 = this.$amount;
            StrategyOrderType strategyOrderType = this.$orderType;
            Result.Application application2 = Result.Companion;
            C53200wgx c53200wgx = spotDcaAddOrderPresenter.values;
            C53200wgx.Application application3 = new C53200wgx.Application(tacticsData.getAlgoId(), str, str2, strategyOrderType.getValue());
            this.label = 1;
            objKWHzl = c53200wgx.KWHzl(application3, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                SpotDcaAddOrderPresenter spotDcaAddOrderPresenter2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    MutableSharedFlow mutableSharedFlow = spotDcaAddOrderPresenter2.EZpvd;
                    SpotDcaAddOrderPresenter.TaskDescription.ActionBar actionBar = SpotDcaAddOrderPresenter.TaskDescription.ActionBar.EZpvd;
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((C53200wgx.StateListAnimator) objKWHzl);
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            OKServerException oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
            String strGEmmrt = C33129mqd.gEmmrt(oKServerException != null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null);
            if (SpotDcaAddOrderPresenter.ActionBar.InterfaceC0653ActionBar.Application.Companion.KWHzl().contains(strGEmmrt)) {
                MutableStateFlow mutableStateFlow = spotDcaAddOrderPresenter3.KWHzl;
                do {
                    value3 = mutableStateFlow.getValue();
                    fragment2 = (SpotDcaAddOrderPresenter.Fragment) value3;
                } while (!mutableStateFlow.compareAndSet(value3, fragment2 != null ? SpotDcaAddOrderPresenter.Fragment.m7101copypoI0buE$default(fragment2, null, null, 0, null, false, null, null, null, null, null, null, new SpotDcaAddOrderPresenter.ActionBar.InterfaceC0653ActionBar.Application(thM7380exceptionOrNullimpl.getMessage()), null, null, null, 18431, null) : null));
            } else if (SpotDcaAddOrderPresenter.ActionBar.Activity.C0655Activity.Companion.EZpvd().contains(strGEmmrt)) {
                MutableStateFlow mutableStateFlow2 = spotDcaAddOrderPresenter3.KWHzl;
                do {
                    value2 = mutableStateFlow2.getValue();
                    fragment = (SpotDcaAddOrderPresenter.Fragment) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, fragment != null ? SpotDcaAddOrderPresenter.Fragment.m7101copypoI0buE$default(fragment, null, null, 0, null, false, null, null, null, null, null, null, null, new SpotDcaAddOrderPresenter.ActionBar.Activity.C0655Activity(thM7380exceptionOrNullimpl.getMessage()), null, null, 18431, null) : null));
            } else {
                MutableStateFlow mutableStateFlow3 = spotDcaAddOrderPresenter3.KWHzl;
                do {
                    value = mutableStateFlow3.getValue();
                    SpotDcaAddOrderPresenter.Fragment fragment3 = (SpotDcaAddOrderPresenter.Fragment) value;
                    if (fragment3 != null) {
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fragmentM7101copypoI0buE$default = SpotDcaAddOrderPresenter.Fragment.m7101copypoI0buE$default(fragment3, null, null, 0, null, false, null, null, null, null, null, null, null, null, new SpotDcaAddOrderPresenter.ActionBar.Application(message), null, 18431, null);
                    } else {
                        fragmentM7101copypoI0buE$default = null;
                    }
                } while (!mutableStateFlow3.compareAndSet(value, fragmentM7101copypoI0buE$default));
            }
            MutableSharedFlow mutableSharedFlow2 = spotDcaAddOrderPresenter3.EZpvd;
            String message2 = thM7380exceptionOrNullimpl.getMessage();
            SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator stateListAnimator = new SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator(message2 != null ? message2 : "");
            this.L$0 = objM7377constructorimpl;
            this.label = 2;
            if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter22 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        return Unit.INSTANCE;
    }
}
