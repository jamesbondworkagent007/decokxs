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
public final class Reminder implements Parcelable {
    private Float bottomMargin;
    private List<String> content;
    private CTAButtonAppModel cta;
    private String status;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Reminder> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<Reminder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reminder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Reminder(parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reminder[] newArray(int i) {
            return new Reminder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Reminder copy$default(Reminder reminder, CTAButtonAppModel cTAButtonAppModel, String str, List list, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButtonAppModel = reminder.cta;
        }
        if ((i & 2) != 0) {
            str = reminder.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = reminder.content;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = reminder.status;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            f = reminder.bottomMargin;
        }
        return reminder.copy(cTAButtonAppModel, str3, list2, str4, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component1() {
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
    public final Reminder copy(CTAButtonAppModel cTAButtonAppModel, @NotNull String str, List<String> list, @NotNull String str2, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Reminder(cTAButtonAppModel, str, list, str2, f);
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
        if (!(obj instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) obj;
        return Intrinsics.EZpvd(this.cta, reminder.cta) && Intrinsics.EZpvd((Object) this.title, (Object) reminder.title) && Intrinsics.EZpvd(this.content, reminder.content) && Intrinsics.EZpvd((Object) this.status, (Object) reminder.status) && Intrinsics.EZpvd(this.bottomMargin, reminder.bottomMargin);
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
    public final CTAButtonAppModel getCta() {
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
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        int iHashCode = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
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
    public final void setCta(CTAButtonAppModel cTAButtonAppModel) {
        this.cta = cTAButtonAppModel;
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
        return "Reminder(cta=" + this.cta + ", title=" + this.title + ", content=" + this.content + ", status=" + this.status + ", bottomMargin=" + this.bottomMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Reminder> serializer() {
            return Reminder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Reminder(int i, CTAButtonAppModel cTAButtonAppModel, String str, List list, String str2, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, Reminder$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButtonAppModel;
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Reminder reminder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || reminder.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CTAButtonAppModel$$serializer.INSTANCE, reminder.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) reminder.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, reminder.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || reminder.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], reminder.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) reminder.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, reminder.status);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, reminder.bottomMargin);
    }

    public Reminder(CTAButtonAppModel cTAButtonAppModel, @NotNull String str, List<String> list, @NotNull String str2, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cta = cTAButtonAppModel;
        this.title = str;
        this.content = list;
        this.status = str2;
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.lang.Float)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Float):void (m)] (LINE:197) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.util.List, java.lang.String, java.lang.Float):void type: THIS */
    public /* synthetic */ Reminder(CTAButtonAppModel cTAButtonAppModel, String str, List list, String str2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAButtonAppModel, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "" : str2, f);
    }
}
