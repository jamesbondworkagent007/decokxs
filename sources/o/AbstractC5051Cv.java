package o;

import aws.smithy.kotlin.runtime.identity.IdentityProviderChain$resolve$1;
import aws.smithy.kotlin.runtime.identity.IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import o.InterfaceC5045Cp;
import o.InterfaceC5047Cr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5051Cv<P extends InterfaceC5045Cp, I extends InterfaceC5047Cr> implements InterfaceC5048Cs {
    public final P[] EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P[] copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super I> continuation) {
        return copydefault(this, interfaceC57843yq, continuation);
    }

    public AbstractC5051Cv(@NotNull P... pArr) {
        Intrinsics.checkNotNullParameter(pArr, "");
        this.EZpvd = pArr;
        if (!(!(pArr.length == 0))) {
            throw new java.lang.IllegalArgumentException("at least one provider must be in the chain".toString());
        }
    }

    public java.lang.String toString() {
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.util.Collection) C56402yEa.EZpvd(this), (java.lang.Object[]) this.EZpvd);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(C56524yIo.AEQbTJ(((InterfaceC5045Cp) it.next()).getClass()).valueOf());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0031 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x00cf */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0029, B:47:0x00d4, B:49:0x00d8, B:51:0x00ea, B:50:0x00e2), top: B:57:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0029, B:47:0x00d4, B:49:0x00d8, B:51:0x00ea, B:50:0x00e2), top: B:57:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, o.GU] */
    /* JADX WARN: Type inference failed for: r9v10, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r9v13, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [o.GU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <P extends InterfaceC5045Cp, I extends InterfaceC5047Cr> java.lang.Object copydefault(AbstractC5051Cv<P, I> abstractC5051Cv, InterfaceC57843yq interfaceC57843yq, Continuation<? super I> continuation) throws java.lang.Throwable {
        IdentityProviderChain$resolve$1 identityProviderChain$resolve$1;
        ?? EZpvd;
        java.lang.Throwable th;
        java.lang.Exception e;
        ?? r9;
        CoroutineContext c5140Gg;
        ?? r92;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof IdentityProviderChain$resolve$1) {
            identityProviderChain$resolve$1 = (IdentityProviderChain$resolve$1) continuation;
            int i = identityProviderChain$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identityProviderChain$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                identityProviderChain$resolve$1 = new IdentityProviderChain$resolve$1(abstractC5051Cv, continuation);
            }
        }
        java.lang.Object obj = identityProviderChain$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identityProviderChain$resolve$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r9 = (GU) identityProviderChain$resolve$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    r92 = r9;
                    r92.close();
                    return obj;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    if (e instanceof CancellationException) {
                        r9.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(r9, e, true);
                    } else {
                        GX.OLrzqt(r9, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            }
            C56391yDq.AEQbTJ(obj);
            InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
            SpanKind spanKind = SpanKind.INTERNAL;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(AbstractC5051Cv.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
            }
            EZpvd = FX.KWHzl(identityProviderChain$resolve$1.getContext()).copydefault().EZpvd(strGEmmrt).EZpvd("ResolveIdentityChain", interfaceC57843yqCopydefault, spanKind, C5143Gj.EZpvd(identityProviderChain$resolve$1.getContext()));
            try {
                FY fy = (FY) identityProviderChain$resolve$1.getContext().get(FY.KWHzl);
                FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                if (fwOLrzqt != null) {
                    c5140Gg = new C5140Gg(fwOLrzqt);
                } else {
                    c5140Gg = (C5140Gg) identityProviderChain$resolve$1.getContext().get(C5140Gg.EZpvd);
                    if (c5140Gg == null) {
                        c5140Gg = emptyCoroutineContext;
                    }
                }
                CoroutineContext coroutineContextPlus = emptyCoroutineContext.plus(new GW(EZpvd)).plus(c5140Gg);
                IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1 identityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1 = new IdentityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1(EZpvd, null, abstractC5051Cv, interfaceC57843yq);
                identityProviderChain$resolve$1.L$0 = EZpvd;
                identityProviderChain$resolve$1.label = 1;
                java.lang.Object objWithContext = BuildersKt.withContext(coroutineContextPlus, identityProviderChain$resolve$suspendImpl$$inlined$withSpan$default$1, identityProviderChain$resolve$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                obj = objWithContext;
                r92 = EZpvd;
                r92.close();
                return obj;
            } catch (java.lang.Exception e3) {
                e = e3;
                r9 = EZpvd;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (java.lang.Throwable th2) {
                th = th2;
                EZpvd.close();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            EZpvd = abstractC5051Cv;
            th = th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Exception {
        java.lang.Exception exc;
        P[] pArr = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (P p : pArr) {
            try {
                exc = null;
                java.io.Closeable closeable = p instanceof java.io.Closeable ? (java.io.Closeable) p : null;
                if (closeable != null) {
                    closeable.close();
                }
            } catch (java.lang.Exception e) {
                exc = e;
            }
            if (exc != null) {
                arrayList.add(exc);
            }
        }
        if (!arrayList.isEmpty()) {
            java.lang.Exception exc2 = (java.lang.Exception) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            java.util.Iterator it = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) arrayList, 1).iterator();
            while (it.hasNext()) {
                C56379yDe.EZpvd(exc2, (java.lang.Throwable) it.next());
            }
            throw exc2;
        }
    }
}
