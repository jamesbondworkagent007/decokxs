package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.io.Serializable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.InterfaceC9741bbM;
import o.iDF;
import o.iFE;

/* JADX INFO: loaded from: classes6.dex */
public final class CheckRedeemAllowedUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super Serializable>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ TransactionConfig $config;
    final /* synthetic */ int $orderType;
    int label;
    final /* synthetic */ iFE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckRedeemAllowedUseCaseImpl$invoke$2(TransactionConfig transactionConfig, int i, iFE ife, String str, Continuation<? super CheckRedeemAllowedUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.$config = transactionConfig;
        this.$orderType = i;
        this.this$0 = ife;
        this.$amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheckRedeemAllowedUseCaseImpl$invoke$2(this.$config, this.$orderType, this.this$0, this.$amount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Serializable> continuation) {
        return ((CheckRedeemAllowedUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strDbNXlk;
        Object objAEQbTJ;
        String strEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$config.AxsJAY() && !InvestTradeManager.OLrzqt.AEQbTJ(this.$orderType)) {
                InterfaceC9741bbM interfaceC9741bbMGEmmrt = this.this$0.OLrzqt.gEmmrt();
                InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.this$0.AEQbTJ();
                if (interfaceC9738bbJAEQbTJ == null || (strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk()) == null) {
                    strDbNXlk = "";
                }
                InterfaceC9738bbJ interfaceC9738bbJOLrzqt = interfaceC9741bbMGEmmrt.OLrzqt(strDbNXlk);
                String str = (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(this.$config.copydefault())) == null) ? "" : strEZpvd;
                if (!this.$config.gHZMYf()) {
                    iDF idfEZpvd = this.this$0.AEQbTJ.EZpvd(this.$config);
                    long jIsConnected = this.$config.isConnected();
                    String str2 = this.$amount;
                    Long lFARcdN = this.$config.fARcdN();
                    this.label = 1;
                    objAEQbTJ = idfEZpvd.AEQbTJ(jIsConnected, str, str2, lFARcdN, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return C56443yFo.KWHzl(true);
                }
            } else {
                return C56443yFo.KWHzl(true);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objAEQbTJ)) {
            return Result.m7380exceptionOrNullimpl(objAEQbTJ) != null ? C56443yFo.KWHzl(false) : Result.m7376boximpl(objAEQbTJ);
        }
        ResponseData responseData = (ResponseData) objAEQbTJ;
        if (responseData.getCode() == 10003 || responseData.getCode() == 10006) {
            throw new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null);
        }
        return C56443yFo.KWHzl(true);
    }
}
