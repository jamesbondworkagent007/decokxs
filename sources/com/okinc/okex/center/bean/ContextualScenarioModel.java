package com.okinc.okex.center.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.enums.ContextualScenario;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ContextualScenarioModel implements Parcelable {
    private final String cause;
    private final String dataTrackingKey;
    private final String description;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final ContextualScenario scenario;
    private final String slug;
    private final List<String> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContextualScenarioModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, ContextualScenario.Companion.serializer(), null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ContextualScenarioModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContextualScenarioModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ContextualScenarioModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ContextualScenario.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContextualScenarioModel[] newArray(int i) {
            return new ContextualScenarioModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContextualScenarioModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContextualScenario) null, (String) null, (List) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario component7() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ContextualScenario contextualScenario, @NotNull String str7, @NotNull List<String> list, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ContextualScenarioModel(str, str2, str3, str4, str5, str6, contextualScenario, str7, list, str8);
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
        if (!(obj instanceof ContextualScenarioModel)) {
            return false;
        }
        ContextualScenarioModel contextualScenarioModel = (ContextualScenarioModel) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) contextualScenarioModel.id) && Intrinsics.EZpvd((Object) this.cause, (Object) contextualScenarioModel.cause) && Intrinsics.EZpvd((Object) this.dataTrackingKey, (Object) contextualScenarioModel.dataTrackingKey) && Intrinsics.EZpvd((Object) this.description, (Object) contextualScenarioModel.description) && Intrinsics.EZpvd((Object) this.iconBright, (Object) contextualScenarioModel.iconBright) && Intrinsics.EZpvd((Object) this.iconDark, (Object) contextualScenarioModel.iconDark) && this.scenario == contextualScenarioModel.scenario && Intrinsics.EZpvd((Object) this.slug, (Object) contextualScenarioModel.slug) && Intrinsics.EZpvd(this.tags, contextualScenarioModel.tags) && Intrinsics.EZpvd((Object) this.title, (Object) contextualScenarioModel.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCause() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataTrackingKey() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenario getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.cause.hashCode()) * 31) + this.dataTrackingKey.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconBright.hashCode()) * 31) + this.iconDark.hashCode()) * 31) + this.scenario.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContextualScenarioModel(id=" + this.id + ", cause=" + this.cause + ", dataTrackingKey=" + this.dataTrackingKey + ", description=" + this.description + ", iconBright=" + this.iconBright + ", iconDark=" + this.iconDark + ", scenario=" + this.scenario + ", slug=" + this.slug + ", tags=" + this.tags + ", title=" + this.title + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.cause);
        parcel.writeString(this.dataTrackingKey);
        parcel.writeString(this.description);
        parcel.writeString(this.iconBright);
        parcel.writeString(this.iconDark);
        parcel.writeString(this.scenario.name());
        parcel.writeString(this.slug);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.title);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.ContextualScenarioModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContextualScenarioModel> serializer() {
            return ContextualScenarioModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContextualScenarioModel(int i, String str, String str2, String str3, String str4, String str5, String str6, ContextualScenario contextualScenario, String str7, List list, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.cause = "";
        } else {
            this.cause = str2;
        }
        if ((i & 4) == 0) {
            this.dataTrackingKey = "";
        } else {
            this.dataTrackingKey = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.iconBright = "";
        } else {
            this.iconBright = str5;
        }
        if ((i & 32) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str6;
        }
        if ((i & 64) == 0) {
            this.scenario = ContextualScenario.Unknown;
        } else {
            this.scenario = contextualScenario;
        }
        if ((i & 128) == 0) {
            this.slug = "";
        } else {
            this.slug = str7;
        }
        if ((i & 256) == 0) {
            this.tags = yDY.AhwBna();
        } else {
            this.tags = list;
        }
        if ((i & 512) == 0) {
            this.title = "";
        } else {
            this.title = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ContextualScenarioModel contextualScenarioModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contextualScenarioModel.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contextualScenarioModel.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contextualScenarioModel.cause, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contextualScenarioModel.cause);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contextualScenarioModel.dataTrackingKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contextualScenarioModel.dataTrackingKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contextualScenarioModel.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, contextualScenarioModel.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) contextualScenarioModel.iconBright, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, contextualScenarioModel.iconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) contextualScenarioModel.iconDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, contextualScenarioModel.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || contextualScenarioModel.scenario != ContextualScenario.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], contextualScenarioModel.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) contextualScenarioModel.slug, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, contextualScenarioModel.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(contextualScenarioModel.tags, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], contextualScenarioModel.tags);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) contextualScenarioModel.title, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, contextualScenarioModel.title);
    }

    public ContextualScenarioModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ContextualScenario contextualScenario, @NotNull String str7, @NotNull List<String> list, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.id = str;
        this.cause = str2;
        this.dataTrackingKey = str3;
        this.description = str4;
        this.iconBright = str5;
        this.iconDark = str6;
        this.scenario = contextualScenario;
        this.slug = str7;
        this.tags = list;
        this.title = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.ContextualScenario:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] (LINE:19) com.okinc.okex.center.bean.enums.ContextualScenario.Unknown com.okinc.okex.center.bean.enums.ContextualScenario) : (r18v0 com.okinc.okex.center.bean.enums.ContextualScenario))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.ContextualScenario, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:12) call: com.okinc.okex.center.bean.ContextualScenarioModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.ContextualScenario, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ ContextualScenarioModel(String str, String str2, String str3, String str4, String str5, String str6, ContextualScenario contextualScenario, String str7, List list, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? ContextualScenario.Unknown : contextualScenario, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) == 0 ? str8 : "");
    }
}
