package o;

import androidx.core.content.FileProvider;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37669oyG {
    public static final C37669oyG AEQbTJ = new C37669oyG();
    public static final java.util.Map<java.lang.String, java.lang.String> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("pdf", "application/pdf"), C56390yDp.OLrzqt("doc", "application/msword"), C56390yDp.OLrzqt("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"), C56390yDp.OLrzqt("xls", "application/vnd.ms-excel"), C56390yDp.OLrzqt("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"), C56390yDp.OLrzqt("csv", "text/csv"), C56390yDp.OLrzqt("epub", "application/epub+zip"), C56390yDp.OLrzqt("zip", "application/zip"));
    public static final int KWHzl = 8;

    private C37669oyG() {
    }

    public static /* synthetic */ boolean openFile$default(C37669oyG c37669oyG, android.content.Context context, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c37669oyG.AEQbTJ(context, uri, str);
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context, @NotNull android.net.Uri uri, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (str == null) {
            str = KWHzl(context, uri);
        }
        android.net.Uri uriAEQbTJ = AEQbTJ(context, uri);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriAEQbTJ, str);
        intent.addFlags(1);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            pUU.AEQbTJ("FileOpenHelper", "No app available to open the file", e);
            C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.isConnected, 0, 1, (java.lang.Object) null);
            return false;
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String lowerCase;
        java.util.Map<java.lang.String, java.lang.String> map = EZpvd;
        if (str != null) {
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        java.lang.String str2 = map.get(lowerCase);
        return str2 == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : str2;
    }

    public final java.lang.String KWHzl(android.content.Context context, android.net.Uri uri) {
        java.lang.String type = context.getContentResolver().getType(uri);
        return type == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : type;
    }

    public final android.net.Uri AEQbTJ(android.content.Context context, android.net.Uri uri) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "file")) {
            path = null;
        }
        if (path == null) {
            return uri;
        }
        java.io.File file = new java.io.File(path);
        java.io.File file2 = file.exists() ? file : null;
        if (file2 == null) {
            return uri;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file2));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("FileOpenHelper", "FileProvider conversion failed, using original URI", thM7380exceptionOrNullimpl);
        }
        java.lang.Object obj = uri;
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            obj = objM7377constructorimpl;
        }
        return (android.net.Uri) obj;
    }
}
