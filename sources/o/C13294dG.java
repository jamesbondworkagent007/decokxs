package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateProjectOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CalendarView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13294dG implements BB<CalendarView> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CalendarView> continuation) throws java.lang.Throwable {
        CreateProjectOperationDeserializer$deserialize$1 createProjectOperationDeserializer$deserialize$1;
        CalendarView.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof CreateProjectOperationDeserializer$deserialize$1) {
            createProjectOperationDeserializer$deserialize$1 = (CreateProjectOperationDeserializer$deserialize$1) continuation;
            int i = createProjectOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createProjectOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createProjectOperationDeserializer$deserialize$1 = new CreateProjectOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createProjectOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createProjectOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (CalendarView.StateListAnimator) createProjectOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C13321dH.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createProjectOperationDeserializer$deserialize$1.label = 1;
            if (C13321dH.copydefault(dt, c58859zS, createProjectOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new CalendarView.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createProjectOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        createProjectOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createProjectOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.OLrzqt();
    }
}
