package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQW extends SpecialGenericSignatures {
    public static final yQW EZpvd = new yQW();

    private yQW() {
    }

    public final C56935yXu EZpvd(@NotNull InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        java.util.Map<java.lang.String, C56935yXu> mapGEmmrt = SpecialGenericSignatures.OLrzqt.gEmmrt();
        java.lang.String strCopydefault = C56896yWi.copydefault(interfaceC56687yOp);
        if (strCopydefault == null) {
            return null;
        }
        return mapGEmmrt.get(strCopydefault);
    }

    public final boolean OLrzqt(@NotNull InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        return AbstractC56640yMw.copydefault(interfaceC56687yOp) && yZE.firstOverridden$default(interfaceC56687yOp, false, new yQY(interfaceC56687yOp), 1, null) != null;
    }

    public static final boolean EZpvd(InterfaceC56687yOp interfaceC56687yOp, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return SpecialGenericSignatures.OLrzqt.gEmmrt().containsKey(C56896yWi.copydefault(interfaceC56687yOp));
    }

    public final boolean copydefault(@NotNull InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        return Intrinsics.EZpvd((java.lang.Object) interfaceC56687yOp.bR_().AEQbTJ(), (java.lang.Object) "removeAt") && Intrinsics.EZpvd((java.lang.Object) C56896yWi.copydefault(interfaceC56687yOp), (java.lang.Object) SpecialGenericSignatures.OLrzqt.AhwBna().AEQbTJ());
    }
}
