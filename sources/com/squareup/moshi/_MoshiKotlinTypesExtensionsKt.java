package com.squareup.moshi;

import androidx.exifinterface.media.ExifInterface;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56551yJo;
import o.InterfaceC56559yJw;
import o.yHE;
import o.yJB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final Class<?> getRawType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        Class<?> rawType = Types.getRawType(type);
        Intrinsics.checkNotNullExpressionValue(rawType, "");
        return rawType;
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Set<? extends java.lang.annotation.Annotation>, java.util.Set<java.lang.annotation.Annotation> */
    public static final /* synthetic */ <T extends Annotation> Set<Annotation> nextAnnotations(Set<? extends Annotation> set) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Types.nextAnnotations(set, Annotation.class);
    }

    public static final /* synthetic */ <T> WildcardType subtypeOf() {
        Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type typeAEQbTJ = yJB.AEQbTJ(null);
        if (typeAEQbTJ instanceof Class) {
            typeAEQbTJ = Util.boxIfPrimitive((Class) typeAEQbTJ);
            Intrinsics.checkNotNullExpressionValue(typeAEQbTJ, "");
        }
        WildcardType wildcardTypeSubtypeOf = Types.subtypeOf(typeAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(wildcardTypeSubtypeOf, "");
        return wildcardTypeSubtypeOf;
    }

    public static final /* synthetic */ <T> WildcardType supertypeOf() {
        Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
        Type typeAEQbTJ = yJB.AEQbTJ(null);
        if (typeAEQbTJ instanceof Class) {
            typeAEQbTJ = Util.boxIfPrimitive((Class) typeAEQbTJ);
            Intrinsics.checkNotNullExpressionValue(typeAEQbTJ, "");
        }
        WildcardType wildcardTypeSupertypeOf = Types.supertypeOf(typeAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(wildcardTypeSupertypeOf, "");
        return wildcardTypeSupertypeOf;
    }

    public static final GenericArrayType asArrayType(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        return asArrayType(yJB.AEQbTJ(interfaceC56559yJw));
    }

    public static final GenericArrayType asArrayType(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return asArrayType(yHE.OLrzqt(interfaceC56551yJo));
    }

    public static final GenericArrayType asArrayType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        GenericArrayType genericArrayTypeArrayOf = Types.arrayOf(type);
        Intrinsics.checkNotNullExpressionValue(genericArrayTypeArrayOf, "");
        return genericArrayTypeArrayOf;
    }
}
