package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47130tkI {
    public static final C47130tkI AEQbTJ = new C47130tkI();

    private C47130tkI() {
    }

    public final java.lang.String KWHzl() {
        C47138tkQ c47138tkQ = C47138tkQ.EZpvd;
        java.lang.String strSSMYrx = c47138tkQ.sSMYrx();
        java.lang.String strAxsJAY = c47138tkQ.AxsJAY();
        java.lang.String strQOLQEE = c47138tkQ.QOLQEE();
        java.lang.String strAubY = c47138tkQ.AubY();
        java.lang.String strEjfBZ = c47138tkQ.ejfBZ();
        java.lang.String strGHZMYf = c47138tkQ.gHZMYf();
        java.lang.String strAwvSrB = c47138tkQ.AwvSrB();
        java.lang.String strFetchVPNInfo = c47138tkQ.fetchVPNInfo();
        if (Intrinsics.EZpvd((java.lang.Object) strAxsJAY, (java.lang.Object) "Google") && Intrinsics.EZpvd((java.lang.Object) strGHZMYf, (java.lang.Object) "google")) {
            if (C59449zhJ.startsWith$default(strSSMYrx, "google/sdk_gphone_", false, 2, null) && C59449zhJ.endsWith$default(strSSMYrx, ":user/release-keys", false, 2, null) && C59449zhJ.startsWith$default(strAubY, "sdk_gphone_", false, 2, null) && C59449zhJ.startsWith$default(strQOLQEE, "sdk_gphone_", false, 2, null)) {
                return "1";
            }
            if (C59449zhJ.startsWith$default(strSSMYrx, "google/sdk_gphone64_", false, 2, null) && ((C59449zhJ.endsWith$default(strSSMYrx, ":userdebug/dev-keys", false, 2, null) || C59449zhJ.endsWith$default(strSSMYrx, ":user/release-keys", false, 2, null)) && C59449zhJ.startsWith$default(strAubY, "sdk_gphone64_", false, 2, null) && C59449zhJ.startsWith$default(strQOLQEE, "sdk_gphone64_", false, 2, null))) {
                return "1";
            }
        }
        return (C59449zhJ.startsWith$default(strSSMYrx, "generic", false, 2, null) || C59449zhJ.startsWith$default(strSSMYrx, "unknown", false, 2, null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strQOLQEE, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strQOLQEE, (java.lang.CharSequence) "Emulator", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strQOLQEE, (java.lang.CharSequence) "Android SDK built", false, 2, (java.lang.Object) null)) ? "1" : ((Intrinsics.EZpvd((java.lang.Object) "QC_Reference_Phone", (java.lang.Object) strAwvSrB) && !C59449zhJ.gEmmrt("Xiaomi", strAxsJAY, true)) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) strAxsJAY, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null) || C59449zhJ.startsWith$default(strEjfBZ, "Build", false, 2, null)) ? "1" : ((C59449zhJ.startsWith$default(strGHZMYf, "generic", false, 2, null) && C59449zhJ.startsWith$default(strFetchVPNInfo, "generic", false, 2, null)) || Intrinsics.EZpvd((java.lang.Object) strAubY, (java.lang.Object) "google_sdk") || Intrinsics.EZpvd((java.lang.Object) C47142tkU.getProp$default(C47142tkU.OLrzqt, "ro.kernel.qemu", null, 2, null), (java.lang.Object) "1")) ? "1" : "0";
    }

    public final java.lang.String AEQbTJ() {
        return C34702nhN.OLrzqt.copydefault() ? "1" : "0";
    }

    public final java.lang.String copydefault() {
        java.lang.String string;
        try {
            java.io.InputStream inputStream = java.lang.Runtime.getRuntime().exec("getprop init.svc.qemu-props").getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, Charsets.UTF_8);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) yFK.AEQbTJ(bufferedReader)).toString();
            bufferedReader.close();
        } catch (java.lang.Exception unused) {
        }
        return string.length() > 0 ? string : AbstractJsonLexerKt.NULL;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.io.File(str).exists() ? "1" : "0";
    }
}
