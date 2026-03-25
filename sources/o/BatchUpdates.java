package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.DeleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class BatchUpdates {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1 deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1) {
            deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1 = (DeleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1) continuation;
            int i = deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1 = new DeleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = dt;
                deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c58859zS;
                deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                            case -74061011:
                                if (strOLrzqt.equals("ResourceUnavailableException")) {
                                    MemoryIntArray memoryIntArray = new MemoryIntArray();
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 3;
                                    objCopydefault = memoryIntArray.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 2;
                                    objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 4;
                                    objCopydefault = longSparseArray.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 6;
                                    objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 5;
                                    objCopydefault = magnificationSpec.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1 = c56239xzCopydefault;
                                    deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.label = 7;
                                    objCopydefault = mergedConfiguration.AEQbTJ(dt, c58859zSCopy$default, deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1);
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
                c58859zS = (C58859zS) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                dt = (DT) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
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
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 3:
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 4:
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 5:
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 6:
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 7:
                c56239xz = (C56239xz) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteEntityRecognizerOperationDeserializerKt$throwDeleteEntityRecognizerError$1.L$0;
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
}
