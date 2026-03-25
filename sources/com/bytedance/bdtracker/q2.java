package com.bytedance.bdtracker;

import android.os.Handler;
import com.bytedance.applog.aggregation.Metrics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes14.dex */
public final class q2 extends Lambda implements Function1<List<? extends Metrics>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f246a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var) {
        super(1);
        this.f246a = r2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(List<? extends Metrics> list) {
        List<? extends Metrics> list2 = list;
        Intrinsics.EZpvd((Object) list2, "");
        ArrayList arrayList = new ArrayList();
        for (Metrics metrics : list2) {
            t4 t4Var = new t4();
            this.f246a.c.n.a(this.f246a.c.d, t4Var);
            t4Var.f175o = metrics.toParams();
            arrayList.add(t4Var);
        }
        Handler handler = this.f246a.f251a;
        handler.sendMessage(handler.obtainMessage(1, arrayList));
        this.f246a.f251a.sendEmptyMessage(2);
        return Unit.INSTANCE;
    }
}
