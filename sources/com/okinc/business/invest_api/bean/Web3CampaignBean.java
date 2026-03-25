package com.okinc.business.invest_api.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class Web3CampaignBean implements Parcelable {
    public final Long campaignId;
    public final Boolean canClaim;
    public final List<Web3RewardToken> rewardTokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Web3CampaignBean> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Web3RewardToken$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<Web3CampaignBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3CampaignBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Web3RewardToken.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Web3CampaignBean(lValueOf, boolValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3CampaignBean[] newArray(int i) {
            return new Web3CampaignBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3CampaignBean() {
        this((Long) null, (Boolean) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_api.bean.Web3CampaignBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Web3CampaignBean copy$default(Web3CampaignBean web3CampaignBean, Long l, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = web3CampaignBean.campaignId;
        }
        if ((i & 2) != 0) {
            bool = web3CampaignBean.canClaim;
        }
        if ((i & 4) != 0) {
            list = web3CampaignBean.rewardTokens;
        }
        return web3CampaignBean.OLrzqt(l, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean EZpvd() {
        return this.canClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3CampaignBean OLrzqt(Long l, Boolean bool, List<Web3RewardToken> list) {
        return new Web3CampaignBean(l, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Web3RewardToken> OLrzqt() {
        return this.rewardTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long copydefault() {
        return this.campaignId;
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
        if (!(obj instanceof Web3CampaignBean)) {
            return false;
        }
        Web3CampaignBean web3CampaignBean = (Web3CampaignBean) obj;
        return Intrinsics.EZpvd(this.campaignId, web3CampaignBean.campaignId) && Intrinsics.EZpvd(this.canClaim, web3CampaignBean.canClaim) && Intrinsics.EZpvd(this.rewardTokens, web3CampaignBean.rewardTokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.campaignId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Boolean bool = this.canClaim;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        List<Web3RewardToken> list = this.rewardTokens;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3CampaignBean(campaignId=" + this.campaignId + ", canClaim=" + this.canClaim + ", rewardTokens=" + this.rewardTokens + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.campaignId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.canClaim;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Web3RewardToken> list = this.rewardTokens;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Web3RewardToken> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.Web3CampaignBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3CampaignBean> serializer() {
            return Web3CampaignBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3CampaignBean(int i, Long l, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.campaignId = (i & 1) == 0 ? -1L : l;
        if ((i & 2) == 0) {
            this.canClaim = Boolean.FALSE;
        } else {
            this.canClaim = bool;
        }
        if ((i & 4) == 0) {
            this.rewardTokens = yDY.AhwBna();
        } else {
            this.rewardTokens = list;
        }
    }

    public static final /* synthetic */ void KWHzl(Web3CampaignBean web3CampaignBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = web3CampaignBean.campaignId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, web3CampaignBean.campaignId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(web3CampaignBean.canClaim, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, web3CampaignBean.canClaim);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(web3CampaignBean.rewardTokens, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], web3CampaignBean.rewardTokens);
    }

    public Web3CampaignBean(Long l, Boolean bool, List<Web3RewardToken> list) {
        this.campaignId = l;
        this.canClaim = bool;
        this.rewardTokens = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r3v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r5v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.Boolean, java.util.List<com.okinc.business.invest_api.bean.Web3RewardToken>):void (m)] (LINE:18) call: com.okinc.business.invest_api.bean.Web3CampaignBean.<init>(java.lang.Long, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ Web3CampaignBean(Long l, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : l, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
