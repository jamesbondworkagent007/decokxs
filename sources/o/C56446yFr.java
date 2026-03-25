package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56446yFr {
    public static final java.lang.StackTraceElement OLrzqt(@NotNull BaseContinuationImpl baseContinuationImpl) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        InterfaceC56439yFk interfaceC56439yFkAEQbTJ = AEQbTJ(baseContinuationImpl);
        if (interfaceC56439yFkAEQbTJ == null) {
            return null;
        }
        OLrzqt(1, interfaceC56439yFkAEQbTJ.copydefault());
        int iKWHzl = KWHzl(baseContinuationImpl);
        int i = iKWHzl < 0 ? -1 : interfaceC56439yFkAEQbTJ.EZpvd()[iKWHzl];
        java.lang.String strOLrzqt = C56448yFt.copydefault.OLrzqt(baseContinuationImpl);
        if (strOLrzqt == null) {
            strKWHzl = interfaceC56439yFkAEQbTJ.KWHzl();
        } else {
            strKWHzl = strOLrzqt + JsonPointer.SEPARATOR + interfaceC56439yFkAEQbTJ.KWHzl();
        }
        return new java.lang.StackTraceElement(strKWHzl, interfaceC56439yFkAEQbTJ.OLrzqt(), interfaceC56439yFkAEQbTJ.AEQbTJ(), i);
    }

    public static final InterfaceC56439yFk AEQbTJ(BaseContinuationImpl baseContinuationImpl) {
        return (InterfaceC56439yFk) baseContinuationImpl.getClass().getAnnotation(InterfaceC56439yFk.class);
    }

    public static final int KWHzl(BaseContinuationImpl baseContinuationImpl) {
        try {
            java.lang.reflect.Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(baseContinuationImpl);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            return (-1) + (num != null ? num.intValue() : 0);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static final void OLrzqt(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }
}
