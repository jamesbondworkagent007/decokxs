package com.reown.sign.storage.data.dao.optionalnamespaces;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OptionalNamespaceDao {
    public final List<String> chains;
    public final List<String> events;
    public final long id;
    public final String key;
    public final List<String> methods;
    public final long session_id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.chains;
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
    public final OptionalNamespaceDao copy(long j, long j2, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new OptionalNamespaceDao(j, j2, str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalNamespaceDao)) {
            return false;
        }
        OptionalNamespaceDao optionalNamespaceDao = (OptionalNamespaceDao) obj;
        return this.id == optionalNamespaceDao.id && this.session_id == optionalNamespaceDao.session_id && Intrinsics.EZpvd((Object) this.key, (Object) optionalNamespaceDao.key) && Intrinsics.EZpvd(this.chains, optionalNamespaceDao.chains) && Intrinsics.EZpvd(this.methods, optionalNamespaceDao.methods) && Intrinsics.EZpvd(this.events, optionalNamespaceDao.events);
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
    public final long getId() {
        return this.id;
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
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = Long.hashCode(this.session_id);
        int iHashCode3 = this.key.hashCode();
        List<String> list = this.chains;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionalNamespaceDao(id=" + this.id + ", session_id=" + this.session_id + ", key=" + this.key + ", chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
    }

    public OptionalNamespaceDao(long j, long j2, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.id = j;
        this.session_id = j2;
        this.key = str;
        this.chains = list;
        this.methods = list2;
        this.events = list3;
    }

    public static final class Adapter {
        public final LoaderManager<List<String>, String> chainsAdapter;
        public final LoaderManager<List<String>, String> eventsAdapter;
        public final LoaderManager<List<String>, String> methodsAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getChainsAdapter() {
            return this.chainsAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getEventsAdapter() {
            return this.eventsAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getMethodsAdapter() {
            return this.methodsAdapter;
        }

        public Adapter(@NotNull LoaderManager<List<String>, String> loaderManager, @NotNull LoaderManager<List<String>, String> loaderManager2, @NotNull LoaderManager<List<String>, String> loaderManager3) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(loaderManager2, "");
            Intrinsics.checkNotNullParameter(loaderManager3, "");
            this.chainsAdapter = loaderManager;
            this.methodsAdapter = loaderManager2;
            this.eventsAdapter = loaderManager3;
        }
    }
}
