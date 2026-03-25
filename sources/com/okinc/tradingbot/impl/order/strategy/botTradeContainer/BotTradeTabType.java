package com.okinc.tradingbot.impl.order.strategy.botTradeContainer;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C50170vEm;
import o.C50312vJt;
import o.C53273wiQ;
import o.C55688xof;
import o.C56071xvr;
import o.C56390yDp;
import o.C56444yFp;
import o.InterfaceC47982uAp;
import o.InterfaceC56445yFq;
import o.vNN;
import o.wIG;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public abstract class BotTradeTabType implements InterfaceC47982uAp, Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotTradeTabType[] $VALUES;
    public static final Parcelable.Creator<BotTradeTabType> CREATOR;
    public static final TaskDescription Companion;
    public static final String E2E_AI_TAB = "aiStrategyTab";
    public static final String E2E_MANUAL_TAB = "manualTab";
    private static final String E2E_SMART_TAB = "smartStrategyTab";
    private final String type;
    public static final BotTradeTabType AI = new BotTradeTabType("AI", 0) { // from class: com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType.AI
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "ai";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            return wIG.Companion.EZpvd((String) first);
        }
    };
    public static final BotTradeTabType MANUAL = new BotTradeTabType("MANUAL", 1) { // from class: com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType.MANUAL
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "manual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=4] */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        @Override // o.InterfaceC47982uAp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Fragment getFragment(Object obj) {
            Fragment vnn;
            Intrinsics.copydefault(obj, "");
            Pair pair = (Pair) obj;
            Object first = pair.getFirst();
            Intrinsics.copydefault(first, "");
            String str = (String) first;
            Object second = pair.getSecond();
            Intrinsics.copydefault(second, "");
            Bundle bundle = (Bundle) second;
            switch (str.hashCode()) {
                case -1831183611:
                    vnn = !str.equals("spot_dca") ? new vNN() : new C53273wiQ();
                    break;
                case -1402017003:
                    if (str.equals("contract_dca")) {
                        vnn = new C50170vEm();
                        break;
                    }
                    break;
                case -512749997:
                    if (str.equals("contract_grid")) {
                        vnn = new C50312vJt();
                        break;
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        vnn = new vNN();
                        break;
                    }
                    break;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            vnn.setArguments(bundle2);
            return vnn;
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotTradeTabType[] $values() {
        return new BotTradeTabType[]{AI, MANUAL};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 java.lang.String) A[MD:(java.lang.String, int, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BotTradeTabType(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotTradeTabType> getEntries() {
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

    private BotTradeTabType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        BotTradeTabType[] botTradeTabTypeArr$values = $values();
        $VALUES = botTradeTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botTradeTabTypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<BotTradeTabType>() { // from class: com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotTradeTabType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BotTradeTabType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotTradeTabType[] newArray(int i) {
                return new BotTradeTabType[i];
            }
        };
    }

    public static final class TaskDescription {

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[BotTradeTabType.values().length];
                try {
                    iArr[BotTradeTabType.AI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BotTradeTabType.MANUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final Pair<String, String> AEQbTJ(@NotNull BotTradeTabType botTradeTabType) {
            Intrinsics.checkNotNullParameter(botTradeTabType, "");
            int i = Activity.EZpvd[botTradeTabType.ordinal()];
            if (i == 1) {
                return C56071xvr.gEmmrt.ejfBZ() ? C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.copydefault), BotTradeTabType.E2E_SMART_TAB) : C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRatingType), BotTradeTabType.E2E_AI_TAB);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.valueType), BotTradeTabType.E2E_MANUAL_TAB);
        }
    }

    public static BotTradeTabType valueOf(String str) {
        return (BotTradeTabType) Enum.valueOf(BotTradeTabType.class, str);
    }

    public static BotTradeTabType[] values() {
        return (BotTradeTabType[]) $VALUES.clone();
    }
}
