package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.retail_trading.UpDownTimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class pXT implements InterfaceC4642Blq {
    public final InterfaceC46557tYt copydefault;

    @yCM
    public pXT(@NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.copydefault = interfaceC46557tYt;
    }

    @Override // o.InterfaceC4642Blq
    public UpDownTimeZone OLrzqt() {
        int iEZpvd = this.copydefault.EZpvd();
        if (iEZpvd == 1) {
            return UpDownTimeZone.MODE_UTC0;
        }
        if (iEZpvd == 2) {
            return UpDownTimeZone.MODE_UTC8;
        }
        return UpDownTimeZone.MODE24H;
    }
}
