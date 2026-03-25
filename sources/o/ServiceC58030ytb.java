package o;

import android.content.Context;
import android.os.IBinder;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import com.tencent.matrix.lifecycle.supervisor.ProcessToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57964ysO;
import o.C57969ysT;
import o.C58013ytK;
import o.InterfaceC57967ysR;
import o.ServiceC58030ytb;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ServiceC58030ytb extends android.app.Service {
    public static volatile boolean AEQbTJ;
    public static volatile ServiceC58030ytb OLrzqt;
    public yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.Integer, Unit> AYXKKw;
    public static final Application Companion = new Application(null);
    public static volatile java.lang.String copydefault = "";
    public final android.os.Handler AhwBna = MatrixLifecycleThread.EZpvd.OLrzqt();
    public final Activity djBIcL = new Activity();
    public final InterfaceC56387yDm KWHzl = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<ConcurrentLinkedQueue<ProcessToken>>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorService$backgroundProcessLru$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final ConcurrentLinkedQueue<ProcessToken> invoke() {
            return new ConcurrentLinkedQueue<>();
        }
    });
    public final StateListAnimator EZpvd = new StateListAnimator();

    /* JADX INFO: renamed from: o.ytb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final boolean KWHzl() {
            return ServiceC58030ytb.AEQbTJ;
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ServiceC58030ytb.copydefault = str;
        }

        public final java.lang.String EZpvd() {
            return ServiceC58030ytb.copydefault;
        }

        public final Application KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            try {
                if (OLrzqt() != null) {
                    C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "duplicated start", new java.lang.Object[0]);
                } else {
                    C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
                    if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
                        C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
                    } else {
                        context.startService(new android.content.Intent(context, (java.lang.Class<?>) ServiceC58030ytb.class));
                        C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "start service", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
            return this;
        }

        public final ServiceC58030ytb OLrzqt() {
            return ServiceC58030ytb.OLrzqt;
        }
    }

    public final ConcurrentLinkedQueue<ProcessToken> copydefault() {
        return (ConcurrentLinkedQueue) this.KWHzl.getValue();
    }

    public final java.lang.String OLrzqt(ConcurrentLinkedQueue<ProcessToken> concurrentLinkedQueue) {
        java.util.Iterator<ProcessToken> it = concurrentLinkedQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        if (!it.hasNext()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        while (true) {
            ProcessToken next = it.next();
            sb.append(next.KWHzl() + '-' + next.EZpvd());
            if (!it.hasNext()) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                java.lang.String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append(' ');
        }
    }

    public final void AEQbTJ(ConcurrentLinkedQueue<ProcessToken> concurrentLinkedQueue, ProcessToken processToken) {
        concurrentLinkedQueue.remove(processToken);
        concurrentLinkedQueue.add(processToken);
    }

    /* JADX INFO: renamed from: o.ytb$StateListAnimator */
    public static final class StateListAnimator extends InterfaceC57967ysR.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC57967ysR
        public void EZpvd(@NotNull final ProcessToken[] processTokenArr, @NotNull final InterfaceC57963ysN interfaceC57963ysN) {
            Intrinsics.checkNotNullParameter(processTokenArr, "");
            Intrinsics.checkNotNullParameter(interfaceC57963ysN, "");
            final int callingPid = android.os.Binder.getCallingPid();
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw != null && true == c57974ysYAYXKKw.copydefault()) {
                android.os.Handler handler = ServiceC58030ytb.this.AhwBna;
                final ServiceC58030ytb serviceC58030ytb = ServiceC58030ytb.this;
                handler.post(new java.lang.Runnable() { // from class: o.ysZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceC58030ytb.StateListAnimator.copydefault(processTokenArr, serviceC58030ytb, this, interfaceC57963ysN, callingPid);
                    }
                });
                return;
            }
            C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
        }

        public static final void copydefault(ProcessToken[] processTokenArr, final ServiceC58030ytb serviceC58030ytb, final StateListAnimator stateListAnimator, InterfaceC57963ysN interfaceC57963ysN, final int i) {
            Intrinsics.checkNotNullParameter(processTokenArr, "");
            Intrinsics.checkNotNullParameter(serviceC58030ytb, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(interfaceC57963ysN, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("supervisor called register, tokens(");
            sb.append(processTokenArr.length);
            sb.append("): ");
            java.lang.String string = java.util.Arrays.toString(processTokenArr);
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            C58013ytK.copydefault("Matrix.ProcessSupervisor.Service", sb.toString(), new java.lang.Object[0]);
            try {
                final ProcessToken processToken = (ProcessToken) yDV.AuCTelauCTel(processTokenArr);
                serviceC58030ytb.djBIcL.AEQbTJ(processToken);
                C57969ysT.AEQbTJ.AEQbTJ().KWHzl(processToken, interfaceC57963ysN);
                serviceC58030ytb.AEQbTJ(serviceC58030ytb.copydefault(), processToken);
                C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "CREATED: [" + processToken.KWHzl() + '-' + processToken.EZpvd() + "] -> [" + serviceC58030ytb.copydefault().size() + AbstractJsonLexerKt.END_LIST + serviceC58030ytb.OLrzqt((ConcurrentLinkedQueue<ProcessToken>) serviceC58030ytb.copydefault()), new java.lang.Object[0]);
                processToken.copydefault(new IBinder.DeathRecipient() { // from class: o.yte
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        ServiceC58030ytb.StateListAnimator.OLrzqt(processToken, serviceC58030ytb, i, stateListAnimator);
                    }
                });
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
            for (ProcessToken processToken2 : processTokenArr) {
                C58013ytK.copydefault("Matrix.ProcessSupervisor.Service", "register: " + processToken2.EZpvd() + ", " + processToken2.copydefault() + ", " + processToken2.AEQbTJ(), new java.lang.Object[0]);
                ActionBar.Companion.AEQbTJ(processToken2).OLrzqt(processToken2.AEQbTJ());
            }
            if (serviceC58030ytb.djBIcL.copydefault()) {
                C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "stateRegister: no other process registered, ignore state changes", new java.lang.Object[0]);
                return;
            }
            C57964ysO.ActionBar actionBar = C57964ysO.Companion;
            ProcessToken.ActionBar actionBar2 = ProcessToken.Companion;
            android.content.Context applicationContext = serviceC58030ytb.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            actionBar.EZpvd(ProcessToken.ActionBar.current$default(actionBar2, applicationContext, null, false, 6, null), stateListAnimator.KWHzl());
        }

        public static final void OLrzqt(ProcessToken processToken, ServiceC58030ytb serviceC58030ytb, int i, StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(processToken, "");
            Intrinsics.checkNotNullParameter(serviceC58030ytb, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            try {
                ProcessToken processTokenAEQbTJ = serviceC58030ytb.djBIcL.AEQbTJ(i);
                boolean zRemove = serviceC58030ytb.copydefault().remove(processTokenAEQbTJ);
                C57969ysT c57969ysT = C57969ysT.AEQbTJ;
                c57969ysT.AEQbTJ().AEQbTJ(processTokenAEQbTJ);
                boolean zKWHzl = ActionBar.Companion.KWHzl(processTokenAEQbTJ);
                boolean z = true;
                c57969ysT.AEQbTJ().EZpvd(stateListAnimator.KWHzl(), processTokenAEQbTJ.EZpvd(), processTokenAEQbTJ.KWHzl(), (zRemove || zKWHzl) ? false : true);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i);
                sb.append('-');
                sb.append(processTokenAEQbTJ);
                sb.append(" was dead. is LRU kill? ");
                if (zRemove || zKWHzl) {
                    z = false;
                }
                sb.append(z);
                C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", sb.toString(), new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57967ysR
        public void KWHzl(@NotNull final ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw != null && true == c57974ysYAYXKKw.copydefault()) {
                ServiceC58030ytb.this.AhwBna.post(new java.lang.Runnable() { // from class: o.ytf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceC58030ytb.StateListAnimator.EZpvd(processToken, this);
                    }
                });
            } else {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
            }
        }

        public static final void EZpvd(ProcessToken processToken, StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(processToken, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "onStateChanged: " + processToken.copydefault() + ' ' + processToken.AEQbTJ() + ' ' + processToken.EZpvd(), new java.lang.Object[0]);
            ActionBar.Companion.AEQbTJ(processToken).OLrzqt(processToken.AEQbTJ());
            stateListAnimator.AEQbTJ(processToken);
        }

        public final void AEQbTJ(ProcessToken processToken) {
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) "ExplicitBackgroundOwner", (java.lang.Object) processToken.copydefault())) {
                if (processToken.AEQbTJ()) {
                    ServiceC58030ytb serviceC58030ytb = ServiceC58030ytb.this;
                    serviceC58030ytb.AEQbTJ(serviceC58030ytb.copydefault(), processToken);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("BACKGROUND: [");
                    sb.append(processToken.KWHzl());
                    sb.append('-');
                    sb.append(processToken.EZpvd());
                    sb.append("] -> [");
                    sb.append(ServiceC58030ytb.this.copydefault().size());
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    ServiceC58030ytb serviceC58030ytb2 = ServiceC58030ytb.this;
                    sb.append(serviceC58030ytb2.OLrzqt((ConcurrentLinkedQueue<ProcessToken>) serviceC58030ytb2.copydefault()));
                    C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", sb.toString(), new java.lang.Object[0]);
                    return;
                }
                ServiceC58030ytb.this.copydefault().remove(processToken);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("FOREGROUND: [");
                sb2.append(processToken.KWHzl());
                sb2.append('-');
                sb2.append(processToken.EZpvd());
                sb2.append("] <- [");
                sb2.append(ServiceC58030ytb.this.copydefault().size());
                sb2.append(AbstractJsonLexerKt.END_LIST);
                ServiceC58030ytb serviceC58030ytb3 = ServiceC58030ytb.this;
                sb2.append(serviceC58030ytb3.OLrzqt((ConcurrentLinkedQueue<ProcessToken>) serviceC58030ytb3.copydefault()));
                C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", sb2.toString(), new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57967ysR
        public void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
            } else {
                ServiceC58030ytb.Companion.AEQbTJ(str);
            }
        }

        @Override // o.InterfaceC57967ysR
        public void EZpvd(@NotNull final ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw != null && true == c57974ysYAYXKKw.copydefault()) {
                android.os.Handler handler = ServiceC58030ytb.this.AhwBna;
                final ServiceC58030ytb serviceC58030ytb = ServiceC58030ytb.this;
                handler.post(new java.lang.Runnable() { // from class: o.ytd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceC58030ytb.StateListAnimator.copydefault(this.AEQbTJ, serviceC58030ytb, processToken);
                    }
                });
                return;
            }
            C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
        }

        public static final void copydefault(StateListAnimator stateListAnimator, ServiceC58030ytb serviceC58030ytb, ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(serviceC58030ytb, "");
            Intrinsics.checkNotNullParameter(processToken, "");
            try {
                yHO yho = serviceC58030ytb.AYXKKw;
                if (yho != null) {
                    yho.invoke(1, processToken.EZpvd(), java.lang.Integer.valueOf(processToken.KWHzl()));
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
            serviceC58030ytb.copydefault().remove(processToken);
            ActionBar.Companion.KWHzl(processToken);
            C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "KILL: [" + processToken.KWHzl() + '-' + processToken.EZpvd() + "] X [" + serviceC58030ytb.copydefault().size() + AbstractJsonLexerKt.END_LIST + serviceC58030ytb.OLrzqt((ConcurrentLinkedQueue<ProcessToken>) serviceC58030ytb.copydefault()), new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57967ysR
        public void OLrzqt(@NotNull final ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw != null && true == c57974ysYAYXKKw.copydefault()) {
                android.os.Handler handler = ServiceC58030ytb.this.AhwBna;
                final ServiceC58030ytb serviceC58030ytb = ServiceC58030ytb.this;
                handler.post(new java.lang.Runnable() { // from class: o.ytg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceC58030ytb.StateListAnimator.djBIcL(this.EZpvd, serviceC58030ytb, processToken);
                    }
                });
                return;
            }
            C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
        }

        public static final void djBIcL(StateListAnimator stateListAnimator, ServiceC58030ytb serviceC58030ytb, ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(serviceC58030ytb, "");
            Intrinsics.checkNotNullParameter(processToken, "");
            try {
                yHO yho = serviceC58030ytb.AYXKKw;
                if (yho != null) {
                    yho.invoke(2, processToken.EZpvd(), java.lang.Integer.valueOf(processToken.KWHzl()));
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57967ysR
        public void copydefault(@NotNull final ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw != null && true == c57974ysYAYXKKw.copydefault()) {
                android.os.Handler handler = ServiceC58030ytb.this.AhwBna;
                final ServiceC58030ytb serviceC58030ytb = ServiceC58030ytb.this;
                handler.post(new java.lang.Runnable() { // from class: o.ytc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceC58030ytb.StateListAnimator.EZpvd(this.AEQbTJ, serviceC58030ytb, processToken);
                    }
                });
                return;
            }
            C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
        }

        public static final void EZpvd(StateListAnimator stateListAnimator, ServiceC58030ytb serviceC58030ytb, ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(serviceC58030ytb, "");
            Intrinsics.checkNotNullParameter(processToken, "");
            try {
                yHO yho = serviceC58030ytb.AYXKKw;
                if (yho != null) {
                    yho.invoke(3, processToken.EZpvd(), java.lang.Integer.valueOf(processToken.KWHzl()));
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", th, "", new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57967ysR
        public java.lang.String KWHzl() {
            C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
            if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
                return "";
            }
            return ServiceC58030ytb.Companion.EZpvd();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "onCreate", new java.lang.Object[0]);
        AEQbTJ = true;
        OLrzqt = this;
        C57974ysY c57974ysYAYXKKw = C57968ysS.KWHzl.AYXKKw();
        if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
            C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new java.lang.Object[0]);
        } else {
            C57964ysO.Companion.AEQbTJ(new Function2<java.lang.String, java.lang.Boolean, Unit>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorService$onCreate$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(2);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Unit invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str, boolean z) {
                    Intrinsics.checkNotNullParameter(str, "");
                    if (this.this$0.djBIcL.copydefault()) {
                        C58013ytK.EZpvd("Matrix.ProcessSupervisor.Service", "observe: no other process registered, ignore state changes", new Object[0]);
                        return;
                    }
                    C58013ytK.copydefault("Matrix.ProcessSupervisor.Service", "supervisor dispatch " + str + ' ' + z, new Object[0]);
                    C57969ysT.Activity activityAEQbTJ = C57969ysT.AEQbTJ.AEQbTJ();
                    ProcessToken.ActionBar actionBar = ProcessToken.Companion;
                    Context applicationContext = this.this$0.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    activityAEQbTJ.copydefault(ProcessToken.ActionBar.current$default(actionBar, applicationContext, null, false, 6, null), ServiceC58030ytb.Companion.EZpvd(), str, z);
                }
            });
            C57970ysU.KWHzl.copydefault(getApplicationContext());
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        C58013ytK.copydefault("Matrix.ProcessSupervisor.Service", "onBind", new java.lang.Object[0]);
        return this.EZpvd;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C58013ytK.OLrzqt("Matrix.ProcessSupervisor.Service", "SupervisorService destroyed!!!", new java.lang.Object[0]);
        OLrzqt = null;
    }

    /* JADX INFO: renamed from: o.ytb$Activity */
    public static final class Activity {
        public final InterfaceC56387yDm AEQbTJ;
        public final InterfaceC56387yDm KWHzl;

        public Activity() {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.KWHzl = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ConcurrentHashMap<java.lang.Integer, ProcessToken>>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorService$TokenRecord$pidToToken$2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final ConcurrentHashMap<Integer, ProcessToken> invoke() {
                    return new ConcurrentHashMap<>();
                }
            });
            this.AEQbTJ = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ConcurrentHashMap<java.lang.String, ProcessToken>>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorService$TokenRecord$nameToToken$2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final ConcurrentHashMap<String, ProcessToken> invoke() {
                    return new ConcurrentHashMap<>();
                }
            });
        }

        public final ConcurrentHashMap<java.lang.Integer, ProcessToken> KWHzl() {
            return (ConcurrentHashMap) this.KWHzl.getValue();
        }

        public final ConcurrentHashMap<java.lang.String, ProcessToken> AEQbTJ() {
            return (ConcurrentHashMap) this.AEQbTJ.getValue();
        }

        public final void AEQbTJ(@NotNull ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            KWHzl().put(java.lang.Integer.valueOf(processToken.KWHzl()), processToken);
            AEQbTJ().put(processToken.EZpvd(), processToken);
        }

        public final ProcessToken AEQbTJ(int i) {
            ProcessToken processTokenRemove = KWHzl().remove(java.lang.Integer.valueOf(i));
            if (processTokenRemove != null) {
                AEQbTJ().remove(processTokenRemove.EZpvd());
                return processTokenRemove;
            }
            throw new java.lang.IllegalStateException("token with pid=" + i + " not found");
        }

        public final boolean copydefault() {
            if (!KWHzl().isEmpty()) {
                ConcurrentHashMap<java.lang.Integer, ProcessToken> concurrentHashMapKWHzl = KWHzl();
                if (!concurrentHashMapKWHzl.isEmpty()) {
                    java.util.Iterator<Map.Entry<java.lang.Integer, ProcessToken>> it = concurrentHashMapKWHzl.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getKey().intValue() != android.os.Process.myPid()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.ytb$ActionBar */
    public static final class ActionBar extends C57983ysh {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final InterfaceC56387yDm<ConcurrentHashMap<ProcessToken, ConcurrentHashMap<java.lang.String, ActionBar>>> OLrzqt = C56392yDr.copydefault(new Function0<ConcurrentHashMap<ProcessToken, ConcurrentHashMap<java.lang.String, ActionBar>>>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy$Companion$processProxies$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentHashMap<ProcessToken, ConcurrentHashMap<String, ServiceC58030ytb.ActionBar>> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
        public final ProcessToken AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ProcessToken processToken) {
            super(false, 1, null);
            Intrinsics.checkNotNullParameter(processToken, "");
            this.AEQbTJ = processToken;
            C57964ysO.Companion.EZpvd(processToken.copydefault(), this);
        }

        /* JADX INFO: renamed from: o.ytb$ActionBar$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytb.ActionBar.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final ConcurrentHashMap<ProcessToken, ConcurrentHashMap<java.lang.String, ActionBar>> EZpvd() {
                return (ConcurrentHashMap) ActionBar.OLrzqt.getValue();
            }

            public final ActionBar AEQbTJ(@NotNull ProcessToken processToken) {
                ActionBar actionBarPutIfAbsent;
                ConcurrentHashMap<java.lang.String, ActionBar> concurrentHashMapPutIfAbsent;
                Intrinsics.checkNotNullParameter(processToken, "");
                ConcurrentHashMap<ProcessToken, ConcurrentHashMap<java.lang.String, ActionBar>> concurrentHashMapEZpvd = EZpvd();
                ConcurrentHashMap<java.lang.String, ActionBar> concurrentHashMap = concurrentHashMapEZpvd.get(processToken);
                if (concurrentHashMap == null && (concurrentHashMapPutIfAbsent = concurrentHashMapEZpvd.putIfAbsent(processToken, (concurrentHashMap = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap = concurrentHashMapPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "");
                ConcurrentHashMap<java.lang.String, ActionBar> concurrentHashMap2 = concurrentHashMap;
                java.lang.String strCopydefault = processToken.copydefault();
                ActionBar actionBar = concurrentHashMap2.get(strCopydefault);
                if (actionBar == null && (actionBarPutIfAbsent = concurrentHashMap2.putIfAbsent(strCopydefault, (actionBar = new ActionBar(processToken)))) != null) {
                    actionBar = actionBarPutIfAbsent;
                }
                Intrinsics.copydefault(actionBar);
                return actionBar;
            }

            public final boolean KWHzl(@NotNull ProcessToken processToken) {
                Intrinsics.checkNotNullParameter(processToken, "");
                ConcurrentHashMap<java.lang.String, ActionBar> concurrentHashMapRemove = EZpvd().remove(processToken);
                if (concurrentHashMapRemove == null || concurrentHashMapRemove.isEmpty()) {
                    return false;
                }
                for (Map.Entry<java.lang.String, ActionBar> entry : concurrentHashMapRemove.entrySet()) {
                    C57964ysO.Companion.copydefault(entry.getKey(), entry.getValue());
                }
                return true;
            }
        }

        public final void OLrzqt(boolean z) {
            if (z) {
                valueOf();
            } else {
                djBIcL();
            }
        }

        public java.lang.String toString() {
            return "OwnerProxy_" + this.AEQbTJ.copydefault() + '_' + AEQbTJ() + '@' + hashCode() + '_' + this.AEQbTJ.EZpvd() + '_' + this.AEQbTJ.KWHzl();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
