package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotDcaAdditionalFundParamRep implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String initOrdAmt;
    private final String maxSafetyOrds;
    private final boolean reserveFunds;
    private final String safetyOrdAmt;
    private final String volMult;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotDcaAdditionalFundParamRep> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotDcaAdditionalFundParamRep> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdditionalFundParamRep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotDcaAdditionalFundParamRep(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaAdditionalFundParamRep[] newArray(int i) {
            return new SpotDcaAdditionalFundParamRep[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeString(this.volMult);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotDcaAdditionalFundParamRep> serializer() {
            return SpotDcaAdditionalFundParamRep$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotDcaAdditionalFundParamRep(int i, String str, String str2, String str3, String str4, boolean z, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.throwMissingFieldException(i, 28, SpotDcaAdditionalFundParamRep$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.initOrdAmt = "";
        } else {
            this.initOrdAmt = str2;
        }
        this.safetyOrdAmt = str3;
        this.maxSafetyOrds = str4;
        this.reserveFunds = z;
        if ((i & 32) == 0) {
            this.volMult = "";
        } else {
            this.volMult = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotDcaAdditionalFundParamRep spotDcaAdditionalFundParamRep, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotDcaAdditionalFundParamRep.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotDcaAdditionalFundParamRep.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotDcaAdditionalFundParamRep.initOrdAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotDcaAdditionalFundParamRep.initOrdAmt);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, spotDcaAdditionalFundParamRep.safetyOrdAmt);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, spotDcaAdditionalFundParamRep.maxSafetyOrds);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, spotDcaAdditionalFundParamRep.reserveFunds);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) spotDcaAdditionalFundParamRep.volMult, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, spotDcaAdditionalFundParamRep.volMult);
    }

    public SpotDcaAdditionalFundParamRep(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.algoId = str;
        this.initOrdAmt = str2;
        this.safetyOrdAmt = str3;
        this.maxSafetyOrds = str4;
        this.reserveFunds = z;
        this.volMult = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:835) call: com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SpotDcaAdditionalFundParamRep(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, str3, str4, z, (i & 32) != 0 ? "" : str5);
    }
}
