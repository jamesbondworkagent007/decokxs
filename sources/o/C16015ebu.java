package o;

import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.ton.TonConnectProto;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16015ebu {
    public final C54901xZn KWHzl;
    public final SignParams copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = SignParams.$stable | C54901xZn.EZpvd;
    public static final java.nio.charset.Charset EZpvd = Charsets.copydefault;

    public C16015ebu(@NotNull C54901xZn c54901xZn) {
        Intrinsics.checkNotNullParameter(c54901xZn, "");
        this.KWHzl = c54901xZn;
        this.copydefault = new SignParams(607L, 607L, null, null, null, null, 0, null, true, false, null, 1788, null);
    }

    /* JADX INFO: renamed from: o.ebu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ebu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.nio.charset.Charset KWHzl() {
            return C16015ebu.EZpvd;
        }
    }

    public final X25519KeyPair OLrzqt() {
        return this.KWHzl.OLrzqt(this.copydefault);
    }

    public final Ed25519KeyPair AEQbTJ() {
        try {
            Ed25519KeyPairGenerator ed25519KeyPairGenerator = new Ed25519KeyPairGenerator();
            ed25519KeyPairGenerator.init(new Ed25519KeyGenerationParameters(new java.security.SecureRandom()));
            AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = ed25519KeyPairGenerator.generateKeyPair();
            AsymmetricKeyParameter asymmetricKeyParameter = asymmetricCipherKeyPairGenerateKeyPair.getPublic();
            Intrinsics.copydefault(asymmetricKeyParameter, "");
            byte[] encoded = ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            java.nio.charset.Charset charset = EZpvd;
            java.lang.String str = new java.lang.String(encoded, charset);
            AsymmetricKeyParameter asymmetricKeyParameter2 = asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
            Intrinsics.copydefault(asymmetricKeyParameter2, "");
            byte[] encoded2 = ((Ed25519PrivateKeyParameters) asymmetricKeyParameter2).getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded2, "");
            return new Ed25519KeyPair(str, new java.lang.String(encoded2, charset));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("CryptoBox", "Failed to generate webSocketKeyPair - " + e.getMessage(), e);
            return null;
        }
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.KWHzl.EZpvd(this.copydefault, new TonConnectProto(str, str3, str2));
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.KWHzl.AEQbTJ(this.copydefault, new TonConnectProto(str, str3, str2));
    }
}
