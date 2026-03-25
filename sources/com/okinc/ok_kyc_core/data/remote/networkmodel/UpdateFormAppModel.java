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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UpdateFormAppModel extends PageComponentAppModel implements Cloneable {
    private final String id;
    private List<? extends UIComponentAppModel> items;
    private final Boolean pageStack;
    private String pageTitle;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UpdateFormAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<UpdateFormAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateFormAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(UpdateFormAppModel.class.getClassLoader()));
            }
            return new UpdateFormAppModel(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateFormAppModel[] newArray(int i) {
            return new UpdateFormAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateFormAppModel copy(@NotNull List<? extends UIComponentAppModel> list, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new UpdateFormAppModel(list, str, str2, bool, str3, str4, str5, str6, bool2);
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
        if (!(obj instanceof UpdateFormAppModel)) {
            return false;
        }
        UpdateFormAppModel updateFormAppModel = (UpdateFormAppModel) obj;
        return Intrinsics.EZpvd(this.items, updateFormAppModel.items) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) updateFormAppModel.pageTitle) && Intrinsics.EZpvd((Object) this.id, (Object) updateFormAppModel.id) && Intrinsics.EZpvd(this.required, updateFormAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) updateFormAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) updateFormAppModel.value) && Intrinsics.EZpvd((Object) this.title, (Object) updateFormAppModel.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) updateFormAppModel.subtitle) && Intrinsics.EZpvd(this.pageStack, updateFormAppModel.pageStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.items.hashCode();
        String str = this.pageTitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.required;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.title;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subtitle;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Boolean bool2 = this.pageStack;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItems(@NotNull List<? extends UIComponentAppModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageTitle(String str) {
        this.pageTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateFormAppModel(items=" + this.items + ", pageTitle=" + this.pageTitle + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<? extends UIComponentAppModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<? extends UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.pageTitle);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateFormAppModel> serializer() {
            return UpdateFormAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateFormAppModel(int i, List list, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (241 != (i & 241)) {
            PluginExceptionsKt.throwMissingFieldException(i, 241, UpdateFormAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        if ((i & 4) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i & 8) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        if ((i & 256) == 0) {
            this.pageStack = Boolean.FALSE;
        } else {
            this.pageStack = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(UpdateFormAppModel updateFormAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponentAppModel.write$Self(updateFormAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], updateFormAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || updateFormAppModel.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, updateFormAppModel.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || updateFormAppModel.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, updateFormAppModel.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(updateFormAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, updateFormAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, updateFormAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, updateFormAppModel.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, updateFormAppModel.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, updateFormAppModel.getSubtitle());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(updateFormAppModel.getPageStack(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, updateFormAppModel.getPageStack());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r14v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
 A[MD:(java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:465) call: com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ UpdateFormAppModel(List list, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, str3, str4, str5, str6, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFormAppModel(@NotNull List<? extends UIComponentAppModel> list, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.pageTitle = str;
        this.id = str2;
        this.required = bool;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FormAppModel m6828clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.copydefault(objClone, "");
        return (FormAppModel) objClone;
    }
}
