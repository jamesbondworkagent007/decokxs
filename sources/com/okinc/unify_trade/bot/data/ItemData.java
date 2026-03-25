package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ItemData implements Parcelable {
    public String attachViewType;
    public boolean disablePadding;
    public int iconWidth;
    public final String isDoubt;
    public final boolean isLine;
    public final boolean isMedium;
    public boolean isRightClickable;
    public String isRightDoubt;
    public final boolean isRightEditable;
    public boolean isRightEnter;
    public String leftAttachViewType;
    public String leftDoubtTitle;
    public final TacticsUiConst.BotListSubItemType leftSubItemType;
    public String leftText;
    public String rightClickType;
    public String rightClickValue;
    public String rightEditType;
    public String rightEnterText;
    public String rightImage;
    public final ItemDataToggle rightToggle;
    public int rightTvColor;
    public boolean showAvatar;
    public String text;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ItemData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(TacticsUiConst.BotListSubItemType.class), new Annotation[0]), null, null};

    public static final class Creator implements Parcelable.Creator<ItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ItemDataToggle.CREATOR.createFromParcel(parcel), (TacticsUiConst.BotListSubItemType) parcel.readParcelable(ItemData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemData[] newArray(int i) {
            return new ItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ItemData() {
        this((String) null, (String) null, false, 0, (String) null, (String) null, false, false, (String) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 0, false, (String) null, (String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightEnterText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.rightClickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.rightClickValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemDataToggle AkhnZx() {
        return this.rightToggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.isDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.leftAttachViewType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isRightDoubt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.attachViewType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.attachViewType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.isRightClickable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.disablePadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.iconWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemData copydefault(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4, boolean z2, boolean z3, @NotNull String str5, boolean z4, boolean z5, @NotNull String str6, @NotNull String str7, boolean z6, @NotNull String str8, @NotNull String str9, int i2, boolean z7, @NotNull String str10, String str11, ItemDataToggle itemDataToggle, TacticsUiConst.BotListSubItemType botListSubItemType, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new ItemData(str, str2, z, i, str3, str4, z2, z3, str5, z4, z5, str6, str7, z6, str8, str9, i2, z7, str10, str11, itemDataToggle, botListSubItemType, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightClickType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.isRightEnter = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsUiConst.BotListSubItemType djBIcL() {
        return this.leftSubItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.isMedium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemData)) {
            return false;
        }
        ItemData itemData = (ItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) itemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) itemData.text) && this.isLine == itemData.isLine && this.rightTvColor == itemData.rightTvColor && Intrinsics.EZpvd((Object) this.rightImage, (Object) itemData.rightImage) && Intrinsics.EZpvd((Object) this.isDoubt, (Object) itemData.isDoubt) && this.isMedium == itemData.isMedium && this.isRightClickable == itemData.isRightClickable && Intrinsics.EZpvd((Object) this.isRightDoubt, (Object) itemData.isRightDoubt) && this.isRightEditable == itemData.isRightEditable && this.isRightEnter == itemData.isRightEnter && Intrinsics.EZpvd((Object) this.rightClickType, (Object) itemData.rightClickType) && Intrinsics.EZpvd((Object) this.rightClickValue, (Object) itemData.rightClickValue) && this.showAvatar == itemData.showAvatar && Intrinsics.EZpvd((Object) this.rightEnterText, (Object) itemData.rightEnterText) && Intrinsics.EZpvd((Object) this.rightEditType, (Object) itemData.rightEditType) && this.iconWidth == itemData.iconWidth && this.disablePadding == itemData.disablePadding && Intrinsics.EZpvd((Object) this.attachViewType, (Object) itemData.attachViewType) && Intrinsics.EZpvd((Object) this.leftDoubtTitle, (Object) itemData.leftDoubtTitle) && Intrinsics.EZpvd(this.rightToggle, itemData.rightToggle) && Intrinsics.EZpvd(this.leftSubItemType, itemData.leftSubItemType) && Intrinsics.EZpvd((Object) this.leftAttachViewType, (Object) itemData.leftAttachViewType) && Intrinsics.EZpvd((Object) this.leftText, (Object) itemData.leftText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.isRightClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.isLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.rightImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.leftDoubtTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.isRightEnter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.isRightEditable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isLine);
        int iHashCode4 = Integer.hashCode(this.rightTvColor);
        int iHashCode5 = this.rightImage.hashCode();
        int iHashCode6 = this.isDoubt.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isMedium);
        int iHashCode8 = Boolean.hashCode(this.isRightClickable);
        int iHashCode9 = this.isRightDoubt.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isRightEditable);
        int iHashCode11 = Boolean.hashCode(this.isRightEnter);
        int iHashCode12 = this.rightClickType.hashCode();
        int iHashCode13 = this.rightClickValue.hashCode();
        int iHashCode14 = Boolean.hashCode(this.showAvatar);
        int iHashCode15 = this.rightEnterText.hashCode();
        int iHashCode16 = this.rightEditType.hashCode();
        int iHashCode17 = Integer.hashCode(this.iconWidth);
        int iHashCode18 = Boolean.hashCode(this.disablePadding);
        int iHashCode19 = this.attachViewType.hashCode();
        String str = this.leftDoubtTitle;
        int iHashCode20 = str == null ? 0 : str.hashCode();
        ItemDataToggle itemDataToggle = this.rightToggle;
        int iHashCode21 = itemDataToggle == null ? 0 : itemDataToggle.hashCode();
        TacticsUiConst.BotListSubItemType botListSubItemType = this.leftSubItemType;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (botListSubItemType != null ? botListSubItemType.hashCode() : 0)) * 31) + this.leftAttachViewType.hashCode()) * 31) + this.leftText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.rightTvColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.isRightDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ItemData(title=" + this.title + ", text=" + this.text + ", isLine=" + this.isLine + ", rightTvColor=" + this.rightTvColor + ", rightImage=" + this.rightImage + ", isDoubt=" + this.isDoubt + ", isMedium=" + this.isMedium + ", isRightClickable=" + this.isRightClickable + ", isRightDoubt=" + this.isRightDoubt + ", isRightEditable=" + this.isRightEditable + ", isRightEnter=" + this.isRightEnter + ", rightClickType=" + this.rightClickType + ", rightClickValue=" + this.rightClickValue + ", showAvatar=" + this.showAvatar + ", rightEnterText=" + this.rightEnterText + ", rightEditType=" + this.rightEditType + ", iconWidth=" + this.iconWidth + ", disablePadding=" + this.disablePadding + ", attachViewType=" + this.attachViewType + ", leftDoubtTitle=" + this.leftDoubtTitle + ", rightToggle=" + this.rightToggle + ", leftSubItemType=" + this.leftSubItemType + ", leftAttachViewType=" + this.leftAttachViewType + ", leftText=" + this.leftText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.rightEnterText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.showAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeInt(this.isLine ? 1 : 0);
        parcel.writeInt(this.rightTvColor);
        parcel.writeString(this.rightImage);
        parcel.writeString(this.isDoubt);
        parcel.writeInt(this.isMedium ? 1 : 0);
        parcel.writeInt(this.isRightClickable ? 1 : 0);
        parcel.writeString(this.isRightDoubt);
        parcel.writeInt(this.isRightEditable ? 1 : 0);
        parcel.writeInt(this.isRightEnter ? 1 : 0);
        parcel.writeString(this.rightClickType);
        parcel.writeString(this.rightClickValue);
        parcel.writeInt(this.showAvatar ? 1 : 0);
        parcel.writeString(this.rightEnterText);
        parcel.writeString(this.rightEditType);
        parcel.writeInt(this.iconWidth);
        parcel.writeInt(this.disablePadding ? 1 : 0);
        parcel.writeString(this.attachViewType);
        parcel.writeString(this.leftDoubtTitle);
        ItemDataToggle itemDataToggle = this.rightToggle;
        if (itemDataToggle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemDataToggle.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.leftSubItemType, i);
        parcel.writeString(this.leftAttachViewType);
        parcel.writeString(this.leftText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.ItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemData> serializer() {
            return ItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ItemData(int i, String str, String str2, boolean z, int i2, String str3, String str4, boolean z2, boolean z3, String str5, boolean z4, boolean z5, String str6, String str7, boolean z6, String str8, String str9, int i3, boolean z7, String str10, String str11, ItemDataToggle itemDataToggle, TacticsUiConst.BotListSubItemType botListSubItemType, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.isLine = false;
        } else {
            this.isLine = z;
        }
        if ((i & 8) == 0) {
            this.rightTvColor = 0;
        } else {
            this.rightTvColor = i2;
        }
        if ((i & 16) == 0) {
            this.rightImage = "";
        } else {
            this.rightImage = str3;
        }
        if ((i & 32) == 0) {
            this.isDoubt = "";
        } else {
            this.isDoubt = str4;
        }
        if ((i & 64) == 0) {
            this.isMedium = false;
        } else {
            this.isMedium = z2;
        }
        if ((i & 128) == 0) {
            this.isRightClickable = false;
        } else {
            this.isRightClickable = z3;
        }
        if ((i & 256) == 0) {
            this.isRightDoubt = "";
        } else {
            this.isRightDoubt = str5;
        }
        if ((i & 512) == 0) {
            this.isRightEditable = false;
        } else {
            this.isRightEditable = z4;
        }
        if ((i & 1024) == 0) {
            this.isRightEnter = false;
        } else {
            this.isRightEnter = z5;
        }
        if ((i & 2048) == 0) {
            this.rightClickType = "";
        } else {
            this.rightClickType = str6;
        }
        if ((i & 4096) == 0) {
            this.rightClickValue = "";
        } else {
            this.rightClickValue = str7;
        }
        if ((i & 8192) == 0) {
            this.showAvatar = false;
        } else {
            this.showAvatar = z6;
        }
        if ((i & 16384) == 0) {
            this.rightEnterText = "";
        } else {
            this.rightEnterText = str8;
        }
        if ((32768 & i) == 0) {
            this.rightEditType = "";
        } else {
            this.rightEditType = str9;
        }
        if ((65536 & i) == 0) {
            this.iconWidth = 0;
        } else {
            this.iconWidth = i3;
        }
        if ((131072 & i) == 0) {
            this.disablePadding = false;
        } else {
            this.disablePadding = z7;
        }
        if ((262144 & i) == 0) {
            this.attachViewType = "";
        } else {
            this.attachViewType = str10;
        }
        if ((524288 & i) == 0) {
            this.leftDoubtTitle = null;
        } else {
            this.leftDoubtTitle = str11;
        }
        if ((1048576 & i) == 0) {
            this.rightToggle = null;
        } else {
            this.rightToggle = itemDataToggle;
        }
        if ((2097152 & i) == 0) {
            this.leftSubItemType = null;
        } else {
            this.leftSubItemType = botListSubItemType;
        }
        if ((4194304 & i) == 0) {
            this.leftAttachViewType = "";
        } else {
            this.leftAttachViewType = str12;
        }
        if ((i & 8388608) == 0) {
            this.leftText = "";
        } else {
            this.leftText = str13;
        }
    }

    public static final /* synthetic */ void KWHzl(ItemData itemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) itemData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, itemData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) itemData.text, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, itemData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || itemData.isLine) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, itemData.isLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || itemData.rightTvColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, itemData.rightTvColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) itemData.rightImage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, itemData.rightImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) itemData.isDoubt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, itemData.isDoubt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || itemData.isMedium) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, itemData.isMedium);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || itemData.isRightClickable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, itemData.isRightClickable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) itemData.isRightDoubt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, itemData.isRightDoubt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || itemData.isRightEditable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, itemData.isRightEditable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || itemData.isRightEnter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, itemData.isRightEnter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) itemData.rightClickType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, itemData.rightClickType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) itemData.rightClickValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, itemData.rightClickValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || itemData.showAvatar) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, itemData.showAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) itemData.rightEnterText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, itemData.rightEnterText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) itemData.rightEditType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, itemData.rightEditType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || itemData.iconWidth != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, itemData.iconWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || itemData.disablePadding) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, itemData.disablePadding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) itemData.attachViewType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, itemData.attachViewType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || itemData.leftDoubtTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, itemData.leftDoubtTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || itemData.rightToggle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, ItemDataToggle$$serializer.INSTANCE, itemData.rightToggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || itemData.leftSubItemType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], itemData.leftSubItemType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) itemData.leftAttachViewType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, itemData.leftAttachViewType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && Intrinsics.EZpvd((Object) itemData.leftText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 23, itemData.leftText);
    }

    public ItemData(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4, boolean z2, boolean z3, @NotNull String str5, boolean z4, boolean z5, @NotNull String str6, @NotNull String str7, boolean z6, @NotNull String str8, @NotNull String str9, int i2, boolean z7, @NotNull String str10, String str11, ItemDataToggle itemDataToggle, TacticsUiConst.BotListSubItemType botListSubItemType, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.title = str;
        this.text = str2;
        this.isLine = z;
        this.rightTvColor = i;
        this.rightImage = str3;
        this.isDoubt = str4;
        this.isMedium = z2;
        this.isRightClickable = z3;
        this.isRightDoubt = str5;
        this.isRightEditable = z4;
        this.isRightEnter = z5;
        this.rightClickType = str6;
        this.rightClickValue = str7;
        this.showAvatar = z6;
        this.rightEnterText = str8;
        this.rightEditType = str9;
        this.iconWidth = i2;
        this.disablePadding = z7;
        this.attachViewType = str10;
        this.leftDoubtTitle = str11;
        this.rightToggle = itemDataToggle;
        this.leftSubItemType = botListSubItemType;
        this.leftAttachViewType = str12;
        this.leftText = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0115: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008d: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0098: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:com.okinc.unify_trade.bot.data.ItemDataToggle:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.ItemDataToggle) : (r46v0 com.okinc.unify_trade.bot.data.ItemDataToggle))
  (wrap:com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r47v0 com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType) : (null com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.ItemDataToggle, com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, java.lang.String, java.lang.String):void (m)] (LINE:92) call: com.okinc.unify_trade.bot.data.ItemData.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.ItemDataToggle, com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ItemData(String str, String str2, boolean z, int i, String str3, String str4, boolean z2, boolean z3, String str5, boolean z4, boolean z5, String str6, String str7, boolean z6, String str8, String str9, int i2, boolean z7, String str10, String str11, ItemDataToggle itemDataToggle, TacticsUiConst.BotListSubItemType botListSubItemType, String str12, String str13, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? false : z4, (i3 & 1024) != 0 ? false : z5, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? false : z6, (i3 & 16384) != 0 ? "" : str8, (i3 & 32768) != 0 ? "" : str9, (i3 & 65536) != 0 ? 0 : i2, (i3 & 131072) != 0 ? false : z7, (i3 & 262144) != 0 ? "" : str10, (i3 & 524288) != 0 ? null : str11, (i3 & 1048576) != 0 ? null : itemDataToggle, (i3 & 2097152) == 0 ? botListSubItemType : null, (i3 & 4194304) != 0 ? "" : str12, (i3 & 8388608) != 0 ? "" : str13);
    }
}
