package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.SsoClient$Companion$finalizeConfig$1;
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
public interface MovementMethod extends InterfaceC57154yd {
    public static final StateListAnimator AYXKKw = StateListAnimator.KWHzl;

    java.lang.Object copydefault(@NotNull SparseArray sparseArray, @NotNull Continuation<? super AttributeSet> continuation);

    public static final class StateListAnimator extends IOError<TaskDescription, TaskDescription.StateListAnimator, MovementMethod, Activity> {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity EZpvd() {
            return new Activity();
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.FilterWriter.resolveEndpointUrl$default(o.HH, java.lang.String, java.lang.String, java.lang.String, o.HL, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull Activity activity, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            SsoClient$Companion$finalizeConfig$1 ssoClient$Companion$finalizeConfig$1;
            TaskDescription.StateListAnimator stateListAnimatorEZpvd;
            DL dlAkhnZx;
            Activity activity2;
            TaskDescription.StateListAnimator stateListAnimator;
            if (continuation instanceof SsoClient$Companion$finalizeConfig$1) {
                ssoClient$Companion$finalizeConfig$1 = (SsoClient$Companion$finalizeConfig$1) continuation;
                int i = ssoClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ssoClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    ssoClient$Companion$finalizeConfig$1 = new SsoClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            SsoClient$Companion$finalizeConfig$1 ssoClient$Companion$finalizeConfig$12 = ssoClient$Companion$finalizeConfig$1;
            java.lang.Object obj = ssoClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = ssoClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                stateListAnimatorEZpvd = activity.EZpvd();
                dlAkhnZx = activity.EZpvd().AkhnZx();
                if (dlAkhnZx == null) {
                    ssoClient$Companion$finalizeConfig$12.L$0 = activity;
                    ssoClient$Companion$finalizeConfig$12.L$1 = stateListAnimatorEZpvd;
                    ssoClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Sso", "SSO", "sso", null, ssoClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    activity2 = activity;
                    stateListAnimator = stateListAnimatorEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                stateListAnimatorEZpvd.EZpvd(dlAkhnZx);
                activity.EZpvd().fetchVPNInfo().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (TaskDescription.StateListAnimator) ssoClient$Companion$finalizeConfig$12.L$1;
            activity2 = (Activity) ssoClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlAkhnZx = (DL) obj;
            stateListAnimatorEZpvd = stateListAnimator;
            activity = activity2;
            stateListAnimatorEZpvd.EZpvd(dlAkhnZx);
            activity.EZpvd().fetchVPNInfo().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class Activity extends AbstractC54698xS<TaskDescription, TaskDescription.StateListAnimator, MovementMethod> {
        public final TaskDescription.StateListAnimator AEQbTJ = new TaskDescription.StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TaskDescription.StateListAnimator EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public MovementMethod copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new Params(taskDescription);
        }
    }

    public static final class TaskDescription implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final Application AEQbTJ = new Application(null);
        public final java.lang.String AYXKKw;
        public final DL AhwBna;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx;
        public final FZ DbNXlk;
        public final /* synthetic */ InterfaceC57207ye EZpvd;
        public final /* synthetic */ InterfaceC3338Ak KWHzl;
        public final java.lang.String OLrzqt;
        public final TransformationMethod copydefault;
        public final URLSpan djBIcL;
        public final boolean ejfBZ;
        public final boolean fIwbmz;
        public final InterfaceC5093El<java.lang.Object> fetchVPNInfo;
        public final java.util.List<InterfaceC2861Ab> gEmmrt;
        public final java.lang.String isConnected;
        public final InterfaceC52805wZ valueOf;
        public final AbstractC54779xV values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MovementMethod$TaskDescription$StateListAnimator) A[MD:(o.MovementMethod$TaskDescription$StateListAnimator):void (m)] call: o.MovementMethod.TaskDescription.<init>(o.MovementMethod$TaskDescription$StateListAnimator):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
            this(stateListAnimator);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV AYXKKw() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransformationMethod EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.KWHzl.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean ejfBZ() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.EZpvd.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final URLSpan gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> valueOf() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean values() {
            return this.fIwbmz;
        }

        public TaskDescription(StateListAnimator stateListAnimator) {
            this.KWHzl = stateListAnimator.copydefault();
            this.EZpvd = stateListAnimator.AEQbTJ();
            this.AYXKKw = stateListAnimator.AhwBna();
            this.isConnected = stateListAnimator.values();
            this.gEmmrt = stateListAnimator.djBIcL();
            InterfaceC52805wZ interfaceC52805wZGEmmrt = stateListAnimator.gEmmrt();
            this.valueOf = interfaceC52805wZGEmmrt == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), AkhnZx(), 3, null)) : interfaceC52805wZGEmmrt;
            URLSpan uRLSpanValueOf = stateListAnimator.valueOf();
            this.djBIcL = uRLSpanValueOf == null ? new ClickableSpan() : uRLSpanValueOf;
            this.AhwBna = stateListAnimator.AkhnZx();
            this.AkhnZx = stateListAnimator.fetchVPNInfo();
            AbstractC54779xV abstractC54779xVDbNXlk = stateListAnimator.DbNXlk();
            this.values = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElIsConnected = stateListAnimator.isConnected();
            this.fetchVPNInfo = interfaceC5093ElIsConnected == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElIsConnected;
            FZ fzAuCTel = stateListAnimator.AuCTel();
            this.DbNXlk = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = stateListAnimator.fIwbmz();
            this.fIwbmz = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = stateListAnimator.fJNWhG();
            this.ejfBZ = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.OLrzqt = stateListAnimator.EZpvd();
            TransformationMethod transformationMethodAYXKKw = stateListAnimator.AYXKKw();
            this.copydefault = transformationMethodAYXKKw == null ? new KeyListener(null, 1, 0 == true ? 1 : 0) : transformationMethodAYXKKw;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MovementMethod.TaskDescription.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static final class StateListAnimator implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<TaskDescription>, InterfaceC5134Ga.Activity {
            public java.lang.String AEQbTJ;
            public InterfaceC52805wZ AYXKKw;
            public URLSpan AhwBna;
            public java.lang.String AkhnZx;
            public java.lang.Boolean AuCTel;
            public java.lang.Boolean DbNXlk;
            public TransformationMethod OLrzqt;
            public AbstractC54779xV fetchVPNInfo;
            public FZ isConnected;
            public DL valueOf;
            public InterfaceC5093El<java.lang.Object> values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity EZpvd = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription copydefault = new C57260yf.TaskDescription();
            public java.lang.String gEmmrt = "SSO";
            public java.util.List<? extends InterfaceC2861Ab> KWHzl = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> djBIcL = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye AEQbTJ() {
                return this.copydefault.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void AEQbTJ(InterfaceC3972Aw interfaceC3972Aw) {
                this.EZpvd.copydefault(interfaceC3972Aw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TransformationMethod AYXKKw() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL AkhnZx() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.fetchVPNInfo;
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
                this.EZpvd.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(DL dl) {
                this.valueOf = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.DbNXlk = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.EZpvd.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.copydefault.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.fetchVPNInfo = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.AkhnZx = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void OLrzqt(FZ fz) {
                this.isConnected = fz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak copydefault() {
                return this.EZpvd.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.AuCTel = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.AEQbTJ = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> djBIcL() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.AuCTel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ gEmmrt() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> isConnected() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final URLSpan valueOf() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public TaskDescription OLrzqt() {
                return new TaskDescription(this, null);
            }
        }
    }
}
