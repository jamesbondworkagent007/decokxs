package o;

import aws.sdk.kotlin.services.polly.serde.ListLexiconsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AnticipateInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SpellCheckerSubtype implements BB<AnticipateInterpolator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AnticipateInterpolator> continuation) throws java.lang.Throwable {
        ListLexiconsOperationDeserializer$deserialize$1 listLexiconsOperationDeserializer$deserialize$1;
        AnticipateInterpolator.Application application;
        byte[] bArr;
        if (continuation instanceof ListLexiconsOperationDeserializer$deserialize$1) {
            listLexiconsOperationDeserializer$deserialize$1 = (ListLexiconsOperationDeserializer$deserialize$1) continuation;
            int i = listLexiconsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listLexiconsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listLexiconsOperationDeserializer$deserialize$1 = new ListLexiconsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listLexiconsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listLexiconsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AnticipateInterpolator.Application) listLexiconsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SuggestionsInfo.EZpvd(application, bArr);
            }
            application.KWHzl();
            return application.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listLexiconsOperationDeserializer$deserialize$1.label = 1;
            if (SuggestionsInfo.OLrzqt(dt, c58859zS, listLexiconsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new AnticipateInterpolator.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listLexiconsOperationDeserializer$deserialize$1.L$0 = application;
        listLexiconsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listLexiconsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.AEQbTJ();
    }
}
