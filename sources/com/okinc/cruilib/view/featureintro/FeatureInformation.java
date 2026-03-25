package com.okinc.cruilib.view.featureintro;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FeatureInformation implements Parcelable {
    public String ctaText;
    public String description;
    public Integer heroImageId;
    public Integer heroImageTint;
    public boolean isCtaVisible;
    public boolean isNew;
    public List<IntroNote> noteList;
    public String tagText;
    public String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeatureInformation> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(IntroNote$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<FeatureInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureInformation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IntroNote.CREATOR.createFromParcel(parcel));
                }
            }
            return new FeatureInformation(numValueOf, numValueOf2, z, string, string2, string3, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureInformation[] newArray(int i) {
            return new FeatureInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeatureInformation() {
        this((Integer) null, (Integer) null, false, (String) null, (String) null, (String) null, (List) null, false, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.isNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.ctaText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureInformation KWHzl(Integer num, Integer num2, boolean z, String str, @NotNull String str2, String str3, List<IntroNote> list, boolean z2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FeatureInformation(num, num2, z, str, str2, str3, list, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.heroImageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.heroImageTint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IntroNote> djBIcL() {
        return this.noteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureInformation)) {
            return false;
        }
        FeatureInformation featureInformation = (FeatureInformation) obj;
        return Intrinsics.EZpvd(this.heroImageId, featureInformation.heroImageId) && Intrinsics.EZpvd(this.heroImageTint, featureInformation.heroImageTint) && this.isNew == featureInformation.isNew && Intrinsics.EZpvd((Object) this.tagText, (Object) featureInformation.tagText) && Intrinsics.EZpvd((Object) this.title, (Object) featureInformation.title) && Intrinsics.EZpvd((Object) this.description, (Object) featureInformation.description) && Intrinsics.EZpvd(this.noteList, featureInformation.noteList) && this.isCtaVisible == featureInformation.isCtaVisible && Intrinsics.EZpvd((Object) this.ctaText, (Object) featureInformation.ctaText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tagText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.heroImageId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.heroImageTint;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isNew);
        String str = this.tagText;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.title.hashCode();
        String str2 = this.description;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        List<IntroNote> list = this.noteList;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCtaVisible)) * 31) + this.ctaText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeatureInformation(heroImageId=" + this.heroImageId + ", heroImageTint=" + this.heroImageTint + ", isNew=" + this.isNew + ", tagText=" + this.tagText + ", title=" + this.title + ", description=" + this.description + ", noteList=" + this.noteList + ", isCtaVisible=" + this.isCtaVisible + ", ctaText=" + this.ctaText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.isCtaVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.heroImageId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.heroImageTint;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isNew ? 1 : 0);
        parcel.writeString(this.tagText);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<IntroNote> list = this.noteList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<IntroNote> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isCtaVisible ? 1 : 0);
        parcel.writeString(this.ctaText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.view.featureintro.FeatureInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeatureInformation> serializer() {
            return FeatureInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeatureInformation(int i, Integer num, Integer num2, boolean z, String str, String str2, String str3, List list, boolean z2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.heroImageId = null;
        } else {
            this.heroImageId = num;
        }
        if ((i & 2) == 0) {
            this.heroImageTint = null;
        } else {
            this.heroImageTint = num2;
        }
        if ((i & 4) == 0) {
            this.isNew = false;
        } else {
            this.isNew = z;
        }
        if ((i & 8) == 0) {
            this.tagText = null;
        } else {
            this.tagText = str;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 64) == 0) {
            this.noteList = null;
        } else {
            this.noteList = list;
        }
        if ((i & 128) == 0) {
            this.isCtaVisible = false;
        } else {
            this.isCtaVisible = z2;
        }
        if ((i & 256) == 0) {
            this.ctaText = "";
        } else {
            this.ctaText = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(FeatureInformation featureInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || featureInformation.heroImageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, featureInformation.heroImageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || featureInformation.heroImageTint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, featureInformation.heroImageTint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || featureInformation.isNew) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, featureInformation.isNew);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || featureInformation.tagText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, featureInformation.tagText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) featureInformation.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, featureInformation.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || featureInformation.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, featureInformation.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || featureInformation.noteList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], featureInformation.noteList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || featureInformation.isCtaVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, featureInformation.isCtaVisible);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) featureInformation.ctaText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, featureInformation.ctaText);
    }

    public FeatureInformation(Integer num, Integer num2, boolean z, String str, @NotNull String str2, String str3, List<IntroNote> list, boolean z2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.heroImageId = num;
        this.heroImageTint = num2;
        this.isNew = z;
        this.tagText = str;
        this.title = str2;
        this.description = str3;
        this.noteList = list;
        this.isCtaVisible = z2;
        this.ctaText = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
 A[MD:(java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.cruilib.view.featureintro.IntroNote>, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.cruilib.view.featureintro.FeatureInformation.<init>(java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ FeatureInformation(Integer num, Integer num2, boolean z, String str, String str2, String str3, List list, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? list : null, (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? str4 : "");
    }
}
