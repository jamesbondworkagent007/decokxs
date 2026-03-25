package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.ApproveDataParam;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
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

/* JADX INFO: loaded from: classes6.dex */
public final class hLB {
    public final java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.Object KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public final C22495hgT valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.copydefault = str;
    }

    public hLB(@NotNull java.lang.String str, @NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.AEQbTJ = str;
        this.valueOf = c22495hgT;
        this.KWHzl = new java.lang.Object();
        this.EZpvd = "";
    }

    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String originContractAddress;
        java.lang.String originContractAddress2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C22495hgT c22495hgT = this.valueOf;
        kotlin.Pair<JsonObject, java.lang.String> pairCopydefault = copydefault(jsonObject);
        if (pairCopydefault.getFirst() == null || pairCopydefault.getSecond().length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-1, null, null, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 54, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strKWHzl = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).fARcdN().KWHzl(c22495hgT.iwGUEr());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ();
        java.lang.String str3 = (dexMultiTokenInfoBeanOcIXYQ == null || (originContractAddress2 = dexMultiTokenInfoBeanOcIXYQ.getOriginContractAddress()) == null) ? "" : originContractAddress2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq();
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXEZpvd = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).gEmmrt().EZpvd(map, new SwapApproveInfoReq(new ApproveDataParam(c22495hgT.iwGUEr(), strKWHzl, str3, (dexMultiTokenInfoBeanQKudOq == null || (originContractAddress = dexMultiTokenInfoBeanQKudOq.getOriginContractAddress()) == null) ? "" : originContractAddress, (java.lang.String) null, 16, (DefaultConstructorMarker) null), new MultiApproveInfoParam(str, c22495hgT.iwGUEr(), pairCopydefault.getSecond(), pairCopydefault.getFirst(), str2)));
        final Function1 function1 = new Function1() { // from class: o.hLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hLB.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hLA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return hLB.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        ApproveResultInfo approveResultInfo = (ApproveResultInfo) responseData.getData();
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, approveResultInfo != null ? approveResultInfo.getSaveApproveTxResult() : null, null, 44, null);
    }

    public final kotlin.Pair<JsonObject, java.lang.String> copydefault(JsonObject jsonObject) {
        java.lang.String asString = "";
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            if (asJsonObject == null || asString.length() == 0) {
                KWHzl(EZpvd() + "walletTxData=" + asJsonObject + "->transactionHash=" + asString + "->");
            }
        } catch (java.lang.Exception e) {
            KWHzl(EZpvd());
            C23310hvn.e$default(C23310hvn.copydefault, "TradeConfirmHandle", android.util.Log.getStackTraceString(e), null, 4, null);
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }

    public final void KWHzl(java.lang.String str) {
        C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str));
    }

    public final java.lang.String EZpvd() {
        InterfaceC22425hfC interfaceC22425hfCAYXKKw = C22380heK.OLrzqt.copydefault(this.AEQbTJ).AYXKKw();
        DexMultiTokenInfoBean value = interfaceC22425hfCAYXKKw.AEQbTJ().getValue();
        java.lang.String chainId = value != null ? value.getChainId() : null;
        DexMultiTokenInfoBean value2 = interfaceC22425hfCAYXKKw.AEQbTJ().getValue();
        java.lang.String originContractAddress = value2 != null ? value2.getOriginContractAddress() : null;
        DexMultiTokenInfoBean value3 = interfaceC22425hfCAYXKKw.KWHzl().getValue();
        java.lang.String chainId2 = value3 != null ? value3.getChainId() : null;
        DexMultiTokenInfoBean value4 = interfaceC22425hfCAYXKKw.KWHzl().getValue();
        return "dex wallet json parsing exception:fromChainId=" + chainId + "->fromAddress=" + originContractAddress + "->toChainId=" + chainId2 + "->toAddress=" + (value4 != null ? value4.getOriginContractAddress() : null) + "->";
    }

    public final void KWHzl() {
        C33050mpD.OLrzqt(this.KWHzl);
    }
}
