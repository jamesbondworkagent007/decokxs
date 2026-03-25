package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes21.dex */
public class XW {
    public static final java.lang.Object copydefault = java.lang.Boolean.FALSE;
    public java.lang.Object AEQbTJ;
    public final AnnotationIntrospector EZpvd;
    public final SerializationConfig KWHzl;
    public final AbstractC5549Vz OLrzqt;
    public final JsonInclude.Value djBIcL;
    public final boolean valueOf;

    public XW(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz) {
        this.KWHzl = serializationConfig;
        this.OLrzqt = abstractC5549Vz;
        JsonInclude.Value valueMerge = JsonInclude.Value.merge(abstractC5549Vz.KWHzl(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(abstractC5549Vz.DbNXlk(), JsonInclude.Value.empty()));
        this.djBIcL = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), valueMerge);
        this.valueOf = valueMerge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this.EZpvd = serializationConfig.getAnnotationIntrospector();
    }

    public BeanPropertyWriter EZpvd(VI vi, WT wt, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, AbstractC5601Xz abstractC5601Xz2, AnnotatedMember annotatedMember, boolean z) throws JsonMappingException {
        JavaType javaType2;
        java.lang.Object objOLrzqt;
        java.lang.Object objKWHzl;
        java.lang.Object obj;
        boolean z2;
        java.lang.Object obj2;
        try {
            JavaType javaTypeAEQbTJ = AEQbTJ(annotatedMember, z, javaType);
            if (abstractC5601Xz2 != null) {
                if (javaTypeAEQbTJ == null) {
                    javaTypeAEQbTJ = javaType;
                }
                if (javaTypeAEQbTJ.getContentType() == null) {
                    vi.reportBadPropertyDefinition(this.OLrzqt, wt, "serialization type " + javaTypeAEQbTJ + " has no content", new java.lang.Object[0]);
                }
                JavaType javaTypeWithContentTypeHandler = javaTypeAEQbTJ.withContentTypeHandler(abstractC5601Xz2);
                javaTypeWithContentTypeHandler.getContentType();
                javaType2 = javaTypeWithContentTypeHandler;
            } else {
                javaType2 = javaTypeAEQbTJ;
            }
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember annotatedMemberGEmmrt = wt.gEmmrt();
            if (annotatedMemberGEmmrt == null) {
                return (BeanPropertyWriter) vi.reportBadPropertyDefinition(this.OLrzqt, wt, "could not determine property type", new java.lang.Object[0]);
            }
            JsonInclude.Value valueWithOverrides = this.KWHzl.getDefaultInclusion(javaType3.getRawClass(), annotatedMemberGEmmrt.getRawType(), this.djBIcL).withOverrides(wt.EZpvd());
            JsonInclude.Include valueInclusion = valueWithOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i = AnonymousClass2.EZpvd[valueInclusion.ordinal()];
            java.lang.Object objOLrzqt2 = null;
            boolean z3 = true;
            if (i != 1) {
                if (i == 2) {
                    if (javaType3.isReferenceType()) {
                        obj2 = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    }
                    obj = objOLrzqt2;
                    z2 = z3;
                } else if (i != 3) {
                    if (i == 4) {
                        objOLrzqt = vi.includeFilterInstance(wt, valueWithOverrides.getValueFilter());
                    } else {
                        z = i == 5;
                        SerializationFeature serializationFeature = SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
                        if (javaType3.isContainerType() && !this.KWHzl.isEnabled(serializationFeature)) {
                            objOLrzqt = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        }
                        z3 = z;
                        obj = objOLrzqt2;
                        z2 = z3;
                    }
                    obj = objOLrzqt;
                    z2 = z;
                } else {
                    obj2 = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                obj = obj2;
                z2 = z3;
            } else {
                if (this.valueOf && (objKWHzl = KWHzl()) != null) {
                    if (vi.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this.KWHzl.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        objOLrzqt2 = annotatedMember.getValue(objKWHzl);
                    } catch (java.lang.Exception e) {
                        KWHzl(e, wt.getName(), objKWHzl);
                    }
                } else {
                    objOLrzqt2 = C5614Ym.OLrzqt(javaType3);
                    z = true;
                }
                if (objOLrzqt2 != null) {
                    if (objOLrzqt2.getClass().isArray()) {
                        objOLrzqt = C5617Yp.OLrzqt(objOLrzqt2);
                        obj = objOLrzqt;
                        z2 = z;
                    }
                    z3 = z;
                }
                obj = objOLrzqt2;
                z2 = z3;
            }
            java.lang.Class<?>[] clsArrDjBIcL = wt.djBIcL();
            if (clsArrDjBIcL == null) {
                clsArrDjBIcL = this.OLrzqt.OLrzqt();
            }
            BeanPropertyWriter beanPropertyWriterAEQbTJ = AEQbTJ(wt, annotatedMember, this.OLrzqt.fJNWhG(), javaType, vd, abstractC5601Xz, javaType2, z2, obj, clsArrDjBIcL);
            java.lang.Object objFindNullSerializer = this.EZpvd.findNullSerializer(annotatedMember);
            if (objFindNullSerializer != null) {
                beanPropertyWriterAEQbTJ.assignNullSerializer(vi.serializerInstance(annotatedMember, objFindNullSerializer));
            }
            NameTransformer nameTransformerFindUnwrappingNameTransformer = this.EZpvd.findUnwrappingNameTransformer(annotatedMember);
            return nameTransformerFindUnwrappingNameTransformer != null ? beanPropertyWriterAEQbTJ.unwrappingWriter(nameTransformerFindUnwrappingNameTransformer) : beanPropertyWriterAEQbTJ;
        } catch (JsonMappingException e2) {
            if (wt == null) {
                return (BeanPropertyWriter) vi.reportBadDefinition(javaType, C5619Yr.EZpvd((java.lang.Throwable) e2));
            }
            return (BeanPropertyWriter) vi.reportBadPropertyDefinition(this.OLrzqt, wt, C5619Yr.EZpvd((java.lang.Throwable) e2), new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.XW$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            EZpvd = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public BeanPropertyWriter AEQbTJ(WT wt, AnnotatedMember annotatedMember, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, JavaType javaType2, boolean z, java.lang.Object obj, java.lang.Class<?>[] clsArr) throws JsonMappingException {
        return new BeanPropertyWriter(wt, annotatedMember, interfaceC5609Yh, javaType, vd, abstractC5601Xz, javaType2, z, obj, clsArr);
    }

    public JavaType AEQbTJ(WM wm, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType = this.EZpvd.refineSerializationType(this.KWHzl, wm, javaType);
        if (javaTypeRefineSerializationType != javaType) {
            java.lang.Class<?> rawClass = javaTypeRefineSerializationType.getRawClass();
            java.lang.Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new java.lang.IllegalArgumentException("Illegal concrete-type annotation for method '" + wm.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            z = true;
            javaType = javaTypeRefineSerializationType;
        }
        JsonSerialize.Typing typingFindSerializationTyping = this.EZpvd.findSerializationTyping(wm);
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            if (!z) {
                return null;
            }
        } else if (typingFindSerializationTyping != JsonSerialize.Typing.STATIC) {
            return null;
        }
        return javaType.withStaticTyping();
    }

    public java.lang.Object KWHzl() {
        java.lang.Object objCopydefault = this.AEQbTJ;
        if (objCopydefault == null) {
            objCopydefault = this.OLrzqt.copydefault(this.KWHzl.canOverrideAccessModifiers());
            if (objCopydefault == null) {
                objCopydefault = copydefault;
            }
            this.AEQbTJ = objCopydefault;
        }
        if (objCopydefault == copydefault) {
            return null;
        }
        return this.AEQbTJ;
    }

    public java.lang.Object KWHzl(java.lang.Exception exc, java.lang.String str, java.lang.Object obj) {
        java.lang.Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        C5619Yr.copydefault(cause);
        C5619Yr.AhwBna(cause);
        throw new java.lang.IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }
}
