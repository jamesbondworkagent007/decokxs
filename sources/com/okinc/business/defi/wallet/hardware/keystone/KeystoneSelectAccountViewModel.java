package com.okinc.business.defi.wallet.hardware.keystone;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AddressAsset;
import com.okinc.business.defi.biz.net.bean.AssetReq;
import com.okinc.business.defi.biz.net.bean.AssetRsp;
import com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel;
import com.okinc.business.defi.wallet.mine.data.DerviationEVM;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C10954byG;
import o.C12827cuN;
import o.C13754dXa;
import o.C13934dbu;
import o.C14079deg;
import o.C14140dfo;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54862xYb;
import o.C54880xYt;
import o.C55326xho;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C8322bAY;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.pUU;
import o.xZX;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class KeystoneSelectAccountViewModel extends AbstractC33073mpa {
    public AbstractC12784ctX AYXKKw;
    public String AkhnZx;
    public KeystoneMultiAccount EZpvd;
    public boolean KWHzl;
    public SortedMap<Integer, List<KeystoneAddressInfo>> fetchVPNInfo;
    public String gEmmrt;
    public final String valueOf = KeystoneSelectAccountViewModel.class.getName();
    public final C13934dbu AEQbTJ = new C13934dbu();
    public int djBIcL = 5;
    public int OLrzqt = -1;
    public final MutableLiveData<ArrayList<KeystoneAccountInfo>> copydefault = new MutableLiveData<>(yDY.copydefault(KeystoneAccountInfo.Companion.KWHzl()));
    public final MutableLiveData<Boolean> AhwBna = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<KeystoneAccountInfo>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> copydefault() {
        return this.AhwBna;
    }

    public final void EZpvd(@NotNull String str, String str2, KeystoneMultiAccount keystoneMultiAccount) {
        List<KeystoneAccount> accounts;
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        this.gEmmrt = str2;
        this.EZpvd = keystoneMultiAccount;
        xZX xzx = xZX.OLrzqt;
        if (keystoneMultiAccount == null || (accounts = keystoneMultiAccount.getAccounts()) == null) {
            return;
        }
        this.fetchVPNInfo = xzx.copydefault(xzx.EZpvd(accounts));
    }

    public final void AEQbTJ(boolean z) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Set<Integer> setKeySet;
        SortedMap<Integer, List<KeystoneAddressInfo>> sortedMap;
        List<KeystoneAddressInfo> list;
        int i;
        if (!z || (i = this.OLrzqt) <= -1) {
            this.OLrzqt = 0;
        } else {
            this.OLrzqt = i + 1;
        }
        int i2 = this.OLrzqt * this.djBIcL;
        SortedMap<Integer, List<KeystoneAddressInfo>> sortedMap2 = this.fetchVPNInfo;
        if (i2 > (sortedMap2 != null ? sortedMap2.size() : -1)) {
            this.KWHzl = true;
            MutableLiveData<ArrayList<KeystoneAccountInfo>> mutableLiveData = this.copydefault;
            mutableLiveData.setValue(mutableLiveData.getValue());
            return;
        }
        int i3 = this.OLrzqt;
        int i4 = this.djBIcL;
        final HashMap map = new HashMap();
        SortedMap<Integer, List<KeystoneAddressInfo>> sortedMap3 = this.fetchVPNInfo;
        if (sortedMap3 != null && (setKeySet = sortedMap3.keySet()) != null) {
            int i5 = 0;
            for (Object obj : setKeySet) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                Integer num = (Integer) obj;
                if (i2 <= i5 && i5 < (i3 + 1) * i4 && (sortedMap = this.fetchVPNInfo) != null && (list = sortedMap.get(num)) != null) {
                    AssetReq assetReq = new AssetReq((ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 63, (DefaultConstructorMarker) null);
                    map.put(num, C56390yDp.OLrzqt(assetReq, list));
                    for (KeystoneAddressInfo keystoneAddressInfo : list) {
                        Long chainId = keystoneAddressInfo.getChainId();
                        if (chainId != null && chainId.longValue() == 0) {
                            ArrayList<String> bitcoin = assetReq.getBitcoin();
                            String address = keystoneAddressInfo.getAddress();
                            if (address == null) {
                                address = "";
                            }
                            bitcoin.add(address);
                        } else if (chainId != null && chainId.longValue() == 1) {
                            ArrayList<String> evm = assetReq.getEvm();
                            String address2 = keystoneAddressInfo.getAddress();
                            if (address2 == null) {
                                address2 = "";
                            }
                            evm.add(address2);
                        } else if (chainId != null && chainId.longValue() == 195) {
                            ArrayList<String> tron = assetReq.getTron();
                            String address3 = keystoneAddressInfo.getAddress();
                            if (address3 == null) {
                                address3 = "";
                            }
                            tron.add(address3);
                        } else if (chainId != null && chainId.longValue() == 2) {
                            ArrayList<String> ltc = assetReq.getLtc();
                            String address4 = keystoneAddressInfo.getAddress();
                            if (address4 == null) {
                                address4 = "";
                            }
                            ltc.add(address4);
                        } else if (chainId != null && chainId.longValue() == 145) {
                            ArrayList<String> bch = assetReq.getBch();
                            String address5 = keystoneAddressInfo.getAddress();
                            if (address5 == null) {
                                address5 = "";
                            }
                            bch.add(address5);
                        } else if (chainId != null && chainId.longValue() == 5) {
                            ArrayList<String> dash = assetReq.getDash();
                            String address6 = keystoneAddressInfo.getAddress();
                            if (address6 == null) {
                                address6 = "";
                            }
                            dash.add(address6);
                        }
                    }
                }
                i5++;
            }
        }
        if (Intrinsics.EZpvd((Object) this.AkhnZx, (Object) "addAccount") && this.AYXKKw == null) {
            C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
            String str = this.gEmmrt;
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = instance$default.djBIcL(str != null ? str : "");
            final Function1 function1 = new Function1() { // from class: o.eGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return KeystoneSelectAccountViewModel.copydefault(this.OLrzqt, (AbstractC12784ctX) obj2);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.eGx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return KeystoneSelectAccountViewModel.djBIcL(function1, obj2);
                }
            });
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
        }
        final ActionBar actionBar = new ActionBar(map, this);
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.eGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return KeystoneSelectAccountViewModel.AYXKKw(actionBar, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KeystoneSelectAccountViewModel.EZpvd(this.KWHzl, map, (ResponseData) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                KeystoneSelectAccountViewModel.KWHzl(function12, obj2);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return KeystoneSelectAccountViewModel.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj2);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                KeystoneSelectAccountViewModel.AhwBna(function13, obj2);
            }
        }));
    }

    public static final class KeystoneAccountInfo {
        private final List<KeystoneAddressInfo> addressList;
        private final Map<Long, List<AddressAsset>> assetMap;
        private final int index;
        private boolean isDefaultEthAddress;
        private boolean isSelected;
        private String selectedEthAddress;
        private final AbstractC12782ctV wallet;
        public static final Activity Companion = new Activity(null);
        public static final int $stable = 8;
        private static final KeystoneAccountInfo HEADER = new KeystoneAccountInfo(-1, yDY.AhwBna(), C56424yEw.KWHzl(), "", false, null, false);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final String component4() {
            return this.selectedEthAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final boolean component5() {
            return this.isDefaultEthAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel$KeystoneAccountInfo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ KeystoneAccountInfo copy$default(KeystoneAccountInfo keystoneAccountInfo, int i, List list, Map map, String str, boolean z, AbstractC12782ctV abstractC12782ctV, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = keystoneAccountInfo.index;
            }
            if ((i2 & 2) != 0) {
                list = keystoneAccountInfo.addressList;
            }
            List list2 = list;
            if ((i2 & 4) != 0) {
                map = keystoneAccountInfo.assetMap;
            }
            Map map2 = map;
            if ((i2 & 8) != 0) {
                str = keystoneAccountInfo.selectedEthAddress;
            }
            String str2 = str;
            if ((i2 & 16) != 0) {
                z = keystoneAccountInfo.isDefaultEthAddress;
            }
            boolean z3 = z;
            if ((i2 & 32) != 0) {
                abstractC12782ctV = keystoneAccountInfo.wallet;
            }
            AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
            if ((i2 & 64) != 0) {
                z2 = keystoneAccountInfo.isSelected;
            }
            return keystoneAccountInfo.copy(i, list2, map2, str2, z3, abstractC12782ctV2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<KeystoneAddressInfo> component2() {
            return this.addressList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Long, List<AddressAsset>> component3() {
            return this.assetMap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12782ctV component6() {
            return this.wallet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KeystoneAccountInfo copy(int i, @NotNull List<KeystoneAddressInfo> list, @NotNull Map<Long, ? extends List<AddressAsset>> map, @NotNull String str, boolean z, AbstractC12782ctV abstractC12782ctV, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new KeystoneAccountInfo(i, list, map, str, z, abstractC12782ctV, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeystoneAccountInfo)) {
                return false;
            }
            KeystoneAccountInfo keystoneAccountInfo = (KeystoneAccountInfo) obj;
            return this.index == keystoneAccountInfo.index && Intrinsics.EZpvd(this.addressList, keystoneAccountInfo.addressList) && Intrinsics.EZpvd(this.assetMap, keystoneAccountInfo.assetMap) && Intrinsics.EZpvd((Object) this.selectedEthAddress, (Object) keystoneAccountInfo.selectedEthAddress) && this.isDefaultEthAddress == keystoneAccountInfo.isDefaultEthAddress && Intrinsics.EZpvd(this.wallet, keystoneAccountInfo.wallet) && this.isSelected == keystoneAccountInfo.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<KeystoneAddressInfo> getAddressList() {
            return this.addressList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Long, List<AddressAsset>> getAssetMap() {
            return this.assetMap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIndex() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSelectEthAddress() {
            return this.selectedEthAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12782ctV getWallet() {
            return this.wallet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.index);
            int iHashCode2 = this.addressList.hashCode();
            int iHashCode3 = this.assetMap.hashCode();
            int iHashCode4 = this.selectedEthAddress.hashCode();
            int iHashCode5 = Boolean.hashCode(this.isDefaultEthAddress);
            AbstractC12782ctV abstractC12782ctV = this.wallet;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (abstractC12782ctV == null ? 0 : abstractC12782ctV.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAdded() {
            return this.wallet != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isHeader() {
            return this.index == -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isSelected() {
            return this.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelectEthAddress(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.selectedEthAddress = str;
            this.isDefaultEthAddress = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelected(boolean z) {
            this.isSelected = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "KeystoneAccountInfo(index=" + this.index + ", addressList=" + this.addressList + ", assetMap=" + this.assetMap + ", selectedEthAddress=" + this.selectedEthAddress + ", isDefaultEthAddress=" + this.isDefaultEthAddress + ", wallet=" + this.wallet + ", isSelected=" + this.isSelected + ")";
        }

        public static final class TaskDescription<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i;
                Integer addressType = ((KeystoneAddressInfo) t).getAddressType();
                AddressType addressType2 = AddressType.Legacy;
                int value = addressType2.getValue();
                int i2 = 2;
                if (addressType != null && addressType.intValue() == value) {
                    i = 0;
                } else {
                    int value2 = AddressType.LedgerLive.getValue();
                    if (addressType != null && addressType.intValue() == value2) {
                        i = 1;
                    } else {
                        i = (addressType != null && addressType.intValue() == AddressType.LedgerLegacy.getValue()) ? 2 : 3;
                    }
                }
                Integer addressType3 = ((KeystoneAddressInfo) t2).getAddressType();
                int value3 = addressType2.getValue();
                if (addressType3 != null && addressType3.intValue() == value3) {
                    i2 = 0;
                } else {
                    int value4 = AddressType.LedgerLive.getValue();
                    if (addressType3 != null && addressType3.intValue() == value4) {
                        i2 = 1;
                    } else {
                        int value5 = AddressType.LedgerLegacy.getValue();
                        if (addressType3 == null || addressType3.intValue() != value5) {
                            i2 = 3;
                        }
                    }
                }
                return yET.KWHzl(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.Long, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.AddressAsset>> */
        /* JADX WARN: Multi-variable type inference failed */
        public KeystoneAccountInfo(int i, @NotNull List<KeystoneAddressInfo> list, @NotNull Map<Long, ? extends List<AddressAsset>> map, @NotNull String str, boolean z, AbstractC12782ctV abstractC12782ctV, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.index = i;
            this.addressList = list;
            this.assetMap = map;
            this.selectedEthAddress = str;
            this.isDefaultEthAddress = z;
            this.wallet = abstractC12782ctV;
            this.isSelected = z2;
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel.KeystoneAccountInfo.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final KeystoneAccountInfo KWHzl() {
                return KeystoneAccountInfo.HEADER;
            }
        }

        public final String getAccountName() {
            String strAkhnZx;
            AbstractC12782ctV abstractC12782ctV = this.wallet;
            return (abstractC12782ctV == null || (strAkhnZx = abstractC12782ctV.AkhnZx()) == null) ? C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), null, this.index + 1, false, 5, null) : strAkhnZx;
        }

        public final String getTotalAsset() {
            Object next;
            String amount;
            String str = "0";
            BigDecimal bigDecimal = new BigDecimal("0");
            List<AddressAsset> list = this.assetMap.get(1L);
            if (list == null || list.isEmpty()) {
                return "--";
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((AddressAsset) next).getAddress(), (Object) this.selectedEthAddress)) {
                    break;
                }
            }
            AddressAsset addressAsset = (AddressAsset) next;
            if (addressAsset != null && (amount = addressAsset.getAmount()) != null) {
                str = amount;
            }
            BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimal, str);
            Map<Long, List<AddressAsset>> map = this.assetMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Long, List<AddressAsset>> entry : map.entrySet()) {
                if (entry.getKey().longValue() != 1) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            BigDecimal bigDecimalKWHzl2 = bigDecimalKWHzl;
            while (it2.hasNext()) {
                Iterator it3 = ((Iterable) ((Map.Entry) it2.next()).getValue()).iterator();
                while (it3.hasNext()) {
                    bigDecimalKWHzl2 = C54862xYb.KWHzl(bigDecimalKWHzl2, ((AddressAsset) it3.next()).getAmount());
                }
            }
            return C54880xYt.formatValuationFromAsset$default(C54862xYb.convertToString$default(bigDecimalKWHzl2, false, null, null, 7, null), null, false, 0, false, 15, null);
        }

        public final boolean isShowSwitchEthAddress() {
            List<AddressAsset> list = this.assetMap.get(1L);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (C33129mqd.AEQbTJ(((AddressAsset) obj).getAmount(), "0")) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() > 1) {
                    return true;
                }
            }
            return false;
        }

        public final String getSwitchEthAddressTitle() {
            if (this.isDefaultEthAddress) {
                return C33069mpW.copydefault(C13754dXa.FragmentManager.DcMfJK, C56424yEw.gEmmrt(C56390yDp.OLrzqt("network", "EVM"), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, this.selectedEthAddress, false, 2, null))));
            }
            return C33069mpW.copydefault(C13754dXa.FragmentManager.RSDDiY, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, this.selectedEthAddress, false, 2, null))));
        }

        public final String getSelectEthAddressTypeText() {
            C8322bAY c8322bAY = C8322bAY.KWHzl;
            ChainAddress selectEthChainAddress = getSelectEthChainAddress();
            return c8322bAY.OLrzqt(selectEthChainAddress != null ? selectEthChainAddress.getAddressType() : AddressType.Legacy.getValue(), true);
        }

        public final ChainAddress getSelectEthChainAddress() {
            Object next;
            Iterator<T> it = this.addressList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((KeystoneAddressInfo) next).getAddress(), (Object) this.selectedEthAddress)) {
                    break;
                }
            }
            KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) next;
            if (keystoneAddressInfo == null) {
                return null;
            }
            Long chainId = keystoneAddressInfo.getChainId();
            long jLongValue = chainId != null ? chainId.longValue() : 0L;
            String address = keystoneAddressInfo.getAddress();
            String str = address == null ? "" : address;
            Integer addressType = keystoneAddressInfo.getAddressType();
            int iIntValue = addressType != null ? addressType.intValue() : AddressType.Legacy.getValue();
            String publicKey = keystoneAddressInfo.getPublicKey();
            String str2 = publicKey == null ? "" : publicKey;
            String path = keystoneAddressInfo.getPath();
            return new ChainAddress(jLongValue, str, iIntValue, "", "", true, str2, path == null ? "" : path);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<DerviationEVM> getEthDeriveInfo() {
            String amount;
            List<KeystoneAddressInfo> list = this.addressList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Long chainId = ((KeystoneAddressInfo) obj).getChainId();
                if (chainId != null && chainId.longValue() == 1) {
                    arrayList.add(obj);
                }
            }
            List<KeystoneAddressInfo> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription());
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (KeystoneAddressInfo keystoneAddressInfo : listEZpvd) {
                List<AddressAsset> list2 = this.assetMap.get(1L);
                Integer addressType = keystoneAddressInfo.getAddressType();
                Object obj2 = null;
                String strAYXKKw = (addressType != null && addressType.intValue() == AddressType.Legacy.getValue()) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.RIuxYh) : null;
                String path = keystoneAddressInfo.getPath();
                Integer addressType2 = keystoneAddressInfo.getAddressType();
                String address = keystoneAddressInfo.getAddress();
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next).getAddress(), (Object) keystoneAddressInfo.getAddress())) {
                            obj2 = next;
                            break;
                        }
                    }
                    AddressAsset addressAsset = (AddressAsset) obj2;
                    if (addressAsset == null || (amount = addressAsset.getAmount()) == null) {
                        amount = "0";
                    }
                }
                arrayList2.add(new DerviationEVM(strAYXKKw, path, addressType2, address, C54880xYt.formatValuationFromAsset$default(amount, null, false, 0, false, 15, null)));
            }
            return arrayList2;
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((KeystoneAccountInfo) t).getIndex()), Integer.valueOf(((KeystoneAccountInfo) t2).getIndex()));
        }
    }

    public static final Unit djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit copydefault(KeystoneSelectAccountViewModel keystoneSelectAccountViewModel, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        keystoneSelectAccountViewModel.AYXKKw = abstractC12784ctX;
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<List<? extends AssetRsp>>>> {
        public final /* synthetic */ KeystoneSelectAccountViewModel AEQbTJ;
        public final /* synthetic */ HashMap<Integer, Pair<AssetReq, List<KeystoneAddressInfo>>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(HashMap<Integer, Pair<AssetReq, List<KeystoneAddressInfo>>> map, KeystoneSelectAccountViewModel keystoneSelectAccountViewModel) {
            this.OLrzqt = map;
            this.AEQbTJ = keystoneSelectAccountViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<List<AssetRsp>>> invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            Collection<Pair<AssetReq, List<KeystoneAddressInfo>>> collectionValues = this.OLrzqt.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            Collection<Pair<AssetReq, List<KeystoneAddressInfo>>> collection = collectionValues;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add((AssetReq) ((Pair) it.next()).getFirst());
            }
            AbstractC58185ywX<ResponseData<List<AssetRsp>>> abstractC58185ywXAEQbTJ = this.AEQbTJ.AEQbTJ.AEQbTJ(arrayList);
            final Function1 function1 = new Function1() { // from class: o.eGA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return KeystoneSelectAccountViewModel.ActionBar.copydefault((java.lang.Throwable) obj2);
                }
            };
            return abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.eGz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return KeystoneSelectAccountViewModel.ActionBar.OLrzqt(function1, obj2);
                }
            });
        }

        public static final ResponseData OLrzqt(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData copydefault(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new ResponseData(0, null, null, null, yDY.AhwBna(), null, 46, null);
        }
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(KeystoneSelectAccountViewModel keystoneSelectAccountViewModel, Throwable th) {
        pUU.copydefault(keystoneSelectAccountViewModel.valueOf, "loadAccountData error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final List<AddressAsset> EZpvd(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> evm;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> evm2 = ((AssetRsp) next).getEvm();
                if (evm2 != null) {
                    Iterator<T> it2 = evm2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (evm = assetRsp.getEvm()) != null) {
                return evm;
            }
        }
        return yDY.AhwBna();
    }

    public final List<AddressAsset> OLrzqt(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> bitcoin;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> bitcoin2 = ((AssetRsp) next).getBitcoin();
                if (bitcoin2 != null) {
                    Iterator<T> it2 = bitcoin2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (bitcoin = assetRsp.getBitcoin()) != null) {
                return bitcoin;
            }
        }
        return yDY.AhwBna();
    }

    public final List<AddressAsset> AYXKKw(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> tron;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> tron2 = ((AssetRsp) next).getTron();
                if (tron2 != null) {
                    Iterator<T> it2 = tron2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (tron = assetRsp.getTron()) != null) {
                return tron;
            }
        }
        return yDY.AhwBna();
    }

    public final List<AddressAsset> KWHzl(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> ltc;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> ltc2 = ((AssetRsp) next).getLtc();
                if (ltc2 != null) {
                    Iterator<T> it2 = ltc2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (ltc = assetRsp.getLtc()) != null) {
                return ltc;
            }
        }
        return yDY.AhwBna();
    }

    public final List<AddressAsset> copydefault(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> dash;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> dash2 = ((AssetRsp) next).getDash();
                if (dash2 != null) {
                    Iterator<T> it2 = dash2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (dash = assetRsp.getDash()) != null) {
                return dash;
            }
        }
        return yDY.AhwBna();
    }

    public final List<AddressAsset> AEQbTJ(List<AssetRsp> list, String str) {
        Object obj;
        List<AddressAsset> bch;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<AddressAsset> bch2 = ((AssetRsp) next).getBch();
                if (bch2 != null) {
                    Iterator<T> it2 = bch2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((AddressAsset) next2).getAddress(), (Object) str)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (AddressAsset) obj;
                }
                if (obj != null) {
                    obj = next;
                    break;
                }
            }
            AssetRsp assetRsp = (AssetRsp) obj;
            if (assetRsp != null && (bch = assetRsp.getBch()) != null) {
                return bch;
            }
        }
        return yDY.AhwBna();
    }

    public final void KWHzl() {
        this.AhwBna.setValue(Boolean.FALSE);
    }

    public static /* synthetic */ void createKeystoneWallet$default(KeystoneSelectAccountViewModel keystoneSelectAccountViewModel, FragmentManager fragmentManager, Activity activity, KeystoneAccountInfo keystoneAccountInfo, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        keystoneSelectAccountViewModel.OLrzqt(fragmentManager, activity, keystoneAccountInfo, i, function1);
    }

    public final void OLrzqt(@NotNull FragmentManager fragmentManager, @NotNull Activity activity, @NotNull KeystoneAccountInfo keystoneAccountInfo, int i, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(keystoneAccountInfo, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeystoneSelectAccountViewModel$createKeystoneWallet$1(keystoneAccountInfo, this, i, activity, fragmentManager, function1, null), 3, null);
    }

    public final boolean KWHzl(@NotNull KeystoneAddressInfo keystoneAddressInfo, @NotNull KeystoneAccountInfo keystoneAccountInfo) {
        Long chainId;
        Long chainId2;
        Long chainId3;
        Long chainId4;
        Long chainId5;
        Intrinsics.checkNotNullParameter(keystoneAddressInfo, "");
        Intrinsics.checkNotNullParameter(keystoneAccountInfo, "");
        Long chainId6 = keystoneAddressInfo.getChainId();
        return (chainId6 != null && chainId6.longValue() == 0) || ((chainId = keystoneAddressInfo.getChainId()) != null && chainId.longValue() == 1 && Intrinsics.EZpvd((Object) keystoneAddressInfo.getAddress(), (Object) keystoneAccountInfo.getSelectEthAddress())) || (((chainId2 = keystoneAddressInfo.getChainId()) != null && chainId2.longValue() == 195) || (((chainId3 = keystoneAddressInfo.getChainId()) != null && chainId3.longValue() == 2) || (((chainId4 = keystoneAddressInfo.getChainId()) != null && chainId4.longValue() == 145) || ((chainId5 = keystoneAddressInfo.getChainId()) != null && chainId5.longValue() == 5))));
    }

    public final Map<Long, List<AddressAsset>> KWHzl(List<AssetRsp> list, List<KeystoneAddressInfo> list2) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Long chainId = ((KeystoneAddressInfo) next).getChainId();
            if (chainId != null && chainId.longValue() == 1) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) next;
        List<AddressAsset> listEZpvd = EZpvd(list, keystoneAddressInfo != null ? keystoneAddressInfo.getAddress() : null);
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            Long chainId2 = ((KeystoneAddressInfo) next2).getChainId();
            if (chainId2 != null && chainId2.longValue() == 0) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo2 = (KeystoneAddressInfo) next2;
        List<AddressAsset> listOLrzqt = OLrzqt(list, keystoneAddressInfo2 != null ? keystoneAddressInfo2.getAddress() : null);
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            Long chainId3 = ((KeystoneAddressInfo) next3).getChainId();
            if (chainId3 != null && chainId3.longValue() == 195) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo3 = (KeystoneAddressInfo) next3;
        List<AddressAsset> listAYXKKw = AYXKKw(list, keystoneAddressInfo3 != null ? keystoneAddressInfo3.getAddress() : null);
        Iterator<T> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            Long chainId4 = ((KeystoneAddressInfo) next4).getChainId();
            if (chainId4 != null && chainId4.longValue() == 2) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo4 = (KeystoneAddressInfo) next4;
        List<AddressAsset> listKWHzl = KWHzl(list, keystoneAddressInfo4 != null ? keystoneAddressInfo4.getAddress() : null);
        Iterator<T> it5 = list2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
            Long chainId5 = ((KeystoneAddressInfo) next5).getChainId();
            if (chainId5 != null && chainId5.longValue() == 5) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo5 = (KeystoneAddressInfo) next5;
        List<AddressAsset> listCopydefault = copydefault(list, keystoneAddressInfo5 != null ? keystoneAddressInfo5.getAddress() : null);
        Iterator<T> it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it6.next();
            Long chainId6 = ((KeystoneAddressInfo) next6).getChainId();
            if (chainId6 != null && chainId6.longValue() == 145) {
                break;
            }
        }
        KeystoneAddressInfo keystoneAddressInfo6 = (KeystoneAddressInfo) next6;
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(1L, listEZpvd), C56390yDp.OLrzqt(0L, listOLrzqt), C56390yDp.OLrzqt(195L, listAYXKKw), C56390yDp.OLrzqt(2L, listKWHzl), C56390yDp.OLrzqt(5L, listCopydefault), C56390yDp.OLrzqt(145L, AEQbTJ(list, keystoneAddressInfo6 != null ? keystoneAddressInfo6.getAddress() : null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a A[PHI: r5
  0x018a: PHI (r5v13 java.lang.String) = (r5v9 java.lang.String), (r5v11 java.lang.String), (r5v18 java.lang.String) binds: [B:91:0x0187, B:69:0x013e, B:40:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(KeystoneSelectAccountViewModel keystoneSelectAccountViewModel, HashMap map, ResponseData responseData) {
        AbstractC12782ctV abstractC12782ctV;
        Iterator it;
        Object obj;
        KeystoneAddressInfo keystoneAddressInfo;
        String address;
        String str;
        List<AbstractC12782ctV> listKWHzl;
        Object next;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ArrayList<KeystoneAccountInfo> value = keystoneSelectAccountViewModel.copydefault.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            if (value.isEmpty()) {
                value.add(KeystoneAccountInfo.Companion.KWHzl());
            }
            List<AssetRsp> list = (List) responseData.getData();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                Object second = ((Pair) entry.getValue()).getSecond();
                List<KeystoneAddressInfo> list2 = (List) second;
                Map<Long, List<AddressAsset>> mapKWHzl = keystoneSelectAccountViewModel.KWHzl(list, list2);
                AbstractC12784ctX abstractC12784ctX = keystoneSelectAccountViewModel.AYXKKw;
                if (abstractC12784ctX == null || (listKWHzl = abstractC12784ctX.KWHzl()) == null) {
                    abstractC12782ctV = null;
                } else {
                    Iterator<T> it2 = listKWHzl.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((AbstractC12782ctV) next).finit() == iIntValue) {
                            break;
                        }
                    }
                    abstractC12782ctV = (AbstractC12782ctV) next;
                }
                List<AddressAsset> listAhwBna = mapKWHzl.get(1L);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (abstractC12782ctV != null) {
                    C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
                    ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMIsConnected != null ? c10854bwMIsConnected.AEQbTJ() : 0L, null, 2, null);
                    str = (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address;
                } else if (!listAhwBna.isEmpty() && !listAhwBna.isEmpty()) {
                    Iterator<T> it3 = listAhwBna.iterator();
                    while (it3.hasNext()) {
                        if (!C33129mqd.OLrzqt(((AddressAsset) it3.next()).getAmount(), "0")) {
                            Iterator<T> it4 = listAhwBna.iterator();
                            if (!it4.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Object next2 = it4.next();
                            if (it4.hasNext()) {
                                String amount = ((AddressAsset) next2).getAmount();
                                if (amount == null) {
                                    amount = "";
                                }
                                do {
                                    Object next3 = it4.next();
                                    String amount2 = ((AddressAsset) next3).getAmount();
                                    if (amount2 == null) {
                                        amount2 = "";
                                    }
                                    if (amount.compareTo(amount2) < 0) {
                                        next2 = next3;
                                        amount = amount2;
                                    }
                                } while (it4.hasNext());
                            }
                            address = ((AddressAsset) next2).getAddress();
                            if (address == null) {
                            }
                        }
                    }
                    it = ((Iterable) second).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    keystoneAddressInfo = (KeystoneAddressInfo) obj;
                    if (keystoneAddressInfo != null) {
                    }
                } else {
                    it = ((Iterable) second).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next4 = it.next();
                        KeystoneAddressInfo keystoneAddressInfo2 = (KeystoneAddressInfo) next4;
                        Long chainId = keystoneAddressInfo2.getChainId();
                        if (chainId != null && chainId.longValue() == 1) {
                            Integer addressType = keystoneAddressInfo2.getAddressType();
                            int value2 = AddressType.Legacy.getValue();
                            if (addressType != null && addressType.intValue() == value2) {
                                obj = next4;
                                break;
                            }
                        }
                    }
                    keystoneAddressInfo = (KeystoneAddressInfo) obj;
                    if (keystoneAddressInfo != null || (address = keystoneAddressInfo.getAddress()) == null) {
                    }
                }
                arrayList.add(new KeystoneAccountInfo(iIntValue, list2, mapKWHzl, str, abstractC12782ctV == null, abstractC12782ctV, false));
            }
            value.addAll(CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator()));
            SortedMap<Integer, List<KeystoneAddressInfo>> sortedMap = keystoneSelectAccountViewModel.fetchVPNInfo;
            keystoneSelectAccountViewModel.KWHzl = sortedMap != null && value.size() - 1 == sortedMap.size();
            keystoneSelectAccountViewModel.copydefault.setValue(value);
        } else {
            C55326xho.toast$default(responseData.getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
