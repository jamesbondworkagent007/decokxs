package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkFetcher {
    private final LottieNetworkFetcher fetcher;
    private final NetworkCache networkCache;

    public NetworkFetcher(@Nullable NetworkCache networkCache, @NonNull LottieNetworkFetcher lottieNetworkFetcher) {
        this.networkCache = networkCache;
        this.fetcher = lottieNetworkFetcher;
    }

    public LottieResult<LottieComposition> fetchSync(Context context, @NonNull String str, @Nullable String str2) {
        LottieComposition lottieCompositionFetchFromCache = fetchFromCache(context, str, str2);
        if (lottieCompositionFetchFromCache != null) {
            return new LottieResult<>(lottieCompositionFetchFromCache);
        }
        Logger.debug("Animation for " + str + " not found in cache. Fetching from network.");
        return fetchFromNetwork(context, str, str2);
    }

    private LottieComposition fetchFromCache(Context context, @NonNull String str, @Nullable String str2) {
        NetworkCache networkCache;
        Pair<FileExtension, InputStream> pairFetch;
        LottieResult<LottieComposition> lottieResultFromJsonInputStreamSync;
        if (str2 == null || (networkCache = this.networkCache) == null || (pairFetch = networkCache.fetch(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairFetch.first;
        InputStream inputStream = (InputStream) pairFetch.second;
        if (fileExtension == FileExtension.ZIP) {
            lottieResultFromJsonInputStreamSync = LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), str2);
        } else {
            lottieResultFromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str2);
        }
        if (lottieResultFromJsonInputStreamSync.getValue() != null) {
            return lottieResultFromJsonInputStreamSync.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [97=4, 95=4] */
    private LottieResult<LottieComposition> fetchFromNetwork(Context context, @NonNull String str, @Nullable String str2) {
        Logger.debug("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                LottieFetchResult lottieFetchResultFetchSync = this.fetcher.fetchSync(str);
                if (!lottieFetchResultFetchSync.isSuccessful()) {
                    LottieResult<LottieComposition> lottieResult = new LottieResult<>(new IllegalArgumentException(lottieFetchResultFetchSync.error()));
                    try {
                        lottieFetchResultFetchSync.close();
                    } catch (IOException e) {
                        Logger.warning("LottieFetchResult close failed ", e);
                    }
                    return lottieResult;
                }
                LottieResult<LottieComposition> lottieResultFromInputStream = fromInputStream(context, str, lottieFetchResultFetchSync.bodyByteStream(), lottieFetchResultFetchSync.contentType(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(lottieResultFromInputStream.getValue() != null);
                Logger.debug(sb.toString());
                try {
                    lottieFetchResultFetchSync.close();
                } catch (IOException e2) {
                    Logger.warning("LottieFetchResult close failed ", e2);
                }
                return lottieResultFromInputStream;
            } catch (Exception e3) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        Logger.warning("LottieFetchResult close failed ", e4);
                    }
                }
                return lottieResult2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    Logger.warning("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    private LottieResult<LottieComposition> fromInputStream(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        LottieResult<LottieComposition> lottieResultFromZipStream;
        FileExtension fileExtension;
        NetworkCache networkCache;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            Logger.debug("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            lottieResultFromZipStream = fromZipStream(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else {
            Logger.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            lottieResultFromZipStream = fromJsonStream(str, inputStream, str3);
        }
        if (str3 != null && lottieResultFromZipStream.getValue() != null && (networkCache = this.networkCache) != null) {
            networkCache.renameTempFile(str, fileExtension);
        }
        return lottieResultFromZipStream;
    }

    private LottieResult<LottieComposition> fromZipStream(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        NetworkCache networkCache;
        if (str2 == null || (networkCache = this.networkCache) == null) {
            return LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), (String) null);
        }
        return LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(new FileInputStream(networkCache.writeTempCacheFile(str, inputStream, FileExtension.ZIP))), str);
    }

    private LottieResult<LottieComposition> fromJsonStream(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        NetworkCache networkCache;
        if (str2 == null || (networkCache = this.networkCache) == null) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null);
        }
        return LottieCompositionFactory.fromJsonInputStreamSync(new FileInputStream(networkCache.writeTempCacheFile(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }
}
