package com.okinc.business.invest_biz.ui.screens.transaction.usecase;

import android.os.Bundle;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23724iGz;
import o.C26758jiP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24171iXn;
import o.InterfaceC58184ywW;
import o.iGH;

/* JADX INFO: loaded from: classes6.dex */
public final class SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<ResponseData<String>> $emitter;
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ NewCallbackBean $newCallbackBean;
    int label;
    final /* synthetic */ C26758jiP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1(C26758jiP c26758jiP, NewCallbackBean newCallbackBean, InvestTxModel investTxModel, InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW, Continuation<? super SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c26758jiP;
        this.$newCallbackBean = newCallbackBean;
        this.$model = investTxModel;
        this.$emitter = interfaceC58184ywW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1(this.this$0, this.$newCallbackBean, this.$model, this.$emitter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                JsonObject jsonObjectOLrzqt = this.this$0.values.OLrzqt(this.$newCallbackBean, this.$model);
                C23724iGz c23724iGz = this.this$0.valueOf;
                Map<String, String> headerMap = this.$newCallbackBean.getHeaderMap();
                InvestTxModel investTxModel = this.$model;
                this.label = 1;
                Object objKWHzl = c23724iGz.KWHzl(headerMap, jsonObjectOLrzqt, investTxModel, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            C26758jiP c26758jiP = this.this$0;
            InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW = this.$emitter;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                iGH igh = (iGH) objM7386unboximpl;
                InterfaceC24171iXn interfaceC24171iXn = c26758jiP.fetchVPNInfo;
                Bundle bundle = new Bundle();
                bundle.putString("tx_id", igh.KWHzl());
                interfaceC24171iXn.EZpvd(bundle);
                interfaceC58184ywW.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, igh.KWHzl(), null, 46, null));
                c26758jiP.fetchVPNInfo.EZpvd(new InvestTradeManager.TransactionResultExtraData(C56443yFo.AEQbTJ(igh.AEQbTJ()), igh.OLrzqt(), C56443yFo.AEQbTJ(igh.EZpvd())));
                Unit unit = Unit.INSTANCE;
                c26758jiP.AEQbTJ(igh.OLrzqt());
                c26758jiP.OLrzqt(C56443yFo.AEQbTJ(igh.EZpvd()));
                c26758jiP.copydefault(C56443yFo.AEQbTJ(igh.AEQbTJ()));
                interfaceC58184ywW.onComplete();
            }
            InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW2 = this.$emitter;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                interfaceC58184ywW2.onError(thM7380exceptionOrNullimpl);
                interfaceC58184ywW2.onComplete();
            }
        } catch (Throwable th) {
            this.$emitter.onError(th);
            this.$emitter.onComplete();
        }
        return Unit.INSTANCE;
    }
}
