package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRN {
    public static final yNC OLrzqt(@NotNull yOD yod) {
        Intrinsics.checkNotNullParameter(yod, "");
        yNC yncCopydefault = C56771yRs.copydefault(yod);
        Intrinsics.checkNotNullExpressionValue(yncCopydefault, "");
        return yncCopydefault;
    }

    public static final boolean copydefault(@NotNull C56778yRz c56778yRz) {
        Intrinsics.checkNotNullParameter(c56778yRz, "");
        return c56778yRz.AEQbTJ().invoke(C56769yRq.AEQbTJ()) == ReportLevel.STRICT;
    }

    public static final boolean copydefault(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (callableMemberDescriptor instanceof yNG) && Intrinsics.EZpvd(callableMemberDescriptor.AEQbTJ(JavaMethodDescriptor.EZpvd), java.lang.Boolean.TRUE);
    }

    public static final yOJ EZpvd(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56845yUl interfaceC56845yUl) {
        yOJ next;
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56845yUl, "");
        if (interfaceC56845yUl.copydefault() == null) {
            throw new java.lang.IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
        }
        java.util.Iterator<yOJ> it = new C56792ySm(c56794ySo, interfaceC56845yUl, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yOJ yoj = next;
            for (C56933yXs c56933yXs : C56769yRq.EZpvd()) {
                if (Intrinsics.EZpvd(yoj.KWHzl(), c56933yXs)) {
                    break loop0;
                }
            }
        }
        return next;
    }
}
