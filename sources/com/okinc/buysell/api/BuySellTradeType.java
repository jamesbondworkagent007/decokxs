package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.buysell.api.BuySellTradeType;
import java.util.Iterator;
import java.util.Locale;
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
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BuySellTradeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellTradeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<BuySellTradeType> CREATOR;
    public static final Companion Companion;
    private final String type;
    public static final BuySellTradeType BUY = new BuySellTradeType("BUY", 0, "buy");
    public static final BuySellTradeType SELL = new BuySellTradeType("SELL", 1, "sell");
    public static final BuySellTradeType CONVERT = new BuySellTradeType("CONVERT", 2, "convert");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellTradeType[] $values() {
        return new BuySellTradeType[]{BUY, SELL, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellTradeType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private BuySellTradeType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        BuySellTradeType[] buySellTradeTypeArr$values = $values();
        $VALUES = buySellTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellTradeTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<BuySellTradeType>() { // from class: com.okinc.buysell.api.BuySellTradeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuySellTradeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BuySellTradeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuySellTradeType[] newArray(int i) {
                return new BuySellTradeType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ltj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BuySellTradeType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.BuySellTradeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) BuySellTradeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BuySellTradeType> serializer() {
            return EZpvd();
        }

        public final BuySellTradeType AEQbTJ(@NotNull String str) {
            BuySellTradeType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<BuySellTradeType> it = BuySellTradeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String type = next.getType();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.EZpvd((Object) type, (Object) lowerCase)) {
                    break;
                }
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.api.BuySellTradeType", values());
    }

    public static BuySellTradeType valueOf(String str) {
        return (BuySellTradeType) Enum.valueOf(BuySellTradeType.class, str);
    }

    public static BuySellTradeType[] values() {
        return (BuySellTradeType[]) $VALUES.clone();
    }
}
