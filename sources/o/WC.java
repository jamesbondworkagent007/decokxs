package o;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* JADX INFO: loaded from: classes21.dex */
public class WC extends WD {
    public final java.lang.Class<?> AEQbTJ = ConstructorProperties.class;

    @Override // o.WD
    public java.lang.Boolean KWHzl(WM wm) {
        Transient annotation = wm.getAnnotation(Transient.class);
        if (annotation != null) {
            return java.lang.Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // o.WD
    public java.lang.Boolean EZpvd(WM wm) {
        if (wm.getAnnotation(ConstructorProperties.class) != null) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    @Override // o.WD
    public PropertyName AEQbTJ(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        java.lang.String[] strArrValue = annotation.value();
        int index = annotatedParameter.getIndex();
        if (index < strArrValue.length) {
            return PropertyName.construct(strArrValue[index]);
        }
        return null;
    }
}
