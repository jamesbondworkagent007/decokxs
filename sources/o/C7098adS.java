package o;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import o.C7092adM;

/* JADX INFO: renamed from: o.adS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7098adS {
    public static final SortedMap<java.lang.Character, C7091adL> AEQbTJ;
    public static final C7098adS KWHzl;
    public static final C7098adS OLrzqt;
    public static final C7098adS copydefault;
    public java.lang.String EZpvd;
    public SortedMap<java.lang.Character, C7091adL> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.EZpvd;
    }

    static {
        SortedMap<java.lang.Character, C7091adL> sortedMapUnmodifiableSortedMap = Collections.unmodifiableSortedMap(new TreeMap());
        AEQbTJ = sortedMapUnmodifiableSortedMap;
        C7098adS c7098adS = new C7098adS();
        OLrzqt = c7098adS;
        c7098adS.EZpvd = "";
        c7098adS.djBIcL = sortedMapUnmodifiableSortedMap;
        C7098adS c7098adS2 = new C7098adS();
        KWHzl = c7098adS2;
        c7098adS2.EZpvd = "u-ca-japanese";
        TreeMap treeMap = new TreeMap();
        c7098adS2.djBIcL = treeMap;
        treeMap.put('u', C7100adU.AEQbTJ);
        C7098adS c7098adS3 = new C7098adS();
        copydefault = c7098adS3;
        c7098adS3.EZpvd = "u-nu-thai";
        TreeMap treeMap2 = new TreeMap();
        c7098adS3.djBIcL = treeMap2;
        treeMap2.put('u', C7100adU.djBIcL);
    }

    private C7098adS() {
    }

    public C7098adS(java.util.Map<C7092adM.ActionBar, java.lang.String> map, java.util.Set<C7092adM.Application> set, java.util.Map<C7092adM.Application, java.lang.String> map2) {
        TreeSet treeSet;
        boolean z = false;
        boolean z2 = map != null && map.size() > 0;
        boolean z3 = set != null && set.size() > 0;
        if (map2 != null && map2.size() > 0) {
            z = true;
        }
        if (!z2 && !z3 && !z) {
            this.djBIcL = AEQbTJ;
            this.EZpvd = "";
            return;
        }
        this.djBIcL = new TreeMap();
        if (z2) {
            for (Map.Entry<C7092adM.ActionBar, java.lang.String> entry : map.entrySet()) {
                char cAEQbTJ = C7090adK.AEQbTJ(entry.getKey().EZpvd());
                java.lang.String value = entry.getValue();
                if (!C7096adQ.EZpvd(cAEQbTJ) || (value = C7092adM.copydefault(value)) != null) {
                    this.djBIcL.put(java.lang.Character.valueOf(cAEQbTJ), new C7091adL(cAEQbTJ, C7090adK.AEQbTJ(value)));
                }
            }
        }
        if (z3 || z) {
            TreeMap treeMap = null;
            if (z3) {
                treeSet = new TreeSet();
                java.util.Iterator<C7092adM.Application> it = set.iterator();
                while (it.hasNext()) {
                    treeSet.add(C7090adK.AEQbTJ(it.next().EZpvd()));
                }
            } else {
                treeSet = null;
            }
            if (z) {
                treeMap = new TreeMap();
                for (Map.Entry<C7092adM.Application, java.lang.String> entry2 : map2.entrySet()) {
                    treeMap.put(C7090adK.AEQbTJ(entry2.getKey().EZpvd()), C7090adK.AEQbTJ(entry2.getValue()));
                }
            }
            this.djBIcL.put('u', new C7100adU(treeSet, treeMap));
        }
        if (this.djBIcL.size() != 0) {
            this.EZpvd = AEQbTJ(this.djBIcL);
        } else {
            this.djBIcL = AEQbTJ;
            this.EZpvd = "";
        }
    }

    public java.util.Set<java.lang.Character> copydefault() {
        return Collections.unmodifiableSet(this.djBIcL.keySet());
    }

    public C7091adL AEQbTJ(java.lang.Character ch) {
        return this.djBIcL.get(java.lang.Character.valueOf(C7090adK.AEQbTJ(ch.charValue())));
    }

    public java.lang.String EZpvd(java.lang.Character ch) {
        C7091adL c7091adL = this.djBIcL.get(java.lang.Character.valueOf(C7090adK.AEQbTJ(ch.charValue())));
        if (c7091adL == null) {
            return null;
        }
        return c7091adL.AEQbTJ();
    }

    public java.util.Set<java.lang.String> KWHzl() {
        C7091adL c7091adL = this.djBIcL.get('u');
        if (c7091adL == null) {
            return Collections.emptySet();
        }
        return ((C7100adU) c7091adL).copydefault();
    }

    public java.util.Set<java.lang.String> EZpvd() {
        C7091adL c7091adL = this.djBIcL.get('u');
        if (c7091adL == null) {
            return Collections.emptySet();
        }
        return ((C7100adU) c7091adL).KWHzl();
    }

    public java.lang.String OLrzqt(java.lang.String str) {
        C7091adL c7091adL = this.djBIcL.get('u');
        if (c7091adL == null) {
            return null;
        }
        return ((C7100adU) c7091adL).copydefault(C7090adK.AEQbTJ(str));
    }

    public static boolean KWHzl(char c) {
        return C7096adQ.AEQbTJ(c) || C7096adQ.EZpvd(c);
    }

    public static boolean EZpvd(java.lang.String str) {
        return C7100adU.AEQbTJ(str);
    }

    public static java.lang.String AEQbTJ(SortedMap<java.lang.Character, C7091adL> sortedMap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        C7091adL c7091adL = null;
        for (Map.Entry<java.lang.Character, C7091adL> entry : sortedMap.entrySet()) {
            char cCharValue = entry.getKey().charValue();
            C7091adL value = entry.getValue();
            if (C7096adQ.EZpvd(cCharValue)) {
                c7091adL = value;
            } else {
                if (sb.length() > 0) {
                    sb.append("-");
                }
                sb.append(value);
            }
        }
        if (c7091adL != null) {
            if (sb.length() > 0) {
                sb.append("-");
            }
            sb.append(c7091adL);
        }
        return sb.toString();
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7098adS) {
            return this.EZpvd.equals(((C7098adS) obj).EZpvd);
        }
        return false;
    }
}
