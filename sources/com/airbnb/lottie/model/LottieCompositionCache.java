package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

/* JADX INFO: loaded from: classes2.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final LruCache<String, LottieComposition> cache = new LruCache<>(20);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public LottieComposition get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.cache.get(str);
    }

    public void put(@Nullable String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.put(str, lottieComposition);
    }

    public void clear() {
        this.cache.evictAll();
    }

    public void resize(int i) {
        this.cache.resize(i);
    }
}
