package o;

import com.okinc.okrisk.OKRiskPayloadManager;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.thl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47000thl implements InterfaceC46999thk {
    public static final C47000thl KWHzl = new C47000thl();

    private C47000thl() {
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return OKRiskPayloadManager.copydefault.uploadDataMessageNative(context, str, str2, str3, str4, str5, i, bArr, i2, i3, bArr2);
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, byte[] bArr, int i2, int i3, byte[] bArr2, byte[] bArr3, int i4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return OKRiskPayloadManager.copydefault.uploadDataMessageMetricsNative(context, str, str2, str3, str4, str5, i, bArr, i2, i3, bArr2, bArr3, i4);
    }

    @Override // o.InterfaceC46999thk
    public void KWHzl() {
        OKRiskPayloadManager.copydefault.markTargetAppInfoApiSuccessNative();
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OKRiskPayloadManager.copydefault.gccByteNative(context, str, str2, i, str3, str4, i2, bArr);
    }

    @Override // o.InterfaceC46999thk
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OKRiskPayloadManager.copydefault.decryptConfigJNI(context, str, str2, str3);
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return OKRiskPayloadManager.copydefault.getConfigValueJNI(context, C47136tkO.AEQbTJ.gEmmrt(context), str);
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OKRiskPayloadManager.copydefault.getConfigValueRsdJNI(context, str, str2);
    }

    @Override // o.InterfaceC46999thk
    public java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, int i2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return OKRiskPayloadManager.copydefault.processBiometricDataJNI(context, str, str2, str3, str4, str5, i, str6, str7, i2, bArr);
    }

    public java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, byte[] bArr, int i3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OKRiskPayloadManager.copydefault.collectFilterAndProcessJNI(context, str, str2, i, str3, str4, i2, bArr, i3);
    }

    public java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) throws JSONException {
        java.lang.String strEncodeToString;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
        C46983thU c46983thU = oKRiskPayloadManager.fARcdN().get();
        int iEZpvd = c46983thU.EZpvd();
        java.lang.String strKWHzl = c46983thU.KWHzl();
        java.lang.String strProduceSecJNI = oKRiskPayloadManager.produceSecJNI(context, str, str2, str3, iEZpvd, c46983thU.AEQbTJ(), oKRiskPayloadManager.ejfBZ().AEQbTJ());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rid", strKWHzl);
        jSONObject.put(JwtUtilsKt.DID_PREFIX, str2);
        jSONObject.put("st", str3);
        jSONObject.put("pv", iEZpvd);
        jSONObject.put("sv", oKRiskPayloadManager.AuCTel());
        jSONObject.put(com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ, 1);
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        try {
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            strEncodeToString = android.util.Base64.encodeToString(EZpvd(bytes), 2);
        } catch (java.lang.Exception unused) {
            strEncodeToString = "";
        }
        Intrinsics.copydefault((java.lang.Object) strEncodeToString);
        if (strEncodeToString.length() == 0 || strProduceSecJNI.length() == 0) {
            return "";
        }
        return strEncodeToString + JwtUtilsKt.JWT_DELIMITER + strProduceSecJNI;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final byte[] EZpvd(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater());
        try {
            deflaterOutputStream.write(bArr);
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(deflaterOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } finally {
        }
    }
}
