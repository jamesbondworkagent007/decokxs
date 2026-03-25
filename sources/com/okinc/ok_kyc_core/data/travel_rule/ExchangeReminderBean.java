package com.okinc.ok_kyc_core.data.travel_rule;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ExchangeReminderBean implements Parcelable {
    private String exchangeName;
    private long id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeReminderBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ExchangeReminderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeReminderBean(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderBean[] newArray(int i) {
            return new ExchangeReminderBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeReminderBean() {
        this((String) null, 0L, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeReminderBean copy$default(ExchangeReminderBean exchangeReminderBean, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeReminderBean.exchangeName;
        }
        if ((i & 2) != 0) {
            j = exchangeReminderBean.id;
        }
        return exchangeReminderBean.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.exchangeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeReminderBean copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ExchangeReminderBean(str, j);
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
        if (!(obj instanceof ExchangeReminderBean)) {
            return false;
        }
        ExchangeReminderBean exchangeReminderBean = (ExchangeReminderBean) obj;
        return Intrinsics.EZpvd((Object) this.exchangeName, (Object) exchangeReminderBean.exchangeName) && this.id == exchangeReminderBean.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeName() {
        return this.exchangeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.exchangeName.hashCode() * 31) + Long.hashCode(this.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exchangeName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeReminderBean(exchangeName=" + this.exchangeName + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.exchangeName);
        parcel.writeLong(this.id);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeReminderBean> serializer() {
            return ExchangeReminderBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeReminderBean(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        this.exchangeName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ExchangeReminderBean exchangeReminderBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeReminderBean.exchangeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeReminderBean.exchangeName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && exchangeReminderBean.id == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 1, exchangeReminderBean.id);
    }

    public ExchangeReminderBean(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exchangeName = str;
        this.id = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(java.lang.String, long):void (m)] (LINE:11) call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderBean.<init>(java.lang.String, long):void type: THIS */
    public /* synthetic */ ExchangeReminderBean(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
    }
}
