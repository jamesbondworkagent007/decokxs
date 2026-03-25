package com.reown.sign.storage.data.dao.temp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TempNamespaceDao {
    public final List<String> accounts;
    public final List<String> chains;
    public final List<String> events;
    public final Long isAcknowledged;
    public final String key;
    public final List<String> methods;
    public final long request_id;
    public final long session_id;
    public final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.events;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.isAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TempNamespaceDao copy(long j, long j2, @NotNull String str, @NotNull String str2, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new TempNamespaceDao(j, j2, str, str2, list, list2, list3, list4, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TempNamespaceDao)) {
            return false;
        }
        TempNamespaceDao tempNamespaceDao = (TempNamespaceDao) obj;
        return this.request_id == tempNamespaceDao.request_id && this.session_id == tempNamespaceDao.session_id && Intrinsics.EZpvd((Object) this.topic, (Object) tempNamespaceDao.topic) && Intrinsics.EZpvd((Object) this.key, (Object) tempNamespaceDao.key) && Intrinsics.EZpvd(this.chains, tempNamespaceDao.chains) && Intrinsics.EZpvd(this.accounts, tempNamespaceDao.accounts) && Intrinsics.EZpvd(this.methods, tempNamespaceDao.methods) && Intrinsics.EZpvd(this.events, tempNamespaceDao.events) && Intrinsics.EZpvd(this.isAcknowledged, tempNamespaceDao.isAcknowledged);
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
    public final long getRequest_id() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSession_id() {
        return this.session_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.request_id);
        int iHashCode2 = Long.hashCode(this.session_id);
        int iHashCode3 = this.topic.hashCode();
        int iHashCode4 = this.key.hashCode();
        List<String> list = this.chains;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        int iHashCode6 = this.accounts.hashCode();
        int iHashCode7 = this.methods.hashCode();
        int iHashCode8 = this.events.hashCode();
        Long l = this.isAcknowledged;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long isAcknowledged() {
        return this.isAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TempNamespaceDao(request_id=" + this.request_id + ", session_id=" + this.session_id + ", topic=" + this.topic + ", key=" + this.key + ", chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ", isAcknowledged=" + this.isAcknowledged + ")";
    }

    public TempNamespaceDao(long j, long j2, @NotNull String str, @NotNull String str2, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.request_id = j;
        this.session_id = j2;
        this.topic = str;
        this.key = str2;
        this.chains = list;
        this.accounts = list2;
        this.methods = list3;
        this.events = list4;
        this.isAcknowledged = l;
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
