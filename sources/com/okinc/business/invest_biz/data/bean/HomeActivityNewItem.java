package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeActivityNewItem implements Parcelable {
    public static final int $stable = 0;
    private final boolean isReplaceNumber;
    private final String originalName;
    private final String replaceText;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HomeActivityNewItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeActivityNewItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeActivityNewItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeActivityNewItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeActivityNewItem[] newArray(int i) {
            return new HomeActivityNewItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeActivityNewItem() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeActivityNewItem copy$default(HomeActivityNewItem homeActivityNewItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeActivityNewItem.originalName;
        }
        if ((i & 2) != 0) {
            str2 = homeActivityNewItem.replaceText;
        }
        if ((i & 4) != 0) {
            z = homeActivityNewItem.isReplaceNumber;
        }
        return homeActivityNewItem.copy(str, str2, z);
    }

    @SerialName("originalName")
    public static /* synthetic */ void getOriginalName$annotations() {
    }

    @SerialName("replaceText")
    public static /* synthetic */ void getReplaceText$annotations() {
    }

    @SerialName("isReplaceNumber")
    public static /* synthetic */ void isReplaceNumber$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.originalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.replaceText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isReplaceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeActivityNewItem copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HomeActivityNewItem(str, str2, z);
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
        if (!(obj instanceof HomeActivityNewItem)) {
            return false;
        }
        HomeActivityNewItem homeActivityNewItem = (HomeActivityNewItem) obj;
        return Intrinsics.EZpvd((Object) this.originalName, (Object) homeActivityNewItem.originalName) && Intrinsics.EZpvd((Object) this.replaceText, (Object) homeActivityNewItem.replaceText) && this.isReplaceNumber == homeActivityNewItem.isReplaceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplaceText() {
        return this.replaceText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.originalName.hashCode() * 31) + this.replaceText.hashCode()) * 31) + Boolean.hashCode(this.isReplaceNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReplaceNumber() {
        return this.isReplaceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeActivityNewItem(originalName=" + this.originalName + ", replaceText=" + this.replaceText + ", isReplaceNumber=" + this.isReplaceNumber + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.originalName);
        parcel.writeString(this.replaceText);
        parcel.writeInt(this.isReplaceNumber ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeActivityNewItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeActivityNewItem> serializer() {
            return HomeActivityNewItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeActivityNewItem(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.originalName = "";
        } else {
            this.originalName = str;
        }
        if ((i & 2) == 0) {
            this.replaceText = "";
        } else {
            this.replaceText = str2;
        }
        if ((i & 4) == 0) {
            this.isReplaceNumber = false;
        } else {
            this.isReplaceNumber = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(HomeActivityNewItem homeActivityNewItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeActivityNewItem.originalName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeActivityNewItem.originalName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeActivityNewItem.replaceText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeActivityNewItem.replaceText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || homeActivityNewItem.isReplaceNumber) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, homeActivityNewItem.isReplaceNumber);
        }
    }

    public HomeActivityNewItem(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.originalName = str;
        this.replaceText = str2;
        this.isReplaceNumber = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:103) call: com.okinc.business.invest_biz.data.bean.HomeActivityNewItem.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ HomeActivityNewItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
