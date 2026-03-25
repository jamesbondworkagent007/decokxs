package com.okinc.track;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C49401unp;
import o.C56390yDp;
import o.C56424yEw;
import o.C56533yIx;

/* JADX INFO: loaded from: classes24.dex */
public final class DialogTrackerKt$registerViewTrack$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ Pair<String, String>[] EZpvd;
    public long copydefault;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        this.copydefault = System.currentTimeMillis();
        C49401unp c49401unp = C49401unp.OLrzqt;
        C56533yIx c56533yIx = new C56533yIx(3);
        c56533yIx.copydefault(C56390yDp.OLrzqt("event_type", "view_dialog"));
        c56533yIx.copydefault(C56390yDp.OLrzqt("enter_time", C33129mqd.gEmmrt(Long.valueOf(this.copydefault))));
        c56533yIx.EZpvd(this.EZpvd);
        C49401unp.onEvent$default(c49401unp, C56424yEw.gEmmrt((Pair[]) c56533yIx.copydefault((Object[]) new Pair[c56533yIx.KWHzl()])), null, 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onStop(lifecycleOwner);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strDivS$default = C33129mqd.divS$default(Long.valueOf(jCurrentTimeMillis - this.copydefault), 1000, null, null, null, 14, null);
        C49401unp.onEvent$default(C49401unp.OLrzqt, C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "view_dialog"), C56390yDp.OLrzqt("exit_time", C33129mqd.gEmmrt(Long.valueOf(jCurrentTimeMillis))), C56390yDp.OLrzqt("view_time", strDivS$default + " s")), null, 2, null);
    }
}
