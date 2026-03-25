package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.core.util.SPUtils;
import com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.okmarket.ui.market.remind.AllPriceRemindActivity$initBiz$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC46751tdA extends AbstractActivityC46769tdS {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final java.util.ArrayList<MutableLiveData<AbstractC54531xLw>> copydefault = new java.util.ArrayList<>();
    public final java.util.ArrayList<Observer<AbstractC54531xLw>> KWHzl = new java.util.ArrayList<>();

    @Override // o.AbstractActivityC46767tdQ
    public /* synthetic */ java.util.List AEQbTJ(java.util.List list) {
        return KWHzl((java.util.List<PriceRemindRulesListBean>) list);
    }

    /* JADX INFO: renamed from: o.tdA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tdA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, UnifiedPriceRemind unifiedPriceRemind, TokenInfoForAlert tokenInfoForAlert, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                unifiedPriceRemind = null;
            }
            if ((i & 4) != 0) {
                tokenInfoForAlert = null;
            }
            application.EZpvd(context, unifiedPriceRemind, tokenInfoForAlert);
        }

        public final void EZpvd(@NotNull android.content.Context context, UnifiedPriceRemind unifiedPriceRemind, TokenInfoForAlert tokenInfoForAlert) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46751tdA.class);
            intent.putExtra("conin_info", unifiedPriceRemind);
            intent.putExtra("token_alert_info", tokenInfoForAlert);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC46769tdS, o.AbstractActivityC46767tdQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            getDelegate().setLocalNightMode(2);
        } else if (!Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) && C33492mxV.OLrzqt()) {
            getDelegate().setLocalNightMode(2);
        } else {
            getDelegate().setLocalNightMode(1);
        }
        super.attachBaseContext(context);
    }

    public java.util.ArrayList<C46707tcJ> KWHzl(@NotNull java.util.List<PriceRemindRulesListBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C46844teo.OLrzqt.EZpvd(list, this.copydefault);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C55629xnZ.AEQbTJ(this).OLrzqt();
        int i = 0;
        for (java.lang.Object obj : this.copydefault) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((MutableLiveData) obj).removeObserver(this.KWHzl.get(i));
            i++;
        }
    }

    @Override // o.AbstractActivityC46767tdQ
    public void OLrzqt(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault.clear();
        this.KWHzl.clear();
        DbNXlk().set(0);
        for (java.lang.String str : AkhnZx()) {
            MutableLiveData<AbstractC54531xLw> mutableLiveData = new MutableLiveData<>();
            Observer<AbstractC54531xLw> observer = new Observer() { // from class: o.tdE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    ActivityC46751tdA.EZpvd(this.KWHzl, function0, (AbstractC54531xLw) obj);
                }
            };
            this.copydefault.add(mutableLiveData);
            this.KWHzl.add(observer);
            mutableLiveData.observeForever(observer);
        }
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.AEQbTJ(this), LifecycleOwnerKt.getLifecycleScope(this), null, new AllPriceRemindActivity$initBiz$2(this, null), 2, null);
    }

    public static final void EZpvd(ActivityC46751tdA activityC46751tdA, Function0 function0, AbstractC54531xLw abstractC54531xLw) {
        activityC46751tdA.DbNXlk().addAndGet(1);
        if (activityC46751tdA.DbNXlk().get() == activityC46751tdA.AkhnZx().size()) {
            function0.invoke();
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        boolean zIsBlackStatusBar = isBlackStatusBar();
        if (zIsBlackStatusBar) {
            zIsBlackStatusBar = !Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"));
        }
        C33567myr.AEQbTJ(this, zIsBlackStatusBar);
        C33494mxX.copydefault.EZpvd(this, zIsBlackStatusBar);
    }

    @Override // o.AbstractActivityC46769tdS, o.AbstractActivityC46767tdQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC46769tdS, o.AbstractActivityC46767tdQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC46769tdS, o.AbstractActivityC46767tdQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC46769tdS, o.AbstractActivityC46767tdQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
