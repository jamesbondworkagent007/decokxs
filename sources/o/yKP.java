package o;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* JADX INFO: loaded from: classes13.dex */
public class yKP implements java.util.Comparator {
    public final Function2 AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yKP(Function2 function2) {
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return KDeclarationContainerImpl.OLrzqt(this.AEQbTJ, obj, obj2);
    }
}
