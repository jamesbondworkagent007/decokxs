package com.bytedance.bdtracker;

import com.bytedance.bdtracker.b;

/* JADX INFO: loaded from: classes2.dex */
public class o0 implements b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f235a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public o0(n0 n0Var, Throwable th) {
        this.f235a = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.b.d
    public void a(d dVar) {
        if (dVar.getInitConfig() == null || !dVar.getInitConfig().isMonitorEnabled()) {
            return;
        }
        p2.b(dVar.getMonitor(), this.f235a);
    }
}
