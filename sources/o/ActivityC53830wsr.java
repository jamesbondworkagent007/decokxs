package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.di.LocalizeDIModule;
import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.strategy.BotOrderKlineActivity$loadTopPnlView$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.BotOrderKlinePresenter;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC52272wFg;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC48895ueM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC53830wsr extends AbstractActivityC53798wsL<AbstractC48299uMi, BotOrderKlinePresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wsH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC53830wsr.fIwbmz();
        }
    });
    public androidx.fragment.app.Fragment KWHzl;
    public C55887xsS OLrzqt;
    public long gEmmrt;
    public C49352umt valueOf;

    /* JADX INFO: renamed from: o.wsr$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.OLrzqt = c55887xsS;
    }

    /* JADX INFO: renamed from: o.wsr$StateListAnimator */
    public static final class StateListAnimator implements View.OnLayoutChangeListener {
        public final /* synthetic */ AppCompatTextView copydefault;

        public StateListAnimator(AppCompatTextView appCompatTextView) {
            this.copydefault = appCompatTextView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            if (this.copydefault.getPaint().measureText(this.copydefault.getText().toString()) > this.copydefault.getWidth()) {
                this.copydefault.setTextSize(10.0f);
                this.copydefault.setMaxLines(2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotOrderKlinePresenter EZpvd(ActivityC53830wsr activityC53830wsr) {
        return (BotOrderKlinePresenter) activityC53830wsr.gHZMYf();
    }

    public final C55887xsS AEQbTJ() {
        C55887xsS c55887xsS = this.OLrzqt;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final pTU fetchVPNInfo() {
        return (pTU) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pTU fIwbmz() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).gkJEwt();
    }

    /* JADX INFO: renamed from: o.wsr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, TacticsData tacticsData, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC53830wsr.class);
            intent.putExtra("bizType", str2);
            intent.putExtra("instId", str);
            intent.putExtra("tactics_state_data", tacticsData);
            intent.putExtra("source", str3);
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC53798wsL, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        values();
        fARcdN();
        AkhnZx();
        ejfBZ();
        C55867xrz.KWHzl.djBIcL(((BotOrderKlinePresenter) gHZMYf()).gEmmrt());
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC53798wsL, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AuCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        ((BotOrderKlinePresenter) gHZMYf()).AkhnZx();
        ((BotOrderKlinePresenter) gHZMYf()).fetchVPNInfo();
        this.gEmmrt = java.lang.System.currentTimeMillis();
        ((BotOrderKlinePresenter) gHZMYf()).AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        BotOrderKlinePresenter botOrderKlinePresenter = (BotOrderKlinePresenter) gHZMYf();
        java.lang.String stringExtra = getIntent().getStringExtra("instId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        botOrderKlinePresenter.OLrzqt(stringExtra);
        BotOrderKlinePresenter botOrderKlinePresenter2 = (BotOrderKlinePresenter) gHZMYf();
        java.lang.String stringExtra2 = getIntent().getStringExtra("bizType");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        botOrderKlinePresenter2.AEQbTJ(stringExtra2);
        BotOrderKlinePresenter botOrderKlinePresenter3 = (BotOrderKlinePresenter) gHZMYf();
        java.lang.String stringExtra3 = getIntent().getStringExtra("source");
        botOrderKlinePresenter3.KWHzl(stringExtra3 != null ? stringExtra3 : "");
        KWHzl(new C55887xsS(((BotOrderKlinePresenter) gHZMYf()).AEQbTJ(), ((BotOrderKlinePresenter) gHZMYf()).EZpvd()));
        if (Build.VERSION.SDK_INT >= 33) {
            ((BotOrderKlinePresenter) gHZMYf()).KWHzl((TacticsData) getIntent().getParcelableExtra("tactics_state_data", TacticsData.class));
            return;
        }
        BotOrderKlinePresenter botOrderKlinePresenter4 = (BotOrderKlinePresenter) gHZMYf();
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("tactics_state_data");
        botOrderKlinePresenter4.KWHzl(parcelableExtra instanceof TacticsData ? (TacticsData) parcelableExtra : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [174=5] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fARcdN() {
        java.lang.String orderType;
        java.lang.String strAYXKKw;
        OLrzqt(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, ((BotOrderKlinePresenter) gHZMYf()).EZpvd(), ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ(), false, false, 12, null));
        ((AbstractC48299uMi) sSMYrx()).AYXKKw.setVisibility(0);
        TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) gHZMYf()).valueOf();
        if (tacticsDataValueOf != null && (orderType = tacticsDataValueOf.getOrderType()) != null) {
            AppCompatTextView appCompatTextView = ((AbstractC48299uMi) sSMYrx()).copydefault;
            switch (orderType.hashCode()) {
                case -1831183611:
                    strAYXKKw = !orderType.equals("spot_dca") ? "" : C33070mpX.AYXKKw(C48033uCm.Fragment.dkJJWw);
                    break;
                case -1402017003:
                    if (orderType.equals("contract_dca")) {
                        strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fmdvVn);
                        break;
                    }
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid")) {
                        strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RidNCX);
                        break;
                    }
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                        strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OqHLSf);
                        break;
                    }
                    break;
            }
            appCompatTextView.setText(strAYXKKw);
            ((AbstractC48299uMi) sSMYrx()).valueOf.KWHzl(30L);
        }
        AhwBna();
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        androidx.fragment.app.Fragment fragmentAEQbTJ = oka != null ? oka.AEQbTJ(((BotOrderKlinePresenter) gHZMYf()).EZpvd(), ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ()) : null;
        this.KWHzl = fragmentAEQbTJ;
        if (fragmentAEQbTJ != null) {
            copydefault(fragmentAEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.wsr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC53830wsr AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TacticsData tacticsDataValueOf = ActivityC53830wsr.EZpvd(this.AEQbTJ).valueOf();
                java.lang.String str = "contract_grid";
                if (!Intrinsics.EZpvd((java.lang.Object) (tacticsDataValueOf != null ? tacticsDataValueOf.getOrderType() : null), (java.lang.Object) "contract_dca")) {
                    TacticsData tacticsDataValueOf2 = ActivityC53830wsr.EZpvd(this.AEQbTJ).valueOf();
                    if (!Intrinsics.EZpvd((java.lang.Object) (tacticsDataValueOf2 != null ? tacticsDataValueOf2.getOrderType() : null), (java.lang.Object) "contract_grid")) {
                        str = "grid";
                    }
                }
                xUV xuv = xUV.EZpvd;
                java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
                java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
                java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_type");
                ActivityC52122vzt.Companion.OLrzqt(this.AEQbTJ, new BotTradeData(str, str2, strEZpvd2 == null ? "" : strEZpvd2, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_order_on_kline", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid")) {
                    C55867xrz.KWHzl.AhwBna("spot_grid", ActivityC53830wsr.EZpvd(this.AEQbTJ).OLrzqt());
                } else {
                    C55867xrz.KWHzl.AhwBna("futures_grid", ActivityC53830wsr.EZpvd(this.AEQbTJ).OLrzqt());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC53830wsr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            oKA oka;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55867xrz.KWHzl.AhwBna("indicators", ActivityC53830wsr.EZpvd(this.copydefault).OLrzqt());
                androidx.fragment.app.Fragment fragment = this.copydefault.KWHzl;
                if (fragment == null || (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) == null) {
                    return;
                }
                oka.AEQbTJ(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC53830wsr AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC53830wsr EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC53830wsr;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(android.view.View view) {
            InterfaceC49425uoM interfaceC49425uoM;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54577xNn interfaceC54577xNn2;
            java.lang.String orderType;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TacticsData tacticsDataValueOf = ActivityC53830wsr.EZpvd(this.EZpvd).valueOf();
                if (tacticsDataValueOf != null && (orderType = tacticsDataValueOf.getOrderType()) != null) {
                    int iHashCode = orderType.hashCode();
                    if (iHashCode != -1831183611) {
                        if (iHashCode != -1402017003) {
                            if (iHashCode == 3181382 && orderType.equals("grid")) {
                                C55867xrz.KWHzl.AhwBna("spot", ActivityC53830wsr.EZpvd(this.EZpvd).OLrzqt());
                            }
                        } else if (orderType.equals("contract_dca")) {
                            C55867xrz.KWHzl.AhwBna("futures", ActivityC53830wsr.EZpvd(this.EZpvd).OLrzqt());
                        }
                    } else if (orderType.equals("spot_dca")) {
                    }
                }
                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if ((interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn2.KWHzl()) && ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd())) {
                    return;
                }
                this.EZpvd.fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ActivityC53830wsr AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC53830wsr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String orderType;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TacticsData tacticsDataValueOf = ActivityC53830wsr.EZpvd(this.copydefault).valueOf();
                java.lang.String str = (tacticsDataValueOf == null || (orderType = tacticsDataValueOf.getOrderType()) == null) ? "" : orderType;
                xUV xuv = xUV.EZpvd;
                java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
                java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
                java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_type");
                ActivityC52122vzt.Companion.OLrzqt(this.copydefault, new BotTradeData(str, str2, strEZpvd2 == null ? "" : strEZpvd2, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_order_on_kline", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                C55867xrz.KWHzl.AhwBna("create_bot", ActivityC53830wsr.EZpvd(this.copydefault).OLrzqt());
            }
        }
    }

    /* JADX INFO: renamed from: o.wsr$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC53830wsr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC53830wsr activityC53830wsr) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = activityC53830wsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String algoId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TacticsData tacticsDataValueOf = ActivityC53830wsr.EZpvd(this.OLrzqt).valueOf();
                if (tacticsDataValueOf == null || (algoId = tacticsDataValueOf.getAlgoId()) == null) {
                    return;
                }
                ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
                ActivityC53830wsr activityC53830wsr = this.OLrzqt;
                TacticsData tacticsDataValueOf2 = ActivityC53830wsr.EZpvd(activityC53830wsr).valueOf();
                java.lang.String orderType = tacticsDataValueOf2 != null ? tacticsDataValueOf2.getOrderType() : null;
                if (orderType == null) {
                    orderType = "";
                }
                application.KWHzl(activityC53830wsr, algoId, orderType, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : ActivityC53830wsr.EZpvd(this.OLrzqt).valueOf(), (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        android.widget.ImageView imageView = ((AbstractC48299uMi) sSMYrx()).gEmmrt;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        C33624mzv c33624mzv = ((AbstractC48299uMi) sSMYrx()).fJNWhG;
        c33624mzv.setOnClickListener(new Activity(c33624mzv, 1000L, this));
        C33624mzv c33624mzv2 = ((AbstractC48299uMi) sSMYrx()).djBIcL;
        c33624mzv2.setOnClickListener(new ActionBar(c33624mzv2, 1000L, this));
        C52794wYp c52794wYp = ((AbstractC48299uMi) sSMYrx()).DbNXlk;
        c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
        C33624mzv c33624mzv3 = ((AbstractC48299uMi) sSMYrx()).AhwBna;
        c33624mzv3.setOnClickListener(new Dialog(c33624mzv3, 1000L, this));
        android.widget.ImageView imageView2 = ((AbstractC48299uMi) sSMYrx()).AYXKKw;
        imageView2.setOnClickListener(new Fragment(imageView2, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        ((BotOrderKlinePresenter) gHZMYf()).djBIcL().observe(this, new PendingIntent(new Function1() { // from class: o.wsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.copydefault(this.copydefault, (C55804xqp) obj);
            }
        }));
        ((BotOrderKlinePresenter) gHZMYf()).copydefault().observe(this, new PendingIntent(new Function1() { // from class: o.wsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ((BotOrderKlinePresenter) gHZMYf()).KWHzl().observe(this, new PendingIntent(new Function1() { // from class: o.wsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.copydefault(this.OLrzqt, (GridPendingOrderData) obj);
            }
        }));
        ((BotOrderKlinePresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new PendingIntent(new Function1() { // from class: o.wsD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53830wsr activityC53830wsr, C55804xqp c55804xqp) {
        java.lang.String orderType;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) c55804xqp.copydefault();
        activityC53830wsr.gEmmrt = java.lang.System.currentTimeMillis();
        TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
        if (tacticsDataValueOf != null && (orderType = tacticsDataValueOf.getOrderType()) != null) {
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_dca") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "spot_dca")) {
                activityC53830wsr.OLrzqt(strategyDetailsResponse, (C55804xqp<StrategyDetailsResponse>) c55804xqp);
            } else {
                activityC53830wsr.EZpvd((C55804xqp<StrategyDetailsResponse>) c55804xqp);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53830wsr activityC53830wsr, java.util.List list) {
        java.lang.String orderType;
        java.lang.String last;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        BotOrderKlinePresenter botOrderKlinePresenter = (BotOrderKlinePresenter) activityC53830wsr.gHZMYf();
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tickersData != null && (last = tickersData.getLast()) != null) {
            str = last;
        }
        kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd = botOrderKlinePresenter.EZpvd(str);
        ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).AhwBna().postValue(pairEZpvd);
        TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
        if (tacticsDataValueOf != null && (orderType = tacticsDataValueOf.getOrderType()) != null && (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid"))) {
            ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).copydefault(pairEZpvd.getFirst());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53830wsr activityC53830wsr, GridPendingOrderData gridPendingOrderData) {
        java.util.ArrayList arrayList;
        java.lang.String orderType;
        java.lang.String liqPx;
        DcaTriggerParam dcaTriggerParam;
        java.util.List<DcaTriggerParam> triggerParams;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(gridPendingOrderData, "");
        java.util.List<GridPendingItemData> buyList = gridPendingOrderData.getBuyList();
        java.util.ArrayList<BotOrderItem> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(buyList, 10));
        for (GridPendingItemData gridPendingItemData : buyList) {
            BotOrderItem botOrderItem = new BotOrderItem();
            botOrderItem.setPrice(gridPendingItemData.getTitle());
            java.lang.String amount = gridPendingItemData.getAmount();
            if (amount == null) {
                amount = "";
            }
            botOrderItem.setAmount(amount);
            arrayList2.add(botOrderItem);
        }
        java.util.List<GridPendingItemData> sellList = gridPendingOrderData.getSellList();
        java.util.ArrayList<BotOrderItem> arrayList3 = new java.util.ArrayList<>(C56403yEb.AYXKKw(sellList, 10));
        for (GridPendingItemData gridPendingItemData2 : sellList) {
            BotOrderItem botOrderItem2 = new BotOrderItem();
            botOrderItem2.setPrice(gridPendingItemData2.getTitle());
            java.lang.String amount2 = gridPendingItemData2.getAmount();
            if (amount2 == null) {
                amount2 = "";
            }
            botOrderItem2.setAmount(amount2);
            arrayList3.add(botOrderItem2);
        }
        androidx.fragment.app.Fragment fragment = activityC53830wsr.KWHzl;
        if (fragment != null) {
            TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
            if (tacticsDataValueOf == null || (triggerParams = tacticsDataValueOf.getTriggerParams()) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : triggerParams) {
                    DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (java.lang.Object) "stop")) {
                        arrayList.add(obj);
                    }
                }
            }
            oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka != null) {
                IBotOrdersDataBean iBotOrdersDataBean = new IBotOrdersDataBean(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
                TacticsData tacticsDataValueOf2 = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
                if (tacticsDataValueOf2 == null || (orderType = tacticsDataValueOf2.getOrderType()) == null) {
                    orderType = "";
                }
                iBotOrdersDataBean.setType(orderType);
                iBotOrdersDataBean.setBuyList(arrayList2);
                iBotOrdersDataBean.setSellList(arrayList3);
                TacticsData tacticsDataValueOf3 = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
                java.lang.String tpTriggerPx = tacticsDataValueOf3 != null ? tacticsDataValueOf3.getTpTriggerPx() : null;
                if (tpTriggerPx == null) {
                    tpTriggerPx = "";
                }
                iBotOrdersDataBean.setTpPrice(tpTriggerPx);
                TacticsData tacticsDataValueOf4 = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
                java.lang.String slTriggerPx = tacticsDataValueOf4 != null ? tacticsDataValueOf4.getSlTriggerPx() : null;
                if (slTriggerPx == null) {
                    slTriggerPx = "";
                }
                iBotOrdersDataBean.setSlPrice(slTriggerPx);
                iBotOrdersDataBean.setStopTriggerPrice((arrayList == null || arrayList.size() <= 0) ? "" : C33129mqd.gEmmrt((arrayList == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? null : dcaTriggerParam.getTriggerPx()));
                TacticsData tacticsDataValueOf5 = ((BotOrderKlinePresenter) activityC53830wsr.gHZMYf()).valueOf();
                if (tacticsDataValueOf5 != null && (liqPx = tacticsDataValueOf5.getLiqPx()) != null) {
                    str = liqPx;
                }
                iBotOrdersDataBean.setLiqPrice(str);
                Unit unit = Unit.INSTANCE;
                oka.AEQbTJ(fragment, iBotOrdersDataBean);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53830wsr activityC53830wsr, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            activityC53830wsr.showLoading();
        } else {
            activityC53830wsr.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C55804xqp<StrategyDetailsResponse> c55804xqp) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotOrderKlineActivity$loadTopPnlView$1(this, c55804xqp, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(StrategyDetailsResponse strategyDetailsResponse, C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str;
        BigDecimal bigDecimalEZpvd;
        java.lang.String orderType;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String liqPx;
        java.lang.String str2;
        java.lang.String str3;
        ((BotOrderKlinePresenter) gHZMYf()).KWHzl(strategyDetailsResponse);
        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
        if (triggerParams != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : triggerParams) {
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) obj).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.List<DcaTriggerParam> triggerParams2 = strategyDetailsResponse.getTriggerParams();
        if (triggerParams2 != null) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : triggerParams2) {
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) obj2).getTriggerAction(), (java.lang.Object) "stop")) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (strategyDetailsResponse.getInitPx().length() > 0) {
            bigDecimalEZpvd = C33129mqd.EZpvd(strategyDetailsResponse.getInitPx());
        } else {
            if (arrayList != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((DcaTriggerParam) it.next()).getTriggerPx());
                }
                str = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList3);
            } else {
                str = null;
            }
            bigDecimalEZpvd = C33129mqd.EZpvd(str);
        }
        BigDecimal bigDecimal = bigDecimalEZpvd;
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        java.util.List<DcaPreviewData> listCopydefault = C56045xvR.KWHzl.copydefault(Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDirection(), (java.lang.Object) "short"), bigDecimal, C33129mqd.EZpvd(strategyDetailsResponse.getInitOrdAmt()), C33129mqd.EZpvd(strategyDetailsResponse.getSafetyOrdAmt()), C33129mqd.EZpvd(strategyDetailsResponse.getPxSteps()), C33129mqd.AhwBna(strategyDetailsResponse.getMaxSafetyOrds()), C33129mqd.EZpvd(strategyDetailsResponse.getTpPct()), C33129mqd.EZpvd(strategyDetailsResponse.getPxStepsMult()), C33129mqd.EZpvd(strategyDetailsResponse.getVolMult()));
        int iAhwBna = C33129mqd.AhwBna(strategyDetailsResponse.getFillSafetyOrds()) - C33129mqd.AhwBna(strategyDetailsResponse.getFillManualAddOrds());
        if (listCopydefault.size() - iAhwBna > 0) {
            java.util.ArrayList<BotOrderItem> arrayList4 = new java.util.ArrayList<>();
            java.util.ArrayList<BotOrderItem> arrayList5 = new java.util.ArrayList<>();
            int i = iAhwBna > 0 ? iAhwBna + 1 : 1;
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getAlgoOrdType(), (java.lang.Object) "contract_dca")) {
                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getDirection(), (java.lang.Object) "long")) {
                    java.util.List<DcaPreviewData> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listCopydefault, i);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
                    for (DcaPreviewData dcaPreviewData : listDjBIcL) {
                        BotOrderItem botOrderItem = new BotOrderItem();
                        botOrderItem.setPrice(C33129mqd.gEmmrt(dcaPreviewData.EZpvd()));
                        botOrderItem.setAmount(C33129mqd.gEmmrt(dcaPreviewData.valueOf()));
                        arrayList6.add(botOrderItem);
                    }
                    arrayList4.addAll(arrayList6);
                } else {
                    java.util.List<DcaPreviewData> listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listCopydefault, i);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL2, 10));
                    for (DcaPreviewData dcaPreviewData2 : listDjBIcL2) {
                        BotOrderItem botOrderItem2 = new BotOrderItem();
                        botOrderItem2.setPrice(C33129mqd.gEmmrt(dcaPreviewData2.EZpvd()));
                        botOrderItem2.setAmount(C33129mqd.gEmmrt(dcaPreviewData2.valueOf()));
                        arrayList7.add(botOrderItem2);
                    }
                    arrayList5.addAll(arrayList7);
                }
            } else {
                java.util.List<DcaPreviewData> listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listCopydefault, i);
                java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL3, 10));
                for (DcaPreviewData dcaPreviewData3 : listDjBIcL3) {
                    BotOrderItem botOrderItem3 = new BotOrderItem();
                    botOrderItem3.setPrice(C33129mqd.gEmmrt(dcaPreviewData3.EZpvd()));
                    botOrderItem3.setAmount(C33129mqd.gEmmrt(dcaPreviewData3.valueOf()));
                    arrayList8.add(botOrderItem3);
                }
                arrayList4.addAll(arrayList8);
            }
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null) {
                IBotOrdersDataBean iBotOrdersDataBean = new IBotOrdersDataBean(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
                TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) gHZMYf()).valueOf();
                java.lang.String str4 = "";
                if (tacticsDataValueOf == null || (orderType = tacticsDataValueOf.getOrderType()) == null) {
                    orderType = "";
                }
                iBotOrdersDataBean.setType(orderType);
                iBotOrdersDataBean.setBuyList(arrayList4);
                iBotOrdersDataBean.setSellList(arrayList5);
                iBotOrdersDataBean.setTpPrice(strategyDetailsResponse.getTpPx());
                iBotOrdersDataBean.setSlPrice(strategyDetailsResponse.getSlPx());
                if (arrayList == null || arrayList.size() <= 0 || strategyDetailsResponse.getInitPx().length() != 0) {
                    strGEmmrt = "";
                } else {
                    if (arrayList != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList9.add(((DcaTriggerParam) it2.next()).getTriggerPx());
                        }
                        str3 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList9);
                    } else {
                        str3 = null;
                    }
                    strGEmmrt = C33129mqd.gEmmrt(str3);
                }
                iBotOrdersDataBean.setStartTriggerPrice(strGEmmrt);
                if (arrayList2 == null || arrayList2.size() <= 0) {
                    strGEmmrt2 = "";
                } else {
                    if (arrayList2 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                        java.util.Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList10.add(((DcaTriggerParam) it3.next()).getTriggerPx());
                        }
                        str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList10);
                    } else {
                        str2 = null;
                    }
                    strGEmmrt2 = C33129mqd.gEmmrt(str2);
                }
                iBotOrdersDataBean.setStopTriggerPrice(strGEmmrt2);
                if (strategyDetailsResponse.getInitPx().length() == 0) {
                    BotOrderItem botOrderItem4 = new BotOrderItem();
                    botOrderItem4.setPrice(C33129mqd.gEmmrt(((DcaPreviewData) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault)).EZpvd()));
                    botOrderItem4.setAmount(C33129mqd.gEmmrt(((DcaPreviewData) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault)).valueOf()));
                    iBotOrdersDataBean.setInitialOrder(botOrderItem4);
                }
                TacticsData tacticsDataValueOf2 = ((BotOrderKlinePresenter) gHZMYf()).valueOf();
                if (tacticsDataValueOf2 != null && (liqPx = tacticsDataValueOf2.getLiqPx()) != null) {
                    str4 = liqPx;
                }
                iBotOrdersDataBean.setLiqPrice(str4);
                iBotOrdersDataBean.setFillSafetyOrds(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna)));
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    oka.AEQbTJ(fragment, iBotOrdersDataBean);
                }
                EZpvd(c55804xqp);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        java.lang.String strEZpvd = ((BotOrderKlinePresenter) gHZMYf()).EZpvd();
        int iCopydefault = C54799xVt.AEQbTJ.copydefault(((BotOrderKlinePresenter) gHZMYf()).AEQbTJ());
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this, ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt() + "?bizType=" + iCopydefault + "&instId=" + strEZpvd + "&fromPageSession=&fromPageSubSource=", null, new Function1() { // from class: o.wsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        android.graphics.drawable.Drawable drawableKWHzl;
        TacticsData tacticsDataValueOf = ((BotOrderKlinePresenter) gHZMYf()).valueOf();
        if (tacticsDataValueOf != null) {
            C33624mzv c33624mzv = ((AbstractC48299uMi) sSMYrx()).djBIcL;
            if (Intrinsics.EZpvd((java.lang.Object) tacticsDataValueOf.getOrderType(), (java.lang.Object) "contract_dca") || Intrinsics.EZpvd((java.lang.Object) tacticsDataValueOf.getOrderType(), (java.lang.Object) "contract_grid")) {
                drawableKWHzl = KWHzl(C52761wXj.TaskDescription.svY);
            } else {
                drawableKWHzl = KWHzl(C52761wXj.TaskDescription.QYvkLl);
            }
            c33624mzv.setCompoundDrawables(null, drawableKWHzl, null, null);
            c33624mzv.setText(C48033uCm.Fragment.hBpjJd);
            c33624mzv.setVisibility(0);
            java.lang.String orderType = tacticsDataValueOf.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (!orderType.equals("spot_dca")) {
                        return;
                    }
                    C33624mzv c33624mzv2 = ((AbstractC48299uMi) sSMYrx()).AhwBna;
                    c33624mzv2.setCompoundDrawables(null, KWHzl(C52761wXj.TaskDescription.fdazkH), null, null);
                    c33624mzv2.setText(C48033uCm.Fragment.dHguZz);
                    c33624mzv2.setVisibility(0);
                    Intrinsics.copydefault(c33624mzv2);
                    return;
                case -1402017003:
                    if (!orderType.equals("contract_dca")) {
                        return;
                    }
                    break;
                case -512749997:
                    if (!orderType.equals("contract_grid")) {
                        return;
                    }
                    break;
                case 3181382:
                    if (!orderType.equals("grid")) {
                        return;
                    }
                    C33624mzv c33624mzv22 = ((AbstractC48299uMi) sSMYrx()).AhwBna;
                    c33624mzv22.setCompoundDrawables(null, KWHzl(C52761wXj.TaskDescription.fdazkH), null, null);
                    c33624mzv22.setText(C48033uCm.Fragment.dHguZz);
                    c33624mzv22.setVisibility(0);
                    Intrinsics.copydefault(c33624mzv22);
                    return;
                default:
                    return;
            }
            C33624mzv c33624mzv3 = ((AbstractC48299uMi) sSMYrx()).AhwBna;
            c33624mzv3.setCompoundDrawables(null, KWHzl(C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja), null, null);
            c33624mzv3.setText(C48033uCm.Fragment.gwTjWJ);
            c33624mzv3.setVisibility(0);
            Intrinsics.copydefault(c33624mzv3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(java.lang.String str) {
        ((AbstractC48299uMi) sSMYrx()).fetchVPNInfo.setTextSize(EZpvd(str.length()));
        ((AbstractC48299uMi) sSMYrx()).fetchVPNInfo.setText(str);
        EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(BenefitDetails benefitDetails, java.lang.String str) {
        ((AbstractC48299uMi) sSMYrx()).valueOf.copydefault();
        ((AbstractC48299uMi) sSMYrx()).valueOf.setVisibility(8);
        java.lang.String strCopydefault = C56068xvo.copydefault.copydefault(benefitDetails.getPnlRatio(), true);
        java.lang.String str2 = benefitDetails.getTotalPnl() + " " + str + " (" + strCopydefault + ")";
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OeawrH);
        if (C38303pTu.KWHzl(fetchVPNInfo().OLrzqt().getLocale())) {
            if (C59449zhJ.endsWith$default(strAYXKKw, "：", false, 2, null)) {
                strAYXKKw = StringsKt__StringsKt.EZpvd(strAYXKKw, (java.lang.CharSequence) "：");
            }
            strAYXKKw = strAYXKKw + " :";
        }
        java.lang.String str3 = strAYXKKw + " " + str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str3, str2, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C56033xvF.OLrzqt((java.lang.Object) benefitDetails.getPnlRatio())), iIndexOf$default, str2.length() + iIndexOf$default, 33);
        }
        ((AbstractC48299uMi) sSMYrx()).KWHzl.setText(spannableString);
        LinearLayoutCompat linearLayoutCompat = ((AbstractC48299uMi) sSMYrx()).ejfBZ;
        linearLayoutCompat.setOnClickListener(new LoaderManager(linearLayoutCompat, 1000L, this));
    }

    public final void copydefault(androidx.fragment.app.Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C48033uCm.Application.unsubscribe, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    public final float EZpvd(int i) {
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(i), 14)) {
            return 18.0f;
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 14) && C33129mqd.valueOf(java.lang.Integer.valueOf(i), 20)) {
            return 16.0f;
        }
        return C33129mqd.valueOf(java.lang.Integer.valueOf(i), 26) & C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 20) ? 14.0f : 12.0f;
    }

    public final android.graphics.drawable.Drawable KWHzl(int i) {
        android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(getResources(), i, getTheme());
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        return drawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        AppCompatTextView appCompatTextView = ((AbstractC48299uMi) sSMYrx()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        BizInstrument bizInstrumentAhwBna = AEQbTJ().AhwBna();
        if (bizInstrumentAhwBna == null || !bizInstrumentAhwBna.isPreMarketPair()) {
            return;
        }
        if (!ViewCompat.isLaidOut(appCompatTextView) || appCompatTextView.isLayoutRequested()) {
            appCompatTextView.addOnLayoutChangeListener(new StateListAnimator(appCompatTextView));
        } else if (appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()) > appCompatTextView.getWidth()) {
            appCompatTextView.setTextSize(10.0f);
            appCompatTextView.setMaxLines(2);
        }
    }

    private final void isConnected() {
        android.view.View viewInflate = android.view.View.inflate(this, C48033uCm.Activity.fFgQHt, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.valueOf = (C49352umt) viewInflate.findViewById(C48033uCm.Application.addPreRequisiteCollector);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        InterfaceC54577xNn interfaceC54577xNn;
        isConnected();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            C49352umt c49352umt = this.valueOf;
            if (c49352umt != null) {
                InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.wss
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC53830wsr.gEmmrt(this.KWHzl);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        java.lang.String str = "okx://pro/trade_kline?id=" + ((BotOrderKlinePresenter) gHZMYf()).EZpvd() + "&type=" + ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ() + "&source=share";
        java.lang.String strOLrzqt = OLrzqt();
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
        C49352umt c49352umt2 = this.valueOf;
        if (c49352umt2 != null) {
            c49352umt2.setQRCode(interfaceC48893ueK.DTwDnp().djBIcL());
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC48893ueK.AEQbTJ(strOLrzqt, new C48891ueI("BOT_ORDER_KLINE_SHARE_FROM", str, false, null, null, 28, null)), this);
        final Function1 function1 = new Function1() { // from class: o.wsv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.copydefault(this.AEQbTJ, (C48887ueE) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.wsx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC53830wsr.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.wsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.AYXKKw((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.wst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC53830wsr.copydefault(function12, obj);
            }
        });
    }

    public static final Unit gEmmrt(final ActivityC53830wsr activityC53830wsr) {
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(activityC53830wsr.getWindow().getDecorView(), activityC53830wsr.valueOf);
        if (bitmapAEQbTJ != null) {
            ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, activityC53830wsr, new Function1() { // from class: o.wsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC53830wsr.AEQbTJ((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.wsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC53830wsr.copydefault(this.OLrzqt, (java.io.File) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC53830wsr activityC53830wsr, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC53830wsr, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.wsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.OLrzqt((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("BOT_ORDER_KLINE_SHARE_FROM");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final ActivityC53830wsr activityC53830wsr, final C48887ueE c48887ueE) {
        pUU.EZpvd("WMYYYY", " result.shortLink = " + c48887ueE.OLrzqt());
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(activityC53830wsr.getWindow().getDecorView(), activityC53830wsr.valueOf);
        if (bitmapAEQbTJ != null) {
            ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, activityC53830wsr, new Function1() { // from class: o.wsp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC53830wsr.EZpvd((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.wsB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC53830wsr.AEQbTJ(this.copydefault, c48887ueE, (java.io.File) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC53830wsr activityC53830wsr, final C48887ueE c48887ueE, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC53830wsr, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.wso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53830wsr.EZpvd(c48887ueE, (ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C48887ueE c48887ueE, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("BOT_ORDER_KLINE_SHARE_FROM");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String OLrzqt() {
        if (Intrinsics.EZpvd((java.lang.Object) ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ(), (java.lang.Object) "FUTURES")) {
            java.lang.String strEZpvd = ((BotOrderKlinePresenter) gHZMYf()).EZpvd();
            BizInstrument bizInstrumentAhwBna = AEQbTJ().AhwBna();
            FutureInstrument futureInstrument = bizInstrumentAhwBna instanceof FutureInstrument ? (FutureInstrument) bizInstrumentAhwBna : null;
            if (futureInstrument == null) {
                return "";
            }
            java.lang.String alias = futureInstrument.getAlias();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) alias)) {
                switch (alias.hashCode()) {
                    case -927019468:
                        if (alias.equals("next_month")) {
                            alias = "monthly";
                        }
                        break;
                    case -560300811:
                        if (alias.equals("this_week")) {
                            alias = "weekly";
                        }
                        break;
                    case -198384225:
                        if (alias.equals("this_month")) {
                            alias = "bimonthly";
                        }
                        break;
                    case 651403948:
                        if (alias.equals("quarter")) {
                            alias = "quarterly";
                        }
                        break;
                    case 1217310144:
                        if (alias.equals("next_week")) {
                            alias = "biweekly";
                        }
                        break;
                    case 1902260576:
                        if (alias.equals("next_quarter")) {
                            alias = "biquarterly";
                        }
                        break;
                }
                java.util.List listSplit$default = strEZpvd != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strEZpvd, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                if (listSplit$default != null && listSplit$default.size() == 3) {
                    java.lang.String str = listSplit$default.get(0) + "-" + listSplit$default.get(1) + "-" + alias;
                    java.lang.String strAEQbTJ = ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String lowerCase = strAEQbTJ.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    return "https://www.okx.com/trade-" + lowerCase + "/" + lowerCase2;
                }
            }
            return "";
        }
        java.lang.String strAEQbTJ2 = ((BotOrderKlinePresenter) gHZMYf()).AEQbTJ();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String lowerCase3 = strAEQbTJ2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        java.lang.String lowerCase4 = ((BotOrderKlinePresenter) gHZMYf()).EZpvd().toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        return "https://www.okx.com/trade-" + lowerCase3 + "/" + lowerCase4;
    }

    @Override // o.AbstractActivityC53798wsL, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC53798wsL, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC53798wsL, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
