package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNM {
    public static final boolean EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        return interfaceC56658yNn.isConnected() == Modality.FINAL && interfaceC56658yNn.DbNXlk() != ClassKind.ENUM_CLASS;
    }
}
