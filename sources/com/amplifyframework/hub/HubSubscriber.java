package com.amplifyframework.hub;

import androidx.annotation.NonNull;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface HubSubscriber {
    void onEvent(@NonNull HubEvent<?> hubEvent);

    static <T extends HubEvent.Data> HubSubscriber create(@NonNull final Consumer<T> consumer) {
        return new HubSubscriber() { // from class: com.amplifyframework.hub.HubSubscriber$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                HubSubscriber.lambda$create$0(consumer, hubEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$create$0(Consumer consumer, HubEvent hubEvent) {
        try {
            consumer.accept((HubEvent.Data) hubEvent.getData());
        } catch (Exception unused) {
            hubEvent.getName();
        }
    }
}
