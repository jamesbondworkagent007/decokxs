package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TokenHolderResponseData implements Parcelable {
    private final List<HolderRankingResponseData> holderRankingList;
    private final HolderOwnedResponseData ownedVO;
    private final HolderSummaryResponseData summaryVO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenHolderResponseData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HolderRankingResponseData$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<TokenHolderResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenHolderResponseData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(HolderRankingResponseData.CREATOR.createFromParcel(parcel));
                }
            }
            return new TokenHolderResponseData(arrayList, parcel.readInt() != 0 ? HolderSummaryResponseData.CREATOR.createFromParcel(parcel) : null, HolderOwnedResponseData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenHolderResponseData[] newArray(int i) {
            return new TokenHolderResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenHolderResponseData() {
        this((List) null, (HolderSummaryResponseData) null, (HolderOwnedResponseData) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.data.model.market.TokenHolderResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenHolderResponseData copy$default(TokenHolderResponseData tokenHolderResponseData, List list, HolderSummaryResponseData holderSummaryResponseData, HolderOwnedResponseData holderOwnedResponseData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokenHolderResponseData.holderRankingList;
        }
        if ((i & 2) != 0) {
            holderSummaryResponseData = tokenHolderResponseData.summaryVO;
        }
        if ((i & 4) != 0) {
            holderOwnedResponseData = tokenHolderResponseData.ownedVO;
        }
        return tokenHolderResponseData.copy(list, holderSummaryResponseData, holderOwnedResponseData);
    }

    @SerialName("holderRankingList")
    public static /* synthetic */ void getHolderRankingList$annotations() {
    }

    @SerialName("ownedVO")
    public static /* synthetic */ void getOwnedVO$annotations() {
    }

    @SerialName("summaryVO")
    public static /* synthetic */ void getSummaryVO$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderRankingResponseData> component1() {
        return this.holderRankingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderSummaryResponseData component2() {
        return this.summaryVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderOwnedResponseData component3() {
        return this.ownedVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenHolderResponseData copy(List<HolderRankingResponseData> list, HolderSummaryResponseData holderSummaryResponseData, @NotNull HolderOwnedResponseData holderOwnedResponseData) {
        Intrinsics.checkNotNullParameter(holderOwnedResponseData, "");
        return new TokenHolderResponseData(list, holderSummaryResponseData, holderOwnedResponseData);
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
        if (!(obj instanceof TokenHolderResponseData)) {
            return false;
        }
        TokenHolderResponseData tokenHolderResponseData = (TokenHolderResponseData) obj;
        return Intrinsics.EZpvd(this.holderRankingList, tokenHolderResponseData.holderRankingList) && Intrinsics.EZpvd(this.summaryVO, tokenHolderResponseData.summaryVO) && Intrinsics.EZpvd(this.ownedVO, tokenHolderResponseData.ownedVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderRankingResponseData> getHolderRankingList() {
        return this.holderRankingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderOwnedResponseData getOwnedVO() {
        return this.ownedVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderSummaryResponseData getSummaryVO() {
        return this.summaryVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<HolderRankingResponseData> list = this.holderRankingList;
        int iHashCode = list == null ? 0 : list.hashCode();
        HolderSummaryResponseData holderSummaryResponseData = this.summaryVO;
        return (((iHashCode * 31) + (holderSummaryResponseData != null ? holderSummaryResponseData.hashCode() : 0)) * 31) + this.ownedVO.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenHolderResponseData(holderRankingList=" + this.holderRankingList + ", summaryVO=" + this.summaryVO + ", ownedVO=" + this.ownedVO + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<HolderRankingResponseData> list = this.holderRankingList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<HolderRankingResponseData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        HolderSummaryResponseData holderSummaryResponseData = this.summaryVO;
        if (holderSummaryResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            holderSummaryResponseData.writeToParcel(parcel, i);
        }
        this.ownedVO.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.TokenHolderResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenHolderResponseData> serializer() {
            return TokenHolderResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenHolderResponseData(int i, List list, HolderSummaryResponseData holderSummaryResponseData, HolderOwnedResponseData holderOwnedResponseData, SerializationConstructorMarker serializationConstructorMarker) {
        this.holderRankingList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.summaryVO = null;
        } else {
            this.summaryVO = holderSummaryResponseData;
        }
        if ((i & 4) == 0) {
            this.ownedVO = new HolderOwnedResponseData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.ownedVO = holderOwnedResponseData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenHolderResponseData tokenHolderResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tokenHolderResponseData.holderRankingList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tokenHolderResponseData.holderRankingList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenHolderResponseData.summaryVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, HolderSummaryResponseData$$serializer.INSTANCE, tokenHolderResponseData.summaryVO);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(tokenHolderResponseData.ownedVO, new HolderOwnedResponseData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, HolderOwnedResponseData$$serializer.INSTANCE, tokenHolderResponseData.ownedVO);
    }

    public TokenHolderResponseData(List<HolderRankingResponseData> list, HolderSummaryResponseData holderSummaryResponseData, @NotNull HolderOwnedResponseData holderOwnedResponseData) {
        Intrinsics.checkNotNullParameter(holderOwnedResponseData, "");
        this.holderRankingList = list;
        this.summaryVO = holderSummaryResponseData;
        this.ownedVO = holderOwnedResponseData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r7v0 java.util.List))
  (wrap:com.okinc.business.data.model.market.HolderSummaryResponseData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.data.model.market.HolderSummaryResponseData) : (r8v0 com.okinc.business.data.model.market.HolderSummaryResponseData))
  (wrap:com.okinc.business.data.model.market.HolderOwnedResponseData:?: TERNARY null = ((wrap:int:0x000d: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.data.model.market.HolderOwnedResponseData:0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:24) call: com.okinc.business.data.model.market.HolderOwnedResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.data.model.market.HolderOwnedResponseData))
 A[MD:(java.util.List<com.okinc.business.data.model.market.HolderRankingResponseData>, com.okinc.business.data.model.market.HolderSummaryResponseData, com.okinc.business.data.model.market.HolderOwnedResponseData):void (m)] (LINE:18) call: com.okinc.business.data.model.market.TokenHolderResponseData.<init>(java.util.List, com.okinc.business.data.model.market.HolderSummaryResponseData, com.okinc.business.data.model.market.HolderOwnedResponseData):void type: THIS */
    public /* synthetic */ TokenHolderResponseData(List list, HolderSummaryResponseData holderSummaryResponseData, HolderOwnedResponseData holderOwnedResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : holderSummaryResponseData, (i & 4) != 0 ? new HolderOwnedResponseData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : holderOwnedResponseData);
    }
}
