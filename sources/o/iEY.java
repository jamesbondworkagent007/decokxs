package o;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEY {
    public final iEX AEQbTJ;
    public final C23675iFd AYXKKw;
    public final C23672iFa AhwBna;
    public final iER EZpvd;
    public final iES KWHzl;
    public final iEU OLrzqt;
    public final iET copydefault;
    public final iEV djBIcL;
    public final iEZ valueOf;

    @yCM
    public iEY(@NotNull iET iet, @NotNull iEX iex, @NotNull iEU ieu, @NotNull C23672iFa c23672iFa, @NotNull iEV iev, @NotNull iES ies, @NotNull iEZ iez, @NotNull iER ier, @NotNull C23675iFd c23675iFd) {
        Intrinsics.checkNotNullParameter(iet, "");
        Intrinsics.checkNotNullParameter(iex, "");
        Intrinsics.checkNotNullParameter(ieu, "");
        Intrinsics.checkNotNullParameter(c23672iFa, "");
        Intrinsics.checkNotNullParameter(iev, "");
        Intrinsics.checkNotNullParameter(ies, "");
        Intrinsics.checkNotNullParameter(iez, "");
        Intrinsics.checkNotNullParameter(ier, "");
        Intrinsics.checkNotNullParameter(c23675iFd, "");
        this.copydefault = iet;
        this.AEQbTJ = iex;
        this.OLrzqt = ieu;
        this.AhwBna = c23672iFa;
        this.djBIcL = iev;
        this.KWHzl = ies;
        this.valueOf = iez;
        this.EZpvd = ier;
        this.AYXKKw = c23675iFd;
    }

    public final C23673iFb OLrzqt(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        return new C23673iFb(this.djBIcL.AEQbTJ(productDetailsResponse), productDetailsResponse.ffGIBT(), this.AhwBna.copydefault(productDetailsResponse), this.copydefault.EZpvd(productDetailsResponse), this.KWHzl.AEQbTJ(productDetailsResponse), this.valueOf.KWHzl(productDetailsResponse), this.EZpvd.EZpvd(productDetailsResponse), this.AEQbTJ.copydefault(productDetailsResponse), this.OLrzqt.AEQbTJ(productDetailsResponse), this.AYXKKw.AEQbTJ(productDetailsResponse), productDetailsResponse.gasjUx(), productDetailsResponse.djBIcL(), productDetailsResponse.accept());
    }
}
