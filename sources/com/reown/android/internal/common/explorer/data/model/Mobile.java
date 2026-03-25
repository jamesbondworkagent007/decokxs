package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class Mobile {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f90native;
    public final String universal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Mobile copy$default(Mobile mobile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobile.f90native;
        }
        if ((i & 2) != 0) {
            str2 = mobile.universal;
        }
        return mobile.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f90native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mobile copy(String str, String str2) {
        return new Mobile(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mobile)) {
            return false;
        }
        Mobile mobile = (Mobile) obj;
        return Intrinsics.EZpvd((Object) this.f90native, (Object) mobile.f90native) && Intrinsics.EZpvd((Object) this.universal, (Object) mobile.universal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f90native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversal() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.f90native;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.universal;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Mobile(native=" + this.f90native + ", universal=" + this.universal + ")";
    }

    public Mobile(String str, String str2) {
        this.f90native = str;
        this.universal = str2;
    }
}
