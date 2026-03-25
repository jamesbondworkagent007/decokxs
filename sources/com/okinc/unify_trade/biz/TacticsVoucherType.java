package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.TacticsVoucherType;
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
/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TacticsVoucherType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TacticsVoucherType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<TacticsVoucherType> CREATOR;
    public static final Companion Companion;
    private final String code;

    @SerialName("1")
    public static final TacticsVoucherType INTEREST_RATE = new TacticsVoucherType("INTEREST_RATE", 0, "1");

    @SerialName("2")
    public static final TacticsVoucherType STRATEGY_COMPENSATION = new TacticsVoucherType("STRATEGY_COMPENSATION", 1, "2");

    @SerialName("3")
    public static final TacticsVoucherType COPYTRADING_COMPENSATION = new TacticsVoucherType("COPYTRADING_COMPENSATION", 2, "3");

    @SerialName("4")
    public static final TacticsVoucherType AIRDROP = new TacticsVoucherType("AIRDROP", 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TacticsVoucherType[] $values() {
        return new TacticsVoucherType[]{INTEREST_RATE, STRATEGY_COMPENSATION, COPYTRADING_COMPENSATION, AIRDROP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TacticsVoucherType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TacticsVoucherType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) TacticsVoucherType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TacticsVoucherType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.biz.TacticsVoucherType", values(), new String[]{"1", "2", "3", "4"}, new Annotation[][]{null, null, null, null}, null);
    }

    private TacticsVoucherType(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        TacticsVoucherType[] tacticsVoucherTypeArr$values = $values();
        $VALUES = tacticsVoucherTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tacticsVoucherTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TacticsVoucherType>() { // from class: com.okinc.unify_trade.biz.TacticsVoucherType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TacticsVoucherType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TacticsVoucherType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TacticsVoucherType[] newArray(int i) {
                return new TacticsVoucherType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TacticsVoucherType._init_$_anonymous_();
            }
        });
    }

    public static TacticsVoucherType valueOf(String str) {
        return (TacticsVoucherType) Enum.valueOf(TacticsVoucherType.class, str);
    }

    public static TacticsVoucherType[] values() {
        return (TacticsVoucherType[]) $VALUES.clone();
    }
}
