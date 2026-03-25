package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ybB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57050ybB extends AbstractC57063ybO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57063ybO
    public java.lang.String KWHzl() {
        return "\n                var transportInstance = new TransportModule.TransportBLEiOS();\n                var cosmos = new TransportModule.Cosmos(transportInstance);\n                ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57050ybB(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao) {
        super(context, interfaceC57036yao, "cosmos_bundle.js");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull Function1<? super LedgerError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl("CosmosTransport#getAddress", AEQbTJ("\n                cosmos.getAddress(\"" + str + "\", \"" + str2 + "\", " + z + ")\n                    .then(o => {\n                        transportInstance.transport.getAddressResult(o.publicKey, o.address);\n                    })\n                "), function2, function1);
    }

    @android.webkit.JavascriptInterface
    public final void getAddressResult(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57050ybB.OLrzqt(this.AEQbTJ, str, str2);
            }
        });
    }

    public static final void OLrzqt(C57050ybB c57050ybB, java.lang.String str, java.lang.String str2) {
        C57096ybv c57096ybvKWHzl = c57050ybB.KWHzl("CosmosTransport#getAddress");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function2) C56532yIw.KWHzl(objKWHzl, 2)).invoke(str, str2);
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        KWHzl("CosmosTransport#sign", AEQbTJ("\n                cosmos.sign(\"" + str + "\", '" + str2 + "')\n                    .then(o => {\n                                if (o.return_code === 0x9000) {\n                                    transportInstance.transport.signResult(o.signature);\n                                } else {\n                                    transportInstance.transport.unknownError(\"\" + o.return_code);\n                                }\n                    })\n                "), function1, function12);
    }

    @android.webkit.JavascriptInterface
    public final void signResult(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().post(new java.lang.Runnable() { // from class: o.ybD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57050ybB.KWHzl(this.copydefault, str);
            }
        });
    }

    public static final void KWHzl(C57050ybB c57050ybB, java.lang.String str) {
        C57096ybv c57096ybvKWHzl = c57050ybB.KWHzl("CosmosTransport#sign");
        if (c57096ybvKWHzl == null) {
            return;
        }
        java.lang.Object objKWHzl = c57096ybvKWHzl.KWHzl();
        Intrinsics.copydefault(objKWHzl, "");
        ((Function1) C56532yIw.KWHzl(objKWHzl, 1)).invoke(str);
    }
}
