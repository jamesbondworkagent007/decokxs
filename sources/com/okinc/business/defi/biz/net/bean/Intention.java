package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Intention implements Parcelable {
    public static final String UNKNOWN_INTENTION_FLAG = "UNKNOWN";
    private String formatMethodNameAndParameter;
    private final String intentionTypeIconUrlDay;
    private final String intentionTypeIconUrlNight;
    private final String intentionTypeLanguageText;
    private final String methodName;
    private final JsonElement methodParameter;
    private final String supportIntentionFlag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Intention> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Intention> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Intention createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Intention(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JsonElement) null, parcel.readString(), 32, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Intention[] newArray(int i) {
            return new Intention[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Intention() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Intention copy$default(Intention intention, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intention.supportIntentionFlag;
        }
        if ((i & 2) != 0) {
            str2 = intention.intentionTypeIconUrlDay;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = intention.intentionTypeIconUrlNight;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = intention.intentionTypeLanguageText;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = intention.methodName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            jsonElement = intention.methodParameter;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i & 64) != 0) {
            str6 = intention.formatMethodNameAndParameter;
        }
        return intention.copy(str, str7, str8, str9, str10, jsonElement2, str6);
    }

    public static /* synthetic */ void getMethodParameter$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.supportIntentionFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.intentionTypeIconUrlDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.intentionTypeIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.intentionTypeLanguageText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.methodName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component6() {
        return this.methodParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.formatMethodNameAndParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Intention copy(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, String str6) {
        return new Intention(str, str2, str3, str4, str5, jsonElement, str6);
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
        if (!(obj instanceof Intention)) {
            return false;
        }
        Intention intention = (Intention) obj;
        return Intrinsics.EZpvd((Object) this.supportIntentionFlag, (Object) intention.supportIntentionFlag) && Intrinsics.EZpvd((Object) this.intentionTypeIconUrlDay, (Object) intention.intentionTypeIconUrlDay) && Intrinsics.EZpvd((Object) this.intentionTypeIconUrlNight, (Object) intention.intentionTypeIconUrlNight) && Intrinsics.EZpvd((Object) this.intentionTypeLanguageText, (Object) intention.intentionTypeLanguageText) && Intrinsics.EZpvd((Object) this.methodName, (Object) intention.methodName) && Intrinsics.EZpvd(this.methodParameter, intention.methodParameter) && Intrinsics.EZpvd((Object) this.formatMethodNameAndParameter, (Object) intention.formatMethodNameAndParameter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatMethodNameAndParameter() {
        return this.formatMethodNameAndParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntentionTypeIconUrlDay() {
        return this.intentionTypeIconUrlDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntentionTypeIconUrlNight() {
        return this.intentionTypeIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntentionTypeLanguageText() {
        return this.intentionTypeLanguageText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethodName() {
        return this.methodName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getMethodParameter() {
        return this.methodParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportIntentionFlag() {
        return this.supportIntentionFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.supportIntentionFlag;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.intentionTypeIconUrlDay;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.intentionTypeIconUrlNight;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.intentionTypeLanguageText;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.methodName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        JsonElement jsonElement = this.methodParameter;
        int iHashCode6 = jsonElement == null ? 0 : jsonElement.hashCode();
        String str6 = this.formatMethodNameAndParameter;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatMethodNameAndParameter(String str) {
        this.formatMethodNameAndParameter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Intention(supportIntentionFlag=" + this.supportIntentionFlag + ", intentionTypeIconUrlDay=" + this.intentionTypeIconUrlDay + ", intentionTypeIconUrlNight=" + this.intentionTypeIconUrlNight + ", intentionTypeLanguageText=" + this.intentionTypeLanguageText + ", methodName=" + this.methodName + ", methodParameter=" + this.methodParameter + ", formatMethodNameAndParameter=" + this.formatMethodNameAndParameter + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.supportIntentionFlag);
        parcel.writeString(this.intentionTypeIconUrlDay);
        parcel.writeString(this.intentionTypeIconUrlNight);
        parcel.writeString(this.intentionTypeLanguageText);
        parcel.writeString(this.methodName);
        parcel.writeString(this.formatMethodNameAndParameter);
    }

    public /* synthetic */ Intention(int i, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportIntentionFlag = null;
        } else {
            this.supportIntentionFlag = str;
        }
        if ((i & 2) == 0) {
            this.intentionTypeIconUrlDay = null;
        } else {
            this.intentionTypeIconUrlDay = str2;
        }
        if ((i & 4) == 0) {
            this.intentionTypeIconUrlNight = null;
        } else {
            this.intentionTypeIconUrlNight = str3;
        }
        if ((i & 8) == 0) {
            this.intentionTypeLanguageText = null;
        } else {
            this.intentionTypeLanguageText = str4;
        }
        if ((i & 16) == 0) {
            this.methodName = null;
        } else {
            this.methodName = str5;
        }
        if ((i & 32) == 0) {
            this.methodParameter = null;
        } else {
            this.methodParameter = jsonElement;
        }
        if ((i & 64) == 0) {
            this.formatMethodNameAndParameter = null;
        } else {
            this.formatMethodNameAndParameter = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Intention intention, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || intention.supportIntentionFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, intention.supportIntentionFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || intention.intentionTypeIconUrlDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, intention.intentionTypeIconUrlDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || intention.intentionTypeIconUrlNight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, intention.intentionTypeIconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || intention.intentionTypeLanguageText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, intention.intentionTypeLanguageText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || intention.methodName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, intention.methodName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || intention.methodParameter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, intention.methodParameter);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && intention.formatMethodNameAndParameter == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, intention.formatMethodNameAndParameter);
    }

    public Intention(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, String str6) {
        this.supportIntentionFlag = str;
        this.intentionTypeIconUrlDay = str2;
        this.intentionTypeIconUrlNight = str3;
        this.intentionTypeLanguageText = str4;
        this.methodName = str5;
        this.methodParameter = jsonElement;
        this.formatMethodNameAndParameter = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r12v0 kotlinx.serialization.json.JsonElement))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, java.lang.String):void (m)] (LINE:201) call: com.okinc.business.defi.biz.net.bean.Intention.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, java.lang.String):void type: THIS */
    public /* synthetic */ Intention(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : jsonElement, (i & 64) != 0 ? null : str6);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Intention.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Intention> serializer() {
            return Intention$$serializer.INSTANCE;
        }
    }
}
