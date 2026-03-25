package com.ibm.icu.impl;

import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import o.AbstractC7013abN;
import o.AbstractC7040acN;
import o.AbstractC7078acz;
import o.C7016abQ;
import o.C7024abY;
import o.C7043acQ;
import o.C7053aca;
import o.C7055acc;
import o.C7056acd;
import o.C7060ach;
import o.C7061aci;
import o.C7260agV;

/* JADX INFO: loaded from: classes3.dex */
public class ICUResourceBundle extends UResourceBundle {
    public ICUResourceBundle KWHzl;
    public ActionBar djBIcL;
    public String gEmmrt;
    public static final ClassLoader AEQbTJ = C7016abQ.EZpvd(C7055acc.class);
    public static AbstractC7013abN<String, ICUResourceBundle, StateListAnimator> copydefault = new AbstractC7078acz<String, ICUResourceBundle, StateListAnimator>() { // from class: com.ibm.icu.impl.ICUResourceBundle.1
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        public ICUResourceBundle copydefault(String str, StateListAnimator stateListAnimator) {
            return stateListAnimator.EZpvd();
        }
    };
    public static final boolean OLrzqt = C7060ach.AEQbTJ("localedata");
    public static AbstractC7013abN<String, Application, ClassLoader> EZpvd = new AbstractC7078acz<String, Application, ClassLoader>() { // from class: com.ibm.icu.impl.ICUResourceBundle.3
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application copydefault(String str, ClassLoader classLoader) {
            return new Application(str, classLoader);
        }
    };

    public enum OpenType {
        LOCALE_DEFAULT_ROOT,
        LOCALE_ROOT,
        LOCALE_ONLY,
        DIRECT
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.UResourceBundle
    public String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.UResourceBundle
    public boolean AkhnZx() {
        return this.KWHzl == null;
    }

    public int hashCode() {
        return 42;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.ResourceBundle
    public void setParent(ResourceBundle resourceBundle) {
        ((ResourceBundle) this).parent = resourceBundle;
    }

    public static final class ActionBar {
        public String AEQbTJ;
        public ULocale AYXKKw;
        public ClassLoader EZpvd;
        public String KWHzl;
        public Set<String> OLrzqt;
        public C7061aci copydefault;

        public ActionBar(String str, String str2, ClassLoader classLoader, C7061aci c7061aci) {
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.AYXKKw = new ULocale(str2);
            this.EZpvd = classLoader;
            this.copydefault = c7061aci;
        }
    }

    public static abstract class StateListAnimator {
        public abstract ICUResourceBundle EZpvd();

        private StateListAnimator() {
        }
    }

    public ICUResourceBundle valueOf(String str) throws MissingResourceException {
        ICUResourceBundle iCUResourceBundleAEQbTJ = AEQbTJ(str, this, (UResourceBundle) null);
        if (iCUResourceBundleAEQbTJ == null) {
            throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + AuCTel(), str, AEQbTJ());
        }
        if (iCUResourceBundleAEQbTJ.AuCTel() == 0 && iCUResourceBundleAEQbTJ.getFieldNames().equals("∅∅∅")) {
            throw new MissingResourceException("Encountered NO_INHERITANCE_MARKER", str, AEQbTJ());
        }
        return iCUResourceBundleAEQbTJ;
    }

    public ICUResourceBundle OLrzqt(int i) {
        return (ICUResourceBundle) EZpvd(i, (HashMap<String, String>) null, this);
    }

    public ICUResourceBundle copydefault(String str) {
        if (this instanceof C7056acd.PendingIntent) {
            return (ICUResourceBundle) AEQbTJ(str, (HashMap<String, String>) null, this);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/String;)Lcom/ibm/icu/util/UResourceBundle; */
    @Override // com.ibm.icu.util.UResourceBundle
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ICUResourceBundle OLrzqt(String str) {
        return (ICUResourceBundle) super.OLrzqt(str);
    }

    public ICUResourceBundle gEmmrt(String str) {
        return AEQbTJ(str, this, (UResourceBundle) null);
    }

    public String AEQbTJ(String str) {
        return KWHzl(str, this, (UResourceBundle) null);
    }

    public String djBIcL(String str) throws MissingResourceException {
        String strKWHzl = KWHzl(str, this, (UResourceBundle) null);
        if (strKWHzl == null) {
            throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + AuCTel(), str, AEQbTJ());
        }
        if (strKWHzl.equals("∅∅∅")) {
            throw new MissingResourceException("Encountered NO_INHERITANCE_MARKER", str, AEQbTJ());
        }
        return strKWHzl;
    }

