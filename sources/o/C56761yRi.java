package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56761yRi {
    public static final C56761yRi copydefault = new C56761yRi();

    private C56761yRi() {
    }

    public final java.lang.String EZpvd(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C56935yXu c56935yXu;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        AbstractC56640yMw.copydefault(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default = yZE.firstOverridden$default(yZE.AEQbTJ(callableMemberDescriptor), false, C56759yRg.copydefault, 1, null);
        if (callableMemberDescriptorFirstOverridden$default == null || (c56935yXu = C56756yRd.EZpvd.EZpvd().get(yZE.EZpvd(callableMemberDescriptorFirstOverridden$default))) == null) {
            return null;
        }
        return c56935yXu.AEQbTJ();
    }

    public static final boolean copydefault(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return copydefault.KWHzl(callableMemberDescriptor);
    }

    public final boolean KWHzl(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (C56756yRd.EZpvd.copydefault().contains(callableMemberDescriptor.bR_())) {
            return AEQbTJ(callableMemberDescriptor);
        }
        return false;
    }

    public final boolean AEQbTJ(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56933yXs>) ((java.lang.Iterable<? extends java.lang.Object>) C56756yRd.EZpvd.KWHzl()), yZE.KWHzl(callableMemberDescriptor)) && callableMemberDescriptor.fetchVPNInfo().isEmpty()) {
            return true;
        }
        if (!AbstractC56640yMw.copydefault(callableMemberDescriptor)) {
            return false;
        }
        java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf = callableMemberDescriptor.valueOf();
        Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
        java.util.Collection<? extends CallableMemberDescriptor> collection = collectionValueOf;
        if (!collection.isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                C56761yRi c56761yRi = copydefault;
                Intrinsics.copydefault(callableMemberDescriptor2);
                if (c56761yRi.KWHzl(callableMemberDescriptor2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
