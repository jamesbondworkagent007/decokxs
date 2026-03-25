package com.okinc.nft.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33129mqd;
import o.C43654rtP;
import o.C48872udq;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.yFK;

/* JADX INFO: loaded from: classes23.dex */
public final class StarknetUtil$loadStarknetJs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $callback;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StarknetUtil$loadStarknetJs$1(Function1<? super String, Unit> function1, Continuation<? super StarknetUtil$loadStarknetJs$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StarknetUtil$loadStarknetJs$1(this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StarknetUtil$loadStarknetJs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:72|31|(1:33)(2:34|35)|(2:65|36)|67|46) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        MainCoroutineDispatcher main;
        AnonymousClass2 anonymousClass2;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BufferedReader bufferedReader2 = null;
            try {
                strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ("file_discover_starknet_js2");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                File file = new File(strAEQbTJ);
                if (file.exists() && file.isDirectory() && file.listFiles() != null) {
                    File[] fileArrListFiles = file.listFiles();
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    if (!(fileArrListFiles.length == 0)) {
                        File file2 = file.listFiles()[0];
                        String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (C59449zhJ.endsWith$default(name, ".js", false, 2, null)) {
                            fileInputStream = new FileInputStream(file2);
                        }
                        if (fileInputStream != null) {
                        }
                        main = Dispatchers.getMain();
                        anonymousClass2 = new AnonymousClass2(this.$callback, null);
                        this.label = 1;
                        if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                        }
                    }
                } else {
                    fileInputStream = null;
                    if (fileInputStream != null) {
                        try {
                            Reader inputStreamReader = new InputStreamReader(fileInputStream, Charsets.UTF_8);
                            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = null;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader2 != null) {
                            }
                            throw th;
                        }
                        try {
                            try {
                                C43654rtP c43654rtP = C43654rtP.EZpvd;
                                C43654rtP.copydefault = yFK.AEQbTJ(bufferedReader);
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                            }
                            main = Dispatchers.getMain();
                            anonymousClass2 = new AnonymousClass2(this.$callback, null);
                            this.label = 1;
                            if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                        bufferedReader.close();
                    }
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.$callback, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.nft.util.StarknetUtil$loadStarknetJs$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $callback;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$callback.invoke(C43654rtP.copydefault);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
