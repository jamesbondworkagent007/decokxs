package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.io.OnErrorAction;
import kotlin.io.TerminateException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yFL extends yFJ {
    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return KWHzl(str, str2, file);
    }

    public static final java.io.File KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.io.File file) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        java.io.File fileCreateTempFile = java.io.File.createTempFile(str, str2, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            Intrinsics.copydefault(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new java.io.IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return OLrzqt(str, str2, file);
    }

    public static final java.io.File OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.io.File file) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        java.io.File fileCreateTempFile = java.io.File.createTempFile(str, str2, file);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "");
        return fileCreateTempFile;
    }

    public static java.lang.String fetchVPNInfo(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return StringsKt__StringsKt.AEQbTJ(name, '.', "");
    }

    public static java.lang.String DbNXlk(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return StringsKt__StringsKt.substringBeforeLast$default(name, JwtUtilsKt.JWT_DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String EZpvd(@NotNull java.io.File file, @NotNull java.io.File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        java.lang.String strAEQbTJ = AEQbTJ(file, file2);
        if (strAEQbTJ != null) {
            return strAEQbTJ;
        }
        throw new java.lang.IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final java.lang.String AEQbTJ(java.io.File file, java.io.File file2) {
        yFC yfcOLrzqt = OLrzqt(yFF.gEmmrt(file));
        yFC yfcOLrzqt2 = OLrzqt(yFF.gEmmrt(file2));
        if (!Intrinsics.EZpvd(yfcOLrzqt.AEQbTJ(), yfcOLrzqt2.AEQbTJ())) {
            return null;
        }
        int iOLrzqt = yfcOLrzqt2.OLrzqt();
        int iOLrzqt2 = yfcOLrzqt.OLrzqt();
        int iMin = java.lang.Math.min(iOLrzqt2, iOLrzqt);
        int i = 0;
        while (i < iMin && Intrinsics.EZpvd(yfcOLrzqt.KWHzl().get(i), yfcOLrzqt2.KWHzl().get(i))) {
            i++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = iOLrzqt - 1;
        if (i <= i2) {
            while (!Intrinsics.EZpvd((java.lang.Object) yfcOLrzqt2.KWHzl().get(i2).getName(), (java.lang.Object) "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(java.io.File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < iOLrzqt2) {
            if (i < iOLrzqt) {
                sb.append(java.io.File.separatorChar);
            }
            java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) yfcOLrzqt.KWHzl(), i);
            java.lang.String str = java.io.File.separator;
            Intrinsics.checkNotNullExpressionValue(str, "");
            CollectionsKt___CollectionsKt.joinTo$default(listDjBIcL, sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File file, java.io.File file2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return AEQbTJ(file, file2, z, i);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final java.io.File AEQbTJ(@NotNull java.io.File file, @NotNull java.io.File file2, boolean z, int i) throws FileSystemException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
        } else {
            java.io.File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    yFB.copydefault(fileInputStream, fileOutputStream, i);
                    yFA.copydefault(fileOutputStream, null);
                    yFA.copydefault(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        }
        return file2;
    }

    public static final class TaskDescription implements Function2 {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void invoke(java.io.File file, java.io.IOException iOException) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(file, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            throw iOException;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File file, java.io.File file2, boolean z, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = TaskDescription.KWHzl;
        }
        return OLrzqt(file, file2, z, function2);
    }

    public static final boolean OLrzqt(@NotNull java.io.File file, @NotNull java.io.File file2, boolean z, @NotNull final Function2<? super java.io.File, ? super java.io.IOException, ? extends OnErrorAction> function2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!file.exists()) {
            return function2.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            for (java.io.File file3 : yFJ.AYXKKw(file).OLrzqt(new Function2() { // from class: o.yFN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return yFL.copydefault(function2, (java.io.File) obj, (java.io.IOException) obj2);
                }
            })) {
                if (!file3.exists()) {
                    if (function2.invoke(file3, new NoSuchFileException(file3, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    java.io.File file4 = new java.io.File(file2, EZpvd(file3, file));
                    if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                        if (z) {
                            if (file4.isDirectory()) {
                                if (!AkhnZx(file4)) {
                                }
                            } else if (!file4.delete()) {
                            }
                        }
                        if (function2.invoke(file4, new FileAlreadyExistsException(file3, file4, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                    } else if (copyTo$default(file3, file4, z, 0, 4, null).length() != file3.length() && function2.invoke(file3, new java.io.IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static final Unit copydefault(Function2 function2, java.io.File file, java.io.IOException iOException) throws TerminateException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        if (function2.invoke(file, iOException) != OnErrorAction.TERMINATE) {
            return Unit.INSTANCE;
        }
        throw new TerminateException(file);
    }

    public static boolean AkhnZx(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        while (true) {
            boolean z = true;
            for (java.io.File file2 : yFJ.djBIcL(file)) {
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static final yFC OLrzqt(yFC yfc) {
        return new yFC(yfc.AEQbTJ(), AEQbTJ(yfc.KWHzl()));
    }

    public static final java.util.List<java.io.File> AEQbTJ(java.util.List<? extends java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file : list) {
            java.lang.String name = file.getName();
            if (!Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) JwtUtilsKt.JWT_DELIMITER)) {
                if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) "..")) {
                    if (arrayList.isEmpty() || Intrinsics.EZpvd((java.lang.Object) ((java.io.File) CollectionsKt___CollectionsKt.AubY(arrayList)).getName(), (java.lang.Object) "..")) {
                        arrayList.add(file);
                    } else {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }
}
