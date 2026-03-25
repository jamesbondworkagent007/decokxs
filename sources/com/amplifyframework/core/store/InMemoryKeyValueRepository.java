package com.amplifyframework.core.store;

import com.amplifyframework.annotations.InternalApiWarning;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalApiWarning
public final class InMemoryKeyValueRepository implements KeyValueRepository {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 != null) {
            this.cache.put(str, str2);
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.cache.getOrDefault(str, null);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cache.remove(str);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        this.cache.clear();
    }
}
