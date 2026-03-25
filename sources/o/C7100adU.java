package o;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: o.adU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7100adU extends C7091adL {
    public static final C7100adU AEQbTJ;
    public static final SortedSet<java.lang.String> EZpvd = new TreeSet();
    public static final SortedMap<java.lang.String, java.lang.String> OLrzqt = new TreeMap();
    public static final C7100adU djBIcL;
    public SortedMap<java.lang.String, java.lang.String> AYXKKw;
    public SortedSet<java.lang.String> AhwBna;

    static {
        C7100adU c7100adU = new C7100adU();
        AEQbTJ = c7100adU;
        TreeMap treeMap = new TreeMap();
        c7100adU.AYXKKw = treeMap;
        treeMap.put("ca", "japanese");
        c7100adU.copydefault = "ca-japanese";
        C7100adU c7100adU2 = new C7100adU();
        djBIcL = c7100adU2;
        TreeMap treeMap2 = new TreeMap();
        c7100adU2.AYXKKw = treeMap2;
        treeMap2.put("nu", "thai");
        c7100adU2.copydefault = "nu-thai";
    }

    private C7100adU() {
        super('u');
        this.AhwBna = EZpvd;
        this.AYXKKw = OLrzqt;
    }

    public C7100adU(SortedSet<java.lang.String> sortedSet, SortedMap<java.lang.String, java.lang.String> sortedMap) {
        this();
        if (sortedSet != null && sortedSet.size() > 0) {
            this.AhwBna = sortedSet;
        }
        if (sortedMap != null && sortedMap.size() > 0) {
            this.AYXKKw = sortedMap;
        }
        if (this.AhwBna.size() > 0 || this.AYXKKw.size() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.String str : this.AhwBna) {
                sb.append("-");
                sb.append(str);
            }
            for (Map.Entry<java.lang.String, java.lang.String> entry : this.AYXKKw.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                sb.append("-");
                sb.append(key);
                if (value.length() > 0) {
                    sb.append("-");
                    sb.append(value);
                }
            }
            this.copydefault = sb.substring(1);
        }
    }

    public java.util.Set<java.lang.String> copydefault() {
        return Collections.unmodifiableSet(this.AhwBna);
    }

    public java.util.Set<java.lang.String> KWHzl() {
        return Collections.unmodifiableSet(this.AYXKKw.keySet());
    }

    public java.lang.String copydefault(java.lang.String str) {
        return this.AYXKKw.get(str);
    }

    public static boolean AEQbTJ(char c) {
        return 'u' == C7090adK.AEQbTJ(c);
    }

    public static boolean KWHzl(java.lang.String str) {
        return str.length() >= 3 && str.length() <= 8 && C7090adK.KWHzl(str);
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return str.length() == 2 && C7090adK.KWHzl(str.charAt(0)) && C7090adK.EZpvd(str.charAt(1));
    }

    public static boolean OLrzqt(java.lang.String str) {
        return str.length() >= 3 && str.length() <= 8 && C7090adK.KWHzl(str);
    }

    public static boolean EZpvd(java.lang.String str) {
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf("-", i);
            if (!OLrzqt(iIndexOf < 0 ? str.substring(i) : str.substring(i, iIndexOf))) {
                return false;
            }
            if (iIndexOf < 0) {
                return i < str.length();
            }
            i = iIndexOf + 1;
        }
    }
}
