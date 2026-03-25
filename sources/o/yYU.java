package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYU {
    public static final CallableMemberDescriptor KWHzl(@NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        java.lang.Integer numAEQbTJ;
        Intrinsics.checkNotNullParameter(collection, "");
        collection.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor == null || ((numAEQbTJ = C56669yNy.AEQbTJ(callableMemberDescriptor.getNewProxyInstance(), callableMemberDescriptor2.getNewProxyInstance())) != null && numAEQbTJ.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        Intrinsics.copydefault(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
