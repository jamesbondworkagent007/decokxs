package com.okinc.okimcore.model.im.group.paidgroup;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sOV;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sOV.class)
public final class BillingCyclePaymentStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BillingCyclePaymentStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<BillingCyclePaymentStatus> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final BillingCyclePaymentStatus UNKNOWN = new BillingCyclePaymentStatus("UNKNOWN", 0, -1);
    public static final BillingCyclePaymentStatus PAID = new BillingCyclePaymentStatus("PAID", 1, 0);
    public static final BillingCyclePaymentStatus OVERDUE = new BillingCyclePaymentStatus("OVERDUE", 2, 1);
    public static final BillingCyclePaymentStatus EXEMPTED = new BillingCyclePaymentStatus("EXEMPTED", 3, 2);
    public static final BillingCyclePaymentStatus DUE_SOON = new BillingCyclePaymentStatus("DUE_SOON", 4, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BillingCyclePaymentStatus[] $values() {
        return new BillingCyclePaymentStatus[]{UNKNOWN, PAID, OVERDUE, EXEMPTED, DUE_SOON};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BillingCyclePaymentStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) BillingCyclePaymentStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BillingCyclePaymentStatus> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sOV();
    }

    private BillingCyclePaymentStatus(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        BillingCyclePaymentStatus[] billingCyclePaymentStatusArr$values = $values();
        $VALUES = billingCyclePaymentStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(billingCyclePaymentStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<BillingCyclePaymentStatus>() { // from class: com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingCyclePaymentStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BillingCyclePaymentStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingCyclePaymentStatus[] newArray(int i) {
                return new BillingCyclePaymentStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BillingCyclePaymentStatus._init_$_anonymous_();
            }
        });
    }

    public static BillingCyclePaymentStatus valueOf(String str) {
        return (BillingCyclePaymentStatus) Enum.valueOf(BillingCyclePaymentStatus.class, str);
    }

    public static BillingCyclePaymentStatus[] values() {
        return (BillingCyclePaymentStatus[]) $VALUES.clone();
    }
}
