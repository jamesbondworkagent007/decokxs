package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.order.domain.model.BoostInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C19757gOe;
import o.C19758gOf;
import o.C28227kTp;
import o.C30457lbX;
import o.C30516lcd;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$fetchAndAddBoostData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $fromTokenInfo;
    final /* synthetic */ boolean $isLimitOrder;
    final /* synthetic */ AdvancedQuoteAndCallData $quote;
    final /* synthetic */ DexMultiTokenInfoBean $toTokenInfo;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellDelegate$fetchAndAddBoostData$1(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, AdvancedQuoteAndCallData advancedQuoteAndCallData, boolean z, C28227kTp c28227kTp, Continuation<? super AdvancedAutoSellDelegate$fetchAndAddBoostData$1> continuation) {
        super(2, continuation);
        this.$fromTokenInfo = dexMultiTokenInfoBean;
        this.$toTokenInfo = dexMultiTokenInfoBean2;
        this.$quote = advancedQuoteAndCallData;
        this.$isLimitOrder = z;
        this.this$0 = c28227kTp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$fetchAndAddBoostData$1(this.$fromTokenInfo, this.$toTokenInfo, this.$quote, this.$isLimitOrder, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$fetchAndAddBoostData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BoostInfo boostInfo;
        BoostEstimateVolumeResponse boostEstimateVolumeResponse;
        String boostVolume;
        Object objM7386unboximpl;
        Object objM7386unboximpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String strValueOf = null;
        try {
            try {
            } catch (Exception e) {
                pUU.AEQbTJ("AutoSellDelegate", "Failed to fetch limit order boost data", e);
                boostInfo = null;
            }
        } catch (Exception e2) {
            pUU.AEQbTJ("AutoSellDelegate", "Failed to fetch boost data", e2);
            boostEstimateVolumeResponse = null;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$fromTokenInfo;
            if (dexMultiTokenInfoBean == null) {
                return Unit.INSTANCE;
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$toTokenInfo;
            if (dexMultiTokenInfoBean2 == null) {
                return Unit.INSTANCE;
            }
            String chainId = dexMultiTokenInfoBean.getChainId();
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(chainId);
            if (intOrNull == null) {
                return Unit.INSTANCE;
            }
            int iIntValue = intOrNull.intValue();
            String originContractAddress = dexMultiTokenInfoBean.getOriginContractAddress();
            String originContractAddress2 = dexMultiTokenInfoBean2.getOriginContractAddress();
            String strGEmmrt = this.$quote.gEmmrt();
            if (this.$isLimitOrder) {
                String strZLjUOn = this.$quote.zLjUOn();
                ServiceFeeInfo serviceFeeInfoWlaJM = this.$quote.wlaJM();
                C19757gOe c19757gOe = this.this$0.AYXKKw;
                this.label = 1;
                Object objAEQbTJ = c19757gOe.AEQbTJ(iIntValue, originContractAddress, originContractAddress2, strGEmmrt, strZLjUOn, serviceFeeInfoWlaJM, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl2 = objAEQbTJ;
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                }
                boostInfo = (BoostInfo) objM7386unboximpl2;
                if (boostInfo == null) {
                }
                strValueOf = String.valueOf(boostInfo != null ? boostInfo.getWeighted() : null);
            } else {
                String strZLjUOn2 = this.$quote.zLjUOn();
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(TradeMode.AdvancedMode.getType()));
                String strKWHzl = this.this$0.AkhnZx.KWHzl(chainId);
                String strOLrzqt = this.this$0.isConnected.OLrzqt(chainId);
                C19757gOe c19757gOe2 = this.this$0.AYXKKw;
                this.label = 2;
                Object objAEQbTJ2 = c19757gOe2.AEQbTJ(iIntValue, originContractAddress, originContractAddress2, strGEmmrt, strZLjUOn2, strGEmmrt2, strKWHzl, strOLrzqt, this);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objAEQbTJ2;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                boostEstimateVolumeResponse = (BoostEstimateVolumeResponse) objM7386unboximpl;
                if (boostEstimateVolumeResponse == null) {
                }
                if (boostEstimateVolumeResponse != null) {
                }
            }
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            boostEstimateVolumeResponse = (BoostEstimateVolumeResponse) objM7386unboximpl;
            boostVolume = boostEstimateVolumeResponse == null ? boostEstimateVolumeResponse.getBoostVolume() : null;
            if (boostEstimateVolumeResponse != null) {
                strValueOf = boostEstimateVolumeResponse.getBoostWeight();
            }
        } else {
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                objM7386unboximpl2 = null;
            }
            boostInfo = (BoostInfo) objM7386unboximpl2;
            boostVolume = boostInfo == null ? boostInfo.getBoostVolume() : null;
            strValueOf = String.valueOf(boostInfo != null ? boostInfo.getWeighted() : null);
        }
        C30516lcd c30516lcdCopydefault = C19758gOf.AEQbTJ.copydefault(boostVolume, strValueOf);
        C30457lbX c30457lbX = (C30457lbX) this.this$0.KWHzl.getValue();
        List<C30516lcd> listEZpvd = c30457lbX.EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listEZpvd) {
            if (((C30516lcd) obj2).OLrzqt() != ConfirmOrderTag.BOOST) {
                arrayList.add(obj2);
            }
        }
        this.this$0.KWHzl.setValue(c30457lbX.copydefault((8159 & 1) != 0 ? c30457lbX.EZpvd : null, (8159 & 2) != 0 ? c30457lbX.OLrzqt : null, (8159 & 4) != 0 ? c30457lbX.AYXKKw : null, (8159 & 8) != 0 ? c30457lbX.DbNXlk : null, (8159 & 16) != 0 ? c30457lbX.djBIcL : null, (8159 & 32) != 0 ? c30457lbX.AEQbTJ : CollectionsKt___CollectionsKt.copydefault((Collection<? extends C30516lcd>) arrayList, c30516lcdCopydefault), (8159 & 64) != 0 ? c30457lbX.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbX.KWHzl : null, (8159 & 256) != 0 ? c30457lbX.gEmmrt : null, (8159 & 512) != 0 ? c30457lbX.AhwBna : null, (8159 & 1024) != 0 ? c30457lbX.copydefault : null, (8159 & 2048) != 0 ? c30457lbX.values : null, (8159 & 4096) != 0 ? c30457lbX.valueOf : null));
        return Unit.INSTANCE;
    }
}
