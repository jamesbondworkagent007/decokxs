package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.error.OrderParamJsonParsingError;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28315kWw {
    public final InterfaceC28273kVh EZpvd;

    @yCM
    public C28315kWw(@NotNull InterfaceC28273kVh interfaceC28273kVh) {
        Intrinsics.checkNotNullParameter(interfaceC28273kVh, "");
        this.EZpvd = interfaceC28273kVh;
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        return C23220huC.OLrzqt(new InterfaceC58187ywZ() { // from class: o.kWz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C28315kWw.copydefault(this.EZpvd, map, swapApproveInfoReq, interfaceC58184ywW);
            }
        });
    }

    public static final void copydefault(C28315kWw c28315kWw, java.util.Map map, SwapApproveInfoReq swapApproveInfoReq, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXAEQbTJ = c28315kWw.EZpvd.AEQbTJ(map, swapApproveInfoReq);
        final Function1 function1 = new Function1() { // from class: o.kWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28315kWw.EZpvd(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ApproveResultInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C28315kWw.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.kWu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28315kWw.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C28315kWw.copydefault(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<JsonObject, java.lang.String> EZpvd(@NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String asString = "";
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            if (asJsonObject == null || asString.length() == 0) {
                OLrzqt(KWHzl(str, str2) + "walletTxData=" + asJsonObject + "->transactionHash=" + asString + "->");
            }
        } catch (java.lang.Exception e) {
            OLrzqt(KWHzl(str, str2));
            C23310hvn.e$default(C23310hvn.copydefault, "TradeConfirmHandle", android.util.Log.getStackTraceString(e), null, 4, null);
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }

    public final void OLrzqt(java.lang.String str) {
        C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str));
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return "dex wallet json parsing exception:fromChainId=" + str + "->fromAddress=" + str2 + "->->->";
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
            int code = responseData.getCode();
            ApproveResultInfo approveResultInfo = (ApproveResultInfo) responseData.getData();
            interfaceC58184ywW.onNext(ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, approveResultInfo != null ? approveResultInfo.getSaveApproveTxResult() : null, null, 44, null));
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getErrorMsg()));
            ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, responseData.getErrorMsg(), null, null, null, null, 61, null);
        }
        return Unit.INSTANCE;
    }
}