    public C7043acQ.TaskDescription AYXKKw(String str) throws MissingResourceException {
        ICUResourceBundle iCUResourceBundleAEQbTJ;
        if (str.isEmpty()) {
            iCUResourceBundleAEQbTJ = this;
        } else {
            iCUResourceBundleAEQbTJ = AEQbTJ(str, this, (UResourceBundle) null);
            if (iCUResourceBundleAEQbTJ == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + AuCTel(), str, AEQbTJ());
            }
        }
        C7061aci.Dialog dialog = new C7061aci.Dialog();
        C7056acd c7056acd = (C7056acd) iCUResourceBundleAEQbTJ;
        dialog.OLrzqt = c7056acd.djBIcL.copydefault;
        dialog.AEQbTJ = c7056acd.DbNXlk();
        return dialog;
    }

    public void EZpvd(String str, C7043acQ.ActionBar actionBar) {
        try {
            copydefault(str, actionBar);
        } catch (MissingResourceException unused) {
        }
    }

    public void copydefault(String str, C7043acQ.ActionBar actionBar) throws MissingResourceException {
        ICUResourceBundle iCUResourceBundleKWHzl;
        int iKWHzl = KWHzl(str);
        if (iKWHzl == 0) {
            iCUResourceBundleKWHzl = this;
        } else {
            int iAYXKKw = AYXKKw();
            String[] strArr = new String[iAYXKKw + iKWHzl];
            EZpvd(str, iKWHzl, strArr, iAYXKKw);
            iCUResourceBundleKWHzl = KWHzl(strArr, iAYXKKw, this, (UResourceBundle) null);
            if (iCUResourceBundleKWHzl == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + AuCTel(), str, AEQbTJ());
            }
        }
        iCUResourceBundleKWHzl.EZpvd(new C7043acQ.Application(), new C7061aci.Dialog(), actionBar);
    }

    public final void EZpvd(C7043acQ.Application application, C7061aci.Dialog dialog, C7043acQ.ActionBar actionBar) {
        C7056acd c7056acd = (C7056acd) this;
        dialog.OLrzqt = c7056acd.djBIcL.copydefault;
        dialog.AEQbTJ = c7056acd.DbNXlk();
        String str = this.gEmmrt;
        if (str == null) {
            str = "";
        }
        application.AEQbTJ(str);
        actionBar.copydefault(application, dialog, ((ResourceBundle) this).parent == null);
        ResourceBundle resourceBundle = ((ResourceBundle) this).parent;
        if (resourceBundle != null) {
            ICUResourceBundle iCUResourceBundleKWHzl = (ICUResourceBundle) resourceBundle;
            int iAYXKKw = AYXKKw();
            if (iAYXKKw != 0) {
                String[] strArr = new String[iAYXKKw];
                KWHzl(strArr, iAYXKKw);
                iCUResourceBundleKWHzl = KWHzl(strArr, 0, iCUResourceBundleKWHzl, (UResourceBundle) null);
            }
            if (iCUResourceBundleKWHzl != null) {
                iCUResourceBundleKWHzl.EZpvd(application, dialog, actionBar);
            }
        }
    }

    public static Set<String> gEmmrt(String str, ClassLoader classLoader) {
        return valueOf(str, classLoader).KWHzl();
    }

    public static Set<String> AhwBna(String str, ClassLoader classLoader) {
        return valueOf(str, classLoader).AEQbTJ();
    }

    public static final ULocale[] OLrzqt(String str, ClassLoader classLoader, ULocale.AvailableType availableType) {
        return valueOf(str, classLoader).copydefault(availableType);
    }

    public static final ULocale[] OLrzqt() {
        return OLrzqt("com/ibm/icu/impl/data/icudt68b", AEQbTJ, ULocale.AvailableType.DEFAULT);
    }

    public static final ULocale[] EZpvd(ULocale.AvailableType availableType) {
        return OLrzqt("com/ibm/icu/impl/data/icudt68b", AEQbTJ, availableType);
    }

    public static final Locale[] AEQbTJ(String str, ClassLoader classLoader, ULocale.AvailableType availableType) {
        return valueOf(str, classLoader).OLrzqt(availableType);
    }

    public static final Locale[] copydefault() {
        return AEQbTJ("com/ibm/icu/impl/data/icudt68b", AEQbTJ, ULocale.AvailableType.DEFAULT);
    }

    public static final Locale[] OLrzqt(ULocale[] uLocaleArr) {
        ArrayList arrayList = new ArrayList(uLocaleArr.length);
        HashSet hashSet = new HashSet();
        for (ULocale uLocale : uLocaleArr) {
            Locale locale = uLocale.toLocale();
            if (!hashSet.contains(locale)) {
                arrayList.add(locale);
                hashSet.add(locale);
            }
        }
        return (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    @Override // com.ibm.icu.util.UResourceBundle, java.util.ResourceBundle
    public Locale getLocale() {
        return fetchVPNInfo().toLocale();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity extends C7043acQ.ActionBar {
        public EnumMap<ULocale.AvailableType, ULocale[]> KWHzl;

        public Activity(EnumMap<ULocale.AvailableType, ULocale[]> enumMap) {
            this.KWHzl = enumMap;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            ULocale.AvailableType availableType;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (application.copydefault("InstalledLocales")) {
                    availableType = ULocale.AvailableType.DEFAULT;
                } else if (application.copydefault("AliasLocales")) {
                    availableType = ULocale.AvailableType.ONLY_LEGACY_ALIASES;
                }
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                ULocale[] uLocaleArr = new ULocale[stateListAnimatorValueOf2.KWHzl()];
                for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                    uLocaleArr[i2] = new ULocale(application.toString());
                }
                this.KWHzl.put(availableType, uLocaleArr);
            }
        }
    }

    public static final EnumMap<ULocale.AvailableType, ULocale[]> djBIcL(String str, ClassLoader classLoader) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.OLrzqt(str, "res_index", classLoader, true);
        EnumMap<ULocale.AvailableType, ULocale[]> enumMap = new EnumMap<>(ULocale.AvailableType.class);
        iCUResourceBundle.copydefault("", new Activity(enumMap));
        return enumMap;
    }

    public static final void KWHzl(String str, ClassLoader classLoader, Set<String> set) {
        try {
            C7260agV newProxyInstance = ((ICUResourceBundle) ((ICUResourceBundle) UResourceBundle.OLrzqt(str, "res_index", classLoader, true)).isConnected("InstalledLocales")).getNewProxyInstance();
            newProxyInstance.AEQbTJ();
            while (newProxyInstance.EZpvd()) {
                set.add(newProxyInstance.copydefault().AEQbTJ());
            }
        } catch (MissingResourceException unused) {
            if (OLrzqt) {
                System.out.println("couldn't find " + str + JsonPointer.SEPARATOR + "res_index.res");
                Thread.dumpStack();
            }
        }
    }

    public static final void OLrzqt(final String str, final ClassLoader classLoader, final Set<String> set) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.ibm.icu.impl.ICUResourceBundle.5
            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public Void run() {
                try {
                    Enumeration<URL> resources = classLoader.getResources(str);
                    if (resources == null) {
                        return null;
                    }
                    AbstractC7040acN.Activity activity = new AbstractC7040acN.Activity() { // from class: com.ibm.icu.impl.ICUResourceBundle.5.3
                        @Override // o.AbstractC7040acN.Activity
                        public void EZpvd(String str2) {
                            if (str2.endsWith(".res")) {
                                set.add(str2.substring(0, str2.length() - 4));
                            }
                        }
                    };
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        AbstractC7040acN abstractC7040acNAEQbTJ = AbstractC7040acN.AEQbTJ(urlNextElement);
                        if (abstractC7040acNAEQbTJ != null) {
                            abstractC7040acNAEQbTJ.AEQbTJ(activity, false);
                        } else if (ICUResourceBundle.OLrzqt) {
                            System.out.println("handler for " + urlNextElement + " is null");
                        }
                    }
                } catch (IOException e) {
                    if (ICUResourceBundle.OLrzqt) {
                        System.out.println("ouch: " + e.getMessage());
                    }
                }
                return null;
            }
        });
    }

    public static void EZpvd(String str, ClassLoader classLoader, Set<String> set) {
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str + "fullLocaleNames.lst");
            if (resourceAsStream == null) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "ASCII"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (line.length() != 0 && !line.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
                            set.add(line);
                        }
                    } else {
                        bufferedReader.close();
                        return;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static Set<String> EZpvd(String str, ClassLoader classLoader) {
        String str2;
        String strSubstring;
        if (str.endsWith("/")) {
            str2 = str;
        } else {
            str2 = str + "/";
        }
        HashSet hashSet = new HashSet();
        if (!C7053aca.AEQbTJ("com.ibm.icu.impl.ICUResourceBundle.skipRuntimeLocaleResourceScan", "false").equalsIgnoreCase("true")) {
            OLrzqt(str2, classLoader, hashSet);
            if (str.startsWith("com/ibm/icu/impl/data/icudt68b")) {
                if (str.length() == 30) {
                    strSubstring = "";
                } else {
                    strSubstring = str.charAt(30) == '/' ? str.substring(31) : null;
                }
                if (strSubstring != null) {
                    C7024abY.OLrzqt(strSubstring, ".res", hashSet);
                }
            }
            hashSet.remove("res_index");
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.length() == 1 || str3.length() > 3) {
                    if (str3.indexOf(95) < 0) {
                        it.remove();
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            if (OLrzqt) {
                System.out.println("unable to enumerate data files in " + str);
            }
            EZpvd(str2, classLoader, hashSet);
        }
        if (hashSet.isEmpty()) {
            KWHzl(str, classLoader, hashSet);
        }
        hashSet.remove("root");
        hashSet.add(ULocale.ROOT.toString());
        return Collections.unmodifiableSet(hashSet);
    }

    public static Set<String> OLrzqt(String str, ClassLoader classLoader) {
        HashSet hashSet = new HashSet();
        KWHzl(str, classLoader, hashSet);
        return Collections.unmodifiableSet(hashSet);
    }

    public static final class Application {
        public volatile Locale[] AEQbTJ;
        public volatile EnumMap<ULocale.AvailableType, ULocale[]> AhwBna;
        public volatile Set<String> EZpvd;
        public volatile Set<String> KWHzl;
        public String OLrzqt;
        public ClassLoader copydefault;

        public Application(String str, ClassLoader classLoader) {
            this.OLrzqt = str;
            this.copydefault = classLoader;
        }

        public ULocale[] copydefault(ULocale.AvailableType availableType) {
            if (this.AhwBna == null) {
                synchronized (this) {
                    if (this.AhwBna == null) {
                        this.AhwBna = ICUResourceBundle.djBIcL(this.OLrzqt, this.copydefault);
                    }
                }
            }
            return this.AhwBna.get(availableType);
        }

        public Locale[] OLrzqt(ULocale.AvailableType availableType) {
            if (this.AEQbTJ == null) {
                copydefault(availableType);
                synchronized (this) {
                    if (this.AEQbTJ == null) {
                        this.AEQbTJ = ICUResourceBundle.OLrzqt(this.AhwBna.get(availableType));
                    }
                }
            }
            return this.AEQbTJ;
        }

        public Set<String> KWHzl() {
            if (this.EZpvd == null) {
                synchronized (this) {
                    if (this.EZpvd == null) {
                        this.EZpvd = ICUResourceBundle.OLrzqt(this.OLrzqt, this.copydefault);
                    }
                }
            }
            return this.EZpvd;
        }

        public Set<String> AEQbTJ() {
            if (this.KWHzl == null) {
                synchronized (this) {
                    if (this.KWHzl == null) {
                        this.KWHzl = ICUResourceBundle.EZpvd(this.OLrzqt, this.copydefault);
                    }
                }
            }
            return this.KWHzl;
        }
    }

    public static Application valueOf(String str, ClassLoader classLoader) {
        return EZpvd.AEQbTJ(str, classLoader);
    }

    public static final ICUResourceBundle AEQbTJ(String str, UResourceBundle uResourceBundle, UResourceBundle uResourceBundle2) {
        if (str.length() == 0) {
            return null;
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) uResourceBundle;
        int iAYXKKw = iCUResourceBundle.AYXKKw();
        int iKWHzl = KWHzl(str);
        String[] strArr = new String[iAYXKKw + iKWHzl];
        EZpvd(str, iKWHzl, strArr, iAYXKKw);
        return KWHzl(strArr, iAYXKKw, iCUResourceBundle, uResourceBundle2);
    }

    public static final ICUResourceBundle KWHzl(String[] strArr, int i, ICUResourceBundle iCUResourceBundle, UResourceBundle uResourceBundle) {
        if (uResourceBundle == null) {
            uResourceBundle = iCUResourceBundle;
        }
        while (true) {
            int i2 = i + 1;
            ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) iCUResourceBundle.AEQbTJ(strArr[i], (HashMap<String, String>) null, uResourceBundle);
            if (iCUResourceBundle2 != null) {
                if (i2 == strArr.length) {
                    return iCUResourceBundle2;
                }
                i = i2;
                iCUResourceBundle = iCUResourceBundle2;
            } else {
                ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt();
                if (iCUResourceBundleGEmmrt == null) {
                    return null;
                }
                int iAYXKKw = iCUResourceBundle.AYXKKw();
                if (i != iAYXKKw) {
                    String[] strArr2 = new String[(strArr.length - i) + iAYXKKw];
                    System.arraycopy(strArr, i, strArr2, iAYXKKw, strArr.length - i);
                    strArr = strArr2;
                }
                iCUResourceBundle.KWHzl(strArr, iAYXKKw);
                i = 0;
                iCUResourceBundle = iCUResourceBundleGEmmrt;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0067 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String KWHzl(String str, UResourceBundle uResourceBundle, UResourceBundle uResourceBundle2) {
        C7061aci.Activity activityAYXKKw;
        int i;
        int iKWHzl;
        ICUResourceBundle iCUResourceBundleCopydefault;
        ICUResourceBundle iCUResourceBundleGEmmrt;
        if (str.length() == 0 || !(uResourceBundle instanceof C7056acd.ActionBar)) {
            return null;
        }
        UResourceBundle uResourceBundle3 = uResourceBundle2 == null ? uResourceBundle : uResourceBundle2;
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) uResourceBundle;
        C7061aci c7061aci = iCUResourceBundle.djBIcL.copydefault;
        int iAYXKKw = iCUResourceBundle.AYXKKw();
        int iKWHzl2 = KWHzl(str);
        String[] strArr = new String[iAYXKKw + iKWHzl2];
        EZpvd(str, iKWHzl2, strArr, iAYXKKw);
        String[] strArr2 = strArr;
        while (true) {
            C7061aci c7061aci2 = c7061aci;
            int iAYXKKw2 = iAYXKKw;
            int i2 = -1;
            while (true) {
                if (i2 == -1) {
                    int iAuCTel = iCUResourceBundle.AuCTel();
                    if (iAuCTel == 2 || iAuCTel == 8) {
                        activityAYXKKw = ((C7056acd.ActionBar) iCUResourceBundle).valueOf;
                        i = iAYXKKw + 1;
                        String str2 = strArr2[iAYXKKw];
                        iKWHzl = activityAYXKKw.KWHzl(c7061aci2, str2);
                        if (iKWHzl == -1) {
                        }
                    } else {
                        iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt();
                        if (iCUResourceBundleGEmmrt == null) {
                        }
                    }
                } else {
                    int iAEQbTJ = C7061aci.AEQbTJ(i2);
                    if (C7061aci.EZpvd(iAEQbTJ)) {
                        activityAYXKKw = c7061aci2.fIwbmz(i2);
                    } else if (C7061aci.OLrzqt(iAEQbTJ)) {
                        activityAYXKKw = c7061aci2.AYXKKw(i2);
                    } else {
                        i2 = -1;
                        iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt();
                        if (iCUResourceBundleGEmmrt == null) {
                            return null;
                        }
                        iCUResourceBundle.KWHzl(strArr2, iAYXKKw2);
                        c7061aci2 = iCUResourceBundleGEmmrt.djBIcL.copydefault;
                        iAYXKKw2 = 0;
                        iCUResourceBundle = iCUResourceBundleGEmmrt;
                        iAYXKKw = 0;
                    }
                    i = iAYXKKw + 1;
                    String str22 = strArr2[iAYXKKw];
                    iKWHzl = activityAYXKKw.KWHzl(c7061aci2, str22);
                    if (iKWHzl == -1) {
                        if (C7061aci.AEQbTJ(iKWHzl) == 3) {
                            iCUResourceBundle.KWHzl(strArr2, iAYXKKw2);
                            iCUResourceBundleCopydefault = copydefault(iCUResourceBundle, strArr2, i, str22, iKWHzl, null, uResourceBundle3);
                        } else {
                            iCUResourceBundleCopydefault = null;
                        }
                        if (i == strArr2.length) {
                            if (iCUResourceBundleCopydefault != null) {
                                return iCUResourceBundleCopydefault.getFieldNames();
                            }
                            String strFARcdN = c7061aci2.fARcdN(iKWHzl);
                            if (strFARcdN != null) {
                                return strFARcdN;
                            }
                            throw new UResourceTypeMismatchException("");
                        }
                        if (iCUResourceBundleCopydefault != null) {
                            c7061aci2 = iCUResourceBundleCopydefault.djBIcL.copydefault;
                            iAYXKKw2 = iCUResourceBundleCopydefault.AYXKKw();
                            if (i != iAYXKKw2) {
                                break;
                            }
                            iCUResourceBundle = iCUResourceBundleCopydefault;
                            i2 = -1;
                            iAYXKKw = i;
                        } else {
                            iAYXKKw = i;
                            i2 = iKWHzl;
                        }
                    } else {
                        i2 = iKWHzl;
                        iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt();
                        if (iCUResourceBundleGEmmrt == null) {
                        }
                    }
                }
            }
            String[] strArr3 = new String[(strArr2.length - i) + iAYXKKw2];
            System.arraycopy(strArr2, i, strArr3, iAYXKKw2, strArr2.length - i);
            iCUResourceBundle = iCUResourceBundleCopydefault;
            strArr2 = strArr3;
            c7061aci = c7061aci2;
            iAYXKKw = iAYXKKw2;
        }
    }

    public final int AYXKKw() {
        ICUResourceBundle iCUResourceBundle = this.KWHzl;
        if (iCUResourceBundle == null) {
            return 0;
        }
        return iCUResourceBundle.AYXKKw() + 1;
    }

    public final void KWHzl(String[] strArr, int i) {
        ICUResourceBundle iCUResourceBundle = this;
        while (i > 0) {
            i--;
            strArr[i] = iCUResourceBundle.gEmmrt;
            iCUResourceBundle = iCUResourceBundle.KWHzl;
        }
    }

    public static int KWHzl(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }

    public static void EZpvd(String str, int i, String[] strArr, int i2) {
        if (i == 0) {
            return;
        }
        if (i == 1) {
            strArr[i2] = str;
            return;
        }
        int i3 = 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i3);
            int i4 = i2 + 1;
            strArr[i2] = str.substring(i3, iIndexOf);
            if (i == 2) {
                strArr[i4] = str.substring(iIndexOf + 1);
                return;
            } else {
                i3 = iIndexOf + 1;
                i--;
                i2 = i4;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ICUResourceBundle)) {
            return false;
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) obj;
        return EZpvd().equals(iCUResourceBundle.EZpvd()) && djBIcL().equals(iCUResourceBundle.djBIcL());
    }

    public static ICUResourceBundle copydefault(String str, String str2, ClassLoader classLoader, boolean z) {
        return KWHzl(str, str2, classLoader, z ? OpenType.DIRECT : OpenType.LOCALE_DEFAULT_ROOT);
    }

    public static ICUResourceBundle OLrzqt(String str, ULocale uLocale, OpenType openType) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return KWHzl(str, uLocale.getBaseName(), AEQbTJ, openType);
    }

    public static ICUResourceBundle KWHzl(String str, String str2, ClassLoader classLoader, OpenType openType) {
        ICUResourceBundle iCUResourceBundleOLrzqt;
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt68b";
        }
        String baseName = ULocale.getBaseName(str2);
        if (openType == OpenType.LOCALE_DEFAULT_ROOT) {
            iCUResourceBundleOLrzqt = OLrzqt(str, baseName, ULocale.getDefault().getBaseName(), classLoader, openType);
        } else {
            iCUResourceBundleOLrzqt = OLrzqt(str, baseName, null, classLoader, openType);
        }
        if (iCUResourceBundleOLrzqt != null) {
            return iCUResourceBundleOLrzqt;
        }
        throw new MissingResourceException("Could not find the bundle " + str + "/" + baseName + ".res", "", "");
    }

    public static boolean OLrzqt(String str, String str2) {
        return str.startsWith(str2) && (str.length() == str2.length() || str.charAt(str2.length()) == '_');
    }

    public static ICUResourceBundle OLrzqt(final String str, final String str2, final String str3, final ClassLoader classLoader, final OpenType openType) {
        StringBuilder sb;
        final String strEZpvd = C7061aci.EZpvd(str, str2);
        char cOrdinal = (char) (openType.ordinal() + 48);
        if (openType != OpenType.LOCALE_DEFAULT_ROOT) {
            sb = new StringBuilder();
            sb.append(strEZpvd);
            sb.append('#');
            sb.append(cOrdinal);
        } else {
            sb = new StringBuilder();
            sb.append(strEZpvd);
            sb.append('#');
            sb.append(cOrdinal);
            sb.append('#');
            sb.append(str3);
        }
        return copydefault.AEQbTJ(sb.toString(), new StateListAnimator() { // from class: com.ibm.icu.impl.ICUResourceBundle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.ibm.icu.impl.ICUResourceBundle.StateListAnimator
            public ICUResourceBundle EZpvd() {
                ICUResourceBundle iCUResourceBundleOLrzqt;
                if (ICUResourceBundle.OLrzqt) {
                    System.out.println("Creating " + strEZpvd);
                }
                String str4 = str.indexOf(46) == -1 ? "root" : "";
                String str5 = str2.isEmpty() ? str4 : str2;
                ICUResourceBundle iCUResourceBundleKWHzl = ICUResourceBundle.KWHzl(str, str5, classLoader);
                if (ICUResourceBundle.OLrzqt) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("The bundle created is: ");
                    sb2.append(iCUResourceBundleKWHzl);
                    sb2.append(" and openType=");
                    sb2.append(openType);
                    sb2.append(" and bundle.getNoFallback=");
                    sb2.append(iCUResourceBundleKWHzl != null && iCUResourceBundleKWHzl.valueOf());
                    printStream.println(sb2.toString());
                }
                if (openType == OpenType.DIRECT) {
                    return iCUResourceBundleKWHzl;
                }
                if (iCUResourceBundleKWHzl != null && iCUResourceBundleKWHzl.valueOf()) {
                    return iCUResourceBundleKWHzl;
                }
                if (iCUResourceBundleKWHzl == null) {
                    int iLastIndexOf = str5.lastIndexOf(95);
                    if (iLastIndexOf != -1) {
                        return ICUResourceBundle.OLrzqt(str, str5.substring(0, iLastIndexOf), str3, classLoader, openType);
                    }
                    if (openType != OpenType.LOCALE_DEFAULT_ROOT || ICUResourceBundle.OLrzqt(str3, str5)) {
                        return (openType == OpenType.LOCALE_ONLY || str4.isEmpty()) ? iCUResourceBundleKWHzl : ICUResourceBundle.KWHzl(str, str4, classLoader);
                    }
                    String str6 = str;
                    String str7 = str3;
                    return ICUResourceBundle.OLrzqt(str6, str7, str7, classLoader, openType);
                }
                String strDjBIcL = iCUResourceBundleKWHzl.djBIcL();
                int iLastIndexOf2 = strDjBIcL.lastIndexOf(95);
                String strAhwBna = ((C7056acd.PendingIntent) iCUResourceBundleKWHzl).AhwBna("%%Parent");
                if (strAhwBna != null) {
                    iCUResourceBundleOLrzqt = ICUResourceBundle.OLrzqt(str, strAhwBna, str3, classLoader, openType);
                } else {
                    iCUResourceBundleOLrzqt = iLastIndexOf2 != -1 ? ICUResourceBundle.OLrzqt(str, strDjBIcL.substring(0, iLastIndexOf2), str3, classLoader, openType) : !strDjBIcL.equals(str4) ? ICUResourceBundle.OLrzqt(str, str4, str3, classLoader, openType) : null;
                }
                if (iCUResourceBundleKWHzl.equals(iCUResourceBundleOLrzqt)) {
                    return iCUResourceBundleKWHzl;
                }
                iCUResourceBundleKWHzl.setParent(iCUResourceBundleOLrzqt);
                return iCUResourceBundleKWHzl;
            }
        });
    }

    public ICUResourceBundle KWHzl(String str, HashMap<String, String> map, UResourceBundle uResourceBundle) {
        ICUResourceBundle iCUResourceBundleGEmmrt = (ICUResourceBundle) AEQbTJ(str, map, uResourceBundle);
        if (iCUResourceBundleGEmmrt == null) {
            iCUResourceBundleGEmmrt = gEmmrt();
            if (iCUResourceBundleGEmmrt != null) {
                iCUResourceBundleGEmmrt = iCUResourceBundleGEmmrt.KWHzl(str, map, uResourceBundle);
            }
            if (iCUResourceBundleGEmmrt == null) {
                throw new MissingResourceException("Can't find resource for bundle " + C7061aci.EZpvd(EZpvd(), djBIcL()) + ", key " + str, getClass().getName(), str);
            }
        }
        return iCUResourceBundleGEmmrt;
    }

    public static ICUResourceBundle KWHzl(String str, String str2, ClassLoader classLoader) {
        C7061aci c7061aciCopydefault = C7061aci.copydefault(str, str2, classLoader);
        if (c7061aciCopydefault == null) {
            return null;
        }
        return AEQbTJ(c7061aciCopydefault, str, str2, classLoader);
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public String djBIcL() {
        return this.djBIcL.KWHzl;
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public String EZpvd() {
        return this.djBIcL.AEQbTJ;
    }

    @Override // com.ibm.icu.util.UResourceBundle
    public ULocale fetchVPNInfo() {
        return this.djBIcL.AYXKKw;
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lcom/ibm/icu/util/UResourceBundle; */
    @Override // com.ibm.icu.util.UResourceBundle
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public ICUResourceBundle gEmmrt() {
        return (ICUResourceBundle) ((ResourceBundle) this).parent;
    }

    public final boolean valueOf() {
        return this.djBIcL.copydefault.AEQbTJ();
    }

    public static ICUResourceBundle AEQbTJ(C7061aci c7061aci, String str, String str2, ClassLoader classLoader) {
        int iEZpvd = c7061aci.EZpvd();
        if (C7061aci.EZpvd(C7061aci.AEQbTJ(iEZpvd))) {
            C7056acd.PendingIntent pendingIntent = new C7056acd.PendingIntent(new ActionBar(str, str2, classLoader, c7061aci), iEZpvd);
            String strAhwBna = pendingIntent.AhwBna("%%ALIAS");
            return strAhwBna != null ? (ICUResourceBundle) UResourceBundle.copydefault(str, strAhwBna) : pendingIntent;
        }
        throw new IllegalStateException("Invalid format error");
    }

    public ICUResourceBundle(ActionBar actionBar) {
        this.djBIcL = actionBar;
    }

    public ICUResourceBundle(ICUResourceBundle iCUResourceBundle, String str) {
        this.gEmmrt = str;
        this.djBIcL = iCUResourceBundle.djBIcL;
        this.KWHzl = iCUResourceBundle;
        ((ResourceBundle) this).parent = ((ResourceBundle) iCUResourceBundle).parent;
    }

    public static ICUResourceBundle copydefault(ICUResourceBundle iCUResourceBundle, String[] strArr, int i, String str, int i2, HashMap<String, String> map, UResourceBundle uResourceBundle) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        int iKWHzl;
        String[] strArr2;
        int iIndexOf;
        ActionBar actionBar = iCUResourceBundle.djBIcL;
        ClassLoader classLoader = actionBar.EZpvd;
        String strDjBIcL = actionBar.copydefault.djBIcL(i2);
        HashMap<String, String> map2 = map == null ? new HashMap<>() : map;
        if (map2.get(strDjBIcL) != null) {
            throw new IllegalArgumentException("Circular references in the resource bundles");
        }
        map2.put(strDjBIcL, "");
        ICUResourceBundle iCUResourceBundleKWHzl = null;
        if (strDjBIcL.indexOf(47) == 0) {
            int iIndexOf2 = strDjBIcL.indexOf(47, 1);
            int i3 = iIndexOf2 + 1;
            int iIndexOf3 = strDjBIcL.indexOf(47, i3);
            strSubstring3 = strDjBIcL.substring(1, iIndexOf2);
            if (iIndexOf3 < 0) {
                strSubstring = strDjBIcL.substring(i3);
                strSubstring2 = null;
            } else {
                String strSubstring4 = strDjBIcL.substring(i3, iIndexOf3);
                strSubstring2 = strDjBIcL.substring(iIndexOf3 + 1, strDjBIcL.length());
                strSubstring = strSubstring4;
            }
            if (strSubstring3.equals("ICUDATA")) {
                classLoader = AEQbTJ;
                strSubstring3 = "com/ibm/icu/impl/data/icudt68b";
            } else if (strSubstring3.indexOf("ICUDATA") > -1 && (iIndexOf = strSubstring3.indexOf(45)) > -1) {
                strSubstring3 = "com/ibm/icu/impl/data/icudt68b/" + strSubstring3.substring(iIndexOf + 1, strSubstring3.length());
                classLoader = AEQbTJ;
            }
        } else {
            int iIndexOf4 = strDjBIcL.indexOf(47);
            if (iIndexOf4 != -1) {
                String strSubstring5 = strDjBIcL.substring(0, iIndexOf4);
                strSubstring2 = strDjBIcL.substring(iIndexOf4 + 1);
                strSubstring = strSubstring5;
            } else {
                strSubstring = strDjBIcL;
                strSubstring2 = null;
            }
            strSubstring3 = actionBar.AEQbTJ;
        }
        if (strSubstring3.equals("LOCALE")) {
            String strSubstring6 = strDjBIcL.substring(8, strDjBIcL.length());
            ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) uResourceBundle;
            while (true) {
                ICUResourceBundle iCUResourceBundle3 = iCUResourceBundle2.KWHzl;
                if (iCUResourceBundle3 == null) {
                    break;
                }
                iCUResourceBundle2 = iCUResourceBundle3;
            }
            iCUResourceBundleKWHzl = AEQbTJ(strSubstring6, iCUResourceBundle2, (UResourceBundle) null);
        } else {
            ICUResourceBundle iCUResourceBundleCopydefault = copydefault(strSubstring3, strSubstring, classLoader, false);
            if (strSubstring2 != null) {
                iKWHzl = KWHzl(strSubstring2);
                if (iKWHzl > 0) {
                    strArr2 = new String[iKWHzl];
                    EZpvd(strSubstring2, iKWHzl, strArr2, 0);
                } else {
                    strArr2 = strArr;
                }
            } else if (strArr != null) {
                strArr2 = strArr;
                iKWHzl = i;
            } else {
                int iAYXKKw = iCUResourceBundle.AYXKKw();
                int i4 = iAYXKKw + 1;
                String[] strArr3 = new String[i4];
                iCUResourceBundle.KWHzl(strArr3, iAYXKKw);
                strArr3[iAYXKKw] = str;
                iKWHzl = i4;
                strArr2 = strArr3;
            }
            if (iKWHzl > 0) {
                iCUResourceBundleKWHzl = iCUResourceBundleCopydefault;
                for (int i5 = 0; iCUResourceBundleKWHzl != null && i5 < iKWHzl; i5++) {
                    iCUResourceBundleKWHzl = iCUResourceBundleKWHzl.KWHzl(strArr2[i5], map2, uResourceBundle);
                }
            }
        }
        if (iCUResourceBundleKWHzl != null) {
            return iCUResourceBundleKWHzl;
        }
        throw new MissingResourceException(actionBar.KWHzl, actionBar.AEQbTJ, str);
    }

    @Deprecated
    public final Set<String> values() {
        return this.djBIcL.OLrzqt;
    }

    @Deprecated
    public final void OLrzqt(Set<String> set) {
        this.djBIcL.OLrzqt = set;
    }
}
