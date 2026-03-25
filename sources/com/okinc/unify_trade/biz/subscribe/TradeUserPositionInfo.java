package com.okinc.unify_trade.biz.subscribe;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeUserPositionInfo implements Parcelable {
    public static final int $stable = 0;
    private final String accountName;
    private final String auth;
    private final String main;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeUserPositionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeUserPositionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeUserPositionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeUserPositionInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeUserPositionInfo[] newArray(int i) {
            return new TradeUserPositionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeUserPositionInfo copy$default(TradeUserPositionInfo tradeUserPositionInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeUserPositionInfo.accountName;
        }
        if ((i & 2) != 0) {
            str2 = tradeUserPositionInfo.main;
        }
        if ((i & 4) != 0) {
            str3 = tradeUserPositionInfo.auth;
        }
        return tradeUserPositionInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.auth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeUserPositionInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TradeUserPositionInfo(str, str2, str3);
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
        if (!(obj instanceof TradeUserPositionInfo)) {
            return false;
        }
        TradeUserPositionInfo tradeUserPositionInfo = (TradeUserPositionInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountName, (Object) tradeUserPositionInfo.accountName) && Intrinsics.EZpvd((Object) this.main, (Object) tradeUserPositionInfo.main) && Intrinsics.EZpvd((Object) this.auth, (Object) tradeUserPositionInfo.auth);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuth() {
        return this.auth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMain() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountName.hashCode() * 31) + this.main.hashCode()) * 31) + this.auth.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeUserPositionInfo(accountName=" + this.accountName + ", main=" + this.main + ", auth=" + this.auth + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountName);
        parcel.writeString(this.main);
        parcel.writeString(this.auth);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeUserPositionInfo> serializer() {
            return TradeUserPositionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeUserPositionInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, TradeUserPositionInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str;
        }
        if ((i & 2) == 0) {
            this.main = "";
        } else {
            this.main = str2;
        }
        this.auth = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeUserPositionInfo tradeUserPositionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeUserPositionInfo.accountName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeUserPositionInfo.accountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeUserPositionInfo.main, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeUserPositionInfo.main);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeUserPositionInfo.auth);
    }

    public TradeUserPositionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountName = str;
        this.main = str2;
        this.auth = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:110) call: com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeUserPositionInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3);
    }
}
