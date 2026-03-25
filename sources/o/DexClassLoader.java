package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.StsException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationDeserializerKt$throwAssumeRoleError$1;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.ExtractedText;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes.dex */
public final class DexClassLoader {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: Exception -> 0x0177, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0177, blocks: (B:27:0x00a9, B:68:0x016b, B:69:0x0176), top: B:74:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b A[Catch: Exception -> 0x0177, TRY_ENTER, TryCatch #0 {Exception -> 0x0177, blocks: (B:27:0x00a9, B:68:0x016b, B:69:0x0176), top: B:74:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        AssumeRoleOperationDeserializerKt$throwAssumeRoleError$1 assumeRoleOperationDeserializerKt$throwAssumeRoleError$1;
        byte[] bArr;
        java.lang.Exception e;
        C58859zS c58859zS2;
        DT dt2;
        InterfaceC5039Cj interfaceC5039Cj;
        java.lang.String strOLrzqt;
        StsException stsException;
        C56239xz c56239xz;
        if (continuation instanceof AssumeRoleOperationDeserializerKt$throwAssumeRoleError$1) {
            assumeRoleOperationDeserializerKt$throwAssumeRoleError$1 = (AssumeRoleOperationDeserializerKt$throwAssumeRoleError$1) continuation;
            int i = assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = i - Integer.MIN_VALUE;
            } else {
                assumeRoleOperationDeserializerKt$throwAssumeRoleError$1 = new AssumeRoleOperationDeserializerKt$throwAssumeRoleError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = dt;
                assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = c58859zS;
                assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                bArr = (byte[]) objCopydefault;
                InterfaceC5039Cj interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
                C58859zS c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                try {
                    if (bArr != null) {
                        throw new java.lang.IllegalStateException("unable to parse error from empty response".toString());
                    }
                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = dt;
                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = interfaceC5039CjEZpvd;
                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2 = c58859zSCopy$default;
                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 2;
                    objCopydefault = C54590xO.AEQbTJ(bArr, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    dt2 = dt;
                    c58859zS2 = c58859zSCopy$default;
                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                    C56239xz c56239xz2 = (C56239xz) objCopydefault;
                    strOLrzqt = c56239xz2.OLrzqt();
                    if (strOLrzqt != null) {
                        switch (strOLrzqt.hashCode()) {
                            case -924282799:
                                if (strOLrzqt.equals("PackedPolicyTooLarge")) {
                                    Externalizable externalizable = new Externalizable();
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = interfaceC5039Cj;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = c56239xz2;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2 = null;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 6;
                                    java.lang.Object objAEQbTJ = externalizable.AEQbTJ(dt2, c58859zS2, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                                    if (objAEQbTJ == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    objCopydefault = objAEQbTJ;
                                    c56239xz = c56239xz2;
                                    stsException = (StsException) objCopydefault;
                                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                                    throw stsException;
                                }
                                break;
                            case -608224069:
                                if (strOLrzqt.equals("ExpiredTokenException")) {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = interfaceC5039Cj;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = c56239xz2;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2 = null;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 4;
                                    java.lang.Object objAEQbTJ2 = byteArrayOutputStream.AEQbTJ(dt2, c58859zS2, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                                    if (objAEQbTJ2 == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    objCopydefault = objAEQbTJ2;
                                    c56239xz = c56239xz2;
                                    stsException = (StsException) objCopydefault;
                                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                                    throw stsException;
                                }
                                break;
                            case -109774721:
                                if (strOLrzqt.equals("RegionDisabledException")) {
                                    FileDescriptor fileDescriptor = new FileDescriptor();
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = interfaceC5039Cj;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = c56239xz2;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2 = null;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 5;
                                    java.lang.Object objAEQbTJ3 = fileDescriptor.AEQbTJ(dt2, c58859zS2, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                                    if (objAEQbTJ3 == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    objCopydefault = objAEQbTJ3;
                                    c56239xz = c56239xz2;
                                    stsException = (StsException) objCopydefault;
                                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                                    throw stsException;
                                }
                                break;
                            case 534430952:
                                if (strOLrzqt.equals("MalformedPolicyDocument")) {
                                    DataInputStream dataInputStream = new DataInputStream();
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0 = interfaceC5039Cj;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1 = c56239xz2;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2 = null;
                                    assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.label = 3;
                                    java.lang.Object objAEQbTJ4 = dataInputStream.AEQbTJ(dt2, c58859zS2, assumeRoleOperationDeserializerKt$throwAssumeRoleError$1);
                                    if (objAEQbTJ4 == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    objCopydefault = objAEQbTJ4;
                                    c56239xz = c56239xz2;
                                    stsException = (StsException) objCopydefault;
                                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                                    throw stsException;
                                }
                                break;
                        }
                    }
                    stsException = new StsException(c56239xz2.copydefault());
                    c56239xz = c56239xz2;
                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                    throw stsException;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    c58859zS2 = c58859zSCopy$default;
                    StsException stsException2 = new StsException("Failed to parse response as 'awsQuery' error", e);
                    C54211xA.EZpvd(stsException2, c58859zS2.AEQbTJ(), null);
                    throw stsException2;
                }
            case 1:
                c58859zS = (C58859zS) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                dt = (DT) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                bArr = (byte[]) objCopydefault;
                InterfaceC5039Cj interfaceC5039CjEZpvd2 = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd2, 1, null);
                if (bArr != null) {
                }
                break;
            case 2:
                c58859zS2 = (C58859zS) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$2;
                interfaceC5039Cj = (InterfaceC5039Cj) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                dt2 = (DT) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    C56239xz c56239xz22 = (C56239xz) objCopydefault;
                    strOLrzqt = c56239xz22.OLrzqt();
                    if (strOLrzqt != null) {
                    }
                    stsException = new StsException(c56239xz22.copydefault());
                    c56239xz = c56239xz22;
                    C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                    throw stsException;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    StsException stsException22 = new StsException("Failed to parse response as 'awsQuery' error", e);
                    C54211xA.EZpvd(stsException22, c58859zS2.AEQbTJ(), null);
                    throw stsException22;
                }
            case 3:
                c56239xz = (C56239xz) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                stsException = (StsException) objCopydefault;
                C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                throw stsException;
            case 4:
                c56239xz = (C56239xz) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                stsException = (StsException) objCopydefault;
                C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                throw stsException;
            case 5:
                c56239xz = (C56239xz) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                stsException = (StsException) objCopydefault;
                C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                throw stsException;
            case 6:
                c56239xz = (C56239xz) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) assumeRoleOperationDeserializerKt$throwAssumeRoleError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                stsException = (StsException) objCopydefault;
                C54211xA.EZpvd(stsException, interfaceC5039Cj, c56239xz);
                throw stsException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void EZpvd(ExtractedText.StateListAnimator stateListAnimator, byte[] bArr) {
        C5116Fi c5116Fi = new C5116Fi(bArr, false, 2, null);
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new C5128Fu("AssumeRoleResult"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("AssumeRoleResponse"));
        activity.EZpvd(c5101Et);
        java.lang.Integer numOLrzqt = c5116Fi.EZpvd(activity.KWHzl()).OLrzqt();
        int iCopydefault = c5101Et.copydefault();
        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
            throw new DeserializationException("failed to unwrap AssumeRole response");
        }
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new C5128Fu("AssumedRoleUser"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new C5128Fu("Credentials"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new C5128Fu("PackedPolicySize"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new C5128Fu("SourceIdentity"));
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.KWHzl(new C5127Ft("https://sts.amazonaws.com/doc/2011-06-15/", null, 2, null));
        activity2.KWHzl(new C5128Fu("AssumeRoleResult"));
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = c5116Fi.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt2 = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault2 = c5101Et2.copydefault();
            if (numOLrzqt2 != null && numOLrzqt2.intValue() == iCopydefault2) {
                stateListAnimator.KWHzl(BufferedReader.copydefault(c5116Fi));
            } else {
                int iCopydefault3 = c5101Et3.copydefault();
                if (numOLrzqt2 != null && numOLrzqt2.intValue() == iCopydefault3) {
                    stateListAnimator.KWHzl(BufferedOutputStream.OLrzqt(c5116Fi));
                } else {
                    int iCopydefault4 = c5101Et4.copydefault();
                    if (numOLrzqt2 != null && numOLrzqt2.intValue() == iCopydefault4) {
                        stateListAnimator.AEQbTJ(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                    } else {
                        int iCopydefault5 = c5101Et5.copydefault();
                        if (numOLrzqt2 != null && numOLrzqt2.intValue() == iCopydefault5) {
                            stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else if (numOLrzqt2 == null) {
                            return;
                        } else {
                            stateListAnimatorEZpvd.copydefault();
                        }
                    }
                }
            }
        }
    }
}
