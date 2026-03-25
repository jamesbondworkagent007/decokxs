package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class OfflineQuote implements Parcelable {
    public static final int $stable = 0;
    private final long deadline;
    private final String quote;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OfflineQuote> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OfflineQuote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineQuote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OfflineQuote(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OfflineQuote[] newArray(int i) {
            return new OfflineQuote[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OfflineQuote() {
        this(0L, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OfflineQuote copy$default(OfflineQuote offlineQuote, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = offlineQuote.deadline;
        }
        if ((i & 2) != 0) {
            str = offlineQuote.quote;
        }
        if ((i & 4) != 0) {
            str2 = offlineQuote.unsignedTx;
        }
        return offlineQuote.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfflineQuote copy(long j, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new OfflineQuote(j, str, str2);
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
        if (!(obj instanceof OfflineQuote)) {
            return false;
        }
        OfflineQuote offlineQuote = (OfflineQuote) obj;
        return this.deadline == offlineQuote.deadline && Intrinsics.EZpvd((Object) this.quote, (Object) offlineQuote.quote) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) offlineQuote.unsignedTx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.deadline);
        String str = this.quote;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.unsignedTx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OfflineQuote(deadline=" + this.deadline + ", quote=" + this.quote + ", unsignedTx=" + this.unsignedTx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.deadline);
        parcel.writeString(this.quote);
        parcel.writeString(this.unsignedTx);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.OfflineQuote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfflineQuote> serializer() {
            return OfflineQuote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OfflineQuote(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.deadline = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.quote = "";
        } else {
            this.quote = str;
        }
        if ((i & 4) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OfflineQuote offlineQuote, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || offlineQuote.deadline != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, offlineQuote.deadline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) offlineQuote.quote, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, offlineQuote.quote);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) offlineQuote.unsignedTx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, offlineQuote.unsignedTx);
    }

    public OfflineQuote(long j, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.deadline = j;
        this.quote = str;
        this.unsignedTx = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:1034) call: com.okinc.business.dexlogic.bean.OfflineQuote.<init>(long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OfflineQuote(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
