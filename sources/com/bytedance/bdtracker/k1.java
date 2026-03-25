package com.bytedance.bdtracker;

import androidx.annotation.NonNull;
import com.bytedance.applog.ISessionObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k1 implements ISessionObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet<ISessionObserver> f204a = new CopyOnWriteArraySet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(ISessionObserver iSessionObserver) {
        if (iSessionObserver != null) {
            this.f204a.add(iSessionObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(ISessionObserver iSessionObserver) {
        if (iSessionObserver != null) {
            this.f204a.remove(iSessionObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionBatchEvent(long j, @NonNull String str, JSONObject jSONObject) {
        Iterator<ISessionObserver> it = this.f204a.iterator();
        while (it.hasNext()) {
            it.next().onSessionBatchEvent(j, str, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionStart(long j, @NonNull String str) {
        Iterator<ISessionObserver> it = this.f204a.iterator();
        while (it.hasNext()) {
            it.next().onSessionStart(j, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.ISessionObserver
    public void onSessionTerminate(long j, @NonNull String str, JSONObject jSONObject) {
        Iterator<ISessionObserver> it = this.f204a.iterator();
        while (it.hasNext()) {
            it.next().onSessionTerminate(j, str, jSONObject);
        }
    }
}
