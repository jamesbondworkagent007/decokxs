package o;

import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56463yGh implements FileVisitorBuilder {
    public Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> AEQbTJ;
    public boolean EZpvd;
    public Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> KWHzl;
    public Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> OLrzqt;
    public Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> copydefault;

    @Override // kotlin.io.path.FileVisitorBuilder
    public void copydefault(@NotNull Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault();
        copydefault(this.KWHzl, "onPreVisitDirectory");
        this.KWHzl = function2;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void AEQbTJ(@NotNull Function2<? super java.nio.file.Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault();
        copydefault(this.OLrzqt, "onVisitFile");
        this.OLrzqt = function2;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void EZpvd(@NotNull Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault();
        copydefault(this.copydefault, "onVisitFileFailed");
        this.copydefault = function2;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void KWHzl(@NotNull Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends FileVisitResult> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault();
        copydefault(this.AEQbTJ, "onPostVisitDirectory");
        this.AEQbTJ = function2;
    }

    public final FileVisitor<java.nio.file.Path> em_() {
        copydefault();
        this.EZpvd = true;
        return yFU.ea_(new C56459yGd(this.KWHzl, this.OLrzqt, this.copydefault, this.AEQbTJ));
    }

    public final void copydefault() {
        if (this.EZpvd) {
            throw new java.lang.IllegalStateException("This builder was already built");
        }
    }

    public final void copydefault(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return;
        }
        throw new java.lang.IllegalStateException(str + " was already defined");
    }
}
