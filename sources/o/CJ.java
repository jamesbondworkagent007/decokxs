package o;

import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CJ;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CJ implements Source {
    public final long AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public long KWHzl;
    public final Timeout OLrzqt;
    public final java.io.File copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // okio.Source
    public Timeout timeout() {
        return this.OLrzqt;
    }

    public CJ(@NotNull java.io.File file, final long j, long j2, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(timeout, "");
        this.copydefault = file;
        this.AEQbTJ = j2;
        this.OLrzqt = timeout;
        this.EZpvd = C56392yDr.copydefault(new Function0<java.io.RandomAccessFile>() { // from class: aws.smithy.kotlin.runtime.io.RandomAccessFileSource$file$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RandomAccessFile invoke() throws IOException {
                boolean zExists = this.this$0.copydefault.exists();
                CJ cj = this.this$0;
                if (zExists) {
                    boolean zIsFile = cj.copydefault.isFile();
                    CJ cj2 = this.this$0;
                    if (!zIsFile) {
                        throw new IllegalArgumentException(("cannot create a SdkSource from a directory: " + cj2).toString());
                    }
                    long j3 = j;
                    if (j3 >= 0) {
                        long j4 = cj2.AEQbTJ;
                        long j5 = j - 1;
                        boolean z = j4 >= j5;
                        CJ cj3 = this.this$0;
                        if (z) {
                            boolean z2 = cj3.AEQbTJ <= this.this$0.copydefault.length() - 1;
                            CJ cj4 = this.this$0;
                            if (!z2) {
                                throw new IllegalArgumentException(("endInclusive should be less than or equal to the length of the file, was " + cj4.AEQbTJ).toString());
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(this.this$0.copydefault, "r");
                            long j6 = j;
                            if (j6 > 0) {
                                randomAccessFile.seek(j6);
                            }
                            return randomAccessFile;
                        }
                        throw new IllegalArgumentException(("end index " + cj3.AEQbTJ + " must be greater than or equal to the start index minus one (" + j5 + ')').toString());
                    }
                    throw new IllegalArgumentException(("start position should be >= 0, found " + j3).toString());
                }
                throw new IllegalArgumentException(("cannot create SdkSource, file does not exist: " + cj).toString());
            }
        });
        this.KWHzl = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r8v0 java.io.File)
  (r9v0 long)
  (r11v0 long)
  (wrap:okio.Timeout:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:okio.Timeout:0x0004: SGET  A[WRAPPED] (LINE:19) okio.Timeout.NONE okio.Timeout) : (r13v0 okio.Timeout))
 A[MD:(java.io.File, long, long, okio.Timeout):void (m)] (LINE:15) call: o.CJ.<init>(java.io.File, long, long, okio.Timeout):void type: THIS */
    public /* synthetic */ CJ(java.io.File file, long j, long j2, Timeout timeout, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j, j2, (i & 8) != 0 ? Timeout.NONE : timeout);
    }

    public final java.io.RandomAccessFile OLrzqt() {
        return (java.io.RandomAccessFile) this.EZpvd.getValue();
    }

    public java.lang.String toString() {
        return "RandomAccessFileSource(" + this.copydefault + ')';
    }

    @Override // okio.Source
    public long read(@NotNull okio.Buffer buffer, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(buffer, "");
        java.nio.channels.FileChannel channel = OLrzqt().getChannel();
        if (!channel.isOpen()) {
            throw new java.lang.IllegalStateException("channel is closed".toString());
        }
        long j2 = this.KWHzl;
        long j3 = this.AEQbTJ;
        if (j2 > j3) {
            return -1L;
        }
        long jTransferTo = channel.transferTo(this.KWHzl, java.lang.Math.min(j, (j3 - j2) + 1), buffer);
        this.KWHzl += jTransferTo;
        return jTransferTo;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        OLrzqt().close();
    }
}
