package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58091yuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58136yvb implements InterfaceC58091yuj.TaskDescription {
    @Override // o.InterfaceC58091yuj.TaskDescription
    public InterfaceC58091yuj<java.lang.Object, java.lang.Object> create(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        if (Intrinsics.EZpvd(C58137yvc.copydefault(type), InterfaceC58090yui.class)) {
            return new C58139yve();
        }
        throw new java.lang.IllegalArgumentException(type + " is not supported.");
    }
}
