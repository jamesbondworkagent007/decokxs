package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.WebShareParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48986ufy {
    public static final void KWHzl(@NotNull WebShareParams webShareParams, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(webShareParams, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        iShareParams.setTitle(webShareParams.getTitle());
        iShareParams.setSubtitle(webShareParams.getSubtitle());
        iShareParams.setBody(webShareParams.getBody());
    }
}
