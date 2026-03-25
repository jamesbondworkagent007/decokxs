package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AwsSessionResultResp implements Parcelable {
    private String checkMsg;
    private String noteTitle;
    private ArrayList<String> notes;
    private String referenceImage;
    private String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AwsSessionResultResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<AwsSessionResultResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AwsSessionResultResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AwsSessionResultResp(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AwsSessionResultResp[] newArray(int i) {
            return new AwsSessionResultResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AwsSessionResultResp() {
        this((String) null, (String) null, (ArrayList) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.liveness.eop.bean.AwsSessionResultResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwsSessionResultResp copy$default(AwsSessionResultResp awsSessionResultResp, String str, String str2, ArrayList arrayList, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awsSessionResultResp.status;
        }
        if ((i & 2) != 0) {
            str2 = awsSessionResultResp.checkMsg;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            arrayList = awsSessionResultResp.notes;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            str3 = awsSessionResultResp.referenceImage;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = awsSessionResultResp.noteTitle;
        }
        return awsSessionResultResp.copy(str, str5, arrayList2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.checkMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.referenceImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.noteTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSessionResultResp copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AwsSessionResultResp(str, str2, arrayList, str3, str4);
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
        if (!(obj instanceof AwsSessionResultResp)) {
            return false;
        }
        AwsSessionResultResp awsSessionResultResp = (AwsSessionResultResp) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) awsSessionResultResp.status) && Intrinsics.EZpvd((Object) this.checkMsg, (Object) awsSessionResultResp.checkMsg) && Intrinsics.EZpvd(this.notes, awsSessionResultResp.notes) && Intrinsics.EZpvd((Object) this.referenceImage, (Object) awsSessionResultResp.referenceImage) && Intrinsics.EZpvd((Object) this.noteTitle, (Object) awsSessionResultResp.noteTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckMsg() {
        return this.checkMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoteTitle() {
        return this.noteTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getNotes() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferenceImage() {
        return this.referenceImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.status.hashCode() * 31) + this.checkMsg.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.referenceImage.hashCode()) * 31) + this.noteTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.checkMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoteTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.noteTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotes(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.notes = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferenceImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.referenceImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AwsSessionResultResp(status=" + this.status + ", checkMsg=" + this.checkMsg + ", notes=" + this.notes + ", referenceImage=" + this.referenceImage + ", noteTitle=" + this.noteTitle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.status);
        parcel.writeString(this.checkMsg);
        parcel.writeStringList(this.notes);
        parcel.writeString(this.referenceImage);
        parcel.writeString(this.noteTitle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.AwsSessionResultResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AwsSessionResultResp> serializer() {
            return AwsSessionResultResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AwsSessionResultResp(int i, String str, String str2, ArrayList arrayList, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.checkMsg = "";
        } else {
            this.checkMsg = str2;
        }
        if ((i & 4) == 0) {
            this.notes = new ArrayList<>();
        } else {
            this.notes = arrayList;
        }
        if ((i & 8) == 0) {
            this.referenceImage = "";
        } else {
            this.referenceImage = str3;
        }
        if ((i & 16) == 0) {
            this.noteTitle = "";
        } else {
            this.noteTitle = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(AwsSessionResultResp awsSessionResultResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) awsSessionResultResp.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, awsSessionResultResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) awsSessionResultResp.checkMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, awsSessionResultResp.checkMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(awsSessionResultResp.notes, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], awsSessionResultResp.notes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) awsSessionResultResp.referenceImage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, awsSessionResultResp.referenceImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) awsSessionResultResp.noteTitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, awsSessionResultResp.noteTitle);
    }

    public AwsSessionResultResp(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.status = str;
        this.checkMsg = str2;
        this.notes = arrayList;
        this.referenceImage = str3;
        this.noteTitle = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.util.ArrayList:0x0019: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:67) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r7v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:64) call: com.okinc.liveness.eop.bean.AwsSessionResultResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AwsSessionResultResp(String str, String str2, ArrayList arrayList, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
