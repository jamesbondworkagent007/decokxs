package o;

import aws.smithy.kotlin.runtime.http.engine.okhttp.StreamingRequestBody$doWriteTo$1;
import aws.smithy.kotlin.runtime.http.engine.okhttp.StreamingRequestBody$doWriteTo$2;
import aws.smithy.kotlin.runtime.http.engine.okhttp.StreamingRequestBody$writeTo$1;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.zP;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4303Bb extends RequestBody {
    public final CoroutineContext EZpvd;
    public final zP KWHzl;

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return null;
    }

    public C4303Bb(@NotNull zP zPVar, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(zPVar, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.KWHzl = zPVar;
        this.EZpvd = coroutineContext;
        if ((zPVar instanceof zP.Activity) || (zPVar instanceof zP.Application)) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid streaming body " + zPVar).toString());
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        java.lang.Long lAEQbTJ = this.KWHzl.AEQbTJ();
        if (lAEQbTJ != null) {
            return lAEQbTJ.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.KWHzl.b_();
    }

    @Override // okhttp3.RequestBody
    public boolean isDuplex() {
        return this.KWHzl.AhwBna();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink bufferedSink) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(bufferedSink, "");
        try {
            KWHzl(bufferedSink);
        } catch (java.lang.Exception e) {
            if (e instanceof CancellationException) {
                CoroutineContext coroutineContext = this.EZpvd;
                StreamingRequestBody$writeTo$1 streamingRequestBody$writeTo$1 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.StreamingRequestBody$writeTo$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "request cancelled";
                    }
                };
                LogLevel logLevel = LogLevel.Trace;
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C4303Bb.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(coroutineContext, logLevel, strGEmmrt, null, streamingRequestBody$writeTo$1);
                return;
            }
            if (!(e instanceof java.io.IOException)) {
                throw new java.io.IOException(e);
            }
            throw e;
        }
    }

    public final void KWHzl(BufferedSink bufferedSink) throws java.lang.InterruptedException {
        CoroutineContext coroutineContext = this.EZpvd;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(C5179Ht.copydefault(coroutineContext, "send-request-body"));
        if (isDuplex()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, coroutineContextPlus.plus(Dispatchers.getIO()), null, new StreamingRequestBody$doWriteTo$1(bufferedSink, this, null), 2, null);
        } else {
            BuildersKt.runBlocking(coroutineContextPlus.minusKey(CoroutineDispatcher.Key), new StreamingRequestBody$doWriteTo$2(this, bufferedSink, null));
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.Object OLrzqt(BufferedSink bufferedSink, Continuation<? super Unit> continuation) {
        zP zPVar = this.KWHzl;
        if (zPVar instanceof zP.Activity) {
            java.lang.Object objKWHzl = CV.KWHzl(((zP.Activity) zPVar).copydefault(), C5066Dk.copydefault(bufferedSink), continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        if (zPVar instanceof zP.Application) {
            Source sourceCopydefault = C5066Dk.copydefault(((zP.Application) zPVar).copydefault());
            try {
                bufferedSink.writeAll(sourceCopydefault);
                yFA.copydefault(sourceCopydefault, null);
                return Unit.INSTANCE;
            } finally {
            }
        } else {
            throw new java.lang.IllegalStateException(("unexpected HttpBody type " + this.KWHzl).toString());
        }
    }
}
