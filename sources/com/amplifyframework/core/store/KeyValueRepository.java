package com.amplifyframework.core.store;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KeyValueRepository {

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static void removeAll(@NotNull KeyValueRepository keyValueRepository) {
        }
    }

    String get(@NotNull String str);

    void put(@NotNull String str, String str2);

    void remove(@NotNull String str);

    void removeAll();
}
