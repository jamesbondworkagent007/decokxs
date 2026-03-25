package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWU {
    public static final java.util.List<ProtoBuf.Type> copydefault(@NotNull ProtoBuf.Class r3, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(r3, "");
        Intrinsics.checkNotNullParameter(yww, "");
        java.util.List<ProtoBuf.Type> supertypeList = r3.getSupertypeList();
        if (!(!supertypeList.isEmpty())) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            java.util.List<java.lang.Integer> supertypeIdList = r3.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(supertypeIdList, "");
            supertypeList = new java.util.ArrayList<>(C56403yEb.AYXKKw(supertypeIdList, 10));
            for (java.lang.Integer num : supertypeIdList) {
                Intrinsics.copydefault(num);
                supertypeList.add(yww.KWHzl(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ProtoBuf.Type AEQbTJ(@NotNull ProtoBuf.Class r1, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(r1, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return yww.KWHzl(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type EZpvd(@NotNull ProtoBuf.Type.Argument argument, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(argument, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return yww.KWHzl(argument.getTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type copydefault(@NotNull ProtoBuf.Type type, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return yww.KWHzl(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final java.util.List<ProtoBuf.Type> EZpvd(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(typeParameter, "");
        Intrinsics.checkNotNullParameter(yww, "");
        java.util.List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (!(!upperBoundList.isEmpty())) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            java.util.List<java.lang.Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "");
            upperBoundList = new java.util.ArrayList<>(C56403yEb.AYXKKw(upperBoundIdList, 10));
            for (java.lang.Integer num : upperBoundIdList) {
                Intrinsics.copydefault(num);
                upperBoundList.add(yww.KWHzl(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ProtoBuf.Type KWHzl(@NotNull ProtoBuf.Function function, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(function, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return yww.KWHzl(function.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final boolean AEQbTJ(@NotNull ProtoBuf.Function function) {
        Intrinsics.checkNotNullParameter(function, "");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type OLrzqt(@NotNull ProtoBuf.Function function, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(function, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return yww.KWHzl(function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type copydefault(@NotNull ProtoBuf.Property property, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return yww.KWHzl(property.getReturnTypeId());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final boolean OLrzqt(@NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type KWHzl(@NotNull ProtoBuf.Property property, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return yww.KWHzl(property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type copydefault(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(valueParameter, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return yww.KWHzl(valueParameter.getTypeId());
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final ProtoBuf.Type KWHzl(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(valueParameter, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return yww.KWHzl(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type EZpvd(@NotNull ProtoBuf.Type type, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return yww.KWHzl(type.getOuterTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type AEQbTJ(@NotNull ProtoBuf.Type type, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return yww.KWHzl(type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type OLrzqt(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(typeAlias, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(underlyingType, "");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return yww.KWHzl(typeAlias.getUnderlyingTypeId());
        }
        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final ProtoBuf.Type EZpvd(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(typeAlias, "");
        Intrinsics.checkNotNullParameter(yww, "");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(expandedType, "");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return yww.KWHzl(typeAlias.getExpandedTypeId());
        }
        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final java.util.List<ProtoBuf.Type> KWHzl(@NotNull ProtoBuf.Class r3, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(r3, "");
        Intrinsics.checkNotNullParameter(yww, "");
        java.util.List<ProtoBuf.Type> contextReceiverTypeList = r3.getContextReceiverTypeList();
        if (!(!contextReceiverTypeList.isEmpty())) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            java.util.List<java.lang.Integer> contextReceiverTypeIdList = r3.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
            contextReceiverTypeList = new java.util.ArrayList<>(C56403yEb.AYXKKw(contextReceiverTypeIdList, 10));
            for (java.lang.Integer num : contextReceiverTypeIdList) {
                Intrinsics.copydefault(num);
                contextReceiverTypeList.add(yww.KWHzl(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final java.util.List<ProtoBuf.Type> EZpvd(@NotNull ProtoBuf.Function function, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(function, "");
        Intrinsics.checkNotNullParameter(yww, "");
        java.util.List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (!(!contextReceiverTypeList.isEmpty())) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            java.util.List<java.lang.Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
            contextReceiverTypeList = new java.util.ArrayList<>(C56403yEb.AYXKKw(contextReceiverTypeIdList, 10));
            for (java.lang.Integer num : contextReceiverTypeIdList) {
                Intrinsics.copydefault(num);
                contextReceiverTypeList.add(yww.KWHzl(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final java.util.List<ProtoBuf.Type> OLrzqt(@NotNull ProtoBuf.Property property, @NotNull yWW yww) {
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yww, "");
        java.util.List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (!(!contextReceiverTypeList.isEmpty())) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            java.util.List<java.lang.Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "");
            contextReceiverTypeList = new java.util.ArrayList<>(C56403yEb.AYXKKw(contextReceiverTypeIdList, 10));
            for (java.lang.Integer num : contextReceiverTypeIdList) {
                Intrinsics.copydefault(num);
                contextReceiverTypeList.add(yww.KWHzl(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
