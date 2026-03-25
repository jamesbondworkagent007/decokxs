package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.unify_trade.biz.VoucherStatus;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C55688xof;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface VoucherStatus {
    Integer getLabel();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class InterestBoostVoucherStatus implements Parcelable, VoucherStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InterestBoostVoucherStatus[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<InterestBoostVoucherStatus> CREATOR;
        public static final Companion Companion;
        private final String code;
        private final Integer label;

        @SerialName("1")
        public static final InterestBoostVoucherStatus IN_USE = new InterestBoostVoucherStatus("IN_USE", 0, "1", Integer.valueOf(C55688xof.Application.write));

        @SerialName("2")
        public static final InterestBoostVoucherStatus IN_SETTLEMENT = new InterestBoostVoucherStatus("IN_SETTLEMENT", 1, "2", Integer.valueOf(C55688xof.Application.AudioAttributesCompatParcelizer));

        @SerialName("3")
        public static final InterestBoostVoucherStatus ISSUED = new InterestBoostVoucherStatus("ISSUED", 2, "3", Integer.valueOf(C55688xof.Application.AudioAttributesImplApi21Parcelizer));

        public static final class Creator implements Parcelable.Creator<InterestBoostVoucherStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InterestBoostVoucherStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return InterestBoostVoucherStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InterestBoostVoucherStatus[] newArray(int i) {
                return new InterestBoostVoucherStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InterestBoostVoucherStatus[] $values() {
            return new InterestBoostVoucherStatus[]{IN_USE, IN_SETTLEMENT, ISSUED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InterestBoostVoucherStatus> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.biz.VoucherStatus
        public Integer getLabel() {
            return this.label;
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

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VoucherStatus.InterestBoostVoucherStatus.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer copydefault() {
                return (KSerializer) InterestBoostVoucherStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<InterestBoostVoucherStatus> serializer() {
                return copydefault();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.biz.VoucherStatus.InterestBoostVoucherStatus", values(), new String[]{"1", "2", "3"}, new Annotation[][]{null, null, null}, null);
        }

        private InterestBoostVoucherStatus(String str, @StringRes int i, String str2, Integer num) {
            this.code = str2;
            this.label = num;
        }

        static {
            InterestBoostVoucherStatus[] interestBoostVoucherStatusArr$values = $values();
            $VALUES = interestBoostVoucherStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(interestBoostVoucherStatusArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VoucherStatus.InterestBoostVoucherStatus._init_$_anonymous_();
                }
            });
        }

        public static InterestBoostVoucherStatus valueOf(String str) {
            return (InterestBoostVoucherStatus) Enum.valueOf(InterestBoostVoucherStatus.class, str);
        }

        public static InterestBoostVoucherStatus[] values() {
            return (InterestBoostVoucherStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class LossInsuranceVoucherStatus implements Parcelable, VoucherStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LossInsuranceVoucherStatus[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<LossInsuranceVoucherStatus> CREATOR;
        public static final Companion Companion;
        private final String code;
        private final Integer label;

        @SerialName("1")
        public static final LossInsuranceVoucherStatus UNISSUED = new LossInsuranceVoucherStatus("UNISSUED", 0, "1", null);

        @SerialName("2")
        public static final LossInsuranceVoucherStatus PENDING_USE = new LossInsuranceVoucherStatus("PENDING_USE", 1, "2", null);

        @SerialName("3")
        public static final LossInsuranceVoucherStatus IN_USE = new LossInsuranceVoucherStatus("IN_USE", 2, "3", Integer.valueOf(C55688xof.Application.write));

        @SerialName("4")
        public static final LossInsuranceVoucherStatus SETTLING = new LossInsuranceVoucherStatus("SETTLING", 3, "4", Integer.valueOf(C55688xof.Application.AudioAttributesCompatParcelizer));

        @SerialName("5")
        public static final LossInsuranceVoucherStatus NO_COMPENSATION = new LossInsuranceVoucherStatus("NO_COMPENSATION", 4, "5", Integer.valueOf(C55688xof.Application.ReturnThis));

        @SerialName(OrderDetailListItem.SLIP_OUT)
        public static final LossInsuranceVoucherStatus EXPIRED = new LossInsuranceVoucherStatus("EXPIRED", 5, OrderDetailListItem.SLIP_OUT, null);

        @SerialName("7")
        public static final LossInsuranceVoucherStatus COMPENSATED = new LossInsuranceVoucherStatus("COMPENSATED", 6, "7", Integer.valueOf(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase6));

        public static final class Creator implements Parcelable.Creator<LossInsuranceVoucherStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LossInsuranceVoucherStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return LossInsuranceVoucherStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LossInsuranceVoucherStatus[] newArray(int i) {
                return new LossInsuranceVoucherStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LossInsuranceVoucherStatus[] $values() {
            return new LossInsuranceVoucherStatus[]{UNISSUED, PENDING_USE, IN_USE, SETTLING, NO_COMPENSATION, EXPIRED, COMPENSATED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LossInsuranceVoucherStatus> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.biz.VoucherStatus
        public Integer getLabel() {
            return this.label;
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

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VoucherStatus.LossInsuranceVoucherStatus.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer copydefault() {
                return (KSerializer) LossInsuranceVoucherStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<LossInsuranceVoucherStatus> serializer() {
                return copydefault();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.biz.VoucherStatus.LossInsuranceVoucherStatus", values(), new String[]{"1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
        }

        private LossInsuranceVoucherStatus(String str, @StringRes int i, String str2, Integer num) {
            this.code = str2;
            this.label = num;
        }

        static {
            LossInsuranceVoucherStatus[] lossInsuranceVoucherStatusArr$values = $values();
            $VALUES = lossInsuranceVoucherStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(lossInsuranceVoucherStatusArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VoucherStatus.LossInsuranceVoucherStatus._init_$_anonymous_();
                }
            });
        }

        public static LossInsuranceVoucherStatus valueOf(String str) {
            return (LossInsuranceVoucherStatus) Enum.valueOf(LossInsuranceVoucherStatus.class, str);
        }

        public static LossInsuranceVoucherStatus[] values() {
            return (LossInsuranceVoucherStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class AirdropVoucherStatus implements Parcelable, VoucherStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AirdropVoucherStatus[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<AirdropVoucherStatus> CREATOR;
        public static final Companion Companion;
        private final String code;
        private final Integer label;

        @SerialName("2")
        public static final AirdropVoucherStatus PENDING_USE = new AirdropVoucherStatus("PENDING_USE", 0, "2", null);

        @SerialName("3")
        public static final AirdropVoucherStatus IN_USE = new AirdropVoucherStatus("IN_USE", 1, "3", Integer.valueOf(C55688xof.Application.write));

        @SerialName("5")
        public static final AirdropVoucherStatus PAID = new AirdropVoucherStatus("PAID", 2, "5", Integer.valueOf(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection));

        @SerialName(OrderDetailListItem.SLIP_OUT)
        public static final AirdropVoucherStatus EXPIRED = new AirdropVoucherStatus("EXPIRED", 3, OrderDetailListItem.SLIP_OUT, null);

        public static final class Creator implements Parcelable.Creator<AirdropVoucherStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AirdropVoucherStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return AirdropVoucherStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AirdropVoucherStatus[] newArray(int i) {
                return new AirdropVoucherStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AirdropVoucherStatus[] $values() {
            return new AirdropVoucherStatus[]{PENDING_USE, IN_USE, PAID, EXPIRED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AirdropVoucherStatus> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.biz.VoucherStatus
        public Integer getLabel() {
            return this.label;
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

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VoucherStatus.AirdropVoucherStatus.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer KWHzl() {
                return (KSerializer) AirdropVoucherStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<AirdropVoucherStatus> serializer() {
                return KWHzl();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.biz.VoucherStatus.AirdropVoucherStatus", values(), new String[]{"2", "3", "5", OrderDetailListItem.SLIP_OUT}, new Annotation[][]{null, null, null, null}, null);
        }

        private AirdropVoucherStatus(String str, @StringRes int i, String str2, Integer num) {
            this.code = str2;
            this.label = num;
        }

        static {
            AirdropVoucherStatus[] airdropVoucherStatusArr$values = $values();
            $VALUES = airdropVoucherStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(airdropVoucherStatusArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VoucherStatus.AirdropVoucherStatus._init_$_anonymous_();
                }
            });
        }

        public static AirdropVoucherStatus valueOf(String str) {
            return (AirdropVoucherStatus) Enum.valueOf(AirdropVoucherStatus.class, str);
        }

        public static AirdropVoucherStatus[] values() {
            return (AirdropVoucherStatus[]) $VALUES.clone();
        }
    }
}
