package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.DeleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.Deprecated;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes20.dex */
public final class UncaughtExceptionHandler {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1 deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1) {
            deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1 = (DeleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1) continuation;
            int i = deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1 = new DeleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0 = dt;
                deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1 = c58859zS;
                deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityException;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw cognitoIdentityException;
                }
                c58859zS = (C58859zS) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1;
                dt = (DT) deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                int iHashCode = strOLrzqt.hashCode();
                if (iHashCode != 504305508) {
                    if (iHashCode != 1384808312) {
                        if (iHashCode == 1674340573 && strOLrzqt.equals("InvalidParameterException")) {
                            GeneralSecurityException generalSecurityException = new GeneralSecurityException();
                            deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                            deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1 = c56239xzCopydefault;
                            deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label = 4;
                            objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityException;
                        }
                    } else if (strOLrzqt.equals("TooManyRequestsException")) {
                        HashMap hashMap = new HashMap();
                        deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                        deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1 = c56239xzCopydefault;
                        deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label = 2;
                        objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c56239xz = c56239xzCopydefault;
                        interfaceC5039Cj = interfaceC5039CjEZpvd;
                        cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityException;
                    }
                } else if (strOLrzqt.equals("InternalErrorException")) {
                    Watchable watchable = new Watchable();
                    deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                    deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.L$1 = c56239xzCopydefault;
                    deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1.label = 3;
                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, deleteIdentitiesOperationDeserializerKt$throwDeleteIdentitiesError$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c56239xz = c56239xzCopydefault;
                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw cognitoIdentityException;
                }
            }
            cognitoIdentityException = new CognitoIdentityException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw cognitoIdentityException;
        } catch (java.lang.Exception e) {
            CognitoIdentityException cognitoIdentityException2 = new CognitoIdentityException("Failed to parse response as 'awsJson1_1' error", e);
            C54211xA.EZpvd(cognitoIdentityException2, c58859zSCopy$default.AEQbTJ(), null);
            throw cognitoIdentityException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void AEQbTJ(Deprecated.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("UnprocessedIdentityIds"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
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
                        arrayList.add(Random.KWHzl(el));
                    }
                }
                taskDescription.EZpvd(arrayList);
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
