package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56729yQd implements InterfaceC59148zba {
    public static final C56729yQd copydefault = new C56729yQd();

    private C56729yQd() {
    }

    @Override // o.InterfaceC59148zba
    public void KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(list, "");
        throw new java.lang.IllegalStateException("Incomplete hierarchy for class " + interfaceC56658yNn.bR_() + ", unresolved classes " + list);
    }

    @Override // o.InterfaceC59148zba
    public void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        throw new java.lang.IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }
}
