package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

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
import o.C53202wgz;
import o.C54536xML;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xMV;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ StrategyOrderType $orderType;
    final /* synthetic */ String $price;
    final /* synthetic */ TacticsData $tacticsData;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SpotDcaAddOrderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, TacticsData tacticsData, String str, String str2, StrategyOrderType strategyOrderType, Continuation<? super SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1> continuation) {
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
        SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1 spotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1 = new SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1(this.this$0, this.$tacticsData, this.$price, this.$amount, this.$orderType, continuation);
        spotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1.L$0 = obj;
        return spotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter;
        Throwable th;
        String safeString$default;
        SpotDcaAddOrderPresenter.TaskDescription.Application application;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        MutableStateFlow mutableStateFlow;
        Object value;
        SpotDcaAddOrderPresenter.Fragment fragment;
        SpotDcaAddOrderPresenter.Fragment fragmentM7101copypoI0buE$default;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotDcaAddOrderPresenter spotDcaAddOrderPresenter2 = this.this$0;
            TacticsData tacticsData = this.$tacticsData;
            String str = this.$price;
            String str2 = this.$amount;
            StrategyOrderType strategyOrderType = this.$orderType;
            Result.Application application3 = Result.Companion;
            C53202wgz c53202wgz = spotDcaAddOrderPresenter2.djBIcL;
            C53202wgz.Activity activity = new C53202wgz.Activity(tacticsData.getAlgoId(), str, str2, strategyOrderType.getValue());
            this.label = 1;
            objKWHzl = c53202wgz.KWHzl(activity, this);
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
                th = (Throwable) this.L$2;
                spotDcaAddOrderPresenter = (SpotDcaAddOrderPresenter) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object obj3 = obj2;
                mutableStateFlow = spotDcaAddOrderPresenter.KWHzl;
                do {
                    value = mutableStateFlow.getValue();
                    fragment = (SpotDcaAddOrderPresenter.Fragment) value;
                    if (fragment == null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fragmentM7101copypoI0buE$default = SpotDcaAddOrderPresenter.Fragment.m7101copypoI0buE$default(fragment, null, null, 0, null, false, null, null, null, null, null, null, null, null, new SpotDcaAddOrderPresenter.ActionBar.Application(message), null, 24575, null);
                    } else {
                        fragmentM7101copypoI0buE$default = null;
                    }
                } while (!mutableStateFlow.compareAndSet(value, fragmentM7101copypoI0buE$default));
                obj2 = obj3;
                SpotDcaAddOrderPresenter spotDcaAddOrderPresenter3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    C53202wgz.ActionBar actionBar = (C53202wgz.ActionBar) obj2;
                    if (C33129mqd.AEQbTJ(C33129mqd.EZpvd(actionBar.OLrzqt().getDiffAmt()), C33129mqd.copydefault(C56443yFo.AEQbTJ(0)))) {
                        MutableSharedFlow mutableSharedFlow = spotDcaAddOrderPresenter3.EZpvd;
                        xMV xmvKWHzl = spotDcaAddOrderPresenter3.isConnected().KWHzl();
                        if (xmvKWHzl == null) {
                            safeString$default = null;
                            application = new SpotDcaAddOrderPresenter.TaskDescription.Application(safeString$default != null ? safeString$default : "", spotDcaAddOrderPresenter3.isConnected().copydefault("spot_dca"));
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (mutableSharedFlow.emit(application, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            String diffAmt = actionBar.OLrzqt().getDiffAmt();
                            if (diffAmt == null) {
                                diffAmt = "";
                            }
                            C54536xML c54536xMLCopydefault2 = xmvKWHzl.copydefault(diffAmt);
                            if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null) {
                                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                            }
                            application = new SpotDcaAddOrderPresenter.TaskDescription.Application(safeString$default != null ? safeString$default : "", spotDcaAddOrderPresenter3.isConnected().copydefault("spot_dca"));
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (mutableSharedFlow.emit(application, this) == objCopydefault) {
                            }
                        }
                    } else {
                        spotDcaAddOrderPresenter3.copydefault(SpotDcaAddOrderPresenter.Activity.Fragment.OLrzqt);
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((C53202wgz.ActionBar) objKWHzl);
        obj2 = objM7377constructorimpl;
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter4 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow mutableSharedFlow2 = spotDcaAddOrderPresenter4.EZpvd;
            String message2 = thM7380exceptionOrNullimpl.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator stateListAnimator = new SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator(message2);
            this.L$0 = obj2;
            this.L$1 = spotDcaAddOrderPresenter4;
            this.L$2 = thM7380exceptionOrNullimpl;
            this.label = 2;
            if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
            spotDcaAddOrderPresenter = spotDcaAddOrderPresenter4;
            th = thM7380exceptionOrNullimpl;
            Object obj32 = obj2;
            mutableStateFlow = spotDcaAddOrderPresenter.KWHzl;
            do {
                value = mutableStateFlow.getValue();
                fragment = (SpotDcaAddOrderPresenter.Fragment) value;
                if (fragment == null) {
                }
            } while (!mutableStateFlow.compareAndSet(value, fragmentM7101copypoI0buE$default));
            obj2 = obj32;
        }
        SpotDcaAddOrderPresenter spotDcaAddOrderPresenter32 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        return Unit.INSTANCE;
    }
}
