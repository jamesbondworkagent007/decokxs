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
public final class ExchangeReminderTitleBean implements Parcelable {
    private String name;
    private boolean showDivider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeReminderTitleBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ExchangeReminderTitleBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderTitleBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeReminderTitleBean(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeReminderTitleBean[] newArray(int i) {
            return new ExchangeReminderTitleBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeReminderTitleBean() {
        this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeReminderTitleBean copy$default(ExchangeReminderTitleBean exchangeReminderTitleBean, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeReminderTitleBean.name;
        }
        if ((i & 2) != 0) {
            z = exchangeReminderTitleBean.showDivider;
        }
        return exchangeReminderTitleBean.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeReminderTitleBean copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ExchangeReminderTitleBean(str, z);
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
        if (!(obj instanceof ExchangeReminderTitleBean)) {
            return false;
        }
        ExchangeReminderTitleBean exchangeReminderTitleBean = (ExchangeReminderTitleBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) exchangeReminderTitleBean.name) && this.showDivider == exchangeReminderTitleBean.showDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.showDivider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDivider(boolean z) {
        this.showDivider = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeReminderTitleBean(name=" + this.name + ", showDivider=" + this.showDivider + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeInt(this.showDivider ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderTitleBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeReminderTitleBean> serializer() {
            return ExchangeReminderTitleBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeReminderTitleBean(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.showDivider = false;
        } else {
            this.showDivider = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ExchangeReminderTitleBean exchangeReminderTitleBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeReminderTitleBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeReminderTitleBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || exchangeReminderTitleBean.showDivider) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, exchangeReminderTitleBean.showDivider);
        }
    }

    public ExchangeReminderTitleBean(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.showDivider = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:28) call: com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderTitleBean.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ExchangeReminderTitleBean(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
