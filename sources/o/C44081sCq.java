package o;

import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44081sCq {
    @yCM
    public C44081sCq() {
    }

    public final kotlin.Pair<FormElementDisplayModel, ElementValue.ElementString> EZpvd(@NotNull FormElementDisplayModel formElementDisplayModel, java.lang.String str) {
        Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        ExtraFormData extraFormDataAEQbTJ = formElementDisplayModel.AEQbTJ();
        ExtraFormData.DropdownInfo dropdownInfo = extraFormDataAEQbTJ instanceof ExtraFormData.DropdownInfo ? (ExtraFormData.DropdownInfo) extraFormDataAEQbTJ : null;
        ElementValue.ElementString elementString = new ElementValue.ElementString(str != null ? str : "");
        if (dropdownInfo != null) {
            return C56390yDp.OLrzqt(FormElementDisplayModel.copy$default(formElementDisplayModel, null, null, false, null, null, null, ExtraFormData.DropdownInfo.copy$default(dropdownInfo, null, str, 1, null), 63, null), elementString);
        }
        return C56390yDp.OLrzqt(formElementDisplayModel, elementString);
    }
}
