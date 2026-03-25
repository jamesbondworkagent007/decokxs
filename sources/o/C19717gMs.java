package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19717gMs implements InterfaceC19715gMq {
    public final C19706gMh copydefault;

    @yCM
    public C19717gMs(@NotNull C19706gMh c19706gMh) {
        Intrinsics.checkNotNullParameter(c19706gMh, "");
        this.copydefault = c19706gMh;
    }

    @Override // o.InterfaceC19715gMq
    public void copydefault(@NotNull java.lang.String str, @NotNull Function1<? super TeeWsOriginData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.EZpvd(str, function1);
    }

    @Override // o.InterfaceC19715gMq
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AEQbTJ(str);
    }

    @Override // o.InterfaceC19715gMq
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super WsMarketOrderInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.AEQbTJ(str, function1);
    }

    @Override // o.InterfaceC19715gMq
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.OLrzqt(str);
    }
}
