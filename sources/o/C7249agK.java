package o;

import androidx.camera.video.AudioStats;
import com.ibm.icu.util.ULocale;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.agK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7249agK implements java.lang.Iterable<ULocale> {
    public final java.util.Map<ULocale, java.lang.Double> OLrzqt;
    public static final java.lang.Double KWHzl = java.lang.Double.valueOf(1.0d);
    public static final Pattern EZpvd = Pattern.compile("\\s*,\\s*");
    public static final Pattern copydefault = Pattern.compile("\\s*(\\S*)\\s*;\\s*q\\s*=\\s*(\\S*)");
    public static java.util.Comparator<java.lang.Double> AEQbTJ = new java.util.Comparator<java.lang.Double>() { // from class: o.agK.1
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.Double d, java.lang.Double d2) {
            int iCompareTo = d.compareTo(d2);
            if (iCompareTo > 0) {
                return -1;
            }
            return iCompareTo < 0 ? 1 : 0;
        }
    };

    public static Activity OLrzqt(java.lang.String str) {
        return new Activity().EZpvd(str);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (Map.Entry<ULocale, java.lang.Double> entry : this.OLrzqt.entrySet()) {
            ULocale key = entry.getKey();
            double dDoubleValue = entry.getValue().doubleValue();
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(key);
            if (dDoubleValue != 1.0d) {
                sb.append(";q=");
                sb.append(dDoubleValue);
            }
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<ULocale> iterator() {
        return this.OLrzqt.keySet().iterator();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            return this.OLrzqt.equals(((C7249agK) obj).OLrzqt);
        } catch (java.lang.RuntimeException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public C7249agK(java.util.Map<ULocale, java.lang.Double> map) {
        this.OLrzqt = map;
    }

    /* JADX INFO: renamed from: o.agK$Activity */
    public static class Activity {
        public boolean EZpvd;
        public java.util.Map<ULocale, java.lang.Double> OLrzqt;
        public C7249agK copydefault;

        private Activity() {
            this.EZpvd = false;
            this.OLrzqt = new LinkedHashMap();
        }

        public C7249agK KWHzl() {
            return KWHzl(false);
        }

        public C7249agK KWHzl(boolean z) {
            java.util.Map<ULocale, java.lang.Double> map;
            C7249agK c7249agK = this.copydefault;
            if (c7249agK != null) {
                return c7249agK;
            }
            if (this.EZpvd) {
                TreeMap treeMap = new TreeMap(C7249agK.AEQbTJ);
                for (Map.Entry<ULocale, java.lang.Double> entry : this.OLrzqt.entrySet()) {
                    ULocale key = entry.getKey();
                    java.lang.Double value = entry.getValue();
                    java.util.List linkedList = (java.util.List) treeMap.get(value);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        treeMap.put(value, linkedList);
                    }
                    linkedList.add(key);
                }
                if (treeMap.size() <= 1) {
                    map = this.OLrzqt;
                    if (treeMap.isEmpty() || ((java.lang.Double) treeMap.firstKey()).doubleValue() == 1.0d) {
                        this.EZpvd = false;
                    }
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        java.lang.Double d = z ? (java.lang.Double) entry2.getKey() : C7249agK.KWHzl;
                        java.util.Iterator it = ((java.util.List) entry2.getValue()).iterator();
                        while (it.hasNext()) {
                            linkedHashMap.put((ULocale) it.next(), d);
                        }
                    }
                    map = linkedHashMap;
                }
            } else {
                map = this.OLrzqt;
            }
            this.OLrzqt = null;
            C7249agK c7249agK2 = new C7249agK(Collections.unmodifiableMap(map));
            this.copydefault = c7249agK2;
            return c7249agK2;
        }

        public Activity KWHzl(ULocale uLocale) {
            return AEQbTJ(uLocale, 1.0d);
        }

        public Activity AEQbTJ(ULocale uLocale, double d) {
            java.lang.Double dValueOf;
            if (this.OLrzqt == null) {
                this.OLrzqt = new LinkedHashMap(this.copydefault.OLrzqt);
                this.copydefault = null;
            }
            if (this.OLrzqt.containsKey(uLocale)) {
                this.OLrzqt.remove(uLocale);
            }
            if (d <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return this;
            }
            if (d >= 1.0d) {
                dValueOf = C7249agK.KWHzl;
            } else {
                dValueOf = java.lang.Double.valueOf(d);
                this.EZpvd = true;
            }
            this.OLrzqt.put(uLocale, dValueOf);
            return this;
        }

        public Activity EZpvd(java.lang.String str) {
            java.lang.String[] strArrSplit = C7249agK.EZpvd.split(str.trim());
            Matcher matcher = C7249agK.copydefault.matcher("");
            for (java.lang.String str2 : strArrSplit) {
                if (matcher.reset(str2).matches()) {
                    ULocale uLocale = new ULocale(matcher.group(1));
                    double d = java.lang.Double.parseDouble(matcher.group(2));
                    if (AudioStats.AUDIO_AMPLITUDE_NONE > d || d > 1.0d) {
                        throw new java.lang.IllegalArgumentException("Illegal weight, must be 0..1: " + d);
                    }
                    AEQbTJ(uLocale, d);
                } else if (str2.length() != 0) {
                    KWHzl(new ULocale(str2));
                }
            }
            return this;
        }
    }
}
