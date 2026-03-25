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
public final class SetCollateralPreCheckResp implements Parcelable {
    public static final int $stable = 0;
    private final String acctAdjEquity;
    private final String acctAvaMargin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SetCollateralPreCheckResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SetCollateralPreCheckResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetCollateralPreCheckResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SetCollateralPreCheckResp(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetCollateralPreCheckResp[] newArray(int i) {
            return new SetCollateralPreCheckResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetCollateralPreCheckResp() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SetCollateralPreCheckResp copy$default(SetCollateralPreCheckResp setCollateralPreCheckResp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setCollateralPreCheckResp.acctAdjEquity;
        }
        if ((i & 2) != 0) {
            str2 = setCollateralPreCheckResp.acctAvaMargin;
        }
        return setCollateralPreCheckResp.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acctAdjEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.acctAvaMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetCollateralPreCheckResp copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SetCollateralPreCheckResp(str, str2);
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
        if (!(obj instanceof SetCollateralPreCheckResp)) {
            return false;
        }
        SetCollateralPreCheckResp setCollateralPreCheckResp = (SetCollateralPreCheckResp) obj;
        return Intrinsics.EZpvd((Object) this.acctAdjEquity, (Object) setCollateralPreCheckResp.acctAdjEquity) && Intrinsics.EZpvd((Object) this.acctAvaMargin, (Object) setCollateralPreCheckResp.acctAvaMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAdjEquity() {
        return this.acctAdjEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAvaMargin() {
        return this.acctAvaMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.acctAdjEquity.hashCode() * 31) + this.acctAvaMargin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetCollateralPreCheckResp(acctAdjEquity=" + this.acctAdjEquity + ", acctAvaMargin=" + this.acctAvaMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.acctAdjEquity);
        parcel.writeString(this.acctAvaMargin);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SetCollateralPreCheckResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetCollateralPreCheckResp> serializer() {
            return SetCollateralPreCheckResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetCollateralPreCheckResp(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.acctAdjEquity = "";
        } else {
            this.acctAdjEquity = str;
        }
        if ((i & 2) == 0) {
            this.acctAvaMargin = "";
        } else {
            this.acctAvaMargin = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SetCollateralPreCheckResp setCollateralPreCheckResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) setCollateralPreCheckResp.acctAdjEquity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, setCollateralPreCheckResp.acctAdjEquity);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) setCollateralPreCheckResp.acctAvaMargin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, setCollateralPreCheckResp.acctAvaMargin);
    }

    public SetCollateralPreCheckResp(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.acctAdjEquity = str;
        this.acctAvaMargin = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4999) call: com.okinc.unify_trade.biz.SetCollateralPreCheckResp.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SetCollateralPreCheckResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
