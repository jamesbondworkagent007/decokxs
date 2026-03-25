package o;

import androidx.camera.video.AudioStats;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.IceBergAggressiveType;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DcdPnlChartData;
import com.okinc.unify_trade.bot.data.InformationFragmentData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsPortfolioInfoDetailItem;
import com.okinc.unify_trade.bot.data.TacticsRecInfoDetailItem;
import com.okinc.unify_trade.bot.dcd.config.DcdOptionType;
import com.okinc.widget.data.TradeMenuItemBean;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55935xtN implements InterfaceC54501xKt<StrategyDetailsResponse, InformationFragmentData> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final StrategyConfigInfo AEQbTJ;
    public StgySourceInfo KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55935xtN() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(StgySourceInfo stgySourceInfo) {
        this.KWHzl = stgySourceInfo;
    }

    public C55935xtN(StrategyConfigInfo strategyConfigInfo) {
        this.AEQbTJ = strategyConfigInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.StrategyConfigInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.StrategyConfigInfo) : (r1v0 com.okinc.unify_trade.biz.StrategyConfigInfo))
 A[MD:(com.okinc.unify_trade.biz.StrategyConfigInfo):void (m)] (LINE:129) call: o.xtN.<init>(com.okinc.unify_trade.biz.StrategyConfigInfo):void type: THIS */
    public /* synthetic */ C55935xtN(StrategyConfigInfo strategyConfigInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strategyConfigInfo);
    }

    /* JADX INFO: renamed from: o.xtN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.xtN$StateListAnimator$TaskDescription */
        public static final class TaskDescription {
            public static final TaskDescription AEQbTJ = new TaskDescription();
            public static final java.lang.String KWHzl = "buy";
            public static final java.lang.String EZpvd = "sell";

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return EZpvd;
            }

            private TaskDescription() {
            }
        }

        private StateListAnimator() {
        }

        public final boolean AEQbTJ(java.lang.String str) {
            return C33129mqd.gEmmrt(str, 0);
        }
    }

    public final boolean OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull TacticsForbiddenFunctions tacticsForbiddenFunctions) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(tacticsForbiddenFunctions, "");
        java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
        if (forbidden != null && forbidden.isEmpty()) {
            return false;
        }
        java.util.ArrayList<java.lang.String> forbidden2 = strategyDetailsResponse.getForbidden();
        return forbidden2 != null && forbidden2.contains(tacticsForbiddenFunctions.getCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [317=12] */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0883 A[PHI: r0
  0x0883: PHI (r0v374 java.lang.String) = (r0v373 java.lang.String), (r0v415 java.lang.String) binds: [B:123:0x0874, B:125:0x087e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0dd8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0e82  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x1157  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x11a3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x11b5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x11c0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x11c3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1201  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x1216  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x121e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1221  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x125f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1361  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x13bd  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x13c0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x140e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x141d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x142a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1433  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x143d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1445  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x14d3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x151d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x15c7  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x179b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x17a0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x17ea  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x17ed  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x1885  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x188c  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x193f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1948  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x194c  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x194f  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1a0b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x1a0e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1a62  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1a65  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x1ab9  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1abc  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1ac8  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1acd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1b73  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1b7a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1b80  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1bb7  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1bbe  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1bd0  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1bd3  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x1bdb  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1bde  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1c30  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x1c37  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1c49  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1c4c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1c54  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x1c57  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1d07  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x1d0a  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1d58  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1e04  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x2076  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x2082  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x2177  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x217a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x21d1  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x21d4  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x2221  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x3082  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x308d  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x3092  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x311d  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x3120  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x31ce  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x3214  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x321b  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x3220  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x3225  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x3230  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x3292  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x3295  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x32de  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x332c  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x3330  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x337d  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x33cb  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x33ce  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x352c  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x356c A[PHI: r5
  0x356c: PHI (r5v68 java.lang.String) = (r5v67 java.lang.String), (r5v67 java.lang.String), (r5v70 java.lang.String) binds: [B:784:0x3534, B:786:0x353b, B:790:0x3567] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type update failed for variable: r116v0 'this'  ??, new type: o.xtN
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 137541. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
     */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InformationFragmentData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        java.lang.String strFmtBotValueBySymbol$default;
        java.lang.String quoteDig;
        java.lang.String str4;
        java.lang.String string;
        java.lang.String strCopydefault;
        java.lang.String strFmtBotValueBySymbol$default2;
        java.lang.String str5;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String str6;
        java.lang.String str7;
        java.util.ArrayList arrayList2;
        C55935xtN c55935xtN;
        java.lang.String str8;
        java.lang.String str9;
        DcaTriggerParam dcaTriggerParam;
        ItemData itemData;
        java.lang.String str10;
        ItemData itemData2;
        java.lang.String str11;
        java.lang.String strAYXKKw;
        java.lang.Object next;
        java.util.ArrayList arrayList3;
        java.lang.String string2;
        java.lang.String str12;
        java.lang.String strCopydefault2;
        DcaTriggerParam dcaTriggerParam2;
        java.lang.Object next2;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String strAYXKKw2;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String strAYXKKw3;
        ItemData itemData3;
        java.lang.String str18;
        java.lang.String string3;
        java.lang.String str19;
        java.lang.String strAYXKKw4;
        TrailingConfig trailingUpConfig;
        ItemData itemData4;
        java.lang.String stopPx;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        TpSlTriggerParam tpSlTriggerParamOLrzqt;
        java.lang.String strValues;
        java.lang.String strValueOf;
        java.lang.String strDjBIcL;
        java.lang.String strDbNXlk;
        java.lang.String botPnl$default;
        GridProfitAutoReinvestResponse profitAutoReinvest;
        boolean z;
        GridProfitAutoReinvestResponse profitAutoReinvest2;
        ItemData itemData5;
        java.lang.String time$default;
        TrailingConfig trailingDownConfig;
        java.lang.String stopPx2;
        TrailingConfig trailingUpConfig2;
        java.lang.String stopPx3;
        java.lang.String sourceCcy;
        java.lang.String strFmtBotValueBySymbol$default3;
        java.lang.String strCopydefault3;
        RecurringBuyDto recurring;
        RecurringBuyDto recurring2;
        java.lang.Integer recurringTimeType;
        java.lang.String strAYXKKw5;
        java.lang.String strFmtBotValueBySymbol$default4;
        java.lang.String str20;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        java.util.ArrayList<java.lang.Object> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.String strEZpvd = C56033xvF.EZpvd(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getCtVal());
        java.lang.String strAhwBna = C56033xvF.AhwBna(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getDisplayId());
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponse.takeNonBlankTradeQuoteCcy();
        java.lang.String str21 = strTakeNonBlankTradeQuoteCcy == null ? strAhwBna : strTakeNonBlankTradeQuoteCcy;
        if (!C56071xvr.gEmmrt.EZpvd(strategyDetailsResponse.getProfitSharingRatio())) {
            arrayList4.addAll(EZpvd(strategyDetailsResponse.getOrderType()));
        }
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                str = strEZpvd;
                str2 = strAhwBna;
                str3 = str21;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                if (orderType.equals("spot_dca")) {
                    java.lang.String percent$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxSteps()) ? strFmtBotValueBySymbol$default : xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getPxSteps(), 0, 2, RoundingMode.DOWN, 2, null);
                    C55998xuX c55998xuX = C55998xuX.copydefault;
                    java.lang.String state = strategyDetailsResponse.getState();
                    java.lang.String gridStatus = strategyDetailsResponse.getGridStatus();
                    if (gridStatus == null) {
                        gridStatus = "";
                    }
                    c55998xuX.copydefault(state, gridStatus);
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zblBkD), EZpvd(percent$default, C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.DcqEDu), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getTpPct()) ? strFmtBotValueBySymbol$default : xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getTpPct(), 0, 2, RoundingMode.DOWN, 2, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.aHXSQp), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                    C54589xNz c54589xNz = C54589xNz.EZpvd;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                    BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, 12, null) : null;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                    if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(strategyDetailsResponse.getInstType())) == null) {
                        quoteDig = null;
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getInitOrdAmt())) {
                            java.lang.String strFmtBotValueBySymbol$default5 = C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getInitOrdAmt(), RoundingMode.UP, false, quoteDig, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1832, null);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(strFmtBotValueBySymbol$default5);
                            sb.append(" ");
                            str4 = str3;
                            sb.append(str4);
                            string = sb.toString();
                        } else {
                            str4 = str3;
                            string = strFmtBotValueBySymbol$default;
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), string, false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.KDccX), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSafetyOrdAmt()) ? C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getSafetyOrdAmt(), RoundingMode.UP, false, quoteDig, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1832, null) + " " + str4 : strFmtBotValueBySymbol$default, C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.DBxZfM), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
                        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
                        arrayList4.add(new ItemData(strAYXKKw6, (maxSafetyOrds != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxSafetyOrds)) ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getMaxSafetyOrds()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        OLrzqt(arrayList4, strategyDetailsResponse);
                        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
                        DcaTriggerParam dcaTriggerParam3 = triggerParams == null ? (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams) : null;
                        strCopydefault = GridStartTriggerType.Companion.copydefault(dcaTriggerParam3 == null ? dcaTriggerParam3.getTriggerStrategy() : null);
                        if (strCopydefault.length() > 0) {
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), strCopydefault, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam3 != null ? dcaTriggerParam3.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode()) ? TtmlNode.START : "", false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16776892, (DefaultConstructorMarker) null));
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.call), EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxStepsMult()) ? xMR.formatDownToFixed$default(xMR.copydefault, strategyDetailsResponse.getPxStepsMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult) : strFmtBotValueBySymbol$default, !C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.fHqPtx), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getVolMult())) {
                            xMR xmr = xMR.copydefault;
                            java.lang.String volMult = strategyDetailsResponse.getVolMult();
                            if (volMult == null) {
                                volMult = "";
                            }
                            strFmtBotValueBySymbol$default2 = null;
                            str5 = xMR.formatDownToFixed$default(xmr, volMult, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                        } else {
                            str5 = strFmtBotValueBySymbol$default;
                            strFmtBotValueBySymbol$default2 = null;
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fdOvFl), EZpvd(str5, !C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.WS), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.run), !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSlPct()) ? strFmtBotValueBySymbol$default : xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getSlPct(), 0, 2, RoundingMode.DOWN, 2, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.UscePu), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        break;
                    } else {
                        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                            instFamily = "";
                        }
                        IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
                        if (idxConfigAkhnZx != null) {
                            quoteDig = idxConfigAkhnZx.getQuoteDig();
                        }
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getInitOrdAmt())) {
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), string, false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.KDccX), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSafetyOrdAmt())) {
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSafetyOrdAmt()) ? C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getSafetyOrdAmt(), RoundingMode.UP, false, quoteDig, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1832, null) + " " + str4 : strFmtBotValueBySymbol$default, C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.DBxZfM), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw62 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
                        java.lang.String maxSafetyOrds2 = strategyDetailsResponse.getMaxSafetyOrds();
                        if (maxSafetyOrds2 != null) {
                            arrayList4.add(new ItemData(strAYXKKw62, (maxSafetyOrds2 != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxSafetyOrds2)) ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getMaxSafetyOrds()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            OLrzqt(arrayList4, strategyDetailsResponse);
                            java.util.List<DcaTriggerParam> triggerParams2 = strategyDetailsResponse.getTriggerParams();
                            if (triggerParams2 == null) {
                            }
                            strCopydefault = GridStartTriggerType.Companion.copydefault(dcaTriggerParam3 == null ? dcaTriggerParam3.getTriggerStrategy() : null);
                            if (strCopydefault.length() > 0) {
                            }
                            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxStepsMult())) {
                            }
                            if (C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)) {
                                arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.call), EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxStepsMult()) ? xMR.formatDownToFixed$default(xMR.copydefault, strategyDetailsResponse.getPxStepsMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult) : strFmtBotValueBySymbol$default, !C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.fHqPtx), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getVolMult())) {
                                }
                                if (C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)) {
                                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fdOvFl), EZpvd(str5, !C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.WS), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.run), !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSlPct()) ? strFmtBotValueBySymbol$default : xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getSlPct(), 0, 2, RoundingMode.DOWN, 2, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.UscePu), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null));
                                    break;
                                }
                            }
                        }
                    }
                }
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case -1574173039:
                str = strEZpvd;
                str6 = strAhwBna;
                str3 = str21;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                if (orderType.equals("infinite_grid")) {
                    java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.DjwCMv);
                    C56068xvo c56068xvo = C56068xvo.copydefault;
                    java.lang.String instType = strategyDetailsResponse.getInstType();
                    java.lang.String instId = strategyDetailsResponse.getInstId();
                    java.lang.String minPx = strategyDetailsResponse.getMinPx();
                    RoundingMode roundingMode = RoundingMode.UP;
                    java.lang.String processedPrice$default = C56068xvo.getProcessedPrice$default(c56068xvo, instType, instId, minPx, roundingMode, false, false, 48, null);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(processedPrice$default);
                    sb2.append(" ");
                    str2 = str6;
                    sb2.append(str2);
                    arrayList4.add(new ItemData(strAYXKKw7, sb2.toString(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPOKBmQNaCIdOM), C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerGridProfitRatio(), false, 0, 6, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56068xvo.getProcessedPrice$default(c56068xvo, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), roundingMode, false, false, 48, null) + " " + str2, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.newTab);
                    xMR xmr2 = xMR.copydefault;
                    arrayList4.add(new ItemData(strAYXKKw8, xmr2.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), xmr2.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    arrayList4.add(AEQbTJ(strategyDetailsResponse, this));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwner), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getTpTriggerPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setContent), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSlTriggerPx(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                } else {
                    str2 = str6;
                }
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case -1402017003:
                str7 = strAhwBna;
                arrayList2 = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                c55935xtN = this;
                str8 = strEZpvd;
                str9 = str21;
                if (orderType.equals("contract_dca")) {
                    java.util.List<DcaTriggerParam> triggerParams3 = strategyDetailsResponse.getTriggerParams();
                    if (triggerParams3 != null) {
                        java.util.Iterator<T> it = triggerParams3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        dcaTriggerParam = (DcaTriggerParam) next;
                    } else {
                        dcaTriggerParam = null;
                    }
                    ItemData itemData6 = new ItemData(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDirection(), (java.lang.Object) "long") ? C55688xof.Application.gqOnQv : C55688xof.Application.hfdhUn), c55935xtN.EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxSteps()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPxSteps(), false, 0, 6, null), C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.v), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    ItemData itemData7 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zDGrpR), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getTpPct()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getTpPct(), false, 0, 6, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.GCXiNH), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    ItemData itemData8 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.OEgNct), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getInitOrdAmt()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getInitOrdAmt(), RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.KDccX), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    arrayList = arrayList2;
                    ItemData itemData9 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.UfveVb), c55935xtN.EZpvd(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSafetyOrdAmt()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getSafetyOrdAmt(), RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null), C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.sIqKDg), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    ItemData itemData10 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.OijiEz), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getMaxSafetyOrds()) ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getMaxSafetyOrds()), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                    str = str8;
                    java.lang.String strEZpvd2 = ContractDcaTriggerType.Companion.EZpvd(strategyDetailsResponse.getTriggerParams(), strategyDetailsResponse.getInvestmentCcy());
                    ItemData itemData11 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), strEZpvd2, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.RSI.getMode()) ? TtmlNode.START : "", false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16776892, (DefaultConstructorMarker) null);
                    if (c55935xtN.copydefault) {
                        java.lang.String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
                        ContractDcaTriggerType contractDcaTriggerType = ContractDcaTriggerType.WEB_HOOK;
                        str3 = str9;
                        if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) contractDcaTriggerType.getMode())) {
                            itemData11.copydefault(contractDcaTriggerType.getMode());
                            itemData11.copydefault(true);
                            itemData11.AEQbTJ(C33070mpX.AYXKKw(contractDcaTriggerType.getShowMode()));
                        }
                    } else {
                        str3 = str9;
                    }
                    ItemData itemData12 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), ContractDcaStopConditionType.Companion.KWHzl(strategyDetailsResponse.getTriggerParams(), strategyDetailsResponse.getInvestmentCcy()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxStepsMult())) {
                        itemData = itemData12;
                        str6 = str7;
                        str10 = strFmtBotValueBySymbol$default;
                    } else {
                        itemData = itemData12;
                        str6 = str7;
                        str10 = xMR.formatDownToFixed$default(xMR.copydefault, strategyDetailsResponse.getPxStepsMult(), 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                    }
                    ItemData itemData13 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.dPkBzA), c55935xtN.EZpvd(str10, C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.FQNKFG), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getVolMult())) {
                        itemData2 = itemData13;
                        str11 = strFmtBotValueBySymbol$default;
                    } else {
                        xMR xmr3 = xMR.copydefault;
                        java.lang.String volMult2 = strategyDetailsResponse.getVolMult();
                        itemData2 = itemData13;
                        if (volMult2 == null) {
                            volMult2 = "";
                        }
                        str11 = xMR.formatDownToFixed$default(xmr3, volMult2, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                    }
                    ItemData itemData14 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.hdpuIA), c55935xtN.EZpvd(str11, C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 0) || C33129mqd.OLrzqt((java.lang.Object) strategyDetailsResponse.getMaxSafetyOrds(), (java.lang.Object) 1)), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.FQMcgEfQMcgE), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    ItemData itemData15 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zEHIKV), C33129mqd.valueOf(strategyDetailsResponse.getSlPct(), 0) ? strFmtBotValueBySymbol$default : ContractDcaStopLossType.Companion.AEQbTJ(strategyDetailsResponse.getSlMode()) + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getSlPct(), false, 0, 6, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.fMBJsc), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    ItemData itemData16 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem), C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, true, false, null, false, null, null, null, 2024, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                    xMR xmr4 = xMR.copydefault;
                    java.lang.String profitSharingRatio = strategyDetailsResponse.getProfitSharingRatio();
                    ItemData itemData17 = new ItemData(strAYXKKw9, xMR.formatPercent$default(xmr4, profitSharingRatio == null ? "" : profitSharingRatio, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.jh);
                    DcaLeadShareMode dcaLeadShareModeOLrzqt = DcaLeadShareMode.Companion.OLrzqt(strategyDetailsResponse.getTrackingMode());
                    ItemData itemData18 = new ItemData(strAYXKKw10, (dcaLeadShareModeOLrzqt == null || (strAYXKKw = C33070mpX.AYXKKw(dcaLeadShareModeOLrzqt.getShowMode())) == null) ? "" : strAYXKKw, false, 0, (java.lang.String) null, "contract_dca_lead_mode_tag", true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                        arrayList4.add(itemData16);
                        arrayList4.add(itemData17);
                        arrayList4.add(itemData18);
                    } else {
                        arrayList4.add(itemData6);
                        arrayList4.add(itemData7);
                        arrayList4.add(itemData8);
                        arrayList4.add(itemData9);
                        arrayList4.add(itemData10);
                        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "3")) {
                            arrayList4.add(itemData17);
                            arrayList4.add(itemData18);
                        }
                        if (strEZpvd2.length() > 0) {
                            arrayList4.add(itemData11);
                        }
                        arrayList4.add(itemData);
                        arrayList4.add(itemData2);
                        arrayList4.add(itemData14);
                        arrayList4.add(itemData15);
                    }
                    str2 = str6;
                    str4 = str3;
                    strFmtBotValueBySymbol$default2 = null;
                }
                str2 = str7;
                str = str8;
                arrayList = arrayList2;
                str4 = str9;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case -1216369070:
                str8 = strEZpvd;
                str7 = strAhwBna;
                str3 = str21;
                arrayList3 = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                c55935xtN = this;
                if (orderType.equals("smart_portfolio")) {
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.toInclusive), copydefault(strategyDetailsResponse), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    if (strategyDetailsResponse.getInvestAmt().length() == 0) {
                        str9 = str3;
                        string2 = strFmtBotValueBySymbol$default;
                    } else {
                        java.lang.String strFmtBotValueBySymbol$default6 = C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestCcy(), strategyDetailsResponse.getInvestAmt(), RoundingMode.DOWN, false, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1848, null);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(strFmtBotValueBySymbol$default6);
                        sb3.append(" ");
                        str9 = str3;
                        sb3.append(str9);
                        string2 = sb3.toString();
                    }
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DimenRes), string2, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.f1070api), strategyDetailsResponse.getBalNum().length() == 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getBalNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    c55935xtN.OLrzqt(arrayList4, strategyDetailsResponse);
                    arrayList2 = arrayList3;
                    arrayList2.addAll(c55935xtN.EZpvd(strategyDetailsResponse, c55935xtN.copydefault));
                    str2 = str7;
                    str = str8;
                    arrayList = arrayList2;
                    str4 = str9;
                    strFmtBotValueBySymbol$default2 = null;
                }
                str2 = str7;
                str = str8;
                arrayList = arrayList3;
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case -1148661171:
                str12 = strEZpvd;
                str7 = strAhwBna;
                str3 = str21;
                arrayList3 = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                c55935xtN = this;
                if (!orderType.equals("smart_iceberg")) {
                    str8 = str12;
                    str2 = str7;
                    str = str8;
                    arrayList = arrayList3;
                    str4 = str3;
                    strFmtBotValueBySymbol$default2 = null;
                } else {
                    java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C55688xof.Application.setButton);
                    java.lang.String sz = strategyDetailsResponse.getSz();
                    arrayList4.add(new ItemData(strAYXKKw11, (sz == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sz)) ? strFmtBotValueBySymbol$default : C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSz(), strategyDetailsResponse.getCtVal(), false, null, 32, null) + " " + str12, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw12 = C33070mpX.AYXKKw(C55688xof.Application.validateSHA256);
                    java.lang.String actualSz = strategyDetailsResponse.getActualSz();
                    arrayList4.add(new ItemData(strAYXKKw12, (actualSz == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualSz)) ? strFmtBotValueBySymbol$default : C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getActualSz(), strategyDetailsResponse.getCtVal(), false, null, 32, null) + " " + str12, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw13 = C33070mpX.AYXKKw(C55688xof.Application.setButtonPanelLayoutHint);
                    java.lang.String szLimit = strategyDetailsResponse.getSzLimit();
                    arrayList4.add(new ItemData(strAYXKKw13, (szLimit == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) szLimit)) ? strFmtBotValueBySymbol$default : C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSzLimit(), strategyDetailsResponse.getCtVal(), false, null, 32, null) + " " + str12, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw14 = C33070mpX.AYXKKw(C55688xof.Application.setCustomTitle);
                    java.lang.String lmtOrderNumber = strategyDetailsResponse.getLmtOrderNumber();
                    if (lmtOrderNumber == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lmtOrderNumber)) {
                        strCopydefault2 = strFmtBotValueBySymbol$default;
                    } else {
                        xMR xmr5 = xMR.copydefault;
                        java.lang.String lmtOrderNumber2 = strategyDetailsResponse.getLmtOrderNumber();
                        if (lmtOrderNumber2 == null) {
                            lmtOrderNumber2 = "";
                        }
                        strCopydefault2 = xmr5.copydefault(lmtOrderNumber2);
                    }
                    arrayList4.add(new ItemData(strAYXKKw14, strCopydefault2, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    str8 = str12;
                    c55935xtN.OLrzqt(arrayList4, strategyDetailsResponse);
                    arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController2), c55935xtN.AEQbTJ(strategyDetailsResponse.getAggressiveness()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController1), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getPxLimit()) ? strFmtBotValueBySymbol$default : C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getPxLimit(), false, false, null, null, 120, null) + " " + str7, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.util.List<DcaTriggerParam> triggerParams4 = strategyDetailsResponse.getTriggerParams();
                    if (triggerParams4 != null) {
                        java.util.Iterator<T> it2 = triggerParams4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next2).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        dcaTriggerParam2 = (DcaTriggerParam) next2;
                    } else {
                        dcaTriggerParam2 = null;
                    }
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), KWHzl2(strategyDetailsResponse), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode()) ? TtmlNode.START : "", false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16776892, (DefaultConstructorMarker) null));
                    str2 = str7;
                    str = str8;
                    arrayList = arrayList3;
                    str4 = str3;
                    strFmtBotValueBySymbol$default2 = null;
                }
                break;
            case -591806012:
                str = strEZpvd;
                str13 = strAhwBna;
                str3 = str21;
                arrayList3 = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                if (orderType.equals("moon_grid")) {
                    java.lang.String runType = strategyDetailsResponse.getRunType();
                    if (Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1")) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
                    } else if (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) {
                        str14 = strFmtBotValueBySymbol$default;
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null) + " " + str13, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getGridNum(), strategyDetailsResponse.getCtVal(), false, null, 48, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw15 = C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(strAYXKKw15);
                        arrayList4.add(new ItemData(sb4.toString(), str14, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw16 = C33070mpX.AYXKKw(C55688xof.Application.getHideOffset);
                        java.lang.String botAmount$default = C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null);
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(botAmount$default);
                        sb5.append(" ");
                        str12 = str;
                        sb5.append(str12);
                        arrayList4.add(new ItemData(strAYXKKw16, sb5.toString(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C33129mqd.OLrzqt(strategyDetailsResponse.getPerMinProfitRate(), strategyDetailsResponse.getPerMaxProfitRate()) ? C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null) : C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + str13, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.newTab), strategyDetailsResponse.getTradeNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), strategyDetailsResponse.getArbitrageNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        c55935xtN = this;
                        if (c55935xtN.copydefault) {
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickContact), getSellState$default(this, c55935xtN.copydefault, "moon_grid", strategyDetailsResponse.getStopType(), null, null, 16, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        }
                        str7 = str13;
                        str8 = str12;
                        str2 = str7;
                        str = str8;
                        arrayList = arrayList3;
                        str4 = str3;
                        strFmtBotValueBySymbol$default2 = null;
                    } else {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
                    }
                    str14 = strAYXKKw2;
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null) + " " + str13, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getGridNum(), strategyDetailsResponse.getCtVal(), false, null, 48, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw152 = C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener);
                    java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                    sb42.append(strAYXKKw152);
                    arrayList4.add(new ItemData(sb42.toString(), str14, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw162 = C33070mpX.AYXKKw(C55688xof.Application.getHideOffset);
                    java.lang.String botAmount$default2 = C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null);
                    java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                    sb52.append(botAmount$default2);
                    sb52.append(" ");
                    str12 = str;
                    sb52.append(str12);
                    arrayList4.add(new ItemData(strAYXKKw162, sb52.toString(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    if (C33129mqd.OLrzqt(strategyDetailsResponse.getPerMinProfitRate(), strategyDetailsResponse.getPerMaxProfitRate())) {
                    }
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C33129mqd.OLrzqt(strategyDetailsResponse.getPerMinProfitRate(), strategyDetailsResponse.getPerMaxProfitRate()) ? C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null) : C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + str13, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.newTab), strategyDetailsResponse.getTradeNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), strategyDetailsResponse.getArbitrageNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    c55935xtN = this;
                    if (c55935xtN.copydefault) {
                    }
                    str7 = str13;
                    str8 = str12;
                    str2 = str7;
                    str = str8;
                    arrayList = arrayList3;
                    str4 = str3;
                    strFmtBotValueBySymbol$default2 = null;
                }
                str6 = str13;
                arrayList = arrayList3;
                str2 = str6;
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case -512749997:
                str15 = strEZpvd;
                str16 = strAhwBna;
                str3 = str21;
                arrayList3 = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                if (orderType.equals("contract_grid")) {
                    if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getRunType(), (java.lang.Object) "1")) {
                        strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
                    } else if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getRunType(), (java.lang.Object) "2")) {
                        str17 = strFmtBotValueBySymbol$default;
                        ItemData itemData19 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null) + " " + str16, false, 0, (java.lang.String) null, (java.lang.String) null, true, OLrzqt(strategyDetailsResponse), (java.lang.String) null, false, false, "grid_out_of_range_warning", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !AYXKKw(strategyDetailsResponse) ? "grid_out_of_range_warning" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        ItemData itemData20 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), strategyDetailsResponse.getGridNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getGridNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemData21 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str17, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSingleAmt())) {
                            java.lang.String botAmount$default3 = C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null);
                            itemData3 = itemData21;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(botAmount$default3);
                            sb6.append(" ");
                            str18 = str15;
                            sb6.append(str18);
                            string3 = sb6.toString();
                        } else {
                            itemData3 = itemData21;
                            str18 = str15;
                            string3 = strFmtBotValueBySymbol$default;
                        }
                        ItemData itemData22 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getHideOffset), string3, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        str = str18;
                        boolean zAEQbTJ = Companion.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate());
                        ItemData itemData23 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null), false, !zAEQbTJ ? C33070mpX.copydefault(C52761wXj.Activity.gdmIOq) : 0, (java.lang.String) null, (java.lang.String) null, true, zAEQbTJ, (java.lang.String) null, false, false, "grid_profit_show_negative_profit", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !zAEQbTJ ? "grid_profit_show_negative_profit" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512820, (DefaultConstructorMarker) null);
                        ItemData itemData24 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + str16, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        BotParamTickerData botParamTickerData = new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, false, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), 8, null);
                        ItemData itemData25 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.newTab), strategyDetailsResponse.getTradeNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemData26 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), strategyDetailsResponse.getArbitrageNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemDataAEQbTJ = AEQbTJ(strategyDetailsResponse, this);
                        ItemData itemData27 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onCreatePanelMenu), C33070mpX.AYXKKw(!strategyDetailsResponse.getBasePos() ? C55688xof.Application.registerCallback : C55688xof.Application.isSessionReady), false, 0, (java.lang.String) null, !strategyDetailsResponse.getBasePos() ? "contract_grid_open_position_tag" : "", true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        str13 = str16;
                        ItemData itemDataKWHzl = KWHzl(strategyDetailsResponse, this);
                        ItemData itemData28 = itemData3;
                        ItemData itemData29 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.isEnabled), copydefault(this.copydefault, "contract_grid", strategyDetailsResponse.getStopType(), strategyDetailsResponse.getSignParams(), strategyDetailsResponse.getState()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
                        kotlin.Pair pairOLrzqt3 = !strategyDetailsResponse.isHistory() ? C56390yDp.OLrzqt(null, null) : forbidden == null && forbidden.contains(TacticsForbiddenFunctions.Tpsl.getCode()) ? C56390yDp.OLrzqt("forbidden_block_tp", "forbidden_block_sl") : C56390yDp.OLrzqt("tp", "sl");
                        java.lang.String str22 = (java.lang.String) pairOLrzqt3.component1();
                        java.lang.String str23 = (java.lang.String) pairOLrzqt3.component2();
                        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt4 = C56037xvJ.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getTpTriggerPx(), strategyDetailsResponse.getTpRatio());
                        ItemData itemData30 = new ItemData(pairOLrzqt4.getFirst(), !Intrinsics.EZpvd((java.lang.Object) pairOLrzqt4.getSecond(), (java.lang.Object) strFmtBotValueBySymbol$default) ? C33070mpX.AYXKKw(C55688xof.Application.StyleableRes) : pairOLrzqt4.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str22), (java.lang.String) null, false, false, str22 != null ? "" : str22, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str22 != null ? "" : str22, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = C56037xvJ.KWHzl(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSlTriggerPx(), strategyDetailsResponse.getSlRatio());
                        ItemData itemData31 = new ItemData(pairKWHzl.getFirst(), !Intrinsics.EZpvd((java.lang.Object) pairKWHzl.getSecond(), (java.lang.Object) strFmtBotValueBySymbol$default) ? C33070mpX.AYXKKw(C55688xof.Application.StyleableRes) : pairKWHzl.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str23), (java.lang.String) null, false, false, str23 != null ? "" : str23, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str23 != null ? "" : str23, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        strFmtBotValueBySymbol$default = strFmtBotValueBySymbol$default;
                        ItemData itemData32 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem), C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, true, false, null, false, null, null, null, 2024, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw17 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                        xMR xmr6 = xMR.copydefault;
                        java.lang.String profitSharingRatio2 = strategyDetailsResponse.getProfitSharingRatio();
                        ItemData itemData33 = new ItemData(strAYXKKw17, xMR.formatPercent$default(xmr6, profitSharingRatio2 != null ? "" : profitSharingRatio2, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                            arrayList4.add(itemData19);
                            arrayList4.add(itemData20);
                            arrayList4.add(itemData28);
                            arrayList4.add(itemData22);
                            arrayList4.add(itemData23);
                            arrayList4.add(itemData24);
                            if (!strategyDetailsResponse.isHistory()) {
                                arrayList4.add(botParamTickerData);
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "3")) {
                                arrayList4.add(itemData33);
                            }
                            arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                            arrayList4.add(itemData25);
                            arrayList4.add(itemData26);
                            arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                            arrayList4.add(itemDataAEQbTJ);
                            if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDirection(), (java.lang.Object) "neutral")) {
                                arrayList4.add(itemData27);
                            }
                            arrayList4.add(itemDataKWHzl);
                            arrayList4.add(itemData29);
                            arrayList4.add(itemData30);
                            arrayList4.add(itemData31);
                        } else {
                            arrayList4.add(itemData32);
                            arrayList4.add(itemData33);
                            arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                            arrayList4.add(itemData23);
                            arrayList4.add(itemData24);
                            if (!strategyDetailsResponse.isHistory()) {
                                arrayList4.add(botParamTickerData);
                            }
                            if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDirection(), (java.lang.Object) "neutral")) {
                                arrayList4.add(itemData27);
                            }
                            arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                            arrayList4.add(itemData25);
                            arrayList4.add(itemData26);
                        }
                        str6 = str13;
                        arrayList = arrayList3;
                        str2 = str6;
                        str4 = str3;
                        strFmtBotValueBySymbol$default2 = null;
                    } else {
                        strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
                    }
                    str17 = strAYXKKw3;
                    ItemData itemData192 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null) + " " + str16, false, 0, (java.lang.String) null, (java.lang.String) null, true, OLrzqt(strategyDetailsResponse), (java.lang.String) null, false, false, "grid_out_of_range_warning", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !AYXKKw(strategyDetailsResponse) ? "grid_out_of_range_warning" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                    ItemData itemData202 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), strategyDetailsResponse.getGridNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getGridNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    ItemData itemData212 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str17, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getSingleAmt())) {
                    }
                    ItemData itemData222 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getHideOffset), string3, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    str = str18;
                    boolean zAEQbTJ2 = Companion.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate());
                    ItemData itemData232 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMinProfitRate(), false, 0, 6, null) + "-" + C56033xvF.fmtBotPnlPercent$default(strategyDetailsResponse.getPerMaxProfitRate(), false, 0, 6, null), false, !zAEQbTJ2 ? C33070mpX.copydefault(C52761wXj.Activity.gdmIOq) : 0, (java.lang.String) null, (java.lang.String) null, true, zAEQbTJ2, (java.lang.String) null, false, false, "grid_profit_show_negative_profit", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !zAEQbTJ2 ? "grid_profit_show_negative_profit" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512820, (DefaultConstructorMarker) null);
                    ItemData itemData242 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + str16, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    BotParamTickerData botParamTickerData2 = new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, false, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), 8, null);
                    ItemData itemData252 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.newTab), strategyDetailsResponse.getTradeNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    ItemData itemData262 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), strategyDetailsResponse.getArbitrageNum().length() != 0 ? strFmtBotValueBySymbol$default : xMR.copydefault.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    ItemData itemDataAEQbTJ2 = AEQbTJ(strategyDetailsResponse, this);
                    ItemData itemData272 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onCreatePanelMenu), C33070mpX.AYXKKw(!strategyDetailsResponse.getBasePos() ? C55688xof.Application.registerCallback : C55688xof.Application.isSessionReady), false, 0, (java.lang.String) null, !strategyDetailsResponse.getBasePos() ? "contract_grid_open_position_tag" : "", true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                    str13 = str16;
                    ItemData itemDataKWHzl2 = KWHzl(strategyDetailsResponse, this);
                    ItemData itemData282 = itemData3;
                    ItemData itemData292 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.isEnabled), copydefault(this.copydefault, "contract_grid", strategyDetailsResponse.getStopType(), strategyDetailsResponse.getSignParams(), strategyDetailsResponse.getState()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                    java.util.ArrayList<java.lang.String> forbidden2 = strategyDetailsResponse.getForbidden();
                    if (forbidden2 == null) {
                        if (!strategyDetailsResponse.isHistory()) {
                        }
                        java.lang.String str222 = (java.lang.String) pairOLrzqt3.component1();
                        java.lang.String str232 = (java.lang.String) pairOLrzqt3.component2();
                        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt42 = C56037xvJ.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getTpTriggerPx(), strategyDetailsResponse.getTpRatio());
                        ItemData itemData302 = new ItemData(pairOLrzqt42.getFirst(), !Intrinsics.EZpvd((java.lang.Object) pairOLrzqt42.getSecond(), (java.lang.Object) strFmtBotValueBySymbol$default) ? C33070mpX.AYXKKw(C55688xof.Application.StyleableRes) : pairOLrzqt42.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str222), (java.lang.String) null, false, false, str222 != null ? "" : str222, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str222 != null ? "" : str222, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl2 = C56037xvJ.KWHzl(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSlTriggerPx(), strategyDetailsResponse.getSlRatio());
                        ItemData itemData312 = new ItemData(pairKWHzl2.getFirst(), !Intrinsics.EZpvd((java.lang.Object) pairKWHzl2.getSecond(), (java.lang.Object) strFmtBotValueBySymbol$default) ? C33070mpX.AYXKKw(C55688xof.Application.StyleableRes) : pairKWHzl2.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str232), (java.lang.String) null, false, false, str232 != null ? "" : str232, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str232 != null ? "" : str232, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        strFmtBotValueBySymbol$default = strFmtBotValueBySymbol$default;
                        ItemData itemData322 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem), C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, true, false, null, false, null, null, null, 2024, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw172 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                        xMR xmr62 = xMR.copydefault;
                        java.lang.String profitSharingRatio22 = strategyDetailsResponse.getProfitSharingRatio();
                        ItemData itemData332 = new ItemData(strAYXKKw172, xMR.formatPercent$default(xmr62, profitSharingRatio22 != null ? "" : profitSharingRatio22, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                        }
                        str6 = str13;
                        arrayList = arrayList3;
                        str2 = str6;
                        str4 = str3;
                        strFmtBotValueBySymbol$default2 = null;
                        break;
                    }
                }
                c55935xtN = this;
                str8 = str15;
                str7 = str16;
                str2 = str7;
                str = str8;
                arrayList = arrayList3;
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case 3181382:
                str3 = str21;
                if (orderType.equals("grid")) {
                    java.lang.String runType2 = strategyDetailsResponse.getRunType();
                    if (Intrinsics.EZpvd((java.lang.Object) runType2, (java.lang.Object) "1")) {
                        strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
                    } else if (Intrinsics.EZpvd((java.lang.Object) runType2, (java.lang.Object) "2")) {
                        strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.setQueue);
                    } else {
                        str19 = "--";
                        boolean z2 = strategyDetailsResponse.isHistory() && ((sourceCcy = strategyDetailsResponse.getSourceCcy()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy)) && !OLrzqt(strategyDetailsResponse, TacticsForbiddenFunctions.EditParameters);
                        ItemData itemData34 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, z2, (java.lang.String) null, false, false, "price_range", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !z2 ? "price_range" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        ItemData itemData35 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getGridNum(), strategyDetailsResponse.getCtVal(), false, null, 48, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, z2, (java.lang.String) null, false, false, "grid_num", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !z2 ? "grid_num" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        ItemData itemDataOLrzqt = OLrzqt(strategyDetailsResponse, z2);
                        ItemData itemData36 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str19, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        trailingUpConfig = strategyDetailsResponse.getTrailingUpConfig();
                        if (trailingUpConfig == null) {
                            stopPx = trailingUpConfig.getStopPx();
                            itemData4 = itemData36;
                        } else {
                            itemData4 = itemData36;
                            stopPx = null;
                        }
                        ItemData itemData37 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getHideOffset), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, !C33129mqd.AEQbTJ(stopPx, 0) ? C33070mpX.AYXKKw(C55688xof.Application.Nullable) : "", true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw18 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
                        java.lang.String strCopydefault4 = C55918xsx.Companion.copydefault(strategyDetailsResponse.getPerMinProfitRate(), strategyDetailsResponse.getPerMaxProfitRate());
                        StateListAnimator stateListAnimator = Companion;
                        ItemData itemData38 = new ItemData(strAYXKKw18, strCopydefault4, false, !stateListAnimator.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()) ? C33070mpX.copydefault(C52761wXj.Activity.gdmIOq) : 0, (java.lang.String) null, (java.lang.String) null, true, stateListAnimator.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()), (java.lang.String) null, false, false, "grid_profit_show_negative_profit", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !stateListAnimator.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()) ? "grid_profit_show_negative_profit" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512820, (DefaultConstructorMarker) null);
                        BotParamTickerData botParamTickerData3 = new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, false, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), 8, null);
                        ItemData itemData39 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + strAhwBna, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw19 = C33070mpX.AYXKKw(C55688xof.Application.newTab);
                        xMR xmr7 = xMR.copydefault;
                        ItemData itemData40 = new ItemData(strAYXKKw19, xmr7.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemData41 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), xmr7.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemDataAEQbTJ3 = AEQbTJ(strategyDetailsResponse, this);
                        ItemData itemDataKWHzl3 = KWHzl(strategyDetailsResponse, this);
                        ItemData itemData42 = itemData4;
                        arrayList3 = arrayList5;
                        str15 = strEZpvd;
                        ItemData itemData43 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickContact), getSellState$default(this, this.copydefault, "grid", strategyDetailsResponse.getStopType(), strategyDetailsResponse.getSignParams(), null, 16, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.getIconBitmap), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        if (strategyDetailsResponse.getTrailingUpConfig() == null && ((trailingUpConfig2 = strategyDetailsResponse.getTrailingUpConfig()) == null || trailingUpConfig2.getEnabled())) {
                            TrailingConfig trailingUpConfig3 = strategyDetailsResponse.getTrailingUpConfig();
                            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (trailingUpConfig3 == null || (stopPx3 = trailingUpConfig3.getStopPx()) == null) ? "" : stopPx3, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
                        } else {
                            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                        }
                        ItemData itemData44 = new ItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        if (strategyDetailsResponse.getTrailingDownConfig() == null && ((trailingDownConfig = strategyDetailsResponse.getTrailingDownConfig()) == null || trailingDownConfig.getEnabled())) {
                            TrailingConfig trailingDownConfig2 = strategyDetailsResponse.getTrailingDownConfig();
                            pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23CallbackProxy), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (trailingDownConfig2 == null || (stopPx2 = trailingDownConfig2.getStopPx()) == null) ? "" : stopPx2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
                        } else {
                            pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                        }
                        ItemData itemData45 = new ItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        java.util.ArrayList<java.lang.String> forbidden3 = strategyDetailsResponse.getForbidden();
                        kotlin.Pair pairOLrzqt5 = !strategyDetailsResponse.isHistory() ? C56390yDp.OLrzqt(null, null) : forbidden3 == null && forbidden3.contains(TacticsForbiddenFunctions.Tpsl.getCode()) ? C56390yDp.OLrzqt("forbidden_block_tp", "forbidden_block_sl") : C56390yDp.OLrzqt("tp", "sl");
                        java.lang.String str24 = (java.lang.String) pairOLrzqt5.component1();
                        java.lang.String str25 = (java.lang.String) pairOLrzqt5.component2();
                        C55912xsr c55912xsr = new C55912xsr(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSourceCcy(), strategyDetailsResponse.getTradeQuoteCcy());
                        tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(strategyDetailsResponse.getTpslTriggerParamResp());
                        strValues = c55912xsr.values(tpSlTriggerParamOLrzqt);
                        if (Intrinsics.EZpvd((java.lang.Object) strValues, (java.lang.Object) "--")) {
                            strValues = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                        }
                        ItemData itemData46 = new ItemData(C33129mqd.gEmmrt(c55912xsr.fetchVPNInfo(tpSlTriggerParamOLrzqt)), strValues, false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str24), (java.lang.String) null, false, false, str24 != null ? "" : str24, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str24 != null ? "" : str24, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        strValueOf = c55912xsr.valueOf(tpSlTriggerParamOLrzqt);
                        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--")) {
                            strValueOf = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                        }
                        ItemData itemData47 = new ItemData(C33129mqd.gEmmrt(c55912xsr.isConnected(tpSlTriggerParamOLrzqt)), strValueOf, false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str25), (java.lang.String) null, false, false, str25 != null ? "" : str25, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str25 != null ? "" : str25, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        strDjBIcL = c55912xsr.djBIcL(tpSlTriggerParamOLrzqt);
                        if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "--")) {
                            strDjBIcL = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                        }
                        ItemData itemData48 = new ItemData(c55912xsr.copydefault(), strDjBIcL, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        if ((C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getTp().getValue()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getSl().getValue())) || (strDbNXlk = c55912xsr.DbNXlk(tpSlTriggerParamOLrzqt)) == null) {
                            strDbNXlk = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                        }
                        ItemData itemData49 = new ItemData(c55912xsr.gEmmrt(), strDbNXlk, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw20 = C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem);
                        botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, false, false, null, false, null, null, null, 2040, null);
                        if (!Intrinsics.EZpvd((java.lang.Object) botPnl$default, (java.lang.Object) "--")) {
                            botPnl$default = botPnl$default + " " + strAhwBna;
                        }
                        ItemData itemData50 = new ItemData(strAYXKKw20, botPnl$default, false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw21 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                        java.lang.String profitSharingRatio3 = strategyDetailsResponse.getProfitSharingRatio();
                        ItemData itemData51 = new ItemData(strAYXKKw21, xMR.formatPercent$default(xmr7, profitSharingRatio3 == null ? "" : profitSharingRatio3, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        GridProfitAutoReinvestResponse profitAutoReinvest3 = strategyDetailsResponse.getProfitAutoReinvest();
                        boolean z3 = (profitAutoReinvest3 == null || !profitAutoReinvest3.getEditable() || strategyDetailsResponse.isHistory()) ? false : true;
                        java.lang.String strAYXKKw22 = C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE);
                        profitAutoReinvest = strategyDetailsResponse.getProfitAutoReinvest();
                        if (profitAutoReinvest == null) {
                            z = true;
                            boolean z4 = profitAutoReinvest.getEditable();
                            GridProfitAutoReinvestResponse profitAutoReinvest4 = strategyDetailsResponse.getProfitAutoReinvest();
                            strFmtBotValueBySymbol$default = "--";
                            ItemData itemData52 = new ItemData(strAYXKKw22, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, new ItemDataToggle(z4, profitAutoReinvest4 != null && profitAutoReinvest4.getEnabled() == z), (TacticsUiConst.BotListSubItemType) new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE), C33070mpX.AYXKKw(C55688xof.Application.onQueueTitleChanged)), (java.lang.String) null, (java.lang.String) null, 13631486, (DefaultConstructorMarker) null);
                            java.lang.String strAYXKKw23 = C33070mpX.AYXKKw(C55688xof.Application.fromMediaDescription);
                            profitAutoReinvest2 = strategyDetailsResponse.getProfitAutoReinvest();
                            if (profitAutoReinvest2 == null && profitAutoReinvest2.getEnabled()) {
                                itemData5 = itemData46;
                                str16 = strAhwBna;
                                time$default = pTA.formatTime$default(new Date(C33129mqd.valueOf(strategyDetailsResponse.getProfitAutoReinvest().getStartTime())), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
                            } else {
                                itemData5 = itemData46;
                                str16 = strAhwBna;
                                time$default = strFmtBotValueBySymbol$default;
                            }
                            ItemData itemData53 = new ItemData(strAYXKKw23, time$default, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                                if (z3) {
                                    arrayList4.add(itemData52);
                                    arrayList4.add(itemData53);
                                    arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                                }
                                arrayList4.add(itemData34);
                                arrayList4.add(itemData35);
                                if (itemDataOLrzqt != null) {
                                    arrayList4.add(itemDataOLrzqt);
                                }
                                arrayList4.add(itemData42);
                                arrayList4.add(itemData37);
                                arrayList4.add(itemData38);
                                arrayList4.add(itemData39);
                                if (!strategyDetailsResponse.isHistory()) {
                                    arrayList4.add(botParamTickerData3);
                                }
                                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "3")) {
                                    arrayList4.add(itemData51);
                                }
                                arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                                arrayList4.add(itemData40);
                                arrayList4.add(itemData41);
                                arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                                OLrzqt(arrayList4, strategyDetailsResponse);
                                arrayList4.add(itemDataAEQbTJ3);
                                arrayList4.add(itemDataKWHzl3);
                                arrayList4.add(itemData43);
                                arrayList4.add(itemData44);
                                arrayList4.add(itemData45);
                                arrayList4.add(itemData5);
                                arrayList4.add(itemData47);
                                arrayList4.add(itemData48);
                                arrayList4.add(itemData49);
                            } else {
                                arrayList4.add(itemData50);
                                arrayList4.add(itemData51);
                                arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                                arrayList4.add(itemData38);
                                arrayList4.add(itemData39);
                                if (!strategyDetailsResponse.isHistory()) {
                                    arrayList4.add(botParamTickerData3);
                                }
                                arrayList4.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                                arrayList4.add(itemData40);
                                arrayList4.add(itemData41);
                                OLrzqt(arrayList4, strategyDetailsResponse);
                                Unit unit = Unit.INSTANCE;
                            }
                            c55935xtN = this;
                            str8 = str15;
                            str7 = str16;
                            str2 = str7;
                            str = str8;
                            arrayList = arrayList3;
                            str4 = str3;
                            strFmtBotValueBySymbol$default2 = null;
                        } else {
                            z = true;
                        }
                        GridProfitAutoReinvestResponse profitAutoReinvest42 = strategyDetailsResponse.getProfitAutoReinvest();
                        strFmtBotValueBySymbol$default = "--";
                        if (profitAutoReinvest42 != null) {
                            ItemData itemData522 = new ItemData(strAYXKKw22, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, new ItemDataToggle(z4, profitAutoReinvest42 != null && profitAutoReinvest42.getEnabled() == z), (TacticsUiConst.BotListSubItemType) new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE), C33070mpX.AYXKKw(C55688xof.Application.onQueueTitleChanged)), (java.lang.String) null, (java.lang.String) null, 13631486, (DefaultConstructorMarker) null);
                            java.lang.String strAYXKKw232 = C33070mpX.AYXKKw(C55688xof.Application.fromMediaDescription);
                            profitAutoReinvest2 = strategyDetailsResponse.getProfitAutoReinvest();
                            if (profitAutoReinvest2 == null) {
                                itemData5 = itemData46;
                                str16 = strAhwBna;
                                time$default = strFmtBotValueBySymbol$default;
                                ItemData itemData532 = new ItemData(strAYXKKw232, time$default, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                                }
                                c55935xtN = this;
                                str8 = str15;
                                str7 = str16;
                                str2 = str7;
                                str = str8;
                                arrayList = arrayList3;
                                str4 = str3;
                                strFmtBotValueBySymbol$default2 = null;
                                break;
                            }
                        }
                    }
                    str19 = strAYXKKw4;
                    if (strategyDetailsResponse.isHistory()) {
                        ItemData itemData342 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract) + " (" + strAhwBna + ")", C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, z2, (java.lang.String) null, false, false, "price_range", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !z2 ? "price_range" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        ItemData itemData352 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getGridNum(), strategyDetailsResponse.getCtVal(), false, null, 48, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, z2, (java.lang.String) null, false, false, "grid_num", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !z2 ? "grid_num" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                        ItemData itemDataOLrzqt2 = OLrzqt(strategyDetailsResponse, z2);
                        ItemData itemData362 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener), str19, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        trailingUpConfig = strategyDetailsResponse.getTrailingUpConfig();
                        if (trailingUpConfig == null) {
                        }
                        if (!C33129mqd.AEQbTJ(stopPx, 0)) {
                        }
                        ItemData itemData372 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getHideOffset), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSingleAmt(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, !C33129mqd.AEQbTJ(stopPx, 0) ? C33070mpX.AYXKKw(C55688xof.Application.Nullable) : "", true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw182 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1);
                        java.lang.String strCopydefault42 = C55918xsx.Companion.copydefault(strategyDetailsResponse.getPerMinProfitRate(), strategyDetailsResponse.getPerMaxProfitRate());
                        StateListAnimator stateListAnimator2 = Companion;
                        ItemData itemData382 = new ItemData(strAYXKKw182, strCopydefault42, false, !stateListAnimator2.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()) ? C33070mpX.copydefault(C52761wXj.Activity.gdmIOq) : 0, (java.lang.String) null, (java.lang.String) null, true, stateListAnimator2.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()), (java.lang.String) null, false, false, "grid_profit_show_negative_profit", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, !stateListAnimator2.AEQbTJ(strategyDetailsResponse.getPerMinProfitRate()) ? "grid_profit_show_negative_profit" : "", (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512820, (DefaultConstructorMarker) null);
                        BotParamTickerData botParamTickerData32 = new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, false, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), 8, null);
                        ItemData itemData392 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), false, false, null, null, 120, null) + " " + strAhwBna, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        java.lang.String strAYXKKw192 = C33070mpX.AYXKKw(C55688xof.Application.newTab);
                        xMR xmr72 = xMR.copydefault;
                        ItemData itemData402 = new ItemData(strAYXKKw192, xmr72.copydefault(strategyDetailsResponse.getTradeNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemData412 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), xmr72.copydefault(strategyDetailsResponse.getArbitrageNum()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                        ItemData itemDataAEQbTJ32 = AEQbTJ(strategyDetailsResponse, this);
                        ItemData itemDataKWHzl32 = KWHzl(strategyDetailsResponse, this);
                        ItemData itemData422 = itemData4;
                        arrayList3 = arrayList5;
                        str15 = strEZpvd;
                        ItemData itemData432 = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickContact), getSellState$default(this, this.copydefault, "grid", strategyDetailsResponse.getStopType(), strategyDetailsResponse.getSignParams(), null, 16, null), false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.getIconBitmap), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                        if (strategyDetailsResponse.getTrailingUpConfig() == null) {
                            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                            ItemData itemData442 = new ItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                            if (strategyDetailsResponse.getTrailingDownConfig() == null) {
                                pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                                ItemData itemData452 = new ItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                                java.util.ArrayList<java.lang.String> forbidden32 = strategyDetailsResponse.getForbidden();
                                if (forbidden32 == null) {
                                    if (!strategyDetailsResponse.isHistory()) {
                                    }
                                    java.lang.String str242 = (java.lang.String) pairOLrzqt5.component1();
                                    java.lang.String str252 = (java.lang.String) pairOLrzqt5.component2();
                                    C55912xsr c55912xsr2 = new C55912xsr(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSourceCcy(), strategyDetailsResponse.getTradeQuoteCcy());
                                    tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(strategyDetailsResponse.getTpslTriggerParamResp());
                                    strValues = c55912xsr2.values(tpSlTriggerParamOLrzqt);
                                    if (Intrinsics.EZpvd((java.lang.Object) strValues, (java.lang.Object) "--")) {
                                    }
                                    ItemData itemData462 = new ItemData(C33129mqd.gEmmrt(c55912xsr2.fetchVPNInfo(tpSlTriggerParamOLrzqt)), strValues, false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str242), (java.lang.String) null, false, false, str242 != null ? "" : str242, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str242 != null ? "" : str242, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                                    strValueOf = c55912xsr2.valueOf(tpSlTriggerParamOLrzqt);
                                    if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--")) {
                                    }
                                    ItemData itemData472 = new ItemData(C33129mqd.gEmmrt(c55912xsr2.isConnected(tpSlTriggerParamOLrzqt)), strValueOf, false, 0, (java.lang.String) null, (java.lang.String) null, true, C33129mqd.OLrzqt((java.lang.CharSequence) str252), (java.lang.String) null, false, false, str252 != null ? "" : str252, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str252 != null ? "" : str252, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512828, (DefaultConstructorMarker) null);
                                    strDjBIcL = c55912xsr2.djBIcL(tpSlTriggerParamOLrzqt);
                                    if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "--")) {
                                    }
                                    ItemData itemData482 = new ItemData(c55912xsr2.copydefault(), strDjBIcL, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                                    if (C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParamOLrzqt.getTp().getValue())) {
                                        strDbNXlk = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                                        ItemData itemData492 = new ItemData(c55912xsr2.gEmmrt(), strDbNXlk, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                                        java.lang.String strAYXKKw202 = C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem);
                                        botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, false, false, null, false, null, null, null, 2040, null);
                                        if (!Intrinsics.EZpvd((java.lang.Object) botPnl$default, (java.lang.Object) "--")) {
                                        }
                                        ItemData itemData502 = new ItemData(strAYXKKw202, botPnl$default, false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                                        java.lang.String strAYXKKw212 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                                        java.lang.String profitSharingRatio32 = strategyDetailsResponse.getProfitSharingRatio();
                                        ItemData itemData512 = new ItemData(strAYXKKw212, xMR.formatPercent$default(xmr72, profitSharingRatio32 == null ? "" : profitSharingRatio32, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                                        GridProfitAutoReinvestResponse profitAutoReinvest32 = strategyDetailsResponse.getProfitAutoReinvest();
                                        if (profitAutoReinvest32 == null) {
                                            java.lang.String strAYXKKw222 = C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE);
                                            profitAutoReinvest = strategyDetailsResponse.getProfitAutoReinvest();
                                            if (profitAutoReinvest == null) {
                                            }
                                            GridProfitAutoReinvestResponse profitAutoReinvest422 = strategyDetailsResponse.getProfitAutoReinvest();
                                            strFmtBotValueBySymbol$default = "--";
                                        }
                                    } else {
                                        strDbNXlk = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
                                        ItemData itemData4922 = new ItemData(c55912xsr2.gEmmrt(), strDbNXlk, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null);
                                        java.lang.String strAYXKKw2022 = C33070mpX.AYXKKw(C55688xof.Application.onSkipToQueueItem);
                                        botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE))), null, false, false, null, false, null, null, null, 2040, null);
                                        if (!Intrinsics.EZpvd((java.lang.Object) botPnl$default, (java.lang.Object) "--")) {
                                        }
                                        ItemData itemData5022 = new ItemData(strAYXKKw2022, botPnl$default, false, 0, (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompat), true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777116, (DefaultConstructorMarker) null);
                                        java.lang.String strAYXKKw2122 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2);
                                        java.lang.String profitSharingRatio322 = strategyDetailsResponse.getProfitSharingRatio();
                                        ItemData itemData5122 = new ItemData(strAYXKKw2122, xMR.formatPercent$default(xmr72, profitSharingRatio322 == null ? "" : profitSharingRatio322, 0, null, 4, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
                                        GridProfitAutoReinvestResponse profitAutoReinvest322 = strategyDetailsResponse.getProfitAutoReinvest();
                                        if (profitAutoReinvest322 == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                str = strEZpvd;
                str2 = strAhwBna;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case 3573234:
                str3 = str21;
                if (orderType.equals("twap")) {
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalFullyDrawnReporterOwner), OLrzqt(strAhwBna, strategyDetailsResponse), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPRGtXKCDKRTZD), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getPxLimit(), false, false, null, null, 120, null) + " " + strAhwBna, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1), xMR.copydefault.copydefault(strategyDetailsResponse.getTimeInterval()) + " " + C33070mpX.AYXKKw(C55688xof.Application.XmlRes), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.RSmiaq), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSzLimit(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getActualSz(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSz(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setContentdefault), OLrzqt(strategyDetailsResponse.getState()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    OLrzqt(arrayList4, strategyDetailsResponse);
                }
                str = strEZpvd;
                str2 = strAhwBna;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case 1165749981:
                str3 = str21;
                if (orderType.equals("recurring")) {
                    java.lang.String strTakeNonBlankTradeQuoteCcy2 = strategyDetailsResponse.takeNonBlankTradeQuoteCcy();
                    if (strTakeNonBlankTradeQuoteCcy2 == null) {
                        strTakeNonBlankTradeQuoteCcy2 = strategyDetailsResponse.getInvestCcy();
                        java.lang.String str26 = strTakeNonBlankTradeQuoteCcy2.length() == 0 ? "--" : strTakeNonBlankTradeQuoteCcy2;
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResult), str26, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        java.lang.String strAYXKKw24 = C33070mpX.AYXKKw(C55688xof.Application.attributeId);
                        C56046xvS c56046xvS = C56046xvS.AEQbTJ;
                        java.lang.String period = strategyDetailsResponse.getPeriod();
                        java.lang.String recurringDay = strategyDetailsResponse.getRecurringDay();
                        java.lang.String recurringTime = strategyDetailsResponse.getRecurringTime();
                        java.lang.String recurringHour = strategyDetailsResponse.getRecurringHour();
                        BotVo bot = strategyDetailsResponse.getBot();
                        java.lang.String string4 = (bot == null || (recurring2 = bot.getRecurring()) == null || (recurringTimeType = recurring2.getRecurringTimeType()) == null) ? null : recurringTimeType.toString();
                        java.lang.String str27 = string4 == null ? "" : string4;
                        BotVo bot2 = strategyDetailsResponse.getBot();
                        java.lang.String recurringTimeMinutes = (bot2 == null || (recurring = bot2.getRecurring()) == null) ? null : recurring.getRecurringTimeMinutes();
                        arrayList4.add(new ItemData(strAYXKKw24, c56046xvS.copydefault(period, recurringDay, recurringTime, recurringHour, str27, recurringTimeMinutes == null ? "" : recurringTimeMinutes), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        if (!strategyDetailsResponse.isHistory()) {
                            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "pause")) {
                                strCopydefault3 = "--";
                            } else {
                                java.lang.String nextInvestTime = strategyDetailsResponse.getNextInvestTime();
                                if (nextInvestTime == null) {
                                    nextInvestTime = "";
                                }
                                strCopydefault3 = c56046xvS.copydefault(nextInvestTime);
                            }
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.isAvailable), strCopydefault3, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        }
                        if (strategyDetailsResponse.getAmt().length() == 0) {
                            strFmtBotValueBySymbol$default3 = "--";
                        } else {
                            java.lang.String strTakeNonBlankTradeQuoteCcy3 = strategyDetailsResponse.takeNonBlankTradeQuoteCcy();
                            if (strTakeNonBlankTradeQuoteCcy3 == null) {
                                strTakeNonBlankTradeQuoteCcy3 = strategyDetailsResponse.getInvestCcy();
                            }
                            strFmtBotValueBySymbol$default3 = C56033xvF.fmtBotValueBySymbol$default(strTakeNonBlankTradeQuoteCcy3, strategyDetailsResponse.getAmt(), RoundingMode.UP, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null);
                        }
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setState), strFmtBotValueBySymbol$default3, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws), strategyDetailsResponse.getCycles().length() == 0 ? "--" : xMR.copydefault.copydefault(strategyDetailsResponse.getCycles()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                        arrayList5.addAll(AEQbTJ(strategyDetailsResponse));
                    }
                }
                str = strEZpvd;
                str2 = strAhwBna;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                str4 = str3;
                strFmtBotValueBySymbol$default2 = null;
                break;
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("dip_snipping", "profit_snipping", "pending_matching")), strategyDetailsResponse.getDcdState())) {
                        arrayList4.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.zKcAg), 10.0f, 8.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
                        java.lang.String instId2 = strategyDetailsResponse.getInstId();
                        java.lang.String dcdState = strategyDetailsResponse.getDcdState();
                        java.lang.String str28 = dcdState == null ? "" : dcdState;
                        java.lang.String settlementAmount = strategyDetailsResponse.getSettlementAmount();
                        java.lang.String str29 = settlementAmount == null ? "" : settlementAmount;
                        java.lang.String notionalCcy = strategyDetailsResponse.getNotionalCcy();
                        java.lang.String str30 = notionalCcy == null ? "" : notionalCcy;
                        java.lang.String currencyBal = strategyDetailsResponse.getCurrencyBal();
                        java.lang.String str31 = currencyBal == null ? "" : currencyBal;
                        java.lang.String currency = strategyDetailsResponse.getCurrency();
                        java.lang.String str32 = currency == null ? "" : currency;
                        java.lang.String absYieldPercentage = strategyDetailsResponse.getAbsYieldPercentage();
                        java.lang.String curStrike = strategyDetailsResponse.getCurStrike();
                        java.lang.String str33 = curStrike == null ? "" : curStrike;
                        java.lang.String lastTradeExpireTime = strategyDetailsResponse.getLastTradeExpireTime();
                        java.lang.String lastPrice = strategyDetailsResponse.getLastPrice();
                        DcdPnlChartData dcdPnlChartData = new DcdPnlChartData(instId2, str28, str29, str30, str31, str32, absYieldPercentage, str33, lastTradeExpireTime, lastPrice == null ? "" : lastPrice);
                        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDcdState(), (java.lang.Object) "pending_matching")) {
                            arrayList4.add(new CommonEmptyData(null, C33070mpX.AYXKKw(C55688xof.Application.DrNnAm), null, 6, 40, false, false, 40, 0, 293, null));
                        } else {
                            java.lang.String strAYXKKw25 = C33070mpX.AYXKKw(C55688xof.Application.zYHWMc);
                            xMR xmr8 = xMR.copydefault;
                            java.lang.String cycle = strategyDetailsResponse.getCycle();
                            if (cycle == null) {
                                cycle = "";
                            }
                            arrayList4.add(new ItemData(strAYXKKw25, xmr8.copydefault(cycle), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zOIQXb), DcdOptionType.Companion.AEQbTJ(strategyDetailsResponse.getDcdOptionType()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            java.lang.String strAYXKKw26 = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDcdState(), (java.lang.Object) "profit_snipping") ? C33070mpX.AYXKKw(C55688xof.Application.invokespecialDPHOMC) : C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu);
                            java.lang.String instType2 = strategyDetailsResponse.getInstType();
                            java.lang.String instId3 = strategyDetailsResponse.getInstId();
                            java.lang.String curStrike2 = strategyDetailsResponse.getCurStrike();
                            arrayList4.add(new ItemData(strAYXKKw26, C56033xvF.getBotPrice$default(instType2, instId3, curStrike2 == null ? "" : curStrike2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            arrayList4.add(new BotParamTickerData(C33070mpX.AYXKKw(C55688xof.Application.RLmrWm), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, false, C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null), 8, null));
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fBE), pTA.format$default(new Date(C33129mqd.valueOf(strategyDetailsResponse.getLastTradeExpireTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zDUObI), C56033xvF.EZpvd(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Double.max(C33129mqd.subD$default(strategyDetailsResponse.getEstimatedSettleTime(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), null, null, null, 14, null), AudioStats.AUDIO_AMPLITUDE_NONE)))), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            java.lang.String strAYXKKw27 = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt);
                            java.lang.String settlementCcy = strategyDetailsResponse.getSettlementCcy();
                            java.lang.String str34 = settlementCcy == null ? "" : settlementCcy;
                            java.lang.String settlementAmount2 = strategyDetailsResponse.getSettlementAmount();
                            arrayList4.add(new ItemData(strAYXKKw27, C56033xvF.fmtBotValueBySymbol$default(str34, settlementAmount2 == null ? "" : settlementAmount2, RoundingMode.DOWN, true, "8", false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1824, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                            java.lang.String strMulS$default = C33129mqd.mulS$default(strategyDetailsResponse.getAbsYieldPercentage(), strategyDetailsResponse.getSettlementAmount(), null, null, null, 14, null);
                            java.lang.String strAYXKKw28 = C33070mpX.AYXKKw(C55688xof.Application.vLaW);
                            java.lang.String settlementCcy2 = strategyDetailsResponse.getSettlementCcy();
                            arrayList4.add(new ItemData(strAYXKKw28, C56033xvF.copydefault(strMulS$default, settlementCcy2 == null ? "" : settlementCcy2, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "8", (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null), false, C56033xvF.OLrzqt((java.lang.Object) strMulS$default), (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777140, (DefaultConstructorMarker) null));
                            arrayList4.add(dcdPnlChartData);
                        }
                    }
                    arrayList4.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialROgMPW), 0.0f, 8.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
                    java.lang.String instType3 = strategyDetailsResponse.getInstType();
                    java.lang.String instId4 = strategyDetailsResponse.getInstId();
                    java.lang.String strike = strategyDetailsResponse.getStrike();
                    java.lang.String botPrice$default = C56033xvF.getBotPrice$default(instType3, instId4, strike == null ? "" : strike, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    int i = C55688xof.Application.ggKfIT;
                    xMR xmr9 = xMR.copydefault;
                    java.lang.String strikePercentage = strategyDetailsResponse.getStrikePercentage();
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), C33129mqd.AEQbTJ(strategyDetailsResponse.getStrikePercentage(), 0) ? C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr9, strikePercentage == null ? "" : strikePercentage, 0, null, 6, null)))) : botPrice$default, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    if (C33129mqd.AEQbTJ(strategyDetailsResponse.getStopPercentage(), 0)) {
                        int i2 = C55688xof.Application.invokespecialaVhqwO;
                        java.lang.String stopPercentage = strategyDetailsResponse.getStopPercentage();
                        str3 = str21;
                        strAYXKKw5 = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr9, stopPercentage == null ? "" : stopPercentage, 0, null, 6, null))));
                    } else {
                        str3 = str21;
                        if (C33129mqd.AEQbTJ(strategyDetailsResponse.getStopPrice(), 0)) {
                            java.lang.String instType4 = strategyDetailsResponse.getInstType();
                            java.lang.String instId5 = strategyDetailsResponse.getInstId();
                            java.lang.String stopPrice = strategyDetailsResponse.getStopPrice();
                            strAYXKKw5 = C56033xvF.getBotPrice$default(instType4, instId5, stopPrice == null ? "" : stopPrice, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                        } else {
                            strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.invokespecialRuDPQV);
                        }
                    }
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialDPHOMC), strAYXKKw5, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw29 = C33070mpX.AYXKKw(C55688xof.Application.RIuxYh);
                    java.lang.String minAnnualYieldPercentage = strategyDetailsResponse.getMinAnnualYieldPercentage();
                    java.lang.String str35 = minAnnualYieldPercentage == null ? "" : minAnnualYieldPercentage;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    arrayList4.add(new ItemData(strAYXKKw29, xMR.formatPercentWithSymbol$default(xmr9, str35, 0, 0, roundingMode2, 2, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw30 = C33070mpX.AYXKKw(C55688xof.Application.RTWSvT);
                    android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                    int i3 = C55688xof.Activity.KWHzl;
                    int iAhwBna = C33129mqd.AhwBna(strategyDetailsResponse.getMaxSettlementDay());
                    java.lang.String maxSettlementDay = strategyDetailsResponse.getMaxSettlementDay();
                    if (maxSettlementDay == null) {
                        maxSettlementDay = "";
                    }
                    arrayList4.add(new ItemData(strAYXKKw30, pTD.EZpvd(applicationOLrzqt, i3, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xmr9.copydefault(maxSettlementDay)))), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    java.lang.String strAYXKKw31 = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt);
                    java.lang.String notionalCcy2 = strategyDetailsResponse.getNotionalCcy();
                    java.lang.String str36 = notionalCcy2 == null ? "" : notionalCcy2;
                    java.lang.String notional = strategyDetailsResponse.getNotional();
                    arrayList4.add(new ItemData(strAYXKKw31, C56033xvF.fmtBotValueBySymbol$default(str36, notional == null ? "" : notional, roundingMode2, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    str = strEZpvd;
                    str2 = strAhwBna;
                    arrayList = arrayList5;
                    strFmtBotValueBySymbol$default = "--";
                    str4 = str3;
                    strFmtBotValueBySymbol$default2 = null;
                }
                str = strEZpvd;
                str2 = strAhwBna;
                str4 = str21;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                strFmtBotValueBySymbol$default2 = null;
                break;
            case 1629187779:
                if (orderType.equals("iceberg")) {
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.iluEmO), C56033xvF.AYXKKw(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getSide(), strategyDetailsResponse.getPosSide()).getFirst(), false, C56033xvF.OLrzqt(C56033xvF.AYXKKw(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getSide(), strategyDetailsResponse.getPosSide()).getSecond().booleanValue()), (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777140, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ) + "/" + C33070mpX.AYXKKw(C55688xof.Application.pauseLocationServices), C56033xvF.fJNWhG(strategyDetailsResponse.getTdMode()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiverStub), C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.accessBackHandlerlambda0), OLrzqt(strAhwBna, strategyDetailsResponse), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPURsaBn), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getPxLimit(), false, false, null, null, 120, null) + " " + strAhwBna, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.RSmiaq), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSzLimit(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getActualSz(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getSz(), strategyDetailsResponse.getCtVal(), false, null, 48, null) + " " + strEZpvd, false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList4.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.setContentdefault), OLrzqt(strategyDetailsResponse.getState()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                }
                str = strEZpvd;
                str2 = strAhwBna;
                str4 = str21;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                strFmtBotValueBySymbol$default2 = null;
                break;
            default:
                str = strEZpvd;
                str2 = strAhwBna;
                str4 = str21;
                arrayList = arrayList5;
                strFmtBotValueBySymbol$default = "--";
                strFmtBotValueBySymbol$default2 = null;
                break;
        }
        java.lang.String instId6 = strategyDetailsResponse.getInstId();
        java.lang.String instType5 = strategyDetailsResponse.getInstType();
        java.lang.String botAmount$default4 = C33129mqd.AEQbTJ(strategyDetailsResponse.getBaseSz(), 0) ? C56033xvF.getBotAmount$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getBaseSz(), strategyDetailsResponse.getCtVal(), true, null, 32, null) : "";
        java.lang.String strFmtBotValueBySymbol$default7 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getQuoteSz()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotValueBySymbol$default(str2, strategyDetailsResponse.getQuoteSz(), RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), str4, null, null, 1584, null);
        java.lang.String strFmtBotValueBySymbol$default8 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getCurBaseSz()) ? strFmtBotValueBySymbol$default : C56033xvF.fmtBotValueBySymbol$default(str, strategyDetailsResponse.getCurBaseSz(), RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponse.getCurQuoteSz())) {
            strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(str2, strategyDetailsResponse.getCurQuoteSz(), RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), str4, null, null, 1584, null);
        }
        SmartEarnParam simpleEarn = strategyDetailsResponse.getSimpleEarn();
        if (simpleEarn == null || !simpleEarn.getEnabled()) {
            strFmtBotValueBySymbol$default4 = strFmtBotValueBySymbol$default2;
        } else {
            java.lang.String earnBaseSz = strategyDetailsResponse.getSimpleEarn().getEarnBaseSz();
            if (earnBaseSz != null) {
                strFmtBotValueBySymbol$default4 = C56033xvF.fmtBotValueBySymbol$default(str, earnBaseSz, RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, null, 1840, null);
                if (strFmtBotValueBySymbol$default4 == null) {
                    strFmtBotValueBySymbol$default4 = "";
                }
            }
        }
        SmartEarnParam simpleEarn2 = strategyDetailsResponse.getSimpleEarn();
        if (simpleEarn2 == null || !simpleEarn2.getEnabled()) {
            str20 = strFmtBotValueBySymbol$default2;
        } else {
            java.lang.String earnQuoteSz = strategyDetailsResponse.getSimpleEarn().getEarnQuoteSz();
            if (earnQuoteSz != null) {
                strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(str2, earnQuoteSz, RoundingMode.DOWN, true, null, false, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), str4, null, null, 1584, null);
                if (strFmtBotValueBySymbol$default2 == null) {
                }
            }
            str20 = "";
        }
        return new InformationFragmentData(instId6, instType5, botAmount$default4, strFmtBotValueBySymbol$default7, strFmtBotValueBySymbol$default8, strFmtBotValueBySymbol$default, arrayList4, strategyDetailsResponse.getInvestCcy(), arrayList, strFmtBotValueBySymbol$default4, str20);
    }

    public static final java.lang.String OLrzqt(java.lang.String str, StrategyDetailsResponse strategyDetailsResponse) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getPxSpread())) {
            return C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getPxSpread(), false, false, null, null, 120, null) + " " + str;
        }
        return xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getPxVar(), 0, RoundingMode.DOWN, 2, null);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public static final java.lang.String KWHzl2(StrategyDetailsResponse strategyDetailsResponse) {
        DcaTriggerParam dcaTriggerParam;
        java.lang.String botPrice$default;
        java.lang.Object next;
        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
        if (triggerParams != null) {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        } else {
            dcaTriggerParam = null;
        }
        java.lang.String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
        GridStartTriggerType gridStartTriggerType = GridStartTriggerType.PRICE;
        if (!Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) gridStartTriggerType.getMode())) {
            return GridStartTriggerType.Companion.copydefault(dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dcaTriggerParam.getTriggerPx())) {
            java.lang.String instType = strategyDetailsResponse.getInstType();
            java.lang.String instId = strategyDetailsResponse.getInstId();
            java.lang.String triggerPx = dcaTriggerParam.getTriggerPx();
            if (triggerPx == null) {
                triggerPx = "";
            }
            botPrice$default = C56033xvF.getBotPrice$default(instType, instId, triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else {
            botPrice$default = "--";
        }
        return C33070mpX.AYXKKw(gridStartTriggerType.getDesc()) + " | " + botPrice$default;
    }

    public static final ItemData AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, C55935xtN c55935xtN) {
        SignParamItem signParamItem;
        ItemData itemData;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        } else {
            signParamItem = null;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton);
        GridStartTriggerType.Application application = GridStartTriggerType.Companion;
        ItemData itemData2 = new ItemData(strAYXKKw, application.copydefault(signParamItem != null ? signParamItem.getIndicator() : null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
        if (application.KWHzl(strategyDetailsResponse.getSignParams(), null)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem != null ? signParamItem.getTriggerPx() : null))) {
                botPrice$default = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem == null || (triggerPx = signParamItem.getTriggerPx()) == null) ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            } else {
                botPrice$default = "--";
            }
            itemData = itemData2;
            itemData.OLrzqt(C33070mpX.AYXKKw(GridStartTriggerType.PRICE.getDesc()) + " | " + botPrice$default);
            if (!strategyDetailsResponse.isHistory() && Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "pending_signal")) {
                itemData.OLrzqt(true);
                itemData.KWHzl("start_condition");
                itemData.copydefault("start_condition");
            } else {
                int i = C55688xof.Application.onBackInvoked;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, botPrice$default);
                xMR xmr = xMR.copydefault;
                java.lang.String delaySeconds = signParamItem != null ? signParamItem.getDelaySeconds() : null;
                pairArr[1] = C56390yDp.OLrzqt("delaySec", xmr.copydefault(delaySeconds != null ? delaySeconds : ""));
                itemData.EZpvd(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            }
        } else {
            itemData = itemData2;
            if (application.AEQbTJ(strategyDetailsResponse.getSignParams(), null)) {
                itemData.EZpvd(TtmlNode.START);
            } else if (c55935xtN.copydefault && application.copydefault(strategyDetailsResponse.getSignParams(), null)) {
                GridStartTriggerType gridStartTriggerType = GridStartTriggerType.TRADINGVIEW;
                itemData.copydefault(gridStartTriggerType.getMode());
                itemData.copydefault(true);
                itemData.AEQbTJ(C33070mpX.AYXKKw(gridStartTriggerType.getDesc()));
            }
        }
        return itemData;
    }

    public static final boolean EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        SignParamItem signParamItem;
        java.lang.String sourceCcy;
        java.lang.Object next;
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        } else {
            signParamItem = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "no_close_position") && !Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "stopping")) {
            if (!Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStopTriggerType.TRADINGVIEW.getMode()) && !Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getGridStatus(), (java.lang.Object) "stop_delay_trigger")) {
                if ((!Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStopTriggerType.RSI_14.getMode()) || !Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "3")) && ((sourceCcy = strategyDetailsResponse.getSourceCcy()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ItemData KWHzl(StrategyDetailsResponse strategyDetailsResponse, C55935xtN c55935xtN) {
        SignParamItem signParamItem;
        ItemData itemData;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        } else {
            signParamItem = null;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved);
        GridStopTriggerType.StateListAnimator stateListAnimator = GridStopTriggerType.Companion;
        ItemData itemData2 = new ItemData(strAYXKKw, stateListAnimator.EZpvd(signParamItem != null ? signParamItem.getIndicator() : null), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null);
        if (stateListAnimator.AEQbTJ(strategyDetailsResponse.getSignParams(), null)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (signParamItem != null ? signParamItem.getTriggerPx() : null))) {
                botPrice$default = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), (signParamItem == null || (triggerPx = signParamItem.getTriggerPx()) == null) ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            } else {
                botPrice$default = "--";
            }
            itemData = itemData2;
            itemData.OLrzqt(C33070mpX.AYXKKw(GridStopTriggerType.PRICE.getDesc()) + " | " + botPrice$default);
        } else {
            itemData = itemData2;
            if (c55935xtN.copydefault && stateListAnimator.KWHzl(strategyDetailsResponse.getSignParams(), strategyDetailsResponse.getTriggerParams())) {
                GridStopTriggerType gridStopTriggerType = GridStopTriggerType.TRADINGVIEW;
                itemData.copydefault(gridStopTriggerType.getMode());
                itemData.copydefault(true);
                itemData.AEQbTJ(C33070mpX.AYXKKw(gridStopTriggerType.getDesc()));
            }
        }
        boolean z = !strategyDetailsResponse.isHistory() && EZpvd(strategyDetailsResponse);
        itemData.KWHzl(z ? "stop_condition" : "");
        itemData.OLrzqt(z);
        itemData.copydefault("stop_condition");
        return itemData;
    }

    public final ItemData OLrzqt(StrategyDetailsResponse strategyDetailsResponse, boolean z) {
        SmartEarnParam simpleEarn;
        int iCopydefault;
        SmartEarnConfig earnConfig;
        SmartEarnParam simpleEarn2;
        if (!strategyDetailsResponse.getShouldShowEarn()) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, 12, null) : null;
        boolean z2 = true;
        java.lang.String strEZpvd = (suggestedInstrument$default == null || (simpleEarn2 = strategyDetailsResponse.getSimpleEarn()) == null || !simpleEarn2.getEnabled() || strategyDetailsResponse.getSimpleEarn().getEarnMinLimit() == null || strategyDetailsResponse.getSimpleEarn().getEarnMaxLimit() == null || strategyDetailsResponse.getSimpleEarn().getEarnType() == null) ? "--" : C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) C56547yJk.EZpvd(strategyDetailsResponse.getSimpleEarn().getEarnMinLimit(), strategyDetailsResponse.getSimpleEarn().getEarnMaxLimit()), strategyDetailsResponse.getSimpleEarn().getEarnType(), suggestedInstrument$default);
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        if ((strategyConfigInfo == null || (earnConfig = strategyConfigInfo.getEarnConfig()) == null || !earnConfig.isEarnSupported()) && ((simpleEarn = strategyDetailsResponse.getSimpleEarn()) == null || !simpleEarn.isEarnSupported())) {
            z2 = false;
        }
        java.lang.String str = z ? z2 ? "edit_smart_earn" : "edit_smart_earn_disabled" : "";
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.isThumbUp);
        if (z2) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        return new ItemData(strAYXKKw, strEZpvd, false, iCopydefault, (java.lang.String) null, (java.lang.String) null, true, z, (java.lang.String) null, false, false, str, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, str, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16512820, (DefaultConstructorMarker) null);
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        IceBergAggressiveType iceBergAggressiveType;
        java.lang.String strAYXKKw;
        IceBergAggressiveType[] iceBergAggressiveTypeArrValues = IceBergAggressiveType.values();
        int length = iceBergAggressiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iceBergAggressiveType = null;
                break;
            }
            iceBergAggressiveType = iceBergAggressiveTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) iceBergAggressiveType.getMode(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return (iceBergAggressiveType == null || (strAYXKKw = C33070mpX.AYXKKw(iceBergAggressiveType.getDesc())) == null) ? "--" : strAYXKKw;
    }

    private final java.lang.String EZpvd(java.lang.String str, boolean z) {
        return z ? C33070mpX.AYXKKw(C55688xof.Application.getResultContract) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<ItemData> EZpvd(java.lang.String str) {
        boolean z;
        StgySourceInfo stgySourceInfo;
        java.lang.String strCopydefault;
        java.lang.String traderUniqueName;
        java.lang.String avatar;
        java.util.ArrayList<ItemData> arrayList = new java.util.ArrayList<>();
        switch (str.hashCode()) {
            case -1831183611:
                if (!str.equals("spot_dca")) {
                    pUU.OLrzqt("the other bot not support copy source!!!");
                } else if (this.KWHzl != null) {
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
                    StgySourceInfo stgySourceInfo2 = this.KWHzl;
                    Intrinsics.copydefault(stgySourceInfo2);
                    java.lang.String username = stgySourceInfo2.getUsername();
                    StgySourceInfo stgySourceInfo3 = this.KWHzl;
                    java.lang.String str2 = (stgySourceInfo3 == null || (avatar = stgySourceInfo3.getAvatar()) == null) ? "" : avatar;
                    StgySourceInfo stgySourceInfo4 = this.KWHzl;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (stgySourceInfo4 != null ? stgySourceInfo4.getTraderUniqueName() : null))) {
                        StgySourceInfo stgySourceInfo5 = this.KWHzl;
                        if (Intrinsics.EZpvd((java.lang.Object) (stgySourceInfo5 != null ? stgySourceInfo5.getCopyType() : null), (java.lang.Object) "2")) {
                            z = true;
                        }
                        StgySourceInfo stgySourceInfo6 = this.KWHzl;
                        if (stgySourceInfo6 != null) {
                            arrayList.add(new ItemData(strAYXKKw, username, false, 0, str2, (java.lang.String) null, false, z, (java.lang.String) null, false, false, "3", (stgySourceInfo6 != null || (traderUniqueName = stgySourceInfo6.getTraderUniqueName()) == null) ? "" : traderUniqueName, true, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16762732, (DefaultConstructorMarker) null));
                            stgySourceInfo = this.KWHzl;
                            if (!Intrinsics.EZpvd((java.lang.Object) (stgySourceInfo == null ? stgySourceInfo.getCopyType() : null), (java.lang.Object) "3")) {
                            }
                        }
                    } else {
                        z = false;
                        StgySourceInfo stgySourceInfo62 = this.KWHzl;
                        arrayList.add(new ItemData(strAYXKKw, username, false, 0, str2, (java.lang.String) null, false, z, (java.lang.String) null, false, false, "3", (stgySourceInfo62 != null || (traderUniqueName = stgySourceInfo62.getTraderUniqueName()) == null) ? "" : traderUniqueName, true, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16762732, (DefaultConstructorMarker) null));
                        stgySourceInfo = this.KWHzl;
                        if (!Intrinsics.EZpvd((java.lang.Object) (stgySourceInfo == null ? stgySourceInfo.getCopyType() : null), (java.lang.Object) "3")) {
                            StgySourceInfo stgySourceInfo7 = this.KWHzl;
                            if (Intrinsics.EZpvd((java.lang.Object) (stgySourceInfo7 != null ? stgySourceInfo7.getState() : null), (java.lang.Object) "running")) {
                                strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.collapseActionView);
                            } else {
                                int i = C55688xof.Application.DpxfQh;
                                StgySourceInfo stgySourceInfo8 = this.KWHzl;
                                strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("stopDate", pTA.formatSimpleTime$default(new Date(C33129mqd.valueOf(stgySourceInfo8 != null ? stgySourceInfo8.getUTime() : null)), null, 1, null))));
                            }
                            arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.hwXsuq), strCopydefault, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
                            arrayList.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
                        }
                    }
                }
                return arrayList;
            case -1574173039:
                if (!str.equals("infinite_grid")) {
                }
                return arrayList;
            case -1402017003:
                if (!str.equals("contract_dca")) {
                }
                return arrayList;
            case -1216369070:
                if (!str.equals("smart_portfolio")) {
                }
                return arrayList;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                return arrayList;
            case 3181382:
                if (!str.equals("grid")) {
                }
                return arrayList;
            case 1165749981:
                if (!str.equals("recurring")) {
                }
                return arrayList;
        }
    }

    public static /* synthetic */ java.lang.String getSellState$default(C55935xtN c55935xtN, boolean z, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = "";
        }
        return c55935xtN.copydefault(z, str, str2, arrayList, str3);
    }

    public final java.lang.String copydefault(boolean z, java.lang.String str, java.lang.String str2, java.util.ArrayList<SignParamItem> arrayList, java.lang.String str3) {
        java.lang.String stopType;
        java.lang.String str4 = "";
        if (z || (!z && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "no_close_position"))) {
            if (str2 == null) {
                str2 = "";
            }
            return copydefault(str, str2);
        }
        SignParamItem signParamItem = null;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                    obj = next;
                    break;
                }
            }
            signParamItem = (SignParamItem) obj;
        }
        if (signParamItem != null && (stopType = signParamItem.getStopType()) != null) {
            str4 = stopType;
        }
        return copydefault(str, str4);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        java.util.List<TradeMenuItemBean> listOLrzqt;
        java.lang.Object next;
        java.lang.String title;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
            listOLrzqt = C55763xqA.KWHzl(str2);
        } else {
            listOLrzqt = C55763xqA.OLrzqt(str2);
        }
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((TradeMenuItemBean) next).getData(), (java.lang.Object) str2)) {
                break;
            }
        }
        TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) next;
        return (tradeMenuItemBean == null || (title = tradeMenuItemBean.getTitle()) == null) ? "" : title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2016=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String OLrzqt(java.lang.String str) {
        switch (str.hashCode()) {
            case -1784744586:
                if (str.equals("partially_effective")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setSelectedNavigationItem);
                }
                return "--";
            case -1468651097:
                if (str.equals("effective")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.getContract);
                }
                return "--";
            case -123173735:
                if (str.equals("canceled")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.provides);
                }
                return "--";
            case 3322092:
                if (str.equals("live")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setSplitBackgroundDrawable);
                }
                return "--";
            case 106440182:
                if (str.equals("pause")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.LocalOnBackPressedDispatcherOwner);
                }
                return "--";
            case 651875918:
                if (str.equals("order_failed")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandlerbackCallback11);
                }
                return "--";
            case 1889341808:
                if (str.equals("cancelling")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setDrawerIndicatorEnabled);
                }
                return "--";
            default:
                return "--";
        }
    }

    public final java.util.ArrayList<TacticsPortfolioInfoDetailItem> EZpvd(StrategyDetailsResponse strategyDetailsResponse, boolean z) {
        java.util.ArrayList<TacticsPortfolioInfoDetailItem> arrayList = new java.util.ArrayList<>();
        strategyDetailsResponse.takeNonBlankTradeQuoteCcy();
        java.lang.String strAddS$default = "";
        for (SmartPortfolioListItem smartPortfolioListItem : strategyDetailsResponse.getPortfolioList()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, C33129mqd.mulS$default(smartPortfolioListItem.getCurNum(), smartPortfolioListItem.getPx(), null, null, null, 14, null), null, null, null, 14, null);
        }
        for (SmartPortfolioListItem smartPortfolioListItem2 : strategyDetailsResponse.getPortfolioList()) {
            java.lang.String strMulS$default = C33129mqd.mulS$default(smartPortfolioListItem2.getCurNum(), smartPortfolioListItem2.getPx(), null, null, null, 14, null);
            java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, C33129mqd.divS$default(strMulS$default, strAddS$default, null, null, null, 14, null), 0, Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem2.getCcy(), (java.lang.Object) "USDT") ? RoundingMode.UP : RoundingMode.DOWN, 2, null);
            java.lang.String instType = strategyDetailsResponse.getInstType();
            java.lang.String algoOrdType = strategyDetailsResponse.getAlgoOrdType();
            arrayList.add(new TacticsPortfolioInfoDetailItem(instType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, smartPortfolioListItem2.getPx(), smartPortfolioListItem2.getCcy(), smartPortfolioListItem2.getRatio(), percent$default, strategyDetailsResponse.getInvestCcy(), smartPortfolioListItem2.getInitNum(), smartPortfolioListItem2.getCurNum(), strMulS$default, algoOrdType, z, strategyDetailsResponse.getDisplayId(), strategyDetailsResponse.getTradeQuoteCcy(), 14, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public final java.lang.String copydefault(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String strEZpvd;
        java.lang.String strAYXKKw = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getBalType(), (java.lang.Object) "ratio") ? C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast) : C33070mpX.AYXKKw(C55688xof.Application.suggest);
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getBalType(), (java.lang.Object) "ratio")) {
            strEZpvd = xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponse.getDeltaRatio(), 0, null, 4, null);
        } else if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(strategyDetailsResponse.getInterval(), 60, null, null, null, 14, null), (java.lang.Object) 0)) {
            java.lang.String strDivS$default = C33129mqd.divS$default(strategyDetailsResponse.getInterval(), 60, null, null, null, 14, null);
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
        } else {
            strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.AEQbTJ, C33129mqd.AhwBna(strategyDetailsResponse.getInterval()), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strategyDetailsResponse.getInterval(), null, 1, null))));
        }
        return strAYXKKw + " " + strEZpvd;
    }

    public final java.util.ArrayList<TacticsRecInfoDetailItem> AEQbTJ(StrategyDetailsResponse strategyDetailsResponse) {
        java.util.ArrayList<TacticsRecInfoDetailItem> arrayList = new java.util.ArrayList<>();
        for (RecurringListItem recurringListItem : strategyDetailsResponse.getRecurringList()) {
            java.lang.String instType = strategyDetailsResponse.getInstType();
            java.lang.String algoOrdType = strategyDetailsResponse.getAlgoOrdType();
            arrayList.add(new TacticsRecInfoDetailItem(instType, recurringListItem.getTotalAmt(), recurringListItem.getProfit(), recurringListItem.getAvgPx(), recurringListItem.getPx(), recurringListItem.getCcy(), recurringListItem.getRatio(), (java.lang.String) null, strategyDetailsResponse.getInvestCcy(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoOrdType, strategyDetailsResponse.isHistory(), recurringListItem.getMinPrice(), recurringListItem.getMaxPrice(), strategyDetailsResponse.takeNonBlankTradeQuoteCcy(), 3712, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public final boolean AYXKKw(StrategyDetailsResponse strategyDetailsResponse) {
        return !strategyDetailsResponse.isHistory() && strategyDetailsResponse.getOutOfRange();
    }

    public final boolean OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        return (strategyDetailsResponse.isHistory() || !strategyDetailsResponse.getOutOfRange() || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "no_close_position")) ? false : true;
    }

    public final void OLrzqt(java.util.ArrayList<java.lang.Object> arrayList, StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String strAYXKKw;
        java.lang.String tradeQuoteCcy = strategyDetailsResponse.getTradeQuoteCcy();
        if (tradeQuoteCcy == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getSide(), (java.lang.Object) StateListAnimator.TaskDescription.AEQbTJ.AEQbTJ())) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnAfter1);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1);
        }
        arrayList.add(new ItemData(strAYXKKw, strategyDetailsResponse.getTradeQuoteCcy(), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
    }
}
