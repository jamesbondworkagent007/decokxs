package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48972ufk {
    public final android.graphics.Bitmap AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48972ufk copy$default(C48972ufk c48972ufk, android.graphics.Bitmap bitmap, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bitmap = c48972ufk.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c48972ufk.KWHzl;
        }
        return c48972ufk.OLrzqt(bitmap, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48972ufk OLrzqt(android.graphics.Bitmap bitmap, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C48972ufk(bitmap, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48972ufk)) {
            return false;
        }
        C48972ufk c48972ufk = (C48972ufk) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c48972ufk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48972ufk.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.Bitmap bitmap = this.AEQbTJ;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ScreenshotInfo(screenshotBitmap=" + this.AEQbTJ + ", sharFrom=" + this.KWHzl + ")";
    }

    public C48972ufk(android.graphics.Bitmap bitmap, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = bitmap;
        this.KWHzl = str;
    }
}
