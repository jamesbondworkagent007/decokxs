package o;

import aws.sdk.kotlin.runtime.config.AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1;
import aws.sdk.kotlin.runtime.config.AbstractAwsSdkClientFactory$fromEnvironment$1;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import o.FilterInputStream;
import o.FilterInputStream.Application;
import o.InterfaceC5134Ga;
import o.InterfaceC57101yc;
import o.InterfaceC57154yd;
import o.InterfaceC57154yd.StateListAnimator;
import o.InterfaceC57313yg;
import o.InterfaceC57313yg.Activity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class IOError<TConfig extends InterfaceC57313yg & FilterInputStream, TConfigBuilder extends InterfaceC57313yg.Activity<TConfig> & FilterInputStream.Application, TClient extends InterfaceC57154yd, TClientBuilder extends InterfaceC57154yd.StateListAnimator<TConfig, TConfigBuilder, ? extends TClient>> implements InterfaceC57101yc<TConfig, TConfigBuilder, TClient, TClientBuilder> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(@NotNull TClientBuilder tclientbuilder, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, tclientbuilder, hh, hh2, continuation);
    }

    public TClient copydefault(@NotNull Function1<? super TConfigBuilder, Unit> function1) {
        return (TClient) InterfaceC57101yc.Activity.OLrzqt(this, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.IOError */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object fromEnvironment$default(IOError iOError, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromEnvironment");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        return iOError.EZpvd(function1, continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0035 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00e9 */
    /* JADX DEBUG: Type inference failed for r14v10. Raw type applied. Possible types: TClient, java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:52:0x00ee, B:54:0x00f2, B:56:0x0104, B:55:0x00fc), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:52:0x00ee, B:54:0x00f2, B:56:0x0104, B:55:0x00fc), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v13, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r14v9, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, o.GU] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.GU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Function1<? super TConfigBuilder, Unit> function1, @NotNull Continuation<? super TClient> continuation) throws java.lang.Throwable {
        AbstractAwsSdkClientFactory$fromEnvironment$1 abstractAwsSdkClientFactory$fromEnvironment$1;
        ?? EZpvd;
        java.lang.Throwable th;
        FZ fzOLrzqt;
        java.lang.Exception e;
        ?? r14;
        CoroutineContext c5140Gg;
        InterfaceC57154yd.StateListAnimator stateListAnimator;
        ?? r142;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof AbstractAwsSdkClientFactory$fromEnvironment$1) {
            abstractAwsSdkClientFactory$fromEnvironment$1 = (AbstractAwsSdkClientFactory$fromEnvironment$1) continuation;
            int i = abstractAwsSdkClientFactory$fromEnvironment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractAwsSdkClientFactory$fromEnvironment$1.label = i - Integer.MIN_VALUE;
            } else {
                abstractAwsSdkClientFactory$fromEnvironment$1 = new AbstractAwsSdkClientFactory$fromEnvironment$1(this, continuation);
            }
        }
        java.lang.Object obj = abstractAwsSdkClientFactory$fromEnvironment$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = abstractAwsSdkClientFactory$fromEnvironment$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r14 = (GU) abstractAwsSdkClientFactory$fromEnvironment$1.L$1;
                stateListAnimator = (InterfaceC57154yd.StateListAnimator) abstractAwsSdkClientFactory$fromEnvironment$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    r142 = r14;
                    r142.close();
                    return stateListAnimator.OLrzqt();
                } catch (java.lang.Exception e2) {
                    e = e2;
                    if (e instanceof CancellationException) {
                        r14.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(r14, e, true);
                    } else {
                        GX.OLrzqt(r14, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            }
            C56391yDq.AEQbTJ(obj);
            TClientBuilder tclientbuilderEZpvd = EZpvd();
            InterfaceC57313yg.Activity activityEZpvd = tclientbuilderEZpvd.EZpvd();
            FW fwOLrzqt = null;
            InterfaceC5134Ga.Activity activity = tclientbuilderEZpvd instanceof InterfaceC5134Ga.Activity ? (InterfaceC5134Ga.Activity) tclientbuilderEZpvd : null;
            if (activity == null || (fzOLrzqt = activity.AuCTel()) == null) {
                fzOLrzqt = FZ.AYXKKw.OLrzqt();
            }
            GY gyEZpvd = fzOLrzqt.copydefault().EZpvd("AwsSdkClientFactory");
            InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
            SpanKind spanKind = SpanKind.INTERNAL;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            EZpvd = gyEZpvd.EZpvd("fromEnvironment", interfaceC57843yqCopydefault, spanKind, C5143Gj.EZpvd(abstractAwsSdkClientFactory$fromEnvironment$1.getContext()));
            try {
                FY fy = (FY) abstractAwsSdkClientFactory$fromEnvironment$1.getContext().get(FY.KWHzl);
                if (fy != null && (fzAEQbTJ = fy.AEQbTJ()) != null && (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) != null) {
                    fwOLrzqt = interfaceC5135GbOLrzqt.OLrzqt();
                }
                if (fwOLrzqt != null) {
                    c5140Gg = new C5140Gg(fwOLrzqt);
                } else {
                    c5140Gg = (C5140Gg) abstractAwsSdkClientFactory$fromEnvironment$1.getContext().get(C5140Gg.EZpvd);
                    if (c5140Gg == null) {
                        c5140Gg = emptyCoroutineContext;
                    }
                }
                CoroutineContext coroutineContextPlus = emptyCoroutineContext.plus(new GW(EZpvd)).plus(c5140Gg);
                AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1 abstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1 = new AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1(EZpvd, null, activityEZpvd, function1, this, tclientbuilderEZpvd);
                abstractAwsSdkClientFactory$fromEnvironment$1.L$0 = tclientbuilderEZpvd;
                abstractAwsSdkClientFactory$fromEnvironment$1.L$1 = EZpvd;
                abstractAwsSdkClientFactory$fromEnvironment$1.label = 1;
                if (BuildersKt.withContext(coroutineContextPlus, abstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1, abstractAwsSdkClientFactory$fromEnvironment$1) == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator = tclientbuilderEZpvd;
                r142 = EZpvd;
                r142.close();
                return stateListAnimator.OLrzqt();
            } catch (java.lang.Exception e3) {
                e = e3;
                r14 = EZpvd;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (java.lang.Throwable th2) {
                th = th2;
                EZpvd.close();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            EZpvd = function1;
            th = th3;
        }
    }

    public static /* synthetic */ <TConfig extends InterfaceC57313yg & FilterInputStream, TConfigBuilder extends InterfaceC57313yg.Activity<TConfig> & FilterInputStream.Application, TClient extends InterfaceC57154yd, TClientBuilder extends InterfaceC57154yd.StateListAnimator<TConfig, TConfigBuilder, ? extends TClient>> java.lang.Object KWHzl(IOError<TConfig, TConfigBuilder, TClient, TClientBuilder> iOError, TClientBuilder tclientbuilder, HH<ObjectOutputStream> hh, HH<ObjectStreamField> hh2, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
