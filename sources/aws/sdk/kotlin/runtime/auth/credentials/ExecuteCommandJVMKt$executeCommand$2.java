package aws.sdk.kotlin.runtime.auth.credentials;

import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ExecuteCommandJVMKt$executeCommand$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends String>>, Object> {
    final /* synthetic */ ArrayList<String> $cmd;
    final /* synthetic */ long $maxOutputLengthBytes;
    final /* synthetic */ long $timeoutMillis;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCommandJVMKt$executeCommand$2(ArrayList<String> arrayList, long j, long j2, Continuation<? super ExecuteCommandJVMKt$executeCommand$2> continuation) {
        super(2, continuation);
        this.$cmd = arrayList;
        this.$timeoutMillis = j;
        this.$maxOutputLengthBytes = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ExecuteCommandJVMKt$executeCommand$2(this.$cmd, this.$timeoutMillis, this.$maxOutputLengthBytes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Integer, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Integer, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super Pair<Integer, String>> continuation) {
        return ((ExecuteCommandJVMKt$executeCommand$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Process process;
        BufferedReader bufferedReader;
        StringBuilder sb;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Process processStart = new ProcessBuilder(new String[0]).command(this.$cmd).start();
            InputStream inputStream = processStart.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            BufferedReader bufferedReader2 = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            StringBuilder sb2 = new StringBuilder();
            long j = this.$timeoutMillis;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bufferedReader2, new char[1024], sb2, this.$maxOutputLengthBytes, processStart, null);
            this.L$0 = processStart;
            this.L$1 = bufferedReader2;
            this.L$2 = sb2;
            this.label = 1;
            if (TimeoutKt.withTimeout(j, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            process = processStart;
            bufferedReader = bufferedReader2;
            sb = sb2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) this.L$2;
            bufferedReader = (BufferedReader) this.L$1;
            process = (Process) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        bufferedReader.close();
        if (process.exitValue() == 0) {
            strAEQbTJ = sb.toString();
        } else {
            InputStream errorStream = process.getErrorStream();
            Intrinsics.checkNotNullExpressionValue(errorStream, "");
            Reader inputStreamReader2 = new InputStreamReader(errorStream, Charsets.UTF_8);
            BufferedReader bufferedReader3 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
            try {
                strAEQbTJ = yFK.AEQbTJ(bufferedReader3);
                yFA.copydefault(bufferedReader3, null);
            } finally {
            }
        }
        Intrinsics.copydefault((Object) strAEQbTJ);
        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(process.exitValue()), strAEQbTJ);
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.ExecuteCommandJVMKt$executeCommand$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ char[] $buffer;
        final /* synthetic */ long $maxOutputLengthBytes;
        final /* synthetic */ StringBuilder $output;
        final /* synthetic */ Process $process;
        final /* synthetic */ BufferedReader $reader;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, long j, Process process, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reader = bufferedReader;
            this.$buffer = cArr;
            this.$output = sb;
            this.$maxOutputLengthBytes = j;
            this.$process = process;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$reader, this.$buffer, this.$output, this.$maxOutputLengthBytes, this.$process, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                while (this.$reader.read(this.$buffer) != -1) {
                    this.$output.append(this.$buffer);
                    if (this.$output.length() > this.$maxOutputLengthBytes) {
                        throw new CredentialsProviderException("Process output exceeded limit of " + this.$maxOutputLengthBytes + " bytes", null, 2, null);
                    }
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C01611 c01611 = new C01611(this.$process, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c01611, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }

        /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.ExecuteCommandJVMKt$executeCommand$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
            final /* synthetic */ Process $process;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01611(Process process, Continuation<? super C01611> continuation) {
                super(2, continuation);
                this.$process = process;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C01611(this.$process, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
                return ((C01611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.AEQbTJ(this.$process.waitFor());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
