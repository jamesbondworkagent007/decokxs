package com.reown.android.verify.model;

import com.reown.android.internal.common.model.Validation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyContext {
    public final long id;
    public final Boolean isScam;
    public final String origin;
    public final Validation validation;
    public final String verifyUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyContext copy$default(VerifyContext verifyContext, long j, String str, Validation validation, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            j = verifyContext.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = verifyContext.origin;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            validation = verifyContext.validation;
        }
        Validation validation2 = validation;
        if ((i & 8) != 0) {
            str2 = verifyContext.verifyUrl;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = verifyContext.isScam;
        }
        return verifyContext.copy(j2, str3, validation2, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Validation component3() {
        return this.validation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.verifyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyContext copy(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new VerifyContext(j, str, validation, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyContext)) {
            return false;
        }
        VerifyContext verifyContext = (VerifyContext) obj;
        return this.id == verifyContext.id && Intrinsics.EZpvd((Object) this.origin, (Object) verifyContext.origin) && this.validation == verifyContext.validation && Intrinsics.EZpvd((Object) this.verifyUrl, (Object) verifyContext.verifyUrl) && Intrinsics.EZpvd(this.isScam, verifyContext.isScam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
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
    public final String getVerifyUrl() {
        return this.verifyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.origin.hashCode();
        int iHashCode3 = this.validation.hashCode();
        int iHashCode4 = this.verifyUrl.hashCode();
        Boolean bool = this.isScam;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isScam() {
        return this.isScam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyContext(id=" + this.id + ", origin=" + this.origin + ", validation=" + this.validation + ", verifyUrl=" + this.verifyUrl + ", isScam=" + this.isScam + ")";
    }

    public VerifyContext(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.origin = str;
        this.validation = validation;
        this.verifyUrl = str2;
        this.isScam = bool;
    }
}
