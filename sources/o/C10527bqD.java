package o;

import com.google.gson.GsonBuilder;
import com.okinc.business.defi.biz.database.wallet.entity.WalletDefiEntity;
import com.okinc.business.defi.biz.net.bean.Portfolio;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10527bqD extends AbstractC10406bnp {
    public final java.lang.String AEQbTJ;
    public final Portfolio AYXKKw;
    public final java.lang.String AhwBna;
    public java.lang.String KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final AbstractC12782ctV valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC10406bnp, o.InterfaceC9742bbN
    public long gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC10406bnp
    public AbstractC12782ctV values() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10527bqD(@NotNull Portfolio portfolio, @NotNull AbstractC12782ctV abstractC12782ctV) {
        super(abstractC12782ctV);
        Intrinsics.checkNotNullParameter(portfolio, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.AYXKKw = portfolio;
        this.valueOf = abstractC12782ctV;
        java.lang.String platform = portfolio.getPlatform();
        this.djBIcL = platform == null ? "" : platform;
        java.lang.String platformId = portfolio.getPlatformId();
        this.gEmmrt = platformId == null ? "" : platformId;
        java.lang.String network = portfolio.getNetwork();
        this.AhwBna = network == null ? "" : network;
        java.lang.String chainName = portfolio.getChainName();
        this.AEQbTJ = chainName == null ? "" : chainName;
        java.lang.String logo = portfolio.getLogo();
        this.copydefault = logo != null ? logo : "";
        java.lang.String balance = portfolio.getBalance();
        this.KWHzl = (balance == null || balance.length() == 0) ? "0" : balance;
        java.lang.Long chainId = portfolio.getChainId();
        this.OLrzqt = chainId != null ? chainId.longValue() : -1L;
    }

    public final java.lang.String copydefault() {
        return C54880xYt.formatValuationFromAsset$default(this.KWHzl, null, false, 0, false, 15, null);
    }

    public java.lang.String AhwBna() {
        return C10953byF.KWHzl.copydefault(this.djBIcL, this.AhwBna);
    }

    public final WalletDefiEntity EZpvd() {
        java.lang.String strDbNXlk = values().DbNXlk();
        java.lang.String strAhwBna = AhwBna();
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(this.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return new WalletDefiEntity(strDbNXlk, strAhwBna, json);
    }
}
