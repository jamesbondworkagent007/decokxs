package com.bytedance.bdtracker;

import android.app.Activity;
import com.bytedance.applog.exposure.ExposureCheckType;
import com.bytedance.applog.exposure.ViewExposureManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f162a;
    public a1 b;
    public final ViewExposureManager c;

    public static final class a implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            Activity currActivity = e1.this.c.getCurrActivity();
            if (currActivity != null) {
                e1.this.c.checkViewExposureFromActivity$agent_liteGlobalRelease(currActivity);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public e1(@NotNull ViewExposureManager viewExposureManager) {
        Intrinsics.EZpvd((Object) viewExposureManager, "");
        this.c = viewExposureManager;
        a aVar = new a();
        this.f162a = aVar;
        this.b = new b1(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(ExposureCheckType exposureCheckType) {
        this.b = (exposureCheckType != null && d1.f156a[exposureCheckType.ordinal()] == 1) ? new c1(this.f162a) : new b1(this.f162a);
    }
}
