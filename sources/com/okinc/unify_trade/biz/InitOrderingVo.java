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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InitOrderingVo implements Parcelable {
    public static final int $stable = 0;
    private final String initOpenAvgPrice;
    private final String initOpenPosFilled;
    private final String initOpenPosRemaining;
    private final String initOpenPosTarget;
    private final String initOpenPosTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InitOrderingVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InitOrderingVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitOrderingVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InitOrderingVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitOrderingVo[] newArray(int i) {
            return new InitOrderingVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitOrderingVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitOrderingVo copy$default(InitOrderingVo initOrderingVo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initOrderingVo.initOpenAvgPrice;
        }
        if ((i & 2) != 0) {
            str2 = initOrderingVo.initOpenPosFilled;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = initOrderingVo.initOpenPosRemaining;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = initOrderingVo.initOpenPosTarget;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = initOrderingVo.initOpenPosTime;
        }
        return initOrderingVo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.initOpenAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.initOpenPosFilled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.initOpenPosRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.initOpenPosTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.initOpenPosTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitOrderingVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new InitOrderingVo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof InitOrderingVo)) {
            return false;
        }
        InitOrderingVo initOrderingVo = (InitOrderingVo) obj;
        return Intrinsics.EZpvd((Object) this.initOpenAvgPrice, (Object) initOrderingVo.initOpenAvgPrice) && Intrinsics.EZpvd((Object) this.initOpenPosFilled, (Object) initOrderingVo.initOpenPosFilled) && Intrinsics.EZpvd((Object) this.initOpenPosRemaining, (Object) initOrderingVo.initOpenPosRemaining) && Intrinsics.EZpvd((Object) this.initOpenPosTarget, (Object) initOrderingVo.initOpenPosTarget) && Intrinsics.EZpvd((Object) this.initOpenPosTime, (Object) initOrderingVo.initOpenPosTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOpenAvgPrice() {
        return this.initOpenAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOpenPosFilled() {
        return this.initOpenPosFilled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOpenPosRemaining() {
        return this.initOpenPosRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOpenPosTarget() {
        return this.initOpenPosTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOpenPosTime() {
        return this.initOpenPosTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.initOpenAvgPrice.hashCode() * 31) + this.initOpenPosFilled.hashCode()) * 31) + this.initOpenPosRemaining.hashCode()) * 31) + this.initOpenPosTarget.hashCode()) * 31) + this.initOpenPosTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitOrderingVo(initOpenAvgPrice=" + this.initOpenAvgPrice + ", initOpenPosFilled=" + this.initOpenPosFilled + ", initOpenPosRemaining=" + this.initOpenPosRemaining + ", initOpenPosTarget=" + this.initOpenPosTarget + ", initOpenPosTime=" + this.initOpenPosTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.initOpenAvgPrice);
        parcel.writeString(this.initOpenPosFilled);
        parcel.writeString(this.initOpenPosRemaining);
        parcel.writeString(this.initOpenPosTarget);
        parcel.writeString(this.initOpenPosTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InitOrderingVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitOrderingVo> serializer() {
            return InitOrderingVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitOrderingVo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.initOpenAvgPrice = "";
        } else {
            this.initOpenAvgPrice = str;
        }
        if ((i & 2) == 0) {
            this.initOpenPosFilled = "";
        } else {
            this.initOpenPosFilled = str2;
        }
        if ((i & 4) == 0) {
            this.initOpenPosRemaining = "";
        } else {
            this.initOpenPosRemaining = str3;
        }
        if ((i & 8) == 0) {
            this.initOpenPosTarget = "";
        } else {
            this.initOpenPosTarget = str4;
        }
        if ((i & 16) == 0) {
            this.initOpenPosTime = "";
        } else {
            this.initOpenPosTime = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InitOrderingVo initOrderingVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) initOrderingVo.initOpenAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, initOrderingVo.initOpenAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) initOrderingVo.initOpenPosFilled, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, initOrderingVo.initOpenPosFilled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) initOrderingVo.initOpenPosRemaining, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, initOrderingVo.initOpenPosRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) initOrderingVo.initOpenPosTarget, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, initOrderingVo.initOpenPosTarget);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) initOrderingVo.initOpenPosTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, initOrderingVo.initOpenPosTime);
    }

    public InitOrderingVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.initOpenAvgPrice = str;
        this.initOpenPosFilled = str2;
        this.initOpenPosRemaining = str3;
        this.initOpenPosTarget = str4;
        this.initOpenPosTime = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:144) call: com.okinc.unify_trade.biz.InitOrderingVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InitOrderingVo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
