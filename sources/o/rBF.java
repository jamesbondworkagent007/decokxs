package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.domain.usecase.GetValuesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBF {
    public final InterfaceC41969rBm EZpvd;

    public rBF(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.EZpvd = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<rRH.TaskDescription>> continuation) throws java.lang.Throwable {
        GetValuesUseCase$invoke$1 getValuesUseCase$invoke$1;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof GetValuesUseCase$invoke$1) {
            getValuesUseCase$invoke$1 = (GetValuesUseCase$invoke$1) continuation;
            int i = getValuesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getValuesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getValuesUseCase$invoke$1 = new GetValuesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = getValuesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getValuesUseCase$invoke$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAhwBna);
                InterfaceC41969rBm interfaceC41969rBm = this.EZpvd;
                getValuesUseCase$invoke$1.L$0 = str2;
                getValuesUseCase$invoke$1.label = 1;
                objAhwBna = interfaceC41969rBm.AhwBna(str, map, getValuesUseCase$invoke$1);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) getValuesUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objAhwBna);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (Value value : (java.lang.Iterable) ((AbstractC43728ruk) objAhwBna).copydefault()) {
                java.lang.String text = value.getText();
                java.lang.String tip = value.getTip();
                java.lang.String icon = value.getIcon();
                java.lang.String value2 = value.getValue();
                java.lang.String helperText = value.getHelperText();
                java.lang.Boolean enabled = value.getEnabled();
                arrayList.add(new rRH.TaskDescription(text, tip, icon, value2, helperText, enabled != null ? enabled.booleanValue() : z, Intrinsics.EZpvd((java.lang.Object) value.getValue(), (java.lang.Object) str4), value.getHiddenItemIds(), value.getDisplayedItemIds(), null, null, null, null, null, null, value.getCountryFlagUrl(), null, null, null, 491008, null));
                z = true;
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str3 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str3 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getValues", str3);
            return yDY.AhwBna();
        }
    }
}
