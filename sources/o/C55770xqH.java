package o;

import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55770xqH {
    public static final C55770xqH OLrzqt = new C55770xqH();

    private C55770xqH() {
    }

    /* JADX INFO: renamed from: o.xqH$Activity */
    public static final class Activity {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }

        public final java.lang.Float EZpvd(java.lang.Float f) {
            if (copydefault.OLrzqt(f)) {
                return f;
            }
            return null;
        }

        public final boolean OLrzqt(java.lang.Object obj) {
            return C33129mqd.AEQbTJ(obj, java.lang.Float.valueOf(1.0f));
        }
    }

    /* JADX INFO: renamed from: o.xqH$ActionBar */
    public static final class ActionBar {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ = C56424yEw.AYXKKw(C56390yDp.OLrzqt("SOL", "OKSOL"), C56390yDp.OLrzqt("ETH", "BETH"));
        public static final java.util.HashMap<java.lang.String, java.lang.String> copydefault = C56424yEw.AYXKKw(C56390yDp.OLrzqt("USDT", "simple"), C56390yDp.OLrzqt("BTC", "yieldPlus"), C56390yDp.OLrzqt("SOL", "onChain"), C56390yDp.OLrzqt("ETH", "onChain"));
        public static final java.util.HashMap<ArbInvestDetailsBeanStakingType4UI, SubArbitrageType4Remote> EZpvd = C56424yEw.AYXKKw(C56390yDp.OLrzqt(ArbInvestDetailsBeanStakingType4UI.STAKING, SubArbitrageType4Remote.STAKE), C56390yDp.OLrzqt(ArbInvestDetailsBeanStakingType4UI.NOT_STAKING, null), C56390yDp.OLrzqt(ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING, null));
        public static final int KWHzl = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<ArbInvestDetailsBeanStakingType4UI, SubArbitrageType4Remote> AEQbTJ() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.String, java.lang.String> EZpvd() {
            return copydefault;
        }

        private ActionBar() {
        }

        public final java.lang.String KWHzl(java.lang.String str) {
            java.util.HashMap<java.lang.String, java.lang.String> map = AEQbTJ;
            java.lang.String str2 = map.get(str);
            if (str2 != null) {
                return str2;
            }
            java.lang.String strCopydefault = TaskDescription.AEQbTJ(str).copydefault();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strCopydefault.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return map.get(upperCase);
        }
    }
}
