package o;

import androidx.exifinterface.media.ExifInterface;
import aws.smithy.kotlin.runtime.telemetry.trace.CoroutineContextTraceExtKt$withSpan$1;
import aws.smithy.kotlin.runtime.telemetry.trace.CoroutineContextTraceExtKt$withSpan$2;
import aws.smithy.kotlin.runtime.telemetry.trace.CoroutineContextTraceExtKt$withSpan$3;
import aws.smithy.kotlin.runtime.telemetry.trace.CoroutineContextTraceExtKt$withSpan$5;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GO {
    public static final GU copydefault(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        GW gw = (GW) coroutineContext.get(GW.copydefault);
        if (gw != null) {
            return gw.copydefault();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.GY */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object AEQbTJ(@NotNull GY gy, @NotNull java.lang.String str, @NotNull InterfaceC57843yq interfaceC57843yq, @NotNull SpanKind spanKind, @NotNull CoroutineContext coroutineContext, @NotNull yHO<? super CoroutineScope, ? super GU, ? super Continuation<? super R>, ? extends java.lang.Object> yho, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        CoroutineContextTraceExtKt$withSpan$1 coroutineContextTraceExtKt$withSpan$1;
        GU guEZpvd;
        CoroutineContext c5140Gg;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof CoroutineContextTraceExtKt$withSpan$1) {
            coroutineContextTraceExtKt$withSpan$1 = (CoroutineContextTraceExtKt$withSpan$1) continuation;
            int i = coroutineContextTraceExtKt$withSpan$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineContextTraceExtKt$withSpan$1.label = i - Integer.MIN_VALUE;
            } else {
                coroutineContextTraceExtKt$withSpan$1 = new CoroutineContextTraceExtKt$withSpan$1(continuation);
            }
        }
        java.lang.Object objWithContext = coroutineContextTraceExtKt$withSpan$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coroutineContextTraceExtKt$withSpan$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    guEZpvd = gy.EZpvd(str, interfaceC57843yq, spanKind, C5143Gj.EZpvd(coroutineContextTraceExtKt$withSpan$1.getContext()));
                    FY fy = (FY) coroutineContextTraceExtKt$withSpan$1.getContext().get(FY.KWHzl);
                    FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                    if (fwOLrzqt != null) {
                        c5140Gg = new C5140Gg(fwOLrzqt);
                    } else {
                        c5140Gg = (C5140Gg) coroutineContextTraceExtKt$withSpan$1.getContext().get(C5140Gg.EZpvd);
                        if (c5140Gg == null) {
                            c5140Gg = EmptyCoroutineContext.INSTANCE;
                        }
                    }
                    CoroutineContext coroutineContextPlus = coroutineContext.plus(new GW(guEZpvd)).plus(c5140Gg);
                    CoroutineContextTraceExtKt$withSpan$3 coroutineContextTraceExtKt$withSpan$3 = new CoroutineContextTraceExtKt$withSpan$3(yho, guEZpvd, null);
                    coroutineContextTraceExtKt$withSpan$1.L$0 = guEZpvd;
                    coroutineContextTraceExtKt$withSpan$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineContextPlus, coroutineContextTraceExtKt$withSpan$3, coroutineContextTraceExtKt$withSpan$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    guEZpvd = (GU) coroutineContextTraceExtKt$withSpan$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                }
                C56518yIi.KWHzl(1);
                guEZpvd.close();
                C56518yIi.copydefault(1);
                return objWithContext;
            } catch (java.lang.Exception e) {
                if (e instanceof CancellationException) {
                    GX.OLrzqt(gy, "cancelled", C56443yFo.KWHzl(true));
                } else {
                    gy.KWHzl(SpanStatus.ERROR);
                    GX.AEQbTJ(gy, e, true);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            C56518yIi.KWHzl(1);
            gy.close();
            C56518yIi.copydefault(1);
            throw th;
        }
    }

    public static /* synthetic */ java.lang.Object withSpan$default(GY gy, java.lang.String str, InterfaceC57843yq interfaceC57843yq, SpanKind spanKind, CoroutineContext coroutineContext, yHO yho, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            C58108yv.copydefault();
        }
        if ((i & 4) != 0) {
            SpanKind spanKind2 = SpanKind.INTERNAL;
        }
        if ((i & 8) != 0) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        C56518yIi.AEQbTJ(3);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object KWHzl(@NotNull GU gu, @NotNull CoroutineContext coroutineContext, @NotNull yHO<? super CoroutineScope, ? super GU, ? super Continuation<? super R>, ? extends java.lang.Object> yho, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        CoroutineContextTraceExtKt$withSpan$2 coroutineContextTraceExtKt$withSpan$2;
        CoroutineContext c5140Gg;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof CoroutineContextTraceExtKt$withSpan$2) {
            coroutineContextTraceExtKt$withSpan$2 = (CoroutineContextTraceExtKt$withSpan$2) continuation;
            int i = coroutineContextTraceExtKt$withSpan$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineContextTraceExtKt$withSpan$2.label = i - Integer.MIN_VALUE;
            } else {
                coroutineContextTraceExtKt$withSpan$2 = new CoroutineContextTraceExtKt$withSpan$2(continuation);
            }
        }
        java.lang.Object objWithContext = coroutineContextTraceExtKt$withSpan$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coroutineContextTraceExtKt$withSpan$2.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    FY fy = (FY) coroutineContextTraceExtKt$withSpan$2.getContext().get(FY.KWHzl);
                    FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                    if (fwOLrzqt != null) {
                        c5140Gg = new C5140Gg(fwOLrzqt);
                    } else {
                        c5140Gg = (C5140Gg) coroutineContextTraceExtKt$withSpan$2.getContext().get(C5140Gg.EZpvd);
                        if (c5140Gg == null) {
                            c5140Gg = EmptyCoroutineContext.INSTANCE;
                        }
                    }
                    CoroutineContext coroutineContextPlus = coroutineContext.plus(new GW(gu)).plus(c5140Gg);
                    CoroutineContextTraceExtKt$withSpan$3 coroutineContextTraceExtKt$withSpan$3 = new CoroutineContextTraceExtKt$withSpan$3(yho, gu, null);
                    coroutineContextTraceExtKt$withSpan$2.L$0 = gu;
                    coroutineContextTraceExtKt$withSpan$2.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineContextPlus, coroutineContextTraceExtKt$withSpan$3, coroutineContextTraceExtKt$withSpan$2);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gu = (GU) coroutineContextTraceExtKt$withSpan$2.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                }
                return objWithContext;
            } catch (java.lang.Exception e) {
                if (e instanceof CancellationException) {
                    GX.OLrzqt(gu, "cancelled", C56443yFo.KWHzl(true));
                } else {
                    gu.KWHzl(SpanStatus.ERROR);
                    GX.AEQbTJ(gu, e, true);
                }
                throw e;
            }
        } finally {
            C56518yIi.KWHzl(1);
            gu.close();
            C56518yIi.copydefault(1);
        }
    }

    public static /* synthetic */ java.lang.Object withSpan$default(GU gu, CoroutineContext coroutineContext, yHO yho, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        try {
            try {
                C56518yIi.AEQbTJ(3);
                throw null;
            } catch (java.lang.Exception e) {
                if (e instanceof CancellationException) {
                    GX.OLrzqt(gu, "cancelled", java.lang.Boolean.TRUE);
                } else {
                    gu.KWHzl(SpanStatus.ERROR);
                    GX.AEQbTJ(gu, e, true);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            C56518yIi.KWHzl(1);
            gu.close();
            C56518yIi.copydefault(1);
            throw th;
        }
    }

    public static /* synthetic */ java.lang.Object withSpan$default(java.lang.String str, InterfaceC57843yq interfaceC57843yq, SpanKind spanKind, CoroutineContext coroutineContext, yHO yho, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            C58108yv.copydefault();
        }
        if ((i & 4) != 0) {
            SpanKind spanKind2 = SpanKind.INTERNAL;
        }
        if ((i & 8) != 0) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        if (C56524yIo.AEQbTJ(java.lang.Object.class).gEmmrt() == null) {
            throw new java.lang.IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
        }
        C56518yIi.AEQbTJ(3);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC57843yq interfaceC57843yq, @NotNull SpanKind spanKind, @NotNull CoroutineContext coroutineContext, @NotNull yHO<? super CoroutineScope, ? super GU, ? super Continuation<? super R>, ? extends java.lang.Object> yho, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        CoroutineContextTraceExtKt$withSpan$5 coroutineContextTraceExtKt$withSpan$5;
        GU guEZpvd;
        CoroutineContext c5140Gg;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof CoroutineContextTraceExtKt$withSpan$5) {
            coroutineContextTraceExtKt$withSpan$5 = (CoroutineContextTraceExtKt$withSpan$5) continuation;
            int i = coroutineContextTraceExtKt$withSpan$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineContextTraceExtKt$withSpan$5.label = i - Integer.MIN_VALUE;
            } else {
                coroutineContextTraceExtKt$withSpan$5 = new CoroutineContextTraceExtKt$withSpan$5(continuation);
            }
        }
        java.lang.Object objWithContext = coroutineContextTraceExtKt$withSpan$5.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coroutineContextTraceExtKt$withSpan$5.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    guEZpvd = FX.KWHzl(coroutineContextTraceExtKt$withSpan$5.getContext()).copydefault().EZpvd(str).EZpvd(str2, interfaceC57843yq, spanKind, C5143Gj.EZpvd(coroutineContextTraceExtKt$withSpan$5.getContext()));
                    FY fy = (FY) coroutineContextTraceExtKt$withSpan$5.getContext().get(FY.KWHzl);
                    FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                    if (fwOLrzqt != null) {
                        c5140Gg = new C5140Gg(fwOLrzqt);
                    } else {
                        c5140Gg = (C5140Gg) coroutineContextTraceExtKt$withSpan$5.getContext().get(C5140Gg.EZpvd);
                        if (c5140Gg == null) {
                            c5140Gg = EmptyCoroutineContext.INSTANCE;
                        }
                    }
                    CoroutineContext coroutineContextPlus = coroutineContext.plus(new GW(guEZpvd)).plus(c5140Gg);
                    CoroutineContextTraceExtKt$withSpan$3 coroutineContextTraceExtKt$withSpan$3 = new CoroutineContextTraceExtKt$withSpan$3(yho, guEZpvd, null);
                    coroutineContextTraceExtKt$withSpan$5.L$0 = guEZpvd;
                    coroutineContextTraceExtKt$withSpan$5.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineContextPlus, coroutineContextTraceExtKt$withSpan$3, coroutineContextTraceExtKt$withSpan$5);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    guEZpvd = (GU) coroutineContextTraceExtKt$withSpan$5.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                }
                C56518yIi.KWHzl(1);
                guEZpvd.close();
                C56518yIi.copydefault(1);
                return objWithContext;
            } catch (java.lang.Exception e) {
                if (e instanceof CancellationException) {
                    GX.OLrzqt(str, "cancelled", C56443yFo.KWHzl(true));
                } else {
                    str.KWHzl(SpanStatus.ERROR);
                    GX.AEQbTJ(str, e, true);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            C56518yIi.KWHzl(1);
            str.close();
            C56518yIi.copydefault(1);
            throw th;
        }
    }

    public static /* synthetic */ java.lang.Object withSpan$default(java.lang.String str, java.lang.String str2, InterfaceC57843yq interfaceC57843yq, SpanKind spanKind, CoroutineContext coroutineContext, yHO yho, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            C58108yv.copydefault();
        }
        if ((i & 8) != 0) {
            SpanKind spanKind2 = SpanKind.INTERNAL;
        }
        if ((i & 16) != 0) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        C56518yIi.AEQbTJ(3);
        throw null;
    }
}
