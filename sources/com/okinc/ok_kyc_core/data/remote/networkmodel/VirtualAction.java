package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SerialName("virtual")
@Serializable
public final class VirtualAction extends PageComponent {
    private final Cta cta;
    private final String id;
    private final Boolean pageStack;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VirtualAction> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VirtualAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Cta cta = (Cta) parcel.readParcelable(VirtualAction.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VirtualAction(cta, string, boolValueOf, string2, string3, string4, string5, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualAction[] newArray(int i) {
            return new VirtualAction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component1() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VirtualAction copy(Cta cta, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2) {
        return new VirtualAction(cta, str, bool, str2, str3, str4, str5, bool2);
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
        if (!(obj instanceof VirtualAction)) {
            return false;
        }
        VirtualAction virtualAction = (VirtualAction) obj;
        return Intrinsics.EZpvd(this.cta, virtualAction.cta) && Intrinsics.EZpvd((Object) this.id, (Object) virtualAction.id) && Intrinsics.EZpvd(this.required, virtualAction.required) && Intrinsics.EZpvd((Object) this.version, (Object) virtualAction.version) && Intrinsics.EZpvd((Object) this.value, (Object) virtualAction.value) && Intrinsics.EZpvd((Object) this.title, (Object) virtualAction.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) virtualAction.subtitle) && Intrinsics.EZpvd(this.pageStack, virtualAction.pageStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Cta cta = this.cta;
        int iHashCode = cta == null ? 0 : cta.hashCode();
        String str = this.id;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.required;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str2 = this.version;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subtitle;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Boolean bool2 = this.pageStack;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VirtualAction(cta=" + this.cta + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.cta, i);
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool2 = this.pageStack;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VirtualAction> serializer() {
            return VirtualAction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VirtualAction(int i, Cta cta, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (248 != (i & 248)) {
            PluginExceptionsKt.throwMissingFieldException(i, 248, VirtualAction$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str2;
        this.value = str3;
        this.title = str4;
        this.subtitle = str5;
        this.pageStack = bool2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(VirtualAction virtualAction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(virtualAction, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || virtualAction.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Cta$$serializer.INSTANCE, virtualAction.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || virtualAction.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, virtualAction.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(virtualAction.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, virtualAction.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, virtualAction.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, virtualAction.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, virtualAction.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, virtualAction.getSubtitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, virtualAction.getPageStack());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r12v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Boolean)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:543) call: com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualAction.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ VirtualAction(Cta cta, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cta, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Boolean.FALSE : bool, str2, str3, str4, str5, bool2);
    }

    public VirtualAction(Cta cta, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2) {
        super(null);
        this.cta = cta;
        this.id = str;
        this.required = bool;
        this.version = str2;
        this.value = str3;
        this.title = str4;
        this.subtitle = str5;
        this.pageStack = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public VirtualActionAppModel toAppModel() {
        Cta cta = this.cta;
        return new VirtualActionAppModel(cta != null ? cta.toAppModel() : null, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), (Boolean) null, 128, (DefaultConstructorMarker) null);
    }
}
