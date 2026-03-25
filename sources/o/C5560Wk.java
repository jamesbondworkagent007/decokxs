package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* JADX INFO: renamed from: o.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5560Wk {
    public static final java.lang.String[] KWHzl = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public final boolean AEQbTJ;
    public SettableBeanProperty[] EZpvd;
    public final AbstractC5549Vz OLrzqt;
    public final boolean djBIcL;
    public SettableBeanProperty[] gEmmrt;
    public SettableBeanProperty[] valueOf;
    public final AnnotatedWithParams[] copydefault = new AnnotatedWithParams[11];
    public int AhwBna = 0;
    public boolean AYXKKw = false;

    public C5560Wk(AbstractC5549Vz abstractC5549Vz, MapperConfig<?> mapperConfig) {
        this.OLrzqt = abstractC5549Vz;
        this.AEQbTJ = mapperConfig.canOverrideAccessModifiers();
        this.djBIcL = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public ValueInstantiator EZpvd(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType javaTypeOLrzqt = OLrzqt(deserializationContext, this.copydefault[8], this.valueOf);
        JavaType javaTypeOLrzqt2 = OLrzqt(deserializationContext, this.copydefault[10], this.EZpvd);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this.OLrzqt.getNewProxyInstance());
        AnnotatedWithParams[] annotatedWithParamsArr = this.copydefault;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[8], javaTypeOLrzqt, this.valueOf, annotatedWithParamsArr[9], this.gEmmrt);
        stdValueInstantiator.configureFromArraySettings(this.copydefault[10], javaTypeOLrzqt2, this.EZpvd);
        stdValueInstantiator.configureFromStringCreator(this.copydefault[1]);
        stdValueInstantiator.configureFromIntCreator(this.copydefault[2]);
        stdValueInstantiator.configureFromLongCreator(this.copydefault[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this.copydefault[4]);
        stdValueInstantiator.configureFromDoubleCreator(this.copydefault[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this.copydefault[6]);
        stdValueInstantiator.configureFromBooleanCreator(this.copydefault[7]);
        return stdValueInstantiator;
    }

    public void OLrzqt(AnnotatedWithParams annotatedWithParams) {
        this.copydefault[0] = (AnnotatedWithParams) EZpvd(annotatedWithParams);
    }

    public void AYXKKw(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 1, z);
    }

    public void OLrzqt(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 2, z);
    }

    public void gEmmrt(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 3, z);
    }

    public void AEQbTJ(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 4, z);
    }

    public void EZpvd(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 5, z);
    }

    public void KWHzl(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 6, z);
    }

    public void copydefault(AnnotatedWithParams annotatedWithParams, boolean z) {
        copydefault(annotatedWithParams, 7, z);
    }

    public void OLrzqt(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (copydefault(annotatedWithParams, 10, z)) {
                this.EZpvd = settableBeanPropertyArr;
            }
        } else if (copydefault(annotatedWithParams, 8, z)) {
            this.valueOf = settableBeanPropertyArr;
        }
    }

    public void AEQbTJ(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        java.lang.Integer num;
        if (copydefault(annotatedWithParams, 9, z)) {
            if (settableBeanPropertyArr.length > 1) {
                java.util.HashMap map = new java.util.HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    java.lang.String name = settableBeanPropertyArr[i].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) && (num = (java.lang.Integer) map.put(name, java.lang.Integer.valueOf(i))) != null) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, java.lang.Integer.valueOf(i), C5619Yr.uzCIH(this.OLrzqt.DbNXlk())));
                    }
                }
            }
            this.gEmmrt = settableBeanPropertyArr;
        }
    }

    public boolean KWHzl() {
        return this.copydefault[0] != null;
    }

    public boolean AEQbTJ() {
        return this.copydefault[8] != null;
    }

    public boolean EZpvd() {
        return this.copydefault[9] != null;
    }

    public final JavaType OLrzqt(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this.AYXKKw || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
        java.lang.Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        if (objFindDeserializer != null) {
            return parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer));
        }
        return annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    public final <T extends AnnotatedMember> T EZpvd(T t) {
        if (t != null && this.AEQbTJ) {
            C5619Yr.EZpvd((java.lang.reflect.Member) t.getAnnotated(), this.djBIcL);
        }
        return t;
    }

    public boolean copydefault(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        int i2 = 1 << i;
        this.AYXKKw = true;
        AnnotatedWithParams annotatedWithParams2 = this.copydefault[i];
        if (annotatedWithParams2 != null) {
            if ((this.AhwBna & i2) != 0) {
                if (!z) {
                    return false;
                }
            } else if (!z) {
            }
            if (annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                java.lang.Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                java.lang.Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (EZpvd(annotatedWithParams)) {
                        return false;
                    }
                    if (!EZpvd(annotatedWithParams2)) {
                        EZpvd(i, z, annotatedWithParams2, annotatedWithParams);
                    }
                } else {
                    if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                        return false;
                    }
                    if (!rawParameterType.isAssignableFrom(rawParameterType2)) {
                        if (rawParameterType.isPrimitive() != rawParameterType2.isPrimitive()) {
                            if (rawParameterType.isPrimitive()) {
                                return false;
                            }
                        } else {
                            EZpvd(i, z, annotatedWithParams2, annotatedWithParams);
                        }
                    }
                }
            }
        }
        if (z) {
            this.AhwBna |= i2;
        }
        this.copydefault[i] = (AnnotatedWithParams) EZpvd(annotatedWithParams);
        return true;
    }

    public void EZpvd(int i, boolean z, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = KWHzl[i];
        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
        objArr[2] = annotatedWithParams;
        objArr[3] = annotatedWithParams2;
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
    }

    public boolean EZpvd(AnnotatedWithParams annotatedWithParams) {
        return C5619Yr.AkhnZx(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName());
    }
}
