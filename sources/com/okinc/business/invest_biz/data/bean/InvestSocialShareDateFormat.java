package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class InvestSocialShareDateFormat implements Parcelable {
    public static final int $stable = 0;
    private final String date;
    private final String timeZone;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestSocialShareDateFormat> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSocialShareDateFormat> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSocialShareDateFormat createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestSocialShareDateFormat(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSocialShareDateFormat[] newArray(int i) {
            return new InvestSocialShareDateFormat[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestSocialShareDateFormat copy$default(InvestSocialShareDateFormat investSocialShareDateFormat, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investSocialShareDateFormat.timeZone;
        }
        if ((i & 2) != 0) {
            str2 = investSocialShareDateFormat.date;
        }
        return investSocialShareDateFormat.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSocialShareDateFormat copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestSocialShareDateFormat(str, str2);
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
        if (!(obj instanceof InvestSocialShareDateFormat)) {
            return false;
        }
        InvestSocialShareDateFormat investSocialShareDateFormat = (InvestSocialShareDateFormat) obj;
        return Intrinsics.EZpvd((Object) this.timeZone, (Object) investSocialShareDateFormat.timeZone) && Intrinsics.EZpvd((Object) this.date, (Object) investSocialShareDateFormat.date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDate() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.timeZone.hashCode() * 31) + this.date.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSocialShareDateFormat(timeZone=" + this.timeZone + ", date=" + this.date + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timeZone);
        parcel.writeString(this.date);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestSocialShareDateFormat.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSocialShareDateFormat> serializer() {
            return InvestSocialShareDateFormat$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSocialShareDateFormat(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvestSocialShareDateFormat$$serializer.INSTANCE.getDescriptor());
        }
        this.timeZone = str;
        this.date = str2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSocialShareDateFormat investSocialShareDateFormat, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investSocialShareDateFormat.timeZone);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investSocialShareDateFormat.date);
    }

    public InvestSocialShareDateFormat(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.timeZone = str;
        this.date = str2;
    }
}
