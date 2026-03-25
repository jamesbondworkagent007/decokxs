package o;

import com.okinc.wallet.api.MpcWalletService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17734fQh extends C17738fQl {
    public final MpcWalletService.MpcWalletAbleStatus OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletService.MpcWalletAbleStatus EZpvd() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17734fQh(@NotNull java.lang.String str, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull AbstractC12782ctV abstractC12782ctV) {
        super(str, 0L, abstractC12782ctV, 2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.OLrzqt = mpcWalletAbleStatus;
    }
}
