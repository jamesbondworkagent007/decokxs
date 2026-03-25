package o;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56760yRh {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void copydefault(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean KWHzl(@NotNull InterfaceC56676yOe interfaceC56676yOe) {
        if (interfaceC56676yOe == null) {
            copydefault(0);
        }
        if (interfaceC56676yOe.bW_() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (EZpvd(interfaceC56676yOe.AuCTel())) {
            return true;
        }
        return yYH.isConnected(interfaceC56676yOe.AuCTel()) && copydefault(interfaceC56676yOe);
    }

    public static boolean EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(1);
        }
        return yYH.isConnected(interfaceC56665yNu) && yYH.AkhnZx(interfaceC56665yNu.AuCTel()) && !KWHzl((InterfaceC56658yNn) interfaceC56665yNu);
    }

    public static boolean KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (interfaceC56658yNn == null) {
            copydefault(2);
        }
        return C56635yMr.KWHzl(C56637yMt.EZpvd, interfaceC56658yNn);
    }

    public static boolean copydefault(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        yND yndEZpvd;
        if (callableMemberDescriptor == null) {
            copydefault(3);
        }
        if ((callableMemberDescriptor instanceof InterfaceC56676yOe) && (yndEZpvd = ((InterfaceC56676yOe) callableMemberDescriptor).EZpvd()) != null && yndEZpvd.copydefault().copydefault(C56777yRy.AEQbTJ)) {
            return true;
        }
        return callableMemberDescriptor.copydefault().copydefault(C56777yRy.AEQbTJ);
    }
}
