package com.okinc.tradingbot.impl.order.strategy.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
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
/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotStopType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotStopType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<BotStopType> CREATOR;
    public static final Companion Companion;
    private final String code;

    @SerialName("1")
    public static final BotStopType StopAndSell = new BotStopType("StopAndSell", 0, "1");

    @SerialName("2")
    public static final BotStopType StopButNotSell = new BotStopType("StopButNotSell", 1, "2");

    @SerialName("5")
    public static final BotStopType StopAndSellToUsdt = new BotStopType("StopAndSellToUsdt", 2, "5");

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final BotStopType StopAndKeepStakingSpot = new BotStopType("StopAndKeepStakingSpot", 3, OrderDetailListItem.SLIP_OUT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotStopType[] $values() {
        return new BotStopType[]{StopAndSell, StopButNotSell, StopAndSellToUsdt, StopAndKeepStakingSpot};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotStopType> getEntries() {
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

    private BotStopType(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        BotStopType[] botStopTypeArr$values = $values();
        $VALUES = botStopTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botStopTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<BotStopType>() { // from class: com.okinc.tradingbot.impl.order.strategy.data.BotStopType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotStopType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BotStopType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotStopType[] newArray(int i) {
                return new BotStopType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.vLj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotStopType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.data.BotStopType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) BotStopType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BotStopType> serializer() {
            return copydefault();
        }

        public final BotStopType OLrzqt(String str) {
            for (BotStopType botStopType : BotStopType.values()) {
                if (Intrinsics.EZpvd((Object) botStopType.getCode(), (Object) str)) {
                    return botStopType;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.tradingbot.impl.order.strategy.data.BotStopType", values(), new String[]{"1", "2", "5", OrderDetailListItem.SLIP_OUT}, new Annotation[][]{null, null, null, null}, null);
    }

    public static BotStopType valueOf(String str) {
        return (BotStopType) Enum.valueOf(BotStopType.class, str);
    }

    public static BotStopType[] values() {
        return (BotStopType[]) $VALUES.clone();
    }
}
