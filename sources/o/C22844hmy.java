package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.ApproveDataParam;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.BridgeApproveInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MultiApproveInfoParam;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.error.OrderParamJsonParsingError;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22844hmy {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final AbstractC23101hrq AEQbTJ;
    public java.lang.Object EZpvd;
    public final java.lang.String copydefault;

    public C22844hmy(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.copydefault = str;
        this.AEQbTJ = abstractC23101hrq;
        this.EZpvd = new java.lang.Object();
    }

    /* JADX INFO: renamed from: o.hmy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hmy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Type inference failed for r12v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC23101hrq abstractC23101hrq = this.AEQbTJ;
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = EZpvd(jsonObject);
        if (pairEZpvd.getFirst() == null || pairEZpvd.getSecond().length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-1, null, null, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 54, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strKWHzl = c22380heK.copydefault(abstractC23101hrq.ffGIBT()).fARcdN().KWHzl(abstractC23101hrq.QUSxYX().AEQbTJ());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getOriginContractAddress() : null;
        java.lang.String str3 = originContractAddress == null ? "" : originContractAddress;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        java.lang.String originContractAddress2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getOriginContractAddress() : null;
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXAEQbTJ = c22380heK.copydefault(abstractC23101hrq.ffGIBT()).DbNXlk().AEQbTJ(map, new SwapApproveInfoReq(new ApproveDataParam(abstractC23101hrq.QUSxYX().AEQbTJ(), strKWHzl, str3, originContractAddress2 == null ? "" : originContractAddress2, abstractC23101hrq.uzCIH()), new MultiApproveInfoParam(str, abstractC23101hrq.QUSxYX().AEQbTJ(), pairEZpvd.getSecond(), pairEZpvd.getFirst(), str2)));
        final Function1 function1 = new Function1() { // from class: o.hmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22844hmy.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22844hmy.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        ApproveResultInfo approveResultInfo = (ApproveResultInfo) responseData.getData();
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, approveResultInfo != null ? approveResultInfo.getSaveApproveTxResult() : null, null, 44, null);
    }

    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C22873hna c22873hnaQUSxYX = this.AEQbTJ.QUSxYX();
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = EZpvd(jsonObject);
        if (pairEZpvd.getFirst() == null || pairEZpvd.getSecond().length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-1, null, null, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 54, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strKWHzl = c22380heK.copydefault(this.copydefault).fARcdN().KWHzl(c22873hnaQUSxYX.AEQbTJ());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c22873hnaQUSxYX.copydefault();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getOriginContractAddress() : null;
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXCopydefault = c22380heK.copydefault(this.copydefault).DbNXlk().copydefault(map, new BridgeApproveInfoReq(new ApproveDataParam(c22873hnaQUSxYX.AEQbTJ(), strKWHzl, originContractAddress == null ? "" : originContractAddress, (java.lang.String) null, this.AEQbTJ.uzCIH(), 8, (DefaultConstructorMarker) null), new MultiApproveInfoParam(str, c22873hnaQUSxYX.AEQbTJ(), pairEZpvd.getSecond(), pairEZpvd.getFirst(), str2)));
        final Function1 function1 = new Function1() { // from class: o.hmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22844hmy.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22844hmy.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        ApproveResultInfo approveResultInfo = (ApproveResultInfo) responseData.getData();
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, approveResultInfo != null ? approveResultInfo.getSaveApproveTxResult() : null, null, 44, null);
    }

    public final kotlin.Pair<JsonObject, java.lang.String> EZpvd(JsonObject jsonObject) {
        java.lang.String asString = "";
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            if (asJsonObject == null || asString.length() == 0) {
                OLrzqt(AEQbTJ() + "walletTxData=" + asJsonObject + "->transactionHash=" + asString + "->");
            }
        } catch (java.lang.Exception e) {
            OLrzqt(AEQbTJ());
            C23310hvn.e$default(C23310hvn.copydefault, "TradeConfirmHandle", android.util.Log.getStackTraceString(e), null, 4, null);
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }

    public final void OLrzqt(java.lang.String str) {
        C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str));
    }

    public final java.lang.String AEQbTJ() {
        InterfaceC22824hme interfaceC22824hmeZLjUOn = this.AEQbTJ.zLjUOn();
        DexMultiTokenInfoBean value = interfaceC22824hmeZLjUOn.KWHzl().getValue();
        DexMultiTokenInfoBean value2 = interfaceC22824hmeZLjUOn.EZpvd().getValue();
        if (value == null || value2 == null) {
            return "dex wallet json parsing exception:";
        }
        return "dex wallet json parsing exception:fromChainId=" + value.getChainId() + "->fromAddress=" + value.getOriginContractAddress() + "->toChainId=" + value2.getChainId() + "->toAddress=" + value2.getOriginContractAddress() + "->";
    }

    public final void copydefault() {
        C33050mpD.OLrzqt(this.EZpvd);
    }
}
