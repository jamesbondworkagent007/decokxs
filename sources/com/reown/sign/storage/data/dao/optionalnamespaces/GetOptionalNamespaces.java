package com.reown.sign.storage.data.dao.optionalnamespaces;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetOptionalNamespaces {
    public final List<String> chains;
    public final List<String> events;
    public final String key;
    public final List<String> methods;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.storage.data.dao.optionalnamespaces.GetOptionalNamespaces */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOptionalNamespaces copy$default(GetOptionalNamespaces getOptionalNamespaces, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOptionalNamespaces.key;
        }
        if ((i & 2) != 0) {
            list = getOptionalNamespaces.chains;
        }
        if ((i & 4) != 0) {
            list2 = getOptionalNamespaces.methods;
        }
        if ((i & 8) != 0) {
            list3 = getOptionalNamespaces.events;
        }
        return getOptionalNamespaces.copy(str, list, list2, list3);
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
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetOptionalNamespaces copy(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new GetOptionalNamespaces(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOptionalNamespaces)) {
            return false;
        }
        GetOptionalNamespaces getOptionalNamespaces = (GetOptionalNamespaces) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) getOptionalNamespaces.key) && Intrinsics.EZpvd(this.chains, getOptionalNamespaces.chains) && Intrinsics.EZpvd(this.methods, getOptionalNamespaces.methods) && Intrinsics.EZpvd(this.events, getOptionalNamespaces.events);
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
        return (((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetOptionalNamespaces(key=" + this.key + ", chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
    }

    public GetOptionalNamespaces(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.key = str;
        this.chains = list;
        this.methods = list2;
        this.events = list3;
    }
}
