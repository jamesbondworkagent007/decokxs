package com.bytedance.bdtracker;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends g3 {
    public AtomicInteger e;
    public AtomicInteger f;
    public AtomicInteger g;
    public AtomicInteger h;
    public AtomicInteger i;
    public AtomicInteger j;
    public AtomicInteger k;
    public AtomicInteger l;
    public AtomicInteger m;
    public AtomicInteger n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AtomicInteger f232o;
    public List<m3> p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(@NotNull d dVar) {
        super(dVar);
        Intrinsics.EZpvd((Object) dVar, "");
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.g = new AtomicInteger();
        this.h = new AtomicInteger();
        this.i = new AtomicInteger();
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = new AtomicInteger();
        this.m = new AtomicInteger();
        this.n = new AtomicInteger(1);
        this.f232o = new AtomicInteger();
        this.p = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.g3
    public String a() {
        return "report";
    }

    @Override // com.bytedance.bdtracker.g3
    public void a(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        d dVar = this.d;
        try {
            jSONObject.put(MetricsSQLiteCacheKt.METRICS_START_TIME, this.f178a);
            jSONObject.put(MetricsSQLiteCacheKt.METRICS_END_TIME, this.b);
            jSONObject.put("net", this.e.get());
            jSONObject.put("f_net", this.f.get());
            jSONObject.put("f_5xx", this.g.get());
            jSONObject.put("f_4xx", this.h.get());
            jSONObject.put("f_data", this.i.get());
            jSONObject.put("make_event", this.k.get());
            jSONObject.put("net_event", this.l.get());
            jSONObject.put("f_net_event", this.m.get());
            jSONObject.put("event", this.j.get());
            jSONObject.put("pre_event", this.f232o);
            jSONObject.put("sampling", r.a((List) this.p));
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final <T> void a(@NotNull String str, T t) {
        AtomicInteger atomicInteger;
        Integer num;
        Intrinsics.EZpvd((Object) str, "");
        d dVar = this.d;
        try {
            this.c = true;
            switch (str.hashCode()) {
                case -1283983389:
                    if (str.equals("f_data")) {
                        atomicInteger = this.i;
                        boolean z = t instanceof Integer;
                        Object obj = t;
                        if (!z) {
                            obj = (T) null;
                        }
                        num = (Integer) obj;
                        int iIntValue = num != null ? num.intValue() : 0;
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 108957:
                    if (str.equals("net")) {
                        atomicInteger = this.e;
                        boolean z2 = t instanceof Integer;
                        Object obj2 = t;
                        if (!z2) {
                            obj2 = (T) null;
                        }
                        num = (Integer) obj2;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 96891546:
                    if (str.equals("event")) {
                        atomicInteger = this.j;
                        boolean z3 = t instanceof Integer;
                        Object obj3 = t;
                        if (!z3) {
                            obj3 = (T) null;
                        }
                        num = (Integer) obj3;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 97083099:
                    if (str.equals("f_4xx")) {
                        atomicInteger = this.h;
                        boolean z4 = t instanceof Integer;
                        Object obj4 = t;
                        if (!z4) {
                            obj4 = (T) null;
                        }
                        num = (Integer) obj4;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 97084060:
                    if (str.equals("f_5xx")) {
                        atomicInteger = this.g;
                        boolean z5 = t instanceof Integer;
                        Object obj5 = t;
                        if (!z5) {
                            obj5 = (T) null;
                        }
                        num = (Integer) obj5;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 97138244:
                    if (str.equals("f_net")) {
                        atomicInteger = this.f;
                        boolean z6 = t instanceof Integer;
                        Object obj6 = t;
                        if (!z6) {
                            obj6 = (T) null;
                        }
                        num = (Integer) obj6;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 587804937:
                    if (str.equals("make_event")) {
                        atomicInteger = this.k;
                        boolean z7 = t instanceof Integer;
                        Object obj7 = t;
                        if (!z7) {
                            obj7 = (T) null;
                        }
                        num = (Integer) obj7;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 1272203487:
                    if (str.equals("f_net_event")) {
                        atomicInteger = this.m;
                        boolean z8 = t instanceof Integer;
                        Object obj8 = t;
                        if (!z8) {
                            obj8 = (T) null;
                        }
                        num = (Integer) obj8;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 1366562168:
                    if (str.equals("net_event")) {
                        atomicInteger = this.l;
                        boolean z9 = t instanceof Integer;
                        Object obj9 = t;
                        if (!z9) {
                            obj9 = (T) null;
                        }
                        num = (Integer) obj9;
                        if (num != null) {
                            atomicInteger.addAndGet(iIntValue);
                        }
                        atomicInteger.addAndGet(iIntValue);
                    }
                    break;
                case 1975570407:
                    if (str.equals("sampling") && (t instanceof m3)) {
                        this.p.add(t);
                        break;
                    }
                    break;
            }
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }
}
