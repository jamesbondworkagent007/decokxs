package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodCategory;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PaymentMethodCategory implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentMethodCategory[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PaymentMethodCategory> CREATOR;
    public static final Companion Companion;
    private final int code;
    public static final PaymentMethodCategory CASH = new PaymentMethodCategory("CASH", 0, 0);
    public static final PaymentMethodCategory STABLECOIN = new PaymentMethodCategory("STABLECOIN", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentMethodCategory[] $values() {
        return new PaymentMethodCategory[]{CASH, STABLECOIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentMethodCategory> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodCategory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) PaymentMethodCategory.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaymentMethodCategory> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodCategory", values());
    }

    private PaymentMethodCategory(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        PaymentMethodCategory[] paymentMethodCategoryArr$values = $values();
        $VALUES = paymentMethodCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentMethodCategoryArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PaymentMethodCategory>() { // from class: com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodCategory.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PaymentMethodCategory.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCategory[] newArray(int i) {
                return new PaymentMethodCategory[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PaymentMethodCategory._init_$_anonymous_();
            }
        });
    }

    public static PaymentMethodCategory valueOf(String str) {
        return (PaymentMethodCategory) Enum.valueOf(PaymentMethodCategory.class, str);
    }

    public static PaymentMethodCategory[] values() {
        return (PaymentMethodCategory[]) $VALUES.clone();
    }
}
