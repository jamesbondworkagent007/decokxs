package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BannerInfo implements Parcelable {
    public static final int ID_ACTIVITY_FREE_GAS = 104;
    public static final int IS_BACKUP_BACKUP_NOT_REQUIRED = 0;
    public static final int IS_BACKUP_BACKUP_REQUIRED = 1;
    public static final int URL_TYPE_DEEPLINK = 2;
    public static final int URL_TYPE_NOT_CONFIGURED = 0;
    public static final int URL_TYPE_WEBVIEW = 1;
    public final String campaignContent;
    public final String campaignTitle;
    public final String dayLogo;
    public final int id;
    public final int isBackup;
    public final String nightLogo;
    public final String subTitle;
    public final String title;
    public final String titleName;
    public final String url;
    public final String urlTitle;
    public final int urlType;
    public final List<Integer> walletType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BannerInfo> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<BannerInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new BannerInfo(i, string, string2, string3, string4, string5, string6, string7, string8, i2, arrayList, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfo[] newArray(int i) {
            return new BannerInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerInfo() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, 0, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerInfo KWHzl(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull List<Integer> list, int i3, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new BannerInfo(i, str, str2, str3, str4, str5, str6, str7, str8, i2, list, i3, str9);
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
        if (!(obj instanceof BannerInfo)) {
            return false;
        }
        BannerInfo bannerInfo = (BannerInfo) obj;
        return this.id == bannerInfo.id && Intrinsics.EZpvd((Object) this.title, (Object) bannerInfo.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) bannerInfo.subTitle) && Intrinsics.EZpvd((Object) this.urlTitle, (Object) bannerInfo.urlTitle) && Intrinsics.EZpvd((Object) this.campaignTitle, (Object) bannerInfo.campaignTitle) && Intrinsics.EZpvd((Object) this.campaignContent, (Object) bannerInfo.campaignContent) && Intrinsics.EZpvd((Object) this.dayLogo, (Object) bannerInfo.dayLogo) && Intrinsics.EZpvd((Object) this.nightLogo, (Object) bannerInfo.nightLogo) && Intrinsics.EZpvd((Object) this.url, (Object) bannerInfo.url) && this.urlType == bannerInfo.urlType && Intrinsics.EZpvd(this.walletType, bannerInfo.walletType) && this.isBackup == bannerInfo.isBackup && Intrinsics.EZpvd((Object) this.titleName, (Object) bannerInfo.titleName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.subTitle.hashCode();
        int iHashCode4 = this.urlTitle.hashCode();
        String str = this.campaignTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.campaignContent;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.dayLogo.hashCode()) * 31) + this.nightLogo.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.urlType)) * 31) + this.walletType.hashCode()) * 31) + Integer.hashCode(this.isBackup)) * 31) + this.titleName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerInfo(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", urlTitle=" + this.urlTitle + ", campaignTitle=" + this.campaignTitle + ", campaignContent=" + this.campaignContent + ", dayLogo=" + this.dayLogo + ", nightLogo=" + this.nightLogo + ", url=" + this.url + ", urlType=" + this.urlType + ", walletType=" + this.walletType + ", isBackup=" + this.isBackup + ", titleName=" + this.titleName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.urlTitle);
        parcel.writeString(this.campaignTitle);
        parcel.writeString(this.campaignContent);
        parcel.writeString(this.dayLogo);
        parcel.writeString(this.nightLogo);
        parcel.writeString(this.url);
        parcel.writeInt(this.urlType);
        List<Integer> list = this.walletType;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.isBackup);
        parcel.writeString(this.titleName);
    }

    public /* synthetic */ BannerInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, List list, int i4, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str2;
        }
        if ((i & 8) == 0) {
            this.urlTitle = "";
        } else {
            this.urlTitle = str3;
        }
        if ((i & 16) == 0) {
            this.campaignTitle = null;
        } else {
            this.campaignTitle = str4;
        }
        if ((i & 32) == 0) {
            this.campaignContent = null;
        } else {
            this.campaignContent = str5;
        }
        if ((i & 64) == 0) {
            this.dayLogo = "";
        } else {
            this.dayLogo = str6;
        }
        if ((i & 128) == 0) {
            this.nightLogo = "";
        } else {
            this.nightLogo = str7;
        }
        if ((i & 256) == 0) {
            this.url = "";
        } else {
            this.url = str8;
        }
        if ((i & 512) == 0) {
            this.urlType = 0;
        } else {
            this.urlType = i3;
        }
        this.walletType = (i & 1024) == 0 ? yDY.AhwBna() : list;
        if ((i & 2048) == 0) {
            this.isBackup = 0;
        } else {
            this.isBackup = i4;
        }
        if ((i & 4096) == 0) {
            this.titleName = "";
        } else {
            this.titleName = str9;
        }
    }

    public static final /* synthetic */ void copydefault(BannerInfo bannerInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerInfo.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, bannerInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bannerInfo.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bannerInfo.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bannerInfo.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bannerInfo.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bannerInfo.urlTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bannerInfo.urlTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bannerInfo.campaignTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bannerInfo.campaignTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bannerInfo.campaignContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bannerInfo.campaignContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) bannerInfo.dayLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, bannerInfo.dayLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) bannerInfo.nightLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, bannerInfo.nightLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) bannerInfo.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, bannerInfo.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bannerInfo.urlType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, bannerInfo.urlType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(bannerInfo.walletType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], bannerInfo.walletType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || bannerInfo.isBackup != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, bannerInfo.isBackup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) bannerInfo.titleName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, bannerInfo.titleName);
    }

    public BannerInfo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull List<Integer> list, int i3, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.id = i;
        this.title = str;
        this.subTitle = str2;
        this.urlTitle = str3;
        this.campaignTitle = str4;
        this.campaignContent = str5;
        this.dayLogo = str6;
        this.nightLogo = str7;
        this.url = str8;
        this.urlType = i2;
        this.walletType = list;
        this.isBackup = i3;
        this.titleName = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r29v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0059: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:732)) : (r26v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0060: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, int, java.lang.String):void (m)] (LINE:720) call: com.okinc.business.defi.biz.net.bean.BannerInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String):void type: THIS */
    public /* synthetic */ BannerInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, List list, int i3, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) == 0 ? str5 : null, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? "" : str8, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? yDY.AhwBna() : list, (i4 & 2048) == 0 ? i3 : 0, (i4 & 4096) == 0 ? str9 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BannerInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BannerInfo> serializer() {
            return BannerInfo$$serializer.INSTANCE;
        }
    }
}
