package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42544rWu {
    public static final C42544rWu AEQbTJ = new C42544rWu();

    private C42544rWu() {
    }

    public final void OLrzqt(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.registerActivityLifecycleCallbacks(C42546rWw.KWHzl);
    }
}
