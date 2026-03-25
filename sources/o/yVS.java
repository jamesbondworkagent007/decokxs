package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVS implements InterfaceC59145zbX {
    public final C59153zbf<C56921yXg> AEQbTJ;
    public final boolean AYXKKw;
    public final yZQ EZpvd;
    public final yZQ KWHzl;
    public final DeserializedContainerAbiStability OLrzqt;
    public final InterfaceC56893yWf gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yZQ AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yZQ KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56893yWf OLrzqt() {
        return this.gEmmrt;
    }

    public yVS(@NotNull yZQ yzq, yZQ yzq2, @NotNull ProtoBuf.Package r4, @NotNull yWS yws, C59153zbf<C56921yXg> c59153zbf, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability, InterfaceC56893yWf interfaceC56893yWf) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(yzq, "");
        Intrinsics.checkNotNullParameter(r4, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        this.EZpvd = yzq;
        this.KWHzl = yzq2;
        this.AEQbTJ = c59153zbf;
        this.AYXKKw = z;
        this.OLrzqt = deserializedContainerAbiStability;
        this.gEmmrt = interfaceC56893yWf;
        GeneratedMessageLite.Activity<ProtoBuf.Package, java.lang.Integer> activity = JvmProtoBuf.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        java.lang.Integer num = (java.lang.Integer) yWY.KWHzl(r4, activity);
        this.valueOf = (num == null || (strKWHzl = yws.KWHzl(num.intValue())) == null) ? "main" : strKWHzl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yVS(@NotNull InterfaceC56893yWf interfaceC56893yWf, @NotNull ProtoBuf.Package r12, @NotNull yWS yws, C59153zbf<C56921yXg> c59153zbf, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        Intrinsics.checkNotNullParameter(r12, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        yZQ yzqCopydefault = yZQ.copydefault(interfaceC56893yWf.KWHzl());
        Intrinsics.checkNotNullExpressionValue(yzqCopydefault, "");
        java.lang.String strAEQbTJ = interfaceC56893yWf.EZpvd().AEQbTJ();
        this(yzqCopydefault, (strAEQbTJ == null || strAEQbTJ.length() <= 0) ? null : yZQ.copydefault(strAEQbTJ), r12, yws, c59153zbf, z, deserializedContainerAbiStability, interfaceC56893yWf);
    }

    @Override // o.InterfaceC59145zbX
    public java.lang.String gEmmrt() {
        return "Class '" + EZpvd().AEQbTJ().KWHzl() + '\'';
    }

    public final C56935yXu djBIcL() {
        java.lang.String strKWHzl = KWHzl().KWHzl();
        Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(StringsKt__StringsKt.substringAfterLast$default(strKWHzl, JsonPointer.SEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null));
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return c56935yXuAEQbTJ;
    }

    public final C56929yXo EZpvd() {
        C56933yXs c56933yXsCopydefault = KWHzl().copydefault();
        Intrinsics.checkNotNullExpressionValue(c56933yXsCopydefault, "");
        return new C56929yXo(c56933yXsCopydefault, djBIcL());
    }

    public java.lang.String toString() {
        return yVS.class.getSimpleName() + ": " + KWHzl();
    }

    @Override // o.InterfaceC56686yOo
    public InterfaceC56684yOm copydefault() {
        InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(interfaceC56684yOm, "");
        return interfaceC56684yOm;
    }
}
