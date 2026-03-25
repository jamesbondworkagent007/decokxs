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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeCollateralCoinConfig implements Parcelable {
    private final ArrayList<String> enabledCcyList;
    private final String enabledFeature;
    private final String enabledType;
    private final String existConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeCollateralCoinConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<TradeCollateralCoinConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeCollateralCoinConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeCollateralCoinConfig(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeCollateralCoinConfig[] newArray(int i) {
            return new TradeCollateralCoinConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TradeCollateralCoinConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeCollateralCoinConfig copy$default(TradeCollateralCoinConfig tradeCollateralCoinConfig, String str, String str2, ArrayList arrayList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeCollateralCoinConfig.enabledFeature;
        }
        if ((i & 2) != 0) {
            str2 = tradeCollateralCoinConfig.existConfig;
        }
        if ((i & 4) != 0) {
            arrayList = tradeCollateralCoinConfig.enabledCcyList;
        }
        if ((i & 8) != 0) {
            str3 = tradeCollateralCoinConfig.enabledType;
        }
        return tradeCollateralCoinConfig.copy(str, str2, arrayList, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enabledFeature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.existConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.enabledCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.enabledType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeCollateralCoinConfig copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TradeCollateralCoinConfig(str, str2, arrayList, str3);
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
        if (!(obj instanceof TradeCollateralCoinConfig)) {
            return false;
        }
        TradeCollateralCoinConfig tradeCollateralCoinConfig = (TradeCollateralCoinConfig) obj;
        return Intrinsics.EZpvd((Object) this.enabledFeature, (Object) tradeCollateralCoinConfig.enabledFeature) && Intrinsics.EZpvd((Object) this.existConfig, (Object) tradeCollateralCoinConfig.existConfig) && Intrinsics.EZpvd(this.enabledCcyList, tradeCollateralCoinConfig.enabledCcyList) && Intrinsics.EZpvd((Object) this.enabledType, (Object) tradeCollateralCoinConfig.enabledType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getEnabledCcyList() {
        return this.enabledCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnabledFeature() {
        return this.enabledFeature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnabledType() {
        return this.enabledType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistConfig() {
        return this.existConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.enabledFeature.hashCode() * 31) + this.existConfig.hashCode()) * 31) + this.enabledCcyList.hashCode()) * 31) + this.enabledType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeCollateralCoinConfig(enabledFeature=" + this.enabledFeature + ", existConfig=" + this.existConfig + ", enabledCcyList=" + this.enabledCcyList + ", enabledType=" + this.enabledType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.enabledFeature);
        parcel.writeString(this.existConfig);
        parcel.writeStringList(this.enabledCcyList);
        parcel.writeString(this.enabledType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeCollateralCoinConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeCollateralCoinConfig> serializer() {
            return TradeCollateralCoinConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeCollateralCoinConfig(int i, String str, String str2, ArrayList arrayList, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, TradeCollateralCoinConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.enabledFeature = "";
        } else {
            this.enabledFeature = str;
        }
        if ((i & 2) == 0) {
            this.existConfig = "";
        } else {
            this.existConfig = str2;
        }
        this.enabledCcyList = arrayList;
        if ((i & 8) == 0) {
            this.enabledType = "";
        } else {
            this.enabledType = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeCollateralCoinConfig tradeCollateralCoinConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeCollateralCoinConfig.enabledFeature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeCollateralCoinConfig.enabledFeature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeCollateralCoinConfig.existConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeCollateralCoinConfig.existConfig);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradeCollateralCoinConfig.enabledCcyList);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) tradeCollateralCoinConfig.enabledType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeCollateralCoinConfig.enabledType);
    }

    public TradeCollateralCoinConfig(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.enabledFeature = str;
        this.existConfig = str2;
        this.enabledCcyList = arrayList;
        this.enabledType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String):void (m)] (LINE:324) call: com.okinc.unify_trade.biz.TradeCollateralCoinConfig.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ TradeCollateralCoinConfig(String str, String str2, ArrayList arrayList, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, arrayList, (i & 8) != 0 ? "" : str3);
    }
}
