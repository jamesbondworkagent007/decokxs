package com.bytedance.bdtracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends a1 {
    public final Runnable b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b1(@NotNull Runnable runnable) {
        Intrinsics.EZpvd((Object) runnable, "");
        this.b = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.bdtracker.a1
    public void a() {
        this.f131a.removeCallbacks(this.b);
        this.f131a.postDelayed(this.b, 100L);
    }
}
