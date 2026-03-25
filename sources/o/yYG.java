package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yYG extends yYO {
    public abstract void OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    @Override // o.yYO
    public void copydefault(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
        OLrzqt(callableMemberDescriptor, callableMemberDescriptor2);
    }

    @Override // o.yYO
    public void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
        OLrzqt(callableMemberDescriptor, callableMemberDescriptor2);
    }
}
