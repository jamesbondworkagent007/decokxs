package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig$$serializer;
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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartPortfolioConfig implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<AutoEarnStakingConfig> autoEarn;
    private final List<AutoEarnStakingConfig> autoStaking;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartPortfolioConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartPortfolioConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartPortfolioConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                }
            }
            return new SmartPortfolioConfig(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartPortfolioConfig[] newArray(int i) {
            return new SmartPortfolioConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartPortfolioConfig() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SmartPortfolioConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartPortfolioConfig copy$default(SmartPortfolioConfig smartPortfolioConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = smartPortfolioConfig.autoEarn;
        }
        if ((i & 2) != 0) {
            list2 = smartPortfolioConfig.autoStaking;
        }
        return smartPortfolioConfig.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component1() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component2() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioConfig copy(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2) {
        return new SmartPortfolioConfig(list, list2);
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
        if (!(obj instanceof SmartPortfolioConfig)) {
            return false;
        }
        SmartPortfolioConfig smartPortfolioConfig = (SmartPortfolioConfig) obj;
        return Intrinsics.EZpvd(this.autoEarn, smartPortfolioConfig.autoEarn) && Intrinsics.EZpvd(this.autoStaking, smartPortfolioConfig.autoStaking);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoEarn() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoStaking() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AutoEarnStakingConfig> list = this.autoEarn;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartPortfolioConfig(autoEarn=" + this.autoEarn + ", autoStaking=" + this.autoStaking + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<AutoEarnStakingConfig> list = this.autoEarn;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AutoEarnStakingConfig> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<AutoEarnStakingConfig> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartPortfolioConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartPortfolioConfig> serializer() {
            return SmartPortfolioConfig$$serializer.INSTANCE;
        }
    }

    static {
        AutoEarnStakingConfig$$serializer autoEarnStakingConfig$$serializer = AutoEarnStakingConfig$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(autoEarnStakingConfig$$serializer), new ArrayListSerializer(autoEarnStakingConfig$$serializer)};
    }

    public /* synthetic */ SmartPortfolioConfig(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoEarn = null;
        } else {
            this.autoEarn = list;
        }
        if ((i & 2) == 0) {
            this.autoStaking = null;
        } else {
            this.autoStaking = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartPortfolioConfig smartPortfolioConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartPortfolioConfig.autoEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], smartPortfolioConfig.autoEarn);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && smartPortfolioConfig.autoStaking == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], smartPortfolioConfig.autoStaking);
    }

    public SmartPortfolioConfig(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2) {
        this.autoEarn = list;
        this.autoStaking = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>, java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>):void (m)] (LINE:2202) call: com.okinc.unify_trade.biz.SmartPortfolioConfig.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SmartPortfolioConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
