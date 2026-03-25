package com.bytedance.applog.oneid;

import com.bytedance.bdtracker.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class IDBindResult {
    public final String failedIdList;
    public final String newSsid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IDBindResult(String str, String str2) {
        this.newSsid = str;
        this.failedIdList = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IDBindResult copy$default(IDBindResult iDBindResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iDBindResult.newSsid;
        }
        if ((i & 2) != 0) {
            str2 = iDBindResult.failedIdList;
        }
        return iDBindResult.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newSsid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.failedIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IDBindResult copy(String str, String str2) {
        return new IDBindResult(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDBindResult)) {
            return false;
        }
        IDBindResult iDBindResult = (IDBindResult) obj;
        return Intrinsics.EZpvd((Object) this.newSsid, (Object) iDBindResult.newSsid) && Intrinsics.EZpvd((Object) this.failedIdList, (Object) iDBindResult.failedIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailedIdList() {
        return this.failedIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewSsid() {
        return this.newSsid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.newSsid;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.failedIdList;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = a.a("IDBindResult(newSsid=");
        sbA.append(this.newSsid);
        sbA.append(", failedIdList=");
        sbA.append(this.failedIdList);
        sbA.append(")");
        return sbA.toString();
    }
}
