package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import o.AbstractC56919yXe;
import o.C56890yWc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVH {
    public static /* synthetic */ C56890yWc getPropertySignature$default(ProtoBuf.Property property, yWS yws, yWW yww, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            z3 = true;
        }
        return copydefault(property, yws, yww, z4, z5, z3);
    }

    public static final C56890yWc copydefault(@NotNull ProtoBuf.Property property, @NotNull yWS yws, @NotNull yWW yww, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> activity = JvmProtoBuf.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) yWY.KWHzl(property, activity);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            AbstractC56919yXe.Activity activityOLrzqt = C56928yXn.AEQbTJ.OLrzqt(property, yws, yww, z3);
            if (activityOLrzqt == null) {
                return null;
            }
            return C56890yWc.KWHzl.AEQbTJ(activityOLrzqt);
        }
        if (!z2 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        C56890yWc.ActionBar actionBar = C56890yWc.KWHzl;
        JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        Intrinsics.checkNotNullExpressionValue(syntheticMethod, "");
        return actionBar.KWHzl(yws, syntheticMethod);
    }
}
