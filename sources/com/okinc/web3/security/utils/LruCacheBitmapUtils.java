package com.okinc.web3.security.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class LruCacheBitmapUtils {
    public static final int $stable = 8;
    private LruCache<Integer, BitmapDrawable> mLruCache;

    private final void initLruCache() {
        this.mLruCache = new LruCache<Integer, BitmapDrawable>(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8) { // from class: com.okinc.web3.security.utils.LruCacheBitmapUtils.initLruCache.1
            /* JADX DEBUG: Method merged with bridge method: sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // android.util.LruCache
            public int sizeOf(Integer num, BitmapDrawable bitmapDrawable) {
                if ((bitmapDrawable != null ? bitmapDrawable.getBitmap() : null) == null) {
                    return 0;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Integer numValueOf = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null;
                Intrinsics.copydefault(numValueOf);
                int iIntValue = numValueOf.intValue();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                Integer numValueOf2 = bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null;
                Intrinsics.copydefault(numValueOf2);
                return (iIntValue * numValueOf2.intValue()) / 1024;
            }
        };
    }

    public final BitmapDrawable getBitmapFromMemoryCache(int i) {
        if (this.mLruCache == null) {
            initLruCache();
        }
        LruCache<Integer, BitmapDrawable> lruCache = this.mLruCache;
        if (lruCache != null) {
            return lruCache.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void addBitmapToMemoryCache(int i, @NotNull BitmapDrawable bitmapDrawable) {
        LruCache<Integer, BitmapDrawable> lruCache;
        Intrinsics.checkNotNullParameter(bitmapDrawable, "");
        if (getBitmapFromMemoryCache(i) != null || (lruCache = this.mLruCache) == null) {
            return;
        }
        lruCache.put(Integer.valueOf(i), bitmapDrawable);
    }
}
