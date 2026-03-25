package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDO {
    public static final <T> T[] AEQbTJ(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i);
        Intrinsics.copydefault(objNewInstance, "");
        return (T[]) ((java.lang.Object[]) objNewInstance);
    }

    public static final void AEQbTJ(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
