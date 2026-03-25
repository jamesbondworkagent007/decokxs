package o;

import com.okinc.tradingbot.impl.signalClone.domain.SignalCloneProcessManager$processDcdBotFlow$2;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.BotTradeData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53734wrA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final java.util.List<java.lang.String> AEQbTJ;
    public final C53736wrC KWHzl;

    @yCM
    public C53734wrA(@NotNull C53736wrC c53736wrC) {
        Intrinsics.checkNotNullParameter(c53736wrC, "");
        this.KWHzl = c53736wrC;
        this.AEQbTJ = yDY.gEmmrt("grid", "contract_grid", "spot_dca", "contract_dca", "smart_arbitrage", "smart_portfolio", "recurring", "dcd_bot");
    }

    /* JADX INFO: renamed from: o.wrA$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wrA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53734wrA EZpvd() {
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).hlXVux();
        }
    }

    /* JADX INFO: renamed from: o.wrA$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wrA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.wrA$Application$Application, reason: collision with other inner class name */
        public static final class C0989Application extends Application {
            public static final C0989Application AEQbTJ = new C0989Application();

            private C0989Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.wrA$Application$Activity */
        public static final class Activity extends Application {
            public final java.lang.String AEQbTJ;
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = activity.AEQbTJ;
                }
                return activity.EZpvd(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Activity(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowBottomSheet(algoId=" + this.EZpvd + ", algoOrderType=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.EZpvd = str;
                this.AEQbTJ = str2;
            }
        }

        /* JADX INFO: renamed from: o.wrA$Application$ActionBar */
        public static final class ActionBar extends Application {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                return actionBar.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ProcessDcdBot(algoId=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: renamed from: o.wrA$Application$StateListAnimator */
        public static final class StateListAnimator extends Application {
            public static final int AEQbTJ = BotTradeData.$stable;
            public final BotTradeData EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, BotTradeData botTradeData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    botTradeData = stateListAnimator.EZpvd;
                }
                return stateListAnimator.KWHzl(botTradeData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BotTradeData EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull BotTradeData botTradeData) {
                Intrinsics.checkNotNullParameter(botTradeData, "");
                return new StateListAnimator(botTradeData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "StartBotTradeActivity(botTradeData=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull BotTradeData botTradeData) {
                super(null);
                Intrinsics.checkNotNullParameter(botTradeData, "");
                this.EZpvd = botTradeData;
            }
        }
    }

    public final Application KWHzl(android.os.Bundle bundle) {
        java.lang.String strGEmmrt;
        if (bundle == null) {
            return Application.C0989Application.AEQbTJ;
        }
        java.lang.String string = bundle.getString("strategyType", "");
        Intrinsics.copydefault((java.lang.Object) string);
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return Application.C0989Application.AEQbTJ;
        }
        if (!OLrzqt(string)) {
            return Application.C0989Application.AEQbTJ;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(bundle.getLong("algoId"));
        java.lang.Long l = lValueOf.longValue() != 0 ? lValueOf : null;
        if (l == null || (strGEmmrt = C33129mqd.gEmmrt(l)) == null) {
            return Application.C0989Application.AEQbTJ;
        }
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "dcd_bot")) {
            return new Application.ActionBar(strGEmmrt);
        }
        return new Application.Activity(strGEmmrt, string);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<Application.StateListAnimator>> continuation) {
        return FlowKt.flow(new SignalCloneProcessManager$processDcdBotFlow$2(this, str, null));
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.contains(str);
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        xOR xorCopydefault;
        AlgoShareConfigInfo algoShareConfigInfoEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        return (!OLrzqt(str) || C56071xvr.gEmmrt.ejfBZ() || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (algoShareConfigInfoEZpvd = xorCopydefault.EZpvd()) == null || !Intrinsics.EZpvd(algoShareConfigInfoEZpvd.getAllowShare(), java.lang.Boolean.TRUE)) ? false : true;
    }
}
