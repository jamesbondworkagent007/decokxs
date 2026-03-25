package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.GetSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.CaptioningManager;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class InputMethodManager {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1 getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1) {
            getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1 = (GetSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1) continuation;
            int i = getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label = i - Integer.MIN_VALUE;
            } else {
                getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1 = new GetSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0 = dt;
                getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1 = c58859zS;
                getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        pollyException = (PollyException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw pollyException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        pollyException = (PollyException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw pollyException;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    pollyException = (PollyException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                }
                c58859zS = (C58859zS) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1;
                dt = (DT) getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                int iHashCode = strOLrzqt.hashCode();
                if (iHashCode != -1634658681) {
                    if (iHashCode != -1276726630) {
                        if (iHashCode == -1224535080 && strOLrzqt.equals("InvalidTaskIdException")) {
                            TextClassificationSessionFactory textClassificationSessionFactory = new TextClassificationSessionFactory();
                            getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0 = interfaceC5039CjEZpvd;
                            getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1 = c56239xzCopydefault;
                            getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label = 4;
                            objCopydefault = textClassificationSessionFactory.AEQbTJ(dt, c58859zSCopy$default, getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            pollyException = (PollyException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw pollyException;
                        }
                    } else if (strOLrzqt.equals("ServiceFailureException")) {
                        MimeTypeMap mimeTypeMap = new MimeTypeMap();
                        getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0 = interfaceC5039CjEZpvd;
                        getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1 = c56239xzCopydefault;
                        getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label = 2;
                        objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c56239xz = c56239xzCopydefault;
                        interfaceC5039Cj = interfaceC5039CjEZpvd;
                        pollyException = (PollyException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw pollyException;
                    }
                } else if (strOLrzqt.equals("SynthesisTaskNotFoundException")) {
                    PluginList pluginList = new PluginList();
                    getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$0 = interfaceC5039CjEZpvd;
                    getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.L$1 = c56239xzCopydefault;
                    getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1.label = 3;
                    objCopydefault = pluginList.AEQbTJ(dt, c58859zSCopy$default, getSpeechSynthesisTaskOperationDeserializerKt$throwGetSpeechSynthesisTaskError$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c56239xz = c56239xzCopydefault;
                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                    pollyException = (PollyException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                }
            }
            pollyException = new PollyException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw pollyException;
        } catch (java.lang.Exception e) {
            PollyException pollyException2 = new PollyException("Failed to parse response as 'restJson1' error", e);
            C54211xA.EZpvd(pollyException2, c58859zSCopy$default.AEQbTJ(), null);
            throw pollyException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void EZpvd(CaptioningManager.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("SynthesisTask"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.EZpvd(PermissionRequest.EZpvd(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
