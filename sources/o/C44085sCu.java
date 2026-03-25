package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.uploadlog.bean.ElementData;
import com.okinc.okex.uploadlog.bean.FieldOption;
import com.okinc.okex.uploadlog.bean.FormElement;
import com.okinc.okex.uploadlog.bean.TicketFormResponse;
import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import com.okinc.okex.uploadlog.usecase.GetFormConfigUseCase$invoke$1;
import com.okinc.okex.uploadlog.usecase.GetFormConfigUseCase$invoke$response$1$1;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44085sCu {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC45301snH KWHzl;

    /* JADX INFO: renamed from: o.sCu$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FormValueType.values().length];
            try {
                iArr[FormValueType.Dropdown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public C44085sCu(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45301snH interfaceC45301snH) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = interfaceC45301snH;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:27:0x0061, B:28:0x006e), top: B:35:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super sCT> continuation) throws java.lang.Throwable {
        GetFormConfigUseCase$invoke$1 getFormConfigUseCase$invoke$1;
        java.lang.Throwable th;
        C44085sCu c44085sCu;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof GetFormConfigUseCase$invoke$1) {
            getFormConfigUseCase$invoke$1 = (GetFormConfigUseCase$invoke$1) continuation;
            int i = getFormConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFormConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getFormConfigUseCase$invoke$1 = new GetFormConfigUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getFormConfigUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFormConfigUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                GetFormConfigUseCase$invoke$response$1$1 getFormConfigUseCase$invoke$response$1$1 = new GetFormConfigUseCase$invoke$response$1$1(this, str, null);
                getFormConfigUseCase$invoke$1.L$0 = this;
                getFormConfigUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getFormConfigUseCase$invoke$response$1$1, getFormConfigUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c44085sCu = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                c44085sCu = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44085sCu = (C44085sCu) getFormConfigUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        return c44085sCu.OLrzqt((TicketFormResponse) actionBar.AEQbTJ());
    }

    public final sCT OLrzqt(TicketFormResponse ticketFormResponse) {
        java.util.List<FormElement> formElements = ticketFormResponse.getFormElements();
        if (formElements == null) {
            formElements = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(formElements, 10));
        java.util.Iterator<T> it = formElements.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((FormElement) it.next()));
        }
        java.lang.Integer id = ticketFormResponse.getId();
        int iIntValue = id != null ? id.intValue() : -1;
        java.lang.String name = ticketFormResponse.getName();
        if (name == null) {
            name = "";
        }
        java.lang.String description = ticketFormResponse.getDescription();
        return new sCT(iIntValue, name, description != null ? description : "", arrayList);
    }

    public final FormElementDisplayModel EZpvd(FormElement formElement) {
        java.util.List<FieldOption> fieldOptions;
        ElementData elementData = formElement.getElementData();
        FormValueType valueType = elementData.getValueType();
        if (valueType == null) {
            valueType = FormValueType.Hidden;
        }
        FormElementViewType formElementViewTypeKWHzl = FormElementViewType.Companion.KWHzl(valueType);
        ExtraFormData.DropdownInfo dropdownInfo = (ActionBar.EZpvd[valueType.ordinal()] != 1 || (fieldOptions = formElement.getElementData().getFieldOptions()) == null) ? null : new ExtraFormData.DropdownInfo(fieldOptions, null, 2, null);
        java.lang.String id = elementData.getId();
        java.lang.Boolean boolIsRequired = elementData.isRequired();
        boolean zBooleanValue = boolIsRequired != null ? boolIsRequired.booleanValue() : false;
        java.lang.String displayName = elementData.getDisplayName();
        java.lang.String str = displayName == null ? "" : displayName;
        java.lang.String placeholder = elementData.getPlaceholder();
        java.lang.String str2 = placeholder == null ? "" : placeholder;
        java.lang.String defaultValue = elementData.getDefaultValue();
        return new FormElementDisplayModel(id, formElementViewTypeKWHzl, zBooleanValue, str, str2, defaultValue == null ? "" : defaultValue, dropdownInfo);
    }
}
