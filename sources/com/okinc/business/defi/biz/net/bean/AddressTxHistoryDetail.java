package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressTxHistoryDetail implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String chainCoinImageUrl;
    private int chainDecimalNum;
    private String chainName;
    private String chainSymbol;
    private int chainVdecimalNum;
    private String explorerUrl;
    private String from;
    private List<Address> inAdrList;
    private List<TxAssetChangeBean> input;
    private List<Address> outAdrList;
    private List<TxAssetChangeBean> output;
    private String serviceCharge;
    private boolean showExplorerUrl;
    private String to;
    private String txHash;
    private int txStatus;
    private long txTime;
    private int txType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressTxHistoryDetail> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressTxHistoryDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTxHistoryDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(Address.CREATOR.createFromParcel(parcel));
            }
            int i4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList4.add(Address.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i6 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList5.add(TxAssetChangeBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList6.add(TxAssetChangeBean.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList2 = arrayList6;
            }
            return new AddressTxHistoryDetail(string, string2, string3, j, i, arrayList3, arrayList4, string4, string5, i6, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTxHistoryDetail[] newArray(int i) {
            return new AddressTxHistoryDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressTxHistoryDetail() {
        this((String) null, (String) null, (String) null, 0L, 0, (List) null, (List) null, (String) null, (String) null, 0, (List) null, (List) null, false, 0, 0, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> component11() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> component12() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.showExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.chainVdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainCoinImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component6() {
        return this.inAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component7() {
        return this.outAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressTxHistoryDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, @NotNull List<Address> list, @NotNull List<Address> list2, @NotNull String str4, @NotNull String str5, int i2, List<TxAssetChangeBean> list3, List<TxAssetChangeBean> list4, boolean z, int i3, int i4, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new AddressTxHistoryDetail(str, str2, str3, j, i, list, list2, str4, str5, i2, list3, list4, z, i3, i4, str6, str7, str8);
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
        if (!(obj instanceof AddressTxHistoryDetail)) {
            return false;
        }
        AddressTxHistoryDetail addressTxHistoryDetail = (AddressTxHistoryDetail) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) addressTxHistoryDetail.txHash) && Intrinsics.EZpvd((Object) this.from, (Object) addressTxHistoryDetail.from) && Intrinsics.EZpvd((Object) this.to, (Object) addressTxHistoryDetail.to) && this.txTime == addressTxHistoryDetail.txTime && this.txStatus == addressTxHistoryDetail.txStatus && Intrinsics.EZpvd(this.inAdrList, addressTxHistoryDetail.inAdrList) && Intrinsics.EZpvd(this.outAdrList, addressTxHistoryDetail.outAdrList) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) addressTxHistoryDetail.serviceCharge) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) addressTxHistoryDetail.explorerUrl) && this.txType == addressTxHistoryDetail.txType && Intrinsics.EZpvd(this.input, addressTxHistoryDetail.input) && Intrinsics.EZpvd(this.output, addressTxHistoryDetail.output) && this.showExplorerUrl == addressTxHistoryDetail.showExplorerUrl && this.chainDecimalNum == addressTxHistoryDetail.chainDecimalNum && this.chainVdecimalNum == addressTxHistoryDetail.chainVdecimalNum && Intrinsics.EZpvd((Object) this.chainCoinImageUrl, (Object) addressTxHistoryDetail.chainCoinImageUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) addressTxHistoryDetail.chainName) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) addressTxHistoryDetail.chainSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainCoinImageUrl() {
        return this.chainCoinImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainDecimalNum() {
        return this.chainDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
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
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> getInAdrList() {
        return this.inAdrList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxAssetChangeBean> getInput() {
        return this.input;
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
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowExplorerUrl() {
        return this.showExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
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
    public int hashCode() {
        int iHashCode = this.txHash.hashCode();
        int iHashCode2 = this.from.hashCode();
        int iHashCode3 = this.to.hashCode();
        int iHashCode4 = Long.hashCode(this.txTime);
        int iHashCode5 = Integer.hashCode(this.txStatus);
        int iHashCode6 = this.inAdrList.hashCode();
        int iHashCode7 = this.outAdrList.hashCode();
        int iHashCode8 = this.serviceCharge.hashCode();
        int iHashCode9 = this.explorerUrl.hashCode();
        int iHashCode10 = Integer.hashCode(this.txType);
        List<TxAssetChangeBean> list = this.input;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        List<TxAssetChangeBean> list2 = this.output;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showExplorerUrl)) * 31) + Integer.hashCode(this.chainDecimalNum)) * 31) + Integer.hashCode(this.chainVdecimalNum)) * 31) + this.chainCoinImageUrl.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainCoinImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainCoinImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainDecimalNum(int i) {
        this.chainDecimalNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
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
    public final void setExplorerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInAdrList(@NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inAdrList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInput(List<TxAssetChangeBean> list) {
        this.input = list;
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
    public final void setServiceCharge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowExplorerUrl(boolean z) {
        this.showExplorerUrl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
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
    public String toString() {
        return "AddressTxHistoryDetail(txHash=" + this.txHash + ", from=" + this.from + ", to=" + this.to + ", txTime=" + this.txTime + ", txStatus=" + this.txStatus + ", inAdrList=" + this.inAdrList + ", outAdrList=" + this.outAdrList + ", serviceCharge=" + this.serviceCharge + ", explorerUrl=" + this.explorerUrl + ", txType=" + this.txType + ", input=" + this.input + ", output=" + this.output + ", showExplorerUrl=" + this.showExplorerUrl + ", chainDecimalNum=" + this.chainDecimalNum + ", chainVdecimalNum=" + this.chainVdecimalNum + ", chainCoinImageUrl=" + this.chainCoinImageUrl + ", chainName=" + this.chainName + ", chainSymbol=" + this.chainSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeLong(this.txTime);
        parcel.writeInt(this.txStatus);
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
        parcel.writeString(this.explorerUrl);
        parcel.writeInt(this.txType);
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
        parcel.writeInt(this.showExplorerUrl ? 1 : 0);
        parcel.writeInt(this.chainDecimalNum);
        parcel.writeInt(this.chainVdecimalNum);
        parcel.writeString(this.chainCoinImageUrl);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainSymbol);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressTxHistoryDetail> serializer() {
            return AddressTxHistoryDetail$$serializer.INSTANCE;
        }
    }

    static {
        Address$$serializer address$$serializer = Address$$serializer.INSTANCE;
        TxAssetChangeBean$$serializer txAssetChangeBean$$serializer = TxAssetChangeBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(address$$serializer), new ArrayListSerializer(address$$serializer), null, null, null, new ArrayListSerializer(txAssetChangeBean$$serializer), new ArrayListSerializer(txAssetChangeBean$$serializer), null, null, null, null, null, null};
    }

    public /* synthetic */ AddressTxHistoryDetail(int i, String str, String str2, String str3, long j, int i2, List list, List list2, String str4, String str5, int i3, List list3, List list4, boolean z, int i4, int i5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str;
        }
        if ((i & 2) == 0) {
            this.from = "";
        } else {
            this.from = str2;
        }
        if ((i & 4) == 0) {
            this.to = "";
        } else {
            this.to = str3;
        }
        this.txTime = (i & 8) == 0 ? 0L : j;
        if ((i & 16) == 0) {
            this.txStatus = 0;
        } else {
            this.txStatus = i2;
        }
        this.inAdrList = (i & 32) == 0 ? new ArrayList() : list;
        this.outAdrList = (i & 64) == 0 ? new ArrayList() : list2;
        if ((i & 128) == 0) {
            this.serviceCharge = "";
        } else {
            this.serviceCharge = str4;
        }
        if ((i & 256) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str5;
        }
        if ((i & 512) == 0) {
            this.txType = 0;
        } else {
            this.txType = i3;
        }
        if ((i & 1024) == 0) {
            this.input = null;
        } else {
            this.input = list3;
        }
        if ((i & 2048) == 0) {
            this.output = null;
        } else {
            this.output = list4;
        }
        if ((i & 4096) == 0) {
            this.showExplorerUrl = false;
        } else {
            this.showExplorerUrl = z;
        }
        if ((i & 8192) == 0) {
            this.chainDecimalNum = 0;
        } else {
            this.chainDecimalNum = i4;
        }
        if ((i & 16384) == 0) {
            this.chainVdecimalNum = 0;
        } else {
            this.chainVdecimalNum = i5;
        }
        if ((32768 & i) == 0) {
            this.chainCoinImageUrl = "";
        } else {
            this.chainCoinImageUrl = str6;
        }
        if ((65536 & i) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str7;
        }
        if ((i & 131072) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressTxHistoryDetail addressTxHistoryDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressTxHistoryDetail.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, addressTxHistoryDetail.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addressTxHistoryDetail.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressTxHistoryDetail.txTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, addressTxHistoryDetail.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || addressTxHistoryDetail.txStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, addressTxHistoryDetail.txStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(addressTxHistoryDetail.inAdrList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], addressTxHistoryDetail.inAdrList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(addressTxHistoryDetail.outAdrList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], addressTxHistoryDetail.outAdrList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.serviceCharge, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, addressTxHistoryDetail.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, addressTxHistoryDetail.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || addressTxHistoryDetail.txType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, addressTxHistoryDetail.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || addressTxHistoryDetail.input != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], addressTxHistoryDetail.input);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || addressTxHistoryDetail.output != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], addressTxHistoryDetail.output);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || addressTxHistoryDetail.showExplorerUrl) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, addressTxHistoryDetail.showExplorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || addressTxHistoryDetail.chainDecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, addressTxHistoryDetail.chainDecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || addressTxHistoryDetail.chainVdecimalNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, addressTxHistoryDetail.chainVdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.chainCoinImageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, addressTxHistoryDetail.chainCoinImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) addressTxHistoryDetail.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, addressTxHistoryDetail.chainName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) addressTxHistoryDetail.chainSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, addressTxHistoryDetail.chainSymbol);
    }

    public AddressTxHistoryDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, @NotNull List<Address> list, @NotNull List<Address> list2, @NotNull String str4, @NotNull String str5, int i2, List<TxAssetChangeBean> list3, List<TxAssetChangeBean> list4, boolean z, int i3, int i4, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.txHash = str;
        this.from = str2;
        this.to = str3;
        this.txTime = j;
        this.txStatus = i;
        this.inAdrList = list;
        this.outAdrList = list2;
        this.serviceCharge = str4;
        this.explorerUrl = str5;
        this.txType = i2;
        this.input = list3;
        this.output = list4;
        this.showExplorerUrl = z;
        this.chainDecimalNum = i3;
        this.chainVdecimalNum = i4;
        this.chainCoinImageUrl = str6;
        this.chainName = str7;
        this.chainSymbol = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1865) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r27v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0039: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1866) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r28v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r32v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0066: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r33v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:int:0x007f: TERNARY null = ((wrap:int:0x0077: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0081: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, int, java.util.List<com.okinc.business.defi.biz.net.bean.Address>, java.util.List<com.okinc.business.defi.biz.net.bean.Address>, java.lang.String, java.lang.String, int, java.util.List<com.okinc.business.defi.biz.net.bean.TxAssetChangeBean>, java.util.List<com.okinc.business.defi.biz.net.bean.TxAssetChangeBean>, boolean, int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1859) call: com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail.<init>(java.lang.String, java.lang.String, java.lang.String, long, int, java.util.List, java.util.List, java.lang.String, java.lang.String, int, java.util.List, java.util.List, boolean, int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddressTxHistoryDetail(String str, String str2, String str3, long j, int i, List list, List list2, String str4, String str5, int i2, List list3, List list4, boolean z, int i3, int i4, String str6, String str7, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? 0L : j, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? new ArrayList() : list, (i5 & 64) != 0 ? new ArrayList() : list2, (i5 & 128) != 0 ? "" : str4, (i5 & 256) != 0 ? "" : str5, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? null : list3, (i5 & 2048) == 0 ? list4 : null, (i5 & 4096) != 0 ? false : z, (i5 & 8192) != 0 ? 0 : i3, (i5 & 16384) != 0 ? 0 : i4, (i5 & 32768) != 0 ? "" : str6, (i5 & 65536) != 0 ? "" : str7, (i5 & 131072) != 0 ? "" : str8);
    }
}
