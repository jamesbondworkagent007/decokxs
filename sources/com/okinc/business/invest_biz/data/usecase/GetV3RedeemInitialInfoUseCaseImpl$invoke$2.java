package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.iCI;
import o.iDF;
import o.iFS;

/* JADX INFO: loaded from: classes6.dex */
public final class GetV3RedeemInitialInfoUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InitialInfoModel.RedeemInitialInfo>, Object> {
    final /* synthetic */ TransactionConfig $config;
    int label;
    final /* synthetic */ iFS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetV3RedeemInitialInfoUseCaseImpl$invoke$2(iFS ifs, TransactionConfig transactionConfig, Continuation<? super GetV3RedeemInitialInfoUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = ifs;
        this.$config = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GetV3RedeemInitialInfoUseCaseImpl$invoke$2(this.this$0, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InitialInfoModel.RedeemInitialInfo> continuation) {
        return ((GetV3RedeemInitialInfoUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        String tokenAddress;
        Object objAwait;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iFS ifs = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ifs.KWHzl.gEmmrt().KWHzl();
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    Result.Application application3 = Result.Companion;
                    objKWHzl = iCI.OLrzqt((InvestUniv3RedeemInitialInfo) objKWHzl);
                }
                Object objM7377constructorimpl2 = Result.m7377constructorimpl(objKWHzl);
                C56391yDq.AEQbTJ(objM7377constructorimpl2);
                return objM7377constructorimpl2;
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
        iDF idf = this.this$0.AEQbTJ;
        String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        long jIsConnected = this.$config.isConnected();
        String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(this.$config.copydefault()) : null;
        String str = strEZpvd == null ? "" : strEZpvd;
        InvestInputData investInputData = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(this.$config.valueOf());
        InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq = new InvestUniv3RedeemInitialReq(jIsConnected, str, (investInputData == null || (tokenAddress = investInputData.getTokenAddress()) == null) ? "" : tokenAddress, this.$config.AwvSrB(), this.$config.ejfBZ(), this.$config.values());
        this.label = 2;
        objKWHzl = idf.KWHzl(strDbNXlk, investUniv3RedeemInitialReq, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        Object objM7377constructorimpl22 = Result.m7377constructorimpl(objKWHzl);
        C56391yDq.AEQbTJ(objM7377constructorimpl22);
        return objM7377constructorimpl22;
    }
}
