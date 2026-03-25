package o;

import com.okinc.business.defi.wallet.home.AccountVerifyManager$checkAndVerifyAccount$1;
import com.okinc.business.defi.wallet.home.AccountVerifyManager$verifyAccount$1;
import com.okinc.business.defi.wallet.home.AccountVerifyManager$verifyAccount$2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C13058cyg;
import o.C8342bAs;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15519eLi {
    public static volatile C15519eLi AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C13058cyg AYXKKw;
    public C13934dbu KWHzl;
    public final ConcurrentHashMap<java.lang.String, java.lang.Boolean> OLrzqt;
    public CoroutineScope copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.dbu), (r2v0 o.cyg), (r3v0 kotlinx.coroutines.CoroutineScope) A[MD:(o.dbu, o.cyg, kotlinx.coroutines.CoroutineScope):void (m)] call: o.eLi.<init>(o.dbu, o.cyg, kotlinx.coroutines.CoroutineScope):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C15519eLi(C13934dbu c13934dbu, C13058cyg c13058cyg, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13934dbu, c13058cyg, coroutineScope);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C13934dbu c13934dbu, C13058cyg c13058cyg, CoroutineScope coroutineScope) {
        this.KWHzl = c13934dbu;
        this.AYXKKw = c13058cyg;
        this.copydefault = coroutineScope;
    }

    public C15519eLi(C13934dbu c13934dbu, C13058cyg c13058cyg, CoroutineScope coroutineScope) {
        this.KWHzl = c13934dbu;
        this.AYXKKw = c13058cyg;
        this.copydefault = coroutineScope;
        this.OLrzqt = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.eLi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C15519eLi getInstance$default(Application application, C13934dbu c13934dbu, C13058cyg c13058cyg, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c13934dbu = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp();
            }
            if ((i & 2) != 0) {
                c13058cyg = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
            }
            if ((i & 4) != 0) {
                coroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
            }
            return application.EZpvd(c13934dbu, c13058cyg, coroutineScope);
        }

        public final C15519eLi EZpvd(@NotNull C13934dbu c13934dbu, @NotNull C13058cyg c13058cyg, @NotNull CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(c13934dbu, "");
            Intrinsics.checkNotNullParameter(c13058cyg, "");
            Intrinsics.checkNotNullParameter(coroutineScope, "");
            C15519eLi c15519eLi = C15519eLi.AEQbTJ;
            if (c15519eLi == null) {
                synchronized (this) {
                    c15519eLi = C15519eLi.AEQbTJ;
                    if (c15519eLi == null) {
                        c15519eLi = new C15519eLi(c13934dbu, c13058cyg, coroutineScope, null);
                        Application application = C15519eLi.Companion;
                        C15519eLi.AEQbTJ = c15519eLi;
                    }
                }
            }
            c15519eLi.EZpvd(c13934dbu, c13058cyg, coroutineScope);
            return c15519eLi;
        }
    }

    public final void OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.AubY() || abstractC12782ctV.QVAiDq() || abstractC12782ctV.AwvSrB()) {
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            if (Intrinsics.EZpvd(this.OLrzqt.get(strDbNXlk), java.lang.Boolean.FALSE)) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new AccountVerifyManager$verifyAccount$1(this, strDbNXlk, abstractC12782ctV, null), 3, null);
        }
    }

    public static final void KWHzl(C15519eLi c15519eLi, AbstractC12782ctV abstractC12782ctV) {
        C8342bAs.Activity activity = C8342bAs.Companion;
        if (activity.EZpvd().AEQbTJ()) {
            c15519eLi.copydefault(abstractC12782ctV, activity.EZpvd().OLrzqt());
        }
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new AccountVerifyManager$checkAndVerifyAccount$1(abstractC12782ctV, this, str, null), 3, null);
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new AccountVerifyManager$verifyAccount$2(abstractC12782ctV, this, str, null), 3, null);
    }
}
