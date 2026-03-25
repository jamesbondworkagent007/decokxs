package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.store.kv.IKVStore;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u5<String> f279a = new a();

    public static final class a extends u5<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.u5
        public String a(Object[] objArr) {
            IKVStore iKVStore = (IKVStore) objArr[0];
            String string = iKVStore.getString("cdid", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = UUID.randomUUID().toString();
            iKVStore.putString("cdid", string2);
            return string2;
        }
    }
}
