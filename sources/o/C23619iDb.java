package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23619iDb extends iCU {
    public final InterfaceC23916iOb OLrzqt;

    @yCM
    public C23619iDb(@NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.OLrzqt = interfaceC23916iOb;
    }

    @Override // o.iCX
    public C25481ixY copydefault(@NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str, "");
        C25481ixY c25481ixYCopydefault = super.copydefault(redeemInitialInfo, investTokenWithAmount, str);
        return c25481ixYCopydefault.copydefault((1023 & 1) != 0 ? c25481ixYCopydefault.EZpvd : null, (1023 & 2) != 0 ? c25481ixYCopydefault.AEQbTJ : null, (1023 & 4) != 0 ? c25481ixYCopydefault.AYXKKw : false, (1023 & 8) != 0 ? c25481ixYCopydefault.djBIcL : false, (1023 & 16) != 0 ? c25481ixYCopydefault.AhwBna : false, (1023 & 32) != 0 ? c25481ixYCopydefault.values : false, (1023 & 64) != 0 ? c25481ixYCopydefault.gEmmrt : false, (1023 & 128) != 0 ? c25481ixYCopydefault.valueOf : false, (1023 & 256) != 0 ? c25481ixYCopydefault.copydefault : null, (1023 & 512) != 0 ? c25481ixYCopydefault.OLrzqt : 0, (1023 & 1024) != 0 ? c25481ixYCopydefault.KWHzl : C23626iDi.copydefault(redeemInitialInfo.fIwbmz(), this.OLrzqt));
    }
}
