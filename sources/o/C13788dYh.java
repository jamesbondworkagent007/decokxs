package o;

import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13788dYh {
    public static final WalletCreatedData copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new WalletCreatedData(abstractC12782ctV.DbNXlk(), abstractC12782ctV.AkhnZx(), abstractC12782ctV.RJOkX() ? new WalletCreatedData.WalletCreatedTeeData(abstractC12782ctV.DTwDnp()) : null);
    }
}
