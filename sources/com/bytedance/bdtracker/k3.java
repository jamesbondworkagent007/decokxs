package com.bytedance.bdtracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f205a = new k3();

    @Override // com.bytedance.bdtracker.j3
    public void a() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.j3
    public <T> void a(@NotNull String str, T t) {
        Intrinsics.EZpvd((Object) str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.j3
    public void a(@NotNull Throwable th, @NotNull String str) {
        Intrinsics.EZpvd((Object) th, "");
        Intrinsics.EZpvd((Object) str, "");
    }
}
