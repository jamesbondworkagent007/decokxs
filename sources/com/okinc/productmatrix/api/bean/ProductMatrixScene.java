package com.okinc.productmatrix.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ProductMatrixScene implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductMatrixScene[] $VALUES;
    public static final CREATOR CREATOR;
    private final String scene;
    public static final ProductMatrixScene PRO_EXCHANGE = new ProductMatrixScene("PRO_EXCHANGE", 0, "0");
    public static final ProductMatrixScene PRO_PAY = new ProductMatrixScene("PRO_PAY", 1, "1");
    public static final ProductMatrixScene LITE_SIMPLE = new ProductMatrixScene("LITE_SIMPLE", 2, "2");
    public static final ProductMatrixScene LITE_ADVANCE = new ProductMatrixScene("LITE_ADVANCE", 3, "3");
    public static final ProductMatrixScene LITE_PAY = new ProductMatrixScene("LITE_PAY", 4, "4");
    public static final ProductMatrixScene WEB3 = new ProductMatrixScene("WEB3", 5, "5");
    public static final ProductMatrixScene DEMO_TRADING = new ProductMatrixScene("DEMO_TRADING", 6, OrderDetailListItem.SLIP_OUT);
    public static final ProductMatrixScene LITE_LEGACY = new ProductMatrixScene("LITE_LEGACY", 7, "7");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductMatrixScene[] $values() {
        return new ProductMatrixScene[]{PRO_EXCHANGE, PRO_PAY, LITE_SIMPLE, LITE_ADVANCE, LITE_PAY, WEB3, DEMO_TRADING, LITE_LEGACY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductMatrixScene> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    private ProductMatrixScene(String str, int i, String str2) {
        this.scene = str2;
    }

    static {
        ProductMatrixScene[] productMatrixSceneArr$values = $values();
        $VALUES = productMatrixSceneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productMatrixSceneArr$values);
        CREATOR = new CREATOR(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ProductMatrixScene(String str, int i, Parcel parcel) {
        String string = parcel.readString();
        this(str, i, string == null ? "" : string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.scene);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class CREATOR implements Parcelable.Creator<ProductMatrixScene> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.productmatrix.api.bean.ProductMatrixScene.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ProductMatrixScene valueOf(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (ProductMatrixScene productMatrixScene : ProductMatrixScene.values()) {
                if (Intrinsics.EZpvd((Object) productMatrixScene.getScene(), (Object) str)) {
                    return productMatrixScene;
                }
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductMatrixScene createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ProductMatrixScene productMatrixSceneValueOf = valueOf(string != null ? string : "");
            Intrinsics.copydefault(productMatrixSceneValueOf);
            return productMatrixSceneValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductMatrixScene[] newArray(int i) {
            return new ProductMatrixScene[i];
        }
    }

    public static ProductMatrixScene valueOf(String str) {
        return (ProductMatrixScene) Enum.valueOf(ProductMatrixScene.class, str);
    }

    public static ProductMatrixScene[] values() {
        return (ProductMatrixScene[]) $VALUES.clone();
    }
}
