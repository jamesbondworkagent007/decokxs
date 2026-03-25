package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33586mzJ;
import o.AbstractC33592mzP;
import o.C33583mzG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractViewOnClickListenerC33585mzI<B extends C33583mzG> extends RecyclerView.ViewHolder implements View.OnClickListener {
    public B AEQbTJ;
    public AbstractC33592mzP.Application AYXKKw;
    public final boolean EZpvd;
    public int KWHzl;
    public AbstractC33586mzJ.Activity.InterfaceC0885Activity OLrzqt;
    public boolean copydefault;
    public AbstractC33586mzJ djBIcL;
    public AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator gEmmrt;
    public RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(AbstractC33586mzJ.Activity.InterfaceC0885Activity interfaceC0885Activity) {
        this.OLrzqt = interfaceC0885Activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator) {
        this.gEmmrt = interfaceC0886StateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AbstractC33592mzP.Application application) {
        this.AYXKKw = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(RecyclerView recyclerView) {
        this.valueOf = recyclerView;
    }

    public abstract void OLrzqt(int i, @NotNull B b);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(AbstractC33586mzJ abstractC33586mzJ) {
        this.djBIcL = abstractC33586mzJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC33585mzI(@NotNull android.view.View view, boolean z) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = z;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (getAdapterPosition() > -1) {
            if (this.copydefault) {
                copydefault();
            } else if (this.EZpvd) {
                AEQbTJ();
            } else {
                EZpvd();
            }
        }
    }

    public final void copydefault() {
        AbstractC33592mzP.Application application = this.AYXKKw;
        if (application != null) {
            application.KWHzl(getAdapterPosition(), this.AEQbTJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        RecyclerView.Adapter adapter;
        AbstractC33586mzJ abstractC33586mzJ = this.djBIcL;
        if (abstractC33586mzJ == null || this.valueOf == null) {
            return;
        }
        Intrinsics.copydefault(abstractC33586mzJ, "");
        C33595mzS c33595mzS = (C33595mzS) abstractC33586mzJ;
        int i = this.KWHzl;
        for (int i2 = 0; i2 < i - 1; i2++) {
            java.lang.Integer num = c33595mzS.gEmmrt().get(i2);
            if (num != null && num.intValue() == -1) {
                return;
            }
        }
        int adapterPosition = getAdapterPosition();
        if (adapterPosition >= 0) {
            java.lang.Integer num2 = c33595mzS.gEmmrt().get(this.KWHzl);
            Intrinsics.copydefault(num2);
            int iIntValue = num2.intValue();
            c33595mzS.gEmmrt().set(this.KWHzl, java.lang.Integer.valueOf(adapterPosition));
            if (adapterPosition != iIntValue) {
                java.lang.Integer num3 = c33595mzS.valueOf().get(this.KWHzl);
                if (num3 != null && adapterPosition == num3.intValue()) {
                    int i3 = this.KWHzl;
                    boolean z = true;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!Intrinsics.EZpvd(c33595mzS.valueOf().get(i4), c33595mzS.gEmmrt().get(i4))) {
                            z = false;
                        }
                    }
                    if (z) {
                        int iAEQbTJ = c33595mzS.AEQbTJ();
                        for (int i5 = this.KWHzl + 1; i5 < iAEQbTJ; i5++) {
                            c33595mzS.gEmmrt().set(i5, c33595mzS.valueOf().get(i5));
                            C33589mzM c33589mzM = c33595mzS.copydefault().get(i5);
                            Intrinsics.checkNotNullExpressionValue(c33589mzM, "");
                            C33589mzM c33589mzM2 = c33589mzM;
                            c33589mzM2.copydefault(c33595mzS.OLrzqt(i5));
                            c33589mzM2.notifyDataSetChanged();
                        }
                    } else {
                        int iAEQbTJ2 = c33595mzS.AEQbTJ();
                        for (int i6 = this.KWHzl + 1; i6 < iAEQbTJ2; i6++) {
                            if (!c33595mzS.AhwBna()) {
                                B b = this.AEQbTJ;
                                java.util.ArrayList<C33583mzG> arrayListOLrzqt = b != null ? b.OLrzqt() : null;
                                if (arrayListOLrzqt == null || arrayListOLrzqt.isEmpty()) {
                                    c33595mzS.gEmmrt().set(i6, -1);
                                }
                            } else if (i6 == c33595mzS.AEQbTJ() - 1) {
                                c33595mzS.gEmmrt().set(i6, -1);
                            } else {
                                c33595mzS.gEmmrt().set(i6, 0);
                            }
                            C33589mzM c33589mzM3 = c33595mzS.copydefault().get(i6);
                            Intrinsics.checkNotNullExpressionValue(c33589mzM3, "");
                            C33589mzM c33589mzM4 = c33589mzM3;
                            c33589mzM4.copydefault(c33595mzS.OLrzqt(i6));
                            c33589mzM4.notifyDataSetChanged();
                        }
                    }
                    RecyclerView recyclerView = this.valueOf;
                    Intrinsics.copydefault(recyclerView);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    Intrinsics.copydefault(layoutManager, "");
                    android.view.View viewFindViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(iIntValue);
                    if (viewFindViewByPosition != null) {
                        viewFindViewByPosition.setSelected(false);
                    }
                    this.itemView.setSelected(true);
                    RecyclerView recyclerView2 = this.valueOf;
                    if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }
            if (this.KWHzl != c33595mzS.AEQbTJ() - 1) {
                if (c33595mzS.AhwBna()) {
                    return;
                }
                B b2 = this.AEQbTJ;
                java.util.ArrayList<C33583mzG> arrayListOLrzqt2 = b2 != null ? b2.OLrzqt() : null;
                if (arrayListOLrzqt2 != null && !arrayListOLrzqt2.isEmpty()) {
                    return;
                }
            }
            c33595mzS.valueOf().clear();
            c33595mzS.valueOf().addAll(c33595mzS.gEmmrt());
            AbstractC33586mzJ.StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator = this.gEmmrt;
            if (interfaceC0886StateListAnimator != null) {
                interfaceC0886StateListAnimator.OLrzqt(adapterPosition, c33595mzS.AEQbTJ(this.KWHzl));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void AEQbTJ() {
        AbstractC33586mzJ abstractC33586mzJ = this.djBIcL;
        if (abstractC33586mzJ == null || this.valueOf == null) {
            return;
        }
        Intrinsics.copydefault(abstractC33586mzJ, "");
        C33594mzR c33594mzR = (C33594mzR) abstractC33586mzJ;
        int iAEQbTJ = c33594mzR.AEQbTJ();
        int i = 0;
        for (int i2 = 0; i2 < iAEQbTJ - 1; i2++) {
            java.lang.Integer num = c33594mzR.gEmmrt().get(i2);
            if (num != null && num.intValue() == -1) {
                return;
            }
        }
        int adapterPosition = getAdapterPosition();
        if (adapterPosition > -1) {
            java.lang.Integer num2 = c33594mzR.gEmmrt().get(this.KWHzl);
            Intrinsics.copydefault(num2);
            int iIntValue = num2.intValue();
            if (adapterPosition != iIntValue) {
                RecyclerView recyclerView = this.valueOf;
                Intrinsics.copydefault(recyclerView);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.copydefault(layoutManager, "");
                android.view.View viewFindViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(iIntValue);
                if (viewFindViewByPosition != null) {
                    viewFindViewByPosition.setSelected(false);
                }
                this.itemView.setSelected(true);
                c33594mzR.gEmmrt().set(this.KWHzl, java.lang.Integer.valueOf(adapterPosition));
            }
            java.util.ArrayList<C33583mzG> arrayList = new java.util.ArrayList<>();
            int i3 = this.KWHzl;
            if (i3 >= 0) {
                while (true) {
                    java.util.ArrayList<C33583mzG> arrayListCopydefault = c33594mzR.copydefault().get(i).copydefault();
                    java.lang.Integer num3 = c33594mzR.gEmmrt().get(i);
                    Intrinsics.checkNotNullExpressionValue(num3, "");
                    arrayList.add(arrayListCopydefault.get(num3.intValue()));
                    if (i == i3) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            AbstractC33586mzJ.Activity.InterfaceC0885Activity interfaceC0885Activity = this.OLrzqt;
            if (interfaceC0885Activity != null) {
                interfaceC0885Activity.copydefault(this.KWHzl, adapterPosition, arrayList);
            }
        }
    }

    public final void KWHzl(int i, @NotNull B b) {
        java.lang.Integer num;
        java.util.ArrayList<java.lang.Integer> arrayListGEmmrt;
        java.util.ArrayList<java.lang.Integer> arrayListGEmmrt2;
        Intrinsics.checkNotNullParameter(b, "");
        this.AEQbTJ = b;
        if (this.copydefault) {
            OLrzqt(i, b);
            return;
        }
        AbstractC33586mzJ abstractC33586mzJ = this.djBIcL;
        boolean z = false;
        if (((abstractC33586mzJ == null || (arrayListGEmmrt2 = abstractC33586mzJ.gEmmrt()) == null) ? 0 : arrayListGEmmrt2.size()) > this.KWHzl) {
            android.view.View view = this.itemView;
            AbstractC33586mzJ abstractC33586mzJ2 = this.djBIcL;
            if (abstractC33586mzJ2 == null || (arrayListGEmmrt = abstractC33586mzJ2.gEmmrt()) == null || (num = arrayListGEmmrt.get(this.KWHzl)) == null) {
                num = -1;
            }
            if ((num instanceof java.lang.Integer) && i == num.intValue()) {
                z = true;
            }
            view.setSelected(z);
            OLrzqt(i, b);
        }
    }
}
