package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC19946gVe;
import o.gWI;
import o.gWK;
import o.gWR;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingStrategiesVM$fetchStrategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cursor;
    final /* synthetic */ boolean $isHistory;
    final /* synthetic */ boolean $loadMore;
    final /* synthetic */ boolean $refresh;
    Object L$0;
    int label;
    final /* synthetic */ CopyTradingStrategiesVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingStrategiesVM$fetchStrategies$1(CopyTradingStrategiesVM copyTradingStrategiesVM, boolean z, boolean z2, boolean z3, String str, Continuation<? super CopyTradingStrategiesVM$fetchStrategies$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingStrategiesVM;
        this.$refresh = z;
        this.$loadMore = z2;
        this.$isHistory = z3;
        this.$cursor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingStrategiesVM$fetchStrategies$1(this.this$0, this.$refresh, this.$loadMore, this.$isHistory, this.$cursor, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingStrategiesVM$fetchStrategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        gWR gwr;
        Object objM8607getStrategiesBWLJW6A$default;
        gWR gwr2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gwr = (gWR) this.this$0.OLrzqt.getValue();
            boolean z = gwr instanceof gWR.TaskDescription;
            boolean z2 = (gwr instanceof gWR.ActionBar) && (((gWR.ActionBar) gwr).KWHzl() instanceof InterfaceC19946gVe.StateListAnimator);
            if (this.$refresh) {
                this.this$0.OLrzqt.setValue(new gWR.Activity((z || z2) ? false : true));
            } else if (this.$loadMore) {
                this.this$0.OLrzqt.setValue(gWR.Application.KWHzl);
            }
            if (!this.$isHistory) {
                gWI gwi = this.this$0.AEQbTJ;
                this.L$0 = gwr;
                this.label = 1;
                obj = gwi.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            gWK gwk = this.this$0.AYXKKw;
            String str = this.$cursor;
            boolean z3 = this.$isHistory;
            this.L$0 = gwr;
            this.label = 2;
            objM8607getStrategiesBWLJW6A$default = gWK.m8607getStrategiesBWLJW6A$default(gwk, str, z3, null, this, 4, null);
            if (objM8607getStrategiesBWLJW6A$default != objCopydefault) {
                return objCopydefault;
            }
            gwr2 = gwr;
            CopyTradingStrategiesVM copyTradingStrategiesVM = this.this$0;
            boolean z4 = this.$refresh;
            boolean z5 = this.$isHistory;
            boolean z6 = this.$loadMore;
            if (Result.m7384isSuccessimpl(objM8607getStrategiesBWLJW6A$default)) {
            }
            CopyTradingStrategiesVM copyTradingStrategiesVM2 = this.this$0;
            boolean z7 = this.$isHistory;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8607getStrategiesBWLJW6A$default);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gWR gwr3 = (gWR) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8607getStrategiesBWLJW6A$default = ((Result) obj).m7386unboximpl();
            gwr2 = gwr3;
            CopyTradingStrategiesVM copyTradingStrategiesVM3 = this.this$0;
            boolean z42 = this.$refresh;
            boolean z52 = this.$isHistory;
            boolean z62 = this.$loadMore;
            if (Result.m7384isSuccessimpl(objM8607getStrategiesBWLJW6A$default)) {
                copyTradingStrategiesVM3.KWHzl((OrderListPagerResult) objM8607getStrategiesBWLJW6A$default, z42, z52, z62, gwr2);
            }
            CopyTradingStrategiesVM copyTradingStrategiesVM22 = this.this$0;
            boolean z72 = this.$isHistory;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8607getStrategiesBWLJW6A$default);
            if (thM7380exceptionOrNullimpl != null) {
                copyTradingStrategiesVM22.copydefault(thM7380exceptionOrNullimpl, z72);
            }
            return Unit.INSTANCE;
        }
        gwr = (gWR) this.L$0;
        C56391yDq.AEQbTJ(obj);
        if (C33129mqd.valueOf(C56443yFo.AEQbTJ(((Number) obj).intValue()), C56443yFo.AEQbTJ(0))) {
            this.this$0.OLrzqt.setValue(new gWR.TaskDescription(yDY.AhwBna(), false, 2, null));
            return Unit.INSTANCE;
        }
        gWK gwk2 = this.this$0.AYXKKw;
        String str2 = this.$cursor;
        boolean z32 = this.$isHistory;
        this.L$0 = gwr;
        this.label = 2;
        objM8607getStrategiesBWLJW6A$default = gWK.m8607getStrategiesBWLJW6A$default(gwk2, str2, z32, null, this, 4, null);
        if (objM8607getStrategiesBWLJW6A$default != objCopydefault) {
        }
    }
}
