package o;

import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC9347bTq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9312bTH extends C9311bTG implements InterfaceC9347bTq {
    public java.lang.Integer AYXKKw;
    public java.lang.String djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.bTG.AuCTel()Lo/ctf; */
    public java.lang.String AuCTel() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.Integer num) {
        this.AYXKKw = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.bTG.fJNWhG()Ljava/lang/String; */
    @Override // o.InterfaceC9347bTq
    public java.lang.Integer fJNWhG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Possible override for method o.bTG.fIwbmz()Ljava/lang/String; */
    @Override // o.InterfaceC9347bTq
    public int fIwbmz() {
        return InterfaceC9347bTq.Application.copydefault(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9312bTH(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC8931bLy interfaceC8931bLy) {
        super(abstractC8564bFB, interfaceC8931bLy);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC8931bLy, "");
    }

    @Override // o.C9311bTG, o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        KWHzl((java.lang.Integer) 3);
        this.gEmmrt = false;
        super.AEQbTJ(i);
    }

    @Override // o.C9311bTG, o.AbstractC9346bTp
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl((java.lang.Integer) 3);
        this.gEmmrt = false;
        super.AEQbTJ(str, str2, z, z2);
    }

    @Override // o.C9311bTG, o.AbstractC9346bTp
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        KWHzl((java.lang.Integer) 3);
        this.gEmmrt = false;
        super.OLrzqt(str, str2, str3, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String gasLimit;
        java.lang.String gasLimit2;
        java.lang.String str5 = str;
        java.lang.String str6 = str3;
        uzCIH().AkhnZx("");
        java.lang.Integer numFJNWhG = fJNWhG();
        if (numFJNWhG != null && numFJNWhG.intValue() == 3) {
            return;
        }
        KWHzl(num);
        AEQbTJ(str5);
        if (uzCIH().QwvEab() == 2 || uzCIH().QwvEab() == 5) {
            EvmSignInfoGasPrice evmSignInfoGasPriceIsConnected = gHZMYf().isConnected();
            WalletGasLimitRes walletGasLimitResFetchVPNInfo = gHZMYf().fetchVPNInfo();
            if (Intrinsics.EZpvd(evmSignInfoGasPriceIsConnected.getSupportEip1559(), java.lang.Boolean.TRUE)) {
                if (C33129mqd.AEQbTJ(str2, evmSignInfoGasPriceIsConnected.getMin()) && C33129mqd.AEQbTJ(str6, evmSignInfoGasPriceIsConnected.getSafePriorityFee()) && C33129mqd.copydefault(str2, str3) && C33129mqd.AEQbTJ(str4, walletGasLimitResFetchVPNInfo.getGasLimit())) {
                    OLrzqt(C54862xYb.convertToString$default(C54862xYb.AEQbTJ(str2, str3), false, null, null, 7, null), str6 == null ? "" : str6, str4 != null ? str4 : "", false, false);
                    this.gEmmrt = true;
                    if (C33129mqd.AEQbTJ(str2, C54862xYb.OLrzqt(evmSignInfoGasPriceIsConnected.getMax(), java.lang.Double.valueOf(1.2d))) || C33129mqd.AEQbTJ(str4, C54862xYb.OLrzqt(walletGasLimitResFetchVPNInfo.getGasLimit(), java.lang.Double.valueOf(1.2d)))) {
                        uzCIH().AkhnZx(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaDescriptionCompatApi23Builder));
                        uzCIH().UlJrfe().AEQbTJ(new C9827bct(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaDescriptionCompatApi23Builder)));
                    }
                } else if (str2 != null || str6 != null || str4 != null) {
                    uzCIH().AkhnZx(C33070mpX.AYXKKw(C13754dXa.FragmentManager.newInstance));
                    uzCIH().UlJrfe().AEQbTJ(new C9827bct(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.newInstance)));
                }
            } else if (C33129mqd.AEQbTJ(str5, evmSignInfoGasPriceIsConnected.getMin()) && C33129mqd.AEQbTJ(str4, walletGasLimitResFetchVPNInfo.getGasLimit())) {
                if (str5 == null) {
                    str5 = "";
                }
                AEQbTJ(str5, str4 != null ? str4 : "", false, false);
                this.gEmmrt = true;
            }
            if (this.gEmmrt) {
                return;
            }
            KWHzl((java.lang.Integer) 3);
            return;
        }
        if (uzCIH().QwvEab() == 3 && uzCIH().OJuSTm().getUseDexGasParamsOnEVM()) {
            EvmSignInfoGasPrice evmSignInfoGasPriceIsConnected2 = gHZMYf().isConnected();
            WalletGasLimitRes walletGasLimitResFetchVPNInfo2 = gHZMYf().fetchVPNInfo();
            if (Intrinsics.EZpvd(evmSignInfoGasPriceIsConnected2.getSupportEip1559(), java.lang.Boolean.TRUE)) {
                if (C33129mqd.copydefault(str2, str3) && C33129mqd.AEQbTJ(str6, 0)) {
                    java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(str2, str3), false, null, null, 7, null);
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (C33129mqd.AEQbTJ(str4, 0)) {
                        gasLimit2 = str4 == null ? "" : str4;
                    } else {
                        gasLimit2 = walletGasLimitResFetchVPNInfo2.getGasLimit();
                        if (gasLimit2 == null) {
                        }
                    }
                    OLrzqt(strConvertToString$default, str6, gasLimit2, false, false);
                    return;
                }
            } else if (C33129mqd.AEQbTJ(str5, 0)) {
                if (str5 == null) {
                    str5 = "";
                }
                if (C33129mqd.AEQbTJ(str4, 0)) {
                    gasLimit = str4 == null ? "" : str4;
                } else {
                    gasLimit = walletGasLimitResFetchVPNInfo2.getGasLimit();
                    if (gasLimit == null) {
                    }
                }
                AEQbTJ(str5, gasLimit, false, false);
                return;
            }
        }
        if (num != null && num.intValue() == 0) {
            return;
        }
        if ((num != null && num.intValue() == 1) || num2 == null) {
            return;
        }
        if (num2.intValue() == 31) {
            copydefault(31);
        } else if (num2.intValue() == 32) {
            copydefault(32);
        } else if (num2.intValue() == 33) {
            copydefault(33);
        }
    }

    @Override // o.C9311bTG
    public java.lang.String gEmmrt(int i) {
        java.lang.Integer numFJNWhG;
        java.lang.Integer numFJNWhG2;
        if ((i == 4 || i == 32) && ((((numFJNWhG = fJNWhG()) != null && numFJNWhG.intValue() == 0) || ((numFJNWhG2 = fJNWhG()) != null && numFJNWhG2.intValue() == 1)) && C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel()) && uzCIH().QwvEab() != 2 && uzCIH().QwvEab() != 5)) {
            java.lang.String strAuCTel = AuCTel();
            Intrinsics.copydefault((java.lang.Object) strAuCTel);
            java.lang.String strEZpvd = EZpvd(strAuCTel, gHZMYf().isConnected().getProposePriorityFee());
            return strEZpvd == null ? "" : strEZpvd;
        }
        return super.gEmmrt(i);
    }

    @Override // o.C9311bTG, o.AbstractC8485bDc
    public int fetchVPNInfo() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AwvSrB())) {
            return 7;
        }
        java.lang.Integer numFJNWhG = fJNWhG();
        if (numFJNWhG != null && numFJNWhG.intValue() == 0) {
            return 0;
        }
        if (numFJNWhG != null && numFJNWhG.intValue() == 1) {
            return 1;
        }
        if (numFJNWhG != null && numFJNWhG.intValue() == 2) {
            return 2;
        }
        if (DbNXlk() == 4 && this.gEmmrt) {
            return 8;
        }
        return super.fetchVPNInfo();
    }
}
