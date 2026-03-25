package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.UpdateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.Contacts;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceView {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        UpdateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1 updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof UpdateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1) {
            updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1 = (UpdateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1) continuation;
            int i = updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = i - Integer.MIN_VALUE;
            } else {
                updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1 = new UpdateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = dt;
                updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c58859zS;
                updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                            case -1751974008:
                                if (strOLrzqt.equals("KmsKeyValidationException")) {
                                    ScaleXSpan scaleXSpan = new ScaleXSpan();
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c56239xzCopydefault;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 3;
                                    objCopydefault = scaleXSpan.AEQbTJ(dt, c58859zSCopy$default, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c56239xzCopydefault;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 2;
                                    objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c56239xzCopydefault;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 5;
                                    objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c56239xzCopydefault;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 4;
                                    objCopydefault = magnificationSpec.AEQbTJ(dt, c58859zSCopy$default, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1 = c56239xzCopydefault;
                                    updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.label = 6;
                                    objCopydefault = mergedConfiguration.AEQbTJ(dt, c58859zSCopy$default, updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1);
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
                c58859zS = (C58859zS) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                dt = (DT) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
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
                c56239xz = (C56239xz) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 3:
                c56239xz = (C56239xz) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 4:
                c56239xz = (C56239xz) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 5:
                c56239xz = (C56239xz) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 6:
                c56239xz = (C56239xz) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateFlywheelOperationDeserializerKt$throwUpdateFlywheelError$1.L$0;
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

    public static final void AEQbTJ(Contacts.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("FlywheelProperties"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.EZpvd(AccessibilityURLSpan.EZpvd(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
