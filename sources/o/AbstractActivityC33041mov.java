package o;

import android.os.Build;
import android.os.MessageQueue;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.util.SparseArrayKt;
import androidx.core.view.LayoutInflaterCompat;
import com.okinc.base.thread.TPM;
import com.okinc.core.base.LoadingDialogType;
import com.okinc.core.base.transtion.PageTranstionAnim;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.rxutils.RecreateEvent;
import com.okinc.rxutils.RecreateType;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC42536rWm;
import o.C60121zwJ;
import o.InterfaceC33019moZ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractActivityC33041mov extends ActivityC52757wXf implements C60121zwJ.Activity, InterfaceC48850udU, InterfaceC33019moZ, InterfaceC33507mxk, InterfaceC33441mwX {
    private static boolean clearSaveInstanceStatus;
    private java.lang.String TAG;
    private final boolean applyNavigationBarInsets;
    private boolean canRecreate;
    private final int contentView;
    private InterfaceC33018moY iPageTransitionAnim;
    private boolean isDisplayedForFirstTime;
    private boolean isLoadingAppear;
    private final LoadingDialogType loadingDialogType;
    private C58216yxB mCompositeDisposable;
    private final android.os.Handler mDefaultHandler;
    private InterfaceC58217yxC mDisposable;
    private boolean mIsReenter;
    private final InterfaceC56387yDm mLoadingDialogDelegate$delegate;
    private C33625mzw mPermissionHelper;
    private InterfaceC58217yxC mThemeDisposable;
    private int mThemeId;
    private final AbstractC42536rWm okQPL;
    private final java.lang.Object rxObj;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    private final /* synthetic */ C33442mwY $$delegate_0 = new C33442mwY();
    private AbstractActivityC33041mov mActivity = this;

    public static /* synthetic */ void getContentView$annotations() {
    }

    public boolean canScreenshot() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getApplyNavigationBarInsets() {
        return this.applyNavigationBarInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanRecreate() {
        return this.canRecreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getContentView() {
        return this.contentView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoadingDialogType getLoadingDialogType() {
        return this.loadingDialogType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractActivityC33041mov getMActivity() {
        return this.mActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC42536rWm getOkQPL() {
        return this.okQPL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String getTAG() {
        return this.TAG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getThemeId() {
        return this.mThemeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void handleIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
    }

    public void init() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void initLauncher(@NotNull ActivityResultCaller activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        this.$$delegate_0.KWHzl(activityResultCaller);
    }

    public boolean isBlackStatusBar() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReenter() {
        return this.mIsReenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33441mwX
    public void launchForResult(@NotNull android.content.Intent intent, ActivityResultCallback<ActivityResult> activityResultCallback) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.$$delegate_0.launchForResult(intent, activityResultCallback);
    }

    public boolean needChangeLang() {
        return true;
    }

    public boolean needChangeUpDownColor() {
        return true;
    }

    public boolean needHook() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanRecreate(boolean z) {
        this.canRecreate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMActivity(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.mActivity = abstractActivityC33041mov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TAG = str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rWm.Application.getInstance$default(o.rWm$Application, com.okinc.okapm.okqpl.QPLFlavour, int, java.lang.Object):o.rWm */
    public AbstractActivityC33041mov() {
        java.lang.String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        this.TAG = name;
        this.mLoadingDialogDelegate$delegate = C56392yDr.copydefault(new Function0() { // from class: o.moA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC33041mov.mLoadingDialogDelegate_delegate$lambda$0(this.AEQbTJ);
            }
        });
        this.mDefaultHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isDisplayedForFirstTime = true;
        this.okQPL = AbstractC42536rWm.Application.getInstance$default(AbstractC42536rWm.Companion, null, 1, null);
        this.iPageTransitionAnim = new PageTranstionAnim();
        this.loadingDialogType = LoadingDialogType.BRANDING;
        this.canRecreate = true;
        this.applyNavigationBarInsets = true;
        this.rxObj = new java.lang.Object();
    }

    public boolean animOpen() {
        return InterfaceC33019moZ.Application.OLrzqt(this);
    }

    /* JADX INFO: renamed from: o.mov$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mov.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final C33002moI mLoadingDialogDelegate_delegate$lambda$0(AbstractActivityC33041mov abstractActivityC33041mov) {
        return new C33002moI(abstractActivityC33041mov, abstractActivityC33041mov.getLoadingDialogType());
    }

    public final C33002moI getMLoadingDialogDelegate() {
        return (C33002moI) this.mLoadingDialogDelegate$delegate.getValue();
    }

    public C33510mxn getSwitchThemePair() {
        return new C33510mxn(0, 0);
    }

    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        return C33503mxg.OLrzqt();
    }

    public final int resolveRealTheme(@androidx.annotation.StyleRes int i) {
        java.lang.Integer numKWHzl;
        android.util.SparseArray<C33510mxn> switchThemePairs = getSwitchThemePairs();
        java.util.Iterator itValueIterator = SparseArrayKt.valueIterator(switchThemePairs);
        boolean z = false;
        while (itValueIterator.hasNext()) {
            C33510mxn c33510mxn = (C33510mxn) itValueIterator.next();
            if (i == c33510mxn.copydefault() || i == c33510mxn.AEQbTJ()) {
                z = true;
            }
        }
        return (z && (numKWHzl = C33503mxg.KWHzl(switchThemePairs)) != null) ? numKWHzl.intValue() : i;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && C33476mxF.KWHzl(this)) {
            pUU.EZpvd("BaseActivity", "fix android 8.0 Activity setRequestedOrientation ");
        } else {
            super.setRequestedOrientation(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.isDisplayedForFirstTime) {
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, QPLMarker.DISPLAYED, getQPLSourceName(), 0L, 8, null);
            this.isDisplayedForFirstTime = false;
        }
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT == 26 && C33476mxF.KWHzl(this)) {
                pUU.EZpvd("BaseActivity", "fix android 8.0 Activity onCreate result = " + C33476mxF.OLrzqt(this));
            }
            int[] intArrayExtra = getIntent().getIntArrayExtra("TRANSITION_ANIM");
            if (intArrayExtra != null && intArrayExtra.length > 1) {
                this.iPageTransitionAnim.setAnimatorResource(intArrayExtra[0], intArrayExtra[1]);
            }
            this.iPageTransitionAnim.pageInAnim(new WeakReference<>(this));
            if (clearSaveInstanceStatus && bundle != null) {
                bundle.clear();
            }
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this);
            if (layoutInflaterFrom.getFactory() == null) {
                LayoutInflaterCompat.setFactory2(layoutInflaterFrom, new pSF());
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
        C32999moF c32999moF = C32999moF.AEQbTJ;
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        c32999moF.copydefault(applicationContext, bundle);
        super.onCreate(bundle);
        checkEnv();
        android.content.res.Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setRequestedOrientation(this, configuration);
        C33095mpw.EZpvd(this);
        int iResolveRealTheme = resolveRealTheme(this.mThemeId);
        if (iResolveRealTheme != this.mThemeId) {
            setTheme(iResolveRealTheme);
        }
        getEdgeToEdge().AEQbTJ();
        if (getApplyNavigationBarInsets()) {
            C33472mxB edgeToEdge = getEdgeToEdge();
            android.view.View viewFindViewById = findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            edgeToEdge.AEQbTJ(viewFindViewById);
        }
        addConfig();
        if (getIntent() != null) {
            android.content.Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            handleIntent(intent);
        }
        if (getContentView() > 0) {
            setContentView(getContentView());
        }
        init();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(RecreateEvent.class, new java.lang.String[0]);
        final java.lang.Object obj = this.rxObj;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<RecreateEvent>(obj) { // from class: com.okinc.core.base.BaseActivity$onCreate$2

            /* JADX INFO: loaded from: classes18.dex */
            public final /* synthetic */ class ActionBar {
                public static final /* synthetic */ int[] copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[RecreateType.values().length];
                    try {
                        iArr[RecreateType.LANGUAGE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecreateType.THEME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecreateType.BOTH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    copydefault = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(RecreateEvent recreateEvent) {
                Intrinsics.checkNotNullParameter(recreateEvent, "");
                pUU.KWHzl(this.this$0.getTAG(), this + " recreate by event: " + recreateEvent);
                int i = ActionBar.copydefault[recreateEvent.getType().ordinal()];
                if (i == 1) {
                    if (this.this$0.needChangeLang()) {
                        this.this$0.recreate();
                    }
                } else if (i == 2) {
                    if (this.this$0.needChangeUpDownColor()) {
                        this.this$0.recreate();
                    }
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.this$0.needChangeLang() || this.this$0.needChangeUpDownColor()) {
                        this.this$0.recreate();
                    }
                }
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_change_layout_direction");
        final java.lang.Object obj2 = this.rxObj;
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(obj2) { // from class: com.okinc.core.base.BaseActivity$onCreate$3
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.this$0.recreate();
            }
        });
        initLauncher(this);
        if (getIntent().getBooleanExtra("IS_SECURE", false)) {
            getWindow().setFlags(8192, 8192);
        } else {
            getWindow().clearFlags(8192);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final android.view.View getContentView(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.view.View decorView = activity.getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        android.view.View viewFindViewById = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        Intrinsics.copydefault(viewFindViewById, "");
        android.view.View childAt = ((android.widget.FrameLayout) viewFindViewById).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        return childAt;
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.mIsReenter = true;
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C33570myu.AEQbTJ((android.app.Activity) this);
        this.canRecreate = true;
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C33440mwW.copydefault.EZpvd(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C33440mwW.copydefault.OLrzqt(this);
        releaseLoading();
        SubHelper.AEQbTJ(this);
        clearAllDisposable();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        SubHelper.AEQbTJ(this.rxObj);
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.mDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.mDefaultHandler.removeCallbacksAndMessages(null);
        getMLoadingDialogDelegate().AEQbTJ();
        InterfaceC58217yxC interfaceC58217yxC2 = this.mThemeDisposable;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    public final android.os.Message generateMsg(int i, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        android.os.Message message = new android.os.Message();
        message.what = i;
        message.obj = obj;
        return message;
    }

    public void addConfig() {
        boolean zIsBlackStatusBar = isBlackStatusBar();
        if (zIsBlackStatusBar) {
            zIsBlackStatusBar = !getEdgeToEdge().copydefault();
        }
        C33567myr.AEQbTJ(this, zIsBlackStatusBar);
        C33494mxX.copydefault.EZpvd(this, zIsBlackStatusBar);
    }

    public final void setForceDismiss(boolean z) {
        getMLoadingDialogDelegate().EZpvd(z);
    }

    public final void setLoadingCancelable(boolean z) {
        getMLoadingDialogDelegate().AEQbTJ(z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.moI.showLoading$default(o.moI, boolean, int, java.lang.Object):void */
    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void showLoading() {
        addLoadingAppearQPL();
        C33002moI.showLoading$default(getMLoadingDialogDelegate(), false, 1, null);
    }

    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void showLoading(long j) {
        addLoadingAppearQPL();
        getMLoadingDialogDelegate().OLrzqt(true, j);
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingAtOnce() {
        addLoadingAppearQPL();
        getMLoadingDialogDelegate().KWHzl();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingAtOnceCannotCancel() {
        addLoadingAppearQPL();
        getMLoadingDialogDelegate().djBIcL();
    }

    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void dismissLoading() {
        addLoadingDisappearQPL();
        getMLoadingDialogDelegate().OLrzqt();
    }

    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void releaseLoading() {
        addLoadingDisappearQPL();
        getMLoadingDialogDelegate().copydefault();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C60121zwJ.KWHzl(i, strArr, iArr, this);
    }

    public final C33625mzw getPermissionHelper() {
        if (this.mPermissionHelper == null) {
            this.mPermissionHelper = new C33625mzw();
        }
        C33625mzw c33625mzw = this.mPermissionHelper;
        Intrinsics.copydefault(c33625mzw, "");
        return c33625mzw;
    }

    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getPermissionHelper().KWHzl(this, i, list);
    }

    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        getPermissionHelper().AEQbTJ(this, i, list);
    }

    public final void addDisposable(InterfaceC58217yxC interfaceC58217yxC) {
        if (interfaceC58217yxC != null) {
            if (this.mCompositeDisposable == null) {
                this.mCompositeDisposable = new C58216yxB();
            }
            C58216yxB c58216yxB = this.mCompositeDisposable;
            if (c58216yxB != null) {
                c58216yxB.AEQbTJ(interfaceC58217yxC);
            }
        }
    }

    public final void removeDisposable(InterfaceC58217yxC interfaceC58217yxC) {
        C58216yxB c58216yxB;
        if (interfaceC58217yxC == null || (c58216yxB = this.mCompositeDisposable) == null) {
            return;
        }
        c58216yxB.EZpvd(interfaceC58217yxC);
    }

    public final void clearAllDisposable() {
        C58216yxB c58216yxB = this.mCompositeDisposable;
        if (c58216yxB != null) {
            c58216yxB.OLrzqt();
        }
    }

    public final void setupActionBarTitle(@NotNull androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(toolbar, "");
        setSupportActionBar(toolbar);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(false);
        }
        androidx.appcompat.app.ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setTitle("");
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void postDelay(@NotNull java.lang.Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "");
        this.mDefaultHandler.postDelayed(runnable, j);
    }

    public final void removeCallbacks(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        this.mDefaultHandler.removeCallbacks(runnable);
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(new C49328umV(C33051mpE.AEQbTJ.KWHzl(context)));
        if (needHook()) {
            pSE pse = pSE.EZpvd;
            android.content.Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            pse.EZpvd(baseContext);
            return;
        }
        getBaseContext().getResources().getConfiguration().setLayoutDirection(java.util.Locale.getDefault());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if ((activityResultCaller instanceof InterfaceC33040mou) && ((InterfaceC33040mou) activityResultCaller).AhwBna()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        pUU.KWHzl(getTAG(), "will do finish action");
        this.iPageTransitionAnim.pageOutAnim(new WeakReference<>(this));
    }

    @Override // android.app.Activity
    public void recreate() {
        if (isFinishing() || isDestroyed() || !this.canRecreate) {
            return;
        }
        super.recreate();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        C33051mpE c33051mpE = C33051mpE.AEQbTJ;
        android.content.res.Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return c33051mpE.EZpvd(resources);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        setRequestedOrientation(this, configuration);
        RxBus.KWHzl("event_on_configuration_changed");
    }

    public void setRequestedOrientation(@NotNull android.app.Activity activity, @NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        if (C34703nhO.AYXKKw(this)) {
            activity.setRequestedOrientation(1);
        } else {
            activity.setRequestedOrientation(-1);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.widget.Toast toastAEQbTJ;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C55328xhq c55328xhq = C55328xhq.OLrzqt;
            if (c55328xhq.EZpvd() && (toastAEQbTJ = c55328xhq.AEQbTJ()) != null) {
                toastAEQbTJ.cancel();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final java.lang.String getActivityName() {
        java.lang.String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    public final java.lang.String getEnvInfo() {
        return getActivityName() + " " + java.lang.Thread.currentThread().getId() + " " + java.lang.Thread.currentThread().getThreadGroup();
    }

    private final void checkEnv() {
        if ((this instanceof InterfaceC35204nqs) && Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            pUU.copydefault("dexguard", "IEnvCheck==>" + getEnvInfo());
            android.os.Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.mox
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return AbstractActivityC33041mov.checkEnv$lambda$7(this.EZpvd);
                }
            });
        }
    }

    public static final boolean checkEnv$lambda$7(final AbstractActivityC33041mov abstractActivityC33041mov) {
        TPM.AEQbTJ.AhwBna().execute(new java.lang.Runnable() { // from class: o.moz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC33041mov.checkEnv$lambda$7$lambda$6(this.KWHzl);
            }
        });
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.mov */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void checkEnv$lambda$7$lambda$6(AbstractActivityC33041mov abstractActivityC33041mov) {
        pUU.copydefault("dexguard", "addIdleHandler==>==>" + abstractActivityC33041mov.getEnvInfo());
        ((InterfaceC35204nqs) abstractActivityC33041mov).fARcdN();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        if (intent != null) {
            pUU.copydefault("dexguard", "BaseActivity startActivity " + intent + "  AMS:" + C6832aWn.AEQbTJ());
        }
        super.startActivity(intent);
    }

    public java.lang.String getQPLSourceName() {
        java.lang.String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    private final void addLoadingAppearQPL() {
        this.isLoadingAppear = true;
        getOkQPL().copydefault(QPLType.LIFE_CYCLE, QPLMarker.LOADING_APPEAR, getQPLSourceName(), java.lang.System.currentTimeMillis());
    }

    private final void addLoadingDisappearQPL() {
        if (this.isLoadingAppear) {
            this.isLoadingAppear = false;
            getOkQPL().copydefault(QPLType.LIFE_CYCLE, QPLMarker.LOADING_DISAPPEAR, getQPLSourceName(), java.lang.System.currentTimeMillis());
        }
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
