package com.bytedance.bdtracker;

import com.bytedance.applog.event.AutoTrackEventType;
import com.bytedance.bdtracker.b;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4 f270a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public v(p4 p4Var) {
        this.f270a = p4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.b.e
    public boolean a(d dVar) {
        if (!dVar.isBavEnabled()) {
            return false;
        }
        if ((dVar.getInitConfig() == null || AutoTrackEventType.a(dVar.getInitConfig().getAutoTrackEventType(), 2)) && !dVar.isAutoTrackPageIgnored(this.f270a.E)) {
            return !this.f270a.D || dVar.getInitConfig() == null || dVar.getInitConfig().isAutoTrackFragmentEnabled();
        }
        return false;
    }
}
