package o;

import java.lang.Enum;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SharedElementCallback<T extends java.lang.Enum<T>> implements LoaderManager<T, java.lang.String> {
    public final T[] copydefault;

    public SharedElementCallback(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.copydefault = tArr;
    }

    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.LoaderManager
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String encode(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return t.name();
    }

    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.LoaderManager
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T decode(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (T t : this.copydefault) {
            if (Intrinsics.EZpvd((java.lang.Object) t.name(), (java.lang.Object) str)) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
