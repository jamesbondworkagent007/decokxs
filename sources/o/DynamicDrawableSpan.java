package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.ImportModelOperationDeserializerKt$throwImportModelError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.ShellCallback;

/* JADX INFO: loaded from: classes21.dex */
public final class DynamicDrawableSpan {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ImportModelOperationDeserializerKt$throwImportModelError$1 importModelOperationDeserializerKt$throwImportModelError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ImportModelOperationDeserializerKt$throwImportModelError$1) {
            importModelOperationDeserializerKt$throwImportModelError$1 = (ImportModelOperationDeserializerKt$throwImportModelError$1) continuation;
            int i = importModelOperationDeserializerKt$throwImportModelError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                importModelOperationDeserializerKt$throwImportModelError$1.label = i - Integer.MIN_VALUE;
            } else {
                importModelOperationDeserializerKt$throwImportModelError$1 = new ImportModelOperationDeserializerKt$throwImportModelError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = importModelOperationDeserializerKt$throwImportModelError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (importModelOperationDeserializerKt$throwImportModelError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                importModelOperationDeserializerKt$throwImportModelError$1.L$0 = dt;
                importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c58859zS;
                importModelOperationDeserializerKt$throwImportModelError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, importModelOperationDeserializerKt$throwImportModelError$1);
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
                            case -1887639153:
                                if (strOLrzqt.equals("ResourceLimitExceededException")) {
                                    MonthDisplayHelper monthDisplayHelper = new MonthDisplayHelper();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 2;
                                    objCopydefault = monthDisplayHelper.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case -1751974008:
                                if (strOLrzqt.equals("KmsKeyValidationException")) {
                                    ScaleXSpan scaleXSpan = new ScaleXSpan();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 6;
                                    objCopydefault = scaleXSpan.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case -74061011:
                                if (strOLrzqt.equals("ResourceUnavailableException")) {
                                    MemoryIntArray memoryIntArray = new MemoryIntArray();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 5;
                                    objCopydefault = memoryIntArray.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 616958275:
                                if (strOLrzqt.equals("TooManyTagsException")) {
                                    RecordingCanvas recordingCanvas = new RecordingCanvas();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 4;
                                    objCopydefault = recordingCanvas.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 734598063:
                                if (strOLrzqt.equals("InternalServerException")) {
                                    LineBackgroundSpan lineBackgroundSpan = new LineBackgroundSpan();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 3;
                                    objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1091325979:
                                if (strOLrzqt.equals("ResourceInUseException")) {
                                    LongSparseArray longSparseArray = new LongSparseArray();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 7;
                                    objCopydefault = longSparseArray.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1148038775:
                                if (strOLrzqt.equals("InvalidRequestException")) {
                                    RasterizerSpan rasterizerSpan = new RasterizerSpan();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 9;
                                    objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1384808312:
                                if (strOLrzqt.equals("TooManyRequestsException")) {
                                    MagnificationSpec magnificationSpec = new MagnificationSpec();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 8;
                                    objCopydefault = magnificationSpec.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    MergedConfiguration mergedConfiguration = new MergedConfiguration();
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$0 = interfaceC5039CjEZpvd;
                                    importModelOperationDeserializerKt$throwImportModelError$1.L$1 = c56239xzCopydefault;
                                    importModelOperationDeserializerKt$throwImportModelError$1.label = 10;
                                    objCopydefault = mergedConfiguration.AEQbTJ(dt, c58859zSCopy$default, importModelOperationDeserializerKt$throwImportModelError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                        }
                    }
                    comprehendException = new ComprehendException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw comprehendException;
                } catch (java.lang.Exception e) {
                    ComprehendException comprehendException2 = new ComprehendException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(comprehendException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw comprehendException2;
                }
            case 1:
                c58859zS = (C58859zS) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                dt = (DT) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                comprehendException = new ComprehendException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 2:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 3:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 4:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 5:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 6:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 7:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 8:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 9:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 10:
                c56239xz = (C56239xz) importModelOperationDeserializerKt$throwImportModelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) importModelOperationDeserializerKt$throwImportModelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void OLrzqt(ShellCallback.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ModelArn"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
