package com.amplifyframework.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthDevice {
    private final String id;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    private AuthDevice(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public static AuthDevice fromId(@NonNull String str) {
        return fromId(str, null);
    }

    public static AuthDevice fromId(@NonNull String str, @Nullable String str2) {
        Objects.requireNonNull(str);
        return new AuthDevice(str, str2);
    }

    public int hashCode() {
        return ObjectsCompat.hash(getId(), getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthDevice.class != obj.getClass()) {
            return false;
        }
        AuthDevice authDevice = (AuthDevice) obj;
        return ObjectsCompat.equals(getId(), authDevice.getId()) && ObjectsCompat.equals(getName(), authDevice.getName());
    }

    public String toString() {
        return "AuthDevice{id='" + this.id + "', name='" + this.name + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
