package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
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
import o.C23621iDd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.iCI;
import o.iDF;
import o.iFK;

/* JADX INFO: loaded from: classes6.dex */
public final class GetRedeemInitialInfoUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InitialInfoModel.RedeemInitialInfo>, Object> {
    final /* synthetic */ TransactionConfig $config;
    Object L$0;
    int label;
    final /* synthetic */ iFK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRedeemInitialInfoUseCaseImpl$invoke$2(TransactionConfig transactionConfig, iFK ifk, Continuation<? super GetRedeemInitialInfoUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.$config = transactionConfig;
        this.this$0 = ifk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GetRedeemInitialInfoUseCaseImpl$invoke$2(this.$config, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InitialInfoModel.RedeemInitialInfo> continuation) {
        return ((GetRedeemInitialInfoUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C23621iDd c23621iDd;
        Object objAwait;
        C23621iDd c23621iDd2;
        Object objM7377constructorimpl;
        Integer numAEQbTJ;
        Object objKWHzl;
        C23621iDd c23621iDd3;
        String tokenAddress;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                c23621iDd = new C23621iDd(this.$config.isConnected(), this.$config.AwvSrB(), false, 4, null);
                InitialInfoModel.RedeemInitialInfo redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) this.this$0.KWHzl.get(c23621iDd);
                if (redeemInitialInfo != null) {
                    return redeemInitialInfo;
                }
                iFK ifk = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ifk.copydefault.gEmmrt().KWHzl();
                    this.L$0 = c23621iDd;
                    this.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    c23621iDd2 = c23621iDd;
                } catch (Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c23621iDd2 = c23621iDd;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c23621iDd3 = (C23621iDd) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    iFK ifk2 = this.this$0;
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        Result.Application application3 = Result.Companion;
                        objKWHzl = iCI.KWHzl((InvestRedeemInitialInfo) objKWHzl);
                        ifk2.KWHzl.put(c23621iDd3, objKWHzl);
                    }
                    Object objM7377constructorimpl2 = Result.m7377constructorimpl(objKWHzl);
                    C56391yDq.AEQbTJ(objM7377constructorimpl2);
                    return objM7377constructorimpl2;
                }
                c23621iDd2 = (C23621iDd) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAwait = obj;
                } catch (Throwable th2) {
                    th = th2;
                    c23621iDd = c23621iDd2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c23621iDd2 = c23621iDd;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
            String strEZpvd = null;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
            iDF idfEZpvd = this.this$0.AEQbTJ.EZpvd(this.$config);
            String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            long jIsConnected = this.$config.isConnected();
            String strEZpvd2 = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(this.$config.copydefault()) : null;
            String str = strEZpvd2 == null ? "" : strEZpvd2;
            InvestInputData investInputData = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(this.$config.valueOf());
            String str2 = (investInputData == null || (tokenAddress = investInputData.getTokenAddress()) == null) ? "" : tokenAddress;
            boolean zAwvSrB = this.$config.AwvSrB();
            int iAkhnZx = this.$config.AkhnZx();
            Integer numFJNWhG = this.$config.fJNWhG();
            if (numFJNWhG != null) {
                int iIntValue = numFJNWhG.intValue();
                numAEQbTJ = iIntValue == -1 ? null : C56443yFo.AEQbTJ(iIntValue);
            } else {
                numAEQbTJ = null;
            }
            if (this.$config.fIwbmz() == 14 && interfaceC9738bbJ != null) {
                strEZpvd = interfaceC9738bbJ.EZpvd(interfaceC9738bbJ.EZpvd(this.$config.copydefault()));
            }
            InvestRedeemInitialReq investRedeemInitialReq = new InvestRedeemInitialReq(jIsConnected, str, str2, zAwvSrB, iAkhnZx, numAEQbTJ, strEZpvd, this.$config.ejfBZ());
            this.L$0 = c23621iDd2;
            this.label = 2;
            Object objEZpvd = idfEZpvd.EZpvd(strDbNXlk, investRedeemInitialReq, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objKWHzl = objEZpvd;
            c23621iDd3 = c23621iDd2;
            iFK ifk22 = this.this$0;
            if (Result.m7384isSuccessimpl(objKWHzl)) {
            }
            Object objM7377constructorimpl22 = Result.m7377constructorimpl(objKWHzl);
            C56391yDq.AEQbTJ(objM7377constructorimpl22);
            return objM7377constructorimpl22;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
