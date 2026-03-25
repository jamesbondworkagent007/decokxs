package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergPresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53095wey extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC48597uXh AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public ActivityResultLauncher<android.content.Intent> AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public StrategyConfigInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53095wey(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53095wey(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        this.copydefault = strategyConfigInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:52) call: o.wey.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53095wey(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53095wey(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.weK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53095wey.OLrzqt(context);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.weC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53095wey.OLrzqt();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.weB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53095wey.KWHzl(this.EZpvd);
            }
        });
        values();
        gEmmrt();
        DbNXlk();
        AkhnZx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.FragmentManager OLrzqt(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((AppCompatActivity) context).getSupportFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager djBIcL() {
        return (androidx.fragment.app.FragmentManager) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C53096wez AhwBna() {
        return (C53096wez) this.AYXKKw.getValue();
    }

    public static final C53096wez OLrzqt() {
        return new C53096wez();
    }

    private final SmartIcebergPresenter AYXKKw() {
        return (SmartIcebergPresenter) this.OLrzqt.getValue();
    }

    public static final SmartIcebergPresenter KWHzl(C53095wey c53095wey) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c53095wey);
        if (viewModelStoreOwner != null) {
            return (SmartIcebergPresenter) new ViewModelProvider(viewModelStoreOwner).get(SmartIcebergPresenter.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.wey$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wey.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void copydefault() {
        this.AhwBna = ViewKt.findFragment(this).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C53095wey.copydefault(this.AEQbTJ, (ActivityResult) obj);
            }
        });
    }

    public static final void copydefault(C53095wey c53095wey, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        c53095wey.AhwBna().copydefault(extras);
        c53095wey.fetchVPNInfo();
        c53095wey.OLrzqt("start_trigger");
    }

    private final void values() {
        this.AEQbTJ = (AbstractC48597uXh) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.GCXiNH, this, true);
        refreshVisibleState$default(this, null, 1, null);
    }

    private final void gEmmrt() {
        AhwBna().AEQbTJ();
    }

    private final void DbNXlk() {
        AbstractC48597uXh abstractC48597uXh = this.AEQbTJ;
        AbstractC48597uXh abstractC48597uXh2 = null;
        if (abstractC48597uXh == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh = null;
        }
        abstractC48597uXh.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.weF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53095wey.valueOf(this.KWHzl, view);
            }
        });
        AbstractC48597uXh abstractC48597uXh3 = this.AEQbTJ;
        if (abstractC48597uXh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh3 = null;
        }
        C55258xgZ c55258xgZ = abstractC48597uXh3.EZpvd;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        AbstractC48597uXh abstractC48597uXh4 = this.AEQbTJ;
        if (abstractC48597uXh4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh4 = null;
        }
        abstractC48597uXh4.OLrzqt.KWHzl(new View.OnClickListener() { // from class: o.weD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53095wey.AYXKKw(this.KWHzl, view);
            }
        });
        AbstractC48597uXh abstractC48597uXh5 = this.AEQbTJ;
        if (abstractC48597uXh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh5 = null;
        }
        abstractC48597uXh5.AhwBna.KWHzl(new View.OnClickListener() { // from class: o.weG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53095wey.copydefault(this.OLrzqt, view);
            }
        });
        AbstractC48597uXh abstractC48597uXh6 = this.AEQbTJ;
        if (abstractC48597uXh6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48597uXh2 = abstractC48597uXh6;
        }
        abstractC48597uXh2.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.weH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53095wey.AhwBna(this.OLrzqt, view);
            }
        });
    }

    public static final void valueOf(C53095wey c53095wey, android.view.View view) {
        AbstractC48597uXh abstractC48597uXh = c53095wey.AEQbTJ;
        if (abstractC48597uXh == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh = null;
        }
        Group group = abstractC48597uXh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = !(group.getVisibility() == 0);
        c53095wey.EZpvd(java.lang.Boolean.valueOf(z));
        SPUtils.put("sp_tag_visible_state_smart_iceberg", java.lang.Boolean.valueOf(z));
    }

    public static final void AYXKKw(C53095wey c53095wey, android.view.View view) {
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, c53095wey.AhwBna().EZpvd(), null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(c53095wey.new StateListAnimator());
        c47978uAlNewInstance$default.show(c53095wey.djBIcL(), "OrderFavoriteSelectFragment");
        C56028xvA.botClickTrack$default("orderFavorite", null, 2, null);
    }

    /* JADX INFO: renamed from: o.wey$StateListAnimator */
    public static final class StateListAnimator implements C47978uAl.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            java.lang.Object data = tradeMenuItemBean.getData();
            AbstractC48597uXh abstractC48597uXh = null;
            java.lang.String str = data instanceof java.lang.String ? (java.lang.String) data : null;
            if (str != null) {
                C53095wey c53095wey = C53095wey.this;
                AbstractC48597uXh abstractC48597uXh2 = c53095wey.AEQbTJ;
                if (abstractC48597uXh2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC48597uXh = abstractC48597uXh2;
                }
                abstractC48597uXh.OLrzqt.setActiveContent(tradeMenuItemBean.getTitle());
                c53095wey.AhwBna().AEQbTJ(C56390yDp.OLrzqt(str, tradeMenuItemBean.getTitle()));
                c53095wey.OLrzqt("preference");
            }
        }
    }

    public static final void copydefault(C53095wey c53095wey, android.view.View view) {
        C55887xsS c55887xsSFvQaOB;
        C55887xsS c55887xsSFvQaOB2;
        c53095wey.EZpvd("limit_price");
        C53089wes c53089wes = new C53089wes();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("bot_grid_req", c53095wey.AhwBna().KWHzl());
        SmartIcebergPresenter smartIcebergPresenterAYXKKw = c53095wey.AYXKKw();
        java.lang.String strDjBIcL = null;
        bundle.putString("bot_inst_id", (smartIcebergPresenterAYXKKw == null || (c55887xsSFvQaOB2 = smartIcebergPresenterAYXKKw.fvQaOB()) == null) ? null : c55887xsSFvQaOB2.gEmmrt());
        SmartIcebergPresenter smartIcebergPresenterAYXKKw2 = c53095wey.AYXKKw();
        if (smartIcebergPresenterAYXKKw2 != null && (c55887xsSFvQaOB = smartIcebergPresenterAYXKKw2.fvQaOB()) != null) {
            strDjBIcL = c55887xsSFvQaOB.djBIcL();
        }
        bundle.putString("bot_inst_type", strDjBIcL);
        c53089wes.setArguments(bundle);
        c53089wes.show(c53095wey.djBIcL(), "SmartIcebergLimitPriceDialog");
    }

    public static final void AhwBna(C53095wey c53095wey, android.view.View view) {
        C55887xsS c55887xsSFvQaOB;
        C55887xsS c55887xsSFvQaOB2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = c53095wey.AhwBna;
        if (activityResultLauncher != null) {
            android.content.Intent intent = new android.content.Intent(c53095wey.getContext(), (java.lang.Class<?>) ActivityC53079wei.class);
            intent.putExtra("bot_grid_req", c53095wey.AhwBna().KWHzl());
            intent.putExtra("bot_config", c53095wey.copydefault);
            SmartIcebergPresenter smartIcebergPresenterAYXKKw = c53095wey.AYXKKw();
            intent.putExtra("bot_inst_id", (smartIcebergPresenterAYXKKw == null || (c55887xsSFvQaOB2 = smartIcebergPresenterAYXKKw.fvQaOB()) == null) ? null : c55887xsSFvQaOB2.gEmmrt());
            SmartIcebergPresenter smartIcebergPresenterAYXKKw2 = c53095wey.AYXKKw();
            intent.putExtra("bot_inst_type", (smartIcebergPresenterAYXKKw2 == null || (c55887xsSFvQaOB = smartIcebergPresenterAYXKKw2.fvQaOB()) == null) ? null : c55887xsSFvQaOB.djBIcL());
            activityResultLauncher.launch(intent);
        }
        C56028xvA.botClickTrack$default("startCondition", null, 2, null);
    }

    public static /* synthetic */ void refreshVisibleState$default(C53095wey c53095wey, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        c53095wey.EZpvd(bool);
    }

    private final void EZpvd(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_smart_iceberg", false);
        AbstractC48597uXh abstractC48597uXh = this.AEQbTJ;
        AbstractC48597uXh abstractC48597uXh2 = null;
        if (abstractC48597uXh == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh = null;
        }
        Group group = abstractC48597uXh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        AbstractC48597uXh abstractC48597uXh3 = this.AEQbTJ;
        if (abstractC48597uXh3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48597uXh2 = abstractC48597uXh3;
        }
        abstractC48597uXh2.AEQbTJ.setImageResource(i);
    }

    private final void AkhnZx() {
        androidx.fragment.app.FragmentManager fragmentManagerDjBIcL = djBIcL();
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        fragmentManagerDjBIcL.setFragmentResultListener("limit_price_setting", (AppCompatActivity) context, new FragmentResultListener() { // from class: o.weJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53095wey.KWHzl(this.AEQbTJ, str, bundle);
            }
        });
        androidx.fragment.app.FragmentManager fragmentManagerDjBIcL2 = djBIcL();
        android.content.Context context2 = getContext();
        Intrinsics.copydefault(context2, "");
        fragmentManagerDjBIcL2.setFragmentResultListener("trigger_settings", (AppCompatActivity) context2, new FragmentResultListener() { // from class: o.weI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53095wey.copydefault(this.KWHzl, str, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: o.wey$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53095wey copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53095wey c53095wey) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c53095wey;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd("advanced_info");
                new C53084wen().show(this.copydefault.djBIcL(), "SmartIcebergExplainedDialog");
            }
        }
    }

    public static final void KWHzl(C53095wey c53095wey, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c53095wey.AhwBna().OLrzqt(bundle);
        c53095wey.AEQbTJ();
    }

    public static final void copydefault(C53095wey c53095wey, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c53095wey.AhwBna().copydefault(bundle);
        c53095wey.fetchVPNInfo();
        c53095wey.OLrzqt("start_trigger");
    }

    public final void AEQbTJ() {
        java.lang.String strCopydefault = AhwBna().copydefault(valueOf());
        AbstractC48597uXh abstractC48597uXh = this.AEQbTJ;
        if (abstractC48597uXh == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh = null;
        }
        C53573wnz c53573wnz = abstractC48597uXh.AhwBna;
        if (strCopydefault.length() == 0) {
            strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
        }
        c53573wnz.setActiveContent(strCopydefault);
    }

    private final void fetchVPNInfo() {
        AbstractC48597uXh abstractC48597uXh = this.AEQbTJ;
        if (abstractC48597uXh == null) {
            Intrinsics.gEmmrt("");
            abstractC48597uXh = null;
        }
        abstractC48597uXh.gEmmrt.setActiveContent(AhwBna().OLrzqt(valueOf()));
    }

    public final IceBergReq KWHzl() {
        return AhwBna().KWHzl();
    }

    public static /* synthetic */ void initAdvancedSetting$default(C53095wey c53095wey, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53095wey.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (z) {
            AhwBna().AEQbTJ();
            AbstractC48597uXh abstractC48597uXh = this.AEQbTJ;
            AbstractC48597uXh abstractC48597uXh2 = null;
            if (abstractC48597uXh == null) {
                Intrinsics.gEmmrt("");
                abstractC48597uXh = null;
            }
            abstractC48597uXh.OLrzqt.setActiveContent(AhwBna().OLrzqt());
            AbstractC48597uXh abstractC48597uXh3 = this.AEQbTJ;
            if (abstractC48597uXh3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48597uXh2 = abstractC48597uXh3;
            }
            abstractC48597uXh2.AhwBna.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
            fetchVPNInfo();
        }
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("IcebergBotPlaceOrder_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53095wey.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C56028xvA.OLrzqt("IcebergBotPlaceOrder_Full_Button_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str)));
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("IcebergBotPlaceOrder_AdvancedSetting_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.weE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53095wey.KWHzl(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, C53095wey c53095wey, EventParamsList eventParamsList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String indicator;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        C53096wez c53096wezAhwBna = c53095wey.AhwBna();
        java.lang.String aggressiveness = c53095wey.AhwBna().KWHzl().getAggressiveness();
        if (aggressiveness == null) {
            aggressiveness = "";
        }
        eventParamsList.put("preference", c53096wezAhwBna.KWHzl(aggressiveness), true);
        java.util.ArrayList<AdvancedTriggerSign> triggerParams = c53095wey.AhwBna().KWHzl().getTriggerParams();
        if (triggerParams != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(triggerParams)) != null && (indicator = advancedTriggerSign.getIndicator()) != null) {
            str2 = indicator;
        }
        eventParamsList.put("start_trigger", str2, true);
        return Unit.INSTANCE;
    }

    private final java.lang.String valueOf() {
        C55887xsS c55887xsSFvQaOB;
        DigitInfoBean digitInfoBeanIsConnected;
        java.lang.String symbol;
        SmartIcebergPresenter smartIcebergPresenterAYXKKw = AYXKKw();
        return (smartIcebergPresenterAYXKKw == null || (c55887xsSFvQaOB = smartIcebergPresenterAYXKKw.fvQaOB()) == null || (digitInfoBeanIsConnected = c55887xsSFvQaOB.isConnected()) == null || (symbol = digitInfoBeanIsConnected.getSymbol()) == null) ? "" : symbol;
    }
}
