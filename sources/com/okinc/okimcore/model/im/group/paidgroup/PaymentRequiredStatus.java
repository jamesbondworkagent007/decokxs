package com.okinc.okimcore.model.im.group.paidgroup;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44421sPe;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44421sPe.class)
public final class PaymentRequiredStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentRequiredStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PaymentRequiredStatus> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final PaymentRequiredStatus UNKNOWN = new PaymentRequiredStatus("UNKNOWN", 0, -1);
    public static final PaymentRequiredStatus NOT_REQUIRED = new PaymentRequiredStatus("NOT_REQUIRED", 1, 0);
    public static final PaymentRequiredStatus REQUIRED = new PaymentRequiredStatus("REQUIRED", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentRequiredStatus[] $values() {
        return new PaymentRequiredStatus[]{UNKNOWN, NOT_REQUIRED, REQUIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentRequiredStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRawValue() {
        return this.rawValue;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) PaymentRequiredStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaymentRequiredStatus> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44421sPe();
    }

    private PaymentRequiredStatus(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        PaymentRequiredStatus[] paymentRequiredStatusArr$values = $values();
        $VALUES = paymentRequiredStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentRequiredStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PaymentRequiredStatus>() { // from class: com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentRequiredStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PaymentRequiredStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentRequiredStatus[] newArray(int i) {
                return new PaymentRequiredStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PaymentRequiredStatus._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.rawValue);
    }

    public static PaymentRequiredStatus valueOf(String str) {
        return (PaymentRequiredStatus) Enum.valueOf(PaymentRequiredStatus.class, str);
    }

    public static PaymentRequiredStatus[] values() {
        return (PaymentRequiredStatus[]) $VALUES.clone();
    }
}
