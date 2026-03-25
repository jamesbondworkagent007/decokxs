package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56511yIb {
    public static final java.lang.Object[] KWHzl = new java.lang.Object[0];

    public static final java.lang.Object[] EZpvd(@NotNull java.util.Collection<?> collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.copydefault(objNewInstance, "");
            objArrCopyOf = (java.lang.Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    public static final java.lang.Object[] AEQbTJ(@NotNull java.util.Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        int size = collection.size();
        if (size != 0) {
            java.util.Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i2);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return KWHzl;
    }
}
