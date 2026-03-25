package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33586mzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33595mzS extends AbstractC33592mzP {
    public java.util.ArrayList<C33583mzG> DbNXlk;
    public boolean fetchVPNInfo;
    public final java.util.ArrayList<java.lang.Integer> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Integer> valueOf() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33595mzS(@NotNull AbstractC33586mzJ.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.values = new java.util.ArrayList<>();
        this.DbNXlk = new java.util.ArrayList<>();
        this.fetchVPNInfo = true;
        EZpvd(stateListAnimator.DbNXlk().size());
        this.DbNXlk = stateListAnimator.OLrzqt();
        this.fetchVPNInfo = stateListAnimator.fetchVPNInfo();
        int i = 0;
        for (java.lang.Object obj : stateListAnimator.DbNXlk()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AbstractC33587mzK abstractC33587mzK = (AbstractC33587mzK) obj;
            if (stateListAnimator.EZpvd().size() > i) {
                java.lang.Integer num = stateListAnimator.EZpvd().get(i);
                this.values.add(num);
                gEmmrt().add(num);
            } else {
                this.values.add(-1);
                gEmmrt().add(-1);
            }
            if (abstractC33587mzK instanceof AbstractC33602mzZ) {
                OLrzqt((AbstractC33602mzZ) abstractC33587mzK, false, i, OLrzqt(i), stateListAnimator.AhwBna(), null);
            } else if (abstractC33587mzK instanceof C33596mzT) {
                EZpvd((C33596mzT) abstractC33587mzK, false, i, OLrzqt(i), stateListAnimator.AhwBna(), null);
            } else if (abstractC33587mzK instanceof C33593mzQ) {
                copydefault((C33593mzQ) abstractC33587mzK, false, i, OLrzqt(i), stateListAnimator.AhwBna(), null);
            } else {
                if (!(abstractC33587mzK instanceof C33597mzU)) {
                    throw new java.lang.IllegalArgumentException(abstractC33587mzK + " is wrong type");
                }
                AEQbTJ((C33597mzU) abstractC33587mzK, false, i, OLrzqt(i), stateListAnimator.AhwBna(), null);
            }
            i++;
        }
        OLrzqt(stateListAnimator.values(), stateListAnimator.isConnected(), stateListAnimator.AkhnZx(), stateListAnimator.KWHzl(), stateListAnimator.gEmmrt());
    }

    public final java.util.ArrayList<C33583mzG> OLrzqt(int i) {
        java.util.ArrayList<C33583mzG> arrayListOLrzqt = this.DbNXlk;
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Integer num = gEmmrt().get(i2);
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            if (arrayListOLrzqt.size() > iIntValue && iIntValue >= 0) {
                arrayListOLrzqt = arrayListOLrzqt.get(iIntValue).OLrzqt();
            } else {
                return new java.util.ArrayList<>();
            }
        }
        return arrayListOLrzqt;
    }

    public final java.util.ArrayList<C33583mzG> AEQbTJ(int i) {
        java.util.ArrayList<C33583mzG> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<C33583mzG> arrayList2 = this.DbNXlk;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                java.lang.Integer num = gEmmrt().get(i2);
                Intrinsics.checkNotNullExpressionValue(num, "");
                int iIntValue = num.intValue();
                if (arrayList2.size() > iIntValue && iIntValue >= 0) {
                    C33583mzG c33583mzG = arrayList2.get(iIntValue);
                    java.util.ArrayList<C33583mzG> arrayListOLrzqt = c33583mzG.OLrzqt();
                    arrayList.add(c33583mzG);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                    arrayList2 = arrayListOLrzqt;
                } else {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mzS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean setDataSource$default(C33595mzS c33595mzS, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList2 = null;
        }
        return c33595mzS.AEQbTJ((java.util.ArrayList<C33583mzG>) arrayList, (java.util.ArrayList<java.lang.Integer>) arrayList2);
    }

    public final boolean AEQbTJ(@NotNull java.util.ArrayList<C33583mzG> arrayList, java.util.ArrayList<java.lang.Integer> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        int i = 0;
        if (arrayList2 == null) {
            this.values.clear();
            this.values.addAll(gEmmrt());
        } else {
            if (arrayList2.size() != AEQbTJ()) {
                return false;
            }
            gEmmrt().clear();
            this.values.clear();
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                gEmmrt().add(java.lang.Integer.valueOf(iIntValue));
                this.values.add(java.lang.Integer.valueOf(iIntValue));
            }
        }
        this.DbNXlk = arrayList;
        java.util.ArrayList<C33589mzM> arrayListCopydefault = copydefault();
        if (arrayListCopydefault == null) {
            return true;
        }
        for (java.lang.Object obj : arrayListCopydefault) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C33589mzM c33589mzM = (C33589mzM) obj;
            java.util.ArrayList<C33583mzG> arrayListOLrzqt = OLrzqt(i);
            RecyclerView.LayoutManager layoutManager = c33589mzM.OLrzqt().getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).setSpanCount(arrayListOLrzqt.size());
            }
            c33589mzM.copydefault(arrayListOLrzqt);
            c33589mzM.notifyDataSetChanged();
            i++;
        }
        return true;
    }
}
