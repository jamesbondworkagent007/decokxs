package o;

import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.rmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43318rmy<T, B extends ViewDataBinding> extends AbstractC43310rmq<T, B> {
    private int mItemLayoutId;
    private int mVariableId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return this.mItemLayoutId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return this.mVariableId;
    }

    public C43318rmy(int i, int i2) {
        this.mItemLayoutId = i;
        this.mVariableId = i2;
    }
}
