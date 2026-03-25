package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12784ctX implements InterfaceC9735bbG {
    public int AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;

    public abstract AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.KWHzl = i;
    }

    public abstract void AEQbTJ(@NotNull java.util.List<? extends AbstractC12782ctV> list);

    @Override // o.InterfaceC9735bbG
    public abstract boolean AEQbTJ();

    public abstract boolean AYXKKw();

    public abstract int AhwBna();

    public abstract boolean AkhnZx();

    public abstract java.lang.String AuCTel();

    public abstract boolean AuCTelauCTel();

    public abstract boolean AubY();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC9735bbG
    public abstract java.lang.String EZpvd();

    public abstract java.lang.String EZpvd(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AEQbTJ = i;
    }

    public abstract void EZpvd(@NotNull WalletType walletType);

    @Override // o.InterfaceC9735bbG
    public abstract java.util.List<AbstractC12782ctV> KWHzl();

    public abstract AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull java.lang.String str);

    public abstract AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str);

    public abstract void OLrzqt(int i);

    public abstract void OLrzqt(@NotNull java.util.List<? extends AbstractC12782ctV> list);

    public abstract AbstractC58260yxt<java.lang.Integer> copydefault();

    public abstract AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    public abstract boolean copydefault(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.EZpvd;
    }

    public abstract java.lang.String ejfBZ();

    public abstract int fARcdN();

    public abstract java.util.List<AbstractC12782ctV> fIwbmz();

    public abstract WalletType fJNWhG();

    public abstract C13854daT fetchVPNInfo();

    public abstract long gEmmrt();

    public abstract boolean getFieldNames();

    public abstract boolean getNewProxyInstance();

    public abstract boolean hDKMBd();

    public abstract MpcWalletEncodeInfo isConnected();

    public abstract boolean iwGUEr();

    public abstract boolean uzCIH();

    public abstract boolean valueOf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.AEQbTJ;
    }

    public abstract boolean wlaJM();

    public abstract boolean zLjUOn();

    public abstract boolean zsXlph();

    @Override // o.InterfaceC9735bbG
    public java.lang.CharSequence AEQbTJ(boolean z) {
        return C14733dqy.copydefault.OLrzqt(this, z);
    }

    @Override // o.InterfaceC9735bbG
    public java.lang.String OLrzqt() {
        return C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).OLrzqt();
    }
}
