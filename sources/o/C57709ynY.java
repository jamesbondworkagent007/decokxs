package o;

import com.onesignal.OSUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57709ynY {
    public final void AEQbTJ(@NotNull java.lang.Runnable runnable, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OSUtils.fIwbmz()) {
            new java.lang.Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
