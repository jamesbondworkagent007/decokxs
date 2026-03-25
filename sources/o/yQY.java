package o;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public class yQY implements Function1 {
    public final InterfaceC56687yOp KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yQY(InterfaceC56687yOp interfaceC56687yOp) {
        this.KWHzl = interfaceC56687yOp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(yQW.EZpvd(this.KWHzl, (CallableMemberDescriptor) obj));
    }
}
