package o;

import com.okinc.business.defi.dapp.net.DappCategory;
import com.okinc.business.defi.dapp.net.DappChainsReq;
import com.okinc.business.defi.dapp.net.DappCheckUrlLevel;
import com.okinc.business.defi.dapp.net.DappCollectReq;
import com.okinc.business.defi.dapp.net.DappDetailReq;
import com.okinc.business.defi.dapp.net.DappFavouriteRecommendReq;
import com.okinc.business.defi.dapp.net.DappInfoByUrl;
import com.okinc.business.defi.dapp.net.DappIsFavoutitetReq;
import com.okinc.business.defi.dapp.net.DappcheckSearchHistoryUrlIsBlack;
import com.okinc.business.defi.dapp.net.DappcheckSearchHistoryUrlIsBlackResult;
import com.okinc.business.defi.dapp.net.DeFiApiService;
import com.okinc.business.defi.dapp.net.DeFiLoader$getApiResult$1;
import com.okinc.business.defi.dapp.net.OKAAWalletChainList;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.net.WhiteList;
import com.okinc.business.defi.dapp.net.checkTxStatus;
import com.okinc.business.defi.dapp.net.search.DappDetailBean;
import com.okinc.dapp.bean.DappChains;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15059dxF {
    public final DeFiApiService copydefault = DeFiApiService.Companion.copydefault();

    public final AbstractC58185ywX<ResponseData<java.util.List<DappChains>>> KWHzl() {
        return C33527myD.KWHzl(DeFiApiService.Activity.listDappChainsNew$default(this.copydefault, new DappFavouriteRecommendReq(C14923duc.EZpvd.fetchVPNInfo()), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Boolean>> copydefault(long j, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.dappLikeOrUnlike$default(this.copydefault, new DappCollectReq(j, i, java.lang.Integer.valueOf(num != null ? num.intValue() : java.lang.Integer.parseInt("5")), str, str2, str3, str4, i2), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<DappChains>>> AEQbTJ(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.getDappChainsNew$default(this.copydefault, new DappChainsReq(j, str, C14923duc.EZpvd.fetchVPNInfo()), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Boolean>> copydefault(java.lang.Integer num, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C15059dxF c15059dxF;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0) {
            str3 = "5";
            c15059dxF = this;
        } else {
            c15059dxF = this;
            str3 = str2;
        }
        return C33527myD.KWHzl(DeFiApiService.Activity.getDappIsFavNew$default(c15059dxF.copydefault, new DappIsFavoutitetReq(num, j, str, str3), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<DappCheckUrlLevel>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.checkUrlLevel$default(this.copydefault, str, str2, list, str3, str4, null, null, 96, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> EZpvd(java.lang.Long l, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.clickReport$default(this.copydefault, l, str, null, null, 12, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.getAptosAbi$default(this.copydefault, str, str2, null, null, 12, null));
    }

    public final AbstractC58185ywX<JsonObject> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return DeFiApiService.Activity.postRequest$default(this.copydefault, str, Json.Default.parseToJsonElement(str2), null, 4, null);
    }

    public final AbstractC58185ywX<ResponseData<JsonObject>> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.translate$default(this.copydefault, Json.Default.parseToJsonElement(str), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<OKAAWalletChainList>> EZpvd() {
        return C33527myD.KWHzl(DeFiApiService.Activity.getAAWalletChainList$default(this.copydefault, null, 1, null));
    }

    public static /* synthetic */ AbstractC58185ywX checkTxStatus$default(C15059dxF c15059dxF, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c15059dxF.OLrzqt(str, str2, str3);
    }

    public final AbstractC58185ywX<ResponseData<checkTxStatus>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.checkTxStatus$default(this.copydefault, str, str2, str3, null, null, 24, null));
    }

    public static /* synthetic */ AbstractC58185ywX getDappDetail$default(C15059dxF c15059dxF, java.lang.Long l, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = 0;
        }
        return c15059dxF.OLrzqt(l, num);
    }

    public final AbstractC58185ywX<ResponseData<DappDetailBean>> OLrzqt(java.lang.Long l, java.lang.Integer num) {
        DeFiApiService deFiApiService = this.copydefault;
        C14923duc c14923duc = C14923duc.EZpvd;
        return C33527myD.KWHzl(DeFiApiService.Activity.getDappDetail$default(deFiApiService, new DappDetailReq(c14923duc.fetchVPNInfo(), l, num, c14923duc.getFieldNames()), null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<WhiteList>> OLrzqt() {
        return C33527myD.KWHzl(DeFiApiService.Activity.getWhiteList$default(this.copydefault, null, null, null, 7, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<DappCategory>>> AEQbTJ() {
        return C33527myD.KWHzl(DeFiApiService.Activity.getCategory$default(this.copydefault, null, null, null, 7, null));
    }

    public final AbstractC58185ywX<ResponseData<DappInfoByUrl>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.getDappInfoByUrl$default(this.copydefault, str, null, null, 6, null));
    }

    public final AbstractC58185ywX<ResponseData<JsonObject>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.getDappSecurityDetail$default(this.copydefault, str, null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object EZpvd(Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) throws java.lang.Throwable {
        DeFiLoader$getApiResult$1 deFiLoader$getApiResult$1;
        if (continuation instanceof DeFiLoader$getApiResult$1) {
            deFiLoader$getApiResult$1 = (DeFiLoader$getApiResult$1) continuation;
            int i = deFiLoader$getApiResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiLoader$getApiResult$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiLoader$getApiResult$1 = new DeFiLoader$getApiResult$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = deFiLoader$getApiResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiLoader$getApiResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                deFiLoader$getApiResult$1.label = 1;
                objInvoke = function1.invoke(deFiLoader$getApiResult$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInvoke);
            }
            ResponseData responseData = (ResponseData) objInvoke;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    public final AbstractC58185ywX<ResponseData<DappcheckSearchHistoryUrlIsBlackResult>> KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.checkSearchHistoryUrlIsBlack$default(this.copydefault, new DappcheckSearchHistoryUrlIsBlack(list), null, 2, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, OKCheckLeveldappInfo>>> copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(DeFiApiService.Activity.checkSearchHistoryUrlIsDapp$default(this.copydefault, new DappcheckSearchHistoryUrlIsBlack(list), null, 2, null));
    }
}
