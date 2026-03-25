package o;

import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44067sCc extends C6984aZg<FormValueType> {
    public C44067sCc() {
        super("FormValueType", new Function1() { // from class: o.sCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44067sCc.EZpvd((FormValueType) obj);
            }
        }, new Function1() { // from class: o.sCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44067sCc.copydefault((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(FormValueType formValueType) {
        Intrinsics.checkNotNullParameter(formValueType, "");
        return formValueType.getValue();
    }

    public static final FormValueType copydefault(java.lang.String str) {
        FormValueType formValueType;
        Intrinsics.checkNotNullParameter(str, "");
        FormValueType[] formValueTypeArrValues = FormValueType.values();
        int length = formValueTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                formValueType = null;
                break;
            }
            formValueType = formValueTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) formValueType.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return formValueType == null ? FormValueType.Hidden : formValueType;
    }
}
