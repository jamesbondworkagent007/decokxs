package o;

import com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28744kgZ {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super AbstractC43419rot<TwitterTranslateResponse, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TwitterV2Response, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TwitterPreviewData, OKServerException>> continuation);
}
