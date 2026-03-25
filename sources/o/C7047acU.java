package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.OlsonTimeZone;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.util.SimpleTimeZone;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.UResourceBundle;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.MissingResourceException;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.acU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7047acU {
    public static java.lang.String[] AhwBna;
    public static SoftReference<java.util.Set<java.lang.String>> EZpvd;
    public static final StateListAnimator KWHzl;
    public static SoftReference<java.util.Set<java.lang.String>> OLrzqt;
    public static SoftReference<java.util.Set<java.lang.String>> copydefault;
    public static final Application djBIcL;
    public static InterfaceC7054acb<java.lang.String, java.lang.String> AEQbTJ = new C7027acA();
    public static InterfaceC7054acb<java.lang.String, java.lang.String> gEmmrt = new C7027acA();
    public static InterfaceC7054acb<java.lang.String, java.lang.Boolean> valueOf = new C7027acA();

    public static java.util.Set<java.lang.String> EZpvd() {
        java.util.Set<java.lang.String> setUnmodifiableSet;
        synchronized (C7047acU.class) {
            SoftReference<java.util.Set<java.lang.String>> softReference = OLrzqt;
            setUnmodifiableSet = softReference != null ? softReference.get() : null;
            if (setUnmodifiableSet == null) {
                TreeSet treeSet = new TreeSet();
                for (java.lang.String str : OLrzqt()) {
                    if (!str.equals(TimeZone.UNKNOWN_ZONE_ID)) {
                        treeSet.add(str);
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                OLrzqt = new SoftReference<>(setUnmodifiableSet);
            }
        }
        return setUnmodifiableSet;
    }

    public static java.util.Set<java.lang.String> AEQbTJ() {
        java.util.Set<java.lang.String> setUnmodifiableSet;
        synchronized (C7047acU.class) {
            SoftReference<java.util.Set<java.lang.String>> softReference = EZpvd;
            setUnmodifiableSet = softReference != null ? softReference.get() : null;
            if (setUnmodifiableSet == null) {
                TreeSet treeSet = new TreeSet();
                for (java.lang.String str : OLrzqt()) {
                    if (!str.equals(TimeZone.UNKNOWN_ZONE_ID) && str.equals(KWHzl(str))) {
                        treeSet.add(str);
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                EZpvd = new SoftReference<>(setUnmodifiableSet);
            }
        }
        return setUnmodifiableSet;
    }

    public static java.util.Set<java.lang.String> KWHzl() {
        java.util.Set<java.lang.String> setUnmodifiableSet;
        java.lang.String strGEmmrt;
        synchronized (C7047acU.class) {
            SoftReference<java.util.Set<java.lang.String>> softReference = copydefault;
            setUnmodifiableSet = softReference != null ? softReference.get() : null;
            if (setUnmodifiableSet == null) {
                TreeSet treeSet = new TreeSet();
                for (java.lang.String str : OLrzqt()) {
                    if (!str.equals(TimeZone.UNKNOWN_ZONE_ID) && str.equals(KWHzl(str)) && (strGEmmrt = gEmmrt(str)) != null && !strGEmmrt.equals("001")) {
                        treeSet.add(str);
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                copydefault = new SoftReference<>(setUnmodifiableSet);
            }
        }
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: o.acU$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[TimeZone.SystemTimeZoneType.values().length];
            OLrzqt = iArr;
            try {
                iArr[TimeZone.SystemTimeZoneType.ANY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[TimeZone.SystemTimeZoneType.CANONICAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[TimeZone.SystemTimeZoneType.CANONICAL_LOCATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static java.util.Set<java.lang.String> EZpvd(TimeZone.SystemTimeZoneType systemTimeZoneType, java.lang.String str, java.lang.Integer num) {
        java.util.Set<java.lang.String> setEZpvd;
        OlsonTimeZone olsonTimeZoneDjBIcL;
        int i = AnonymousClass2.OLrzqt[systemTimeZoneType.ordinal()];
        if (i == 1) {
            setEZpvd = EZpvd();
        } else if (i == 2) {
            setEZpvd = AEQbTJ();
        } else if (i == 3) {
            setEZpvd = KWHzl();
        } else {
            throw new java.lang.IllegalArgumentException("Unknown SystemTimeZoneType");
        }
        if (str == null && num == null) {
            return setEZpvd;
        }
        if (str != null) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        TreeSet treeSet = new TreeSet();
        for (java.lang.String str2 : setEZpvd) {
            if (str == null || str.equals(gEmmrt(str2))) {
                if (num == null || ((olsonTimeZoneDjBIcL = djBIcL(str2)) != null && num.equals(java.lang.Integer.valueOf(olsonTimeZoneDjBIcL.getRawOffset())))) {
                    treeSet.add(str2);
                }
            }
        }
        if (treeSet.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public static int OLrzqt(java.lang.String str) {
        int length;
        synchronized (C7047acU.class) {
            UResourceBundle uResourceBundleKWHzl = KWHzl(null, str);
            if (uResourceBundleKWHzl != null) {
                try {
                    length = uResourceBundleKWHzl.isConnected("links").uzCIH().length;
                } catch (MissingResourceException unused) {
                    length = 0;
                }
            } else {
                length = 0;
            }
        }
        return length;
    }

    public static java.lang.String copydefault(java.lang.String str, int i) {
        java.lang.String str2;
        int[] iArrUzCIH;
        synchronized (C7047acU.class) {
            str2 = "";
            if (i >= 0) {
                UResourceBundle uResourceBundleKWHzl = KWHzl(null, str);
                if (uResourceBundleKWHzl != null) {
                    try {
                        iArrUzCIH = uResourceBundleKWHzl.isConnected("links").uzCIH();
                    } catch (MissingResourceException unused) {
                    }
                    int i2 = i < iArrUzCIH.length ? iArrUzCIH[i] : -1;
                    if (i2 >= 0) {
                        java.lang.String strOLrzqt = OLrzqt(i2);
                        if (strOLrzqt != null) {
                            str2 = strOLrzqt;
                        }
                    }
                }
            }
        }
        return str2;
    }

    public static java.lang.String[] OLrzqt() {
        java.lang.String[] strArr;
        synchronized (C7047acU.class) {
            if (AhwBna == null) {
                try {
                    AhwBna = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64", ICUResourceBundle.AEQbTJ).getStringArray("Names");
                } catch (MissingResourceException unused) {
                }
            }
            if (AhwBna == null) {
                AhwBna = new java.lang.String[0];
            }
            strArr = AhwBna;
        }
        return strArr;
    }

    public static java.lang.String OLrzqt(int i) {
        if (i < 0) {
            return null;
        }
        java.lang.String[] strArrOLrzqt = OLrzqt();
        if (i < strArrOLrzqt.length) {
            return strArrOLrzqt[i];
        }
        return null;
    }

    public static int AkhnZx(java.lang.String str) {
        java.lang.String[] strArrOLrzqt = OLrzqt();
        if (strArrOLrzqt.length > 0) {
            int length = strArrOLrzqt.length;
            int i = 0;
            int i2 = Integer.MAX_VALUE;
            while (true) {
                int i3 = (i + length) / 2;
                if (i2 == i3) {
                    break;
                }
                int iCompareTo = str.compareTo(strArrOLrzqt[i3]);
                if (iCompareTo == 0) {
                    return i3;
                }
                if (iCompareTo < 0) {
                    length = i3;
                } else {
                    i = i3;
                }
                i2 = i3;
            }
        }
        return -1;
    }

    static {
        AnonymousClass2 anonymousClass2 = null;
        djBIcL = new Application(anonymousClass2);
        KWHzl = new StateListAnimator(anonymousClass2);
    }

    public static java.lang.String OLrzqt(TimeZone timeZone) {
        if (timeZone instanceof OlsonTimeZone) {
            return ((OlsonTimeZone) timeZone).getCanonicalID();
        }
        return KWHzl(timeZone.getID());
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strEZpvd = AEQbTJ.EZpvd(str);
        if (strEZpvd == null) {
            strEZpvd = copydefault(str);
            if (strEZpvd == null) {
                try {
                    int iAkhnZx = AkhnZx(str);
                    if (iAkhnZx >= 0) {
                        UResourceBundle uResourceBundleKWHzl = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64", ICUResourceBundle.AEQbTJ).isConnected("Zones").KWHzl(iAkhnZx);
                        if (uResourceBundleKWHzl.AuCTel() == 7) {
                            str = OLrzqt(uResourceBundleKWHzl.fIwbmz());
                            strEZpvd = copydefault(str);
                        }
                        if (strEZpvd == null) {
                            strEZpvd = str;
                        }
                    }
                } catch (MissingResourceException unused) {
                }
            }
            if (strEZpvd != null) {
                AEQbTJ.KWHzl(str, strEZpvd);
            }
        }
        return strEZpvd;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        java.lang.String strReplace = str.replace(JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON);
        java.lang.String str2 = null;
        try {
            UResourceBundle uResourceBundleCopydefault = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "keyTypeData", ICUResourceBundle.AEQbTJ);
            try {
                uResourceBundleCopydefault.isConnected("typeMap").isConnected("timezone").isConnected(strReplace);
            } catch (MissingResourceException unused) {
                str = null;
            }
            if (str != null) {
                return str;
            }
            try {
                return uResourceBundleCopydefault.isConnected("typeAlias").isConnected("timezone").getString(strReplace);
            } catch (MissingResourceException unused2) {
                str2 = str;
                return str2;
            }
        } catch (MissingResourceException unused3) {
        }
    }

    public static java.lang.String gEmmrt(java.lang.String str) {
        int iAkhnZx;
        java.lang.String strEZpvd = gEmmrt.EZpvd(str);
        if (strEZpvd == null && (iAkhnZx = AkhnZx(str)) >= 0) {
            try {
                UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64", ICUResourceBundle.AEQbTJ).isConnected("Regions");
                if (iAkhnZx < uResourceBundleIsConnected.fARcdN()) {
                    strEZpvd = uResourceBundleIsConnected.copydefault(iAkhnZx);
                }
            } catch (MissingResourceException unused) {
            }
            if (strEZpvd != null) {
                gEmmrt.KWHzl(str, strEZpvd);
            }
        }
        return strEZpvd;
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String strGEmmrt = gEmmrt(str);
        if (strGEmmrt == null || !strGEmmrt.equals("001")) {
            return strGEmmrt;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Boolean] */
    public static java.lang.String EZpvd(java.lang.String str, C7255agQ<java.lang.Boolean> c7255agQ) {
        c7255agQ.copydefault = java.lang.Boolean.FALSE;
        java.lang.String strGEmmrt = gEmmrt(str);
        if (strGEmmrt != null && strGEmmrt.equals("001")) {
            return null;
        }
        java.lang.Boolean boolEZpvd = valueOf.EZpvd(str);
        if (boolEZpvd == null) {
            boolEZpvd = java.lang.Boolean.valueOf(TimeZone.getAvailableIDs(TimeZone.SystemTimeZoneType.CANONICAL_LOCATION, strGEmmrt, null).size() <= 1);
            valueOf.KWHzl(str, boolEZpvd);
        }
        if (boolEZpvd.booleanValue()) {
            c7255agQ.copydefault = java.lang.Boolean.TRUE;
        } else {
            try {
                java.lang.String string = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "metaZones").isConnected("primaryZones").getString(strGEmmrt);
                if (str.equals(string)) {
                    c7255agQ.copydefault = java.lang.Boolean.TRUE;
                } else {
                    java.lang.String strKWHzl = KWHzl(str);
                    if (strKWHzl != null && strKWHzl.equals(string)) {
                        c7255agQ.copydefault = java.lang.Boolean.TRUE;
                    }
                }
            } catch (MissingResourceException unused) {
            }
        }
        return strGEmmrt;
    }

    public static UResourceBundle KWHzl(UResourceBundle uResourceBundle, java.lang.String str) {
        int iAkhnZx = AkhnZx(str);
        if (iAkhnZx >= 0) {
            if (uResourceBundle == null) {
                try {
                    uResourceBundle = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64", ICUResourceBundle.AEQbTJ);
                } catch (MissingResourceException unused) {
                }
            }
            UResourceBundle uResourceBundleIsConnected = uResourceBundle.isConnected("Zones");
            UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected.KWHzl(iAkhnZx);
            return uResourceBundleKWHzl.AuCTel() == 7 ? uResourceBundleIsConnected.KWHzl(uResourceBundleKWHzl.fIwbmz()) : uResourceBundleKWHzl;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.acU$Application */
    public static class Application extends AbstractC7078acz<java.lang.String, OlsonTimeZone, java.lang.String> {
        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:547) call: o.acU.Application.<init>():void type: THIS */
        public /* synthetic */ Application(AnonymousClass2 anonymousClass2) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        public OlsonTimeZone copydefault(java.lang.String str, java.lang.String str2) {
            try {
                UResourceBundle uResourceBundleCopydefault = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64", ICUResourceBundle.AEQbTJ);
                UResourceBundle uResourceBundleKWHzl = C7047acU.KWHzl(uResourceBundleCopydefault, str2);
                if (uResourceBundleKWHzl != null) {
                    OlsonTimeZone olsonTimeZone = new OlsonTimeZone(uResourceBundleCopydefault, uResourceBundleKWHzl, str2);
                    try {
                        olsonTimeZone.mo6320freeze();
                        return olsonTimeZone;
                    } catch (MissingResourceException unused) {
                        return olsonTimeZone;
                    }
                }
            } catch (MissingResourceException unused2) {
            }
            return null;
        }
    }

    public static OlsonTimeZone djBIcL(java.lang.String str) {
        return djBIcL.AEQbTJ(str, str);
    }

    /* JADX INFO: renamed from: o.acU$StateListAnimator */
    public static class StateListAnimator extends AbstractC7078acz<java.lang.Integer, SimpleTimeZone, int[]> {
        private StateListAnimator() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:588) call: o.acU.StateListAnimator.<init>():void type: THIS */
        public /* synthetic */ StateListAnimator(AnonymousClass2 anonymousClass2) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        public SimpleTimeZone copydefault(java.lang.Integer num, int[] iArr) {
            SimpleTimeZone simpleTimeZone = new SimpleTimeZone(iArr[0] * ((((iArr[1] * 60) + iArr[2]) * 60) + iArr[3]) * 1000, C7047acU.AEQbTJ(iArr[1], iArr[2], iArr[3], iArr[0] < 0));
            simpleTimeZone.mo6320freeze();
            return simpleTimeZone;
        }
    }

    public static SimpleTimeZone AYXKKw(java.lang.String str) {
        int[] iArr = new int[4];
        if (!AEQbTJ(str, iArr)) {
            return null;
        }
        return KWHzl.AEQbTJ(java.lang.Integer.valueOf(iArr[0] * (iArr[1] | (iArr[2] << 5) | (iArr[3] << 11))), iArr);
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        int[] iArr = new int[4];
        if (AEQbTJ(str, iArr)) {
            return AEQbTJ(iArr[1], iArr[2], iArr[3], iArr[0] < 0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean AEQbTJ(java.lang.String str, int[] iArr) {
        int i;
        int iIntValue;
        int iIntValue2;
        if (str != null && str.length() > 3 && str.toUpperCase(java.util.Locale.ENGLISH).startsWith("GMT")) {
            ParsePosition parsePosition = new ParsePosition(3);
            if (str.charAt(parsePosition.getIndex()) == '-') {
                i = -1;
            } else {
                if (str.charAt(parsePosition.getIndex()) != '+') {
                    return false;
                }
                i = 1;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setParseIntegerOnly(true);
            int index = parsePosition.getIndex();
            java.lang.Number number = numberFormat.parse(str, parsePosition);
            if (parsePosition.getIndex() == index) {
                return false;
            }
            int iIntValue3 = number.intValue();
            if (parsePosition.getIndex() < str.length()) {
                if (parsePosition.getIndex() - index <= 2 && str.charAt(parsePosition.getIndex()) == ':') {
                    parsePosition.setIndex(parsePosition.getIndex() + 1);
                    int index2 = parsePosition.getIndex();
                    java.lang.Number number2 = numberFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() - index2 != 2) {
                        return false;
                    }
                    iIntValue = number2.intValue();
                    if (parsePosition.getIndex() >= str.length()) {
                        iIntValue2 = 0;
                    } else {
                        if (str.charAt(parsePosition.getIndex()) != ':') {
                            return false;
                        }
                        parsePosition.setIndex(parsePosition.getIndex() + 1);
                        int index3 = parsePosition.getIndex();
                        java.lang.Number number3 = numberFormat.parse(str, parsePosition);
                        if (parsePosition.getIndex() == str.length() && parsePosition.getIndex() - index3 == 2) {
                            iIntValue2 = number3.intValue();
                        }
                    }
                    if (iIntValue3 <= 23 && iIntValue <= 59 && iIntValue2 <= 59) {
                        if (iArr != null) {
                            if (iArr.length >= 1) {
                                iArr[0] = i;
                            }
                            if (iArr.length >= 2) {
                                iArr[1] = iIntValue3;
                            }
                            if (iArr.length >= 3) {
                                iArr[2] = iIntValue;
                            }
                            if (iArr.length >= 4) {
                                iArr[3] = iIntValue2;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            int index4 = parsePosition.getIndex() - index;
            if (index4 > 0 && 6 >= index4) {
                if (index4 == 3 || index4 == 4) {
                    iIntValue = iIntValue3 % 100;
                    iIntValue3 /= 100;
                    iIntValue2 = 0;
                    if (iIntValue3 <= 23) {
                        if (iArr != null) {
                        }
                        return true;
                    }
                } else {
                    if (index4 == 5 || index4 == 6) {
                        iIntValue2 = iIntValue3 % 100;
                        iIntValue = (iIntValue3 / 100) % 100;
                        iIntValue3 /= 10000;
                    } else {
                        iIntValue2 = 0;
                        iIntValue = 0;
                    }
                    if (iIntValue3 <= 23) {
                    }
                }
            }
        }
        return false;
    }

    public static SimpleTimeZone AEQbTJ(int i) {
        boolean z;
        int i2;
        if (i < 0) {
            i2 = -i;
            z = true;
        } else {
            z = false;
            i2 = i;
        }
        int i3 = i2 / 1000;
        int i4 = i3 / 60;
        return new SimpleTimeZone(i, AEQbTJ(i4 / 60, i4 % 60, i3 % 60, z));
    }

    public static java.lang.String AEQbTJ(int i, int i2, int i3, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GMT");
        if (i != 0 || i2 != 0) {
            if (z) {
                sb.append('-');
            } else {
                sb.append('+');
            }
            if (i < 10) {
                sb.append('0');
            }
            sb.append(i);
            sb.append(AbstractJsonLexerKt.COLON);
            if (i2 < 10) {
                sb.append('0');
            }
            sb.append(i2);
            if (i3 != 0) {
                sb.append(AbstractJsonLexerKt.COLON);
                if (i3 < 10) {
                    sb.append('0');
                }
                sb.append(i3);
            }
        }
        return sb.toString();
    }

    public static java.lang.String AEQbTJ(TimeZone timeZone) {
        java.lang.String strKWHzl;
        if (timeZone instanceof OlsonTimeZone) {
            strKWHzl = ((OlsonTimeZone) timeZone).getCanonicalID();
        } else {
            strKWHzl = KWHzl(timeZone.getID());
        }
        if (strKWHzl == null) {
            return null;
        }
        return AhwBna(strKWHzl);
    }

    public static java.lang.String valueOf(java.lang.String str) {
        java.lang.String strKWHzl = KWHzl(str);
        if (strKWHzl == null) {
            return null;
        }
        return AhwBna(strKWHzl);
    }

    public static java.lang.String AhwBna(java.lang.String str) {
        try {
            return UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "keyTypeData", ICUResourceBundle.AEQbTJ).isConnected("typeMap").isConnected("timezone").getString(str.replace(JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON));
        } catch (MissingResourceException unused) {
            return null;
        }
    }
}
