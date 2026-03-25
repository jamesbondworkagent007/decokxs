package com.okinc.web3Uilib.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MultiTransactionDetailItem implements Parcelable {
    public static final int $stable = 0;
    private final String comment;
    private final String commentTitle;
    private final String itemId;
    private final String leftInfo;
    private final String rightInfo;
    private final String warningInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MultiTransactionDetailItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MultiTransactionDetailItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransactionDetailItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MultiTransactionDetailItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransactionDetailItem[] newArray(int i) {
            return new MultiTransactionDetailItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiTransactionDetailItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiTransactionDetailItem copy$default(MultiTransactionDetailItem multiTransactionDetailItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiTransactionDetailItem.leftInfo;
        }
        if ((i & 2) != 0) {
            str2 = multiTransactionDetailItem.rightInfo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = multiTransactionDetailItem.warningInfo;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = multiTransactionDetailItem.commentTitle;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = multiTransactionDetailItem.comment;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = multiTransactionDetailItem.itemId;
        }
        return multiTransactionDetailItem.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.leftInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rightInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.warningInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.commentTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiTransactionDetailItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MultiTransactionDetailItem(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof MultiTransactionDetailItem)) {
            return false;
        }
        MultiTransactionDetailItem multiTransactionDetailItem = (MultiTransactionDetailItem) obj;
        return Intrinsics.EZpvd((Object) this.leftInfo, (Object) multiTransactionDetailItem.leftInfo) && Intrinsics.EZpvd((Object) this.rightInfo, (Object) multiTransactionDetailItem.rightInfo) && Intrinsics.EZpvd((Object) this.warningInfo, (Object) multiTransactionDetailItem.warningInfo) && Intrinsics.EZpvd((Object) this.commentTitle, (Object) multiTransactionDetailItem.commentTitle) && Intrinsics.EZpvd((Object) this.comment, (Object) multiTransactionDetailItem.comment) && Intrinsics.EZpvd((Object) this.itemId, (Object) multiTransactionDetailItem.itemId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComment() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommentTitle() {
        return this.commentTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftInfo() {
        return this.leftInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightInfo() {
        return this.rightInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWarningInfo() {
        return this.warningInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.leftInfo.hashCode() * 31) + this.rightInfo.hashCode()) * 31) + this.warningInfo.hashCode()) * 31) + this.commentTitle.hashCode()) * 31) + this.comment.hashCode()) * 31) + this.itemId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiTransactionDetailItem(leftInfo=" + this.leftInfo + ", rightInfo=" + this.rightInfo + ", warningInfo=" + this.warningInfo + ", commentTitle=" + this.commentTitle + ", comment=" + this.comment + ", itemId=" + this.itemId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.leftInfo);
        parcel.writeString(this.rightInfo);
        parcel.writeString(this.warningInfo);
        parcel.writeString(this.commentTitle);
        parcel.writeString(this.comment);
        parcel.writeString(this.itemId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.MultiTransactionDetailItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiTransactionDetailItem> serializer() {
            return MultiTransactionDetailItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiTransactionDetailItem(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.leftInfo = "";
        } else {
            this.leftInfo = str;
        }
        if ((i & 2) == 0) {
            this.rightInfo = "";
        } else {
            this.rightInfo = str2;
        }
        if ((i & 4) == 0) {
            this.warningInfo = "";
        } else {
            this.warningInfo = str3;
        }
        if ((i & 8) == 0) {
            this.commentTitle = "";
        } else {
            this.commentTitle = str4;
        }
        if ((i & 16) == 0) {
            this.comment = "";
        } else {
            this.comment = str5;
        }
        if ((i & 32) == 0) {
            this.itemId = UUID.randomUUID().toString();
        } else {
            this.itemId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(MultiTransactionDetailItem multiTransactionDetailItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) multiTransactionDetailItem.leftInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, multiTransactionDetailItem.leftInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) multiTransactionDetailItem.rightInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, multiTransactionDetailItem.rightInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) multiTransactionDetailItem.warningInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, multiTransactionDetailItem.warningInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) multiTransactionDetailItem.commentTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, multiTransactionDetailItem.commentTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) multiTransactionDetailItem.comment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, multiTransactionDetailItem.comment);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) multiTransactionDetailItem.itemId, (Object) UUID.randomUUID().toString())) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, multiTransactionDetailItem.itemId);
    }

    public MultiTransactionDetailItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.leftInfo = str;
        this.rightInfo = str2;
        this.warningInfo = str3;
        this.commentTitle = str4;
        this.comment = str5;
        this.itemId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x002c: INVOKE 
  (wrap:java.util.UUID:0x0028: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:308))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:308)) : (r10v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:302) call: com.okinc.web3Uilib.bean.MultiTransactionDetailItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MultiTransactionDetailItem(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? UUID.randomUUID().toString() : str6);
    }
}
