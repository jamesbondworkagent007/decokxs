package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.DetectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.BatteryProperties;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class RecognizerIntent {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [67=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DetectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1 detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DetectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1) {
            detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1 = (DetectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1) continuation;
            int i = detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = i - Integer.MIN_VALUE;
            } else {
                detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1 = new DetectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = dt;
                detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c58859zS;
                detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c56239xzCopydefault;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 4;
                                    objCopydefault = memoryIntArray.AEQbTJ(dt, c58859zSCopy$default, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                            case 588566607:
                                if (strOLrzqt.equals("TextSizeLimitExceededException")) {
                                    InputChannel inputChannel = new InputChannel();
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c56239xzCopydefault;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 5;
                                    objCopydefault = inputChannel.AEQbTJ(dt, c58859zSCopy$default, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c56239xzCopydefault;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 2;
                                    objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c56239xzCopydefault;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 6;
                                    objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                            case 1243406914:
                                if (strOLrzqt.equals("UnsupportedLanguageException")) {
                                    RemoteAnimationTarget remoteAnimationTarget = new RemoteAnimationTarget();
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1 = c56239xzCopydefault;
                                    detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.label = 3;
                                    objCopydefault = remoteAnimationTarget.AEQbTJ(dt, c58859zSCopy$default, detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1);
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
                c58859zS = (C58859zS) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                dt = (DT) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
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
                c56239xz = (C56239xz) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 3:
                c56239xz = (C56239xz) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 4:
                c56239xz = (C56239xz) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 5:
                c56239xz = (C56239xz) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 6:
                c56239xz = (C56239xz) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) detectEntitiesOperationDeserializerKt$throwDetectEntitiesError$1.L$0;
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

    public static final void AEQbTJ(BatteryProperties.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("Blocks"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DocumentMetadata"));
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("DocumentType"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("Entities"));
        C5101Et c5101Et5 = new C5101Et(fragment, new EX("Errors"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.KWHzl(SpanWatcher.KWHzl(el));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et5);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                while (actionBarKWHzl.EZpvd()) {
                                    if (!actionBarKWHzl.copydefault()) {
                                        actionBarKWHzl.gEmmrt();
                                    } else {
                                        arrayList.add(ReplacementTransformationMethod.OLrzqt(el));
                                    }
                                }
                                actionBar.AEQbTJ(arrayList);
                            } else if (numOLrzqt == null) {
                                return;
                            } else {
                                stateListAnimatorEZpvd.copydefault();
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (actionBarKWHzl2.EZpvd()) {
                                if (!actionBarKWHzl2.copydefault()) {
                                    actionBarKWHzl2.gEmmrt();
                                } else {
                                    arrayList2.add(Formatter.EZpvd(el));
                                }
                            }
                            actionBar.copydefault(arrayList2);
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl3 = el.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        while (actionBarKWHzl3.EZpvd()) {
                            if (!actionBarKWHzl3.copydefault()) {
                                actionBarKWHzl3.gEmmrt();
                            } else {
                                arrayList3.add(SpannableStringInternal.KWHzl(el));
                            }
                        }
                        actionBar.EZpvd(arrayList3);
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl4 = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                while (actionBarKWHzl4.EZpvd()) {
                    if (!actionBarKWHzl4.copydefault()) {
                        actionBarKWHzl4.gEmmrt();
                    } else {
                        arrayList4.add(KeyAttestationApplicationId.OLrzqt(el));
                    }
                }
                actionBar.KWHzl(arrayList4);
            }
        }
    }
}
