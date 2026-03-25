package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.DeleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class AutofillManagerInternal {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1 deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1) {
            deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1 = (DeleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1) continuation;
            int i = deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1 = new DeleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0 = dt;
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1 = c58859zS;
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        pollyException = (PollyException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw pollyException;
                    }
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    pollyException = (PollyException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                }
                c58859zS = (C58859zS) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1;
                dt = (DT) deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "ServiceFailureException")) {
                MimeTypeMap mimeTypeMap = new MimeTypeMap();
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1 = c56239xzCopydefault;
                deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label = 2;
                objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c56239xz = c56239xzCopydefault;
                interfaceC5039Cj = interfaceC5039CjEZpvd;
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "LexiconNotFoundException")) {
                pollyException = new PollyException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            }
            SpellCheckerInfo spellCheckerInfo = new SpellCheckerInfo();
            deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$0 = interfaceC5039CjEZpvd;
            deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.L$1 = c56239xzCopydefault;
            deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1.label = 3;
            objCopydefault = spellCheckerInfo.AEQbTJ(dt, c58859zSCopy$default, deleteLexiconOperationDeserializerKt$throwDeleteLexiconError$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c56239xz = c56239xzCopydefault;
            interfaceC5039Cj = interfaceC5039CjEZpvd;
            pollyException = (PollyException) objCopydefault;
            interfaceC5039CjEZpvd = interfaceC5039Cj;
            c56239xzCopydefault = c56239xz;
            C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw pollyException;
        } catch (java.lang.Exception e) {
            PollyException pollyException2 = new PollyException("Failed to parse response as 'restJson1' error", e);
            C54211xA.EZpvd(pollyException2, c58859zSCopy$default.AEQbTJ(), null);
            throw pollyException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }
}
