package com.okinc.tradeapi.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class TradeGroupData implements Parcelable {
    public static final int $stable = 0;
    private final String id;
    private final boolean isHeatTab;
    private final String mark;
    private final String name;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeGroupData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeGroupData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeGroupData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeGroupData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeGroupData[] newArray(int i) {
            return new TradeGroupData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeGroupData() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeGroupData copy$default(TradeGroupData tradeGroupData, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeGroupData.id;
        }
        if ((i & 2) != 0) {
            str2 = tradeGroupData.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = tradeGroupData.type;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = tradeGroupData.mark;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = tradeGroupData.isHeatTab;
        }
        return tradeGroupData.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isHeatTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeGroupData copy(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TradeGroupData(str, str2, str3, str4, z);
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
        if (!(obj instanceof TradeGroupData)) {
            return false;
        }
        TradeGroupData tradeGroupData = (TradeGroupData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) tradeGroupData.id) && Intrinsics.EZpvd((Object) this.name, (Object) tradeGroupData.name) && Intrinsics.EZpvd((Object) this.type, (Object) tradeGroupData.type) && Intrinsics.EZpvd((Object) this.mark, (Object) tradeGroupData.mark) && this.isHeatTab == tradeGroupData.isHeatTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMark() {
        return this.mark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.mark.hashCode()) * 31) + Boolean.hashCode(this.isHeatTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHeatTab() {
        return this.isHeatTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeGroupData(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", mark=" + this.mark + ", isHeatTab=" + this.isHeatTab + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.mark);
        parcel.writeInt(this.isHeatTab ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.TradeGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeGroupData> serializer() {
            return TradeGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeGroupData(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.mark = "";
        } else {
            this.mark = str4;
        }
        if ((i & 16) == 0) {
            this.isHeatTab = false;
        } else {
            this.isHeatTab = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeGroupData tradeGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeGroupData.id, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeGroupData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeGroupData.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeGroupData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeGroupData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeGroupData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeGroupData.mark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeGroupData.mark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeGroupData.isHeatTab) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, tradeGroupData.isHeatTab);
        }
    }

    public TradeGroupData(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.name = str2;
        this.type = str3;
        this.mark = str4;
        this.isHeatTab = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:12) call: com.okinc.tradeapi.bean.TradeGroupData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TradeGroupData(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
    }
}
