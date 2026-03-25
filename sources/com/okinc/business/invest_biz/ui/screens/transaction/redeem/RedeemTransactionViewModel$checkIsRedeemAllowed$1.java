package com.okinc.business.invest_biz.ui.screens.transaction.redeem;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24177iXt;
import o.C24181iXx;
import o.C25493ixk;
import o.C26714jhY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23693iFv;
import o.iCP;
import o.iXB;
import o.iXC;
import o.iXD;

/* JADX INFO: loaded from: classes6.dex */
public final class RedeemTransactionViewModel$checkIsRedeemAllowed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C26714jhY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemTransactionViewModel$checkIsRedeemAllowed$1(C26714jhY c26714jhY, Continuation<? super RedeemTransactionViewModel$checkIsRedeemAllowed$1> continuation) {
        super(2, continuation);
        this.this$0 = c26714jhY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedeemTransactionViewModel$checkIsRedeemAllowed$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedeemTransactionViewModel$checkIsRedeemAllowed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strEZpvd;
        Object objM7386unboximpl;
        C24177iXt c24177iXtCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.this$0.AhwBna().getValue());
            if (ixcAEQbTJ == null) {
                throw new IllegalArgumentException("Transaction step is required");
            }
            if (ixcAEQbTJ.EZpvd().DbNXlk()) {
                strEZpvd = ixcAEQbTJ.EZpvd().KWHzl();
            } else {
                iXB value = this.this$0.fetchVPNInfo().getValue();
                strEZpvd = value != null ? value.EZpvd() : null;
            }
            InterfaceC23693iFv interfaceC23693iFv = this.this$0.AxsJAY;
            TransactionConfig transactionConfig = this.this$0.QKVWgx;
            if (strEZpvd == null) {
                strEZpvd = "0";
            }
            InvestTxModel investTxModelOLrzqt = ixcAEQbTJ.OLrzqt();
            int orderType = investTxModelOLrzqt != null ? investTxModelOLrzqt.getOrderType() : 0;
            this.label = 1;
            Object objCopydefault2 = interfaceC23693iFv.copydefault(transactionConfig, strEZpvd, orderType, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        C26714jhY c26714jhY = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            super/*o.iXm*/.fJNWhG();
        }
        C26714jhY c26714jhY2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                OKServerException oKServerException = (OKServerException) thM7380exceptionOrNullimpl;
                if (oKServerException.getCode() == 10003 || oKServerException.getCode() == 10006) {
                    C24177iXt c24177iXtKWHzl = iCP.KWHzl();
                    c24177iXtCopydefault = c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : DisplayText.Companion.fromStringResource$default(DisplayText.Companion, C25493ixk.FragmentManager.v, null, 2, null), (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0);
                } else {
                    c24177iXtCopydefault = null;
                }
                c26714jhY2.copydefault(new iXD.TaskDescription(thM7380exceptionOrNullimpl, null, 2, null), c24177iXtCopydefault);
            }
        }
        return Unit.INSTANCE;
    }
}
