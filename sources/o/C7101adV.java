package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.ULocale;
import java.util.Collections;
import java.util.MissingResourceException;
import java.util.TreeMap;
import o.C7043acQ;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.adV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7101adV {
    public static final C7101adV AEQbTJ = new C7101adV(Application.KWHzl());
    public final long AYXKKw;
    public final long[] AhwBna = new long[26];
    public final C7093adN[] EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final int copydefault;
    public final BytesTrie gEmmrt;
    public final long valueOf;

    /* JADX INFO: renamed from: o.adV$Application */
    public static final class Application {
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public final byte[] KWHzl;
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public final C7093adN[] copydefault;

        public int hashCode() {
            return 1;
        }

        public Application(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, byte[] bArr, C7093adN[] c7093adNArr) {
            this.OLrzqt = map;
            this.EZpvd = map2;
            this.KWHzl = bArr;
            this.copydefault = c7093adNArr;
        }

        public static C7043acQ.TaskDescription KWHzl(C7043acQ.StateListAnimator stateListAnimator, java.lang.String str, C7043acQ.TaskDescription taskDescription) {
            if (stateListAnimator.copydefault(str, taskDescription)) {
                return taskDescription;
            }
            throw new MissingResourceException("langInfo.res missing data", "", "likely/" + str);
        }

        public static Application KWHzl() throws MissingResourceException {
            java.util.Map mapEmptyMap;
            java.util.Map mapEmptyMap2;
            C7043acQ.TaskDescription taskDescriptionAYXKKw = ICUResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", "langInfo", ICUResourceBundle.AEQbTJ, ICUResourceBundle.OpenType.DIRECT).AYXKKw("likely");
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescriptionAYXKKw.valueOf();
            if (stateListAnimatorValueOf.copydefault("languageAliases", taskDescriptionAYXKKw)) {
                java.lang.String[] strArrGEmmrt = taskDescriptionAYXKKw.gEmmrt();
                mapEmptyMap = new java.util.HashMap(strArrGEmmrt.length / 2);
                for (int i = 0; i < strArrGEmmrt.length; i += 2) {
                    mapEmptyMap.put(strArrGEmmrt[i], strArrGEmmrt[i + 1]);
                }
            } else {
                mapEmptyMap = Collections.emptyMap();
            }
            if (stateListAnimatorValueOf.copydefault("regionAliases", taskDescriptionAYXKKw)) {
                java.lang.String[] strArrGEmmrt2 = taskDescriptionAYXKKw.gEmmrt();
                mapEmptyMap2 = new java.util.HashMap(strArrGEmmrt2.length / 2);
                for (int i2 = 0; i2 < strArrGEmmrt2.length; i2 += 2) {
                    mapEmptyMap2.put(strArrGEmmrt2[i2], strArrGEmmrt2[i2 + 1]);
                }
            } else {
                mapEmptyMap2 = Collections.emptyMap();
            }
            java.nio.ByteBuffer byteBufferEZpvd = KWHzl(stateListAnimatorValueOf, "trie", taskDescriptionAYXKKw).EZpvd();
            byte[] bArr = new byte[byteBufferEZpvd.remaining()];
            byteBufferEZpvd.get(bArr);
            java.lang.String[] strArrGEmmrt3 = KWHzl(stateListAnimatorValueOf, "lsrs", taskDescriptionAYXKKw).gEmmrt();
            C7093adN[] c7093adNArr = new C7093adN[strArrGEmmrt3.length / 3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < strArrGEmmrt3.length) {
                c7093adNArr[i4] = new C7093adN(strArrGEmmrt3[i3], strArrGEmmrt3[i3 + 1], strArrGEmmrt3[i3 + 2], 0);
                i3 += 3;
                i4++;
            }
            return new Application(mapEmptyMap, mapEmptyMap2, bArr, c7093adNArr);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Application.class.equals(obj.getClass())) {
                return false;
            }
            Application application = (Application) obj;
            return this.OLrzqt.equals(application.OLrzqt) && this.EZpvd.equals(application.EZpvd) && java.util.Arrays.equals(this.KWHzl, application.KWHzl) && java.util.Arrays.equals(this.copydefault, application.copydefault);
        }
    }

    public C7101adV(Application application) {
        this.OLrzqt = application.OLrzqt;
        this.KWHzl = application.EZpvd;
        BytesTrie bytesTrie = new BytesTrie(application.KWHzl, 0);
        this.gEmmrt = bytesTrie;
        this.EZpvd = application.copydefault;
        bytesTrie.AEQbTJ(42);
        this.AYXKKw = bytesTrie.KWHzl();
        bytesTrie.AEQbTJ(42);
        this.valueOf = bytesTrie.KWHzl();
        bytesTrie.AEQbTJ(42);
        this.copydefault = bytesTrie.EZpvd();
        bytesTrie.AEQbTJ();
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            if (this.gEmmrt.AEQbTJ(c) == BytesTrie.Result.NO_VALUE) {
                this.AhwBna[c - 'a'] = this.gEmmrt.KWHzl();
            }
            this.gEmmrt.AEQbTJ();
        }
    }

    public static java.lang.String EZpvd(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.lang.String str2 = map.get(str);
        return str2 == null ? str : str2;
    }

    public C7093adN OLrzqt(ULocale uLocale) {
        if (uLocale.getName().startsWith("@x=")) {
            return new C7093adN(uLocale.toLanguageTag(), "", "", 7);
        }
        return copydefault(uLocale.getLanguage(), uLocale.getScript(), uLocale.getCountry(), uLocale.getVariant());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7093adN copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        byte b = 0;
        if (str3.length() == 2 && str3.charAt(0) == 'X') {
            switch (str3.charAt(1)) {
                case 'A':
                    return new C7093adN("'" + str, "'" + str2, str3, 7);
                case 'B':
                    return new C7093adN(Marker.ANY_NON_NULL_MARKER + str, Marker.ANY_NON_NULL_MARKER + str2, str3, 7);
                case 'C':
                    return new C7093adN("," + str, "," + str2, str3, 7);
            }
        }
        if (str4.startsWith("PS")) {
            int i = str3.isEmpty() ? 6 : 7;
            int iHashCode = str4.hashCode();
            if (iHashCode == -1925944433) {
                if (!str4.equals("PSBIDI")) {
                }
                if (b == 0) {
                }
            } else if (iHashCode != 264103053) {
                b = (iHashCode == 426453367 && str4.equals("PSCRACK")) ? (byte) 2 : (byte) -1;
                if (b == 0) {
                    java.lang.String str5 = Marker.ANY_NON_NULL_MARKER + str;
                    java.lang.String str6 = Marker.ANY_NON_NULL_MARKER + str2;
                    if (str3.isEmpty()) {
                        str3 = "XB";
                    }
                    return new C7093adN(str5, str6, str3, i);
                }
                if (b == 1) {
                    java.lang.String str7 = "'" + str;
                    java.lang.String str8 = "'" + str2;
                    if (str3.isEmpty()) {
                        str3 = "XA";
                    }
                    return new C7093adN(str7, str8, str3, i);
                }
                if (b == 2) {
                    java.lang.String str9 = "," + str;
                    java.lang.String str10 = "," + str2;
                    if (str3.isEmpty()) {
                        str3 = "XC";
                    }
                    return new C7093adN(str9, str10, str3, i);
                }
            } else {
                if (str4.equals("PSACCENT")) {
                    b = 1;
                }
                if (b == 0) {
                }
            }
        }
        return KWHzl(EZpvd(this.OLrzqt, str), str2, EZpvd(this.KWHzl, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3 A[PHI: r7
  0x00d3: PHI (r7v12 int) = (r7v7 int), (r7v6 int) binds: [B:60:0x00d1, B:55:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7093adN KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int iAEQbTJ;
        long jKWHzl;
        int iCharAt;
        java.lang.String str4 = com.google.android.exoplayer2.C.LANGUAGE_UNDETERMINED;
        java.lang.String str5 = str;
        if (str5.equals(com.google.android.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
            str5 = "";
        }
        java.lang.String str6 = str2;
        if (str6.equals("Zzzz")) {
            str6 = "";
        }
        java.lang.String str7 = str3;
        if (str7.equals("ZZ")) {
            str7 = "";
        }
        if (!str6.isEmpty() && !str7.isEmpty() && !str5.isEmpty()) {
            return new C7093adN(str5, str6, str7, 7);
        }
        BytesTrie bytesTrie = new BytesTrie(this.gEmmrt);
        if (str5.length() < 2 || str5.charAt(0) - 'a' < 0 || iCharAt > 25) {
            iAEQbTJ = AEQbTJ(bytesTrie, str5, 0);
        } else {
            long j = this.AhwBna[iCharAt];
            if (j != 0) {
                iAEQbTJ = AEQbTJ(bytesTrie.EZpvd(j), str5, 1);
            }
        }
        if (iAEQbTJ >= 0) {
            i = str5.isEmpty() ? 0 : 4;
            jKWHzl = bytesTrie.KWHzl();
        } else {
            bytesTrie.EZpvd(this.AYXKKw);
            jKWHzl = 0;
        }
        if (iAEQbTJ > 0) {
            if (iAEQbTJ == 1) {
                iAEQbTJ = 0;
            }
            if (!str6.isEmpty()) {
                i |= 2;
            }
        } else {
            iAEQbTJ = AEQbTJ(bytesTrie, str6, 0);
            if (iAEQbTJ >= 0) {
                if (!str6.isEmpty()) {
                    i |= 2;
                }
                jKWHzl = bytesTrie.KWHzl();
            } else {
                i |= 2;
                if (jKWHzl == 0) {
                    bytesTrie.EZpvd(this.valueOf);
                } else {
                    bytesTrie.EZpvd(jKWHzl);
                    iAEQbTJ = AEQbTJ(bytesTrie, "", 0);
                    jKWHzl = bytesTrie.KWHzl();
                }
            }
        }
        if (iAEQbTJ > 0) {
            if (!str7.isEmpty()) {
                i |= 1;
            }
        } else {
            iAEQbTJ = AEQbTJ(bytesTrie, str7, 0);
            if (iAEQbTJ < 0) {
                i |= 1;
                if (jKWHzl == 0) {
                    iAEQbTJ = this.copydefault;
                } else {
                    bytesTrie.EZpvd(jKWHzl);
                    iAEQbTJ = AEQbTJ(bytesTrie, "", 0);
                }
            } else if (!str7.isEmpty()) {
            }
        }
        C7093adN c7093adN = this.EZpvd[iAEQbTJ];
        if (!str5.isEmpty()) {
            str4 = str5;
        }
        if (i == 0) {
            return c7093adN;
        }
        if ((i & 4) == 0) {
            str4 = c7093adN.EZpvd;
        }
        if ((i & 2) == 0) {
            str6 = c7093adN.OLrzqt;
        }
        if ((i & 1) == 0) {
            str7 = c7093adN.AEQbTJ;
        }
        return new C7093adN(str4, str6, str7, i);
    }

    public int EZpvd(C7093adN c7093adN, C7093adN c7093adN2, int i) {
        int iKWHzl;
        int iKWHzl2;
        if (!c7093adN.EZpvd.equals(c7093adN2.EZpvd)) {
            return -4;
        }
        if (!c7093adN.OLrzqt.equals(c7093adN2.OLrzqt)) {
            if (i < 0 || (i & 2) != 0) {
                iKWHzl2 = KWHzl(c7093adN.EZpvd, "");
                i = iKWHzl2 << 2;
            } else {
                iKWHzl2 = i >> 2;
            }
            return c7093adN.OLrzqt.equals(this.EZpvd[iKWHzl2].OLrzqt) ? i | 1 : i & (-2);
        }
        if (c7093adN.AEQbTJ.equals(c7093adN2.AEQbTJ)) {
            return i & (-2);
        }
        if (i < 0 || (i & 2) == 0) {
            iKWHzl = KWHzl(c7093adN.EZpvd, c7093adN.AEQbTJ);
            i = (iKWHzl << 2) | 2;
        } else {
            iKWHzl = i >> 2;
        }
        return c7093adN.AEQbTJ.equals(this.EZpvd[iKWHzl].AEQbTJ) ? i | 1 : i & (-2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KWHzl(java.lang.String str, java.lang.String str2) {
        int iAEQbTJ;
        long jKWHzl;
        int iCharAt;
        if (str.equals(com.google.android.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
            str = "";
        }
        if (str2.equals("Zzzz")) {
            str2 = "";
        }
        BytesTrie bytesTrie = new BytesTrie(this.gEmmrt);
        if (str.length() < 2 || str.charAt(0) - 'a' < 0 || iCharAt > 25) {
            iAEQbTJ = AEQbTJ(bytesTrie, str, 0);
        } else {
            long j = this.AhwBna[iCharAt];
            if (j != 0) {
                iAEQbTJ = AEQbTJ(bytesTrie.EZpvd(j), str, 1);
            }
        }
        if (iAEQbTJ >= 0) {
            jKWHzl = bytesTrie.KWHzl();
        } else {
            bytesTrie.EZpvd(this.AYXKKw);
            jKWHzl = 0;
        }
        if (iAEQbTJ <= 0) {
            iAEQbTJ = AEQbTJ(bytesTrie, str2, 0);
            if (iAEQbTJ >= 0) {
                bytesTrie.KWHzl();
            } else if (jKWHzl == 0) {
                bytesTrie.EZpvd(this.valueOf);
            } else {
                bytesTrie.EZpvd(jKWHzl);
                iAEQbTJ = AEQbTJ(bytesTrie, "", 0);
                bytesTrie.KWHzl();
            }
        } else if (iAEQbTJ == 1) {
            iAEQbTJ = 0;
        }
        return iAEQbTJ > 0 ? iAEQbTJ : AEQbTJ(bytesTrie, "", 0);
    }

    public static final int AEQbTJ(BytesTrie bytesTrie, java.lang.String str, int i) {
        BytesTrie.Result resultAEQbTJ;
        if (str.isEmpty()) {
            resultAEQbTJ = bytesTrie.AEQbTJ(42);
        } else {
            int length = str.length();
            while (true) {
                char cCharAt = str.charAt(i);
                if (i < length - 1) {
                    if (!bytesTrie.AEQbTJ(cCharAt).hasNext()) {
                        return -1;
                    }
                    i++;
                } else {
                    resultAEQbTJ = bytesTrie.AEQbTJ(cCharAt | 128);
                    break;
                }
            }
        }
        int i2 = AnonymousClass1.copydefault[resultAEQbTJ.ordinal()];
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return 1;
        }
        if (i2 != 4) {
            return -1;
        }
        return bytesTrie.EZpvd();
    }

    /* JADX INFO: renamed from: o.adV$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[BytesTrie.Result.values().length];
            copydefault = iArr;
            try {
                iArr[BytesTrie.Result.NO_MATCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[BytesTrie.Result.NO_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[BytesTrie.Result.INTERMEDIATE_VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[BytesTrie.Result.FINAL_VALUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final java.util.Map<java.lang.String, C7093adN> EZpvd() {
        TreeMap treeMap = new TreeMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        BytesTrie.ActionBar it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            BytesTrie.Application next = it.next();
            sb.setLength(0);
            int iEZpvd = next.EZpvd();
            for (int i = 0; i < iEZpvd; i++) {
                byte bOLrzqt = next.OLrzqt(i);
                if (bOLrzqt == 42) {
                    sb.append("*-");
                } else if (bOLrzqt >= 0) {
                    sb.append((char) bOLrzqt);
                } else {
                    sb.append((char) (bOLrzqt & 127));
                    sb.append('-');
                }
            }
            sb.setLength(sb.length() - 1);
            treeMap.put(sb.toString(), this.EZpvd[next.OLrzqt]);
        }
        return treeMap;
    }

    public java.lang.String toString() {
        return EZpvd().toString();
    }
}
