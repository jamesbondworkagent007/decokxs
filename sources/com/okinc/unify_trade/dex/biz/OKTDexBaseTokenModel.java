package com.okinc.unify_trade.dex.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.DexInstrument$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKTDexBaseTokenModel implements Parcelable {
    private final DexInstrument dexInstrument;
    private final String isNativeToken;
    private final String riskLevel;
    private final boolean stockTag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKTDexBaseTokenModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKTDexBaseTokenModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexBaseTokenModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTDexBaseTokenModel(DexInstrument.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexBaseTokenModel[] newArray(int i) {
            return new OKTDexBaseTokenModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKTDexBaseTokenModel copy$default(OKTDexBaseTokenModel oKTDexBaseTokenModel, DexInstrument dexInstrument, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dexInstrument = oKTDexBaseTokenModel.dexInstrument;
        }
        if ((i & 2) != 0) {
            str = oKTDexBaseTokenModel.isNativeToken;
        }
        if ((i & 4) != 0) {
            str2 = oKTDexBaseTokenModel.riskLevel;
        }
        if ((i & 8) != 0) {
            z = oKTDexBaseTokenModel.stockTag;
        }
        return oKTDexBaseTokenModel.copy(dexInstrument, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInstrument component1() {
        return this.dexInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.stockTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexBaseTokenModel copy(@NotNull DexInstrument dexInstrument, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OKTDexBaseTokenModel(dexInstrument, str, str2, z);
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
        if (!(obj instanceof OKTDexBaseTokenModel)) {
            return false;
        }
        OKTDexBaseTokenModel oKTDexBaseTokenModel = (OKTDexBaseTokenModel) obj;
        return Intrinsics.EZpvd(this.dexInstrument, oKTDexBaseTokenModel.dexInstrument) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) oKTDexBaseTokenModel.isNativeToken) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) oKTDexBaseTokenModel.riskLevel) && this.stockTag == oKTDexBaseTokenModel.stockTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInstrument getDexInstrument() {
        return this.dexInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStockTag() {
        return this.stockTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.dexInstrument.hashCode() * 31) + this.isNativeToken.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + Boolean.hashCode(this.stockTag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexBaseTokenModel(dexInstrument=" + this.dexInstrument + ", isNativeToken=" + this.isNativeToken + ", riskLevel=" + this.riskLevel + ", stockTag=" + this.stockTag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.dexInstrument.writeToParcel(parcel, i);
        parcel.writeString(this.isNativeToken);
        parcel.writeString(this.riskLevel);
        parcel.writeInt(this.stockTag ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.OKTDexBaseTokenModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexBaseTokenModel> serializer() {
            return OKTDexBaseTokenModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTDexBaseTokenModel(int i, DexInstrument dexInstrument, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OKTDexBaseTokenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.dexInstrument = dexInstrument;
        if ((i & 2) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str;
        }
        if ((i & 4) == 0) {
            this.riskLevel = "0";
        } else {
            this.riskLevel = str2;
        }
        if ((i & 8) == 0) {
            this.stockTag = false;
        } else {
            this.stockTag = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OKTDexBaseTokenModel oKTDexBaseTokenModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DexInstrument$$serializer.INSTANCE, oKTDexBaseTokenModel.dexInstrument);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTDexBaseTokenModel.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTDexBaseTokenModel.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKTDexBaseTokenModel.riskLevel, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKTDexBaseTokenModel.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || oKTDexBaseTokenModel.stockTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, oKTDexBaseTokenModel.stockTag);
        }
    }

    public OKTDexBaseTokenModel(@NotNull DexInstrument dexInstrument, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.dexInstrument = dexInstrument;
        this.isNativeToken = str;
        this.riskLevel = str2;
        this.stockTag = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 com.okinc.unify_trade.biz.DexInstrument)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.String, java.lang.String, boolean):void (m)] (LINE:13) call: com.okinc.unify_trade.dex.biz.OKTDexBaseTokenModel.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ OKTDexBaseTokenModel(DexInstrument dexInstrument, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "0" : str2, (i & 8) != 0 ? false : z);
    }

    public final boolean isMainChainCoin() {
        return Intrinsics.EZpvd((Object) this.isNativeToken, (Object) "1");
    }

    public final boolean isHighRisk() {
        return Intrinsics.EZpvd((Object) this.riskLevel, (Object) "4");
    }

    public final boolean isEmpty() {
        return this.dexInstrument.getChainId().length() == 0 || this.dexInstrument.getTokenContractAddress().length() == 0 || this.dexInstrument.getDecimals().length() == 0;
    }

    public final boolean isSameToken(OKTDexBaseTokenModel oKTDexBaseTokenModel) {
        DexInstrument dexInstrument;
        return Intrinsics.EZpvd((Object) this.dexInstrument.getChainId(), (Object) ((oKTDexBaseTokenModel == null || (dexInstrument = oKTDexBaseTokenModel.dexInstrument) == null) ? null : dexInstrument.getChainId())) && Intrinsics.EZpvd((Object) this.dexInstrument.getTokenContractAddress(), (Object) oKTDexBaseTokenModel.dexInstrument.getTokenContractAddress());
    }
}
