package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Value implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String countryFlagUrl;
    private final Boolean display;
    private List<String> displayedItemIds;
    private final Boolean enabled;
    private final String graphic;
    private final Boolean hasArrow;
    private final String helperText;
    private List<String> hiddenItemIds;
    private final String icon;
    private String iconBackgroundColor;
    private String iconTextColor;
    private final String image;
    private Boolean isExclusive;
    private final Boolean isValid;
    private List<String> picture;
    private PictureMeta pictureMeta;
    private ChoiceReminder reminder;
    private final List<String> searchKey;
    private Boolean selected;
    private SubInput subInput;
    private final String text;
    private final String thumbnail;
    private final String tip;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Value> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Value> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Value createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            SubInput subInputCreateFromParcel = parcel.readInt() == 0 ? null : SubInput.CREATOR.createFromParcel(parcel);
            ChoiceReminder choiceReminderCreateFromParcel = parcel.readInt() == 0 ? null : ChoiceReminder.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            PictureMeta pictureMetaCreateFromParcel = parcel.readInt() == 0 ? null : PictureMeta.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Value(arrayListCreateStringArrayList, string, string2, string3, boolValueOf, string4, string5, string6, boolValueOf2, boolValueOf3, boolValueOf4, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, subInputCreateFromParcel, choiceReminderCreateFromParcel, arrayListCreateStringArrayList4, string7, string8, string9, boolValueOf5, pictureMetaCreateFromParcel, string10, string11, boolValueOf6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Value[] newArray(int i) {
            return new Value[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.hasArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.hiddenItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.displayedItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput component14() {
        return this.subInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChoiceReminder component15() {
        return this.reminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component16() {
        return this.picture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.helperText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.countryFlagUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.display;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PictureMeta component21() {
        return this.pictureMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.iconTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.iconBackgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component24() {
        return this.isExclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.graphic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Value copy(List<String> list, String str, String str2, String str3, Boolean bool, @NotNull String str4, String str5, @NotNull String str6, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3, SubInput subInput, ChoiceReminder choiceReminder, List<String> list4, String str7, String str8, String str9, Boolean bool5, PictureMeta pictureMeta, String str10, String str11, Boolean bool6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new Value(list, str, str2, str3, bool, str4, str5, str6, bool2, bool3, bool4, list2, list3, subInput, choiceReminder, list4, str7, str8, str9, bool5, pictureMeta, str10, str11, bool6);
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
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return Intrinsics.EZpvd(this.searchKey, value.searchKey) && Intrinsics.EZpvd((Object) this.icon, (Object) value.icon) && Intrinsics.EZpvd((Object) this.image, (Object) value.image) && Intrinsics.EZpvd((Object) this.graphic, (Object) value.graphic) && Intrinsics.EZpvd(this.selected, value.selected) && Intrinsics.EZpvd((Object) this.text, (Object) value.text) && Intrinsics.EZpvd((Object) this.tip, (Object) value.tip) && Intrinsics.EZpvd((Object) this.value, (Object) value.value) && Intrinsics.EZpvd(this.enabled, value.enabled) && Intrinsics.EZpvd(this.hasArrow, value.hasArrow) && Intrinsics.EZpvd(this.isValid, value.isValid) && Intrinsics.EZpvd(this.hiddenItemIds, value.hiddenItemIds) && Intrinsics.EZpvd(this.displayedItemIds, value.displayedItemIds) && Intrinsics.EZpvd(this.subInput, value.subInput) && Intrinsics.EZpvd(this.reminder, value.reminder) && Intrinsics.EZpvd(this.picture, value.picture) && Intrinsics.EZpvd((Object) this.thumbnail, (Object) value.thumbnail) && Intrinsics.EZpvd((Object) this.helperText, (Object) value.helperText) && Intrinsics.EZpvd((Object) this.countryFlagUrl, (Object) value.countryFlagUrl) && Intrinsics.EZpvd(this.display, value.display) && Intrinsics.EZpvd(this.pictureMeta, value.pictureMeta) && Intrinsics.EZpvd((Object) this.iconTextColor, (Object) value.iconTextColor) && Intrinsics.EZpvd((Object) this.iconBackgroundColor, (Object) value.iconBackgroundColor) && Intrinsics.EZpvd(this.isExclusive, value.isExclusive);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryFlagUrl() {
        return this.countryFlagUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisplay() {
        return this.display;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDisplayedItemIds() {
        return this.displayedItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGraphic() {
        return this.graphic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasArrow() {
        return this.hasArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHelperText() {
        return this.helperText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHiddenItemIds() {
        return this.hiddenItemIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconTextColor() {
        return this.iconTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPicture() {
        return this.picture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PictureMeta getPictureMeta() {
        return this.pictureMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChoiceReminder getReminder() {
        return this.reminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSearchKey() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput getSubInput() {
        return this.subInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.searchKey;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.icon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.image;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.graphic;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.selected;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        int iHashCode6 = this.text.hashCode();
        String str4 = this.tip;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = this.value.hashCode();
        Boolean bool2 = this.enabled;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.hasArrow;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.isValid;
        int iHashCode11 = bool4 == null ? 0 : bool4.hashCode();
        List<String> list2 = this.hiddenItemIds;
        int iHashCode12 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.displayedItemIds;
        int iHashCode13 = list3 == null ? 0 : list3.hashCode();
        SubInput subInput = this.subInput;
        int iHashCode14 = subInput == null ? 0 : subInput.hashCode();
        ChoiceReminder choiceReminder = this.reminder;
        int iHashCode15 = choiceReminder == null ? 0 : choiceReminder.hashCode();
        List<String> list4 = this.picture;
        int iHashCode16 = list4 == null ? 0 : list4.hashCode();
        String str5 = this.thumbnail;
        int iHashCode17 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.helperText;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.countryFlagUrl;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        Boolean bool5 = this.display;
        int iHashCode20 = bool5 == null ? 0 : bool5.hashCode();
        PictureMeta pictureMeta = this.pictureMeta;
        int iHashCode21 = pictureMeta == null ? 0 : pictureMeta.hashCode();
        String str8 = this.iconTextColor;
        int iHashCode22 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.iconBackgroundColor;
        int iHashCode23 = str9 == null ? 0 : str9.hashCode();
        Boolean bool6 = this.isExclusive;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (bool6 == null ? 0 : bool6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isExclusive() {
        return this.isExclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isValid() {
        return this.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayedItemIds(List<String> list) {
        this.displayedItemIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExclusive(Boolean bool) {
        this.isExclusive = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHiddenItemIds(List<String> list) {
        this.hiddenItemIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconBackgroundColor(String str) {
        this.iconBackgroundColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconTextColor(String str) {
        this.iconTextColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPicture(List<String> list) {
        this.picture = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPictureMeta(PictureMeta pictureMeta) {
        this.pictureMeta = pictureMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReminder(ChoiceReminder choiceReminder) {
        this.reminder = choiceReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubInput(SubInput subInput) {
        this.subInput = subInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Value(searchKey=" + this.searchKey + ", icon=" + this.icon + ", image=" + this.image + ", graphic=" + this.graphic + ", selected=" + this.selected + ", text=" + this.text + ", tip=" + this.tip + ", value=" + this.value + ", enabled=" + this.enabled + ", hasArrow=" + this.hasArrow + ", isValid=" + this.isValid + ", hiddenItemIds=" + this.hiddenItemIds + ", displayedItemIds=" + this.displayedItemIds + ", subInput=" + this.subInput + ", reminder=" + this.reminder + ", picture=" + this.picture + ", thumbnail=" + this.thumbnail + ", helperText=" + this.helperText + ", countryFlagUrl=" + this.countryFlagUrl + ", display=" + this.display + ", pictureMeta=" + this.pictureMeta + ", iconTextColor=" + this.iconTextColor + ", iconBackgroundColor=" + this.iconBackgroundColor + ", isExclusive=" + this.isExclusive + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.searchKey);
        parcel.writeString(this.icon);
        parcel.writeString(this.image);
        parcel.writeString(this.graphic);
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.tip);
        parcel.writeString(this.value);
        Boolean bool2 = this.enabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hasArrow;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isValid;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.hiddenItemIds);
        parcel.writeStringList(this.displayedItemIds);
        SubInput subInput = this.subInput;
        if (subInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subInput.writeToParcel(parcel, i);
        }
        ChoiceReminder choiceReminder = this.reminder;
        if (choiceReminder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            choiceReminder.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.picture);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.helperText);
        parcel.writeString(this.countryFlagUrl);
        Boolean bool5 = this.display;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        PictureMeta pictureMeta = this.pictureMeta;
        if (pictureMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pictureMeta.writeToParcel(parcel, i);
        }
        parcel.writeString(this.iconTextColor);
        parcel.writeString(this.iconBackgroundColor);
        Boolean bool6 = this.isExclusive;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Value.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Value> serializer() {
            return Value$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Value(int i, List list, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, List list2, List list3, SubInput subInput, ChoiceReminder choiceReminder, List list4, String str7, String str8, String str9, Boolean bool5, PictureMeta pictureMeta, String str10, String str11, Boolean bool6, SerializationConstructorMarker serializationConstructorMarker) {
        if (160 != (i & CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256)) {
            PluginExceptionsKt.throwMissingFieldException(i, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, Value$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.searchKey = null;
        } else {
            this.searchKey = list;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 4) == 0) {
            this.image = null;
        } else {
            this.image = str2;
        }
        if ((i & 8) == 0) {
            this.graphic = null;
        } else {
            this.graphic = str3;
        }
        this.selected = (i & 16) == 0 ? Boolean.FALSE : bool;
        this.text = str4;
        this.tip = (i & 64) == 0 ? "" : str5;
        this.value = str6;
        this.enabled = (i & 256) == 0 ? Boolean.TRUE : bool2;
        this.hasArrow = (i & 512) == 0 ? Boolean.FALSE : bool3;
        this.isValid = (i & 1024) == 0 ? Boolean.TRUE : bool4;
        if ((i & 2048) == 0) {
            this.hiddenItemIds = null;
        } else {
            this.hiddenItemIds = list2;
        }
        if ((i & 4096) == 0) {
            this.displayedItemIds = null;
        } else {
            this.displayedItemIds = list3;
        }
        if ((i & 8192) == 0) {
            this.subInput = null;
        } else {
            this.subInput = subInput;
        }
        if ((i & 16384) == 0) {
            this.reminder = null;
        } else {
            this.reminder = choiceReminder;
        }
        if ((32768 & i) == 0) {
            this.picture = null;
        } else {
            this.picture = list4;
        }
        if ((65536 & i) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str7;
        }
        if ((131072 & i) == 0) {
            this.helperText = null;
        } else {
            this.helperText = str8;
        }
        if ((262144 & i) == 0) {
            this.countryFlagUrl = null;
        } else {
            this.countryFlagUrl = str9;
        }
        this.display = (524288 & i) == 0 ? Boolean.FALSE : bool5;
        if ((1048576 & i) == 0) {
            this.pictureMeta = null;
        } else {
            this.pictureMeta = pictureMeta;
        }
        if ((2097152 & i) == 0) {
            this.iconTextColor = null;
        } else {
            this.iconTextColor = str10;
        }
        if ((4194304 & i) == 0) {
            this.iconBackgroundColor = null;
        } else {
            this.iconBackgroundColor = str11;
        }
        if ((i & 8388608) == 0) {
            this.isExclusive = null;
        } else {
            this.isExclusive = bool6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Value value, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || value.searchKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], value.searchKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || value.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, value.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || value.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, value.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || value.graphic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, value.graphic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(value.selected, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, value.selected);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, value.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) value.tip, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, value.tip);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, value.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(value.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, value.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(value.hasArrow, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, value.hasArrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(value.isValid, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, value.isValid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || value.hiddenItemIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], value.hiddenItemIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || value.displayedItemIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], value.displayedItemIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || value.subInput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, SubInput$$serializer.INSTANCE, value.subInput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || value.reminder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, ChoiceReminder$$serializer.INSTANCE, value.reminder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || value.picture != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], value.picture);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || value.thumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, value.thumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || value.helperText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, value.helperText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || value.countryFlagUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, value.countryFlagUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(value.display, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, value.display);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || value.pictureMeta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, PictureMeta$$serializer.INSTANCE, value.pictureMeta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || value.iconTextColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, value.iconTextColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || value.iconBackgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, value.iconBackgroundColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && value.isExclusive == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.INSTANCE, value.isExclusive);
    }

    public Value(List<String> list, String str, String str2, String str3, Boolean bool, @NotNull String str4, String str5, @NotNull String str6, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list2, List<String> list3, SubInput subInput, ChoiceReminder choiceReminder, List<String> list4, String str7, String str8, String str9, Boolean bool5, PictureMeta pictureMeta, String str10, String str11, Boolean bool6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.searchKey = list;
        this.icon = str;
        this.image = str2;
        this.graphic = str3;
        this.selected = bool;
        this.text = str4;
        this.tip = str5;
        this.value = str6;
        this.enabled = bool2;
        this.hasArrow = bool3;
        this.isValid = bool4;
        this.hiddenItemIds = list2;
        this.displayedItemIds = list3;
        this.subInput = subInput;
        this.reminder = choiceReminder;
        this.picture = list4;
        this.thumbnail = str7;
        this.helperText = str8;
        this.countryFlagUrl = str9;
        this.display = bool5;
        this.pictureMeta = pictureMeta;
        this.iconTextColor = str10;
        this.iconBackgroundColor = str11;
        this.isExclusive = bool6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r53v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r53v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r53v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r53v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (r34v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r53v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (r36v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r53v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r53v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r53v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r53v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r53v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r41v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput:?: TERNARY null = ((wrap:int:0x0066: ARITH (r53v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput) : (r42v0 com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder:?: TERNARY null = ((wrap:int:0x006f: ARITH (r53v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder) : (r43v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007b: ARITH (32768 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r44v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (65536 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (131072 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (262144 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (524288 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a8: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r48v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta:?: TERNARY null = ((wrap:int:0x00af: ARITH (1048576 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta) : (r49v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (2097152 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (4194304 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r53v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r52v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:4182) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Value.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ Value(List list, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, List list2, List list3, SubInput subInput, ChoiceReminder choiceReminder, List list4, String str7, String str8, String str9, Boolean bool5, PictureMeta pictureMeta, String str10, String str11, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? Boolean.FALSE : bool, str4, (i & 64) != 0 ? "" : str5, str6, (i & 256) != 0 ? Boolean.TRUE : bool2, (i & 512) != 0 ? Boolean.FALSE : bool3, (i & 1024) != 0 ? Boolean.TRUE : bool4, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : list3, (i & 8192) != 0 ? null : subInput, (i & 16384) != 0 ? null : choiceReminder, (32768 & i) != 0 ? null : list4, (65536 & i) != 0 ? null : str7, (131072 & i) != 0 ? null : str8, (262144 & i) != 0 ? null : str9, (524288 & i) != 0 ? Boolean.FALSE : bool5, (1048576 & i) != 0 ? null : pictureMeta, (2097152 & i) != 0 ? null : str10, (4194304 & i) != 0 ? null : str11, (i & 8388608) != 0 ? null : bool6);
    }
}
