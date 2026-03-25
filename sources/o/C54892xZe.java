package o;

import com.google.gson.Gson;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.solana.BaseSolanaTransaction;
import com.okinc.wallet.core.sign.solana.GenerateRawTransactionBean;
import com.okinc.wallet.core.sign.solana.MultiUnitPriceAndLimit;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import com.okinc.wallet.core.sign.solana.SolanaTokenTransaction;
import com.okinc.wallet.core.sign.solana.SolanaTransaction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.xZe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54892xZe {
    public static final C54892xZe KWHzl = new C54892xZe();

    private C54892xZe() {
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull BaseSolanaTransaction baseSolanaTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(baseSolanaTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, baseSolanaTransaction)));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.DbNXlk(str, str2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.fetchVPNInfo(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.AuCTel(str, str2);
    }

    public final void KWHzl(@NotNull android.app.Application application, @NotNull JSONArray jSONArray, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        java.lang.String string = jSONArray2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                GenerateTransactionFromBuffer(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void AEQbTJ(@NotNull android.app.Application application, @NotNull GenerateRawTransactionBean generateRawTransactionBean, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(generateRawTransactionBean, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(generateRawTransactionBean.getEncodedTransactionStr());
        jSONArray.put(generateRawTransactionBean.getSignature());
        jSONArray.put(generateRawTransactionBean.getPayer());
        jSONArray.put(generateRawTransactionBean.getBizType());
        jSONArray.put(new Gson().toJson(generateRawTransactionBean.getBizId()));
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                GenerateRawTransaction(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void KWHzl(@NotNull android.app.Application application, @NotNull java.util.List<GenerateRawTransactionBean> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (GenerateRawTransactionBean generateRawTransactionBean : list) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(generateRawTransactionBean.getEncodedTransactionStr());
            jSONArray3.put(generateRawTransactionBean.getSignature());
            jSONArray3.put(generateRawTransactionBean.getPayer());
            jSONArray3.put(generateRawTransactionBean.getBizType());
            JSONArray jSONArray4 = new JSONArray();
            java.util.Iterator<T> it = generateRawTransactionBean.getBizId().iterator();
            while (it.hasNext()) {
                jSONArray4.put((java.lang.String) it.next());
            }
            jSONArray3.put(jSONArray4);
            jSONArray2.put(jSONArray3);
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                GenerateRawTransactions(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void OLrzqt(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(str3);
        jSONArray.put(bool);
        jSONArray.put(str4);
        if (C33129mqd.AEQbTJ(num2, 0)) {
            jSONArray.put(num);
            jSONArray.put(num2);
        }
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str5 = "\n                GenerateTransactionWithNewBlockHash(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.AhwBna(application, strKWHzl, str5, valueCallback);
        }
    }

    public final void EZpvd(@NotNull android.app.Application application, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.util.ArrayList<MultiUnitPriceAndLimit> arrayList, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        MultiUnitPriceAndLimit multiUnitPriceAndLimit;
        java.lang.Integer computeUnitPrice;
        MultiUnitPriceAndLimit multiUnitPriceAndLimit2;
        java.lang.Integer computeUnitLimit;
        MultiUnitPriceAndLimit multiUnitPriceAndLimit3;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put((java.lang.String) obj);
            jSONArray3.put(str);
            jSONArray3.put(str2);
            jSONArray3.put(bool);
            jSONArray3.put(str3);
            if (C33129mqd.valueOf(java.lang.Integer.valueOf(i), arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null)) {
                if (C33129mqd.AEQbTJ((arrayList == null || (multiUnitPriceAndLimit3 = arrayList.get(i)) == null) ? null : multiUnitPriceAndLimit3.getComputeUnitPrice(), 0)) {
                    jSONArray3.put((arrayList == null || (multiUnitPriceAndLimit2 = arrayList.get(i)) == null || (computeUnitLimit = multiUnitPriceAndLimit2.getComputeUnitLimit()) == null) ? 0 : computeUnitLimit.intValue());
                    jSONArray3.put((arrayList == null || (multiUnitPriceAndLimit = arrayList.get(i)) == null || (computeUnitPrice = multiUnitPriceAndLimit.getComputeUnitPrice()) == null) ? 0 : computeUnitPrice.intValue());
                }
            }
            jSONArray2.put(jSONArray3);
            i++;
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str4 = "\n                GenerateTransactionsWithNewBlockHash(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.AhwBna(application, strKWHzl, str4, valueCallback);
        }
    }

    public final void EZpvd(@NotNull android.app.Application application, @NotNull java.util.List<? extends JSONArray> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put((JSONArray) it.next());
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                GenerateTransactionsFromBuffers(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void AEQbTJ(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str2 = "\n                GenerateWalletConnectTransaction(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str2, valueCallback);
        }
    }

    public final void AEQbTJ(@NotNull android.app.Application application, @NotNull java.util.List<java.lang.String> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put((java.lang.String) it.next());
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                CalTxDataLength(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void copydefault(@NotNull android.app.Application application, @NotNull java.util.List<java.lang.String> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put((java.lang.String) it.next());
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                CalTxSigners(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final void OLrzqt(@NotNull android.app.Application application, @NotNull java.util.List<java.lang.String> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put((java.lang.String) it.next());
        }
        jSONArray.put(jSONArray2);
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str = "\n                DecodeTxMethods(" + string + ");\n                ";
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl != null) {
            walletJsBridge.KWHzl(application, strKWHzl, str, valueCallback);
        }
    }

    public final java.lang.String EZpvd(long j, @NotNull SolanaTransaction solanaTransaction) {
        Intrinsics.checkNotNullParameter(solanaTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, 0L, null, solanaTransaction, 0, false, 50, null));
    }

    public final java.lang.String OLrzqt(long j, @NotNull java.lang.String str, @NotNull SolanaTokenTransaction solanaTokenTransaction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(solanaTokenTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, 0L, str, solanaTokenTransaction, 0, false, 50, null));
    }

    public final java.util.List<SolUnitLimitAndPrice> copydefault(@NotNull SignParams signParams, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String strEZpvd = xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("deserializeMessage", signParams, obj));
        if (strEZpvd == null || strEZpvd.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd))) {
            return null;
        }
        return (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(SolUnitLimitAndPrice.Companion.serializer()), new JSONObject(strEZpvd).get("result").toString());
    }
}
