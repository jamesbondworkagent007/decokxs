package com.okinc.business.defi.wallet.tee.activate.model;

import com.okinc.business.defi.wallet.tee.common.model.ActivateTEERequest;
import com.okinc.wallet.core.tee.HPKEKeypair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivateTeeMiddleModel {
    public static final int $stable = 8;
    private final ActivateTEERequest activateTEERequest;
    private final HPKEKeypair hPKEKeypair;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivateTeeMiddleModel copy$default(ActivateTeeMiddleModel activateTeeMiddleModel, HPKEKeypair hPKEKeypair, ActivateTEERequest activateTEERequest, int i, Object obj) {
        if ((i & 1) != 0) {
            hPKEKeypair = activateTeeMiddleModel.hPKEKeypair;
        }
        if ((i & 2) != 0) {
            activateTEERequest = activateTeeMiddleModel.activateTEERequest;
        }
        return activateTeeMiddleModel.copy(hPKEKeypair, activateTEERequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEKeypair component1() {
        return this.hPKEKeypair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTEERequest component2() {
        return this.activateTEERequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTeeMiddleModel copy(@NotNull HPKEKeypair hPKEKeypair, @NotNull ActivateTEERequest activateTEERequest) {
        Intrinsics.checkNotNullParameter(hPKEKeypair, "");
        Intrinsics.checkNotNullParameter(activateTEERequest, "");
        return new ActivateTeeMiddleModel(hPKEKeypair, activateTEERequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateTeeMiddleModel)) {
            return false;
        }
        ActivateTeeMiddleModel activateTeeMiddleModel = (ActivateTeeMiddleModel) obj;
        return Intrinsics.EZpvd(this.hPKEKeypair, activateTeeMiddleModel.hPKEKeypair) && Intrinsics.EZpvd(this.activateTEERequest, activateTeeMiddleModel.activateTEERequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTEERequest getActivateTEERequest() {
        return this.activateTEERequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEKeypair getHPKEKeypair() {
        return this.hPKEKeypair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.hPKEKeypair.hashCode() * 31) + this.activateTEERequest.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTeeMiddleModel(hPKEKeypair=" + this.hPKEKeypair + ", activateTEERequest=" + this.activateTEERequest + ")";
    }

    public ActivateTeeMiddleModel(@NotNull HPKEKeypair hPKEKeypair, @NotNull ActivateTEERequest activateTEERequest) {
        Intrinsics.checkNotNullParameter(hPKEKeypair, "");
        Intrinsics.checkNotNullParameter(activateTEERequest, "");
        this.hPKEKeypair = hPKEKeypair;
        this.activateTEERequest = activateTEERequest;
    }
}
