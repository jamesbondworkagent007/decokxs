package com.reown.sign.storage.data.dao.namespace;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetNamespaces {
    public final List<String> accounts;
    public final List<String> chains;
    public final List<String> events;
    public final String key;
    public final List<String> methods;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.reown.sign.storage.data.dao.namespace.GetNamespaces */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNamespaces copy$default(GetNamespaces getNamespaces, String str, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNamespaces.key;
        }
        if ((i & 2) != 0) {
            list = getNamespaces.chains;
        }
        List list5 = list;
        if ((i & 4) != 0) {
            list2 = getNamespaces.accounts;
        }
        List list6 = list2;
        if ((i & 8) != 0) {
            list3 = getNamespaces.methods;
        }
        List list7 = list3;
        if ((i & 16) != 0) {
            list4 = getNamespaces.events;
        }
        return getNamespaces.copy(str, list5, list6, list7, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetNamespaces copy(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new GetNamespaces(str, list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNamespaces)) {
            return false;
        }
        GetNamespaces getNamespaces = (GetNamespaces) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) getNamespaces.key) && Intrinsics.EZpvd(this.chains, getNamespaces.chains) && Intrinsics.EZpvd(this.accounts, getNamespaces.accounts) && Intrinsics.EZpvd(this.methods, getNamespaces.methods) && Intrinsics.EZpvd(this.events, getNamespaces.events);
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
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        List<String> list = this.chains;
        return (((((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetNamespaces(key=" + this.key + ", chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
    }

    public GetNamespaces(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.key = str;
        this.chains = list;
        this.accounts = list2;
        this.methods = list3;
        this.events = list4;
    }
}
