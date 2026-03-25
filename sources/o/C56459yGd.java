package o;

import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56459yGd extends SimpleFileVisitor<java.nio.file.Path> {
    public final Function2<java.nio.file.Path, java.io.IOException, FileVisitResult> AEQbTJ;
    public final Function2<java.nio.file.Path, BasicFileAttributes, FileVisitResult> KWHzl;
    public final Function2<java.nio.file.Path, java.io.IOException, FileVisitResult> OLrzqt;
    public final Function2<java.nio.file.Path, BasicFileAttributes, FileVisitResult> copydefault;

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult postVisitDirectory(java.lang.Object obj, java.io.IOException iOException) {
        return en_(WB.cA_(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult preVisitDirectory(java.lang.Object obj, BasicFileAttributes basicFileAttributes) {
        return eo_(WB.cA_(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult visitFile(java.lang.Object obj, BasicFileAttributes basicFileAttributes) {
        return ep_(WB.cA_(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult visitFileFailed(java.lang.Object obj, java.io.IOException iOException) {
        return eq_(WB.cA_(obj), iOException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56459yGd(Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2, Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> function22, Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> function23, Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> function24) {
        this.KWHzl = function2;
        this.copydefault = function22;
        this.OLrzqt = function23;
        this.AEQbTJ = function24;
    }

    public FileVisitResult eo_(@NotNull java.nio.file.Path path, @NotNull BasicFileAttributes basicFileAttributes) throws java.io.IOException {
        FileVisitResult fileVisitResultEr_;
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        Function2<java.nio.file.Path, BasicFileAttributes, FileVisitResult> function2 = this.KWHzl;
        if (function2 != null && (fileVisitResultEr_ = C56467yGl.er_(function2.invoke(path, basicFileAttributes))) != null) {
            return fileVisitResultEr_;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "");
        return fileVisitResultPreVisitDirectory;
    }

    public FileVisitResult ep_(@NotNull java.nio.file.Path path, @NotNull BasicFileAttributes basicFileAttributes) throws java.io.IOException {
        FileVisitResult fileVisitResultEr_;
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        Function2<java.nio.file.Path, BasicFileAttributes, FileVisitResult> function2 = this.copydefault;
        if (function2 != null && (fileVisitResultEr_ = C56467yGl.er_(function2.invoke(path, basicFileAttributes))) != null) {
            return fileVisitResultEr_;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "");
        return fileVisitResultVisitFile;
    }

    public FileVisitResult eq_(@NotNull java.nio.file.Path path, @NotNull java.io.IOException iOException) throws java.io.IOException {
        FileVisitResult fileVisitResultEr_;
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        Function2<java.nio.file.Path, java.io.IOException, FileVisitResult> function2 = this.OLrzqt;
        if (function2 != null && (fileVisitResultEr_ = C56467yGl.er_(function2.invoke(path, iOException))) != null) {
            return fileVisitResultEr_;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(path, iOException);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "");
        return fileVisitResultVisitFileFailed;
    }

    public FileVisitResult en_(@NotNull java.nio.file.Path path, java.io.IOException iOException) throws java.io.IOException {
        FileVisitResult fileVisitResultEr_;
        Intrinsics.checkNotNullParameter(path, "");
        Function2<java.nio.file.Path, java.io.IOException, FileVisitResult> function2 = this.AEQbTJ;
        if (function2 != null && (fileVisitResultEr_ = C56467yGl.er_(function2.invoke(path, iOException))) != null) {
            return fileVisitResultEr_;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(path, iOException);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "");
        return fileVisitResultPostVisitDirectory;
    }
}
