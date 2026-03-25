package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51289vkH extends ConstraintLayout {
    public AbstractC48568uWf EZpvd;
    public final Function1<BotCopyTraderInfoData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51289vkH(@NotNull android.content.Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51289vkH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51289vkH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<BotCopyTraderInfoData, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData, kotlin.Unit>):void (m)] (LINE:23) call: o.vkH.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51289vkH(android.content.Context context, android.util.AttributeSet attributeSet, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C51289vkH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, Function1<? super BotCopyTraderInfoData, Unit> function1) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = function1;
        AEQbTJ();
    }

    private final void AEQbTJ() {
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        setPaddingRelative(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
        this.EZpvd = (AbstractC48568uWf) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.DztXDE, this, true);
    }

    public final void AEQbTJ(@NotNull BotCopyTraderInfoData botCopyTraderInfoData) {
        java.lang.String strAYXKKw;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(botCopyTraderInfoData, "");
        wUE wue = wUE.OLrzqt;
        AbstractC48568uWf abstractC48568uWf = this.EZpvd;
        AbstractC48568uWf abstractC48568uWf2 = null;
        if (abstractC48568uWf == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf = null;
        }
        android.widget.ImageView imageView = abstractC48568uWf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(botCopyTraderInfoData.copydefault(), null, 2, null));
        AbstractC48568uWf abstractC48568uWf3 = this.EZpvd;
        if (abstractC48568uWf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf3 = null;
        }
        abstractC48568uWf3.fetchVPNInfo.setText(botCopyTraderInfoData.AhwBna());
        AbstractC48568uWf abstractC48568uWf4 = this.EZpvd;
        if (abstractC48568uWf4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf4 = null;
        }
        abstractC48568uWf4.values.OLrzqt(botCopyTraderInfoData.valueOf());
        AbstractC48568uWf abstractC48568uWf5 = this.EZpvd;
        if (abstractC48568uWf5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf5 = null;
        }
        abstractC48568uWf5.KWHzl.setText(botCopyTraderInfoData.AEQbTJ());
        AbstractC48568uWf abstractC48568uWf6 = this.EZpvd;
        if (abstractC48568uWf6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf6 = null;
        }
        abstractC48568uWf6.valueOf.setText(botCopyTraderInfoData.EZpvd());
        AbstractC48568uWf abstractC48568uWf7 = this.EZpvd;
        if (abstractC48568uWf7 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf7 = null;
        }
        android.widget.FrameLayout frameLayout = abstractC48568uWf7.AhwBna;
        frameLayout.setOnClickListener(new Application(frameLayout, 1000L, this, botCopyTraderInfoData));
        AbstractC48568uWf abstractC48568uWf8 = this.EZpvd;
        if (abstractC48568uWf8 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf8 = null;
        }
        AppCompatTextView appCompatTextView = abstractC48568uWf8.fetchVPNInfo;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, botCopyTraderInfoData));
        AbstractC48568uWf abstractC48568uWf9 = this.EZpvd;
        if (abstractC48568uWf9 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf9 = null;
        }
        C55258xgZ c55258xgZ = abstractC48568uWf9.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(Intrinsics.EZpvd((java.lang.Object) botCopyTraderInfoData.OLrzqt(), (java.lang.Object) "contract_dca") ? 0 : 8);
        AbstractC48568uWf abstractC48568uWf10 = this.EZpvd;
        if (abstractC48568uWf10 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf10 = null;
        }
        AppCompatTextView appCompatTextView2 = abstractC48568uWf10.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) botCopyTraderInfoData.OLrzqt(), (java.lang.Object) "contract_dca") ? 0 : 8);
        AbstractC48568uWf abstractC48568uWf11 = this.EZpvd;
        if (abstractC48568uWf11 == null) {
            Intrinsics.gEmmrt("");
            abstractC48568uWf11 = null;
        }
        C55258xgZ c55258xgZ2 = abstractC48568uWf11.gEmmrt;
        c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, this));
        AbstractC48568uWf abstractC48568uWf12 = this.EZpvd;
        if (abstractC48568uWf12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48568uWf2 = abstractC48568uWf12;
        }
        AppCompatTextView appCompatTextView3 = abstractC48568uWf2.djBIcL;
        DcaLeadShareMode dcaLeadShareModeOLrzqt = DcaLeadShareMode.Companion.OLrzqt(botCopyTraderInfoData.KWHzl());
        if (dcaLeadShareModeOLrzqt != null && (strAYXKKw = C33070mpX.AYXKKw(dcaLeadShareModeOLrzqt.getShowMode())) != null) {
            str = strAYXKKw;
        }
        appCompatTextView3.setText(str);
    }

    /* JADX INFO: renamed from: o.vkH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51289vkH EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ BotCopyTraderInfoData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51289vkH c51289vkH, BotCopyTraderInfoData botCopyTraderInfoData) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c51289vkH;
            this.copydefault = botCopyTraderInfoData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1<BotCopyTraderInfoData, Unit> function1EZpvd = this.EZpvd.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(this.copydefault);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vkH$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ BotCopyTraderInfoData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51289vkH OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51289vkH c51289vkH, BotCopyTraderInfoData botCopyTraderInfoData) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c51289vkH;
            this.AEQbTJ = botCopyTraderInfoData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<BotCopyTraderInfoData, Unit> function1EZpvd = this.OLrzqt.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vkH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51289vkH OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51289vkH c51289vkH) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c51289vkH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.KWHzl(C48033uCm.Activity.GzAsTt);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onCreate, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
