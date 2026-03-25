package o;

import aws.sdk.kotlin.runtime.ConfigurationException;
import aws.sdk.kotlin.runtime.config.retries.ResolveRetryStrategyKt$resolveRetryStrategy$1;
import aws.sdk.kotlin.runtime.config.retries.ResolveRetryStrategyKt$resolveRetryStrategy$2;
import aws.smithy.kotlin.runtime.client.config.RetryMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PipedOutputStream {

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RetryMode.values().length];
            try {
                iArr[RetryMode.STANDARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RetryMode.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RetryMode.ADAPTIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super DW> continuation) throws java.lang.Throwable {
        ResolveRetryStrategyKt$resolveRetryStrategy$1 resolveRetryStrategyKt$resolveRetryStrategy$1;
        final java.lang.Integer numEZpvd;
        RetryMode retryMode;
        java.lang.Integer num;
        int i;
        InterfaceC5185Hz interfaceC5185Hz;
        RetryMode retryModeDjBIcL;
        if (continuation instanceof ResolveRetryStrategyKt$resolveRetryStrategy$1) {
            resolveRetryStrategyKt$resolveRetryStrategy$1 = (ResolveRetryStrategyKt$resolveRetryStrategy$1) continuation;
            int i2 = resolveRetryStrategyKt$resolveRetryStrategy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveRetryStrategyKt$resolveRetryStrategy$1.label = i2 - Integer.MIN_VALUE;
            } else {
                resolveRetryStrategyKt$resolveRetryStrategy$1 = new ResolveRetryStrategyKt$resolveRetryStrategy$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolveRetryStrategyKt$resolveRetryStrategy$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = resolveRetryStrategyKt$resolveRetryStrategy$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            numEZpvd = (java.lang.Integer) C59333zf.AEQbTJ(IOException.zsXlph.AuCTel(), hl);
            if (numEZpvd == null) {
                resolveRetryStrategyKt$resolveRetryStrategy$1.L$0 = hl;
                resolveRetryStrategyKt$resolveRetryStrategy$1.L$1 = hh;
                resolveRetryStrategyKt$resolveRetryStrategy$1.label = 1;
                objKWHzl = hh.KWHzl(resolveRetryStrategyKt$resolveRetryStrategy$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            retryMode = (RetryMode) C59333zf.AEQbTJ(IOException.zsXlph.fIwbmz(), hl);
            if (retryMode == null) {
                resolveRetryStrategyKt$resolveRetryStrategy$1.L$0 = numEZpvd;
                resolveRetryStrategyKt$resolveRetryStrategy$1.L$1 = null;
                resolveRetryStrategyKt$resolveRetryStrategy$1.label = 2;
                java.lang.Object objKWHzl2 = hh.KWHzl(resolveRetryStrategyKt$resolveRetryStrategy$1);
                if (objKWHzl2 == objCopydefault) {
                    return objCopydefault;
                }
                java.lang.Integer num2 = numEZpvd;
                objKWHzl = objKWHzl2;
                num = num2;
                retryModeDjBIcL = ObjectInputValidation.djBIcL((ObjectStreamField) objKWHzl);
                if (retryModeDjBIcL == null) {
                }
                numEZpvd = num;
                retryMode = retryModeDjBIcL;
            }
            i = ActionBar.KWHzl[retryMode.ordinal()];
            if (i == 1) {
                interfaceC5185Hz = DY.KWHzl;
            }
            return interfaceC5185Hz.OLrzqt(new Function1<DY.TaskDescription.ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.config.retries.ResolveRetryStrategyKt$resolveRetryStrategy$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DY.TaskDescription.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DY.TaskDescription.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                    Integer num3 = numEZpvd;
                    if (num3 != null) {
                        int iIntValue = num3.intValue();
                        if (iIntValue < 1) {
                            throw new ConfigurationException("max attempts was " + iIntValue + ", but should be at least 1");
                        }
                        actionBar.EZpvd(iIntValue);
                    }
                }
            });
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (java.lang.Integer) resolveRetryStrategyKt$resolveRetryStrategy$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            retryModeDjBIcL = ObjectInputValidation.djBIcL((ObjectStreamField) objKWHzl);
            if (retryModeDjBIcL == null) {
                retryModeDjBIcL = RetryMode.STANDARD;
            }
            numEZpvd = num;
            retryMode = retryModeDjBIcL;
            i = ActionBar.KWHzl[retryMode.ordinal()];
            if (i == 1 || i == 2) {
                interfaceC5185Hz = DY.KWHzl;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC5185Hz = DR.AEQbTJ;
            }
            return interfaceC5185Hz.OLrzqt(new Function1<DY.TaskDescription.ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.config.retries.ResolveRetryStrategyKt$resolveRetryStrategy$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DY.TaskDescription.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DY.TaskDescription.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                    Integer num3 = numEZpvd;
                    if (num3 != null) {
                        int iIntValue = num3.intValue();
                        if (iIntValue < 1) {
                            throw new ConfigurationException("max attempts was " + iIntValue + ", but should be at least 1");
                        }
                        actionBar.EZpvd(iIntValue);
                    }
                }
            });
        }
        HH<ObjectStreamField> hh2 = (HH) resolveRetryStrategyKt$resolveRetryStrategy$1.L$1;
        HL hl2 = (HL) resolveRetryStrategyKt$resolveRetryStrategy$1.L$0;
        C56391yDq.AEQbTJ(objKWHzl);
        hh = hh2;
        hl = hl2;
        numEZpvd = ObjectInputValidation.EZpvd((ObjectStreamField) objKWHzl);
        retryMode = (RetryMode) C59333zf.AEQbTJ(IOException.zsXlph.fIwbmz(), hl);
        if (retryMode == null) {
        }
        i = ActionBar.KWHzl[retryMode.ordinal()];
        if (i == 1) {
        }
        return interfaceC5185Hz.OLrzqt(new Function1<DY.TaskDescription.ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.config.retries.ResolveRetryStrategyKt$resolveRetryStrategy$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DY.TaskDescription.ActionBar actionBar) {
                invoke2(actionBar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DY.TaskDescription.ActionBar actionBar) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                Integer num3 = numEZpvd;
                if (num3 != null) {
                    int iIntValue = num3.intValue();
                    if (iIntValue < 1) {
                        throw new ConfigurationException("max attempts was " + iIntValue + ", but should be at least 1");
                    }
                    actionBar.EZpvd(iIntValue);
                }
            }
        });
    }

    public static /* synthetic */ java.lang.Object resolveRetryStrategy$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        if ((i & 2) != 0) {
            hh = HE.AEQbTJ(new ResolveRetryStrategyKt$resolveRetryStrategy$2(hl, null));
        }
        return EZpvd(hl, hh, continuation);
    }
}
