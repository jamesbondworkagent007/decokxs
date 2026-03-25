package com.okinc.productmatrix.api.bean;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ProductGroup implements Parcelable {
    private boolean editable;
    private final int groupId;
    private final String groupName;
    private List<Product> products;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProductGroup> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(Product$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ProductGroup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Product.CREATOR.createFromParcel(parcel));
            }
            return new ProductGroup(string, i, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductGroup[] newArray(int i) {
            return new ProductGroup[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductGroup() {
        this((String) null, 0, false, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.productmatrix.api.bean.ProductGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductGroup copy$default(ProductGroup productGroup, String str, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productGroup.groupName;
        }
        if ((i2 & 2) != 0) {
            i = productGroup.groupId;
        }
        if ((i2 & 4) != 0) {
            z = productGroup.editable;
        }
        if ((i2 & 8) != 0) {
            list = productGroup.products;
        }
        return productGroup.copy(str, i, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Product> component4() {
        return this.products;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductGroup copy(@NotNull String str, int i, boolean z, @NotNull List<Product> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ProductGroup(str, i, z, list);
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
        if (!(obj instanceof ProductGroup)) {
            return false;
        }
        ProductGroup productGroup = (ProductGroup) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) productGroup.groupName) && this.groupId == productGroup.groupId && this.editable == productGroup.editable && Intrinsics.EZpvd(this.products, productGroup.products);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Product> getProducts() {
        return this.products;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.groupName.hashCode() * 31) + Integer.hashCode(this.groupId)) * 31) + Boolean.hashCode(this.editable)) * 31) + this.products.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditable(boolean z) {
        this.editable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProducts(@NotNull List<Product> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.products = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductGroup(groupName=" + this.groupName + ", groupId=" + this.groupId + ", editable=" + this.editable + ", products=" + this.products + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupName);
        parcel.writeInt(this.groupId);
        parcel.writeInt(this.editable ? 1 : 0);
        List<Product> list = this.products;
        parcel.writeInt(list.size());
        Iterator<Product> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.api.bean.ProductGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductGroup> serializer() {
            return ProductGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductGroup(int i, String str, int i2, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.groupName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.groupId = -1;
        } else {
            this.groupId = i2;
        }
        if ((i & 4) == 0) {
            this.editable = false;
        } else {
            this.editable = z;
        }
        if ((i & 8) == 0) {
            this.products = new ArrayList();
        } else {
            this.products = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKProductMatrix_product_matrix_api(ProductGroup productGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) productGroup.groupName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, productGroup.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productGroup.groupId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, productGroup.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || productGroup.editable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, productGroup.editable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(productGroup.products, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], productGroup.products);
    }

    public ProductGroup(@NotNull String str, int i, boolean z, @NotNull List<Product> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupName = str;
        this.groupId = i;
        this.editable = z;
        this.products = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:20) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.List))
 A[MD:(java.lang.String, int, boolean, java.util.List<com.okinc.productmatrix.api.bean.Product>):void (m)] (LINE:16) call: com.okinc.productmatrix.api.bean.ProductGroup.<init>(java.lang.String, int, boolean, java.util.List):void type: THIS */
    public /* synthetic */ ProductGroup(String str, int i, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new ArrayList() : list);
    }
}
