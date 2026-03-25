package o;

import com.okinc.business.market.features.meme.data.model.MemeFilterParam;
import com.okinc.business.market.features.meme.data.model.MemeTokenV2Data;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28693kfb {
    java.lang.Object EZpvd(@NotNull MemeFilterParam memeFilterParam, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MemeTokenV2Data>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull MemeBlacklist memeBlacklist, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<MemeBlacklist>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<ConfigInfoData, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull MemeBlacklist memeBlacklist, @NotNull Continuation<? super Unit> continuation);
}
