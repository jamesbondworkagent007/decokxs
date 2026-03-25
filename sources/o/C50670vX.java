package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.TagResourceOperationDeserializerKt$throwTagResourceError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: o.vX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50670vX {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        TagResourceOperationDeserializerKt$throwTagResourceError$1 tagResourceOperationDeserializerKt$throwTagResourceError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof TagResourceOperationDeserializerKt$throwTagResourceError$1) {
            tagResourceOperationDeserializerKt$throwTagResourceError$1 = (TagResourceOperationDeserializerKt$throwTagResourceError$1) continuation;
            int i = tagResourceOperationDeserializerKt$throwTagResourceError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagResourceOperationDeserializerKt$throwTagResourceError$1.label = i - Integer.MIN_VALUE;
            } else {
                tagResourceOperationDeserializerKt$throwTagResourceError$1 = new TagResourceOperationDeserializerKt$throwTagResourceError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = tagResourceOperationDeserializerKt$throwTagResourceError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (tagResourceOperationDeserializerKt$throwTagResourceError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = dt;
                tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c58859zS;
                tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, tagResourceOperationDeserializerKt$throwTagResourceError$1);
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
                            case -2005002116:
                                if (strOLrzqt.equals("ConcurrentModificationException")) {
                                    C49306um c49306um = new C49306um();
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c56239xzCopydefault;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 5;
                                    objCopydefault = c49306um.AEQbTJ(dt, c58859zSCopy$default, tagResourceOperationDeserializerKt$throwTagResourceError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 218496528:
                                if (strOLrzqt.equals("InvalidParameterValueException")) {
                                    C50751va c50751va = new C50751va();
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c56239xzCopydefault;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 3;
                                    objCopydefault = c50751va.AEQbTJ(dt, c58859zSCopy$default, tagResourceOperationDeserializerKt$throwTagResourceError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 616958275:
                                if (strOLrzqt.equals("TooManyTagsException")) {
                                    C53521wn c53521wn = new C53521wn();
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c56239xzCopydefault;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 4;
                                    objCopydefault = c53521wn.AEQbTJ(dt, c58859zSCopy$default, tagResourceOperationDeserializerKt$throwTagResourceError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 734598063:
                                if (strOLrzqt.equals("InternalServerException")) {
                                    C48616uY c48616uY = new C48616uY();
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c56239xzCopydefault;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 2;
                                    objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, tagResourceOperationDeserializerKt$throwTagResourceError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    C50265vI c50265vI = new C50265vI();
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1 = c56239xzCopydefault;
                                    tagResourceOperationDeserializerKt$throwTagResourceError$1.label = 6;
                                    objCopydefault = c50265vI.AEQbTJ(dt, c58859zSCopy$default, tagResourceOperationDeserializerKt$throwTagResourceError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                        }
                    }
                    translateException = new TranslateException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw translateException;
                } catch (java.lang.Exception e) {
                    TranslateException translateException2 = new TranslateException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(translateException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw translateException2;
                }
            case 1:
                c58859zS = (C58859zS) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                dt = (DT) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                translateException = new TranslateException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 2:
                c56239xz = (C56239xz) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 3:
                c56239xz = (C56239xz) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 4:
                c56239xz = (C56239xz) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 5:
                c56239xz = (C56239xz) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 6:
                c56239xz = (C56239xz) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) tagResourceOperationDeserializerKt$throwTagResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
