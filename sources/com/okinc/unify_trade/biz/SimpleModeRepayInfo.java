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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SimpleModeRepayInfo implements Parcelable {
    public static final int $stable = 0;
    private final String coinUsdValue;
    private final String repayAmt;
    private final String repayCcy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SimpleModeRepayInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimpleModeRepayInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeRepayInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleModeRepayInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleModeRepayInfo[] newArray(int i) {
            return new SimpleModeRepayInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModeRepayInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleModeRepayInfo copy$default(SimpleModeRepayInfo simpleModeRepayInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleModeRepayInfo.repayCcy;
        }
        if ((i & 2) != 0) {
            str2 = simpleModeRepayInfo.repayAmt;
        }
        if ((i & 4) != 0) {
            str3 = simpleModeRepayInfo.coinUsdValue;
        }
        return simpleModeRepayInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.repayAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleModeRepayInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SimpleModeRepayInfo(str, str2, str3);
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
        if (!(obj instanceof SimpleModeRepayInfo)) {
            return false;
        }
        SimpleModeRepayInfo simpleModeRepayInfo = (SimpleModeRepayInfo) obj;
        return Intrinsics.EZpvd((Object) this.repayCcy, (Object) simpleModeRepayInfo.repayCcy) && Intrinsics.EZpvd((Object) this.repayAmt, (Object) simpleModeRepayInfo.repayAmt) && Intrinsics.EZpvd((Object) this.coinUsdValue, (Object) simpleModeRepayInfo.coinUsdValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUsdValue() {
        return this.coinUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayAmt() {
        return this.repayAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayCcy() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.repayCcy.hashCode() * 31) + this.repayAmt.hashCode()) * 31) + this.coinUsdValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleModeRepayInfo(repayCcy=" + this.repayCcy + ", repayAmt=" + this.repayAmt + ", coinUsdValue=" + this.coinUsdValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.repayCcy);
        parcel.writeString(this.repayAmt);
        parcel.writeString(this.coinUsdValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleModeRepayInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleModeRepayInfo> serializer() {
            return SimpleModeRepayInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleModeRepayInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.repayCcy = "";
        } else {
            this.repayCcy = str;
        }
        if ((i & 2) == 0) {
            this.repayAmt = "";
        } else {
            this.repayAmt = str2;
        }
        if ((i & 4) == 0) {
            this.coinUsdValue = "";
        } else {
            this.coinUsdValue = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleModeRepayInfo simpleModeRepayInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleModeRepayInfo.repayCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleModeRepayInfo.repayCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleModeRepayInfo.repayAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleModeRepayInfo.repayAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) simpleModeRepayInfo.coinUsdValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleModeRepayInfo.coinUsdValue);
    }

    public SimpleModeRepayInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.repayCcy = str;
        this.repayAmt = str2;
        this.coinUsdValue = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5058) call: com.okinc.unify_trade.biz.SimpleModeRepayInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleModeRepayInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
