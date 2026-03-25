package o;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJF implements ParameterizedType, yJC {
    public final java.lang.Class<?> AEQbTJ;
    public final java.lang.reflect.Type EZpvd;
    public final java.lang.reflect.Type[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.AEQbTJ;
    }

    public yJF(@NotNull java.lang.Class<?> cls, java.lang.reflect.Type type, @NotNull java.util.List<? extends java.lang.reflect.Type> list) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = cls;
        this.EZpvd = type;
        this.copydefault = (java.lang.reflect.Type[]) list.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.reflect.Type type = this.EZpvd;
        if (type != null) {
            sb.append(yJB.EZpvd(type));
            sb.append("$");
            sb.append(this.AEQbTJ.getSimpleName());
        } else {
            sb.append(yJB.EZpvd(this.AEQbTJ));
        }
        java.lang.reflect.Type[] typeArr = this.copydefault;
        if (!(typeArr.length == 0)) {
            yDV.KWHzl(typeArr, sb, (null & 2) != 0 ? ", " : null, (null & 4) != 0 ? "" : "<", (null & 8) == 0 ? ">" : "", (null & 16) != 0 ? -1 : 0, (null & 32) != 0 ? "..." : null, (null & 64) != 0 ? null : ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.EZpvd(this.AEQbTJ, parameterizedType.getRawType()) && Intrinsics.EZpvd(this.EZpvd, parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.reflect.Type type = this.EZpvd;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(getActualTypeArguments());
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
