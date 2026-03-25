package com.geetest.gtc4;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f520a;
    public final ArrayList b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v0(w wVar) throws CertificateParsingException {
        if (!(wVar instanceof z)) {
            throw new CertificateParsingException("Expected sequence for AttestationApplicationId, found ".concat(wVar.getClass().getName()));
        }
        z zVar = (z) wVar;
        f fVarA = zVar.a(0);
        if (!(fVarA instanceof b0)) {
            throw new CertificateParsingException("Expected set for AttestationApplicationsInfos, found ".concat(fVarA.getClass().getName()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((b0) fVarA).iterator();
        while (true) {
            n0 n0Var = (n0) it;
            if (!n0Var.hasNext()) {
                break;
            } else {
                arrayList.add(new y0((f) n0Var.next()));
            }
        }
        this.f520a = arrayList;
        Collections.sort(arrayList);
        f fVarA2 = zVar.a(1);
        if (!(fVarA2 instanceof b0)) {
            throw new CertificateParsingException("Expected set for Signature digests, found ".concat(fVarA2.getClass().getName()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((b0) fVarA2).iterator();
        while (true) {
            n0 n0Var2 = (n0) it2;
            if (!n0Var2.hasNext()) {
                this.b = arrayList2;
                Collections.sort(arrayList2, new u0());
                return;
            }
            arrayList2.add(q0.a((f) n0Var2.next()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(v0 v0Var) {
        int iCompare = Integer.compare(this.f520a.size(), v0Var.f520a.size());
        if (iCompare != 0) {
            return iCompare;
        }
        for (int i = 0; i < this.f520a.size(); i++) {
            y0 y0Var = (y0) this.f520a.get(i);
            y0 y0Var2 = (y0) v0Var.f520a.get(i);
            int iCompareTo = y0Var.f536a.compareTo(y0Var2.f536a);
            if (iCompareTo == 0) {
                iCompareTo = Long.compare(y0Var.b, y0Var2.b);
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        int iCompare2 = Integer.compare(this.b.size(), v0Var.b.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            byte[] bArr2 = (byte[]) v0Var.b.get(i2);
            int iCompare3 = Integer.compare(bArr.length, bArr2.length);
            if (iCompare3 == 0) {
                for (int i3 = 0; i3 < bArr.length && (iCompare3 = Byte.compare(bArr[i3], bArr2[i3])) == 0; i3++) {
                }
            }
            iCompare2 = iCompare3;
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return iCompare2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof v0) && compareTo((v0) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.f520a.size();
        int i = 1;
        int i2 = 1;
        for (y0 y0Var : this.f520a) {
            sb.append("Package info ");
            sb.append(i2);
            sb.append("/");
            sb.append(size);
            sb.append(":\n");
            sb.append(y0Var);
            i2++;
        }
        sb.append('\n');
        int size2 = this.b.size();
        for (byte[] bArr : this.b) {
            sb.append("Signature digest ");
            sb.append(i);
            sb.append("/");
            sb.append(size2);
            sb.append(":\n");
            for (byte b : bArr) {
                sb.append(String.format("%02X ", Byte.valueOf(b)));
            }
            sb.append('\n');
            i++;
        }
        return sb.toString();
    }
}
