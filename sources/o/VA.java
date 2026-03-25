package o;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.TimeZone;
import o.InterfaceC5621Yt;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VA {
    private static final int MAX_ERROR_STR_LEN = 500;

    public abstract boolean canOverrideAccessModifiers();

    public abstract JavaType constructSpecializedType(JavaType javaType, java.lang.Class<?> cls);

    public abstract java.lang.Class<?> getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract java.lang.Object getAttribute(java.lang.Object obj);

    public abstract MapperConfig<?> getConfig();

    public abstract JsonFormat.Value getDefaultPropertyFormat(java.lang.Class<?> cls);

    public abstract java.util.Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract TypeFactory getTypeFactory();

    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, java.lang.String str, java.lang.String str2);

    public abstract boolean isEnabled(MapperFeature mapperFeature);

    public abstract boolean isEnabled(VT vt);

    public abstract <T> T reportBadDefinition(JavaType javaType, java.lang.String str) throws JsonMappingException;

    public abstract VA setAttribute(java.lang.Object obj, java.lang.Object obj2);

    public JavaType constructType(java.lang.reflect.Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public JavaType resolveSubType(JavaType javaType, java.lang.String str) throws JsonMappingException {
        if (str.indexOf(60) > 0) {
            JavaType javaTypeConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (javaTypeConstructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return javaTypeConstructFromCanonical;
            }
        } else {
            try {
                java.lang.Class<?> clsFindClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(clsFindClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, clsFindClass);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            } catch (java.lang.Exception e) {
                throw invalidTypeIdException(javaType, str, java.lang.String.format("problem: (%s) %s", e.getClass().getName(), C5619Yr.EZpvd((java.lang.Throwable) e)));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, java.lang.String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            return _resolveAndValidateGeneric(javaType, str, polymorphicTypeValidator, iIndexOf);
        }
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validityValidateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validityValidateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        try {
            java.lang.Class<?> clsFindClass = getTypeFactory().findClass(str);
            if (!javaType.isTypeOrSuperTypeOf(clsFindClass)) {
                return (JavaType) _throwNotASubtype(javaType, str);
            }
            JavaType javaTypeConstructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, clsFindClass);
            return (validityValidateSubClassName != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, javaTypeConstructSpecializedType) == PolymorphicTypeValidator.Validity.ALLOWED) ? javaTypeConstructSpecializedType : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.Exception e) {
            throw invalidTypeIdException(javaType, str, java.lang.String.format("problem: (%s) %s", e.getClass().getName(), C5619Yr.EZpvd((java.lang.Throwable) e)));
        }
    }

    public final JavaType _resolveAndValidateGeneric(JavaType javaType, java.lang.String str, PolymorphicTypeValidator polymorphicTypeValidator, int i) throws JsonMappingException {
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validityValidateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i));
        if (validityValidateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        JavaType javaTypeConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
        if (!javaTypeConstructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
            return (JavaType) _throwNotASubtype(javaType, str);
        }
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
        return (validityValidateSubClassName == validity || polymorphicTypeValidator.validateSubType(config, javaType, javaTypeConstructFromCanonical) == validity) ? javaTypeConstructFromCanonical : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
    }

    public <T> T _throwNotASubtype(JavaType javaType, java.lang.String str) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public <T> T _throwSubtypeNameNotAllowed(JavaType javaType, java.lang.String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C5619Yr.copydefault(polymorphicTypeValidator) + ") denied resolution");
    }

    public <T> T _throwSubtypeClassNotAllowed(JavaType javaType, java.lang.String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + C5619Yr.copydefault(polymorphicTypeValidator) + ") denied resolution");
    }

    public ObjectIdGenerator<?> objectIdGeneratorInstance(WM wm, C5576Xa c5576Xa) throws JsonMappingException {
        java.lang.Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576Xa.EZpvd();
        MapperConfig<?> config = getConfig();
        VQ handlerInstantiator = config.getHandlerInstantiator();
        ObjectIdGenerator<?> objectIdGeneratorAEQbTJ = handlerInstantiator == null ? null : handlerInstantiator.AEQbTJ(config, wm, clsEZpvd);
        if (objectIdGeneratorAEQbTJ == null) {
            objectIdGeneratorAEQbTJ = (ObjectIdGenerator) C5619Yr.EZpvd(clsEZpvd, config.canOverrideAccessModifiers());
        }
        return objectIdGeneratorAEQbTJ.forScope(c5576Xa.AYXKKw());
    }

    public InterfaceC5500Ud objectIdResolverInstance(WM wm, C5576Xa c5576Xa) {
        java.lang.Class<? extends InterfaceC5500Ud> clsOLrzqt = c5576Xa.OLrzqt();
        MapperConfig<?> config = getConfig();
        VQ handlerInstantiator = config.getHandlerInstantiator();
        InterfaceC5500Ud interfaceC5500UdEZpvd = handlerInstantiator == null ? null : handlerInstantiator.EZpvd(config, wm, clsOLrzqt);
        return interfaceC5500UdEZpvd == null ? (InterfaceC5500Ud) C5619Yr.EZpvd(clsOLrzqt, config.canOverrideAccessModifiers()) : interfaceC5500UdEZpvd;
    }

    public InterfaceC5621Yt<java.lang.Object, java.lang.Object> converterInstance(WM wm, java.lang.Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC5621Yt) {
            return (InterfaceC5621Yt) obj;
        }
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        java.lang.Class<?> cls = (java.lang.Class) obj;
        if (cls == InterfaceC5621Yt.StateListAnimator.class || C5619Yr.fetchVPNInfo(cls)) {
            return null;
        }
        if (!InterfaceC5621Yt.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        MapperConfig<?> config = getConfig();
        VQ handlerInstantiator = config.getHandlerInstantiator();
        InterfaceC5621Yt<?, ?> interfaceC5621YtCopydefault = handlerInstantiator != null ? handlerInstantiator.copydefault(config, wm, cls) : null;
        return interfaceC5621YtCopydefault == null ? (InterfaceC5621Yt) C5619Yr.EZpvd(cls, config.canOverrideAccessModifiers()) : interfaceC5621YtCopydefault;
    }

    public <T> T reportBadDefinition(java.lang.Class<?> cls, java.lang.String str) throws JsonMappingException {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public final java.lang.String _format(java.lang.String str, java.lang.Object... objArr) {
        return objArr.length > 0 ? java.lang.String.format(str, objArr) : str;
    }

    public final java.lang.String _truncate(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public java.lang.String _quotedString(java.lang.String str) {
        return str == null ? "[N/A]" : java.lang.String.format("\"%s\"", _truncate(str));
    }

    public java.lang.String _colonConcat(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public java.lang.String _desc(java.lang.String str) {
        return str == null ? "[N/A]" : _truncate(str);
    }
}
