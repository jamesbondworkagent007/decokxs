package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C37419otV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37418otU extends androidx.recyclerview.widget.ListAdapter<SearchResultData, C35895oHr> implements C37419otV.TaskDescription {
    public final C35899oHv<SearchResultData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C37419otV.TaskDescription
    public int copydefault(int i) {
        return C35399nuc.Dialog.DQYQgr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37418otU(@NotNull C37421otX c37421otX) {
        super(c37421otX);
        Intrinsics.checkNotNullParameter(c37421otX, "");
        this.copydefault = new C35899oHv<>();
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
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.copydefault.AEQbTJ(getCurrentList().get(i), i);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C35895oHr onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        InterfaceC35897oHt<SearchResultData> interfaceC35897oHtKWHzl = this.copydefault.KWHzl(i);
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtKWHzl, "");
        return interfaceC35897oHtKWHzl.AEQbTJ(viewGroup, i);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C35895oHr c35895oHr, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        this.copydefault.AEQbTJ(getCurrentList().get(i)).AEQbTJ(c35895oHr, getCurrentList().get(i), i);
    }

    @Override // o.C37419otV.TaskDescription
    public int OLrzqt(int i) {
        while (!KWHzl(i)) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    @Override // o.C37419otV.TaskDescription
    public void AEQbTJ(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        SearchResultData searchResultData = getCurrentList().get(i);
        if (searchResultData instanceof SearchResultData.Header) {
            nNR nnrOLrzqt = nNR.OLrzqt(view);
            Intrinsics.checkNotNullExpressionValue(nnrOLrzqt, "");
            nnrOLrzqt.OLrzqt.setText(((SearchResultData.Header) searchResultData).getTitle());
        }
    }

    @Override // o.C37419otV.TaskDescription
    public boolean KWHzl(int i) {
        return getCurrentList().get(i) instanceof SearchResultData.Header;
    }

    @Override // o.C37419otV.TaskDescription
    public boolean KWHzl() {
        java.util.List<SearchResultData> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        if (!(currentList instanceof java.util.Collection) || !currentList.isEmpty()) {
            java.util.Iterator<T> it = currentList.iterator();
            while (it.hasNext()) {
                if (((SearchResultData) it.next()) instanceof SearchResultData.Header) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void EZpvd(@NotNull InterfaceC35897oHt<SearchResultData> interfaceC35897oHt) {
        Intrinsics.checkNotNullParameter(interfaceC35897oHt, "");
        this.copydefault.OLrzqt(interfaceC35897oHt);
    }

    public final void AEQbTJ() {
        submitList(yDY.AhwBna());
    }
}
