package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Page implements Parcelable {
    private final BtnTips btnTips;
    private final List<Content> content;
    private final String contentAlign;
    private final PrimaryButton primaryButton;
    private final SecondaryButton secondaryButton;
    private final String stepTitle;
    private final List<Step> steps;
    private final String title;
    private final String titleAlign;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Page> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Content$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(Step$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<Page> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Page createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(Content.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            PrimaryButton primaryButtonCreateFromParcel = parcel.readInt() == 0 ? null : PrimaryButton.CREATOR.createFromParcel(parcel);
            SecondaryButton secondaryButtonCreateFromParcel = parcel.readInt() == 0 ? null : SecondaryButton.CREATOR.createFromParcel(parcel);
            BtnTips btnTipsCreateFromParcel = parcel.readInt() == 0 ? null : BtnTips.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Step.CREATOR.createFromParcel(parcel));
                }
            }
            return new Page(arrayList, primaryButtonCreateFromParcel, secondaryButtonCreateFromParcel, btnTipsCreateFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Page[] newArray(int i) {
            return new Page[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Page() {
        this((List) null, (PrimaryButton) null, (SecondaryButton) null, (BtnTips) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Content> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrimaryButton component2() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecondaryButton component3() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtnTips component4() {
        return this.btnTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Step> component5() {
        return this.steps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.stepTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.titleAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.contentAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Page copy(List<Content> list, PrimaryButton primaryButton, SecondaryButton secondaryButton, BtnTips btnTips, List<Step> list2, String str, String str2, String str3, String str4, String str5) {
        return new Page(list, primaryButton, secondaryButton, btnTips, list2, str, str2, str3, str4, str5);
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
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        return Intrinsics.EZpvd(this.content, page.content) && Intrinsics.EZpvd(this.primaryButton, page.primaryButton) && Intrinsics.EZpvd(this.secondaryButton, page.secondaryButton) && Intrinsics.EZpvd(this.btnTips, page.btnTips) && Intrinsics.EZpvd(this.steps, page.steps) && Intrinsics.EZpvd((Object) this.title, (Object) page.title) && Intrinsics.EZpvd((Object) this.stepTitle, (Object) page.stepTitle) && Intrinsics.EZpvd((Object) this.titleAlign, (Object) page.titleAlign) && Intrinsics.EZpvd((Object) this.contentAlign, (Object) page.contentAlign) && Intrinsics.EZpvd((Object) this.type, (Object) page.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtnTips getBtnTips() {
        return this.btnTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Content> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentAlign() {
        return this.contentAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecondaryButton getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStepTitle() {
        return this.stepTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Step> getSteps() {
        return this.steps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleAlign() {
        return this.titleAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Content> list = this.content;
        int iHashCode = list == null ? 0 : list.hashCode();
        PrimaryButton primaryButton = this.primaryButton;
        int iHashCode2 = primaryButton == null ? 0 : primaryButton.hashCode();
        SecondaryButton secondaryButton = this.secondaryButton;
        int iHashCode3 = secondaryButton == null ? 0 : secondaryButton.hashCode();
        BtnTips btnTips = this.btnTips;
        int iHashCode4 = btnTips == null ? 0 : btnTips.hashCode();
        List<Step> list2 = this.steps;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        String str = this.title;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.stepTitle;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.titleAlign;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contentAlign;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.type;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Page(content=" + this.content + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", btnTips=" + this.btnTips + ", steps=" + this.steps + ", title=" + this.title + ", stepTitle=" + this.stepTitle + ", titleAlign=" + this.titleAlign + ", contentAlign=" + this.contentAlign + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Content> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Content> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        PrimaryButton primaryButton = this.primaryButton;
        if (primaryButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            primaryButton.writeToParcel(parcel, i);
        }
        SecondaryButton secondaryButton = this.secondaryButton;
        if (secondaryButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryButton.writeToParcel(parcel, i);
        }
        BtnTips btnTips = this.btnTips;
        if (btnTips == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            btnTips.writeToParcel(parcel, i);
        }
        List<Step> list2 = this.steps;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Step> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.title);
        parcel.writeString(this.stepTitle);
        parcel.writeString(this.titleAlign);
        parcel.writeString(this.contentAlign);
        parcel.writeString(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Page.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Page> serializer() {
            return Page$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Page(int i, List list, PrimaryButton primaryButton, SecondaryButton secondaryButton, BtnTips btnTips, List list2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.content = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = primaryButton;
        }
        if ((i & 4) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = secondaryButton;
        }
        if ((i & 8) == 0) {
            this.btnTips = null;
        } else {
            this.btnTips = btnTips;
        }
        if ((i & 16) == 0) {
            this.steps = yDY.AhwBna();
        } else {
            this.steps = list2;
        }
        if ((i & 32) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 64) == 0) {
            this.stepTitle = "";
        } else {
            this.stepTitle = str2;
        }
        if ((i & 128) == 0) {
            this.titleAlign = "";
        } else {
            this.titleAlign = str3;
        }
        if ((i & 256) == 0) {
            this.contentAlign = "";
        } else {
            this.contentAlign = str4;
        }
        if ((i & 512) == 0) {
            this.type = "";
        } else {
            this.type = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Page page, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(page.content, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], page.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || page.primaryButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, PrimaryButton$$serializer.INSTANCE, page.primaryButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || page.secondaryButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SecondaryButton$$serializer.INSTANCE, page.secondaryButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || page.btnTips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BtnTips$$serializer.INSTANCE, page.btnTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(page.steps, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], page.steps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) page.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, page.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) page.stepTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, page.stepTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) page.titleAlign, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, page.titleAlign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) page.contentAlign, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, page.contentAlign);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) page.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, page.type);
    }

    public Page(List<Content> list, PrimaryButton primaryButton, SecondaryButton secondaryButton, BtnTips btnTips, List<Step> list2, String str, String str2, String str3, String str4, String str5) {
        this.content = list;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
        this.btnTips = btnTips;
        this.steps = list2;
        this.title = str;
        this.stepTitle = str2;
        this.titleAlign = str3;
        this.contentAlign = str4;
        this.type = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r12v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton) : (r13v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton:?: TERNARY null = ((wrap:int:0x0014: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton) : (r14v0 com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips) : (null com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Content>, com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton, com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton, com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Step>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Page.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton, com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton, com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Page(List list, PrimaryButton primaryButton, SecondaryButton secondaryButton, BtnTips btnTips, List list2, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : primaryButton, (i & 4) != 0 ? null : secondaryButton, (i & 8) == 0 ? btnTips : null, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) == 0 ? str5 : "");
    }
}
