package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class RiskStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<RiskStatus> CREATOR;
    public static final Companion Companion;
    private final int code;

    @SerialName("0")
    public static final RiskStatus GoToKyc = new RiskStatus("GoToKyc", 0, 0);

    @SerialName("1")
    public static final RiskStatus QUESTION = new RiskStatus("QUESTION", 1, 1);

    @SerialName("2")
    public static final RiskStatus NORestrict = new RiskStatus("NORestrict", 2, 2);

    @SerialName("3")
    public static final RiskStatus FINAL_CONSENT = new RiskStatus("FINAL_CONSENT", 3, 3);

    @SerialName("4")
    public static final RiskStatus COOLING_PERIOD = new RiskStatus("COOLING_PERIOD", 4, 4);

    @SerialName("5")
    public static final RiskStatus REDIRECTION = new RiskStatus("REDIRECTION", 5, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final RiskStatus NO_DIALOG_QUESTION = new RiskStatus("NO_DIALOG_QUESTION", 6, 6);

    @SerialName("7")
    public static final RiskStatus VERIFY_CENTER = new RiskStatus("VERIFY_CENTER", 7, 7);

    @SerialName("8")
    public static final RiskStatus EXIT = new RiskStatus("EXIT", 8, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskStatus[] $values() {
        return new RiskStatus[]{GoToKyc, QUESTION, NORestrict, FINAL_CONSENT, COOLING_PERIOD, REDIRECTION, NO_DIALOG_QUESTION, VERIFY_CENTER, EXIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) RiskStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RiskStatus> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus", values(), new String[]{"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8"}, new Annotation[][]{null, null, null, null, null, null, null, null, null}, null);
    }

    private RiskStatus(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        RiskStatus[] riskStatusArr$values = $values();
        $VALUES = riskStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<RiskStatus>() { // from class: com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return RiskStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskStatus[] newArray(int i) {
                return new RiskStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RiskStatus._init_$_anonymous_();
            }
        });
    }

    public static RiskStatus valueOf(String str) {
        return (RiskStatus) Enum.valueOf(RiskStatus.class, str);
    }

    public static RiskStatus[] values() {
        return (RiskStatus[]) $VALUES.clone();
    }
}
