package com.okinc.unify_trade.bot.constant;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
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
public final class ArbInvestDetailsBeanStakingType4UI implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ArbInvestDetailsBeanStakingType4UI[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<ArbInvestDetailsBeanStakingType4UI> CREATOR;
    public static final Companion Companion;

    @SerialName("1")
    public static final ArbInvestDetailsBeanStakingType4UI STAKING = new ArbInvestDetailsBeanStakingType4UI("STAKING", 0);

    @SerialName("0")
    public static final ArbInvestDetailsBeanStakingType4UI NOT_STAKING = new ArbInvestDetailsBeanStakingType4UI("NOT_STAKING", 1);

    @SerialName("2")
    public static final ArbInvestDetailsBeanStakingType4UI NOT_SUPPORT_STAKING = new ArbInvestDetailsBeanStakingType4UI("NOT_SUPPORT_STAKING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ArbInvestDetailsBeanStakingType4UI[] $values() {
        return new ArbInvestDetailsBeanStakingType4UI[]{STAKING, NOT_STAKING, NOT_SUPPORT_STAKING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ArbInvestDetailsBeanStakingType4UI> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ArbInvestDetailsBeanStakingType4UI.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ArbInvestDetailsBeanStakingType4UI> serializer() {
            return EZpvd();
        }
    }

    private ArbInvestDetailsBeanStakingType4UI(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI", values(), new String[]{"1", "0", "2"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        ArbInvestDetailsBeanStakingType4UI[] arbInvestDetailsBeanStakingType4UIArr$values = $values();
        $VALUES = arbInvestDetailsBeanStakingType4UIArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(arbInvestDetailsBeanStakingType4UIArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<ArbInvestDetailsBeanStakingType4UI>() { // from class: com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ArbInvestDetailsBeanStakingType4UI createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ArbInvestDetailsBeanStakingType4UI.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ArbInvestDetailsBeanStakingType4UI[] newArray(int i) {
                return new ArbInvestDetailsBeanStakingType4UI[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ArbInvestDetailsBeanStakingType4UI._init_$_anonymous_();
            }
        });
    }

    public static ArbInvestDetailsBeanStakingType4UI valueOf(String str) {
        return (ArbInvestDetailsBeanStakingType4UI) Enum.valueOf(ArbInvestDetailsBeanStakingType4UI.class, str);
    }

    public static ArbInvestDetailsBeanStakingType4UI[] values() {
        return (ArbInvestDetailsBeanStakingType4UI[]) $VALUES.clone();
    }
}
