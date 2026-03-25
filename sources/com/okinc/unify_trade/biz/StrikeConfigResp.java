package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class StrikeConfigResp implements Parcelable {
    private StrikeConfig customizedStrikeConfig;
    private String id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrikeConfigResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<StrikeConfigResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrikeConfigResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrikeConfigResp(parcel.readInt() == 0 ? null : StrikeConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrikeConfigResp[] newArray(int i) {
            return new StrikeConfigResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrikeConfigResp() {
        this((StrikeConfig) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrikeConfigResp copy$default(StrikeConfigResp strikeConfigResp, StrikeConfig strikeConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            strikeConfig = strikeConfigResp.customizedStrikeConfig;
        }
        if ((i & 2) != 0) {
            str = strikeConfigResp.id;
        }
        return strikeConfigResp.copy(strikeConfig, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrikeConfig component1() {
        return this.customizedStrikeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrikeConfigResp copy(StrikeConfig strikeConfig, String str) {
        return new StrikeConfigResp(strikeConfig, str);
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
        if (!(obj instanceof StrikeConfigResp)) {
            return false;
        }
        StrikeConfigResp strikeConfigResp = (StrikeConfigResp) obj;
        return Intrinsics.EZpvd(this.customizedStrikeConfig, strikeConfigResp.customizedStrikeConfig) && Intrinsics.EZpvd((Object) this.id, (Object) strikeConfigResp.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrikeConfig getCustomizedStrikeConfig() {
        return this.customizedStrikeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        StrikeConfig strikeConfig = this.customizedStrikeConfig;
        int iHashCode = strikeConfig == null ? 0 : strikeConfig.hashCode();
        String str = this.id;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomizedStrikeConfig(StrikeConfig strikeConfig) {
        this.customizedStrikeConfig = strikeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrikeConfigResp(customizedStrikeConfig=" + this.customizedStrikeConfig + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        StrikeConfig strikeConfig = this.customizedStrikeConfig;
        if (strikeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strikeConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrikeConfigResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrikeConfigResp> serializer() {
            return StrikeConfigResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrikeConfigResp(int i, StrikeConfig strikeConfig, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.customizedStrikeConfig = null;
        } else {
            this.customizedStrikeConfig = strikeConfig;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrikeConfigResp strikeConfigResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || strikeConfigResp.customizedStrikeConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StrikeConfig$$serializer.INSTANCE, strikeConfigResp.customizedStrikeConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && strikeConfigResp.id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, strikeConfigResp.id);
    }

    public StrikeConfigResp(StrikeConfig strikeConfig, String str) {
        this.customizedStrikeConfig = strikeConfig;
        this.id = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.StrikeConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.StrikeConfig) : (r2v0 com.okinc.unify_trade.biz.StrikeConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.StrikeConfig, java.lang.String):void (m)] (LINE:60) call: com.okinc.unify_trade.biz.StrikeConfigResp.<init>(com.okinc.unify_trade.biz.StrikeConfig, java.lang.String):void type: THIS */
    public /* synthetic */ StrikeConfigResp(StrikeConfig strikeConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strikeConfig, (i & 2) != 0 ? null : str);
    }
}
