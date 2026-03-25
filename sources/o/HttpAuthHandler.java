package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.PutLexiconOperationDeserializerKt$throwPutLexiconError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class HttpAuthHandler {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        PutLexiconOperationDeserializerKt$throwPutLexiconError$1 putLexiconOperationDeserializerKt$throwPutLexiconError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof PutLexiconOperationDeserializerKt$throwPutLexiconError$1) {
            putLexiconOperationDeserializerKt$throwPutLexiconError$1 = (PutLexiconOperationDeserializerKt$throwPutLexiconError$1) continuation;
            int i = putLexiconOperationDeserializerKt$throwPutLexiconError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = i - Integer.MIN_VALUE;
            } else {
                putLexiconOperationDeserializerKt$throwPutLexiconError$1 = new PutLexiconOperationDeserializerKt$throwPutLexiconError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = putLexiconOperationDeserializerKt$throwPutLexiconError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (putLexiconOperationDeserializerKt$throwPutLexiconError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = dt;
                putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c58859zS;
                putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                byte[] bArr = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
                C58859zS c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                try {
                    c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
                    strOLrzqt = c56239xzCopydefault.OLrzqt();
                    if (strOLrzqt != null) {
                        switch (strOLrzqt.hashCode()) {
                            case -1631742054:
                                if (strOLrzqt.equals("UnsupportedPlsAlphabetException")) {
                                    URLUtil uRLUtil = new URLUtil();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 4;
                                    objCopydefault = uRLUtil.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case -1303783389:
                                if (strOLrzqt.equals("LexiconSizeExceededException")) {
                                    SpellCheckerSession spellCheckerSession = new SpellCheckerSession();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 7;
                                    objCopydefault = spellCheckerSession.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case -1276726630:
                                if (strOLrzqt.equals("ServiceFailureException")) {
                                    MimeTypeMap mimeTypeMap = new MimeTypeMap();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 2;
                                    objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case -1239260876:
                                if (strOLrzqt.equals("MaxLexiconsNumberExceededException")) {
                                    ConsoleMessage consoleMessage = new ConsoleMessage();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 3;
                                    objCopydefault = consoleMessage.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case -583011314:
                                if (strOLrzqt.equals("InvalidLexiconException")) {
                                    InputMethodInfo inputMethodInfo = new InputMethodInfo();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 6;
                                    objCopydefault = inputMethodInfo.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case -170629900:
                                if (strOLrzqt.equals("MaxLexemeLengthExceededException")) {
                                    DownloadListener downloadListener = new DownloadListener();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 5;
                                    objCopydefault = downloadListener.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                            case 1127717973:
                                if (strOLrzqt.equals("UnsupportedPlsLanguageException")) {
                                    TracingController tracingController = new TracingController();
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0 = interfaceC5039CjEZpvd;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1 = c56239xzCopydefault;
                                    putLexiconOperationDeserializerKt$throwPutLexiconError$1.label = 8;
                                    objCopydefault = tracingController.AEQbTJ(dt, c58859zSCopy$default, putLexiconOperationDeserializerKt$throwPutLexiconError$1);
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
                                break;
                        }
                    }
                    pollyException = new PollyException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                } catch (java.lang.Exception e) {
                    PollyException pollyException2 = new PollyException("Failed to parse response as 'restJson1' error", e);
                    C54211xA.EZpvd(pollyException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw pollyException2;
                }
            case 1:
                c58859zS = (C58859zS) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                dt = (DT) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                pollyException = new PollyException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 2:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 3:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 4:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 5:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 6:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 7:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 8:
                c56239xz = (C56239xz) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) putLexiconOperationDeserializerKt$throwPutLexiconError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
