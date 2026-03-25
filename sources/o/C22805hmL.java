package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22805hmL {
    public C22799hmF AEQbTJ;
    public final java.lang.String KWHzl;
    public C22804hmK copydefault;

    public C22805hmL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public final AbstractC22802hmI EZpvd(@NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        if (abstractC23101hrq.fdOvFl()) {
            C22799hmF c22799hmF = this.AEQbTJ;
            if (c22799hmF == null) {
                return new C22799hmF(abstractC23101hrq);
            }
            Intrinsics.copydefault(c22799hmF);
            return c22799hmF;
        }
        C22804hmK c22804hmK = this.copydefault;
        if (c22804hmK == null) {
            return new C22804hmK(this.KWHzl, abstractC23101hrq);
        }
        Intrinsics.copydefault(c22804hmK);
        return c22804hmK;
    }
}
