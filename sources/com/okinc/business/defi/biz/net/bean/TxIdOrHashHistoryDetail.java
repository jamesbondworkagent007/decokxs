package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxIdOrHashHistoryDetail implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String PHISHING = "phishing";
    public static final String RISK_TRANSACTION = "riskTransaction";
    private TxAssetChangeBean approveInfo;
    private List<TxDetailApproveInfo> approveInfoList;
    private String blockHeight;
    private UTXOSpeedUpInfoJsonBean btcSpeedUpInfo;
    private final String capitalVendorName;
    private int chainDecimalNum;
    private String chainSymbol;
    private int chainVdecimalNum;
    private String coinAmount;
    private long coinId;
    private String coinSymbol;
    private String confirmedCount;
    private TxContractInfo contractInfo;
    private List<TxDetailContractInfo> contractInfoList;
    private String currencyAmount;
    private Integer currencyId;
    private int decimalNum;
    private String direction;
    private String domain;
    private String exchangeUrl;
    private String explorerUrl;
    private String failReason;
    private Integer feeDecimalNum;
    private String feeName;
    private String feeRebate;
    private String feeRebateUsd;
    private Integer feeVdecimalNum;
    private String from;
    private String gasFee;
    private String gasLimit;
    private String gasPrice;
    private Integer hideTxType;
    private String icon;
    private List<Address> inAdrList;
    private List<IncludeAssetChangeBean> include;
    private List<TxAssetChangeBean> input;
    private String inputData;
    private InvestTxData investTxData;
    private boolean isShowCancel;
    private boolean isShowPending;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedupCancel;
    private String kysTxTypeText;
    private long mainCoinId;
    private String memo;
    private String mev;
    private String multipleAddressNumLimit;
    private String nonce;
    private String okexAccount;
    private String okexUID;
    private String orderId;
    private List<String> orderTxIdList;
    private List<Address> outAdrList;
    private List<TxAssetChangeBean> output;
    private String payAmount;
    private String payCurrency;
    private String payCurrencyIcon;
    private Integer payMasterType;
    private String pendingToastInfo;
    private String price;
    private String priorityFee;
    private String rampURL;
    private String recordId;
    private RegisterInfo registerInfo;
    private Integer repeatTxType;
    private String rowId;
    private String serviceCharge;
    private String serviceChargeUsd;
    private boolean showCloseTransaction;
    private boolean showExplorerUrl;
    private boolean showTxRepeatBroadcast;
    private String tipsType;
    private String totalConfirm;
    private String txFee;
    private String txHash;
    private String txId;
    private Integer txSource;
    private int txStatus;
    private long txTime;
    private int txType;
    private String uOpHash;
    private int vdecimalNum;
    private Boolean x402FreeGas;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxIdOrHashHistoryDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxIdOrHashHistoryDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxIdOrHashHistoryDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string8 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            long j3 = parcel.readLong();
            int i5 = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList11.add(Address.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            int i8 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(i8);
            int i9 = 0;
            while (i9 != i8) {
                arrayList12.add(Address.CREATOR.createFromParcel(parcel));
                i9++;
                i8 = i8;
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            int i10 = parcel.readInt();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            String string25 = parcel.readString();
            UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBeanCreateFromParcel = parcel.readInt() == 0 ? null : UTXOSpeedUpInfoJsonBean.CREATOR.createFromParcel(parcel);
            String string26 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string11;
                arrayList = arrayList12;
                arrayList2 = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = arrayList12;
                ArrayList arrayList13 = new ArrayList(i11);
                str = string11;
                int i12 = 0;
                while (i12 != i11) {
                    arrayList13.add(TxAssetChangeBean.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList2 = arrayList13;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(i13);
                arrayList3 = arrayList2;
                int i14 = 0;
                while (i14 != i13) {
                    arrayList14.add(TxAssetChangeBean.CREATOR.createFromParcel(parcel));
                    i14++;
                    i13 = i13;
                }
                arrayList4 = arrayList14;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList4;
                arrayList6 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i15);
                arrayList5 = arrayList4;
                int i16 = 0;
                while (i16 != i15) {
                    arrayList15.add(IncludeAssetChangeBean.CREATOR.createFromParcel(parcel));
                    i16++;
                    i15 = i15;
                }
                arrayList6 = arrayList15;
            }
            TxContractInfo txContractInfoCreateFromParcel = parcel.readInt() == 0 ? null : TxContractInfo.CREATOR.createFromParcel(parcel);
            RegisterInfo registerInfoCreateFromParcel = parcel.readInt() == 0 ? null : RegisterInfo.CREATOR.createFromParcel(parcel);
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            TxAssetChangeBean txAssetChangeBeanCreateFromParcel = parcel.readInt() == 0 ? null : TxAssetChangeBean.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            InvestTxData investTxDataCreateFromParcel = parcel.readInt() == 0 ? null : InvestTxData.CREATOR.createFromParcel(parcel);
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList6;
                arrayList8 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i17);
                arrayList7 = arrayList6;
                int i18 = 0;
                while (i18 != i17) {
                    arrayList16.add(TxDetailContractInfo.CREATOR.createFromParcel(parcel));
                    i18++;
                    i17 = i17;
                }
                arrayList8 = arrayList16;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = arrayList8;
                arrayList10 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i19);
                arrayList9 = arrayList8;
                int i20 = 0;
                while (i20 != i19) {
                    arrayList17.add(TxDetailApproveInfo.CREATOR.createFromParcel(parcel));
                    i20++;
                    i19 = i19;
                }
                arrayList10 = arrayList17;
            }
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z7 = parcel.readInt() != 0;
            String string46 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TxIdOrHashHistoryDetail(string, string2, string3, string4, j, j2, string5, string6, string7, i, i2, string8, i3, i4, j3, i5, string9, string10, arrayList11, arrayList, str, string12, string13, string14, string15, i10, string16, string17, string18, string19, string20, string21, string22, string23, string24, numValueOf, z, z2, z3, z4, z5, z6, string25, uTXOSpeedUpInfoJsonBeanCreateFromParcel, string26, arrayList3, arrayList5, arrayList7, txContractInfoCreateFromParcel, registerInfoCreateFromParcel, numValueOf2, txAssetChangeBeanCreateFromParcel, arrayListCreateStringArrayList, investTxDataCreateFromParcel, string27, string28, numValueOf3, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, numValueOf4, numValueOf5, string41, string42, string43, numValueOf6, arrayList9, arrayList10, string44, string45, numValueOf7, z7, string46, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxIdOrHashHistoryDetail[] newArray(int i) {
            return new TxIdOrHashHistoryDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxIdOrHashHistoryDetail() {
        this((String) null, (String) null, (String) null, (String) null, 0L, 0L, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, 0L, 0, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, false, false, false, false, false, (String) null, (UTXOSpeedUpInfoJsonBean) null, (String) null, (List) null, (List) null, (List) null, (TxContractInfo) null, (RegisterInfo) null, (Integer) null, (TxAssetChangeBean) null, (List) null, (InvestTxData) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (List) null, (List) null, (String) null, (String) null, (Integer) null, false, (String) null, (Boolean) null, -1, -1, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.multipleAddressNumLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component19() {
        return this.inAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component20() {
        return this.outAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.kysTxTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.totalConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.confirmedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.isShowSpeedupCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.showCloseTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component42() {
        return this.showTxRepeatBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean component44() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.serviceChargeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> component46() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> component47() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IncludeAssetChangeBean> component48() {
        return this.include;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxContractInfo component49() {
        return this.contractInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterInfo component50() {
        return this.registerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component51() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxAssetChangeBean component52() {
        return this.approveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component53() {
        return this.orderTxIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxData component54() {
        return this.investTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.recordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component57() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.okexUID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.mainCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.payCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.payCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.capitalVendorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.txFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.exchangeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.feeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component70() {
        return this.feeDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component71() {
        return this.feeVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.feeRebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.feeRebateUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component75() {
        return this.payMasterType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxDetailContractInfo> component76() {
        return this.contractInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxDetailApproveInfo> component77() {
        return this.approveInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.rampURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component80() {
        return this.hideTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component81() {
        return this.showExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component83() {
        return this.x402FreeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxIdOrHashHistoryDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, long j, long j2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, @NotNull String str8, int i3, int i4, long j3, int i5, @NotNull String str9, @NotNull String str10, @NotNull List<Address> list, @NotNull List<Address> list2, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i6, String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, String str21, @NotNull String str22, @NotNull String str23, String str24, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String str25, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str26, List<TxAssetChangeBean> list3, List<TxAssetChangeBean> list4, List<IncludeAssetChangeBean> list5, TxContractInfo txContractInfo, RegisterInfo registerInfo, Integer num2, TxAssetChangeBean txAssetChangeBean, List<String> list6, InvestTxData investTxData, String str27, String str28, Integer num3, String str29, @NotNull String str30, String str31, String str32, @NotNull String str33, @NotNull String str34, String str35, String str36, String str37, String str38, String str39, String str40, Integer num4, Integer num5, String str41, String str42, String str43, Integer num6, List<TxDetailContractInfo> list7, List<TxDetailApproveInfo> list8, String str44, @NotNull String str45, Integer num7, boolean z7, String str46, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str45, "");
        return new TxIdOrHashHistoryDetail(str, str2, str3, str4, j, j2, str5, str6, str7, i, i2, str8, i3, i4, j3, i5, str9, str10, list, list2, str11, str12, str13, str14, str15, i6, str16, str17, str18, str19, str20, str21, str22, str23, str24, num, z, z2, z3, z4, z5, z6, str25, uTXOSpeedUpInfoJsonBean, str26, list3, list4, list5, txContractInfo, registerInfo, num2, txAssetChangeBean, list6, investTxData, str27, str28, num3, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, num4, num5, str41, str42, str43, num6, list7, list8, str44, str45, num7, z7, str46, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxIdOrHashHistoryDetail)) {
            return false;
        }
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail = (TxIdOrHashHistoryDetail) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) txIdOrHashHistoryDetail.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) txIdOrHashHistoryDetail.txHash) && Intrinsics.EZpvd((Object) this.from, (Object) txIdOrHashHistoryDetail.from) && Intrinsics.EZpvd((Object) this.icon, (Object) txIdOrHashHistoryDetail.icon) && this.coinId == txIdOrHashHistoryDetail.coinId && this.mainCoinId == txIdOrHashHistoryDetail.mainCoinId && Intrinsics.EZpvd((Object) this.coinAmount, (Object) txIdOrHashHistoryDetail.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) txIdOrHashHistoryDetail.currencyAmount) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) txIdOrHashHistoryDetail.coinSymbol) && this.decimalNum == txIdOrHashHistoryDetail.decimalNum && this.vdecimalNum == txIdOrHashHistoryDetail.vdecimalNum && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) txIdOrHashHistoryDetail.chainSymbol) && this.chainDecimalNum == txIdOrHashHistoryDetail.chainDecimalNum && this.chainVdecimalNum == txIdOrHashHistoryDetail.chainVdecimalNum && this.txTime == txIdOrHashHistoryDetail.txTime && this.txStatus == txIdOrHashHistoryDetail.txStatus && Intrinsics.EZpvd((Object) this.rowId, (Object) txIdOrHashHistoryDetail.rowId) && Intrinsics.EZpvd((Object) this.multipleAddressNumLimit, (Object) txIdOrHashHistoryDetail.multipleAddressNumLimit) && Intrinsics.EZpvd(this.inAdrList, txIdOrHashHistoryDetail.inAdrList) && Intrinsics.EZpvd(this.outAdrList, txIdOrHashHistoryDetail.outAdrList) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) txIdOrHashHistoryDetail.serviceCharge) && Intrinsics.EZpvd((Object) this.blockHeight, (Object) txIdOrHashHistoryDetail.blockHeight) && Intrinsics.EZpvd((Object) this.failReason, (Object) txIdOrHashHistoryDetail.failReason) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) txIdOrHashHistoryDetail.explorerUrl) && Intrinsics.EZpvd((Object) this.domain, (Object) txIdOrHashHistoryDetail.domain) && this.txType == txIdOrHashHistoryDetail.txType && Intrinsics.EZpvd((Object) this.kysTxTypeText, (Object) txIdOrHashHistoryDetail.kysTxTypeText) && Intrinsics.EZpvd((Object) this.direction, (Object) txIdOrHashHistoryDetail.direction) && Intrinsics.EZpvd((Object) this.totalConfirm, (Object) txIdOrHashHistoryDetail.totalConfirm) && Intrinsics.EZpvd((Object) this.confirmedCount, (Object) txIdOrHashHistoryDetail.confirmedCount) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) txIdOrHashHistoryDetail.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) txIdOrHashHistoryDetail.priorityFee) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) txIdOrHashHistoryDetail.gasLimit) && Intrinsics.EZpvd((Object) this.nonce, (Object) txIdOrHashHistoryDetail.nonce) && Intrinsics.EZpvd((Object) this.inputData, (Object) txIdOrHashHistoryDetail.inputData) && Intrinsics.EZpvd(this.txSource, txIdOrHashHistoryDetail.txSource) && this.isShowPending == txIdOrHashHistoryDetail.isShowPending && this.isShowSpeedUp == txIdOrHashHistoryDetail.isShowSpeedUp && this.isShowCancel == txIdOrHashHistoryDetail.isShowCancel && this.isShowSpeedupCancel == txIdOrHashHistoryDetail.isShowSpeedupCancel && this.showCloseTransaction == txIdOrHashHistoryDetail.showCloseTransaction && this.showTxRepeatBroadcast == txIdOrHashHistoryDetail.showTxRepeatBroadcast && Intrinsics.EZpvd((Object) this.pendingToastInfo, (Object) txIdOrHashHistoryDetail.pendingToastInfo) && Intrinsics.EZpvd(this.btcSpeedUpInfo, txIdOrHashHistoryDetail.btcSpeedUpInfo) && Intrinsics.EZpvd((Object) this.serviceChargeUsd, (Object) txIdOrHashHistoryDetail.serviceChargeUsd) && Intrinsics.EZpvd(this.input, txIdOrHashHistoryDetail.input) && Intrinsics.EZpvd(this.output, txIdOrHashHistoryDetail.output) && Intrinsics.EZpvd(this.include, txIdOrHashHistoryDetail.include) && Intrinsics.EZpvd(this.contractInfo, txIdOrHashHistoryDetail.contractInfo) && Intrinsics.EZpvd(this.registerInfo, txIdOrHashHistoryDetail.registerInfo) && Intrinsics.EZpvd(this.repeatTxType, txIdOrHashHistoryDetail.repeatTxType) && Intrinsics.EZpvd(this.approveInfo, txIdOrHashHistoryDetail.approveInfo) && Intrinsics.EZpvd(this.orderTxIdList, txIdOrHashHistoryDetail.orderTxIdList) && Intrinsics.EZpvd(this.investTxData, txIdOrHashHistoryDetail.investTxData) && Intrinsics.EZpvd((Object) this.okexAccount, (Object) txIdOrHashHistoryDetail.okexAccount) && Intrinsics.EZpvd((Object) this.recordId, (Object) txIdOrHashHistoryDetail.recordId) && Intrinsics.EZpvd(this.currencyId, txIdOrHashHistoryDetail.currencyId) && Intrinsics.EZpvd((Object) this.okexUID, (Object) txIdOrHashHistoryDetail.okexUID) && Intrinsics.EZpvd((Object) this.orderId, (Object) txIdOrHashHistoryDetail.orderId) && Intrinsics.EZpvd((Object) this.payAmount, (Object) txIdOrHashHistoryDetail.payAmount) && Intrinsics.EZpvd((Object) this.payCurrency, (Object) txIdOrHashHistoryDetail.payCurrency) && Intrinsics.EZpvd((Object) this.payCurrencyIcon, (Object) txIdOrHashHistoryDetail.payCurrencyIcon) && Intrinsics.EZpvd((Object) this.capitalVendorName, (Object) txIdOrHashHistoryDetail.capitalVendorName) && Intrinsics.EZpvd((Object) this.price, (Object) txIdOrHashHistoryDetail.price) && Intrinsics.EZpvd((Object) this.txFee, (Object) txIdOrHashHistoryDetail.txFee) && Intrinsics.EZpvd((Object) this.exchangeUrl, (Object) txIdOrHashHistoryDetail.exchangeUrl) && Intrinsics.EZpvd((Object) this.gasFee, (Object) txIdOrHashHistoryDetail.gasFee) && Intrinsics.EZpvd((Object) this.memo, (Object) txIdOrHashHistoryDetail.memo) && Intrinsics.EZpvd((Object) this.feeName, (Object) txIdOrHashHistoryDetail.feeName) && Intrinsics.EZpvd(this.feeDecimalNum, txIdOrHashHistoryDetail.feeDecimalNum) && Intrinsics.EZpvd(this.feeVdecimalNum, txIdOrHashHistoryDetail.feeVdecimalNum) && Intrinsics.EZpvd((Object) this.feeRebate, (Object) txIdOrHashHistoryDetail.feeRebate) && Intrinsics.EZpvd((Object) this.feeRebateUsd, (Object) txIdOrHashHistoryDetail.feeRebateUsd) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) txIdOrHashHistoryDetail.uOpHash) && Intrinsics.EZpvd(this.payMasterType, txIdOrHashHistoryDetail.payMasterType) && Intrinsics.EZpvd(this.contractInfoList, txIdOrHashHistoryDetail.contractInfoList) && Intrinsics.EZpvd(this.approveInfoList, txIdOrHashHistoryDetail.approveInfoList) && Intrinsics.EZpvd((Object) this.mev, (Object) txIdOrHashHistoryDetail.mev) && Intrinsics.EZpvd((Object) this.rampURL, (Object) txIdOrHashHistoryDetail.rampURL) && Intrinsics.EZpvd(this.hideTxType, txIdOrHashHistoryDetail.hideTxType) && this.showExplorerUrl == txIdOrHashHistoryDetail.showExplorerUrl && Intrinsics.EZpvd((Object) this.tipsType, (Object) txIdOrHashHistoryDetail.tipsType) && Intrinsics.EZpvd(this.x402FreeGas, txIdOrHashHistoryDetail.x402FreeGas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxAssetChangeBean getApproveInfo() {
        return this.approveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxDetailApproveInfo> getApproveInfoList() {
        return this.approveInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockHeight() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean getBtcSpeedUpInfo() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCapitalVendorName() {
        return this.capitalVendorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainDecimalNum() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainVdecimalNum() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirmedCount() {
        return this.confirmedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxContractInfo getContractInfo() {
        return this.contractInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxDetailContractInfo> getContractInfoList() {
        return this.contractInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeUrl() {
        return this.exchangeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeDecimalNum() {
        return this.feeDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeName() {
        return this.feeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRebate() {
        return this.feeRebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRebateUsd() {
        return this.feeRebateUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeVdecimalNum() {
        return this.feeVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHideTxType() {
        return this.hideTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> getInAdrList() {
        return this.inAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IncludeAssetChangeBean> getInclude() {
        return this.include;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> getInput() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxData getInvestTxData() {
        return this.investTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKysTxTypeText() {
        return this.kysTxTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMainCoinId() {
        return this.mainCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMev() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMultipleAddressNumLimit() {
        return this.multipleAddressNumLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkexUID() {
        return this.okexUID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOrderTxIdList() {
        return this.orderTxIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> getOutAdrList() {
        return this.outAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> getOutput() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayAmount() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrency() {
        return this.payCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrencyIcon() {
        return this.payCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPayMasterType() {
        return this.payMasterType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingToastInfo() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRampURL() {
        return this.rampURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecordId() {
        return this.recordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterInfo getRegisterInfo() {
        return this.registerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRepeatTxType() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceChargeUsd() {
        return this.serviceChargeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCloseTransaction() {
        return this.showCloseTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowExplorerUrl() {
        return this.showExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowTxRepeatBroadcast() {
        return this.showTxRepeatBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipsType() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalConfirm() {
        return this.totalConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxFee() {
        return this.txFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxStatus() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTxTime() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUOpHash() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getX402FreeGas() {
        return this.x402FreeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txId.hashCode();
        int iHashCode2 = this.txHash.hashCode();
        int iHashCode3 = this.from.hashCode();
        String str = this.icon;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Long.hashCode(this.coinId);
        int iHashCode6 = Long.hashCode(this.mainCoinId);
        int iHashCode7 = this.coinAmount.hashCode();
        int iHashCode8 = this.currencyAmount.hashCode();
        int iHashCode9 = this.coinSymbol.hashCode();
        int iHashCode10 = Integer.hashCode(this.decimalNum);
        int iHashCode11 = Integer.hashCode(this.vdecimalNum);
        int iHashCode12 = this.chainSymbol.hashCode();
        int iHashCode13 = Integer.hashCode(this.chainDecimalNum);
        int iHashCode14 = Integer.hashCode(this.chainVdecimalNum);
        int iHashCode15 = Long.hashCode(this.txTime);
        int iHashCode16 = Integer.hashCode(this.txStatus);
        int iHashCode17 = this.rowId.hashCode();
        int iHashCode18 = this.multipleAddressNumLimit.hashCode();
        int iHashCode19 = this.inAdrList.hashCode();
        int iHashCode20 = this.outAdrList.hashCode();
        int iHashCode21 = this.serviceCharge.hashCode();
        int iHashCode22 = this.blockHeight.hashCode();
        int iHashCode23 = this.failReason.hashCode();
        int iHashCode24 = this.explorerUrl.hashCode();
        int iHashCode25 = this.domain.hashCode();
        int iHashCode26 = Integer.hashCode(this.txType);
        String str2 = this.kysTxTypeText;
        int iHashCode27 = str2 == null ? 0 : str2.hashCode();
        int iHashCode28 = this.direction.hashCode();
        int iHashCode29 = this.totalConfirm.hashCode();
        int iHashCode30 = this.confirmedCount.hashCode();
        int iHashCode31 = this.gasPrice.hashCode();
        String str3 = this.priorityFee;
        int iHashCode32 = str3 == null ? 0 : str3.hashCode();
        int iHashCode33 = this.gasLimit.hashCode();
        int iHashCode34 = this.nonce.hashCode();
        String str4 = this.inputData;
        int iHashCode35 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.txSource;
        int iHashCode36 = num == null ? 0 : num.hashCode();
        int iHashCode37 = Boolean.hashCode(this.isShowPending);
        int iHashCode38 = Boolean.hashCode(this.isShowSpeedUp);
        int iHashCode39 = Boolean.hashCode(this.isShowCancel);
        int iHashCode40 = Boolean.hashCode(this.isShowSpeedupCancel);
        int iHashCode41 = Boolean.hashCode(this.showCloseTransaction);
        int iHashCode42 = Boolean.hashCode(this.showTxRepeatBroadcast);
        int iHashCode43 = this.pendingToastInfo.hashCode();
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        int iHashCode44 = uTXOSpeedUpInfoJsonBean == null ? 0 : uTXOSpeedUpInfoJsonBean.hashCode();
        String str5 = this.serviceChargeUsd;
        int iHashCode45 = str5 == null ? 0 : str5.hashCode();
        List<TxAssetChangeBean> list = this.input;
        int iHashCode46 = list == null ? 0 : list.hashCode();
        List<TxAssetChangeBean> list2 = this.output;
        int iHashCode47 = list2 == null ? 0 : list2.hashCode();
        List<IncludeAssetChangeBean> list3 = this.include;
        int iHashCode48 = list3 == null ? 0 : list3.hashCode();
        TxContractInfo txContractInfo = this.contractInfo;
        int iHashCode49 = txContractInfo == null ? 0 : txContractInfo.hashCode();
        RegisterInfo registerInfo = this.registerInfo;
        int iHashCode50 = registerInfo == null ? 0 : registerInfo.hashCode();
        Integer num2 = this.repeatTxType;
        int iHashCode51 = num2 == null ? 0 : num2.hashCode();
        TxAssetChangeBean txAssetChangeBean = this.approveInfo;
        int iHashCode52 = txAssetChangeBean == null ? 0 : txAssetChangeBean.hashCode();
        List<String> list4 = this.orderTxIdList;
        int iHashCode53 = list4 == null ? 0 : list4.hashCode();
        InvestTxData investTxData = this.investTxData;
        int iHashCode54 = investTxData == null ? 0 : investTxData.hashCode();
        String str6 = this.okexAccount;
        int iHashCode55 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.recordId;
        int iHashCode56 = str7 == null ? 0 : str7.hashCode();
        Integer num3 = this.currencyId;
        int iHashCode57 = num3 == null ? 0 : num3.hashCode();
        String str8 = this.okexUID;
        int iHashCode58 = str8 == null ? 0 : str8.hashCode();
        int iHashCode59 = this.orderId.hashCode();
        String str9 = this.payAmount;
        int iHashCode60 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.payCurrency;
        int iHashCode61 = str10 == null ? 0 : str10.hashCode();
        int iHashCode62 = this.payCurrencyIcon.hashCode();
        int iHashCode63 = this.capitalVendorName.hashCode();
        String str11 = this.price;
        int iHashCode64 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.txFee;
        int iHashCode65 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.exchangeUrl;
        int iHashCode66 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.gasFee;
        int iHashCode67 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.memo;
        int iHashCode68 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.feeName;
        int iHashCode69 = str16 == null ? 0 : str16.hashCode();
        Integer num4 = this.feeDecimalNum;
        int iHashCode70 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.feeVdecimalNum;
        int iHashCode71 = num5 == null ? 0 : num5.hashCode();
        String str17 = this.feeRebate;
        int iHashCode72 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.feeRebateUsd;
        int iHashCode73 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.uOpHash;
        int iHashCode74 = str19 == null ? 0 : str19.hashCode();
        Integer num6 = this.payMasterType;
        int iHashCode75 = num6 == null ? 0 : num6.hashCode();
        List<TxDetailContractInfo> list5 = this.contractInfoList;
        int iHashCode76 = list5 == null ? 0 : list5.hashCode();
        List<TxDetailApproveInfo> list6 = this.approveInfoList;
        int iHashCode77 = list6 == null ? 0 : list6.hashCode();
        String str20 = this.mev;
        int iHashCode78 = str20 == null ? 0 : str20.hashCode();
        int iHashCode79 = this.rampURL.hashCode();
        Integer num7 = this.hideTxType;
        int iHashCode80 = num7 == null ? 0 : num7.hashCode();
        int iHashCode81 = Boolean.hashCode(this.showExplorerUrl);
        String str21 = this.tipsType;
        int iHashCode82 = str21 == null ? 0 : str21.hashCode();
        Boolean bool = this.x402FreeGas;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPending() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedupCancel() {
        return this.isShowSpeedupCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveInfo(TxAssetChangeBean txAssetChangeBean) {
        this.approveInfo = txAssetChangeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveInfoList(List<TxDetailApproveInfo> list) {
        this.approveInfoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockHeight = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcSpeedUpInfo(UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean) {
        this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainDecimalNum(int i) {
        this.chainDecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainVdecimalNum(int i) {
        this.chainVdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmedCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.confirmedCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractInfo(TxContractInfo txContractInfo) {
        this.contractInfo = txContractInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractInfoList(List<TxDetailContractInfo> list) {
        this.contractInfoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(int i) {
        this.decimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeUrl(String str) {
        this.exchangeUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeDecimalNum(Integer num) {
        this.feeDecimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeName(String str) {
        this.feeName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRebate(String str) {
        this.feeRebate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRebateUsd(String str) {
        this.feeRebateUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeVdecimalNum(Integer num) {
        this.feeVdecimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasFee(String str) {
        this.gasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideTxType(Integer num) {
        this.hideTxType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInAdrList(@NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inAdrList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInclude(List<IncludeAssetChangeBean> list) {
        this.include = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInput(List<TxAssetChangeBean> list) {
        this.input = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestTxData(InvestTxData investTxData) {
        this.investTxData = investTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKysTxTypeText(String str) {
        this.kysTxTypeText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainCoinId(long j) {
        this.mainCoinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMev(String str) {
        this.mev = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultipleAddressNumLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.multipleAddressNumLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexAccount(String str) {
        this.okexAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexUID(String str) {
        this.okexUID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderTxIdList(List<String> list) {
        this.orderTxIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutAdrList(@NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.outAdrList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutput(List<TxAssetChangeBean> list) {
        this.output = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayAmount(String str) {
        this.payAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrency(String str) {
        this.payCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrencyIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCurrencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayMasterType(Integer num) {
        this.payMasterType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingToastInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingToastInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFee(String str) {
        this.priorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRampURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rampURL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecordId(String str) {
        this.recordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegisterInfo(RegisterInfo registerInfo) {
        this.registerInfo = registerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatTxType(Integer num) {
        this.repeatTxType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rowId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceChargeUsd(String str) {
        this.serviceChargeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCloseTransaction(boolean z) {
        this.showCloseTransaction = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowExplorerUrl(boolean z) {
        this.showExplorerUrl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPending(boolean z) {
        this.isShowPending = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUp(boolean z) {
        this.isShowSpeedUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedupCancel(boolean z) {
        this.isShowSpeedupCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTxRepeatBroadcast(boolean z) {
        this.showTxRepeatBroadcast = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipsType(String str) {
        this.tipsType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalConfirm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalConfirm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxFee(String str) {
        this.txFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxSource(Integer num) {
        this.txSource = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxStatus(int i) {
        this.txStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxTime(long j) {
        this.txTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(int i) {
        this.txType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUOpHash(String str) {
        this.uOpHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(int i) {
        this.vdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setX402FreeGas(Boolean bool) {
        this.x402FreeGas = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxIdOrHashHistoryDetail(txId=" + this.txId + ", txHash=" + this.txHash + ", from=" + this.from + ", icon=" + this.icon + ", coinId=" + this.coinId + ", mainCoinId=" + this.mainCoinId + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", coinSymbol=" + this.coinSymbol + ", decimalNum=" + this.decimalNum + ", vdecimalNum=" + this.vdecimalNum + ", chainSymbol=" + this.chainSymbol + ", chainDecimalNum=" + this.chainDecimalNum + ", chainVdecimalNum=" + this.chainVdecimalNum + ", txTime=" + this.txTime + ", txStatus=" + this.txStatus + ", rowId=" + this.rowId + ", multipleAddressNumLimit=" + this.multipleAddressNumLimit + ", inAdrList=" + this.inAdrList + ", outAdrList=" + this.outAdrList + ", serviceCharge=" + this.serviceCharge + ", blockHeight=" + this.blockHeight + ", failReason=" + this.failReason + ", explorerUrl=" + this.explorerUrl + ", domain=" + this.domain + ", txType=" + this.txType + ", kysTxTypeText=" + this.kysTxTypeText + ", direction=" + this.direction + ", totalConfirm=" + this.totalConfirm + ", confirmedCount=" + this.confirmedCount + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", gasLimit=" + this.gasLimit + ", nonce=" + this.nonce + ", inputData=" + this.inputData + ", txSource=" + this.txSource + ", isShowPending=" + this.isShowPending + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedupCancel=" + this.isShowSpeedupCancel + ", showCloseTransaction=" + this.showCloseTransaction + ", showTxRepeatBroadcast=" + this.showTxRepeatBroadcast + ", pendingToastInfo=" + this.pendingToastInfo + ", btcSpeedUpInfo=" + this.btcSpeedUpInfo + ", serviceChargeUsd=" + this.serviceChargeUsd + ", input=" + this.input + ", output=" + this.output + ", include=" + this.include + ", contractInfo=" + this.contractInfo + ", registerInfo=" + this.registerInfo + ", repeatTxType=" + this.repeatTxType + ", approveInfo=" + this.approveInfo + ", orderTxIdList=" + this.orderTxIdList + ", investTxData=" + this.investTxData + ", okexAccount=" + this.okexAccount + ", recordId=" + this.recordId + ", currencyId=" + this.currencyId + ", okexUID=" + this.okexUID + ", orderId=" + this.orderId + ", payAmount=" + this.payAmount + ", payCurrency=" + this.payCurrency + ", payCurrencyIcon=" + this.payCurrencyIcon + ", capitalVendorName=" + this.capitalVendorName + ", price=" + this.price + ", txFee=" + this.txFee + ", exchangeUrl=" + this.exchangeUrl + ", gasFee=" + this.gasFee + ", memo=" + this.memo + ", feeName=" + this.feeName + ", feeDecimalNum=" + this.feeDecimalNum + ", feeVdecimalNum=" + this.feeVdecimalNum + ", feeRebate=" + this.feeRebate + ", feeRebateUsd=" + this.feeRebateUsd + ", uOpHash=" + this.uOpHash + ", payMasterType=" + this.payMasterType + ", contractInfoList=" + this.contractInfoList + ", approveInfoList=" + this.approveInfoList + ", mev=" + this.mev + ", rampURL=" + this.rampURL + ", hideTxType=" + this.hideTxType + ", showExplorerUrl=" + this.showExplorerUrl + ", tipsType=" + this.tipsType + ", x402FreeGas=" + this.x402FreeGas + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        parcel.writeString(this.from);
        parcel.writeString(this.icon);
        parcel.writeLong(this.coinId);
        parcel.writeLong(this.mainCoinId);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.coinSymbol);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.vdecimalNum);
        parcel.writeString(this.chainSymbol);
        parcel.writeInt(this.chainDecimalNum);
        parcel.writeInt(this.chainVdecimalNum);
        parcel.writeLong(this.txTime);
        parcel.writeInt(this.txStatus);
        parcel.writeString(this.rowId);
        parcel.writeString(this.multipleAddressNumLimit);
        List<Address> list = this.inAdrList;
        parcel.writeInt(list.size());
        Iterator<Address> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<Address> list2 = this.outAdrList;
        parcel.writeInt(list2.size());
        Iterator<Address> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.serviceCharge);
        parcel.writeString(this.blockHeight);
        parcel.writeString(this.failReason);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.domain);
        parcel.writeInt(this.txType);
        parcel.writeString(this.kysTxTypeText);
        parcel.writeString(this.direction);
        parcel.writeString(this.totalConfirm);
        parcel.writeString(this.confirmedCount);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.nonce);
        parcel.writeString(this.inputData);
        Integer num = this.txSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isShowPending ? 1 : 0);
        parcel.writeInt(this.isShowSpeedUp ? 1 : 0);
        parcel.writeInt(this.isShowCancel ? 1 : 0);
        parcel.writeInt(this.isShowSpeedupCancel ? 1 : 0);
        parcel.writeInt(this.showCloseTransaction ? 1 : 0);
        parcel.writeInt(this.showTxRepeatBroadcast ? 1 : 0);
        parcel.writeString(this.pendingToastInfo);
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        if (uTXOSpeedUpInfoJsonBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uTXOSpeedUpInfoJsonBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.serviceChargeUsd);
        List<TxAssetChangeBean> list3 = this.input;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<TxAssetChangeBean> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<TxAssetChangeBean> list4 = this.output;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<TxAssetChangeBean> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<IncludeAssetChangeBean> list5 = this.include;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<IncludeAssetChangeBean> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        TxContractInfo txContractInfo = this.contractInfo;
        if (txContractInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            txContractInfo.writeToParcel(parcel, i);
        }
        RegisterInfo registerInfo = this.registerInfo;
        if (registerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            registerInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.repeatTxType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        TxAssetChangeBean txAssetChangeBean = this.approveInfo;
        if (txAssetChangeBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            txAssetChangeBean.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.orderTxIdList);
        InvestTxData investTxData = this.investTxData;
        if (investTxData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTxData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.okexAccount);
        parcel.writeString(this.recordId);
        Integer num3 = this.currencyId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.okexUID);
        parcel.writeString(this.orderId);
        parcel.writeString(this.payAmount);
        parcel.writeString(this.payCurrency);
        parcel.writeString(this.payCurrencyIcon);
        parcel.writeString(this.capitalVendorName);
        parcel.writeString(this.price);
        parcel.writeString(this.txFee);
        parcel.writeString(this.exchangeUrl);
        parcel.writeString(this.gasFee);
        parcel.writeString(this.memo);
        parcel.writeString(this.feeName);
        Integer num4 = this.feeDecimalNum;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.feeVdecimalNum;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.feeRebate);
        parcel.writeString(this.feeRebateUsd);
        parcel.writeString(this.uOpHash);
        Integer num6 = this.payMasterType;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        List<TxDetailContractInfo> list6 = this.contractInfoList;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<TxDetailContractInfo> it6 = list6.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        List<TxDetailApproveInfo> list7 = this.approveInfoList;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            Iterator<TxDetailApproveInfo> it7 = list7.iterator();
            while (it7.hasNext()) {
                it7.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.mev);
        parcel.writeString(this.rampURL);
        Integer num7 = this.hideTxType;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeInt(this.showExplorerUrl ? 1 : 0);
        parcel.writeString(this.tipsType);
        Boolean bool = this.x402FreeGas;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ TxIdOrHashHistoryDetail(int i, int i2, int i3, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, int i4, int i5, String str8, int i6, int i7, long j3, int i8, String str9, String str10, List list, List list2, String str11, String str12, String str13, String str14, String str15, int i9, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str25, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str26, List list3, List list4, List list5, TxContractInfo txContractInfo, RegisterInfo registerInfo, Integer num2, TxAssetChangeBean txAssetChangeBean, List list6, InvestTxData investTxData, String str27, String str28, Integer num3, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, Integer num4, Integer num5, String str41, String str42, String str43, Integer num6, List list7, List list8, String str44, String str45, Integer num7, boolean z7, String str46, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = "";
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str2;
        }
        if ((i & 4) == 0) {
            this.from = "";
        } else {
            this.from = str3;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
        if ((i & 16) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 32) == 0) {
            this.mainCoinId = 0L;
        } else {
            this.mainCoinId = j2;
        }
        if ((i & 64) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str5;
        }
        if ((i & 128) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str6;
        }
        if ((i & 256) == 0) {
            this.coinSymbol = "";
        } else {
            this.coinSymbol = str7;
        }
        if ((i & 512) == 0) {
            this.decimalNum = 0;
        } else {
            this.decimalNum = i4;
        }
        if ((i & 1024) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = i5;
        }
        if ((i & 2048) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str8;
        }
        if ((i & 4096) == 0) {
            this.chainDecimalNum = 0;
        } else {
            this.chainDecimalNum = i6;
        }
        if ((i & 8192) == 0) {
            this.chainVdecimalNum = 0;
        } else {
            this.chainVdecimalNum = i7;
        }
        this.txTime = (i & 16384) != 0 ? j3 : 0L;
        if ((i & 32768) == 0) {
            this.txStatus = 0;
        } else {
            this.txStatus = i8;
        }
        if ((i & 65536) == 0) {
            this.rowId = "";
        } else {
            this.rowId = str9;
        }
        this.multipleAddressNumLimit = (i & 131072) == 0 ? "5" : str10;
        this.inAdrList = (262144 & i) == 0 ? new ArrayList() : list;
        this.outAdrList = (524288 & i) == 0 ? new ArrayList() : list2;
        if ((1048576 & i) == 0) {
            this.serviceCharge = "";
        } else {
            this.serviceCharge = str11;
        }
        if ((2097152 & i) == 0) {
            this.blockHeight = "";
        } else {
            this.blockHeight = str12;
        }
        if ((4194304 & i) == 0) {
            this.failReason = "";
        } else {
            this.failReason = str13;
        }
        if ((8388608 & i) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str14;
        }
        if ((16777216 & i) == 0) {
            this.domain = "";
        } else {
            this.domain = str15;
        }
        if ((33554432 & i) == 0) {
            this.txType = 0;
        } else {
            this.txType = i9;
        }
        if ((67108864 & i) == 0) {
            this.kysTxTypeText = null;
        } else {
            this.kysTxTypeText = str16;
        }
        if ((134217728 & i) == 0) {
            this.direction = "";
        } else {
            this.direction = str17;
        }
        if ((268435456 & i) == 0) {
            this.totalConfirm = "";
        } else {
            this.totalConfirm = str18;
        }
        if ((536870912 & i) == 0) {
            this.confirmedCount = "";
        } else {
            this.confirmedCount = str19;
        }
        if ((1073741824 & i) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str20;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str21;
        }
        if ((i2 & 1) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str22;
        }
        if ((i2 & 2) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str23;
        }
        if ((i2 & 4) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str24;
        }
        if ((i2 & 8) == 0) {
            this.txSource = null;
        } else {
            this.txSource = num;
        }
        if ((i2 & 16) == 0) {
            this.isShowPending = false;
        } else {
            this.isShowPending = z;
        }
        if ((i2 & 32) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z2;
        }
        if ((i2 & 64) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z3;
        }
        if ((i2 & 128) == 0) {
            this.isShowSpeedupCancel = false;
        } else {
            this.isShowSpeedupCancel = z4;
        }
        if ((i2 & 256) == 0) {
            this.showCloseTransaction = false;
        } else {
            this.showCloseTransaction = z5;
        }
        if ((i2 & 512) == 0) {
            this.showTxRepeatBroadcast = false;
        } else {
            this.showTxRepeatBroadcast = z6;
        }
        if ((i2 & 1024) == 0) {
            this.pendingToastInfo = "";
        } else {
            this.pendingToastInfo = str25;
        }
        if ((i2 & 2048) == 0) {
            this.btcSpeedUpInfo = null;
        } else {
            this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        }
        if ((i2 & 4096) == 0) {
            this.serviceChargeUsd = null;
        } else {
            this.serviceChargeUsd = str26;
        }
        if ((i2 & 8192) == 0) {
            this.input = null;
        } else {
            this.input = list3;
        }
        if ((i2 & 16384) == 0) {
            this.output = null;
        } else {
            this.output = list4;
        }
        if ((i2 & 32768) == 0) {
            this.include = null;
        } else {
            this.include = list5;
        }
        if ((i2 & 65536) == 0) {
            this.contractInfo = null;
        } else {
            this.contractInfo = txContractInfo;
        }
        if ((i2 & 131072) == 0) {
            this.registerInfo = null;
        } else {
            this.registerInfo = registerInfo;
        }
        this.repeatTxType = (262144 & i2) == 0 ? 0 : num2;
        if ((524288 & i2) == 0) {
            this.approveInfo = null;
        } else {
            this.approveInfo = txAssetChangeBean;
        }
        if ((1048576 & i2) == 0) {
            this.orderTxIdList = null;
        } else {
            this.orderTxIdList = list6;
        }
        if ((2097152 & i2) == 0) {
            this.investTxData = null;
        } else {
            this.investTxData = investTxData;
        }
        if ((4194304 & i2) == 0) {
            this.okexAccount = null;
        } else {
            this.okexAccount = str27;
        }
        if ((8388608 & i2) == 0) {
            this.recordId = null;
        } else {
            this.recordId = str28;
        }
        if ((16777216 & i2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num3;
        }
        if ((33554432 & i2) == 0) {
            this.okexUID = null;
        } else {
            this.okexUID = str29;
        }
        if ((67108864 & i2) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str30;
        }
        if ((134217728 & i2) == 0) {
            this.payAmount = null;
        } else {
            this.payAmount = str31;
        }
        if ((268435456 & i2) == 0) {
            this.payCurrency = null;
        } else {
            this.payCurrency = str32;
        }
        if ((536870912 & i2) == 0) {
            this.payCurrencyIcon = "";
        } else {
            this.payCurrencyIcon = str33;
        }
        if ((1073741824 & i2) == 0) {
            this.capitalVendorName = "";
        } else {
            this.capitalVendorName = str34;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.price = null;
        } else {
            this.price = str35;
        }
        if ((i3 & 1) == 0) {
            this.txFee = null;
        } else {
            this.txFee = str36;
        }
        if ((i3 & 2) == 0) {
            this.exchangeUrl = null;
        } else {
            this.exchangeUrl = str37;
        }
        if ((i3 & 4) == 0) {
            this.gasFee = null;
        } else {
            this.gasFee = str38;
        }
        if ((i3 & 8) == 0) {
            this.memo = null;
        } else {
            this.memo = str39;
        }
        if ((i3 & 16) == 0) {
            this.feeName = null;
        } else {
            this.feeName = str40;
        }
        if ((i3 & 32) == 0) {
            this.feeDecimalNum = null;
        } else {
            this.feeDecimalNum = num4;
        }
        if ((i3 & 64) == 0) {
            this.feeVdecimalNum = null;
        } else {
            this.feeVdecimalNum = num5;
        }
        if ((i3 & 128) == 0) {
            this.feeRebate = null;
        } else {
            this.feeRebate = str41;
        }
        if ((i3 & 256) == 0) {
            this.feeRebateUsd = null;
        } else {
            this.feeRebateUsd = str42;
        }
        if ((i3 & 512) == 0) {
            this.uOpHash = null;
        } else {
            this.uOpHash = str43;
        }
        if ((i3 & 1024) == 0) {
            this.payMasterType = null;
        } else {
            this.payMasterType = num6;
        }
        if ((i3 & 2048) == 0) {
            this.contractInfoList = null;
        } else {
            this.contractInfoList = list7;
        }
        if ((i3 & 4096) == 0) {
            this.approveInfoList = null;
        } else {
            this.approveInfoList = list8;
        }
        if ((i3 & 8192) == 0) {
            this.mev = null;
        } else {
            this.mev = str44;
        }
        if ((i3 & 16384) == 0) {
            this.rampURL = "";
        } else {
            this.rampURL = str45;
        }
        this.hideTxType = (i3 & 32768) == 0 ? 0 : num7;
        if ((i3 & 65536) == 0) {
            this.showExplorerUrl = false;
        } else {
            this.showExplorerUrl = z7;
        }
        if ((i3 & 131072) == 0) {
            this.tipsType = null;
        } else {
            this.tipsType = str46;
        }
        if ((262144 & i3) == 0) {
            this.x402FreeGas = null;
        } else {
            this.x402FreeGas = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, txIdOrHashHistoryDetail.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, txIdOrHashHistoryDetail.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, txIdOrHashHistoryDetail.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txIdOrHashHistoryDetail.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txIdOrHashHistoryDetail.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, txIdOrHashHistoryDetail.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txIdOrHashHistoryDetail.mainCoinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, txIdOrHashHistoryDetail.mainCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, txIdOrHashHistoryDetail.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, txIdOrHashHistoryDetail.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.coinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, txIdOrHashHistoryDetail.coinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txIdOrHashHistoryDetail.decimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, txIdOrHashHistoryDetail.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || txIdOrHashHistoryDetail.vdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, txIdOrHashHistoryDetail.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, txIdOrHashHistoryDetail.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || txIdOrHashHistoryDetail.chainDecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, txIdOrHashHistoryDetail.chainDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || txIdOrHashHistoryDetail.chainVdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, txIdOrHashHistoryDetail.chainVdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || txIdOrHashHistoryDetail.txTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, txIdOrHashHistoryDetail.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || txIdOrHashHistoryDetail.txStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, txIdOrHashHistoryDetail.txStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.rowId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, txIdOrHashHistoryDetail.rowId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.multipleAddressNumLimit, (Object) "5")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, txIdOrHashHistoryDetail.multipleAddressNumLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(txIdOrHashHistoryDetail.inAdrList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], txIdOrHashHistoryDetail.inAdrList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(txIdOrHashHistoryDetail.outAdrList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], txIdOrHashHistoryDetail.outAdrList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.serviceCharge, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, txIdOrHashHistoryDetail.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.blockHeight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, txIdOrHashHistoryDetail.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.failReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, txIdOrHashHistoryDetail.failReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, txIdOrHashHistoryDetail.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.domain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, txIdOrHashHistoryDetail.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || txIdOrHashHistoryDetail.txType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, txIdOrHashHistoryDetail.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || txIdOrHashHistoryDetail.kysTxTypeText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.kysTxTypeText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, txIdOrHashHistoryDetail.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.totalConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, txIdOrHashHistoryDetail.totalConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.confirmedCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, txIdOrHashHistoryDetail.confirmedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, txIdOrHashHistoryDetail.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || txIdOrHashHistoryDetail.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.gasLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, txIdOrHashHistoryDetail.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.nonce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, txIdOrHashHistoryDetail.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || txIdOrHashHistoryDetail.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || txIdOrHashHistoryDetail.txSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.txSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || txIdOrHashHistoryDetail.isShowPending) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, txIdOrHashHistoryDetail.isShowPending);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || txIdOrHashHistoryDetail.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, txIdOrHashHistoryDetail.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || txIdOrHashHistoryDetail.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, txIdOrHashHistoryDetail.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || txIdOrHashHistoryDetail.isShowSpeedupCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, txIdOrHashHistoryDetail.isShowSpeedupCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || txIdOrHashHistoryDetail.showCloseTransaction) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 40, txIdOrHashHistoryDetail.showCloseTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || txIdOrHashHistoryDetail.showTxRepeatBroadcast) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 41, txIdOrHashHistoryDetail.showTxRepeatBroadcast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.pendingToastInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, txIdOrHashHistoryDetail.pendingToastInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || txIdOrHashHistoryDetail.btcSpeedUpInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, UTXOSpeedUpInfoJsonBean$$serializer.INSTANCE, txIdOrHashHistoryDetail.btcSpeedUpInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || txIdOrHashHistoryDetail.serviceChargeUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.serviceChargeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || txIdOrHashHistoryDetail.input != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, kSerializerArr[45], txIdOrHashHistoryDetail.input);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || txIdOrHashHistoryDetail.output != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, kSerializerArr[46], txIdOrHashHistoryDetail.output);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || txIdOrHashHistoryDetail.include != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, kSerializerArr[47], txIdOrHashHistoryDetail.include);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || txIdOrHashHistoryDetail.contractInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, TxContractInfo$$serializer.INSTANCE, txIdOrHashHistoryDetail.contractInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || txIdOrHashHistoryDetail.registerInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, RegisterInfo$$serializer.INSTANCE, txIdOrHashHistoryDetail.registerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || (num2 = txIdOrHashHistoryDetail.repeatTxType) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.repeatTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || txIdOrHashHistoryDetail.approveInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, TxAssetChangeBean$$serializer.INSTANCE, txIdOrHashHistoryDetail.approveInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || txIdOrHashHistoryDetail.orderTxIdList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, kSerializerArr[52], txIdOrHashHistoryDetail.orderTxIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || txIdOrHashHistoryDetail.investTxData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, InvestTxData$$serializer.INSTANCE, txIdOrHashHistoryDetail.investTxData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || txIdOrHashHistoryDetail.okexAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.okexAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || txIdOrHashHistoryDetail.recordId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.recordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || txIdOrHashHistoryDetail.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || txIdOrHashHistoryDetail.okexUID != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.okexUID);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, txIdOrHashHistoryDetail.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || txIdOrHashHistoryDetail.payAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.payAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || txIdOrHashHistoryDetail.payCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.payCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.payCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, txIdOrHashHistoryDetail.payCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.capitalVendorName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, txIdOrHashHistoryDetail.capitalVendorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || txIdOrHashHistoryDetail.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || txIdOrHashHistoryDetail.txFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.txFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || txIdOrHashHistoryDetail.exchangeUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.exchangeUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || txIdOrHashHistoryDetail.gasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.gasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || txIdOrHashHistoryDetail.memo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.memo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || txIdOrHashHistoryDetail.feeName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.feeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || txIdOrHashHistoryDetail.feeDecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.feeDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || txIdOrHashHistoryDetail.feeVdecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.feeVdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || txIdOrHashHistoryDetail.feeRebate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.feeRebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || txIdOrHashHistoryDetail.feeRebateUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.feeRebateUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || txIdOrHashHistoryDetail.uOpHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.uOpHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || txIdOrHashHistoryDetail.payMasterType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.payMasterType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || txIdOrHashHistoryDetail.contractInfoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, kSerializerArr[75], txIdOrHashHistoryDetail.contractInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || txIdOrHashHistoryDetail.approveInfoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, kSerializerArr[76], txIdOrHashHistoryDetail.approveInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || txIdOrHashHistoryDetail.mev != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.mev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) txIdOrHashHistoryDetail.rampURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, txIdOrHashHistoryDetail.rampURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || (num = txIdOrHashHistoryDetail.hideTxType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, IntSerializer.INSTANCE, txIdOrHashHistoryDetail.hideTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || txIdOrHashHistoryDetail.showExplorerUrl) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 80, txIdOrHashHistoryDetail.showExplorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || txIdOrHashHistoryDetail.tipsType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 81, StringSerializer.INSTANCE, txIdOrHashHistoryDetail.tipsType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) && txIdOrHashHistoryDetail.x402FreeGas == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, BooleanSerializer.INSTANCE, txIdOrHashHistoryDetail.x402FreeGas);
    }

    public TxIdOrHashHistoryDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, long j, long j2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, @NotNull String str8, int i3, int i4, long j3, int i5, @NotNull String str9, @NotNull String str10, @NotNull List<Address> list, @NotNull List<Address> list2, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i6, String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, String str21, @NotNull String str22, @NotNull String str23, String str24, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String str25, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str26, List<TxAssetChangeBean> list3, List<TxAssetChangeBean> list4, List<IncludeAssetChangeBean> list5, TxContractInfo txContractInfo, RegisterInfo registerInfo, Integer num2, TxAssetChangeBean txAssetChangeBean, List<String> list6, InvestTxData investTxData, String str27, String str28, Integer num3, String str29, @NotNull String str30, String str31, String str32, @NotNull String str33, @NotNull String str34, String str35, String str36, String str37, String str38, String str39, String str40, Integer num4, Integer num5, String str41, String str42, String str43, Integer num6, List<TxDetailContractInfo> list7, List<TxDetailApproveInfo> list8, String str44, @NotNull String str45, Integer num7, boolean z7, String str46, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str45, "");
        this.txId = str;
        this.txHash = str2;
        this.from = str3;
        this.icon = str4;
        this.coinId = j;
        this.mainCoinId = j2;
        this.coinAmount = str5;
        this.currencyAmount = str6;
        this.coinSymbol = str7;
        this.decimalNum = i;
        this.vdecimalNum = i2;
        this.chainSymbol = str8;
        this.chainDecimalNum = i3;
        this.chainVdecimalNum = i4;
        this.txTime = j3;
        this.txStatus = i5;
        this.rowId = str9;
        this.multipleAddressNumLimit = str10;
        this.inAdrList = list;
        this.outAdrList = list2;
        this.serviceCharge = str11;
        this.blockHeight = str12;
        this.failReason = str13;
        this.explorerUrl = str14;
        this.domain = str15;
        this.txType = i6;
        this.kysTxTypeText = str16;
        this.direction = str17;
        this.totalConfirm = str18;
        this.confirmedCount = str19;
        this.gasPrice = str20;
        this.priorityFee = str21;
        this.gasLimit = str22;
        this.nonce = str23;
        this.inputData = str24;
        this.txSource = num;
        this.isShowPending = z;
        this.isShowSpeedUp = z2;
        this.isShowCancel = z3;
        this.isShowSpeedupCancel = z4;
        this.showCloseTransaction = z5;
        this.showTxRepeatBroadcast = z6;
        this.pendingToastInfo = str25;
        this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        this.serviceChargeUsd = str26;
        this.input = list3;
        this.output = list4;
        this.include = list5;
        this.contractInfo = txContractInfo;
        this.registerInfo = registerInfo;
        this.repeatTxType = num2;
        this.approveInfo = txAssetChangeBean;
        this.orderTxIdList = list6;
        this.investTxData = investTxData;
        this.okexAccount = str27;
        this.recordId = str28;
        this.currencyId = num3;
        this.okexUID = str29;
        this.orderId = str30;
        this.payAmount = str31;
        this.payCurrency = str32;
        this.payCurrencyIcon = str33;
        this.capitalVendorName = str34;
        this.price = str35;
        this.txFee = str36;
        this.exchangeUrl = str37;
        this.gasFee = str38;
        this.memo = str39;
        this.feeName = str40;
        this.feeDecimalNum = num4;
        this.feeVdecimalNum = num5;
        this.feeRebate = str41;
        this.feeRebateUsd = str42;
        this.uOpHash = str43;
        this.payMasterType = num6;
        this.contractInfoList = list7;
        this.approveInfoList = list8;
        this.mev = str44;
        this.rampURL = str45;
        this.hideTxType = num7;
        this.showExplorerUrl = z7;
        this.tipsType = str46;
        this.x402FreeGas = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x03ff: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r172v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r172v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r172v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r172v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0028: ARITH (r172v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r90v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0031: ARITH (r172v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r92v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r172v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r172v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r172v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r172v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r97v0 int))
  (wrap:int:0x0068: TERNARY null = ((wrap:int:0x005f: ARITH (r172v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r98v0 int))
  (wrap:java.lang.String:0x0073: TERNARY null = ((wrap:int:0x006a: ARITH (r172v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:int:0x007e: TERNARY null = ((wrap:int:0x0075: ARITH (r172v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r100v0 int))
  (wrap:int:0x0089: TERNARY null = ((wrap:int:0x0080: ARITH (r172v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r101v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x008b: ARITH (r172v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r102v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0097: ARITH (r172v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r104v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r172v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r172v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("5") : (r106v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r172v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00be: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:126) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r107v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r172v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cc: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:127) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r108v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r172v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r172v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r172v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r111v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r172v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r172v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x010b: ARITH (r172v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r114v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r172v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r172v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r172v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r172v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0142: ARITH (r172v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r172v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0155: ARITH (r173v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015e: ARITH (r173v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0167: ARITH (r173v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r123v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0170: ARITH (r173v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r124v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0179: ARITH (r173v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r125v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0182: ARITH (r173v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r126v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x018b: ARITH (r173v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r127v0 boolean))
  (wrap:boolean:0x019d: TERNARY null = ((wrap:int:0x0194: ARITH (r173v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r128v0 boolean))
  (wrap:boolean:0x01a8: TERNARY null = ((wrap:int:0x019f: ARITH (r173v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r129v0 boolean))
  (wrap:boolean:0x01b3: TERNARY null = ((wrap:int:0x01aa: ARITH (r173v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r130v0 boolean))
  (wrap:java.lang.String:0x01be: TERNARY null = ((wrap:int:0x01b5: ARITH (r173v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r131v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean:0x01c8: TERNARY null = ((wrap:int:0x01c0: ARITH (r173v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean) : (r132v0 com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean))
  (wrap:java.lang.String:0x01d2: TERNARY null = ((wrap:int:0x01ca: ARITH (r173v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r133v0 java.lang.String))
  (wrap:java.util.List:0x01dc: TERNARY null = ((wrap:int:0x01d4: ARITH (r173v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r134v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01de: ARITH (r173v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r135v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01e9: ARITH (r173v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r136v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.TxContractInfo:?: TERNARY null = ((wrap:int:0x01f2: ARITH (r173v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.TxContractInfo) : (r137v0 com.okinc.business.defi.biz.net.bean.TxContractInfo))
  (wrap:com.okinc.business.defi.biz.net.bean.RegisterInfo:?: TERNARY null = ((wrap:int:0x01fb: ARITH (r173v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.RegisterInfo) : (r138v0 com.okinc.business.defi.biz.net.bean.RegisterInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0206: ARITH (r173v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r139v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.net.bean.TxAssetChangeBean:?: TERNARY null = ((wrap:int:0x0213: ARITH (r173v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.TxAssetChangeBean) : (r140v0 com.okinc.business.defi.biz.net.bean.TxAssetChangeBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x021e: ARITH (r173v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r141v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.InvestTxData:?: TERNARY null = ((wrap:int:0x0229: ARITH (r173v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.InvestTxData) : (r142v0 com.okinc.business.defi.biz.net.bean.InvestTxData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0234: ARITH (r173v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r143v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023f: ARITH (r173v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r144v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x024a: ARITH (r173v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r145v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0255: ARITH (r173v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r146v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0260: ARITH (r173v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r147v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x026b: ARITH (r173v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r148v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0276: ARITH (r173v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r149v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0281: ARITH (r173v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r150v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x028c: ARITH (r173v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r151v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0297: ARITH (r173v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r152v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x029f: ARITH (r174v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r153v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02a8: ARITH (r174v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r154v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02b1: ARITH (r174v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r155v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02ba: ARITH (r174v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r156v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02c3: ARITH (r174v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r157v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x02cc: ARITH (r174v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r158v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x02d5: ARITH (r174v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r159v0 java.lang.Integer))
  (wrap:java.lang.String:0x02e8: TERNARY null = ((wrap:int:0x02e0: ARITH (r174v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r160v0 java.lang.String))
  (wrap:java.lang.String:0x02f2: TERNARY null = ((wrap:int:0x02ea: ARITH (r174v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r161v0 java.lang.String))
  (wrap:java.lang.String:0x02fc: TERNARY null = ((wrap:int:0x02f4: ARITH (r174v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r162v0 java.lang.String))
  (wrap:java.lang.Integer:0x0306: TERNARY null = ((wrap:int:0x02fe: ARITH (r174v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r163v0 java.lang.Integer))
  (wrap:java.util.List:0x0310: TERNARY null = ((wrap:int:0x0308: ARITH (r174v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r164v0 java.util.List))
  (wrap:java.util.List:0x031a: TERNARY null = ((wrap:int:0x0312: ARITH (r174v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r165v0 java.util.List))
  (wrap:java.lang.String:0x0324: TERNARY null = ((wrap:int:0x031c: ARITH (r174v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r166v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0326: ARITH (r174v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r167v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0332: ARITH (r174v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r168v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x033d: ARITH (r174v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r169v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0344: ARITH (r174v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r170v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x034f: ARITH (r174v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r171v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, long, int, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.Address>, java.util.List<com.okinc.business.defi.biz.net.bean.Address>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.TxAssetChangeBean>, java.util.List<com.okinc.business.defi.biz.net.bean.TxAssetChangeBean>, java.util.List<com.okinc.business.defi.biz.net.bean.IncludeAssetChangeBean>, com.okinc.business.defi.biz.net.bean.TxContractInfo, com.okinc.business.defi.biz.net.bean.RegisterInfo, java.lang.Integer, com.okinc.business.defi.biz.net.bean.TxAssetChangeBean, java.util.List<java.lang.String>, com.okinc.business.defi.biz.net.bean.InvestTxData, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<com.okinc.business.defi.biz.net.bean.TxDetailContractInfo>, java.util.List<com.okinc.business.defi.biz.net.bean.TxDetailApproveInfo>, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.Boolean):void (m)] (LINE:107) call: com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, long, int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, java.util.List, java.util.List, java.util.List, com.okinc.business.defi.biz.net.bean.TxContractInfo, com.okinc.business.defi.biz.net.bean.RegisterInfo, java.lang.Integer, com.okinc.business.defi.biz.net.bean.TxAssetChangeBean, java.util.List, com.okinc.business.defi.biz.net.bean.InvestTxData, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TxIdOrHashHistoryDetail(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, int i, int i2, String str8, int i3, int i4, long j3, int i5, String str9, String str10, List list, List list2, String str11, String str12, String str13, String str14, String str15, int i6, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str25, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str26, List list3, List list4, List list5, TxContractInfo txContractInfo, RegisterInfo registerInfo, Integer num2, TxAssetChangeBean txAssetChangeBean, List list6, InvestTxData investTxData, String str27, String str28, Integer num3, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, Integer num4, Integer num5, String str41, String str42, String str43, Integer num6, List list7, List list8, String str44, String str45, Integer num7, boolean z7, String str46, Boolean bool, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? 0L : j, (i7 & 32) != 0 ? 0L : j2, (i7 & 64) != 0 ? "" : str5, (i7 & 128) != 0 ? "" : str6, (i7 & 256) != 0 ? "" : str7, (i7 & 512) != 0 ? 0 : i, (i7 & 1024) != 0 ? 0 : i2, (i7 & 2048) != 0 ? "" : str8, (i7 & 4096) != 0 ? 0 : i3, (i7 & 8192) != 0 ? 0 : i4, (i7 & 16384) != 0 ? 0L : j3, (i7 & 32768) != 0 ? 0 : i5, (i7 & 65536) != 0 ? "" : str9, (i7 & 131072) != 0 ? "5" : str10, (i7 & 262144) != 0 ? new ArrayList() : list, (i7 & 524288) != 0 ? new ArrayList() : list2, (i7 & 1048576) != 0 ? "" : str11, (i7 & 2097152) != 0 ? "" : str12, (i7 & 4194304) != 0 ? "" : str13, (i7 & 8388608) != 0 ? "" : str14, (i7 & 16777216) != 0 ? "" : str15, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i6, (i7 & 67108864) != 0 ? null : str16, (i7 & 134217728) != 0 ? "" : str17, (i7 & 268435456) != 0 ? "" : str18, (i7 & 536870912) != 0 ? "" : str19, (i7 & 1073741824) != 0 ? "" : str20, (i7 & Integer.MIN_VALUE) != 0 ? null : str21, (i8 & 1) != 0 ? "" : str22, (i8 & 2) != 0 ? "" : str23, (i8 & 4) != 0 ? null : str24, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? false : z, (i8 & 32) != 0 ? false : z2, (i8 & 64) != 0 ? false : z3, (i8 & 128) != 0 ? false : z4, (i8 & 256) != 0 ? false : z5, (i8 & 512) != 0 ? false : z6, (i8 & 1024) != 0 ? "" : str25, (i8 & 2048) != 0 ? null : uTXOSpeedUpInfoJsonBean, (i8 & 4096) != 0 ? null : str26, (i8 & 8192) != 0 ? null : list3, (i8 & 16384) != 0 ? null : list4, (i8 & 32768) != 0 ? null : list5, (i8 & 65536) != 0 ? null : txContractInfo, (i8 & 131072) != 0 ? null : registerInfo, (i8 & 262144) != 0 ? 0 : num2, (i8 & 524288) != 0 ? null : txAssetChangeBean, (i8 & 1048576) != 0 ? null : list6, (i8 & 2097152) != 0 ? null : investTxData, (i8 & 4194304) != 0 ? null : str27, (i8 & 8388608) != 0 ? null : str28, (i8 & 16777216) != 0 ? null : num3, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str29, (i8 & 67108864) != 0 ? "" : str30, (i8 & 134217728) != 0 ? null : str31, (i8 & 268435456) != 0 ? null : str32, (i8 & 536870912) != 0 ? "" : str33, (i8 & 1073741824) != 0 ? "" : str34, (i8 & Integer.MIN_VALUE) != 0 ? null : str35, (i9 & 1) != 0 ? null : str36, (i9 & 2) != 0 ? null : str37, (i9 & 4) != 0 ? null : str38, (i9 & 8) != 0 ? null : str39, (i9 & 16) != 0 ? null : str40, (i9 & 32) != 0 ? null : num4, (i9 & 64) != 0 ? null : num5, (i9 & 128) != 0 ? null : str41, (i9 & 256) != 0 ? null : str42, (i9 & 512) != 0 ? null : str43, (i9 & 1024) != 0 ? null : num6, (i9 & 2048) != 0 ? null : list7, (i9 & 4096) != 0 ? null : list8, (i9 & 8192) != 0 ? null : str44, (i9 & 16384) != 0 ? "" : str45, (i9 & 32768) != 0 ? 0 : num7, (i9 & 65536) == 0 ? z7 : false, (i9 & 131072) != 0 ? null : str46, (i9 & 262144) != 0 ? null : bool);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TxIdOrHashHistoryDetail> serializer() {
            return TxIdOrHashHistoryDetail$$serializer.INSTANCE;
        }
    }

    static {
        Address$$serializer address$$serializer = Address$$serializer.INSTANCE;
        TxAssetChangeBean$$serializer txAssetChangeBean$$serializer = TxAssetChangeBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(address$$serializer), new ArrayListSerializer(address$$serializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(txAssetChangeBean$$serializer), new ArrayListSerializer(txAssetChangeBean$$serializer), new ArrayListSerializer(IncludeAssetChangeBean$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TxDetailContractInfo$$serializer.INSTANCE), new ArrayListSerializer(TxDetailApproveInfo$$serializer.INSTANCE), null, null, null, null, null, null};
    }
}
