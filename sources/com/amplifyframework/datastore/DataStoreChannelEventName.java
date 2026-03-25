package com.amplifyframework.datastore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public enum DataStoreChannelEventName {
    READY(EVM5792Capability.EVM5792Atomic.STATUS_READY),
    NETWORK_STATUS("networkStatus"),
    SUBSCRIPTIONS_ESTABLISHED("subscriptionsEstablished"),
    SUBSCRIPTION_DATA_PROCESSED("subscriptionDataProcessed"),
    OUTBOX_STATUS("outboxStatus"),
    OUTBOX_MUTATION_ENQUEUED("outboxMutationEnqueued"),
    OUTBOX_MUTATION_PROCESSED("outboxMutationProcessed"),
    OUTBOX_MUTATION_FAILED("outboxMutationFailed"),
    SYNC_QUERIES_STARTED("syncQueriesStarted"),
    SYNC_QUERIES_READY("syncQueriesReady"),
    MODEL_SYNCED("modelSynced"),
    NON_APPLICABLE_DATA_RECEIVED("nonApplicableDataReceived");

    private final String hubEventName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }

    DataStoreChannelEventName(@NonNull String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static DataStoreChannelEventName fromString(@Nullable String str) {
        for (DataStoreChannelEventName dataStoreChannelEventName : values()) {
            if (dataStoreChannelEventName.toString().equals(str)) {
                return dataStoreChannelEventName;
            }
        }
        throw new IllegalArgumentException("DataStore category does not publish any Hub event with name = " + str);
    }
}
