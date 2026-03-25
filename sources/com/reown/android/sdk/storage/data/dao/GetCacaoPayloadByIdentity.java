package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class GetCacaoPayloadByIdentity {
    public final String cacao_payload;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetCacaoPayloadByIdentity copy$default(GetCacaoPayloadByIdentity getCacaoPayloadByIdentity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCacaoPayloadByIdentity.cacao_payload;
        }
        return getCacaoPayloadByIdentity.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cacao_payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetCacaoPayloadByIdentity copy(String str) {
        return new GetCacaoPayloadByIdentity(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCacaoPayloadByIdentity) && Intrinsics.EZpvd((Object) this.cacao_payload, (Object) ((GetCacaoPayloadByIdentity) obj).cacao_payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCacao_payload() {
        return this.cacao_payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cacao_payload;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetCacaoPayloadByIdentity(cacao_payload=" + this.cacao_payload + ")";
    }

    public GetCacaoPayloadByIdentity(String str) {
        this.cacao_payload = str;
    }
}
