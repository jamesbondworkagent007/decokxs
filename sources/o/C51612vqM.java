package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.robinhood.ticker.TickerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC51686vrh;
import o.ActivityC51906vvp;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51612vqM extends android.widget.FrameLayout {
    public C48566uWd AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public AbstractC50850vbt OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.vqM$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51612vqM(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:46) call: o.vqM.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C51612vqM(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51612vqM(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.xxhdY, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC50850vbt) viewDataBindingInflate;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51612vqM.KWHzl(context);
            }
        });
        this.copydefault = SPUtils.getBoolean("bot_assets_eye", true);
        AEQbTJ();
        OLrzqt();
        values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketPlaceHomeHeaderPresenter DbNXlk() {
        return (MarketPlaceHomeHeaderPresenter) this.EZpvd.getValue();
    }

    public static final MarketPlaceHomeHeaderPresenter KWHzl(android.content.Context context) {
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            return (MarketPlaceHomeHeaderPresenter) new ViewModelProvider(appCompatActivityCopydefault).get(MarketPlaceHomeHeaderPresenter.class);
        }
        return null;
    }

    public final boolean copydefault() {
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.EZpvd()) {
            return true;
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
        return interfaceC55881xsMCopydefault2 != null && interfaceC55881xsMCopydefault2.OLrzqt();
    }

    private final boolean fetchVPNInfo() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) ? false : true;
    }

    private final boolean isConnected() {
        return copydefault() && !C56071xvr.gEmmrt.getFieldNames();
    }

    public final void AEQbTJ() {
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        wPQ.AEQbTJ(this, c56071xvr.fIwbmz(), c56071xvr.isConnected());
        AbstractC50850vbt abstractC50850vbt = this.OLrzqt;
        abstractC50850vbt.valueOf.setCharacterLists(C57862yqS.copydefault());
        abstractC50850vbt.valueOf.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.EZpvd));
        abstractC50850vbt.AkhnZx.setText(C33070mpX.AYXKKw(C48291uMa.Companion.AEQbTJ().OLrzqt() ? C48033uCm.Fragment.DbNXlk : C55688xof.Application.sZqaRl));
    }

    public final void AYXKKw() {
        if (C55697xoo.OLrzqt.isConnected()) {
            android.view.View root = this.OLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            AhwBna();
            djBIcL();
            valueOf();
            return;
        }
        android.view.View root2 = this.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.vqM$StateListAnimator */
    public static final class StateListAnimator implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51612vqM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public StateListAnimator(android.view.View view, C51612vqM c51612vqM) {
            this.EZpvd = view;
            this.OLrzqt = c51612vqM;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            C56203xyQ c56203xyQCopydefault;
            C56109xwc<java.lang.Exception> c56109xwcAhwBna;
            xAL xalDjBIcL;
            C56109xwc<java.lang.Exception> c56109xwcAhwBna2;
            TradeLiveData<BotUserSummaryData> tradeLiveDataGEmmrt;
            TradeLiveData<BotAssetsChartData> tradeLiveDataAYXKKw;
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.OLrzqt);
            if (lifecycleOwner != null) {
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk = this.OLrzqt.DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk != null && (tradeLiveDataAYXKKw = marketPlaceHomeHeaderPresenterDbNXlk.AYXKKw()) != null) {
                    tradeLiveDataAYXKKw.observe(lifecycleOwner, new Application(this.OLrzqt.new LoaderManager()));
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk2 = this.OLrzqt.DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk2 != null && (tradeLiveDataGEmmrt = marketPlaceHomeHeaderPresenterDbNXlk2.gEmmrt()) != null) {
                    tradeLiveDataGEmmrt.observe(lifecycleOwner, new Application(this.OLrzqt.new Fragment()));
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk3 = this.OLrzqt.DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk3 != null && (xalDjBIcL = marketPlaceHomeHeaderPresenterDbNXlk3.djBIcL()) != null && (c56109xwcAhwBna2 = xalDjBIcL.AhwBna()) != null) {
                    c56109xwcAhwBna2.observe(lifecycleOwner, this.OLrzqt.new PendingIntent());
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk4 = this.OLrzqt.DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk4 == null || (c56203xyQCopydefault = marketPlaceHomeHeaderPresenterDbNXlk4.copydefault()) == null || (c56109xwcAhwBna = c56203xyQCopydefault.AhwBna()) == null) {
                    return;
                }
                c56109xwcAhwBna.observe(lifecycleOwner, new FragmentManager());
            }
        }
    }

    public final void OLrzqt() {
        this.OLrzqt.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.vqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51612vqM.KWHzl(this.AEQbTJ, view);
            }
        });
        this.OLrzqt.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.vqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51612vqM.copydefault(this.copydefault, view);
            }
        });
        C52705wVh c52705wVh = this.OLrzqt.gEmmrt;
        c52705wVh.setOnClickListener(new TaskDescription(c52705wVh, 1000L, this));
        this.OLrzqt.gEmmrt.OLrzqt(new Function1() { // from class: o.vqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51612vqM.copydefault(this.KWHzl, (C52705wVh) obj);
            }
        });
        AppCompatTextView appCompatTextView = this.OLrzqt.EZpvd;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        android.view.View view = this.OLrzqt.KWHzl;
        view.setOnClickListener(new ActionBar(view, 1000L, this));
    }

    public static final void KWHzl(C51612vqM c51612vqM, android.view.View view) {
        android.content.Context context = c51612vqM.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.OqHLSf);
        viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.DaTmkG);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C51612vqM.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(C51612vqM c51612vqM, android.view.View view) {
        boolean z = !c51612vqM.copydefault;
        c51612vqM.copydefault = z;
        SPUtils.put("bot_assets_eye", java.lang.Boolean.valueOf(z));
        c51612vqM.djBIcL();
        c51612vqM.valueOf();
        c51612vqM.gEmmrt();
    }

    public static final Unit copydefault(C51612vqM c51612vqM, C52705wVh c52705wVh) {
        Intrinsics.checkNotNullParameter(c52705wVh, "");
        c51612vqM.EZpvd();
        C55867xrz.KWHzl.KWHzl("dashboard");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vqM$LoaderManager */
    public static final class LoaderManager implements Function1<BotAssetsChartData, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(BotAssetsChartData botAssetsChartData) {
            KWHzl(botAssetsChartData);
            return Unit.INSTANCE;
        }

        public final void KWHzl(BotAssetsChartData botAssetsChartData) {
            C51612vqM.this.gEmmrt();
        }
    }

    /* JADX INFO: renamed from: o.vqM$Fragment */
    public static final class Fragment implements Function1<BotUserSummaryData, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(BotUserSummaryData botUserSummaryData) {
            AEQbTJ(botUserSummaryData);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(BotUserSummaryData botUserSummaryData) {
            C51612vqM.this.AYXKKw();
        }
    }

    /* JADX INFO: renamed from: o.vqM$PendingIntent */
    public static final class PendingIntent implements Observer<java.lang.Exception> {
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            C51612vqM.this.AYXKKw();
        }
    }

    /* JADX INFO: renamed from: o.vqM$FragmentManager */
    public static final class FragmentManager implements Observer<java.lang.Exception> {
        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            pUU.KWHzl("BotMarketPlaceHomeTopView", "fetchHistoryUseCase request api error!");
        }
    }

    /* JADX INFO: renamed from: o.vqM$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51612vqM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51612vqM c51612vqM) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c51612vqM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C51612vqM.navigateToMyBotPage$default(this.OLrzqt, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vqM$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C51612vqM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51612vqM c51612vqM) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c51612vqM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C51612vqM.navigateToMyBotPage$default(this.copydefault, false, 1, null);
                C55867xrz.KWHzl.KWHzl("today_pnl");
            }
        }
    }

    /* JADX INFO: renamed from: o.vqM$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C51612vqM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51612vqM c51612vqM) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c51612vqM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd();
                C55867xrz.KWHzl.KWHzl("dashboard");
            }
        }
    }

    public final void djBIcL() {
        this.OLrzqt.AYXKKw.setImageResource(this.copydefault ? C52761wXj.TaskDescription.ODCBUN : C52761wXj.TaskDescription.invokespecialgBtXYZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        java.lang.String assetSymbol;
        java.lang.String cycle;
        java.lang.String totalAsset;
        TradeLiveData<BotUserSummaryData> tradeLiveDataGEmmrt;
        AbstractC50850vbt abstractC50850vbt = this.OLrzqt;
        MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk = DbNXlk();
        java.lang.String str = null;
        BotUserSummaryData value = (marketPlaceHomeHeaderPresenterDbNXlk == null || (tradeLiveDataGEmmrt = marketPlaceHomeHeaderPresenterDbNXlk.gEmmrt()) == null) ? null : tradeLiveDataGEmmrt.getValue();
        java.lang.String str2 = "";
        if (this.copydefault) {
            TickerView tickerView = abstractC50850vbt.valueOf;
            if (value != null && (totalAsset = value.getTotalAsset()) != null) {
                str = (totalAsset.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAsset)) ? "0" : totalAsset;
            }
            tickerView.setText(str, false);
            if (value != null) {
                java.lang.String str3 = value.getTotalProfit() + " (" + value.getProfitRatio() + ")";
                if (str3 == null) {
                    str3 = "";
                }
                abstractC50850vbt.copydefault.setText(str3);
                abstractC50850vbt.copydefault.setTextColor(value != null ? value.getProfitRatioColor() : 0);
            }
        } else {
            abstractC50850vbt.valueOf.setText("******", false);
            abstractC50850vbt.copydefault.setText("******");
            abstractC50850vbt.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        AppCompatTextView appCompatTextView = abstractC50850vbt.EZpvd;
        if (value == null || (assetSymbol = value.getAssetSymbol()) == null) {
            assetSymbol = "";
        }
        appCompatTextView.setText(assetSymbol);
        C55320xhi c55320xhi = abstractC50850vbt.AhwBna;
        if (value != null && (cycle = value.getCycle()) != null) {
            str2 = cycle;
        }
        c55320xhi.setText(str2);
        abstractC50850vbt.AhwBna.setTextColor(value != null ? value.getCycleColor() : 0);
    }

    public final void AhwBna() {
        C52705wVh c52705wVh = this.OLrzqt.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
        c52705wVh.setVisibility(isConnected() ? 0 : 8);
        this.OLrzqt.gEmmrt.setEnabled(!fetchVPNInfo());
    }

    public final void EZpvd() {
        if (KWHzl()) {
            return;
        }
        ActivityC51906vvp.TaskDescription taskDescription = ActivityC51906vvp.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ActivityC51906vvp.TaskDescription.startActivity$default(taskDescription, context, 0, 2, null);
    }

    public static /* synthetic */ void navigateToMyBotPage$default(C51612vqM c51612vqM, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c51612vqM.copydefault(z);
    }

    public final void copydefault(boolean z) {
        java.lang.String stgyCount;
        java.lang.String totalAsset;
        TradeLiveData<BotUserSummaryData> tradeLiveDataGEmmrt;
        BotUserSummaryData value;
        if (KWHzl()) {
            return;
        }
        MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk = DbNXlk();
        StrategyUserSummaryData origin = (marketPlaceHomeHeaderPresenterDbNXlk == null || (tradeLiveDataGEmmrt = marketPlaceHomeHeaderPresenterDbNXlk.gEmmrt()) == null || (value = tradeLiveDataGEmmrt.getValue()) == null) ? null : value.getOrigin();
        ActivityC51686vrh.TaskDescription taskDescription = ActivityC51686vrh.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (z || origin == null || (stgyCount = origin.getStgyCount()) == null) {
            stgyCount = "";
        }
        taskDescription.EZpvd(context, (24 & 2) != 0 ? "" : stgyCount, (24 & 4) != 0 ? "" : (origin == null || (totalAsset = origin.getTotalAsset()) == null) ? "" : totalAsset, (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? "" : null);
    }

    public final boolean KWHzl() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) {
            return false;
        }
        C55326xho.toastWithFailedIcon$default(C48033uCm.Fragment.fJk, 0, 1, (java.lang.Object) null);
        return true;
    }

    public final void gEmmrt() {
        C51728vsW c51728vsW;
        C51728vsW c51728vsW2;
        C51728vsW c51728vsW3;
        C51728vsW c51728vsW4;
        TradeLiveData<BotAssetsChartData> tradeLiveDataAYXKKw;
        MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk = DbNXlk();
        BotAssetsChartData value = (marketPlaceHomeHeaderPresenterDbNXlk == null || (tradeLiveDataAYXKKw = marketPlaceHomeHeaderPresenterDbNXlk.AYXKKw()) == null) ? null : tradeLiveDataAYXKKw.getValue();
        if (value == null || !this.copydefault || copydefault()) {
            C48566uWd c48566uWd = this.AEQbTJ;
            if (c48566uWd == null || (c51728vsW = c48566uWd.KWHzl) == null) {
                return;
            }
            c51728vsW.setVisibility(8);
            return;
        }
        android.view.ViewStub viewStub = this.OLrzqt.DbNXlk.getViewStub();
        if (this.AEQbTJ == null && viewStub != null) {
            C48566uWd c48566uWdCopydefault = C48566uWd.copydefault(viewStub.inflate());
            this.AEQbTJ = c48566uWdCopydefault;
            if (c48566uWdCopydefault != null && (c51728vsW4 = c48566uWdCopydefault.KWHzl) != null) {
                wPQ.EZpvd(c51728vsW4, C56071xvr.gEmmrt.isConnected(), 0);
            }
        }
        C48566uWd c48566uWd2 = this.AEQbTJ;
        if (c48566uWd2 != null && (c51728vsW3 = c48566uWd2.KWHzl) != null) {
            c51728vsW3.setVisibility(0);
        }
        C48566uWd c48566uWd3 = this.AEQbTJ;
        if (c48566uWd3 == null || (c51728vsW2 = c48566uWd3.KWHzl) == null) {
            return;
        }
        c51728vsW2.setData(value.copydefault(), value.AEQbTJ(), value.EZpvd(), value.KWHzl(), value.OLrzqt());
    }

    public final void values() {
        C56203xyQ c56203xyQCopydefault;
        C56109xwc<java.lang.Exception> c56109xwcAhwBna;
        xAL xalDjBIcL;
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2;
        TradeLiveData<BotUserSummaryData> tradeLiveDataGEmmrt;
        TradeLiveData<BotAssetsChartData> tradeLiveDataAYXKKw;
        if (ViewCompat.isAttachedToWindow(this)) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
            if (lifecycleOwner != null) {
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk = DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk != null && (tradeLiveDataAYXKKw = marketPlaceHomeHeaderPresenterDbNXlk.AYXKKw()) != null) {
                    tradeLiveDataAYXKKw.observe(lifecycleOwner, new Application(new LoaderManager()));
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk2 = DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk2 != null && (tradeLiveDataGEmmrt = marketPlaceHomeHeaderPresenterDbNXlk2.gEmmrt()) != null) {
                    tradeLiveDataGEmmrt.observe(lifecycleOwner, new Application(new Fragment()));
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk3 = DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk3 != null && (xalDjBIcL = marketPlaceHomeHeaderPresenterDbNXlk3.djBIcL()) != null && (c56109xwcAhwBna2 = xalDjBIcL.AhwBna()) != null) {
                    c56109xwcAhwBna2.observe(lifecycleOwner, new PendingIntent());
                }
                MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenterDbNXlk4 = DbNXlk();
                if (marketPlaceHomeHeaderPresenterDbNXlk4 == null || (c56203xyQCopydefault = marketPlaceHomeHeaderPresenterDbNXlk4.copydefault()) == null || (c56109xwcAhwBna = c56203xyQCopydefault.AhwBna()) == null) {
                    return;
                }
                c56109xwcAhwBna.observe(lifecycleOwner, new FragmentManager());
                return;
            }
            return;
        }
        addOnAttachStateChangeListener(new StateListAnimator(this, this));
    }
}
