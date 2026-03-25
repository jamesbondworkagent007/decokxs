package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32605mgj implements BgF {
    public final android.content.Context KWHzl;

    public C32605mgj(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    @Override // o.BgF
    public java.lang.String EZpvd() {
        java.io.File externalCacheDir = this.KWHzl.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.KWHzl.getCacheDir();
        }
        java.lang.String absolutePath = externalCacheDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    @Override // o.BgF
    public java.lang.String OLrzqt() {
        java.io.File externalFilesDir = this.KWHzl.getExternalFilesDir(android.os.Environment.DIRECTORY_DOCUMENTS);
        if (externalFilesDir == null) {
            externalFilesDir = this.KWHzl.getFilesDir();
        }
        java.lang.String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    @Override // o.BgF
    public java.lang.String AEQbTJ() {
        java.io.File externalFilesDir = this.KWHzl.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = this.KWHzl.getFilesDir();
        }
        java.lang.String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    @Override // o.BgF
    public java.lang.String KWHzl() {
        java.io.File externalCacheDir = this.KWHzl.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.KWHzl.getCacheDir();
        }
        java.lang.String absolutePath = externalCacheDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    @Override // o.BgF
    public java.lang.String copydefault() {
        java.io.File externalFilesDir = this.KWHzl.getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null) {
            externalFilesDir = this.KWHzl.getFilesDir();
        }
        java.lang.String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }
}
