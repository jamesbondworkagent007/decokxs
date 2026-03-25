package com.bytedance.bdtracker;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.applog.store.kv.IKVStore;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v4 implements IKVStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<SharedPreferences> f278a;
    public final String b;
    public final Context c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public v4(String str, Context context, String str2) {
        AtomicReference<SharedPreferences> atomicReference = new AtomicReference<>();
        this.f278a = atomicReference;
        this.b = str;
        this.c = context;
        atomicReference.set(r4.a(context, str2, 0));
    }

    public abstract String a();

    public abstract void a(String str);

    public abstract void a(String str, int i);

    public abstract void a(String str, long j);

    public abstract void a(String str, String str2);

    public abstract void a(String str, Set<String> set);

    public abstract void a(String str, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore clear() {
        SharedPreferences sharedPreferences = this.f278a.get();
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().apply();
        } else {
            LoggerImpl.global().warn("[{}][KVStore]clear failed, preferences == null, key: {}", this.b);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public boolean contains(@NonNull String str) {
        SharedPreferences sharedPreferences = this.f278a.get();
        if (sharedPreferences == null) {
            LoggerImpl.global().warn("[{}][KVStore]contains failed, preferences == null, key: {}", this.b, str);
            return false;
        }
        return sharedPreferences.contains(a() + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f278a.get();
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        LoggerImpl.global().warn("[{}][KVStore]getAll failed, preferences == null, key: {}", this.b);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore putBoolean(@NonNull String str, boolean z) {
        a(str);
        a(str, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore putInt(@NonNull String str, int i) {
        a(str);
        a(str, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore putLong(@NonNull String str, long j) {
        a(str);
        a(str, j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore putString(@NonNull String str, String str2) {
        a(str);
        a(str, str2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore putStringSet(@NonNull String str, Set<String> set) {
        a(str);
        if (set == null) {
            set = new HashSet<>();
        }
        a(str, set);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.store.kv.IKVStore
    public IKVStore remove(@NonNull String str) {
        SharedPreferences sharedPreferences = this.f278a.get();
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(a() + str).apply();
        } else {
            LoggerImpl.global().warn("[{}][KVStore]remove failed, preferences == null, key: {}", this.b, str);
        }
        return this;
    }
}
