package o;

import kotlin.jvm.functions.Function1;
import o.AbstractC59147zbZ;

/* JADX INFO: renamed from: o.zcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59212zcl implements Function1 {
    public final AbstractC59147zbZ.ActionBar EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59212zcl(AbstractC59147zbZ.ActionBar actionBar) {
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return AbstractC59147zbZ.ActionBar.copydefault(this.EZpvd, (C56935yXu) obj);
    }
}
