package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class OptionCoolState implements Parcelable {
    private String coinScope;
    private String coolingEndTime;
    private String coolingPeriod;
    private int coolingRemind;
    private String coolingStartTime;
    private String maxCoinSize;
    private String silentEndTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionCoolState> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OptionCoolState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionCoolState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OptionCoolState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionCoolState[] newArray(int i) {
            return new OptionCoolState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionCoolState() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionCoolState copy$default(OptionCoolState optionCoolState, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = optionCoolState.coolingRemind;
        }
        if ((i2 & 2) != 0) {
            str = optionCoolState.coolingStartTime;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = optionCoolState.coolingEndTime;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = optionCoolState.coolingPeriod;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = optionCoolState.silentEndTime;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = optionCoolState.maxCoinSize;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = optionCoolState.coinScope;
        }
        return optionCoolState.copy(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.coolingRemind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coolingStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coolingEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coolingPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.silentEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxCoinSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coinScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionCoolState copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OptionCoolState(i, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof OptionCoolState)) {
            return false;
        }
        OptionCoolState optionCoolState = (OptionCoolState) obj;
        return this.coolingRemind == optionCoolState.coolingRemind && Intrinsics.EZpvd((Object) this.coolingStartTime, (Object) optionCoolState.coolingStartTime) && Intrinsics.EZpvd((Object) this.coolingEndTime, (Object) optionCoolState.coolingEndTime) && Intrinsics.EZpvd((Object) this.coolingPeriod, (Object) optionCoolState.coolingPeriod) && Intrinsics.EZpvd((Object) this.silentEndTime, (Object) optionCoolState.silentEndTime) && Intrinsics.EZpvd((Object) this.maxCoinSize, (Object) optionCoolState.maxCoinSize) && Intrinsics.EZpvd((Object) this.coinScope, (Object) optionCoolState.coinScope);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinScope() {
        return this.coinScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoolingEndTime() {
        return this.coolingEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoolingPeriod() {
        return this.coolingPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoolingRemind() {
        return this.coolingRemind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoolingStartTime() {
        return this.coolingStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCoinSize() {
        return this.maxCoinSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSilentEndTime() {
        return this.silentEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.coolingRemind) * 31) + this.coolingStartTime.hashCode()) * 31) + this.coolingEndTime.hashCode()) * 31) + this.coolingPeriod.hashCode()) * 31) + this.silentEndTime.hashCode()) * 31) + this.maxCoinSize.hashCode()) * 31) + this.coinScope.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinScope(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinScope = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoolingEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coolingEndTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoolingPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coolingPeriod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoolingRemind(int i) {
        this.coolingRemind = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoolingStartTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coolingStartTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCoinSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCoinSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSilentEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.silentEndTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionCoolState(coolingRemind=" + this.coolingRemind + ", coolingStartTime=" + this.coolingStartTime + ", coolingEndTime=" + this.coolingEndTime + ", coolingPeriod=" + this.coolingPeriod + ", silentEndTime=" + this.silentEndTime + ", maxCoinSize=" + this.maxCoinSize + ", coinScope=" + this.coinScope + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.coolingRemind);
        parcel.writeString(this.coolingStartTime);
        parcel.writeString(this.coolingEndTime);
        parcel.writeString(this.coolingPeriod);
        parcel.writeString(this.silentEndTime);
        parcel.writeString(this.maxCoinSize);
        parcel.writeString(this.coinScope);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionCoolState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionCoolState> serializer() {
            return OptionCoolState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionCoolState(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.coolingRemind = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.coolingStartTime = "";
        } else {
            this.coolingStartTime = str;
        }
        if ((i & 4) == 0) {
            this.coolingEndTime = "";
        } else {
            this.coolingEndTime = str2;
        }
        if ((i & 8) == 0) {
            this.coolingPeriod = "";
        } else {
            this.coolingPeriod = str3;
        }
        if ((i & 16) == 0) {
            this.silentEndTime = "";
        } else {
            this.silentEndTime = str4;
        }
        if ((i & 32) == 0) {
            this.maxCoinSize = "";
        } else {
            this.maxCoinSize = str5;
        }
        if ((i & 64) == 0) {
            this.coinScope = "";
        } else {
            this.coinScope = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionCoolState optionCoolState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || optionCoolState.coolingRemind != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, optionCoolState.coolingRemind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optionCoolState.coolingStartTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionCoolState.coolingStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) optionCoolState.coolingEndTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, optionCoolState.coolingEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) optionCoolState.coolingPeriod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, optionCoolState.coolingPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) optionCoolState.silentEndTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, optionCoolState.silentEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) optionCoolState.maxCoinSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, optionCoolState.maxCoinSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) optionCoolState.coinScope, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, optionCoolState.coinScope);
    }

    public OptionCoolState(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.coolingRemind = i;
        this.coolingStartTime = str;
        this.coolingEndTime = str2;
        this.coolingPeriod = str3;
        this.silentEndTime = str4;
        this.maxCoinSize = str5;
        this.coinScope = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.unify_trade.biz.OptionCoolState.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionCoolState(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "");
    }

    public final boolean isInCoolTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.coinScope;
        if (str2 == null || StringsKt__StringsKt.fARcdN((CharSequence) str2) || StringsKt__StringsKt.split$default((CharSequence) this.coinScope, new String[]{","}, false, 0, 6, (Object) null).contains(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = this.coolingEndTime;
            if (jCurrentTimeMillis < (str3 != null ? C33129mqd.valueOf(str3) : 0L)) {
                return true;
            }
        }
        return false;
    }
}
