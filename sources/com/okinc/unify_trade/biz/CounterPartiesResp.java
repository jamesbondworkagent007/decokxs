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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CounterPartiesResp implements Parcelable {
    private final String traderCode;
    private final String traderName;
    private final ArrayList<String> types;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CounterPartiesResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CounterPartiesResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CounterPartiesResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CounterPartiesResp(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CounterPartiesResp[] newArray(int i) {
            return new CounterPartiesResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CounterPartiesResp() {
        this((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.CounterPartiesResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CounterPartiesResp copy$default(CounterPartiesResp counterPartiesResp, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = counterPartiesResp.traderName;
        }
        if ((i & 2) != 0) {
            str2 = counterPartiesResp.traderCode;
        }
        if ((i & 4) != 0) {
            arrayList = counterPartiesResp.types;
        }
        return counterPartiesResp.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.traderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.traderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CounterPartiesResp copy(String str, String str2, ArrayList<String> arrayList) {
        return new CounterPartiesResp(str, str2, arrayList);
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
        if (!(obj instanceof CounterPartiesResp)) {
            return false;
        }
        CounterPartiesResp counterPartiesResp = (CounterPartiesResp) obj;
        return Intrinsics.EZpvd((Object) this.traderName, (Object) counterPartiesResp.traderName) && Intrinsics.EZpvd((Object) this.traderCode, (Object) counterPartiesResp.traderCode) && Intrinsics.EZpvd(this.types, counterPartiesResp.types);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderCode() {
        return this.traderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderName() {
        return this.traderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.traderName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.traderCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        ArrayList<String> arrayList = this.types;
        return (((iHashCode * 31) + iHashCode2) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CounterPartiesResp(traderName=" + this.traderName + ", traderCode=" + this.traderCode + ", types=" + this.types + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.traderName);
        parcel.writeString(this.traderCode);
        parcel.writeStringList(this.types);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CounterPartiesResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CounterPartiesResp> serializer() {
            return CounterPartiesResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CounterPartiesResp(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.traderName = null;
        } else {
            this.traderName = str;
        }
        if ((i & 2) == 0) {
            this.traderCode = null;
        } else {
            this.traderCode = str2;
        }
        if ((i & 4) == 0) {
            this.types = null;
        } else {
            this.types = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CounterPartiesResp counterPartiesResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || counterPartiesResp.traderName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, counterPartiesResp.traderName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || counterPartiesResp.traderCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, counterPartiesResp.traderCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && counterPartiesResp.types == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], counterPartiesResp.types);
    }

    public CounterPartiesResp(String str, String str2, ArrayList<String> arrayList) {
        this.traderName = str;
        this.traderCode = str2;
        this.types = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>):void (m)] (LINE:5306) call: com.okinc.unify_trade.biz.CounterPartiesResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ CounterPartiesResp(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arrayList);
    }
}
