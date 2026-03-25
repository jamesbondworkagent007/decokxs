package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AutoEarnStakingQueryConfig implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<AutoEarnStakingConfig> autoEarn;
    private final List<AutoEarnStakingConfig> autoStaking;
    private final String vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoEarnStakingQueryConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoEarnStakingQueryConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingQueryConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AutoEarnStakingQueryConfig.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(AutoEarnStakingQueryConfig.class.getClassLoader()));
                }
            }
            return new AutoEarnStakingQueryConfig(arrayList, arrayList2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingQueryConfig[] newArray(int i) {
            return new AutoEarnStakingQueryConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnStakingQueryConfig() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoEarnStakingQueryConfig copy$default(AutoEarnStakingQueryConfig autoEarnStakingQueryConfig, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = autoEarnStakingQueryConfig.autoEarn;
        }
        if ((i & 2) != 0) {
            list2 = autoEarnStakingQueryConfig.autoStaking;
        }
        if ((i & 4) != 0) {
            str = autoEarnStakingQueryConfig.vipLevel;
        }
        return autoEarnStakingQueryConfig.copy(list, list2, str);
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
    public final String component3() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingQueryConfig copy(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str) {
        return new AutoEarnStakingQueryConfig(list, list2, str);
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
        if (!(obj instanceof AutoEarnStakingQueryConfig)) {
            return false;
        }
        AutoEarnStakingQueryConfig autoEarnStakingQueryConfig = (AutoEarnStakingQueryConfig) obj;
        return Intrinsics.EZpvd(this.autoEarn, autoEarnStakingQueryConfig.autoEarn) && Intrinsics.EZpvd(this.autoStaking, autoEarnStakingQueryConfig.autoStaking) && Intrinsics.EZpvd((Object) this.vipLevel, (Object) autoEarnStakingQueryConfig.vipLevel);
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
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AutoEarnStakingConfig> list = this.autoEarn;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.vipLevel;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnStakingQueryConfig(autoEarn=" + this.autoEarn + ", autoStaking=" + this.autoStaking + ", vipLevel=" + this.vipLevel + ")";
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
                parcel.writeParcelable(it.next(), i);
            }
        }
        List<AutoEarnStakingConfig> list2 = this.autoStaking;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AutoEarnStakingConfig> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.vipLevel);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnStakingQueryConfig> serializer() {
            return AutoEarnStakingQueryConfig$$serializer.INSTANCE;
        }
    }

    static {
        AutoEarnStakingConfig$$serializer autoEarnStakingConfig$$serializer = AutoEarnStakingConfig$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(autoEarnStakingConfig$$serializer), new ArrayListSerializer(autoEarnStakingConfig$$serializer), null};
    }

    public /* synthetic */ AutoEarnStakingQueryConfig(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 4) == 0) {
            this.vipLevel = null;
        } else {
            this.vipLevel = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AutoEarnStakingQueryConfig autoEarnStakingQueryConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoEarnStakingQueryConfig.autoEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], autoEarnStakingQueryConfig.autoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoEarnStakingQueryConfig.autoStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], autoEarnStakingQueryConfig.autoStaking);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && autoEarnStakingQueryConfig.vipLevel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, autoEarnStakingQueryConfig.vipLevel);
    }

    public AutoEarnStakingQueryConfig(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str) {
        this.autoEarn = list;
        this.autoStaking = list2;
        this.vipLevel = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>, java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>, java.lang.String):void (m)] (LINE:62) call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AutoEarnStakingQueryConfig(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
