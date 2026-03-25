package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59354zfU<K, T> extends AbstractC59348zfO<K, T> {
    public AbstractC59346zfM<T> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59348zfO
    public final AbstractC59346zfM<T> KWHzl() {
        return this.copydefault;
    }

    public AbstractC59354zfU(@NotNull AbstractC59346zfM<T> abstractC59346zfM) {
        Intrinsics.checkNotNullParameter(abstractC59346zfM, "");
        this.copydefault = abstractC59346zfM;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC59354zfU() {
        C59352zfS c59352zfS = C59352zfS.KWHzl;
        Intrinsics.copydefault(c59352zfS, "");
        this(c59352zfS);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: o.zfS */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC59348zfO
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        int iAEQbTJ = copydefault().AEQbTJ(str);
        int iOLrzqt = this.copydefault.OLrzqt();
        if (iOLrzqt == 0) {
            AbstractC59346zfM<T> abstractC59346zfM = this.copydefault;
            if (!(abstractC59346zfM instanceof C59352zfS)) {
                throw new java.lang.IllegalStateException(AEQbTJ(abstractC59346zfM, 0, "EmptyArrayMap"));
            }
            this.copydefault = new C59414zgb(t, iAEQbTJ);
            return;
        }
        if (iOLrzqt == 1) {
            AbstractC59346zfM<T> abstractC59346zfM2 = this.copydefault;
            try {
                Intrinsics.copydefault(abstractC59346zfM2, "");
                C59414zgb c59414zgb = (C59414zgb) abstractC59346zfM2;
                if (c59414zgb.KWHzl() == iAEQbTJ) {
                    this.copydefault = new C59414zgb(t, iAEQbTJ);
                    return;
                } else {
                    C59355zfV c59355zfV = new C59355zfV();
                    this.copydefault = c59355zfV;
                    c59355zfV.OLrzqt(c59414zgb.KWHzl(), c59414zgb.copydefault());
                }
            } catch (java.lang.ClassCastException e) {
                throw new java.lang.IllegalStateException(AEQbTJ(abstractC59346zfM2, 1, "OneElementArrayMap"), e);
            }
        }
        this.copydefault.OLrzqt(iAEQbTJ, t);
    }

    public final java.lang.String AEQbTJ(AbstractC59346zfM<T> abstractC59346zfM, int i, java.lang.String str) {
        T next;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Type: ");
        sb2.append(abstractC59346zfM.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        java.util.Map<java.lang.String, java.lang.Integer> mapOLrzqt = copydefault().OLrzqt();
        sb3.append("[");
        sb3.append('\n');
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(abstractC59346zfM, 10));
        int i2 = 0;
        for (T t : abstractC59346zfM) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.util.Iterator<T> it = mapOLrzqt.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((java.lang.Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) next) + AbstractJsonLexerKt.BEGIN_LIST + i2 + "]: " + t);
            sb3.append('\n');
            arrayList.add(sb3);
            i2++;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: " + sb3.toString());
        sb.append('\n');
        return sb.toString();
    }
}
