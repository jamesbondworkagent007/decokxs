package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class swX extends AbstractC43215rlA implements InterfaceC45748swL {
    public final CompletableJob AEQbTJ;
    public final CoroutineScope EZpvd;
    public final CoroutineExceptionHandler KWHzl;
    public final InterfaceC56387yDm copydefault;

    public swX() {
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null);
        this.AEQbTJ = completableJobSupervisorJob$default;
        this.EZpvd = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(completableJobSupervisorJob$default));
        this.KWHzl = new Activity(CoroutineExceptionHandler.Key);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.swZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return swX.OLrzqt();
            }
        });
    }

    public static final C45784sxc OLrzqt() {
        return new C45784sxc();
    }

    public final C45784sxc KWHzl() {
        return (C45784sxc) this.copydefault.getValue();
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
        }

        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    @Override // o.InterfaceC45748swL
    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        sxA.KWHzl(context);
    }

    @Override // o.InterfaceC45748swL
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ActivityC45795sxo.Companion.EZpvd(context, OKComplianceRestrictionService.Feature.valueOf(str), str2, bundle);
    }
}
