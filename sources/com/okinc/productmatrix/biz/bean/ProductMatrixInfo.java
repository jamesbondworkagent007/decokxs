package com.okinc.productmatrix.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.productmatrix.api.bean.ProductGroup;
import com.okinc.productmatrix.api.bean.ProductGroup$$serializer;
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
public final class ProductMatrixInfo implements Parcelable {
    private final ProductGroup personalProducts;
    private final List<ProductGroup> productGroups;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProductMatrixInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ProductGroup$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ProductMatrixInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductMatrixInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ProductGroup productGroup = (ProductGroup) parcel.readParcelable(ProductMatrixInfo.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ProductMatrixInfo.class.getClassLoader()));
            }
            return new ProductMatrixInfo(productGroup, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductMatrixInfo[] newArray(int i) {
            return new ProductMatrixInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductMatrixInfo() {
        this((ProductGroup) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.productmatrix.biz.bean.ProductMatrixInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductMatrixInfo copy$default(ProductMatrixInfo productMatrixInfo, ProductGroup productGroup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            productGroup = productMatrixInfo.personalProducts;
        }
        if ((i & 2) != 0) {
            list = productMatrixInfo.productGroups;
        }
        return productMatrixInfo.copy(productGroup, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductGroup component1() {
        return this.personalProducts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProductGroup> component2() {
        return this.productGroups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductMatrixInfo copy(ProductGroup productGroup, @NotNull List<ProductGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProductMatrixInfo(productGroup, list);
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
        if (!(obj instanceof ProductMatrixInfo)) {
            return false;
        }
        ProductMatrixInfo productMatrixInfo = (ProductMatrixInfo) obj;
        return Intrinsics.EZpvd(this.personalProducts, productMatrixInfo.personalProducts) && Intrinsics.EZpvd(this.productGroups, productMatrixInfo.productGroups);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductGroup getPersonalProducts() {
        return this.personalProducts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProductGroup> getProductGroups() {
        return this.productGroups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ProductGroup productGroup = this.personalProducts;
        return ((productGroup == null ? 0 : productGroup.hashCode()) * 31) + this.productGroups.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductMatrixInfo(personalProducts=" + this.personalProducts + ", productGroups=" + this.productGroups + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.personalProducts, i);
        List<ProductGroup> list = this.productGroups;
        parcel.writeInt(list.size());
        Iterator<ProductGroup> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.biz.bean.ProductMatrixInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductMatrixInfo> serializer() {
            return ProductMatrixInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductMatrixInfo(int i, ProductGroup productGroup, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.personalProducts = (i & 1) == 0 ? null : productGroup;
        if ((i & 2) == 0) {
            this.productGroups = new ArrayList();
        } else {
            this.productGroups = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKProductMatrix_product_matrix_impl(ProductMatrixInfo productMatrixInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productMatrixInfo.personalProducts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ProductGroup$$serializer.INSTANCE, productMatrixInfo.personalProducts);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(productMatrixInfo.productGroups, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], productMatrixInfo.productGroups);
    }

    public ProductMatrixInfo(ProductGroup productGroup, @NotNull List<ProductGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.personalProducts = productGroup;
        this.productGroups = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:com.okinc.productmatrix.api.bean.ProductGroup:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.productmatrix.api.bean.ProductGroup) : (r1v0 com.okinc.productmatrix.api.bean.ProductGroup))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:18) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(com.okinc.productmatrix.api.bean.ProductGroup, java.util.List<com.okinc.productmatrix.api.bean.ProductGroup>):void (m)] (LINE:16) call: com.okinc.productmatrix.biz.bean.ProductMatrixInfo.<init>(com.okinc.productmatrix.api.bean.ProductGroup, java.util.List):void type: THIS */
    public /* synthetic */ ProductMatrixInfo(ProductGroup productGroup, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productGroup, (i & 2) != 0 ? new ArrayList() : list);
    }
}
