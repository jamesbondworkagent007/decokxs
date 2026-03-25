package o;

import com.okinc.rxutils.RecreateEvent;
import com.okinc.rxutils.RecreateType;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33160mrH;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC33266mtH extends AbstractActivityC33041mov {
    public final C58216yxB OLrzqt = new C58216yxB();
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C33160mrH.Application.AEQbTJ);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_created");
        final Function1 function1 = new Function1() { // from class: o.mtG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC33266mtH.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mtE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC33266mtH.KWHzl(function1, obj);
            }
        });
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(2L, java.util.concurrent.TimeUnit.SECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.mtF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC33266mtH.EZpvd(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        this.OLrzqt.OLrzqt(abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.mtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC33266mtH.OLrzqt(function12, obj);
            }
        }), interfaceC58217yxCAEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC33266mtH activityC33266mtH, java.lang.String str) {
        activityC33266mtH.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC33266mtH activityC33266mtH, java.lang.Long l) {
        activityC33266mtH.finish();
        return Unit.INSTANCE;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        RxBus.AEQbTJ(new C33504mxh(getIntent().getIntExtra("theme_mode", 0), getIntent().getIntExtra("color_theme", 0)));
        RxBus.AEQbTJ(new RecreateEvent(RecreateType.THEME));
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.copydefault);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt.OLrzqt();
    }

    /* JADX INFO: renamed from: o.mtH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mtH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull android.content.Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC33266mtH.class);
            intent.putExtra("theme_mode", i);
            intent.putExtra("color_theme", i2);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
