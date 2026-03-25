package com.bytedance.bdtracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f222a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public m3(long j, long j2, long j3, int i, @NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        this.f222a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return this.f222a == m3Var.f222a && this.b == m3Var.b && this.c == m3Var.c && this.d == m3Var.d && Intrinsics.EZpvd((Object) this.e, (Object) m3Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        long j = this.f222a;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.b;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.c;
        int i3 = (int) ((j3 >>> 32) ^ j3);
        int i4 = this.d;
        String str = this.e;
        return (((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("Network(requestStart=");
        sbA.append(this.f222a);
        sbA.append(", requestEnd=");
        sbA.append(this.b);
        sbA.append(", duration=");
        sbA.append(this.c);
        sbA.append(", httpStatus=");
        sbA.append(this.d);
        sbA.append(", error=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
