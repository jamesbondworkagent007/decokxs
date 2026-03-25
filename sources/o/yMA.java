package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes13.dex */
public class yMA implements Function0 {
    public final PrimitiveType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yMA(PrimitiveType primitiveType) {
        this.KWHzl = primitiveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return PrimitiveType.arrayTypeFqName_delegate$lambda$1(this.KWHzl);
    }
}
