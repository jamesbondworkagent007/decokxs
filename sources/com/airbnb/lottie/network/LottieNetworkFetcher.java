package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface LottieNetworkFetcher {
    LottieFetchResult fetchSync(@NonNull String str) throws IOException;
}
