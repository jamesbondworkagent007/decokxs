package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43215rlA implements InterfaceC43217rlC {
    public static final int $stable = 8;
    private boolean initialized;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return this.initialized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC43216rlB
    public final void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (isInitialized()) {
            return;
        }
        this.initialized = true;
        onInit(context);
    }
}
