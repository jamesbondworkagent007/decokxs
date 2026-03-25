package o;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class yGA {
    public static final java.lang.Object eJ_(java.nio.file.Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (java.lang.Class<BasicFileAttributes>) C47143tkV.EZpvd(), (LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            Intrinsics.checkNotNullExpressionValue(attributes, "");
            return attributes.fileKey();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final boolean KWHzl(C56468yGm c56468yGm) {
        for (C56468yGm c56468yGmAEQbTJ = c56468yGm.AEQbTJ(); c56468yGmAEQbTJ != null; c56468yGmAEQbTJ = c56468yGmAEQbTJ.AEQbTJ()) {
            if (c56468yGmAEQbTJ.OLrzqt() != null && c56468yGm.OLrzqt() != null) {
                if (Intrinsics.EZpvd(c56468yGmAEQbTJ.OLrzqt(), c56468yGm.OLrzqt())) {
                    return true;
                }
            } else {
                try {
                    if (Files.isSameFile(c56468yGmAEQbTJ.eu_(), c56468yGm.eu_())) {
                        return true;
                    }
                } catch (java.io.IOException | java.lang.SecurityException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
