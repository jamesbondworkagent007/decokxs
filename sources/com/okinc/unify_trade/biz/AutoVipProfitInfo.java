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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AutoVipProfitInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<AutoEarnStakingConfig> autoEarn;
    private final List<AutoEarnStakingConfig> autoStake;
    private final boolean isFromOrderPage;
    private final boolean isManualPage;
    private final String vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoVipProfitInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoVipProfitInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoVipProfitInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AutoEarnStakingConfig.CREATOR.createFromParcel(parcel));
                }
            }
            return new AutoVipProfitInfo(arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoVipProfitInfo[] newArray(int i) {
            return new AutoVipProfitInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoVipProfitInfo() {
        this((List) null, (List) null, (String) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.AutoVipProfitInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoVipProfitInfo copy$default(AutoVipProfitInfo autoVipProfitInfo, List list, List list2, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = autoVipProfitInfo.autoEarn;
        }
        if ((i & 2) != 0) {
            list2 = autoVipProfitInfo.autoStake;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = autoVipProfitInfo.vipLevel;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = autoVipProfitInfo.isManualPage;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = autoVipProfitInfo.isFromOrderPage;
        }
        return autoVipProfitInfo.copy(list, list3, str2, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component1() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> component2() {
        return this.autoStake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isManualPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isFromOrderPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo copy(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str, boolean z, boolean z2) {
        return new AutoVipProfitInfo(list, list2, str, z, z2);
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
        if (!(obj instanceof AutoVipProfitInfo)) {
            return false;
        }
        AutoVipProfitInfo autoVipProfitInfo = (AutoVipProfitInfo) obj;
        return Intrinsics.EZpvd(this.autoEarn, autoVipProfitInfo.autoEarn) && Intrinsics.EZpvd(this.autoStake, autoVipProfitInfo.autoStake) && Intrinsics.EZpvd((Object) this.vipLevel, (Object) autoVipProfitInfo.vipLevel) && this.isManualPage == autoVipProfitInfo.isManualPage && this.isFromOrderPage == autoVipProfitInfo.isFromOrderPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoEarn() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingConfig> getAutoStake() {
        return this.autoStake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AutoEarnStakingConfig> list = this.autoEarn;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<AutoEarnStakingConfig> list2 = this.autoStake;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.vipLevel;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isManualPage)) * 31) + Boolean.hashCode(this.isFromOrderPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromOrderPage() {
        return this.isFromOrderPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isManualPage() {
        return this.isManualPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoVipProfitInfo(autoEarn=" + this.autoEarn + ", autoStake=" + this.autoStake + ", vipLevel=" + this.vipLevel + ", isManualPage=" + this.isManualPage + ", isFromOrderPage=" + this.isFromOrderPage + ")";
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
        List<AutoEarnStakingConfig> list2 = this.autoStake;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AutoEarnStakingConfig> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.vipLevel);
        parcel.writeInt(this.isManualPage ? 1 : 0);
        parcel.writeInt(this.isFromOrderPage ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AutoVipProfitInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoVipProfitInfo> serializer() {
            return AutoVipProfitInfo$$serializer.INSTANCE;
        }
    }

    static {
        AutoEarnStakingConfig$$serializer autoEarnStakingConfig$$serializer = AutoEarnStakingConfig$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(autoEarnStakingConfig$$serializer), new ArrayListSerializer(autoEarnStakingConfig$$serializer), null, null, null};
    }

    public /* synthetic */ AutoVipProfitInfo(int i, List list, List list2, String str, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoEarn = null;
        } else {
            this.autoEarn = list;
        }
        if ((i & 2) == 0) {
            this.autoStake = null;
        } else {
            this.autoStake = list2;
        }
        if ((i & 4) == 0) {
            this.vipLevel = null;
        } else {
            this.vipLevel = str;
        }
        if ((i & 8) == 0) {
            this.isManualPage = false;
        } else {
            this.isManualPage = z;
        }
        if ((i & 16) == 0) {
            this.isFromOrderPage = false;
        } else {
            this.isFromOrderPage = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AutoVipProfitInfo autoVipProfitInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoVipProfitInfo.autoEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], autoVipProfitInfo.autoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoVipProfitInfo.autoStake != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], autoVipProfitInfo.autoStake);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoVipProfitInfo.vipLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, autoVipProfitInfo.vipLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || autoVipProfitInfo.isManualPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, autoVipProfitInfo.isManualPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || autoVipProfitInfo.isFromOrderPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, autoVipProfitInfo.isFromOrderPage);
        }
    }

    public AutoVipProfitInfo(List<AutoEarnStakingConfig> list, List<AutoEarnStakingConfig> list2, String str, boolean z, boolean z2) {
        this.autoEarn = list;
        this.autoStake = list2;
        this.vipLevel = str;
        this.isManualPage = z;
        this.isFromOrderPage = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>, java.util.List<com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig>, java.lang.String, boolean, boolean):void (m)] (LINE:644) call: com.okinc.unify_trade.biz.AutoVipProfitInfo.<init>(java.util.List, java.util.List, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ AutoVipProfitInfo(List list, List list2, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) == 0 ? str : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
