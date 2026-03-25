package com.amplifyframework.hub;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface HubCategoryBehavior {
    <T> void publish(@NonNull HubChannel hubChannel, @NonNull HubEvent<T> hubEvent) throws RuntimeException;

    SubscriptionToken subscribe(@NonNull HubChannel hubChannel, @NonNull HubEventFilter hubEventFilter, @NonNull HubSubscriber hubSubscriber);

    SubscriptionToken subscribe(@NonNull HubChannel hubChannel, @NonNull HubSubscriber hubSubscriber);

    void unsubscribe(@NonNull SubscriptionToken subscriptionToken);
}
