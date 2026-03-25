package o;

import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.ImportWalletAvailableChecker$checkHdAddAccountAvailable$1;
import com.okinc.business.defi.wallet.ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2;
import com.okinc.business.defi.wallet.ImportWalletAvailableChecker$checkResult$1;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.web3.security.bridge.MnemonicKt;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13758dXe {
    public final C12827cuN AEQbTJ;
    public final C11010bzJ EZpvd;
    public final C13934dbu copydefault;

    public C13758dXe(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull C11010bzJ c11010bzJ) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        this.copydefault = c13934dbu;
        this.AEQbTJ = c12827cuN;
        this.EZpvd = c11010bzJ;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (!C14728dqt.KWHzl.KWHzl()) {
            return C56443yFo.KWHzl(true);
        }
        return checkWalletImportAvailable$default(this, str, 0, WalletType.HDWallet, continuation, 2, null);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (!C14728dqt.KWHzl.KWHzl()) {
            return C56443yFo.KWHzl(true);
        }
        return checkWalletImportAvailable$default(this, str, 0, WalletType.TonWallet, continuation, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=4] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa A[PHI: r13
  0x00fa: PHI (r13v19 java.lang.Object) = (r13v18 java.lang.Object), (r13v1 java.lang.Object) binds: [B:44:0x00f7, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ImportWalletAvailableChecker$checkHdAddAccountAvailable$1 importWalletAvailableChecker$checkHdAddAccountAvailable$1;
        boolean zBooleanValue;
        C13758dXe c13758dXe;
        int i;
        java.lang.Object objAwait;
        java.lang.String str3;
        WalletEntity walletEntity;
        C13758dXe c13758dXe2;
        if (continuation instanceof ImportWalletAvailableChecker$checkHdAddAccountAvailable$1) {
            importWalletAvailableChecker$checkHdAddAccountAvailable$1 = (ImportWalletAvailableChecker$checkHdAddAccountAvailable$1) continuation;
            int i2 = importWalletAvailableChecker$checkHdAddAccountAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                importWalletAvailableChecker$checkHdAddAccountAvailable$1.label = i2 - Integer.MIN_VALUE;
            } else {
                importWalletAvailableChecker$checkHdAddAccountAvailable$1 = new ImportWalletAvailableChecker$checkHdAddAccountAvailable$1(this, continuation);
            }
        }
        ImportWalletAvailableChecker$checkHdAddAccountAvailable$1 importWalletAvailableChecker$checkHdAddAccountAvailable$12 = importWalletAvailableChecker$checkHdAddAccountAvailable$1;
        java.lang.Object objAwait2 = importWalletAvailableChecker$checkHdAddAccountAvailable$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = importWalletAvailableChecker$checkHdAddAccountAvailable$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAwait2);
                if (!C14728dqt.KWHzl.KWHzl()) {
                    return C56443yFo.KWHzl(true);
                }
                Result.Application application = Result.Companion;
                AbstractC58260yxt maxWalletIndex$default = C12827cuN.getMaxWalletIndex$default(this.AEQbTJ, str, null, 2, null);
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = this;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = str;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = str2;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 1;
                objAwait2 = RxAwaitKt.await(maxWalletIndex$default, importWalletAvailableChecker$checkHdAddAccountAvailable$12);
                if (objAwait2 == objCopydefault) {
                    return objCopydefault;
                }
                c13758dXe = this;
            } else if (i3 == 1) {
                str2 = (java.lang.String) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2;
                str = (java.lang.String) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1;
                c13758dXe = (C13758dXe) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0;
                C56391yDq.AEQbTJ(objAwait2);
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            C56391yDq.AEQbTJ(objAwait2);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = importWalletAvailableChecker$checkHdAddAccountAvailable$12.I$0;
                    walletEntity = (WalletEntity) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2;
                    str3 = (java.lang.String) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1;
                    c13758dXe2 = (C13758dXe) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0;
                    C56391yDq.AEQbTJ(objAwait2);
                    java.lang.String str4 = (java.lang.String) objAwait2;
                    xXW xxw = xXW.OLrzqt;
                    Intrinsics.copydefault((java.lang.Object) str4);
                    java.lang.String strAEQbTJ = xxw.AEQbTJ(str3, str4, walletEntity.getData(), true);
                    importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = null;
                    importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = null;
                    importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = null;
                    importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 4;
                    objAwait2 = checkWalletImportAvailable$default(c13758dXe2, strAEQbTJ, i, null, importWalletAvailableChecker$checkHdAddAccountAvailable$12, 4, null);
                    return objAwait2 != objCopydefault ? objCopydefault : objAwait2;
                }
                i = importWalletAvailableChecker$checkHdAddAccountAvailable$12.I$0;
                str2 = (java.lang.String) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1;
                c13758dXe = (C13758dXe) importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0;
                C56391yDq.AEQbTJ(objAwait2);
                WalletEntity walletEntity2 = (WalletEntity) objAwait2;
                AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c13758dXe.EZpvd.AhwBna(str2);
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = c13758dXe;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = str2;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = walletEntity2;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.I$0 = i;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 3;
                objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, importWalletAvailableChecker$checkHdAddAccountAvailable$12);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                C13758dXe c13758dXe3 = c13758dXe;
                str3 = str2;
                walletEntity = walletEntity2;
                objAwait2 = objAwait;
                c13758dXe2 = c13758dXe3;
                java.lang.String str42 = (java.lang.String) objAwait2;
                xXW xxw2 = xXW.OLrzqt;
                Intrinsics.copydefault((java.lang.Object) str42);
                java.lang.String strAEQbTJ2 = xxw2.AEQbTJ(str3, str42, walletEntity.getData(), true);
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = null;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = null;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = null;
                importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 4;
                objAwait2 = checkWalletImportAvailable$default(c13758dXe2, strAEQbTJ2, i, null, importWalletAvailableChecker$checkHdAddAccountAvailable$12, 4, null);
                if (objAwait2 != objCopydefault) {
                }
            }
            int iIntValue = ((java.lang.Integer) objAwait2).intValue() + 1;
            AbstractC58260yxt<WalletEntity> abstractC58260yxtIsConnected = c13758dXe.AEQbTJ.isConnected(str);
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = c13758dXe;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = str2;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = null;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.I$0 = iIntValue;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 2;
            java.lang.Object objAwait3 = RxAwaitKt.await(abstractC58260yxtIsConnected, importWalletAvailableChecker$checkHdAddAccountAvailable$12);
            if (objAwait3 == objCopydefault) {
                return objCopydefault;
            }
            objAwait2 = objAwait3;
            i = iIntValue;
            WalletEntity walletEntity22 = (WalletEntity) objAwait2;
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna2 = c13758dXe.EZpvd.AhwBna(str2);
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$0 = c13758dXe;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$1 = str2;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.L$2 = walletEntity22;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.I$0 = i;
            importWalletAvailableChecker$checkHdAddAccountAvailable$12.label = 3;
            objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna2, importWalletAvailableChecker$checkHdAddAccountAvailable$12);
            if (objAwait != objCopydefault) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                java.lang.Boolean bool = (java.lang.Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
    }

    public final java.lang.Object KWHzl(KeystoneAddressInfo keystoneAddressInfo, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (!C14728dqt.KWHzl.KWHzl()) {
            return C56443yFo.KWHzl(true);
        }
        if (keystoneAddressInfo == null) {
            return C56443yFo.KWHzl(false);
        }
        java.lang.Long chainId = keystoneAddressInfo.getChainId();
        long jLongValue = chainId != null ? chainId.longValue() : 0L;
        java.lang.String address = keystoneAddressInfo.getAddress();
        if (address == null) {
            address = "";
        }
        return copydefault(jLongValue, address, WalletType.getServerWalletType$default(WalletType.HardwareWallet, false, C56443yFo.AEQbTJ(HardwareType.Keystone.ordinal()), 1, null), continuation);
    }

    public final java.lang.Object EZpvd(ChainAddress chainAddress, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (!C14728dqt.KWHzl.KWHzl()) {
            return C56443yFo.KWHzl(true);
        }
        return copydefault(chainAddress, WalletType.getServerWalletType$default(WalletType.HardwareWallet, false, C56443yFo.AEQbTJ(HardwareType.OneKey.ordinal()), 1, null), continuation);
    }

    public final java.lang.Object copydefault(ChainAddress chainAddress, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt;
        if (!C14728dqt.KWHzl.KWHzl()) {
            return C56443yFo.KWHzl(true);
        }
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null || (bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ.OLrzqt()) == null) {
            return C56443yFo.KWHzl(true);
        }
        return copydefault(chainAddress, WalletType.getServerWalletType$default(WalletType.HardwareWallet, false, C56443yFo.AEQbTJ(HardwareType.Companion.copydefault(bluetoothDeviceModelOLrzqt.getUuid()).ordinal()), 1, null), continuation);
    }

    public final java.lang.Object copydefault(ChainAddress chainAddress, int i, Continuation<? super java.lang.Boolean> continuation) {
        if (chainAddress == null) {
            return C56443yFo.KWHzl(false);
        }
        return copydefault(chainAddress.getChainId(), chainAddress.getAddress(), i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, java.lang.String str, int i, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ImportWalletAvailableChecker$checkResult$1 importWalletAvailableChecker$checkResult$1;
        if (continuation instanceof ImportWalletAvailableChecker$checkResult$1) {
            importWalletAvailableChecker$checkResult$1 = (ImportWalletAvailableChecker$checkResult$1) continuation;
            int i2 = importWalletAvailableChecker$checkResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                importWalletAvailableChecker$checkResult$1.label = i2 - Integer.MIN_VALUE;
            } else {
                importWalletAvailableChecker$checkResult$1 = new ImportWalletAvailableChecker$checkResult$1(this, continuation);
            }
        }
        ImportWalletAvailableChecker$checkResult$1 importWalletAvailableChecker$checkResult$12 = importWalletAvailableChecker$checkResult$1;
        java.lang.Object objAEQbTJ = importWalletAvailableChecker$checkResult$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = importWalletAvailableChecker$checkResult$12.label;
        boolean z = true;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C13934dbu c13934dbu = this.copydefault;
            importWalletAvailableChecker$checkResult$12.label = 1;
            objAEQbTJ = c13934dbu.AEQbTJ(j, str, i, importWalletAvailableChecker$checkResult$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (abstractC43419rot.EZpvd()) {
            AbstractC43419rot.StateListAnimator stateListAnimator = abstractC43419rot instanceof AbstractC43419rot.StateListAnimator ? (AbstractC43419rot.StateListAnimator) abstractC43419rot : null;
            if (stateListAnimator == null || ((java.lang.Number) stateListAnimator.KWHzl()).intValue() != 1) {
            }
        } else {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2 importWalletAvailableChecker$checkPrivKeyImportAvailable$2;
        boolean zBooleanValue;
        if (continuation instanceof ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2) {
            importWalletAvailableChecker$checkPrivKeyImportAvailable$2 = (ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2) continuation;
            int i = importWalletAvailableChecker$checkPrivKeyImportAvailable$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                importWalletAvailableChecker$checkPrivKeyImportAvailable$2.label = i - Integer.MIN_VALUE;
            } else {
                importWalletAvailableChecker$checkPrivKeyImportAvailable$2 = new ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2(this, continuation);
            }
        }
        ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2 importWalletAvailableChecker$checkPrivKeyImportAvailable$22 = importWalletAvailableChecker$checkPrivKeyImportAvailable$2;
        java.lang.Object objCopydefault = importWalletAvailableChecker$checkPrivKeyImportAvailable$22.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = importWalletAvailableChecker$checkPrivKeyImportAvailable$22.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (!C14728dqt.KWHzl.KWHzl()) {
                return C56443yFo.KWHzl(true);
            }
            C13853daS c13853daS = (C13853daS) CollectionsKt___CollectionsKt.firstOrNull(C13847daM.Companion.KWHzl(str));
            zBooleanValue = false;
            if (c13853daS != null) {
                long jFetchVPNInfo = c13853daS.copydefault().fetchVPNInfo();
                java.lang.String strOLrzqt = c13853daS.OLrzqt();
                int serverWalletType$default = WalletType.getServerWalletType$default(WalletType.KeyWallet, false, null, 3, null);
                importWalletAvailableChecker$checkPrivKeyImportAvailable$22.label = 1;
                objCopydefault = copydefault(jFetchVPNInfo, strOLrzqt, serverWalletType$default, importWalletAvailableChecker$checkPrivKeyImportAvailable$22);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static /* synthetic */ java.lang.Object checkWalletImportAvailable$default(C13758dXe c13758dXe, java.lang.String str, int i, WalletType walletType, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            walletType = WalletType.HDWallet;
        }
        return c13758dXe.AEQbTJ(str, i, walletType, continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.constant.WalletType.getServerWalletType$default(com.okinc.business.defi.biz.constant.WalletType, boolean, java.lang.Integer, int, java.lang.Object):int */
    public final java.lang.Object AEQbTJ(java.lang.String str, int i, WalletType walletType, Continuation<? super java.lang.Boolean> continuation) {
        java.util.List<CoinAddressBean> addressList;
        CoinAddressBean coinAddressBean;
        java.lang.String address;
        WalletType walletType2 = WalletType.TonWallet;
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(walletType == walletType2 ? 607L : 1L);
        if (c10854bwMCopydefault == null) {
            return C56443yFo.KWHzl(true);
        }
        WalletAddressList walletAddressListKWHzl = C54908xZu.AEQbTJ.KWHzl(str, MnemonicKt.MnemonicLanguageEnglish, c10854bwMCopydefault.QKVWgx(), c10854bwMCopydefault.fetchVPNInfo(), i, AddressType.Legacy.getValue(), c10854bwMCopydefault.iwGUEr(), (MLKEMEngine.KyberPolyBytes & 128) != 0, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? false : walletType == walletType2, "");
        if (walletAddressListKWHzl == null || (addressList = walletAddressListKWHzl.getAddressList()) == null || (coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(addressList)) == null || (address = coinAddressBean.getAddress()) == null) {
            return C56443yFo.KWHzl(false);
        }
        return copydefault(c10854bwMCopydefault.fetchVPNInfo(), address, WalletType.getServerWalletType$default(walletType, false, null, 3, null), continuation);
    }
}
