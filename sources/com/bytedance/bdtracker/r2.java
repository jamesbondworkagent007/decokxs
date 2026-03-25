package com.bytedance.bdtracker;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.applog.monitor.MonitorSampling;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56532yIw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 implements m2, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f251a;
    public final n2 b;
    public final f0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r2(@NotNull f0 f0Var) {
        Intrinsics.EZpvd((Object) f0Var, "");
        this.c = f0Var;
        StringBuilder sbA = a.a("bd_tracker_monitor@");
        d dVar = f0Var.d;
        Intrinsics.AEQbTJ(dVar, "");
        sbA.append(dVar.m);
        HandlerThread handlerThread = new HandlerThread(sbA.toString());
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f251a = handler;
        Looper looper = handler.getLooper();
        Intrinsics.AEQbTJ(looper, "");
        d dVar2 = f0Var.d;
        Intrinsics.AEQbTJ(dVar2, "");
        String str = dVar2.m;
        Intrinsics.AEQbTJ(str, "");
        Context contextB = f0Var.b();
        Intrinsics.AEQbTJ(contextB, "");
        this.b = new n2(looper, str, contextB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(@NotNull u2 u2Var) {
        Intrinsics.EZpvd((Object) u2Var, "");
        v1 v1Var = this.c.e;
        Intrinsics.AEQbTJ(v1Var, "");
        if (v1Var.k()) {
            if (MonitorSampling.INSTANCE.isSampling$agent_liteGlobalRelease()) {
                d dVar = this.c.d;
                Intrinsics.AEQbTJ(dVar, "");
                dVar.D.debug(8, "Monitor EventTrace hint trace:{}", u2Var);
                this.b.a(u2Var).track(u2Var.g(), u2Var.d());
                return;
            }
            if ((u2Var instanceof d3) || (u2Var instanceof x2)) {
                this.b.a(u2Var).track(u2Var.g(), u2Var.d());
            }
            d dVar2 = this.c.d;
            Intrinsics.AEQbTJ(dVar2, "");
            dVar2.D.debug(8, "Monitor EventTrace not hint trace:{}", u2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message message) {
        Intrinsics.EZpvd((Object) message, "");
        int i = message.what;
        if (i == 1) {
            d dVar = this.c.d;
            Intrinsics.AEQbTJ(dVar, "");
            dVar.D.debug(8, "Monitor trace save:{}", message.obj);
            l4 l4VarC = this.c.c();
            Object obj = message.obj;
            if (!C56532yIw.DbNXlk(obj)) {
                obj = null;
            }
            l4VarC.c((List) obj);
        } else if (i == 2) {
            x1 x1Var = this.c.i;
            if (x1Var == null || x1Var.i() != 0) {
                d dVar2 = this.c.d;
                Intrinsics.AEQbTJ(dVar2, "");
                dVar2.D.debug(8, "Monitor report...", new Object[0]);
                l4 l4VarC2 = this.c.c();
                d dVar3 = this.c.d;
                Intrinsics.AEQbTJ(dVar3, "");
                String str = dVar3.m;
                x1 x1Var2 = this.c.i;
                Intrinsics.AEQbTJ(x1Var2, "");
                l4VarC2.b(str, x1Var2.f());
                f0 f0Var = this.c;
                f0Var.a(f0Var.l);
            } else {
                this.f251a.sendEmptyMessageDelayed(2, 500L);
            }
        }
        return true;
    }
}
