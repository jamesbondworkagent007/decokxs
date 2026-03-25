package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CollateralCoinConfig implements Parcelable {
    private final List<String> ccyList;
    private final Boolean collateralEnabled;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollateralCoinConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CollateralCoinConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralCoinConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CollateralCoinConfig(string, arrayListCreateStringArrayList, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralCoinConfig[] newArray(int i) {
            return new CollateralCoinConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CollateralCoinConfig() {
        this((String) null, (List) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.CollateralCoinConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollateralCoinConfig copy$default(CollateralCoinConfig collateralCoinConfig, String str, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collateralCoinConfig.type;
        }
        if ((i & 2) != 0) {
            list = collateralCoinConfig.ccyList;
        }
        if ((i & 4) != 0) {
            bool = collateralCoinConfig.collateralEnabled;
        }
        return collateralCoinConfig.copy(str, list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.ccyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralCoinConfig copy(@NotNull String str, List<String> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CollateralCoinConfig(str, list, bool);
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
        if (!(obj instanceof CollateralCoinConfig)) {
            return false;
        }
        CollateralCoinConfig collateralCoinConfig = (CollateralCoinConfig) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) collateralCoinConfig.type) && Intrinsics.EZpvd(this.ccyList, collateralCoinConfig.ccyList) && Intrinsics.EZpvd(this.collateralEnabled, collateralCoinConfig.collateralEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCcyList() {
        return this.ccyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCollateralEnabled() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        List<String> list = this.ccyList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Boolean bool = this.collateralEnabled;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CollateralCoinConfig(type=" + this.type + ", ccyList=" + this.ccyList + ", collateralEnabled=" + this.collateralEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeStringList(this.ccyList);
        Boolean bool = this.collateralEnabled;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CollateralCoinConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CollateralCoinConfig> serializer() {
            return CollateralCoinConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CollateralCoinConfig(int i, String str, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.ccyList = null;
        } else {
            this.ccyList = list;
        }
        if ((i & 4) == 0) {
            this.collateralEnabled = null;
        } else {
            this.collateralEnabled = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CollateralCoinConfig collateralCoinConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) collateralCoinConfig.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, collateralCoinConfig.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || collateralCoinConfig.ccyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], collateralCoinConfig.ccyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && collateralCoinConfig.collateralEnabled == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, collateralCoinConfig.collateralEnabled);
    }

    public CollateralCoinConfig(@NotNull String str, List<String> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.ccyList = list;
        this.collateralEnabled = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean):void (m)] (LINE:4992) call: com.okinc.unify_trade.biz.CollateralCoinConfig.<init>(java.lang.String, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ CollateralCoinConfig(String str, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool);
    }
}
