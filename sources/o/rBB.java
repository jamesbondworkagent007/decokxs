package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxGroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.domain.usecase.GetOKXGroupedValuesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBB {
    public final InterfaceC41969rBm AEQbTJ;

    public rBB(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.AEQbTJ = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super kotlin.Pair<java.lang.String, ? extends java.util.List<? extends rRH.Dialog>>> continuation) throws java.lang.Throwable {
        GetOKXGroupedValuesUseCase$invoke$1 getOKXGroupedValuesUseCase$invoke$1;
        java.lang.String str3;
        java.lang.String str4;
        rRH.TaskDescription taskDescription;
        if (continuation instanceof GetOKXGroupedValuesUseCase$invoke$1) {
            getOKXGroupedValuesUseCase$invoke$1 = (GetOKXGroupedValuesUseCase$invoke$1) continuation;
            int i = getOKXGroupedValuesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOKXGroupedValuesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOKXGroupedValuesUseCase$invoke$1 = new GetOKXGroupedValuesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getOKXGroupedValuesUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getOKXGroupedValuesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC41969rBm interfaceC41969rBm = this.AEQbTJ;
                getOKXGroupedValuesUseCase$invoke$1.L$0 = str2;
                getOKXGroupedValuesUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC41969rBm.copydefault(str, map, getOKXGroupedValuesUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str4 = str2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) getOKXGroupedValuesUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objCopydefault;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<GroupedValue> choices = ((OkxGroupedValue) abstractC43728ruk.copydefault()).getChoices();
            if (choices != null) {
                for (GroupedValue groupedValue : choices) {
                    java.lang.String name = groupedValue.getName();
                    rRH.StateListAnimator stateListAnimator = name != null ? new rRH.StateListAnimator(name) : null;
                    if (stateListAnimator != null) {
                        C56443yFo.KWHzl(arrayList.add(stateListAnimator));
                    }
                    java.util.List<Value> values = groupedValue.getValues();
                    if (values != null) {
                        for (Value value : values) {
                            java.lang.String text = value.getText();
                            if (text != null) {
                                java.lang.String tip = value.getTip();
                                java.lang.String icon = value.getIcon();
                                java.lang.String value2 = value.getValue();
                                java.lang.String str5 = value2 == null ? "" : value2;
                                java.lang.String helperText = value.getHelperText();
                                java.lang.Boolean enabled = value.getEnabled();
                                taskDescription = new rRH.TaskDescription(text, tip, icon, str5, helperText, enabled != null ? enabled.booleanValue() : true, Intrinsics.EZpvd((java.lang.Object) value.getValue(), (java.lang.Object) str4), value.getHiddenItemIds(), value.getDisplayedItemIds(), null, null, value.getSearchKey(), value.getReminder(), value.getPicture(), value.getThumbnail(), value.getCountryFlagUrl(), value.getDisplay(), value.getPictureMeta(), null, 263680, null);
                            } else {
                                taskDescription = null;
                            }
                            if (taskDescription != null) {
                                arrayList.add(taskDescription);
                            }
                        }
                    }
                }
            }
            java.lang.String subtitle = ((OkxGroupedValue) abstractC43728ruk.copydefault()).getSubtitle();
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
