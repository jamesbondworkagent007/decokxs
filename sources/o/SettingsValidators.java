package o;

import aws.sdk.kotlin.services.comprehend.serde.BatchDetectSentimentOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NetworkState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SettingsValidators implements BB<NetworkState> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NetworkState> continuation) throws java.lang.Throwable {
        BatchDetectSentimentOperationDeserializer$deserialize$1 batchDetectSentimentOperationDeserializer$deserialize$1;
        NetworkState.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof BatchDetectSentimentOperationDeserializer$deserialize$1) {
            batchDetectSentimentOperationDeserializer$deserialize$1 = (BatchDetectSentimentOperationDeserializer$deserialize$1) continuation;
            int i = batchDetectSentimentOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchDetectSentimentOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                batchDetectSentimentOperationDeserializer$deserialize$1 = new BatchDetectSentimentOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = batchDetectSentimentOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = batchDetectSentimentOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (NetworkState.ActionBar) batchDetectSentimentOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TimeZoneRulesDataContract.copydefault(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            batchDetectSentimentOperationDeserializer$deserialize$1.label = 1;
            if (TimeZoneRulesDataContract.copydefault(dt, c58859zS, batchDetectSentimentOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new NetworkState.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        batchDetectSentimentOperationDeserializer$deserialize$1.L$0 = actionBar;
        batchDetectSentimentOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, batchDetectSentimentOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.AEQbTJ();
    }
}
