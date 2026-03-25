package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ReminderData implements Parcelable {
    private Float bottomMargin;
    private List<String> content;
    private CTAButton cta;
    private String status;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReminderData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<ReminderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReminderData(parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderData[] newArray(int i) {
            return new ReminderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReminderData copy$default(ReminderData reminderData, CTAButton cTAButton, String str, List list, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButton = reminderData.cta;
        }
        if ((i & 2) != 0) {
            str = reminderData.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = reminderData.content;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = reminderData.status;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            f = reminderData.bottomMargin;
        }
        return reminderData.copy(cTAButton, str3, list2, str4, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component1() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderData copy(CTAButton cTAButton, @NotNull String str, List<String> list, @NotNull String str2, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ReminderData(cTAButton, str, list, str2, f);
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
        if (!(obj instanceof ReminderData)) {
            return false;
        }
        ReminderData reminderData = (ReminderData) obj;
        return Intrinsics.EZpvd(this.cta, reminderData.cta) && Intrinsics.EZpvd((Object) this.title, (Object) reminderData.title) && Intrinsics.EZpvd(this.content, reminderData.content) && Intrinsics.EZpvd((Object) this.status, (Object) reminderData.status) && Intrinsics.EZpvd(this.bottomMargin, reminderData.bottomMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CTAButton cTAButton = this.cta;
        int iHashCode = cTAButton == null ? 0 : cTAButton.hashCode();
        int iHashCode2 = this.title.hashCode();
        List<String> list = this.content;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = this.status.hashCode();
        Float f = this.bottomMargin;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(List<String> list) {
        this.content = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCta(CTAButton cTAButton) {
        this.cta = cTAButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReminderData(cta=" + this.cta + ", title=" + this.title + ", content=" + this.content + ", status=" + this.status + ", bottomMargin=" + this.bottomMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeStringList(this.content);
        parcel.writeString(this.status);
        Float f = this.bottomMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReminderData> serializer() {
            return ReminderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReminderData(int i, CTAButton cTAButton, String str, List list, String str2, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, ReminderData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        this.bottomMargin = f;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ReminderData reminderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || reminderData.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CTAButton$$serializer.INSTANCE, reminderData.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) reminderData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, reminderData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || reminderData.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], reminderData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) reminderData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, reminderData.status);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, reminderData.bottomMargin);
    }

    public ReminderData(CTAButton cTAButton, @NotNull String str, List<String> list, @NotNull String str2, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cta = cTAButton;
        this.title = str;
        this.content = list;
        this.status = str2;
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.lang.Float)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Float):void (m)] (LINE:186) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.util.List, java.lang.String, java.lang.Float):void type: THIS */
    public /* synthetic */ ReminderData(CTAButton cTAButton, String str, List list, String str2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAButton, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "" : str2, f);
    }
}
