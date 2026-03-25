package com.okinc.dapp.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DappSearchResultBean implements Parcelable {
    private String balance;
    private int category;
    private List<DappChains> chains;
    private String deepLink;
    private String id;
    private boolean isFav;
    private String logo;
    private String name;
    private String shortDescribe;
    private long timestamp;
    private String user;
    private String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappSearchResultBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DappChains$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<DappSearchResultBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappSearchResultBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DappChains.CREATOR.createFromParcel(parcel));
            }
            return new DappSearchResultBean(string, i, string2, string3, string4, string5, string6, string7, string8, z, arrayList, parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappSearchResultBean[] newArray(int i) {
            return new DappSearchResultBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappSearchResultBean() {
        this((String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, 0L, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> component11() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSearchResultBean copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull List<DappChains> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DappSearchResultBean(str, i, str2, str3, str4, str5, str6, str7, str8, z, list, j);
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
        if (!(obj instanceof DappSearchResultBean)) {
            return false;
        }
        DappSearchResultBean dappSearchResultBean = (DappSearchResultBean) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) dappSearchResultBean.balance) && this.category == dappSearchResultBean.category && Intrinsics.EZpvd((Object) this.deepLink, (Object) dappSearchResultBean.deepLink) && Intrinsics.EZpvd((Object) this.id, (Object) dappSearchResultBean.id) && Intrinsics.EZpvd((Object) this.logo, (Object) dappSearchResultBean.logo) && Intrinsics.EZpvd((Object) this.user, (Object) dappSearchResultBean.user) && Intrinsics.EZpvd((Object) this.volume, (Object) dappSearchResultBean.volume) && Intrinsics.EZpvd((Object) this.name, (Object) dappSearchResultBean.name) && Intrinsics.EZpvd((Object) this.shortDescribe, (Object) dappSearchResultBean.shortDescribe) && this.isFav == dappSearchResultBean.isFav && Intrinsics.EZpvd(this.chains, dappSearchResultBean.chains) && this.timestamp == dappSearchResultBean.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
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
    public final String getShortDescribe() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUser() {
        return this.user;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.balance.hashCode() * 31) + Integer.hashCode(this.category)) * 31) + this.deepLink.hashCode()) * 31) + this.id.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.user.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortDescribe.hashCode()) * 31) + Boolean.hashCode(this.isFav)) * 31) + this.chains.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFav() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(int i) {
        this.category = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChains(@NotNull List<DappChains> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chains = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeepLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFav(boolean z) {
        this.isFav = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
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
    public final void setShortDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortDescribe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUser(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.user = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolume(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappSearchResultBean(balance=" + this.balance + ", category=" + this.category + ", deepLink=" + this.deepLink + ", id=" + this.id + ", logo=" + this.logo + ", user=" + this.user + ", volume=" + this.volume + ", name=" + this.name + ", shortDescribe=" + this.shortDescribe + ", isFav=" + this.isFav + ", chains=" + this.chains + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.balance);
        parcel.writeInt(this.category);
        parcel.writeString(this.deepLink);
        parcel.writeString(this.id);
        parcel.writeString(this.logo);
        parcel.writeString(this.user);
        parcel.writeString(this.volume);
        parcel.writeString(this.name);
        parcel.writeString(this.shortDescribe);
        parcel.writeInt(this.isFav ? 1 : 0);
        List<DappChains> list = this.chains;
        parcel.writeInt(list.size());
        Iterator<DappChains> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.timestamp);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dapp.bean.DappSearchResultBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappSearchResultBean> serializer() {
            return DappSearchResultBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappSearchResultBean(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, List list, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.balance = "";
        } else {
            this.balance = str;
        }
        this.category = (i & 2) == 0 ? 1 : i2;
        if ((i & 4) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str2;
        }
        this.id = (i & 8) == 0 ? "0" : str3;
        if ((i & 16) == 0) {
            this.logo = "";
        } else {
            this.logo = str4;
        }
        if ((i & 32) == 0) {
            this.user = "";
        } else {
            this.user = str5;
        }
        if ((i & 64) == 0) {
            this.volume = "";
        } else {
            this.volume = str6;
        }
        if ((i & 128) == 0) {
            this.name = "";
        } else {
            this.name = str7;
        }
        if ((i & 256) == 0) {
            this.shortDescribe = "";
        } else {
            this.shortDescribe = str8;
        }
        this.isFav = (i & 512) == 0 ? false : z;
        this.chains = (i & 1024) == 0 ? new ArrayList() : list;
        this.timestamp = (i & 2048) == 0 ? 0L : j;
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_api(DappSearchResultBean dappSearchResultBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dappSearchResultBean.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dappSearchResultBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappSearchResultBean.category != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, dappSearchResultBean.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dappSearchResultBean.deepLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dappSearchResultBean.deepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dappSearchResultBean.id, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dappSearchResultBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dappSearchResultBean.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dappSearchResultBean.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dappSearchResultBean.user, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dappSearchResultBean.user);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dappSearchResultBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dappSearchResultBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dappSearchResultBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dappSearchResultBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dappSearchResultBean.shortDescribe, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dappSearchResultBean.shortDescribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dappSearchResultBean.isFav) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, dappSearchResultBean.isFav);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(dappSearchResultBean.chains, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], dappSearchResultBean.chains);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && dappSearchResultBean.timestamp == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 11, dappSearchResultBean.timestamp);
    }

    public DappSearchResultBean(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull List<DappChains> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.balance = str;
        this.category = i;
        this.deepLink = str2;
        this.id = str3;
        this.logo = str4;
        this.user = str5;
        this.volume = str6;
        this.name = str7;
        this.shortDescribe = str8;
        this.isFav = z;
        this.chains = list;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0059: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:23) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r25v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x005f: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.dapp.bean.DappChains>, long):void (m)] (LINE:12) call: com.okinc.dapp.bean.DappSearchResultBean.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, long):void type: THIS */
    public /* synthetic */ DappSearchResultBean(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, List list, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "0" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) == 0 ? str8 : "", (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? new ArrayList() : list, (i2 & 2048) != 0 ? 0L : j);
    }
}
