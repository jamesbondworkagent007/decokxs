package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C48033uCm;
import o.C52916wbe;
import o.C52924wbm;
import o.C56444yFp;
import o.InterfaceC47982uAp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class BotSmartArbiTradeTabType implements InterfaceC47982uAp, Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotSmartArbiTradeTabType[] $VALUES;
    public static final Parcelable.Creator<BotSmartArbiTradeTabType> CREATOR;
    public static final TaskDescription Companion;
    public static final BotSmartArbiTradeTabType POSITION = new BotSmartArbiTradeTabType("POSITION", 0) { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType.POSITION
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "position";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Pair pair = (Pair) obj;
            Object first = pair.getFirst();
            Intrinsics.copydefault(first, "");
            Object second = pair.getSecond();
            Intrinsics.copydefault(second, "");
            C52916wbe c52916wbe = new C52916wbe();
            Bundle bundle = new Bundle();
            bundle.putAll((Bundle) second);
            c52916wbe.setArguments(bundle);
            return c52916wbe;
        }
    };
    public static final BotSmartArbiTradeTabType PROFITLOSS = new BotSmartArbiTradeTabType("PROFITLOSS", 1) { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType.PROFITLOSS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "profitloss";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Pair pair = (Pair) obj;
            Object first = pair.getFirst();
            Intrinsics.copydefault(first, "");
            Object second = pair.getSecond();
            Intrinsics.copydefault(second, "");
            Bundle bundle = (Bundle) second;
            C52924wbm c52924wbm = Intrinsics.EZpvd((Object) first, (Object) "smart_arbitrage") ? new C52924wbm() : new C52924wbm();
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            c52924wbm.setArguments(bundle2);
            return c52924wbm;
        }
    };
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotSmartArbiTradeTabType[] $values() {
        return new BotSmartArbiTradeTabType[]{POSITION, PROFITLOSS};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 java.lang.String) A[MD:(java.lang.String, int, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BotSmartArbiTradeTabType(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotSmartArbiTradeTabType> getEntries() {
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

    private BotSmartArbiTradeTabType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        BotSmartArbiTradeTabType[] botSmartArbiTradeTabTypeArr$values = $values();
        $VALUES = botSmartArbiTradeTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botSmartArbiTradeTabTypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<BotSmartArbiTradeTabType>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotSmartArbiTradeTabType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BotSmartArbiTradeTabType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotSmartArbiTradeTabType[] newArray(int i) {
                return new BotSmartArbiTradeTabType[i];
            }
        };
    }

    public static final class TaskDescription {

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[BotSmartArbiTradeTabType.values().length];
                try {
                    iArr[BotSmartArbiTradeTabType.POSITION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BotSmartArbiTradeTabType.PROFITLOSS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.dialog.BotSmartArbiTradeTabType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String KWHzl(@NotNull BotSmartArbiTradeTabType botSmartArbiTradeTabType) {
            Intrinsics.checkNotNullParameter(botSmartArbiTradeTabType, "");
            int i = Activity.OLrzqt[botSmartArbiTradeTabType.ordinal()];
            if (i == 1) {
                return C33070mpX.AYXKKw(C48033uCm.Fragment.DuXjdv);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C33070mpX.AYXKKw(C48033uCm.Fragment.GFUIi);
        }
    }

    public static BotSmartArbiTradeTabType valueOf(String str) {
        return (BotSmartArbiTradeTabType) Enum.valueOf(BotSmartArbiTradeTabType.class, str);
    }

    public static BotSmartArbiTradeTabType[] values() {
        return (BotSmartArbiTradeTabType[]) $VALUES.clone();
    }
}
