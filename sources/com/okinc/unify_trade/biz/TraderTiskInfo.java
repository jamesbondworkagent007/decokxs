package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TraderTiskInfo implements Parcelable {
    private final List<String> ccy;
    private final String name;
    private final String remindDaily;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TraderTiskInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TraderTiskInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TraderTiskInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TraderTiskInfo(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TraderTiskInfo[] newArray(int i) {
            return new TraderTiskInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TraderTiskInfo() {
        this((String) null, (List) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TraderTiskInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraderTiskInfo copy$default(TraderTiskInfo traderTiskInfo, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traderTiskInfo.value;
        }
        if ((i & 2) != 0) {
            list = traderTiskInfo.ccy;
        }
        if ((i & 4) != 0) {
            str2 = traderTiskInfo.name;
        }
        if ((i & 8) != 0) {
            str3 = traderTiskInfo.remindDaily;
        }
        return traderTiskInfo.copy(str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.remindDaily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraderTiskInfo copy(String str, List<String> list, String str2, String str3) {
        return new TraderTiskInfo(str, list, str2, str3);
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
        if (!(obj instanceof TraderTiskInfo)) {
            return false;
        }
        TraderTiskInfo traderTiskInfo = (TraderTiskInfo) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) traderTiskInfo.value) && Intrinsics.EZpvd(this.ccy, traderTiskInfo.ccy) && Intrinsics.EZpvd((Object) this.name, (Object) traderTiskInfo.name) && Intrinsics.EZpvd((Object) this.remindDaily, (Object) traderTiskInfo.remindDaily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemindDaily() {
        return this.remindDaily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.value;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.ccy;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.remindDaily;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TraderTiskInfo(value=" + this.value + ", ccy=" + this.ccy + ", name=" + this.name + ", remindDaily=" + this.remindDaily + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeStringList(this.ccy);
        parcel.writeString(this.name);
        parcel.writeString(this.remindDaily);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TraderTiskInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TraderTiskInfo> serializer() {
            return TraderTiskInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraderTiskInfo(int i, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
        if ((i & 2) == 0) {
            this.ccy = null;
        } else {
            this.ccy = list;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 8) == 0) {
            this.remindDaily = null;
        } else {
            this.remindDaily = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TraderTiskInfo traderTiskInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || traderTiskInfo.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, traderTiskInfo.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || traderTiskInfo.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], traderTiskInfo.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || traderTiskInfo.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, traderTiskInfo.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && traderTiskInfo.remindDaily == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, traderTiskInfo.remindDaily);
    }

    public TraderTiskInfo(String str, List<String> list, String str2, String str3) {
        this.value = str;
        this.ccy = list;
        this.name = str2;
        this.remindDaily = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:3480) call: com.okinc.unify_trade.biz.TraderTiskInfo.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TraderTiskInfo(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
