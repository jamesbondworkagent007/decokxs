package com.bytedance.bdtracker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.IEventJsonObserver;
import com.bytedance.applog.IEventObserver;
import com.bytedance.applog.IPresetEventObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j1 implements IEventObserver, IEventJsonObserver, IPresetEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet<IEventObserver> f197a = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<IEventJsonObserver> b = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<IPresetEventObserver> c = new CopyOnWriteArraySet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(IEventJsonObserver iEventJsonObserver) {
        if (iEventJsonObserver != null) {
            this.b.add(iEventJsonObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(IEventObserver iEventObserver) {
        if (iEventObserver != null) {
            this.f197a.add(iEventObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(IPresetEventObserver iPresetEventObserver) {
        if (iPresetEventObserver != null) {
            this.c.add(iPresetEventObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean a() {
        return !this.b.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(IEventJsonObserver iEventJsonObserver) {
        if (iEventJsonObserver != null) {
            this.b.remove(iEventJsonObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(IEventObserver iEventObserver) {
        if (iEventObserver != null) {
            this.f197a.remove(iEventObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void b(IPresetEventObserver iPresetEventObserver) {
        if (iPresetEventObserver != null) {
            this.c.remove(iPresetEventObserver);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean b() {
        return !this.c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IEventJsonObserver
    public void eventJson(@NonNull String str, @Nullable JSONObject jSONObject) {
        Iterator<IEventJsonObserver> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().eventJson(str, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IEventJsonObserver
    public void launchJson(@Nullable JSONObject jSONObject) {
        Iterator<IEventJsonObserver> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().launchJson(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IEventObserver
    public void onEvent(@NonNull String str, @NonNull String str2, String str3, long j, long j2, String str4) {
        Iterator<IEventObserver> it = this.f197a.iterator();
        while (it.hasNext()) {
            it.next().onEvent(str, str2, str3, j, j2, str4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IEventObserver
    public void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject) {
        Iterator<IEventObserver> it = this.f197a.iterator();
        while (it.hasNext()) {
            it.next().onEventV3(str, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPresetEventObserver
    public void onLaunch(JSONObject jSONObject) {
        Iterator<IPresetEventObserver> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onLaunch(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPresetEventObserver
    public void onPageEnter(JSONObject jSONObject) {
        Iterator<IPresetEventObserver> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onPageEnter(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPresetEventObserver
    public void onPageLeave(JSONObject jSONObject) {
        Iterator<IPresetEventObserver> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onPageLeave(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IEventJsonObserver
    public void pageJson(@Nullable JSONObject jSONObject, boolean z) {
        Iterator<IEventJsonObserver> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().pageJson(jSONObject, z);
        }
    }
}
