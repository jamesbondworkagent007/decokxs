package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10533bqJ implements java.util.Comparator<C10525bqB> {
    public static final C10533bqJ EZpvd = new C10533bqJ();

    private C10533bqJ() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        Intrinsics.checkNotNullParameter(c10525bqB2, "");
        return c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
    }
}
