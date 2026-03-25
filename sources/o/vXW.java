package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignCreateStepType;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotCreateSignPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51762vtD;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class vXW extends AbstractActivityC48163uHh<uYT, SignalBotCreateSignPresenter> {

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.idLUrz;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
        KWHzl();
        OLrzqt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((uYT) sSMYrx()).KWHzl.setUserInputEnabled(false);
        ViewPager2 viewPager2 = ((uYT) sSMYrx()).KWHzl;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        java.util.List<C50708vYk> listCopydefault = SignCreateStepType.Companion.copydefault();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        viewPager2.setAdapter(new C47976uAj(supportFragmentManager, listCopydefault, lifecycle, null, 8, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((uYT) sSMYrx()).EZpvd.setSubDoListener(new View.OnClickListener() { // from class: o.vXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vXW.AEQbTJ(this.AEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(vXW vxw, android.view.View view) {
        C33054mpH.OLrzqt(vxw, view);
        vxw.finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((SignalBotCreateSignPresenter) gHZMYf()).valueOf().observe(this, new ActionBar(new Function1() { // from class: o.vXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXW.OLrzqt(this.AEQbTJ, (SignalListItem) obj);
            }
        }));
        ((SignalBotCreateSignPresenter) gHZMYf()).EZpvd().observe(this, new ActionBar(new Function1() { // from class: o.vXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXW.OLrzqt(this.OLrzqt, (Unit) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vXW vxw, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        ((uYT) vxw.sSMYrx()).copydefault.AEQbTJ();
        ((uYT) vxw.sSMYrx()).KWHzl.setCurrentItem(1, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vXW vxw, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt()) {
            ActivityC51762vtD.ActionBar actionBar = ActivityC51762vtD.Companion;
            SignalListItem value = ((SignalBotCreateSignPresenter) vxw.gHZMYf()).valueOf().getValue();
            java.lang.String signalChanId = value != null ? value.getSignalChanId() : null;
            SignalListItem value2 = ((SignalBotCreateSignPresenter) vxw.gHZMYf()).valueOf().getValue();
            java.lang.String signalChanName = value2 != null ? value2.getSignalChanName() : null;
            SignalListItem value3 = ((SignalBotCreateSignPresenter) vxw.gHZMYf()).valueOf().getValue();
            actionBar.AEQbTJ(vxw, new SignalPublishInfo(signalChanId, signalChanName, value3 != null ? value3.getSignalDescription() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2040, (DefaultConstructorMarker) null));
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("data", ((SignalBotCreateSignPresenter) vxw.gHZMYf()).valueOf().getValue());
            Unit unit2 = Unit.INSTANCE;
            vxw.setResult(-1, intent);
        }
        vxw.finish();
        return Unit.INSTANCE;
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
