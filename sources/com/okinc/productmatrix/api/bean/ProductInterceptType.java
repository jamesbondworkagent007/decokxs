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
/* JADX INFO: loaded from: classes24.dex */
public final class ProductInterceptType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductInterceptType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ProductInterceptType STRAIGHT = new ProductInterceptType("STRAIGHT", 0, 0);
    public static final ProductInterceptType LOGIN = new ProductInterceptType("LOGIN", 1, 1);
    public static final ProductInterceptType LOGIN_MAIN_ACCOUNT = new ProductInterceptType("LOGIN_MAIN_ACCOUNT", 2, 2);
    public static final ProductInterceptType LOGIN_SUB_ACCOUNT = new ProductInterceptType("LOGIN_SUB_ACCOUNT", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductInterceptType[] $values() {
        return new ProductInterceptType[]{STRAIGHT, LOGIN, LOGIN_MAIN_ACCOUNT, LOGIN_SUB_ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductInterceptType> getEntries() {
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

    private ProductInterceptType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ProductInterceptType[] productInterceptTypeArr$values = $values();
        $VALUES = productInterceptTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productInterceptTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ProductInterceptType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ProductInterceptType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.api.bean.ProductInterceptType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ProductInterceptType valueOf(int i) {
            if (i == 0) {
                return ProductInterceptType.STRAIGHT;
            }
            if (i == 1) {
                return ProductInterceptType.LOGIN;
            }
            if (i == 2) {
                return ProductInterceptType.LOGIN_MAIN_ACCOUNT;
            }
            if (i != 4) {
                return null;
            }
            return ProductInterceptType.LOGIN_SUB_ACCOUNT;
        }

        public final boolean isValid(int i) {
            ProductInterceptType productInterceptType;
            ProductInterceptType[] productInterceptTypeArrValues = ProductInterceptType.values();
            int length = productInterceptTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    productInterceptType = null;
                    break;
                }
                productInterceptType = productInterceptTypeArrValues[i2];
                if (productInterceptType.getType() == i) {
                    break;
                }
                i2++;
            }
            return productInterceptType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductInterceptType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ProductInterceptType productInterceptTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(productInterceptTypeValueOf);
            return productInterceptTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductInterceptType[] newArray(int i) {
            return new ProductInterceptType[i];
        }
    }

    public static ProductInterceptType valueOf(String str) {
        return (ProductInterceptType) Enum.valueOf(ProductInterceptType.class, str);
    }

    public static ProductInterceptType[] values() {
        return (ProductInterceptType[]) $VALUES.clone();
    }
}
