package com.bytedance.bdtracker;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f245a;
    public boolean b;
    public boolean c;
    public boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q1(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public q1(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public abstract String a();

    public abstract boolean a(JSONObject jSONObject);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            return Objects.equals(a(), ((q1) obj).a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return a().hashCode();
    }
}
