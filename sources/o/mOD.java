package o;

import com.okinc.debugbox.util.StorageUsageUtilKt$getAppStorageUsageInfo$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mOD {
    public static /* synthetic */ long walkFolderInfo$default(java.io.File file, java.io.Writer writer, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            writer = null;
        }
        return EZpvd(file, writer);
    }

    public static final long EZpvd(@NotNull java.io.File file, java.io.Writer writer) throws java.io.IOException {
        long jEZpvd;
        Intrinsics.checkNotNullParameter(file, "");
        long j = 1000000;
        long length = 0;
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int length2 = fileArrListFiles.length;
                int i = 0;
                while (i < length2) {
                    java.io.File file2 = fileArrListFiles[i];
                    if (file2.isFile()) {
                        jEZpvd = file2.length();
                        if (jEZpvd >= j && writer != null) {
                            writer.append((java.lang.CharSequence) ("  - File: " + file2.getAbsolutePath() + ", (size: " + jEZpvd + " bytes)")).append('\n');
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Intrinsics.copydefault(file2);
                        jEZpvd = EZpvd(file2, writer);
                    }
                    length += jEZpvd;
                    i++;
                    j = 1000000;
                }
            }
            if (length >= j && writer != null) {
                writer.append((java.lang.CharSequence) ("  - Folder: " + file.getAbsolutePath() + ", (size: " + length + " bytes)")).append('\n');
            }
        } else if (file.isFile()) {
            length = file.length();
            if (length >= 1000000 && writer != null) {
                writer.append((java.lang.CharSequence) ("  - File: " + file.getAbsolutePath() + ", size: " + length + " bytes")).append('\n');
            }
            Unit unit2 = Unit.INSTANCE;
        }
        return length;
    }

    public static final long OLrzqt() {
        return new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath()).getTotalBytes();
    }

    public static final long EZpvd() {
        return new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath()).getAvailableBytes();
    }

    public static final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.io.File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new StorageUsageUtilKt$getAppStorageUsageInfo$2(context, null), continuation);
    }
}
