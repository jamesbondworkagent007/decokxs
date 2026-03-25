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
public final class BotMaxAvailableResult implements Parcelable {
    public static final int $stable = 0;
    private final String available;
    private final String buySize;
    private final String sellSize;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BotMaxAvailableResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotMaxAvailableResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotMaxAvailableResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotMaxAvailableResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotMaxAvailableResult[] newArray(int i) {
            return new BotMaxAvailableResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotMaxAvailableResult() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotMaxAvailableResult copy$default(BotMaxAvailableResult botMaxAvailableResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botMaxAvailableResult.available;
        }
        if ((i & 2) != 0) {
            str2 = botMaxAvailableResult.buySize;
        }
        if ((i & 4) != 0) {
            str3 = botMaxAvailableResult.sellSize;
        }
        return botMaxAvailableResult.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotMaxAvailableResult copy(String str, String str2, String str3) {
        return new BotMaxAvailableResult(str, str2, str3);
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
        if (!(obj instanceof BotMaxAvailableResult)) {
            return false;
        }
        BotMaxAvailableResult botMaxAvailableResult = (BotMaxAvailableResult) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) botMaxAvailableResult.available) && Intrinsics.EZpvd((Object) this.buySize, (Object) botMaxAvailableResult.buySize) && Intrinsics.EZpvd((Object) this.sellSize, (Object) botMaxAvailableResult.sellSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuySize() {
        return this.buySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellSize() {
        return this.sellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.available;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.buySize;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sellSize;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotMaxAvailableResult(available=" + this.available + ", buySize=" + this.buySize + ", sellSize=" + this.sellSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.buySize);
        parcel.writeString(this.sellSize);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotMaxAvailableResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotMaxAvailableResult> serializer() {
            return BotMaxAvailableResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotMaxAvailableResult(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = str;
        }
        if ((i & 2) == 0) {
            this.buySize = null;
        } else {
            this.buySize = str2;
        }
        if ((i & 4) == 0) {
            this.sellSize = null;
        } else {
            this.sellSize = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotMaxAvailableResult botMaxAvailableResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botMaxAvailableResult.available != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botMaxAvailableResult.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botMaxAvailableResult.buySize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botMaxAvailableResult.buySize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && botMaxAvailableResult.sellSize == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botMaxAvailableResult.sellSize);
    }

    public BotMaxAvailableResult(String str, String str2, String str3) {
        this.available = str;
        this.buySize = str2;
        this.sellSize = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3808) call: com.okinc.unify_trade.biz.BotMaxAvailableResult.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotMaxAvailableResult(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
