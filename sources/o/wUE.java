package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUE {
    public static final wUE OLrzqt = new wUE();

    private wUE() {
    }

    public final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(pair, "");
        C33054mpH.loadAvatar$default(imageView, Application.OLrzqt(pair), null, null, 6, null);
    }

    public static final class Application {
        public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return pair;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int KWHzl(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return pair.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String copydefault(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return "AvatarInfo(pair=" + pair + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean copydefault(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, java.lang.Object obj) {
            return (obj instanceof Application) && Intrinsics.EZpvd(pair, ((Application) obj).copydefault());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ kotlin.Pair copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return copydefault(this.EZpvd, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return KWHzl(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return copydefault(this.EZpvd);
        }

        public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return EZpvd(C56390yDp.OLrzqt(str, str2));
        }

        /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
        public static /* synthetic */ kotlin.Pair m8784constructorimpl$default(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return AEQbTJ(str, str2);
        }

        public static final java.lang.String OLrzqt(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return pair.getFirst();
        }
    }
}
