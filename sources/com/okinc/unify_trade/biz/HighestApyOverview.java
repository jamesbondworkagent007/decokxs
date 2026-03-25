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
public final class HighestApyOverview implements Parcelable {
    public static final int $stable = 0;
    private final String estimatedTotalApy;
    private final String leveragePrincipal;
    private final String nextEstimatedTotalApy;
    private final String period;
    private final String stakingEnabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HighestApyOverview> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HighestApyOverview> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighestApyOverview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HighestApyOverview(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighestApyOverview[] newArray(int i) {
            return new HighestApyOverview[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HighestApyOverview() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HighestApyOverview copy$default(HighestApyOverview highestApyOverview, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highestApyOverview.period;
        }
        if ((i & 2) != 0) {
            str2 = highestApyOverview.estimatedTotalApy;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = highestApyOverview.leveragePrincipal;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = highestApyOverview.stakingEnabled;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = highestApyOverview.nextEstimatedTotalApy;
        }
        return highestApyOverview.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estimatedTotalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stakingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextEstimatedTotalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestApyOverview copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new HighestApyOverview(str, str2, str3, str4, str5);
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
        if (!(obj instanceof HighestApyOverview)) {
            return false;
        }
        HighestApyOverview highestApyOverview = (HighestApyOverview) obj;
        return Intrinsics.EZpvd((Object) this.period, (Object) highestApyOverview.period) && Intrinsics.EZpvd((Object) this.estimatedTotalApy, (Object) highestApyOverview.estimatedTotalApy) && Intrinsics.EZpvd((Object) this.leveragePrincipal, (Object) highestApyOverview.leveragePrincipal) && Intrinsics.EZpvd((Object) this.stakingEnabled, (Object) highestApyOverview.stakingEnabled) && Intrinsics.EZpvd((Object) this.nextEstimatedTotalApy, (Object) highestApyOverview.nextEstimatedTotalApy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTotalApy() {
        return this.estimatedTotalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextEstimatedTotalApy() {
        return this.nextEstimatedTotalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingEnabled() {
        return this.stakingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.period.hashCode() * 31) + this.estimatedTotalApy.hashCode()) * 31) + this.leveragePrincipal.hashCode()) * 31) + this.stakingEnabled.hashCode()) * 31) + this.nextEstimatedTotalApy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HighestApyOverview(period=" + this.period + ", estimatedTotalApy=" + this.estimatedTotalApy + ", leveragePrincipal=" + this.leveragePrincipal + ", stakingEnabled=" + this.stakingEnabled + ", nextEstimatedTotalApy=" + this.nextEstimatedTotalApy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.period);
        parcel.writeString(this.estimatedTotalApy);
        parcel.writeString(this.leveragePrincipal);
        parcel.writeString(this.stakingEnabled);
        parcel.writeString(this.nextEstimatedTotalApy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.HighestApyOverview.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HighestApyOverview> serializer() {
            return HighestApyOverview$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HighestApyOverview(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.period = "";
        } else {
            this.period = str;
        }
        if ((i & 2) == 0) {
            this.estimatedTotalApy = "";
        } else {
            this.estimatedTotalApy = str2;
        }
        if ((i & 4) == 0) {
            this.leveragePrincipal = "";
        } else {
            this.leveragePrincipal = str3;
        }
        if ((i & 8) == 0) {
            this.stakingEnabled = "";
        } else {
            this.stakingEnabled = str4;
        }
        if ((i & 16) == 0) {
            this.nextEstimatedTotalApy = "";
        } else {
            this.nextEstimatedTotalApy = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(HighestApyOverview highestApyOverview, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) highestApyOverview.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, highestApyOverview.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) highestApyOverview.estimatedTotalApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, highestApyOverview.estimatedTotalApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) highestApyOverview.leveragePrincipal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, highestApyOverview.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) highestApyOverview.stakingEnabled, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, highestApyOverview.stakingEnabled);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) highestApyOverview.nextEstimatedTotalApy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, highestApyOverview.nextEstimatedTotalApy);
    }

    public HighestApyOverview(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.period = str;
        this.estimatedTotalApy = str2;
        this.leveragePrincipal = str3;
        this.stakingEnabled = str4;
        this.nextEstimatedTotalApy = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1242) call: com.okinc.unify_trade.biz.HighestApyOverview.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HighestApyOverview(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
