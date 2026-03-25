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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotDcaAdditionalFundParamResp implements Parcelable {
    public static final int $stable = 0;
    private final String additionalFundInTradingAccountForNextCycle;
    private final String additionalFundInVirtualAccountForNextCycle;
    private final String minBotUsage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotDcaAdditionalFundParamResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotDcaAdditionalFundParamResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdditionalFundParamResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotDcaAdditionalFundParamResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdditionalFundParamResp[] newArray(int i) {
            return new SpotDcaAdditionalFundParamResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotDcaAdditionalFundParamResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalFundInTradingAccountForNextCycle() {
        return this.additionalFundInTradingAccountForNextCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalFundInVirtualAccountForNextCycle() {
        return this.additionalFundInVirtualAccountForNextCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinBotUsage() {
        return this.minBotUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minBotUsage);
        parcel.writeString(this.additionalFundInTradingAccountForNextCycle);
        parcel.writeString(this.additionalFundInVirtualAccountForNextCycle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotDcaAdditionalFundParamResp> serializer() {
            return SpotDcaAdditionalFundParamResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotDcaAdditionalFundParamResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.minBotUsage = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.additionalFundInTradingAccountForNextCycle = "";
        } else {
            this.additionalFundInTradingAccountForNextCycle = str2;
        }
        if ((i & 4) == 0) {
            this.additionalFundInVirtualAccountForNextCycle = "";
        } else {
            this.additionalFundInVirtualAccountForNextCycle = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotDcaAdditionalFundParamResp spotDcaAdditionalFundParamResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotDcaAdditionalFundParamResp.minBotUsage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotDcaAdditionalFundParamResp.minBotUsage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotDcaAdditionalFundParamResp.additionalFundInTradingAccountForNextCycle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotDcaAdditionalFundParamResp.additionalFundInTradingAccountForNextCycle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) spotDcaAdditionalFundParamResp.additionalFundInVirtualAccountForNextCycle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, spotDcaAdditionalFundParamResp.additionalFundInVirtualAccountForNextCycle);
    }

    public SpotDcaAdditionalFundParamResp(String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.minBotUsage = str;
        this.additionalFundInTradingAccountForNextCycle = str2;
        this.additionalFundInVirtualAccountForNextCycle = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:848) call: com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotDcaAdditionalFundParamResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
