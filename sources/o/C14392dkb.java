package o;

import androidx.lifecycle.ViewModelProvider;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.CloudBackupWalletType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.common.track.CloudBackupEventCode;
import com.okinc.business.defi.common.track.CloudBackupEventType;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC13652dTg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14392dkb {
    public static java.lang.Long EZpvd;
    public static final int KWHzl;
    public static java.lang.String copydefault;
    public static final C14392dkb AEQbTJ = new C14392dkb();
    public static final java.lang.String OLrzqt = "DriveBackupUtils";

    /* JADX INFO: renamed from: o.dkb$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.List<? extends HDWalletCloudBackupBean>> {
    }

    private C14392dkb() {
    }

    static {
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMIsConnected = c10954byG.valueOf().isConnected();
        copydefault = java.lang.String.valueOf(c10854bwMIsConnected != null ? c10854bwMIsConnected.AEQbTJ() : 3L);
        C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault(607L);
        EZpvd = c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AEQbTJ()) : null;
        KWHzl = 8;
    }

    public final boolean djBIcL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC13652dTg) C43251rlk.copydefault(InterfaceC13652dTg.class)).AEQbTJ(context);
    }

    public final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (KWHzl(context)) {
            return 1;
        }
        return djBIcL(context) ? 2 : 0;
    }

    public final InterfaceC14373dkI EZpvd(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC54843xXj interfaceC54843xXj = (InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class);
        if (i == 1) {
            return interfaceC54843xXj.KWHzl(context);
        }
        if (i != 2) {
            return null;
        }
        return interfaceC54843xXj.gEmmrt(context);
    }

    public final HDWalletCloudBackupBean copydefault(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        HDWalletCloudBackupBean hDWalletCloudBackupBean = new HDWalletCloudBackupBean(null, null, null, null, 15, null);
        hDWalletCloudBackupBean.setCreateTime(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        hDWalletCloudBackupBean.setModifyTime(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String strEZpvd = xXX.EZpvd.EZpvd(str2);
        hDWalletCloudBackupBean.setPasswordHash(strEZpvd);
        if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
            HDWalletBackupTypeBean hDWalletBackupTypeBean = new HDWalletBackupTypeBean(0, null, null, null, null, 31, null);
            hDWalletBackupTypeBean.setWalletType(abstractC12784ctX.fJNWhG().ordinal());
            java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (((AbstractC12782ctV) obj).finit() == 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                pUU.copydefault(OLrzqt, "the index = 0 wallet is empty");
                throw WalletImportError.Companion.EZpvd();
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            if (str.length() > 0) {
                xXX xxx = xXX.EZpvd;
                java.lang.String strAEQbTJ = xXW.OLrzqt.AEQbTJ(str, xxx.EZpvd(str), abstractC12782ctV.RlQdEF(), true);
                if (strAEQbTJ.length() == 0) {
                    WalletImportError walletImportErrorEZpvd = WalletImportError.Companion.EZpvd();
                    C10856bwO.EZpvd(OLrzqt, walletImportErrorEZpvd);
                    throw walletImportErrorEZpvd;
                }
                if (!xYS.copydefault.copydefault(strAEQbTJ).getValidate()) {
                    WalletImportError walletImportErrorOLrzqt = WalletImportError.Companion.OLrzqt("seed is in validate", 1);
                    C10856bwO.EZpvd(OLrzqt, walletImportErrorOLrzqt);
                    throw walletImportErrorOLrzqt;
                }
                hDWalletBackupTypeBean.setEncryptData(xxx.AEQbTJ(str2, strEZpvd, strAEQbTJ, true));
            }
            java.util.ArrayList<HDWalletBackupAddressBean> arrayList2 = new java.util.ArrayList<>(abstractC12782ctV.valueOf().size());
            for (ChainAddress chainAddress : abstractC12782ctV.valueOf()) {
                if (chainAddress.getAddress().length() > 0) {
                    HDWalletBackupAddressBean hDWalletBackupAddressBean = new HDWalletBackupAddressBean(null, null, 3, null);
                    hDWalletBackupAddressBean.setChainId(java.lang.String.valueOf(chainAddress.getCoinId()));
                    hDWalletBackupAddressBean.setAddress(chainAddress.getAddress());
                    arrayList2.add(hDWalletBackupAddressBean);
                }
            }
            hDWalletBackupTypeBean.setAddressList(arrayList2);
            hDWalletBackupTypeBean.setWalletName(abstractC12784ctX.AuCTel());
            hDWalletBackupTypeBean.setWalletAccount(abstractC12782ctV.AkhnZx());
            hDWalletCloudBackupBean.setBackupTypeBean(hDWalletBackupTypeBean);
            return hDWalletCloudBackupBean;
        }
        pUU.copydefault(OLrzqt, "don`t support this type wallet");
        throw WalletImportError.Companion.EZpvd();
    }

    public final boolean copydefault(HDWalletCloudBackupBean hDWalletCloudBackupBean, HDWalletCloudBackupBean hDWalletCloudBackupBean2) {
        HDWalletBackupTypeBean backupTypeBean;
        HDWalletBackupAddressBean hDWalletBackupAddressBean;
        java.util.ArrayList<HDWalletBackupAddressBean> addressList;
        java.lang.Object next;
        java.util.List listAhwBna;
        java.util.ArrayList<HDWalletBackupAddressBean> addressList2;
        HDWalletBackupAddressBean hDWalletBackupAddressBean2;
        java.util.ArrayList<HDWalletBackupAddressBean> addressList3;
        java.lang.Object next2;
        HDWalletBackupTypeBean backupTypeBean2 = hDWalletCloudBackupBean.getBackupTypeBean();
        HDWalletBackupAddressBean hDWalletBackupAddressBean3 = null;
        java.lang.Object obj = null;
        HDWalletBackupAddressBean hDWalletBackupAddressBean4 = null;
        java.lang.Object obj2 = null;
        java.lang.Integer numValueOf = backupTypeBean2 != null ? java.lang.Integer.valueOf(backupTypeBean2.getWalletType()) : null;
        HDWalletBackupTypeBean backupTypeBean3 = hDWalletCloudBackupBean2.getBackupTypeBean();
        if (!Intrinsics.EZpvd(numValueOf, backupTypeBean3 != null ? java.lang.Integer.valueOf(backupTypeBean3.getWalletType()) : null)) {
            return false;
        }
        HDWalletBackupTypeBean backupTypeBean4 = hDWalletCloudBackupBean2.getBackupTypeBean();
        java.lang.Integer numValueOf2 = backupTypeBean4 != null ? java.lang.Integer.valueOf(backupTypeBean4.getWalletType()) : null;
        int iOrdinal = WalletType.HDWallet.ordinal();
        if (numValueOf2 != null && numValueOf2.intValue() == iOrdinal) {
            HDWalletBackupTypeBean backupTypeBean5 = hDWalletCloudBackupBean2.getBackupTypeBean();
            if (backupTypeBean5 == null) {
                return false;
            }
            HDWalletBackupTypeBean backupTypeBean6 = hDWalletCloudBackupBean.getBackupTypeBean();
            if (backupTypeBean6 == null || (addressList3 = backupTypeBean6.getAddressList()) == null) {
                hDWalletBackupAddressBean2 = null;
            } else {
                java.util.Iterator<T> it = addressList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((HDWalletBackupAddressBean) next2).getChainId(), (java.lang.Object) copydefault)) {
                        break;
                    }
                }
                hDWalletBackupAddressBean2 = (HDWalletBackupAddressBean) next2;
            }
            java.util.ArrayList<HDWalletBackupAddressBean> addressList4 = backupTypeBean5.getAddressList();
            if (addressList4 != null) {
                java.util.Iterator<T> it2 = addressList4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((HDWalletBackupAddressBean) next3).getChainId(), (java.lang.Object) copydefault)) {
                        obj = next3;
                        break;
                    }
                }
                hDWalletBackupAddressBean4 = (HDWalletBackupAddressBean) obj;
            }
            if (hDWalletBackupAddressBean2 == null || hDWalletBackupAddressBean4 == null || !Intrinsics.EZpvd((java.lang.Object) hDWalletBackupAddressBean2.getAddress(), (java.lang.Object) hDWalletBackupAddressBean4.getAddress())) {
                return false;
            }
        } else {
            int iOrdinal2 = WalletType.KeyWallet.ordinal();
            if (numValueOf2 != null && numValueOf2.intValue() == iOrdinal2) {
                HDWalletBackupTypeBean backupTypeBean7 = hDWalletCloudBackupBean.getBackupTypeBean();
                if (backupTypeBean7 == null || (listAhwBna = backupTypeBean7.getAddressList()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                java.util.HashSet hashSet = new java.util.HashSet(listAhwBna.size());
                java.util.Iterator it3 = listAhwBna.iterator();
                while (it3.hasNext()) {
                    hashSet.add(((HDWalletBackupAddressBean) it3.next()).getAddress());
                }
                HDWalletBackupTypeBean backupTypeBean8 = hDWalletCloudBackupBean2.getBackupTypeBean();
                if (backupTypeBean8 != null && (addressList2 = backupTypeBean8.getAddressList()) != null) {
                    java.util.Iterator<T> it4 = addressList2.iterator();
                    while (it4.hasNext()) {
                        hashSet.remove(((HDWalletBackupAddressBean) it4.next()).getAddress());
                    }
                }
                if (hashSet.size() != 0) {
                    return false;
                }
            } else {
                int iOrdinal3 = WalletType.TonWallet.ordinal();
                if (numValueOf2 == null || numValueOf2.intValue() != iOrdinal3 || (backupTypeBean = hDWalletCloudBackupBean2.getBackupTypeBean()) == null) {
                    return false;
                }
                HDWalletBackupTypeBean backupTypeBean9 = hDWalletCloudBackupBean.getBackupTypeBean();
                if (backupTypeBean9 == null || (addressList = backupTypeBean9.getAddressList()) == null) {
                    hDWalletBackupAddressBean = null;
                } else {
                    java.util.Iterator<T> it5 = addressList.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((HDWalletBackupAddressBean) next).getChainId(), (java.lang.Object) java.lang.String.valueOf(EZpvd))) {
                            break;
                        }
                    }
                    hDWalletBackupAddressBean = (HDWalletBackupAddressBean) next;
                }
                java.util.ArrayList<HDWalletBackupAddressBean> addressList5 = backupTypeBean.getAddressList();
                if (addressList5 != null) {
                    java.util.Iterator<T> it6 = addressList5.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next4 = it6.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((HDWalletBackupAddressBean) next4).getChainId(), (java.lang.Object) java.lang.String.valueOf(EZpvd))) {
                            obj2 = next4;
                            break;
                        }
                    }
                    hDWalletBackupAddressBean3 = (HDWalletBackupAddressBean) obj2;
                }
                if (hDWalletBackupAddressBean == null || hDWalletBackupAddressBean3 == null || !Intrinsics.EZpvd((java.lang.Object) hDWalletBackupAddressBean.getAddress(), (java.lang.Object) hDWalletBackupAddressBean3.getAddress())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final java.util.List<HDWalletCloudBackupBean> copydefault(@NotNull java.lang.String str, int i) {
        java.lang.String fileContentByFileName$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (i == 1) {
            fileContentByFileName$default = C11573cTg.getFileContentByFileName$default(C11573cTg.KWHzl, str, false, 2, null);
        } else if (i == 2) {
            fileContentByFileName$default = InterfaceC13652dTg.Activity.getFileContentByFileName$default((InterfaceC13652dTg) C43248rlh.KWHzl.AEQbTJ(InterfaceC13652dTg.class), str, false, 2, null);
        }
        if (!C59449zhJ.startsWith$default(fileContentByFileName$default, "[", false, 2, null)) {
            return yDY.AhwBna();
        }
        java.lang.Object objFromJson = C14637dpH.getGson$default(null, 1, null).fromJson(fileContentByFileName$default, new StateListAnimator().getType());
        Intrinsics.copydefault(objFromJson);
        return (java.util.List) objFromJson;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        java.lang.String json;
        java.lang.String walletName;
        java.lang.String walletAccount;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        java.util.List<HDWalletCloudBackupBean> listCopydefault = copydefault(str, i);
        boolean zIsEmpty = listCopydefault.isEmpty();
        if (zIsEmpty) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(hDWalletCloudBackupBean);
            java.lang.String json2 = C14637dpH.getGson$default(null, 1, null).toJson(arrayList);
            Intrinsics.copydefault((java.lang.Object) json2);
            return json2;
        }
        if (zIsEmpty) {
            throw new NoWhenBranchMatchedException();
        }
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (true) {
            if (it.hasNext()) {
                HDWalletCloudBackupBean hDWalletCloudBackupBean2 = (HDWalletCloudBackupBean) it.next();
                if (copydefault(hDWalletCloudBackupBean2, hDWalletCloudBackupBean)) {
                    HDWalletBackupTypeBean backupTypeBean = hDWalletCloudBackupBean2.getBackupTypeBean();
                    if (backupTypeBean != null) {
                        HDWalletBackupTypeBean backupTypeBean2 = hDWalletCloudBackupBean.getBackupTypeBean();
                        if (backupTypeBean2 == null || (walletAccount = backupTypeBean2.getWalletAccount()) == null) {
                            walletAccount = "";
                        }
                        backupTypeBean.setWalletAccount(walletAccount);
                    }
                    HDWalletBackupTypeBean backupTypeBean3 = hDWalletCloudBackupBean2.getBackupTypeBean();
                    if (backupTypeBean3 != null) {
                        HDWalletBackupTypeBean backupTypeBean4 = hDWalletCloudBackupBean.getBackupTypeBean();
                        if (backupTypeBean4 != null && (walletName = backupTypeBean4.getWalletName()) != null) {
                            str2 = walletName;
                        }
                        backupTypeBean3.setWalletName(str2);
                    }
                    hDWalletCloudBackupBean2.setModifyTime(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                    json = C14637dpH.getGson$default(null, 1, null).toJson(listCopydefault);
                }
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(listCopydefault.size() + 1);
                arrayList2.addAll(listCopydefault);
                arrayList2.add(hDWalletCloudBackupBean);
                json = C14637dpH.getGson$default(null, 1, null).toJson(arrayList2);
                break;
            }
        }
        Intrinsics.copydefault((java.lang.Object) json);
        return json;
    }

    public final java.util.List<HDWalletCloudBackupBean> EZpvd(@NotNull java.lang.String str, int i, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        java.util.List<HDWalletCloudBackupBean> listCopydefault = copydefault(str, i);
        if (!listCopydefault.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(listCopydefault.size());
            boolean z = false;
            for (HDWalletCloudBackupBean hDWalletCloudBackupBean2 : listCopydefault) {
                if (AEQbTJ.copydefault(hDWalletCloudBackupBean2, hDWalletCloudBackupBean)) {
                    z = true;
                } else {
                    arrayList.add(hDWalletCloudBackupBean2);
                }
            }
            if (z) {
                return arrayList;
            }
            throw new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabCount));
        }
        throw new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabCount));
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        return Intrinsics.EZpvd((java.lang.Object) hDWalletCloudBackupBean.getPasswordHash(), (java.lang.Object) xXX.EZpvd.EZpvd(str));
    }

    public final void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC14457dln interfaceC14457dln, final int i, @NotNull final Function2<? super AbstractC12782ctV, ? super java.lang.String, Unit> function2) {
        final CloudBackupWalletType cloudBackupWalletType;
        HDWalletBackupAddressBean hDWalletBackupAddressBean;
        java.lang.String chainId;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function2, "");
        HDWalletBackupTypeBean backupTypeBean = hDWalletCloudBackupBean.getBackupTypeBean();
        if (backupTypeBean != null && backupTypeBean.getWalletType() == WalletType.TonWallet.ordinal()) {
            cloudBackupWalletType = CloudBackupWalletType.TON;
        } else {
            cloudBackupWalletType = CloudBackupWalletType.HD;
        }
        java.lang.String strEZpvd = xXX.EZpvd.EZpvd(str);
        if (!Intrinsics.EZpvd((java.lang.Object) hDWalletCloudBackupBean.getPasswordHash(), (java.lang.Object) strEZpvd)) {
            C14493dmW.KWHzl(cloudBackupWalletType, CloudBackupEventType.RecoverCloudBackupWallet, "", "Password hash mismatch", false, CloudBackupEventCode.PASSWORD_HASH_MISMATCH, i, (128 & 128) != 0 ? "" : null);
            pUU.copydefault(OLrzqt, " error message :backup password is error");
            function2.invoke(null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
            return;
        }
        HDWalletBackupTypeBean backupTypeBean2 = hDWalletCloudBackupBean.getBackupTypeBean();
        if (backupTypeBean2 != null) {
            java.lang.String strAEQbTJ = xXW.OLrzqt.AEQbTJ(str, strEZpvd, backupTypeBean2.getEncryptData(), true);
            if (strAEQbTJ.length() == 0) {
                C10856bwO.EZpvd(OLrzqt, WalletImportError.Companion.OLrzqt("seed phrase is null", 1));
                C14493dmW.KWHzl(cloudBackupWalletType, CloudBackupEventType.RecoverCloudBackupWallet, "", "seed phrase is null", false, CloudBackupEventCode.EMPTY_MNEMONIC, i, (128 & 128) != 0 ? "" : null);
                function2.invoke(null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
                return;
            }
            if (!xYS.copydefault.copydefault(strAEQbTJ).getValidate()) {
                C10856bwO.EZpvd(OLrzqt, WalletImportError.Companion.OLrzqt("seed is in validate", 1));
                C14493dmW.KWHzl(cloudBackupWalletType, CloudBackupEventType.RecoverCloudBackupWallet, "", "seed is in validate", false, CloudBackupEventCode.INVALID_MNEMONIC, i, (128 & 128) != 0 ? "" : null);
                function2.invoke(null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
                return;
            }
            C19631gJn c19631gJn = (C19631gJn) new ViewModelProvider(abstractActivityC33041mov).get(C19631gJn.class);
            int walletType = backupTypeBean2.getWalletType();
            if (walletType == WalletType.HDWallet.ordinal()) {
                c19631gJn.KWHzl(str2, strAEQbTJ, i == 1, i == 2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.dkh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14392dkb.KWHzl(cloudBackupWalletType, i, function2, (AbstractC12782ctV) obj);
                    }
                });
                return;
            }
            if (walletType == WalletType.KeyWallet.ordinal()) {
                java.util.ArrayList<HDWalletBackupAddressBean> addressList = backupTypeBean2.getAddressList();
                long jValueOf = (addressList == null || (hDWalletBackupAddressBean = (HDWalletBackupAddressBean) CollectionsKt___CollectionsKt.AuCTelauCTel(addressList)) == null || (chainId = hDWalletBackupAddressBean.getChainId()) == null) ? -1L : C33129mqd.valueOf(chainId);
                if (jValueOf < 0) {
                    return;
                }
                c19631gJn.AEQbTJ(str2, jValueOf, strAEQbTJ, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.dkg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14392dkb.EZpvd(cloudBackupWalletType, i, function2, (AbstractC12782ctV) obj);
                    }
                });
                return;
            }
            if (walletType == WalletType.TonWallet.ordinal()) {
                c19631gJn.AEQbTJ(str2, strAEQbTJ, i == 1, i == 2, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.dke
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14392dkb.valueOf(cloudBackupWalletType, i, function2, (AbstractC12782ctV) obj);
                    }
                });
            }
        }
    }

    public static final Unit KWHzl(CloudBackupWalletType cloudBackupWalletType, int i, Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.RecoverCloudBackupWallet;
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, strDbNXlk == null ? "" : strDbNXlk, abstractC12782ctV != null ? "success" : EopTrackEvent.KEY_RESULT_FAILED, abstractC12782ctV != null, abstractC12782ctV != null ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, i, (128 & 128) != 0 ? "" : null);
        function2.invoke(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(CloudBackupWalletType cloudBackupWalletType, int i, Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.RecoverCloudBackupWallet;
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, strDbNXlk == null ? "" : strDbNXlk, abstractC12782ctV != null ? "success" : EopTrackEvent.KEY_RESULT_FAILED, abstractC12782ctV != null, abstractC12782ctV != null ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, i, (128 & 128) != 0 ? "" : null);
        function2.invoke(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(CloudBackupWalletType cloudBackupWalletType, int i, Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        CloudBackupEventType cloudBackupEventType = CloudBackupEventType.RecoverCloudBackupWallet;
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        C14493dmW.KWHzl(cloudBackupWalletType, cloudBackupEventType, strDbNXlk == null ? "" : strDbNXlk, abstractC12782ctV != null ? "success" : EopTrackEvent.KEY_RESULT_FAILED, abstractC12782ctV != null, abstractC12782ctV != null ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, i, (128 & 128) != 0 ? "" : null);
        function2.invoke(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    public final InterfaceC14334djW OLrzqt(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC54843xXj interfaceC54843xXj = (InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class);
        if (i == 1) {
            return interfaceC54843xXj.valueOf(context);
        }
        if (i != 2) {
            return null;
        }
        return interfaceC54843xXj.djBIcL(context);
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).KWHzl(context, i);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).OLrzqt(context, i);
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).OLrzqt(context);
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC54843xXj interfaceC54843xXj = (InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class);
        if (i != 1) {
            return i != 2 ? "" : interfaceC54843xXj.AYXKKw(context);
        }
        return interfaceC54843xXj.copydefault(context);
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).EZpvd(context);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).AEQbTJ(context);
    }

    public final android.graphics.drawable.Drawable OLrzqt(int i) {
        InterfaceC54843xXj interfaceC54843xXj = (InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class);
        if (i == 1) {
            return interfaceC54843xXj.KWHzl();
        }
        if (i != 2) {
            return null;
        }
        return interfaceC54843xXj.EZpvd();
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).AEQbTJ(context, str);
    }

    public final boolean OLrzqt() {
        return ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).AEQbTJ();
    }
}
