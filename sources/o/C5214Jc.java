package o;

import com.amplitude.android.Amplitude$buildInternal$1;
import com.amplitude.android.Amplitude$onExitForeground$1;
import com.amplitude.android.AutocaptureOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5214Jc extends JZ {
    public static final Application Companion = new Application(null);
    public JE AEQbTJ;
    public JP KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.JZ
    public java.lang.Object KWHzl(@NotNull ME me2, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, me2, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5214Jc(@NotNull C5216Je c5216Je) {
        super(c5216Je);
        Intrinsics.checkNotNullParameter(c5216Je, "");
        copydefault();
        if (c5216Je.AEQbTJ().contains(AutocaptureOption.APP_LIFECYCLES)) {
            android.content.Context contextCopydefault = c5216Je.copydefault();
            Intrinsics.copydefault(contextCopydefault, "");
            android.app.Application application = (android.app.Application) contextCopydefault;
            JP jp2 = this.KWHzl;
            if (jp2 == null) {
                Intrinsics.gEmmrt("");
                jp2 = null;
            }
            application.registerActivityLifecycleCallbacks(jp2);
        }
    }

    @Override // o.JZ
    public Deferred<java.lang.Boolean> EZpvd() {
        this.KWHzl = new JP();
        return super.EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/Kw; */
    @Override // o.JZ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C5219Jh AEQbTJ() {
        C5219Jh c5219Jh = new C5219Jh(djBIcL().zLjUOn());
        c5219Jh.OLrzqt(this);
        return c5219Jh;
    }

    @Override // o.JZ
    public ME OLrzqt() {
        C5244Kg c5244KgDjBIcL = djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        java.lang.String strFetchVPNInfo = c5216Je.fetchVPNInfo();
        java.lang.String strORxRYg = c5216Je.ORxRYg();
        MM mmIsConnected = c5216Je.isConnected();
        JJ jj = JJ.copydefault;
        return new ME(strFetchVPNInfo, strORxRYg, null, mmIsConnected, jj.AEQbTJ(c5216Je), jj.KWHzl(), c5216Je.AuCTel().getLogger(this), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(C5214Jc c5214Jc, ME me2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Amplitude$buildInternal$1 amplitude$buildInternal$1;
        if (continuation instanceof Amplitude$buildInternal$1) {
            amplitude$buildInternal$1 = (Amplitude$buildInternal$1) continuation;
            int i = amplitude$buildInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                amplitude$buildInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                amplitude$buildInternal$1 = new Amplitude$buildInternal$1(c5214Jc, continuation);
            }
        }
        java.lang.Object obj = amplitude$buildInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = amplitude$buildInternal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C5237Jz c5237Jz = new C5237Jz(c5214Jc);
            amplitude$buildInternal$1.L$0 = c5214Jc;
            amplitude$buildInternal$1.L$1 = me2;
            amplitude$buildInternal$1.label = 1;
            if (c5237Jz.OLrzqt(amplitude$buildInternal$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            me2 = (ME) amplitude$buildInternal$1.L$1;
            c5214Jc = (C5214Jc) amplitude$buildInternal$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c5214Jc.AEQbTJ(me2);
        if (!Intrinsics.EZpvd(c5214Jc.djBIcL().iwGUEr(), JF.Companion.AEQbTJ())) {
            c5214Jc.copydefault(new JF());
        }
        ActionBar actionBar = c5214Jc.new ActionBar();
        c5214Jc.AEQbTJ = actionBar;
        c5214Jc.copydefault(actionBar);
        c5214Jc.copydefault(new KD());
        JP jp2 = c5214Jc.KWHzl;
        if (jp2 == null) {
            Intrinsics.gEmmrt("");
            jp2 = null;
        }
        c5214Jc.copydefault(new JH(jp2));
        c5214Jc.copydefault(new JB());
        c5214Jc.copydefault(new JD());
        c5214Jc.copydefault(new KC());
        C5260Kw c5260KwIwGUEr = c5214Jc.iwGUEr();
        Intrinsics.copydefault(c5260KwIwGUEr, "");
        ((C5219Jh) c5260KwIwGUEr).KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.Jc$ActionBar */
    public static final class ActionBar extends JE {
        public ActionBar() {
        }

        @Override // o.JE
        public void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C5214Jc.this.KWHzl(str);
        }
    }

    public final void AEQbTJ(long j) {
        C5242Ke c5242Ke = new C5242Ke();
        c5242Ke.OLrzqt("dummy_enter_foreground");
        c5242Ke.copydefault(java.lang.Long.valueOf(j));
        iwGUEr().copydefault(c5242Ke);
    }

    public final void KWHzl(long j) {
        C5242Ke c5242Ke = new C5242Ke();
        c5242Ke.OLrzqt("dummy_exit_foreground");
        c5242Ke.copydefault(java.lang.Long.valueOf(j));
        iwGUEr().copydefault(c5242Ke);
        BuildersKt__Builders_commonKt.launch$default(AYXKKw(), valueOf(), null, new Amplitude$onExitForeground$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.Jc$Activity */
    public static final class Activity extends java.lang.Thread {
        public Activity() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C5260Kw c5260KwIwGUEr = C5214Jc.this.iwGUEr();
            Intrinsics.copydefault(c5260KwIwGUEr, "");
            ((C5219Jh) c5260KwIwGUEr).EZpvd();
        }
    }

    public final void copydefault() {
        java.lang.Runtime.getRuntime().addShutdownHook(new Activity());
    }

    /* JADX INFO: renamed from: o.Jc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Jc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
