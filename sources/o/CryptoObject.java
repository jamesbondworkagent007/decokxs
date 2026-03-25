package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListUserPoolsOperationDeserializerKt$throwListUserPoolsError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.Instrumentation;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class CryptoObject {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListUserPoolsOperationDeserializerKt$throwListUserPoolsError$1 listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListUserPoolsOperationDeserializerKt$throwListUserPoolsError$1) {
            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1 = (ListUserPoolsOperationDeserializerKt$throwListUserPoolsError$1) continuation;
            int i = listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = i - Integer.MIN_VALUE;
            } else {
                listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1 = new ListUserPoolsOperationDeserializerKt$throwListUserPoolsError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0 = dt;
                listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1 = c58859zS;
                listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 == 4) {
                        c56239xz = (C56239xz) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw cognitoIdentityProviderException;
                }
                c58859zS = (C58859zS) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1;
                dt = (DT) listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                switch (strOLrzqt.hashCode()) {
                    case -1416998079:
                        if (strOLrzqt.equals("NotAuthorizedException")) {
                            CaptureResultExtras captureResultExtras = new CaptureResultExtras();
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0 = interfaceC5039CjEZpvd;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1 = c56239xzCopydefault;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = 4;
                            objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 504305508:
                        if (strOLrzqt.equals("InternalErrorException")) {
                            SQLiteTableLockedException sQLiteTableLockedException = new SQLiteTableLockedException();
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0 = interfaceC5039CjEZpvd;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1 = c56239xzCopydefault;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = 3;
                            objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 1384808312:
                        if (strOLrzqt.equals("TooManyRequestsException")) {
                            HdmiRecordListener hdmiRecordListener = new HdmiRecordListener();
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0 = interfaceC5039CjEZpvd;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1 = c56239xzCopydefault;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = 5;
                            objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 1674340573:
                        if (strOLrzqt.equals("InvalidParameterException")) {
                            DdmRegister ddmRegister = new DdmRegister();
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$0 = interfaceC5039CjEZpvd;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.L$1 = c56239xzCopydefault;
                            listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1.label = 2;
                            objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, listUserPoolsOperationDeserializerKt$throwListUserPoolsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                }
            }
            cognitoIdentityProviderException = new CognitoIdentityProviderException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw cognitoIdentityProviderException;
        } catch (java.lang.Exception e) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException("Failed to parse response as 'awsJson1_1' error", e);
            C54211xA.EZpvd(cognitoIdentityProviderException2, c58859zSCopy$default.AEQbTJ(), null);
            throw cognitoIdentityProviderException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void KWHzl(Instrumentation.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("UserPools"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(Credentials.AEQbTJ(el));
                        }
                    }
                    activity.EZpvd(arrayList);
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            }
        }
    }
}
