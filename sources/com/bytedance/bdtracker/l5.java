package com.bytedance.bdtracker;

import android.content.Context;
import com.bytedance.applog.store.kv.IKVStore;

/* JADX INFO: loaded from: classes2.dex */
public class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z4<IKVStore> f218a = new a();

    public static final class a extends z4<IKVStore> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.z4
        public IKVStore a(Object[] objArr) {
            return x4.a((Context) objArr[0], "ug_install_settings_pref");
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f219a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(Context context) {
            this.f219a = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            l5.f218a.b(this.f219a).putBoolean("_install_started_v2", true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context) {
        y.f301a.submit(new b(context));
    }

    public static boolean a() {
        return true;
    }
}
