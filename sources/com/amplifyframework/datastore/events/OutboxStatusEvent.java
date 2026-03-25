package com.amplifyframework.datastore.events;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;

/* JADX INFO: loaded from: classes21.dex */
public final class OutboxStatusEvent implements HubEvent.Data<OutboxStatusEvent> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final boolean isEmpty;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEmpty() {
        return this.isEmpty;
    }

    public OutboxStatusEvent(boolean z) {
        this.isEmpty = z;
    }

    public int hashCode() {
        return Boolean.valueOf(this.isEmpty).hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OutboxStatusEvent.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(Boolean.valueOf(this.isEmpty), Boolean.valueOf(((OutboxStatusEvent) obj).isEmpty));
    }

    public String toString() {
        return "OutboxStatus{isEmpty=" + this.isEmpty + "}";
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<OutboxStatusEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.OUTBOX_STATUS, this);
    }

    public static OutboxStatusEvent from(HubEvent<?> hubEvent) throws AmplifyException {
        if (hubEvent.getData() instanceof OutboxStatusEvent) {
            return (OutboxStatusEvent) hubEvent.getData();
        }
        String name = OutboxStatusEvent.class.getName();
        throw new AmplifyException("Unable to cast event data from " + name, "Ensure that the event payload is of type " + name);
    }
}
