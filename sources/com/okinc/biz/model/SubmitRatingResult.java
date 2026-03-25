package com.okinc.biz.model;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface SubmitRatingResult {
    public static final TaskDescription Companion = TaskDescription.OLrzqt;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Success implements SubmitRatingResult, Serializable {
        public static final int $stable = 0;
        private final String ratingId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.ratingId;
            }
            return success.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.ratingId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Success(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.EZpvd((Object) this.ratingId, (Object) ((Success) obj).ratingId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRatingId() {
            return this.ratingId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.ratingId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(ratingId=" + this.ratingId + ")";
        }

        public Success(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ratingId = str;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ApiError implements SubmitRatingResult, Serializable {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiError.errorMessage;
            }
            return apiError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApiError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ApiError(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiError) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) ((ApiError) obj).errorMessage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApiError(errorMessage=" + this.errorMessage + ")";
        }

        public ApiError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ApiErrorUnknown implements SubmitRatingResult, Serializable {
        public static final int $stable = 0;
        public static final ApiErrorUnknown INSTANCE = new ApiErrorUnknown();

        private ApiErrorUnknown() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Failure implements SubmitRatingResult, Serializable {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable component1() {
            return this.throwable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure copy(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Failure(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.EZpvd(this.throwable, ((Failure) obj).throwable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.throwable.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        public Failure(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }
    }

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }

        public final Bundle copydefault(@NotNull SubmitRatingResult submitRatingResult) {
            Intrinsics.checkNotNullParameter(submitRatingResult, "");
            return BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SUBMIT_RATING_RESULT", submitRatingResult));
        }
    }
}
