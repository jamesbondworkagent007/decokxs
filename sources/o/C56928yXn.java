package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import o.AbstractC56919yXe;
import o.yWP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56928yXn {
    public static final C56928yXn AEQbTJ = new C56928yXn();
    public static final yXE KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yXE OLrzqt() {
        return KWHzl;
    }

    private C56928yXn() {
    }

    static {
        yXE yxeOLrzqt = yXE.OLrzqt();
        JvmProtoBuf.copydefault(yxeOLrzqt);
        Intrinsics.checkNotNullExpressionValue(yxeOLrzqt, "");
        KWHzl = yxeOLrzqt;
    }

    public static final kotlin.Pair<C56926yXl, ProtoBuf.Class> EZpvd(@NotNull java.lang.String[] strArr, @NotNull java.lang.String[] strArr2) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        byte[] bArrEZpvd = C56922yXh.EZpvd(strArr);
        Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
        return EZpvd(bArrEZpvd, strArr2);
    }

    public static final kotlin.Pair<C56926yXl, ProtoBuf.Class> EZpvd(@NotNull byte[] bArr, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        return new kotlin.Pair<>(AEQbTJ.KWHzl(byteArrayInputStream, strArr), ProtoBuf.Class.parseFrom(byteArrayInputStream, KWHzl));
    }

    public static final kotlin.Pair<C56926yXl, ProtoBuf.Package> copydefault(@NotNull java.lang.String[] strArr, @NotNull java.lang.String[] strArr2) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        byte[] bArrEZpvd = C56922yXh.EZpvd(strArr);
        Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
        return AEQbTJ(bArrEZpvd, strArr2);
    }

    public static final kotlin.Pair<C56926yXl, ProtoBuf.Package> AEQbTJ(@NotNull byte[] bArr, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        return new kotlin.Pair<>(AEQbTJ.KWHzl(byteArrayInputStream, strArr), ProtoBuf.Package.parseFrom(byteArrayInputStream, KWHzl));
    }

    public static final kotlin.Pair<C56926yXl, ProtoBuf.Function> OLrzqt(@NotNull java.lang.String[] strArr, @NotNull java.lang.String[] strArr2) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(C56922yXh.EZpvd(strArr));
        return new kotlin.Pair<>(AEQbTJ.KWHzl(byteArrayInputStream, strArr2), ProtoBuf.Function.parseFrom(byteArrayInputStream, KWHzl));
    }

    public final C56926yXl KWHzl(java.io.InputStream inputStream, java.lang.String[] strArr) throws java.io.IOException {
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, KWHzl);
        Intrinsics.checkNotNullExpressionValue(delimitedFrom, "");
        return new C56926yXl(delimitedFrom, strArr);
    }

    public final AbstractC56919yXe.TaskDescription OLrzqt(@NotNull ProtoBuf.Function function, @NotNull yWS yws, @NotNull yWW yww) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(function, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        GeneratedMessageLite.Activity<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> activity = JvmProtoBuf.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) yWY.KWHzl(function, activity);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            strKWHzl = yws.KWHzl(jvmMethodSignature.getDesc());
        } else {
            java.util.List listOLrzqt = yDY.OLrzqt(yWU.OLrzqt(function, yww));
            java.util.List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(valueParameterList, 10));
            for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                Intrinsics.copydefault(valueParameter);
                arrayList.add(yWU.copydefault(valueParameter, yww));
            }
            java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listOLrzqt, (java.lang.Iterable) arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            java.util.Iterator it = listDjBIcL.iterator();
            while (it.hasNext()) {
                java.lang.String strKWHzl2 = AEQbTJ.KWHzl((ProtoBuf.Type) it.next(), yws);
                if (strKWHzl2 == null) {
                    return null;
                }
                arrayList2.add(strKWHzl2);
            }
            java.lang.String strKWHzl3 = KWHzl(yWU.KWHzl(function, yww), yws);
            if (strKWHzl3 == null) {
                return null;
            }
            strKWHzl = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "", "(", ")", 0, null, null, 56, null) + strKWHzl3;
        }
        return new AbstractC56919yXe.TaskDescription(yws.KWHzl(name), strKWHzl);
    }

    public final AbstractC56919yXe.TaskDescription copydefault(@NotNull ProtoBuf.Constructor constructor, @NotNull yWS yws, @NotNull yWW yww) {
        java.lang.String strJoinToString$default;
        Intrinsics.checkNotNullParameter(constructor, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        GeneratedMessageLite.Activity<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> activity = JvmProtoBuf.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) yWY.KWHzl(constructor, activity);
        java.lang.String strKWHzl = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : yws.KWHzl(jvmMethodSignature.getName());
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            strJoinToString$default = yws.KWHzl(jvmMethodSignature.getDesc());
        } else {
            java.util.List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(valueParameterList, 10));
            for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                C56928yXn c56928yXn = AEQbTJ;
                Intrinsics.copydefault(valueParameter);
                java.lang.String strKWHzl2 = c56928yXn.KWHzl(yWU.copydefault(valueParameter, yww), yws);
                if (strKWHzl2 == null) {
                    return null;
                }
                arrayList.add(strKWHzl2);
            }
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new AbstractC56919yXe.TaskDescription(strKWHzl, strJoinToString$default);
    }

    public static /* synthetic */ AbstractC56919yXe.Activity getJvmFieldSignature$default(C56928yXn c56928yXn, ProtoBuf.Property property, yWS yws, yWW yww, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c56928yXn.OLrzqt(property, yws, yww, z);
    }

    public final AbstractC56919yXe.Activity OLrzqt(@NotNull ProtoBuf.Property property, @NotNull yWS yws, @NotNull yWW yww, boolean z) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> activity = JvmProtoBuf.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) yWY.KWHzl(property, activity);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? property.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strKWHzl = KWHzl(yWU.copydefault(property, yww), yws);
            if (strKWHzl == null) {
                return null;
            }
        } else {
            strKWHzl = yws.KWHzl(field.getDesc());
        }
        return new AbstractC56919yXe.Activity(yws.KWHzl(name), strKWHzl);
    }

    public final java.lang.String KWHzl(ProtoBuf.Type type, yWS yws) {
        if (type.hasClassName()) {
            return C56923yXi.OLrzqt(yws.OLrzqt(type.getClassName()));
        }
        return null;
    }

    public static final boolean EZpvd(@NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "");
        yWP.TaskDescription taskDescriptionEZpvd = C56920yXf.AEQbTJ.EZpvd();
        java.lang.Object extension = property.getExtension(JvmProtoBuf.EZpvd);
        Intrinsics.checkNotNullExpressionValue(extension, "");
        java.lang.Boolean boolKWHzl = taskDescriptionEZpvd.KWHzl(((java.lang.Number) extension).intValue());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }
}
