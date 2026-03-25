package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TxToastCheckReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxToastCheckReq> CREATOR = new Creator();
    private Map<String, String> additionalData;
    private String amount;
    private List<EVMAuthorization> authorizationList;
    private Integer bizLine;
    private Integer bizType;
    private long chainId;
    private List<Integer> checkTypes;
    private Long coinId;
    private DappGasParam dappParams;
    private String domain;
    private String from;
    private String gasPrice;
    private String inputData;
    private String payload;
    private String projectAddress;
    private String requestId;
    private List<SimulateTransactionParam> simulateTransactionParamList;
    private List<EVMStateOverride> stateOverrideList;
    private String to;
    private String tokenAddress;
    private Integer txType;
    private UserOperation uop;

    public static final class Creator implements Parcelable.Creator<TxToastCheckReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckReq createFromParcel(Parcel parcel) {
            DappGasParam dappGasParam;
            ArrayList arrayList;
            UserOperation userOperation;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList4.add(Integer.valueOf(parcel.readInt()));
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            UserOperation userOperationCreateFromParcel = parcel.readInt() == 0 ? null : UserOperation.CREATOR.createFromParcel(parcel);
            DappGasParam dappGasParamCreateFromParcel = parcel.readInt() == 0 ? null : DappGasParam.CREATOR.createFromParcel(parcel);
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                dappGasParam = dappGasParamCreateFromParcel;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                dappGasParam = dappGasParamCreateFromParcel;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList5.add(SimulateTransactionParam.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList5;
            }
            long j = parcel.readLong();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                userOperation = userOperationCreateFromParcel;
                linkedHashMap = null;
            } else {
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                int i6 = 0;
                while (i6 != i5) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i6++;
                    i5 = i5;
                    userOperationCreateFromParcel = userOperationCreateFromParcel;
                }
                userOperation = userOperationCreateFromParcel;
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList6.add(parcel.readParcelable(TxToastCheckReq.class.getClassLoader()));
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList7.add(parcel.readParcelable(TxToastCheckReq.class.getClassLoader()));
                }
                arrayList3 = arrayList7;
            }
            return new TxToastCheckReq(arrayList4, lValueOf, numValueOf, numValueOf2, string, string2, string3, string4, string5, string6, string7, userOperation, dappGasParam, numValueOf3, string8, arrayList, j, string9, string10, linkedHashMap, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckReq[] newArray(int i) {
            return new TxToastCheckReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxToastCheckReq() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, 4194303, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.checkTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.projectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation component12() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappGasParam component13() {
        return this.dappParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.bizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimulateTransactionParam> component16() {
        return this.simulateTransactionParamList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component17() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component20() {
        return this.additionalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> component21() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> component22() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxToastCheckReq copy(@NotNull List<Integer> list, Long l, Integer num, Integer num2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, UserOperation userOperation, DappGasParam dappGasParam, Integer num3, String str8, List<SimulateTransactionParam> list2, long j, @NotNull String str9, @NotNull String str10, Map<String, String> map, List<EVMAuthorization> list3, List<EVMStateOverride> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new TxToastCheckReq(list, l, num, num2, str, str2, str3, str4, str5, str6, str7, userOperation, dappGasParam, num3, str8, list2, j, str9, str10, map, list3, list4);
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
        if (!(obj instanceof TxToastCheckReq)) {
            return false;
        }
        TxToastCheckReq txToastCheckReq = (TxToastCheckReq) obj;
        return Intrinsics.EZpvd(this.checkTypes, txToastCheckReq.checkTypes) && Intrinsics.EZpvd(this.coinId, txToastCheckReq.coinId) && Intrinsics.EZpvd(this.txType, txToastCheckReq.txType) && Intrinsics.EZpvd(this.bizType, txToastCheckReq.bizType) && Intrinsics.EZpvd((Object) this.from, (Object) txToastCheckReq.from) && Intrinsics.EZpvd((Object) this.to, (Object) txToastCheckReq.to) && Intrinsics.EZpvd((Object) this.amount, (Object) txToastCheckReq.amount) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) txToastCheckReq.gasPrice) && Intrinsics.EZpvd((Object) this.inputData, (Object) txToastCheckReq.inputData) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) txToastCheckReq.tokenAddress) && Intrinsics.EZpvd((Object) this.projectAddress, (Object) txToastCheckReq.projectAddress) && Intrinsics.EZpvd(this.uop, txToastCheckReq.uop) && Intrinsics.EZpvd(this.dappParams, txToastCheckReq.dappParams) && Intrinsics.EZpvd(this.bizLine, txToastCheckReq.bizLine) && Intrinsics.EZpvd((Object) this.payload, (Object) txToastCheckReq.payload) && Intrinsics.EZpvd(this.simulateTransactionParamList, txToastCheckReq.simulateTransactionParamList) && this.chainId == txToastCheckReq.chainId && Intrinsics.EZpvd((Object) this.domain, (Object) txToastCheckReq.domain) && Intrinsics.EZpvd((Object) this.requestId, (Object) txToastCheckReq.requestId) && Intrinsics.EZpvd(this.additionalData, txToastCheckReq.additionalData) && Intrinsics.EZpvd(this.authorizationList, txToastCheckReq.authorizationList) && Intrinsics.EZpvd(this.stateOverrideList, txToastCheckReq.stateOverrideList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizLine() {
        return this.bizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getCheckTypes() {
        return this.checkTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappGasParam getDappParams() {
        return this.dappParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectAddress() {
        return this.projectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimulateTransactionParam> getSimulateTransactionParamList() {
        return this.simulateTransactionParamList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> getStateOverrideList() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation getUop() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.checkTypes.hashCode();
        Long l = this.coinId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num = this.txType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.bizType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        int iHashCode6 = this.from.hashCode();
        int iHashCode7 = this.to.hashCode();
        int iHashCode8 = this.amount.hashCode();
        String str = this.gasPrice;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.inputData;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenAddress;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.projectAddress;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        UserOperation userOperation = this.uop;
        int iHashCode13 = userOperation == null ? 0 : userOperation.hashCode();
        DappGasParam dappGasParam = this.dappParams;
        int iHashCode14 = dappGasParam == null ? 0 : dappGasParam.hashCode();
        Integer num3 = this.bizLine;
        int iHashCode15 = num3 == null ? 0 : num3.hashCode();
        String str5 = this.payload;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        List<SimulateTransactionParam> list = this.simulateTransactionParamList;
        if (list == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode17 = Long.hashCode(this.chainId);
        int iHashCode18 = this.domain.hashCode();
        int iHashCode19 = this.requestId.hashCode();
        Map<String, String> map = this.additionalData;
        int iHashCode20 = map == null ? 0 : map.hashCode();
        List<EVMAuthorization> list2 = this.authorizationList;
        int iHashCode21 = list2 == null ? 0 : list2.hashCode();
        List<EVMStateOverride> list3 = this.stateOverrideList;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (list3 == null ? 0 : list3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionalData(Map<String, String> map) {
        this.additionalData = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthorizationList(List<EVMAuthorization> list) {
        this.authorizationList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizLine(Integer num) {
        this.bizLine = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckTypes(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.checkTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappParams(DappGasParam dappGasParam) {
        this.dappParams = dappGasParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(String str) {
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(String str) {
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectAddress(String str) {
        this.projectAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimulateTransactionParamList(List<SimulateTransactionParam> list) {
        this.simulateTransactionParamList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStateOverrideList(List<EVMStateOverride> list) {
        this.stateOverrideList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(Integer num) {
        this.txType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUop(UserOperation userOperation) {
        this.uop = userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxToastCheckReq(checkTypes=" + this.checkTypes + ", coinId=" + this.coinId + ", txType=" + this.txType + ", bizType=" + this.bizType + ", from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", gasPrice=" + this.gasPrice + ", inputData=" + this.inputData + ", tokenAddress=" + this.tokenAddress + ", projectAddress=" + this.projectAddress + ", uop=" + this.uop + ", dappParams=" + this.dappParams + ", bizLine=" + this.bizLine + ", payload=" + this.payload + ", simulateTransactionParamList=" + this.simulateTransactionParamList + ", chainId=" + this.chainId + ", domain=" + this.domain + ", requestId=" + this.requestId + ", additionalData=" + this.additionalData + ", authorizationList=" + this.authorizationList + ", stateOverrideList=" + this.stateOverrideList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Integer> list = this.checkTypes;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.txType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.bizType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.amount);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.inputData);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.projectAddress);
        UserOperation userOperation = this.uop;
        if (userOperation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userOperation.writeToParcel(parcel, i);
        }
        DappGasParam dappGasParam = this.dappParams;
        if (dappGasParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dappGasParam.writeToParcel(parcel, i);
        }
        Integer num3 = this.bizLine;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.payload);
        List<SimulateTransactionParam> list2 = this.simulateTransactionParamList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SimulateTransactionParam> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeLong(this.chainId);
        parcel.writeString(this.domain);
        parcel.writeString(this.requestId);
        Map<String, String> map = this.additionalData;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        List<EVMAuthorization> list3 = this.authorizationList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<EVMAuthorization> it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        List<EVMStateOverride> list4 = this.stateOverrideList;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        Iterator<EVMStateOverride> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
    }

    public TxToastCheckReq(@NotNull List<Integer> list, Long l, Integer num, Integer num2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, UserOperation userOperation, DappGasParam dappGasParam, Integer num3, String str8, List<SimulateTransactionParam> list2, long j, @NotNull String str9, @NotNull String str10, Map<String, String> map, List<EVMAuthorization> list3, List<EVMStateOverride> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.checkTypes = list;
        this.coinId = l;
        this.txType = num;
        this.bizType = num2;
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.gasPrice = str4;
        this.inputData = str5;
        this.tokenAddress = str6;
        this.projectAddress = str7;
        this.uop = userOperation;
        this.dappParams = dappGasParam;
        this.bizLine = num3;
        this.payload = str8;
        this.simulateTransactionParamList = list2;
        this.chainId = j;
        this.domain = str9;
        this.requestId = str10;
        this.additionalData = map;
        this.authorizationList = list3;
        this.stateOverrideList = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fc: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:429)) : (r25v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000d: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.UserOperation:?: TERNARY null = ((wrap:int:0x005f: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.UserOperation) : (r36v0 com.okinc.business.defi.biz.net.bean.UserOperation))
  (wrap:com.okinc.business.defi.biz.net.bean.DappGasParam:?: TERNARY null = ((wrap:int:0x0067: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.DappGasParam) : (r37v0 com.okinc.business.defi.biz.net.bean.DappGasParam))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006f: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0084: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x008f: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r41v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r45v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r46v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r47v0 java.util.List))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.UserOperation, com.okinc.business.defi.biz.net.bean.DappGasParam, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.SimulateTransactionParam>, long, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride>):void (m)] (LINE:428) call: com.okinc.business.defi.biz.net.bean.TxToastCheckReq.<init>(java.util.List, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.UserOperation, com.okinc.business.defi.biz.net.bean.DappGasParam, java.lang.Integer, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.util.Map, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TxToastCheckReq(List list, Long l, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserOperation userOperation, DappGasParam dappGasParam, Integer num3, String str8, List list2, long j, String str9, String str10, Map map, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : userOperation, (i & 4096) != 0 ? null : dappGasParam, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : list2, (i & 65536) != 0 ? -1L : j, (i & 131072) != 0 ? "" : str9, (i & 262144) != 0 ? "" : str10, (i & 524288) != 0 ? null : map, (i & 1048576) != 0 ? null : list3, (i & 2097152) != 0 ? null : list4);
    }
}
