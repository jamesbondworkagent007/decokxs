package o;

import aws.sdk.kotlin.services.rekognition.serde.ListMediaAnalysisJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25456ix implements BB<L> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super L> continuation) throws java.lang.Throwable {
        ListMediaAnalysisJobsOperationDeserializer$deserialize$1 listMediaAnalysisJobsOperationDeserializer$deserialize$1;
        L.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListMediaAnalysisJobsOperationDeserializer$deserialize$1) {
            listMediaAnalysisJobsOperationDeserializer$deserialize$1 = (ListMediaAnalysisJobsOperationDeserializer$deserialize$1) continuation;
            int i = listMediaAnalysisJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listMediaAnalysisJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listMediaAnalysisJobsOperationDeserializer$deserialize$1 = new ListMediaAnalysisJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listMediaAnalysisJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listMediaAnalysisJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (L.Activity) listMediaAnalysisJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C25403iw.EZpvd(activity, bArr);
            }
            activity.EZpvd();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listMediaAnalysisJobsOperationDeserializer$deserialize$1.label = 1;
            if (C25403iw.KWHzl(dt, c58859zS, listMediaAnalysisJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new L.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listMediaAnalysisJobsOperationDeserializer$deserialize$1.L$0 = activity;
        listMediaAnalysisJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listMediaAnalysisJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.copydefault();
    }
}
