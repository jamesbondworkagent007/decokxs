package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class Identities {
    public final String accountId;
    public final String cacao_payload;
    public final long id;
    public final String identity;
    public final Boolean is_owner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Identities copy$default(Identities identities, long j, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            j = identities.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = identities.identity;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = identities.accountId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = identities.cacao_payload;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bool = identities.is_owner;
        }
        return identities.copy(j2, str4, str5, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.identity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cacao_payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.is_owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Identities copy(long j, @NotNull String str, @NotNull String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Identities(j, str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Identities)) {
            return false;
        }
        Identities identities = (Identities) obj;
        return this.id == identities.id && Intrinsics.EZpvd((Object) this.identity, (Object) identities.identity) && Intrinsics.EZpvd((Object) this.accountId, (Object) identities.accountId) && Intrinsics.EZpvd((Object) this.cacao_payload, (Object) identities.cacao_payload) && Intrinsics.EZpvd(this.is_owner, identities.is_owner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCacao_payload() {
        return this.cacao_payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentity() {
        return this.identity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.identity.hashCode();
        int iHashCode3 = this.accountId.hashCode();
        String str = this.cacao_payload;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool = this.is_owner;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean is_owner() {
        return this.is_owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Identities(id=" + this.id + ", identity=" + this.identity + ", accountId=" + this.accountId + ", cacao_payload=" + this.cacao_payload + ", is_owner=" + this.is_owner + ")";
    }

    public Identities(long j, @NotNull String str, @NotNull String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.identity = str;
        this.accountId = str2;
        this.cacao_payload = str3;
        this.is_owner = bool;
    }
}
