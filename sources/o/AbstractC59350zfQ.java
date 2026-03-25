package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59350zfQ {
    public abstract java.util.List<C59351zfR> AEQbTJ();

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult AEQbTJ(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        for (C59351zfR c59351zfR : AEQbTJ()) {
            if (c59351zfR.AEQbTJ(yng)) {
                return c59351zfR.KWHzl(yng);
            }
        }
        return CheckResult.TaskDescription.AEQbTJ;
    }
}
