package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57059ybK extends AbstractC57063ybO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57063ybO
    public java.lang.String KWHzl() {
        return "\n                var transportInstance = new TransportModule.TransportBLEiOS();\n                var solana = new TransportModule.Solana(transportInstance);\n                ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57059ybK(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao) {
        super(context, interfaceC57036yao, "solana_bundle.js");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
    }

    public void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        KWHzl("SolanaTransport#getAddress", AEQbTJ("\n                solana.getAddress(\"" + str + "\", " + z + ")\n                    .then(r => {\n                        transportInstance.transport.getAddressResult(r.address);\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void getAddressResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57059ybK.EZpvd(this.AEQbTJ, str);
            }
        });
    }

    public static final void EZpvd(C57059ybK c57059ybK, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57059ybK.KWHzl("SolanaTransport#getAddress");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }

    public void KWHzl(@NotNull yHO<? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("SolanaTransport#getAppConfiguration", AEQbTJ("\n                solana.getAppConfiguration()\n                    .then(o => {\n                        transportInstance.transport.getAppConfigurationResult(o.version, o.blindSigningEnabled, o.pubKeyDisplayMode);\n                    })\n                "), yho, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAppConfigurationResult(@NotNull final java.lang.String str, final boolean z, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57059ybK.OLrzqt(this.EZpvd, str, z, i);
            }
        });
    }

    public static final void OLrzqt(C57059ybK c57059ybK, java.lang.String str, boolean z, int i) {
        C57096ybv c57096ybvKWHzl = c57059ybK.KWHzl("SolanaTransport#getAppConfiguration");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((yHO) C56532yIw.KWHzl(objKWHzl, 3)).invoke(str, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        KWHzl("SolanaTransport#signTransaction", AEQbTJ("\n                solana.signTransaction(\"" + str + "\", \"" + str2 + "\", \"" + str3 + "\")\n                    .then(r => {\n                        transportInstance.transport.signTransactionResult(r.signedTx);\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signTransactionResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57059ybK.copydefault(this.EZpvd, str);
            }
        });
    }

    public static final void copydefault(C57059ybK c57059ybK, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57059ybK.KWHzl("SolanaTransport#signTransaction");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }
}
