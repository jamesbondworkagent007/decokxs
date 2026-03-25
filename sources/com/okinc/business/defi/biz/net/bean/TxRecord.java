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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxRecord implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String address;
    private Boolean approvalForAllListFlag;
    private String approveSymbol;
    private List<AssetChangeInfo> assetChange;
    private UTXOSpeedUpInfoJsonBean btcSpeedUpInfo;
    private int chainDecimalNum;
    private String chainSymbol;
    private int chainVdecimalNum;
    private Integer claimableStatus;
    private String coinAmount;
    private String coinAmountNum;
    private long coinId;
    private List<String> coinImgUrls;
    private String coinSymbol;
    private String confirmedCount;
    private String contractAddress;
    private String contractIcon;
    private String contractName;
    private String currencyAmount;
    private int decimalNum;
    private boolean deleteSwitch;
    private String dexOrderId;
    private String direction;
    private String from;
    private String gasLimit;
    private String gasPrice;
    private Integer hideTxType;
    private String inputData;
    private boolean isOkexWallet;
    private boolean isShowCancel;
    private boolean isShowPending;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedupCancel;
    private String kysTxTypeText;
    private long mainCoinId;
    private String network;
    private String nftCollectionName;
    private List<String> nftImageUrls;
    private String nonce;
    private String okexAccount;
    private String orderId;
    private String orderType;
    private String payAmount;
    private String payCurrency;
    private String payCurrencyIcon;
    private String pendingToastInfo;
    private String poolId;
    private String priorityFee;
    private int repeatTxType;
    private String rowId;
    private String serviceCharge;
    private String tipsType;
    private String to;
    private Long toChainId;
    private String totalConfirm;
    private String txId;
    private Integer txSource;
    private int txStatus;
    private long txTime;
    private int txType;
    private String txhash;
    private String uOpHash;
    private String url;
    private int vdecimalNum;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxRecord> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxRecord> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxRecord createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            String str;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string11 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            String string12 = parcel.readString();
            long j3 = parcel.readLong();
            int i6 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            int i7 = parcel.readInt();
            String string23 = parcel.readString();
            UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBeanCreateFromParcel = parcel.readInt() == 0 ? null : UTXOSpeedUpInfoJsonBean.CREATOR.createFromParcel(parcel);
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = z2;
                str = string8;
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                z = z2;
                arrayList = new ArrayList(i8);
                str = string8;
                int i9 = 0;
                while (i9 != i8) {
                    arrayList.add(AssetChangeInfo.CREATOR.createFromParcel(parcel));
                    i9++;
                    i8 = i8;
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TxRecord(string, string2, string3, j, j2, string4, string5, string6, i, string7, str, string9, string10, i2, i3, string11, i4, i5, string12, j3, i6, z, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, numValueOf, z3, z4, z5, z6, i7, string23, uTXOSpeedUpInfoJsonBeanCreateFromParcel, string24, string25, z7, arrayList, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxRecord[] newArray(int i) {
            return new TxRecord[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxRecord() {
        this((String) null, (String) null, (String) null, 0L, 0L, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, (String) null, 0L, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, false, false, false, 0, (String) null, (UTXOSpeedUpInfoJsonBean) null, (String) null, (String) null, false, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (String) null, -1, -1, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.kysTxTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.coinAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component20() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isOkexWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.totalConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.confirmedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isShowSpeedupCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component38() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean component40() {
        return this.btcSpeedUpInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.deleteSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetChangeInfo> component44() {
        return this.assetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component45() {
        return this.coinImgUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component46() {
        return this.nftImageUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.contractIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.mainCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.approveSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.payAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.payCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.payCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component58() {
        return this.approvalForAllListFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component59() {
        return this.hideTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.dexOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component63() {
        return this.claimableStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component64() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxRecord copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2, int i3, @NotNull String str11, int i4, int i5, @NotNull String str12, long j3, int i6, boolean z, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, @NotNull String str19, @NotNull String str20, String str21, @NotNull String str22, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, int i7, @NotNull String str23, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str24, @NotNull String str25, boolean z6, List<AssetChangeInfo> list, List<String> list2, List<String> list3, String str26, String str27, String str28, String str29, String str30, String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, String str36, Boolean bool, Integer num2, String str37, @NotNull String str38, @NotNull String str39, Integer num3, Long l, String str40) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        return new TxRecord(str, str2, str3, j, j2, str4, str5, str6, i, str7, str8, str9, str10, i2, i3, str11, i4, i5, str12, j3, i6, z, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, num, z2, z3, z4, z5, i7, str23, uTXOSpeedUpInfoJsonBean, str24, str25, z6, list, list2, list3, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, bool, num2, str37, str38, str39, num3, l, str40);
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
        if (!(obj instanceof TxRecord)) {
            return false;
        }
        TxRecord txRecord = (TxRecord) obj;
        return Intrinsics.EZpvd((Object) this.txhash, (Object) txRecord.txhash) && Intrinsics.EZpvd((Object) this.walletId, (Object) txRecord.walletId) && Intrinsics.EZpvd((Object) this.network, (Object) txRecord.network) && this.coinId == txRecord.coinId && this.mainCoinId == txRecord.mainCoinId && Intrinsics.EZpvd((Object) this.address, (Object) txRecord.address) && Intrinsics.EZpvd((Object) this.from, (Object) txRecord.from) && Intrinsics.EZpvd((Object) this.to, (Object) txRecord.to) && this.txType == txRecord.txType && Intrinsics.EZpvd((Object) this.kysTxTypeText, (Object) txRecord.kysTxTypeText) && Intrinsics.EZpvd((Object) this.coinAmountNum, (Object) txRecord.coinAmountNum) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) txRecord.coinAmount) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) txRecord.coinSymbol) && this.decimalNum == txRecord.decimalNum && this.vdecimalNum == txRecord.vdecimalNum && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) txRecord.chainSymbol) && this.chainDecimalNum == txRecord.chainDecimalNum && this.chainVdecimalNum == txRecord.chainVdecimalNum && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) txRecord.currencyAmount) && this.txTime == txRecord.txTime && this.txStatus == txRecord.txStatus && this.isOkexWallet == txRecord.isOkexWallet && Intrinsics.EZpvd((Object) this.url, (Object) txRecord.url) && Intrinsics.EZpvd((Object) this.totalConfirm, (Object) txRecord.totalConfirm) && Intrinsics.EZpvd((Object) this.confirmedCount, (Object) txRecord.confirmedCount) && Intrinsics.EZpvd((Object) this.direction, (Object) txRecord.direction) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) txRecord.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) txRecord.priorityFee) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) txRecord.gasLimit) && Intrinsics.EZpvd((Object) this.nonce, (Object) txRecord.nonce) && Intrinsics.EZpvd((Object) this.inputData, (Object) txRecord.inputData) && Intrinsics.EZpvd((Object) this.txId, (Object) txRecord.txId) && Intrinsics.EZpvd(this.txSource, txRecord.txSource) && this.isShowPending == txRecord.isShowPending && this.isShowSpeedUp == txRecord.isShowSpeedUp && this.isShowCancel == txRecord.isShowCancel && this.isShowSpeedupCancel == txRecord.isShowSpeedupCancel && this.repeatTxType == txRecord.repeatTxType && Intrinsics.EZpvd((Object) this.pendingToastInfo, (Object) txRecord.pendingToastInfo) && Intrinsics.EZpvd(this.btcSpeedUpInfo, txRecord.btcSpeedUpInfo) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) txRecord.serviceCharge) && Intrinsics.EZpvd((Object) this.rowId, (Object) txRecord.rowId) && this.deleteSwitch == txRecord.deleteSwitch && Intrinsics.EZpvd(this.assetChange, txRecord.assetChange) && Intrinsics.EZpvd(this.coinImgUrls, txRecord.coinImgUrls) && Intrinsics.EZpvd(this.nftImageUrls, txRecord.nftImageUrls) && Intrinsics.EZpvd((Object) this.contractName, (Object) txRecord.contractName) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) txRecord.contractAddress) && Intrinsics.EZpvd((Object) this.contractIcon, (Object) txRecord.contractIcon) && Intrinsics.EZpvd((Object) this.approveSymbol, (Object) txRecord.approveSymbol) && Intrinsics.EZpvd((Object) this.nftCollectionName, (Object) txRecord.nftCollectionName) && Intrinsics.EZpvd((Object) this.okexAccount, (Object) txRecord.okexAccount) && Intrinsics.EZpvd((Object) this.orderId, (Object) txRecord.orderId) && Intrinsics.EZpvd((Object) this.payAmount, (Object) txRecord.payAmount) && Intrinsics.EZpvd((Object) this.payCurrency, (Object) txRecord.payCurrency) && Intrinsics.EZpvd((Object) this.payCurrencyIcon, (Object) txRecord.payCurrencyIcon) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) txRecord.uOpHash) && Intrinsics.EZpvd(this.approvalForAllListFlag, txRecord.approvalForAllListFlag) && Intrinsics.EZpvd(this.hideTxType, txRecord.hideTxType) && Intrinsics.EZpvd((Object) this.poolId, (Object) txRecord.poolId) && Intrinsics.EZpvd((Object) this.orderType, (Object) txRecord.orderType) && Intrinsics.EZpvd((Object) this.dexOrderId, (Object) txRecord.dexOrderId) && Intrinsics.EZpvd(this.claimableStatus, txRecord.claimableStatus) && Intrinsics.EZpvd(this.toChainId, txRecord.toChainId) && Intrinsics.EZpvd((Object) this.tipsType, (Object) txRecord.tipsType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getApprovalForAllListFlag() {
        return this.approvalForAllListFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveSymbol() {
        return this.approveSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetChangeInfo> getAssetChange() {
        return this.assetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSpeedUpInfoJsonBean getBtcSpeedUpInfo() {
        return this.btcSpeedUpInfo;
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
    public final Integer getClaimableStatus() {
        return this.claimableStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountNum() {
        return this.coinAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCoinImgUrls() {
        return this.coinImgUrls;
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
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractIcon() {
        return this.contractIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractName() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDeleteSwitch() {
        return this.deleteSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexOrderId() {
        return this.dexOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
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
    public final String getInputData() {
        return this.inputData;
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
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionName() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNftImageUrls() {
        return this.nftImageUrls;
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
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
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
    public final String getPendingToastInfo() {
        return this.pendingToastInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
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
    public final String getTipsType() {
        return this.tipsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalConfirm() {
        return this.totalConfirm;
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
    public final String getTxhash() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUOpHash() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txhash.hashCode();
        int iHashCode2 = this.walletId.hashCode();
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = Long.hashCode(this.coinId);
        int iHashCode5 = Long.hashCode(this.mainCoinId);
        int iHashCode6 = this.address.hashCode();
        int iHashCode7 = this.from.hashCode();
        int iHashCode8 = this.to.hashCode();
        int iHashCode9 = Integer.hashCode(this.txType);
        String str = this.kysTxTypeText;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        int iHashCode11 = this.coinAmountNum.hashCode();
        int iHashCode12 = this.coinAmount.hashCode();
        int iHashCode13 = this.coinSymbol.hashCode();
        int iHashCode14 = Integer.hashCode(this.decimalNum);
        int iHashCode15 = Integer.hashCode(this.vdecimalNum);
        int iHashCode16 = this.chainSymbol.hashCode();
        int iHashCode17 = Integer.hashCode(this.chainDecimalNum);
        int iHashCode18 = Integer.hashCode(this.chainVdecimalNum);
        int iHashCode19 = this.currencyAmount.hashCode();
        int iHashCode20 = Long.hashCode(this.txTime);
        int iHashCode21 = Integer.hashCode(this.txStatus);
        int iHashCode22 = Boolean.hashCode(this.isOkexWallet);
        int iHashCode23 = this.url.hashCode();
        int iHashCode24 = this.totalConfirm.hashCode();
        int iHashCode25 = this.confirmedCount.hashCode();
        int iHashCode26 = this.direction.hashCode();
        int iHashCode27 = this.gasPrice.hashCode();
        String str2 = this.priorityFee;
        int iHashCode28 = str2 == null ? 0 : str2.hashCode();
        int iHashCode29 = this.gasLimit.hashCode();
        int iHashCode30 = this.nonce.hashCode();
        String str3 = this.inputData;
        int iHashCode31 = str3 == null ? 0 : str3.hashCode();
        int iHashCode32 = this.txId.hashCode();
        Integer num = this.txSource;
        int iHashCode33 = num == null ? 0 : num.hashCode();
        int iHashCode34 = Boolean.hashCode(this.isShowPending);
        int iHashCode35 = Boolean.hashCode(this.isShowSpeedUp);
        int iHashCode36 = Boolean.hashCode(this.isShowCancel);
        int iHashCode37 = Boolean.hashCode(this.isShowSpeedupCancel);
        int iHashCode38 = Integer.hashCode(this.repeatTxType);
        int iHashCode39 = this.pendingToastInfo.hashCode();
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        int iHashCode40 = uTXOSpeedUpInfoJsonBean == null ? 0 : uTXOSpeedUpInfoJsonBean.hashCode();
        String str4 = this.serviceCharge;
        int iHashCode41 = str4 == null ? 0 : str4.hashCode();
        int iHashCode42 = this.rowId.hashCode();
        int iHashCode43 = Boolean.hashCode(this.deleteSwitch);
        List<AssetChangeInfo> list = this.assetChange;
        int iHashCode44 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.coinImgUrls;
        int iHashCode45 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.nftImageUrls;
        int iHashCode46 = list3 == null ? 0 : list3.hashCode();
        String str5 = this.contractName;
        int iHashCode47 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.contractAddress;
        int iHashCode48 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.contractIcon;
        int iHashCode49 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.approveSymbol;
        int iHashCode50 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.nftCollectionName;
        int iHashCode51 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.okexAccount;
        int iHashCode52 = str10 == null ? 0 : str10.hashCode();
        int iHashCode53 = this.orderId.hashCode();
        int iHashCode54 = this.payAmount.hashCode();
        int iHashCode55 = this.payCurrency.hashCode();
        int iHashCode56 = this.payCurrencyIcon.hashCode();
        String str11 = this.uOpHash;
        int iHashCode57 = str11 == null ? 0 : str11.hashCode();
        Boolean bool = this.approvalForAllListFlag;
        int iHashCode58 = bool == null ? 0 : bool.hashCode();
        Integer num2 = this.hideTxType;
        int iHashCode59 = num2 == null ? 0 : num2.hashCode();
        String str12 = this.poolId;
        int iHashCode60 = str12 == null ? 0 : str12.hashCode();
        int iHashCode61 = this.orderType.hashCode();
        int iHashCode62 = this.dexOrderId.hashCode();
        Integer num3 = this.claimableStatus;
        int iHashCode63 = num3 == null ? 0 : num3.hashCode();
        Long l = this.toChainId;
        int iHashCode64 = l == null ? 0 : l.hashCode();
        String str13 = this.tipsType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + (str13 == null ? 0 : str13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOkexWallet() {
        return this.isOkexWallet;
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
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalForAllListFlag(Boolean bool) {
        this.approvalForAllListFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveSymbol(String str) {
        this.approveSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetChange(List<AssetChangeInfo> list) {
        this.assetChange = list;
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
    public final void setClaimableStatus(Integer num) {
        this.claimableStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmountNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmountNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinImgUrls(List<String> list) {
        this.coinImgUrls = list;
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
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractIcon(String str) {
        this.contractIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractName(String str) {
        this.contractName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(int i) {
        this.decimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteSwitch(boolean z) {
        this.deleteSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexOrderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
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
    public final void setInputData(String str) {
        this.inputData = str;
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
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionName(String str) {
        this.nftCollectionName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftImageUrls(List<String> list) {
        this.nftImageUrls = list;
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
    public final void setOkexWallet(boolean z) {
        this.isOkexWallet = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCurrencyIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCurrencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingToastInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingToastInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPoolId(String str) {
        this.poolId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFee(String str) {
        this.priorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatTxType(int i) {
        this.repeatTxType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rowId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(String str) {
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
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
    public final void setTipsType(String str) {
        this.tipsType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(Long l) {
        this.toChainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalConfirm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalConfirm = str;
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
    public final void setTxhash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txhash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUOpHash(String str) {
        this.uOpHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(int i) {
        this.vdecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxRecord(txhash=" + this.txhash + ", walletId=" + this.walletId + ", network=" + this.network + ", coinId=" + this.coinId + ", mainCoinId=" + this.mainCoinId + ", address=" + this.address + ", from=" + this.from + ", to=" + this.to + ", txType=" + this.txType + ", kysTxTypeText=" + this.kysTxTypeText + ", coinAmountNum=" + this.coinAmountNum + ", coinAmount=" + this.coinAmount + ", coinSymbol=" + this.coinSymbol + ", decimalNum=" + this.decimalNum + ", vdecimalNum=" + this.vdecimalNum + ", chainSymbol=" + this.chainSymbol + ", chainDecimalNum=" + this.chainDecimalNum + ", chainVdecimalNum=" + this.chainVdecimalNum + ", currencyAmount=" + this.currencyAmount + ", txTime=" + this.txTime + ", txStatus=" + this.txStatus + ", isOkexWallet=" + this.isOkexWallet + ", url=" + this.url + ", totalConfirm=" + this.totalConfirm + ", confirmedCount=" + this.confirmedCount + ", direction=" + this.direction + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", gasLimit=" + this.gasLimit + ", nonce=" + this.nonce + ", inputData=" + this.inputData + ", txId=" + this.txId + ", txSource=" + this.txSource + ", isShowPending=" + this.isShowPending + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedupCancel=" + this.isShowSpeedupCancel + ", repeatTxType=" + this.repeatTxType + ", pendingToastInfo=" + this.pendingToastInfo + ", btcSpeedUpInfo=" + this.btcSpeedUpInfo + ", serviceCharge=" + this.serviceCharge + ", rowId=" + this.rowId + ", deleteSwitch=" + this.deleteSwitch + ", assetChange=" + this.assetChange + ", coinImgUrls=" + this.coinImgUrls + ", nftImageUrls=" + this.nftImageUrls + ", contractName=" + this.contractName + ", contractAddress=" + this.contractAddress + ", contractIcon=" + this.contractIcon + ", approveSymbol=" + this.approveSymbol + ", nftCollectionName=" + this.nftCollectionName + ", okexAccount=" + this.okexAccount + ", orderId=" + this.orderId + ", payAmount=" + this.payAmount + ", payCurrency=" + this.payCurrency + ", payCurrencyIcon=" + this.payCurrencyIcon + ", uOpHash=" + this.uOpHash + ", approvalForAllListFlag=" + this.approvalForAllListFlag + ", hideTxType=" + this.hideTxType + ", poolId=" + this.poolId + ", orderType=" + this.orderType + ", dexOrderId=" + this.dexOrderId + ", claimableStatus=" + this.claimableStatus + ", toChainId=" + this.toChainId + ", tipsType=" + this.tipsType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txhash);
        parcel.writeString(this.walletId);
        parcel.writeString(this.network);
        parcel.writeLong(this.coinId);
        parcel.writeLong(this.mainCoinId);
        parcel.writeString(this.address);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeInt(this.txType);
        parcel.writeString(this.kysTxTypeText);
        parcel.writeString(this.coinAmountNum);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinSymbol);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.vdecimalNum);
        parcel.writeString(this.chainSymbol);
        parcel.writeInt(this.chainDecimalNum);
        parcel.writeInt(this.chainVdecimalNum);
        parcel.writeString(this.currencyAmount);
        parcel.writeLong(this.txTime);
        parcel.writeInt(this.txStatus);
        parcel.writeInt(this.isOkexWallet ? 1 : 0);
        parcel.writeString(this.url);
        parcel.writeString(this.totalConfirm);
        parcel.writeString(this.confirmedCount);
        parcel.writeString(this.direction);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.nonce);
        parcel.writeString(this.inputData);
        parcel.writeString(this.txId);
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
        parcel.writeInt(this.repeatTxType);
        parcel.writeString(this.pendingToastInfo);
        UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean = this.btcSpeedUpInfo;
        if (uTXOSpeedUpInfoJsonBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uTXOSpeedUpInfoJsonBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.serviceCharge);
        parcel.writeString(this.rowId);
        parcel.writeInt(this.deleteSwitch ? 1 : 0);
        List<AssetChangeInfo> list = this.assetChange;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AssetChangeInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.coinImgUrls);
        parcel.writeStringList(this.nftImageUrls);
        parcel.writeString(this.contractName);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.contractIcon);
        parcel.writeString(this.approveSymbol);
        parcel.writeString(this.nftCollectionName);
        parcel.writeString(this.okexAccount);
        parcel.writeString(this.orderId);
        parcel.writeString(this.payAmount);
        parcel.writeString(this.payCurrency);
        parcel.writeString(this.payCurrencyIcon);
        parcel.writeString(this.uOpHash);
        Boolean bool = this.approvalForAllListFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.hideTxType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.poolId);
        parcel.writeString(this.orderType);
        parcel.writeString(this.dexOrderId);
        Integer num3 = this.claimableStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l = this.toChainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tipsType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxRecord.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxRecord> serializer() {
            return TxRecord$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AssetChangeInfo$$serializer.INSTANCE), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TxRecord(int i, int i2, int i3, String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, int i4, String str7, String str8, String str9, String str10, int i5, int i6, String str11, int i7, int i8, String str12, long j3, int i9, boolean z, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, int i10, String str23, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str24, String str25, boolean z6, List list, List list2, List list3, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool, Integer num2, String str37, String str38, String str39, Integer num3, Long l, String str40, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txhash = "";
        } else {
            this.txhash = str;
        }
        if ((i & 2) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str2;
        }
        if ((i & 4) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 8) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 16) == 0) {
            this.mainCoinId = 0L;
        } else {
            this.mainCoinId = j2;
        }
        if ((i & 32) == 0) {
            this.address = "";
        } else {
            this.address = str4;
        }
        if ((i & 64) == 0) {
            this.from = "";
        } else {
            this.from = str5;
        }
        if ((i & 128) == 0) {
            this.to = "";
        } else {
            this.to = str6;
        }
        if ((i & 256) == 0) {
            this.txType = 0;
        } else {
            this.txType = i4;
        }
        if ((i & 512) == 0) {
            this.kysTxTypeText = null;
        } else {
            this.kysTxTypeText = str7;
        }
        if ((i & 1024) == 0) {
            this.coinAmountNum = "";
        } else {
            this.coinAmountNum = str8;
        }
        if ((i & 2048) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str9;
        }
        if ((i & 4096) == 0) {
            this.coinSymbol = "";
        } else {
            this.coinSymbol = str10;
        }
        if ((i & 8192) == 0) {
            this.decimalNum = 0;
        } else {
            this.decimalNum = i5;
        }
        if ((i & 16384) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = i6;
        }
        if ((i & 32768) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str11;
        }
        if ((i & 65536) == 0) {
            this.chainDecimalNum = 0;
        } else {
            this.chainDecimalNum = i7;
        }
        if ((i & 131072) == 0) {
            this.chainVdecimalNum = 0;
        } else {
            this.chainVdecimalNum = i8;
        }
        if ((262144 & i) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str12;
        }
        this.txTime = (524288 & i) != 0 ? j3 : 0L;
        if ((1048576 & i) == 0) {
            this.txStatus = 0;
        } else {
            this.txStatus = i9;
        }
        if ((2097152 & i) == 0) {
            this.isOkexWallet = false;
        } else {
            this.isOkexWallet = z;
        }
        if ((4194304 & i) == 0) {
            this.url = "";
        } else {
            this.url = str13;
        }
        if ((8388608 & i) == 0) {
            this.totalConfirm = "";
        } else {
            this.totalConfirm = str14;
        }
        if ((16777216 & i) == 0) {
            this.confirmedCount = "";
        } else {
            this.confirmedCount = str15;
        }
        if ((33554432 & i) == 0) {
            this.direction = "";
        } else {
            this.direction = str16;
        }
        if ((67108864 & i) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str17;
        }
        if ((134217728 & i) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str18;
        }
        if ((268435456 & i) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str19;
        }
        if ((536870912 & i) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str20;
        }
        if ((1073741824 & i) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str21;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.txId = "";
        } else {
            this.txId = str22;
        }
        if ((i2 & 1) == 0) {
            this.txSource = null;
        } else {
            this.txSource = num;
        }
        if ((i2 & 2) == 0) {
            this.isShowPending = false;
        } else {
            this.isShowPending = z2;
        }
        if ((i2 & 4) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z3;
        }
        if ((i2 & 8) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z4;
        }
        if ((i2 & 16) == 0) {
            this.isShowSpeedupCancel = false;
        } else {
            this.isShowSpeedupCancel = z5;
        }
        if ((i2 & 32) == 0) {
            this.repeatTxType = 0;
        } else {
            this.repeatTxType = i10;
        }
        if ((i2 & 64) == 0) {
            this.pendingToastInfo = "";
        } else {
            this.pendingToastInfo = str23;
        }
        if ((i2 & 128) == 0) {
            this.btcSpeedUpInfo = null;
        } else {
            this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        }
        if ((i2 & 256) == 0) {
            this.serviceCharge = null;
        } else {
            this.serviceCharge = str24;
        }
        if ((i2 & 512) == 0) {
            this.rowId = "";
        } else {
            this.rowId = str25;
        }
        if ((i2 & 1024) == 0) {
            this.deleteSwitch = true;
        } else {
            this.deleteSwitch = z6;
        }
        this.assetChange = (i2 & 2048) == 0 ? yDY.AhwBna() : list;
        this.coinImgUrls = (i2 & 4096) == 0 ? yDY.AhwBna() : list2;
        this.nftImageUrls = (i2 & 8192) == 0 ? yDY.AhwBna() : list3;
        if ((i2 & 16384) == 0) {
            this.contractName = "";
        } else {
            this.contractName = str26;
        }
        if ((i2 & 32768) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str27;
        }
        if ((i2 & 65536) == 0) {
            this.contractIcon = "";
        } else {
            this.contractIcon = str28;
        }
        if ((i2 & 131072) == 0) {
            this.approveSymbol = "";
        } else {
            this.approveSymbol = str29;
        }
        if ((262144 & i2) == 0) {
            this.nftCollectionName = null;
        } else {
            this.nftCollectionName = str30;
        }
        if ((524288 & i2) == 0) {
            this.okexAccount = null;
        } else {
            this.okexAccount = str31;
        }
        if ((1048576 & i2) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str32;
        }
        if ((2097152 & i2) == 0) {
            this.payAmount = "";
        } else {
            this.payAmount = str33;
        }
        if ((4194304 & i2) == 0) {
            this.payCurrency = "";
        } else {
            this.payCurrency = str34;
        }
        if ((8388608 & i2) == 0) {
            this.payCurrencyIcon = "";
        } else {
            this.payCurrencyIcon = str35;
        }
        if ((16777216 & i2) == 0) {
            this.uOpHash = null;
        } else {
            this.uOpHash = str36;
        }
        if ((33554432 & i2) == 0) {
            this.approvalForAllListFlag = null;
        } else {
            this.approvalForAllListFlag = bool;
        }
        if ((67108864 & i2) == 0) {
            this.hideTxType = null;
        } else {
            this.hideTxType = num2;
        }
        if ((134217728 & i2) == 0) {
            this.poolId = null;
        } else {
            this.poolId = str37;
        }
        if ((268435456 & i2) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str38;
        }
        if ((536870912 & i2) == 0) {
            this.dexOrderId = "";
        } else {
            this.dexOrderId = str39;
        }
        if ((1073741824 & i2) == 0) {
            this.claimableStatus = null;
        } else {
            this.claimableStatus = num3;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.toChainId = null;
        } else {
            this.toChainId = l;
        }
        if ((i3 & 1) == 0) {
            this.tipsType = null;
        } else {
            this.tipsType = str40;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [218=4] */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxRecord txRecord, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) txRecord.txhash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, txRecord.txhash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) txRecord.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, txRecord.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) txRecord.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, txRecord.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txRecord.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, txRecord.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txRecord.mainCoinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, txRecord.mainCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) txRecord.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, txRecord.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) txRecord.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, txRecord.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) txRecord.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, txRecord.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || txRecord.txType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, txRecord.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txRecord.kysTxTypeText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, txRecord.kysTxTypeText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) txRecord.coinAmountNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, txRecord.coinAmountNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) txRecord.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, txRecord.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) txRecord.coinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, txRecord.coinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || txRecord.decimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, txRecord.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || txRecord.vdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, txRecord.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) txRecord.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, txRecord.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || txRecord.chainDecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, txRecord.chainDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || txRecord.chainVdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, txRecord.chainVdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) txRecord.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, txRecord.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || txRecord.txTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 19, txRecord.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || txRecord.txStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, txRecord.txStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || txRecord.isOkexWallet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, txRecord.isOkexWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) txRecord.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, txRecord.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) txRecord.totalConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, txRecord.totalConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) txRecord.confirmedCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, txRecord.confirmedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) txRecord.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, txRecord.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) txRecord.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, txRecord.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || txRecord.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, txRecord.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) txRecord.gasLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, txRecord.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) txRecord.nonce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, txRecord.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || txRecord.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, txRecord.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) txRecord.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, txRecord.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || txRecord.txSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, txRecord.txSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || txRecord.isShowPending) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, txRecord.isShowPending);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || txRecord.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, txRecord.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || txRecord.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, txRecord.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || txRecord.isShowSpeedupCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, txRecord.isShowSpeedupCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || txRecord.repeatTxType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 37, txRecord.repeatTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) txRecord.pendingToastInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, txRecord.pendingToastInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || txRecord.btcSpeedUpInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, UTXOSpeedUpInfoJsonBean$$serializer.INSTANCE, txRecord.btcSpeedUpInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || txRecord.serviceCharge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, txRecord.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) txRecord.rowId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, txRecord.rowId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !txRecord.deleteSwitch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, txRecord.deleteSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd(txRecord.assetChange, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, kSerializerArr[43], txRecord.assetChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd(txRecord.coinImgUrls, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, kSerializerArr[44], txRecord.coinImgUrls);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd(txRecord.nftImageUrls, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, kSerializerArr[45], txRecord.nftImageUrls);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) txRecord.contractName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, txRecord.contractName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) txRecord.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, txRecord.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) txRecord.contractIcon, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, StringSerializer.INSTANCE, txRecord.contractIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) txRecord.approveSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, StringSerializer.INSTANCE, txRecord.approveSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || txRecord.nftCollectionName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, txRecord.nftCollectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || txRecord.okexAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, txRecord.okexAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) txRecord.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, txRecord.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) txRecord.payAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, txRecord.payAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) txRecord.payCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, txRecord.payCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) txRecord.payCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, txRecord.payCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || txRecord.uOpHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, txRecord.uOpHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || txRecord.approvalForAllListFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, BooleanSerializer.INSTANCE, txRecord.approvalForAllListFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || txRecord.hideTxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, IntSerializer.INSTANCE, txRecord.hideTxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || txRecord.poolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 59, StringSerializer.INSTANCE, txRecord.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) txRecord.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, txRecord.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) txRecord.dexOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, txRecord.dexOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || txRecord.claimableStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, IntSerializer.INSTANCE, txRecord.claimableStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || txRecord.toChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, LongSerializer.INSTANCE, txRecord.toChainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) && txRecord.tipsType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, StringSerializer.INSTANCE, txRecord.tipsType);
    }

    public TxRecord(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2, int i3, @NotNull String str11, int i4, int i5, @NotNull String str12, long j3, int i6, boolean z, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, @NotNull String str19, @NotNull String str20, String str21, @NotNull String str22, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, int i7, @NotNull String str23, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str24, @NotNull String str25, boolean z6, List<AssetChangeInfo> list, List<String> list2, List<String> list3, String str26, String str27, String str28, String str29, String str30, String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, String str36, Boolean bool, Integer num2, String str37, @NotNull String str38, @NotNull String str39, Integer num3, Long l, String str40) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        this.txhash = str;
        this.walletId = str2;
        this.network = str3;
        this.coinId = j;
        this.mainCoinId = j2;
        this.address = str4;
        this.from = str5;
        this.to = str6;
        this.txType = i;
        this.kysTxTypeText = str7;
        this.coinAmountNum = str8;
        this.coinAmount = str9;
        this.coinSymbol = str10;
        this.decimalNum = i2;
        this.vdecimalNum = i3;
        this.chainSymbol = str11;
        this.chainDecimalNum = i4;
        this.chainVdecimalNum = i5;
        this.currencyAmount = str12;
        this.txTime = j3;
        this.txStatus = i6;
        this.isOkexWallet = z;
        this.url = str13;
        this.totalConfirm = str14;
        this.confirmedCount = str15;
        this.direction = str16;
        this.gasPrice = str17;
        this.priorityFee = str18;
        this.gasLimit = str19;
        this.nonce = str20;
        this.inputData = str21;
        this.txId = str22;
        this.txSource = num;
        this.isShowPending = z2;
        this.isShowSpeedUp = z3;
        this.isShowCancel = z4;
        this.isShowSpeedupCancel = z5;
        this.repeatTxType = i7;
        this.pendingToastInfo = str23;
        this.btcSpeedUpInfo = uTXOSpeedUpInfoJsonBean;
        this.serviceCharge = str24;
        this.rowId = str25;
        this.deleteSwitch = z6;
        this.assetChange = list;
        this.coinImgUrls = list2;
        this.nftImageUrls = list3;
        this.contractName = str26;
        this.contractAddress = str27;
        this.contractIcon = str28;
        this.approveSymbol = str29;
        this.nftCollectionName = str30;
        this.okexAccount = str31;
        this.orderId = str32;
        this.payAmount = str33;
        this.payCurrency = str34;
        this.payCurrencyIcon = str35;
        this.uOpHash = str36;
        this.approvalForAllListFlag = bool;
        this.hideTxType = num2;
        this.poolId = str37;
        this.orderType = str38;
        this.dexOrderId = str39;
        this.claimableStatus = num3;
        this.toChainId = l;
        this.tipsType = str40;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0327: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r137v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r137v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r137v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r137v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r72v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r137v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r74v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r137v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r137v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r137v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0048: ARITH (r137v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r79v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r137v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r137v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:0x006e: TERNARY null = ((wrap:int:0x0065: ARITH (r137v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r137v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:int:0x0084: TERNARY null = ((wrap:int:0x007b: ARITH (r137v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r84v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0086: ARITH (r137v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r85v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r137v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009d: ARITH (r137v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r87v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r137v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r88v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r137v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00be: ARITH (r137v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r90v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r137v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r92v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r137v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r93v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r137v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r137v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r137v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r137v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r137v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r137v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r137v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r137v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r137v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0142: ARITH (r137v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x014b: ARITH (r138v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r104v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0154: ARITH (r138v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r105v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x015d: ARITH (r138v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r106v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0166: ARITH (r138v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r107v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x016f: ARITH (r138v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r108v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0178: ARITH (r138v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r109v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017f: ARITH (r138v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean:0x0192: TERNARY null = ((wrap:int:0x018a: ARITH (r138v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean) : (r111v0 com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean))
  (wrap:java.lang.String:0x019c: TERNARY null = ((wrap:int:0x0194: ARITH (r138v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r112v0 java.lang.String))
  (wrap:java.lang.String:0x01a7: TERNARY null = ((wrap:int:0x019e: ARITH (r138v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:boolean:0x01b4: TERNARY null = ((wrap:int:0x01a9: ARITH (r138v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r114v0 boolean))
  (wrap:java.util.List:0x01c1: TERNARY null = ((wrap:int:0x01b6: ARITH (r138v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01ba: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:265)) : (r115v0 java.util.List))
  (wrap:java.util.List:0x01ce: TERNARY null = ((wrap:int:0x01c3: ARITH (r138v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01c7: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:266)) : (r116v0 java.util.List))
  (wrap:java.util.List:0x01db: TERNARY null = ((wrap:int:0x01d0: ARITH (r138v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01d4: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:267)) : (r117v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01dd: ARITH (r138v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e6: ARITH (r138v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ef: ARITH (r138v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f8: ARITH (r138v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0203: ARITH (r138v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x020e: ARITH (r138v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0219: ARITH (r138v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0224: ARITH (r138v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x022f: ARITH (r138v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023a: ARITH (r138v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0245: ARITH (r138v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r128v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0250: ARITH (r138v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r129v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x025b: ARITH (r138v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r130v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0266: ARITH (r138v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r131v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0271: ARITH (r138v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r132v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x027c: ARITH (r138v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r133v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0287: ARITH (r138v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r134v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0292: ARITH (r138v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r135v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x029a: ARITH (r139v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r136v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, long, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, int, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.defi.biz.net.bean.AssetChangeInfo>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String):void (m)] (LINE:221) call: com.okinc.business.defi.biz.net.bean.TxRecord.<init>(java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, java.lang.String, long, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, int, java.lang.String, com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ TxRecord(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, int i2, int i3, String str11, int i4, int i5, String str12, long j3, int i6, boolean z, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, int i7, String str23, UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean, String str24, String str25, boolean z6, List list, List list2, List list3, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool, Integer num2, String str37, String str38, String str39, Integer num3, Long l, String str40, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? 0L : j, (i8 & 16) != 0 ? 0L : j2, (i8 & 32) != 0 ? "" : str4, (i8 & 64) != 0 ? "" : str5, (i8 & 128) != 0 ? "" : str6, (i8 & 256) != 0 ? 0 : i, (i8 & 512) != 0 ? null : str7, (i8 & 1024) != 0 ? "" : str8, (i8 & 2048) != 0 ? "" : str9, (i8 & 4096) != 0 ? "" : str10, (i8 & 8192) != 0 ? 0 : i2, (i8 & 16384) != 0 ? 0 : i3, (i8 & 32768) != 0 ? "" : str11, (i8 & 65536) != 0 ? 0 : i4, (i8 & 131072) != 0 ? 0 : i5, (i8 & 262144) != 0 ? "" : str12, (i8 & 524288) != 0 ? 0L : j3, (i8 & 1048576) != 0 ? 0 : i6, (i8 & 2097152) != 0 ? false : z, (i8 & 4194304) != 0 ? "" : str13, (i8 & 8388608) != 0 ? "" : str14, (i8 & 16777216) != 0 ? "" : str15, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str16, (i8 & 67108864) != 0 ? "" : str17, (i8 & 134217728) != 0 ? null : str18, (i8 & 268435456) != 0 ? "" : str19, (i8 & 536870912) != 0 ? "" : str20, (i8 & 1073741824) != 0 ? null : str21, (i8 & Integer.MIN_VALUE) != 0 ? "" : str22, (i9 & 1) != 0 ? null : num, (i9 & 2) != 0 ? false : z2, (i9 & 4) != 0 ? false : z3, (i9 & 8) != 0 ? false : z4, (i9 & 16) != 0 ? false : z5, (i9 & 32) == 0 ? i7 : 0, (i9 & 64) != 0 ? "" : str23, (i9 & 128) != 0 ? null : uTXOSpeedUpInfoJsonBean, (i9 & 256) != 0 ? null : str24, (i9 & 512) != 0 ? "" : str25, (i9 & 1024) != 0 ? true : z6, (i9 & 2048) != 0 ? yDY.AhwBna() : list, (i9 & 4096) != 0 ? yDY.AhwBna() : list2, (i9 & 8192) != 0 ? yDY.AhwBna() : list3, (i9 & 16384) != 0 ? "" : str26, (i9 & 32768) != 0 ? "" : str27, (i9 & 65536) != 0 ? "" : str28, (i9 & 131072) != 0 ? "" : str29, (i9 & 262144) != 0 ? null : str30, (i9 & 524288) != 0 ? null : str31, (i9 & 1048576) != 0 ? "" : str32, (i9 & 2097152) != 0 ? "" : str33, (i9 & 4194304) != 0 ? "" : str34, (i9 & 8388608) != 0 ? "" : str35, (i9 & 16777216) != 0 ? null : str36, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : bool, (i9 & 67108864) != 0 ? null : num2, (i9 & 134217728) != 0 ? null : str37, (i9 & 268435456) != 0 ? "" : str38, (i9 & 536870912) != 0 ? "" : str39, (i9 & 1073741824) != 0 ? null : num3, (i9 & Integer.MIN_VALUE) != 0 ? null : l, (i10 & 1) != 0 ? null : str40);
    }
}
