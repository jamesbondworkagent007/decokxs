package o;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class yFV extends SimpleFileVisitor<java.nio.file.Path> {
    public C56468yGm AEQbTJ;
    public yDQ<C56468yGm> KWHzl = new yDQ<>();
    public final boolean OLrzqt;

    public yFV(boolean z) {
        this.OLrzqt = z;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult preVisitDirectory(java.lang.Object obj, BasicFileAttributes basicFileAttributes) {
        return dX_(WB.cA_(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* synthetic */ FileVisitResult visitFile(java.lang.Object obj, BasicFileAttributes basicFileAttributes) {
        return dY_(WB.cA_(obj), basicFileAttributes);
    }

    public final java.util.List<C56468yGm> AEQbTJ(@NotNull C56468yGm c56468yGm) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c56468yGm, "");
        this.AEQbTJ = c56468yGm;
        Files.walkFileTree(c56468yGm.eu_(), C56464yGi.copydefault.AEQbTJ(this.OLrzqt), 1, yFU.ea_(this));
        this.KWHzl.removeFirst();
        yDQ<C56468yGm> ydq = this.KWHzl;
        this.KWHzl = new yDQ<>();
        return ydq;
    }

    public FileVisitResult dX_(@NotNull java.nio.file.Path path, @NotNull BasicFileAttributes basicFileAttributes) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        this.KWHzl.add(new C56468yGm(path, basicFileAttributes.fileKey(), this.AEQbTJ));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "");
        return fileVisitResultPreVisitDirectory;
    }

    public FileVisitResult dY_(@NotNull java.nio.file.Path path, @NotNull BasicFileAttributes basicFileAttributes) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        this.KWHzl.add(new C56468yGm(path, null, this.AEQbTJ));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "");
        return fileVisitResultVisitFile;
    }
}
