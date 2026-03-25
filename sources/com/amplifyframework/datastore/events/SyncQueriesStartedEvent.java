package com.amplifyframework.datastore.events;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class SyncQueriesStartedEvent {
    private final String[] models;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getModels() {
        return this.models;
    }

    public SyncQueriesStartedEvent(String[] strArr) {
        this.models = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String toString() {
        return "SyncQueriesStartedEvent{models=" + Arrays.toString(this.models) + AbstractJsonLexerKt.END_OBJ;
    }

    public int hashCode() {
        return Arrays.hashCode(this.models);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SyncQueriesStartedEvent.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.models, ((SyncQueriesStartedEvent) obj).models);
    }
}
