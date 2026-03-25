package o;

import aws.sdk.kotlin.services.polly.serde.SynthesizeSpeechOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.LinearInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ServiceWorkerWebSettings implements BB<LinearInterpolator> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LinearInterpolator> continuation) throws java.lang.Throwable {
        SynthesizeSpeechOperationDeserializer$deserialize$1 synthesizeSpeechOperationDeserializer$deserialize$1;
        if (continuation instanceof SynthesizeSpeechOperationDeserializer$deserialize$1) {
            synthesizeSpeechOperationDeserializer$deserialize$1 = (SynthesizeSpeechOperationDeserializer$deserialize$1) continuation;
            int i = synthesizeSpeechOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                synthesizeSpeechOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                synthesizeSpeechOperationDeserializer$deserialize$1 = new SynthesizeSpeechOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = synthesizeSpeechOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = synthesizeSpeechOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
                synthesizeSpeechOperationDeserializer$deserialize$1.label = 1;
                if (RenderProcessGoneDetail.AEQbTJ(dt, c58859zS, synthesizeSpeechOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                LinearInterpolator.TaskDescription taskDescription = new LinearInterpolator.TaskDescription();
                taskDescription.copydefault(interfaceC5039CjAEQbTJ.AEQbTJ().copydefault("Content-Type"));
                java.lang.String strCopydefault = interfaceC5039CjAEQbTJ.AEQbTJ().copydefault("x-amzn-RequestCharacters");
                taskDescription.EZpvd(strCopydefault != null ? java.lang.Integer.parseInt(strCopydefault) : 0);
                taskDescription.KWHzl(C58752zO.KWHzl(interfaceC5039CjAEQbTJ.EZpvd()));
                taskDescription.OLrzqt();
                return taskDescription.EZpvd();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
