package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56891yWd implements InterfaceC59145zbX {
    public final DeserializedContainerAbiStability AEQbTJ;
    public final C59153zbf<C56921yXg> EZpvd;
    public final InterfaceC56893yWf KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56893yWf EZpvd() {
        return this.KWHzl;
    }

    public C56891yWd(@NotNull InterfaceC56893yWf interfaceC56893yWf, C59153zbf<C56921yXg> c59153zbf, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability, "");
        this.KWHzl = interfaceC56893yWf;
        this.EZpvd = c59153zbf;
        this.OLrzqt = z;
        this.AEQbTJ = deserializedContainerAbiStability;
    }

    @Override // o.InterfaceC59145zbX
    public java.lang.String gEmmrt() {
        return "Class '" + this.KWHzl.KWHzl().AEQbTJ().KWHzl() + '\'';
    }

    @Override // o.InterfaceC56686yOo
    public InterfaceC56684yOm copydefault() {
        InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(interfaceC56684yOm, "");
        return interfaceC56684yOm;
    }

    public java.lang.String toString() {
        return C56891yWd.class.getSimpleName() + ": " + this.KWHzl;
    }
}
