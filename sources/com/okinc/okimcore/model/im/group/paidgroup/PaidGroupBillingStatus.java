package com.okinc.okimcore.model.im.group.paidgroup;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44420sPd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44420sPd.class)
public final class PaidGroupBillingStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaidGroupBillingStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PaidGroupBillingStatus> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final PaidGroupBillingStatus UNKNOWN = new PaidGroupBillingStatus("UNKNOWN", 0, -1);
    public static final PaidGroupBillingStatus DISABLED = new PaidGroupBillingStatus("DISABLED", 1, 0);
    public static final PaidGroupBillingStatus ENABLED = new PaidGroupBillingStatus("ENABLED", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaidGroupBillingStatus[] $values() {
        return new PaidGroupBillingStatus[]{UNKNOWN, DISABLED, ENABLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaidGroupBillingStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) PaidGroupBillingStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaidGroupBillingStatus> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44420sPd();
    }

    private PaidGroupBillingStatus(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        PaidGroupBillingStatus[] paidGroupBillingStatusArr$values = $values();
        $VALUES = paidGroupBillingStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paidGroupBillingStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PaidGroupBillingStatus>() { // from class: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaidGroupBillingStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PaidGroupBillingStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaidGroupBillingStatus[] newArray(int i) {
                return new PaidGroupBillingStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PaidGroupBillingStatus._init_$_anonymous_();
            }
        });
    }

    public static PaidGroupBillingStatus valueOf(String str) {
        return (PaidGroupBillingStatus) Enum.valueOf(PaidGroupBillingStatus.class, str);
    }

    public static PaidGroupBillingStatus[] values() {
        return (PaidGroupBillingStatus[]) $VALUES.clone();
    }
}
