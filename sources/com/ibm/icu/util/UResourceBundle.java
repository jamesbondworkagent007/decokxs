package com.ibm.icu.util;

import com.ibm.icu.impl.ICUResourceBundle;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import o.C7061aci;
import o.C7072act;
import o.C7260agV;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UResourceBundle extends ResourceBundle {
    public static Map<String, RootType> DbNXlk = new ConcurrentHashMap();

    public enum RootType {
        MISSING,
        ICU,
        JAVA
    }

    public UResourceBundle AEQbTJ(String str, HashMap<String, String> map, UResourceBundle uResourceBundle) {
        return null;
    }

    public String AEQbTJ() {
        return null;
    }

    @Deprecated
    public boolean AkhnZx() {
        return true;
    }

    public int AuCTel() {
        return -1;
    }

    public UResourceBundle EZpvd(int i, HashMap<String, String> map, UResourceBundle uResourceBundle) {
        return null;
    }

    public abstract String EZpvd();

    public abstract String djBIcL();

    public int fARcdN() {
        return 1;
    }

    public String[] fJNWhG() {
        return null;
    }

    public abstract ULocale fetchVPNInfo();

    public abstract UResourceBundle gEmmrt();

    public static UResourceBundle copydefault(String str, String str2) {
        return EZpvd(str, str2, ICUResourceBundle.AEQbTJ, false);
    }

    public static UResourceBundle copydefault(String str, String str2, ClassLoader classLoader) {
        return EZpvd(str, str2, classLoader, false);
    }

    public static UResourceBundle EZpvd(String str, String str2, ClassLoader classLoader, boolean z) {
        return OLrzqt(str, str2, classLoader, z);
    }

    public static UResourceBundle values(String str) {
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt68b";
        }
        return EZpvd(str, ULocale.getDefault().getBaseName(), ICUResourceBundle.AEQbTJ, false);
    }

    public static UResourceBundle KWHzl(String str, ULocale uLocale) {
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt68b";
        }
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return EZpvd(str, uLocale.getBaseName(), ICUResourceBundle.AEQbTJ, false);
    }

    public static UResourceBundle copydefault(String str, ULocale uLocale, ClassLoader classLoader) {
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt68b";
        }
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return EZpvd(str, uLocale.getBaseName(), classLoader, false);
    }

    @Override // java.util.ResourceBundle
    public Locale getLocale() {
        return fetchVPNInfo().toLocale();
    }

    public static RootType AYXKKw(String str, ClassLoader classLoader) {
        RootType rootType;
        RootType rootType2 = DbNXlk.get(str);
        if (rootType2 == null) {
            String str2 = str.indexOf(46) == -1 ? "root" : "";
            try {
                try {
                    ICUResourceBundle.copydefault(str, str2, classLoader, true);
                    rootType = RootType.ICU;
                } catch (MissingResourceException unused) {
                    rootType = RootType.MISSING;
                }
            } catch (MissingResourceException unused2) {
                C7072act.copydefault(str, str2, classLoader, true);
                rootType = RootType.JAVA;
            }
            rootType2 = rootType;
            DbNXlk.put(str, rootType2);
        }
        return rootType2;
    }

    public static void copydefault(String str, RootType rootType) {
        DbNXlk.put(str, rootType);
    }

    public static UResourceBundle OLrzqt(String str, String str2, ClassLoader classLoader, boolean z) {
        int i = AnonymousClass2.OLrzqt[AYXKKw(str, classLoader).ordinal()];
        if (i == 1) {
            return ICUResourceBundle.copydefault(str, str2, classLoader, z);
        }
        if (i == 2) {
            return C7072act.copydefault(str, str2, classLoader, z);
        }
        try {
            ICUResourceBundle iCUResourceBundleCopydefault = ICUResourceBundle.copydefault(str, str2, classLoader, z);
            copydefault(str, RootType.ICU);
            return iCUResourceBundleCopydefault;
        } catch (MissingResourceException unused) {
            C7072act c7072actCopydefault = C7072act.copydefault(str, str2, classLoader, z);
            copydefault(str, RootType.JAVA);
            return c7072actCopydefault;
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.UResourceBundle$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[RootType.values().length];
            OLrzqt = iArr;
            try {
                iArr[RootType.ICU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[RootType.JAVA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[RootType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ByteBuffer ejfBZ() {
        throw new UResourceTypeMismatchException("");
    }

    public String getFieldNames() {
        throw new UResourceTypeMismatchException("");
    }

    public String[] isConnected() {
        throw new UResourceTypeMismatchException("");
    }

    public byte[] copydefault(byte[] bArr) {
        throw new UResourceTypeMismatchException("");
    }

    public int[] uzCIH() {
        throw new UResourceTypeMismatchException("");
    }

    public int fIwbmz() {
        throw new UResourceTypeMismatchException("");
    }

    public UResourceBundle isConnected(String str) {
        UResourceBundle uResourceBundleOLrzqt = OLrzqt(str);
        if (uResourceBundleOLrzqt != null) {
            return uResourceBundleOLrzqt;
        }
        throw new MissingResourceException("Can't find resource for bundle " + C7061aci.EZpvd(EZpvd(), djBIcL()) + ", key " + str, getClass().getName(), str);
    }

    @Deprecated
    public UResourceBundle OLrzqt(String str) {
        for (UResourceBundle uResourceBundleGEmmrt = this; uResourceBundleGEmmrt != null; uResourceBundleGEmmrt = uResourceBundleGEmmrt.gEmmrt()) {
            UResourceBundle uResourceBundleAEQbTJ = uResourceBundleGEmmrt.AEQbTJ(str, null, this);
            if (uResourceBundleAEQbTJ != null) {
                return uResourceBundleAEQbTJ;
            }
        }
        return null;
    }

    public String copydefault(int i) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) KWHzl(i);
        if (iCUResourceBundle.AuCTel() == 0) {
            return iCUResourceBundle.getFieldNames();
        }
        throw new UResourceTypeMismatchException("");
    }

    public UResourceBundle KWHzl(int i) {
        UResourceBundle uResourceBundleEZpvd = EZpvd(i, null, this);
        if (uResourceBundleEZpvd == null) {
            uResourceBundleEZpvd = gEmmrt();
            if (uResourceBundleEZpvd != null) {
                uResourceBundleEZpvd = uResourceBundleEZpvd.KWHzl(i);
            }
            if (uResourceBundleEZpvd == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + AEQbTJ(), getClass().getName(), AEQbTJ());
            }
        }
        return uResourceBundleEZpvd;
    }

    @Override // java.util.ResourceBundle
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }

    @Override // java.util.ResourceBundle
    @Deprecated
    public Set<String> keySet() {
        ICUResourceBundle iCUResourceBundle;
        Set<String> setUnmodifiableSet;
        TreeSet treeSet;
        if (AkhnZx() && (this instanceof ICUResourceBundle)) {
            iCUResourceBundle = (ICUResourceBundle) this;
            setUnmodifiableSet = iCUResourceBundle.values();
        } else {
            iCUResourceBundle = null;
            setUnmodifiableSet = null;
        }
        if (setUnmodifiableSet == null) {
            if (AkhnZx()) {
                ResourceBundle resourceBundle = ((ResourceBundle) this).parent;
                if (resourceBundle == null) {
                    treeSet = new TreeSet();
                } else if (resourceBundle instanceof UResourceBundle) {
                    treeSet = new TreeSet(((UResourceBundle) ((ResourceBundle) this).parent).keySet());
                } else {
                    treeSet = new TreeSet();
                    Enumeration<String> keys = ((ResourceBundle) this).parent.getKeys();
                    while (keys.hasMoreElements()) {
                        treeSet.add(keys.nextElement());
                    }
                }
                treeSet.addAll(handleKeySet());
                setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                if (iCUResourceBundle != null) {
                    iCUResourceBundle.OLrzqt(setUnmodifiableSet);
                }
            } else {
                return handleKeySet();
            }
        }
        return setUnmodifiableSet;
    }

    @Override // java.util.ResourceBundle
    @Deprecated
    public Set<String> handleKeySet() {
        return Collections.emptySet();
    }

    public C7260agV getNewProxyInstance() {
        return new C7260agV(this);
    }

    @Override // java.util.ResourceBundle
    public Object handleGetObject(String str) {
        return KWHzl(str, this);
    }

    public final Object KWHzl(String str, UResourceBundle uResourceBundle) {
        Object objAEQbTJ = AEQbTJ(str, uResourceBundle);
        if (objAEQbTJ == null) {
            UResourceBundle uResourceBundleGEmmrt = gEmmrt();
            if (uResourceBundleGEmmrt != null) {
                objAEQbTJ = uResourceBundleGEmmrt.KWHzl(str, uResourceBundle);
            }
            if (objAEQbTJ == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + str, getClass().getName(), str);
            }
        }
        return objAEQbTJ;
    }

    public final Object AEQbTJ(String str, UResourceBundle uResourceBundle) {
        if (AuCTel() == 0) {
            return getFieldNames();
        }
        UResourceBundle uResourceBundleAEQbTJ = AEQbTJ(str, null, uResourceBundle);
        if (uResourceBundleAEQbTJ == null) {
            return uResourceBundleAEQbTJ;
        }
        if (uResourceBundleAEQbTJ.AuCTel() == 0) {
            return uResourceBundleAEQbTJ.getFieldNames();
        }
        try {
            return uResourceBundleAEQbTJ.AuCTel() == 8 ? uResourceBundleAEQbTJ.fJNWhG() : uResourceBundleAEQbTJ;
        } catch (UResourceTypeMismatchException unused) {
            return uResourceBundleAEQbTJ;
        }
    }
}
