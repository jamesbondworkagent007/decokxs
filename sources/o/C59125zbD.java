package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59125zbD extends C59072zaD {
    public static final C59125zbD fARcdN = new C59125zbD();

    /* JADX WARN: Illegal instructions before constructor call */
    private C59125zbD() {
        yXE yxeOLrzqt = yXE.OLrzqt();
        yWL.OLrzqt(yxeOLrzqt);
        Intrinsics.checkNotNullExpressionValue(yxeOLrzqt, "");
        GeneratedMessageLite.Activity<ProtoBuf.Package, java.lang.Integer> activity = yWL.AhwBna;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        GeneratedMessageLite.Activity<ProtoBuf.Constructor, java.util.List<ProtoBuf.Annotation>> activity2 = yWL.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(activity2, "");
        GeneratedMessageLite.Activity<ProtoBuf.Class, java.util.List<ProtoBuf.Annotation>> activity3 = yWL.copydefault;
        Intrinsics.checkNotNullExpressionValue(activity3, "");
        GeneratedMessageLite.Activity<ProtoBuf.Function, java.util.List<ProtoBuf.Annotation>> activity4 = yWL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(activity4, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activity5 = yWL.valueOf;
        Intrinsics.checkNotNullExpressionValue(activity5, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activity6 = yWL.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(activity6, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activity7 = yWL.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(activity7, "");
        GeneratedMessageLite.Activity<ProtoBuf.EnumEntry, java.util.List<ProtoBuf.Annotation>> activity8 = yWL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(activity8, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> activity9 = yWL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(activity9, "");
        GeneratedMessageLite.Activity<ProtoBuf.ValueParameter, java.util.List<ProtoBuf.Annotation>> activity10 = yWL.djBIcL;
        Intrinsics.checkNotNullExpressionValue(activity10, "");
        GeneratedMessageLite.Activity<ProtoBuf.Type, java.util.List<ProtoBuf.Annotation>> activity11 = yWL.values;
        Intrinsics.checkNotNullExpressionValue(activity11, "");
        GeneratedMessageLite.Activity<ProtoBuf.TypeParameter, java.util.List<ProtoBuf.Annotation>> activity12 = yWL.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(activity12, "");
        super(yxeOLrzqt, activity, activity2, activity3, activity4, null, activity5, activity6, activity7, null, null, null, activity8, activity9, activity10, activity11, activity12);
    }

    public final java.lang.String AEQbTJ(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return C59449zhJ.replace$default(c56933yXs.KWHzl(), '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null) + JsonPointer.SEPARATOR + copydefault(c56933yXs);
    }

    public final java.lang.String copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return KWHzl(c56933yXs) + ".kotlin_builtins";
    }

    public final java.lang.String KWHzl(C56933yXs c56933yXs) {
        if (c56933yXs.AEQbTJ()) {
            return "default-package";
        }
        java.lang.String strAEQbTJ = c56933yXs.OLrzqt().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }
}
