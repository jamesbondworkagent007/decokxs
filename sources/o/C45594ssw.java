package o;

import com.okinc.okex.feedback.FeedbackType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ssw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45594ssw {
    public final java.lang.String AEQbTJ;
    public final FeedbackType EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45594ssw copy$default(C45594ssw c45594ssw, FeedbackType feedbackType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            feedbackType = c45594ssw.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c45594ssw.AEQbTJ;
        }
        return c45594ssw.copydefault(feedbackType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackType AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45594ssw copydefault(@NotNull FeedbackType feedbackType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(feedbackType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C45594ssw(feedbackType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45594ssw)) {
            return false;
        }
        C45594ssw c45594ssw = (C45594ssw) obj;
        return this.EZpvd == c45594ssw.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c45594ssw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeedbackData(type=" + this.EZpvd + ", title=" + this.AEQbTJ + ")";
    }

    public C45594ssw(@NotNull FeedbackType feedbackType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(feedbackType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = feedbackType;
        this.AEQbTJ = str;
    }
}
