package com.amplifyframework.hub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes2.dex */
public final class HubCategory extends Category<HubPlugin<?>> implements HubCategoryBehavior {
    private final HubPlugin<?> defaultPlugin = new AWSHubPlugin();

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public <T> void publish(@NonNull HubChannel hubChannel, @NonNull HubEvent<T> hubEvent) {
        getHubPlugin().publish(hubChannel, hubEvent);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(@NonNull HubChannel hubChannel, @NonNull HubSubscriber hubSubscriber) {
        return getHubPlugin().subscribe(hubChannel, hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(@NonNull HubChannel hubChannel, @Nullable HubEventFilter hubEventFilter, @NonNull HubSubscriber hubSubscriber) {
        return getHubPlugin().subscribe(hubChannel, hubEventFilter, hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public void unsubscribe(@NonNull SubscriptionToken subscriptionToken) {
        getHubPlugin().unsubscribe(subscriptionToken);
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.HUB;
    }

    private HubPlugin<?> getHubPlugin() {
        return (!super.isInitialized() || super.getPlugins().isEmpty()) ? this.defaultPlugin : (HubPlugin) super.getSelectedPlugin();
    }
}
