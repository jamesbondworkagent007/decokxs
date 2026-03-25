package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetPushMessageById {
    public final String blob;
    public final String id;
    public final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetPushMessageById copy$default(GetPushMessageById getPushMessageById, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPushMessageById.id;
        }
        if ((i & 2) != 0) {
            str2 = getPushMessageById.topic;
        }
        if ((i & 4) != 0) {
            str3 = getPushMessageById.blob;
        }
        return getPushMessageById.copy(str, str2, str3);
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
    public final GetPushMessageById copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GetPushMessageById(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPushMessageById)) {
            return false;
        }
        GetPushMessageById getPushMessageById = (GetPushMessageById) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) getPushMessageById.id) && Intrinsics.EZpvd((Object) this.topic, (Object) getPushMessageById.topic) && Intrinsics.EZpvd((Object) this.blob, (Object) getPushMessageById.blob);
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
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.topic.hashCode()) * 31) + this.blob.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetPushMessageById(id=" + this.id + ", topic=" + this.topic + ", blob=" + this.blob + ")";
    }

    public GetPushMessageById(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.topic = str2;
        this.blob = str3;
    }
}
