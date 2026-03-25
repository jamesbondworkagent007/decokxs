package com.okinc.okimcore.model.other;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CtaInfo implements Parcelable {
    public static final int $stable = 0;
    private final String ctaCampaignEndTime;
    private final String ctaCampaignStartTime;
    private final CtaIcon ctaIcon;
    private final String ctaLink;
    private final String ctaName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CtaInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CtaIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaInfo[] newArray(int i) {
            return new CtaInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaInfo() {
        this((String) null, (String) null, (CtaIcon) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaInfo copy$default(CtaInfo ctaInfo, String str, String str2, CtaIcon ctaIcon, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ctaInfo.ctaName;
        }
        if ((i & 2) != 0) {
            str2 = ctaInfo.ctaLink;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            ctaIcon = ctaInfo.ctaIcon;
        }
        CtaIcon ctaIcon2 = ctaIcon;
        if ((i & 8) != 0) {
            str3 = ctaInfo.ctaCampaignStartTime;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = ctaInfo.ctaCampaignEndTime;
        }
        return ctaInfo.copy(str, str5, ctaIcon2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ctaName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ctaLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaIcon component3() {
        return this.ctaIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ctaCampaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ctaCampaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaInfo copy(String str, String str2, CtaIcon ctaIcon, String str3, String str4) {
        return new CtaInfo(str, str2, ctaIcon, str3, str4);
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
        if (!(obj instanceof CtaInfo)) {
            return false;
        }
        CtaInfo ctaInfo = (CtaInfo) obj;
        return Intrinsics.EZpvd((Object) this.ctaName, (Object) ctaInfo.ctaName) && Intrinsics.EZpvd((Object) this.ctaLink, (Object) ctaInfo.ctaLink) && Intrinsics.EZpvd(this.ctaIcon, ctaInfo.ctaIcon) && Intrinsics.EZpvd((Object) this.ctaCampaignStartTime, (Object) ctaInfo.ctaCampaignStartTime) && Intrinsics.EZpvd((Object) this.ctaCampaignEndTime, (Object) ctaInfo.ctaCampaignEndTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaCampaignEndTime() {
        return this.ctaCampaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaCampaignStartTime() {
        return this.ctaCampaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaIcon getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaLink() {
        return this.ctaLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaName() {
        return this.ctaName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ctaName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ctaLink;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        CtaIcon ctaIcon = this.ctaIcon;
        int iHashCode3 = ctaIcon == null ? 0 : ctaIcon.hashCode();
        String str3 = this.ctaCampaignStartTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ctaCampaignEndTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaInfo(ctaName=" + this.ctaName + ", ctaLink=" + this.ctaLink + ", ctaIcon=" + this.ctaIcon + ", ctaCampaignStartTime=" + this.ctaCampaignStartTime + ", ctaCampaignEndTime=" + this.ctaCampaignEndTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ctaName);
        parcel.writeString(this.ctaLink);
        CtaIcon ctaIcon = this.ctaIcon;
        if (ctaIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ctaCampaignStartTime);
        parcel.writeString(this.ctaCampaignEndTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.CtaInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaInfo> serializer() {
            return CtaInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaInfo(int i, String str, String str2, CtaIcon ctaIcon, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ctaName = null;
        } else {
            this.ctaName = str;
        }
        if ((i & 2) == 0) {
            this.ctaLink = null;
        } else {
            this.ctaLink = str2;
        }
        if ((i & 4) == 0) {
            this.ctaIcon = null;
        } else {
            this.ctaIcon = ctaIcon;
        }
        if ((i & 8) == 0) {
            this.ctaCampaignStartTime = null;
        } else {
            this.ctaCampaignStartTime = str3;
        }
        if ((i & 16) == 0) {
            this.ctaCampaignEndTime = null;
        } else {
            this.ctaCampaignEndTime = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CtaInfo ctaInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaInfo.ctaName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ctaInfo.ctaName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ctaInfo.ctaLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ctaInfo.ctaLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ctaInfo.ctaIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CtaIcon$$serializer.INSTANCE, ctaInfo.ctaIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || ctaInfo.ctaCampaignStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, ctaInfo.ctaCampaignStartTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && ctaInfo.ctaCampaignEndTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ctaInfo.ctaCampaignEndTime);
    }

    public CtaInfo(String str, String str2, CtaIcon ctaIcon, String str3, String str4) {
        this.ctaName = str;
        this.ctaLink = str2;
        this.ctaIcon = ctaIcon;
        this.ctaCampaignStartTime = str3;
        this.ctaCampaignEndTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.other.CtaIcon:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.other.CtaIcon) : (r7v0 com.okinc.okimcore.model.other.CtaIcon))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.other.CtaIcon, java.lang.String, java.lang.String):void (m)] (LINE:268) call: com.okinc.okimcore.model.other.CtaInfo.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.other.CtaIcon, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CtaInfo(String str, String str2, CtaIcon ctaIcon, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ctaIcon, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
