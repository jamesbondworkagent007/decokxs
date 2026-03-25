package o;

import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56465yGj {
    public static final C56465yGj OLrzqt = new C56465yGj();
    public static final java.nio.file.Path copydefault = Paths.get("", new java.lang.String[0]);
    public static final java.nio.file.Path KWHzl = Paths.get("..", new java.lang.String[0]);

    private C56465yGj() {
    }

    public final java.nio.file.Path ev_(@NotNull java.nio.file.Path path, @NotNull java.nio.file.Path path2) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        java.nio.file.Path pathNormalize = path2.normalize();
        java.nio.file.Path pathNormalize2 = path.normalize();
        java.nio.file.Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = java.lang.Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            java.nio.file.Path name = pathNormalize.getName(i);
            java.nio.file.Path path3 = KWHzl;
            if (!Intrinsics.EZpvd(name, path3)) {
                break;
            }
            if (!Intrinsics.EZpvd(pathNormalize2.getName(i), path3)) {
                throw new java.lang.IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.EZpvd(pathNormalize2, pathNormalize) || !Intrinsics.EZpvd(pathNormalize, copydefault)) {
            java.lang.String string = pathRelativize.toString();
            java.lang.String separator = pathRelativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "");
            pathNormalize2 = C59449zhJ.endsWith$default(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(C59454zhO.DbNXlk(string, pathRelativize.getFileSystem().getSeparator().length()), new java.lang.String[0]) : pathRelativize;
        }
        Intrinsics.copydefault(pathNormalize2);
        return pathNormalize2;
    }
}
