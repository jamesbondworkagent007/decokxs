package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes21.dex */
public class XK extends XD {
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;

    public XK(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        java.lang.String name = javaType.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.copydefault = "";
            this.EZpvd = JwtUtilsKt.JWT_DELIMITER;
        } else {
            this.EZpvd = name.substring(0, iLastIndexOf + 1);
            this.copydefault = name.substring(0, iLastIndexOf);
        }
    }

    public static XK EZpvd(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new XK(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // o.XD, o.XB
    public java.lang.String OLrzqt(java.lang.Object obj) {
        java.lang.String name = obj.getClass().getName();
        return name.startsWith(this.EZpvd) ? name.substring(this.EZpvd.length() - 1) : name;
    }

    @Override // o.XD
    public JavaType AEQbTJ(java.lang.String str, VA va) throws java.io.IOException {
        if (str.startsWith(JwtUtilsKt.JWT_DELIMITER)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + this.copydefault.length());
            if (this.copydefault.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.copydefault);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.AEQbTJ(str, va);
    }
}
