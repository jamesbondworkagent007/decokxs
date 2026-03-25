package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NetworkFeeInfo implements Parcelable {
    private final String max;
    private final List<PriorityFee> mev;
    private final String min;
    private final PriorityFee normal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NetworkFeeInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PriorityFee$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<NetworkFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFeeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            PriorityFee priorityFeeCreateFromParcel = parcel.readInt() == 0 ? null : PriorityFee.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(PriorityFee.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new NetworkFeeInfo(priorityFeeCreateFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFeeInfo[] newArray(int i) {
            return new NetworkFeeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkFeeInfo() {
        this((PriorityFee) null, (List) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkFeeInfo copy$default(NetworkFeeInfo networkFeeInfo, PriorityFee priorityFee, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            priorityFee = networkFeeInfo.normal;
        }
        if ((i & 2) != 0) {
            list = networkFeeInfo.mev;
        }
        if ((i & 4) != 0) {
            str = networkFeeInfo.min;
        }
        if ((i & 8) != 0) {
            str2 = networkFeeInfo.max;
        }
        return networkFeeInfo.copy(priorityFee, list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFee component1() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriorityFee> component2() {
        return this.mev;
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
    public final NetworkFeeInfo copy(PriorityFee priorityFee, List<PriorityFee> list, String str, String str2) {
        return new NetworkFeeInfo(priorityFee, list, str, str2);
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
        if (!(obj instanceof NetworkFeeInfo)) {
            return false;
        }
        NetworkFeeInfo networkFeeInfo = (NetworkFeeInfo) obj;
        return Intrinsics.EZpvd(this.normal, networkFeeInfo.normal) && Intrinsics.EZpvd(this.mev, networkFeeInfo.mev) && Intrinsics.EZpvd((Object) this.min, (Object) networkFeeInfo.min) && Intrinsics.EZpvd((Object) this.max, (Object) networkFeeInfo.max);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriorityFee> getMev() {
        return this.mev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFee getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PriorityFee priorityFee = this.normal;
        int iHashCode = priorityFee == null ? 0 : priorityFee.hashCode();
        List<PriorityFee> list = this.mev;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.min;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.max;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkFeeInfo(normal=" + this.normal + ", mev=" + this.mev + ", min=" + this.min + ", max=" + this.max + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PriorityFee priorityFee = this.normal;
        if (priorityFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priorityFee.writeToParcel(parcel, i);
        }
        List<PriorityFee> list = this.mev;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PriorityFee> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.min);
        parcel.writeString(this.max);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkFeeInfo> serializer() {
            return NetworkFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkFeeInfo(int i, PriorityFee priorityFee, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.normal = null;
        } else {
            this.normal = priorityFee;
        }
        if ((i & 2) == 0) {
            this.mev = null;
        } else {
            this.mev = list;
        }
        if ((i & 4) == 0) {
            this.min = null;
        } else {
            this.min = str;
        }
        if ((i & 8) == 0) {
            this.max = null;
        } else {
            this.max = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NetworkFeeInfo networkFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || networkFeeInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PriorityFee$$serializer.INSTANCE, networkFeeInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || networkFeeInfo.mev != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], networkFeeInfo.mev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || networkFeeInfo.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, networkFeeInfo.min);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && networkFeeInfo.max == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, networkFeeInfo.max);
    }

    public NetworkFeeInfo(PriorityFee priorityFee, List<PriorityFee> list, String str, String str2) {
        this.normal = priorityFee;
        this.mev = list;
        this.min = str;
        this.max = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.core.domain.model.PriorityFee:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.PriorityFee) : (r2v0 com.okinc.business.dex.trade.core.domain.model.PriorityFee))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.core.domain.model.PriorityFee, java.util.List<com.okinc.business.dex.trade.core.domain.model.PriorityFee>, java.lang.String, java.lang.String):void (m)] (LINE:287) call: com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo.<init>(com.okinc.business.dex.trade.core.domain.model.PriorityFee, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkFeeInfo(PriorityFee priorityFee, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : priorityFee, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final PriorityFee getDefaultMev() {
        Object next;
        List<PriorityFee> list = this.mev;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(((PriorityFee) next).isDefault(), Boolean.TRUE)) {
                    break;
                }
            }
            PriorityFee priorityFee = (PriorityFee) next;
            if (priorityFee != null) {
                return priorityFee;
            }
        }
        List<PriorityFee> list2 = this.mev;
        if (list2 != null) {
            return (PriorityFee) CollectionsKt___CollectionsKt.firstOrNull(list2);
        }
        return null;
    }
}
