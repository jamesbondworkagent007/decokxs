package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.okinc.common.localization.SwitchMarketLoadingActivity$onCreate$3;
import com.okinc.common.localization.SwitchMarketLoadingActivity$setResultAndFinishSelf$1;
import com.okinc.common.localization.SwitchMarketLoadingActivity$startSwitchMarket$1;
import com.okinc.common.localization.SwitchMarketLoadingActivity$startSwitchMarket$3$1;
import com.okinc.common.localization.SwitchMarketLoadingActivity$startSwitchMarket$finishCallback$1;
import com.okinc.common.localization.SwitchMarketLoadingActivity$startSwitchMarket$job$1;
import com.okinc.common.localization.SwitchMarketLoadingActivity$startSwitchOnce$1;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageListConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import o.C32549mfg;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC32554mfl extends AbstractActivityC33041mov {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C32553mfk AEQbTJ;
    public java.lang.String EZpvd = "SwitchMarketLoadingActivity";
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mfq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32554mfl.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mfp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32554mfl.copydefault();
        }
    });
    public final CoroutineScope AYXKKw = CoroutineScopeKt.MainScope();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.EZpvd;
    }

    @Override // o.AbstractActivityC33041mov
    public boolean needChangeLang() {
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public final pTM AYXKKw() {
        return (pTM) this.OLrzqt.getValue();
    }

    public static final pTM AEQbTJ() {
        return ((LocalizeDIModule.TaskDescription) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.TaskDescription.class)).QKudOq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pTU AhwBna() {
        return (pTU) this.KWHzl.getValue();
    }

    public static final pTU copydefault() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).gkJEwt();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pUU.KWHzl(getTAG(), "onCreate: " + this);
        super.onCreate(bundle);
        AYXKKw().AEQbTJ(toString());
        if (bundle != null) {
            pUU.KWHzl(getTAG(), "onViewCreated, savedInstanceState != null. ignore");
            KWHzl();
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.mfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32554mfl.copydefault((OnBackPressedCallback) obj);
            }
        }, 2, null);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        C32553mfk c32553mfkKWHzl = C32553mfk.KWHzl(getLayoutInflater());
        this.AEQbTJ = c32553mfkKWHzl;
        C32553mfk c32553mfk = null;
        if (c32553mfkKWHzl == null) {
            Intrinsics.gEmmrt("");
            c32553mfkKWHzl = null;
        }
        setContentView(c32553mfkKWHzl.getRoot());
        C32553mfk c32553mfk2 = this.AEQbTJ;
        if (c32553mfk2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32553mfk = c32553mfk2;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c32553mfk.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.mfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC32554mfl.EZpvd(this.EZpvd, view, windowInsetsCompat);
            }
        });
        java.lang.String stringExtra = getIntent().getStringExtra("market");
        java.lang.String stringExtra2 = getIntent().getStringExtra(AppLocaleInfo.KEY_LANGUAGE_CODE);
        int intExtra = getIntent().getIntExtra("maxSwitchCount", 3);
        java.lang.String stringExtra3 = getIntent().getStringExtra("switchMarketRequestKey");
        if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new SwitchMarketLoadingActivity$onCreate$3(this, stringExtra, stringExtra2, intExtra, stringExtra3, null), 3, null);
        } else {
            KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public static final WindowInsetsCompat EZpvd(ActivityC32554mfl activityC32554mfl, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        C32553mfk c32553mfk = activityC32554mfl.AEQbTJ;
        if (c32553mfk == null) {
            Intrinsics.gEmmrt("");
            c32553mfk = null;
        }
        android.widget.FrameLayout root = c32553mfk.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(boolean z, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SwitchMarketLoadingActivity$setResultAndFinishSelf$1 switchMarketLoadingActivity$setResultAndFinishSelf$1;
        ActivityC32554mfl activityC32554mfl;
        kotlinx.coroutines.channels.Channel<java.lang.Boolean> channel;
        if (continuation instanceof SwitchMarketLoadingActivity$setResultAndFinishSelf$1) {
            switchMarketLoadingActivity$setResultAndFinishSelf$1 = (SwitchMarketLoadingActivity$setResultAndFinishSelf$1) continuation;
            int i = switchMarketLoadingActivity$setResultAndFinishSelf$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                switchMarketLoadingActivity$setResultAndFinishSelf$1.label = i - Integer.MIN_VALUE;
            } else {
                switchMarketLoadingActivity$setResultAndFinishSelf$1 = new SwitchMarketLoadingActivity$setResultAndFinishSelf$1(this, continuation);
            }
        }
        java.lang.Object obj = switchMarketLoadingActivity$setResultAndFinishSelf$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = switchMarketLoadingActivity$setResultAndFinishSelf$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            kotlinx.coroutines.channels.Channel<java.lang.Boolean> channelEZpvd = C32550mfh.OLrzqt.EZpvd(str);
            if (channelEZpvd != null) {
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(z);
                switchMarketLoadingActivity$setResultAndFinishSelf$1.L$0 = this;
                switchMarketLoadingActivity$setResultAndFinishSelf$1.L$1 = channelEZpvd;
                switchMarketLoadingActivity$setResultAndFinishSelf$1.L$2 = channelEZpvd;
                switchMarketLoadingActivity$setResultAndFinishSelf$1.label = 1;
                if (channelEZpvd.send(boolKWHzl, switchMarketLoadingActivity$setResultAndFinishSelf$1) == objCopydefault) {
                    return objCopydefault;
                }
                channel = channelEZpvd;
                activityC32554mfl = this;
            } else {
                activityC32554mfl = this;
                activityC32554mfl.KWHzl();
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (kotlinx.coroutines.channels.Channel) switchMarketLoadingActivity$setResultAndFinishSelf$1.L$2;
            activityC32554mfl = (ActivityC32554mfl) switchMarketLoadingActivity$setResultAndFinishSelf$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        CoroutineScopeKt.cancel$default(activityC32554mfl.AYXKKw, "fragment onDestroy", null, 2, null);
        activityC32554mfl.KWHzl();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().KWHzl(toString());
        pUU.KWHzl(getTAG(), "onDestroy. " + this);
    }

    public final void KWHzl() {
        if (isFinishing() && isDestroyed()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(pTU ptu, LanguageUnit languageUnit, int i, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SwitchMarketLoadingActivity$startSwitchMarket$1 switchMarketLoadingActivity$startSwitchMarket$1;
        final pTU ptu2;
        final ActivityC32554mfl activityC32554mfl;
        final LanguageUnit languageUnit2;
        Ref.BooleanRef booleanRef;
        final Function2 function2;
        if (continuation instanceof SwitchMarketLoadingActivity$startSwitchMarket$1) {
            switchMarketLoadingActivity$startSwitchMarket$1 = (SwitchMarketLoadingActivity$startSwitchMarket$1) continuation;
            int i2 = switchMarketLoadingActivity$startSwitchMarket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                switchMarketLoadingActivity$startSwitchMarket$1.label = i2 - Integer.MIN_VALUE;
            } else {
                switchMarketLoadingActivity$startSwitchMarket$1 = new SwitchMarketLoadingActivity$startSwitchMarket$1(this, continuation);
            }
        }
        SwitchMarketLoadingActivity$startSwitchMarket$1 switchMarketLoadingActivity$startSwitchMarket$12 = switchMarketLoadingActivity$startSwitchMarket$1;
        java.lang.Object obj = switchMarketLoadingActivity$startSwitchMarket$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = switchMarketLoadingActivity$startSwitchMarket$12.label;
        C32553mfk c32553mfk = null;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl(getTAG(), "startSwitchMarket, start. newUnit:" + languageUnit + ", maxSwitchCount:" + i + ", requestKey:" + str);
            OLrzqt(true);
            SwitchMarketLoadingActivity$startSwitchMarket$finishCallback$1 switchMarketLoadingActivity$startSwitchMarket$finishCallback$1 = new SwitchMarketLoadingActivity$startSwitchMarket$finishCallback$1(this, str, null);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new SwitchMarketLoadingActivity$startSwitchMarket$job$1(i, this, ptu, languageUnit, switchMarketLoadingActivity$startSwitchMarket$finishCallback$1, booleanRef2, null), 3, null);
            switchMarketLoadingActivity$startSwitchMarket$12.L$0 = this;
            ptu2 = ptu;
            switchMarketLoadingActivity$startSwitchMarket$12.L$1 = ptu2;
            switchMarketLoadingActivity$startSwitchMarket$12.L$2 = languageUnit;
            switchMarketLoadingActivity$startSwitchMarket$12.L$3 = switchMarketLoadingActivity$startSwitchMarket$finishCallback$1;
            switchMarketLoadingActivity$startSwitchMarket$12.L$4 = booleanRef2;
            switchMarketLoadingActivity$startSwitchMarket$12.label = 1;
            if (jobLaunch$default.join(switchMarketLoadingActivity$startSwitchMarket$12) == objCopydefault) {
                return objCopydefault;
            }
            activityC32554mfl = this;
            languageUnit2 = languageUnit;
            booleanRef = booleanRef2;
            function2 = switchMarketLoadingActivity$startSwitchMarket$finishCallback$1;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            booleanRef = (Ref.BooleanRef) switchMarketLoadingActivity$startSwitchMarket$12.L$4;
            function2 = (Function2) switchMarketLoadingActivity$startSwitchMarket$12.L$3;
            languageUnit2 = (LanguageUnit) switchMarketLoadingActivity$startSwitchMarket$12.L$2;
            pTU ptu3 = (pTU) switchMarketLoadingActivity$startSwitchMarket$12.L$1;
            activityC32554mfl = (ActivityC32554mfl) switchMarketLoadingActivity$startSwitchMarket$12.L$0;
            C56391yDq.AEQbTJ(obj);
            ptu2 = ptu3;
        }
        if (booleanRef.element) {
            return Unit.INSTANCE;
        }
        if (activityC32554mfl.isFinishing() || activityC32554mfl.isDestroyed()) {
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
            switchMarketLoadingActivity$startSwitchMarket$12.L$0 = null;
            switchMarketLoadingActivity$startSwitchMarket$12.L$1 = null;
            switchMarketLoadingActivity$startSwitchMarket$12.L$2 = null;
            switchMarketLoadingActivity$startSwitchMarket$12.L$3 = null;
            switchMarketLoadingActivity$startSwitchMarket$12.L$4 = null;
            switchMarketLoadingActivity$startSwitchMarket$12.label = 2;
            if (function2.invoke(boolKWHzl, switchMarketLoadingActivity$startSwitchMarket$12) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        activityC32554mfl.OLrzqt(false);
        C32553mfk c32553mfk2 = activityC32554mfl.AEQbTJ;
        if (c32553mfk2 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk2 = null;
        }
        c32553mfk2.AEQbTJ.AEQbTJ().setVisibility(8);
        C32553mfk c32553mfk3 = activityC32554mfl.AEQbTJ;
        if (c32553mfk3 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk3 = null;
        }
        c32553mfk3.AEQbTJ.setStatus(5);
        C32553mfk c32553mfk4 = activityC32554mfl.AEQbTJ;
        if (c32553mfk4 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk4 = null;
        }
        c32553mfk4.AEQbTJ.setTitleText(activityC32554mfl.getString(C32549mfg.StateListAnimator.valueOf));
        C32553mfk c32553mfk5 = activityC32554mfl.AEQbTJ;
        if (c32553mfk5 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk5 = null;
        }
        c32553mfk5.AEQbTJ.setSubTitleText(activityC32554mfl.getString(C32549mfg.StateListAnimator.KWHzl));
        C32553mfk c32553mfk6 = activityC32554mfl.AEQbTJ;
        if (c32553mfk6 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk6 = null;
        }
        c32553mfk6.AEQbTJ.OLrzqt().setType(5);
        C32553mfk c32553mfk7 = activityC32554mfl.AEQbTJ;
        if (c32553mfk7 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk7 = null;
        }
        C52794wYp c52794wYpCopydefault = c32553mfk7.AEQbTJ.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(activityC32554mfl.getString(C32549mfg.StateListAnimator.OLrzqt));
        }
        C32553mfk c32553mfk8 = activityC32554mfl.AEQbTJ;
        if (c32553mfk8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32553mfk = c32553mfk8;
        }
        C52794wYp c52794wYpCopydefault2 = c32553mfk.AEQbTJ.OLrzqt().copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.mfn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC32554mfl.OLrzqt(this.KWHzl, ptu2, languageUnit2, function2, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC32554mfl activityC32554mfl, pTU ptu, LanguageUnit languageUnit, Function2 function2, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(activityC32554mfl.AYXKKw, null, null, new SwitchMarketLoadingActivity$startSwitchMarket$3$1(activityC32554mfl, ptu, languageUnit, function2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(pTU ptu, LanguageUnit languageUnit, long j, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        SwitchMarketLoadingActivity$startSwitchOnce$1 switchMarketLoadingActivity$startSwitchOnce$1;
        long jElapsedRealtime;
        long j2;
        ActivityC32554mfl activityC32554mfl;
        boolean zBooleanValue;
        boolean z;
        ActivityC32554mfl activityC32554mfl2;
        if (continuation instanceof SwitchMarketLoadingActivity$startSwitchOnce$1) {
            switchMarketLoadingActivity$startSwitchOnce$1 = (SwitchMarketLoadingActivity$startSwitchOnce$1) continuation;
            int i = switchMarketLoadingActivity$startSwitchOnce$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                switchMarketLoadingActivity$startSwitchOnce$1.label = i - Integer.MIN_VALUE;
            } else {
                switchMarketLoadingActivity$startSwitchOnce$1 = new SwitchMarketLoadingActivity$startSwitchOnce$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = switchMarketLoadingActivity$startSwitchOnce$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = switchMarketLoadingActivity$startSwitchOnce$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            OLrzqt(true);
            LangChangeConfig langChangeConfig = new LangChangeConfig(LanguageListConfig.NO_CHECK, LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED, null, false, 12, null);
            switchMarketLoadingActivity$startSwitchOnce$1.L$0 = this;
            j2 = j;
            switchMarketLoadingActivity$startSwitchOnce$1.J$0 = j2;
            switchMarketLoadingActivity$startSwitchOnce$1.J$1 = jElapsedRealtime;
            switchMarketLoadingActivity$startSwitchOnce$1.label = 1;
            objOLrzqt = ptu.OLrzqt(languageUnit, langChangeConfig, switchMarketLoadingActivity$startSwitchOnce$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            activityC32554mfl = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = switchMarketLoadingActivity$startSwitchOnce$1.Z$0;
                activityC32554mfl2 = (ActivityC32554mfl) switchMarketLoadingActivity$startSwitchOnce$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                activityC32554mfl = activityC32554mfl2;
                zBooleanValue = z;
                if (!zBooleanValue) {
                    return C56443yFo.KWHzl(true);
                }
                activityC32554mfl.OLrzqt(false);
                return C56443yFo.KWHzl(false);
            }
            jElapsedRealtime = switchMarketLoadingActivity$startSwitchOnce$1.J$1;
            j2 = switchMarketLoadingActivity$startSwitchOnce$1.J$0;
            activityC32554mfl = (ActivityC32554mfl) switchMarketLoadingActivity$startSwitchOnce$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        zBooleanValue = ((java.lang.Boolean) objOLrzqt).booleanValue();
        long jAbs = java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (jAbs < j2) {
            switchMarketLoadingActivity$startSwitchOnce$1.L$0 = activityC32554mfl;
            switchMarketLoadingActivity$startSwitchOnce$1.Z$0 = zBooleanValue;
            switchMarketLoadingActivity$startSwitchOnce$1.label = 2;
            if (DelayKt.delay(j2 - jAbs, switchMarketLoadingActivity$startSwitchOnce$1) == objCopydefault) {
                return objCopydefault;
            }
            z = zBooleanValue;
            activityC32554mfl2 = activityC32554mfl;
            activityC32554mfl = activityC32554mfl2;
            zBooleanValue = z;
        }
        if (!zBooleanValue) {
        }
    }

    public final void OLrzqt(boolean z) {
        C32553mfk c32553mfk = null;
        if (z) {
            C32553mfk c32553mfk2 = this.AEQbTJ;
            if (c32553mfk2 == null) {
                Intrinsics.gEmmrt("");
                c32553mfk2 = null;
            }
            c32553mfk2.KWHzl.setVisibility(0);
            C32553mfk c32553mfk3 = this.AEQbTJ;
            if (c32553mfk3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c32553mfk = c32553mfk3;
            }
            c32553mfk.OLrzqt.setVisibility(8);
            return;
        }
        C32553mfk c32553mfk4 = this.AEQbTJ;
        if (c32553mfk4 == null) {
            Intrinsics.gEmmrt("");
            c32553mfk4 = null;
        }
        c32553mfk4.KWHzl.setVisibility(8);
        C32553mfk c32553mfk5 = this.AEQbTJ;
        if (c32553mfk5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32553mfk = c32553mfk5;
        }
        c32553mfk.OLrzqt.setVisibility(0);
    }

    /* JADX INFO: renamed from: o.mfl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32554mfl.class);
            intent.addFlags(268435456);
            intent.putExtra("market", str);
            intent.putExtra(AppLocaleInfo.KEY_LANGUAGE_CODE, str2);
            intent.putExtra("maxSwitchCount", i);
            intent.putExtra("switchMarketRequestKey", str3);
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
