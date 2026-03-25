package o;

import aws.smithy.kotlin.runtime.http.DeferredHeadersKt$toHeaders$1;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58671zL {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:21:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b2 -> B:27:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull InterfaceC58536zG interfaceC58536zG, @NotNull Continuation<? super InterfaceC58725zN> continuation) throws java.lang.Throwable {
        DeferredHeadersKt$toHeaders$1 deferredHeadersKt$toHeaders$1;
        C58617zJ c58617zJ;
        java.util.Iterator it;
        DeferredHeadersKt$toHeaders$1 deferredHeadersKt$toHeaders$12;
        C58617zJ c58617zJ2;
        if (continuation instanceof DeferredHeadersKt$toHeaders$1) {
            deferredHeadersKt$toHeaders$1 = (DeferredHeadersKt$toHeaders$1) continuation;
            int i = deferredHeadersKt$toHeaders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deferredHeadersKt$toHeaders$1.label = i - Integer.MIN_VALUE;
            } else {
                deferredHeadersKt$toHeaders$1 = new DeferredHeadersKt$toHeaders$1(continuation);
            }
        }
        java.lang.Object obj = deferredHeadersKt$toHeaders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deferredHeadersKt$toHeaders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (interfaceC58536zG instanceof C58644zK) {
                return InterfaceC58725zN.AEQbTJ.EZpvd();
            }
            c58617zJ = new C58617zJ();
            it = interfaceC58536zG.AEQbTJ().iterator();
            deferredHeadersKt$toHeaders$12 = deferredHeadersKt$toHeaders$1;
            c58617zJ2 = c58617zJ;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C58617zJ c58617zJ3 = (C58617zJ) deferredHeadersKt$toHeaders$1.L$6;
            java.lang.String str = (java.lang.String) deferredHeadersKt$toHeaders$1.L$5;
            java.util.Iterator it2 = (java.util.Iterator) deferredHeadersKt$toHeaders$1.L$4;
            java.lang.String str2 = (java.lang.String) deferredHeadersKt$toHeaders$1.L$3;
            java.util.Iterator it3 = (java.util.Iterator) deferredHeadersKt$toHeaders$1.L$2;
            C58617zJ c58617zJ4 = (C58617zJ) deferredHeadersKt$toHeaders$1.L$1;
            C58617zJ c58617zJ5 = (C58617zJ) deferredHeadersKt$toHeaders$1.L$0;
            C56391yDq.AEQbTJ(obj);
            DeferredHeadersKt$toHeaders$1 deferredHeadersKt$toHeaders$13 = deferredHeadersKt$toHeaders$1;
            c58617zJ2 = c58617zJ4;
            java.lang.String str3 = str2;
            java.util.Iterator it4 = it2;
            c58617zJ3.OLrzqt(str, obj);
            deferredHeadersKt$toHeaders$12 = deferredHeadersKt$toHeaders$13;
            java.util.Iterator it5 = it4;
            it = it3;
            java.lang.String str4 = str3;
            c58617zJ = c58617zJ5;
            if (it5.hasNext()) {
                Deferred deferred = (Deferred) it5.next();
                deferredHeadersKt$toHeaders$12.L$0 = c58617zJ;
                deferredHeadersKt$toHeaders$12.L$1 = c58617zJ2;
                deferredHeadersKt$toHeaders$12.L$2 = it;
                deferredHeadersKt$toHeaders$12.L$3 = str4;
                deferredHeadersKt$toHeaders$12.L$4 = it5;
                deferredHeadersKt$toHeaders$12.L$5 = str4;
                deferredHeadersKt$toHeaders$12.L$6 = c58617zJ2;
                deferredHeadersKt$toHeaders$12.label = 1;
                java.lang.Object objAwait = deferred.await(deferredHeadersKt$toHeaders$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c58617zJ5 = c58617zJ;
                str3 = str4;
                obj = objAwait;
                it3 = it;
                c58617zJ3 = c58617zJ2;
                it4 = it5;
                deferredHeadersKt$toHeaders$13 = deferredHeadersKt$toHeaders$12;
                str = str3;
                c58617zJ3.OLrzqt(str, obj);
                deferredHeadersKt$toHeaders$12 = deferredHeadersKt$toHeaders$13;
                java.util.Iterator it52 = it4;
                it = it3;
                java.lang.String str42 = str3;
                c58617zJ = c58617zJ5;
                if (it52.hasNext()) {
                }
            }
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                str42 = (java.lang.String) entry.getKey();
                it52 = ((java.util.List) entry.getValue()).iterator();
                if (it52.hasNext()) {
                }
                if (it.hasNext()) {
                    return c58617zJ.AYXKKw();
                }
            }
        }
    }
}
