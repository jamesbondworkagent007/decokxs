package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import com.okinc.business.invest_biz.data.logic.ws.bean.InvestNotify;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import o.C24204iYt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iDL;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardViewModel$triggerRefreshPlatformList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $selectedChain;
    int label;
    final /* synthetic */ C24204iYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$triggerRefreshPlatformList$1(C24204iYt c24204iYt, long j, Continuation<? super DashboardViewModel$triggerRefreshPlatformList$1> continuation) {
        super(2, continuation);
        this.this$0 = c24204iYt;
        this.$selectedChain = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardViewModel$triggerRefreshPlatformList$1(this.this$0, this.$selectedChain, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardViewModel$triggerRefreshPlatformList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: all -> 0x0012, TRY_ENTER, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:28:0x007c, B:32:0x0089, B:25:0x0064), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objM7377constructorimpl;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objEZpvd = C56391yDq.EZpvd(th);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDL idl = this.this$0.AkhnZx;
            this.label = 1;
            objCopydefault = idl.copydefault(this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Intrinsics.copydefault(obj);
                if (((InvestNotify) obj).getNotifyType() == 1) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                C24204iYt c24204iYt = this.this$0;
                long j = this.$selectedChain;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    ((Boolean) objM7377constructorimpl).booleanValue();
                    c24204iYt.AEQbTJ(j);
                }
                C24204iYt c24204iYt2 = this.this$0;
                long j2 = this.$selectedChain;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    c24204iYt2.AEQbTJ(j2);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            try {
                Result.Application application2 = Result.Companion;
                objEZpvd = Result.m7377constructorimpl(C56443yFo.KWHzl(!((Boolean) objCopydefault).booleanValue()));
            } catch (Throwable th2) {
                Result.Application application3 = Result.Companion;
                objCopydefault = C56391yDq.EZpvd(th2);
                objEZpvd = Result.m7377constructorimpl(objCopydefault);
            }
            C24204iYt c24204iYt3 = this.this$0;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
                Result.Application application4 = Result.Companion;
                ((Boolean) objEZpvd).booleanValue();
                DashboardViewModel$triggerRefreshPlatformList$1$2$1 dashboardViewModel$triggerRefreshPlatformList$1$2$1 = new DashboardViewModel$triggerRefreshPlatformList$1$2$1(c24204iYt3, null);
                this.label = 2;
                obj = TimeoutKt.withTimeoutOrNull(2000L, dashboardViewModel$triggerRefreshPlatformList$1$2$1, this);
                if (obj == objCopydefault2) {
                    return objCopydefault2;
                }
                Intrinsics.copydefault(obj);
                if (((InvestNotify) obj).getNotifyType() == 1) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
        } else {
            objEZpvd = Result.m7377constructorimpl(objCopydefault);
            C24204iYt c24204iYt32 = this.this$0;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
        }
        C24204iYt c24204iYt4 = this.this$0;
        long j3 = this.$selectedChain;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        C24204iYt c24204iYt22 = this.this$0;
        long j22 = this.$selectedChain;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
