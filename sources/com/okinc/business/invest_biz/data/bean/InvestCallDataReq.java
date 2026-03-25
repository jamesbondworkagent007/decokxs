package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestCallDataReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String accountId;
    private final String address;
    private final List<InvestSimpleToken> assetsList;
    private final List<InvestSimpleToken> expectOutputList;
    private final String extra;
    private final List<InvestSimpleToken> feeEarning;
    private final String gasLimit;
    private final String gasPrice;
    private final List<Long> investmentIdList;
    private final String priorityFee;
    private final String slipPoint;
    private final Long stakeId;
    private final String swapSlipPoint;
    private final Integer type;
    private final List<InvestSimpleToken> userInputList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestCallDataReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestCallDataReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCallDataReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
            }
            return new InvestCallDataReq(string, numValueOf, arrayList, string2, arrayList2, arrayList3, arrayList4, string3, string4, string5, string6, string7, arrayList5, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCallDataReq[] newArray(int i) {
            return new InvestCallDataReq[i];
        }
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component13() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component3() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component5() {
        return this.expectOutputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component6() {
        return this.userInputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component7() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCallDataReq copy(@NotNull String str, Integer num, @NotNull List<Long> list, @NotNull String str2, @NotNull List<InvestSimpleToken> list2, @NotNull List<InvestSimpleToken> list3, @NotNull List<InvestSimpleToken> list4, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull List<InvestSimpleToken> list5, String str8, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new InvestCallDataReq(str, num, list, str2, list2, list3, list4, str3, str4, str5, str6, str7, list5, str8, l);
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
        if (!(obj instanceof InvestCallDataReq)) {
            return false;
        }
        InvestCallDataReq investCallDataReq = (InvestCallDataReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) investCallDataReq.accountId) && Intrinsics.EZpvd(this.type, investCallDataReq.type) && Intrinsics.EZpvd(this.investmentIdList, investCallDataReq.investmentIdList) && Intrinsics.EZpvd((Object) this.address, (Object) investCallDataReq.address) && Intrinsics.EZpvd(this.expectOutputList, investCallDataReq.expectOutputList) && Intrinsics.EZpvd(this.userInputList, investCallDataReq.userInputList) && Intrinsics.EZpvd(this.assetsList, investCallDataReq.assetsList) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) investCallDataReq.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) investCallDataReq.priorityFee) && Intrinsics.EZpvd((Object) this.slipPoint, (Object) investCallDataReq.slipPoint) && Intrinsics.EZpvd((Object) this.extra, (Object) investCallDataReq.extra) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) investCallDataReq.gasLimit) && Intrinsics.EZpvd(this.feeEarning, investCallDataReq.feeEarning) && Intrinsics.EZpvd((Object) this.swapSlipPoint, (Object) investCallDataReq.swapSlipPoint) && Intrinsics.EZpvd(this.stakeId, investCallDataReq.stakeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getAssetsList() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getExpectOutputList() {
        return this.expectOutputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getFeeEarning() {
        return this.feeEarning;
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
    public final List<Long> getInvestmentIdList() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlipPoint() {
        return this.slipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStakeId() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapSlipPoint() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getUserInputList() {
        return this.userInputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        Integer num = this.type;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.investmentIdList.hashCode();
        int iHashCode4 = this.address.hashCode();
        int iHashCode5 = this.expectOutputList.hashCode();
        int iHashCode6 = this.userInputList.hashCode();
        int iHashCode7 = this.assetsList.hashCode();
        int iHashCode8 = this.gasPrice.hashCode();
        int iHashCode9 = this.priorityFee.hashCode();
        String str = this.slipPoint;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        int iHashCode11 = this.extra.hashCode();
        int iHashCode12 = this.gasLimit.hashCode();
        int iHashCode13 = this.feeEarning.hashCode();
        String str2 = this.swapSlipPoint;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        Long l = this.stakeId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCallDataReq(accountId=" + this.accountId + ", type=" + this.type + ", investmentIdList=" + this.investmentIdList + ", address=" + this.address + ", expectOutputList=" + this.expectOutputList + ", userInputList=" + this.userInputList + ", assetsList=" + this.assetsList + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", slipPoint=" + this.slipPoint + ", extra=" + this.extra + ", gasLimit=" + this.gasLimit + ", feeEarning=" + this.feeEarning + ", swapSlipPoint=" + this.swapSlipPoint + ", stakeId=" + this.stakeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<Long> list = this.investmentIdList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        parcel.writeString(this.address);
        List<InvestSimpleToken> list2 = this.expectOutputList;
        parcel.writeInt(list2.size());
        Iterator<InvestSimpleToken> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestSimpleToken> list3 = this.userInputList;
        parcel.writeInt(list3.size());
        Iterator<InvestSimpleToken> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InvestSimpleToken> list4 = this.assetsList;
        parcel.writeInt(list4.size());
        Iterator<InvestSimpleToken> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.slipPoint);
        parcel.writeString(this.extra);
        parcel.writeString(this.gasLimit);
        List<InvestSimpleToken> list5 = this.feeEarning;
        parcel.writeInt(list5.size());
        Iterator<InvestSimpleToken> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.swapSlipPoint);
        Long l = this.stakeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCallDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestCallDataReq> serializer() {
            return InvestCallDataReq$$serializer.INSTANCE;
        }
    }

    static {
        InvestSimpleToken$$serializer investSimpleToken$$serializer = InvestSimpleToken$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null, new ArrayListSerializer(investSimpleToken$$serializer), new ArrayListSerializer(investSimpleToken$$serializer), new ArrayListSerializer(investSimpleToken$$serializer), null, null, null, null, null, new ArrayListSerializer(investSimpleToken$$serializer), null, null};
    }

    public /* synthetic */ InvestCallDataReq(int i, String str, Integer num, List list, String str2, List list2, List list3, List list4, String str3, String str4, String str5, String str6, String str7, List list5, String str8, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvestCallDataReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        this.investmentIdList = (i & 4) == 0 ? yDY.AhwBna() : list;
        if ((i & 8) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        this.expectOutputList = (i & 16) == 0 ? yDY.AhwBna() : list2;
        this.userInputList = (i & 32) == 0 ? yDY.AhwBna() : list3;
        this.assetsList = (i & 64) == 0 ? yDY.AhwBna() : list4;
        if ((i & 128) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str3;
        }
        if ((i & 256) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str4;
        }
        if ((i & 512) == 0) {
            this.slipPoint = null;
        } else {
            this.slipPoint = str5;
        }
        if ((i & 1024) == 0) {
            this.extra = "";
        } else {
            this.extra = str6;
        }
        if ((i & 2048) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str7;
        }
        this.feeEarning = (i & 4096) == 0 ? yDY.AhwBna() : list5;
        if ((i & 8192) == 0) {
            this.swapSlipPoint = "";
        } else {
            this.swapSlipPoint = str8;
        }
        if ((i & 16384) == 0) {
            this.stakeId = null;
        } else {
            this.stakeId = l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [500=6] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCallDataReq investCallDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investCallDataReq.accountId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investCallDataReq.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, investCallDataReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investCallDataReq.investmentIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investCallDataReq.investmentIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investCallDataReq.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investCallDataReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investCallDataReq.expectOutputList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investCallDataReq.expectOutputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investCallDataReq.userInputList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investCallDataReq.userInputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(investCallDataReq.assetsList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], investCallDataReq.assetsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investCallDataReq.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investCallDataReq.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investCallDataReq.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investCallDataReq.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investCallDataReq.slipPoint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investCallDataReq.slipPoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investCallDataReq.extra, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investCallDataReq.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investCallDataReq.gasLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investCallDataReq.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(investCallDataReq.feeEarning, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], investCallDataReq.feeEarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investCallDataReq.swapSlipPoint, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investCallDataReq.swapSlipPoint);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && investCallDataReq.stakeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, investCallDataReq.stakeId);
    }

    public InvestCallDataReq(@NotNull String str, Integer num, @NotNull List<Long> list, @NotNull String str2, @NotNull List<InvestSimpleToken> list2, @NotNull List<InvestSimpleToken> list3, @NotNull List<InvestSimpleToken> list4, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull List<InvestSimpleToken> list5, String str8, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.accountId = str;
        this.type = num;
        this.investmentIdList = list;
        this.address = str2;
        this.expectOutputList = list2;
        this.userInputList = list3;
        this.assetsList = list4;
        this.gasPrice = str3;
        this.priorityFee = str4;
        this.slipPoint = str5;
        this.extra = str6;
        this.gasLimit = str7;
        this.feeEarning = list5;
        this.swapSlipPoint = str8;
        this.stakeId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:507)) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:509)) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:510)) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:511)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0069: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:517)) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x007b: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.String, java.lang.Integer, java.util.List<java.lang.Long>, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.lang.String, java.lang.Long):void (m)] (LINE:503) call: com.okinc.business.invest_biz.data.bean.InvestCallDataReq.<init>(java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ InvestCallDataReq(String str, Integer num, List list, String str2, List list2, List list3, List list4, String str3, String str4, String str5, String str6, String str7, List list5, String str8, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? yDY.AhwBna() : list3, (i & 64) != 0 ? yDY.AhwBna() : list4, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? yDY.AhwBna() : list5, (i & 8192) == 0 ? str8 : "", (i & 16384) == 0 ? l : null);
    }
}
