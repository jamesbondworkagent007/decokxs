package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5900aFG {
    public final C6555aRZ AEQbTJ;

    @yCM
    public C5900aFG(@NotNull C6555aRZ c6555aRZ) {
        Intrinsics.checkNotNullParameter(c6555aRZ, "");
        this.AEQbTJ = c6555aRZ;
    }

    public final boolean AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.AEQbTJ.KWHzl()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
