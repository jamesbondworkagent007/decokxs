package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PushMessage {
    public final String blob;
    public final String id;
    public final long tag;
    public final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PushMessage copy$default(PushMessage pushMessage, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = pushMessage.topic;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = pushMessage.blob;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = pushMessage.tag;
        }
        return pushMessage.copy(str, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.blob;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushMessage copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PushMessage(str, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushMessage)) {
            return false;
        }
        PushMessage pushMessage = (PushMessage) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) pushMessage.id) && Intrinsics.EZpvd((Object) this.topic, (Object) pushMessage.topic) && Intrinsics.EZpvd((Object) this.blob, (Object) pushMessage.blob) && this.tag == pushMessage.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlob() {
        return this.blob;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.topic.hashCode()) * 31) + this.blob.hashCode()) * 31) + Long.hashCode(this.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushMessage(id=" + this.id + ", topic=" + this.topic + ", blob=" + this.blob + ", tag=" + this.tag + ")";
    }

    public PushMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.topic = str2;
        this.blob = str3;
        this.tag = j;
    }
}
