package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.ych, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57135ych extends AbstractC57063ybO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57063ybO
    public java.lang.String KWHzl() {
        return "\n                var transportInstance = new TransportModule.TransportBLEiOS();\n                var tron = new TransportModule.Trx(transportInstance);\n                ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57135ych(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao) {
        super(context, interfaceC57036yao, "trx_bundle.js");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
    }

    public void copydefault(@NotNull java.lang.String str, boolean z, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("TrxTransport#getAddress", AEQbTJ("\n                tron.getAddress(\"" + str + "\", " + z + ")\n                    .then(o => {\n                        transportInstance.transport.getAddressResult(o.publicKey, o.address);\n                    })\n                "), function2, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAddressResult(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.yce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57135ych.OLrzqt(this.copydefault, str, str2);
            }
        });
    }

    public static final void OLrzqt(C57135ych c57135ych, java.lang.String str, java.lang.String str2) {
        C57096ybv c57096ybvKWHzl = c57135ych.KWHzl("TrxTransport#getAddress");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function2) C56532yIw.KWHzl(objKWHzl, 2)).invoke(str, str2);
    }

    public void AEQbTJ(@NotNull yHQ<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yhq, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yhq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("TrxTransport#getAppConfiguration", AEQbTJ("\n                tron.getAppConfiguration()\n                    .then(o => {\n                        transportInstance.transport.getAppConfigurationResult(o.allowContract, o.truncateAddress, o.allowData, o.signByHash, o.version, o.versionN);\n                    })\n                "), yhq, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAppConfigurationResult(final boolean z, final boolean z2, final boolean z3, final boolean z4, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.yci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57135ych.AEQbTJ(this.EZpvd, z, z2, z3, z4, str, str2);
            }
        });
    }

    public static final void AEQbTJ(C57135ych c57135ych, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, java.lang.String str2) {
        C57096ybv c57096ybvKWHzl = c57135ych.KWHzl("TrxTransport#getAppConfiguration");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((yHQ) C56532yIw.KWHzl(objKWHzl, 6)).invoke(java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z3), java.lang.Boolean.valueOf(z4), str, str2);
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String[] strArr, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        JSONArray jSONArray = new JSONArray();
        if (strArr != null) {
            for (java.lang.String str3 : strArr) {
                jSONArray.put(str3);
            }
        }
        KWHzl("TrxTransport#signTransaction", AEQbTJ("\n                tron.signTransaction(\"" + str + "\", \"" + str2 + "\", \"" + jSONArray + "\")\n                    .then(o => {\n                        transportInstance.transport.signTransactionResult(o);\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signTransactionResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ycg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57135ych.KWHzl(this.AEQbTJ, str);
            }
        });
    }

    public static final void KWHzl(C57135ych c57135ych, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57135ych.KWHzl("TrxTransport#signTransaction");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }

    @android.webkit.JavascriptInterface
    public final void signTransactionHashResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ycf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57135ych.copydefault(this.AEQbTJ, str);
            }
        });
    }

    public static final void copydefault(C57135ych c57135ych, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57135ych.KWHzl("TrxTransport#signTransactionHash");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }
}
