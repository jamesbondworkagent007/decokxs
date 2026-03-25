package o;

import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.ok_kyc_core.common.ImageTypeDetector;
import com.okinc.ok_kyc_core.common.Utils$compressSingleFileUntilSize$1;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43699ruH {
    public static final C43699ruH KWHzl = new C43699ruH();

    private C43699ruH() {
    }

    public final java.io.File EZpvd(@NotNull android.net.Uri uri, java.io.File file, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.io.InputStream inputStreamOpenInputStream = null;
        if (file == null) {
            pUU.copydefault("kyc_upload", "context.externalCacheDir is null, sdCard state=" + android.os.Environment.getExternalStorageState());
            C32866mlf.onEvent$default("file_cachedir", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(file, str);
        try {
            inputStreamOpenInputStream = C43246rlf.OLrzqt.valueOf().getContentResolver().openInputStream(uri);
            if (!C33486mxP.AEQbTJ(inputStreamOpenInputStream, file2)) {
                throw new java.io.IOException("copy file failed");
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            C33486mxP.AEQbTJ(inputStreamOpenInputStream);
            throw th;
        }
        C33486mxP.AEQbTJ(inputStreamOpenInputStream);
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[Catch: Exception -> 0x010c, TryCatch #1 {Exception -> 0x010c, blocks: (B:26:0x0082, B:29:0x009a, B:21:0x005f, B:23:0x006b, B:30:0x00a1, B:17:0x0050, B:19:0x0056), top: B:37:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: Exception -> 0x010c, TRY_LEAVE, TryCatch #1 {Exception -> 0x010c, blocks: (B:26:0x0082, B:29:0x009a, B:21:0x005f, B:23:0x006b, B:30:0x00a1, B:17:0x0050, B:19:0x0056), top: B:37:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007f -> B:26:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.io.File file, int i, @NotNull Continuation<? super java.io.File> continuation) throws java.lang.Throwable {
        Utils$compressSingleFileUntilSize$1 utils$compressSingleFileUntilSize$1;
        C43699ruH c43699ruH;
        Utils$compressSingleFileUntilSize$1 utils$compressSingleFileUntilSize$12;
        int i2;
        int i3;
        java.io.File file2;
        if (continuation instanceof Utils$compressSingleFileUntilSize$1) {
            utils$compressSingleFileUntilSize$1 = (Utils$compressSingleFileUntilSize$1) continuation;
            int i4 = utils$compressSingleFileUntilSize$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                utils$compressSingleFileUntilSize$1.label = i4 - Integer.MIN_VALUE;
            } else {
                utils$compressSingleFileUntilSize$1 = new Utils$compressSingleFileUntilSize$1(this, continuation);
            }
        }
        java.lang.Object obj = utils$compressSingleFileUntilSize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = utils$compressSingleFileUntilSize$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
                c43699ruH = this;
                utils$compressSingleFileUntilSize$12 = utils$compressSingleFileUntilSize$1;
                i2 = 0;
                i3 = i;
                file2 = file;
                if (file.length() >= 1048576 * i3) {
                }
            } catch (java.lang.Exception unused) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = utils$compressSingleFileUntilSize$1.I$1;
            int i7 = utils$compressSingleFileUntilSize$1.I$0;
            java.io.File file3 = (java.io.File) utils$compressSingleFileUntilSize$1.L$3;
            java.io.File file4 = (java.io.File) utils$compressSingleFileUntilSize$1.L$2;
            android.content.Context context2 = (android.content.Context) utils$compressSingleFileUntilSize$1.L$1;
            c43699ruH = (C43699ruH) utils$compressSingleFileUntilSize$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                i3 = i7;
                file = file3;
                file2 = file4;
                utils$compressSingleFileUntilSize$12 = utils$compressSingleFileUntilSize$1;
                i2 = i6;
                context = context2;
                android.graphics.Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                C33610mzh c33610mzh = C33610mzh.OLrzqt;
                Intrinsics.copydefault(bitmapDecodeFile);
                java.lang.String strEZpvd = c33610mzh.EZpvd(context, bitmapDecodeFile, 100 - (i2 * 10));
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                file = new java.io.File(strEZpvd);
                if (file.length() >= 1048576 * i3) {
                    i2++;
                    utils$compressSingleFileUntilSize$12.L$0 = c43699ruH;
                    utils$compressSingleFileUntilSize$12.L$1 = context;
                    utils$compressSingleFileUntilSize$12.L$2 = file2;
                    utils$compressSingleFileUntilSize$12.L$3 = file;
                    utils$compressSingleFileUntilSize$12.I$0 = i3;
                    utils$compressSingleFileUntilSize$12.I$1 = i2;
                    utils$compressSingleFileUntilSize$12.label = 1;
                    if (YieldKt.yield(utils$compressSingleFileUntilSize$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    android.graphics.Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file.getPath());
                    C33610mzh c33610mzh2 = C33610mzh.OLrzqt;
                    Intrinsics.copydefault(bitmapDecodeFile2);
                    java.lang.String strEZpvd2 = c33610mzh2.EZpvd(context, bitmapDecodeFile2, 100 - (i2 * 10));
                    if (strEZpvd2 == null) {
                    }
                    file = new java.io.File(strEZpvd2);
                    if (file.length() >= 1048576 * i3) {
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        ImageTypeDetector imageTypeDetector = new ImageTypeDetector();
                        android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
                        java.lang.String str = jCurrentTimeMillis + JwtUtilsKt.JWT_DELIMITER + imageTypeDetector.KWHzl(uriFromFile).getTypeName();
                        android.net.Uri uriFromFile2 = android.net.Uri.fromFile(file);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile2, "");
                        file = c43699ruH.EZpvd(uriFromFile2, C33478mxH.KWHzl.EZpvd(context), str);
                        C43296rmc.AEQbTJ("FileUpload", "compressed " + i2 + " times. original size: " + file2.length() + ". new size: " + file.length());
                        return file;
                    }
                }
            } catch (java.lang.Exception unused2) {
                return file3;
            }
        }
    }

    public final Date OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
            pUU.KWHzl("InputDateItemView", "Locale=" + java.util.Locale.getDefault());
            return simpleDateFormat.parse(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String OLrzqt(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        if (Build.VERSION.SDK_INT < 26) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ENGLISH);
            pUU.KWHzl("InputDateItemView", "toISO8601String2=" + simpleDateFormat.format(date));
            java.lang.String str = simpleDateFormat.format(date);
            Intrinsics.copydefault((java.lang.Object) str);
            return str;
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(yCK.KWHzl(date), ZoneId.systemDefault());
        C56350yCc c56350yCcAEQbTJ = C56350yCc.AEQbTJ("yyyy-MM-dd");
        pUU.KWHzl("InputDateItemView", "toISO8601String1=" + localDateTimeOfInstant.format(c56350yCcAEQbTJ));
        java.lang.String str2 = localDateTimeOfInstant.format(c56350yCcAEQbTJ);
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    public final java.lang.String OLrzqt(@NotNull Date date, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (Build.VERSION.SDK_INT < 26) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, java.util.Locale.ENGLISH);
                pUU.KWHzl("InputDateItemView", "toFormatString2=" + simpleDateFormat.format(date));
                java.lang.String str2 = simpleDateFormat.format(date);
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            }
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(yCK.KWHzl(date), ZoneId.systemDefault());
            C56350yCc c56350yCcAEQbTJ = C56350yCc.AEQbTJ(str);
            pUU.KWHzl("InputDateItemView", "toFormatString1=" + localDateTimeOfInstant.format(c56350yCcAEQbTJ));
            java.lang.String str3 = localDateTimeOfInstant.format(c56350yCcAEQbTJ);
            Intrinsics.copydefault((java.lang.Object) str3);
            return str3;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final long AEQbTJ(long j) {
        return j + ((long) TimeZone.getDefault().getOffset(j));
    }

    public final long OLrzqt(long j) {
        return j - ((long) TimeZone.getDefault().getOffset(j));
    }

    public final long EZpvd() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final boolean OLrzqt(android.view.View view) {
        android.app.Activity activityCopydefault = copydefault(view);
        if (activityCopydefault == null) {
            return false;
        }
        int height = activityCopydefault.getWindow().getDecorView().getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        activityCopydefault.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return (height * 2) / 3 > rect.bottom;
    }

    public final boolean KWHzl(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        int height = activity.getWindow().getDecorView().getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return (height * 2) / 3 > rect.bottom;
    }

    public final void copydefault() {
        java.lang.Object systemService = C43246rlf.OLrzqt.valueOf().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).toggleSoftInput(0, 2);
    }

    public final android.app.Activity copydefault(android.view.View view) {
        if (view == null) {
            return null;
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public final void OLrzqt(androidx.fragment.app.Fragment fragment, @NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = fragment.requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback);
    }
}
