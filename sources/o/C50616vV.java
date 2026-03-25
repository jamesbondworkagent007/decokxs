package o;

import aws.sdk.kotlin.services.translate.serde.StopTextTranslationJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C46213tM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50616vV implements BB<C46213tM> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C46213tM> continuation) throws java.lang.Throwable {
        StopTextTranslationJobOperationDeserializer$deserialize$1 stopTextTranslationJobOperationDeserializer$deserialize$1;
        C46213tM.Application application;
        byte[] bArr;
        if (continuation instanceof StopTextTranslationJobOperationDeserializer$deserialize$1) {
            stopTextTranslationJobOperationDeserializer$deserialize$1 = (StopTextTranslationJobOperationDeserializer$deserialize$1) continuation;
            int i = stopTextTranslationJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTextTranslationJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTextTranslationJobOperationDeserializer$deserialize$1 = new StopTextTranslationJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopTextTranslationJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopTextTranslationJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C46213tM.Application) stopTextTranslationJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C50589vU.copydefault(application, bArr);
            }
            application.KWHzl();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopTextTranslationJobOperationDeserializer$deserialize$1.label = 1;
            if (C50589vU.AEQbTJ(dt, c58859zS, stopTextTranslationJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C46213tM.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopTextTranslationJobOperationDeserializer$deserialize$1.L$0 = application;
        stopTextTranslationJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopTextTranslationJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.copydefault();
    }
}
