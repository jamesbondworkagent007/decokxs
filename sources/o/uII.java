package o;

import com.okinc.biz.TacticsType;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uII extends android.widget.FrameLayout {
    public final C48341uNx EZpvd;
    public C52580wQr KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uII(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uII(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.uII.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ uII(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uII(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C48341uNx c48341uNxCopydefault = C48341uNx.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c48341uNxCopydefault, "");
        this.EZpvd = c48341uNxCopydefault;
        OLrzqt();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.util.List<StrategyProfitResponse> EZpvd;
        public final int KWHzl;
        public final C48264uLa OLrzqt;
        public final TacticsType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.uII$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.util.List list, C48264uLa c48264uLa, int i, TacticsType tacticsType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                list = activity.EZpvd;
            }
            java.util.List list2 = list;
            if ((i2 & 4) != 0) {
                c48264uLa = activity.OLrzqt;
            }
            C48264uLa c48264uLa2 = c48264uLa;
            if ((i2 & 8) != 0) {
                i = activity.KWHzl;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                tacticsType = activity.copydefault;
            }
            return activity.copydefault(str, list2, c48264uLa2, i3, tacticsType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TacticsType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<StrategyProfitResponse> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull C48264uLa c48264uLa, int i, @NotNull TacticsType tacticsType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c48264uLa, "");
            Intrinsics.checkNotNullParameter(tacticsType, "");
            return new Activity(str, list, c48264uLa, i, tacticsType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48264uLa copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && this.KWHzl == activity.KWHzl && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiModel(pnlRatio=" + this.AEQbTJ + ", profitList=" + this.EZpvd + ", chartConfig=" + this.OLrzqt + ", pnlColor=" + this.KWHzl + ", botType=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.util.List<StrategyProfitResponse> list, @NotNull C48264uLa c48264uLa, int i, @NotNull TacticsType tacticsType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(c48264uLa, "");
            Intrinsics.checkNotNullParameter(tacticsType, "");
            this.AEQbTJ = str;
            this.EZpvd = list;
            this.OLrzqt = c48264uLa;
            this.KWHzl = i;
            this.copydefault = tacticsType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.util.List)
  (r9v0 o.uLa)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: INVOKE (wrap:java.lang.Object:?: CAST (java.lang.Object) (r7v0 java.lang.String)) STATIC call: o.xvF.OLrzqt(java.lang.Object):int A[MD:(java.lang.Object):int (m), WRAPPED] (LINE:56)) : (r10v0 int))
  (r11v0 com.okinc.biz.TacticsType)
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, o.uLa, int, com.okinc.biz.TacticsType):void (m)] (LINE:52) call: o.uII.Activity.<init>(java.lang.String, java.util.List, o.uLa, int, com.okinc.biz.TacticsType):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.util.List list, C48264uLa c48264uLa, int i, TacticsType tacticsType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, c48264uLa, (i2 & 8) != 0 ? C56033xvF.OLrzqt((java.lang.Object) str) : i, tacticsType);
        }
    }

    public final void KWHzl(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        KWHzl(activity.KWHzl(), activity.AEQbTJ());
        boolean z = activity.EZpvd() == TacticsType.TACTICS_LLM_BOT;
        this.EZpvd.OLrzqt.getAxisLeft().setLabelCount(z ? 6 : 3, true);
        EZpvd(activity.OLrzqt(), activity.copydefault(), z);
    }

    public static /* synthetic */ void updatePnlValue$default(uII uii, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C56033xvF.OLrzqt((java.lang.Object) str);
        }
        uii.KWHzl(str, i);
    }

    public final void KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.AYXKKw.setText(C56068xvo.copydefault.copydefault(str, true));
        this.EZpvd.AYXKKw.setTextColor(i);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.valueOf.setText(str);
    }

    public static /* synthetic */ void updateChartData$default(uII uii, java.util.List list, C48264uLa c48264uLa, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        uii.EZpvd(list, c48264uLa, z);
    }

    public final void EZpvd(@NotNull java.util.List<StrategyProfitResponse> list, @NotNull C48264uLa c48264uLa, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c48264uLa, "");
        if (list.isEmpty()) {
            C55237xgE c55237xgE = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
            C49953uyK.showCommonEmpty$default(c55237xgE, null, null, 0, false, 15, null);
            return;
        }
        C55237xgE c55237xgE2 = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55237xgE2, "");
        c55237xgE2.setVisibility(0);
        if (this.KWHzl == null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl = new C52580wQr(context);
        }
        C48267uLd c48267uLd = C48267uLd.KWHzl;
        C51348vlN c51348vlN = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c51348vlN, "");
        c48267uLd.EZpvd(c51348vlN, list, c48264uLa, this.KWHzl, z);
    }

    public final void KWHzl() {
        this.EZpvd.copydefault.setStatus(StatefulView.Status.Content);
    }

    public final void OLrzqt() {
        C48267uLd c48267uLd = C48267uLd.KWHzl;
        C51348vlN c51348vlN = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c51348vlN, "");
        C48267uLd.initializeChart$default(c48267uLd, c51348vlN, 0, 2, null);
    }
}
