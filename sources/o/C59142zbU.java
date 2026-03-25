package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.C59127zbF;

/* JADX INFO: renamed from: o.zbU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59142zbU implements Function0 {
    public final ProtoBuf.EnumEntry EZpvd;
    public final C59127zbF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59142zbU(C59127zbF c59127zbF, ProtoBuf.EnumEntry enumEntry) {
        this.copydefault = c59127zbF;
        this.EZpvd = enumEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59127zbF.Application.OLrzqt(this.copydefault, this.EZpvd);
    }
}
