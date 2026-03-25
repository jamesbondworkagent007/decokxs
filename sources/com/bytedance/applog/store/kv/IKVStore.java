package com.bytedance.applog.store.kv;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface IKVStore {
    IKVStore clear();

    boolean contains(@NonNull String str);

    Map<String, ?> getAll();

    boolean getBoolean(@NonNull String str, boolean z);

    int getInt(@NonNull String str, int i);

    long getLong(@NonNull String str, long j);

    String getString(@NonNull String str, @Nullable String str2);

    Set<String> getStringSet(@NonNull String str, Set<String> set);

    IKVStore putBoolean(@NonNull String str, boolean z);

    IKVStore putInt(@NonNull String str, int i);

    IKVStore putLong(@NonNull String str, long j);

    IKVStore putString(@NonNull String str, String str2);

    IKVStore putStringSet(@NonNull String str, Set<String> set);

    IKVStore remove(@NonNull String str);
}
