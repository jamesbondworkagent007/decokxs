package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class lAF extends lAR {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC31400ltM KWHzl;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lAF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.lAR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        AbstractC31400ltM abstractC31400ltMKWHzl = AbstractC31400ltM.KWHzl(getLayoutInflater());
        this.KWHzl = abstractC31400ltMKWHzl;
        AbstractC31400ltM abstractC31400ltM = null;
        if (abstractC31400ltMKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC31400ltMKWHzl = null;
        }
        setContentView(abstractC31400ltMKWHzl.getRoot());
        AbstractC31400ltM abstractC31400ltM2 = this.KWHzl;
        if (abstractC31400ltM2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31400ltM = abstractC31400ltM2;
        }
        abstractC31400ltM.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lAF.copydefault(this.KWHzl, view);
            }
        });
        showLoading();
        BuySellConvertParameters buySellConvertParameters = (BuySellConvertParameters) getIntent().getParcelableExtra("buy_sell_convert_params");
        if (buySellConvertParameters == null) {
            buySellConvertParameters = new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        }
        if (buySellConvertParameters.AkhnZx() == OKPaymentSource.PUSH_NOTIFICATION || buySellConvertParameters.AkhnZx() == OKPaymentSource.PUSH_NOTIFICATION_RECURRING) {
            C31354lsT.KWHzl.copydefault(buySellConvertParameters.djBIcL() == OrderType.RECURRING ? "recurring" : "one_time");
        }
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class);
        if (interfaceC47251tmX != null) {
            interfaceC47251tmX.KWHzl(this, buySellConvertParameters, new Function1() { // from class: o.lAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lAF.copydefault(this.AEQbTJ, (InterfaceC47247tmT) obj);
                }
            });
        }
    }

    public static final void copydefault(lAF laf, android.view.View view) {
        laf.finish();
    }

    public static final Unit copydefault(lAF laf, InterfaceC47247tmT interfaceC47247tmT) {
        Intrinsics.checkNotNullParameter(interfaceC47247tmT, "");
        laf.finish();
        laf.overridePendingTransition(0, 0);
        return Unit.INSTANCE;
    }

    @Override // o.lAR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lAR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lAR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lAR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
