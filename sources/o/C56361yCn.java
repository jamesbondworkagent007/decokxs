package o;

import j$.time.ZoneId;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import java.util.Objects;

/* JADX INFO: renamed from: o.yCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56361yCn {
    private java.util.ArrayList AEQbTJ;
    private final java.util.ArrayList EZpvd;
    private C56350yCc KWHzl;
    private boolean copydefault = true;
    private boolean OLrzqt = true;

    public java.lang.String toString() {
        return djBIcL().toString();
    }

    InterfaceC56365yCr OLrzqt(ResolverStyle resolverStyle, java.util.Set set) {
        C56363yCp c56363yCpDjBIcL = djBIcL();
        c56363yCpDjBIcL.EZpvd = KWHzl();
        ZoneId zoneIdAEQbTJ = c56363yCpDjBIcL.copydefault;
        if (zoneIdAEQbTJ == null) {
            zoneIdAEQbTJ = this.KWHzl.AEQbTJ();
        }
        c56363yCpDjBIcL.copydefault = zoneIdAEQbTJ;
        return c56363yCpDjBIcL.EZpvd(resolverStyle, set);
    }

    public boolean EZpvd(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (copydefault()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char cCharAt = charSequence.charAt(i + i5);
            char cCharAt2 = charSequence2.charAt(i2 + i5);
            if (cCharAt != cCharAt2 && java.lang.Character.toUpperCase(cCharAt) != java.lang.Character.toUpperCase(cCharAt2) && java.lang.Character.toLowerCase(cCharAt) != java.lang.Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    public void AYXKKw() {
        this.EZpvd.add(djBIcL().AEQbTJ());
    }

    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    public void valueOf() {
        djBIcL().AEQbTJ = true;
    }

    public int EZpvd(InterfaceC56372yCy interfaceC56372yCy, long j, int i, int i2) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        java.lang.Long l = (java.lang.Long) djBIcL().OLrzqt.put(interfaceC56372yCy, java.lang.Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public void KWHzl(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        djBIcL().copydefault = zoneId;
    }

    public void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    public boolean AhwBna() {
        return this.OLrzqt;
    }

    public boolean copydefault() {
        return this.copydefault;
    }

    public java.lang.Long copydefault(InterfaceC56372yCy interfaceC56372yCy) {
        return (java.lang.Long) djBIcL().OLrzqt.get(interfaceC56372yCy);
    }

    public java.util.Locale AEQbTJ() {
        return this.KWHzl.EZpvd();
    }

    public InterfaceC56351yCd KWHzl() {
        InterfaceC56351yCd interfaceC56351yCd = djBIcL().EZpvd;
        if (interfaceC56351yCd != null) {
            return interfaceC56351yCd;
        }
        InterfaceC56351yCd interfaceC56351yCdKWHzl = this.KWHzl.KWHzl();
        return interfaceC56351yCdKWHzl == null ? IsoChronology.INSTANCE : interfaceC56351yCdKWHzl;
    }

    public C56359yCl EZpvd() {
        return this.KWHzl.OLrzqt();
    }

    public void AEQbTJ(boolean z) {
        java.util.ArrayList arrayList;
        int size;
        if (z) {
            arrayList = this.EZpvd;
            size = arrayList.size() - 2;
        } else {
            arrayList = this.EZpvd;
            size = arrayList.size() - 1;
        }
        arrayList.remove(size);
    }

    public C56361yCn OLrzqt() {
        C56361yCn c56361yCn = new C56361yCn(this.KWHzl);
        c56361yCn.copydefault = this.copydefault;
        c56361yCn.OLrzqt = this.OLrzqt;
        return c56361yCn;
    }

    public boolean copydefault(char c, char c2) {
        return copydefault() ? c == c2 : KWHzl(c, c2);
    }

    public void AEQbTJ(java.util.function.Consumer consumer) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new java.util.ArrayList();
        }
        this.AEQbTJ.add(consumer);
    }

    private C56363yCp djBIcL() {
        return (C56363yCp) this.EZpvd.get(r0.size() - 1);
    }

    public static boolean KWHzl(char c, char c2) {
        return c == c2 || java.lang.Character.toUpperCase(c) == java.lang.Character.toUpperCase(c2) || java.lang.Character.toLowerCase(c) == java.lang.Character.toLowerCase(c2);
    }

    C56361yCn(C56350yCc c56350yCc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.EZpvd = arrayList;
        this.AEQbTJ = null;
        this.KWHzl = c56350yCc;
        arrayList.add(new C56363yCp());
    }
}
