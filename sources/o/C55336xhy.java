package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55336xhy {
    public mAM AEQbTJ;
    public boolean KWHzl;
    public mAN OLrzqt;
    public C55288xhC valueOf;
    public java.util.ArrayList<android.view.View> AhwBna = new java.util.ArrayList<>();
    public boolean copydefault = true;
    public java.util.ArrayList<android.view.View> djBIcL = new java.util.ArrayList<>();
    public final int EZpvd = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<android.view.View> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(mAN man) {
        this.OLrzqt = man;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mAN OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55288xhC c55288xhC) {
        Intrinsics.checkNotNullParameter(c55288xhC, "");
        this.valueOf = c55288xhC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55288xhC valueOf() {
        return this.valueOf;
    }

    public static /* synthetic */ void addNewView$default(C55336xhy c55336xhy, android.view.View view, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c55336xhy.EZpvd(view, z);
    }

    public final void EZpvd(@NotNull final android.view.View view, final boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        C55288xhC c55288xhC = this.valueOf;
        if (c55288xhC != null) {
            if (c55288xhC.AEQbTJ() > 0) {
                c55288xhC.AYXKKw();
                c55288xhC.postDelayed(new java.lang.Runnable() { // from class: o.xhE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C55336xhy.EZpvd(this.KWHzl, view, z);
                    }
                }, 20L);
            } else {
                OLrzqt(view, z);
            }
        }
    }

    public static final void EZpvd(C55336xhy c55336xhy, android.view.View view, boolean z) {
        c55336xhy.OLrzqt(view, z);
    }

    public static /* synthetic */ void handleAddNewView$default(C55336xhy c55336xhy, android.view.View view, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c55336xhy.OLrzqt(view, z);
    }

    public final void OLrzqt(android.view.View view, boolean z) {
        if (this.KWHzl) {
            this.AhwBna.add(0, view);
        } else {
            if (this.AhwBna.size() > 2 && !z) {
                java.util.ArrayList<android.view.View> arrayList = this.djBIcL;
                java.util.ArrayList<android.view.View> arrayList2 = this.AhwBna;
                arrayList.add(arrayList2.remove(yDY.AuCTel(arrayList2)));
                C55288xhC c55288xhC = this.valueOf;
                if (c55288xhC != null) {
                    c55288xhC.AEQbTJ(this.AhwBna.size());
                }
            }
            if (z && this.AhwBna.size() > 2) {
                this.djBIcL.add(0, view);
                java.util.ArrayList<android.view.View> arrayList3 = this.AhwBna;
                arrayList3.add(arrayList3.remove(yDY.AuCTel(arrayList3)));
            } else {
                this.AhwBna.add(0, view);
            }
        }
        C55288xhC c55288xhC2 = this.valueOf;
        if (c55288xhC2 != null) {
            c55288xhC2.EZpvd(0);
        }
    }

    public final void AEQbTJ(@NotNull android.view.View view) {
        int iIndexOf;
        mAN man;
        Intrinsics.checkNotNullParameter(view, "");
        if (!((!this.djBIcL.isEmpty()) && this.djBIcL.remove(view)) && (iIndexOf = this.AhwBna.indexOf(view)) >= 0 && iIndexOf < this.AhwBna.size()) {
            if (this.djBIcL.isEmpty()) {
                this.AhwBna.remove(view);
                C55288xhC c55288xhC = this.valueOf;
                if (c55288xhC != null) {
                    c55288xhC.AEQbTJ(iIndexOf);
                }
            } else {
                android.view.View viewRemove = this.djBIcL.remove(0);
                Intrinsics.checkNotNullExpressionValue(viewRemove, "");
                android.view.View view2 = viewRemove;
                if (iIndexOf == 0) {
                    this.AhwBna.add(view2);
                    C55288xhC c55288xhC2 = this.valueOf;
                    if (c55288xhC2 != null) {
                        c55288xhC2.EZpvd(0);
                    }
                    this.AhwBna.remove(1);
                    C55288xhC c55288xhC3 = this.valueOf;
                    if (c55288xhC3 != null) {
                        c55288xhC3.AEQbTJ(1);
                    }
                } else {
                    this.AhwBna.set(iIndexOf, view2);
                    C55288xhC c55288xhC4 = this.valueOf;
                    if (c55288xhC4 != null) {
                        c55288xhC4.KWHzl(iIndexOf);
                    }
                }
            }
            if (!this.AhwBna.isEmpty() || (man = this.OLrzqt) == null) {
                return;
            }
            man.AEQbTJ();
        }
    }

    public final void EZpvd() {
        this.KWHzl = true;
        java.util.Iterator<android.view.View> it = this.AhwBna.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        int height = 0;
        while (it.hasNext()) {
            height += it.next().getHeight();
        }
        int size = this.AhwBna.size();
        int size2 = this.djBIcL.size();
        if (!this.djBIcL.isEmpty()) {
            for (int size3 = this.djBIcL.size() - 1; -1 < size3; size3--) {
                android.view.View view = this.djBIcL.get(size3);
                Intrinsics.checkNotNullExpressionValue(view, "");
                android.view.View view2 = view;
                height += view2.getHeight();
                this.AhwBna.add(view2);
            }
            this.djBIcL.clear();
        }
        int size4 = this.AhwBna.size();
        int i = this.EZpvd;
        mAM mam = this.AEQbTJ;
        if (mam != null) {
            mam.OLrzqt(height + ((size4 - 1) * i));
        }
        if (size2 == 0) {
            C55288xhC c55288xhC = this.valueOf;
            if (c55288xhC != null) {
                c55288xhC.AEQbTJ(size, this.AhwBna.size());
                return;
            }
            return;
        }
        C55288xhC c55288xhC2 = this.valueOf;
        if (c55288xhC2 != null) {
            c55288xhC2.AEQbTJ(size, size2);
        }
    }

    public final void KWHzl() {
        this.KWHzl = false;
        this.AhwBna.clear();
        this.djBIcL.clear();
        this.valueOf = null;
        this.OLrzqt = null;
        this.AEQbTJ = null;
    }

    public static /* synthetic */ void setContentLayoutParams$default(C55336xhy c55336xhy, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c55336xhy.copydefault(i, i2);
    }

    public final void copydefault(int i, int i2) {
        C55288xhC c55288xhC = this.valueOf;
        if (c55288xhC != null) {
            c55288xhC.setContentLayoutParams(i, i2);
        }
    }

    public final void AEQbTJ() {
        mAN man = this.OLrzqt;
        if (man != null) {
            man.AEQbTJ();
        }
    }
}
