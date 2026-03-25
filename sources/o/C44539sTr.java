package o;

import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.sTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44539sTr {
    public static final MutableStateFlow<java.lang.String> AEQbTJ;
    public static final C44539sTr EZpvd = new C44539sTr();
    public static volatile java.lang.String KWHzl;
    public static final StateFlow<java.lang.String> OLrzqt;
    public static final int copydefault;
    public static java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return djBIcL;
    }

    private C44539sTr() {
    }

    static {
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        AEQbTJ = MutableStateFlow;
        OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        copydefault = 8;
    }

    public final void OLrzqt(java.lang.String str) {
        if (str == null || (!C44157sFk.gEmmrt().values() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)))) {
            KWHzl = str;
            AEQbTJ.setValue(str);
        }
    }

    public final void KWHzl(java.lang.String str) {
        if (str == null || (!C44157sFk.gEmmrt().values() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)))) {
            djBIcL = str;
        }
    }

    public final void KWHzl() {
        OLrzqt(null);
        KWHzl(null);
    }
}
