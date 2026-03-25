package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10529bqF implements java.util.Comparator<C10525bqB> {
    public static final C10529bqF AEQbTJ = new C10529bqF();

    private C10529bqF() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        Intrinsics.checkNotNullParameter(c10525bqB2, "");
        return (!C33129mqd.OLrzqt(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz()) ? C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), c10525bqB2.fIwbmz()) : !C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c10525bqB.KWHzl().UeEOUB()), java.lang.Integer.valueOf(c10525bqB2.KWHzl().UeEOUB()))) ? 1 : -1;
    }
}
