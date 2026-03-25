package o;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;

/* JADX INFO: loaded from: classes13.dex */
public class yMX implements Function1 {
    public final JvmBuiltInsCustomizer AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yMX(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.AEQbTJ = jvmBuiltInsCustomizer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return JvmBuiltInsCustomizer.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
    }
}
