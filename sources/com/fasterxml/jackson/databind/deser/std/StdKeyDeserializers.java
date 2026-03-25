package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.C5619Yr;
import o.InterfaceC5556Wg;
import o.VC;
import o.WK;

/* JADX INFO: loaded from: classes21.dex */
public class StdKeyDeserializers implements InterfaceC5556Wg, Serializable {
    private static final long serialVersionUID = 1;

    public static VC constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static VC constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }

    public static VC constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC5548Vy<?> abstractC5548Vy) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), abstractC5548Vy);
    }

    public static VC findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        AbstractC5549Vz abstractC5549VzIntrospectForCreation = deserializationConfig.introspectForCreation(javaType);
        WK<AnnotatedConstructor, JsonCreator.Mode> wk_findStringConstructor = _findStringConstructor(abstractC5549VzIntrospectForCreation);
        if (wk_findStringConstructor != null && wk_findStringConstructor.copydefault != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) wk_findStringConstructor.KWHzl);
        }
        List<WK<AnnotatedMethod, JsonCreator.Mode>> listHDKMBd = abstractC5549VzIntrospectForCreation.hDKMBd();
        listHDKMBd.removeIf(new Predicate() { // from class: o.Ww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return StdKeyDeserializers.lambda$findStringBasedKeyDeserializer$0((WK) obj);
            }
        });
        AnnotatedMethod annotatedMethod_findExplicitStringFactoryMethod = _findExplicitStringFactoryMethod(listHDKMBd);
        if (annotatedMethod_findExplicitStringFactoryMethod != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, annotatedMethod_findExplicitStringFactoryMethod);
        }
        if (wk_findStringConstructor != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) wk_findStringConstructor.KWHzl);
        }
        if (listHDKMBd.isEmpty()) {
            return null;
        }
        return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) listHDKMBd.get(0).KWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findStringBasedKeyDeserializer$0(WK wk) {
        return (((AnnotatedMethod) wk.KWHzl).getParameterCount() == 1 && ((AnnotatedMethod) wk.KWHzl).getRawParameterType(0) == String.class && wk.copydefault != JsonCreator.Mode.PROPERTIES) ? false : true;
    }

    private static VC _constructCreatorKeyDeserializer(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) annotatedMember).getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                C5619Yr.EZpvd(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(annotated);
        }
        Method annotated2 = ((AnnotatedMethod) annotatedMember).getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            C5619Yr.EZpvd(annotated2, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(annotated2);
    }

    private static WK<AnnotatedConstructor, JsonCreator.Mode> _findStringConstructor(AbstractC5549Vz abstractC5549Vz) {
        for (WK<AnnotatedConstructor, JsonCreator.Mode> wk : abstractC5549Vz.fIwbmz()) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) wk.KWHzl;
            if (annotatedConstructor.getParameterCount() == 1 && String.class == annotatedConstructor.getRawParameterType(0)) {
                return wk;
            }
        }
        return null;
    }

    private static AnnotatedMethod _findExplicitStringFactoryMethod(List<WK<AnnotatedMethod, JsonCreator.Mode>> list) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = null;
        for (WK<AnnotatedMethod, JsonCreator.Mode> wk : list) {
            if (wk.copydefault != null) {
                if (annotatedMethod != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + C5619Yr.uzCIH(((AnnotatedMethod) wk.KWHzl).getDeclaringClass()));
                }
                annotatedMethod = (AnnotatedMethod) wk.KWHzl;
            }
        }
        return annotatedMethod;
    }

    @Override // o.InterfaceC5556Wg
    public VC findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = C5619Yr.getFieldNames(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }
}
