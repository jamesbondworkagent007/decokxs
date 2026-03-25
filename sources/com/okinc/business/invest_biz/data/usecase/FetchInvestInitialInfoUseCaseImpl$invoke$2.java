package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C23621iDd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23643iDz;
import o.InterfaceC9738bbJ;
import o.iCI;
import o.iDD;
import o.iFF;

/* JADX INFO: loaded from: classes6.dex */
public final class FetchInvestInitialInfoUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InitialInfoModel.InvestInitialInfo>, Object> {
    final /* synthetic */ TransactionConfig $config;
    Object L$0;
    int label;
    final /* synthetic */ iFF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchInvestInitialInfoUseCaseImpl$invoke$2(TransactionConfig transactionConfig, iFF iff, Continuation<? super FetchInvestInitialInfoUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.$config = transactionConfig;
        this.this$0 = iff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FetchInvestInitialInfoUseCaseImpl$invoke$2(this.$config, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InitialInfoModel.InvestInitialInfo> continuation) {
        return ((FetchInvestInitialInfoUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0008 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        String strDbNXlk;
        Object objCopydefault;
        ?? r0;
        String strEZpvd;
        Object objCopydefault2 = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r12;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23621iDd c23621iDd = new C23621iDd(this.$config.isConnected(), this.$config.AwvSrB(), false, 4, null);
            InitialInfoModel.InvestInitialInfo investInitialInfo = (InitialInfoModel.InvestInitialInfo) this.this$0.KWHzl.get(c23621iDd);
            if (investInitialInfo != null) {
                return investInitialInfo;
            }
            iFF iff = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = iff.OLrzqt.gEmmrt().KWHzl();
            this.L$0 = c23621iDd;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            r12 = c23621iDd;
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C23621iDd c23621iDd2 = (C23621iDd) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                r0 = c23621iDd2;
                iFF iff2 = this.this$0;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    Result.Application application3 = Result.Companion;
                    objCopydefault = iCI.KWHzl((InvestSubscriptionInfo) objCopydefault);
                    iff2.KWHzl.put(r0, objCopydefault);
                }
                Object objM7377constructorimpl2 = Result.m7377constructorimpl(objCopydefault);
                C56391yDq.AEQbTJ(objM7377constructorimpl2);
                return objM7377constructorimpl2;
            }
            C23621iDd c23621iDd3 = (C23621iDd) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = c23621iDd3;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) obj);
        r1 = r12;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
        String str = "";
        if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        if (interfaceC9738bbJ != null && (strEZpvd = interfaceC9738bbJ.EZpvd(this.$config.copydefault())) != null) {
            str = strEZpvd;
        }
        InterfaceC23643iDz interfaceC23643iDzOLrzqt = this.this$0.copydefault.OLrzqt(this.$config);
        InvestSubscriptionInitialReq investSubscriptionInitialReqEZpvd = iDD.Companion.EZpvd(this.$config, strDbNXlk, str);
        this.L$0 = r1;
        this.label = 2;
        objCopydefault = interfaceC23643iDzOLrzqt.copydefault(investSubscriptionInitialReqEZpvd, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        r0 = r1;
        iFF iff22 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        Object objM7377constructorimpl22 = Result.m7377constructorimpl(objCopydefault);
        C56391yDq.AEQbTJ(objM7377constructorimpl22);
        return objM7377constructorimpl22;
    }
}
