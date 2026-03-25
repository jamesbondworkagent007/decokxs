package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yZI implements java.lang.Comparable<yZI> {
    public abstract boolean KWHzl();

    public abstract DeprecationLevelValue copydefault();

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull yZI yzi) {
        Intrinsics.checkNotNullParameter(yzi, "");
        int iCompareTo = copydefault().compareTo(yzi.copydefault());
        if (iCompareTo == 0 && !KWHzl() && yzi.KWHzl()) {
            return 1;
        }
        return iCompareTo;
    }
}
