package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.SynthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class RenderProcessGoneDetail {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [51=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        SynthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1 synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof SynthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1) {
            synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1 = (SynthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1) continuation;
            int i = synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = i - Integer.MIN_VALUE;
            } else {
                synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1 = new SynthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = dt;
                synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c58859zS;
                synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case -2006780792:
                                if (strOLrzqt.equals("LexiconNotFoundException")) {
                                    SpellCheckerInfo spellCheckerInfo = new SpellCheckerInfo();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 4;
                                    objCopydefault = spellCheckerInfo.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 2;
                                    objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case -994260351:
                                if (strOLrzqt.equals("SsmlMarksNotSupportedForTextTypeException")) {
                                    JsDialogHelper jsDialogHelper = new JsDialogHelper();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 5;
                                    objCopydefault = jsDialogHelper.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case -880223920:
                                if (strOLrzqt.equals("MarksNotSupportedForFormatException")) {
                                    CookieManager cookieManager = new CookieManager();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 10;
                                    objCopydefault = cookieManager.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case -557748247:
                                if (strOLrzqt.equals("TextLengthExceededException")) {
                                    TokenBindingService tokenBindingService = new TokenBindingService();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 9;
                                    objCopydefault = tokenBindingService.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case -460810631:
                                if (strOLrzqt.equals("InvalidSsmlException")) {
                                    TextClassificationSessionId textClassificationSessionId = new TextClassificationSessionId();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 3;
                                    objCopydefault = textClassificationSessionId.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case 788170350:
                                if (strOLrzqt.equals("InvalidSampleRateException")) {
                                    SelectionSessionLogger selectionSessionLogger = new SelectionSessionLogger();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 6;
                                    objCopydefault = selectionSessionLogger.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case 1643850460:
                                if (strOLrzqt.equals("LanguageNotSupportedException")) {
                                    TextSelection textSelection = new TextSelection();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 7;
                                    objCopydefault = textSelection.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                            case 1791529522:
                                if (strOLrzqt.equals("EngineNotSupportedException")) {
                                    InputConnectionWrapper inputConnectionWrapper = new InputConnectionWrapper();
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0 = interfaceC5039CjEZpvd;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1 = c56239xzCopydefault;
                                    synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.label = 8;
                                    objCopydefault = inputConnectionWrapper.AEQbTJ(dt, c58859zSCopy$default, synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1);
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
                c58859zS = (C58859zS) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                dt = (DT) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
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
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 3:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 4:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 5:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 6:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 7:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 8:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 9:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            case 10:
                c56239xz = (C56239xz) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) synthesizeSpeechOperationDeserializerKt$throwSynthesizeSpeechError$1.L$0;
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
