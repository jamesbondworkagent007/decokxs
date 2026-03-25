package com.bytedance.bdtracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187a;
    public final String b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public h3(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
        this.f187a = j;
        this.b = str;
        this.c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return this.f187a == h3Var.f187a && Intrinsics.EZpvd((Object) this.b, (Object) h3Var.b) && Intrinsics.EZpvd((Object) this.c, (Object) h3Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        long j = this.f187a;
        int i = (int) (j ^ (j >>> 32));
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        return (((i * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("Exception(timestamp=");
        sbA.append(this.f187a);
        sbA.append(", error=");
        sbA.append(this.b);
        sbA.append(", tag=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
