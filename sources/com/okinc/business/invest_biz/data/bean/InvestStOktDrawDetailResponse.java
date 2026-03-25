package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestStOktDrawDetailResponse implements Parcelable {
    private final InvestUserRewardElementInfo rewardElementInfo;
    private final List<STOKTDrawDetailItemInfo> stOktDrawDetailList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestStOktDrawDetailResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(STOKTDrawDetailItemInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestStOktDrawDetailResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestStOktDrawDetailResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            InvestUserRewardElementInfo investUserRewardElementInfoCreateFromParcel = parcel.readInt() == 0 ? null : InvestUserRewardElementInfo.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(STOKTDrawDetailItemInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestStOktDrawDetailResponse(investUserRewardElementInfoCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestStOktDrawDetailResponse[] newArray(int i) {
            return new InvestStOktDrawDetailResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestStOktDrawDetailResponse() {
        this((InvestUserRewardElementInfo) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestStOktDrawDetailResponse copy$default(InvestStOktDrawDetailResponse investStOktDrawDetailResponse, InvestUserRewardElementInfo investUserRewardElementInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            investUserRewardElementInfo = investStOktDrawDetailResponse.rewardElementInfo;
        }
        if ((i & 2) != 0) {
            list = investStOktDrawDetailResponse.stOktDrawDetailList;
        }
        return investStOktDrawDetailResponse.copy(investUserRewardElementInfo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardElementInfo component1() {
        return this.rewardElementInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<STOKTDrawDetailItemInfo> component2() {
        return this.stOktDrawDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestStOktDrawDetailResponse copy(InvestUserRewardElementInfo investUserRewardElementInfo, @NotNull List<STOKTDrawDetailItemInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestStOktDrawDetailResponse(investUserRewardElementInfo, list);
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
        if (!(obj instanceof InvestStOktDrawDetailResponse)) {
            return false;
        }
        InvestStOktDrawDetailResponse investStOktDrawDetailResponse = (InvestStOktDrawDetailResponse) obj;
        return Intrinsics.EZpvd(this.rewardElementInfo, investStOktDrawDetailResponse.rewardElementInfo) && Intrinsics.EZpvd(this.stOktDrawDetailList, investStOktDrawDetailResponse.stOktDrawDetailList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardElementInfo getRewardElementInfo() {
        return this.rewardElementInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<STOKTDrawDetailItemInfo> getStOktDrawDetailList() {
        return this.stOktDrawDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestUserRewardElementInfo investUserRewardElementInfo = this.rewardElementInfo;
        return ((investUserRewardElementInfo == null ? 0 : investUserRewardElementInfo.hashCode()) * 31) + this.stOktDrawDetailList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestStOktDrawDetailResponse(rewardElementInfo=" + this.rewardElementInfo + ", stOktDrawDetailList=" + this.stOktDrawDetailList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestUserRewardElementInfo investUserRewardElementInfo = this.rewardElementInfo;
        if (investUserRewardElementInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUserRewardElementInfo.writeToParcel(parcel, i);
        }
        List<STOKTDrawDetailItemInfo> list = this.stOktDrawDetailList;
        parcel.writeInt(list.size());
        Iterator<STOKTDrawDetailItemInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestStOktDrawDetailResponse> serializer() {
            return InvestStOktDrawDetailResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestStOktDrawDetailResponse(int i, InvestUserRewardElementInfo investUserRewardElementInfo, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.rewardElementInfo = (i & 1) == 0 ? null : investUserRewardElementInfo;
        if ((i & 2) == 0) {
            this.stOktDrawDetailList = yDY.AhwBna();
        } else {
            this.stOktDrawDetailList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestStOktDrawDetailResponse investStOktDrawDetailResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investStOktDrawDetailResponse.rewardElementInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestUserRewardElementInfo$$serializer.INSTANCE, investStOktDrawDetailResponse.rewardElementInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(investStOktDrawDetailResponse.stOktDrawDetailList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investStOktDrawDetailResponse.stOktDrawDetailList);
    }

    public InvestStOktDrawDetailResponse(InvestUserRewardElementInfo investUserRewardElementInfo, @NotNull List<STOKTDrawDetailItemInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rewardElementInfo = investUserRewardElementInfo;
        this.stOktDrawDetailList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo) : (r1v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:304)) : (r2v0 java.util.List))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo, java.util.List<com.okinc.business.invest_biz.data.bean.STOKTDrawDetailItemInfo>):void (m)] (LINE:302) call: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse.<init>(com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo, java.util.List):void type: THIS */
    public /* synthetic */ InvestStOktDrawDetailResponse(InvestUserRewardElementInfo investUserRewardElementInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investUserRewardElementInfo, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
