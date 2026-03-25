package o;

import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C56496yHn extends yGL {
    public static final java.lang.String fY_(@NotNull java.nio.file.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        java.nio.file.Path fileName = path.getFileName();
        java.lang.String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    public static final java.nio.file.Path ga_(@NotNull java.nio.file.Path path, @NotNull java.nio.file.Path path2) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        try {
            return C56465yGj.OLrzqt.ev_(path, path2);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    public static /* synthetic */ java.nio.file.Path copyTo$default(java.nio.file.Path path, java.nio.file.Path path2, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        java.nio.file.Path pathCopy = Files.copy(path, path2, (CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "");
        return pathCopy;
    }

    public static /* synthetic */ java.util.List listDirectoryEntries$default(java.nio.file.Path path, java.lang.String str, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return fZ_(path, str);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final java.util.List<java.nio.file.Path> fZ_(@NotNull java.nio.file.Path path, @NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(str, "");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream directoryStreamFC_ = yGP.fC_(directoryStreamNewDirectoryStream);
            Intrinsics.copydefault(directoryStreamFC_);
            java.util.List<java.nio.file.Path> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(directoryStreamFC_);
            yFA.copydefault(directoryStreamNewDirectoryStream, null);
            return listAxsJAYsNCnLh;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static /* synthetic */ java.lang.Object useDirectoryEntries$default(java.nio.file.Path path, java.lang.String str, Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream directoryStreamFC_ = yGP.fC_(directoryStreamNewDirectoryStream);
            Intrinsics.copydefault(directoryStreamFC_);
            java.lang.Object objInvoke = function1.invoke(CollectionsKt___CollectionsKt.QVAiDq(directoryStreamFC_));
            C56518yIi.KWHzl(1);
            if (C56452yFx.OLrzqt(1, 1, 0)) {
                yFA.copydefault(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            C56518yIi.copydefault(1);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                C56518yIi.KWHzl(1);
                if (C56452yFx.OLrzqt(1, 1, 0)) {
                    yFA.copydefault(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                C56518yIi.copydefault(1);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static /* synthetic */ void forEachDirectoryEntry$default(java.nio.file.Path path, java.lang.String str, Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream directoryStreamFC_ = yGP.fC_(directoryStreamNewDirectoryStream);
            Intrinsics.copydefault(directoryStreamFC_);
            java.util.Iterator it = directoryStreamFC_.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            C56518yIi.KWHzl(1);
            if (C56452yFx.OLrzqt(1, 1, 0)) {
                yFA.copydefault(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            C56518yIi.copydefault(1);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                C56518yIi.KWHzl(1);
                if (C56452yFx.OLrzqt(1, 1, 0)) {
                    yFA.copydefault(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                C56518yIi.copydefault(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ java.nio.file.Path moveTo$default(java.nio.file.Path path, java.nio.file.Path path2, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        java.nio.file.Path pathMove = Files.move(path, path2, (CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "");
        return pathMove;
    }

    public static /* synthetic */ java.nio.file.Path createTempFile$default(java.lang.String str, java.lang.String str2, FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(fileAttributeArr, "");
        java.nio.file.Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "");
        return pathCreateTempFile;
    }

    public static /* synthetic */ java.nio.file.Path createTempFile$default(java.nio.file.Path path, java.lang.String str, java.lang.String str2, FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return fW_(path, str, str2, fileAttributeArr);
    }

    public static final java.nio.file.Path fW_(java.nio.file.Path path, java.lang.String str, java.lang.String str2, @NotNull FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "");
        if (path != null) {
            java.nio.file.Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "");
            return pathCreateTempFile;
        }
        java.nio.file.Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "");
        return pathCreateTempFile2;
    }

    public static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.lang.String str, FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(fileAttributeArr, "");
        java.nio.file.Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "");
        return pathCreateTempDirectory;
    }

    public static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.nio.file.Path path, java.lang.String str, FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return fV_(path, str, fileAttributeArr);
    }

    public static final java.nio.file.Path fV_(java.nio.file.Path path, java.lang.String str, @NotNull FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "");
        if (path != null) {
            java.nio.file.Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "");
            return pathCreateTempDirectory;
        }
        java.nio.file.Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "");
        return pathCreateTempDirectory2;
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path path, FileVisitor fileVisitor, int i, boolean z, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        gc_(path, fileVisitor, i, z);
    }

    public static final void gc_(@NotNull java.nio.file.Path path, @NotNull FileVisitor<java.nio.file.Path> fileVisitor, int i, boolean z) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(fileVisitor, "");
        Files.walkFileTree(path, z ? yED.AEQbTJ(FileVisitOption.FOLLOW_LINKS) : yEE.copydefault(), i, fileVisitor);
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path path, int i, boolean z, Function1 function1, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        gb_(path, i, z, function1);
    }

    public static final void gb_(@NotNull java.nio.file.Path path, int i, boolean z, @NotNull Function1<? super FileVisitorBuilder, Unit> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(function1, "");
        gc_(path, fX_(function1), i, z);
    }

    public static final FileVisitor<java.nio.file.Path> fX_(@NotNull Function1<? super FileVisitorBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C56463yGh c56463yGh = new C56463yGh();
        function1.invoke(c56463yGh);
        return c56463yGh.em_();
    }
}
