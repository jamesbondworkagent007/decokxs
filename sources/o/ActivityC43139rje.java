package o;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.lifecycle.Lifecycle;
import cn.jzvd.Jzvd;
import com.immomo.mls.InitData;
import com.immomo.mls.fun.lt.SIGlobalEvent;
import com.immomo.mls.fun.ui.custom.LuaVideoPlayerView;
import com.okinc.mln_ui.ui.okkit.UDGoPageBridge;
import com.okinc.rxutils.RxBus;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43084ric;
import o.C7343ahz;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ActivityC43139rje extends AbstractActivityC43063riH implements LuaVideoPlayerView.StateListAnimator {
    public static java.lang.String AhwBna;
    public boolean AkhnZx;
    public java.lang.String DbNXlk;
    public java.lang.String fIwbmz;
    public C7328ahk fetchVPNInfo;
    public java.lang.String isConnected;
    public java.lang.String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public static final java.util.Map<java.lang.String, java.lang.Integer> gEmmrt = new LinkedHashMap();
    public final java.lang.String djBIcL = "KEY_HOTRELOAD";
    public java.lang.String valueOf = "";
    public java.lang.String AuCTel = "";
    public java.lang.String ejfBZ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.StateListAnimator
    public void OLrzqt(boolean z) {
        this.AkhnZx = z;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX INFO: renamed from: o.rje$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rje.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(java.lang.String str) {
            ActivityC43139rje.AhwBna = str;
        }
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.fIwbmz == null) {
            this.fIwbmz = AhwBna;
        }
        AhwBna = null;
        java.lang.String str = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dark")) {
            getDelegate().setLocalNightMode(2);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "light")) {
            getDelegate().setLocalNightMode(1);
        }
        super.attachBaseContext(context);
    }

    @Override // o.ActivityC52757wXf
    public int getBrandThemeId() {
        java.lang.Object obj;
        java.util.HashMap map;
        InitData initDataEZpvd = C7327ahj.EZpvd(getIntent().getExtras());
        if (initDataEZpvd == null || (map = initDataEZpvd.KWHzl) == null || (obj = map.get("brand")) == null) {
            obj = "";
        }
        java.lang.Integer numAEQbTJ = C43146rjl.AEQbTJ((java.lang.String) obj);
        return numAEQbTJ != null ? numAEQbTJ.intValue() : super.getBrandThemeId();
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer num;
        java.lang.Integer numKWHzl;
        InitData initDataEZpvd = C7327ahj.EZpvd(getIntent().getExtras());
        Intrinsics.copydefault(initDataEZpvd);
        boolean z = false;
        final InitData initDataAEQbTJ = initDataEZpvd.AEQbTJ(false);
        java.lang.Object obj = initDataAEQbTJ.KWHzl.get("appearance");
        if (obj == null) {
            obj = "";
        }
        java.lang.String str = (java.lang.String) obj;
        this.isConnected = str;
        android.util.SparseArray<C33510mxn> sparseArrayCopydefault = C43146rjl.copydefault(str);
        if (sparseArrayCopydefault != null && (numKWHzl = C33503mxg.KWHzl(sparseArrayCopydefault)) != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
        setContentView(C43084ric.Application.AEQbTJ);
        final android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(C43084ric.TaskDescription.KWHzl);
        final boolean booleanExtra = getIntent().getBooleanExtra(this.djBIcL, false);
        java.lang.Object obj2 = initDataAEQbTJ.KWHzl.get(UDGoPageBridge.PARAM_ROOT_ID);
        if (obj2 == null) {
            obj2 = "";
        }
        java.lang.String str2 = (java.lang.String) obj2;
        this.values = str2;
        if (!android.text.TextUtils.isEmpty(str2)) {
            UDGoPageBridge.OLrzqt(this.values, this);
        }
        java.lang.Object obj3 = initDataAEQbTJ.KWHzl.get("appid");
        if (obj3 == null) {
            obj3 = "";
        }
        java.lang.String str3 = (java.lang.String) obj3;
        this.valueOf = str3;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3) && !C43048rht.AEQbTJ.copydefault().contains(this.valueOf)) {
            java.util.Map<java.lang.String, java.lang.Integer> map = gEmmrt;
            java.lang.String str4 = this.valueOf;
            java.lang.Integer num2 = map.get(str4);
            map.put(str4, java.lang.Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
        }
        Intrinsics.copydefault(frameLayout);
        Intrinsics.copydefault(initDataAEQbTJ);
        loadLua$default(this, frameLayout, initDataAEQbTJ, booleanExtra, false, 8, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C43044rhp.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.rjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return ActivityC43139rje.copydefault(this.KWHzl, frameLayout, initDataAEQbTJ, booleanExtra, (C43044rhp) obj4);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj4) {
                ActivityC43139rje.AEQbTJ(function1, obj4);
            }
        });
        java.lang.String str5 = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "dark")) {
            C7857arj.KWHzl(true, this);
        } else if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "light")) {
            C7857arj.KWHzl(false, this);
        }
        java.lang.Object obj4 = initDataAEQbTJ.KWHzl.get("bgColor");
        if (obj4 == null) {
            obj4 = "";
        }
        java.lang.String str6 = (java.lang.String) obj4;
        this.DbNXlk = str6;
        if (!android.text.TextUtils.isEmpty(str6)) {
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setColor(Color.parseColor(this.DbNXlk));
            getWindow().setBackgroundDrawable(colorDrawable);
        }
        C43146rjl.EZpvd(initDataAEQbTJ, this, new Function1() { // from class: o.rjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return ActivityC43139rje.KWHzl(this.copydefault, ((java.lang.Integer) obj5).intValue());
            }
        });
        java.lang.Object obj5 = initDataAEQbTJ.KWHzl.get("pageanim");
        java.lang.String str7 = (java.lang.String) (obj5 != null ? obj5 : "");
        this.AuCTel = str7;
        if (str7.length() == 0) {
            if (Intrinsics.EZpvd("1", initDataAEQbTJ.KWHzl.get("isentry")) || ((num = gEmmrt.get(this.valueOf)) != null && num.intValue() == 1)) {
                z = true;
            }
            java.lang.Object obj6 = initDataAEQbTJ.KWHzl.get("isFadeIn");
            if (obj6 == null) {
                obj6 = java.lang.Boolean.FALSE;
            }
            boolean zBooleanValue = ((java.lang.Boolean) obj6).booleanValue();
            if (z) {
                this.AuCTel = "present";
            } else if (zBooleanValue) {
                this.AuCTel = "fadein";
            }
        }
        java.lang.String str8 = this.AuCTel;
        if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "present")) {
            overridePendingTransition(C7343ahz.ActionBar.AEQbTJ, C7343ahz.ActionBar.values);
        } else if (Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "fadein")) {
            overridePendingTransition(C7343ahz.ActionBar.OLrzqt, C7343ahz.ActionBar.EZpvd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC43139rje activityC43139rje, android.widget.FrameLayout frameLayout, InitData initData, boolean z, C43044rhp c43044rhp) {
        Intrinsics.copydefault(frameLayout);
        Intrinsics.copydefault(initData);
        activityC43139rje.AEQbTJ(frameLayout, initData, z, true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC43139rje activityC43139rje, int i) {
        activityC43139rje.setNavigationBarColor(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rje$Application */
    public static final class Application implements InterfaceC7340ahw {
        public final /* synthetic */ android.widget.FrameLayout AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ InitData KWHzl;
        public final /* synthetic */ boolean copydefault;

        public Application(android.widget.FrameLayout frameLayout, boolean z, InitData initData, boolean z2) {
            this.AEQbTJ = frameLayout;
            this.copydefault = z;
            this.KWHzl = initData;
            this.EZpvd = z2;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            C7328ahk c7328ahk;
            if (ActivityC43139rje.this.isFinishing() || ActivityC43139rje.this.isDestroyed()) {
                return;
            }
            C7328ahk c7328ahk2 = ActivityC43139rje.this.fetchVPNInfo;
            if (c7328ahk2 != null) {
                c7328ahk2.AubY();
            }
            ActivityC43139rje.this.fetchVPNInfo = null;
            this.AEQbTJ.removeAllViews();
            if (this.copydefault && !this.KWHzl.AEQbTJ(256)) {
                this.KWHzl.EZpvd = C7788aqT.AEQbTJ().AEQbTJ(ActivityC43139rje.this, C7864arq.copydefault(this.KWHzl.EZpvd));
            }
            ActivityC43139rje.this.fetchVPNInfo = new C7328ahk(ActivityC43139rje.this, this.EZpvd, C7326ahi.EZpvd);
            C7328ahk c7328ahk3 = ActivityC43139rje.this.fetchVPNInfo;
            if (c7328ahk3 != null) {
                c7328ahk3.EZpvd(this.AEQbTJ);
            }
            C7328ahk c7328ahk4 = ActivityC43139rje.this.fetchVPNInfo;
            if (c7328ahk4 != null) {
                c7328ahk4.AEQbTJ(this.KWHzl);
            }
            C7328ahk c7328ahk5 = ActivityC43139rje.this.fetchVPNInfo;
            if (c7328ahk5 != null) {
                c7328ahk5.EZpvd(ActivityC43139rje.this.getOkQPL());
            }
            C7328ahk c7328ahk6 = ActivityC43139rje.this.fetchVPNInfo;
            if (c7328ahk6 != null) {
                c7328ahk6.wlaJM = true;
            }
            if (!ActivityC43139rje.this.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) || (c7328ahk = ActivityC43139rje.this.fetchVPNInfo) == null) {
                return;
            }
            c7328ahk.zLjUOn();
        }
    }

    public static /* synthetic */ void loadLua$default(ActivityC43139rje activityC43139rje, android.widget.FrameLayout frameLayout, InitData initData, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLua");
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        activityC43139rje.AEQbTJ(frameLayout, initData, z, z2);
    }

    public final void AEQbTJ(android.widget.FrameLayout frameLayout, InitData initData, boolean z, boolean z2) {
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new Application(frameLayout, z2, initData, z));
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        java.util.Map<java.lang.String, java.lang.Integer> map = gEmmrt;
        if (map.containsKey(this.valueOf)) {
            java.lang.String str = this.valueOf;
            Intrinsics.copydefault(map.get(str));
            map.put(str, java.lang.Integer.valueOf(r2.intValue() - 1));
        }
        java.lang.String str2 = this.AuCTel;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "present")) {
            overridePendingTransition(C7343ahz.ActionBar.values, C7343ahz.ActionBar.valueOf);
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "fadein")) {
            overridePendingTransition(C7343ahz.ActionBar.OLrzqt, C7343ahz.ActionBar.EZpvd);
        }
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C7328ahk c7328ahk = this.fetchVPNInfo;
        if (c7328ahk != null) {
            c7328ahk.zLjUOn();
        }
        LuaVideoPlayerView.goOnPlayOnResume();
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C7328ahk c7328ahk = this.fetchVPNInfo;
        if (c7328ahk != null) {
            c7328ahk.zsXlph();
        }
        LuaVideoPlayerView.goOnPlayOnPause();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C7328ahk c7328ahk = this.fetchVPNInfo;
        if (c7328ahk != null) {
            c7328ahk.gHZMYf();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull android.view.KeyEvent keyEvent) {
        C7328ahk c7328ahk;
        Intrinsics.checkNotNullParameter(keyEvent, "");
        if (keyEvent.getKeyCode() == 4) {
            if (keyEvent.getAction() != 1 && (c7328ahk = this.fetchVPNInfo) != null) {
                c7328ahk.EZpvd(keyEvent);
            }
            C7328ahk c7328ahk2 = this.fetchVPNInfo;
            if (c7328ahk2 != null && !c7328ahk2.EZpvd()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C7328ahk c7328ahk = this.fetchVPNInfo;
        if (c7328ahk != null) {
            c7328ahk.AubY();
        }
        UDGoPageBridge.copydefault(this.values);
    }

    @Override // o.AbstractActivityC33041mov, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        C7328ahk c7328ahk;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C43157rjw c43157rjw = C43157rjw.copydefault;
        if (i == c43157rjw.OLrzqt()) {
            if (c43157rjw.KWHzl(this)) {
                C33134mqi.AEQbTJ(getString(C43084ric.Activity.KWHzl));
                return;
            }
            java.lang.String[] strArrEZpvd = c43157rjw.EZpvd();
            if (!C60121zwJ.KWHzl(this, (java.lang.String[]) java.util.Arrays.copyOf(strArrEZpvd, strArrEZpvd.length)) || (c7328ahk = this.fetchVPNInfo) == null) {
                return;
            }
            Intrinsics.copydefault(c7328ahk);
            SIGlobalEvent sIGlobalEvent = new SIGlobalEvent(c7328ahk.djBIcL(), null);
            java.util.HashMap map = new java.util.HashMap();
            map.put(JwtUtilsKt.DID_METHOD_KEY, "granted");
            sIGlobalEvent.postEvent("reward_calendar_permission_allowed_event", map);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void setRequestedOrientation(@NotNull android.app.Activity activity, @NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        if (!C34703nhO.AYXKKw(this)) {
            activity.setRequestedOrientation(-1);
        } else if (this.AkhnZx) {
            activity.setRequestedOrientation(0);
        } else {
            activity.setRequestedOrientation(1);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public java.lang.String getQPLSourceName() {
        java.lang.String strKWHzl = this.ejfBZ;
        if (strKWHzl.length() == 0) {
            InitData initDataEZpvd = C7327ahj.EZpvd(getIntent().getExtras());
            if (initDataEZpvd == null || (strKWHzl = C7836arO.KWHzl(initDataEZpvd)) == null) {
                strKWHzl = "";
            }
            this.ejfBZ = strKWHzl;
        }
        return strKWHzl;
    }

    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        android.util.SparseArray<C33510mxn> sparseArrayCopydefault = C43146rjl.copydefault(this.isConnected);
        return sparseArrayCopydefault != null ? sparseArrayCopydefault : super.getSwitchThemePairs();
    }

    @Override // o.AbstractActivityC43063riH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
