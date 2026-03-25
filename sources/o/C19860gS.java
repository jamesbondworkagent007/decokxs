package o;

import aws.sdk.kotlin.services.rekognition.serde.GetMediaAnalysisJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ZoomButtonsController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19860gS implements BB<ZoomButtonsController> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ZoomButtonsController> continuation) throws java.lang.Throwable {
        GetMediaAnalysisJobOperationDeserializer$deserialize$1 getMediaAnalysisJobOperationDeserializer$deserialize$1;
        ZoomButtonsController.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetMediaAnalysisJobOperationDeserializer$deserialize$1) {
            getMediaAnalysisJobOperationDeserializer$deserialize$1 = (GetMediaAnalysisJobOperationDeserializer$deserialize$1) continuation;
            int i = getMediaAnalysisJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMediaAnalysisJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getMediaAnalysisJobOperationDeserializer$deserialize$1 = new GetMediaAnalysisJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getMediaAnalysisJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getMediaAnalysisJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ZoomButtonsController.ActionBar) getMediaAnalysisJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19887gT.AEQbTJ(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getMediaAnalysisJobOperationDeserializer$deserialize$1.label = 1;
            if (C19887gT.AEQbTJ(dt, c58859zS, getMediaAnalysisJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new ZoomButtonsController.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getMediaAnalysisJobOperationDeserializer$deserialize$1.L$0 = actionBar;
        getMediaAnalysisJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getMediaAnalysisJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.KWHzl();
    }
}
