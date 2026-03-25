package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24738ijW extends android.widget.BaseExpandableListAdapter {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final android.content.Context EZpvd;
    public final java.util.List<kotlin.Pair<java.lang.String, java.util.List<C22947hov>>> KWHzl;

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* JADX INFO: renamed from: o.ijW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ijW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<o.hov>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24738ijW(@NotNull android.content.Context context, @NotNull java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<C22947hov>>> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = context;
        this.KWHzl = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.KWHzl.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        return this.KWHzl.get(i).getSecond().size();
    }

    /* JADX DEBUG: Method merged with bridge method: getGroup(I)Ljava/lang/Object; */
    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String getGroup(int i) {
        return this.KWHzl.get(i).getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: getChild(II)Ljava/lang/Object; */
    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C22947hov getChild(int i, int i2) {
        return this.KWHzl.get(i).getSecond().get(i2);
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildType(int i, int i2) {
        return getChild(i, i2).EZpvd().length() > 0 ? 1 : 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.LayoutInflater.from(this.EZpvd).inflate(C23274hvD.Activity.dzkkkq, viewGroup, false);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C23274hvD.Application.parseItem);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C23274hvD.Application.UNDaji);
        textView.setText(getGroup(i));
        imageView.setBackgroundResource(z ? C23274hvD.ActionBar.DTwDnp : C23274hvD.ActionBar.ORxRYg);
        Intrinsics.copydefault(view);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getChildView(int i, int i2, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        C22947hov child = getChild(i, i2);
        if (getChildType(i, i2) == 1) {
            return KWHzl(child.EZpvd(), child.copydefault(), z, view, viewGroup);
        }
        return OLrzqt(child.copydefault(), z, view, viewGroup);
    }

    public final android.view.View OLrzqt(java.lang.String str, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.LayoutInflater.from(this.EZpvd).inflate(C23274hvD.Activity.getUserContextRegisteredStatus, viewGroup, false);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C23274hvD.Application.InspectablePropertyValueType);
        android.view.View viewFindViewById = view.findViewById(C23274hvD.Application.hGuIrQ);
        textView.setText(str);
        viewFindViewById.setVisibility(z ? 8 : 0);
        Intrinsics.copydefault(view);
        return view;
    }

    public final android.view.View KWHzl(java.lang.String str, java.lang.String str2, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.LayoutInflater.from(this.EZpvd).inflate(C23274hvD.Activity.dPnHjp, viewGroup, false);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C23274hvD.Application.InspectablePropertyValueType);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(C23274hvD.Application.mapNightMode);
        android.view.View viewFindViewById = view.findViewById(C23274hvD.Application.hGuIrQ);
        textView.setText(str2);
        textView2.setText(str);
        viewFindViewById.setVisibility(z ? 8 : 0);
        Intrinsics.copydefault(view);
        return view;
    }
}
