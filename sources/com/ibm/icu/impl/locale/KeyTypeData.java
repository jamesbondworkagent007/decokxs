package com.ibm.icu.impl.locale;

import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.UResourceBundle;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7090adK;
import o.C7255agQ;
import o.C7260agV;

/* JADX INFO: loaded from: classes3.dex */
public class KeyTypeData {
    public static Map<String, Set<String>> OLrzqt;
    public static Set<String> copydefault = Collections.emptySet();
    public static Map<String, ValueType> valueOf = Collections.emptyMap();
    public static Map<String, Set<String>> KWHzl = Collections.emptyMap();
    public static final Object[][] EZpvd = new Object[0][];
    public static final Map<String, Activity> AEQbTJ = new HashMap();

    public enum KeyInfoType {
        deprecated,
        valueType
    }

    public enum TypeInfoType {
        deprecated
    }

    public enum ValueType {
        single,
        multiple,
        incremental,
        any
    }

    public static abstract class Fragment {
        public abstract boolean AEQbTJ(String str);

        private Fragment() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:36) call: com.ibm.icu.impl.locale.KeyTypeData.Fragment.<init>():void type: THIS */
        public /* synthetic */ Fragment(AnonymousClass5 anonymousClass5) {
            this();
        }

        public String OLrzqt(String str) {
            return C7090adK.AEQbTJ(str);
        }
    }

    public static class StateListAnimator extends Fragment {
        public static final Pattern copydefault = Pattern.compile("[0-9a-fA-F]{4,6}(-[0-9a-fA-F]{4,6})*");

        private StateListAnimator() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:43) call: com.ibm.icu.impl.locale.KeyTypeData.StateListAnimator.<init>():void type: THIS */
        public /* synthetic */ StateListAnimator(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return copydefault.matcher(str).matches();
        }
    }

    public static class Application extends Fragment {
        public static final Pattern EZpvd = Pattern.compile("[a-zA-Z]{3,8}(-[a-zA-Z]{3,8})*");

        private Application() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:51) call: com.ibm.icu.impl.locale.KeyTypeData.Application.<init>():void type: THIS */
        public /* synthetic */ Application(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return EZpvd.matcher(str).matches();
        }
    }

    public static class ActionBar extends Fragment {
        public static final Pattern KWHzl = Pattern.compile("([a-zA-Z]{2}|[0-9]{3})[zZ]{4}");

        private ActionBar() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:59) call: com.ibm.icu.impl.locale.KeyTypeData.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return KWHzl.matcher(str).matches();
        }
    }

    public static class FragmentManager extends Fragment {
        public static final Pattern copydefault = Pattern.compile("[a-zA-Z]{4}(-[a-zA-Z]{4})*");

        private FragmentManager() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:67) call: com.ibm.icu.impl.locale.KeyTypeData.FragmentManager.<init>():void type: THIS */
        public /* synthetic */ FragmentManager(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return copydefault.matcher(str).matches();
        }
    }

    public static class Dialog extends Fragment {
        public static final Pattern AEQbTJ = Pattern.compile("([a-zA-Z]{2}|[0-9]{3})");

        private Dialog() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:75) call: com.ibm.icu.impl.locale.KeyTypeData.Dialog.<init>():void type: THIS */
        public /* synthetic */ Dialog(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return AEQbTJ.matcher(str).matches();
        }
    }

    public static class TaskDescription extends Fragment {
        public static final Pattern KWHzl = Pattern.compile("[a-zA-Z0-9]{3,8}(-[a-zA-Z0-9]{3,8})*");

        private TaskDescription() {
            super(null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:83) call: com.ibm.icu.impl.locale.KeyTypeData.TaskDescription.<init>():void type: THIS */
        public /* synthetic */ TaskDescription(AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // com.ibm.icu.impl.locale.KeyTypeData.Fragment
        public boolean AEQbTJ(String str) {
            return KWHzl.matcher(str).matches();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CODEPOINTS' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class SpecialType {
        private static final /* synthetic */ SpecialType[] $VALUES;
        public static final SpecialType CODEPOINTS;
        public static final SpecialType PRIVATE_USE;
        public static final SpecialType REORDER_CODE;
        public static final SpecialType RG_KEY_VALUE;
        public static final SpecialType SCRIPT_CODE;
        public static final SpecialType SUBDIVISION_CODE;
        Fragment handler;

        public static SpecialType valueOf(String str) {
            return (SpecialType) Enum.valueOf(SpecialType.class, str);
        }

        public static SpecialType[] values() {
            return (SpecialType[]) $VALUES.clone();
        }

        static {
            AnonymousClass5 anonymousClass5 = null;
            SpecialType specialType = new SpecialType("CODEPOINTS", 0, new StateListAnimator(anonymousClass5));
            CODEPOINTS = specialType;
            SpecialType specialType2 = new SpecialType("REORDER_CODE", 1, new Application(anonymousClass5));
            REORDER_CODE = specialType2;
            SpecialType specialType3 = new SpecialType("RG_KEY_VALUE", 2, new ActionBar(anonymousClass5));
            RG_KEY_VALUE = specialType3;
            SpecialType specialType4 = new SpecialType("SCRIPT_CODE", 3, new FragmentManager(anonymousClass5));
            SCRIPT_CODE = specialType4;
            SpecialType specialType5 = new SpecialType("SUBDIVISION_CODE", 4, new Dialog(anonymousClass5));
            SUBDIVISION_CODE = specialType5;
            SpecialType specialType6 = new SpecialType("PRIVATE_USE", 5, new TaskDescription(anonymousClass5));
            PRIVATE_USE = specialType6;
            $VALUES = new SpecialType[]{specialType, specialType2, specialType3, specialType4, specialType5, specialType6};
        }

        private SpecialType(String str, int i, Fragment fragment) {
            this.handler = fragment;
        }
    }

    public static class Activity {
        public Map<String, LoaderManager> AEQbTJ;
        public String KWHzl;
        public EnumSet<SpecialType> OLrzqt;
        public String copydefault;

        public Activity(String str, String str2, Map<String, LoaderManager> map, EnumSet<SpecialType> enumSet) {
            this.copydefault = str;
            this.KWHzl = str2;
            this.AEQbTJ = map;
            this.OLrzqt = enumSet;
        }
    }

    public static class LoaderManager {
        public String AEQbTJ;
        public String OLrzqt;

        public LoaderManager(String str, String str2) {
            this.AEQbTJ = str;
            this.OLrzqt = str2;
        }
    }

    public static String OLrzqt(String str) {
        Activity activity = AEQbTJ.get(C7090adK.AEQbTJ(str));
        if (activity != null) {
            return activity.KWHzl;
        }
        return null;
    }

    public static String AEQbTJ(String str) {
        Activity activity = AEQbTJ.get(C7090adK.AEQbTJ(str));
        if (activity != null) {
            return activity.copydefault;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Boolean] */
    public static String OLrzqt(String str, String str2, C7255agQ<Boolean> c7255agQ, C7255agQ<Boolean> c7255agQ2) {
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.FALSE;
        }
        if (c7255agQ2 != null) {
            c7255agQ2.copydefault = Boolean.FALSE;
        }
        String strAEQbTJ = C7090adK.AEQbTJ(str);
        String strAEQbTJ2 = C7090adK.AEQbTJ(str2);
        Activity activity = AEQbTJ.get(strAEQbTJ);
        if (activity == null) {
            return null;
        }
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.TRUE;
        }
        LoaderManager loaderManager = activity.AEQbTJ.get(strAEQbTJ2);
        if (loaderManager != null) {
            return loaderManager.OLrzqt;
        }
        EnumSet<SpecialType> enumSet = activity.OLrzqt;
        if (enumSet == null) {
            return null;
        }
        for (SpecialType specialType : enumSet) {
            if (specialType.handler.AEQbTJ(strAEQbTJ2)) {
                if (c7255agQ2 != null) {
                    c7255agQ2.copydefault = Boolean.TRUE;
                }
                return specialType.handler.OLrzqt(strAEQbTJ2);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Boolean] */
    public static String AEQbTJ(String str, String str2, C7255agQ<Boolean> c7255agQ, C7255agQ<Boolean> c7255agQ2) {
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.FALSE;
        }
        if (c7255agQ2 != null) {
            c7255agQ2.copydefault = Boolean.FALSE;
        }
        String strAEQbTJ = C7090adK.AEQbTJ(str);
        String strAEQbTJ2 = C7090adK.AEQbTJ(str2);
        Activity activity = AEQbTJ.get(strAEQbTJ);
        if (activity == null) {
            return null;
        }
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.TRUE;
        }
        LoaderManager loaderManager = activity.AEQbTJ.get(strAEQbTJ2);
        if (loaderManager != null) {
            return loaderManager.AEQbTJ;
        }
        EnumSet<SpecialType> enumSet = activity.OLrzqt;
        if (enumSet == null) {
            return null;
        }
        for (SpecialType specialType : enumSet) {
            if (specialType.handler.AEQbTJ(strAEQbTJ2)) {
                if (c7255agQ2 != null) {
                    c7255agQ2.copydefault = Boolean.TRUE;
                }
                return specialType.handler.OLrzqt(strAEQbTJ2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OLrzqt() {
        UResourceBundle uResourceBundleIsConnected;
        UResourceBundle uResourceBundleIsConnected2;
        boolean z;
        UResourceBundle uResourceBundleIsConnected3;
        HashMap map;
        Set hashSet;
        UResourceBundle uResourceBundleIsConnected4;
        HashMap map2;
        Set hashSet2;
        UResourceBundle uResourceBundleIsConnected5;
        UResourceBundle uResourceBundle;
        C7260agV c7260agV;
        UResourceBundle uResourceBundle2;
        EnumSet enumSetNoneOf;
        boolean z2;
        Set set;
        Set set2;
        ICUResourceBundle iCUResourceBundleKWHzl = ICUResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", "keyTypeData", ICUResourceBundle.AEQbTJ, ICUResourceBundle.OpenType.DIRECT);
        EZpvd(iCUResourceBundleKWHzl.isConnected("keyInfo"));
        AEQbTJ(iCUResourceBundleKWHzl.isConnected("typeInfo"));
        UResourceBundle uResourceBundleIsConnected6 = iCUResourceBundleKWHzl.isConnected("keyMap");
        UResourceBundle uResourceBundleIsConnected7 = iCUResourceBundleKWHzl.isConnected("typeMap");
        try {
            uResourceBundleIsConnected = iCUResourceBundleKWHzl.isConnected("typeAlias");
        } catch (MissingResourceException unused) {
            uResourceBundleIsConnected = null;
        }
        try {
            uResourceBundleIsConnected2 = iCUResourceBundleKWHzl.isConnected("bcpTypeAlias");
        } catch (MissingResourceException unused2) {
            uResourceBundleIsConnected2 = null;
        }
        C7260agV newProxyInstance = uResourceBundleIsConnected6.getNewProxyInstance();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (newProxyInstance.EZpvd()) {
            UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
            String strAEQbTJ = uResourceBundleCopydefault.AEQbTJ();
            String fieldNames = uResourceBundleCopydefault.getFieldNames();
            if (fieldNames.length() == 0) {
                fieldNames = strAEQbTJ;
                z = true;
            } else {
                z = false;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(fieldNames, Collections.unmodifiableSet(linkedHashSet));
            boolean zEquals = strAEQbTJ.equals("timezone");
            char c = JsonPointer.SEPARATOR;
            if (uResourceBundleIsConnected != null) {
                try {
                    uResourceBundleIsConnected3 = uResourceBundleIsConnected.isConnected(strAEQbTJ);
                } catch (MissingResourceException unused3) {
                    uResourceBundleIsConnected3 = null;
                }
                if (uResourceBundleIsConnected3 != null) {
                    map = new HashMap();
                    C7260agV newProxyInstance2 = uResourceBundleIsConnected3.getNewProxyInstance();
                    while (newProxyInstance2.EZpvd()) {
                        UResourceBundle uResourceBundleCopydefault2 = newProxyInstance2.copydefault();
                        String strAEQbTJ2 = uResourceBundleCopydefault2.AEQbTJ();
                        String fieldNames2 = uResourceBundleCopydefault2.getFieldNames();
                        if (zEquals) {
                            strAEQbTJ2 = strAEQbTJ2.replace(AbstractJsonLexerKt.COLON, c);
                        }
                        Set set3 = (Set) map.get(fieldNames2);
                        if (set3 == null) {
                            hashSet = new HashSet();
                            map.put(fieldNames2, hashSet);
                        } else {
                            hashSet = set3;
                        }
                        hashSet.add(strAEQbTJ2);
                        c = JsonPointer.SEPARATOR;
                    }
                } else {
                    map = null;
                }
            }
            if (uResourceBundleIsConnected2 != null) {
                try {
                    uResourceBundleIsConnected4 = uResourceBundleIsConnected2.isConnected(fieldNames);
                } catch (MissingResourceException unused4) {
                    uResourceBundleIsConnected4 = null;
                }
                if (uResourceBundleIsConnected4 != null) {
                    map2 = new HashMap();
                    C7260agV newProxyInstance3 = uResourceBundleIsConnected4.getNewProxyInstance();
                    while (newProxyInstance3.EZpvd()) {
                        UResourceBundle uResourceBundleCopydefault3 = newProxyInstance3.copydefault();
                        String strAEQbTJ3 = uResourceBundleCopydefault3.AEQbTJ();
                        String fieldNames3 = uResourceBundleCopydefault3.getFieldNames();
                        Set set4 = (Set) map2.get(fieldNames3);
                        if (set4 == null) {
                            hashSet2 = new HashSet();
                            map2.put(fieldNames3, hashSet2);
                        } else {
                            hashSet2 = set4;
                        }
                        hashSet2.add(strAEQbTJ3);
                    }
                } else {
                    map2 = null;
                }
            }
            HashMap map3 = new HashMap();
            try {
                uResourceBundleIsConnected5 = uResourceBundleIsConnected7.isConnected(strAEQbTJ);
            } catch (MissingResourceException unused5) {
                uResourceBundleIsConnected5 = null;
            }
            if (uResourceBundleIsConnected5 != null) {
                C7260agV newProxyInstance4 = uResourceBundleIsConnected5.getNewProxyInstance();
                enumSetNoneOf = null;
                while (newProxyInstance4.EZpvd()) {
                    UResourceBundle uResourceBundleCopydefault4 = newProxyInstance4.copydefault();
                    UResourceBundle uResourceBundle3 = uResourceBundleIsConnected2;
                    String strAEQbTJ4 = uResourceBundleCopydefault4.AEQbTJ();
                    String fieldNames4 = uResourceBundleCopydefault4.getFieldNames();
                    C7260agV c7260agV2 = newProxyInstance;
                    UResourceBundle uResourceBundle4 = uResourceBundleIsConnected7;
                    char cCharAt = strAEQbTJ4.charAt(0);
                    if ('9' < cCharAt && cCharAt < 'a' && fieldNames4.length() == 0) {
                        if (enumSetNoneOf == null) {
                            enumSetNoneOf = EnumSet.noneOf(SpecialType.class);
                        }
                        enumSetNoneOf.add(SpecialType.valueOf(strAEQbTJ4));
                        linkedHashSet.add(strAEQbTJ4);
                    } else {
                        if (zEquals) {
                            strAEQbTJ4 = strAEQbTJ4.replace(AbstractJsonLexerKt.COLON, JsonPointer.SEPARATOR);
                        }
                        if (fieldNames4.length() == 0) {
                            z2 = true;
                            fieldNames4 = strAEQbTJ4;
                        } else {
                            z2 = false;
                        }
                        linkedHashSet.add(fieldNames4);
                        LoaderManager loaderManager = new LoaderManager(strAEQbTJ4, fieldNames4);
                        map3.put(C7090adK.AEQbTJ(strAEQbTJ4), loaderManager);
                        if (!z2) {
                            map3.put(C7090adK.AEQbTJ(fieldNames4), loaderManager);
                        }
                        if (map != null && (set2 = (Set) map.get(strAEQbTJ4)) != null) {
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                map3.put(C7090adK.AEQbTJ((String) it.next()), loaderManager);
                            }
                        }
                        if (map2 != null && (set = (Set) map2.get(fieldNames4)) != null) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                map3.put(C7090adK.AEQbTJ((String) it2.next()), loaderManager);
                            }
                        }
                    }
                    uResourceBundleIsConnected2 = uResourceBundle3;
                    uResourceBundleIsConnected7 = uResourceBundle4;
                    newProxyInstance = c7260agV2;
                }
                uResourceBundle = uResourceBundleIsConnected2;
                c7260agV = newProxyInstance;
                uResourceBundle2 = uResourceBundleIsConnected7;
            } else {
                uResourceBundle = uResourceBundleIsConnected2;
                c7260agV = newProxyInstance;
                uResourceBundle2 = uResourceBundleIsConnected7;
                enumSetNoneOf = null;
            }
            Activity activity = new Activity(strAEQbTJ, fieldNames, map3, enumSetNoneOf);
            Map<String, Activity> map4 = AEQbTJ;
            map4.put(C7090adK.AEQbTJ(strAEQbTJ), activity);
            if (!z) {
                map4.put(C7090adK.AEQbTJ(fieldNames), activity);
            }
            uResourceBundleIsConnected2 = uResourceBundle;
            uResourceBundleIsConnected7 = uResourceBundle2;
            newProxyInstance = c7260agV;
        }
        OLrzqt = Collections.unmodifiableMap(linkedHashMap);
    }

    static {
        OLrzqt();
    }

    public static void EZpvd(UResourceBundle uResourceBundle) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7260agV newProxyInstance = uResourceBundle.getNewProxyInstance();
        while (newProxyInstance.EZpvd()) {
            UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
            KeyInfoType keyInfoTypeValueOf = KeyInfoType.valueOf(uResourceBundleCopydefault.AEQbTJ());
            C7260agV newProxyInstance2 = uResourceBundleCopydefault.getNewProxyInstance();
            while (newProxyInstance2.EZpvd()) {
                UResourceBundle uResourceBundleCopydefault2 = newProxyInstance2.copydefault();
                String strAEQbTJ = uResourceBundleCopydefault2.AEQbTJ();
                String fieldNames = uResourceBundleCopydefault2.getFieldNames();
                int i = AnonymousClass5.OLrzqt[keyInfoTypeValueOf.ordinal()];
                if (i == 1) {
                    linkedHashSet.add(strAEQbTJ);
                } else if (i == 2) {
                    linkedHashMap.put(strAEQbTJ, ValueType.valueOf(fieldNames));
                }
            }
        }
        copydefault = Collections.unmodifiableSet(linkedHashSet);
        valueOf = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void AEQbTJ(UResourceBundle uResourceBundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7260agV newProxyInstance = uResourceBundle.getNewProxyInstance();
        while (newProxyInstance.EZpvd()) {
            UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
            TypeInfoType typeInfoTypeValueOf = TypeInfoType.valueOf(uResourceBundleCopydefault.AEQbTJ());
            C7260agV newProxyInstance2 = uResourceBundleCopydefault.getNewProxyInstance();
            while (newProxyInstance2.EZpvd()) {
                UResourceBundle uResourceBundleCopydefault2 = newProxyInstance2.copydefault();
                String strAEQbTJ = uResourceBundleCopydefault2.AEQbTJ();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C7260agV newProxyInstance3 = uResourceBundleCopydefault2.getNewProxyInstance();
                while (newProxyInstance3.EZpvd()) {
                    String strAEQbTJ2 = newProxyInstance3.copydefault().AEQbTJ();
                    if (AnonymousClass5.copydefault[typeInfoTypeValueOf.ordinal()] == 1) {
                        linkedHashSet.add(strAEQbTJ2);
                    }
                }
                linkedHashMap.put(strAEQbTJ, Collections.unmodifiableSet(linkedHashSet));
            }
        }
        KWHzl = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.locale.KeyTypeData$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[TypeInfoType.values().length];
            copydefault = iArr;
            try {
                iArr[TypeInfoType.deprecated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[KeyInfoType.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[KeyInfoType.deprecated.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[KeyInfoType.valueType.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
