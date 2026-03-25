package o;

import com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsResponse;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28701kfj {
    java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<java.lang.String> list, java.lang.Integer num, MemeFilter memeFilter, @NotNull Continuation<? super Flow<PersonalizedInfoWsResponse>> continuation);

    void copydefault();
}
