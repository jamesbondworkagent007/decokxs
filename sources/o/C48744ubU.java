package o;

import com.okinc.share.bean.ShareConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48744ubU implements InterfaceC49002ugN {
    @Override // o.InterfaceC49002ugN
    public AbstractC32996moC EZpvd(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return C48803uca.Companion.KWHzl(shareConfig.getShareParams().getExtras().getString("referralShareCode", null), shareConfig.getShareParams().getExtras().getString("referralShareLink", null));
    }
}
