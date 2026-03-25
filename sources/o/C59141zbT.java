package o;

import kotlin.jvm.functions.Function0;
import o.C59127zbF;

/* JADX INFO: renamed from: o.zbT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59141zbT implements Function0 {
    public final C59127zbF.TaskDescription OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59141zbT(C59127zbF.TaskDescription taskDescription) {
        this.OLrzqt = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59127zbF.TaskDescription.copydefault(this.OLrzqt);
    }
}
