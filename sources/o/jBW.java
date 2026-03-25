package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jBW {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super LeaderBoardFilterModel> continuation);

    java.lang.Object copydefault(@NotNull LeaderBoardFilterModel leaderBoardFilterModel, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<LeaderBoardFilterModel>> continuation);
}
