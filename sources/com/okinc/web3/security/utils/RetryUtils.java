package com.okinc.web3.security.utils;

import com.okinc.web3.security.utils.RetryUtils;
import com.okinc.web3.security.utils.RetryUtilsError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RetryUtils {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RetryUtils";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.RetryUtils.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean executeWithRetry$lambda$0(Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean executeWithRetrySuspend$lambda$1(Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return true;
        }

        private Companion() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.utils.RetryUtils$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object executeWithRetry$default(Companion companion, RetryConfig retryConfig, String str, Function0 function0, Function1 function1, int i, Object obj) throws Exception {
            if ((i & 2) != 0) {
                str = "Unknown Operation";
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: com.okinc.web3.security.utils.RetryUtils$Companion$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(RetryUtils.Companion.executeWithRetry$lambda$0((Exception) obj2));
                    }
                };
            }
            return companion.executeWithRetry(retryConfig, str, function0, function1);
        }

        public final <T> T executeWithRetry(@NotNull RetryConfig retryConfig, @NotNull String str, @NotNull Function0<? extends T> function0, @NotNull Function1<? super Exception, Boolean> function1) throws Exception {
            Exception e;
            Intrinsics.checkNotNullParameter(retryConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (retryConfig.getMaxAttempts() <= 0) {
                throw new RetryUtilsError.GenUtilsError("maxAttempts must be greater than 0");
            }
            long baseDelay = retryConfig.getBaseDelay();
            int maxAttempts = retryConfig.getMaxAttempts();
            if (1 <= maxAttempts) {
                int i = 1;
                while (true) {
                    if (i > 1) {
                        try {
                            pUU.copydefault(RetryUtils.TAG, str + " - retryCount: " + i + " max retry: " + retryConfig.getMaxAttempts());
                        } catch (Exception e2) {
                            e = e2;
                            pUU.copydefault(RetryUtils.TAG, str + " - Attempt " + i + " failed: " + e.toString());
                            if (i == retryConfig.getMaxAttempts() || !function1.invoke(e).booleanValue()) {
                                if (!function1.invoke(e).booleanValue()) {
                                    pUU.copydefault(RetryUtils.TAG, str + " - Not retrying due to error type");
                                }
                            } else {
                                pUU.copydefault(RetryUtils.TAG, str + " - Retrying in " + baseDelay + "ms...");
                                if (baseDelay > 0) {
                                    Thread.sleep(baseDelay);
                                }
                                baseDelay = Math.min((long) (baseDelay * retryConfig.getBackoffMultiplier()), retryConfig.getMaxDelay());
                                if (i == maxAttempts) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    return function0.invoke();
                }
            }
            e = null;
            pUU.copydefault(RetryUtils.TAG, str + " - All retry attempts failed");
            if (e == null) {
                throw new RetryUtilsError.GenUtilsError("Unknown retry error - no error captured");
            }
            throw e;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[PHI: r0
  0x00db: PHI (r0v23 java.lang.Object) = (r0v29 java.lang.Object), (r0v1 java.lang.Object) binds: [B:30:0x00d8, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0143 -> B:49:0x0165). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x015c -> B:48:0x015f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> Object executeWithRetrySuspend(@NotNull RetryConfig retryConfig, @NotNull String str, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Function1<? super Exception, Boolean> function12, @NotNull Continuation<? super T> continuation) throws Exception {
            RetryUtils$Companion$executeWithRetrySuspend$1 retryUtils$Companion$executeWithRetrySuspend$1;
            String str2;
            Exception exc;
            String str3;
            Function1<? super Continuation<? super T>, ? extends Object> function13;
            RetryUtils$Companion$executeWithRetrySuspend$1 retryUtils$Companion$executeWithRetrySuspend$12;
            int i;
            long j;
            RetryConfig retryConfig2;
            Function1<? super Exception, Boolean> function14;
            int i2;
            Exception exc2;
            Function1<? super Continuation<? super T>, ? extends Object> function15;
            Function1<? super Exception, Boolean> function16;
            long j2;
            int i3;
            RetryConfig retryConfig3;
            int i4;
            if (continuation instanceof RetryUtils$Companion$executeWithRetrySuspend$1) {
                retryUtils$Companion$executeWithRetrySuspend$1 = (RetryUtils$Companion$executeWithRetrySuspend$1) continuation;
                int i5 = retryUtils$Companion$executeWithRetrySuspend$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    retryUtils$Companion$executeWithRetrySuspend$1.label = i5 - Integer.MIN_VALUE;
                } else {
                    retryUtils$Companion$executeWithRetrySuspend$1 = new RetryUtils$Companion$executeWithRetrySuspend$1(this, continuation);
                }
            }
            Object objInvoke = retryUtils$Companion$executeWithRetrySuspend$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i6 = retryUtils$Companion$executeWithRetrySuspend$1.label;
            Object obj = null;
            int i7 = 1;
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 = retryUtils$Companion$executeWithRetrySuspend$1.I$1;
                    int i8 = retryUtils$Companion$executeWithRetrySuspend$1.I$0;
                    long j3 = retryUtils$Companion$executeWithRetrySuspend$1.J$0;
                    Function1<? super Exception, Boolean> function17 = (Function1) retryUtils$Companion$executeWithRetrySuspend$1.L$3;
                    Function1<? super Continuation<? super T>, ? extends Object> function18 = (Function1) retryUtils$Companion$executeWithRetrySuspend$1.L$2;
                    String str4 = (String) retryUtils$Companion$executeWithRetrySuspend$1.L$1;
                    RetryConfig retryConfig4 = (RetryConfig) retryUtils$Companion$executeWithRetrySuspend$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objInvoke);
                    } catch (Exception e) {
                        str2 = str4;
                        function16 = function17;
                        j2 = j3;
                        i3 = i8;
                        retryConfig3 = retryConfig4;
                        function15 = function18;
                        exc2 = e;
                        pUU.copydefault(RetryUtils.TAG, str2 + " - Attempt " + i3 + " failed: " + exc2.toString());
                        if (i3 != retryConfig3.getMaxAttempts()) {
                        }
                        if (!function16.invoke(exc2).booleanValue()) {
                        }
                        exc = exc2;
                        pUU.copydefault(RetryUtils.TAG, str2 + " - All retry attempts failed");
                        if (exc == null) {
                        }
                    }
                }
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = retryUtils$Companion$executeWithRetrySuspend$1.I$1;
                i3 = retryUtils$Companion$executeWithRetrySuspend$1.I$0;
                j2 = retryUtils$Companion$executeWithRetrySuspend$1.J$0;
                exc2 = (Exception) retryUtils$Companion$executeWithRetrySuspend$1.L$4;
                function16 = (Function1) retryUtils$Companion$executeWithRetrySuspend$1.L$3;
                function15 = (Function1) retryUtils$Companion$executeWithRetrySuspend$1.L$2;
                str2 = (String) retryUtils$Companion$executeWithRetrySuspend$1.L$1;
                retryConfig3 = (RetryConfig) retryUtils$Companion$executeWithRetrySuspend$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                RetryUtils$Companion$executeWithRetrySuspend$1 retryUtils$Companion$executeWithRetrySuspend$13 = retryUtils$Companion$executeWithRetrySuspend$1;
                int i9 = i4;
                retryConfig2 = retryConfig3;
                function13 = function15;
                str3 = str2;
                long jMin = Math.min((long) (j2 * retryConfig2.getBackoffMultiplier()), retryConfig2.getMaxDelay());
                if (i3 == i9) {
                    i = i3 + 1;
                    function14 = function16;
                    obj = null;
                    j = jMin;
                    i2 = i9;
                    retryUtils$Companion$executeWithRetrySuspend$12 = retryUtils$Companion$executeWithRetrySuspend$13;
                    i7 = 1;
                    if (i > i7) {
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            i4 = i2;
                            long j4 = j;
                            exc2 = e;
                            function16 = function14;
                            i3 = i;
                            function15 = function13;
                            retryConfig3 = retryConfig2;
                            retryUtils$Companion$executeWithRetrySuspend$1 = retryUtils$Companion$executeWithRetrySuspend$12;
                            j2 = j4;
                            pUU.copydefault(RetryUtils.TAG, str2 + " - Attempt " + i3 + " failed: " + exc2.toString());
                            if (i3 != retryConfig3.getMaxAttempts() || !function16.invoke(exc2).booleanValue()) {
                                if (!function16.invoke(exc2).booleanValue()) {
                                    pUU.copydefault(RetryUtils.TAG, str2 + " - Not retrying due to error type");
                                }
                                exc = exc2;
                                pUU.copydefault(RetryUtils.TAG, str2 + " - All retry attempts failed");
                                if (exc == null) {
                                }
                            } else {
                                pUU.copydefault(RetryUtils.TAG, str2 + " - Retrying in " + j2 + "ms...");
                                if (j2 > 0) {
                                    retryUtils$Companion$executeWithRetrySuspend$1.L$0 = retryConfig3;
                                    retryUtils$Companion$executeWithRetrySuspend$1.L$1 = str2;
                                    retryUtils$Companion$executeWithRetrySuspend$1.L$2 = function15;
                                    retryUtils$Companion$executeWithRetrySuspend$1.L$3 = function16;
                                    retryUtils$Companion$executeWithRetrySuspend$1.L$4 = exc2;
                                    retryUtils$Companion$executeWithRetrySuspend$1.J$0 = j2;
                                    retryUtils$Companion$executeWithRetrySuspend$1.I$0 = i3;
                                    retryUtils$Companion$executeWithRetrySuspend$1.I$1 = i4;
                                    retryUtils$Companion$executeWithRetrySuspend$1.label = 2;
                                    if (DelayKt.delay(j2, retryUtils$Companion$executeWithRetrySuspend$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                RetryUtils$Companion$executeWithRetrySuspend$1 retryUtils$Companion$executeWithRetrySuspend$132 = retryUtils$Companion$executeWithRetrySuspend$1;
                                int i92 = i4;
                                retryConfig2 = retryConfig3;
                                function13 = function15;
                                str3 = str2;
                                long jMin2 = Math.min((long) (j2 * retryConfig2.getBackoffMultiplier()), retryConfig2.getMaxDelay());
                                if (i3 == i92) {
                                }
                            }
                        }
                        pUU.copydefault(RetryUtils.TAG, str3 + " - retryCount: " + i + " max retry: " + retryConfig2.getMaxAttempts());
                    }
                    retryUtils$Companion$executeWithRetrySuspend$12.L$0 = retryConfig2;
                    retryUtils$Companion$executeWithRetrySuspend$12.L$1 = str3;
                    retryUtils$Companion$executeWithRetrySuspend$12.L$2 = function13;
                    retryUtils$Companion$executeWithRetrySuspend$12.L$3 = function14;
                    retryUtils$Companion$executeWithRetrySuspend$12.L$4 = obj;
                    retryUtils$Companion$executeWithRetrySuspend$12.J$0 = j;
                    retryUtils$Companion$executeWithRetrySuspend$12.I$0 = i;
                    retryUtils$Companion$executeWithRetrySuspend$12.I$1 = i2;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str3;
                        i4 = i2;
                        long j42 = j;
                        exc2 = e;
                        function16 = function14;
                        i3 = i;
                        function15 = function13;
                        retryConfig3 = retryConfig2;
                        retryUtils$Companion$executeWithRetrySuspend$1 = retryUtils$Companion$executeWithRetrySuspend$12;
                        j2 = j42;
                        pUU.copydefault(RetryUtils.TAG, str2 + " - Attempt " + i3 + " failed: " + exc2.toString());
                        if (i3 != retryConfig3.getMaxAttempts()) {
                        }
                        if (!function16.invoke(exc2).booleanValue()) {
                        }
                        exc = exc2;
                        pUU.copydefault(RetryUtils.TAG, str2 + " - All retry attempts failed");
                        if (exc == null) {
                        }
                    }
                    retryUtils$Companion$executeWithRetrySuspend$12.label = 1;
                    objInvoke = function13.invoke(retryUtils$Companion$executeWithRetrySuspend$12);
                    return objInvoke != objCopydefault ? objCopydefault : objInvoke;
                }
                str2 = str3;
                exc = exc2;
                pUU.copydefault(RetryUtils.TAG, str2 + " - All retry attempts failed");
                if (exc == null) {
                    throw new RetryUtilsError.GenUtilsError("Unknown retry error - no error captured");
                }
                throw exc;
            }
            C56391yDq.AEQbTJ(objInvoke);
            if (retryConfig.getMaxAttempts() <= 0) {
                throw new RetryUtilsError.GenUtilsError("maxAttempts must be greater than 0");
            }
            long baseDelay = retryConfig.getBaseDelay();
            int maxAttempts = retryConfig.getMaxAttempts();
            if (1 <= maxAttempts) {
                str3 = str;
                function13 = function1;
                retryUtils$Companion$executeWithRetrySuspend$12 = retryUtils$Companion$executeWithRetrySuspend$1;
                i = 1;
                j = baseDelay;
                retryConfig2 = retryConfig;
                function14 = function12;
                i2 = maxAttempts;
                if (i > i7) {
                }
                retryUtils$Companion$executeWithRetrySuspend$12.L$0 = retryConfig2;
                retryUtils$Companion$executeWithRetrySuspend$12.L$1 = str3;
                retryUtils$Companion$executeWithRetrySuspend$12.L$2 = function13;
                retryUtils$Companion$executeWithRetrySuspend$12.L$3 = function14;
                retryUtils$Companion$executeWithRetrySuspend$12.L$4 = obj;
                retryUtils$Companion$executeWithRetrySuspend$12.J$0 = j;
                retryUtils$Companion$executeWithRetrySuspend$12.I$0 = i;
                retryUtils$Companion$executeWithRetrySuspend$12.I$1 = i2;
                retryUtils$Companion$executeWithRetrySuspend$12.label = 1;
                objInvoke = function13.invoke(retryUtils$Companion$executeWithRetrySuspend$12);
                if (objInvoke != objCopydefault) {
                }
            } else {
                str2 = str;
                exc = null;
                pUU.copydefault(RetryUtils.TAG, str2 + " - All retry attempts failed");
                if (exc == null) {
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.web3.security.utils.RetryUtils$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object executeWithRetrySuspend$default(Companion companion, RetryConfig retryConfig, String str, Function1 function1, Function1 function12, Continuation continuation, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "Unknown Operation";
            }
            String str2 = str;
            if ((i & 8) != 0) {
                function12 = new Function1() { // from class: com.okinc.web3.security.utils.RetryUtils$Companion$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(RetryUtils.Companion.executeWithRetrySuspend$lambda$1((Exception) obj2));
                    }
                };
            }
            return companion.executeWithRetrySuspend(retryConfig, str2, function1, function12, continuation);
        }
    }
}
