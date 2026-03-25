package o;

import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28263kUy {
    public final InterfaceC28370kYx EZpvd;

    @yCM
    public C28263kUy(@NotNull InterfaceC28370kYx interfaceC28370kYx) {
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        this.EZpvd = interfaceC28370kYx;
    }

    public final void AEQbTJ(@NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        this.EZpvd.copydefault(tradingType);
    }
}
