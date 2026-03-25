package com.bytedance.bdtracker;

import com.bytedance.applog.exposure.ViewExposureConfig;
import com.bytedance.applog.exposure.ViewExposureData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewExposureData<ViewExposureConfig> f250a;
    public boolean b;
    public v0 c;
    public long d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r0(ViewExposureData viewExposureData, boolean z, v0 v0Var, long j, int i) {
        z = (i & 2) != 0 ? false : z;
        v0Var = (i & 4) != 0 ? v0.NOT_EXPOSURE : v0Var;
        j = (i & 8) != 0 ? 0L : j;
        Intrinsics.EZpvd((Object) viewExposureData, "");
        Intrinsics.EZpvd((Object) v0Var, "");
        this.f250a = viewExposureData;
        this.b = z;
        this.c = v0Var;
        this.d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull v0 v0Var) {
        Intrinsics.EZpvd((Object) v0Var, "");
        this.c = v0Var;
    }
}
