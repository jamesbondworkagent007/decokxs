package com.okinc.ok_kyc_core_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CompliancePostOnboardingModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Map<String, String> ctaValue;
    private String id;
    private String playbook;
    private HashMap<String, String> playbookParams;
    private String target;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CompliancePostOnboardingModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CompliancePostOnboardingModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompliancePostOnboardingModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            int i2 = 0;
            for (int i3 = 0; i3 != i; i3++) {
                map.put(parcel.readString(), parcel.readString());
            }
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
            while (true) {
                String string3 = parcel.readString();
                if (i2 == i4) {
                    return new CompliancePostOnboardingModel(string, map, string2, linkedHashMap, string3);
                }
                linkedHashMap.put(string3, parcel.readString());
                i2++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompliancePostOnboardingModel[] newArray(int i) {
            return new CompliancePostOnboardingModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompliancePostOnboardingModel copy$default(CompliancePostOnboardingModel compliancePostOnboardingModel, String str, HashMap map, String str2, Map map2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compliancePostOnboardingModel.playbook;
        }
        if ((i & 2) != 0) {
            map = compliancePostOnboardingModel.playbookParams;
        }
        HashMap map3 = map;
        if ((i & 4) != 0) {
            str2 = compliancePostOnboardingModel.target;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            map2 = compliancePostOnboardingModel.ctaValue;
        }
        Map map4 = map2;
        if ((i & 16) != 0) {
            str3 = compliancePostOnboardingModel.id;
        }
        return compliancePostOnboardingModel.copy(str, map3, str4, map4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component2() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component4() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompliancePostOnboardingModel copy(@NotNull String str, @NotNull HashMap<String, String> map, @NotNull String str2, @NotNull Map<String, String> map2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CompliancePostOnboardingModel(str, map, str2, map2, str3);
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
        if (!(obj instanceof CompliancePostOnboardingModel)) {
            return false;
        }
        CompliancePostOnboardingModel compliancePostOnboardingModel = (CompliancePostOnboardingModel) obj;
        return Intrinsics.EZpvd((Object) this.playbook, (Object) compliancePostOnboardingModel.playbook) && Intrinsics.EZpvd(this.playbookParams, compliancePostOnboardingModel.playbookParams) && Intrinsics.EZpvd((Object) this.target, (Object) compliancePostOnboardingModel.target) && Intrinsics.EZpvd(this.ctaValue, compliancePostOnboardingModel.ctaValue) && Intrinsics.EZpvd((Object) this.id, (Object) compliancePostOnboardingModel.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getCtaValue() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getPlaybookParams() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.playbook.hashCode() * 31) + this.playbookParams.hashCode()) * 31) + this.target.hashCode()) * 31) + this.ctaValue.hashCode()) * 31) + this.id.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaValue(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.ctaValue = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybookParams(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.playbookParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.target = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompliancePostOnboardingModel(playbook=" + this.playbook + ", playbookParams=" + this.playbookParams + ", target=" + this.target + ", ctaValue=" + this.ctaValue + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.playbook);
        HashMap<String, String> map = this.playbookParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.target);
        Map<String, String> map2 = this.ctaValue;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        parcel.writeString(this.id);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CompliancePostOnboardingModel> serializer() {
            return CompliancePostOnboardingModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new HashMapSerializer(stringSerializer, stringSerializer), null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ CompliancePostOnboardingModel(int i, String str, HashMap map, String str2, Map map2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, CompliancePostOnboardingModel$$serializer.INSTANCE.getDescriptor());
        }
        this.playbook = str;
        this.playbookParams = map;
        this.target = str2;
        if ((i & 8) == 0) {
            this.ctaValue = new LinkedHashMap();
        } else {
            this.ctaValue = map2;
        }
        this.id = str3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(CompliancePostOnboardingModel compliancePostOnboardingModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, compliancePostOnboardingModel.playbook);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], compliancePostOnboardingModel.playbookParams);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, compliancePostOnboardingModel.target);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(compliancePostOnboardingModel.ctaValue, new LinkedHashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], compliancePostOnboardingModel.ctaValue);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, compliancePostOnboardingModel.id);
    }

    public CompliancePostOnboardingModel(@NotNull String str, @NotNull HashMap<String, String> map, @NotNull String str2, @NotNull Map<String, String> map2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.playbook = str;
        this.playbookParams = map;
        this.target = str2;
        this.ctaValue = map2;
        this.id = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.util.HashMap)
  (r9v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:15) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.Map))
  (r11v0 java.lang.String)
 A[MD:(java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:11) call: com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel.<init>(java.lang.String, java.util.HashMap, java.lang.String, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ CompliancePostOnboardingModel(String str, HashMap map, String str2, Map map2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, str2, (i & 8) != 0 ? new LinkedHashMap() : map2, str3);
    }
}
