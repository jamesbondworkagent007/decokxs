package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class LottieConfig {
    final LottieNetworkCacheProvider cacheProvider;
    final AsyncUpdates defaultAsyncUpdates;
    final boolean disablePathInterpolatorCache;
    final boolean enableNetworkCache;
    final boolean enableSystraceMarkers;
    final LottieNetworkFetcher networkFetcher;

    private LottieConfig(@Nullable LottieNetworkFetcher lottieNetworkFetcher, @Nullable LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3, AsyncUpdates asyncUpdates) {
        this.networkFetcher = lottieNetworkFetcher;
        this.cacheProvider = lottieNetworkCacheProvider;
        this.enableSystraceMarkers = z;
        this.enableNetworkCache = z2;
        this.disablePathInterpolatorCache = z3;
        this.defaultAsyncUpdates = asyncUpdates;
    }

    public static final class Builder {
        private LottieNetworkCacheProvider cacheProvider;
        private LottieNetworkFetcher networkFetcher;
        private boolean enableSystraceMarkers = false;
        private boolean enableNetworkCache = true;
        private boolean disablePathInterpolatorCache = true;
        private AsyncUpdates defaultAsyncUpdates = AsyncUpdates.AUTOMATIC;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
            this.defaultAsyncUpdates = asyncUpdates;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDisablePathInterpolatorCache(boolean z) {
            this.disablePathInterpolatorCache = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setEnableNetworkCache(boolean z) {
            this.enableNetworkCache = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setEnableSystraceMarkers(boolean z) {
            this.enableSystraceMarkers = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.networkFetcher = lottieNetworkFetcher;
            return this;
        }

        public Builder setNetworkCacheDir(@NonNull final File file) {
            if (this.cacheProvider != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.cacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.1
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public File getCacheDir() {
                    if (file.isDirectory()) {
                        return file;
                    }
                    throw new IllegalArgumentException("cache file must be a directory");
                }
            };
            return this;
        }

        public Builder setNetworkCacheProvider(@NonNull final LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.cacheProvider != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.cacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.2
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public File getCacheDir() {
                    File cacheDir = lottieNetworkCacheProvider.getCacheDir();
                    if (cacheDir.isDirectory()) {
                        return cacheDir;
                    }
                    throw new IllegalArgumentException("cache file must be a directory");
                }
            };
            return this;
        }

        public LottieConfig build() {
            return new LottieConfig(this.networkFetcher, this.cacheProvider, this.enableSystraceMarkers, this.enableNetworkCache, this.disablePathInterpolatorCache, this.defaultAsyncUpdates);
        }
    }
}
