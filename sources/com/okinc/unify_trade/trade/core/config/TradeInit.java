package com.okinc.unify_trade.trade.core.config;

import com.okinc.unify_trade.trade.core.config.TradeInit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class TradeInit {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private static final InterfaceC56387yDm<Set<TradeInit>> allKnownTypes$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xNL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TradeInit.allKnownTypes_delegate$lambda$0();
        }
    });
    private static final InterfaceC56387yDm<Set<TradeInit>> coreTradeTypes$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xNK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TradeInit.coreTradeTypes_delegate$lambda$2();
        }
    });
    private static final InterfaceC56387yDm<Set<TradeInit>> dexTradeTypes$delegate = C56392yDr.copydefault(new Function0() { // from class: o.xNP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TradeInit.dexTradeTypes_delegate$lambda$4();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.trade.core.config.TradeInit.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TradeInit(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    public abstract TradeSubsystem getSubsystem();

    private TradeInit() {
    }

    public final boolean isCoreTradeType() {
        return getSubsystem() == TradeSubsystem.CORE_TRADE;
    }

    public final boolean isDexTradeType() {
        return getSubsystem() == TradeSubsystem.DEX_TRADE;
    }

    public static final class Activity extends TradeInit {
        public static final Activity AEQbTJ = new Activity();
        public static final String OLrzqt = "CoinInfo";
        public static final TradeSubsystem copydefault = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return copydefault;
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends TradeInit {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final String OLrzqt = "CurrencyInfo";
        public static final TradeSubsystem copydefault = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return copydefault;
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends TradeInit {
        public static final Application OLrzqt = new Application();
        public static final String AEQbTJ = "HiddenCurrency";
        public static final TradeSubsystem KWHzl = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return KWHzl;
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends TradeInit {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final String OLrzqt = "InstGroup";
        public static final TradeSubsystem AEQbTJ = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return AEQbTJ;
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class PendingIntent extends TradeInit {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final String OLrzqt = "MarginConfig";
        public static final TradeSubsystem KWHzl = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return KWHzl;
        }

        private PendingIntent() {
            super(null);
        }
    }

    public static final class FragmentManager extends TradeInit {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final String EZpvd = "TradeConfigInfo";
        public static final TradeSubsystem copydefault = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return copydefault;
        }

        private FragmentManager() {
            super(null);
        }
    }

    public static final class Dialog extends TradeInit {
        public final TradeSubsystem AEQbTJ;
        public final String KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dialog.OLrzqt;
            }
            return dialog.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(boolean z) {
            return new Dialog(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && this.OLrzqt == ((Dialog) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TradeConfigInfoExtend(isDowngrade=" + this.OLrzqt + ")";
        }

        public Dialog(boolean z) {
            super(null);
            this.OLrzqt = z;
            this.KWHzl = "TradeConfigInfo";
            this.AEQbTJ = TradeSubsystem.CORE_TRADE;
        }
    }

    public static final class LoaderManager extends TradeInit {
        public static final LoaderManager OLrzqt = new LoaderManager();
        public static final String AEQbTJ = "TradeBehavior";
        public static final TradeSubsystem EZpvd = TradeSubsystem.CORE_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return EZpvd;
        }

        private LoaderManager() {
            super(null);
        }
    }

    public static final class Fragment extends TradeInit {
        public static final Fragment KWHzl = new Fragment();
        public static final String OLrzqt = "TradeDexChain";
        public static final TradeSubsystem AEQbTJ = TradeSubsystem.DEX_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return AEQbTJ;
        }

        private Fragment() {
            super(null);
        }
    }

    public static final class PictureInPictureParams extends TradeInit {
        public static final PictureInPictureParams OLrzqt = new PictureInPictureParams();
        public static final String AEQbTJ = "TradeDexWallet";
        public static final TradeSubsystem EZpvd = TradeSubsystem.DEX_TRADE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public String getId() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.unify_trade.trade.core.config.TradeInit
        public TradeSubsystem getSubsystem() {
            return EZpvd;
        }

        private PictureInPictureParams() {
            super(null);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.trade.core.config.TradeInit.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Set<TradeInit> OLrzqt() {
            return (Set) TradeInit.allKnownTypes$delegate.getValue();
        }

        public final boolean KWHzl(@NotNull Collection<? extends TradeInit> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<? extends TradeInit> collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((TradeInit) it.next()).isCoreTradeType()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean AEQbTJ(@NotNull Collection<? extends TradeInit> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<? extends TradeInit> collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((TradeInit) it.next()).isDexTradeType()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set allKnownTypes_delegate$lambda$0() {
        return yEE.AhwBna(Activity.AEQbTJ, ActionBar.AEQbTJ, Application.OLrzqt, TaskDescription.EZpvd, PendingIntent.AEQbTJ, FragmentManager.KWHzl, LoaderManager.OLrzqt, Fragment.KWHzl, PictureInPictureParams.OLrzqt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set coreTradeTypes_delegate$lambda$2() {
        Set<TradeInit> setOLrzqt = Companion.OLrzqt();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setOLrzqt) {
            if (((TradeInit) obj).isCoreTradeType()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set dexTradeTypes_delegate$lambda$4() {
        Set<TradeInit> setOLrzqt = Companion.OLrzqt();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setOLrzqt) {
            if (((TradeInit) obj).isDexTradeType()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }
}
