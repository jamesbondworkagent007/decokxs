package com.okinc.okex.center.ui.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceToolBean$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class AnnouncementPopupDisplayModel implements Parcelable {
    private final String content;
    private final SelfServiceToolBean ctaSelfServiceTool;
    private final String id;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AnnouncementPopupDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AnnouncementPopupDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnouncementPopupDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AnnouncementPopupDisplayModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SelfServiceToolBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnouncementPopupDisplayModel[] newArray(int i) {
            return new AnnouncementPopupDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnouncementPopupDisplayModel() {
        this((String) null, (String) null, (String) null, (SelfServiceToolBean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AnnouncementPopupDisplayModel copy$default(AnnouncementPopupDisplayModel announcementPopupDisplayModel, String str, String str2, String str3, SelfServiceToolBean selfServiceToolBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announcementPopupDisplayModel.id;
        }
        if ((i & 2) != 0) {
            str2 = announcementPopupDisplayModel.title;
        }
        if ((i & 4) != 0) {
            str3 = announcementPopupDisplayModel.content;
        }
        if ((i & 8) != 0) {
            selfServiceToolBean = announcementPopupDisplayModel.ctaSelfServiceTool;
        }
        return announcementPopupDisplayModel.copy(str, str2, str3, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean component4() {
        return this.ctaSelfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnouncementPopupDisplayModel copy(String str, String str2, String str3, SelfServiceToolBean selfServiceToolBean) {
        return new AnnouncementPopupDisplayModel(str, str2, str3, selfServiceToolBean);
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
        if (!(obj instanceof AnnouncementPopupDisplayModel)) {
            return false;
        }
        AnnouncementPopupDisplayModel announcementPopupDisplayModel = (AnnouncementPopupDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) announcementPopupDisplayModel.id) && Intrinsics.EZpvd((Object) this.title, (Object) announcementPopupDisplayModel.title) && Intrinsics.EZpvd((Object) this.content, (Object) announcementPopupDisplayModel.content) && Intrinsics.EZpvd(this.ctaSelfServiceTool, announcementPopupDisplayModel.ctaSelfServiceTool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean getCtaSelfServiceTool() {
        return this.ctaSelfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.content;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        SelfServiceToolBean selfServiceToolBean = this.ctaSelfServiceTool;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (selfServiceToolBean != null ? selfServiceToolBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnnouncementPopupDisplayModel(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", ctaSelfServiceTool=" + this.ctaSelfServiceTool + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        SelfServiceToolBean selfServiceToolBean = this.ctaSelfServiceTool;
        if (selfServiceToolBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selfServiceToolBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnouncementPopupDisplayModel> serializer() {
            return AnnouncementPopupDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnouncementPopupDisplayModel(int i, String str, String str2, String str3, SelfServiceToolBean selfServiceToolBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 8) == 0) {
            this.ctaSelfServiceTool = null;
        } else {
            this.ctaSelfServiceTool = selfServiceToolBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(AnnouncementPopupDisplayModel announcementPopupDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || announcementPopupDisplayModel.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, announcementPopupDisplayModel.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || announcementPopupDisplayModel.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, announcementPopupDisplayModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || announcementPopupDisplayModel.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, announcementPopupDisplayModel.content);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && announcementPopupDisplayModel.ctaSelfServiceTool == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, SelfServiceToolBean$$serializer.INSTANCE, announcementPopupDisplayModel.ctaSelfServiceTool);
    }

    public AnnouncementPopupDisplayModel(String str, String str2, String str3, SelfServiceToolBean selfServiceToolBean) {
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.ctaSelfServiceTool = selfServiceToolBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.SelfServiceToolBean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceToolBean) : (r5v0 com.okinc.okex.center.bean.SelfServiceToolBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void (m)] (LINE:18) call: com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void type: THIS */
    public /* synthetic */ AnnouncementPopupDisplayModel(String str, String str2, String str3, SelfServiceToolBean selfServiceToolBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : selfServiceToolBean);
    }
}
