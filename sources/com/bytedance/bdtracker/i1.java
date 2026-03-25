package com.bytedance.bdtracker;

import androidx.annotation.NonNull;
import com.bytedance.applog.IDataObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i1 implements IDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet<IDataObserver> f191a = new CopyOnWriteArraySet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(IDataObserver iDataObserver) {
        if (iDataObserver != null) {
            this.f191a.add(iDataObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(IDataObserver iDataObserver) {
        if (iDataObserver != null) {
            this.f191a.remove(iDataObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onAbVidsChange(@NonNull String str, @NonNull String str2) {
        Iterator<IDataObserver> it = this.f191a.iterator();
        while (it.hasNext()) {
            it.next().onAbVidsChange(str, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onIdLoaded(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Iterator<IDataObserver> it = this.f191a.iterator();
        while (it.hasNext()) {
            it.next().onIdLoaded(str, str2, str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteAbConfigGet(boolean z, @NonNull JSONObject jSONObject) {
        Iterator<IDataObserver> it = this.f191a.iterator();
        while (it.hasNext()) {
            it.next().onRemoteAbConfigGet(z, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteConfigGet(boolean z, JSONObject jSONObject) {
        Iterator<IDataObserver> it = this.f191a.iterator();
        while (it.hasNext()) {
            it.next().onRemoteConfigGet(z, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteIdGet(boolean z, String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        Iterator<IDataObserver> it = this.f191a.iterator();
        while (it.hasNext()) {
            it.next().onRemoteIdGet(z, str, str2, str3, str4, str5, str6);
        }
    }
}
