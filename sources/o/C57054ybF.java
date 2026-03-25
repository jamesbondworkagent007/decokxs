package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57054ybF extends AbstractC57063ybO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57063ybO
    public java.lang.String KWHzl() {
        return "\n                var transportInstance = new TransportModule.TransportBLEiOS();\n                var eth = new TransportModule.Eth(transportInstance);\n                ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57054ybF(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao) {
        super(context, interfaceC57036yao, "eth_bundle.js");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
    }

    public void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("EthTransport#getAddress", AEQbTJ("\n                eth.getAddress(\"" + str + "\", " + z + ", " + z2 + ")\n                    .then(o => {\n                        transportInstance.transport.getAddressResult(o.publicKey, o.address, o.chainCode);\n                    })\n                "), yho, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAddressResult(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57054ybF.EZpvd(this.OLrzqt, str, str2, str3);
            }
        });
    }

    public static final void EZpvd(C57054ybF c57054ybF, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#getAddress");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        yHO yho = (yHO) C56532yIw.KWHzl(objKWHzl, 3);
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        yho.invoke(str, lowerCase, str3);
    }

    public void OLrzqt(@NotNull yHS<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yhs, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(yhs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("EthTransport#getAppConfiguration", AEQbTJ("\n                eth.getAppConfiguration()\n                    .then(o => {\n                        transportInstance.transport.getAppConfigurationResult(o.arbitraryDataEnabled, o.erc20ProvisioningNecessary, o.starkEnabled, o.starkv2Supported, o.version);\n                    })\n                "), yhs, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAppConfigurationResult(final int i, final int i2, final int i3, final int i4, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57054ybF.AEQbTJ(this.AEQbTJ, i, i2, i3, i4, str);
            }
        });
    }

    public static final void AEQbTJ(C57054ybF c57054ybF, int i, int i2, int i3, int i4, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#getAppConfiguration");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((yHS) C56532yIw.KWHzl(objKWHzl, 5)).invoke(java.lang.Boolean.valueOf(i > 0), java.lang.Boolean.valueOf(i2 > 0), java.lang.Boolean.valueOf(i3 > 0), java.lang.Boolean.valueOf(i4 > 0), str);
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("EthTransport#signTransaction", AEQbTJ("\n                eth.signTransaction(\"" + str + "\", \"" + str2 + "\")\n                    .then(o => {\n                        transportInstance.transport.signTransactionResult(o.s, o.v, o.r);\n                    })\n                "), yho, function1);
    }

    @android.webkit.JavascriptInterface
    public final void signTransactionResult(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57054ybF.OLrzqt(this.AEQbTJ, str, str2, str3);
            }
        });
    }

    public static final void OLrzqt(C57054ybF c57054ybF, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#signTransaction");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((yHO) C56532yIw.KWHzl(objKWHzl, 3)).invoke(str, str2, str3);
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        KWHzl("EthTransport#signPersonalMessage", AEQbTJ("\n                eth.signPersonalMessage(\"" + str + "\", \"" + str2 + "\")\n                    .then(result => {\n                        transportInstance.transport.signPersonalResult(result.signature);\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signPersonalResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57054ybF.copydefault(this.OLrzqt, str);
            }
        });
    }

    public static final void copydefault(C57054ybF c57054ybF, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#signPersonalMessage");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        KWHzl("EthTransport#signEIP712HashedMessage", AEQbTJ("\n                eth.signEIP712HashedMessage(\"" + str + "\", \"" + str2 + "\", \"" + str3 + "\")\n                    .then(signature => {\n                        transportInstance.transport.signEIP712HashedMessageResult(signature);\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signEIP712HashedMessageResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57054ybF.EZpvd(this.EZpvd, str);
            }
        });
    }

    public static final void EZpvd(C57054ybF c57054ybF, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#signEIP712HashedMessage");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }

    @Override // o.AbstractC57063ybO
    @android.webkit.JavascriptInterface
    public void unknownError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd("EthTransport#signTransaction") != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "Blind signing", false, 2, (java.lang.Object) null)) {
            EZpvd().post(new java.lang.Runnable() { // from class: o.ybI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57054ybF.copydefault(this.AEQbTJ);
                }
            });
        } else {
            super.unknownError(str);
        }
    }

    public static final void copydefault(C57054ybF c57054ybF) {
        Function1<LedgerError, Unit> function1AEQbTJ;
        C57096ybv c57096ybvKWHzl = c57054ybF.KWHzl("EthTransport#signTransaction");
        if (c57096ybvKWHzl == null || (function1AEQbTJ = c57096ybvKWHzl.AEQbTJ()) == null) {
            return;
        }
        function1AEQbTJ.invoke(LedgerError.BLIND_NOT_OPEN);
    }
}
