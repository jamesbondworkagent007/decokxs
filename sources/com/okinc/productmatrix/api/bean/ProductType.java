package com.okinc.productmatrix.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ProductType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ProductType PREDEFINED = new ProductType("PREDEFINED", 0, 0);
    public static final ProductType NATIVE_ROUTE = new ProductType("NATIVE_ROUTE", 1, 1);
    public static final ProductType WEB_LINK = new ProductType("WEB_LINK", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{PREDEFINED, NATIVE_ROUTE, WEB_LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private ProductType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ProductType[] productTypeArr$values = $values();
        $VALUES = productTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ProductType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ProductType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.api.bean.ProductType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ProductType valueOf(int i) {
            if (i == 0) {
                return ProductType.PREDEFINED;
            }
            if (i == 1) {
                return ProductType.NATIVE_ROUTE;
            }
            if (i != 2) {
                return null;
            }
            return ProductType.WEB_LINK;
        }

        public final boolean isValid(int i) {
            ProductType productType;
            ProductType[] productTypeArrValues = ProductType.values();
            int length = productTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    productType = null;
                    break;
                }
                productType = productTypeArrValues[i2];
                if (productType.getType() == i) {
                    break;
                }
                i2++;
            }
            return productType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ProductType productTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(productTypeValueOf);
            return productTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductType[] newArray(int i) {
            return new ProductType[i];
        }
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
