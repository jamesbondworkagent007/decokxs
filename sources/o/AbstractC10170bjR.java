package o;

import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.assets.detail.biz.ItemType;
import com.okinc.business.defi.assets.detail.biz.NetworkFeeNoticeType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.net.bean.Address;
import com.okinc.business.defi.biz.net.bean.RegisterInfo;
import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxContractInfo;
import com.okinc.business.defi.biz.net.bean.TxDetailApproveInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bjR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC10170bjR {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final TxIdOrHashHistoryDetail AEQbTJ;
    public final C10854bwM EZpvd;
    public final android.content.Context KWHzl;

    /* JADX INFO: renamed from: o.bjR$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ItemType.values().length];
            try {
                iArr[ItemType.ITEM_TYPE_STATUS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_TIME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_BLOCK_CONFIRMATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_NETWORK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_REGISTER_ADDRESS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_PRICE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_MEV.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_TRANSACTION_FEE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_YOU_PAYED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_NETWORK_FEE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_TRANSACTION_HASH.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_APPROVED_AMOUNT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_APPROVED_ASSETS.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_GAS_REBATE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_DETAIL_EXPLORER.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_DETAIL_EXCHANGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_DETAIL_WALLET.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_DETAIL_ON_OFF_RAMP.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_MEMO.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[ItemType.ITEM_TYPE_NONCE.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context AEQbTJ() {
        return this.KWHzl;
    }

    public abstract java.util.List<AbstractC10168bjP> AYXKKw();

    public abstract java.lang.String AkhnZx();

    public abstract java.lang.CharSequence AuCTel();

    public abstract boolean AxsJAY();

    public abstract java.util.List<AbstractC10168bjP> DbNXlk();

    public abstract java.util.List<AbstractC10168bjP> KWHzl();

    public java.lang.Long djBIcL() {
        return null;
    }

    public abstract java.lang.String fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxIdOrHashHistoryDetail fJNWhG() {
        return this.AEQbTJ;
    }

    public abstract C10169bjQ fetchVPNInfo();

    public abstract int gEmmrt();

    public abstract boolean getFieldNames();

    public abstract int isConnected();

    public abstract C10169bjQ values();

    public AbstractC10170bjR(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        this.KWHzl = context;
        this.AEQbTJ = txIdOrHashHistoryDetail;
        this.EZpvd = C10954byG.EZpvd.valueOf().KWHzl(txIdOrHashHistoryDetail.getMainCoinId());
    }

    /* JADX INFO: renamed from: o.bjR$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bjR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String OLrzqt() {
        return this.AEQbTJ.getFailReason();
    }

    public final boolean zsXlph() {
        if (AYXKKw().isEmpty() || DbNXlk().isEmpty()) {
            return (AYXKKw().isEmpty() ^ true) && (KWHzl().isEmpty() ^ true);
        }
        return true;
    }

    public final boolean uzCIH() {
        return C10598brV.AEQbTJ.OLrzqt(this.AEQbTJ.getCoinId()) != null;
    }

    public final java.lang.String EZpvd() {
        return this.AEQbTJ.getInputData();
    }

    public final boolean AwvSrB() {
        return (AYXKKw().isEmpty() || DbNXlk().isEmpty()) ? false : true;
    }

    public final java.lang.String AhwBna() {
        C10854bwM c10854bwM;
        if (this.AEQbTJ.getTxStatus() != 1 || this.AEQbTJ.isShowPending() || (c10854bwM = this.EZpvd) == null || !c10854bwM.QkdxfA()) {
            return "";
        }
        java.lang.String string = this.KWHzl.getString(C13754dXa.FragmentManager.getWindowCallback);
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final java.lang.String ejfBZ() {
        java.lang.String tipsType = this.AEQbTJ.getTipsType();
        return tipsType == null ? "" : tipsType;
    }

    public java.util.List<ItemType> AubY() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ItemType.ITEM_TYPE_TIME);
        arrayList.add(ItemType.ITEM_TYPE_TYPE);
        if (this.AEQbTJ.getTxType() != 72 && (this.AEQbTJ.getTxType() != 65 || this.AEQbTJ.getTxStatus() == 4)) {
            arrayList.add(ItemType.ITEM_TYPE_NETWORK_FEE);
        }
        arrayList.add(ItemType.ITEM_TYPE_NETWORK);
        java.lang.String mev = this.AEQbTJ.getMev();
        if (mev != null && mev.length() > 0) {
            arrayList.add(ItemType.ITEM_TYPE_MEV);
        }
        if (this.AEQbTJ.getTxType() == 65) {
            arrayList.add(ItemType.ITEM_TYPE_DETAIL_ON_OFF_RAMP);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getTxHash()) || C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getUOpHash())) {
            arrayList.add(ItemType.ITEM_TYPE_TRANSACTION_HASH);
        }
        if (uzCIH()) {
            arrayList.add(ItemType.ITEM_TYPE_NONCE);
        } else if (this.AEQbTJ.getTxType() == 65 && this.AEQbTJ.getTxStatus() == 4) {
            arrayList.add(ItemType.ITEM_TYPE_TRANSACTION_FEE);
        } else {
            arrayList.add(ItemType.ITEM_TYPE_BLOCK_CONFIRMATION);
        }
        if (djBIcL() != null) {
            arrayList.add(ItemType.ITEM_TYPE_DETAIL_WALLET);
        }
        if (AuCTelauCTel()) {
            arrayList.add(ItemType.ITEM_TYPE_DETAIL_EXCHANGE);
        }
        if (this.AEQbTJ.getTxType() == 10) {
            arrayList.add(ItemType.ITEM_TYPE_PRICE);
            arrayList.add(ItemType.ITEM_TYPE_TRANSACTION_FEE);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getFeeRebate())) {
                arrayList.add(ItemType.ITEM_TYPE_GAS_REBATE);
            }
            arrayList.add(ItemType.ITEM_TYPE_YOU_PAYED);
        }
        C10854bwM c10854bwM = this.EZpvd;
        if (c10854bwM != null && c10854bwM.DNMMPQ()) {
            arrayList.add(ItemType.ITEM_TYPE_MEMO);
        }
        return arrayList;
    }

    public final BaseItem.StateListAnimator EZpvd(java.lang.String str) {
        java.lang.String strAYXKKw;
        C10854bwM c10854bwMKWHzl;
        java.lang.String capitalVendorName;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (Address address : this.AEQbTJ.getInAdrList()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) address.getAddress()) && !arrayList.contains(address.getAddress())) {
                arrayList.add(address.getAddress());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean zOLrzqt = false;
        for (java.lang.String str2 : arrayList) {
            boolean z = this.AEQbTJ.getTxType() == 8;
            if (!z || (capitalVendorName = this.AEQbTJ.getOkexAccount()) == null) {
                capitalVendorName = "";
            }
            if (str2 == null || str2.length() == 0) {
                strKWHzl = capitalVendorName;
            } else {
                strKWHzl = C15487eKd.AEQbTJ.KWHzl(str == null ? "" : str, this.AEQbTJ.getTxType(), this.AEQbTJ.getMainCoinId(), str2, true, false);
            }
            if (str2 == null || str2.length() == 0) {
                strKWHzl2 = capitalVendorName;
            } else {
                strKWHzl2 = C15487eKd.AEQbTJ.KWHzl(str == null ? "" : str, this.AEQbTJ.getTxType(), this.AEQbTJ.getMainCoinId(), str2, true, false);
            }
            if (str2 == null || str2.length() == 0) {
                capitalVendorName = "";
            }
            boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) str2);
            if (!zOLrzqt) {
                zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl);
            }
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
            if (this.AEQbTJ.getTxType() == 65) {
                capitalVendorName = this.AEQbTJ.getCapitalVendorName();
            }
            arrayList2.add(new BaseItem.Application("", strKWHzl, strKWHzl2, strAYXKKw2, capitalVendorName, zOLrzqt2, z, null, 0, null, zOLrzqt, FaceDetector.NUM_BOXES, null));
        }
        if (this.AEQbTJ.getTxType() == 11 && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.AEQbTJ.getMainCoinId())) != null && c10854bwMKWHzl.heceqZ()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModelsfactoryPromise2);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLauncher);
        }
        return new BaseItem.StateListAnimator(strAYXKKw, arrayList2, zOLrzqt, this.AEQbTJ.getMultipleAddressNumLimit());
    }

    public final BaseItem OLrzqt(java.lang.String str) {
        java.lang.String address;
        TxContractInfo contractInfo;
        java.lang.String name;
        java.lang.String icon;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        java.lang.String okexAccount;
        java.lang.String address2;
        java.lang.String okexAccount2;
        java.lang.String address3;
        if (this.AEQbTJ.getTxType() == 27 && C33129mqd.KWHzl((java.util.Collection) this.AEQbTJ.getApproveInfoList())) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<TxDetailApproveInfo> approveInfoList = this.AEQbTJ.getApproveInfoList();
            Intrinsics.copydefault(approveInfoList);
            java.util.Iterator<T> it = approveInfoList.iterator();
            while (it.hasNext()) {
                java.lang.String nftCollectionAddress = ((TxDetailApproveInfo) it.next()).getNftCollectionAddress();
                java.lang.String str2 = nftCollectionAddress == null ? "" : nftCollectionAddress;
                boolean z = (!C33129mqd.OLrzqt((java.lang.CharSequence) str2) || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "--")) ? false : true;
                arrayList.add(new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findOwner), str2, str2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), null, z, false, null, 0, null, z, 976, null));
            }
            return new BaseItem.StateListAnimator(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findOwner), arrayList, true, this.AEQbTJ.getMultipleAddressNumLimit());
        }
        if (AxsJAY()) {
            if (this.AEQbTJ.getTxType() == 54 || this.AEQbTJ.getTxType() == 53 || this.AEQbTJ.getTxType() == 50 || this.AEQbTJ.getTxType() == 51 || this.AEQbTJ.getTxType() == 58 || this.AEQbTJ.getTxType() == 56 || this.AEQbTJ.getTxType() == 59 || this.AEQbTJ.getTxType() == 57 || this.AEQbTJ.getTxType() == 52 || this.AEQbTJ.getTxType() == 1 || this.AEQbTJ.getTxType() == 2) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                for (Address address4 : this.AEQbTJ.getOutAdrList()) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) address4.getAddress()) && !arrayList2.contains(address4.getAddress())) {
                        arrayList2.add(address4.getAddress());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add("");
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                boolean zOLrzqt = false;
                for (java.lang.String str3 : arrayList2) {
                    java.lang.String str4 = (this.AEQbTJ.getTxType() != 9 || (okexAccount = this.AEQbTJ.getOkexAccount()) == null) ? "" : okexAccount;
                    if (str3 == null || str3.length() == 0) {
                        strKWHzl = str4;
                    } else {
                        strKWHzl = C15487eKd.AEQbTJ.KWHzl(str == null ? "" : str, this.AEQbTJ.getTxType(), this.AEQbTJ.getMainCoinId(), str3, false, (32 & 32) != 0);
                    }
                    if (str3 == null || str3.length() == 0) {
                        strKWHzl2 = str4;
                    } else {
                        strKWHzl2 = C15487eKd.AEQbTJ.KWHzl(str == null ? "" : str, this.AEQbTJ.getTxType(), this.AEQbTJ.getMainCoinId(), str3, false, (32 & 32) != 0);
                    }
                    java.lang.String str5 = (str3 == null || str3.length() == 0) ? "" : str4;
                    boolean z2 = (!C33129mqd.OLrzqt((java.lang.CharSequence) str3) || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "--")) ? false : true;
                    if (!zOLrzqt) {
                        zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl);
                    }
                    arrayList3.add(new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.rememberLauncherForActivityResult), strKWHzl, strKWHzl2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str5, z2, false, null, 0, null, zOLrzqt, 960, null));
                }
                return new BaseItem.StateListAnimator(C33070mpX.AYXKKw(C13754dXa.FragmentManager.rememberLauncherForActivityResult), arrayList3, zOLrzqt, this.AEQbTJ.getMultipleAddressNumLimit());
            }
            if (this.AEQbTJ.getTxType() == 85 || this.AEQbTJ.getTxType() == 84) {
                TxContractInfo contractInfo2 = this.AEQbTJ.getContractInfo();
                if (contractInfo2 == null || (address2 = contractInfo2.getAddress()) == null) {
                    address2 = "";
                }
            } else {
                C15487eKd c15487eKd = C15487eKd.AEQbTJ;
                java.lang.String str6 = str == null ? "" : str;
                int txType = this.AEQbTJ.getTxType();
                long mainCoinId = this.AEQbTJ.getMainCoinId();
                Address address5 = (Address) CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.getOutAdrList());
                address2 = c15487eKd.KWHzl(str6, txType, mainCoinId, (address5 == null || (address3 = address5.getAddress()) == null) ? "" : address3, false, (32 & 32) != 0);
            }
            if ((this.AEQbTJ.getTxType() != 9 && this.AEQbTJ.getTxType() != 2) || (okexAccount2 = this.AEQbTJ.getOkexAccount()) == null) {
                okexAccount2 = "";
            }
            java.lang.String str7 = (address2 == null || address2.length() == 0) ? okexAccount2 : address2;
            return new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.rememberLauncherForActivityResult), str7, (address2 == null || address2.length() == 0) ? okexAccount2 : address2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), (address2 == null || address2.length() == 0) ? "" : okexAccount2, (!C33129mqd.OLrzqt((java.lang.CharSequence) address2) || Intrinsics.EZpvd((java.lang.Object) address2, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) address2, (java.lang.Object) "--")) ? false : true, false, null, 0, null, (!C33129mqd.OLrzqt((java.lang.CharSequence) str7) || Intrinsics.EZpvd((java.lang.Object) str7, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) str7, (java.lang.Object) "--")) ? false : true, 960, null);
        }
        if (!getFieldNames()) {
            TxContractInfo contractInfo3 = this.AEQbTJ.getContractInfo();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractInfo3 != null ? contractInfo3.getAddress() : null))) {
                TxContractInfo contractInfo4 = this.AEQbTJ.getContractInfo();
                java.lang.String address6 = contractInfo4 != null ? contractInfo4.getAddress() : null;
                boolean z3 = (!C33129mqd.OLrzqt((java.lang.CharSequence) address6) || Intrinsics.EZpvd((java.lang.Object) address6, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) address6, (java.lang.Object) "--")) ? false : true;
                TxContractInfo contractInfo5 = this.AEQbTJ.getContractInfo();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractInfo5 != null ? contractInfo5.getName() : null))) {
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.findOwner);
                    TxContractInfo contractInfo6 = this.AEQbTJ.getContractInfo();
                    return new BaseItem.Activity(strAYXKKw, (contractInfo6 == null || (icon = contractInfo6.getIcon()) == null) ? "" : icon, C13754dXa.Activity.aKErDB, (this.AEQbTJ.getTxType() == 82 || (contractInfo = this.AEQbTJ.getContractInfo()) == null || (name = contractInfo.getName()) == null) ? "" : name, address6 == null ? "" : address6, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), z3);
                }
                return new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findOwner), (this.AEQbTJ.getTxType() == 82 || address6 == null) ? "" : address6, address6 == null ? "" : address6, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), null, z3, false, null, 0, null, z3, 976, null);
            }
        }
        C15487eKd c15487eKd2 = C15487eKd.AEQbTJ;
        java.lang.String str8 = str == null ? "" : str;
        int txType2 = this.AEQbTJ.getTxType();
        long mainCoinId2 = this.AEQbTJ.getMainCoinId();
        Address address7 = (Address) CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.getOutAdrList());
        java.lang.String strKWHzl3 = c15487eKd2.KWHzl(str8, txType2, mainCoinId2, (address7 == null || (address = address7.getAddress()) == null) ? "" : address, false, (32 & 32) != 0);
        boolean z4 = (!C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl3) || Intrinsics.EZpvd((java.lang.Object) strKWHzl3, (java.lang.Object) "-") || Intrinsics.EZpvd((java.lang.Object) strKWHzl3, (java.lang.Object) "--")) ? false : true;
        return new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findOwner), strKWHzl3, strKWHzl3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), null, z4, false, null, 0, null, z4, 976, null);
    }

    public final java.util.List<BaseItem> valueOf() {
        java.util.List<ItemType> listAubY = AubY();
        if (listAubY.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAubY, 10));
        java.util.Iterator<T> it = listAubY.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ItemType) it.next()));
        }
        return arrayList;
    }

    public final BaseItem fIwbmz() {
        return KWHzl(ItemType.ITEM_TYPE_STATUS);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseItem KWHzl(@NotNull ItemType itemType) {
        java.lang.String explorerUrl;
        BaseItem.StatusItem.Status status;
        java.lang.String strDjBIcL;
        C10854bwM c10854bwM;
        BaseItem dialog;
        java.lang.String address;
        TxAssetChangeBean txAssetChangeBean;
        C10854bwM c10854bwM2;
        java.lang.String strKWHzl;
        C10854bwM c10854bwM3;
        java.lang.String chainSymbol;
        java.lang.String str;
        NetworkFeeNoticeType networkFeeNoticeType;
        java.lang.Integer payMasterType;
        java.lang.String txHash;
        java.lang.CharSequence addressStr$default;
        java.lang.String strAYXKKw;
        TxAssetChangeBean approveInfo;
        BaseItem actionBar;
        TxAssetChangeBean approveInfo2;
        java.lang.String name;
        java.lang.String amount;
        java.lang.Integer decimalNum;
        kotlin.Pair pairOLrzqt;
        explorerUrl = "";
        Intrinsics.checkNotNullParameter(itemType, "");
        int iIntValue = 0;
        switch (ActionBar.AEQbTJ[itemType.ordinal()]) {
            case 1:
                switch (this.AEQbTJ.getTxStatus()) {
                    case 1:
                    case 5:
                        C10854bwM c10854bwM4 = this.EZpvd;
                        if (c10854bwM4 == null || !c10854bwM4.QkdxfA() || this.AEQbTJ.isShowPending()) {
                            java.lang.Integer repeatTxType = this.AEQbTJ.getRepeatTxType();
                            if (repeatTxType != null && repeatTxType.intValue() == 0) {
                                if (this.AEQbTJ.getTxStatus() == 5) {
                                    status = BaseItem.StatusItem.Status.STATUS_EXCHANGE_REQUEST;
                                } else {
                                    status = BaseItem.StatusItem.Status.STATUS_PENDING;
                                }
                            } else if (repeatTxType != null && repeatTxType.intValue() == 1) {
                                status = BaseItem.StatusItem.Status.STATUS_SPEEDING_UP;
                            } else if ((repeatTxType != null && repeatTxType.intValue() == 2) || (repeatTxType != null && repeatTxType.intValue() == 3)) {
                                status = BaseItem.StatusItem.Status.STATUS_CANCELING;
                            } else {
                                status = BaseItem.StatusItem.Status.STATUS_PENDING;
                            }
                        } else {
                            status = BaseItem.StatusItem.Status.STATUS_WAITING;
                        }
                        break;
                    case 2:
                    case 4:
                        status = BaseItem.StatusItem.Status.STATUS_COMPLETED;
                        break;
                    case 3:
                        status = BaseItem.StatusItem.Status.STATUS_FAILED;
                        break;
                    case 6:
                        status = BaseItem.StatusItem.Status.STATUS_CANCELED;
                        break;
                    default:
                        status = BaseItem.StatusItem.Status.STATUS_COMPLETED;
                        break;
                }
                return new BaseItem.StatusItem(status);
            case 2:
                return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryKtrememberLauncherForActivityResult11), pTA.formatSimpleDateTime$default(new Date(this.AEQbTJ.getTxTime()), null, 1, null));
            case 3:
                return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSavedStateRegistry), fARcdN());
            case 4:
                return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityComposeUtilsKt), C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getConfirmedCount()) ? C54862xYb.OLrzqt(this.AEQbTJ.getConfirmedCount()) : "--");
            case 5:
                CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(this.AEQbTJ.getCoinId());
                if (customChainCoinMetaOLrzqt == null || (strDjBIcL = customChainCoinMetaOLrzqt.AhwBna()) == null) {
                    strDjBIcL = "";
                }
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setLauncher);
                if (uzCIH() || ((c10854bwM = this.EZpvd) != null && (strDjBIcL = c10854bwM.djBIcL()) != null)) {
                    explorerUrl = strDjBIcL;
                }
                dialog = new BaseItem.Dialog(strAYXKKw2, explorerUrl);
                return dialog;
            case 6:
                RegisterInfo registerInfo = this.AEQbTJ.getRegisterInfo();
                if (registerInfo != null && (address = registerInfo.getAddress()) != null) {
                    explorerUrl = address;
                }
                dialog = new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FullyDrawnReporterOwner), C14079deg.getAddressStr$default(C14079deg.EZpvd, explorerUrl, false, 2, null), explorerUrl, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), null, false, false, null, 0, null, true, 1008, null);
                return dialog;
            case 7:
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ParceledListSliceAdapterApi21);
                java.util.List<TxAssetChangeBean> input = this.AEQbTJ.getInput();
                java.lang.String name2 = (input == null || (txAssetChangeBean = (TxAssetChangeBean) CollectionsKt___CollectionsKt.firstOrNull(input)) == null) ? null : txAssetChangeBean.getName();
                java.lang.String price = this.AEQbTJ.getPrice();
                return new BaseItem.Dialog(strAYXKKw3, "1" + name2 + " ≈ " + (price != null ? pTB.formatLocalized$default(price, null, 1, null) : null) + " " + this.AEQbTJ.getPayCurrency());
            case 8:
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSessionID);
                java.lang.String mev = this.AEQbTJ.getMev();
                return new BaseItem.Dialog(strAYXKKw4, mev != null ? mev : "");
            case 9:
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.putLong);
                java.lang.String txFee = this.AEQbTJ.getTxFee();
                if (txFee != null) {
                    strOLrzqt = C54870xYj.OLrzqt(txFee, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                return new BaseItem.FragmentManager(strAYXKKw5, null, java.lang.String.valueOf(strOLrzqt), null, copydefault(), null, false, this.AEQbTJ.getTxType() == 10 ? NetworkFeeNoticeType.NOTICE_TYPE_TRANSACTION_FEE : NetworkFeeNoticeType.NOTICE_TYPE_NONE, 106, null);
            case 10:
                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RatingCompat);
                java.lang.String payAmount = this.AEQbTJ.getPayAmount();
                if (payAmount != null) {
                    strOLrzqt = C54870xYj.OLrzqt(payAmount, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                return new BaseItem.FragmentManager(strAYXKKw6, "", java.lang.String.valueOf(strOLrzqt), null, java.lang.String.valueOf(this.AEQbTJ.getPayCurrency()), null, false, null, 232, null);
            case 11:
                int txType = this.AEQbTJ.getTxType();
                if (txType == 8) {
                    java.lang.String serviceCharge = this.AEQbTJ.getServiceCharge();
                    int decimalNum2 = this.AEQbTJ.getDecimalNum();
                    C10854bwM c10854bwM5 = this.EZpvd;
                    java.lang.String strKWHzl2 = C54870xYj.KWHzl(serviceCharge, decimalNum2, c10854bwM5 != null ? c10854bwM5.AkhnZx() : 6, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
                    if (this.AEQbTJ.getTxStatus() != 1 && C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getServiceChargeUsd())) {
                        java.lang.String serviceChargeUsd = this.AEQbTJ.getServiceChargeUsd();
                        Intrinsics.copydefault((java.lang.Object) serviceChargeUsd);
                        explorerUrl = " (" + C54880xYt.formatValuationFromFee$default(serviceChargeUsd, null, false, false, 7, null) + ")";
                    }
                    return new BaseItem.FragmentManager(C33070mpX.AYXKKw(C13754dXa.FragmentManager.putBitmap), null, strKWHzl2, this.AEQbTJ.getCoinSymbol(), explorerUrl, null, false, null, 226, null);
                }
                if (txType == 10 || txType == 65) {
                    java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.putBitmap);
                    java.lang.String gasFee = this.AEQbTJ.getGasFee();
                    if (gasFee != null) {
                        strOLrzqt = C54870xYj.OLrzqt(gasFee, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    }
                    return new BaseItem.FragmentManager(strAYXKKw7, null, java.lang.String.valueOf(strOLrzqt), null, copydefault(), null, false, NetworkFeeNoticeType.NOTICE_TYPE_NETWORK_FEE, 106, null);
                }
                C10854bwM c10854bwM6 = this.EZpvd;
                if (((c10854bwM6 != null && c10854bwM6.hCLrkq()) || ((c10854bwM2 = this.EZpvd) != null && c10854bwM2.heceqZ())) && this.AEQbTJ.getFeeDecimalNum() != null && this.AEQbTJ.getFeeVdecimalNum() != null) {
                    java.lang.String serviceCharge2 = this.AEQbTJ.getServiceCharge();
                    java.lang.Integer feeDecimalNum = this.AEQbTJ.getFeeDecimalNum();
                    Intrinsics.copydefault(feeDecimalNum);
                    strKWHzl = C54870xYj.KWHzl(serviceCharge2, feeDecimalNum.intValue(), this.EZpvd.AkhnZx(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getUOpHash()) && this.AEQbTJ.getFeeDecimalNum() != null && this.AEQbTJ.getFeeVdecimalNum() != null) {
                    java.lang.String serviceCharge3 = this.AEQbTJ.getServiceCharge();
                    java.lang.Integer feeDecimalNum2 = this.AEQbTJ.getFeeDecimalNum();
                    Intrinsics.copydefault(feeDecimalNum2);
                    int iIntValue2 = feeDecimalNum2.intValue();
                    C10854bwM c10854bwM7 = this.EZpvd;
                    strKWHzl = C54870xYj.KWHzl(serviceCharge3, iIntValue2, c10854bwM7 != null ? c10854bwM7.AkhnZx() : 6, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
                } else {
                    java.lang.String serviceCharge4 = this.AEQbTJ.getServiceCharge();
                    int chainDecimalNum = this.AEQbTJ.getChainDecimalNum();
                    C10854bwM c10854bwM8 = this.EZpvd;
                    strKWHzl = C54870xYj.KWHzl(serviceCharge4, chainDecimalNum, c10854bwM8 != null ? c10854bwM8.AkhnZx() : 6, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
                }
                java.lang.String str2 = strKWHzl;
                C10854bwM c10854bwM9 = this.EZpvd;
                if (((c10854bwM9 != null && c10854bwM9.hCLrkq()) || ((c10854bwM3 = this.EZpvd) != null && c10854bwM3.heceqZ())) && this.AEQbTJ.getFeeDecimalNum() != null && this.AEQbTJ.getFeeVdecimalNum() != null) {
                    chainSymbol = this.AEQbTJ.getFeeName();
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getUOpHash()) && this.AEQbTJ.getFeeDecimalNum() != null && this.AEQbTJ.getFeeVdecimalNum() != null) {
                    chainSymbol = this.AEQbTJ.getFeeName();
                } else {
                    chainSymbol = this.AEQbTJ.getChainSymbol();
                }
                java.lang.String str3 = chainSymbol;
                if (this.AEQbTJ.getTxStatus() == 1 || !C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getServiceChargeUsd())) {
                    str = "";
                } else {
                    java.lang.String serviceChargeUsd2 = this.AEQbTJ.getServiceChargeUsd();
                    Intrinsics.copydefault((java.lang.Object) serviceChargeUsd2);
                    str = " (" + C54880xYt.formatValuationFromFee$default(serviceChargeUsd2, null, false, false, 7, null) + ")";
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getFeeRebate()) && C33129mqd.gEmmrt(str2, 0)) {
                    networkFeeNoticeType = NetworkFeeNoticeType.NOTICE_TYPE_NEGATIVE_FEE;
                } else {
                    networkFeeNoticeType = NetworkFeeNoticeType.NOTICE_TYPE_NONE;
                }
                NetworkFeeNoticeType networkFeeNoticeType2 = networkFeeNoticeType;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getUOpHash()) && (payMasterType = this.AEQbTJ.getPayMasterType()) != null && payMasterType.intValue() == 0) {
                    return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultLauncherHolder), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModels3));
                }
                if (this.AEQbTJ.getTxType() == 12) {
                    return new BaseItem.FragmentManager(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultLauncherHolder), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModels3), str2, str3, str, null, true, networkFeeNoticeType2, 32, null);
                }
                if (this.AEQbTJ.getTxStatus() == 1 && C33129mqd.AEQbTJ(this.AEQbTJ.getGasPrice(), "0") && C33129mqd.AEQbTJ(this.AEQbTJ.getGasLimit(), "0")) {
                    java.lang.String strWeiToGwei$default = C54869xYi.weiToGwei$default(this.AEQbTJ.getGasPrice(), java.lang.Integer.valueOf(this.AEQbTJ.getChainDecimalNum()), true, null, false, 12, null);
                    java.lang.String strOLrzqt = C54869xYi.OLrzqt(this.AEQbTJ.getGasLimit());
                    android.content.res.Resources resources = C32979mnm.EZpvd.OLrzqt().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    return new BaseItem.FragmentManager(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultLauncherHolder), null, str2, str3, str, pTD.KWHzl(resources, C13754dXa.FragmentManager.dlRikr, C56424yEw.AYXKKw(C56390yDp.OLrzqt("gas_price", strWeiToGwei$default), C56390yDp.OLrzqt("gas_limit", strOLrzqt))), false, networkFeeNoticeType2, 66, null);
                }
                return new BaseItem.FragmentManager(C33070mpX.AYXKKw(C13754dXa.FragmentManager.putBitmap), null, str2, str3, str, null, false, networkFeeNoticeType2, 98, null);
            case 12:
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getUOpHash())) {
                    txHash = this.AEQbTJ.getUOpHash();
                    Intrinsics.copydefault((java.lang.Object) txHash);
                } else {
                    txHash = this.AEQbTJ.getTxHash();
                }
                if (this.AEQbTJ.getExplorerUrl().length() > 0 && this.AEQbTJ.getShowExplorerUrl()) {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C14079deg.getAddressStr$default(C14079deg.EZpvd, txHash, false, 2, null));
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                    addressStr$default = spannableStringBuilder;
                } else {
                    addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, txHash, false, 2, null);
                }
                java.lang.CharSequence charSequence = addressStr$default;
                java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryKt);
                java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnyRes);
                if (this.AEQbTJ.getExplorerUrl().length() > 0 && this.AEQbTJ.getShowExplorerUrl()) {
                    explorerUrl = this.AEQbTJ.getExplorerUrl();
                }
                return new BaseItem.Application(strAYXKKw8, charSequence, txHash, strAYXKKw9, null, true, false, explorerUrl, 0, null, true, 848, null);
            case 13:
                java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1);
                TxAssetChangeBean approveInfo3 = this.AEQbTJ.getApproveInfo();
                if ((approveInfo3 != null ? approveInfo3.getAmount() : null) == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryKtrememberLauncherForActivityResult1);
                    approveInfo = this.AEQbTJ.getApproveInfo();
                    if ((approveInfo == null ? approveInfo.getAmount() : null) != null) {
                        TxAssetChangeBean approveInfo4 = this.AEQbTJ.getApproveInfo();
                        if (!C33129mqd.OLrzqt(approveInfo4 != null ? approveInfo4.getAmount() : null, "115792089237316195423570985008687907853269984665640564039457584007913129639935") && (approveInfo2 = this.AEQbTJ.getApproveInfo()) != null && (name = approveInfo2.getName()) != null) {
                            explorerUrl = name;
                        }
                    }
                    actionBar = new BaseItem.ActionBar(strAYXKKw10, strAYXKKw, explorerUrl);
                } else {
                    TxAssetChangeBean approveInfo5 = this.AEQbTJ.getApproveInfo();
                    if (!C33129mqd.OLrzqt(approveInfo5 != null ? approveInfo5.getAmount() : null, "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                        TxAssetChangeBean approveInfo6 = this.AEQbTJ.getApproveInfo();
                        C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(approveInfo6 != null ? approveInfo6.getCoinId() : null);
                        TxAssetChangeBean approveInfo7 = this.AEQbTJ.getApproveInfo();
                        if (approveInfo7 == null || (amount = approveInfo7.getAmount()) == null) {
                            strAYXKKw = "";
                        } else {
                            TxAssetChangeBean approveInfo8 = this.AEQbTJ.getApproveInfo();
                            if (approveInfo8 != null && (decimalNum = approveInfo8.getDecimalNum()) != null) {
                                iIntValue = decimalNum.intValue();
                            }
                            strAYXKKw = C54870xYj.EZpvd(amount, iIntValue, c10854bwMKWHzl != null ? c10854bwMKWHzl.AkhnZx() : 6, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                            if (strAYXKKw == null) {
                            }
                        }
                    }
                    approveInfo = this.AEQbTJ.getApproveInfo();
                    if ((approveInfo == null ? approveInfo.getAmount() : null) != null) {
                    }
                    actionBar = new BaseItem.ActionBar(strAYXKKw10, strAYXKKw, explorerUrl);
                }
                return actionBar;
            case 14:
                return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCustomTitle), C33070mpX.AYXKKw(C13754dXa.FragmentManager.UnZVfqExternalSyntheticApiModelOutline0));
            case 15:
                java.lang.String feeRebate = this.AEQbTJ.getFeeRebate();
                java.lang.String strKWHzl3 = C54870xYj.KWHzl(feeRebate == null ? "" : feeRebate, this.AEQbTJ.getChainDecimalNum(), this.AEQbTJ.getChainVdecimalNum(), this.AEQbTJ.getChainSymbol(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
                if (this.AEQbTJ.getTxStatus() != 1 && C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getFeeRebateUsd())) {
                    java.lang.String feeRebateUsd = this.AEQbTJ.getFeeRebateUsd();
                    Intrinsics.copydefault((java.lang.Object) feeRebateUsd);
                    explorerUrl = " (" + C54880xYt.formatValuationFromFee$default(feeRebateUsd, null, false, false, 7, null) + ")";
                }
                dialog = new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnTrimMemoryListener), strKWHzl3 + explorerUrl);
                return dialog;
            case 16:
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewDetachedFromWindow));
                spannableStringBuilder2.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder2.length(), 33);
                actionBar = new BaseItem.TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUpPanel), spannableStringBuilder2, this.AEQbTJ.getExplorerUrl(), 0);
                return actionBar;
            case 17:
                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IntentSenderRequestBuilderFlag));
                spannableStringBuilder3.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder3.length(), 33);
                actionBar = new BaseItem.TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUpPanel), spannableStringBuilder3, "", 1);
                return actionBar;
            case 18:
                android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder(C33070mpX.AYXKKw(C13754dXa.FragmentManager.vLaW));
                spannableStringBuilder4.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder4.length(), 33);
                actionBar = new BaseItem.TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUpPanel), spannableStringBuilder4, C33129mqd.gEmmrt(djBIcL()), 2);
                return actionBar;
            case 19:
                android.text.SpannableStringBuilder spannableStringBuilder5 = new android.text.SpannableStringBuilder(this.AEQbTJ.getCapitalVendorName());
                spannableStringBuilder5.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder5.length(), 33);
                actionBar = new BaseItem.TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUpPanel), spannableStringBuilder5, this.AEQbTJ.getRampURL(), 0);
                return actionBar;
            case 20:
                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(this.AEQbTJ.getMainCoinId());
                if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.DGOPHZ()) {
                    pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentDialogExternalSyntheticLambda1));
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fAklCm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26Impl));
                }
                java.lang.String str4 = (java.lang.String) pairOLrzqt.component1();
                java.lang.String str5 = (java.lang.String) pairOLrzqt.component2();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getMemo())) {
                    java.lang.String memo = this.AEQbTJ.getMemo();
                    java.lang.String str6 = memo == null ? "" : memo;
                    java.lang.String memo2 = this.AEQbTJ.getMemo();
                    return new BaseItem.Application(str4, str6, memo2 == null ? "" : memo2, str5, null, false, false, null, 3, null, true, 752, null);
                }
                return new BaseItem.Dialog(str4, "--");
            case 21:
                return new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRuDPQV), this.AEQbTJ.getNonce());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean hDKMBd() {
        return this.AEQbTJ.getTxStatus() == 1 && this.AEQbTJ.isShowCancel() && C15487eKd.AEQbTJ.EZpvd(this.AEQbTJ.getTxType());
    }

    public final boolean zLjUOn() {
        return this.AEQbTJ.getTxStatus() == 1 && this.AEQbTJ.isShowSpeedUp() && C15487eKd.AEQbTJ.EZpvd(this.AEQbTJ.getTxType());
    }

    public final boolean wlaJM() {
        return this.AEQbTJ.getTxStatus() == 1 && this.AEQbTJ.isShowSpeedupCancel() && C15487eKd.AEQbTJ.EZpvd(this.AEQbTJ.getTxType());
    }

    public final boolean getNewProxyInstance() {
        return this.AEQbTJ.getShowTxRepeatBroadcast();
    }

    public final boolean iwGUEr() {
        return this.AEQbTJ.getShowCloseTransaction();
    }

    public final boolean AuCTelauCTel() {
        java.lang.String okexUID;
        java.lang.String okexUID2;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getRecordId()) && C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getOkexUID()) && ((this.AEQbTJ.getTxType() == 8 || this.AEQbTJ.getTxType() == 9) && (okexUID2 = this.AEQbTJ.getOkexUID()) != null && okexUID2.contentEquals(dZP.OLrzqt.EZpvd()))) {
            return true;
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getExchangeUrl()) && C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.getOkexUID()) && this.AEQbTJ.getTxType() == 10 && (okexUID = this.AEQbTJ.getOkexUID()) != null && okexUID.contentEquals(dZP.OLrzqt.EZpvd());
    }

    public final java.lang.String copydefault() {
        java.lang.Object next;
        java.lang.String symbol;
        if (this.AEQbTJ.getTxType() != 65) {
            return java.lang.String.valueOf(this.AEQbTJ.getPayCurrency());
        }
        java.util.Iterator<T> it = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QOLQEE().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ValuationCurrencyBean) next).getIsoCode(), (java.lang.Object) this.AEQbTJ.getPayCurrency())) {
                break;
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        return (valuationCurrencyBean == null || (symbol = valuationCurrencyBean.getSymbol()) == null) ? java.lang.String.valueOf(this.AEQbTJ.getPayCurrency()) : symbol;
    }

    public final boolean OLrzqt(java.lang.Long l) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l);
        if (c10854bwMKWHzl == null) {
            return true;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        return (C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(c10854bwMKWHzl.OcIXYQ()) || c10854bwMKWHzl.DarRvM() || abstractC12782ctV == null || !abstractC12782ctV.KWHzl(c10854bwMKWHzl.OcIXYQ())) ? false : true;
    }
}
