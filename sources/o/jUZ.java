package o;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface jUZ {

    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void AEQbTJ(@NotNull jUZ juz, @NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
            Intrinsics.checkNotNullParameter(filterAction, "");
            Intrinsics.checkNotNullParameter(tokenFilter, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void KWHzl(@NotNull jUZ juz, @NotNull TokenFilter tokenFilter) {
            Intrinsics.checkNotNullParameter(tokenFilter, "");
        }
    }

    void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter);

    void KWHzl(@NotNull TokenFilter tokenFilter);
}
