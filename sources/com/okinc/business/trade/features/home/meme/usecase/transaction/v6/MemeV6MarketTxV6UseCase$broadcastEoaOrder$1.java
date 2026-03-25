package com.okinc.business.trade.features.home.meme.usecase.transaction.v6;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.SignedInfo;
import com.okinc.business.dex.trade.core.domain.model.UnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC28328kXi;
import o.AbstractC43419rot;
import o.C23274hvD;
import o.C25389ivm;
import o.C33070mpX;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.gYX;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketTxV6UseCase$broadcastEoaOrder$1 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ NewCallbackBean.DexCallbackBean $dexSignInfo;
    final /* synthetic */ Map<String, String> $headerMap;
    final /* synthetic */ boolean $teeSilentSignEnabled;
    final /* synthetic */ V6CalldataResponseData $transactionData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC28328kXi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketTxV6UseCase$broadcastEoaOrder$1(NewCallbackBean.DexCallbackBean dexCallbackBean, AbstractC28328kXi abstractC28328kXi, Map<String, String> map, V6CalldataResponseData v6CalldataResponseData, String str, boolean z, Continuation<? super MemeV6MarketTxV6UseCase$broadcastEoaOrder$1> continuation) {
        super(2, continuation);
        this.$dexSignInfo = dexCallbackBean;
        this.this$0 = abstractC28328kXi;
        this.$headerMap = map;
        this.$transactionData = v6CalldataResponseData;
        this.$chainId = str;
        this.$teeSilentSignEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeV6MarketTxV6UseCase$broadcastEoaOrder$1 memeV6MarketTxV6UseCase$broadcastEoaOrder$1 = new MemeV6MarketTxV6UseCase$broadcastEoaOrder$1(this.$dexSignInfo, this.this$0, this.$headerMap, this.$transactionData, this.$chainId, this.$teeSilentSignEnabled, continuation);
        memeV6MarketTxV6UseCase$broadcastEoaOrder$1.L$0 = obj;
        return memeV6MarketTxV6UseCase$broadcastEoaOrder$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<String>> producerScope, Continuation<? super Unit> continuation) {
        return ((MemeV6MarketTxV6UseCase$broadcastEoaOrder$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<NewCallbackBean.DexCallbackBean.SignedInfo> signedInfoList;
        List listAhwBna;
        Object objEZpvd;
        ProducerScope producerScope;
        Boolean hasReferralCommission;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        } else {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            NewCallbackBean.DexCallbackBean dexCallbackBean = this.$dexSignInfo;
            if (dexCallbackBean == null || (signedInfoList = dexCallbackBean.getSignedInfoList()) == null || signedInfoList.isEmpty()) {
                throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.hrnhsO), null, null, 13, null);
            }
            gYX gyxEZpvd = this.this$0.EZpvd();
            Map<String, String> map = this.$headerMap;
            List<NewCallbackBean.DexCallbackBean.SignedInfo> signedInfoList2 = this.$dexSignInfo.getSignedInfoList();
            if (signedInfoList2 == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(signedInfoList2, 10));
                for (NewCallbackBean.DexCallbackBean.SignedInfo signedInfo : signedInfoList2) {
                    listAhwBna.add(new SignedInfo(signedInfo.getTransactionHash(), signedInfo.getSignedTx()));
                }
            }
            List list = listAhwBna;
            String nonce = this.$dexSignInfo.getNonce();
            String str = nonce == null ? "" : nonce;
            V6CalldataResponseData v6CalldataResponseData = this.$transactionData;
            String orderId = v6CalldataResponseData != null ? v6CalldataResponseData.getOrderId() : null;
            String str2 = orderId == null ? "" : orderId;
            String strOLrzqt = this.this$0.AhwBna().OLrzqt();
            AbstractC28328kXi abstractC28328kXi = this.this$0;
            NewCallbackBean.DexCallbackBean dexCallbackBean2 = this.$dexSignInfo;
            V6CalldataResponseData v6CalldataResponseData2 = this.$transactionData;
            List<String> listCopydefault = abstractC28328kXi.copydefault(dexCallbackBean2, v6CalldataResponseData2 != null ? v6CalldataResponseData2.getMevConfig() : null);
            V6CalldataResponseData v6CalldataResponseData3 = this.$transactionData;
            V6CallData callData = v6CalldataResponseData3 != null ? v6CalldataResponseData3.getCallData() : null;
            String strCopydefault = this.this$0.AhwBna().copydefault(this.$chainId);
            V6CalldataResponseData v6CalldataResponseData4 = this.$transactionData;
            boolean zBooleanValue = (v6CalldataResponseData4 == null || (hasReferralCommission = v6CalldataResponseData4.getHasReferralCommission()) == null) ? false : hasReferralCommission.booleanValue();
            V6CalldataResponseData v6CalldataResponseData5 = this.$transactionData;
            V6BroadcastRequest v6BroadcastRequest = new V6BroadcastRequest(true, str, str2, strOLrzqt, listCopydefault, callData, strCopydefault, list, new UnsignedData(v6CalldataResponseData5 != null ? v6CalldataResponseData5.getUnsignedTx() : null, C56443yFo.KWHzl(zBooleanValue)), new V6BroadcastAccountInfo(this.this$0.KWHzl().OLrzqt(), this.$teeSilentSignEnabled));
            this.L$0 = producerScope2;
            this.label = 1;
            objEZpvd = gyxEZpvd.EZpvd(map, v6BroadcastRequest, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope2;
        }
        producerScope.mo5769trySendJP2dKIU(new ResponseData(0, null, null, null, ((V6BroadcastResponseData) C25389ivm.KWHzl((AbstractC43419rot) objEZpvd)).getOrderId(), null, 46, null));
        return Unit.INSTANCE;
    }
}
