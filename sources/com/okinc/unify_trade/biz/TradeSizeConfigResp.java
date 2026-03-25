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
public final class TradeSizeConfigResp implements Parcelable {
    private String id;
    private TradeSizeConfig tradeSizeConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeSizeConfigResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeSizeConfigResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeSizeConfigResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeSizeConfigResp(parcel.readInt() == 0 ? null : TradeSizeConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeSizeConfigResp[] newArray(int i) {
            return new TradeSizeConfigResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeSizeConfigResp() {
        this((TradeSizeConfig) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeSizeConfigResp copy$default(TradeSizeConfigResp tradeSizeConfigResp, TradeSizeConfig tradeSizeConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeSizeConfig = tradeSizeConfigResp.tradeSizeConfig;
        }
        if ((i & 2) != 0) {
            str = tradeSizeConfigResp.id;
        }
        return tradeSizeConfigResp.copy(tradeSizeConfig, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSizeConfig component1() {
        return this.tradeSizeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSizeConfigResp copy(TradeSizeConfig tradeSizeConfig, String str) {
        return new TradeSizeConfigResp(tradeSizeConfig, str);
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
        if (!(obj instanceof TradeSizeConfigResp)) {
            return false;
        }
        TradeSizeConfigResp tradeSizeConfigResp = (TradeSizeConfigResp) obj;
        return Intrinsics.EZpvd(this.tradeSizeConfig, tradeSizeConfigResp.tradeSizeConfig) && Intrinsics.EZpvd((Object) this.id, (Object) tradeSizeConfigResp.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSizeConfig getTradeSizeConfig() {
        return this.tradeSizeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TradeSizeConfig tradeSizeConfig = this.tradeSizeConfig;
        int iHashCode = tradeSizeConfig == null ? 0 : tradeSizeConfig.hashCode();
        String str = this.id;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSizeConfig(TradeSizeConfig tradeSizeConfig) {
        this.tradeSizeConfig = tradeSizeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeSizeConfigResp(tradeSizeConfig=" + this.tradeSizeConfig + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TradeSizeConfig tradeSizeConfig = this.tradeSizeConfig;
        if (tradeSizeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeSizeConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeSizeConfigResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeSizeConfigResp> serializer() {
            return TradeSizeConfigResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeSizeConfigResp(int i, TradeSizeConfig tradeSizeConfig, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeSizeConfig = null;
        } else {
            this.tradeSizeConfig = tradeSizeConfig;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeSizeConfigResp tradeSizeConfigResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeSizeConfigResp.tradeSizeConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TradeSizeConfig$$serializer.INSTANCE, tradeSizeConfigResp.tradeSizeConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && tradeSizeConfigResp.id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeSizeConfigResp.id);
    }

    public TradeSizeConfigResp(TradeSizeConfig tradeSizeConfig, String str) {
        this.tradeSizeConfig = tradeSizeConfig;
        this.id = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.TradeSizeConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeSizeConfig) : (r2v0 com.okinc.unify_trade.biz.TradeSizeConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.TradeSizeConfig, java.lang.String):void (m)] (LINE:69) call: com.okinc.unify_trade.biz.TradeSizeConfigResp.<init>(com.okinc.unify_trade.biz.TradeSizeConfig, java.lang.String):void type: THIS */
    public /* synthetic */ TradeSizeConfigResp(TradeSizeConfig tradeSizeConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tradeSizeConfig, (i & 2) != 0 ? null : str);
    }
}
