package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59123zbB {
    /* JADX DEBUG: Multi-variable search result rejected for r8v14, resolved type: ? super kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC59381zfv> yOA<T> EZpvd(@NotNull ProtoBuf.Class r6, @NotNull yWS yws, @NotNull yWW yww, @NotNull Function1<? super ProtoBuf.Type, ? extends T> function1, @NotNull Function1<? super C56935yXu, ? extends T> function12) {
        T tInvoke;
        java.util.List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        Intrinsics.checkNotNullParameter(r6, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (r6.getMultiFieldValueClassUnderlyingNameCount() > 0) {
            java.util.List<java.lang.Integer> multiFieldValueClassUnderlyingNameList = r6.getMultiFieldValueClassUnderlyingNameList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(multiFieldValueClassUnderlyingNameList, 10));
            for (java.lang.Integer num : multiFieldValueClassUnderlyingNameList) {
                Intrinsics.copydefault(num);
                arrayList.add(C59160zbm.OLrzqt(yws, num.intValue()));
            }
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(r6.getMultiFieldValueClassUnderlyingTypeIdCount()), java.lang.Integer.valueOf(r6.getMultiFieldValueClassUnderlyingTypeCount()));
            if (!Intrinsics.EZpvd(pairOLrzqt, C56390yDp.OLrzqt(java.lang.Integer.valueOf(arrayList.size()), 0))) {
                if (!Intrinsics.EZpvd(pairOLrzqt, C56390yDp.OLrzqt(0, java.lang.Integer.valueOf(arrayList.size())))) {
                    throw new java.lang.IllegalStateException(("class " + C59160zbm.OLrzqt(yws, r6.getFqName()) + " has illegal multi-field value class representation").toString());
                }
                multiFieldValueClassUnderlyingTypeList = r6.getMultiFieldValueClassUnderlyingTypeList();
            } else {
                java.util.List<java.lang.Integer> multiFieldValueClassUnderlyingTypeIdList = r6.getMultiFieldValueClassUnderlyingTypeIdList();
                Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "");
                multiFieldValueClassUnderlyingTypeList = new java.util.ArrayList<>(C56403yEb.AYXKKw(multiFieldValueClassUnderlyingTypeIdList, 10));
                for (java.lang.Integer num2 : multiFieldValueClassUnderlyingTypeIdList) {
                    Intrinsics.copydefault(num2);
                    multiFieldValueClassUnderlyingTypeList.add(yww.KWHzl(num2.intValue()));
                }
            }
            Intrinsics.copydefault(multiFieldValueClassUnderlyingTypeList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(multiFieldValueClassUnderlyingTypeList, 10));
            java.util.Iterator<T> it = multiFieldValueClassUnderlyingTypeList.iterator();
            while (it.hasNext()) {
                arrayList2.add(function1.invoke(it.next()));
            }
            return new yNR(CollectionsKt___CollectionsKt.values(arrayList, arrayList2));
        }
        if (!r6.hasInlineClassUnderlyingPropertyName()) {
            return null;
        }
        C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(yws, r6.getInlineClassUnderlyingPropertyName());
        ProtoBuf.Type typeAEQbTJ = yWU.AEQbTJ(r6, yww);
        if ((typeAEQbTJ == null || (tInvoke = function1.invoke(typeAEQbTJ)) == null) && (tInvoke = function12.invoke(c56935yXuOLrzqt)) == null) {
            throw new java.lang.IllegalStateException(("cannot determine underlying type for value class " + C59160zbm.OLrzqt(yws, r6.getFqName()) + " with property " + c56935yXuOLrzqt).toString());
        }
        return new yNL(c56935yXuOLrzqt, tInvoke);
    }
}
