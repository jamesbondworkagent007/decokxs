package com.okinc.assets.backend.api.model;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class InvalidAssetListResp implements Parcelable {
    private String amount;
    private boolean canInvoiceDeposit;
    private boolean canWithdrawInternal;
    private String contractAddress;
    private String currency;
    private String currencyFullName;
    private int currencyId;
    private long estimatedOpenTime;
    private String icon;
    private Boolean isEntitySupported;
    private ArrayList<NetworkMethod> methods;
    private boolean modifiableAmount;
    private boolean needTag;
    private List<ChainData> networks;
    private String remark;
    private boolean status;
    private int subCurrencyId;
    private String subFullName;
    private String subName;
    private Integer tradableType;
    private String usdValuation;
    private String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvalidAssetListResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(NetworkMethod$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ChainData$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<InvalidAssetListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvalidAssetListResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(NetworkMethod.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            boolean z2 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string8 = parcel.readString();
            long j = parcel.readLong();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null;
            boolean z4 = parcel.readInt() != 0;
            String string9 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(ChainData.CREATOR.createFromParcel(parcel));
            }
            return new InvalidAssetListResp(string, i, i2, string2, string3, string4, string5, z, arrayList, z2, string6, string7, z3, string8, j, numValueOf, boolValueOf, z4, string9, arrayList3, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvalidAssetListResp[] newArray(int i) {
            return new InvalidAssetListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvalidAssetListResp() {
        this((String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, false, (ArrayList) null, false, (String) null, (String) null, false, (String) null, 0L, (Integer) null, (Boolean) null, false, (String) null, (List) null, false, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.subFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.estimatedOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.tradableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isEntitySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> component20() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.modifiableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NetworkMethod> component9() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidAssetListResp copy(String str, int i, int i2, String str2, String str3, String str4, String str5, boolean z, ArrayList<NetworkMethod> arrayList, boolean z2, String str6, String str7, boolean z3, String str8, long j, Integer num, Boolean bool, boolean z4, @NotNull String str9, @NotNull List<ChainData> list, boolean z5, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new InvalidAssetListResp(str, i, i2, str2, str3, str4, str5, z, arrayList, z2, str6, str7, z3, str8, j, num, bool, z4, str9, list, z5, str10);
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
        if (!(obj instanceof InvalidAssetListResp)) {
            return false;
        }
        InvalidAssetListResp invalidAssetListResp = (InvalidAssetListResp) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) invalidAssetListResp.icon) && this.currencyId == invalidAssetListResp.currencyId && this.subCurrencyId == invalidAssetListResp.subCurrencyId && Intrinsics.EZpvd((Object) this.currency, (Object) invalidAssetListResp.currency) && Intrinsics.EZpvd((Object) this.currencyFullName, (Object) invalidAssetListResp.currencyFullName) && Intrinsics.EZpvd((Object) this.subName, (Object) invalidAssetListResp.subName) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) invalidAssetListResp.contractAddress) && this.modifiableAmount == invalidAssetListResp.modifiableAmount && Intrinsics.EZpvd(this.methods, invalidAssetListResp.methods) && this.needTag == invalidAssetListResp.needTag && Intrinsics.EZpvd((Object) this.subFullName, (Object) invalidAssetListResp.subFullName) && Intrinsics.EZpvd((Object) this.amount, (Object) invalidAssetListResp.amount) && this.status == invalidAssetListResp.status && Intrinsics.EZpvd((Object) this.remark, (Object) invalidAssetListResp.remark) && this.estimatedOpenTime == invalidAssetListResp.estimatedOpenTime && Intrinsics.EZpvd(this.tradableType, invalidAssetListResp.tradableType) && Intrinsics.EZpvd(this.isEntitySupported, invalidAssetListResp.isEntitySupported) && this.canWithdrawInternal == invalidAssetListResp.canWithdrawInternal && Intrinsics.EZpvd((Object) this.valuation, (Object) invalidAssetListResp.valuation) && Intrinsics.EZpvd(this.networks, invalidAssetListResp.networks) && this.canInvoiceDeposit == invalidAssetListResp.canInvoiceDeposit && Intrinsics.EZpvd((Object) this.usdValuation, (Object) invalidAssetListResp.usdValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanInvoiceDeposit() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdrawInternal() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEstimatedOpenTime() {
        return this.estimatedOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NetworkMethod> getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getModifiableAmount() {
        return this.modifiableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> getNetworks() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubFullName() {
        return this.subFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubName() {
        return this.subName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTradableType() {
        return this.tradableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValuation() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        String str = this.icon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.currencyId);
        int iHashCode4 = Integer.hashCode(this.subCurrencyId);
        String str2 = this.currency;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyFullName;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subName;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.contractAddress;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        int iHashCode9 = Boolean.hashCode(this.modifiableAmount);
        ArrayList<NetworkMethod> arrayList = this.methods;
        int iHashCode10 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode11 = Boolean.hashCode(this.needTag);
        String str6 = this.subFullName;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.amount;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        int iHashCode14 = Boolean.hashCode(this.status);
        String str8 = this.remark;
        if (str8 == null) {
            i = iHashCode3;
            iHashCode = 0;
        } else {
            iHashCode = str8.hashCode();
            i = iHashCode3;
        }
        int iHashCode15 = Long.hashCode(this.estimatedOpenTime);
        Integer num = this.tradableType;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isEntitySupported;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + i) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.canWithdrawInternal)) * 31) + this.valuation.hashCode()) * 31) + this.networks.hashCode()) * 31) + Boolean.hashCode(this.canInvoiceDeposit)) * 31) + this.usdValuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isEntitySupported() {
        return this.isEntitySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanInvoiceDeposit(boolean z) {
        this.canInvoiceDeposit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdrawInternal(boolean z) {
        this.canWithdrawInternal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyFullName(String str) {
        this.currencyFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntitySupported(Boolean bool) {
        this.isEntitySupported = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedOpenTime(long j) {
        this.estimatedOpenTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethods(ArrayList<NetworkMethod> arrayList) {
        this.methods = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifiableAmount(boolean z) {
        this.modifiableAmount = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworks(@NotNull List<ChainData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.networks = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemark(String str) {
        this.remark = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(boolean z) {
        this.status = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubFullName(String str) {
        this.subFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubName(String str) {
        this.subName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradableType(Integer num) {
        this.tradableType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvalidAssetListResp(icon=" + this.icon + ", currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", currency=" + this.currency + ", currencyFullName=" + this.currencyFullName + ", subName=" + this.subName + ", contractAddress=" + this.contractAddress + ", modifiableAmount=" + this.modifiableAmount + ", methods=" + this.methods + ", needTag=" + this.needTag + ", subFullName=" + this.subFullName + ", amount=" + this.amount + ", status=" + this.status + ", remark=" + this.remark + ", estimatedOpenTime=" + this.estimatedOpenTime + ", tradableType=" + this.tradableType + ", isEntitySupported=" + this.isEntitySupported + ", canWithdrawInternal=" + this.canWithdrawInternal + ", valuation=" + this.valuation + ", networks=" + this.networks + ", canInvoiceDeposit=" + this.canInvoiceDeposit + ", usdValuation=" + this.usdValuation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeInt(this.currencyId);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyFullName);
        parcel.writeString(this.subName);
        parcel.writeString(this.contractAddress);
        parcel.writeInt(this.modifiableAmount ? 1 : 0);
        ArrayList<NetworkMethod> arrayList = this.methods;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<NetworkMethod> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.needTag ? 1 : 0);
        parcel.writeString(this.subFullName);
        parcel.writeString(this.amount);
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeString(this.remark);
        parcel.writeLong(this.estimatedOpenTime);
        Integer num = this.tradableType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isEntitySupported;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.canWithdrawInternal ? 1 : 0);
        parcel.writeString(this.valuation);
        List<ChainData> list = this.networks;
        parcel.writeInt(list.size());
        Iterator<ChainData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canInvoiceDeposit ? 1 : 0);
        parcel.writeString(this.usdValuation);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.InvalidAssetListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvalidAssetListResp> serializer() {
            return InvalidAssetListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvalidAssetListResp(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5, boolean z, ArrayList arrayList, boolean z2, String str6, String str7, boolean z3, String str8, long j, Integer num, Boolean bool, boolean z4, String str9, List list, boolean z5, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i2;
        }
        if ((i & 4) == 0) {
            this.subCurrencyId = 0;
        } else {
            this.subCurrencyId = i3;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
        if ((i & 16) == 0) {
            this.currencyFullName = null;
        } else {
            this.currencyFullName = str3;
        }
        if ((i & 32) == 0) {
            this.subName = null;
        } else {
            this.subName = str4;
        }
        if ((i & 64) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str5;
        }
        if ((i & 128) == 0) {
            this.modifiableAmount = false;
        } else {
            this.modifiableAmount = z;
        }
        if ((i & 256) == 0) {
            this.methods = null;
        } else {
            this.methods = arrayList;
        }
        if ((i & 512) == 0) {
            this.needTag = false;
        } else {
            this.needTag = z2;
        }
        if ((i & 1024) == 0) {
            this.subFullName = null;
        } else {
            this.subFullName = str6;
        }
        if ((i & 2048) == 0) {
            this.amount = null;
        } else {
            this.amount = str7;
        }
        if ((i & 4096) == 0) {
            this.status = false;
        } else {
            this.status = z3;
        }
        if ((i & 8192) == 0) {
            this.remark = null;
        } else {
            this.remark = str8;
        }
        this.estimatedOpenTime = (i & 16384) == 0 ? 0L : j;
        if ((32768 & i) == 0) {
            this.tradableType = null;
        } else {
            this.tradableType = num;
        }
        if ((65536 & i) == 0) {
            this.isEntitySupported = null;
        } else {
            this.isEntitySupported = bool;
        }
        if ((131072 & i) == 0) {
            this.canWithdrawInternal = false;
        } else {
            this.canWithdrawInternal = z4;
        }
        if ((262144 & i) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str9;
        }
        this.networks = (524288 & i) == 0 ? yDY.AhwBna() : list;
        if ((1048576 & i) == 0) {
            this.canInvoiceDeposit = false;
        } else {
            this.canInvoiceDeposit = z5;
        }
        if ((i & 2097152) == 0) {
            this.usdValuation = "";
        } else {
            this.usdValuation = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(InvalidAssetListResp invalidAssetListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invalidAssetListResp.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invalidAssetListResp.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invalidAssetListResp.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, invalidAssetListResp.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invalidAssetListResp.subCurrencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, invalidAssetListResp.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invalidAssetListResp.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invalidAssetListResp.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invalidAssetListResp.currencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invalidAssetListResp.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invalidAssetListResp.subName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invalidAssetListResp.subName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invalidAssetListResp.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invalidAssetListResp.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invalidAssetListResp.modifiableAmount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, invalidAssetListResp.modifiableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invalidAssetListResp.methods != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], invalidAssetListResp.methods);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invalidAssetListResp.needTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, invalidAssetListResp.needTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invalidAssetListResp.subFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invalidAssetListResp.subFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invalidAssetListResp.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, invalidAssetListResp.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invalidAssetListResp.status) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, invalidAssetListResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invalidAssetListResp.remark != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, invalidAssetListResp.remark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || invalidAssetListResp.estimatedOpenTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, invalidAssetListResp.estimatedOpenTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || invalidAssetListResp.tradableType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, invalidAssetListResp.tradableType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || invalidAssetListResp.isEntitySupported != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, invalidAssetListResp.isEntitySupported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || invalidAssetListResp.canWithdrawInternal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, invalidAssetListResp.canWithdrawInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) invalidAssetListResp.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, invalidAssetListResp.valuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(invalidAssetListResp.networks, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], invalidAssetListResp.networks);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || invalidAssetListResp.canInvoiceDeposit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, invalidAssetListResp.canInvoiceDeposit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) invalidAssetListResp.usdValuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, invalidAssetListResp.usdValuation);
    }

    public InvalidAssetListResp(String str, int i, int i2, String str2, String str3, String str4, String str5, boolean z, ArrayList<NetworkMethod> arrayList, boolean z2, String str6, String str7, boolean z3, String str8, long j, Integer num, Boolean bool, boolean z4, @NotNull String str9, @NotNull List<ChainData> list, boolean z5, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.icon = str;
        this.currencyId = i;
        this.subCurrencyId = i2;
        this.currency = str2;
        this.currencyFullName = str3;
        this.subName = str4;
        this.contractAddress = str5;
        this.modifiableAmount = z;
        this.methods = arrayList;
        this.needTag = z2;
        this.subFullName = str6;
        this.amount = str7;
        this.status = z3;
        this.remark = str8;
        this.estimatedOpenTime = j;
        this.tradableType = num;
        this.isEntitySupported = bool;
        this.canWithdrawInternal = z4;
        this.valuation = str9;
        this.networks = list;
        this.canInvoiceDeposit = z5;
        this.usdValuation = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r49v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0042: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r34v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0072: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r40v0 long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007e: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0087: ARITH (r49v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r43v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (r49v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r49v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r49v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ae: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r46v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r49v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r48v0 java.lang.String) : (""))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.ArrayList<com.okinc.assets.backend.api.model.NetworkMethod>, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, long, java.lang.Integer, java.lang.Boolean, boolean, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.ChainData>, boolean, java.lang.String):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.InvalidAssetListResp.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.ArrayList, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, long, java.lang.Integer, java.lang.Boolean, boolean, java.lang.String, java.util.List, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ InvalidAssetListResp(String str, int i, int i2, String str2, String str3, String str4, String str5, boolean z, ArrayList arrayList, boolean z2, String str6, String str7, boolean z3, String str8, long j, Integer num, Boolean bool, boolean z4, String str9, List list, boolean z5, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? null : arrayList, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? null : str6, (i3 & 2048) != 0 ? null : str7, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? null : str8, (i3 & 16384) != 0 ? 0L : j, (32768 & i3) != 0 ? null : num, (i3 & 65536) != 0 ? null : bool, (i3 & 131072) != 0 ? false : z4, (i3 & 262144) != 0 ? "" : str9, (i3 & 524288) != 0 ? yDY.AhwBna() : list, (i3 & 1048576) != 0 ? false : z5, (i3 & 2097152) == 0 ? str10 : "");
    }
}
