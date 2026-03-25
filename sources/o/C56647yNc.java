package o;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: renamed from: o.yNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56647yNc implements Function1 {
    public final JvmBuiltInsCustomizer OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56647yNc(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.OLrzqt = jvmBuiltInsCustomizer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return JvmBuiltInsCustomizer.OLrzqt(this.OLrzqt, (CallableMemberDescriptor) obj);
    }
}
