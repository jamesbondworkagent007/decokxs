package com.okinc.business.dexui.api.serviceimpl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastResponse;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataResponse;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsPageView;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$startBridgeRedeem$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.ActivityC22009hUn;
import o.C22380heK;
import o.C23274hvD;
import o.C23285hvO;
import o.C24258iaT;
import o.C24260iaV;
import o.C31200lpY;
import o.C32866mlf;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC22601hiT;
import o.InterfaceC58229yxO;
import o.InterfaceC9738bbJ;
import o.InterfaceC9854bdT;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeApiImpl$startBridgeRedeem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $openOrderDetailsAfterBroadcast;
    final /* synthetic */ String $orderId;
    final /* synthetic */ Function1<BridgeRedeemStatus, Unit> $redeemCallBack;
    final /* synthetic */ String $toChainId;
    int label;
    final /* synthetic */ C23285hvO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.BridgeRedeemStatus, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DexTradeApiImpl$startBridgeRedeem$1(String str, C23285hvO c23285hvO, String str2, Function1<? super BridgeRedeemStatus, Unit> function1, Context context, boolean z, Continuation<? super DexTradeApiImpl$startBridgeRedeem$1> continuation) {
        super(2, continuation);
        this.$orderId = str;
        this.this$0 = c23285hvO;
        this.$toChainId = str2;
        this.$redeemCallBack = function1;
        this.$context = context;
        this.$openOrderDetailsAfterBroadcast = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexTradeApiImpl$startBridgeRedeem$1(this.$orderId, this.this$0, this.$toChainId, this.$redeemCallBack, this.$context, this.$openOrderDetailsAfterBroadcast, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexTradeApiImpl$startBridgeRedeem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwaitFirstOrNull;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC58185ywX<BridgeRedeemCallDataResponse> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault("default_trade").OLrzqt().OLrzqt(new BridgeRedeemCallDataReq(this.$orderId, this.this$0.EZpvd("default_trade").KWHzl(this.$toChainId), null, null, 12, null));
                this.label = 1;
                objAwaitFirstOrNull = AwaitKt.awaitFirstOrNull(abstractC58185ywXOLrzqt, this);
                if (objAwaitFirstOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAwaitFirstOrNull = obj;
            }
            BridgeRedeemCallDataResponse bridgeRedeemCallDataResponse = (BridgeRedeemCallDataResponse) objAwaitFirstOrNull;
            if (bridgeRedeemCallDataResponse != null) {
                String strCopydefault = C22380heK.OLrzqt.copydefault("default_trade").fARcdN().copydefault(Long.parseLong(this.$toChainId)) ? this.this$0.copydefault(bridgeRedeemCallDataResponse.getCallData()) : bridgeRedeemCallDataResponse.getUnsignedTx();
                InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
                if (interfaceC9854bdT != null) {
                    final Context context = this.$context;
                    C23285hvO c23285hvO = this.this$0;
                    String str = this.$toChainId;
                    final String str2 = this.$orderId;
                    final Function1<BridgeRedeemStatus, Unit> function1 = this.$redeemCallBack;
                    final boolean z = this.$openOrderDetailsAfterBroadcast;
                    InterfaceC9738bbJ interfaceC9738bbJValueOf = c23285hvO.EZpvd("default_trade").valueOf();
                    String strDbNXlk = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null;
                    if (strDbNXlk == null) {
                        strDbNXlk = "";
                    }
                    InterfaceC9854bdT.Application.startContractInteraction$default(interfaceC9854bdT, context, new DappInteractionArgs(strDbNXlk, null, str, null, strCopydefault, null, "dex", C56443yFo.AEQbTJ(3), null, null, null, null, false, false, str2, true, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(1), "", null, null, null, null, -201375990, null), new Function1() { // from class: o.hwu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$1(function1, (android.os.Bundle) obj2);
                        }
                    }, new Function1() { // from class: o.hwv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8(str2, function1, z, context, (NewCallbackBean) obj2);
                        }
                    }, null, 16, null);
                }
            } else {
                C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.invokespecialaGOrKO, 0, 1, (Object) null);
                this.$redeemCallBack.invoke(BridgeRedeemStatus.RedeemCallDataFailed);
            }
        } catch (Exception unused) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.invokespecialaGOrKO, 0, 1, (Object) null);
            this.$redeemCallBack.invoke(BridgeRedeemStatus.RedeemCallDataFailed);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9$lambda$1(Function1 function1, Bundle bundle) {
        if (bundle == null) {
            C32866mlf.onEvent$default("DEXSwap_ContractInteraction_Action_Click", (TrackChannel[]) null, new Function1() { // from class: o.hwt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$1$lambda$0((EventParamsList) obj);
                }
            }, 1, (Object) null);
            function1.invoke(BridgeRedeemStatus.RedeemCancelledOrFailed);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9$lambda$1$lambda$0(EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_claim_sign", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.REJECT.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC58185ywX invokeSuspend$lambda$9$lambda$8(final String str, final Function1 function1, final boolean z, final Context context, NewCallbackBean newCallbackBean) {
        C32866mlf.onEvent$default("DEXSwap_ContractInteraction_Action_Click", (TrackChannel[]) null, new Function1() { // from class: o.hwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8$lambda$2((EventParamsList) obj);
            }
        }, 1, (Object) null);
        C24260iaV c24260iaVCopydefault = C24258iaT.copydefault(newCallbackBean.getBody());
        InterfaceC22601hiT interfaceC22601hiTOLrzqt = C22380heK.OLrzqt.copydefault("default_trade").OLrzqt();
        String strOLrzqt = c24260iaVCopydefault.OLrzqt();
        String strEZpvd = c24260iaVCopydefault.EZpvd();
        JsonObject jsonObjectKWHzl = c24260iaVCopydefault.KWHzl();
        String str2 = newCallbackBean.getHeaderMap().get("sign");
        AbstractC58185ywX<BridgeRedeemBroadcastResponse> abstractC58185ywXAEQbTJ = interfaceC22601hiTOLrzqt.AEQbTJ(new BridgeRedeemBroadcastReq(str, strOLrzqt, strEZpvd, jsonObjectKWHzl, str2 == null ? "" : str2, null, null, null, 224, null));
        final Function1 function12 = new Function1() { // from class: o.hwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8$lambda$4(function1, z, context, str, (BridgeRedeemBroadcastResponse) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8$lambda$5(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.hwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8$lambda$6(function1, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ2.djBIcL(new InterfaceC58229yxO() { // from class: o.hwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DexTradeApiImpl$startBridgeRedeem$1.invokeSuspend$lambda$9$lambda$8$lambda$7(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9$lambda$8$lambda$2(EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_claim_sign", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.CONFIRM.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData invokeSuspend$lambda$9$lambda$8$lambda$5(Function1 function1, Object obj) {
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData invokeSuspend$lambda$9$lambda$8$lambda$4(Function1 function1, boolean z, Context context, String str, BridgeRedeemBroadcastResponse bridgeRedeemBroadcastResponse) {
        function1.invoke(BridgeRedeemStatus.BroadcastSuccess);
        if (z) {
            Intent intent = new Intent(context, (Class<?>) ActivityC22009hUn.class);
            C31200lpY.EZpvd(intent, "default_trade");
            intent.putExtra(OtcExtraKeys.ORDER_ID, str);
            intent.putExtra("source", DexHistoryDetailsPageView.Source.TRANSACTION_HISTORY.getValue());
            context.startActivity(intent);
        }
        return new ResponseData(0, bridgeRedeemBroadcastResponse.getOrderId(), null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData invokeSuspend$lambda$9$lambda$8$lambda$7(Function1 function1, Object obj) {
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData invokeSuspend$lambda$9$lambda$8$lambda$6(Function1 function1, Throwable th) {
        function1.invoke(BridgeRedeemStatus.BroadcastFailed);
        return new ResponseData(-1, "", null, null, null, null, 60, null);
    }
}
