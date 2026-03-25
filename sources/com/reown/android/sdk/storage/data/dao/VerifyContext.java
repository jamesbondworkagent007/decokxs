package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.Validation;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyContext {
    public final long id;
    public final Boolean is_scam;
    public final String origin;
    public final Validation validation;
    public final String verify_url;

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
            str2 = verifyContext.verify_url;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = verifyContext.is_scam;
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
        return this.verify_url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.is_scam;
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
        return this.id == verifyContext.id && Intrinsics.EZpvd((Object) this.origin, (Object) verifyContext.origin) && this.validation == verifyContext.validation && Intrinsics.EZpvd((Object) this.verify_url, (Object) verifyContext.verify_url) && Intrinsics.EZpvd(this.is_scam, verifyContext.is_scam);
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
    public final String getVerify_url() {
        return this.verify_url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.origin.hashCode();
        int iHashCode3 = this.validation.hashCode();
        int iHashCode4 = this.verify_url.hashCode();
        Boolean bool = this.is_scam;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean is_scam() {
        return this.is_scam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyContext(id=" + this.id + ", origin=" + this.origin + ", validation=" + this.validation + ", verify_url=" + this.verify_url + ", is_scam=" + this.is_scam + ")";
    }

    public VerifyContext(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validation, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.origin = str;
        this.validation = validation;
        this.verify_url = str2;
        this.is_scam = bool;
    }

    public static final class Adapter {
        public final LoaderManager<Validation, String> validationAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<Validation, String> getValidationAdapter() {
            return this.validationAdapter;
        }

        public Adapter(@NotNull LoaderManager<Validation, String> loaderManager) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            this.validationAdapter = loaderManager;
        }
    }
}
