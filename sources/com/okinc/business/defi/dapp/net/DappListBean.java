package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappChains$$serializer;
import com.okinc.rxutils.RxBus;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappListBean implements Parcelable, RxBus.Application {
    private String category;
    private List<DappChains> chains;
    private long id;
    private boolean isFav;
    private int like;
    private String logo;
    private String name;
    private String recommendColor;
    private String recommendInfo;
    private String shortDescribe;
    private int type;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappListBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(DappChains$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DappListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(DappListBean.class.getClassLoader()));
            }
            return new DappListBean(j, i, string, string2, string3, string4, z, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappListBean[] newArray(int i) {
            return new DappListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappListBean() {
        this(0L, 0, (String) null, (String) null, (String) null, (String) null, false, (List) null, 0, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.recommendInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.recommendColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.like;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> component8() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappListBean copy(long j, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull List<DappChains> list, int i2, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new DappListBean(j, i, str, str2, str3, str4, z, list, i2, str5, str6, str7);
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
        if (!(obj instanceof DappListBean)) {
            return false;
        }
        DappListBean dappListBean = (DappListBean) obj;
        return this.id == dappListBean.id && this.like == dappListBean.like && Intrinsics.EZpvd((Object) this.logo, (Object) dappListBean.logo) && Intrinsics.EZpvd((Object) this.name, (Object) dappListBean.name) && Intrinsics.EZpvd((Object) this.shortDescribe, (Object) dappListBean.shortDescribe) && Intrinsics.EZpvd((Object) this.url, (Object) dappListBean.url) && this.isFav == dappListBean.isFav && Intrinsics.EZpvd(this.chains, dappListBean.chains) && this.type == dappListBean.type && Intrinsics.EZpvd((Object) this.category, (Object) dappListBean.category) && Intrinsics.EZpvd((Object) this.recommendInfo, (Object) dappListBean.recommendInfo) && Intrinsics.EZpvd((Object) this.recommendColor, (Object) dappListBean.recommendColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLike() {
        return this.like;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendColor() {
        return this.recommendColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendInfo() {
        return this.recommendInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortDescribe() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.like)) * 31) + this.logo.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortDescribe.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isFav)) * 31) + this.chains.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.category.hashCode()) * 31) + this.recommendInfo.hashCode()) * 31) + this.recommendColor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFav() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChains(@NotNull List<DappChains> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chains = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFav(boolean z) {
        this.isFav = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLike(int i) {
        this.like = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recommendColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recommendInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortDescribe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappListBean(id=" + this.id + ", like=" + this.like + ", logo=" + this.logo + ", name=" + this.name + ", shortDescribe=" + this.shortDescribe + ", url=" + this.url + ", isFav=" + this.isFav + ", chains=" + this.chains + ", type=" + this.type + ", category=" + this.category + ", recommendInfo=" + this.recommendInfo + ", recommendColor=" + this.recommendColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.like);
        parcel.writeString(this.logo);
        parcel.writeString(this.name);
        parcel.writeString(this.shortDescribe);
        parcel.writeString(this.url);
        parcel.writeInt(this.isFav ? 1 : 0);
        List<DappChains> list = this.chains;
        parcel.writeInt(list.size());
        Iterator<DappChains> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.type);
        parcel.writeString(this.category);
        parcel.writeString(this.recommendInfo);
        parcel.writeString(this.recommendColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappListBean> serializer() {
            return DappListBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappListBean(int i, long j, int i2, String str, String str2, String str3, String str4, boolean z, List list, int i3, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.like = 0;
        } else {
            this.like = i2;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 16) == 0) {
            this.shortDescribe = "";
        } else {
            this.shortDescribe = str3;
        }
        if ((i & 32) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i & 64) == 0) {
            this.isFav = false;
        } else {
            this.isFav = z;
        }
        if ((i & 128) == 0) {
            this.chains = new ArrayList();
        } else {
            this.chains = list;
        }
        if ((i & 256) == 0) {
            this.type = 0;
        } else {
            this.type = i3;
        }
        if ((i & 512) == 0) {
            this.category = "";
        } else {
            this.category = str5;
        }
        if ((i & 1024) == 0) {
            this.recommendInfo = "";
        } else {
            this.recommendInfo = str6;
        }
        if ((i & 2048) == 0) {
            this.recommendColor = "";
        } else {
            this.recommendColor = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappListBean dappListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappListBean.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, dappListBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappListBean.like != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, dappListBean.like);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dappListBean.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dappListBean.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dappListBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dappListBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dappListBean.shortDescribe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dappListBean.shortDescribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dappListBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dappListBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dappListBean.isFav) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, dappListBean.isFav);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(dappListBean.chains, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], dappListBean.chains);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dappListBean.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, dappListBean.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dappListBean.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dappListBean.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dappListBean.recommendInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dappListBean.recommendInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) dappListBean.recommendColor, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, dappListBean.recommendColor);
    }

    public DappListBean(long j, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull List<DappChains> list, int i2, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.id = j;
        this.like = i;
        this.logo = str;
        this.name = str2;
        this.shortDescribe = str3;
        this.url = str4;
        this.isFav = z;
        this.chains = list;
        this.type = i2;
        this.category = str5;
        this.recommendInfo = str6;
        this.recommendColor = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0080: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003d: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:22) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r23v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0049: ARITH (r28v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.dapp.bean.DappChains>, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.defi.dapp.net.DappListBean.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DappListBean(long j, int i, String str, String str2, String str3, String str4, boolean z, List list, int i2, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? new ArrayList() : list, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? "" : str5, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) == 0 ? str7 : "");
    }
}
