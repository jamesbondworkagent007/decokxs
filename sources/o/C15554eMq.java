package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1;
import com.okinc.business.defi.wallet.home.CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C10614brl;
import o.C13754dXa;
import o.C15554eMq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15554eMq {
    public static final C15554eMq KWHzl = new C15554eMq();

    /* JADX INFO: renamed from: o.eMq$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.ConnectWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    private C15554eMq() {
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.zLjUOn()) {
            if (abstractC12782ctV.htlTjW()) {
                fPH.showOwnerCheckFailedDialog$default(fPH.OLrzqt, abstractActivityC33041mov, abstractC12782ctV.fFgQHt(), 0, null, 8, null);
                return;
            }
            java.lang.Object obj = null;
            switch (Activity.EZpvd[abstractC12782ctV.QwvEab().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (abstractC12782ctV.AEQbTJ(WalletType.KeyWallet)) {
                        ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
                        if (chainAddress != null) {
                            showToast$default(this, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, "", chainAddress.getAddress(), null, 32, null);
                            break;
                        }
                    } else {
                        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
                        if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) "-9223372036854775808")) {
                            copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV);
                        } else {
                            java.util.Iterator<T> it = abstractC12782ctV.OFhtUX().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    java.lang.Object next = it.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((C10854bwM) next).AEQbTJ()), (java.lang.Object) walletSelectedChainBeanKWHzl.getChainId())) {
                                        obj = next;
                                    }
                                }
                            }
                            C10854bwM c10854bwM = (C10854bwM) obj;
                            if (c10854bwM != null && c10854bwM.fHqPtx() && c10854bwM.DGgnkA()) {
                                AEQbTJ(abstractC12782ctV, c10854bwM, fragmentManager);
                            } else if (c10854bwM != null && c10854bwM.dxcTrN()) {
                                copydefault(abstractC12782ctV, c10854bwM, fragmentManager);
                            } else {
                                copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV);
                            }
                        }
                        break;
                    }
                    break;
                case 4:
                case 5:
                    ChainAddress chainAddress2 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
                    if (chainAddress2 != null) {
                        showToast$default(this, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, "", chainAddress2.getAddress(), null, 32, null);
                        break;
                    }
                    break;
                case 6:
                case 7:
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(abstractC12782ctV.flVtFt());
                    if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
                        if (c10854bwMKWHzl.iRxXKY()) {
                            copydefault(abstractC12782ctV, c10854bwMKWHzl, fragmentManager);
                        } else {
                            copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV);
                        }
                        break;
                    } else {
                        WalletSelectedChainBean walletSelectedChainBeanKWHzl2 = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
                        ChainAddress chainAddress3 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
                        if (chainAddress3 != null) {
                            if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl2.getChainId(), (java.lang.Object) "-9223372036854775808")) {
                                showToast$default(this, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, "", chainAddress3.getAddress(), null, 32, null);
                            } else {
                                java.util.Iterator<T> it2 = abstractC12782ctV.OFhtUX().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        java.lang.Object next2 = it2.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((C10854bwM) next2).AEQbTJ()), (java.lang.Object) walletSelectedChainBeanKWHzl2.getChainId())) {
                                            obj = next2;
                                        }
                                    }
                                }
                                C10854bwM c10854bwM2 = (C10854bwM) obj;
                                if (c10854bwM2 != null && c10854bwM2.fHqPtx() && c10854bwM2.DGgnkA()) {
                                    AEQbTJ(abstractC12782ctV, c10854bwM2, fragmentManager);
                                } else {
                                    showToast$default(this, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, "", chainAddress3.getAddress(), null, 32, null);
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 8:
                    if (abstractC12782ctV.EZpvd().size() <= 1) {
                        ChainAddress chainAddress4 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
                        if (chainAddress4 != null) {
                            showToast$default(this, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, "", chainAddress4.getAddress(), null, 32, null);
                            break;
                        }
                    } else {
                        WalletSelectedChainBean walletSelectedChainBeanKWHzl3 = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
                        if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl3.getChainId(), (java.lang.Object) "-9223372036854775808")) {
                            copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV);
                        } else {
                            java.util.Iterator<T> it3 = abstractC12782ctV.OFhtUX().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    java.lang.Object next3 = it3.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((C10854bwM) next3).AEQbTJ()), (java.lang.Object) walletSelectedChainBeanKWHzl3.getChainId())) {
                                        obj = next3;
                                    }
                                }
                            }
                            C10854bwM c10854bwM3 = (C10854bwM) obj;
                            if (c10854bwM3 != null && c10854bwM3.fHqPtx() && c10854bwM3.DGgnkA()) {
                                AEQbTJ(abstractC12782ctV, c10854bwM3, fragmentManager);
                            } else if (c10854bwM3 != null && c10854bwM3.dxcTrN()) {
                                copydefault(abstractC12782ctV, c10854bwM3, fragmentManager);
                            } else {
                                copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV);
                            }
                        }
                        break;
                    }
                    break;
            }
            return;
        }
        C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, fragmentManager, abstractC12782ctV, null, 8, null);
    }

    public final void copydefault(final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final androidx.fragment.app.FragmentManager fragmentManager) {
        try {
            java.util.List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listOFhtUX) {
                if (((C10854bwM) obj).iRxXKY()) {
                    arrayList.add(obj);
                }
            }
            AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> abstractC58260yxtCopydefault = copydefault(abstractC12782ctV, arrayList);
            final Function1 function1 = new Function1() { // from class: o.eMu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C15554eMq.AEQbTJ(abstractC12782ctV, fragmentManager, c10854bwM, (java.util.List) obj2);
                }
            };
            InterfaceC58227yxM<? super java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eMv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C15554eMq.KWHzl(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eMA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C15554eMq.KWHzl((java.lang.Throwable) obj2);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eMx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C15554eMq.AYXKKw(function12, obj2);
                }
            }));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("CopyWalletAddressDialogHelper", "performCopyAddress error:" + e.getMessage(), e);
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV, androidx.fragment.app.FragmentManager fragmentManager, C10854bwM c10854bwM, java.util.List list) {
        java.util.ArrayList<QuickCopyAddressItemBean> arrayList;
        java.lang.Object next;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10854bwM) ((kotlin.Pair) next).getFirst()).AhwBna() == c10854bwM.AhwBna()) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) next;
        java.util.List<AddressData> list2 = pair != null ? (java.util.List) pair.getSecond() : null;
        if (list2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (AddressData addressData : list2) {
                java.lang.String strAYXKKw = c10854bwM.AYXKKw();
                arrayList2.add(new QuickCopyAddressItemBean(addressData.getAddress(), 0L, c10854bwM.djBIcL(), strAYXKKw, c10854bwM.fJNWhG(), false, null, false, 0, false, addressData.getAddress().length() == 0, addressData.getAddressFormat(), addressData.getAddressType(), false, null, 25570, null));
            }
            arrayList = (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList2, new java.util.ArrayList());
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            eTF.Companion.AEQbTJ(arrayList, abstractC12782ctV.DbNXlk()).show(fragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, androidx.fragment.app.FragmentManager fragmentManager) {
        try {
            java.lang.String strEZpvd = abstractC12782ctV.EZpvd(196L);
            java.lang.String strAEQbTJ = c10854bwM.AEQbTJ(strEZpvd);
            QuickCopyAddressItemBean[] quickCopyAddressItemBeanArr = new QuickCopyAddressItemBean[2];
            QuickCopyAddressItemBean quickCopyAddressItemBean = new QuickCopyAddressItemBean(null, 0L, null, null, null, false, null, false, 0, false, false, null, 0, false, null, 32767, null);
            C17948fYf c17948fYf = C17948fYf.copydefault;
            quickCopyAddressItemBean.setAddress(c17948fYf.EZpvd() ? strAEQbTJ : strEZpvd);
            quickCopyAddressItemBean.setAddressTypeContent(C33070mpX.AYXKKw(c17948fYf.EZpvd() ? C13754dXa.FragmentManager.onSupportContentChanged : C13754dXa.FragmentManager.onSupportActionModeStarted));
            quickCopyAddressItemBean.setChainName(c10854bwM.djBIcL());
            quickCopyAddressItemBean.setCoinUrl(c10854bwM.copydefault());
            quickCopyAddressItemBean.setCoinId(c10854bwM.AhwBna());
            Unit unit = Unit.INSTANCE;
            quickCopyAddressItemBeanArr[0] = quickCopyAddressItemBean;
            QuickCopyAddressItemBean quickCopyAddressItemBean2 = new QuickCopyAddressItemBean(null, 0L, null, null, null, false, null, false, 0, false, false, null, 0, false, null, 32767, null);
            if (!c17948fYf.EZpvd()) {
                strEZpvd = strAEQbTJ;
            }
            quickCopyAddressItemBean2.setAddress(strEZpvd);
            quickCopyAddressItemBean2.setAddressTypeContent(C33070mpX.AYXKKw(c17948fYf.EZpvd() ? C13754dXa.FragmentManager.onSupportActionModeStarted : C13754dXa.FragmentManager.onSupportContentChanged));
            quickCopyAddressItemBean2.setChainName(c10854bwM.djBIcL());
            quickCopyAddressItemBean2.setCoinUrl(c10854bwM.copydefault());
            quickCopyAddressItemBean2.setCoinId(c10854bwM.AhwBna());
            quickCopyAddressItemBeanArr[1] = quickCopyAddressItemBean2;
            java.util.ArrayList<QuickCopyAddressItemBean> arrayList = (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(yDY.gEmmrt(quickCopyAddressItemBeanArr), new java.util.ArrayList());
            if (!fragmentManager.isStateSaved() && !fragmentManager.isDestroyed()) {
                eTF.Companion.AEQbTJ(arrayList, abstractC12782ctV.DbNXlk()).show(fragmentManager);
                return;
            }
            pUU.copydefault("CopyWalletAddressDialogHelper", "showCefiBindingResultPage: fragmentManager state is not valid");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("CopyWalletAddressDialogHelper", "showXLayerQuickCopyAddressDialog error:" + e.getMessage(), e);
        }
    }

    public static /* synthetic */ void showToast$default(C15554eMq c15554eMq, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            str3 = "";
        }
        c15554eMq.copydefault(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, str, str2, str3);
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, java.lang.String str, final java.lang.String str2, java.lang.String str3) {
        final java.lang.String strKWHzl;
        if (str.length() == 0) {
            strKWHzl = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
        } else if (str3.length() > 0) {
            strKWHzl = C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.getCallbacks, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainName", str), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str3)));
        } else {
            strKWHzl = C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.getView, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", str)));
        }
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        OLrzqt(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, new Function0() { // from class: o.eMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15554eMq.KWHzl(abstractActivityC33041mov, str2, strKWHzl);
            }
        });
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2) {
        KWHzl.copydefault(abstractActivityC33041mov, str);
        C19595gIe.Companion.AEQbTJ(str2, str).KWHzl(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, final AbstractC12782ctV abstractC12782ctV) {
        OLrzqt(abstractActivityC33041mov, fragmentManager, abstractC12782ctV, new Function0() { // from class: o.eMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15554eMq.EZpvd(abstractC12782ctV, abstractActivityC33041mov, fragmentManager);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd A[PHI: r10
  0x00dd: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String) binds: [B:32:0x0096, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        java.lang.String address;
        java.lang.Object obj = null;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
        if (!Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) "-9223372036854775808")) {
            java.util.Iterator<T> it = abstractC12782ctV.OFhtUX().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((C10854bwM) next).AEQbTJ()), (java.lang.Object) walletSelectedChainBeanKWHzl.getChainId())) {
                    break;
                }
            }
            C10854bwM c10854bwM = (C10854bwM) next;
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, null, 2, null);
            java.lang.String address2 = (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address;
            if (c10854bwM != null && !c10854bwM.iRxXKY() && !c10854bwM.AxsJAYaxsJAY() && address2.length() > 0) {
                showToast$default(KWHzl, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, c10854bwM.djBIcL(), address2, null, 32, null);
                return Unit.INSTANCE;
            }
            if (address2.length() == 0) {
                java.util.Iterator<T> it2 = abstractC12782ctV.AxsJAYsNCnLh().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(((ChainAddress) next2).getCoinId());
                    if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.copydefault() : Long.MIN_VALUE), (java.lang.Object) walletSelectedChainBeanKWHzl.getChainId())) {
                        obj = next2;
                        break;
                    }
                }
                ChainAddress chainAddress = (ChainAddress) obj;
                java.lang.String str = (chainAddress == null || (address2 = chainAddress.getAddress()) == null) ? "" : address2;
                CustomChainMeta customChainMetaEZpvd = C10598brV.AEQbTJ.EZpvd(C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId()));
                java.lang.String str2 = (customChainMetaEZpvd == null || (strOLrzqt = customChainMetaEZpvd.OLrzqt()) == null) ? "" : strOLrzqt;
                if (str.length() > 0 && str2.length() > 0) {
                    showToast$default(KWHzl, abstractActivityC33041mov, fragmentManager, abstractC12782ctV, str2, str, null, 32, null);
                    return Unit.INSTANCE;
                }
            }
        }
        C18088fbm.Companion.AEQbTJ(abstractC12782ctV.DbNXlk()).show(fragmentManager, "QuickCopyAddressDialogFragment");
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> copydefault(AbstractC12782ctV abstractC12782ctV, java.util.List<C10854bwM> list) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault;
        java.lang.String address;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C8301bAD c8301bAD = new C8301bAD();
        for (C10854bwM c10854bwM : list) {
            if (c8301bAD.AEQbTJ() == null) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jAhwBna = c10854bwM.AhwBna();
                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AhwBna(), null, 2, null);
                if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
                    address = "";
                }
                abstractC58260yxtCopydefault = c8301bAD.KWHzl(strDbNXlk, jAhwBna, address);
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(c8301bAD.AEQbTJ());
            }
            final StateListAnimator stateListAnimator = new StateListAnimator(c8301bAD, c10854bwM);
            arrayList.add(abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.eMz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15554eMq.OLrzqt(stateListAnimator, obj);
                }
            }));
        }
        return C11607cUn.KWHzl(arrayList);
    }

    /* JADX INFO: renamed from: o.eMq$StateListAnimator */
    public static final class StateListAnimator implements Function1<?, InterfaceC58261yxu<? extends kotlin.Pair<? extends C10854bwM, ? extends java.util.List<? extends AddressData>>>> {
        public final /* synthetic */ C10854bwM AEQbTJ;
        public final /* synthetic */ C8301bAD KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C8301bAD c8301bAD, C10854bwM c10854bwM) {
            this.KWHzl = c8301bAD;
            this.AEQbTJ = c10854bwM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Pair AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends kotlin.Pair<C10854bwM, java.util.List<AddressData>>> invoke(AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtEZpvd = this.KWHzl.EZpvd();
            final C10854bwM c10854bwM = this.AEQbTJ;
            final Function1 function1 = new Function1() { // from class: o.eMy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15554eMq.StateListAnimator.OLrzqt(c10854bwM, (java.util.List) obj);
                }
            };
            return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.eMB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15554eMq.StateListAnimator.AEQbTJ(function1, obj);
                }
            });
        }

        public static final kotlin.Pair OLrzqt(C10854bwM c10854bwM, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C56390yDp.OLrzqt(c10854bwM, list);
        }
    }

    public static final InterfaceC58261yxu OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, AbstractC12782ctV abstractC12782ctV, final Function0<Unit> function0) {
        fPH.handleShowAACopyBottomSheet$default(fPH.OLrzqt, fragmentManager, abstractC12782ctV, false, new Function0() { // from class: o.eMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15554eMq.EZpvd(abstractActivityC33041mov, function0);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0) {
        if (!(!abstractActivityC33041mov.isFinishing())) {
            abstractActivityC33041mov = null;
        }
        if (abstractActivityC33041mov != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        try {
            java.lang.Object systemService = abstractActivityC33041mov.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
        } catch (java.lang.Throwable unused) {
            pUU.copydefault("CopyWalletAddressDialogHelper", "Failed to copy address");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1 copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1) {
            copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1 = (CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1) continuation;
            int i = copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1 = new CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
                    pUU.copydefault("CopyWalletAddressDialogHelper", "Activity is finishing or destroyed, skipping dialog");
                    return Unit.INSTANCE;
                }
                if (fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
                    pUU.copydefault("CopyWalletAddressDialogHelper", "FragmentManager is destroyed or state saved, skipping dialog");
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1 copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1 = new CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1(str, null);
                copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.L$0 = fragmentManager;
                copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1, copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentManager = (androidx.fragment.app.FragmentManager) copyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objWithContext;
            WalletType walletTypeQwvEab = abstractC12782ctV.QwvEab();
            WalletType walletType = WalletType.HDWallet;
            if (walletTypeQwvEab == walletType || abstractC12782ctV.AEQbTJ(walletType)) {
                C18088fbm.Companion.AEQbTJ(abstractC12782ctV.DbNXlk()).show(fragmentManager, "QuickCopyAddressDialogFragment");
            } else {
                pUU.copydefault("CopyWalletAddressDialogHelper", "Wallet is not a HD Wallet or AA wallet of HD Wallet, skipping dialog");
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CopyWalletAddressDialogHelper", "Failed to show QuickCopyAddressDialogFragment: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
