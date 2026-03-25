package o;

import aws.sdk.kotlin.services.polly.serde.ListSpeechSynthesisTasksOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AnticipateOvershootInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheManager implements BB<AnticipateOvershootInterpolator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AnticipateOvershootInterpolator> continuation) throws java.lang.Throwable {
        ListSpeechSynthesisTasksOperationDeserializer$deserialize$1 listSpeechSynthesisTasksOperationDeserializer$deserialize$1;
        AnticipateOvershootInterpolator.Application application;
        byte[] bArr;
        if (continuation instanceof ListSpeechSynthesisTasksOperationDeserializer$deserialize$1) {
            listSpeechSynthesisTasksOperationDeserializer$deserialize$1 = (ListSpeechSynthesisTasksOperationDeserializer$deserialize$1) continuation;
            int i = listSpeechSynthesisTasksOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listSpeechSynthesisTasksOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listSpeechSynthesisTasksOperationDeserializer$deserialize$1 = new ListSpeechSynthesisTasksOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listSpeechSynthesisTasksOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listSpeechSynthesisTasksOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AnticipateOvershootInterpolator.Application) listSpeechSynthesisTasksOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TextServicesManager.EZpvd(application, bArr);
            }
            application.KWHzl();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listSpeechSynthesisTasksOperationDeserializer$deserialize$1.label = 1;
            if (TextServicesManager.EZpvd(dt, c58859zS, listSpeechSynthesisTasksOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new AnticipateOvershootInterpolator.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listSpeechSynthesisTasksOperationDeserializer$deserialize$1.L$0 = application;
        listSpeechSynthesisTasksOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listSpeechSynthesisTasksOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.EZpvd();
    }
}
