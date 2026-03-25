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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CurrencyConfigResp implements Parcelable {
    private CurrencyConfig currencyConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CurrencyConfigResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CurrencyConfigResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConfigResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrencyConfigResp(parcel.readInt() == 0 ? null : CurrencyConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyConfigResp[] newArray(int i) {
            return new CurrencyConfigResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencyConfigResp() {
        this((CurrencyConfig) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencyConfigResp copy$default(CurrencyConfigResp currencyConfigResp, CurrencyConfig currencyConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyConfig = currencyConfigResp.currencyConfig;
        }
        return currencyConfigResp.copy(currencyConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyConfig component1() {
        return this.currencyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyConfigResp copy(CurrencyConfig currencyConfig) {
        return new CurrencyConfigResp(currencyConfig);
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
        return (obj instanceof CurrencyConfigResp) && Intrinsics.EZpvd(this.currencyConfig, ((CurrencyConfigResp) obj).currencyConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyConfig getCurrencyConfig() {
        return this.currencyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CurrencyConfig currencyConfig = this.currencyConfig;
        if (currencyConfig == null) {
            return 0;
        }
        return currencyConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyConfig(CurrencyConfig currencyConfig) {
        this.currencyConfig = currencyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyConfigResp(currencyConfig=" + this.currencyConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CurrencyConfig currencyConfig = this.currencyConfig;
        if (currencyConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currencyConfig.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CurrencyConfigResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyConfigResp> serializer() {
            return CurrencyConfigResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyConfigResp(int i, CurrencyConfig currencyConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyConfig = null;
        } else {
            this.currencyConfig = currencyConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CurrencyConfigResp currencyConfigResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && currencyConfigResp.currencyConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CurrencyConfig$$serializer.INSTANCE, currencyConfigResp.currencyConfig);
    }

    public CurrencyConfigResp(CurrencyConfig currencyConfig) {
        this.currencyConfig = currencyConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.CurrencyConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CurrencyConfig) : (r1v0 com.okinc.unify_trade.biz.CurrencyConfig))
 A[MD:(com.okinc.unify_trade.biz.CurrencyConfig):void (m)] (LINE:32) call: com.okinc.unify_trade.biz.CurrencyConfigResp.<init>(com.okinc.unify_trade.biz.CurrencyConfig):void type: THIS */
    public /* synthetic */ CurrencyConfigResp(CurrencyConfig currencyConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currencyConfig);
    }
}
