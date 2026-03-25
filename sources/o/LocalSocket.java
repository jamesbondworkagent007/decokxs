package o;

import aws.sdk.kotlin.services.comprehend.ComprehendClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.BatteryProperty;
import o.C57260yf;
import o.FilterInputStream;
import o.HealthKeys;
import o.HealthStats;
import o.HealthStatsParceler;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import o.PidHealthStats;
import o.SystemClock;
import o.SystemVibrator;
import o.Temperature;
import o.TestLooperManager;
import o.TransactionTooLargeException;
import o.UEventObserver;
import o.UidHealthStats;
import o.UpdateLock;
import o.VibrationEffect;
import o.Vibrator;
import o.VintfObject;
import o.VintfRuntimeInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface LocalSocket extends InterfaceC57154yd {
    public static final ActionBar OLrzqt = ActionBar.KWHzl;

    java.lang.Object AEQbTJ(@NotNull BestClock bestClock, @NotNull Continuation<? super BatteryStatsInternal> continuation);

    java.lang.Object AEQbTJ(@NotNull PidHealthStats pidHealthStats, @NotNull Continuation<? super ProcessHealthStats> continuation);

    java.lang.Object AEQbTJ(@NotNull UidHealthStats uidHealthStats, @NotNull Continuation<? super StorageEventListener> continuation);

    java.lang.Object AEQbTJ(@NotNull VintfObject vintfObject, @NotNull Continuation<? super GpsBatteryStats> continuation);

    java.lang.Object EZpvd(@NotNull HealthStats healthStats, @NotNull Continuation<? super ServiceHealthStats> continuation);

    java.lang.Object EZpvd(@NotNull TestLooperManager testLooperManager, @NotNull Continuation<? super Trace> continuation);

    java.lang.Object EZpvd(@NotNull UpdateLock updateLock, @NotNull Continuation<? super UpdateEngineCallback> continuation);

    java.lang.Object EZpvd(@NotNull Vibrator vibrator, @NotNull Continuation<? super UserManagerInternal> continuation);

    java.lang.Object EZpvd(@NotNull VintfRuntimeInfo vintfRuntimeInfo, @NotNull Continuation<? super CellularBatteryStats> continuation);

    java.lang.Object KWHzl(@NotNull BatteryManager batteryManager, @NotNull Continuation<? super BatteryManagerInternal> continuation);

    java.lang.Object KWHzl(@NotNull Broadcaster broadcaster, @NotNull Continuation<? super Binder> continuation);

    java.lang.Object KWHzl(@NotNull HealthStatsParceler healthStatsParceler, @NotNull Continuation<? super WifiBatteryStats> continuation);

    java.lang.Object KWHzl(@NotNull NfcF nfcF, @NotNull Continuation<? super AsyncResult> continuation);

    java.lang.Object KWHzl(@NotNull SystemClock systemClock, @NotNull Continuation<? super SystemProperties> continuation);

    java.lang.Object KWHzl(@NotNull VibrationEffect vibrationEffect, @NotNull Continuation<? super UserManager> continuation);

    java.lang.Object KWHzl(@NotNull WorkSource workSource, @NotNull Continuation<? super ZygoteProcess> continuation);

    java.lang.Object OLrzqt(@NotNull SystemVibrator systemVibrator, @NotNull Continuation<? super SystemUpdateManager> continuation);

    java.lang.Object OLrzqt(@NotNull UEventObserver uEventObserver, @NotNull Continuation<? super UpdateEngine> continuation);

    java.lang.Object copydefault(@NotNull BatteryProperty batteryProperty, @NotNull Continuation<? super BatteryProperties> continuation);

    java.lang.Object copydefault(@NotNull HealthKeys healthKeys, @NotNull Continuation<? super HealthStatsWriter> continuation);

    java.lang.Object copydefault(@NotNull Temperature temperature, @NotNull Continuation<? super TokenWatcher> continuation);

    java.lang.Object copydefault(@NotNull TransactionTooLargeException transactionTooLargeException, @NotNull Continuation<? super TransactionTracker> continuation);

    public static final class ActionBar extends IOError<TaskDescription, TaskDescription.Activity, LocalSocket, Application> {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Application EZpvd() {
            return new Application();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull Application application, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            ComprehendClient$Companion$finalizeConfig$1 comprehendClient$Companion$finalizeConfig$1;
            TaskDescription.Activity activityEZpvd;
            DL dlIsConnected;
            Application application2;
            TaskDescription.Activity activity;
            if (continuation instanceof ComprehendClient$Companion$finalizeConfig$1) {
                comprehendClient$Companion$finalizeConfig$1 = (ComprehendClient$Companion$finalizeConfig$1) continuation;
                int i = comprehendClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    comprehendClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    comprehendClient$Companion$finalizeConfig$1 = new ComprehendClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            ComprehendClient$Companion$finalizeConfig$1 comprehendClient$Companion$finalizeConfig$12 = comprehendClient$Companion$finalizeConfig$1;
            java.lang.Object obj = comprehendClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = comprehendClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                activityEZpvd = application.EZpvd();
                dlIsConnected = application.EZpvd().isConnected();
                if (dlIsConnected == null) {
                    comprehendClient$Companion$finalizeConfig$12.L$0 = application;
                    comprehendClient$Companion$finalizeConfig$12.L$1 = activityEZpvd;
                    comprehendClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Comprehend", "COMPREHEND", "comprehend", null, comprehendClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    application2 = application;
                    activity = activityEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                activityEZpvd.EZpvd(dlIsConnected);
                application.EZpvd().fetchVPNInfo().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (TaskDescription.Activity) comprehendClient$Companion$finalizeConfig$12.L$1;
            application2 = (Application) comprehendClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlIsConnected = (DL) obj;
            activityEZpvd = activity;
            application = application2;
            activityEZpvd.EZpvd(dlIsConnected);
            application.EZpvd().fetchVPNInfo().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class Application extends AbstractC54698xS<TaskDescription, TaskDescription.Activity, LocalSocket> {
        public final TaskDescription.Activity EZpvd = new TaskDescription.Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TaskDescription.Activity EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public LocalSocket copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new LinkProperties(taskDescription);
        }
    }

    public static final class TaskDescription implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final Application EZpvd = new Application(null);
        public final MatchAllNetworkSpecifier AEQbTJ;
        public final java.lang.String AYXKKw;
        public final DL AhwBna;
        public final java.lang.String AkhnZx;
        public final FZ AuCTel;
        public final InterfaceC5093El<java.lang.Object> DbNXlk;
        public final /* synthetic */ InterfaceC3338Ak KWHzl;
        public final java.lang.String OLrzqt;
        public final /* synthetic */ InterfaceC57207ye copydefault;
        public final NetworkAgent djBIcL;
        public final boolean ejfBZ;
        public final boolean fJNWhG;
        public final AbstractC54779xV fetchVPNInfo;
        public final java.util.List<InterfaceC2861Ab> gEmmrt;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected;
        public final InterfaceC52805wZ valueOf;
        public final InterfaceC54806xW values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LocalSocket$TaskDescription$Activity) A[MD:(o.LocalSocket$TaskDescription$Activity):void (m)] call: o.LocalSocket.TaskDescription.<init>(o.LocalSocket$TaskDescription$Activity):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
            this(activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkAgent AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC54806xW AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ AkhnZx() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AuCTel() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MatchAllNetworkSpecifier OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.KWHzl.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fJNWhG() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.copydefault.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> valueOf() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV values() {
            return this.fetchVPNInfo;
        }

        public TaskDescription(Activity activity) {
            this.KWHzl = activity.AEQbTJ();
            this.copydefault = activity.KWHzl();
            this.AYXKKw = activity.gEmmrt();
            this.AkhnZx = activity.values();
            this.gEmmrt = activity.AhwBna();
            InterfaceC52805wZ interfaceC52805wZDjBIcL = activity.djBIcL();
            this.valueOf = interfaceC52805wZDjBIcL == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), isConnected(), 3, null)) : interfaceC52805wZDjBIcL;
            NetworkAgent networkAgentValueOf = activity.valueOf();
            this.djBIcL = networkAgentValueOf == null ? new NetworkBadging() : networkAgentValueOf;
            this.AhwBna = activity.isConnected();
            InterfaceC54806xW interfaceC54806xWAkhnZx = activity.AkhnZx();
            this.values = interfaceC54806xWAkhnZx == null ? InterfaceC54806xW.EZpvd.EZpvd() : interfaceC54806xWAkhnZx;
            this.isConnected = activity.fetchVPNInfo();
            AbstractC54779xV abstractC54779xVDbNXlk = activity.DbNXlk();
            this.fetchVPNInfo = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElFARcdN = activity.fARcdN();
            this.DbNXlk = interfaceC5093ElFARcdN == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElFARcdN;
            FZ fzAuCTel = activity.AuCTel();
            this.AuCTel = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = activity.fIwbmz();
            this.ejfBZ = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = activity.fJNWhG();
            this.fJNWhG = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.OLrzqt = activity.EZpvd();
            MatchAllNetworkSpecifier matchAllNetworkSpecifierAYXKKw = activity.AYXKKw();
            this.AEQbTJ = matchAllNetworkSpecifierAYXKKw == null ? new LocalSocketImpl(null, 1, 0 == true ? 1 : 0) : matchAllNetworkSpecifierAYXKKw;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LocalSocket.TaskDescription.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static final class Activity implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<TaskDescription>, InterfaceC5134Ga.Activity {
            public NetworkAgent AhwBna;
            public AbstractC54779xV DbNXlk;
            public java.lang.String EZpvd;
            public MatchAllNetworkSpecifier OLrzqt;
            public InterfaceC52805wZ djBIcL;
            public java.lang.Boolean fARcdN;
            public java.lang.Boolean fJNWhG;
            public InterfaceC5093El<java.lang.Object> fetchVPNInfo;
            public DL gEmmrt;
            public java.lang.String isConnected;
            public InterfaceC54806xW valueOf;
            public FZ values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity AEQbTJ = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription KWHzl = new C57260yf.TaskDescription();
            public java.lang.String AYXKKw = "Comprehend";
            public java.util.List<? extends InterfaceC2861Ab> copydefault = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak AEQbTJ() {
                return this.AEQbTJ.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MatchAllNetworkSpecifier AYXKKw() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> AhwBna() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC54806xW AkhnZx() {
                return this.valueOf;
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
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.AEQbTJ.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(DL dl) {
                this.gEmmrt = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye KWHzl() {
                return this.KWHzl.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.fJNWhG = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.AEQbTJ.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.KWHzl.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void KWHzl(InterfaceC52805wZ interfaceC52805wZ) {
                this.djBIcL = interfaceC52805wZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.DbNXlk = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.isConnected = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.fARcdN = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.EZpvd = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ djBIcL() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> fARcdN() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fJNWhG;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fARcdN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String gEmmrt() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL isConnected() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final NetworkAgent valueOf() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.isConnected;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public TaskDescription OLrzqt() {
                return new TaskDescription(this, null);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object detectEntities$default(LocalSocket localSocket, BatteryProperty batteryProperty, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detectEntities");
            }
            if ((i & 1) != 0) {
                batteryProperty = BatteryProperty.EZpvd.AEQbTJ(new Function1<BatteryProperty.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$detectEntities$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull BatteryProperty.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BatteryProperty.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.copydefault(batteryProperty, (Continuation<? super BatteryProperties>) continuation);
        }

        public static /* synthetic */ java.lang.Object listDatasets$default(LocalSocket localSocket, SystemClock systemClock, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDatasets");
            }
            if ((i & 1) != 0) {
                systemClock = SystemClock.copydefault.copydefault(new Function1<SystemClock.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listDatasets$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SystemClock.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SystemClock.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.KWHzl(systemClock, (Continuation<? super SystemProperties>) continuation);
        }

        public static /* synthetic */ java.lang.Object listDocumentClassificationJobs$default(LocalSocket localSocket, SystemVibrator systemVibrator, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDocumentClassificationJobs");
            }
            if ((i & 1) != 0) {
                systemVibrator = SystemVibrator.copydefault.copydefault(new Function1<SystemVibrator.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listDocumentClassificationJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SystemVibrator.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SystemVibrator.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.OLrzqt(systemVibrator, (Continuation<? super SystemUpdateManager>) continuation);
        }

        public static /* synthetic */ java.lang.Object listDocumentClassifierSummaries$default(LocalSocket localSocket, TestLooperManager testLooperManager, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDocumentClassifierSummaries");
            }
            if ((i & 1) != 0) {
                testLooperManager = TestLooperManager.OLrzqt.OLrzqt(new Function1<TestLooperManager.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listDocumentClassifierSummaries$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TestLooperManager.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TestLooperManager.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.EZpvd(testLooperManager, (Continuation<? super Trace>) continuation);
        }

        public static /* synthetic */ java.lang.Object listDocumentClassifiers$default(LocalSocket localSocket, Temperature temperature, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDocumentClassifiers");
            }
            if ((i & 1) != 0) {
                temperature = Temperature.EZpvd.AEQbTJ(new Function1<Temperature.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listDocumentClassifiers$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Temperature.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Temperature.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.copydefault(temperature, (Continuation<? super TokenWatcher>) continuation);
        }

        public static /* synthetic */ java.lang.Object listDominantLanguageDetectionJobs$default(LocalSocket localSocket, TransactionTooLargeException transactionTooLargeException, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDominantLanguageDetectionJobs");
            }
            if ((i & 1) != 0) {
                transactionTooLargeException = TransactionTooLargeException.OLrzqt.KWHzl(new Function1<TransactionTooLargeException.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listDominantLanguageDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TransactionTooLargeException.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TransactionTooLargeException.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.copydefault(transactionTooLargeException, (Continuation<? super TransactionTracker>) continuation);
        }

        public static /* synthetic */ java.lang.Object listEndpoints$default(LocalSocket localSocket, UEventObserver uEventObserver, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listEndpoints");
            }
            if ((i & 1) != 0) {
                uEventObserver = UEventObserver.copydefault.KWHzl(new Function1<UEventObserver.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listEndpoints$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UEventObserver.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UEventObserver.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.OLrzqt(uEventObserver, (Continuation<? super UpdateEngine>) continuation);
        }

        public static /* synthetic */ java.lang.Object listEntitiesDetectionJobs$default(LocalSocket localSocket, UpdateLock updateLock, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listEntitiesDetectionJobs");
            }
            if ((i & 1) != 0) {
                updateLock = UpdateLock.EZpvd.EZpvd(new Function1<UpdateLock.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listEntitiesDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UpdateLock.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UpdateLock.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.EZpvd(updateLock, (Continuation<? super UpdateEngineCallback>) continuation);
        }

        public static /* synthetic */ java.lang.Object listEntityRecognizerSummaries$default(LocalSocket localSocket, VibrationEffect vibrationEffect, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listEntityRecognizerSummaries");
            }
            if ((i & 1) != 0) {
                vibrationEffect = VibrationEffect.KWHzl.OLrzqt(new Function1<VibrationEffect.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listEntityRecognizerSummaries$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VibrationEffect.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VibrationEffect.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.KWHzl(vibrationEffect, (Continuation<? super UserManager>) continuation);
        }

        public static /* synthetic */ java.lang.Object listEntityRecognizers$default(LocalSocket localSocket, Vibrator vibrator, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listEntityRecognizers");
            }
            if ((i & 1) != 0) {
                vibrator = Vibrator.copydefault.EZpvd(new Function1<Vibrator.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listEntityRecognizers$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Vibrator.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Vibrator.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.EZpvd(vibrator, (Continuation<? super UserManagerInternal>) continuation);
        }

        public static /* synthetic */ java.lang.Object listEventsDetectionJobs$default(LocalSocket localSocket, VintfObject vintfObject, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listEventsDetectionJobs");
            }
            if ((i & 1) != 0) {
                vintfObject = VintfObject.KWHzl.KWHzl(new Function1<VintfObject.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listEventsDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VintfObject.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VintfObject.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.AEQbTJ(vintfObject, (Continuation<? super GpsBatteryStats>) continuation);
        }

        public static /* synthetic */ java.lang.Object listFlywheels$default(LocalSocket localSocket, VintfRuntimeInfo vintfRuntimeInfo, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listFlywheels");
            }
            if ((i & 1) != 0) {
                vintfRuntimeInfo = VintfRuntimeInfo.OLrzqt.EZpvd(new Function1<VintfRuntimeInfo.Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listFlywheels$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VintfRuntimeInfo.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VintfRuntimeInfo.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.EZpvd(vintfRuntimeInfo, (Continuation<? super CellularBatteryStats>) continuation);
        }

        public static /* synthetic */ java.lang.Object listKeyPhrasesDetectionJobs$default(LocalSocket localSocket, HealthKeys healthKeys, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listKeyPhrasesDetectionJobs");
            }
            if ((i & 1) != 0) {
                healthKeys = HealthKeys.AEQbTJ.copydefault(new Function1<HealthKeys.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listKeyPhrasesDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull HealthKeys.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(HealthKeys.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.copydefault(healthKeys, (Continuation<? super HealthStatsWriter>) continuation);
        }

        public static /* synthetic */ java.lang.Object listPiiEntitiesDetectionJobs$default(LocalSocket localSocket, HealthStatsParceler healthStatsParceler, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listPiiEntitiesDetectionJobs");
            }
            if ((i & 1) != 0) {
                healthStatsParceler = HealthStatsParceler.KWHzl.OLrzqt(new Function1<HealthStatsParceler.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listPiiEntitiesDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull HealthStatsParceler.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(HealthStatsParceler.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.KWHzl(healthStatsParceler, (Continuation<? super WifiBatteryStats>) continuation);
        }

        public static /* synthetic */ java.lang.Object listSentimentDetectionJobs$default(LocalSocket localSocket, HealthStats healthStats, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listSentimentDetectionJobs");
            }
            if ((i & 1) != 0) {
                healthStats = HealthStats.EZpvd.KWHzl(new Function1<HealthStats.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listSentimentDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull HealthStats.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(HealthStats.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.EZpvd(healthStats, (Continuation<? super ServiceHealthStats>) continuation);
        }

        public static /* synthetic */ java.lang.Object listTargetedSentimentDetectionJobs$default(LocalSocket localSocket, PidHealthStats pidHealthStats, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listTargetedSentimentDetectionJobs");
            }
            if ((i & 1) != 0) {
                pidHealthStats = PidHealthStats.copydefault.OLrzqt(new Function1<PidHealthStats.Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listTargetedSentimentDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull PidHealthStats.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PidHealthStats.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.AEQbTJ(pidHealthStats, (Continuation<? super ProcessHealthStats>) continuation);
        }

        public static /* synthetic */ java.lang.Object listTopicsDetectionJobs$default(LocalSocket localSocket, UidHealthStats uidHealthStats, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listTopicsDetectionJobs");
            }
            if ((i & 1) != 0) {
                uidHealthStats = UidHealthStats.AEQbTJ.EZpvd(new Function1<UidHealthStats.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.ComprehendClient$listTopicsDetectionJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UidHealthStats.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UidHealthStats.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }
                });
            }
            return localSocket.AEQbTJ(uidHealthStats, (Continuation<? super StorageEventListener>) continuation);
        }
    }
}
