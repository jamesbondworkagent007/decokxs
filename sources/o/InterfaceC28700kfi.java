package o;

import com.okinc.business.market.features.meme.data.model.NewLogoWsData;
import com.okinc.business.market.features.meme.data.model.NewTokenWsData;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28700kfi {
    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<NewTokenWsData>>> continuation);

    void EZpvd();

    java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<NewLogoWsData>>> continuation);

    void copydefault();
}
