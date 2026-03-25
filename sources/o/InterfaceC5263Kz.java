package o;

import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5263Kz {
    public static final Activity Companion = Activity.AEQbTJ;

    java.lang.Object KWHzl(@NotNull Continuation<? super C5242Ke> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.Kz$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();

        private Activity() {
        }

        public final InterfaceC5263Kz AEQbTJ(@NotNull Storage storage, @NotNull Logger logger, @NotNull JZ jz) {
            Intrinsics.checkNotNullParameter(storage, "");
            Intrinsics.checkNotNullParameter(logger, "");
            Intrinsics.checkNotNullParameter(jz, "");
            if (storage instanceof KO) {
                return new C5262Ky((KO) storage, logger, jz);
            }
            if (storage instanceof KR) {
                return new KA((KR) storage);
            }
            logger.KWHzl("Custom storage, identify intercept not started");
            return null;
        }
    }
}
