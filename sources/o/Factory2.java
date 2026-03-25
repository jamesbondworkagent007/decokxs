package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.SsoOidcClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C57260yf;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface Factory2 extends InterfaceC57154yd {
    public static final ActionBar gEmmrt = ActionBar.OLrzqt;

    java.lang.Object EZpvd(@NotNull OnContextClickListener onContextClickListener, @NotNull Continuation<? super OnCapturedPointerListener> continuation);

    public static final class ActionBar extends IOError<Application, Application.Activity, Factory2, StateListAnimator> {
        public static final /* synthetic */ ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator EZpvd() {
            return new StateListAnimator();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            SsoOidcClient$Companion$finalizeConfig$1 ssoOidcClient$Companion$finalizeConfig$1;
            Application.Activity activityEZpvd;
            DL dlAkhnZx;
            StateListAnimator stateListAnimator2;
            Application.Activity activity;
            if (continuation instanceof SsoOidcClient$Companion$finalizeConfig$1) {
                ssoOidcClient$Companion$finalizeConfig$1 = (SsoOidcClient$Companion$finalizeConfig$1) continuation;
                int i = ssoOidcClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ssoOidcClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    ssoOidcClient$Companion$finalizeConfig$1 = new SsoOidcClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            SsoOidcClient$Companion$finalizeConfig$1 ssoOidcClient$Companion$finalizeConfig$12 = ssoOidcClient$Companion$finalizeConfig$1;
            java.lang.Object obj = ssoOidcClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = ssoOidcClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                activityEZpvd = stateListAnimator.EZpvd();
                dlAkhnZx = stateListAnimator.EZpvd().AkhnZx();
                if (dlAkhnZx == null) {
                    ssoOidcClient$Companion$finalizeConfig$12.L$0 = stateListAnimator;
                    ssoOidcClient$Companion$finalizeConfig$12.L$1 = activityEZpvd;
                    ssoOidcClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "SsoOidc", "SSO_OIDC", "sso_oidc", null, ssoOidcClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    stateListAnimator2 = stateListAnimator;
                    activity = activityEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                activityEZpvd.KWHzl(dlAkhnZx);
                stateListAnimator.EZpvd().isConnected().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Application.Activity) ssoOidcClient$Companion$finalizeConfig$12.L$1;
            stateListAnimator2 = (StateListAnimator) ssoOidcClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlAkhnZx = (DL) obj;
            activityEZpvd = activity;
            stateListAnimator = stateListAnimator2;
            activityEZpvd.KWHzl(dlAkhnZx);
            stateListAnimator.EZpvd().isConnected().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator extends AbstractC54698xS<Application, Application.Activity, Factory2> {
        public final Application.Activity AEQbTJ = new Application.Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application.Activity EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Factory2 copydefault(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return new MenuInflater(application);
        }
    }

    public static final class Application implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final StateListAnimator OLrzqt = new StateListAnimator(null);
        public final /* synthetic */ InterfaceC57207ye AEQbTJ;
        public final DL AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final AbstractC54779xV DbNXlk;
        public final /* synthetic */ InterfaceC3338Ak EZpvd;
        public final TouchDelegate KWHzl;
        public final java.lang.String copydefault;
        public final InterfaceC52805wZ djBIcL;
        public final boolean ejfBZ;
        public final boolean fJNWhG;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo;
        public final OnApplyWindowInsetsListener gEmmrt;
        public final FZ isConnected;
        public final java.util.List<InterfaceC2861Ab> valueOf;
        public final InterfaceC5093El<java.lang.Object> values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Factory2$Application$Activity) A[MD:(o.Factory2$Application$Activity):void (m)] call: o.Factory2.Application.<init>(o.Factory2$Application$Activity):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
            this(activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnApplyWindowInsetsListener AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean DbNXlk() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TouchDelegate OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.EZpvd.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fARcdN() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.AEQbTJ.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV valueOf() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> values() {
            return this.values;
        }

        public Application(Activity activity) {
            this.EZpvd = activity.AEQbTJ();
            this.AEQbTJ = activity.copydefault();
            this.AhwBna = activity.AhwBna();
            this.AkhnZx = activity.values();
            this.valueOf = activity.gEmmrt();
            InterfaceC52805wZ interfaceC52805wZValueOf = activity.valueOf();
            this.djBIcL = interfaceC52805wZValueOf == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), isConnected(), 3, null)) : interfaceC52805wZValueOf;
            OnApplyWindowInsetsListener onApplyWindowInsetsListenerAYXKKw = activity.AYXKKw();
            this.gEmmrt = onApplyWindowInsetsListenerAYXKKw == null ? new SearchEvent() : onApplyWindowInsetsListenerAYXKKw;
            this.AYXKKw = activity.AkhnZx();
            this.fetchVPNInfo = activity.isConnected();
            AbstractC54779xV abstractC54779xVDbNXlk = activity.DbNXlk();
            this.DbNXlk = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElFetchVPNInfo = activity.fetchVPNInfo();
            this.values = interfaceC5093ElFetchVPNInfo == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElFetchVPNInfo;
            FZ fzAuCTel = activity.AuCTel();
            this.isConnected = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = activity.fIwbmz();
            this.ejfBZ = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = activity.fJNWhG();
            this.fJNWhG = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.copydefault = activity.EZpvd();
            TouchDelegate touchDelegateDjBIcL = activity.djBIcL();
            this.KWHzl = touchDelegateDjBIcL == null ? new Menu(null, 1, 0 == true ? 1 : 0) : touchDelegateDjBIcL;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Factory2.Application.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }

        public static final class Activity implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<Application>, InterfaceC5134Ga.Activity {
            public java.lang.String AEQbTJ;
            public InterfaceC52805wZ AhwBna;
            public java.lang.Boolean AkhnZx;
            public java.lang.String DbNXlk;
            public TouchDelegate KWHzl;
            public DL djBIcL;
            public java.lang.Boolean fJNWhG;
            public FZ fetchVPNInfo;
            public AbstractC54779xV isConnected;
            public OnApplyWindowInsetsListener valueOf;
            public InterfaceC5093El<java.lang.Object> values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity OLrzqt = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription copydefault = new C57260yf.TaskDescription();
            public java.lang.String gEmmrt = "SSO OIDC";
            public java.util.List<? extends InterfaceC2861Ab> EZpvd = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AYXKKw = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak AEQbTJ() {
                return this.OLrzqt.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OnApplyWindowInsetsListener AYXKKw() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL AkhnZx() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.OLrzqt.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.AkhnZx = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.OLrzqt.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void KWHzl(InterfaceC3972Aw interfaceC3972Aw) {
                this.OLrzqt.copydefault(interfaceC3972Aw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void KWHzl(DL dl) {
                this.djBIcL = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.copydefault.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.isConnected = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.DbNXlk = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye copydefault() {
                return this.copydefault.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.fJNWhG = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.AEQbTJ = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void copydefault(FZ fz) {
                this.fetchVPNInfo = fz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TouchDelegate djBIcL() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fJNWhG;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> fetchVPNInfo() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> gEmmrt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ valueOf() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Application OLrzqt() {
                return new Application(this, null);
            }
        }
    }
}
