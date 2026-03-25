package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWR {
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final kotlin.Pair<ProtoBuf.PackageFragment, yWN> copydefault(@NotNull java.io.InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        Intrinsics.checkNotNullParameter(inputStream, "");
        try {
            yWN ywnAEQbTJ = yWN.KWHzl.AEQbTJ(inputStream);
            if (ywnAEQbTJ.EZpvd()) {
                yXE yxeOLrzqt = yXE.OLrzqt();
                yWL.OLrzqt(yxeOLrzqt);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, yxeOLrzqt);
            } else {
                from = null;
            }
            kotlin.Pair<ProtoBuf.PackageFragment, yWN> pairOLrzqt = C56390yDp.OLrzqt(from, ywnAEQbTJ);
            yFA.copydefault(inputStream, null);
            return pairOLrzqt;
        } finally {
        }
    }
}
