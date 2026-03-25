package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34779nir {
    public static final C34779nir AEQbTJ = new C34779nir();

    private C34779nir() {
    }

    public static /* synthetic */ void startShakeIntro$default(android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "okx_range_shake";
        }
        AEQbTJ(context, str);
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            pUU.KWHzl("FeedbackFlowLauncher", "Starting shake feedback intro for feature: " + str);
            ActivityC34774nim.Companion.KWHzl(context, str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FeedbackFlowLauncher", "Failed to start shake feedback intro", e);
        }
    }
}
