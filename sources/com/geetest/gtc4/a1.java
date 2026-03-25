package com.geetest.gtc4;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateParsingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final Boolean H;
    public final Boolean I;
    public final Boolean J;
    public final Boolean K;
    public final Boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f417a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final Boolean f;
    public final Date g;
    public final Date h;
    public final Date i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f418o;
    public final Date p;
    public final Boolean q;
    public final Boolean r;
    public final r6 s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final v0 x;
    public final String y;
    public final String z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        map.put(1, "NONE");
        map.put(2, "OAEP");
        map.put(3, "PSS");
        map.put(4, "PKCS1 ENCRYPT");
        map.put(5, "PKCS1 SIGN");
        map.put(64, "PKCS7");
        HashMap map2 = new HashMap();
        map2.put(0, "NONE");
        map2.put(1, "MD5");
        map2.put(2, "SHA1");
        map2.put(3, "SHA224");
        map2.put(4, "SHA256");
        map2.put(5, "SHA384");
        map2.put(6, "SHA512");
        HashMap map3 = new HashMap();
        map3.put(1, "DECRYPT");
        map3.put(0, "ENCRYPT");
        map3.put(2, "SIGN");
        map3.put(3, "VERIFY");
        map3.put(5, "WRAP");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a1(f fVar) throws CertificateParsingException {
        f yVar;
        int i;
        f a0Var;
        if (!(fVar instanceof z)) {
            throw new CertificateParsingException("Expected sequence for authorization list, found ".concat(fVar.getClass().getName()));
        }
        z zVar = (z) fVar;
        int iK = zVar.k();
        int i2 = 0;
        if (iK == 0) {
            yVar = null;
        } else {
            try {
                f a0Var2 = zVar.f540a[0];
                if (a0Var2 instanceof z) {
                    z zVar2 = (z) a0Var2;
                    yVar = new y(zVar2, zVar2.k());
                } else {
                    if (a0Var2 instanceof b0) {
                        b0 b0Var = (b0) a0Var2;
                        int length = b0Var.f423a.length;
                        a0Var2 = new a0(b0Var);
                    }
                    yVar = a0Var2;
                }
                i2 = 1;
            } catch (IOException e) {
                throw new CertificateParsingException("Failed to parse ASN1 sequence", e);
            }
        }
        if (yVar != null && !(yVar instanceof d0)) {
            throw new CertificateParsingException("Expected tagged object, found ".concat(yVar.getClass().getName()));
        }
        d0 d0Var = (d0) yVar;
        while (d0Var != null) {
            int i3 = d0Var.c;
            f fVar2 = d0Var.d;
            w wVarD = fVar2 instanceof w ? (w) fVar2 : fVar2.d();
            wVarD.getClass();
            if (i3 == 1) {
                q0.a(wVarD);
            } else if (i3 == 2) {
                this.b = Integer.valueOf(q0.b(wVarD));
            } else if (i3 == 3) {
                this.c = Integer.valueOf(q0.b(wVarD));
            } else if (i3 == 5 || i3 == 6) {
                q0.a(wVarD);
            } else if (i3 == 600) {
                this.n = Boolean.TRUE;
            } else if (i3 == 601) {
                this.f418o = new String(q0.a((f) wVarD));
            } else if (i3 == 10) {
                this.d = Integer.valueOf(q0.b(wVarD));
            } else if (i3 == 200) {
                this.e = q0.c(wVarD);
            } else if (i3 == 203) {
                q0.a(wVarD);
            } else if (i3 == 303) {
                this.r = Boolean.TRUE;
            } else if (i3 == 305) {
                this.f = Boolean.TRUE;
            } else if (i3 == 405) {
                this.j = Integer.valueOf(q0.b(wVarD));
            } else if (i3 != 723) {
                switch (i3) {
                    case 400:
                        this.g = new Date(q0.c(wVarD).longValue());
                        break;
                    case 401:
                        this.h = new Date(q0.c(wVarD).longValue());
                        break;
                    case 402:
                        this.i = new Date(q0.c(wVarD).longValue());
                        break;
                    default:
                        switch (i3) {
                            case 503:
                                this.k = Boolean.TRUE;
                                break;
                            case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                                q0.b(wVarD);
                                break;
                            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                                this.l = Integer.valueOf(q0.b(wVarD));
                                break;
                            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                                this.m = Boolean.TRUE;
                                break;
                            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                                this.H = Boolean.TRUE;
                                break;
                            case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                                this.I = Boolean.TRUE;
                                break;
                            case 509:
                                this.J = Boolean.TRUE;
                                break;
                            default:
                                switch (i3) {
                                    case TypedValues.TransitionType.TYPE_FROM /* 701 */:
                                        this.p = new Date(q0.c(wVarD).longValue());
                                        break;
                                    case TypedValues.TransitionType.TYPE_TO /* 702 */:
                                        q0.b(wVarD);
                                        break;
                                    case 703:
                                        this.q = Boolean.TRUE;
                                        break;
                                    case TypedValues.TransitionType.TYPE_AUTO_TRANSITION /* 704 */:
                                        this.s = new r6(wVarD);
                                        break;
                                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                                        this.t = Integer.valueOf(q0.b(wVarD));
                                        break;
                                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                                        this.u = Integer.valueOf(q0.b(wVarD));
                                        break;
                                    default:
                                        switch (i3) {
                                            case 709:
                                                this.x = new v0(q0.a(q0.a((f) wVarD)));
                                                break;
                                            case 710:
                                                this.y = a(wVarD);
                                                break;
                                            case 711:
                                                this.z = a(wVarD);
                                                break;
                                            case 712:
                                                this.E = a(wVarD);
                                                break;
                                            case 713:
                                                this.A = a(wVarD);
                                                break;
                                            case 714:
                                                this.B = a(wVarD);
                                                break;
                                            case 715:
                                                this.D = a(wVarD);
                                                break;
                                            case 716:
                                                this.F = a(wVarD);
                                                break;
                                            case 717:
                                                this.G = a(wVarD);
                                                break;
                                            case 718:
                                                this.v = Integer.valueOf(q0.b(wVarD));
                                                break;
                                            case 719:
                                                this.w = Integer.valueOf(q0.b(wVarD));
                                                break;
                                            case 720:
                                                this.K = Boolean.TRUE;
                                                break;
                                            case 721:
                                                this.L = Boolean.TRUE;
                                                break;
                                            default:
                                                throw new CertificateParsingException("Unknown tag " + i3 + " found");
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.C = a(wVarD);
            }
            if (iK == i2) {
                i = i2;
                a0Var = null;
            } else {
                try {
                    i = i2 + 1;
                    a0Var = zVar.f540a[i2];
                    if (a0Var instanceof z) {
                        z zVar3 = (z) a0Var;
                        a0Var = new y(zVar3, zVar3.k());
                    } else if (a0Var instanceof b0) {
                        b0 b0Var2 = (b0) a0Var;
                        int length2 = b0Var2.f423a.length;
                        a0Var = new a0(b0Var2);
                    }
                } catch (IOException e2) {
                    throw new CertificateParsingException("Failed to parse ASN1 sequence", e2);
                }
            }
            if (a0Var != null && !(a0Var instanceof d0)) {
                throw new CertificateParsingException("Expected tagged object, found ".concat(a0Var.getClass().getName()));
            }
            d0Var = (d0) a0Var;
            i2 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(w wVar) throws CertificateParsingException {
        try {
            return q0.d(wVar);
        } catch (UnsupportedEncodingException e) {
            throw new CertificateParsingException("Error parsing ASN.1 value", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.b != null) {
            sb.append("\nAlgorithm: ");
            int iIntValue = this.b.intValue();
            if (iIntValue == 1) {
                str2 = "RSA";
            } else if (iIntValue == 3) {
                str2 = "ECDSA";
            } else if (iIntValue == 128) {
                str2 = "HMAC";
            } else if (iIntValue == 32) {
                str2 = BouncyCastleKeyManagementRepository.AES;
            } else if (iIntValue != 33) {
                str2 = "Unknown (" + iIntValue + ")";
            } else {
                str2 = "3DES";
            }
            sb.append(str2);
        }
        if (this.c != null) {
            sb.append("\nKeySize: ");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append("\nEC Curve: ");
            Integer num = this.d;
            if (num == null) {
                str = "NULL";
            } else {
                int iIntValue2 = num.intValue();
                if (iIntValue2 == 0) {
                    str = "secp224r1";
                } else if (iIntValue2 == 1) {
                    str = "secp256r1";
                } else if (iIntValue2 == 2) {
                    str = "secp384r1";
                } else if (iIntValue2 == 3) {
                    str = "secp521r1";
                } else if (iIntValue2 != 4) {
                    str = "unknown (" + num + ")";
                } else {
                    str = "CURVE_25519";
                }
            }
            sb.append(str);
        }
        if (this.e != null) {
            sb.append("\nRSA exponent: ");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append("\nEarly boot only");
        }
        if (this.g != null) {
            sb.append("\nActive: ");
            sb.append(DateFormat.getDateTimeInstance().format(this.g));
        }
        if (this.h != null) {
            sb.append("\nOrigination expire: ");
            sb.append(DateFormat.getDateTimeInstance().format(this.h));
        }
        if (this.i != null) {
            sb.append("\nUsage expire: ");
            sb.append(DateFormat.getDateTimeInstance().format(this.i));
        }
        if (this.j != null) {
            sb.append("\nUsage count limit: ");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append("\nNo Auth Required");
        }
        if (this.l != null) {
            sb.append("\nAuth timeout: ");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append("\nAllow While On Body");
        }
        if (this.n != null) {
            sb.append("\nAll Applications");
        }
        if (this.f418o != null) {
            sb.append("\nApplication ID: ");
            sb.append(this.f418o);
        }
        if (this.p != null) {
            sb.append("\nCreated: ");
            sb.append(DateFormat.getDateTimeInstance().format(this.p));
        }
        if (this.q != null) {
            sb.append("\nRollback resistant");
        }
        if (this.r != null) {
            sb.append("\nRollback resistance");
        }
        if (this.s != null) {
            sb.append("\nRoot of Trust:\n");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append("\nOS Version: ");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append("\nOS Patchlevel: ");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append("\nVendor Patchlevel: ");
            sb.append(this.v);
        }
        if (this.w != null) {
            sb.append("\nBoot Patchlevel: ");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append("\nAttestation Application Id:\n");
            sb.append(this.x);
        }
        if (this.H != null) {
            sb.append("\nUser presence required");
        }
        if (this.I != null) {
            sb.append("\nConfirmation required");
        }
        if (this.J != null) {
            sb.append("\nUnlocked Device Required");
        }
        if (this.K != null) {
            sb.append("\nDevice unique attestation");
        }
        if (this.L != null) {
            sb.append("\nIdentity Credential Key");
        }
        if (this.y != null) {
            sb.append("\nBrand: ");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append("\nDevice type: ");
            sb.append(this.z);
        }
        if (this.E != null) {
            sb.append("\nProduct: ");
            sb.append(this.E);
        }
        if (this.A != null) {
            sb.append("\nSerial: ");
            sb.append(this.A);
        }
        if (this.B != null) {
            sb.append("\nIMEI: ");
            sb.append(this.B);
        }
        if (this.C != null) {
            sb.append("\nSecond IMEI:");
            sb.append(this.C);
        }
        if (this.D != null) {
            sb.append("\nMEID: ");
            sb.append(this.D);
        }
        if (this.F != null) {
            sb.append("\nManufacturer: ");
            sb.append(this.F);
        }
        if (this.G != null) {
            sb.append("\nModel: ");
            sb.append(this.G);
        }
        return sb.toString();
    }

    public a1(q5 q5Var) throws CertificateParsingException {
        for (f3 f3Var : q5Var.e) {
            int iIntValue = ((d6) f3Var).c.intValue();
            if (iIntValue == -80706) {
                this.u = Integer.valueOf(r1.d(q5Var, f3Var));
            } else if (iIntValue == -80705) {
                this.t = Integer.valueOf(r1.d(q5Var, f3Var));
            } else if (iIntValue == -80703) {
                this.q = Boolean.TRUE;
            } else if (iIntValue == -80702) {
                r1.d(q5Var, f3Var);
            } else if (iIntValue == -80006) {
                r1.e(q5Var, f3Var);
            } else if (iIntValue != -80005) {
                switch (iIntValue) {
                    case -80720:
                        this.K = Boolean.TRUE;
                        break;
                    case -80719:
                        this.w = Integer.valueOf(r1.d(q5Var, f3Var));
                        break;
                    case -80718:
                        this.v = Integer.valueOf(r1.d(q5Var, f3Var));
                        break;
                    case -80717:
                        this.G = r1.f(q5Var, f3Var);
                        break;
                    case -80716:
                        this.F = r1.f(q5Var, f3Var);
                        break;
                    case -80715:
                        this.D = r1.f(q5Var, f3Var);
                        break;
                    default:
                        switch (iIntValue) {
                            case -80713:
                                this.A = r1.f(q5Var, f3Var);
                                break;
                            case -80712:
                                this.E = r1.f(q5Var, f3Var);
                                break;
                            case -80711:
                                this.z = r1.f(q5Var, f3Var);
                                break;
                            case -80710:
                                this.y = r1.f(q5Var, f3Var);
                                break;
                            case -80709:
                                this.x = new v0(q0.a(r1.b(q5Var, f3Var)));
                                break;
                            default:
                                switch (iIntValue) {
                                    case -80601:
                                        this.f418o = r1.f(q5Var, f3Var);
                                        break;
                                    case -80305:
                                        break;
                                    case -80303:
                                        this.r = Boolean.TRUE;
                                        continue;
                                    case -80203:
                                        r1.e(q5Var, f3Var);
                                        continue;
                                    case -80200:
                                        this.e = Long.valueOf(((d6) ((f3) q5Var.d.get(f3Var))).c.longValue());
                                        continue;
                                    case -80010:
                                        this.d = Integer.valueOf(r1.d(q5Var, f3Var));
                                        continue;
                                    case -76002:
                                        int iD = r1.d(q5Var, f3Var);
                                        int i = 1;
                                        if (iD == 1) {
                                            i = 0;
                                        } else if (iD != 3) {
                                            if (iD != 4) {
                                                throw new RuntimeException("Invalid EAT security level: " + iD);
                                            }
                                            i = 2;
                                        }
                                        this.f417a = Integer.valueOf(i);
                                        continue;
                                    case -75009:
                                        this.B = r1.f(q5Var, f3Var);
                                        continue;
                                    case 6:
                                        this.p = r1.c(q5Var, f3Var);
                                        continue;
                                    default:
                                        switch (iIntValue) {
                                            case -80509:
                                                this.J = Boolean.TRUE;
                                                break;
                                            case -80508:
                                                this.I = Boolean.TRUE;
                                                break;
                                            case -80507:
                                                this.H = r1.a(q5Var, f3Var);
                                                break;
                                            case -80506:
                                                this.m = Boolean.TRUE;
                                                break;
                                            case -80505:
                                                this.l = Integer.valueOf(r1.d(q5Var, f3Var));
                                                break;
                                            case -80504:
                                                r1.d(q5Var, f3Var);
                                                break;
                                            case -80503:
                                                this.k = Boolean.TRUE;
                                                continue;
                                            default:
                                                switch (iIntValue) {
                                                    case -80402:
                                                        this.i = r1.c(q5Var, f3Var);
                                                        break;
                                                    case -80401:
                                                        this.h = r1.c(q5Var, f3Var);
                                                        break;
                                                    case -80400:
                                                        this.g = r1.c(q5Var, f3Var);
                                                        break;
                                                    default:
                                                        switch (iIntValue) {
                                                            case -80003:
                                                                this.c = Integer.valueOf(r1.d(q5Var, f3Var));
                                                                break;
                                                            case -80002:
                                                                this.b = Integer.valueOf(r1.d(q5Var, f3Var));
                                                                break;
                                                            case -80001:
                                                                r1.e(q5Var, f3Var);
                                                                break;
                                                            default:
                                                                throw new CertificateParsingException("Unknown EAT tag: " + f3Var);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                this.f = Boolean.TRUE;
                                break;
                        }
                        break;
                }
            } else {
                r1.e(q5Var, f3Var);
            }
        }
    }
}
