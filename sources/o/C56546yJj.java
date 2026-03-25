package o;

import java.lang.reflect.GenericArrayType;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56546yJj implements GenericArrayType, yJC {
    public final java.lang.reflect.Type KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.KWHzl;
    }

    public C56546yJj(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        this.KWHzl = type;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return yJB.EZpvd(this.KWHzl) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.EZpvd(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
