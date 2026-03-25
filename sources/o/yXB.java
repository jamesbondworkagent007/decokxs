package o;

import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import o.yXQ;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yXB implements yXQ {
    protected int memoizedHashCode = 0;

    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamEZpvd = CodedOutputStream.EZpvd(outputStream, CodedOutputStream.copydefault(CodedOutputStream.OLrzqt(serializedSize) + serializedSize));
        codedOutputStreamEZpvd.ejfBZ(serializedSize);
        writeTo(codedOutputStreamEZpvd);
        codedOutputStreamEZpvd.OLrzqt();
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public static abstract class ActionBar<BuilderType extends ActionBar> implements yXQ.StateListAnimator {
        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        @Override // 
        /* JADX INFO: renamed from: AhwBna */
        public abstract BuilderType valueOf();

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yXG;Lo/yXE;)Lo/yXQ$StateListAnimator; */
        @Override // o.yXQ.StateListAnimator
        public abstract BuilderType OLrzqt(yXG yxg, yXE yxe) throws java.io.IOException;

        public static final class StateListAnimator extends java.io.FilterInputStream {
            public int EZpvd;

            public StateListAnimator(java.io.InputStream inputStream, int i) {
                super(inputStream);
                this.EZpvd = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                return java.lang.Math.min(super.available(), this.EZpvd);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                if (this.EZpvd <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.EZpvd--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = this.EZpvd;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, java.lang.Math.min(i2, i3));
                if (i4 >= 0) {
                    this.EZpvd -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws java.io.IOException {
                long jSkip = super.skip(java.lang.Math.min(j, this.EZpvd));
                if (jSkip >= 0) {
                    this.EZpvd = (int) (((long) this.EZpvd) - jSkip);
                }
                return jSkip;
            }
        }

        public static UninitializedMessageException OLrzqt(yXQ yxq) {
            return new UninitializedMessageException(yxq);
        }
    }
}
