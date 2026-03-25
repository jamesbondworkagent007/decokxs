package o;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.okinc.auth.impl.util.SimpleCBOREncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableEntryException;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC5696aBO;
import o.InterfaceC5699aBR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5692aBK {
    public static KeyStore EZpvd;
    public static final C5692aBK KWHzl;
    public static final int copydefault;

    private C5692aBK() {
    }

    static {
        C5692aBK c5692aBK = new C5692aBK();
        KWHzl = c5692aBK;
        c5692aBK.OLrzqt();
        copydefault = 8;
    }

    public final void OLrzqt() {
        try {
            EZpvd = C47235tmH.OLrzqt.copydefault();
        } catch (java.lang.Exception e) {
            C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "fail to init keystore, error: " + e.getMessage());
        }
    }

    public final InterfaceC5699aBR copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        InterfaceC5699aBR stateListAnimator;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "start create key pair start userId: " + str2 + " rpId: " + str3 + " credentialId: " + str);
            try {
                for (java.lang.String str4 : list) {
                    C5692aBK c5692aBK = KWHzl;
                    C5700aBS c5700aBSEZpvd = c5692aBK.EZpvd(str4);
                    if (c5700aBSEZpvd != null) {
                        if (z) {
                            c5692aBK.AEQbTJ(str4);
                        } else {
                            C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "key pair is already exist, excludeCredentialId: " + str4);
                            return new InterfaceC5699aBR.TaskDescription(c5700aBSEZpvd);
                        }
                    }
                }
                java.lang.String strEZpvd = EZpvd(str, str2, str3);
                KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(strEZpvd, 12).setDigests("SHA-256").setUserAuthenticationRequired(true);
                Intrinsics.checkNotNullExpressionValue(userAuthenticationRequired, "");
                KeyGenParameterSpec keyGenParameterSpecBuild = KWHzl(userAuthenticationRequired).setInvalidatedByBiometricEnrollment(true).build();
                Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                C47235tmH.OLrzqt.KWHzl("EC", keyGenParameterSpecBuild);
                C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "create a key pair success, alias: " + strEZpvd);
                C5700aBS c5700aBSEZpvd2 = EZpvd(str);
                Intrinsics.copydefault(c5700aBSEZpvd2);
                stateListAnimator = new InterfaceC5699aBR.Application(c5700aBSEZpvd2);
            } catch (InvalidAlgorithmParameterException e) {
                C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "invalid algorithm parameter, error: " + e.getMessage());
                stateListAnimator = InterfaceC5699aBR.Activity.AEQbTJ;
            } catch (java.lang.Exception e2) {
                C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "fail to create key, error: " + e2.getMessage());
                stateListAnimator = new InterfaceC5699aBR.StateListAnimator(e2.getMessage());
            }
            return stateListAnimator;
        }
    }

    public final KeyGenParameterSpec.Builder KWHzl(KeyGenParameterSpec.Builder builder) {
        if (Build.VERSION.SDK_INT >= 30) {
            KeyGenParameterSpec.Builder userAuthenticationParameters = builder.setUserAuthenticationParameters(0, 2);
            Intrinsics.copydefault(userAuthenticationParameters);
            return userAuthenticationParameters;
        }
        KeyGenParameterSpec.Builder userAuthenticationValidityDurationSeconds = builder.setUserAuthenticationValidityDurationSeconds(-1);
        Intrinsics.copydefault(userAuthenticationValidityDurationSeconds);
        return userAuthenticationValidityDurationSeconds;
    }

    public final C5700aBS EZpvd(@NotNull java.lang.String str) {
        C5700aBS c5700aBSCopydefault;
        java.lang.String strAEQbTJ;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            KeyStore keyStore = EZpvd;
            c5700aBSCopydefault = (keyStore == null || (strAEQbTJ = AEQbTJ(keyStore, str)) == null) ? null : copydefault(strAEQbTJ);
        }
        return c5700aBSCopydefault;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String strAEQbTJ;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            KeyStore keyStore = EZpvd;
            if (keyStore != null && (strAEQbTJ = AEQbTJ(keyStore, str)) != null) {
                KeyStore keyStore2 = EZpvd;
                if (keyStore2 != null) {
                    keyStore2.deleteEntry(strAEQbTJ);
                }
            }
        }
    }

    public final InterfaceC5696aBO OLrzqt(@NotNull java.security.Signature signature, @NotNull byte[] bArr) {
        InterfaceC5696aBO stateListAnimator;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(signature, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            try {
                signature.update(bArr);
                byte[] bArrSign = signature.sign();
                C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "sign success");
                Intrinsics.copydefault(bArrSign);
                stateListAnimator = new InterfaceC5696aBO.Activity(bArrSign);
            } catch (java.lang.Exception e) {
                C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "sign error, error: " + e.getMessage());
                stateListAnimator = new InterfaceC5696aBO.StateListAnimator(e.getMessage());
            }
        }
        return stateListAnimator;
    }

    public final java.security.Signature OLrzqt(@NotNull C5700aBS c5700aBS) {
        java.security.Signature signature;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c5700aBS, "");
            signature = java.security.Signature.getInstance("SHA256withECDSA");
            signature.initSign(c5700aBS.EZpvd().getPrivateKey());
            Intrinsics.copydefault(signature);
        }
        return signature;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return "OKGuard:" + str + ":" + str2 + ":" + str3;
    }

    public final java.lang.String AEQbTJ(KeyStore keyStore, java.lang.String str) throws KeyStoreException {
        java.util.ArrayList list;
        C5689aBH c5689aBH = C5689aBH.KWHzl;
        java.util.Enumeration<java.lang.String> enumerationAliases = keyStore.aliases();
        java.lang.Object obj = null;
        if (enumerationAliases != null) {
            list = Collections.list(enumerationAliases);
            Intrinsics.checkNotNullExpressionValue(list, "");
        } else {
            list = null;
        }
        c5689aBH.AEQbTJ("[GUARD_MANAGER]", "findAliasByKeyword() find [" + str + "] in keystore aliases list " + list);
        java.util.Enumeration<java.lang.String> enumerationAliases2 = keyStore.aliases();
        if (enumerationAliases2 == null) {
            return null;
        }
        java.util.ArrayList list2 = Collections.list(enumerationAliases2);
        Intrinsics.checkNotNullExpressionValue(list2, "");
        if (list2 == null) {
            return null;
        }
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String str2 = (java.lang.String) next;
            Intrinsics.copydefault((java.lang.Object) str2);
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                obj = next;
                break;
            }
        }
        return (java.lang.String) obj;
    }

    public final C5700aBS copydefault(java.lang.String str) throws java.security.NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "toUserKeyPair: " + str);
        KeyStore keyStore = EZpvd;
        KeyStore.Entry entry = keyStore != null ? keyStore.getEntry(str, null) : null;
        Intrinsics.copydefault(entry, "");
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
        KeyStore.PrivateKeyEntry keyPair$default = C47235tmH.getKeyPair$default(C47235tmH.OLrzqt, str, null, 2, null);
        java.security.cert.Certificate certificate = keyPair$default != null ? keyPair$default.getCertificate() : null;
        java.security.PublicKey publicKey = certificate != null ? certificate.getPublicKey() : null;
        ECPublicKey eCPublicKey = publicKey instanceof ECPublicKey ? (ECPublicKey) publicKey : null;
        if (eCPublicKey == null) {
            throw new java.lang.IllegalArgumentException("Public key is not EC");
        }
        return new C5700aBS((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).get(1), (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).get(2), (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).get(3), privateKeyEntry, AEQbTJ(eCPublicKey));
    }

    public final byte[] AEQbTJ(ECPublicKey eCPublicKey) {
        try {
            java.security.spec.ECPoint w = eCPublicKey.getW();
            byte[] byteArray = w.getAffineX().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            byte[] bArrKWHzl = KWHzl(byteArray);
            byte[] byteArray2 = w.getAffineY().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray2, "");
            java.util.Map<java.lang.Integer, ? extends java.lang.Object> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(1, 2), C56390yDp.OLrzqt(3, -7), C56390yDp.OLrzqt(-1, 1), C56390yDp.OLrzqt(-2, bArrKWHzl), C56390yDp.OLrzqt(-3, KWHzl(byteArray2)));
            C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "encodeCOSEKeyWithCBOR coseKeyMap: " + mapGEmmrt);
            return SimpleCBOREncoder.OLrzqt.EZpvd(mapGEmmrt);
        } catch (java.lang.Exception e) {
            C5689aBH.KWHzl.AEQbTJ("[GUARD_MANAGER]", "encodeCOSEKeyWithCBOR ex: " + e.getMessage());
            return new byte[0];
        }
    }

    public final byte[] KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 32) {
            return bArr;
        }
        if (bArr.length >= 32) {
            return bArr.length > 32 ? yDT.AEQbTJ(bArr, 1, 33) : bArr;
        }
        byte[] bArr2 = new byte[32];
        java.lang.System.arraycopy(bArr, 0, bArr2, 32 - bArr.length, bArr.length);
        return bArr2;
    }
}
