package o;

import aws.sdk.kotlin.services.cognitoidentity.CognitoIdentityClient$Companion$finalizeConfig$1;
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

/* JADX INFO: loaded from: classes2.dex */
public interface Character extends InterfaceC57154yd {
    public static final Application OLrzqt = Application.EZpvd;

    java.lang.Object AEQbTJ(@NotNull IllegalAccessError illegalAccessError, @NotNull Continuation<? super IllegalThreadStateException> continuation);

    java.lang.Object EZpvd(@NotNull IllegalMonitorStateException illegalMonitorStateException, @NotNull Continuation<? super IllegalArgumentException> continuation);

    java.lang.Object KWHzl(@NotNull LinkageError linkageError, @NotNull Continuation<? super Long> continuation);

    public static final class Application extends IOError<Activity, Activity.TaskDescription, Character, TaskDescription> {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TaskDescription EZpvd() {
            return new TaskDescription();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull TaskDescription taskDescription, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            CognitoIdentityClient$Companion$finalizeConfig$1 cognitoIdentityClient$Companion$finalizeConfig$1;
            Activity.TaskDescription taskDescriptionEZpvd;
            DL dlFetchVPNInfo;
            TaskDescription taskDescription2;
            Activity.TaskDescription taskDescription3;
            if (continuation instanceof CognitoIdentityClient$Companion$finalizeConfig$1) {
                cognitoIdentityClient$Companion$finalizeConfig$1 = (CognitoIdentityClient$Companion$finalizeConfig$1) continuation;
                int i = cognitoIdentityClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cognitoIdentityClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    cognitoIdentityClient$Companion$finalizeConfig$1 = new CognitoIdentityClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            CognitoIdentityClient$Companion$finalizeConfig$1 cognitoIdentityClient$Companion$finalizeConfig$12 = cognitoIdentityClient$Companion$finalizeConfig$1;
            java.lang.Object obj = cognitoIdentityClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = cognitoIdentityClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                taskDescriptionEZpvd = taskDescription.EZpvd();
                dlFetchVPNInfo = taskDescription.EZpvd().fetchVPNInfo();
                if (dlFetchVPNInfo == null) {
                    cognitoIdentityClient$Companion$finalizeConfig$12.L$0 = taskDescription;
                    cognitoIdentityClient$Companion$finalizeConfig$12.L$1 = taskDescriptionEZpvd;
                    cognitoIdentityClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "CognitoIdentity", "COGNITO_IDENTITY", "cognito_identity", null, cognitoIdentityClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    taskDescription2 = taskDescription;
                    taskDescription3 = taskDescriptionEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                taskDescriptionEZpvd.OLrzqt(dlFetchVPNInfo);
                taskDescription.EZpvd().isConnected().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription3 = (Activity.TaskDescription) cognitoIdentityClient$Companion$finalizeConfig$12.L$1;
            taskDescription2 = (TaskDescription) cognitoIdentityClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlFetchVPNInfo = (DL) obj;
            taskDescriptionEZpvd = taskDescription3;
            taskDescription = taskDescription2;
            taskDescriptionEZpvd.OLrzqt(dlFetchVPNInfo);
            taskDescription.EZpvd().isConnected().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription extends AbstractC54698xS<Activity, Activity.TaskDescription, Character> {
        public final Activity.TaskDescription OLrzqt = new Activity.TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Activity.TaskDescription EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        public Character copydefault(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return new BootstrapMethodError(activity);
        }
    }

    public static final class Activity implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final C0797Activity EZpvd = new C0797Activity(null);
        public final CharSequence AEQbTJ;
        public final java.lang.String AYXKKw;
        public final DL AhwBna;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx;
        public final boolean AuCTel;
        public final java.lang.String DbNXlk;
        public final /* synthetic */ InterfaceC3338Ak KWHzl;
        public final java.lang.String OLrzqt;
        public final /* synthetic */ InterfaceC57207ye copydefault;
        public final java.util.List<InterfaceC2861Ab> djBIcL;
        public final boolean fARcdN;
        public final InterfaceC5093El<java.lang.Object> fetchVPNInfo;
        public final UnicodeScript gEmmrt;
        public final AbstractC54779xV isConnected;
        public final InterfaceC52805wZ valueOf;
        public final FZ values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Character$Activity$TaskDescription) A[MD:(o.Character$Activity$TaskDescription):void (m)] call: o.Character.Activity.<init>(o.Character$Activity$TaskDescription):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
            this(taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV AYXKKw() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AhwBna() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.KWHzl.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fIwbmz() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.copydefault.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnicodeScript gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isConnected() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String values() {
            return this.DbNXlk;
        }

        public Activity(TaskDescription taskDescription) {
            this.KWHzl = taskDescription.KWHzl();
            this.copydefault = taskDescription.AEQbTJ();
            this.AYXKKw = taskDescription.valueOf();
            this.DbNXlk = taskDescription.values();
            this.djBIcL = taskDescription.djBIcL();
            InterfaceC52805wZ interfaceC52805wZAhwBna = taskDescription.AhwBna();
            this.valueOf = interfaceC52805wZAhwBna == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), values(), 3, null)) : interfaceC52805wZAhwBna;
            UnicodeScript unicodeScriptGEmmrt = taskDescription.gEmmrt();
            this.gEmmrt = unicodeScriptGEmmrt == null ? new Class() : unicodeScriptGEmmrt;
            this.AhwBna = taskDescription.fetchVPNInfo();
            this.AkhnZx = taskDescription.isConnected();
            AbstractC54779xV abstractC54779xVDbNXlk = taskDescription.DbNXlk();
            this.isConnected = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElAkhnZx = taskDescription.AkhnZx();
            this.fetchVPNInfo = interfaceC5093ElAkhnZx == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElAkhnZx;
            FZ fzAuCTel = taskDescription.AuCTel();
            this.values = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = taskDescription.fIwbmz();
            this.fARcdN = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = taskDescription.fJNWhG();
            this.AuCTel = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.OLrzqt = taskDescription.EZpvd();
            CharSequence charSequenceAYXKKw = taskDescription.AYXKKw();
            this.AEQbTJ = charSequenceAYXKKw == null ? new UnicodeBlock(null, 1, 0 == true ? 1 : 0) : charSequenceAYXKKw;
        }

