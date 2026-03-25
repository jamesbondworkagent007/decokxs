package com.okinc.productmatrix.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class Product implements Parcelable {
    private final String actionPath;
    private final int actionType;
    private final String darkIconUrl;
    private long emptyProductItemId;
    private final String eventInfo;
    private final int interceptType;
    private final String lightIconUrl;
    private final String moduleName;
    private final int productId;
    private Tag tag;
    private final String titleName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Product> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<Product> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Product(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Tag.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product[] newArray(int i) {
            return new Product[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Product() {
        this(0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (Tag) null, 0L, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Tag component10() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component11() {
        return this.emptyProductItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.actionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.actionPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.eventInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.interceptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.titleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Product copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i3, @NotNull String str6, Tag tag, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new Product(i, i2, str, str2, str3, str4, str5, i3, str6, tag, j);
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
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return this.productId == product.productId && this.actionType == product.actionType && Intrinsics.EZpvd((Object) this.actionPath, (Object) product.actionPath) && Intrinsics.EZpvd((Object) this.eventInfo, (Object) product.eventInfo) && Intrinsics.EZpvd((Object) this.moduleName, (Object) product.moduleName) && Intrinsics.EZpvd((Object) this.darkIconUrl, (Object) product.darkIconUrl) && Intrinsics.EZpvd((Object) this.lightIconUrl, (Object) product.lightIconUrl) && this.interceptType == product.interceptType && Intrinsics.EZpvd((Object) this.titleName, (Object) product.titleName) && Intrinsics.EZpvd(this.tag, product.tag) && this.emptyProductItemId == product.emptyProductItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionPath() {
        return this.actionPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEmptyProductItemId() {
        return this.emptyProductItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventInfo() {
        return this.eventInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInterceptType() {
        return this.interceptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconUrl() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Tag getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleName() {
        return this.titleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.productId);
        int iHashCode2 = Integer.hashCode(this.actionType);
        int iHashCode3 = this.actionPath.hashCode();
        int iHashCode4 = this.eventInfo.hashCode();
        int iHashCode5 = this.moduleName.hashCode();
        int iHashCode6 = this.darkIconUrl.hashCode();
        int iHashCode7 = this.lightIconUrl.hashCode();
        int iHashCode8 = Integer.hashCode(this.interceptType);
        int iHashCode9 = this.titleName.hashCode();
        Tag tag = this.tag;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (tag == null ? 0 : tag.hashCode())) * 31) + Long.hashCode(this.emptyProductItemId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmptyProductItemId(long j) {
        this.emptyProductItemId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(Tag tag) {
        this.tag = tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Product(productId=" + this.productId + ", actionType=" + this.actionType + ", actionPath=" + this.actionPath + ", eventInfo=" + this.eventInfo + ", moduleName=" + this.moduleName + ", darkIconUrl=" + this.darkIconUrl + ", lightIconUrl=" + this.lightIconUrl + ", interceptType=" + this.interceptType + ", titleName=" + this.titleName + ", tag=" + this.tag + ", emptyProductItemId=" + this.emptyProductItemId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.productId);
        parcel.writeInt(this.actionType);
        parcel.writeString(this.actionPath);
        parcel.writeString(this.eventInfo);
        parcel.writeString(this.moduleName);
        parcel.writeString(this.darkIconUrl);
        parcel.writeString(this.lightIconUrl);
        parcel.writeInt(this.interceptType);
        parcel.writeString(this.titleName);
        Tag tag = this.tag;
        if (tag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tag.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.emptyProductItemId);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.api.bean.Product.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Product> serializer() {
            return Product$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Product(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, String str6, Tag tag, long j, SerializationConstructorMarker serializationConstructorMarker) {
        this.productId = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.actionType = 0;
        } else {
            this.actionType = i3;
        }
        if ((i & 4) == 0) {
            this.actionPath = "";
        } else {
            this.actionPath = str;
        }
        if ((i & 8) == 0) {
            this.eventInfo = "";
        } else {
            this.eventInfo = str2;
        }
        if ((i & 16) == 0) {
            this.moduleName = "";
        } else {
            this.moduleName = str3;
        }
        if ((i & 32) == 0) {
            this.darkIconUrl = "";
        } else {
            this.darkIconUrl = str4;
        }
        if ((i & 64) == 0) {
            this.lightIconUrl = "";
        } else {
            this.lightIconUrl = str5;
        }
        if ((i & 128) == 0) {
            this.interceptType = 0;
        } else {
            this.interceptType = i4;
        }
        if ((i & 256) == 0) {
            this.titleName = "";
        } else {
            this.titleName = str6;
        }
        if ((i & 512) == 0) {
            this.tag = null;
        } else {
            this.tag = tag;
        }
        if ((i & 1024) == 0) {
            this.emptyProductItemId = 0L;
        } else {
            this.emptyProductItemId = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKProductMatrix_product_matrix_api(Product product, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || product.productId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, product.productId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || product.actionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, product.actionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) product.actionPath, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, product.actionPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) product.eventInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, product.eventInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) product.moduleName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, product.moduleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) product.darkIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, product.darkIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) product.lightIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, product.lightIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || product.interceptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, product.interceptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) product.titleName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, product.titleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || product.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, Tag$$serializer.INSTANCE, product.tag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && product.emptyProductItemId == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 10, product.emptyProductItemId);
    }

    public Product(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i3, @NotNull String str6, Tag tag, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.productId = i;
        this.actionType = i2;
        this.actionPath = str;
        this.eventInfo = str2;
        this.moduleName = str3;
        this.darkIconUrl = str4;
        this.lightIconUrl = str5;
        this.interceptType = i3;
        this.titleName = str6;
        this.tag = tag;
        this.emptyProductItemId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:com.okinc.productmatrix.api.bean.Tag:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.productmatrix.api.bean.Tag) : (r23v0 com.okinc.productmatrix.api.bean.Tag))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.productmatrix.api.bean.Tag, long):void (m)] (LINE:26) call: com.okinc.productmatrix.api.bean.Product.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.productmatrix.api.bean.Tag, long):void type: THIS */
    public /* synthetic */ Product(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, Tag tag, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) == 0 ? str6 : "", (i4 & 512) != 0 ? null : tag, (i4 & 1024) != 0 ? 0L : j);
    }
}
