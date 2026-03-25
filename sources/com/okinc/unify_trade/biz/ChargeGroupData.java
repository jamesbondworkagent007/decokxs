package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
public final class ChargeGroupData implements Parcelable {
    private final String displayName;
    private final String displayTradeReceiveBanner;
    private final String id;
    private final String key;
    private final String name;
    private final ArrayList<String> types;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChargeGroupData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<ChargeGroupData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChargeGroupData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChargeGroupData(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChargeGroupData[] newArray(int i) {
            return new ChargeGroupData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChargeGroupData() {
        this((String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.ChargeGroupData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChargeGroupData copy$default(ChargeGroupData chargeGroupData, String str, String str2, ArrayList arrayList, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chargeGroupData.id;
        }
        if ((i & 2) != 0) {
            str2 = chargeGroupData.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            arrayList = chargeGroupData.types;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            str3 = chargeGroupData.key;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = chargeGroupData.displayName;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = chargeGroupData.displayTradeReceiveBanner;
        }
        return chargeGroupData.copy(str, str6, arrayList2, str7, str8, str5);
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
    public final ArrayList<String> component3() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.displayTradeReceiveBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupData copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ChargeGroupData(str, str2, arrayList, str3, str4, str5);
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
        if (!(obj instanceof ChargeGroupData)) {
            return false;
        }
        ChargeGroupData chargeGroupData = (ChargeGroupData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) chargeGroupData.id) && Intrinsics.EZpvd((Object) this.name, (Object) chargeGroupData.name) && Intrinsics.EZpvd(this.types, chargeGroupData.types) && Intrinsics.EZpvd((Object) this.key, (Object) chargeGroupData.key) && Intrinsics.EZpvd((Object) this.displayName, (Object) chargeGroupData.displayName) && Intrinsics.EZpvd((Object) this.displayTradeReceiveBanner, (Object) chargeGroupData.displayTradeReceiveBanner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayTradeReceiveBanner() {
        return this.displayTradeReceiveBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.types.hashCode()) * 31) + this.key.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.displayTradeReceiveBanner.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChargeGroupData(id=" + this.id + ", name=" + this.name + ", types=" + this.types + ", key=" + this.key + ", displayName=" + this.displayName + ", displayTradeReceiveBanner=" + this.displayTradeReceiveBanner + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeStringList(this.types);
        parcel.writeString(this.key);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayTradeReceiveBanner);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ChargeGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChargeGroupData> serializer() {
            return ChargeGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChargeGroupData(int i, String str, String str2, ArrayList arrayList, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.types = new ArrayList<>();
        } else {
            this.types = arrayList;
        }
        if ((i & 8) == 0) {
            this.key = "";
        } else {
            this.key = str3;
        }
        if ((i & 16) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str4;
        }
        if ((i & 32) == 0) {
            this.displayTradeReceiveBanner = "";
        } else {
            this.displayTradeReceiveBanner = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ChargeGroupData chargeGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) chargeGroupData.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, chargeGroupData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chargeGroupData.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chargeGroupData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(chargeGroupData.types, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], chargeGroupData.types);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chargeGroupData.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chargeGroupData.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chargeGroupData.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chargeGroupData.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) chargeGroupData.displayTradeReceiveBanner, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, chargeGroupData.displayTradeReceiveBanner);
    }

    public ChargeGroupData(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.name = str2;
        this.types = arrayList;
        this.key = str3;
        this.displayName = str4;
        this.displayTradeReceiveBanner = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.ArrayList:0x0019: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:55) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.unify_trade.biz.ChargeGroupData.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChargeGroupData(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
