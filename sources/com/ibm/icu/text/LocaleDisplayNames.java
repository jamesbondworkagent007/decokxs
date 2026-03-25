package com.ibm.icu.text;

import com.ibm.icu.util.ULocale;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C7053aca;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LocaleDisplayNames {
    public static final Method getNewProxyInstance;
    public static final Method hDKMBd;

    public enum DialectHandling {
        STANDARD_NAMES,
        DIALECT_NAMES
    }

    public abstract String AEQbTJ(String str);

    public abstract String AYXKKw(String str);

    public abstract String KWHzl(String str);

    public abstract String OLrzqt(ULocale uLocale);

    public abstract String OLrzqt(String str);

    public abstract String OLrzqt(String str, String str2);

    public abstract String copydefault(String str);

    public static LocaleDisplayNames KWHzl(ULocale uLocale) {
        return OLrzqt(uLocale, DialectHandling.STANDARD_NAMES);
    }

    public static LocaleDisplayNames OLrzqt(ULocale uLocale, DialectHandling dialectHandling) {
        LocaleDisplayNames localeDisplayNames;
        Method method = getNewProxyInstance;
        if (method != null) {
            try {
                localeDisplayNames = (LocaleDisplayNames) method.invoke(null, uLocale, dialectHandling);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                localeDisplayNames = null;
            }
        } else {
            localeDisplayNames = null;
        }
        return localeDisplayNames == null ? new StateListAnimator(uLocale, dialectHandling) : localeDisplayNames;
    }

    @Deprecated
    public String djBIcL(String str) {
        return OLrzqt(str);
    }

    @Deprecated
    public LocaleDisplayNames() {
    }

    static {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(C7053aca.AEQbTJ("com.ibm.icu.text.LocaleDisplayNames.impl", "com.ibm.icu.impl.LocaleDisplayNamesImpl"));
            try {
                method2 = cls.getMethod("getInstance", ULocale.class, DialectHandling.class);
            } catch (NoSuchMethodException unused) {
                method2 = null;
            }
            try {
                method3 = cls.getMethod("getInstance", ULocale.class, DisplayContext[].class);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            }
            method = method3;
            method3 = method2;
        } catch (ClassNotFoundException unused3) {
            method = null;
        }
        getNewProxyInstance = method3;
        hDKMBd = method;
    }

    public static class StateListAnimator extends LocaleDisplayNames {
        public ULocale EZpvd;
        public DisplayContext[] KWHzl;

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String AEQbTJ(String str) {
            return str;
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String AYXKKw(String str) {
            return str;
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String KWHzl(String str) {
            return str;
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String OLrzqt(String str) {
            return str;
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String OLrzqt(String str, String str2) {
            return str2;
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String copydefault(String str) {
            return str;
        }

        public StateListAnimator(ULocale uLocale, DialectHandling dialectHandling) {
            this.EZpvd = uLocale;
            this.KWHzl = new DisplayContext[]{dialectHandling == DialectHandling.DIALECT_NAMES ? DisplayContext.DIALECT_NAMES : DisplayContext.STANDARD_NAMES};
        }

        @Override // com.ibm.icu.text.LocaleDisplayNames
        public String OLrzqt(ULocale uLocale) {
            return uLocale.getName();
        }
    }
}
