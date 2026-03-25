package aws.smithy.kotlin.runtime.content;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.CN;
import o.CU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteStreamKt$toByteStream$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CN $ch;
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ Flow<byte[]> $this_toByteStream;
    final /* synthetic */ Ref.LongRef $totalWritten;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamKt$toByteStream$job$1(Flow<byte[]> flow, Long l, Ref.LongRef longRef, CN cn2, Continuation<? super ByteStreamKt$toByteStream$job$1> continuation) {
        super(2, continuation);
        this.$this_toByteStream = flow;
        this.$contentLength = l;
        this.$totalWritten = longRef;
        this.$ch = cn2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ByteStreamKt$toByteStream$job$1(this.$this_toByteStream, this.$contentLength, this.$totalWritten, this.$ch, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteStreamKt$toByteStream$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: aws.smithy.kotlin.runtime.content.ByteStreamKt$toByteStream$job$1$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector {
        public final /* synthetic */ Ref.LongRef KWHzl;
        public final /* synthetic */ CN OLrzqt;
        public final /* synthetic */ Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(CN cn2, Ref.LongRef longRef, Long l) {
            this.OLrzqt = cn2;
            this.KWHzl = longRef;
            this.copydefault = l;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            ByteStreamKt$toByteStream$job$1$1$emit$1 byteStreamKt$toByteStream$job$1$1$emit$1;
            AnonymousClass3<T> anonymousClass3;
            if (continuation instanceof ByteStreamKt$toByteStream$job$1$1$emit$1) {
                byteStreamKt$toByteStream$job$1$1$emit$1 = (ByteStreamKt$toByteStream$job$1$1$emit$1) continuation;
                int i = byteStreamKt$toByteStream$job$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    byteStreamKt$toByteStream$job$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    byteStreamKt$toByteStream$job$1$1$emit$1 = new ByteStreamKt$toByteStream$job$1$1$emit$1(this, continuation);
                }
            }
            ByteStreamKt$toByteStream$job$1$1$emit$1 byteStreamKt$toByteStream$job$1$1$emit$12 = byteStreamKt$toByteStream$job$1$1$emit$1;
            Object obj = byteStreamKt$toByteStream$job$1$1$emit$12.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = byteStreamKt$toByteStream$job$1$1$emit$12.label;
            boolean z = true;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                CN cn2 = this.OLrzqt;
                byteStreamKt$toByteStream$job$1$1$emit$12.L$0 = this;
                byteStreamKt$toByteStream$job$1$1$emit$12.L$1 = bArr;
                byteStreamKt$toByteStream$job$1$1$emit$12.label = 1;
                if (CU.write$default(cn2, bArr, 0, 0, byteStreamKt$toByteStream$job$1$1$emit$12, 6, null) == objCopydefault) {
                    return objCopydefault;
                }
                anonymousClass3 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) byteStreamKt$toByteStream$job$1$1$emit$12.L$1;
                anonymousClass3 = (AnonymousClass3) byteStreamKt$toByteStream$job$1$1$emit$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Ref.LongRef longRef = anonymousClass3.KWHzl;
            long length = longRef.element + ((long) bArr.length);
            longRef.element = length;
            Long l = anonymousClass3.copydefault;
            if (l != null && length > l.longValue()) {
                z = false;
            }
            Ref.LongRef longRef2 = anonymousClass3.KWHzl;
            Long l2 = anonymousClass3.copydefault;
            if (!z) {
                throw new IllegalStateException((longRef2.element + " bytes collected from flow exceeds reported content length of " + l2).toString());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<byte[]> flow = this.$this_toByteStream;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$ch, this.$totalWritten, this.$contentLength);
            this.label = 1;
            if (flow.collect(anonymousClass3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Long l = this.$contentLength;
        if (l != null) {
            long j = this.$totalWritten.element;
            if (l == null || j != l.longValue()) {
                z = false;
            }
        }
        Long l2 = this.$contentLength;
        Ref.LongRef longRef = this.$totalWritten;
        if (!z) {
            throw new IllegalStateException(("expected " + l2 + " bytes collected from flow, got " + longRef.element).toString());
        }
        this.$ch.close();
        return Unit.INSTANCE;
    }
}
