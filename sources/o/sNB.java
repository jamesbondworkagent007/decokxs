package o;

import com.huawei.hms.utils.FileUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNB extends RequestBody {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final RequestBody AEQbTJ;
    public final Function2<java.lang.Long, java.lang.Long, Unit> EZpvd;
    public final long copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public sNB(@NotNull RequestBody requestBody, long j, @NotNull Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
        Intrinsics.checkNotNullParameter(requestBody, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = requestBody;
        this.copydefault = j;
        this.EZpvd = function2;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.AEQbTJ.contentType();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.copydefault;
        return j > 0 ? j : this.AEQbTJ.contentLength();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink bufferedSink) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "");
        pUU.EZpvd("FileUploadProgress", "writeTo: starting, knownTotalBytes=" + this.copydefault + ", delegateContentLength=" + this.AEQbTJ.contentLength() + ", effectiveContentLength=" + contentLength() + ", contentType=" + contentType());
        BufferedSink bufferedSinkBuffer = Okio.buffer(new Application(bufferedSink, this.copydefault, this.EZpvd));
        this.AEQbTJ.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
        long j = this.copydefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("writeTo: finished, knownTotalBytes=");
        sb.append(j);
        pUU.EZpvd("FileUploadProgress", sb.toString());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class Application extends ForwardingSink {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public long AEQbTJ;
        public final long EZpvd;
        public final long KWHzl;
        public long OLrzqt;
        public final Function2<java.lang.Long, java.lang.Long, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull Sink sink, long j, @NotNull Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
            super(sink);
            Intrinsics.checkNotNullParameter(sink, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.EZpvd = j;
            this.copydefault = function2;
            this.KWHzl = java.lang.System.nanoTime();
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(@NotNull okio.Buffer buffer, long j) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(buffer, "");
            super.write(buffer, j);
            this.AEQbTJ += j;
            if (java.lang.System.nanoTime() - this.KWHzl > 800000000) {
                long j2 = this.AEQbTJ;
                if (j2 - this.OLrzqt >= FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
                    this.copydefault.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(this.EZpvd));
                    this.OLrzqt = this.AEQbTJ;
                }
            }
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNB.Application.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }
    }
}
