package com.geetest.gtc4;

import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f511a;
    public int b;
    public int c;
    public byte[] d;
    public byte[] e;
    public a1 f;
    public a1 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t0(X509Certificate x509Certificate) {
        b(x509Certificate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t0 a(X509Certificate x509Certificate) throws CertificateParsingException {
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") == null && x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") == null) {
            throw new CertificateParsingException("No attestation extensions found");
        }
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") == null) {
            if (x509Certificate.getExtensionValue("2.5.29.31") == null) {
                return new p0(x509Certificate);
            }
            throw new CertificateParsingException("CRL Distribution Points extension found in leaf certificate.");
        }
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") != null) {
            throw new CertificateParsingException("Multiple attestation extensions found");
        }
        try {
            return new l3(x509Certificate);
        } catch (q1 e) {
            throw new CertificateParsingException("Unable to parse EAT extension", e);
        }
    }

    public abstract int a();

    public abstract r6 b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("Extension type: ");
        sb.append(getClass());
        sb.append("\nAttest version: ");
        int i = this.f511a;
        String str4 = "Keymaster version 4.0";
        if (i == 100) {
            str = "KeyMint version 1.0";
        } else if (i == 200) {
            str = "KeyMint version 2.0";
        } else if (i == 300) {
            str = "KeyMint version 3.0";
        } else if (i == 1) {
            str = "Keymaster version 2.0";
        } else if (i == 2) {
            str = "Keymaster version 3.0";
        } else if (i == 3) {
            str = "Keymaster version 4.0";
        } else if (i != 4) {
            str = "Unkown (" + i + ")";
        } else {
            str = "Keymaster version 4.1";
        }
        sb.append(str);
        sb.append("\nAttest security: ");
        int iA = a();
        String str5 = "StrongBox";
        if (iA == 0) {
            str2 = ExifInterface.TAG_SOFTWARE;
        } else if (iA == 1) {
            str2 = "TEE";
        } else if (iA != 2) {
            str2 = "Unknown (" + iA + ")";
        } else {
            str2 = "StrongBox";
        }
        sb.append(str2);
        sb.append("\nKM version: ");
        int i2 = this.b;
        if (i2 == 41) {
            str4 = "Keymaster version 4.1";
        } else if (i2 == 100) {
            str4 = "KeyMint version 1.0";
        } else if (i2 == 200) {
            str4 = "KeyMint version 2.0";
        } else if (i2 == 300) {
            str4 = "KeyMint version 3.0";
        } else if (i2 == 0) {
            str4 = "Keymaster version 0.2 or 0.3";
        } else if (i2 == 1) {
            str4 = "Keymaster version 1.0";
        } else if (i2 == 2) {
            str4 = "Keymaster version 2.0";
        } else if (i2 == 3) {
            str4 = "Keymaster version 3.0";
        } else if (i2 != 4) {
            str4 = "Unkown (" + i2 + ")";
        }
        sb.append(str4);
        sb.append("\nKM security: ");
        int i3 = this.c;
        if (i3 == 0) {
            str3 = ExifInterface.TAG_SOFTWARE;
        } else if (i3 != 1) {
            if (i3 != 2) {
                str5 = "Unknown (" + i3 + ")";
            }
            str3 = str5;
        } else {
            str3 = "TEE";
        }
        sb.append(str3);
        sb.append("\nChallenge");
        byte[] bArr = this.d;
        String str6 = bArr != null ? new String(bArr) : AbstractJsonLexerKt.NULL;
        char[] charArray = str6.toCharArray();
        int length = charArray.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                sb.append(": [");
                sb.append(str6);
                sb.append("]");
                break;
            }
            if (charArray[i4] > 127) {
                sb.append(" (base64): [");
                sb.append(Base64.encodeToString(this.d, 0));
                sb.append("]");
                break;
            }
            i4++;
        }
        if (this.e != null) {
            sb.append("\nUnique ID (base64): [");
            sb.append(Base64.encodeToString(this.e, 0));
            sb.append("]");
        }
        sb.append("\n-- SW enforced --");
        sb.append(this.f);
        sb.append("\n-- TEE enforced --");
        sb.append(this.g);
        return sb.toString();
    }

    public static void b(X509Certificate x509Certificate) {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection) x509Certificate.getCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: com.geetest.gtc4.t0$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t0.a((String) obj);
            }
        }).collect(Collectors.toSet()));
        hashSet.addAll((Collection) x509Certificate.getNonCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: com.geetest.gtc4.t0$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t0.b((String) obj);
            }
        }).collect(Collectors.toSet()));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = (((wrap:boolean:0x0002: INVOKE ("1.3.6.1.4.1.11129.2.1.17"), (r1v0 java.lang.String) VIRTUAL call: java.lang.String.equals(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (c), WRAPPED] (LINE:15)) == true || (wrap:boolean:0x000a: INVOKE ("1.3.6.1.4.1.11129.2.1.25"), (r1v0 java.lang.String) VIRTUAL call: java.lang.String.equals(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (c), WRAPPED]) == true)) ? false : true */
    public static /* synthetic */ boolean b(String str) {
        return ("1.3.6.1.4.1.11129.2.1.17".equals(str) || "1.3.6.1.4.1.11129.2.1.25".equals(str)) ? false : true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: NOT 
  (wrap:boolean:0x0002: INVOKE ("2.5.29.15"), (r1v0 java.lang.String) VIRTUAL call: java.lang.String.equals(java.lang.Object):boolean A[DONT_GENERATE, MD:(java.lang.Object):boolean (c), REMOVE, WRAPPED] (LINE:25))
 */
    public static /* synthetic */ boolean a(String str) {
        return !"2.5.29.15".equals(str);
    }
}
