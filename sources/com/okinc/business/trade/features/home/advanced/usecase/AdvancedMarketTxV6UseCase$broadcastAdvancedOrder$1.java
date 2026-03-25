package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.SignedInfo;
import com.okinc.business.dex.trade.core.domain.model.UnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC43419rot;
import o.C25389ivm;
import o.C28196kSl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.gYX;
import o.kRB;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ NewCallbackBean $newCallbackBean;
    final /* synthetic */ boolean $teeSilentSignEnabled;
    final /* synthetic */ V6CalldataResponseData $transactionData;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ kRB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1(kRB krb, NewCallbackBean newCallbackBean, V6CalldataResponseData v6CalldataResponseData, String str, boolean z, Continuation<? super AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = krb;
        this.$newCallbackBean = newCallbackBean;
        this.$transactionData = v6CalldataResponseData;
        this.$chainId = str;
        this.$teeSilentSignEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1 advancedMarketTxV6UseCase$broadcastAdvancedOrder$1 = new AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1(this.this$0, this.$newCallbackBean, this.$transactionData, this.$chainId, this.$teeSilentSignEnabled, continuation);
        advancedMarketTxV6UseCase$broadcastAdvancedOrder$1.L$0 = obj;
        return advancedMarketTxV6UseCase$broadcastAdvancedOrder$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<String>> producerScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        gYX gyxKWHzl;
        Map<String, String> headerMap;
        boolean z;
        Object objOLrzqt;
        ProducerScope producerScope;
        int i;
        V6CallData v6CallData;
        List<String> list;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Object objEZpvd;
        ProducerScope producerScope2;
        List<NewCallbackBean.DexCallbackBean.SignedInfo> signedInfoList;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope3 = (ProducerScope) this.L$0;
            pUU.EZpvd("AdvancedMarketTxV6UseCase", "broadcastAdvancedOrder: starting broadcast...");
            gyxKWHzl = this.this$0.KWHzl();
            headerMap = this.$newCallbackBean.getHeaderMap();
            NewCallbackBean.DexCallbackBean dexCallbackBean = this.$newCallbackBean.getDexCallbackBean();
            String nonce = dexCallbackBean != null ? dexCallbackBean.getNonce() : null;
            String str4 = nonce == null ? "" : nonce;
            String orderId = this.$transactionData.getOrderId();
            String str5 = orderId == null ? "" : orderId;
            String strCopydefault = this.this$0.EZpvd().copydefault();
            List<String> listOLrzqt = this.this$0.OLrzqt(this.$newCallbackBean, this.$transactionData);
            V6CallData callData = this.$transactionData.getCallData();
            C28196kSl c28196kSlEZpvd = this.this$0.EZpvd();
            long jValueOf = C33129mqd.valueOf(this.$chainId);
            this.L$0 = producerScope3;
            this.L$1 = gyxKWHzl;
            this.L$2 = headerMap;
            this.L$3 = str4;
            this.L$4 = str5;
            this.L$5 = strCopydefault;
            this.L$6 = listOLrzqt;
            this.L$7 = callData;
            z = true;
            this.I$0 = 1;
            this.label = 1;
            objOLrzqt = c28196kSlEZpvd.OLrzqt(jValueOf, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope3;
            i = 1;
            v6CallData = callData;
            list = listOLrzqt;
            str = strCopydefault;
            str2 = str5;
            str3 = str4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope2 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
                pUU.EZpvd("AdvancedMarketTxV6UseCase", "broadcastAdvancedOrder: apiResult=" + abstractC43419rot);
                V6BroadcastResponseData v6BroadcastResponseData = (V6BroadcastResponseData) C25389ivm.KWHzl(abstractC43419rot);
                pUU.EZpvd("AdvancedMarketTxV6UseCase", "broadcastAdvancedOrder: success, orderId=" + v6BroadcastResponseData.getOrderId());
                producerScope2.mo5769trySendJP2dKIU(new ResponseData(0, null, null, null, v6BroadcastResponseData.getOrderId(), null, 46, null));
                return Unit.INSTANCE;
            }
            i = this.I$0;
            V6CallData v6CallData2 = (V6CallData) this.L$7;
            List<String> list2 = (List) this.L$6;
            String str6 = (String) this.L$5;
            String str7 = (String) this.L$4;
            String str8 = (String) this.L$3;
            headerMap = (Map) this.L$2;
            gyxKWHzl = (gYX) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            z = true;
            v6CallData = v6CallData2;
            list = list2;
            str = str6;
            str2 = str7;
            str3 = str8;
            objOLrzqt = obj;
        }
        String str9 = (String) objOLrzqt;
        String str10 = str9 == null ? "" : str9;
        NewCallbackBean.DexCallbackBean dexCallbackBean2 = this.$newCallbackBean.getDexCallbackBean();
        if (dexCallbackBean2 == null || (signedInfoList = dexCallbackBean2.getSignedInfoList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(signedInfoList, 10));
            for (NewCallbackBean.DexCallbackBean.SignedInfo signedInfo : signedInfoList) {
                arrayList.add(new SignedInfo(signedInfo.getTransactionHash(), signedInfo.getSignedTx()));
            }
        }
        V6BroadcastRequest v6BroadcastRequest = new V6BroadcastRequest(i != 0 ? z : false, str3, str2, str, list, v6CallData, str10, arrayList == null ? yDY.AhwBna() : arrayList, new UnsignedData(this.$transactionData.getUnsignedTx(), this.$transactionData.getHasReferralCommission()), new V6BroadcastAccountInfo(this.this$0.AEQbTJ().OLrzqt(), this.$teeSilentSignEnabled));
        this.L$0 = producerScope;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.label = 2;
        objEZpvd = gyxKWHzl.EZpvd(headerMap, v6BroadcastRequest, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        producerScope2 = producerScope;
        AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) objEZpvd;
        pUU.EZpvd("AdvancedMarketTxV6UseCase", "broadcastAdvancedOrder: apiResult=" + abstractC43419rot2);
        V6BroadcastResponseData v6BroadcastResponseData2 = (V6BroadcastResponseData) C25389ivm.KWHzl(abstractC43419rot2);
        pUU.EZpvd("AdvancedMarketTxV6UseCase", "broadcastAdvancedOrder: success, orderId=" + v6BroadcastResponseData2.getOrderId());
        producerScope2.mo5769trySendJP2dKIU(new ResponseData(0, null, null, null, v6BroadcastResponseData2.getOrderId(), null, 46, null));
        return Unit.INSTANCE;
    }
}