        /* JADX INFO: renamed from: o.Character$Activity$Activity, reason: collision with other inner class name */
        public static final class C0797Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Character.Activity.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0797Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0797Activity() {
            }
        }

        public static final class TaskDescription implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<Activity>, InterfaceC5134Ga.Activity {
            public java.lang.String AEQbTJ;
            public InterfaceC52805wZ AYXKKw;
            public UnicodeScript AhwBna;
            public AbstractC54779xV AkhnZx;
            public java.lang.String DbNXlk;
            public CharSequence KWHzl;
            public java.lang.Boolean fARcdN;
            public java.lang.Boolean fetchVPNInfo;
            public DL gEmmrt;
            public InterfaceC5093El<java.lang.Object> isConnected;
            public FZ values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity copydefault = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription OLrzqt = new C57260yf.TaskDescription();
            public java.lang.String djBIcL = "Cognito Identity";
            public java.util.List<? extends InterfaceC2861Ab> EZpvd = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> valueOf = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye AEQbTJ() {
                return this.OLrzqt.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void AEQbTJ(InterfaceC3972Aw interfaceC3972Aw) {
                this.copydefault.copydefault(interfaceC3972Aw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CharSequence AYXKKw() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ AhwBna() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> AkhnZx() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.AkhnZx;
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
                this.copydefault.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak KWHzl() {
                return this.copydefault.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.fetchVPNInfo = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.OLrzqt.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.AkhnZx = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.DbNXlk = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void OLrzqt(DL dl) {
                this.gEmmrt = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.fARcdN = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.AEQbTJ = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> djBIcL() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fARcdN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL fetchVPNInfo() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnicodeScript gEmmrt() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String valueOf() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public Activity OLrzqt() {
                return new Activity(this, null);
            }
        }
    }
}
