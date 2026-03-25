package o;

import com.okinc.business.market.features.ai_summary.core.AiSummaryCoreAdapter$getInsightsSummary$1;
import com.okinc.business.market.features.ai_summary.core.AiSummaryCoreAdapter$getInsightsSummary$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25794jGp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C25794jGp(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jGp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<AGG>> continuation) throws java.lang.Throwable {
        AiSummaryCoreAdapter$getInsightsSummary$1 aiSummaryCoreAdapter$getInsightsSummary$1;
        if (continuation instanceof AiSummaryCoreAdapter$getInsightsSummary$1) {
            aiSummaryCoreAdapter$getInsightsSummary$1 = (AiSummaryCoreAdapter$getInsightsSummary$1) continuation;
            int i = aiSummaryCoreAdapter$getInsightsSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aiSummaryCoreAdapter$getInsightsSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                aiSummaryCoreAdapter$getInsightsSummary$1 = new AiSummaryCoreAdapter$getInsightsSummary$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = aiSummaryCoreAdapter$getInsightsSummary$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aiSummaryCoreAdapter$getInsightsSummary$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            AiSummaryCoreAdapter$getInsightsSummary$2 aiSummaryCoreAdapter$getInsightsSummary$2 = new AiSummaryCoreAdapter$getInsightsSummary$2(str, str2, str3, this, null);
            aiSummaryCoreAdapter$getInsightsSummary$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, aiSummaryCoreAdapter$getInsightsSummary$2, aiSummaryCoreAdapter$getInsightsSummary$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
