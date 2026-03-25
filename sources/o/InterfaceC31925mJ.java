package o;

import aws.sdk.kotlin.services.textract.TextractClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C37079on;
import o.C37132oo;
import o.C57260yf;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57154yd;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC31925mJ extends InterfaceC57154yd {
    public static final Activity gEmmrt = Activity.EZpvd;

    java.lang.Object EZpvd(@NotNull C37079on c37079on, @NotNull Continuation<? super C37185op> continuation);

    java.lang.Object KWHzl(@NotNull C37132oo c37132oo, @NotNull Continuation<? super C37026om> continuation);

    java.lang.Object OLrzqt(@NotNull C34437nc c34437nc, @NotNull Continuation<? super C34384nb> continuation);

    /* JADX INFO: renamed from: o.mJ$Activity */
    public static final class Activity extends IOError<StateListAnimator, StateListAnimator.TaskDescription, InterfaceC31925mJ, Application> {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }

        @Override // o.IOError
        public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(InterfaceC57154yd.StateListAnimator stateListAnimator, HH hh, HH hh2, Continuation continuation) {
            return AEQbTJ((Application) stateListAnimator, (HH<ObjectOutputStream>) hh, (HH<ObjectStreamField>) hh2, (Continuation<? super Unit>) continuation);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Application EZpvd() {
            return new Application();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull Application application, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TextractClient$Companion$finalizeConfig$1 textractClient$Companion$finalizeConfig$1;
            StateListAnimator.TaskDescription taskDescriptionEZpvd;
            DL dlIsConnected;
            Application application2;
            StateListAnimator.TaskDescription taskDescription;
            if (continuation instanceof TextractClient$Companion$finalizeConfig$1) {
                textractClient$Companion$finalizeConfig$1 = (TextractClient$Companion$finalizeConfig$1) continuation;
                int i = textractClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    textractClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    textractClient$Companion$finalizeConfig$1 = new TextractClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            TextractClient$Companion$finalizeConfig$1 textractClient$Companion$finalizeConfig$12 = textractClient$Companion$finalizeConfig$1;
            java.lang.Object obj = textractClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = textractClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                taskDescriptionEZpvd = application.EZpvd();
                dlIsConnected = application.EZpvd().isConnected();
                if (dlIsConnected == null) {
                    textractClient$Companion$finalizeConfig$12.L$0 = application;
                    textractClient$Companion$finalizeConfig$12.L$1 = taskDescriptionEZpvd;
                    textractClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Textract", "TEXTRACT", "textract", null, textractClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    application2 = application;
                    taskDescription = taskDescriptionEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                taskDescriptionEZpvd.KWHzl(dlIsConnected);
                application.EZpvd().fetchVPNInfo().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (StateListAnimator.TaskDescription) textractClient$Companion$finalizeConfig$12.L$1;
            application2 = (Application) textractClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlIsConnected = (DL) obj;
            taskDescriptionEZpvd = taskDescription;
            application = application2;
            taskDescriptionEZpvd.KWHzl(dlIsConnected);
            application.EZpvd().fetchVPNInfo().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mJ$Application */
    public static final class Application extends AbstractC54698xS<StateListAnimator, StateListAnimator.TaskDescription, InterfaceC31925mJ> {
        public final StateListAnimator.TaskDescription KWHzl = new StateListAnimator.TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator.TaskDescription EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public InterfaceC31925mJ copydefault(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return new C31844mG(stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: o.mJ$StateListAnimator */
    public static final class StateListAnimator implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final Application EZpvd = new Application(null);
        public final /* synthetic */ InterfaceC57207ye AEQbTJ;
        public final java.util.List<InterfaceC2861Ab> AYXKKw;
        public final DL AhwBna;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx;
        public final boolean AuCTel;
        public final java.lang.String DbNXlk;
        public final java.lang.String KWHzl;
        public final InterfaceC32006mM OLrzqt;
        public final /* synthetic */ InterfaceC3338Ak copydefault;
        public final InterfaceC52805wZ djBIcL;
        public final FZ fARcdN;
        public final boolean fJNWhG;
        public final InterfaceC5093El<java.lang.Object> fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final AbstractC54779xV isConnected;
        public final InterfaceC32141mR valueOf;
        public final InterfaceC54806xW values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.mJ$StateListAnimator$TaskDescription) A[MD:(o.mJ$StateListAnimator$TaskDescription):void (m)] call: o.mJ.StateListAnimator.<init>(o.mJ$StateListAnimator$TaskDescription):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
            this(taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AYXKKw() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC54806xW AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC32006mM EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.copydefault.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fARcdN() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fJNWhG() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.AEQbTJ.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC32141mR gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ isConnected() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> values() {
            return this.fetchVPNInfo;
        }

        public StateListAnimator(TaskDescription taskDescription) {
            this.copydefault = taskDescription.copydefault();
            this.AEQbTJ = taskDescription.KWHzl();
            this.gEmmrt = taskDescription.djBIcL();
            this.DbNXlk = taskDescription.values();
            this.AYXKKw = taskDescription.valueOf();
            InterfaceC52805wZ interfaceC52805wZGEmmrt = taskDescription.gEmmrt();
            this.djBIcL = interfaceC52805wZGEmmrt == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), AkhnZx(), 3, null)) : interfaceC52805wZGEmmrt;
            InterfaceC32141mR interfaceC32141mRAhwBna = taskDescription.AhwBna();
            this.valueOf = interfaceC32141mRAhwBna == null ? new C31952mK() : interfaceC32141mRAhwBna;
            this.AhwBna = taskDescription.isConnected();
            InterfaceC54806xW interfaceC54806xWAkhnZx = taskDescription.AkhnZx();
            this.values = interfaceC54806xWAkhnZx == null ? InterfaceC54806xW.EZpvd.EZpvd() : interfaceC54806xWAkhnZx;
            this.AkhnZx = taskDescription.fetchVPNInfo();
            AbstractC54779xV abstractC54779xVDbNXlk = taskDescription.DbNXlk();
            this.isConnected = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElEjfBZ = taskDescription.ejfBZ();
            this.fetchVPNInfo = interfaceC5093ElEjfBZ == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElEjfBZ;
            FZ fzAuCTel = taskDescription.AuCTel();
            this.fARcdN = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = taskDescription.fIwbmz();
            this.AuCTel = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = taskDescription.fJNWhG();
            this.fJNWhG = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.KWHzl = taskDescription.EZpvd();
            InterfaceC32006mM interfaceC32006mMAYXKKw = taskDescription.AYXKKw();
            this.OLrzqt = interfaceC32006mMAYXKKw == null ? new C31898mI(null, 1, 0 == true ? 1 : 0) : interfaceC32006mMAYXKKw;
        }

        /* JADX INFO: renamed from: o.mJ$StateListAnimator$Application */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mJ.StateListAnimator.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.mJ$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<StateListAnimator>, InterfaceC5134Ga.Activity {
            public java.lang.String AEQbTJ;
            public DL AhwBna;
            public InterfaceC5093El<java.lang.Object> AkhnZx;
            public AbstractC54779xV DbNXlk;
            public InterfaceC32006mM EZpvd;
            public InterfaceC54806xW djBIcL;
            public java.lang.Boolean fIwbmz;
            public java.lang.Boolean fJNWhG;
            public java.lang.String fetchVPNInfo;
            public InterfaceC32141mR gEmmrt;
            public InterfaceC52805wZ valueOf;
            public FZ values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity copydefault = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription KWHzl = new C57260yf.TaskDescription();
            public java.lang.String AYXKKw = "Textract";
            public java.util.List<? extends InterfaceC2861Ab> OLrzqt = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC32006mM AYXKKw() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC32141mR AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC54806xW AkhnZx() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.DbNXlk;
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
            public InterfaceC57207ye KWHzl() {
                return this.KWHzl.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.fIwbmz = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void KWHzl(DL dl) {
                this.AhwBna = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.KWHzl.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void KWHzl(InterfaceC52805wZ interfaceC52805wZ) {
                this.valueOf = interfaceC52805wZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.DbNXlk = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.fetchVPNInfo = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak copydefault() {
                return this.copydefault.EZpvd();
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
            public java.lang.String djBIcL() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> ejfBZ() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fIwbmz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fJNWhG;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL isConnected() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> valueOf() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public StateListAnimator OLrzqt() {
                return new StateListAnimator(this, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.mJ$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object listAdapterVersions$default(InterfaceC31925mJ interfaceC31925mJ, C37132oo c37132oo, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listAdapterVersions");
            }
            if ((i & 1) != 0) {
                c37132oo = C37132oo.AEQbTJ.OLrzqt(new Function1<C37132oo.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.TextractClient$listAdapterVersions$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C37132oo.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C37132oo.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC31925mJ.KWHzl(c37132oo, continuation);
        }

        public static /* synthetic */ java.lang.Object listAdapters$default(InterfaceC31925mJ interfaceC31925mJ, C37079on c37079on, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listAdapters");
            }
            if ((i & 1) != 0) {
                c37079on = C37079on.KWHzl.KWHzl(new Function1<C37079on.Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.TextractClient$listAdapters$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C37079on.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C37079on.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC31925mJ.EZpvd(c37079on, continuation);
        }
    }
}
