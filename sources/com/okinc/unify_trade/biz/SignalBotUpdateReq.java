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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotUpdateReq implements Parcelable {
    public static final int $stable = 0;
    private final String signalChanId;
    private final String signalChanName;
    private final String signalDescription;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SignalBotUpdateReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotUpdateReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotUpdateReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotUpdateReq(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotUpdateReq[] newArray(int i) {
            return new SignalBotUpdateReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotUpdateReq() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalBotUpdateReq copy$default(SignalBotUpdateReq signalBotUpdateReq, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotUpdateReq.signalChanId;
        }
        if ((i & 2) != 0) {
            str2 = signalBotUpdateReq.signalChanName;
        }
        if ((i & 4) != 0) {
            str3 = signalBotUpdateReq.signalDescription;
        }
        return signalBotUpdateReq.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotUpdateReq copy(String str, String str2, String str3) {
        return new SignalBotUpdateReq(str, str2, str3);
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
        if (!(obj instanceof SignalBotUpdateReq)) {
            return false;
        }
        SignalBotUpdateReq signalBotUpdateReq = (SignalBotUpdateReq) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalBotUpdateReq.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) signalBotUpdateReq.signalChanName) && Intrinsics.EZpvd((Object) this.signalDescription, (Object) signalBotUpdateReq.signalDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanName() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalDescription() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signalChanId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signalChanName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signalDescription;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotUpdateReq(signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", signalDescription=" + this.signalDescription + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalDescription);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotUpdateReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotUpdateReq> serializer() {
            return SignalBotUpdateReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotUpdateReq(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str;
        }
        if ((i & 2) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str2;
        }
        if ((i & 4) == 0) {
            this.signalDescription = null;
        } else {
            this.signalDescription = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotUpdateReq signalBotUpdateReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotUpdateReq.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotUpdateReq.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotUpdateReq.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotUpdateReq.signalChanName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signalBotUpdateReq.signalDescription == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotUpdateReq.signalDescription);
    }

    public SignalBotUpdateReq(String str, String str2, String str3) {
        this.signalChanId = str;
        this.signalChanName = str2;
        this.signalDescription = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3825) call: com.okinc.unify_trade.biz.SignalBotUpdateReq.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotUpdateReq(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
