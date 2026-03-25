package com.okinc.tradingbot.impl.planet.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class BotDisplayType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotDisplayType[] $VALUES;
    public static final Parcelable.Creator<BotDisplayType> CREATOR;
    public static final Application Companion;
    private final int displayKey;
    private final String value;
    public static final BotDisplayType YieldRatioOnly = new BotDisplayType("YieldRatioOnly", 0, C48033uCm.Fragment.hcetpZ, "ratioOnly");
    public static final BotDisplayType PnLAndYieldRatio = new BotDisplayType("PnLAndYieldRatio", 1, C48033uCm.Fragment.dXcUrg, "pnlAndRatio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotDisplayType[] $values() {
        return new BotDisplayType[]{YieldRatioOnly, PnLAndYieldRatio};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotDisplayType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayKey() {
        return this.displayKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private BotDisplayType(@StringRes String str, int i, int i2, String str2) {
        this.displayKey = i2;
        this.value = str2;
    }

    static {
        BotDisplayType[] botDisplayTypeArr$values = $values();
        $VALUES = botDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botDisplayTypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<BotDisplayType>() { // from class: com.okinc.tradingbot.impl.planet.model.BotDisplayType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotDisplayType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BotDisplayType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotDisplayType[] newArray(int i) {
                return new BotDisplayType[i];
            }
        };
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.model.BotDisplayType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final BotDisplayType KWHzl(String str) {
            BotDisplayType next;
            Iterator<BotDisplayType> it = BotDisplayType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            BotDisplayType botDisplayType = next;
            return botDisplayType == null ? BotDisplayType.YieldRatioOnly : botDisplayType;
        }
    }

    public static BotDisplayType valueOf(String str) {
        return (BotDisplayType) Enum.valueOf(BotDisplayType.class, str);
    }

    public static BotDisplayType[] values() {
        return (BotDisplayType[]) $VALUES.clone();
    }
}
