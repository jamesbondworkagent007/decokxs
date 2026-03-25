package com.okinc.business.dex.trade.swap.priorityfee.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo$$serializer;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SwapPriorityFeeInfo implements Parcelable {
    private final String max;
    private final List<MevInfoBean> mev;
    private final String min;
    private final NonMevPriorityFeeInfo normal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SwapPriorityFeeInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(MevInfoBean$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<SwapPriorityFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapPriorityFeeInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MevInfoBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new SwapPriorityFeeInfo(arrayList, parcel.readInt() != 0 ? NonMevPriorityFeeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapPriorityFeeInfo[] newArray(int i) {
            return new SwapPriorityFeeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapPriorityFeeInfo() {
        this((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwapPriorityFeeInfo copy$default(SwapPriorityFeeInfo swapPriorityFeeInfo, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = swapPriorityFeeInfo.mev;
        }
        if ((i & 2) != 0) {
            nonMevPriorityFeeInfo = swapPriorityFeeInfo.normal;
        }
        if ((i & 4) != 0) {
            str = swapPriorityFeeInfo.min;
        }
        if ((i & 8) != 0) {
            str2 = swapPriorityFeeInfo.max;
        }
        return swapPriorityFeeInfo.copy(list, nonMevPriorityFeeInfo, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MevInfoBean> component1() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo component2() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapPriorityFeeInfo copy(List<MevInfoBean> list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SwapPriorityFeeInfo(list, nonMevPriorityFeeInfo, str, str2);
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
        if (!(obj instanceof SwapPriorityFeeInfo)) {
            return false;
        }
        SwapPriorityFeeInfo swapPriorityFeeInfo = (SwapPriorityFeeInfo) obj;
        return Intrinsics.EZpvd(this.mev, swapPriorityFeeInfo.mev) && Intrinsics.EZpvd(this.normal, swapPriorityFeeInfo.normal) && Intrinsics.EZpvd((Object) this.min, (Object) swapPriorityFeeInfo.min) && Intrinsics.EZpvd((Object) this.max, (Object) swapPriorityFeeInfo.max);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MevInfoBean> getMev() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<MevInfoBean> list = this.mev;
        int iHashCode = list == null ? 0 : list.hashCode();
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = this.normal;
        return (((((iHashCode * 31) + (nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.hashCode() : 0)) * 31) + this.min.hashCode()) * 31) + this.max.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapPriorityFeeInfo(mev=" + this.mev + ", normal=" + this.normal + ", min=" + this.min + ", max=" + this.max + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<MevInfoBean> list = this.mev;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MevInfoBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = this.normal;
        if (nonMevPriorityFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nonMevPriorityFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.min);
        parcel.writeString(this.max);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwapPriorityFeeInfo> serializer() {
            return SwapPriorityFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwapPriorityFeeInfo(int i, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mev = null;
        } else {
            this.mev = list;
        }
        if ((i & 2) == 0) {
            this.normal = null;
        } else {
            this.normal = nonMevPriorityFeeInfo;
        }
        if ((i & 4) == 0) {
            this.min = "";
        } else {
            this.min = str;
        }
        if ((i & 8) == 0) {
            this.max = "";
        } else {
            this.max = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SwapPriorityFeeInfo swapPriorityFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || swapPriorityFeeInfo.mev != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], swapPriorityFeeInfo.mev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || swapPriorityFeeInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NonMevPriorityFeeInfo$$serializer.INSTANCE, swapPriorityFeeInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) swapPriorityFeeInfo.min, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, swapPriorityFeeInfo.min);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) swapPriorityFeeInfo.max, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, swapPriorityFeeInfo.max);
    }

    public SwapPriorityFeeInfo(List<MevInfoBean> list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mev = list;
        this.normal = nonMevPriorityFeeInfo;
        this.min = str;
        this.max = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo) : (r3v0 com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.MevInfoBean>, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo.<init>(java.util.List, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SwapPriorityFeeInfo(List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : nonMevPriorityFeeInfo, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
