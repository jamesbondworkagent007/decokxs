package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.im.imui.app.IMUIApplicationDelegate$observeAccountEvent$1;
import com.okinc.im.imui.app.IMUIApplicationDelegate$observeFeatureRestrictionEvent$1;
import com.okinc.im.imui.app.IMUIApplicationDelegate$observeImLifeCycle$1;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o.C35397nua;
import o.C35399nuc;
import o.InterfaceC46949tgn;
import o.ServiceC37177oos;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35397nua extends C43265rly {
    public Job OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final yIP<java.lang.Object, android.app.Application> copydefault = yIJ.OLrzqt.EZpvd();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nuo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.AuCTel();
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nuu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.fIwbmz();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nuv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.AxsJAY();
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nut
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.gHZMYf();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nug
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.AYXKKw(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nuf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35397nua.copydefault(this.OLrzqt);
        }
    });
    public final CoroutineScope EZpvd = CoroutineScopeKt.CoroutineScope(sDN.copydefault.copydefault());

    /* JADX INFO: renamed from: o.nua$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 310;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    @Override // o.C43265rly, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // o.C43265rly, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: o.nua$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ yJA<java.lang.Object>[] KWHzl = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(TaskDescription.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nua.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.app.Application OLrzqt() {
            return (android.app.Application) C35397nua.copydefault.getValue(this, KWHzl[0]);
        }

        public final void copydefault(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            C35397nua.copydefault.KWHzl(this, KWHzl[0], application);
        }

        public final android.app.Application KWHzl() {
            return OLrzqt();
        }
    }

    public static final C36425oai AuCTel() {
        return new C36425oai();
    }

    public final C36425oai OcIXYQ() {
        return (C36425oai) this.KWHzl.getValue();
    }

    public final C37209opX DTwDnp() {
        return (C37209opX) this.djBIcL.getValue();
    }

    public static final C37209opX fIwbmz() {
        return new C37209opX();
    }

    public final C37265oqa QKVWgx() {
        return (C37265oqa) this.gEmmrt.getValue();
    }

    public static final C37265oqa AxsJAY() {
        return new C37265oqa();
    }

    public final C37208opW ORxRYg() {
        return (C37208opW) this.valueOf.getValue();
    }

    public static final C37208opW gHZMYf() {
        return new C37208opW();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC47278tmy dNCPSb() {
        return (InterfaceC47278tmy) this.AYXKKw.getValue();
    }

    public static final InterfaceC47278tmy AYXKKw(C35397nua c35397nua) {
        return ((InterfaceC47230tmC) C58114yvF.OLrzqt(c35397nua.getApplication(), InterfaceC47230tmC.class)).fmB();
    }

    public final nFR QOLQEE() {
        return (nFR) this.AhwBna.getValue();
    }

    public static final nFR copydefault(C35397nua c35397nua) {
        return ((nFU) C58114yvF.OLrzqt(c35397nua.getApplication(), nFU.class)).OFhtUX();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.copydefault(getApplication());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC35180nqU.class, C56392yDr.copydefault(new Function0() { // from class: o.nud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.AuCTelauCTel();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35179nqT.class, C56392yDr.copydefault(new Function0() { // from class: o.nuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.zuBGHE();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35176nqQ.class, C56392yDr.copydefault(new Function0() { // from class: o.nun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.sSMYrx();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35174nqO.class, C56392yDr.copydefault(new Function0() { // from class: o.nuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.AwvSrB();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35175nqP.class, C56392yDr.copydefault(new Function0() { // from class: o.nui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.zLjUOn();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35177nqR.class, C56392yDr.copydefault(new Function0() { // from class: o.nuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.zsXlph();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC35173nqN.class, C56392yDr.copydefault(new Function0() { // from class: o.num
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.AubY();
            }
        }));
    }

    public static final C36392oaB AuCTelauCTel() {
        return new C36392oaB();
    }

    public static final C36426oaj zuBGHE() {
        return new C36426oaj();
    }

    public static final C36439oaw sSMYrx() {
        return new C36439oaw();
    }

    public static final C36423oag AwvSrB() {
        return new C36423oag();
    }

    public static final C36430oan zLjUOn() {
        return new C36430oan();
    }

    public static final C36438oav zsXlph() {
        return new C36438oav();
    }

    public static final C36429oam AubY() {
        return new C36429oam();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.KWHzl(InterfaceC33530myG.class, new oBU());
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.ntZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.hDKMBd();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.nue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.getNewProxyInstance();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.nuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.getFieldNames();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33251mst.class, C56392yDr.copydefault(new Function0() { // from class: o.nup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.uzCIH();
            }
        }));
        interfaceC43299rmf.EZpvd(rXE.class, C56392yDr.copydefault(new Function0() { // from class: o.nus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.iwGUEr();
            }
        }));
        interfaceC43299rmf.EZpvd(rXU.class, C56392yDr.copydefault(new Function0() { // from class: o.nur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35397nua.wlaJM();
            }
        }));
    }

    public static final C34057nPv hDKMBd() {
        return new C34057nPv();
    }

    public static final C34049nPn getNewProxyInstance() {
        return new C34049nPn();
    }

    public static final C35721oBf getFieldNames() {
        return new C35721oBf();
    }

    public static final C35343ntY uzCIH() {
        return new C35343ntY();
    }

    public static final C35170nqK iwGUEr() {
        return new C35170nqK();
    }

    public static final C35172nqM wlaJM() {
        return new C35172nqM();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        pUU.KWHzl("IMUIApplicationDelegate", "onCreate: start=" + java.lang.System.currentTimeMillis());
        boolean zEZpvd = C34704nhP.copydefault.EZpvd();
        pUU.KWHzl("IMUIApplicationDelegate", "onCreate: isOKCoin=" + zEZpvd + ", isOkxTR=" + C34703nhO.AEQbTJ());
        sDZ sdz = sDZ.AEQbTJ;
        sdz.fIwbmz().KWHzl(ORxRYg());
        if (!zEZpvd) {
            sdz.KWHzl();
        }
        sdz.EZpvd(OcIXYQ());
        C37127onv c37127onv = C37127onv.AEQbTJ;
        c37127onv.AYXKKw();
        C54819xWm.KWHzl().AEQbTJ(c37127onv.valueOf());
        if (!zEZpvd) {
            sdz.EZpvd(getApplication());
        }
        C46945tgj c46945tgj = C46945tgj.AEQbTJ;
        c46945tgj.djBIcL().EZpvd("im/message", DTwDnp());
        c46945tgj.djBIcL().EZpvd("im/video", new ActionBar());
        c46945tgj.djBIcL().EZpvd("im/voice", QKVWgx());
        pUU.KWHzl("IMUIApplicationDelegate", "onCreate: end=" + java.lang.System.currentTimeMillis());
        QbewEr();
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).EZpvd(new C37637oxb());
        C37761ozt.KWHzl.AEQbTJ();
        QVAiDq();
        QfsBiF();
        if (C34703nhO.AhwBna(Companion.OLrzqt())) {
            C34040nPe.showOrHide$default(C34040nPe.copydefault, false, 1, null);
        }
        RJOkX();
    }

    /* JADX INFO: renamed from: o.nua$ActionBar */
    public static final class ActionBar implements InterfaceC46949tgn {
        @Override // o.InterfaceC46949tgn
        public C46953tgr OLrzqt() {
            return InterfaceC46949tgn.StateListAnimator.copydefault(this);
        }

        @Override // o.InterfaceC46949tgn
        public void copydefault(C46952tgq c46952tgq) {
            Intrinsics.checkNotNullParameter(c46952tgq, "");
            C44124sEe.imLogNotification$default("on push notification [im/video], " + c46952tgq, null, 2, null);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        pUU.KWHzl("IMUIApplicationDelegate", "onLaunchComplete");
        QUSxYX();
    }

    public final void RJOkX() {
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        pUU.KWHzl("IMUIApplicationDelegate", "Start observe ImLifeCycleEvent");
        this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new IMUIApplicationDelegate$observeImLifeCycle$1(this, null), 3, null);
    }

    public final void QUSxYX() {
        java.util.List<InterfaceC35178nqS> listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
        if (listKWHzl != null) {
            for (InterfaceC35178nqS interfaceC35178nqS : listKWHzl) {
                pUU.KWHzl("TAG", "postImModuleLaunchCompleted: " + interfaceC35178nqS.getClass().getCanonicalName());
                interfaceC35178nqS.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.nua$Application */
    public static final class Application extends C32981mno {
        public Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(final android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            super.onActivityResumed(activity);
            if (activity instanceof FragmentActivity) {
                final C35397nua c35397nua = C35397nua.this;
                C37127onv.AEQbTJ.AEQbTJ().observe((LifecycleOwner) activity, new StateListAnimator(new Function1() { // from class: o.nuw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C35397nua.Application.copydefault(c35397nua, activity, (C32989mnw) obj);
                    }
                }));
            }
        }

        public static final Unit copydefault(C35397nua c35397nua, android.app.Activity activity, C32989mnw c32989mnw) {
            C44124sEe.imLogVoiceCall$default("activity event: " + c32989mnw, null, 2, null);
            ServiceC37177oos.Application application = (ServiceC37177oos.Application) c32989mnw.KWHzl();
            if (application != null) {
                if (application instanceof ServiceC37177oos.Application.StateListAnimator) {
                    c35397nua.copydefault((FragmentActivity) activity, ((ServiceC37177oos.Application.StateListAnimator) application).EZpvd()).show();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void QbewEr() {
        registerActivityLifecycleCallbacks(new Application());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        C35364ntt.OLrzqt(interfaceC43237rlW);
    }

    public final ViewOnClickListenerC54939xaY copydefault(FragmentActivity fragmentActivity, java.lang.String str) {
        java.lang.String displayName$default;
        sFU sfuEZpvd;
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        RelationInfo relationInfoKWHzl = (interfaceC35180nqU == null || (sfuEZpvd = interfaceC35180nqU.EZpvd()) == null) ? null : sfuEZpvd.KWHzl(str);
        if (relationInfoKWHzl == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            displayName$default = "";
        }
        android.content.res.Resources resources = Companion.KWHzl().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        java.lang.String strCopydefault = C33069mpW.copydefault(resources, C35399nuc.LoaderManager.QVAiDq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", displayName$default)));
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.setTitle(strCopydefault);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.QbewEr);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.DCUTEI, (View.OnClickListener) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public final void QVAiDq() {
        BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new IMUIApplicationDelegate$observeAccountEvent$1(this, null), 3, null);
    }

    public final void QfsBiF() {
        BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new IMUIApplicationDelegate$observeFeatureRestrictionEvent$1(null), 3, null);
        sDZ.AEQbTJ.EZpvd(((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.IM_HOMEPAGE), true);
    }
}
