package com.reown.android.internal.common.storage.key_chain;

import com.reown.foundation.common.model.Key;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface KeyStore {
    boolean checkKeys(@NotNull String str);

    void deleteKeys(@NotNull String str);

    String getKey(@NotNull String str);

    Pair<String, String> getKeys(@NotNull String str);

    void setKey(@NotNull String str, @NotNull Key key);

    void setKeys(@NotNull String str, @NotNull Key key, @NotNull Key key2);
}
