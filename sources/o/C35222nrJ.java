package o;

import com.okinc.im.call.domain.CallTimeoutManager$startNoAnswerTimeout$1;
import com.okinc.im.call.model.CallStateV2;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35222nrJ {
    public Activity EZpvd;
    public Job KWHzl;
    public Function0<? extends CallStateV2> OLrzqt;
    public CoroutineScope copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.nrJ$Activity */
    public interface Activity {
        void AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull CoroutineScope coroutineScope, @NotNull Function0<? extends CallStateV2> function0, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = coroutineScope;
        this.OLrzqt = function0;
        this.EZpvd = activity;
    }

    @yCM
    public C35222nrJ() {
    }

    /* JADX INFO: renamed from: o.nrJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl() {
        CoroutineScope coroutineScope;
        KWHzl("startNoAnswerTimeout: Starting 30000ms timeout");
        EZpvd();
        CoroutineScope coroutineScope2 = this.copydefault;
        if (coroutineScope2 == null) {
            Intrinsics.gEmmrt("");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope2;
        }
        this.KWHzl = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CallTimeoutManager$startNoAnswerTimeout$1(this, null), 3, null);
    }

    public final void EZpvd() {
        if (this.KWHzl != null) {
            KWHzl("cancelNoAnswerTimeout: Cancelling active timeout");
        }
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.KWHzl = null;
    }

    public final void KWHzl(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("CallTimeoutManager: " + str, null, 2, null);
    }
}
