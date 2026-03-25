package o;

import aws.sdk.kotlin.services.translate.TranslateClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C46024tF;
import o.C47541ts;
import o.C47647tu;
import o.C47859ty;
import o.C57260yf;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC44254sJ extends InterfaceC57154yd {
    public static final Activity gEmmrt = Activity.OLrzqt;

    java.lang.Object OLrzqt(@NotNull C47541ts c47541ts, @NotNull Continuation<? super C47753tw> continuation);

    java.lang.Object copydefault(@NotNull C46024tF c46024tF, @NotNull Continuation<? super C45970tD> continuation);

    java.lang.Object copydefault(@NotNull C47647tu c47647tu, @NotNull Continuation<? super C47492tr> continuation);

    java.lang.Object copydefault(@NotNull C47859ty c47859ty, @NotNull Continuation<? super C45888tA> continuation);

    java.lang.Object copydefault(@NotNull C48723ub c48723ub, @NotNull Continuation<? super C48776uc> continuation);

    /* JADX INFO: renamed from: o.sJ$Activity */
    public static final class Activity extends IOError<Application, Application.C0936Application, InterfaceC44254sJ, ActionBar> {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ActionBar EZpvd() {
            return new ActionBar();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull ActionBar actionBar, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TranslateClient$Companion$finalizeConfig$1 translateClient$Companion$finalizeConfig$1;
            Application.C0936Application c0936ApplicationEZpvd;
            DL dlIsConnected;
            ActionBar actionBar2;
            Application.C0936Application c0936Application;
            if (continuation instanceof TranslateClient$Companion$finalizeConfig$1) {
                translateClient$Companion$finalizeConfig$1 = (TranslateClient$Companion$finalizeConfig$1) continuation;
                int i = translateClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    translateClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    translateClient$Companion$finalizeConfig$1 = new TranslateClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            TranslateClient$Companion$finalizeConfig$1 translateClient$Companion$finalizeConfig$12 = translateClient$Companion$finalizeConfig$1;
            java.lang.Object obj = translateClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = translateClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                c0936ApplicationEZpvd = actionBar.EZpvd();
                dlIsConnected = actionBar.EZpvd().isConnected();
                if (dlIsConnected == null) {
                    translateClient$Companion$finalizeConfig$12.L$0 = actionBar;
                    translateClient$Companion$finalizeConfig$12.L$1 = c0936ApplicationEZpvd;
                    translateClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Translate", "TRANSLATE", "translate", null, translateClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    actionBar2 = actionBar;
                    c0936Application = c0936ApplicationEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                c0936ApplicationEZpvd.AEQbTJ(dlIsConnected);
                actionBar.EZpvd().AkhnZx().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0936Application = (Application.C0936Application) translateClient$Companion$finalizeConfig$12.L$1;
            actionBar2 = (ActionBar) translateClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlIsConnected = (DL) obj;
            c0936ApplicationEZpvd = c0936Application;
            actionBar = actionBar2;
            c0936ApplicationEZpvd.AEQbTJ(dlIsConnected);
            actionBar.EZpvd().AkhnZx().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.sJ$ActionBar */
    public static final class ActionBar extends AbstractC54698xS<Application, Application.C0936Application, InterfaceC44254sJ> {
        public final Application.C0936Application OLrzqt = new Application.C0936Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Application.C0936Application EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public InterfaceC44254sJ copydefault(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return new C44146sF(application);
        }
    }

    /* JADX INFO: renamed from: o.sJ$Application */
    public static final class Application implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final TaskDescription copydefault = new TaskDescription(null);
        public final /* synthetic */ InterfaceC57207ye AEQbTJ;
        public final InterfaceC44416sP AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> DbNXlk;
        public final java.lang.String EZpvd;
        public final InterfaceC44281sK KWHzl;
        public final /* synthetic */ InterfaceC3338Ak OLrzqt;
        public final DL djBIcL;
        public final FZ ejfBZ;
        public final boolean fARcdN;
        public final boolean fJNWhG;
        public final InterfaceC5093El<java.lang.Object> fetchVPNInfo;
        public final java.util.List<InterfaceC2861Ab> gEmmrt;
        public final AbstractC54779xV isConnected;
        public final InterfaceC52805wZ valueOf;
        public final InterfaceC54806xW values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.sJ$Application$Application) A[MD:(o.sJ$Application$Application):void (m)] call: o.sJ.Application.<init>(o.sJ$Application$Application):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(C0936Application c0936Application, DefaultConstructorMarker defaultConstructorMarker) {
            this(c0936Application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AYXKKw() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC54806xW AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC44281sK KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.OLrzqt.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fJNWhG() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.AEQbTJ.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC44416sP valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ values() {
            return this.ejfBZ;
        }

        public Application(C0936Application c0936Application) {
            this.OLrzqt = c0936Application.copydefault();
            this.AEQbTJ = c0936Application.AEQbTJ();
            this.AhwBna = c0936Application.gEmmrt();
            this.AkhnZx = c0936Application.values();
            this.gEmmrt = c0936Application.djBIcL();
            InterfaceC52805wZ interfaceC52805wZAYXKKw = c0936Application.AYXKKw();
            this.valueOf = interfaceC52805wZAYXKKw == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), DbNXlk(), 3, null)) : interfaceC52805wZAYXKKw;
            InterfaceC44416sP interfaceC44416sPValueOf = c0936Application.valueOf();
            this.AYXKKw = interfaceC44416sPValueOf == null ? new C44389sO() : interfaceC44416sPValueOf;
            this.djBIcL = c0936Application.isConnected();
            InterfaceC54806xW interfaceC54806xWFetchVPNInfo = c0936Application.fetchVPNInfo();
            this.values = interfaceC54806xWFetchVPNInfo == null ? InterfaceC54806xW.EZpvd.EZpvd() : interfaceC54806xWFetchVPNInfo;
            this.DbNXlk = c0936Application.AkhnZx();
            AbstractC54779xV abstractC54779xVDbNXlk = c0936Application.DbNXlk();
            this.isConnected = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElEjfBZ = c0936Application.ejfBZ();
            this.fetchVPNInfo = interfaceC5093ElEjfBZ == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElEjfBZ;
            FZ fzAuCTel = c0936Application.AuCTel();
            this.ejfBZ = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = c0936Application.fIwbmz();
            this.fJNWhG = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = c0936Application.fJNWhG();
            this.fARcdN = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.EZpvd = c0936Application.EZpvd();
            InterfaceC44281sK interfaceC44281sKAhwBna = c0936Application.AhwBna();
            this.KWHzl = interfaceC44281sKAhwBna == null ? new C44227sI(null, 1, 0 == true ? 1 : 0) : interfaceC44281sKAhwBna;
        }

        /* JADX INFO: renamed from: o.sJ$Application$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sJ.Application.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.sJ$Application$Application, reason: collision with other inner class name */
        public static final class C0936Application implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<Application>, InterfaceC5134Ga.Activity {
            public InterfaceC54806xW AYXKKw;
            public InterfaceC52805wZ AhwBna;
            public java.lang.String AkhnZx;
            public AbstractC54779xV DbNXlk;
            public java.lang.String KWHzl;
            public InterfaceC44281sK OLrzqt;
            public InterfaceC44416sP djBIcL;
            public java.lang.Boolean ejfBZ;
            public java.lang.Boolean fIwbmz;
            public DL gEmmrt;
            public InterfaceC5093El<java.lang.Object> isConnected;
            public FZ values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity EZpvd = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription AEQbTJ = new C57260yf.TaskDescription();
            public java.lang.String valueOf = "Translate";
            public java.util.List<? extends InterfaceC2861Ab> copydefault = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye AEQbTJ() {
                return this.AEQbTJ.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(DL dl) {
                this.gEmmrt = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ AYXKKw() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC44281sK AhwBna() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx() {
                return this.fetchVPNInfo;
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
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.EZpvd.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void EZpvd(InterfaceC52805wZ interfaceC52805wZ) {
                this.AhwBna = interfaceC52805wZ;
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
                this.EZpvd.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.AEQbTJ.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.DbNXlk = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.AkhnZx = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak copydefault() {
                return this.EZpvd.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.ejfBZ = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.KWHzl = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> djBIcL() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> ejfBZ() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fIwbmz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.ejfBZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC54806xW fetchVPNInfo() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL isConnected() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC44416sP valueOf() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Application OLrzqt() {
                return new Application(this, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.sJ$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object listLanguages$default(InterfaceC44254sJ interfaceC44254sJ, C47647tu c47647tu, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listLanguages");
            }
            if ((i & 1) != 0) {
                c47647tu = C47647tu.copydefault.KWHzl(new Function1<C47647tu.Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.TranslateClient$listLanguages$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C47647tu.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C47647tu.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC44254sJ.copydefault(c47647tu, (Continuation<? super C47492tr>) continuation);
        }

        public static /* synthetic */ java.lang.Object listParallelData$default(InterfaceC44254sJ interfaceC44254sJ, C47541ts c47541ts, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listParallelData");
            }
            if ((i & 1) != 0) {
                c47541ts = C47541ts.EZpvd.OLrzqt(new Function1<C47541ts.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.TranslateClient$listParallelData$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C47541ts.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C47541ts.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC44254sJ.OLrzqt(c47541ts, continuation);
        }

        public static /* synthetic */ java.lang.Object listTerminologies$default(InterfaceC44254sJ interfaceC44254sJ, C47859ty c47859ty, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listTerminologies");
            }
            if ((i & 1) != 0) {
                c47859ty = C47859ty.OLrzqt.KWHzl(new Function1<C47859ty.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.translate.TranslateClient$listTerminologies$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C47859ty.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C47859ty.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC44254sJ.copydefault(c47859ty, (Continuation<? super C45888tA>) continuation);
        }

        public static /* synthetic */ java.lang.Object listTextTranslationJobs$default(InterfaceC44254sJ interfaceC44254sJ, C46024tF c46024tF, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listTextTranslationJobs");
            }
            if ((i & 1) != 0) {
                c46024tF = C46024tF.copydefault.copydefault(new Function1<C46024tF.Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.TranslateClient$listTextTranslationJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C46024tF.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C46024tF.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return interfaceC44254sJ.copydefault(c46024tF, (Continuation<? super C45970tD>) continuation);
        }
    }
}
