package o;

import android.os.MessageQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38348pVl implements MessageQueue.IdleHandler {
    public final java.lang.String copydefault;

    public C38348pVl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        pUU.copydefault();
        pUU.copydefault("LogIdleHandler", "appenderFlush activityName:" + this.copydefault + " costTime:" + (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime) + " ");
        return false;
    }
}
