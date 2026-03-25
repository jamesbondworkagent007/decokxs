package com.okinc.tradingbot.impl.dto;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FundingFeeIncomeResponse implements Parcelable {
    public final List<ArbFundingFeeVo> arbFundingFeeInfos;
    public final String date;
    public final String dateTotalArbPnl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FundingFeeIncomeResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ArbFundingFeeVo$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<FundingFeeIncomeResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeIncomeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ArbFundingFeeVo.CREATOR.createFromParcel(parcel));
            }
            return new FundingFeeIncomeResponse(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeIncomeResponse[] newArray(int i) {
            return new FundingFeeIncomeResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingFeeIncomeResponse() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FundingFeeIncomeResponse copy$default(FundingFeeIncomeResponse fundingFeeIncomeResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingFeeIncomeResponse.date;
        }
        if ((i & 2) != 0) {
            str2 = fundingFeeIncomeResponse.dateTotalArbPnl;
        }
        if ((i & 4) != 0) {
            list = fundingFeeIncomeResponse.arbFundingFeeInfos;
        }
        return fundingFeeIncomeResponse.EZpvd(str, str2, (List<ArbFundingFeeVo>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeeIncomeResponse EZpvd(@NotNull String str, @NotNull String str2, @NotNull List<ArbFundingFeeVo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FundingFeeIncomeResponse(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbFundingFeeVo> EZpvd() {
        return this.arbFundingFeeInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.dateTotalArbPnl;
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
        if (!(obj instanceof FundingFeeIncomeResponse)) {
            return false;
        }
        FundingFeeIncomeResponse fundingFeeIncomeResponse = (FundingFeeIncomeResponse) obj;
        return Intrinsics.EZpvd((Object) this.date, (Object) fundingFeeIncomeResponse.date) && Intrinsics.EZpvd((Object) this.dateTotalArbPnl, (Object) fundingFeeIncomeResponse.dateTotalArbPnl) && Intrinsics.EZpvd(this.arbFundingFeeInfos, fundingFeeIncomeResponse.arbFundingFeeInfos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.date.hashCode() * 31) + this.dateTotalArbPnl.hashCode()) * 31) + this.arbFundingFeeInfos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingFeeIncomeResponse(date=" + this.date + ", dateTotalArbPnl=" + this.dateTotalArbPnl + ", arbFundingFeeInfos=" + this.arbFundingFeeInfos + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.date);
        parcel.writeString(this.dateTotalArbPnl);
        List<ArbFundingFeeVo> list = this.arbFundingFeeInfos;
        parcel.writeInt(list.size());
        Iterator<ArbFundingFeeVo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FundingFeeIncomeResponse> serializer() {
            return FundingFeeIncomeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FundingFeeIncomeResponse(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.date = "";
        } else {
            this.date = str;
        }
        if ((i & 2) == 0) {
            this.dateTotalArbPnl = "";
        } else {
            this.dateTotalArbPnl = str2;
        }
        if ((i & 4) == 0) {
            this.arbFundingFeeInfos = yDY.AhwBna();
        } else {
            this.arbFundingFeeInfos = list;
        }
    }

    public static final /* synthetic */ void EZpvd(FundingFeeIncomeResponse fundingFeeIncomeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fundingFeeIncomeResponse.date, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fundingFeeIncomeResponse.date);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fundingFeeIncomeResponse.dateTotalArbPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fundingFeeIncomeResponse.dateTotalArbPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(fundingFeeIncomeResponse.arbFundingFeeInfos, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], fundingFeeIncomeResponse.arbFundingFeeInfos);
    }

    public FundingFeeIncomeResponse(@NotNull String str, @NotNull String str2, @NotNull List<ArbFundingFeeVo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.date = str;
        this.dateTotalArbPnl = str2;
        this.arbFundingFeeInfos = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.ArbFundingFeeVo>):void (m)] (LINE:10) call: com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ FundingFeeIncomeResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
