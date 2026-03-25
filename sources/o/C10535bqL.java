package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10535bqL implements java.util.Comparator<C10525bqB> {
    public static final C10535bqL AEQbTJ = new C10535bqL();

    private C10535bqL() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compare(@NotNull C10525bqB c10525bqB, @NotNull C10525bqB c10525bqB2) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        Intrinsics.checkNotNullParameter(c10525bqB2, "");
        if (C33129mqd.OLrzqt(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
            if (C33129mqd.OLrzqt(c10525bqB.ejfBZ(), c10525bqB2.ejfBZ())) {
                return c10525bqB.KWHzl().QfsBiF() - c10525bqB2.KWHzl().QfsBiF();
            }
            return C33129mqd.AEQbTJ(c10525bqB.ejfBZ(), c10525bqB2.ejfBZ()) ? -1 : 1;
        }
        if (C33129mqd.AEQbTJ(c10525bqB.AhwBna(), c10525bqB2.AhwBna())) {
        }
    }
}
