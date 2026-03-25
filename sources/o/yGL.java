package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.io.path.IllegalFileNameException;
import kotlin.io.path.OnErrorResult;
import kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2;
import kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public class yGL extends yGB {

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    public static final class StateListAnimator implements yHO {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        public final java.lang.Void fS_(java.nio.file.Path path, java.nio.file.Path path2, java.lang.Exception exc) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(path, "");
            Intrinsics.checkNotNullParameter(path2, "");
            Intrinsics.checkNotNullParameter(exc, "");
            throw exc;
        }

        @Override // o.yHO
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return fS_(WB.cA_(obj), WB.cA_(obj2), (java.lang.Exception) obj3);
        }
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path path, java.nio.file.Path path2, yHO yho, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            yho = StateListAnimator.EZpvd;
        }
        return fe_(path, path2, yho, z, z2);
    }

    public static final java.nio.file.Path fe_(@NotNull java.nio.file.Path path, @NotNull java.nio.file.Path path2, @NotNull yHO<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends OnErrorResult> yho, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if (z2) {
            return fd_(path, path2, yho, z, new yHO() { // from class: o.yHh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return yGL.fi_(z, (CopyActionContext) obj, (java.nio.file.Path) obj2, (java.nio.file.Path) obj3);
                }
            });
        }
        return copyToRecursively$default(path, path2, yho, z, (yHO) null, 8, (java.lang.Object) null);
    }

    public static final CopyActionResult fi_(boolean z, CopyActionContext copyActionContext, java.nio.file.Path path, java.nio.file.Path path2) throws FileSystemException {
        Intrinsics.checkNotNullParameter(copyActionContext, "");
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        LinkOption[] linkOptionArrEs_ = C56464yGi.copydefault.es_(z);
        boolean zIsDirectory = Files.isDirectory(path2, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) java.util.Arrays.copyOf(linkOptionArrEs_, linkOptionArrEs_.length);
        if (!Files.isDirectory(path, (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
            if (zIsDirectory) {
                fn_(path2);
            }
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.EZpvd(linkOptionArrEs_);
            c56533yIx.copydefault(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) c56533yIx.copydefault((java.lang.Object[]) new CopyOption[c56533yIx.KWHzl()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "");
        }
        return CopyActionResult.CONTINUE;
    }

    public static final class Activity implements yHO {
        public static final Activity OLrzqt = new Activity();

        public final java.lang.Void fT_(java.nio.file.Path path, java.nio.file.Path path2, java.lang.Exception exc) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(path, "");
            Intrinsics.checkNotNullParameter(path2, "");
            Intrinsics.checkNotNullParameter(exc, "");
            throw exc;
        }

        @Override // o.yHO
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return fT_(WB.cA_(obj), WB.cA_(obj2), (java.lang.Exception) obj3);
        }
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path path, java.nio.file.Path path2, yHO yho, final boolean z, yHO yho2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            yho = Activity.OLrzqt;
        }
        if ((i & 8) != 0) {
            yho2 = new yHO() { // from class: o.yHj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return yGL.fj_(z, (CopyActionContext) obj2, (java.nio.file.Path) obj3, (java.nio.file.Path) obj4);
                }
            };
        }
        return fd_(path, path2, yho, z, yho2);
    }

    public static final CopyActionResult fj_(boolean z, CopyActionContext copyActionContext, java.nio.file.Path path, java.nio.file.Path path2) {
        Intrinsics.checkNotNullParameter(copyActionContext, "");
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        return copyActionContext.dT_(path, path2, z);
    }

    public static final java.nio.file.Path fd_(@NotNull final java.nio.file.Path path, @NotNull final java.nio.file.Path path2, @NotNull final yHO<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends OnErrorResult> yho, boolean z, @NotNull final yHO<? super CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends CopyActionResult> yho2) throws java.io.IOException {
        java.nio.file.Path parent;
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        LinkOption[] linkOptionArrEs_ = C56464yGi.copydefault.es_(z);
        LinkOption[] linkOptionArr = (LinkOption[]) java.util.Arrays.copyOf(linkOptionArrEs_, linkOptionArrEs_.length);
        if (!Files.exists(path, (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            yGX.AEQbTJ();
            throw yGZ.fK_(path.toString(), path2.toString(), "The source file doesn't exist.");
        }
        if (Files.exists(path, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[0], 0)) && (z || !Files.isSymbolicLink(path))) {
            boolean z2 = Files.exists(path2, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
            if ((!z2 || !Files.isSameFile(path, path2)) && Intrinsics.EZpvd(path.getFileSystem(), path2.getFileSystem()) && (!z2 ? !((parent = path2.getParent()) == null || !Files.exists(parent, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[0], 0)) || !parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) : path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0])))) {
                C56461yGf.EZpvd();
                throw C56483yHa.fL_(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
            }
        }
        final java.nio.file.Path pathNormalize = path2.normalize();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        C56496yHn.visitFileTree$default(path, 0, z, new Function1() { // from class: o.yHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return yGL.fk_(arrayList, yho2, path, path2, pathNormalize, yho, (FileVisitorBuilder) obj);
            }
        }, 1, (java.lang.Object) null);
        return path2;
    }

    public static final java.nio.file.Path fg_(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path path4) throws IllegalFileNameException {
        java.nio.file.Path pathResolve = path2.resolve(C56496yHn.ga_(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        Intrinsics.copydefault(pathResolve);
        return pathResolve;
    }

    public static final FileVisitResult fh_(yHO<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends OnErrorResult> yho, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path path4, java.lang.Exception exc) {
        return fv_(yho.invoke(path4, fg_(path, path2, path3, path4), exc));
    }

    public static final FileVisitResult ff_(java.util.ArrayList<java.nio.file.Path> arrayList, yHO<? super CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends CopyActionResult> yho, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, yHO<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends OnErrorResult> yho2, java.nio.file.Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                fb_(path4);
                java.lang.Object objAubY = CollectionsKt___CollectionsKt.AubY(arrayList);
                Intrinsics.checkNotNullExpressionValue(objAubY, "");
                fc_(path4, WB.cA_(objAubY));
            }
            return fu_(yho.invoke(yFQ.copydefault, path4, fg_(path, path2, path3, path4)));
        } catch (java.lang.Exception e) {
            return fh_(yho2, path, path2, path3, path4, e);
        }
    }

    public static final Unit fk_(final java.util.ArrayList arrayList, final yHO yho, final java.nio.file.Path path, final java.nio.file.Path path2, final java.nio.file.Path path3, final yHO yho2, FileVisitorBuilder fileVisitorBuilder) {
        Intrinsics.checkNotNullParameter(fileVisitorBuilder, "");
        fileVisitorBuilder.copydefault(new Function2() { // from class: o.yHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return yGL.fl_(arrayList, yho, path, path2, path3, yho2, (java.nio.file.Path) obj, (BasicFileAttributes) obj2);
            }
        });
        fileVisitorBuilder.AEQbTJ(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(arrayList, yho, path, path2, path3, yho2));
        fileVisitorBuilder.EZpvd(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(yho2, path, path2, path3));
        fileVisitorBuilder.KWHzl(new Function2() { // from class: o.yHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return yGL.fm_(arrayList, yho2, path, path2, path3, (java.nio.file.Path) obj, (java.io.IOException) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final FileVisitResult fl_(java.util.ArrayList arrayList, yHO yho, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, yHO yho2, java.nio.file.Path path4, BasicFileAttributes basicFileAttributes) {
        Intrinsics.checkNotNullParameter(path4, "");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        FileVisitResult fileVisitResultFf_ = ff_(arrayList, yho, path, path2, path3, yho2, path4, basicFileAttributes);
        if (fileVisitResultFf_ == FileVisitResult.CONTINUE) {
            arrayList.add(path4);
        }
        return fileVisitResultFf_;
    }

    public static final FileVisitResult fm_(java.util.ArrayList arrayList, yHO yho, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path path4, java.io.IOException iOException) {
        Intrinsics.checkNotNullParameter(path4, "");
        C56406yEe.iwGUEr(arrayList);
        if (iOException == null) {
            return FileVisitResult.CONTINUE;
        }
        return fh_(yho, path, path2, path3, path4, iOException);
    }

    public static final FileVisitResult fu_(CopyActionResult copyActionResult) {
        int i = Application.KWHzl[copyActionResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    public static final FileVisitResult fv_(OnErrorResult onErrorResult) {
        int i = Application.AEQbTJ[onErrorResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    public static final void fn_(@NotNull java.nio.file.Path path) throws FileSystemException {
        Intrinsics.checkNotNullParameter(path, "");
        java.util.List<java.lang.Exception> listFo_ = fo_(path);
        if (!listFo_.isEmpty()) {
            FileSystemException fileSystemExceptionEl_ = C56462yGg.el_("Failed to delete one or more files. See suppressed exceptions for details.");
            java.util.Iterator<T> it = listFo_.iterator();
            while (it.hasNext()) {
                C56379yDe.EZpvd(fileSystemExceptionEl_, (java.lang.Exception) it.next());
            }
            throw fileSystemExceptionEl_;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<java.lang.Exception> fo_(java.nio.file.Path path) {
        DirectoryStream directoryStreamNewDirectoryStream;
        boolean z = false;
        C56457yGb c56457yGb = new C56457yGb(0, 1, null);
        java.nio.file.Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (java.lang.Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    DirectoryStream directoryStreamFC_ = yGP.fC_(directoryStreamNewDirectoryStream);
                    if (yGO.OLrzqt(directoryStreamFC_)) {
                        c56457yGb.ef_(parent);
                        SecureDirectoryStream secureDirectoryStreamFD_ = yGR.fD_(directoryStreamFC_);
                        java.nio.file.Path fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "");
                        fq_(secureDirectoryStreamFD_, fileName, null, c56457yGb);
                    } else {
                        z = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(directoryStreamNewDirectoryStream, null);
                    if (z) {
                        fs_(path, null, c56457yGb);
                    }
                } finally {
                }
            }
        }
        return c56457yGb.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[Catch: Exception -> 0x003b, NoSuchFileException -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x0022, B:9:0x002f, B:10:0x0035), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x0022, B:9:0x002f, B:10:0x0035), top: B:17:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void fq_(SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, java.nio.file.Path path2, C56457yGb c56457yGb) {
        c56457yGb.ec_(path);
        if (path2 != null) {
            try {
                java.nio.file.Path pathEe_ = c56457yGb.ee_();
                Intrinsics.copydefault(pathEe_);
                fb_(pathEe_);
                fc_(pathEe_, path2);
                try {
                    if (!ft_(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                        int iOLrzqt = c56457yGb.OLrzqt();
                        fp_(secureDirectoryStream, path, c56457yGb);
                        if (iOLrzqt == c56457yGb.OLrzqt()) {
                            secureDirectoryStream.deleteDirectory(path);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        secureDirectoryStream.deleteFile(path);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (NoSuchFileException unused) {
                }
            } catch (java.lang.Exception e) {
                c56457yGb.KWHzl(e);
            }
        } else if (!ft_(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
        }
        c56457yGb.ed_(path);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void fp_(SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, C56457yGb c56457yGb) {
        SecureDirectoryStream secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (java.lang.Exception e) {
                c56457yGb.KWHzl(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            SecureDirectoryStream secureDirectoryStreamFD_ = yGR.fD_(secureDirectoryStreamNewDirectoryStream);
            java.util.Iterator it = secureDirectoryStreamFD_.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.nio.file.Path fileName = WB.cA_(it.next()).getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "");
                fq_(secureDirectoryStreamFD_, fileName, c56457yGb.ee_(), c56457yGb);
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(secureDirectoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    public static final boolean ft_(SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, LinkOption... linkOptionArr) {
        java.lang.Boolean boolValueOf;
        try {
            boolValueOf = java.lang.Boolean.valueOf(C56484yHb.fP_(secureDirectoryStream.getFileAttributeView(path, C56487yHe.KWHzl(), (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public static final void fs_(java.nio.file.Path path, java.nio.file.Path path2, C56457yGb c56457yGb) {
        if (path2 != null) {
            try {
                fb_(path);
                fc_(path, path2);
            } catch (java.lang.Exception e) {
                c56457yGb.KWHzl(e);
                return;
            }
        }
        if (Files.isDirectory(path, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            int iOLrzqt = c56457yGb.OLrzqt();
            fr_(path, c56457yGb);
            if (iOLrzqt == c56457yGb.OLrzqt()) {
                Files.deleteIfExists(path);
                return;
            }
            return;
        }
        Files.deleteIfExists(path);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void fr_(java.nio.file.Path path, C56457yGb c56457yGb) {
        DirectoryStream directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream == null) {
                return;
            }
            try {
                java.util.Iterator it = yGP.fC_(directoryStreamNewDirectoryStream).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                while (it.hasNext()) {
                    java.nio.file.Path pathCA_ = WB.cA_(it.next());
                    Intrinsics.copydefault(pathCA_);
                    fs_(pathCA_, path, c56457yGb);
                }
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(directoryStreamNewDirectoryStream, null);
            } finally {
            }
        } catch (java.lang.Exception e) {
            c56457yGb.KWHzl(e);
        }
    }

    public static final void fb_(@NotNull java.nio.file.Path path) throws IllegalFileNameException {
        Intrinsics.checkNotNullParameter(path, "");
        java.lang.String strFY_ = C56496yHn.fY_(path);
        int iHashCode = strFY_.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strFY_.equals("./")) {
                                return;
                            }
                        } else if (!strFY_.equals("..")) {
                            return;
                        }
                    } else if (!strFY_.equals("..\\")) {
                        return;
                    }
                } else if (!strFY_.equals("../")) {
                    return;
                }
            } else if (!strFY_.equals(".\\")) {
                return;
            }
        } else if (!strFY_.equals(JwtUtilsKt.JWT_DELIMITER)) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    public static final void fc_(java.nio.file.Path path, java.nio.file.Path path2) throws FileSystemLoopException {
        if (Files.isSymbolicLink(path) || !Files.isSameFile(path, path2)) {
            return;
        }
        C56479yGx.KWHzl();
        throw C56478yGw.eH_(path.toString());
    }
}
