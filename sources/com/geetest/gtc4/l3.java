package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public final class l3 extends t0 {
    public final q5 h;
    public final r6 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l3(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.25");
        }
        p1 p1Var = new p1(new ByteArrayInputStream(q0.a((f) q0.a(extensionValue))));
        LinkedList linkedList = new LinkedList();
        while (true) {
            f3 f3VarA = p1Var.a();
            if (f3VarA == null) {
                break;
            } else {
                linkedList.add(f3VarA);
            }
        }
        int i = 0;
        q5 q5Var = (q5) linkedList.get(0);
        this.h = q5Var;
        Iterator it = q5Var.e.iterator();
        ArrayList arrayList = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                if (arrayList == null) {
                    i = -1;
                } else {
                    if (arrayList.size() != 5) {
                        throw new RuntimeException("Boot state map has unexpected size: " + arrayList.size());
                    }
                    if (((Boolean) arrayList.get(4)).booleanValue()) {
                        throw new RuntimeException("debug-permanent-disable must never be true: " + arrayList);
                    }
                    boolean zBooleanValue3 = ((Boolean) arrayList.get(0)).booleanValue();
                    if (zBooleanValue3 != ((Boolean) arrayList.get(1)).booleanValue() && zBooleanValue3 != ((Boolean) arrayList.get(2)).booleanValue() && zBooleanValue3 != ((Boolean) arrayList.get(3)).booleanValue()) {
                        throw new RuntimeException("Unexpected boot state: " + arrayList);
                    }
                    if (!zBooleanValue2) {
                        i = zBooleanValue3 ? 1 : 2;
                    } else if (!zBooleanValue3) {
                        throw new AssertionError("Non-verified official build");
                    }
                }
                this.i = new r6(bArrB, zBooleanValue, i, bArrB2);
                return;
            }
            f3 f3Var = (f3) it.next();
            int iIntValue = ((d6) f3Var).c.intValue();
            if (iIntValue == -76003) {
                q5 q5Var2 = this.h;
                l0 l0Var = (l0) ((f3) q5Var2.d.get(f3Var));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = l0Var.d.iterator();
                while (it2.hasNext()) {
                    v6 v6Var = ((u6) ((f3) it2.next())).e;
                    if (v6Var == v6.FALSE) {
                        arrayList2.add(Boolean.FALSE);
                    } else {
                        if (v6Var != v6.TRUE) {
                            throw new RuntimeException("Map contains more than booleans: " + q5Var2);
                        }
                        arrayList2.add(Boolean.TRUE);
                    }
                }
                arrayList = arrayList2;
            } else if (iIntValue == -76002) {
                int iD = r1.d(this.h, f3Var);
                if (iD == 1) {
                    i2 = 0;
                } else if (iD == 3) {
                    i2 = 1;
                } else if (iD != 4) {
                    throw new RuntimeException("Invalid EAT security level: " + iD);
                }
                this.c = i2;
            } else if (iIntValue == -76000) {
                q5 q5Var3 = (q5) ((f3) this.h.d.get(f3Var));
                this.f = new a1((q5) ((f3) q5Var3.d.get(new r7("software"))));
                this.g = new a1((q5) ((f3) q5Var3.d.get(new r7("tee"))));
            } else if (iIntValue == -75008) {
                this.d = r1.b(this.h, f3Var);
            } else if (iIntValue != 7) {
                switch (iIntValue) {
                    case -82006:
                        zBooleanValue2 = r1.a(this.h, f3Var).booleanValue();
                        break;
                    case -82005:
                        this.b = r1.d(this.h, f3Var);
                        break;
                    case -82004:
                        this.f511a = r1.d(this.h, f3Var);
                        break;
                    case -82003:
                        bArrB2 = r1.b(this.h, f3Var);
                        break;
                    case -82002:
                        zBooleanValue = r1.a(this.h, f3Var).booleanValue();
                        break;
                    case -82001:
                        bArrB = r1.b(this.h, f3Var);
                        break;
                    default:
                        throw new CertificateParsingException("Unknown EAT tag: " + f3Var + "\n in EAT extension:\n" + this);
                }
            } else {
                this.e = r1.b(this.h, f3Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.t0
    public final r6 b() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.t0
    public final String toString() {
        return super.toString() + "\nEncoded CBOR: " + this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.t0
    public final int a() {
        a1 a1Var = this.g;
        if (a1Var != null && a1Var.b != null) {
            return a1Var.f417a.intValue();
        }
        a1 a1Var2 = this.f;
        if (a1Var2 == null || a1Var2.b == null) {
            return -1;
        }
        return a1Var2.f417a.intValue();
    }
}
