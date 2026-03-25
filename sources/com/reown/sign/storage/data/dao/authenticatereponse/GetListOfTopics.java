package com.reown.sign.storage.data.dao.authenticatereponse;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetListOfTopics {
    public final String pairingTopic;
    public final String responseTopic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetListOfTopics copy$default(GetListOfTopics getListOfTopics, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getListOfTopics.pairingTopic;
        }
        if ((i & 2) != 0) {
            str2 = getListOfTopics.responseTopic;
        }
        return getListOfTopics.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.responseTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetListOfTopics copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GetListOfTopics(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetListOfTopics)) {
            return false;
        }
        GetListOfTopics getListOfTopics = (GetListOfTopics) obj;
        return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) getListOfTopics.pairingTopic) && Intrinsics.EZpvd((Object) this.responseTopic, (Object) getListOfTopics.responseTopic);
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
        return (this.pairingTopic.hashCode() * 31) + this.responseTopic.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetListOfTopics(pairingTopic=" + this.pairingTopic + ", responseTopic=" + this.responseTopic + ")";
    }

    public GetListOfTopics(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pairingTopic = str;
        this.responseTopic = str2;
    }
}
