package com.reown.sign.storage.data.dao.temp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetTempNamespacesByRequestId {
    public final List<String> accounts;
    public final List<String> chains;
    public final List<String> events;
    public final String key;
    public final List<String> methods;
    public final long session_id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetTempNamespacesByRequestId copy(long j, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new GetTempNamespacesByRequestId(j, str, list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTempNamespacesByRequestId)) {
            return false;
        }
        GetTempNamespacesByRequestId getTempNamespacesByRequestId = (GetTempNamespacesByRequestId) obj;
        return this.session_id == getTempNamespacesByRequestId.session_id && Intrinsics.EZpvd((Object) this.key, (Object) getTempNamespacesByRequestId.key) && Intrinsics.EZpvd(this.chains, getTempNamespacesByRequestId.chains) && Intrinsics.EZpvd(this.accounts, getTempNamespacesByRequestId.accounts) && Intrinsics.EZpvd(this.methods, getTempNamespacesByRequestId.methods) && Intrinsics.EZpvd(this.events, getTempNamespacesByRequestId.events);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEvents() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSession_id() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.session_id);
        int iHashCode2 = this.key.hashCode();
        List<String> list = this.chains;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetTempNamespacesByRequestId(session_id=" + this.session_id + ", key=" + this.key + ", chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
    }

    public GetTempNamespacesByRequestId(long j, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.session_id = j;
        this.key = str;
        this.chains = list;
        this.accounts = list2;
        this.methods = list3;
        this.events = list4;
    }
}
