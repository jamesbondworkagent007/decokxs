package com.okinc.business.invest_biz.data.logic;

import android.content.Context;
import android.os.Bundle;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestTradeManager$submitTransaction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonObject $callData;
    final /* synthetic */ Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>> $callDataCallback;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $dataSentToWallet;
    final /* synthetic */ yHO<String, String, Continuation<? super Boolean>, Object> $gasFeeCheck;
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ yHO<Integer, Bundle, InvestTradeManager.TransactionResultExtraData, Unit> $nextStep;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<? super java.lang.Integer, ? super android.os.Bundle, ? super com.okinc.business.invest_biz.data.logic.InvestTradeManager$TransactionResultExtraData, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestTradeManager$submitTransaction$2$1(String str, Context context, InvestTxModel investTxModel, yHO<? super Integer, ? super Bundle, ? super InvestTradeManager.TransactionResultExtraData, Unit> yho, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1, yHO<? super String, ? super String, ? super Continuation<? super Boolean>, ? extends Object> yho2, JsonObject jsonObject, Continuation<? super InvestTradeManager$submitTransaction$2$1> continuation) {
        super(2, continuation);
        this.$dataSentToWallet = str;
        this.$context = context;
        this.$model = investTxModel;
        this.$nextStep = yho;
        this.$callDataCallback = function1;
        this.$gasFeeCheck = yho2;
        this.$callData = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTradeManager$submitTransaction$2$1(this.$dataSentToWallet, this.$context, this.$model, this.$nextStep, this.$callDataCallback, this.$gasFeeCheck, this.$callData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestTradeManager$submitTransaction$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1 investTradeManager$submitTransaction$2$1$isGasFeeOk$1 = new InvestTradeManager$submitTransaction$2$1$isGasFeeOk$1(this.$gasFeeCheck, this.$callData, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, investTradeManager$submitTransaction$2$1$isGasFeeOk$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InvestTradeManager.OLrzqt.AEQbTJ(this.$dataSentToWallet, this.$context, this.$model, this.$nextStep, this.$callDataCallback);
            return Unit.INSTANCE;
        }
        InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
        InvestTradeManager.copydefault = false;
        this.$nextStep.invoke(C56443yFo.AEQbTJ(5), null, new InvestTradeManager.TransactionResultExtraData(null, null, null, 7, null));
        return Unit.INSTANCE;
    }
}
