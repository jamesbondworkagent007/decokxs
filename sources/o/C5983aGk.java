package o;

import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.mln.PasskeyServiceHelper$checkPasskeyNonSuspend$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5983aGk {
    public static final C5983aGk EZpvd = new C5983aGk();

    /* JADX INFO: renamed from: o.aGk$Activity */
    public interface Activity {
        void KWHzl(@NotNull PasskeyState passkeyState);
    }

    private C5983aGk() {
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new PasskeyServiceHelper$checkPasskeyNonSuspend$1(activity, null), 3, null);
    }
}
