package uniffi;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60173zxj;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"capacity", "len", "data"})
public class RustBuffer extends Structure {
    public long capacity;
    public Pointer data;
    public long len;
    private final InterfaceC60174zxk rustBufferOp;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC60174zxk getRustBufferOp() {
        return this.rustBufferOp;
    }

    public RustBuffer(InterfaceC60174zxk interfaceC60174zxk) {
        this.rustBufferOp = interfaceC60174zxk;
    }

    public RustBuffer() {
        this(null);
    }

    public static final class ByValue extends RustBuffer implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ByValue() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ByValue(InterfaceC60174zxk interfaceC60174zxk) {
            super(interfaceC60174zxk);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.zxk:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.zxk) : (r1v0 o.zxk))
 A[MD:(o.zxk):void (m)] (LINE:57) call: uniffi.RustBuffer.ByValue.<init>(o.zxk):void type: THIS */
        public /* synthetic */ ByValue(InterfaceC60174zxk interfaceC60174zxk, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : interfaceC60174zxk);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ByReference extends RustBuffer implements Structure.ByReference {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ByReference() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ByReference(InterfaceC60174zxk interfaceC60174zxk) {
            super(interfaceC60174zxk);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.zxk:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.zxk) : (r1v0 o.zxk))
 A[MD:(o.zxk):void (m)] (LINE:60) call: uniffi.RustBuffer.ByReference.<init>(o.zxk):void type: THIS */
        public /* synthetic */ ByReference(InterfaceC60174zxk interfaceC60174zxk, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : interfaceC60174zxk);
        }
    }

    public final void setValue$OKCore_deploy(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.capacity = rustBuffer.capacity;
        this.len = rustBuffer.len;
        this.data = rustBuffer.data;
    }

    /* JADX INFO: renamed from: alloc-VKZWuLQ$default, reason: not valid java name */
    public static /* synthetic */ ByValue m9574allocVKZWuLQ$default(RustBuffer rustBuffer, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alloc-VKZWuLQ");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return rustBuffer.m9575allocVKZWuLQ(j);
    }

    /* JADX INFO: renamed from: alloc-VKZWuLQ, reason: not valid java name */
    public final ByValue m9575allocVKZWuLQ(final long j) {
        ByValue byValue = (ByValue) C60173zxj.uniffiRustCall(this, new Function1() { // from class: o.zxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RustBuffer.alloc_VKZWuLQ$lambda$0(this.copydefault, j, (UniffiRustCallStatus) obj);
            }
        });
        if (byValue.data != null) {
            return byValue;
        }
        throw new RuntimeException("RustBuffer.alloc() returned null data pointer (size=" + C56396yDv.EZpvd(j) + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByValue alloc_VKZWuLQ$lambda$0(RustBuffer rustBuffer, long j, UniffiRustCallStatus uniffiRustCallStatus) {
        ByValue byValueAlloc;
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        InterfaceC60174zxk interfaceC60174zxk = rustBuffer.rustBufferOp;
        if (interfaceC60174zxk == null || (byValueAlloc = interfaceC60174zxk.alloc(j, uniffiRustCallStatus)) == null) {
            throw new IllegalStateException("RustBuffer.alloc() called without rustBufferOp");
        }
        return byValueAlloc;
    }

    public final void free(@NotNull final ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        C60173zxj.uniffiRustCall(this, new Function1() { // from class: o.zxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RustBuffer.free$lambda$2(this.copydefault, byValue, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit free$lambda$2(RustBuffer rustBuffer, ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        InterfaceC60174zxk interfaceC60174zxk = rustBuffer.rustBufferOp;
        if (interfaceC60174zxk == null) {
            throw new IllegalStateException("RustBuffer.free() called without rustBufferOp");
        }
        interfaceC60174zxk.free(byValue, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.RustBuffer.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final ByteBuffer asByteBuffer() {
        ByteBuffer byteBuffer;
        Pointer pointer = this.data;
        if (pointer == null || (byteBuffer = pointer.getByteBuffer(0L, this.len)) == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }
}
