package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C48213uJd;
import o.C48224uJo;
import o.C48227uJr;
import o.C52132wAb;
import o.C52143wAm;
import o.C52179wBv;
import o.C52195wCk;
import o.C52196wCl;
import o.C52207wCw;
import o.C52233wDv;
import o.C52237wDz;
import o.C52242wEd;
import o.C52291wFz;
import o.C53970wvY;
import o.C54012wwN;
import o.C54121wyQ;
import o.C54167wzJ;
import o.C54197wzn;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC47982uAp;
import o.InterfaceC56445yFq;
import o.ViewTreeObserverOnGlobalLayoutListenerC52253wEo;
import o.wCY;
import o.wDJ;
import o.wDP;
import o.wEH;
import o.wEQ;
import o.wFH;
import o.wGK;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public abstract class BotDetailsType implements InterfaceC47982uAp, Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotDetailsType[] $VALUES;
    public static final Parcelable.Creator<BotDetailsType> CREATOR;
    public static final StateListAnimator Companion;
    private final int title;
    public static final BotDetailsType OVERVIEW = new BotDetailsType("OVERVIEW", 0) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.OVERVIEW
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.RZMhtF;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Pair pair = (Pair) obj;
            Object second = pair.getSecond();
            Intrinsics.copydefault(second, "");
            Bundle bundle = (Bundle) second;
            Object first = pair.getFirst();
            Intrinsics.copydefault(first, "");
            Fragment c48227uJr = Intrinsics.EZpvd((Object) ((StrategyDetailsResponse) first).getOrderType(), (Object) "ai_bot") ? new C48227uJr() : new OverviewFragment();
            c48227uJr.setArguments(bundle);
            return c48227uJr;
        }
    };
    public static final BotDetailsType NO_CLOSE_POSITION = new BotDetailsType("NO_CLOSE_POSITION", 1) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.NO_CLOSE_POSITION
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.addObserver;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Pair pair = obj instanceof Pair ? (Pair) obj : null;
            Object first = pair != null ? pair.getFirst() : null;
            StrategyDetailsResponse strategyDetailsResponse = first instanceof StrategyDetailsResponse ? (StrategyDetailsResponse) first : null;
            return wGK.Companion.copydefault(strategyDetailsResponse != null ? strategyDetailsResponse.getOrderType() : null);
        }
    };
    public static final BotDetailsType PARAMETER = new BotDetailsType("PARAMETER", 2) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.PARAMETER
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.register;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Pair pair = (Pair) obj;
            Object second = pair.getSecond();
            Intrinsics.copydefault(second, "");
            Bundle bundle = (Bundle) second;
            Object first = pair.getFirst();
            Intrinsics.copydefault(first, "");
            if (Intrinsics.EZpvd((Object) ((StrategyDetailsResponse) first).getOrderType(), (Object) "recurring")) {
                wDJ wdjAEQbTJ = wDJ.Companion.AEQbTJ();
                wdjAEQbTJ.setArguments(bundle);
                return wdjAEQbTJ;
            }
            C52207wCw c52207wCwCopydefault = C52207wCw.Companion.copydefault();
            c52207wCwCopydefault.setArguments(bundle);
            return c52207wCwCopydefault;
        }
    };
    public static final BotDetailsType LLM_SIGNAL_DETAILS = new BotDetailsType("LLM_SIGNAL_DETAILS", 3) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.LLM_SIGNAL_DETAILS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.register;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) first;
            String algoId = strategyDetailsResponse.getAlgoId();
            BotVo bot = strategyDetailsResponse.getBot();
            return C48213uJd.Companion.copydefault(algoId, (bot != null ? bot.getBacktest() : null) != null);
        }
    };
    public static final BotDetailsType PROFITS = new BotDetailsType("PROFITS", 4) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.PROFITS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.observeReporter;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C54012wwN getFragment(Object obj) {
            return new C54012wwN();
        }
    };
    public static final BotDetailsType PNL = new BotDetailsType("PNL", 5) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.PNL
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.observeReporter;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new C54121wyQ();
        }
    };
    public static final BotDetailsType BOT_INFO = new BotDetailsType("BOT_INFO", 6) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.BOT_INFO
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ReportDrawnCompositioncheckReporter1;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            String orderType = ((StrategyDetailsResponse) first).getOrderType();
            if (Intrinsics.EZpvd((Object) orderType, (Object) "recurring") || Intrinsics.EZpvd((Object) orderType, (Object) "smart_portfolio")) {
                return new C52291wFz();
            }
            return new wFH();
        }
    };
    public static final BotDetailsType GRID_PENDING_ORDER = new BotDetailsType("GRID_PENDING_ORDER", 7) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.GRID_PENDING_ORDER
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ReportDrawnCompositionsnapshotStateObserver1;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new wCY();
        }
    };
    public static final BotDetailsType CONTRACT_GRID_PENDING_ORDER = new BotDetailsType("CONTRACT_GRID_PENDING_ORDER", 8) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.CONTRACT_GRID_PENDING_ORDER
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ReportDrawnCompositionsnapshotStateObserver1;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Pair pair = obj instanceof Pair ? (Pair) obj : null;
            Object first = pair != null ? pair.getFirst() : null;
            StrategyDetailsResponse strategyDetailsResponse = first instanceof StrategyDetailsResponse ? (StrategyDetailsResponse) first : null;
            if (Intrinsics.EZpvd((Object) (strategyDetailsResponse != null ? strategyDetailsResponse.getState() : null), (Object) "no_close_position")) {
                return new C52143wAm();
            }
            return new C52132wAb();
        }
    };
    public static final BotDetailsType SLICED_ORDER = new BotDetailsType("SLICED_ORDER", 9) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.SLICED_ORDER
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ReportDrawnKt;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new C54197wzn();
        }
    };
    public static final BotDetailsType SMART_SLICED_ORDER = new BotDetailsType("SMART_SLICED_ORDER", 10) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.SMART_SLICED_ORDER
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.removeCancellable;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            return Intrinsics.EZpvd((Object) ((StrategyDetailsResponse) first).getOrderType(), (Object) "signal_bot") ? new C52242wEd() : new C54197wzn();
        }
    };
    public static final BotDetailsType POSITION = new BotDetailsType("POSITION", 11) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.POSITION
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ReportDrawnComposition;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public wDP getFragment(Object obj) {
            return new wDP();
        }
    };
    public static final BotDetailsType SIGNAL_POSITION = new BotDetailsType("SIGNAL_POSITION", 12) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.SIGNAL_POSITION
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.OnBackPressedDispatcher;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new ViewTreeObserverOnGlobalLayoutListenerC52253wEo();
        }
    };
    public static final BotDetailsType HISTORY = new BotDetailsType("HISTORY", 13) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.HISTORY
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.accessobserveReporter;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [189=5] */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            if (r2.equals("grid") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r2.equals("moon_grid") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        
            if (r2.equals("contract_dca") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            if (r2.equals("spot_dca") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        
            return new o.wCM();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        
            return new o.C52162wBe();
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // o.InterfaceC47982uAp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Fragment getFragment(Object obj) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            String orderType = ((StrategyDetailsResponse) first).getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    break;
                case -1402017003:
                    break;
                case -1216369070:
                    if (orderType.equals("smart_portfolio")) {
                        return new wEH();
                    }
                    return new C52195wCk();
                case -591806012:
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid")) {
                        return new C54167wzJ();
                    }
                    return new C52195wCk();
                case 3181382:
                    break;
                case 1165749981:
                    if (orderType.equals("recurring")) {
                        return new wEQ();
                    }
                    return new C52195wCk();
                default:
                    return new C52195wCk();
            }
        }
    };
    public static final BotDetailsType HISTORY_EVENT = new BotDetailsType("HISTORY_EVENT", 14) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.HISTORY_EVENT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.MediaSessionCompatApi23Callback;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new C52233wDv();
        }
    };
    public static final BotDetailsType HISTORY_POSITION = new BotDetailsType("HISTORY_POSITION", 15) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.HISTORY_POSITION
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new C52237wDz();
        }
    };
    public static final BotDetailsType ONGOING = new BotDetailsType("ONGOING", 16) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.ONGOING
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.onDrawerClosed;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C52179wBv getFragment(Object obj) {
            return C52179wBv.Companion.copydefault(false);
        }
    };
    public static final BotDetailsType ARBITRAGE_POSITIONING = new BotDetailsType("ARBITRAGE_POSITIONING", 17) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.ARBITRAGE_POSITIONING
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C48033uCm.Fragment.DcMfJKsgNvtZ;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C53970wvY getFragment(Object obj) {
            return new C53970wvY();
        }
    };
    public static final BotDetailsType DCD_ARB_RECORD = new BotDetailsType("DCD_ARB_RECORD", 18) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.DCD_ARB_RECORD
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.accessobserveReporter;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return new C52196wCl();
        }
    };
    public static final BotDetailsType AI_ORDER_HISTORY = new BotDetailsType("AI_ORDER_HISTORY", 19) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.AI_ORDER_HISTORY
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return BotDetailsType.Companion.OLrzqt(obj, "/bot/ai/orderHistory", "OKAIHistoryPositionPage");
        }
    };
    public static final BotDetailsType AI_THINKING_LIST = new BotDetailsType("AI_THINKING_LIST", 20) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.AI_THINKING_LIST
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C48033uCm.Fragment.fZBcTu;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return BotDetailsType.Companion.OLrzqt(obj, "/bot/ai/thinkingList", "OKAIThinkingListPage");
        }
    };
    public static final BotDetailsType AI_CURRENT_POSITIONS = new BotDetailsType("AI_CURRENT_POSITIONS", 21) { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.AI_CURRENT_POSITIONS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C55688xof.Application.addObserver;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            return BotDetailsType.Companion.OLrzqt(obj, "/bot/ai/currentPositions", "OKAICurrentPositionsPage");
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotDetailsType[] $values() {
        return new BotDetailsType[]{OVERVIEW, NO_CLOSE_POSITION, PARAMETER, LLM_SIGNAL_DETAILS, PROFITS, PNL, BOT_INFO, GRID_PENDING_ORDER, CONTRACT_GRID_PENDING_ORDER, SLICED_ORDER, SMART_SLICED_ORDER, POSITION, SIGNAL_POSITION, HISTORY, HISTORY_EVENT, HISTORY_POSITION, ONGOING, ARBITRAGE_POSITIONING, DCD_ARB_RECORD, AI_ORDER_HISTORY, AI_THINKING_LIST, AI_CURRENT_POSITIONS};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int) A[MD:(java.lang.String, int, int):void (m)] call: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.<init>(java.lang.String, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BotDetailsType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotDetailsType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private BotDetailsType(@StringRes String str, int i, int i2) {
        this.title = i2;
    }

    static {
        BotDetailsType[] botDetailsTypeArr$values = $values();
        $VALUES = botDetailsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botDetailsTypeArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<BotDetailsType>() { // from class: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotDetailsType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BotDetailsType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotDetailsType[] newArray(int i) {
                return new BotDetailsType[i];
            }
        };
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.bean.BotDetailsType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Fragment OLrzqt(Object obj, String str, String str2) {
            Intrinsics.copydefault(obj, "");
            Object first = ((Pair) obj).getFirst();
            Intrinsics.copydefault(first, "");
            StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) first;
            C48224uJo.ActionBar actionBar = C48224uJo.Companion;
            String algoId = strategyDetailsResponse.getAlgoId();
            BotVo bot = strategyDetailsResponse.getBot();
            return actionBar.OLrzqt(str, str2, algoId, (bot != null ? bot.getBacktest() : null) != null, strategyDetailsResponse.isHistory());
        }
    }

    public static BotDetailsType valueOf(String str) {
        return (BotDetailsType) Enum.valueOf(BotDetailsType.class, str);
    }

    public static BotDetailsType[] values() {
        return (BotDetailsType[]) $VALUES.clone();
    }
}
