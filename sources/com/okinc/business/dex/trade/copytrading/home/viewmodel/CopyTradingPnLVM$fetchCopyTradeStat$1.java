package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C30565ldZ;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.gWJ;
import o.gWU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingPnLVM$fetchCopyTradeStat$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ String $strategyOrderId;
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingPnLVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingPnLVM$fetchCopyTradeStat$1(boolean z, CopyTradingPnLVM copyTradingPnLVM, String str, Continuation<? super CopyTradingPnLVM$fetchCopyTradeStat$1> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.this$0 = copyTradingPnLVM;
        this.$strategyOrderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingPnLVM$fetchCopyTradeStat$1(this.$forceRefresh, this.this$0, this.$strategyOrderId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingPnLVM$fetchCopyTradeStat$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$forceRefresh) {
                MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                gWU.TaskDescription taskDescription = gWU.TaskDescription.OLrzqt;
                this.label = 1;
                if (mutableStateFlow.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    CopyTradingPnLVM copyTradingPnLVM = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = copyTradingPnLVM.copydefault;
                        gWU.Application application = new gWU.Application(C30565ldZ.AEQbTJ(thM7380exceptionOrNullimpl));
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableStateFlow2.emit(application, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                CopyTradingPnLVM copyTradingPnLVM2 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    CopyTradingPnLResponse copyTradingPnLResponse = (CopyTradingPnLResponse) obj2;
                    String strGEmmrt = C33129mqd.gEmmrt(copyTradingPnLResponse.getPnlInfo().getTotalPnl().getPnLUsdValue());
                    MutableStateFlow mutableStateFlow3 = copyTradingPnLVM2.copydefault;
                    gWU.Activity activity = new gWU.Activity(strGEmmrt, copyTradingPnLResponse);
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableStateFlow3.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                CopyTradingPnLVM copyTradingPnLVM3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        gWJ gwj = this.this$0.KWHzl;
        String str = this.$strategyOrderId;
        CopyTradeStatRequest.TimeRange timeRange = CopyTradeStatRequest.TimeRange.LastOneYear;
        this.label = 2;
        objKWHzl = gwj.KWHzl(str, timeRange, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objKWHzl;
        CopyTradingPnLVM copyTradingPnLVM22 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        CopyTradingPnLVM copyTradingPnLVM32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
