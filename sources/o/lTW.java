package o;

import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.okinc.network.okg.dns.DomainsUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class lTW {
    public static final java.util.List<java.lang.String> AEQbTJ;
    public static final JSONObject EZpvd;
    public static final lTW KWHzl = new lTW();
    public static final JSONArray OLrzqt;
    public static final int copydefault;

    private lTW() {
    }

    public final boolean copydefault() {
        java.lang.String strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
        return (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) DomainsUtils.HOLDER_OKX_HTTP_MAIN, false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) "https://beta.okex.org", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) "https://usbeta.okex.org", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) "https://eubeta.okex.org", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) "https://app.okx.com", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strFJNWhG, (java.lang.CharSequence) "https://my.okx.com", false, 2, (java.lang.Object) null)) ? false : true;
    }

    public final int OLrzqt() {
        return copydefault() ? 3 : 1;
    }

    static {
        java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt("MASTERCARD", "VISA");
        AEQbTJ = listGEmmrt;
        EZpvd = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
        OLrzqt = new JSONArray((java.util.Collection) listGEmmrt);
        copydefault = 8;
    }

    public final PaymentsClient EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(OLrzqt()).build();
        Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(context, walletOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(paymentsClient, "");
        return paymentsClient;
    }

    public static /* synthetic */ JSONObject isReadyToPayRequest$default(lTW ltw, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return ltw.KWHzl(z, z2);
    }

    public final JSONObject KWHzl(boolean z, boolean z2) {
        try {
            return EZpvd.put("allowedPaymentMethods", new JSONArray().put(EZpvd(z, z2)));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject EZpvd(java.lang.String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject(C56424yEw.gEmmrt(C56390yDp.OLrzqt("gateway", "ixopay"), C56390yDp.OLrzqt("gatewayMerchantId", str))));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
        return jSONObjectPut;
    }

    public final JSONArray KWHzl(boolean z) {
        java.util.List listAhwBna = yDY.AhwBna("CRYPTOGRAM_3DS");
        if (z) {
            listAhwBna.add("PAN_ONLY");
        }
        return new JSONArray((java.util.Collection) listAhwBna);
    }

    public static /* synthetic */ JSONObject baseCardPaymentMethod$default(lTW ltw, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return ltw.EZpvd(z, z2);
    }

    public final JSONObject EZpvd(boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", KWHzl(z2)).put("allowedCardNetworks", OLrzqt).put("allowPrepaidCards", false).put("allowCreditCards", z).put("billingAddressRequired", true).put("billingAddressParameters", new JSONObject().put("format", "FULL").put("phoneNumberRequired", true)).put("assuranceDetailsRequired", true));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
        return jSONObjectPut;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lTW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JSONObject getCardPaymentMethod$default(lTW ltw, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        return ltw.OLrzqt(str, list, z);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        if (str.length() != 2) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (java.lang.Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final JSONObject OLrzqt(java.lang.String str, java.util.List<java.lang.String> list, boolean z) throws JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (AEQbTJ((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String upperCase = ((java.lang.String) it.next()).toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList2.add(upperCase);
        }
        JSONObject jSONObjectBaseCardPaymentMethod$default = baseCardPaymentMethod$default(this, z, false, 2, null);
        if ((!arrayList2.isEmpty()) && KWHzl.OLrzqt() == 1) {
            jSONObjectBaseCardPaymentMethod$default.getJSONObject("parameters").put("allowedIssuerCountryCodes", new JSONArray((java.util.Collection) arrayList2));
        }
        jSONObjectBaseCardPaymentMethod$default.put("tokenizationSpecification", KWHzl.EZpvd(str));
        return jSONObjectBaseCardPaymentMethod$default;
    }
}
