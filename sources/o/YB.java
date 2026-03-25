package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class YB extends WT {
    public final JsonInclude.Value AEQbTJ;
    public final PropertyMetadata AhwBna;
    public final AnnotatedMember KWHzl;
    public final PropertyName OLrzqt;
    public final AnnotationIntrospector copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public PropertyMetadata DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public JsonInclude.Value EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public AnnotatedMember ejfBZ() {
        return this.KWHzl;
    }

    @Override // o.WT
    public boolean getFieldNames() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public PropertyName isConnected() {
        return this.OLrzqt;
    }

    @Override // o.WT
    public boolean wlaJM() {
        return false;
    }

    public YB(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.copydefault = annotationIntrospector;
        this.KWHzl = annotatedMember;
        this.OLrzqt = propertyName;
        this.AhwBna = propertyMetadata == null ? PropertyMetadata.STD_OPTIONAL : propertyMetadata;
        this.AEQbTJ = value;
    }

    public static YB EZpvd(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return OLrzqt(mapperConfig, annotatedMember, propertyName, null, WT.EZpvd);
    }

    public static YB copydefault(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        return new YB(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? WT.EZpvd : JsonInclude.Value.construct(include, null));
    }

    public static YB OLrzqt(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new YB(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    @Override // o.WT, o.InterfaceC5623Yw
    public java.lang.String getName() {
        return this.OLrzqt.getSimpleName();
    }

    @Override // o.WT
    public boolean copydefault(PropertyName propertyName) {
        return this.OLrzqt.equals(propertyName);
    }

    @Override // o.WT
    public PropertyName getNewProxyInstance() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.copydefault;
        if (annotationIntrospector == null || (annotatedMember = this.KWHzl) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMember);
    }

    @Override // o.WT
    public JavaType AuCTel() {
        AnnotatedMember annotatedMember = this.KWHzl;
        if (annotatedMember == null) {
            return TypeFactory.unknownType();
        }
        return annotatedMember.getType();
    }

    @Override // o.WT
    public java.lang.Class<?> fIwbmz() {
        AnnotatedMember annotatedMember = this.KWHzl;
        return annotatedMember == null ? java.lang.Object.class : annotatedMember.getRawType();
    }

    @Override // o.WT
    public boolean iwGUEr() {
        return fJNWhG() != null;
    }

    @Override // o.WT
    public boolean hDKMBd() {
        return this.KWHzl instanceof AnnotatedField;
    }

    @Override // o.WT
    public boolean uzCIH() {
        return this.KWHzl instanceof AnnotatedParameter;
    }

    @Override // o.WT
    public AnnotatedMethod fetchVPNInfo() {
        AnnotatedMember annotatedMember = this.KWHzl;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 0) {
            return (AnnotatedMethod) this.KWHzl;
        }
        return null;
    }

    @Override // o.WT
    public AnnotatedMethod fJNWhG() {
        AnnotatedMember annotatedMember = this.KWHzl;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 1) {
            return (AnnotatedMethod) this.KWHzl;
        }
        return null;
    }

    @Override // o.WT
    public AnnotatedField values() {
        AnnotatedMember annotatedMember = this.KWHzl;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    @Override // o.WT
    public AnnotatedParameter valueOf() {
        AnnotatedMember annotatedMember = this.KWHzl;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    @Override // o.WT
    public java.util.Iterator<AnnotatedParameter> AhwBna() {
        AnnotatedParameter annotatedParameterValueOf = valueOf();
        if (annotatedParameterValueOf == null) {
            return C5619Yr.KWHzl();
        }
        return Collections.singleton(annotatedParameterValueOf).iterator();
    }
}
