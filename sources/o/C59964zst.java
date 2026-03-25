package o;

import kotlin.jvm.functions.Function0;
import o.C59968zsx;
import o.InterfaceC59920zsB;
import o.InterfaceC59922zsD;
import o.InterfaceC59923zsE;
import o.InterfaceC59967zsw;
import org.kethereum.crypto.api.cipher.AESCipher;
import org.kethereum.crypto.impl.kdf.PBKDF2;
import org.kethereum.crypto.impl.kdf.SCrypt;

/* JADX INFO: renamed from: o.zst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59964zst {
    public static final C59964zst OLrzqt = new C59964zst();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0<InterfaceC59922zsD>() { // from class: org.kethereum.crypto.CryptoAPI$hmac$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC59922zsD invoke() {
            return (InterfaceC59922zsD) C59968zsx.EZpvd("mac.HmacImpl");
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0<InterfaceC59923zsE>() { // from class: org.kethereum.crypto.CryptoAPI$keyPairGenerator$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC59923zsE invoke() {
            return (InterfaceC59923zsE) C59968zsx.EZpvd("ec.EllipticCurveKeyPairGenerator");
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0<InterfaceC59967zsw>() { // from class: org.kethereum.crypto.CryptoAPI$curve$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC59967zsw invoke() {
            return (InterfaceC59967zsw) C59968zsx.EZpvd("ec.EllipticCurve");
        }
    });
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0<InterfaceC59920zsB>() { // from class: org.kethereum.crypto.CryptoAPI$signer$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC59920zsB invoke() {
            return (InterfaceC59920zsB) C59968zsx.EZpvd("ec.EllipticCurveSigner");
        }
    });
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0<PBKDF2>() { // from class: org.kethereum.crypto.CryptoAPI$pbkdf2$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final PBKDF2 invoke() {
            return (PBKDF2) C59968zsx.EZpvd("kdf.PBKDF2Impl");
        }
    });
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0<SCrypt>() { // from class: org.kethereum.crypto.CryptoAPI$scrypt$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final SCrypt invoke() {
            return (SCrypt) C59968zsx.EZpvd("kdf.SCryptImpl");
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<AESCipher>() { // from class: org.kethereum.crypto.CryptoAPI$aesCipher$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final AESCipher invoke() {
            return (AESCipher) C59968zsx.EZpvd("cipher.AESCipherImpl");
        }
    });

    private C59964zst() {
    }

    public final InterfaceC59922zsD OLrzqt() {
        return (InterfaceC59922zsD) KWHzl.getValue();
    }

    public final InterfaceC59967zsw AEQbTJ() {
        return (InterfaceC59967zsw) EZpvd.getValue();
    }

    public final InterfaceC59920zsB copydefault() {
        return (InterfaceC59920zsB) djBIcL.getValue();
    }

    public final PBKDF2 KWHzl() {
        return (PBKDF2) valueOf.getValue();
    }
}
