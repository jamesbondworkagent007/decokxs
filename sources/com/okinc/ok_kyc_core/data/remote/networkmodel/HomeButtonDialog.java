package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class HomeButtonDialog implements Parcelable {
    private final CtaData cta;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeButtonDialog> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeButtonDialog> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeButtonDialog createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeButtonDialog(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CtaData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeButtonDialog[] newArray(int i) {
            return new HomeButtonDialog[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeButtonDialog() {
        this((String) null, (String) null, (CtaData) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeButtonDialog copy$default(HomeButtonDialog homeButtonDialog, String str, String str2, CtaData ctaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeButtonDialog.title;
        }
        if ((i & 2) != 0) {
            str2 = homeButtonDialog.subtitle;
        }
        if ((i & 4) != 0) {
            ctaData = homeButtonDialog.cta;
        }
        return homeButtonDialog.copy(str, str2, ctaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaData component3() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeButtonDialog copy(String str, String str2, CtaData ctaData) {
        return new HomeButtonDialog(str, str2, ctaData);
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
        if (!(obj instanceof HomeButtonDialog)) {
            return false;
        }
        HomeButtonDialog homeButtonDialog = (HomeButtonDialog) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) homeButtonDialog.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) homeButtonDialog.subtitle) && Intrinsics.EZpvd(this.cta, homeButtonDialog.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaData getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        CtaData ctaData = this.cta;
        return (((iHashCode * 31) + iHashCode2) * 31) + (ctaData != null ? ctaData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeButtonDialog(title=" + this.title + ", subtitle=" + this.subtitle + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        CtaData ctaData = this.cta;
        if (ctaData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeButtonDialog> serializer() {
            return HomeButtonDialog$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeButtonDialog(int i, String str, String str2, CtaData ctaData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaData;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HomeButtonDialog homeButtonDialog, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeButtonDialog.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, homeButtonDialog.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeButtonDialog.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, homeButtonDialog.subtitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && homeButtonDialog.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CtaData$$serializer.INSTANCE, homeButtonDialog.cta);
    }

    public HomeButtonDialog(String str, String str2, CtaData ctaData) {
        this.title = str;
        this.subtitle = str2;
        this.cta = ctaData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData) : (r4v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData))
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData):void (m)] (LINE:55) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData):void type: THIS */
    public /* synthetic */ HomeButtonDialog(String str, String str2, CtaData ctaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : ctaData);
    }
}
