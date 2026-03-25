package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC33602mzZ extends AbstractC33587mzK {
    public final float EZpvd;
    public final boolean OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33587mzK
    public int AEQbTJ() {
        return this.copydefault;
    }

    public abstract android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float OLrzqt() {
        return this.EZpvd;
    }

    public AbstractC33602mzZ(float f, boolean z, @androidx.annotation.ColorInt int i) {
        super(i);
        this.EZpvd = f;
        this.OLrzqt = z;
        this.copydefault = i;
    }
}
