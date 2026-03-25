package com.reown.sign.storage.data.dao.authenticatereponse;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AuthenticateResponseTopicDao {
    public final long id;
    public final String pairingTopic;
    public final String responseTopic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AuthenticateResponseTopicDao copy$default(AuthenticateResponseTopicDao authenticateResponseTopicDao, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = authenticateResponseTopicDao.id;
        }
        if ((i & 2) != 0) {
            str = authenticateResponseTopicDao.pairingTopic;
        }
        if ((i & 4) != 0) {
            str2 = authenticateResponseTopicDao.responseTopic;
        }
        return authenticateResponseTopicDao.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.responseTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticateResponseTopicDao copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AuthenticateResponseTopicDao(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticateResponseTopicDao)) {
            return false;
        }
        AuthenticateResponseTopicDao authenticateResponseTopicDao = (AuthenticateResponseTopicDao) obj;
        return this.id == authenticateResponseTopicDao.id && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) authenticateResponseTopicDao.pairingTopic) && Intrinsics.EZpvd((Object) this.responseTopic, (Object) authenticateResponseTopicDao.responseTopic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairingTopic() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseTopic() {
        return this.responseTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.pairingTopic.hashCode()) * 31) + this.responseTopic.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthenticateResponseTopicDao(id=" + this.id + ", pairingTopic=" + this.pairingTopic + ", responseTopic=" + this.responseTopic + ")";
    }

    public AuthenticateResponseTopicDao(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.pairingTopic = str;
        this.responseTopic = str2;
    }
}
