package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43772rvb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Quit implements Parcelable {
    private final String content;
    private final String iconState;
    private final String primaryLabel;
    private final ButtonStyle primaryStyle;
    private final ArrayList<QuestionItem> questionList;
    private final Quit questionModule;
    private final String secondaryLabel;
    private final ButtonStyle secondaryStyle;
    private final Boolean shouldShow;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Quit> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(QuestionItem$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<Quit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Quit createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(QuestionItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Quit(boolValueOf, string, string2, string3, string4, string5, quitCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : ButtonStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? ButtonStyle.valueOf(parcel.readString()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Quit[] newArray(int i) {
            return new Quit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Quit() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Quit) null, (ArrayList) null, (ButtonStyle) null, (ButtonStyle) null, 1023, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C43772rvb.class)
    public static /* synthetic */ void getPrimaryStyle$annotations() {
    }

    @Serializable(with = C43772rvb.class)
    public static /* synthetic */ void getSecondaryStyle$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.shouldShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle component10() {
        return this.secondaryStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.primaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.secondaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component7() {
        return this.questionModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<QuestionItem> component8() {
        return this.questionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle component9() {
        return this.primaryStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit copy(Boolean bool, String str, String str2, String str3, String str4, String str5, Quit quit, ArrayList<QuestionItem> arrayList, ButtonStyle buttonStyle, ButtonStyle buttonStyle2) {
        return new Quit(bool, str, str2, str3, str4, str5, quit, arrayList, buttonStyle, buttonStyle2);
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
        if (!(obj instanceof Quit)) {
            return false;
        }
        Quit quit = (Quit) obj;
        return Intrinsics.EZpvd(this.shouldShow, quit.shouldShow) && Intrinsics.EZpvd((Object) this.title, (Object) quit.title) && Intrinsics.EZpvd((Object) this.content, (Object) quit.content) && Intrinsics.EZpvd((Object) this.iconState, (Object) quit.iconState) && Intrinsics.EZpvd((Object) this.primaryLabel, (Object) quit.primaryLabel) && Intrinsics.EZpvd((Object) this.secondaryLabel, (Object) quit.secondaryLabel) && Intrinsics.EZpvd(this.questionModule, quit.questionModule) && Intrinsics.EZpvd(this.questionList, quit.questionList) && this.primaryStyle == quit.primaryStyle && this.secondaryStyle == quit.secondaryStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconState() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryLabel() {
        return this.primaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle getPrimaryStyle() {
        return this.primaryStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<QuestionItem> getQuestionList() {
        return this.questionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit getQuestionModule() {
        return this.questionModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle getSecondaryStyle() {
        return this.secondaryStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldShow() {
        return this.shouldShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.shouldShow;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconState;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.primaryLabel;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.secondaryLabel;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Quit quit = this.questionModule;
        int iHashCode7 = quit == null ? 0 : quit.hashCode();
        ArrayList<QuestionItem> arrayList = this.questionList;
        int iHashCode8 = arrayList == null ? 0 : arrayList.hashCode();
        ButtonStyle buttonStyle = this.primaryStyle;
        int iHashCode9 = buttonStyle == null ? 0 : buttonStyle.hashCode();
        ButtonStyle buttonStyle2 = this.secondaryStyle;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (buttonStyle2 != null ? buttonStyle2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Quit(shouldShow=" + this.shouldShow + ", title=" + this.title + ", content=" + this.content + ", iconState=" + this.iconState + ", primaryLabel=" + this.primaryLabel + ", secondaryLabel=" + this.secondaryLabel + ", questionModule=" + this.questionModule + ", questionList=" + this.questionList + ", primaryStyle=" + this.primaryStyle + ", secondaryStyle=" + this.secondaryStyle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.shouldShow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.iconState);
        parcel.writeString(this.primaryLabel);
        parcel.writeString(this.secondaryLabel);
        Quit quit = this.questionModule;
        if (quit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quit.writeToParcel(parcel, i);
        }
        ArrayList<QuestionItem> arrayList = this.questionList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<QuestionItem> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ButtonStyle buttonStyle = this.primaryStyle;
        if (buttonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonStyle.name());
        }
        ButtonStyle buttonStyle2 = this.secondaryStyle;
        if (buttonStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonStyle2.name());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Quit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Quit> serializer() {
            return Quit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Quit(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, Quit quit, ArrayList arrayList, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, SerializationConstructorMarker serializationConstructorMarker) {
        this.shouldShow = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.iconState = null;
        } else {
            this.iconState = str3;
        }
        if ((i & 16) == 0) {
            this.primaryLabel = "";
        } else {
            this.primaryLabel = str4;
        }
        if ((i & 32) == 0) {
            this.secondaryLabel = "";
        } else {
            this.secondaryLabel = str5;
        }
        if ((i & 64) == 0) {
            this.questionModule = null;
        } else {
            this.questionModule = quit;
        }
        if ((i & 128) == 0) {
            this.questionList = null;
        } else {
            this.questionList = arrayList;
        }
        if ((i & 256) == 0) {
            this.primaryStyle = null;
        } else {
            this.primaryStyle = buttonStyle;
        }
        if ((i & 512) == 0) {
            this.secondaryStyle = null;
        } else {
            this.secondaryStyle = buttonStyle2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Quit quit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(quit.shouldShow, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, quit.shouldShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quit.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, quit.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quit.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, quit.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || quit.iconState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, quit.iconState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quit.primaryLabel, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, quit.primaryLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quit.secondaryLabel, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, quit.secondaryLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || quit.questionModule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Quit$$serializer.INSTANCE, quit.questionModule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || quit.questionList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], quit.questionList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || quit.primaryStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, C43772rvb.copydefault, quit.primaryStyle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && quit.secondaryStyle == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, C43772rvb.copydefault, quit.secondaryStyle);
    }

    public Quit(Boolean bool, String str, String str2, String str3, String str4, String str5, Quit quit, ArrayList<QuestionItem> arrayList, ButtonStyle buttonStyle, ButtonStyle buttonStyle2) {
        this.shouldShow = bool;
        this.title = str;
        this.content = str2;
        this.iconState = str3;
        this.primaryLabel = str4;
        this.secondaryLabel = str5;
        this.questionModule = quit;
        this.questionList = arrayList;
        this.primaryStyle = buttonStyle;
        this.secondaryStyle = buttonStyle2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r19v0 java.util.ArrayList))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x0049: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.QuestionItem>, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void (m)] (LINE:284) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Quit.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle):void type: THIS */
    public /* synthetic */ Quit(Boolean bool, String str, String str2, String str3, String str4, String str5, Quit quit, ArrayList arrayList, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? null : quit, (i & 128) != 0 ? null : arrayList, (i & 256) != 0 ? null : buttonStyle, (i & 512) == 0 ? buttonStyle2 : null);
    }
}
