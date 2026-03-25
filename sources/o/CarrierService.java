package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.DescribeEndpointOperationDeserializerKt$throwDescribeEndpointError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.AidGroup;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class CarrierService {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DescribeEndpointOperationDeserializerKt$throwDescribeEndpointError$1 describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DescribeEndpointOperationDeserializerKt$throwDescribeEndpointError$1) {
            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1 = (DescribeEndpointOperationDeserializerKt$throwDescribeEndpointError$1) continuation;
            int i = describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = i - Integer.MIN_VALUE;
            } else {
                describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1 = new DescribeEndpointOperationDeserializerKt$throwDescribeEndpointError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0 = dt;
                describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1 = c58859zS;
                describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        comprehendException = (ComprehendException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw comprehendException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        comprehendException = (ComprehendException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw comprehendException;
                    }
                    if (i2 == 4) {
                        c56239xz = (C56239xz) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0;
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
                    c56239xz = (C56239xz) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    comprehendException = (ComprehendException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw comprehendException;
                }
                c58859zS = (C58859zS) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1;
                dt = (DT) describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                switch (strOLrzqt.hashCode()) {
                    case 734598063:
                        if (strOLrzqt.equals("InternalServerException")) {
                            LineBackgroundSpan lineBackgroundSpan = new LineBackgroundSpan();
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0 = interfaceC5039CjEZpvd;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1 = c56239xzCopydefault;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = 2;
                            objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1);
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
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0 = interfaceC5039CjEZpvd;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1 = c56239xzCopydefault;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = 4;
                            objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1);
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
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0 = interfaceC5039CjEZpvd;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1 = c56239xzCopydefault;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = 3;
                            objCopydefault = magnificationSpec.AEQbTJ(dt, c58859zSCopy$default, describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1);
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
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$0 = interfaceC5039CjEZpvd;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.L$1 = c56239xzCopydefault;
                            describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1.label = 5;
                            objCopydefault = mergedConfiguration.AEQbTJ(dt, c58859zSCopy$default, describeEndpointOperationDeserializerKt$throwDescribeEndpointError$1);
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

    public static final void copydefault(AidGroup.StateListAnimator stateListAnimator, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("EndpointProperties"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.copydefault(TextDirectionHeuristic.KWHzl(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
