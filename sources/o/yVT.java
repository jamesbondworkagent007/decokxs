package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVT implements InterfaceC59091zaW {
    public static final yVT OLrzqt = new yVT();

    private yVT() {
    }

    @Override // o.InterfaceC59091zaW
    public AbstractC59233zdF OLrzqt(@NotNull ProtoBuf.Type type, @NotNull java.lang.String str, @NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "kotlin.jvm.PlatformType")) {
            return C59370zfk.EZpvd(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, abstractC59242zdO.toString(), abstractC59242zdO2.toString());
        }
        if (type.hasExtension(JvmProtoBuf.AhwBna)) {
            return new yTI(abstractC59242zdO, abstractC59242zdO2);
        }
        return C59231zdD.copydefault(abstractC59242zdO, abstractC59242zdO2);
    }
}
