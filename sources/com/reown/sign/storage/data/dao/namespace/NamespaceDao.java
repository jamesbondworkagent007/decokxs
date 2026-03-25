package com.reown.sign.storage.data.dao.namespace;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class NamespaceDao {
    public final List<String> accounts;
    public final List<String> chains;
    public final List<String> events;
    public final long id;
    public final String key;
    public final List<String> methods;
    public final long request_id;
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
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NamespaceDao copy(long j, long j2, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new NamespaceDao(j, j2, str, list, list2, list3, list4, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NamespaceDao)) {
            return false;
        }
        NamespaceDao namespaceDao = (NamespaceDao) obj;
        return this.id == namespaceDao.id && this.session_id == namespaceDao.session_id && Intrinsics.EZpvd((Object) this.key, (Object) namespaceDao.key) && Intrinsics.EZpvd(this.chains, namespaceDao.chains) && Intrinsics.EZpvd(this.accounts, namespaceDao.accounts) && Intrinsics.EZpvd(this.methods, namespaceDao.methods) && Intrinsics.EZpvd(this.events, namespaceDao.events) && this.request_id == namespaceDao.request_id;
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
    public final long getRequest_id() {
        return this.request_id;
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
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode()) * 31) + Long.hashCode(this.request_id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NamespaceDao(id=" + this.id + ", session_id=" + this.session_id + ", key=" + this.key + ", chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ", request_id=" + this.request_id + ")";
    }

    public NamespaceDao(long j, long j2, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.id = j;
        this.session_id = j2;
        this.key = str;
        this.chains = list;
        this.accounts = list2;
        this.methods = list3;
        this.events = list4;
        this.request_id = j3;
    }

    public static final class Adapter {
        public final LoaderManager<List<String>, String> accountsAdapter;
        public final LoaderManager<List<String>, String> chainsAdapter;
        public final LoaderManager<List<String>, String> eventsAdapter;
        public final LoaderManager<List<String>, String> methodsAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getAccountsAdapter() {
            return this.accountsAdapter;
        }

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

        public Adapter(@NotNull LoaderManager<List<String>, String> loaderManager, @NotNull LoaderManager<List<String>, String> loaderManager2, @NotNull LoaderManager<List<String>, String> loaderManager3, @NotNull LoaderManager<List<String>, String> loaderManager4) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(loaderManager2, "");
            Intrinsics.checkNotNullParameter(loaderManager3, "");
            Intrinsics.checkNotNullParameter(loaderManager4, "");
            this.chainsAdapter = loaderManager;
            this.accountsAdapter = loaderManager2;
            this.methodsAdapter = loaderManager3;
            this.eventsAdapter = loaderManager4;
        }
    }
}
