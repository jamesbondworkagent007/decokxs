package o;

import com.okinc.oklive.app.common.net.LiveAuthInterceptor$fetchTokenSynchronously$2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44533sTl implements Interceptor {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final AtomicBoolean AEQbTJ;
    public final Function0<C44535sTn> KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    public C44533sTl(@NotNull Function0<C44535sTn> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
        this.AEQbTJ = new AtomicBoolean(false);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44533sTl.EZpvd(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.sTl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C44535sTn copydefault() {
        return (C44535sTn) this.OLrzqt.getValue();
    }

    public static final C44535sTn EZpvd(C44533sTl c44533sTl) {
        return c44533sTl.KWHzl.invoke();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) request.url().toString(), (java.lang.CharSequence) "/priapi/v1/im/auth/v1/token/anonymous-token", false, 2, (java.lang.Object) null)) {
            return chain.proceed(request);
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        if (!C44157sFk.gEmmrt().values()) {
            C44539sTr c44539sTr = C44539sTr.EZpvd;
            java.lang.String strAEQbTJ = c44539sTr.AEQbTJ();
            if ((strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) && AEQbTJ()) {
                strAEQbTJ = c44539sTr.AEQbTJ();
            }
            if (strAEQbTJ != null) {
                builderNewBuilder.header("im-token", strAEQbTJ);
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }

    public final boolean AEQbTJ() {
        synchronized (this) {
            C44539sTr c44539sTr = C44539sTr.EZpvd;
            if (c44539sTr.AEQbTJ() != null) {
                return true;
            }
            boolean z = false;
            if (this.AEQbTJ.get()) {
                java.lang.Thread.sleep(100L);
                return c44539sTr.AEQbTJ() != null;
            }
            this.AEQbTJ.set(true);
            try {
                try {
                    boolean zBooleanValue = ((java.lang.Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new LiveAuthInterceptor$fetchTokenSynchronously$2(this, null))).booleanValue();
                    this.AEQbTJ.set(false);
                    z = zBooleanValue;
                } catch (java.lang.Exception unused) {
                }
                return z;
            } finally {
                this.AEQbTJ.set(false);
            }
        }
    }
}
