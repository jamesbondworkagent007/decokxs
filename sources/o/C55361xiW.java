package o;

import com.airbnb.lottie.network.LottieFetchResult;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55361xiW implements LottieNetworkFetcher {
    public final OkHttpClient EZpvd;

    public C55361xiW(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.EZpvd = okHttpClient;
    }

    @Override // com.airbnb.lottie.network.LottieNetworkFetcher
    public LottieFetchResult fetchSync(@NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        return new C55362xiX(this.EZpvd.newCall(new Request.Builder().url(str).get().build()).execute());
    }
}
