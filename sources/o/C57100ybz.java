package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57100ybz extends AbstractC57063ybO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57063ybO
    public java.lang.String KWHzl() {
        return "\n                var transportInstance = new TransportModule.TransportBLEiOS();\n                var btc = new TransportModule.Btc({ transport: transportInstance, currency: \"bitcoin\" });\n                ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57100ybz(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao) {
        super(context, interfaceC57036yao, "btc_bundle.js");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
    }

    public void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("BtcTransport#getAddress", AEQbTJ("\n                btc.getWalletPublicKey(\"" + str + "\", " + ("{verify: " + z + ", format: \"" + str2 + "\"}") + ")\n                    .then(o => {\n                        transportInstance.transport.getAddressResult(o.publicKey, o.bitcoinAddress, o.chainCode);\n                    })\n                "), yho, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAddressResult(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57100ybz.EZpvd(this.KWHzl, str, str2, str3);
            }
        });
    }

    public static final void EZpvd(C57100ybz c57100ybz, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C57096ybv c57096ybvKWHzl = c57100ybz.KWHzl("BtcTransport#getAddress");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((yHO) C56532yIw.KWHzl(objKWHzl, 3)).invoke(str, str2, str3);
    }

    public void OLrzqt(@NotNull C57041yat[] c57041yatArr, @NotNull java.lang.String str, @NotNull java.lang.String[] strArr, @NotNull java.lang.String[] strArr2, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        C57041yat[] c57041yatArr2 = c57041yatArr;
        Intrinsics.checkNotNullParameter(c57041yatArr2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("var inputs = new Array();");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        char c = '\n';
        sb.append('\n');
        int length = c57041yatArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C57041yat c57041yat = c57041yatArr2[i];
            sb.append("inputs[" + i2 + "] = {utxo: \"" + c57041yat.copydefault() + "\", index: " + c57041yat.AEQbTJ() + ", sequence: " + c57041yat.OLrzqt() + "};");
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            i++;
            i2++;
            c = '\n';
            c57041yatArr2 = c57041yatArr;
        }
        sb.append("var associatedKeys = new Array();");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(c);
        int length2 = strArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            sb.append("associatedKeys[" + i4 + "] = \"" + strArr[i3] + "\";");
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            i3++;
            i4++;
        }
        sb.append("var additionals = new Array();");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        int length3 = strArr2.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length3) {
            sb.append("additionals[" + i6 + "] = \"" + strArr2[i5] + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            i5++;
            i6++;
        }
        sb.append(AEQbTJ("\n                btc.signTransaction(inputs, \"" + str + "\", associatedKeys, additionals, " + z + ")\n                    .then(serializedTx => {\n                        transportInstance.transport.signMessageResult(serializedTx);\n                    })\n                "));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        KWHzl("BtcTransport#signTransaction", string, function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signMessageResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57100ybz.copydefault(this.OLrzqt, str);
            }
        });
    }

    public static final void copydefault(C57100ybz c57100ybz, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57100ybz.KWHzl("BtcTransport#signTransaction");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }
}
