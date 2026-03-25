package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadHistoryStrategyPresenter;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vuf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC51843vuf extends AbstractActivityC48163uHh<AbstractC48293uMc, BotLeadHistoryStrategyPresenter> {
    public final C43316rmw EZpvd = new C43316rmw();
    public boolean KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vuf$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.vuf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vuf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C49950uyH.startTradeActivity$default(context, new android.content.Intent(context, (java.lang.Class<?>) ActivityC51843vuf.class), null, 2, null);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        OLrzqt();
        EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        showLoading();
        ((BotLeadHistoryStrategyPresenter) gHZMYf()).AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        this.EZpvd.register(BotLeadStrateShowData.class, new C51900vvj(new Function1() { // from class: o.vuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51843vuf.copydefault(this.EZpvd, (BotLeadStrateShowData) obj);
            }
        }));
        this.EZpvd.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51843vuf.KWHzl(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        ((AbstractC48293uMc) sSMYrx()).KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.vuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51843vuf.copydefault(this.EZpvd, view);
            }
        });
        RecyclerView recyclerView = ((AbstractC48293uMc) sSMYrx()).AEQbTJ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.EZpvd);
        ((AbstractC48293uMc) sSMYrx()).AYXKKw.OLrzqt(new InterfaceC57903yrG() { // from class: o.vul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51843vuf.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
        ((AbstractC48293uMc) sSMYrx()).AYXKKw.KWHzl(new InterfaceC57900yrD() { // from class: o.vur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51843vuf.KWHzl(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final Unit copydefault(ActivityC51843vuf activityC51843vuf, BotLeadStrateShowData botLeadStrateShowData) {
        Intrinsics.checkNotNullParameter(botLeadStrateShowData, "");
        ActivityC51164vhp.Companion.EZpvd(activityC51843vuf, botLeadStrateShowData);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC51843vuf activityC51843vuf, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData.getEmptyType() == 6) {
            ActivityC52122vzt.Companion.OLrzqt(activityC51843vuf, new BotTradeData("grid", "BTC-USDT", "SPOT", (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_lead_history", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC51843vuf activityC51843vuf, android.view.View view) {
        activityC51843vuf.KWHzl = false;
        activityC51843vuf.EZpvd();
        C51968vwy c51968vwy = ((AbstractC48293uMc) activityC51843vuf.sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c51968vwy, "");
        c51968vwy.setVisibility(8);
        C33546myW c33546myW = ((AbstractC48293uMc) activityC51843vuf.sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC51843vuf activityC51843vuf, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((AbstractC48293uMc) activityC51843vuf.sSMYrx()).AYXKKw.AhwBna(true);
        ((BotLeadHistoryStrategyPresenter) activityC51843vuf.gHZMYf()).AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC51843vuf activityC51843vuf, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((BotLeadHistoryStrategyPresenter) activityC51843vuf.gHZMYf()).KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        ((BotLeadHistoryStrategyPresenter) gHZMYf()).copydefault().observe(this, new ActionBar(new Function1() { // from class: o.vue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51843vuf.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((BotLeadHistoryStrategyPresenter) gHZMYf()).AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.vug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51843vuf.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        ((BotLeadHistoryStrategyPresenter) gHZMYf()).OLrzqt().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.vun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51843vuf.EZpvd(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51843vuf activityC51843vuf, boolean z) {
        ((AbstractC48293uMc) activityC51843vuf.sSMYrx()).AYXKKw.AhwBna(z);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC51843vuf activityC51843vuf, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC51843vuf.KWHzl(list);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC51843vuf, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC51843vuf activityC51843vuf, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51843vuf.KWHzl();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC51843vuf, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<BotLeadStrateShowData> list) {
        if (!this.KWHzl) {
            this.KWHzl = true;
            dismissLoading();
        }
        AEQbTJ();
        copydefault(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((AbstractC48293uMc) sSMYrx()).AYXKKw.AEQbTJ();
        ((AbstractC48293uMc) sSMYrx()).AYXKKw.valueOf();
    }

    public final void copydefault(java.util.List<BotLeadStrateShowData> list) {
        C49952uyJ.updateDataOrEmpty$default(this.EZpvd, list, C33070mpX.AYXKKw(C55688xof.Application.onSetRating), 96, C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0), null, false, 48, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        if (!this.KWHzl) {
            this.KWHzl = true;
            dismissLoading();
        }
        AEQbTJ();
        C51968vwy.setNetworkError$default(((AbstractC48293uMc) sSMYrx()).KWHzl, 0, 0, 3, null);
        ((AbstractC48293uMc) sSMYrx()).AYXKKw.setVisibility(8);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
