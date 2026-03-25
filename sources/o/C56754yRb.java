package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56754yRb extends SpecialGenericSignatures {
    public static final C56754yRb KWHzl = new C56754yRb();

    private C56754yRb() {
    }

    public final boolean AYXKKw(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) SpecialGenericSignatures.OLrzqt.AEQbTJ()), C56896yWi.copydefault(callableMemberDescriptor));
    }

    public static final yNG KWHzl(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        C56754yRb c56754yRb = KWHzl;
        C56935yXu c56935yXuBR_ = yng.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        if (c56754yRb.KWHzl(c56935yXuBR_)) {
            return (yNG) yZE.firstOverridden$default(yng, false, C56757yRe.copydefault, 1, null);
        }
        return null;
    }

    public static final boolean AEQbTJ(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return KWHzl.AYXKKw(callableMemberDescriptor);
    }

    public final boolean KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return SpecialGenericSignatures.OLrzqt.copydefault().contains(c56935yXu);
    }

    public static final SpecialGenericSignatures.SpecialSignatureInfo EZpvd(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        SpecialGenericSignatures.Activity activity = SpecialGenericSignatures.OLrzqt;
        if (!activity.copydefault().contains(callableMemberDescriptor.bR_()) || (callableMemberDescriptorFirstOverridden$default = yZE.firstOverridden$default(callableMemberDescriptor, false, C56755yRc.KWHzl, 1, null)) == null || (strCopydefault = C56896yWi.copydefault(callableMemberDescriptorFirstOverridden$default)) == null) {
            return null;
        }
        return activity.AEQbTJ(strCopydefault);
    }

    public static final boolean KWHzl(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (callableMemberDescriptor instanceof yNG) && KWHzl.AYXKKw(callableMemberDescriptor);
    }
}
