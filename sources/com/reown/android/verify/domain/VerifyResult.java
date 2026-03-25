package com.reown.android.verify.domain;

import com.reown.android.internal.common.model.Validation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyResult {
    public final Boolean isScam;
    public final String origin;
    public final Validation validation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyResult copy$default(VerifyResult verifyResult, Validation validation, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            validation = verifyResult.validation;
        }
        if ((i & 2) != 0) {
            bool = verifyResult.isScam;
        }
        if ((i & 4) != 0) {
            str = verifyResult.origin;
        }
        return verifyResult.copy(validation, bool, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Validation component1() {
        return this.validation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyResult copy(@NotNull Validation validation, Boolean bool, @NotNull String str) {
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new VerifyResult(validation, bool, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyResult)) {
            return false;
        }
        VerifyResult verifyResult = (VerifyResult) obj;
        return this.validation == verifyResult.validation && Intrinsics.EZpvd(this.isScam, verifyResult.isScam) && Intrinsics.EZpvd((Object) this.origin, (Object) verifyResult.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Validation getValidation() {
        return this.validation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.validation.hashCode();
        Boolean bool = this.isScam;
        return (((iHashCode * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isScam() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyResult(validation=" + this.validation + ", isScam=" + this.isScam + ", origin=" + this.origin + ")";
    }

    public VerifyResult(@NotNull Validation validation, Boolean bool, @NotNull String str) {
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.validation = validation;
        this.isScam = bool;
        this.origin = str;
    }
}
