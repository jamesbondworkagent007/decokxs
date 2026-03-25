package o;

import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.domain.VibesTopKolType;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kAP {
    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull VibesSortType vibesSortType, @NotNull VibesTopKolType vibesTopKolType, @NotNull VibesTimeRange vibesTimeRange, @NotNull Continuation<? super Result<? extends java.util.List<VibesKolData>>> continuation);
}
