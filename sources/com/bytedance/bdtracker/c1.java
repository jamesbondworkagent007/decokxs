package com.bytedance.bdtracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 extends a1 {
    public volatile boolean b;
    public final Runnable c;

    public static final class a implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            c1.this.c.run();
            c1.this.b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c1(@NotNull Runnable runnable) {
        Intrinsics.EZpvd((Object) runnable, "");
        this.c = runnable;
        this.b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.bdtracker.a1
    public void a() {
        if (this.b) {
            this.b = false;
            this.f131a.removeCallbacks(this.c);
            this.f131a.postDelayed(new a(), 500L);
        }
    }
}
