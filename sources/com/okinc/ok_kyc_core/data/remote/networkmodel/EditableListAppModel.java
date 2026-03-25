package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class EditableListAppModel extends UIComponentAppModel {
    private static final KSerializer<Object>[] $childSerializers;
    private AddMore addMore;
    private Float bottomMargin;
    private List<EditableCopyModel> copyModels;
    private final int count;
    private final int defaultCount;
    private List<EditableCopyModel> defaultModels;
    private final Float deleteTopMargin;
    private String id;
    private int idNum;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private List<? extends UIComponentAppModel> template;
    private String value;
    private List<? extends HashMap<String, ValueAndName>> values;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditableListAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditableListAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditableListAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            int i3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList4.add(parcel.readParcelable(EditableListAppModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    int i7 = parcel.readInt();
                    HashMap map = new HashMap(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        map.put(parcel.readString(), parcel.readInt() == 0 ? null : ValueAndName.CREATOR.createFromParcel(parcel));
                    }
                    arrayList5.add(map);
                }
                arrayList = arrayList5;
            }
            AddMore addMoreCreateFromParcel = parcel.readInt() == 0 ? null : AddMore.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                arrayList6.add(EditableCopyModel.CREATOR.createFromParcel(parcel));
                i11++;
                i10 = i10;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList6;
                arrayList3 = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i12);
                arrayList2 = arrayList6;
                int i13 = 0;
                while (i13 != i12) {
                    arrayList7.add(EditableCopyModel.CREATOR.createFromParcel(parcel));
                    i13++;
                    i12 = i12;
                }
                arrayList3 = arrayList7;
            }
            return new EditableListAppModel(i, i2, fValueOf, boolValueOf, arrayList4, arrayList, addMoreCreateFromParcel, string, boolValueOf2, string2, string3, fValueOf2, fValueOf3, i9, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditableListAppModel[] newArray(int i) {
            return new EditableListAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditableListAppModel copy$default(EditableListAppModel editableListAppModel, int i, int i2, Float f, Boolean bool, List list, List list2, AddMore addMore, String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i3, List list3, List list4, int i4, Object obj) {
        return editableListAppModel.copy((i4 & 1) != 0 ? editableListAppModel.count : i, (i4 & 2) != 0 ? editableListAppModel.defaultCount : i2, (i4 & 4) != 0 ? editableListAppModel.deleteTopMargin : f, (i4 & 8) != 0 ? editableListAppModel.isHidden : bool, (i4 & 16) != 0 ? editableListAppModel.template : list, (i4 & 32) != 0 ? editableListAppModel.values : list2, (i4 & 64) != 0 ? editableListAppModel.addMore : addMore, (i4 & 128) != 0 ? editableListAppModel.id : str, (i4 & 256) != 0 ? editableListAppModel.required : bool2, (i4 & 512) != 0 ? editableListAppModel.version : str2, (i4 & 1024) != 0 ? editableListAppModel.value : str3, (i4 & 2048) != 0 ? editableListAppModel.bottomMargin : f2, (i4 & 4096) != 0 ? editableListAppModel.leftMargin : f3, (i4 & 8192) != 0 ? editableListAppModel.idNum : i3, (i4 & 16384) != 0 ? editableListAppModel.defaultModels : list3, (i4 & 32768) != 0 ? editableListAppModel.copyModels : list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.idNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EditableCopyModel> component15() {
        return this.defaultModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EditableCopyModel> component16() {
        return this.copyModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.defaultCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.deleteTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> component5() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, java.util.List<java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>> */
    public final List<HashMap<String, ValueAndName>> component6() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddMore component7() {
        return this.addMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditableListAppModel copy(int i, int i2, Float f, Boolean bool, @NotNull List<? extends UIComponentAppModel> list, List<? extends HashMap<String, ValueAndName>> list2, AddMore addMore, @NotNull String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i3, @NotNull List<EditableCopyModel> list3, List<EditableCopyModel> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new EditableListAppModel(i, i2, f, bool, list, list2, addMore, str, bool2, str2, str3, f2, f3, i3, list3, list4);
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
        if (!(obj instanceof EditableListAppModel)) {
            return false;
        }
        EditableListAppModel editableListAppModel = (EditableListAppModel) obj;
        return this.count == editableListAppModel.count && this.defaultCount == editableListAppModel.defaultCount && Intrinsics.EZpvd(this.deleteTopMargin, editableListAppModel.deleteTopMargin) && Intrinsics.EZpvd(this.isHidden, editableListAppModel.isHidden) && Intrinsics.EZpvd(this.template, editableListAppModel.template) && Intrinsics.EZpvd(this.values, editableListAppModel.values) && Intrinsics.EZpvd(this.addMore, editableListAppModel.addMore) && Intrinsics.EZpvd((Object) this.id, (Object) editableListAppModel.id) && Intrinsics.EZpvd(this.required, editableListAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) editableListAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) editableListAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, editableListAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, editableListAppModel.leftMargin) && this.idNum == editableListAppModel.idNum && Intrinsics.EZpvd(this.defaultModels, editableListAppModel.defaultModels) && Intrinsics.EZpvd(this.copyModels, editableListAppModel.copyModels);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddMore getAddMore() {
        return this.addMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EditableCopyModel> getCopyModels() {
        return this.copyModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDefaultCount() {
        return this.defaultCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EditableCopyModel> getDefaultModels() {
        return this.defaultModels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getDeleteTopMargin() {
        return this.deleteTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIdNum() {
        return this.idNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> getTemplate() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, java.util.List<java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>> */
    public final List<HashMap<String, ValueAndName>> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count);
        int iHashCode2 = Integer.hashCode(this.defaultCount);
        Float f = this.deleteTopMargin;
        int iHashCode3 = f == null ? 0 : f.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        int iHashCode5 = this.template.hashCode();
        List<? extends HashMap<String, ValueAndName>> list = this.values;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        AddMore addMore = this.addMore;
        int iHashCode7 = addMore == null ? 0 : addMore.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Float f2 = this.bottomMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.leftMargin;
        int iHashCode13 = f3 == null ? 0 : f3.hashCode();
        int iHashCode14 = Integer.hashCode(this.idNum);
        int iHashCode15 = this.defaultModels.hashCode();
        List<EditableCopyModel> list2 = this.copyModels;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (list2 == null ? 0 : list2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddMore(AddMore addMore) {
        this.addMore = addMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyModels(List<EditableCopyModel> list) {
        this.copyModels = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultModels(@NotNull List<EditableCopyModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.defaultModels = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdNum(int i) {
        this.idNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTemplate(@NotNull List<? extends UIComponentAppModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.template = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(List<? extends HashMap<String, ValueAndName>> list) {
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditableListAppModel(count=" + this.count + ", defaultCount=" + this.defaultCount + ", deleteTopMargin=" + this.deleteTopMargin + ", isHidden=" + this.isHidden + ", template=" + this.template + ", values=" + this.values + ", addMore=" + this.addMore + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", idNum=" + this.idNum + ", defaultModels=" + this.defaultModels + ", copyModels=" + this.copyModels + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.count);
        parcel.writeInt(this.defaultCount);
        Float f = this.deleteTopMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<? extends UIComponentAppModel> list = this.template;
        parcel.writeInt(list.size());
        Iterator<? extends UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<? extends HashMap<String, ValueAndName>> list2 = this.values;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (HashMap<String, ValueAndName> map : list2) {
                parcel.writeInt(map.size());
                for (Map.Entry<String, ValueAndName> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    ValueAndName value = entry.getValue();
                    if (value == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        value.writeToParcel(parcel, i);
                    }
                }
            }
        }
        AddMore addMore = this.addMore;
        if (addMore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addMore.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        Float f2 = this.bottomMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.leftMargin;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        parcel.writeInt(this.idNum);
        List<EditableCopyModel> list3 = this.defaultModels;
        parcel.writeInt(list3.size());
        Iterator<EditableCopyModel> it2 = list3.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<EditableCopyModel> list4 = this.copyModels;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        Iterator<EditableCopyModel> it3 = list4.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditableListAppModel> serializer() {
            return EditableListAppModel$$serializer.INSTANCE;
        }
    }

    static {
        EditableCopyModel$$serializer editableCopyModel$$serializer = EditableCopyModel$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), new ArrayListSerializer(new HashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ValueAndName$$serializer.INSTANCE))), null, null, null, null, null, null, null, null, new ArrayListSerializer(editableCopyModel$$serializer), new ArrayListSerializer(editableCopyModel$$serializer)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditableListAppModel(int i, int i2, int i3, Float f, Boolean bool, List list, List list2, AddMore addMore, String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i4, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (16016 != (i & 16016)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16016, EditableListAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.count = (i & 1) == 0 ? 1 : i2;
        this.defaultCount = (i & 2) == 0 ? 0 : i3;
        this.deleteTopMargin = (i & 4) == 0 ? Float.valueOf(0.0f) : f;
        this.isHidden = (i & 8) == 0 ? Boolean.FALSE : bool;
        this.template = list;
        if ((i & 32) == 0) {
            this.values = null;
        } else {
            this.values = list2;
        }
        if ((i & 64) == 0) {
            this.addMore = null;
        } else {
            this.addMore = addMore;
        }
        this.id = str;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f2;
        this.leftMargin = f3;
        this.idNum = i4;
        this.defaultModels = (i & 16384) == 0 ? new ArrayList() : list3;
        if ((i & 32768) == 0) {
            this.copyModels = null;
        } else {
            this.copyModels = list4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(EditableListAppModel editableListAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(editableListAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || editableListAppModel.count != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, editableListAppModel.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || editableListAppModel.defaultCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, editableListAppModel.defaultCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(editableListAppModel.deleteTopMargin, Float.valueOf(0.0f))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, editableListAppModel.deleteTopMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(editableListAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, editableListAppModel.isHidden());
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], editableListAppModel.template);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || editableListAppModel.values != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], editableListAppModel.values);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || editableListAppModel.addMore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, editableListAppModel.addMore);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, editableListAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(editableListAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, editableListAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, editableListAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, editableListAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, editableListAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, editableListAppModel.getLeftMargin());
        compositeEncoder.encodeIntElement(serialDescriptor, 13, editableListAppModel.idNum);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(editableListAppModel.defaultModels, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], editableListAppModel.defaultModels);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && editableListAppModel.copyModels == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], editableListAppModel.copyModels);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r20v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE (0.0f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED] (LINE:2488)) : (r22v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore))
  (r27v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.Float)
  (r32v0 java.lang.Float)
  (r33v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:2500) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r34v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0057: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r35v0 java.util.List))
 A[MD:(int, int, java.lang.Float, java.lang.Boolean, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, int, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.EditableCopyModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.EditableCopyModel>):void (m)] (LINE:2485) call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel.<init>(int, int, java.lang.Float, java.lang.Boolean, java.util.List, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, int, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ EditableListAppModel(int i, int i2, Float f, Boolean bool, List list, List list2, AddMore addMore, String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i3, List list3, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? Float.valueOf(0.0f) : f, (i4 & 8) != 0 ? Boolean.FALSE : bool, list, (i4 & 32) != 0 ? null : list2, (i4 & 64) != 0 ? null : addMore, str, (i4 & 256) != 0 ? Boolean.FALSE : bool2, str2, str3, f2, f3, i3, (i4 & 16384) != 0 ? new ArrayList() : list3, (i4 & 32768) != 0 ? null : list4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableListAppModel(int i, int i2, Float f, Boolean bool, @NotNull List<? extends UIComponentAppModel> list, List<? extends HashMap<String, ValueAndName>> list2, AddMore addMore, @NotNull String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i3, @NotNull List<EditableCopyModel> list3, List<EditableCopyModel> list4) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.count = i;
        this.defaultCount = i2;
        this.deleteTopMargin = f;
        this.isHidden = bool;
        this.template = list;
        this.values = list2;
        this.addMore = addMore;
        this.id = str;
        this.required = bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f2;
        this.leftMargin = f3;
        this.idNum = i3;
        this.defaultModels = list3;
        this.copyModels = list4;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public EditableListAppModel clone() {
        return copy$default(this, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 65535, null);
    }
}
