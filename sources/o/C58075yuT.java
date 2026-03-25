package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58026ytX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58075yuT implements InterfaceC58026ytX.TaskDescription {
    @Override // o.InterfaceC58026ytX.TaskDescription
    public InterfaceC58026ytX<?> EZpvd(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        java.lang.Class<?> clsCopydefault = C58137yvc.copydefault(type);
        if (Intrinsics.EZpvd(clsCopydefault, java.lang.String.class)) {
            return new C58077yuV();
        }
        if (Intrinsics.EZpvd(clsCopydefault, byte[].class)) {
            return new C58076yuU();
        }
        throw new java.lang.IllegalArgumentException("Type is not supported by this MessageAdapterFactory: " + type);
    }
}
