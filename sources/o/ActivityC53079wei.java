package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergTriggerCondPresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: renamed from: o.wei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC53079wei extends AbstractActivityC48163uHh<AbstractC48315uMy, SmartIcebergTriggerCondPresenter> {
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.Integer> KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt(GridStartTriggerType.INSTANT.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.zNQIcI)), C56390yDp.OLrzqt(GridStartTriggerType.PRICE.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.MediaSessionCompatResultReceiverWrapper1)), C56390yDp.OLrzqt(GridStartTriggerType.RSI_14.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl)));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.AkhnZx;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SmartIcebergTriggerCondPresenter AEQbTJ(ActivityC53079wei activityC53079wei) {
        return (SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48315uMy OLrzqt(ActivityC53079wei activityC53079wei) {
        return (AbstractC48315uMy) activityC53079wei.sSMYrx();
    }

    public ActivityC53079wei() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.weh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC53079wei.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        valueOf();
        AEQbTJ();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        SmartIcebergTriggerCondPresenter smartIcebergTriggerCondPresenter = (SmartIcebergTriggerCondPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        smartIcebergTriggerCondPresenter.OLrzqt(intent != null ? intent.getExtras() : null);
    }

    private final void valueOf() {
        copydefault();
        AhwBna();
        gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        AdvancedTriggerSign advancedTriggerSignCopydefault = ((SmartIcebergTriggerCondPresenter) gHZMYf()).copydefault();
        ((AbstractC48315uMy) sSMYrx()).gEmmrt.setOnSelectedChanged(new yHO() { // from class: o.wel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC53079wei.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        C52701wVd c52701wVd = ((AbstractC48315uMy) sSMYrx()).gEmmrt;
        java.lang.Integer num = this.KWHzl.get(advancedTriggerSignCopydefault != null ? advancedTriggerSignCopydefault.getIndicator() : null);
        C52701wVd.setSelectedId$default(c52701wVd, num != null ? num.intValue() : C48033uCm.Application.zNQIcI, false, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC53079wei activityC53079wei, int i, boolean z, boolean z2) {
        if (z) {
            java.util.Map<java.lang.String, java.lang.Integer> map = activityC53079wei.KWHzl;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(linkedHashMap.keySet());
            AdvancedTriggerSign advancedTriggerSignCopydefault = ((SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf()).copydefault();
            if (advancedTriggerSignCopydefault != null) {
                advancedTriggerSignCopydefault.setIndicator(str);
            }
            if (z2) {
                ((SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf()).AEQbTJ(str, C49861uwY.Companion.copydefault().get());
            }
            activityC53079wei.djBIcL();
            activityC53079wei.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        C52794wYp c52794wYp = ((AbstractC48315uMy) sSMYrx()).OLrzqt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        final C47988uAv c47988uAv = ((AbstractC48315uMy) sSMYrx()).AYXKKw;
        DigitInfoBean digitInfoBeanIsConnected = ((SmartIcebergTriggerCondPresenter) gHZMYf()).OLrzqt().isConnected();
        c47988uAv.setInputUnit(digitInfoBeanIsConnected.getSymbol());
        c47988uAv.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.wej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC53079wei.copydefault(this.EZpvd, c47988uAv);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC53079wei activityC53079wei, C47988uAv c47988uAv) {
        AdvancedTriggerSign advancedTriggerSignCopydefault = ((SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf()).copydefault();
        if (advancedTriggerSignCopydefault != null) {
            advancedTriggerSignCopydefault.setTriggerPx(c47988uAv.AkhnZx());
        }
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), ((SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf()).OLrzqt().gEmmrt(), ((SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf()).OLrzqt().djBIcL()));
            if (!c47988uAv.getFieldNames()) {
                activityC53079wei.OLrzqt();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        java.lang.String triggerPx;
        AdvancedTriggerSign advancedTriggerSignCopydefault = ((SmartIcebergTriggerCondPresenter) gHZMYf()).copydefault();
        C47988uAv c47988uAv = ((AbstractC48315uMy) sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSignCopydefault != null ? advancedTriggerSignCopydefault.getIndicator() : null), (java.lang.Object) GridStartTriggerType.PRICE.getMode()) ? 0 : 8);
        C47988uAv c47988uAv2 = ((AbstractC48315uMy) sSMYrx()).AYXKKw;
        AdvancedTriggerSign advancedTriggerSignCopydefault2 = ((SmartIcebergTriggerCondPresenter) gHZMYf()).copydefault();
        C47988uAv.setInputContent$default(c47988uAv2, (advancedTriggerSignCopydefault2 == null || (triggerPx = advancedTriggerSignCopydefault2.getTriggerPx()) == null) ? "" : triggerPx, false, false, 6, null);
    }

    /* JADX INFO: renamed from: o.wei$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("bot_type", "smart_iceberg", true);
            eventParamsList.put("condition_type", TtmlNode.START, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        AppCompatTextView appCompatTextView = ((AbstractC48315uMy) sSMYrx()).valueOf.OLrzqt;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.lang.String timePeriod;
        java.lang.String oversoldThold;
        java.lang.String timeframe;
        AdvancedTriggerSign advancedTriggerSignCopydefault = ((SmartIcebergTriggerCondPresenter) gHZMYf()).copydefault();
        android.view.View root = ((AbstractC48315uMy) sSMYrx()).valueOf.getRoot();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSignCopydefault != null ? advancedTriggerSignCopydefault.getIndicator() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode()) ? 0 : 8);
        uWI uwi = ((AbstractC48315uMy) sSMYrx()).valueOf;
        AppCompatTextView appCompatTextView = uwi.EZpvd;
        int i = C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0;
        if (advancedTriggerSignCopydefault == null || (timePeriod = advancedTriggerSignCopydefault.getTimePeriod()) == null) {
            timePeriod = "";
        }
        appCompatTextView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, timePeriod))));
        uwi.AYXKKw.setText(TriggerCond.Companion.KWHzl(advancedTriggerSignCopydefault != null ? advancedTriggerSignCopydefault.getTriggerCond() : null));
        AppCompatTextView appCompatTextView2 = uwi.valueOf;
        xMR xmr = xMR.copydefault;
        if (advancedTriggerSignCopydefault == null || (oversoldThold = advancedTriggerSignCopydefault.getOversoldThold()) == null) {
            oversoldThold = "";
        }
        appCompatTextView2.setText(xmr.copydefault(oversoldThold));
        AppCompatTextView appCompatTextView3 = uwi.AEQbTJ;
        TimeFrame.Application application = TimeFrame.Companion;
        if (advancedTriggerSignCopydefault != null && (timeframe = advancedTriggerSignCopydefault.getTimeframe()) != null) {
            str = timeframe;
        }
        appCompatTextView3.setText(application.copydefault(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OLrzqt() {
        java.lang.String strKWHzl = ((SmartIcebergTriggerCondPresenter) gHZMYf()).KWHzl();
        if (strKWHzl.length() == 0) {
            ((AbstractC48315uMy) sSMYrx()).AYXKKw.copydefault();
        } else {
            ((AbstractC48315uMy) sSMYrx()).AYXKKw.setInputErrorMsg(strKWHzl);
        }
        return strKWHzl.length() == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC53079wei activityC53079wei, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            SmartIcebergTriggerCondPresenter smartIcebergTriggerCondPresenter = (SmartIcebergTriggerCondPresenter) activityC53079wei.gHZMYf();
            android.content.Intent data = activityResult.getData();
            smartIcebergTriggerCondPresenter.AEQbTJ(data != null ? data.getExtras() : null);
            activityC53079wei.djBIcL();
        }
    }

    /* JADX INFO: renamed from: o.wei$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC53079wei AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC53079wei activityC53079wei) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC53079wei;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC53079wei.OLrzqt(this.AEQbTJ).AYXKKw.AuCTelauCTel();
                if (!this.AEQbTJ.OLrzqt() || ActivityC53079wei.OLrzqt(this.AEQbTJ).AYXKKw.getFieldNames()) {
                    return;
                }
                ActivityC53079wei activityC53079wei = this.AEQbTJ;
                android.content.Intent intent = new android.content.Intent();
                intent.putParcelableArrayListExtra("trigger_sign", ActivityC53079wei.AEQbTJ(this.AEQbTJ).AEQbTJ().getTriggerParams());
                Unit unit = Unit.INSTANCE;
                activityC53079wei.setResult(-1, intent);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.wei$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC53079wei KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC53079wei activityC53079wei) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = activityC53079wei;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("BotPlaceOrder_RSISheet_RSICondition_Click", (TrackChannel[]) null, Activity.OLrzqt, 1, (java.lang.Object) null);
                ActivityResultLauncher activityResultLauncher = this.KWHzl.AEQbTJ;
                android.content.Intent intent = new android.content.Intent(this.KWHzl, (java.lang.Class<?>) ActivityC53071wea.class);
                intent.putExtra("trigger_sign", ActivityC53079wei.AEQbTJ(this.KWHzl).copydefault());
                intent.putExtra("bot_inst_id", ActivityC53079wei.AEQbTJ(this.KWHzl).OLrzqt().gEmmrt());
                activityResultLauncher.launch(intent);
            }
        }
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
