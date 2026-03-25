package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.web3.security.bridge.MnemonicKt;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13847daM {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final java.lang.String EZpvd;
    public long KWHzl;
    public final long copydefault;

    public C13847daM(long j) {
        this.KWHzl = j;
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(this.KWHzl);
        this.copydefault = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.fetchVPNInfo() : 0L;
        java.lang.String strIwGUEr = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.iwGUEr() : null;
        this.EZpvd = strIwGUEr == null ? "" : strIwGUEr;
        this.KWHzl = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zAEQbTJ = xYW.AEQbTJ.AEQbTJ(this.KWHzl, str, this.EZpvd);
        return this.copydefault == 607 ? zAEQbTJ && C14079deg.EZpvd.KWHzl(str) : zAEQbTJ;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        WalletAddressItem walletAddressItemGenerateKeyAddress$default = generateKeyAddress$default(this, str, 0, "", 2, null);
        return C33129mqd.OLrzqt((java.lang.CharSequence) (walletAddressItemGenerateKeyAddress$default != null ? walletAddressItemGenerateKeyAddress$default.getAddress() : null));
    }

    public static /* synthetic */ WalletAddressItem generateHDAddress$default(C13847daM c13847daM, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = AddressType.Legacy.getValue();
        }
        return c13847daM.EZpvd(str, i, i2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xZu.generateHDAddress$default(o.xZu, java.lang.String, java.lang.String, long, long, int, int, java.lang.String, boolean, boolean, java.lang.String, int, java.lang.Object):com.okinc.wallet.core.mpc.WalletAddressList */
    public final WalletAddressItem EZpvd(@NotNull java.lang.String str, int i, int i2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        WalletAddressList walletAddressListKWHzl = C54908xZu.AEQbTJ.KWHzl(str, MnemonicKt.MnemonicLanguageEnglish, this.KWHzl, this.copydefault, i, i2, this.EZpvd, (MLKEMEngine.KyberPolyBytes & 128) != 0, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? false : false, "");
        if (walletAddressListKWHzl == null) {
            return null;
        }
        java.util.Iterator<T> it = walletAddressListKWHzl.getAddressList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CoinAddressBean) next).getType() == i2) {
                break;
            }
        }
        CoinAddressBean coinAddressBean = (CoinAddressBean) next;
        if (coinAddressBean == null) {
            return null;
        }
        return new WalletAddressItem(walletAddressListKWHzl.getChainId(), walletAddressListKWHzl.getPubKey(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressListKWHzl.getSignature());
    }

    public static /* synthetic */ WalletAddressItem generateKeyAddress$default(C13847daM c13847daM, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = AddressType.Legacy.getValue();
        }
        return c13847daM.KWHzl(str, i, str2);
    }

    public final WalletAddressItem KWHzl(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WalletAddressList walletAddressListOLrzqt = OLrzqt(str, i, str2);
        if (walletAddressListOLrzqt == null) {
            return null;
        }
        java.util.Iterator<T> it = walletAddressListOLrzqt.getAddressList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CoinAddressBean) next).getType() == i) {
                break;
            }
        }
        CoinAddressBean coinAddressBean = (CoinAddressBean) next;
        if (coinAddressBean == null) {
            return null;
        }
        return new WalletAddressItem(walletAddressListOLrzqt.getChainId(), walletAddressListOLrzqt.getPubKey(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressListOLrzqt.getSignature());
    }

    public static /* synthetic */ WalletAddressList generateKeyAddressList$default(C13847daM c13847daM, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = AddressType.Legacy.getValue();
        }
        return c13847daM.OLrzqt(str, i, str2);
    }

    public final WalletAddressList OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        java.util.List<CoinAddressBean> addressList;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WalletAddressList walletAddressListKWHzl = C54908xZu.AEQbTJ.KWHzl(str, this.KWHzl, this.copydefault, i, this.EZpvd, true, str2);
        if (walletAddressListKWHzl != null && (addressList = walletAddressListKWHzl.getAddressList()) != null) {
            java.util.Iterator<T> it = addressList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CoinAddressBean) next).getType() == AddressType.P2SHType.getValue()) {
                    break;
                }
            }
            CoinAddressBean coinAddressBean = (CoinAddressBean) next;
            if (coinAddressBean != null) {
                coinAddressBean.setType(AddressType.P2SHCommonType.getValue());
            }
        }
        return walletAddressListKWHzl;
    }

    /* JADX INFO: renamed from: o.daM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.daM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean AYXKKw(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (!c10854bwM.RlQdEF() && new C13847daM(c10854bwM.fetchVPNInfo()).EZpvd(str)) {
                    return true;
                }
            }
            return false;
        }

        public final java.util.List<C13853daS> KWHzl(@NotNull java.lang.String str) {
            WalletAddressItem walletAddressItemKWHzl;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (!c10854bwM.RlQdEF() && (walletAddressItemKWHzl = new C13847daM(c10854bwM.fetchVPNInfo()).KWHzl(str, C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), true), "")) != null) {
                    arrayList.add(new C13853daS(walletAddressItemKWHzl.getAddress(), c10854bwM));
                }
            }
            return arrayList;
        }

        public final java.util.List<C13853daS> AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(str)) {
                    arrayList.add(new C13853daS(str, c10854bwM));
                }
            }
            return arrayList;
        }

        public final java.util.List<C13853daS> valueOf(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(C13847daM.Companion.OLrzqt(str, c10854bwM))) {
                    arrayList.add(new C13853daS(str, c10854bwM));
                }
            }
            return arrayList;
        }

        public final java.util.List<C13853daS> copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().OLrzqt()) {
                if (new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(str)) {
                    arrayList.add(new C13853daS(str, c10854bwM));
                }
            }
            return arrayList;
        }

        public final java.util.List<C10854bwM> EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (CustomChainCoinMeta customChainCoinMeta : C10598brV.AEQbTJ.gEmmrt()) {
                if (new C13847daM(1L).OLrzqt(str)) {
                    arrayList.add(customChainCoinMeta.AEQbTJ());
                }
            }
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(str)) {
                    arrayList.add(c10854bwM);
                }
            }
            return arrayList;
        }

        public final java.util.List<C10854bwM> OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (CustomChainCoinMeta customChainCoinMeta : C10598brV.AEQbTJ.gEmmrt()) {
                if (new C13847daM(1L).OLrzqt(str)) {
                    arrayList.add(customChainCoinMeta.AEQbTJ());
                }
            }
            for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
                if (new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(C13847daM.Companion.OLrzqt(str, c10854bwM))) {
                    arrayList.add(c10854bwM);
                }
            }
            return arrayList;
        }

        public final java.lang.String OLrzqt(java.lang.String str, C10854bwM c10854bwM) {
            return c10854bwM.OLrzqt(str) ? C59449zhJ.KWHzl(str, c10854bwM.zLjUOn(), EIP1271Verifier.hexPrefix, true) : str;
        }
    }
}
