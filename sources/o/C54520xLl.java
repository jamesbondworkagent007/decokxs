package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54520xLl {
    public static final C54520xLl KWHzl = new C54520xLl();

    private C54520xLl() {
    }

    /* JADX INFO: renamed from: o.xLl$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.xLl$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = activity.AhwBna;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = activity.copydefault;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = activity.OLrzqt;
            }
            java.lang.String str9 = str5;
            if ((i & 32) != 0) {
                map = activity.KWHzl;
            }
            return activity.KWHzl(str, str6, str7, str8, str9, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new Activity(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GrafanaUserBehaviorData(source=" + this.EZpvd + ", action=" + this.AEQbTJ + ", type=" + this.AhwBna + ", instId=" + this.copydefault + ", instType=" + this.OLrzqt + ", details=" + this.KWHzl + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.AhwBna = str3;
            this.copydefault = str4;
            this.OLrzqt = str5;
            this.KWHzl = map;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:66)) : (r15v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:60) call: o.xLl.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? C56424yEw.KWHzl() : map);
        }
    }

    public final void AEQbTJ(@NotNull Activity activity) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(activity, "");
        if (TradeAbTestManager.copydefault.EZpvd()) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
            boolean zEZpvd = c54589xNz.EZpvd();
            EventData eventData = new EventData();
            eventData.setAct("trade_order_common_monitor");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("launchTime", "user_behavior");
            linkedHashMap.put("pauseTime", activity.OLrzqt());
            linkedHashMap.put("totalTime", activity.EZpvd());
            linkedHashMap.put("otherTime", activity.gEmmrt());
            linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, activity.KWHzl());
            linkedHashMap.put("isSelinuxIntegrity", activity.AEQbTJ());
            linkedHashMap.put("brc20Token", strGEmmrt);
            linkedHashMap.put("crypto_amount", strWlaJM != null ? strWlaJM : "");
            linkedHashMap.put("code", java.lang.String.valueOf(zEZpvd));
            linkedHashMap.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33488mxR.EZpvd(activity.copydefault()));
            linkedHashMap.put("pic_url", "6.146.0");
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }
}
