package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.DetectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.Build;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class Voice {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DetectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1 detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DetectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1) {
            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1 = (DetectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1) continuation;
            int i = detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = i - Integer.MIN_VALUE;
            } else {
                detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1 = new DetectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0 = dt;
                detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1 = c58859zS;
                detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        comprehendException = (ComprehendException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw comprehendException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        comprehendException = (ComprehendException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw comprehendException;
                    }
                    if (i2 == 4) {
                        c56239xz = (C56239xz) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        comprehendException = (ComprehendException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw comprehendException;
                    }
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    comprehendException = (ComprehendException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw comprehendException;
                }
                c58859zS = (C58859zS) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1;
                dt = (DT) detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                switch (strOLrzqt.hashCode()) {
                    case 588566607:
                        if (strOLrzqt.equals("TextSizeLimitExceededException")) {
                            InputChannel inputChannel = new InputChannel();
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0 = interfaceC5039CjEZpvd;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1 = c56239xzCopydefault;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = 4;
                            objCopydefault = inputChannel.AEQbTJ(dt, c58859zSCopy$default, detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1);
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
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0 = interfaceC5039CjEZpvd;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1 = c56239xzCopydefault;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = 2;
                            objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1);
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
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0 = interfaceC5039CjEZpvd;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1 = c56239xzCopydefault;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = 5;
                            objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1);
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
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$0 = interfaceC5039CjEZpvd;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.L$1 = c56239xzCopydefault;
                            detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1.label = 3;
                            objCopydefault = remoteAnimationTarget.AEQbTJ(dt, c58859zSCopy$default, detectTargetedSentimentOperationDeserializerKt$throwDetectTargetedSentimentError$1);
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
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void EZpvd(Build.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Entities"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(HapticFeedbackConstants.EZpvd(el));
                    }
                }
                activity.KWHzl(arrayList);
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
