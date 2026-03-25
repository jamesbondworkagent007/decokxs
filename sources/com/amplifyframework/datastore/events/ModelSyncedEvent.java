package com.amplifyframework.datastore.events;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelSyncedEvent implements HubEvent.Data<ModelSyncedEvent> {
    private final int added;
    private final int deleted;
    private final boolean isDeltaSync;
    private final boolean isFullSync;
    private final String model;
    private final int updated;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getAdded() {
        return this.added;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDeleted() {
        return this.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getUpdated() {
        return this.updated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDeltaSync() {
        return this.isDeltaSync;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isFullSync() {
        return this.isFullSync;
    }

    public ModelSyncedEvent(String str, boolean z, int i, int i2, int i3) {
        this.added = i;
        this.updated = i2;
        this.deleted = i3;
        this.model = str;
        this.isFullSync = z;
        this.isDeltaSync = !z;
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<ModelSyncedEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.MODEL_SYNCED, this);
    }

    public String toString() {
        return "ModelSyncedEvent{model=" + this.model + ", isFullSync=" + this.isFullSync + ", isDeltaSync=" + this.isDeltaSync + ", added=" + this.added + ", updated=" + this.updated + ", deleted=" + this.deleted + AbstractJsonLexerKt.END_OBJ;
    }

    public int hashCode() {
        String str = this.model;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = Boolean.valueOf(this.isFullSync).hashCode();
        int iHashCode3 = Boolean.valueOf(this.isDeltaSync).hashCode();
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + Integer.valueOf(this.added).intValue()) * 31) + Integer.valueOf(this.updated).intValue()) * 31) + Integer.valueOf(this.deleted).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSyncedEvent.class != obj.getClass()) {
            return false;
        }
        ModelSyncedEvent modelSyncedEvent = (ModelSyncedEvent) obj;
        if (ObjectsCompat.equals(this.model, modelSyncedEvent.model) && ObjectsCompat.equals(Boolean.valueOf(this.isFullSync), Boolean.valueOf(modelSyncedEvent.isFullSync)) && ObjectsCompat.equals(Boolean.valueOf(this.isDeltaSync), Boolean.valueOf(modelSyncedEvent.isDeltaSync)) && ObjectsCompat.equals(Integer.valueOf(this.added), Integer.valueOf(modelSyncedEvent.added)) && ObjectsCompat.equals(Integer.valueOf(this.updated), Integer.valueOf(modelSyncedEvent.updated))) {
            return ObjectsCompat.equals(Integer.valueOf(this.deleted), Integer.valueOf(modelSyncedEvent.deleted));
        }
        return false;
    }
}
