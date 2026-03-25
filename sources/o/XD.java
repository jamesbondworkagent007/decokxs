package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes21.dex */
public class XD extends XH {
    public final PolymorphicTypeValidator AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.XH, o.XB
    public java.lang.String AEQbTJ() {
        return "class name used as type id";
    }

    public XD(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.AEQbTJ = polymorphicTypeValidator;
    }

    public static XD AEQbTJ(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new XD(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // o.XB
    public java.lang.String OLrzqt(java.lang.Object obj) {
        return copydefault(obj, obj.getClass(), this.KWHzl);
    }

    @Override // o.XB
    public java.lang.String KWHzl(java.lang.Object obj, java.lang.Class<?> cls) {
        return copydefault(obj, cls, this.KWHzl);
    }

    @Override // o.XH, o.XB
    public JavaType KWHzl(VA va, java.lang.String str) throws java.io.IOException {
        return AEQbTJ(str, va);
    }

    public JavaType AEQbTJ(java.lang.String str, VA va) throws java.io.IOException {
        JavaType javaTypeResolveAndValidateSubType = va.resolveAndValidateSubType(this.OLrzqt, str, this.AEQbTJ);
        return (javaTypeResolveAndValidateSubType == null && (va instanceof DeserializationContext)) ? ((DeserializationContext) va).handleUnknownTypeId(this.OLrzqt, str, this, "no such class found") : javaTypeResolveAndValidateSubType;
    }

    public java.lang.String copydefault(java.lang.Object obj, java.lang.Class<?> cls, TypeFactory typeFactory) {
        if (C5619Yr.AkhnZx(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        java.lang.String name = cls.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || C5619Yr.isConnected(cls) == null || C5619Yr.isConnected(this.OLrzqt.getRawClass()) != null) ? name : this.OLrzqt.getRawClass().getName();
        }
        if (obj instanceof EnumSet) {
            return typeFactory.constructCollectionType(EnumSet.class, C5619Yr.EZpvd((EnumSet<?>) obj)).toCanonical();
        }
        return obj instanceof EnumMap ? typeFactory.constructMapType(EnumMap.class, C5619Yr.KWHzl((EnumMap<?, ?>) obj), java.lang.Object.class).toCanonical() : name;
    }
}
