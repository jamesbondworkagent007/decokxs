package o;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import kotlin.Unit;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class yFQ implements CopyActionContext {
    public static final yFQ copydefault = new yFQ();

    private yFQ() {
    }

    @Override // kotlin.io.path.CopyActionContext
    public CopyActionResult dT_(@NotNull java.nio.file.Path path, @NotNull java.nio.file.Path path2, boolean z) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(path2, "");
        LinkOption[] linkOptionArrEs_ = C56464yGi.copydefault.es_(z);
        LinkOption[] linkOptionArr = (LinkOption[]) java.util.Arrays.copyOf(linkOptionArrEs_, linkOptionArrEs_.length);
        if (Files.isDirectory(path, (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length)) && Files.isDirectory(path2, (LinkOption[]) java.util.Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Unit unit = Unit.INSTANCE;
        } else {
            CopyOption[] copyOptionArr = (CopyOption[]) java.util.Arrays.copyOf(linkOptionArrEs_, linkOptionArrEs_.length);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "");
        }
        return CopyActionResult.CONTINUE;
    }
}
