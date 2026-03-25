package o;

import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes7.dex */
public interface kVC {
    PresetUserConfigBean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.Object EZpvd(@NotNull DexPresetResultVO dexPresetResultVO, @Body @NotNull PresetUserParams presetUserParams, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>> continuation);

    DexPresetResultVO OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    BuySellPreset copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3);

    void copydefault();
}
