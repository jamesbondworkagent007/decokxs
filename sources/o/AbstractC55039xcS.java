package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55039xcS<T> extends RecyclerView.Adapter<C55043xcW> {
    public android.view.ViewGroup AYXKKw;
    public java.util.List<T> EZpvd;
    public int KWHzl;
    public android.content.Context OLrzqt;
    public boolean copydefault;
    public ActionBar<T> gEmmrt;
    public android.view.LayoutInflater valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.xcS$ActionBar */
    public interface ActionBar<T> {
        void AEQbTJ(android.view.ViewGroup viewGroup, android.view.View view, T t, int i);

        boolean copydefault(android.view.ViewGroup viewGroup, android.view.View view, T t, int i);
    }

    public final boolean AEQbTJ(int i) {
        return true;
    }

    public abstract void EZpvd(@NotNull C55043xcW c55043xcW, T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    public AbstractC55039xcS(@NotNull android.content.Context context, int i, @NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = true;
        this.valueOf = android.view.LayoutInflater.from(context);
        this.OLrzqt = context;
        this.KWHzl = i;
        this.EZpvd = list;
    }

    public final void EZpvd(java.util.List<T> list) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list);
            this.EZpvd.clear();
            this.EZpvd.addAll(arrayList);
        } else {
            this.EZpvd.clear();
        }
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55043xcW onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        C55043xcW c55043xcWKWHzl;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0 || !this.copydefault) {
            c55043xcWKWHzl = C55043xcW.Companion.KWHzl(this.OLrzqt, null, viewGroup, this.KWHzl, -1);
        } else {
            c55043xcWKWHzl = C55043xcW.Companion.KWHzl(this.OLrzqt, null, viewGroup, C52761wXj.Fragment.fetchVPNInfo, -1);
        }
        if (this.AYXKKw == null) {
            this.AYXKKw = viewGroup;
        }
        return c55043xcWKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C55043xcW c55043xcW, int i) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        c55043xcW.copydefault(i);
        KWHzl(i, c55043xcW);
        EZpvd(c55043xcW, this.EZpvd.get(i));
    }

    public final int copydefault(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getBindingAdapterPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    public final void KWHzl(final int i, final C55043xcW c55043xcW) {
        if (AEQbTJ(getItemViewType(i))) {
            c55043xcW.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.xcU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC55039xcS.KWHzl(this.copydefault, i, view);
                }
            });
            c55043xcW.AEQbTJ().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.xcQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return AbstractC55039xcS.OLrzqt(this.copydefault, c55043xcW, view);
                }
            });
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
    public static final void KWHzl(AbstractC55039xcS abstractC55039xcS, int i, android.view.View view) {
        ActionBar<T> actionBar = abstractC55039xcS.gEmmrt;
        if (actionBar != null) {
            actionBar.AEQbTJ(abstractC55039xcS.AYXKKw, view, abstractC55039xcS.EZpvd.get(i), i);
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
    public static final boolean OLrzqt(AbstractC55039xcS abstractC55039xcS, C55043xcW c55043xcW, android.view.View view) {
        if (abstractC55039xcS.gEmmrt == null) {
            return false;
        }
        int iCopydefault = abstractC55039xcS.copydefault(c55043xcW);
        ActionBar<T> actionBar = abstractC55039xcS.gEmmrt;
        Intrinsics.copydefault(actionBar);
        return actionBar.copydefault(abstractC55039xcS.AYXKKw, view, abstractC55039xcS.EZpvd.get(iCopydefault), iCopydefault);
    }

    /* JADX INFO: renamed from: o.xcS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
