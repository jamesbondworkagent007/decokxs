package o;

import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import aws.smithy.kotlin.runtime.http.response.HttpResponseKt$dumpResponse$1;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CO;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5040Ck {
    public static /* synthetic */ InterfaceC5039Cj HttpResponse$default(HttpStatusCode httpStatusCode, InterfaceC58725zN interfaceC58725zN, zP zPVar, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC58725zN = InterfaceC58725zN.AEQbTJ.EZpvd();
        }
        if ((i & 4) != 0) {
            zPVar = zP.StateListAnimator.KWHzl;
        }
        return AEQbTJ(httpStatusCode, interfaceC58725zN, zPVar);
    }

    public static final InterfaceC5039Cj AEQbTJ(@NotNull HttpStatusCode httpStatusCode, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(httpStatusCode, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        return new C5041Cl(httpStatusCode, interfaceC58725zN, zPVar);
    }

    public static /* synthetic */ InterfaceC5039Cj copy$default(InterfaceC5039Cj interfaceC5039Cj, HttpStatusCode httpStatusCode, InterfaceC58725zN interfaceC58725zN, zP zPVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpStatusCode = interfaceC5039Cj.OLrzqt();
        }
        if ((i & 2) != 0) {
            interfaceC58725zN = interfaceC5039Cj.AEQbTJ();
        }
        if ((i & 4) != 0) {
            zPVar = interfaceC5039Cj.EZpvd();
        }
        return AEQbTJ(interfaceC5039Cj, httpStatusCode, interfaceC58725zN, zPVar);
    }

    public static final InterfaceC5039Cj AEQbTJ(@NotNull InterfaceC5039Cj interfaceC5039Cj, @NotNull HttpStatusCode httpStatusCode, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        Intrinsics.checkNotNullParameter(httpStatusCode, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        return AEQbTJ(httpStatusCode, interfaceC58725zN, zPVar);
    }

    public static final java.lang.String copydefault(@NotNull InterfaceC52400wK interfaceC52400wK, @NotNull java.lang.String str) {
        InterfaceC58725zN interfaceC58725zNAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC52400wK, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC5039Cj interfaceC5039Cj = interfaceC52400wK instanceof InterfaceC5039Cj ? (InterfaceC5039Cj) interfaceC52400wK : null;
        if (interfaceC5039Cj == null || (interfaceC58725zNAEQbTJ = interfaceC5039Cj.AEQbTJ()) == null) {
            return null;
        }
        return interfaceC58725zNAEQbTJ.copydefault(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull InterfaceC5039Cj interfaceC5039Cj, boolean z, @NotNull Continuation<? super kotlin.Pair<? extends InterfaceC5039Cj, java.lang.String>> continuation) throws java.lang.Throwable {
        HttpResponseKt$dumpResponse$1 httpResponseKt$dumpResponse$1;
        final CQ cq;
        InterfaceC5039Cj interfaceC5039Cj2;
        CQ cq2;
        if (continuation instanceof HttpResponseKt$dumpResponse$1) {
            httpResponseKt$dumpResponse$1 = (HttpResponseKt$dumpResponse$1) continuation;
            int i = httpResponseKt$dumpResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpResponseKt$dumpResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                httpResponseKt$dumpResponse$1 = new HttpResponseKt$dumpResponse$1(continuation);
            }
        }
        java.lang.Object obj = httpResponseKt$dumpResponse$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = httpResponseKt$dumpResponse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            cq = new CQ();
            CO.Application.writeUtf8$default(cq, "HTTP " + interfaceC5039Cj.OLrzqt() + "\r\n", 0, 0, 6, null);
            interfaceC5039Cj.AEQbTJ().EZpvd(new Function2<java.lang.String, java.util.List<? extends java.lang.String>, Unit>() { // from class: aws.smithy.kotlin.runtime.http.response.HttpResponseKt$dumpResponse$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(2);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) throws IOException {
                    invoke2(str, (List<String>) list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str, @NotNull List<String> list) throws IOException {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    CO.Application.writeUtf8$default(cq, CollectionsKt___CollectionsKt.joinToString$default(list, ";", str + ": ", "\r\n", 0, null, null, 56, null), 0, 0, 6, null);
                }
            });
            CO.Application.writeUtf8$default(cq, "\r\n", 0, 0, 6, null);
            if (z) {
                zP zPVarEZpvd = interfaceC5039Cj.EZpvd();
                if (zPVarEZpvd instanceof zP.TaskDescription) {
                    CO.Application.write$default(cq, ((zP.TaskDescription) zPVarEZpvd).OLrzqt(), 0, 0, 6, null);
                } else if ((zPVarEZpvd instanceof zP.Activity) || (zPVarEZpvd instanceof zP.Application)) {
                    httpResponseKt$dumpResponse$1.L$0 = interfaceC5039Cj;
                    httpResponseKt$dumpResponse$1.L$1 = cq;
                    httpResponseKt$dumpResponse$1.L$2 = interfaceC5039Cj;
                    httpResponseKt$dumpResponse$1.label = 1;
                    java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, httpResponseKt$dumpResponse$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC5039Cj2 = interfaceC5039Cj;
                    obj = objCopydefault2;
                    cq2 = cq;
                } else {
                    boolean z2 = zPVarEZpvd instanceof zP.StateListAnimator;
                }
            }
            return C56390yDp.OLrzqt(interfaceC5039Cj, cq.AYXKKw());
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC5039Cj = (InterfaceC5039Cj) httpResponseKt$dumpResponse$1.L$2;
        cq2 = (CQ) httpResponseKt$dumpResponse$1.L$1;
        InterfaceC5039Cj interfaceC5039Cj3 = (InterfaceC5039Cj) httpResponseKt$dumpResponse$1.L$0;
        C56391yDq.AEQbTJ(obj);
        interfaceC5039Cj2 = interfaceC5039Cj3;
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            CO.Application.write$default(cq2, bArr, 0, 0, 6, null);
            interfaceC5039Cj = copy$default(interfaceC5039Cj2, null, null, new C3603Ap(bArr), 3, null);
        }
        cq = cq2;
        return C56390yDp.OLrzqt(interfaceC5039Cj, cq.AYXKKw());
    }
}
