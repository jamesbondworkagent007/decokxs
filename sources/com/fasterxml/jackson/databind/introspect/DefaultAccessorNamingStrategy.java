package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.AbstractC5549Vz;
import o.C5582Xg;
import o.VO;
import o.WJ;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {
    public final WJ AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final MapperConfig<?> OLrzqt;
    public final TaskDescription copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;

    public interface TaskDescription {
        boolean copydefault(char c, String str, int i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String modifyFieldName(AnnotatedField annotatedField, String str) {
        return str;
    }

    public DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, WJ wj, String str, String str2, String str3, TaskDescription taskDescription) {
        this.OLrzqt = mapperConfig;
        this.AEQbTJ = wj;
        this.djBIcL = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this.gEmmrt = mapperConfig.isEnabled(MapperFeature.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.AYXKKw = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.copydefault = taskDescription;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
        if (this.KWHzl == null) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if ((!this.gEmmrt && rawType != Boolean.class && rawType != Boolean.TYPE) || !str.startsWith(this.KWHzl)) {
            return null;
        }
        if (this.djBIcL) {
            return AEQbTJ(str, 2);
        }
        return OLrzqt(str, 2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.EZpvd;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (KWHzl(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && OLrzqt(annotatedMethod)) {
            return null;
        }
        if (this.djBIcL) {
            return AEQbTJ(str, this.EZpvd.length());
        }
        return OLrzqt(str, this.EZpvd.length());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForMutator(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.AYXKKw;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (this.djBIcL) {
            return AEQbTJ(str, this.AYXKKw.length());
        }
        return OLrzqt(str, this.AYXKKw.length());
    }

    public String OLrzqt(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null && !taskDescription.copydefault(cCharAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public String AEQbTJ(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null && !taskDescription.copydefault(cCharAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }

    public boolean KWHzl(AnnotatedMethod annotatedMethod) {
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray()) {
            String name = rawType.getComponentType().getName();
            if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                return true;
            }
        }
        return false;
    }

    public boolean OLrzqt(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.getRawType().getName().startsWith("groovy.lang");
    }

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
        private static final long serialVersionUID = 1;
        protected final TaskDescription _baseNameValidator;
        protected final String _getterPrefix;
        protected final String _isGetterPrefix;
        protected final String _setterPrefix;
        protected final String _withPrefix;

        public Provider() {
            this("set", "with", "get", "is", (TaskDescription) null);
        }

        public Provider(Provider provider, String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, provider._baseNameValidator);
        }

        public Provider(Provider provider, TaskDescription taskDescription) {
            this(provider._setterPrefix, provider._withPrefix, provider._getterPrefix, provider._isGetterPrefix, taskDescription);
        }

        public Provider(String str, String str2, String str3, String str4, TaskDescription taskDescription) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
            this._baseNameValidator = taskDescription;
        }

        public Provider withSetterPrefix(String str) {
            return new Provider(this, str, this._withPrefix, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withBuilderPrefix(String str) {
            return new Provider(this, this._setterPrefix, str, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, str, this._isGetterPrefix);
        }

        public Provider withIsGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, this._getterPrefix, str);
        }

        public Provider withFirstCharAcceptance(boolean z, boolean z2) {
            return withBaseNameValidator(ActionBar.EZpvd(z, z2));
        }

        public Provider withBaseNameValidator(TaskDescription taskDescription) {
            return new Provider(this, taskDescription);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, WJ wj) {
            return new DefaultAccessorNamingStrategy(mapperConfig, wj, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, WJ wj, AbstractC5549Vz abstractC5549Vz) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            VO.StateListAnimator stateListAnimatorFindPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(wj) : null;
            return new DefaultAccessorNamingStrategy(mapperConfig, wj, stateListAnimatorFindPOJOBuilderConfig == null ? this._withPrefix : stateListAnimatorFindPOJOBuilderConfig.AEQbTJ, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, WJ wj) {
            return new StateListAnimator(mapperConfig, wj);
        }
    }

    public static class ActionBar implements TaskDescription {
        public final boolean AEQbTJ;
        public final boolean KWHzl;

        public ActionBar(boolean z, boolean z2) {
            this.KWHzl = z;
            this.AEQbTJ = z2;
        }

        public static TaskDescription EZpvd(boolean z, boolean z2) {
            if (z || z2) {
                return new ActionBar(z, z2);
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.TaskDescription
        public boolean copydefault(char c, String str, int i) {
            return Character.isLetter(c) ? this.KWHzl || !Character.isLowerCase(c) : this.AEQbTJ;
        }
    }

    public static class StateListAnimator extends DefaultAccessorNamingStrategy {
        public final Set<String> AhwBna;

        public StateListAnimator(MapperConfig<?> mapperConfig, WJ wj) {
            Set<String> hashSet;
            super(mapperConfig, wj, null, "get", "is", null);
            String[] strArrAEQbTJ = C5582Xg.AEQbTJ(wj.getRawType());
            if (strArrAEQbTJ == null) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet(Arrays.asList(strArrAEQbTJ));
            }
            this.AhwBna = hashSet;
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy, com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
            return this.AhwBna.contains(str) ? str : super.findNameForRegularGetter(annotatedMethod, str);
        }
    }
}
