package com.okinc.web3.security.bridge;

import api.Api;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.okinc.web3.security.utils.internal.WrapUtilsImpl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33482mxL;
import o.C33490mxT;
import o.C43246rlf;
import o.C56379yDe;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.C6777aVl;
import o.YG;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Web3SecurityBridge {
    public static final int $stable;
    public static final Web3SecurityBridge INSTANCE = new Web3SecurityBridge();
    private static final String TAG = "Web3SecurityBridge";
    private static boolean isLinkedError;

    private Web3SecurityBridge() {
    }

    static {
        try {
            if (Intrinsics.EZpvd((Object) C33482mxL.KWHzl, (Object) "gp")) {
                YG.copydefault(new YG.ActionBar() { // from class: com.okinc.web3.security.bridge.Web3SecurityBridge$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.YG.ActionBar
                    public final void log(String str) {
                        Web3SecurityBridge._init_$lambda$0(str);
                    }
                }).EZpvd(C43246rlf.OLrzqt.valueOf(), "gojni");
            } else {
                System.loadLibrary("gojni");
            }
            isLinkedError = false;
            pUU.KWHzl(TAG, "start init WrapUtilsImpl(thread is " + Thread.currentThread().getName() + ")");
            WrapUtilsImpl.INSTANCE.init$OKWeb3Security_web3_security_lib(C43246rlf.OLrzqt.valueOf());
        } catch (Throwable th) {
            isLinkedError = true;
            SoLoadException soLoadException = new SoLoadException("gojni load failed: " + C56379yDe.AEQbTJ(th), th);
            pUU.copydefault(TAG, C56379yDe.AEQbTJ(soLoadException));
            C6777aVl.Companion.EZpvd(soLoadException);
        }
        $stable = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(String str) {
        Intrinsics.copydefault((Object) str);
        pUU.KWHzl(TAG, str);
    }

    public final List<String> getWordList$OKWeb3Security_web3_security_lib(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Object objDispatch$default = dispatch$default(this, "get_wordslist", C56423yEv.EZpvd(C56390yDp.OLrzqt("language", str)), false, 4, null);
        if (objDispatch$default instanceof JSONArray) {
            Object objFromJson = new Gson().fromJson(((JSONArray) objDispatch$default).toString(), new TypeToken<List<? extends String>>() { // from class: com.okinc.web3.security.bridge.Web3SecurityBridge$getWordList$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            return (List) objFromJson;
        }
        return yDY.AhwBna();
    }

    public final MnemonicValidateResult validateMnemonic$OKWeb3Security_web3_security_lib(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Object objDispatch$default = dispatch$default(this, "validate_mnemonic", C56423yEv.EZpvd(C56390yDp.OLrzqt("mnemonic", str)), false, 4, null);
        if (objDispatch$default instanceof JSONObject) {
            String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            MnemonicValidateResult mnemonicValidateResult = (MnemonicValidateResult) C33490mxT.EZpvd(string, MnemonicValidateResult.class);
            return mnemonicValidateResult == null ? new MnemonicValidateResult("", false, 0, 4, (DefaultConstructorMarker) null) : mnemonicValidateResult;
        }
        return new MnemonicValidateResult("", false, 0, 4, (DefaultConstructorMarker) null);
    }

    public final String zipString$OKWeb3Security_web3_security_lib(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Object objDispatch$default = dispatch$default(this, "zip_string", C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str)), false, 4, null);
        String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final String hexStringToString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isLinkedError) {
            return "";
        }
        String strHexStringToString = Api.hexStringToString(str);
        Intrinsics.checkNotNullExpressionValue(strHexStringToString, "");
        return strHexStringToString;
    }

    public final String stringToHexString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isLinkedError) {
            return "";
        }
        String strStringToHexString = Api.stringToHexString(str);
        Intrinsics.checkNotNullExpressionValue(strStringToHexString, "");
        return strStringToHexString;
    }

    public final String encodeABI(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (isLinkedError) {
            return "";
        }
        String strEncodeABI = Api.encodeABI(str, str2, str3);
        Intrinsics.checkNotNullExpressionValue(strEncodeABI, "");
        return strEncodeABI;
    }

    public final String hexToBase58(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isLinkedError) {
            return "";
        }
        String strHexToBase58 = Api.hexToBase58(str);
        Intrinsics.checkNotNullExpressionValue(strHexToBase58, "");
        return strHexToBase58;
    }

    public final String hexToBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isLinkedError) {
            return "";
        }
        String strHexToBase64 = Api.hexToBase64(str);
        Intrinsics.checkNotNullExpressionValue(strHexToBase64, "");
        return strHexToBase64;
    }

    public static /* synthetic */ Object dispatch$default(Web3SecurityBridge web3SecurityBridge, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        return web3SecurityBridge.dispatch(str, obj, z);
    }

    public final Object dispatch(@NotNull String str, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isLinkedError) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(Api.dispatch(new GsonBuilder().disableHtmlEscaping().create().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("router", str), C56390yDp.OLrzqt("data", obj)))));
            int i = jSONObject.getInt("code");
            if (i == 0) {
                return jSONObject.get("data");
            }
            if (z) {
                pUU.copydefault(TAG, "dispatch " + str + " end with code " + i);
            }
            return null;
        } catch (Throwable th) {
            pUU.AEQbTJ(TAG, str + " dispatch error", th);
            return null;
        }
    }
}
