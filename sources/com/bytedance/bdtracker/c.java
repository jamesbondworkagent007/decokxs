package com.bytedance.bdtracker;

import com.bytedance.bdtracker.b;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements b.d {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f142a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(c cVar, d dVar) {
            this.f142a = dVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            d dVar = this.f142a;
            v1 v1Var = dVar.b("getConfig") ? null : dVar.q.e;
            if (v1Var == null || v1Var.q || v1Var.f.getBoolean("enter_background_not_send", false)) {
                return;
            }
            this.f142a.flush();
            this.f142a.b().a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.b.d
    public void a(d dVar) {
        y.f301a.execute(new a(this, dVar));
    }
}
