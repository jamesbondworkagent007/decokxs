package o;

import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44090sCz {
    @yCM
    public C44090sCz() {
    }

    public final boolean OLrzqt(@NotNull java.util.List<FormElementDisplayModel> list, @NotNull java.util.Map<java.lang.String, ? extends ElementValue> map, @NotNull java.util.List<? extends android.net.Uri> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C44760scx.log$default("ValidateFormUseCase: requiredFields: " + list, null, 2, null);
        C44760scx.log$default("ValidateFormUseCase: currentFormData: " + map, null, 2, null);
        C44760scx.log$default("ValidateFormUseCase: currentUploadings: " + list2, null, 2, null);
        boolean z = true;
        if (!(!map.isEmpty()) || !list2.isEmpty()) {
            z = false;
            break;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ElementValue elementValue = map.get(((FormElementDisplayModel) it.next()).KWHzl());
                if (elementValue instanceof ElementValue.ElementBoolean) {
                    if (!((ElementValue.ElementBoolean) elementValue).getData()) {
                        z = false;
                        break;
                    }
                } else if (!(elementValue instanceof ElementValue.ElementString) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((ElementValue.ElementString) elementValue).getData())) {
                    z = false;
                    break;
                }
            }
        }
        C44760scx.log$default("ValidateFormUseCase: isValid: " + z, null, 2, null);
        return z;
    }
}
