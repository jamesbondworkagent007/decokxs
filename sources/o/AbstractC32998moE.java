package o;

/* JADX INFO: renamed from: o.moE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32998moE extends AbstractC32996moC {
    public static final int $stable = 8;
    private boolean isVisibled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisibled() {
        return this.isVisibled;
    }

    public abstract void onInvisible();

    public abstract void onVisible();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisibled(boolean z) {
        this.isVisibled = z;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isVisibled = true;
        onVisible();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isVisibled = false;
        onInvisible();
    }
}
