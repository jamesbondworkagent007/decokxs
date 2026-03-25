package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class FaceVerifyReq {
    public static final int $stable = 0;
    private final int currencyId;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceVerifyReq copy$default(FaceVerifyReq faceVerifyReq, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = faceVerifyReq.sessionId;
        }
        if ((i2 & 2) != 0) {
            i = faceVerifyReq.currencyId;
        }
        return faceVerifyReq.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerifyReq copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FaceVerifyReq(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceVerifyReq)) {
            return false;
        }
        FaceVerifyReq faceVerifyReq = (FaceVerifyReq) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) faceVerifyReq.sessionId) && this.currencyId == faceVerifyReq.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Integer.hashCode(this.currencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceVerifyReq(sessionId=" + this.sessionId + ", currencyId=" + this.currencyId + ")";
    }

    public FaceVerifyReq(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
        this.currencyId = i;
    }
}
