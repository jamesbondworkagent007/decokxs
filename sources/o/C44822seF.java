package o;

import com.okinc.okex.center.bean.enums.ContextualScenario;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44822seF extends C6984aZg<ContextualScenario> {
    public C44822seF() {
        super("ContextualScenario", new Function1() { // from class: o.seE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44822seF.KWHzl((ContextualScenario) obj);
            }
        }, new Function1() { // from class: o.seG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44822seF.OLrzqt((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String KWHzl(ContextualScenario contextualScenario) {
        Intrinsics.checkNotNullParameter(contextualScenario, "");
        return contextualScenario.getValue();
    }

    public static final ContextualScenario OLrzqt(java.lang.String str) {
        ContextualScenario contextualScenario;
        Intrinsics.checkNotNullParameter(str, "");
        ContextualScenario[] contextualScenarioArrValues = ContextualScenario.values();
        int length = contextualScenarioArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                contextualScenario = null;
                break;
            }
            contextualScenario = contextualScenarioArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) contextualScenario.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return contextualScenario == null ? ContextualScenario.Unknown : contextualScenario;
    }
}
