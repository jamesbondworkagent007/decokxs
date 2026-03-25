package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10534bqK implements java.util.Comparator<C10525bqB> {
    public static final C10534bqK copydefault = new C10534bqK();

    private C10534bqK() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        Intrinsics.checkNotNullParameter(c10525bqB2, "");
        int iCompareTo = c10525bqB.iwGUEr().compareTo(c10525bqB2.iwGUEr());
        if (iCompareTo <= 0) {
            if (iCompareTo >= 0) {
                int iCompareTo2 = c10525bqB.fJNWhG().compareTo(c10525bqB2.fJNWhG());
                if (iCompareTo2 <= 0) {
                    if (iCompareTo2 >= 0) {
                        return c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
