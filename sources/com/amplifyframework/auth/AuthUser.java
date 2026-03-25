package com.amplifyframework.auth;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthUser {
    private String userId;
    private String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUsername() {
        return this.username;
    }

    public AuthUser(@NonNull String str, @NonNull String str2) {
        Objects.requireNonNull(str);
        this.userId = str;
        Objects.requireNonNull(str2);
        this.username = str2;
    }

    public int hashCode() {
        return ObjectsCompat.hash(getUserId(), getUsername());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUser.class != obj.getClass()) {
            return false;
        }
        AuthUser authUser = (AuthUser) obj;
        return ObjectsCompat.equals(getUserId(), authUser.getUserId()) && ObjectsCompat.equals(getUsername(), authUser.getUsername());
    }

    public String toString() {
        return "AuthUser{userId='" + this.userId + "', username='" + this.username + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
