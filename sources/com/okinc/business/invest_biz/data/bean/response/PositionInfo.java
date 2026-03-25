package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment$$serializer;
import com.okinc.business.invest_biz.data.contants.PositionStatus;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PositionInfo implements Parcelable {
    public static final KSerializer<Object>[] $childSerializers;
    public final InvestAssetPositionType assetPositionType;
    public final String feeRate;
    public final String positionName;
    public final List<InvestUserRewardInfoByInvestment> positionRewardInfoList;
    public final PositionStatus positionStatus;
    public final List<InvestBaseDefiTokenInfo> positionSuppliedInfoList;
    public final String range;
    public final String reverseRange;
    public final String settlementTime;
    public final boolean showIncreaseLiquidity;
    public final String tips;
    public final String tokenId;
    public final String totalValue;
    public final List<InvestUserRewardInfoByInvestment> unclaimedFeeRewards;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PositionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PositionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            PositionStatus positionStatusValueOf = PositionStatus.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            return new PositionInfo(string, positionStatusValueOf, string2, string3, string4, string5, string6, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : InvestAssetPositionType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionInfo[] newArray(int i) {
            return new PositionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionInfo() {
        this((String) null, (PositionStatus) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, (InvestAssetPositionType) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionInfo AEQbTJ(@NotNull String str, @NotNull PositionStatus positionStatus, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestUserRewardInfoByInvestment> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, String str7, InvestAssetPositionType investAssetPositionType, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(positionStatus, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new PositionInfo(str, positionStatus, str2, str3, str4, str5, str6, list, list2, list3, str7, investAssetPositionType, str8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionStatus AEQbTJ() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> AhwBna() {
        return this.positionSuppliedInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType EZpvd() {
        return this.assetPositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> KWHzl() {
        return this.positionRewardInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.positionName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionInfo)) {
            return false;
        }
        PositionInfo positionInfo = (PositionInfo) obj;
        return Intrinsics.EZpvd((Object) this.positionName, (Object) positionInfo.positionName) && this.positionStatus == positionInfo.positionStatus && Intrinsics.EZpvd((Object) this.range, (Object) positionInfo.range) && Intrinsics.EZpvd((Object) this.reverseRange, (Object) positionInfo.reverseRange) && Intrinsics.EZpvd((Object) this.tips, (Object) positionInfo.tips) && Intrinsics.EZpvd((Object) this.tokenId, (Object) positionInfo.tokenId) && Intrinsics.EZpvd((Object) this.feeRate, (Object) positionInfo.feeRate) && Intrinsics.EZpvd(this.positionSuppliedInfoList, positionInfo.positionSuppliedInfoList) && Intrinsics.EZpvd(this.positionRewardInfoList, positionInfo.positionRewardInfoList) && Intrinsics.EZpvd(this.unclaimedFeeRewards, positionInfo.unclaimedFeeRewards) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) positionInfo.settlementTime) && this.assetPositionType == positionInfo.assetPositionType && Intrinsics.EZpvd((Object) this.totalValue, (Object) positionInfo.totalValue) && this.showIncreaseLiquidity == positionInfo.showIncreaseLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.positionName.hashCode();
        int iHashCode2 = this.positionStatus.hashCode();
        int iHashCode3 = this.range.hashCode();
        int iHashCode4 = this.reverseRange.hashCode();
        String str = this.tips;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.tokenId.hashCode();
        int iHashCode7 = this.feeRate.hashCode();
        int iHashCode8 = this.positionSuppliedInfoList.hashCode();
        int iHashCode9 = this.positionRewardInfoList.hashCode();
        int iHashCode10 = this.unclaimedFeeRewards.hashCode();
        String str2 = this.settlementTime;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        InvestAssetPositionType investAssetPositionType = this.assetPositionType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (investAssetPositionType != null ? investAssetPositionType.hashCode() : 0)) * 31) + this.totalValue.hashCode()) * 31) + Boolean.hashCode(this.showIncreaseLiquidity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> isConnected() {
        return this.unclaimedFeeRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionInfo(positionName=" + this.positionName + ", positionStatus=" + this.positionStatus + ", range=" + this.range + ", reverseRange=" + this.reverseRange + ", tips=" + this.tips + ", tokenId=" + this.tokenId + ", feeRate=" + this.feeRate + ", positionSuppliedInfoList=" + this.positionSuppliedInfoList + ", positionRewardInfoList=" + this.positionRewardInfoList + ", unclaimedFeeRewards=" + this.unclaimedFeeRewards + ", settlementTime=" + this.settlementTime + ", assetPositionType=" + this.assetPositionType + ", totalValue=" + this.totalValue + ", showIncreaseLiquidity=" + this.showIncreaseLiquidity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.reverseRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.positionName);
        parcel.writeString(this.positionStatus.name());
        parcel.writeString(this.range);
        parcel.writeString(this.reverseRange);
        parcel.writeString(this.tips);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.feeRate);
        List<InvestBaseDefiTokenInfo> list = this.positionSuppliedInfoList;
        parcel.writeInt(list.size());
        Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list2 = this.positionRewardInfoList;
        parcel.writeInt(list2.size());
        Iterator<InvestUserRewardInfoByInvestment> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list3 = this.unclaimedFeeRewards;
        parcel.writeInt(list3.size());
        Iterator<InvestUserRewardInfoByInvestment> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.settlementTime);
        InvestAssetPositionType investAssetPositionType = this.assetPositionType;
        if (investAssetPositionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(investAssetPositionType.name());
        }
        parcel.writeString(this.totalValue);
        parcel.writeInt(this.showIncreaseLiquidity ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.PositionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionInfo> serializer() {
            return PositionInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestUserRewardInfoByInvestment$$serializer investUserRewardInfoByInvestment$$serializer = InvestUserRewardInfoByInvestment$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, PositionStatus.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(InvestBaseDefiTokenInfo$$serializer.INSTANCE), new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.bean.InvestAssetPositionType", InvestAssetPositionType.values()), null, null};
    }

    public /* synthetic */ PositionInfo(int i, String str, PositionStatus positionStatus, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, InvestAssetPositionType investAssetPositionType, String str8, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.positionName = "";
        } else {
            this.positionName = str;
        }
        this.positionStatus = (i & 2) == 0 ? PositionStatus.Inactive : positionStatus;
        if ((i & 4) == 0) {
            this.range = "";
        } else {
            this.range = str2;
        }
        if ((i & 8) == 0) {
            this.reverseRange = "";
        } else {
            this.reverseRange = str3;
        }
        if ((i & 16) == 0) {
            this.tips = null;
        } else {
            this.tips = str4;
        }
        if ((i & 32) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str5;
        }
        if ((i & 64) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str6;
        }
        this.positionSuppliedInfoList = (i & 128) == 0 ? yDY.AhwBna() : list;
        this.positionRewardInfoList = (i & 256) == 0 ? yDY.AhwBna() : list2;
        this.unclaimedFeeRewards = (i & 512) == 0 ? yDY.AhwBna() : list3;
        if ((i & 1024) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str7;
        }
        if ((i & 2048) == 0) {
            this.assetPositionType = null;
        } else {
            this.assetPositionType = investAssetPositionType;
        }
        if ((i & 4096) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str8;
        }
        this.showIncreaseLiquidity = (i & 8192) == 0 ? false : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [166=5] */
    public static final /* synthetic */ void EZpvd(PositionInfo positionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) positionInfo.positionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, positionInfo.positionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || positionInfo.positionStatus != PositionStatus.Inactive) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], positionInfo.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) positionInfo.range, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, positionInfo.range);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) positionInfo.reverseRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, positionInfo.reverseRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || positionInfo.tips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, positionInfo.tips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) positionInfo.tokenId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, positionInfo.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) positionInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, positionInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(positionInfo.positionSuppliedInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], positionInfo.positionSuppliedInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(positionInfo.positionRewardInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], positionInfo.positionRewardInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(positionInfo.unclaimedFeeRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], positionInfo.unclaimedFeeRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || positionInfo.settlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, positionInfo.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || positionInfo.assetPositionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], positionInfo.assetPositionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) positionInfo.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, positionInfo.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || positionInfo.showIncreaseLiquidity) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, positionInfo.showIncreaseLiquidity);
        }
    }

    public PositionInfo(@NotNull String str, @NotNull PositionStatus positionStatus, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestUserRewardInfoByInvestment> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, String str7, InvestAssetPositionType investAssetPositionType, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(positionStatus, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.positionName = str;
        this.positionStatus = positionStatus;
        this.range = str2;
        this.reverseRange = str3;
        this.tips = str4;
        this.tokenId = str5;
        this.feeRate = str6;
        this.positionSuppliedInfoList = list;
        this.positionRewardInfoList = list2;
        this.unclaimedFeeRewards = list3;
        this.settlementTime = str7;
        this.assetPositionType = investAssetPositionType;
        this.totalValue = str8;
        this.showIncreaseLiquidity = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.PositionStatus:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] (LINE:172) com.okinc.business.invest_biz.data.contants.PositionStatus.Inactive com.okinc.business.invest_biz.data.contants.PositionStatus) : (r17v0 com.okinc.business.invest_biz.data.contants.PositionStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003e: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:185)) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:187)) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:189)) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x0067: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0075: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.contants.PositionStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.lang.String, boolean):void (m)] (LINE:168) call: com.okinc.business.invest_biz.data.bean.response.PositionInfo.<init>(java.lang.String, com.okinc.business.invest_biz.data.contants.PositionStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PositionInfo(String str, PositionStatus positionStatus, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, InvestAssetPositionType investAssetPositionType, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? PositionStatus.Inactive : positionStatus, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? yDY.AhwBna() : list2, (i & 512) != 0 ? yDY.AhwBna() : list3, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? investAssetPositionType : null, (i & 4096) == 0 ? str8 : "", (i & 8192) != 0 ? false : z);
    }
}
