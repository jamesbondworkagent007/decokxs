package com.okinc.annual.download;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AnnualDownloadInfo implements Parcelable {
    private String audioMD5;
    private String audioName;
    private String imageFoldName;
    private List<AnnualImageMD5> imageMD5List;
    private String lottieFoldName;
    private List<AnnualLottieMD5> lottieMD5List;
    private String saveDirectoryName;
    private int version;
    private String zipFileName;
    private String zipFileUrl;
    private String zipMD5;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AnnualDownloadInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(AnnualLottieMD5$$serializer.INSTANCE), null, null, new ArrayListSerializer(AnnualImageMD5$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AnnualDownloadInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnualDownloadInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AnnualLottieMD5.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            String string8 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(AnnualImageMD5.CREATOR.createFromParcel(parcel));
            }
            return new AnnualDownloadInfo(string, string2, string3, string4, string5, string6, string7, arrayList, i3, string8, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnualDownloadInfo[] newArray(int i) {
            return new AnnualDownloadInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.saveDirectoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.imageFoldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AnnualImageMD5> component11() {
        return this.imageMD5List;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.zipFileUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.zipFileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.zipMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.audioName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.audioMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lottieFoldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AnnualLottieMD5> component8() {
        return this.lottieMD5List;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnualDownloadInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<AnnualLottieMD5> list, int i, @NotNull String str8, @NotNull List<AnnualImageMD5> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AnnualDownloadInfo(str, str2, str3, str4, str5, str6, str7, list, i, str8, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAudioMD5() {
        return this.audioMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAudioName() {
        return this.audioName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageFoldName() {
        return this.imageFoldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AnnualImageMD5> getImageMD5List() {
        return this.imageMD5List;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLottieFoldName() {
        return this.lottieFoldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AnnualLottieMD5> getLottieMD5List() {
        return this.lottieMD5List;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSaveDirectoryName() {
        return this.saveDirectoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getZipFileName() {
        return this.zipFileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getZipFileUrl() {
        return this.zipFileUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getZipMD5() {
        return this.zipMD5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAudioMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.audioMD5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAudioName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.audioName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageFoldName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageFoldName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageMD5List(@NotNull List<AnnualImageMD5> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.imageMD5List = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLottieFoldName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lottieFoldName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLottieMD5List(@NotNull List<AnnualLottieMD5> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.lottieMD5List = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSaveDirectoryName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.saveDirectoryName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(int i) {
        this.version = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZipFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zipFileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZipFileUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zipFileUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZipMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zipMD5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnnualDownloadInfo(saveDirectoryName=" + this.saveDirectoryName + ", zipFileUrl=" + this.zipFileUrl + ", zipFileName=" + this.zipFileName + ", zipMD5=" + this.zipMD5 + ", audioName=" + this.audioName + ", audioMD5=" + this.audioMD5 + ", lottieFoldName=" + this.lottieFoldName + ", lottieMD5List=" + this.lottieMD5List + ", version=" + this.version + ", imageFoldName=" + this.imageFoldName + ", imageMD5List=" + this.imageMD5List + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.saveDirectoryName);
        parcel.writeString(this.zipFileUrl);
        parcel.writeString(this.zipFileName);
        parcel.writeString(this.zipMD5);
        parcel.writeString(this.audioName);
        parcel.writeString(this.audioMD5);
        parcel.writeString(this.lottieFoldName);
        List<AnnualLottieMD5> list = this.lottieMD5List;
        parcel.writeInt(list.size());
        Iterator<AnnualLottieMD5> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.version);
        parcel.writeString(this.imageFoldName);
        List<AnnualImageMD5> list2 = this.imageMD5List;
        parcel.writeInt(list2.size());
        Iterator<AnnualImageMD5> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.annual.download.AnnualDownloadInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnualDownloadInfo> serializer() {
            return AnnualDownloadInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnualDownloadInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i2, String str8, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (256 != (i & 256)) {
            PluginExceptionsKt.throwMissingFieldException(i, 256, AnnualDownloadInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.saveDirectoryName = "";
        } else {
            this.saveDirectoryName = str;
        }
        if ((i & 2) == 0) {
            this.zipFileUrl = "";
        } else {
            this.zipFileUrl = str2;
        }
        if ((i & 4) == 0) {
            this.zipFileName = "";
        } else {
            this.zipFileName = str3;
        }
        if ((i & 8) == 0) {
            this.zipMD5 = "";
        } else {
            this.zipMD5 = str4;
        }
        if ((i & 16) == 0) {
            this.audioName = "";
        } else {
            this.audioName = str5;
        }
        if ((i & 32) == 0) {
            this.audioMD5 = "";
        } else {
            this.audioMD5 = str6;
        }
        if ((i & 64) == 0) {
            this.lottieFoldName = "";
        } else {
            this.lottieFoldName = str7;
        }
        if ((i & 128) == 0) {
            this.lottieMD5List = yDY.AhwBna();
        } else {
            this.lottieMD5List = list;
        }
        this.version = i2;
        if ((i & 512) == 0) {
            this.imageFoldName = "";
        } else {
            this.imageFoldName = str8;
        }
        if ((i & 1024) == 0) {
            this.imageMD5List = yDY.AhwBna();
        } else {
            this.imageMD5List = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(AnnualDownloadInfo annualDownloadInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) annualDownloadInfo.saveDirectoryName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, annualDownloadInfo.saveDirectoryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) annualDownloadInfo.zipFileUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, annualDownloadInfo.zipFileUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) annualDownloadInfo.zipFileName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, annualDownloadInfo.zipFileName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) annualDownloadInfo.zipMD5, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, annualDownloadInfo.zipMD5);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) annualDownloadInfo.audioName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, annualDownloadInfo.audioName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) annualDownloadInfo.audioMD5, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, annualDownloadInfo.audioMD5);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) annualDownloadInfo.lottieFoldName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, annualDownloadInfo.lottieFoldName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(annualDownloadInfo.lottieMD5List, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], annualDownloadInfo.lottieMD5List);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, annualDownloadInfo.version);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) annualDownloadInfo.imageFoldName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, annualDownloadInfo.imageFoldName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(annualDownloadInfo.imageMD5List, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], annualDownloadInfo.imageMD5List);
    }

    public AnnualDownloadInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<AnnualLottieMD5> list, int i, @NotNull String str8, @NotNull List<AnnualImageMD5> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.saveDirectoryName = str;
        this.zipFileUrl = str2;
        this.zipFileName = str3;
        this.zipMD5 = str4;
        this.audioName = str5;
        this.audioMD5 = str6;
        this.lottieFoldName = str7;
        this.lottieMD5List = list;
        this.version = i;
        this.imageFoldName = str8;
        this.imageMD5List = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r23v0 java.util.List))
  (r24v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0050: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r26v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.annual.download.AnnualLottieMD5>, int, java.lang.String, java.util.List<com.okinc.annual.download.AnnualImageMD5>):void (m)] (LINE:11) call: com.okinc.annual.download.AnnualDownloadInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AnnualDownloadInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, String str8, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? yDY.AhwBna() : list, i, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? yDY.AhwBna() : list2);
    }

    public boolean equals(Object obj) {
        AnnualDownloadInfo annualDownloadInfo = obj instanceof AnnualDownloadInfo ? (AnnualDownloadInfo) obj : null;
        return annualDownloadInfo != null && Intrinsics.EZpvd((Object) annualDownloadInfo.zipFileUrl, (Object) this.zipFileUrl) && Intrinsics.EZpvd((Object) annualDownloadInfo.zipFileName, (Object) this.zipFileName) && Intrinsics.EZpvd((Object) annualDownloadInfo.zipMD5, (Object) this.zipMD5) && Intrinsics.EZpvd((Object) annualDownloadInfo.audioName, (Object) this.audioName) && Intrinsics.EZpvd((Object) annualDownloadInfo.audioMD5, (Object) this.audioMD5) && Intrinsics.EZpvd((Object) annualDownloadInfo.lottieFoldName, (Object) this.lottieFoldName) && annualDownloadInfo.version == this.version;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
