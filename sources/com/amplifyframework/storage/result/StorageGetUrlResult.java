package com.amplifyframework.storage.result;

import androidx.annotation.NonNull;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageGetUrlResult {
    private final URL url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public URL getUrl() {
        return this.url;
    }

    private StorageGetUrlResult(@NonNull URL url) {
        this.url = url;
    }

    public static StorageGetUrlResult fromUrl(@NonNull URL url) {
        Objects.requireNonNull(url);
        return new StorageGetUrlResult(url);
    }
}
