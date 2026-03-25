package o;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import java.security.PrivateKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tmL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47239tmL {
    public static final int AEQbTJ;
    public static InterfaceC47236tmI EZpvd;
    public static KeyStore OLrzqt;
    public static final C47239tmL copydefault;

    private C47239tmL() {
    }

    static {
        C47239tmL c47239tmL = new C47239tmL();
        copydefault = c47239tmL;
        OLrzqt = c47239tmL.AEQbTJ();
        if (!c47239tmL.djBIcL()) {
            try {
                C47235tmH.OLrzqt.KWHzl("EC", c47239tmL.OLrzqt());
            } catch (java.lang.Exception e) {
                java.lang.String str = "generate key pair error, error=" + e.getMessage();
                InterfaceC47236tmI interfaceC47236tmI = EZpvd;
                if (interfaceC47236tmI != null) {
                    interfaceC47236tmI.copydefault(str);
                }
                pUU.copydefault("SecureKeyUtils", str);
            }
        }
        AEQbTJ = 8;
    }

    public final KeyStore AEQbTJ() {
        try {
            return C47235tmH.OLrzqt.copydefault();
        } catch (java.lang.Exception e) {
            java.lang.String str = "init key store error, error=" + e.getMessage();
            InterfaceC47236tmI interfaceC47236tmI = EZpvd;
            if (interfaceC47236tmI != null) {
                interfaceC47236tmI.copydefault(str);
            }
            pUU.copydefault("SecureKeyUtils", str);
            return null;
        }
    }

    public final KeyGenParameterSpec OLrzqt() {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("JwtTokenSecureKey", 12).setDigests("SHA-256").build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        return keyGenParameterSpecBuild;
    }

    public final java.lang.String KWHzl() {
        java.lang.String strOLrzqt;
        java.security.PublicKey publicKey;
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryEZpvd = EZpvd();
            java.security.cert.Certificate certificate = privateKeyEntryEZpvd != null ? privateKeyEntryEZpvd.getCertificate() : null;
            byte[] encoded = (certificate == null || (publicKey = certificate.getPublicKey()) == null) ? null : publicKey.getEncoded();
            strOLrzqt = encoded != null ? OLrzqt(encoded) : null;
        } catch (java.lang.Exception e) {
            java.lang.String str = "get public key error, error=" + e.getMessage();
            InterfaceC47236tmI interfaceC47236tmI = EZpvd;
            if (interfaceC47236tmI != null) {
                interfaceC47236tmI.copydefault(str);
            }
            pUU.copydefault("SecureKeyUtils", str);
        }
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final PrivateKey copydefault() {
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryEZpvd = EZpvd();
            if (privateKeyEntryEZpvd != null) {
                return privateKeyEntryEZpvd.getPrivateKey();
            }
        } catch (java.lang.Exception e) {
            java.lang.String str = "get private key error, error=" + e.getMessage();
            InterfaceC47236tmI interfaceC47236tmI = EZpvd;
            if (interfaceC47236tmI != null) {
                interfaceC47236tmI.copydefault(str);
            }
            pUU.copydefault("SecureKeyUtils", str);
        }
        return null;
    }

    public final KeyStore.PrivateKeyEntry EZpvd() {
        KeyStore.PrivateKeyEntry keyPair$default;
        synchronized (this) {
            keyPair$default = null;
            try {
                keyPair$default = C47235tmH.getKeyPair$default(C47235tmH.OLrzqt, "JwtTokenSecureKey", null, 2, null);
            } catch (java.lang.Exception e) {
                java.lang.String str = "getKeyPair error, error=" + e.getMessage();
                InterfaceC47236tmI interfaceC47236tmI = EZpvd;
                if (interfaceC47236tmI != null) {
                    interfaceC47236tmI.copydefault(str);
                }
                pUU.copydefault("SecureKeyUtils", str);
            }
        }
        return keyPair$default;
    }

    public final java.lang.String OLrzqt(byte[] bArr) {
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final boolean djBIcL() {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                KeyStore keyStore = OLrzqt;
                boolean zContainsAlias = keyStore != null ? keyStore.containsAlias("JwtTokenSecureKey") : false;
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                C47232tmE.EZpvd.KWHzl("isAliasExist() cost " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " millis");
                z = zContainsAlias;
            } catch (java.lang.Exception e) {
                java.lang.String str = "isAliasExist error, error=" + e.getMessage();
                InterfaceC47236tmI interfaceC47236tmI = EZpvd;
                if (interfaceC47236tmI != null) {
                    interfaceC47236tmI.copydefault(str);
                }
                pUU.copydefault("SecureKeyUtils", str);
            }
        }
        return z;
    }
}
