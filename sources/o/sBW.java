package o;

import com.okinc.okex.uploadlog.bean.enums.FormElementType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sBW extends C6984aZg<FormElementType> {
    public sBW() {
        super("FormElementType", new Function1() { // from class: o.sBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sBW.AEQbTJ((FormElementType) obj);
            }
        }, new Function1() { // from class: o.sCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sBW.AEQbTJ((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String AEQbTJ(FormElementType formElementType) {
        Intrinsics.checkNotNullParameter(formElementType, "");
        return formElementType.getValue();
    }

    public static final FormElementType AEQbTJ(java.lang.String str) {
        FormElementType formElementType;
        Intrinsics.checkNotNullParameter(str, "");
        FormElementType[] formElementTypeArrValues = FormElementType.values();
        int length = formElementTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                formElementType = null;
                break;
            }
            formElementType = formElementTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) formElementType.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return formElementType == null ? FormElementType.Field : formElementType;
    }
}
