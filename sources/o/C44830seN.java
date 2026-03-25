package o;

import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44830seN extends C6984aZg<SelfServiceScenario> {
    public C44830seN() {
        super("SelfServiceScenario", new Function1() { // from class: o.seM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44830seN.AEQbTJ((SelfServiceScenario) obj);
            }
        }, new Function1() { // from class: o.seP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44830seN.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String AEQbTJ(SelfServiceScenario selfServiceScenario) {
        Intrinsics.checkNotNullParameter(selfServiceScenario, "");
        return selfServiceScenario.getValue();
    }

    public static final SelfServiceScenario KWHzl(java.lang.String str) {
        SelfServiceScenario selfServiceScenario;
        Intrinsics.checkNotNullParameter(str, "");
        SelfServiceScenario[] selfServiceScenarioArrValues = SelfServiceScenario.values();
        int length = selfServiceScenarioArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                selfServiceScenario = null;
                break;
            }
            selfServiceScenario = selfServiceScenarioArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) selfServiceScenario.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return selfServiceScenario == null ? SelfServiceScenario.UNKNOWN : selfServiceScenario;
    }
}
