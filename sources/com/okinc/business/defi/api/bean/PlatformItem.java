package com.okinc.business.defi.api.bean;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43251rlk;
import o.C56524yIo;
import o.InterfaceC9773bbs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PlatformItem implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String category;
    private String contract;
    private String dau;
    private int drawableRes;
    private long id;
    private String intro;
    private String logo;
    private String network;
    private String platform;
    private List<String> tag;
    private long timeStamp;
    private String tvl;
    private List<String> type;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlatformItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlatformItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlatformItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformItem[] newArray(int i) {
            return new PlatformItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformItem() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 0L, 0, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.dau;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component11() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str6, @NotNull String str7, long j2, int i, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new PlatformItem(j, str, str2, str3, str4, str5, list, list2, str6, str7, j2, i, str8, str9);
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
        if (!(obj instanceof PlatformItem)) {
            return false;
        }
        PlatformItem platformItem = (PlatformItem) obj;
        return this.id == platformItem.id && Intrinsics.EZpvd((Object) this.platform, (Object) platformItem.platform) && Intrinsics.EZpvd((Object) this.logo, (Object) platformItem.logo) && Intrinsics.EZpvd((Object) this.network, (Object) platformItem.network) && Intrinsics.EZpvd((Object) this.tvl, (Object) platformItem.tvl) && Intrinsics.EZpvd((Object) this.intro, (Object) platformItem.intro) && Intrinsics.EZpvd(this.tag, platformItem.tag) && Intrinsics.EZpvd(this.type, platformItem.type) && Intrinsics.EZpvd((Object) this.url, (Object) platformItem.url) && Intrinsics.EZpvd((Object) this.dau, (Object) platformItem.dau) && this.timeStamp == platformItem.timeStamp && this.drawableRes == platformItem.drawableRes && Intrinsics.EZpvd((Object) this.category, (Object) platformItem.category) && Intrinsics.EZpvd((Object) this.contract, (Object) platformItem.contract);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDau() {
        return this.dau;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDrawableRes() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntro() {
        return this.intro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.platform.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.network.hashCode()) * 31) + this.tvl.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + this.dau.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + Integer.hashCode(this.drawableRes)) * 31) + this.category.hashCode()) * 31) + this.contract.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContract(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contract = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDau(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dau = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableRes(int i) {
        this.drawableRes = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntro(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intro = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platform = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tag = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tvl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.type = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlatformItem(id=" + this.id + ", platform=" + this.platform + ", logo=" + this.logo + ", network=" + this.network + ", tvl=" + this.tvl + ", intro=" + this.intro + ", tag=" + this.tag + ", type=" + this.type + ", url=" + this.url + ", dau=" + this.dau + ", timeStamp=" + this.timeStamp + ", drawableRes=" + this.drawableRes + ", category=" + this.category + ", contract=" + this.contract + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.platform);
        parcel.writeString(this.logo);
        parcel.writeString(this.network);
        parcel.writeString(this.tvl);
        parcel.writeString(this.intro);
        parcel.writeStringList(this.tag);
        parcel.writeStringList(this.type);
        parcel.writeString(this.url);
        parcel.writeString(this.dau);
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(this.drawableRes);
        parcel.writeString(this.category);
        parcel.writeString(this.contract);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.PlatformItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlatformItem> serializer() {
            return PlatformItem$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null};
    }

    public /* synthetic */ PlatformItem(int i, long j, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, long j2, int i2, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.platform = "";
        } else {
            this.platform = str;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str2;
        }
        if ((i & 8) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        this.tvl = (i & 16) == 0 ? "0.0" : str4;
        if ((i & 32) == 0) {
            this.intro = "";
        } else {
            this.intro = str5;
        }
        this.tag = (i & 64) == 0 ? new ArrayList() : list;
        this.type = (i & 128) == 0 ? new ArrayList() : list2;
        if ((i & 256) == 0) {
            this.url = "";
        } else {
            this.url = str6;
        }
        if ((i & 512) == 0) {
            this.dau = "";
        } else {
            this.dau = str7;
        }
        if ((i & 1024) == 0) {
            this.timeStamp = 0L;
        } else {
            this.timeStamp = j2;
        }
        this.drawableRes = (i & 2048) == 0 ? 0 : i2;
        if ((i & 4096) == 0) {
            this.category = "";
        } else {
            this.category = str8;
        }
        if ((i & 8192) == 0) {
            this.contract = "";
        } else {
            this.contract = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(PlatformItem platformItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || platformItem.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, platformItem.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) platformItem.platform, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, platformItem.platform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) platformItem.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, platformItem.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) platformItem.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, platformItem.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) platformItem.tvl, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, platformItem.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) platformItem.intro, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, platformItem.intro);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(platformItem.tag, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], platformItem.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(platformItem.type, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], platformItem.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) platformItem.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, platformItem.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) platformItem.dau, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, platformItem.dau);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || platformItem.timeStamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 10, platformItem.timeStamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || platformItem.drawableRes != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, platformItem.drawableRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) platformItem.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, platformItem.category);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) platformItem.contract, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, platformItem.contract);
    }

    public PlatformItem(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str6, @NotNull String str7, long j2, int i, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.id = j;
        this.platform = str;
        this.logo = str2;
        this.network = str3;
        this.tvl = str4;
        this.intro = str5;
        this.tag = list;
        this.type = list2;
        this.url = str6;
        this.dau = str7;
        this.timeStamp = j2;
        this.drawableRes = i;
        this.category = str8;
        this.contract = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a0: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:32) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0043: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:33) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x005f: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r28v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0066: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.defi.api.bean.PlatformItem.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlatformItem(long j, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, long j2, int i, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "0.0" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? new ArrayList() : list, (i2 & 128) != 0 ? new ArrayList() : list2, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) == 0 ? j2 : 0L, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? "" : str8, (i2 & 8192) != 0 ? "" : str9);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0056 A[EXC_TOP_SPLITTER, PHI: r1 r4
  0x0056: PHI (r1v3 java.io.InputStream) = (r1v2 java.io.InputStream), (r1v5 java.io.InputStream) binds: [B:21:0x0054, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v7 java.lang.Object) binds: [B:21:0x0054, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getImage(@NotNull Context context) {
        Object objDecodeStream;
        Intrinsics.checkNotNullParameter(context, "");
        int i = this.drawableRes;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        InputStream inputStreamOpen = null;
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.logo)) {
            return null;
        }
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        InterfaceC9773bbs interfaceC9773bbs = listKWHzl != null ? (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl) : null;
        if (interfaceC9773bbs != null) {
            try {
                if (Intrinsics.EZpvd((Object) this.platform, (Object) context.getString(interfaceC9773bbs.KWHzl()))) {
                    try {
                        inputStreamOpen = context.getAssets().open(this.logo);
                        objDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    } catch (Exception unused) {
                        objDecodeStream = this.logo;
                        if (inputStreamOpen != null) {
                        }
                    }
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Exception unused2) {
                            return objDecodeStream;
                        }
                    }
                    return objDecodeStream;
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return this.logo;
    }

    public final String getUrlWithoutScheme() {
        Uri uri = Uri.parse(this.url);
        return StringsKt__StringsKt.substringAfter$default(this.url, uri.getScheme() + "://", (String) null, 2, (Object) null);
    }
}
