package com.reown.android.internal.common.json_rpc.domain.relay;

import com.reown.foundation.common.model.Topic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Subscription {
    public final String attestation;
    public final String decryptedMessage;
    public final String encryptedMessage;
    public final long publishedAt;
    public final Topic topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, Topic topic, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscription.decryptedMessage;
        }
        if ((i & 2) != 0) {
            str2 = subscription.encryptedMessage;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            topic = subscription.topic;
        }
        Topic topic2 = topic;
        if ((i & 8) != 0) {
            j = subscription.publishedAt;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str3 = subscription.attestation;
        }
        return subscription.copy(str, str4, topic2, j2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.decryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component3() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.attestation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Subscription copy(@NotNull String str, @NotNull String str2, @NotNull Topic topic, long j, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(topic, "");
        return new Subscription(str, str2, topic, j, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return Intrinsics.EZpvd((Object) this.decryptedMessage, (Object) subscription.decryptedMessage) && Intrinsics.EZpvd((Object) this.encryptedMessage, (Object) subscription.encryptedMessage) && Intrinsics.EZpvd(this.topic, subscription.topic) && this.publishedAt == subscription.publishedAt && Intrinsics.EZpvd((Object) this.attestation, (Object) subscription.attestation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttestation() {
        return this.attestation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecryptedMessage() {
        return this.decryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptedMessage() {
        return this.encryptedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishedAt() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.decryptedMessage.hashCode();
        int iHashCode2 = this.encryptedMessage.hashCode();
        int iHashCode3 = this.topic.hashCode();
        int iHashCode4 = Long.hashCode(this.publishedAt);
        String str = this.attestation;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Subscription(decryptedMessage=" + this.decryptedMessage + ", encryptedMessage=" + this.encryptedMessage + ", topic=" + this.topic + ", publishedAt=" + this.publishedAt + ", attestation=" + this.attestation + ")";
    }

    public Subscription(@NotNull String str, @NotNull String str2, @NotNull Topic topic, long j, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(topic, "");
        this.decryptedMessage = str;
        this.encryptedMessage = str2;
        this.topic = topic;
        this.publishedAt = j;
        this.attestation = str3;
    }
}
