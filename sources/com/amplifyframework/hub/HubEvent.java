package com.amplifyframework.hub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HubEvent<T> {
    private final T data;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    /* JADX INFO: loaded from: classes14.dex */
    public interface Data<T> {
        HubEvent<T> toHubEvent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UUID getId() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    private HubEvent(@NonNull String str, @Nullable T t) {
        this.name = str;
        this.data = t;
    }

    public static HubEvent<?> create(@NonNull String str) {
        return new HubEvent<>(str, null);
    }

    public static <E extends Enum<E>> HubEvent<?> create(@NonNull E e) {
        Objects.requireNonNull(e);
        return new HubEvent<>(e.toString(), null);
    }

    public static <T> HubEvent<T> create(@NonNull String str, @NonNull T t) {
        return new HubEvent<>(str, t);
    }

    public static <T, E extends Enum<E>> HubEvent<T> create(@NonNull E e, @NonNull T t) {
        Objects.requireNonNull(e);
        Objects.requireNonNull(t);
        return new HubEvent<>(e.toString(), t);
    }

    public String toString() {
        return "HubEvent{name='" + this.name + "', data=" + this.data + ", uuid=" + this.uuid + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HubEvent.class != obj.getClass()) {
            return false;
        }
        HubEvent hubEvent = (HubEvent) obj;
        if (ObjectsCompat.equals(this.name, hubEvent.name) && ObjectsCompat.equals(this.data, hubEvent.data)) {
            return ObjectsCompat.equals(this.uuid, hubEvent.uuid);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        T t = this.data;
        int iHashCode2 = t != null ? t.hashCode() : 0;
        UUID uuid = this.uuid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (uuid != null ? uuid.hashCode() : 0);
    }
}
