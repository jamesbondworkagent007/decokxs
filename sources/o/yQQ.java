package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQQ extends yQH implements InterfaceC56841yUh {
    public final java.lang.Object KWHzl;

    @Override // o.InterfaceC56841yUh
    public boolean djBIcL() {
        return false;
    }

    public yQQ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.KWHzl = obj;
    }

    @Override // o.InterfaceC56841yUh
    public InterfaceC56839yUf OLrzqt() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.Class<?> clsAEQbTJ = C56734yQi.KWHzl.AEQbTJ(this.KWHzl);
        if (clsAEQbTJ != null) {
            return new yQC(clsAEQbTJ);
        }
        throw new java.lang.NoSuchMethodError("Can't find `getType` method");
    }

    @Override // o.yQH
    public java.lang.reflect.Member copydefault() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.reflect.Method methodOLrzqt = C56734yQi.KWHzl.OLrzqt(this.KWHzl);
        if (methodOLrzqt != null) {
            return methodOLrzqt;
        }
        throw new java.lang.NoSuchMethodError("Can't find `getAccessor` method");
    }
}
