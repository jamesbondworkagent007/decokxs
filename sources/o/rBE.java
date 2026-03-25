package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxValues;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.domain.usecase.GetOKXValuesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBE {
    public final InterfaceC41969rBm KWHzl;

    public rBE(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.KWHzl = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super kotlin.Pair<java.lang.String, ? extends java.util.List<rRH.TaskDescription>>> continuation) throws java.lang.Throwable {
        GetOKXValuesUseCase$invoke$1 getOKXValuesUseCase$invoke$1;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof GetOKXValuesUseCase$invoke$1) {
            getOKXValuesUseCase$invoke$1 = (GetOKXValuesUseCase$invoke$1) continuation;
            int i = getOKXValuesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOKXValuesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOKXValuesUseCase$invoke$1 = new GetOKXValuesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getOKXValuesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOKXValuesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC41969rBm interfaceC41969rBm = this.KWHzl;
                getOKXValuesUseCase$invoke$1.L$0 = str2;
                getOKXValuesUseCase$invoke$1.label = 1;
                objEZpvd = interfaceC41969rBm.EZpvd(str, map, getOKXValuesUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) getOKXValuesUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objEZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<Value> choices = ((OkxValues) abstractC43728ruk.copydefault()).getChoices();
            if (choices != null) {
                for (Value value : choices) {
                    java.lang.String text = value.getText();
                    java.lang.String tip = value.getTip();
                    java.lang.String icon = value.getIcon();
                    java.lang.String value2 = value.getValue();
                    java.lang.String helperText = value.getHelperText();
                    java.lang.Boolean enabled = value.getEnabled();
                    arrayList.add(new rRH.TaskDescription(text, tip, icon, value2, helperText, enabled != null ? enabled.booleanValue() : true, Intrinsics.EZpvd((java.lang.Object) value.getValue(), (java.lang.Object) str4), value.getHiddenItemIds(), value.getDisplayedItemIds(), null, null, value.getSearchKey(), value.getReminder(), value.getPicture(), value.getThumbnail(), value.getCountryFlagUrl(), value.getDisplay(), value.getPictureMeta(), null, 263680, null));
                }
            }
            java.lang.String subtitle = ((OkxValues) abstractC43728ruk.copydefault()).getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            return new kotlin.Pair(subtitle, arrayList);
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str3 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str3 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getValues", str3);
            return new kotlin.Pair("", yDY.AhwBna());
        }
    }
}
