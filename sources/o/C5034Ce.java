package o;

import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilderKt$dumpRequest$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.CO;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5034Ce {
    public static /* synthetic */ InterfaceC5037Ch immutableView$default(C5036Cg c5036Cg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(c5036Cg, z);
    }

    public static final InterfaceC5037Ch OLrzqt(@NotNull C5036Cg c5036Cg, boolean z) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        return new C5035Cf(c5036Cg, z);
    }

    public static final void EZpvd(@NotNull C5036Cg c5036Cg, @NotNull Function1<? super DL.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(c5036Cg.djBIcL());
    }

    public static final void EZpvd(@NotNull C5036Cg c5036Cg, @NotNull DL dl) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(dl, "");
        c5036Cg.djBIcL().copydefault(dl);
    }

    public static final void OLrzqt(@NotNull C5036Cg c5036Cg, @NotNull Function1<? super C58617zJ, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(c5036Cg.AEQbTJ());
    }

    public static final void EZpvd(@NotNull C5036Cg c5036Cg, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c5036Cg.AEQbTJ().OLrzqt(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull C5036Cg c5036Cg, boolean z, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        HttpRequestBuilderKt$dumpRequest$1 httpRequestBuilderKt$dumpRequest$1;
        CQ cq;
        java.lang.Long lAEQbTJ;
        CQ cq2;
        C5036Cg c5036Cg2;
        if (continuation instanceof HttpRequestBuilderKt$dumpRequest$1) {
            httpRequestBuilderKt$dumpRequest$1 = (HttpRequestBuilderKt$dumpRequest$1) continuation;
            int i = httpRequestBuilderKt$dumpRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpRequestBuilderKt$dumpRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                httpRequestBuilderKt$dumpRequest$1 = new HttpRequestBuilderKt$dumpRequest$1(continuation);
            }
        }
        java.lang.Object obj = httpRequestBuilderKt$dumpRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = httpRequestBuilderKt$dumpRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            cq = new CQ();
            CO.Application.writeUtf8$default(cq, c5036Cg.EZpvd() + ' ' + c5036Cg.djBIcL().AhwBna() + "\r\n", 0, 0, 6, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Host: ");
            sb.append(c5036Cg.djBIcL().copydefault());
            sb.append("\r\n");
            CO.Application.writeUtf8$default(cq, sb.toString(), 0, 0, 6, null);
            java.lang.String strEZpvd = c5036Cg.AEQbTJ().EZpvd("Content-Length");
            long jLongValue = ((strEZpvd == null || (lAEQbTJ = StringsKt__StringNumberConversionsKt.getFieldNames(strEZpvd)) == null) && (lAEQbTJ = c5036Cg.KWHzl().AEQbTJ()) == null) ? 0L : lAEQbTJ.longValue();
            if (jLongValue > 0) {
                CO.Application.writeUtf8$default(cq, "Content-Length: " + jLongValue + "\r\n", 0, 0, 6, null);
            }
            java.util.Set setAhwBna = yEE.AhwBna("Host", "Content-Length");
            java.util.Set<Map.Entry<java.lang.String, java.util.List<java.lang.String>>> setCopydefault = c5036Cg.AEQbTJ().copydefault();
            java.util.ArrayList<Map.Entry> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : setCopydefault) {
                if (!setAhwBna.contains(((Map.Entry) obj2).getKey())) {
                    arrayList.add(obj2);
                }
            }
            for (Map.Entry entry : arrayList) {
                CO.Application.writeUtf8$default(cq, CollectionsKt___CollectionsKt.joinToString$default((java.lang.Iterable) entry.getValue(), ";", ((java.lang.String) entry.getKey()) + ": ", "\r\n", 0, null, null, 56, null), 0, 0, 6, null);
            }
            CO.Application.writeUtf8$default(cq, "\r\n", 0, 0, 6, null);
            if (z) {
                zP zPVarKWHzl = c5036Cg.KWHzl();
                if (zPVarKWHzl instanceof zP.TaskDescription) {
                    CO.Application.write$default(cq, ((zP.TaskDescription) zPVarKWHzl).OLrzqt(), 0, 0, 6, null);
                } else if ((zPVarKWHzl instanceof zP.Activity) || (zPVarKWHzl instanceof zP.Application)) {
                    httpRequestBuilderKt$dumpRequest$1.L$0 = c5036Cg;
                    httpRequestBuilderKt$dumpRequest$1.L$1 = cq;
                    httpRequestBuilderKt$dumpRequest$1.label = 1;
                    java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarKWHzl, httpRequestBuilderKt$dumpRequest$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    cq2 = cq;
                    obj = objCopydefault2;
                    c5036Cg2 = c5036Cg;
                } else {
                    boolean z2 = zPVarKWHzl instanceof zP.StateListAnimator;
                }
            }
            return cq.AYXKKw();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CQ cq3 = (CQ) httpRequestBuilderKt$dumpRequest$1.L$1;
        c5036Cg2 = (C5036Cg) httpRequestBuilderKt$dumpRequest$1.L$0;
        C56391yDq.AEQbTJ(obj);
        cq2 = cq3;
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            CO.Application.write$default(cq2, bArr, 0, 0, 6, null);
            c5036Cg2.EZpvd(new C3603Ap(bArr));
        }
        cq = cq2;
        return cq.AYXKKw();
    }
}
