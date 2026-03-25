package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19583gHt extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final java.util.ArrayList<kotlin.Pair<java.lang.Integer, ValuationCurrencyBean>> AEQbTJ;
    public java.lang.String AhwBna;
    public final java.util.List<ValuationCurrencyBean> EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public Function1<? super ValuationCurrencyBean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super ValuationCurrencyBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    public C19583gHt(@NotNull java.util.List<ValuationCurrencyBean> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.KWHzl = str;
        this.AEQbTJ = new java.util.ArrayList<>();
        this.AhwBna = "";
        copydefault("");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 1) {
            return new Application(this, viewGroup);
        }
        return new StateListAnimator(this, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.AEQbTJ.get(i).getFirst().intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof StateListAnimator) {
            final ValuationCurrencyBean second = this.AEQbTJ.get(i).getSecond();
            StateListAnimator stateListAnimator = (StateListAnimator) viewHolder;
            stateListAnimator.AEQbTJ().setTitle(C33061mpO.KWHzl(second.getDisplayName(), this.AhwBna, new Function1() { // from class: o.gHs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19583gHt.KWHzl((java.util.List) obj);
                }
            }));
            stateListAnimator.OLrzqt().setVisibility(Intrinsics.EZpvd((java.lang.Object) second.getIsoCode(), (java.lang.Object) this.KWHzl) ? 0 : 8);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.gHu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19583gHt.OLrzqt(this.copydefault, second, view);
                }
            });
        }
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKOmnske)));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C19583gHt c19583gHt, ValuationCurrencyBean valuationCurrencyBean, android.view.View view) {
        Function1<? super ValuationCurrencyBean, Unit> function1 = c19583gHt.copydefault;
        if (function1 != null) {
            function1.invoke(valuationCurrencyBean);
        }
    }

    public final int copydefault(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.AhwBna = str;
        this.AEQbTJ.clear();
        if (this.AhwBna.length() == 0) {
            AEQbTJ(this.EZpvd);
        } else {
            java.util.List<ValuationCurrencyBean> list = this.EZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((ValuationCurrencyBean) obj).getDisplayName(), (java.lang.CharSequence) this.AhwBna, true)) {
                    arrayList.add(obj);
                }
            }
            AEQbTJ(arrayList);
        }
        notifyDataSetChanged();
        return this.AEQbTJ.size();
    }

    public final void AEQbTJ(java.util.List<ValuationCurrencyBean> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator<ValuationCurrencyBean> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getIsoCode(), (java.lang.Object) C54864xYd.AEQbTJ.gEmmrt())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.OLrzqt = true;
            this.AEQbTJ.add(C56390yDp.OLrzqt(3, list.get(i)));
            if (list.size() > 1) {
                this.AEQbTJ.add(C56390yDp.OLrzqt(1, new ValuationCurrencyBean()));
                java.util.Iterator<java.lang.Integer> it2 = C56548yJl.AhwBna(0, i).iterator();
                while (it2.hasNext()) {
                    this.AEQbTJ.add(C56390yDp.OLrzqt(3, list.get(((AbstractC56415yEn) it2).nextInt())));
                }
                java.util.Iterator<java.lang.Integer> it3 = C56548yJl.AhwBna(i + 1, list.size()).iterator();
                while (it3.hasNext()) {
                    this.AEQbTJ.add(C56390yDp.OLrzqt(3, list.get(((AbstractC56415yEn) it3).nextInt())));
                }
                return;
            }
            return;
        }
        this.OLrzqt = false;
        java.util.ArrayList<kotlin.Pair<java.lang.Integer, ValuationCurrencyBean>> arrayList = this.AEQbTJ;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList2.add(C56390yDp.OLrzqt(3, (ValuationCurrencyBean) it4.next()));
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: o.gHt$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C19583gHt KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C19583gHt c19583gHt, android.view.ViewGroup viewGroup) {
            super(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.inahnb, viewGroup, false));
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.KWHzl = c19583gHt;
        }
    }

    /* JADX INFO: renamed from: o.gHt$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final OKRegularCell KWHzl;
        public final /* synthetic */ C19583gHt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C19583gHt c19583gHt, android.view.ViewGroup viewGroup) {
            super(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.pXZxY, viewGroup, false));
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.copydefault = c19583gHt;
            android.view.View view = this.itemView;
            Intrinsics.copydefault(view, "");
            this.KWHzl = (OKRegularCell) view;
            android.view.View viewFindViewById = this.itemView.findViewById(C13754dXa.ActionBar.RIKbBf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById;
        }
    }
}
