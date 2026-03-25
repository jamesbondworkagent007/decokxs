package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yYO {
    public abstract void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void KWHzl(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    public abstract void copydefault(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    public void AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        Intrinsics.checkNotNullParameter(collection, "");
        callableMemberDescriptor.copydefault(collection);
    }
}
