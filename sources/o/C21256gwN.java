package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C21256gwN;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21256gwN {
    public C33584mzH AEQbTJ;
    public final android.app.Activity KWHzl;
    public android.view.View copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, C21261gwS>> EZpvd = new java.util.HashMap<>();

    public C21256gwN(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
    }

    /* JADX INFO: renamed from: o.gwN$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C21261gwS c21261gwS) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(c21261gwS, "");
            java.util.HashMap map = (java.util.HashMap) C21256gwN.EZpvd.get(str);
            if (map == null) {
                C21256gwN.EZpvd.put(str, C56424yEw.AYXKKw(C56390yDp.OLrzqt(str2, c21261gwS)));
            } else {
                map.put(str2, c21261gwS);
                C21256gwN.EZpvd.put(str, map);
            }
        }

        public final C21261gwS OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            C21261gwS c21261gwS;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.HashMap map = (java.util.HashMap) C21256gwN.EZpvd.get(str);
            return (map == null || (c21261gwS = (C21261gwS) map.getOrDefault(str2, new C21261gwS(str2, -1L, "", null, null, 24, null))) == null) ? new C21261gwS(str2, -1L, "", null, null, 24, null) : c21261gwS;
        }

        public final void OLrzqt() {
            C21256gwN.EZpvd.clear();
        }
    }

    /* JADX INFO: renamed from: o.gwN$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ RecyclerView AEQbTJ;
        public final /* synthetic */ android.view.View AhwBna;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.util.List KWHzl;
        public final /* synthetic */ C43316rmw OLrzqt;
        public final /* synthetic */ Ref.ObjectRef copydefault;
        public final /* synthetic */ C21256gwN valueOf;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(Ref.ObjectRef objectRef, java.util.List list, C43316rmw c43316rmw, RecyclerView recyclerView, C21256gwN c21256gwN, android.view.View view, android.view.View view2) {
            this.copydefault = objectRef;
            this.KWHzl = list;
            this.OLrzqt = c43316rmw;
            this.AEQbTJ = recyclerView;
            this.valueOf = c21256gwN;
            this.AhwBna = view;
            this.EZpvd = view2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            T tAxsJAYsNCnLh;
            java.lang.Object next;
            if (editable != null) {
                try {
                    java.lang.String string2 = editable.toString();
                    if (string2 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string2).toString()) == null) {
                        string = "";
                    }
                } catch (java.lang.Exception e) {
                    e.getMessage();
                    return;
                }
            }
            Ref.ObjectRef objectRef = this.copydefault;
            if (string.length() == 0) {
                tAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.KWHzl);
            } else {
                java.util.List list = this.KWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((C21261gwS) obj).AEQbTJ(), (java.lang.CharSequence) string, true)) {
                        arrayList.add(obj);
                    }
                }
                tAxsJAYsNCnLh = arrayList;
            }
            objectRef.element = tAxsJAYsNCnLh;
            if (((java.util.List) this.copydefault.element).isEmpty() && string.length() > 0) {
                java.util.Iterator it = this.KWHzl.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    java.lang.String strOLrzqt = ((C21261gwS) next).OLrzqt();
                    if (strOLrzqt == null || strOLrzqt.length() == 0) {
                        break;
                    }
                }
                C21261gwS c21261gwS = (C21261gwS) next;
                this.copydefault.element = c21261gwS != null ? C56402yEa.EZpvd(c21261gwS) : yDY.AhwBna();
            }
            this.OLrzqt.setItems((java.util.List) this.copydefault.element);
            this.OLrzqt.notifyDataSetChanged();
            RecyclerView recyclerView = this.AEQbTJ;
            recyclerView.post(this.valueOf.new StateListAnimator(recyclerView, this.AhwBna, this.EZpvd));
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.util.List] */
    public final void AEQbTJ(android.view.View view, final int i, @NotNull java.util.List<C21261gwS> list, int i2, @NotNull final Function0<Unit> function0, Function0<Unit> function02, Function1<? super java.lang.Integer, Unit> function1, boolean z, @NotNull Function1<? super C21261gwS, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            android.view.View viewInflate = this.copydefault;
            if (viewInflate == null) {
                viewInflate = android.view.View.inflate(this.KWHzl, C13754dXa.TaskDescription.ORrpqH, null);
                this.copydefault = viewInflate;
            } else {
                Intrinsics.copydefault(viewInflate);
            }
            C33584mzH c33584mzH = new C33584mzH((android.content.Context) this.KWHzl, viewInflate, false);
            this.AEQbTJ = c33584mzH;
            c33584mzH.setWidth(-1);
            C33584mzH c33584mzH2 = this.AEQbTJ;
            if (c33584mzH2 != null) {
                c33584mzH2.setHeight(-2);
            }
            C33584mzH c33584mzH3 = this.AEQbTJ;
            if (c33584mzH3 != null) {
                c33584mzH3.setOutsideTouchable(true);
            }
            C33584mzH c33584mzH4 = this.AEQbTJ;
            if (c33584mzH4 != null) {
                c33584mzH4.setFocusable(true);
            }
            C33584mzH c33584mzH5 = this.AEQbTJ;
            if (c33584mzH5 != null) {
                c33584mzH5.setInputMethodMode(1);
            }
            C33584mzH c33584mzH6 = this.AEQbTJ;
            if (c33584mzH6 != null) {
                c33584mzH6.setClippingEnabled(false);
            }
            C33584mzH c33584mzH7 = this.AEQbTJ;
            if (c33584mzH7 != null) {
                c33584mzH7.setAnimationStyle(android.R.style.Animation.Dialog);
            }
            final RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C13754dXa.ActionBar.getFlags);
            C55230xfy c55230xfy = (C55230xfy) viewInflate.findViewById(C13754dXa.ActionBar.getCallingPackage);
            final android.view.View viewFindViewById = viewInflate.findViewById(C13754dXa.ActionBar.MediaSessionCompat);
            final android.view.View viewFindViewById2 = viewInflate.findViewById(C13754dXa.ActionBar.isCaptioningEnabled);
            C21250gwH c21250gwH = (C21250gwH) viewInflate.findViewById(C13754dXa.ActionBar.fiXcQa);
            int i3 = (int) (500 * this.KWHzl.getResources().getDisplayMetrics().density);
            if (c21250gwH != null) {
                c21250gwH.setMaxHeight(i3);
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.KWHzl));
            recyclerView.setHasFixedSize(false);
            recyclerView.setItemViewCacheSize(20);
            C43316rmw c43316rmw = new C43316rmw();
            c43316rmw.register(C21261gwS.class, new LoaderManager(function12, list, function1, z, i));
            if (list.size() > 7) {
                c55230xfy.setVisibility(0);
            } else {
                c55230xfy.setVisibility(8);
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            recyclerView.setAdapter(c43316rmw);
            c43316rmw.setItems((java.util.List) objectRef.element);
            recyclerView.addOnScrollListener(new Application(viewFindViewById, viewFindViewById2));
            recyclerView.post(new java.lang.Runnable() { // from class: o.gwO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C21256gwN.copydefault(this.EZpvd, recyclerView, viewFindViewById, viewFindViewById2);
                }
            });
            c55230xfy.KWHzl().addTextChangedListener(new Activity(objectRef, list, c43316rmw, recyclerView, this, viewFindViewById, viewFindViewById2));
            if (i >= 0 && i < ((java.util.List) objectRef.element).size()) {
                recyclerView.post(new java.lang.Runnable() { // from class: o.gwP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21256gwN.EZpvd(recyclerView, i);
                    }
                });
            }
            C33584mzH c33584mzH8 = this.AEQbTJ;
            if (c33584mzH8 != null) {
                c33584mzH8.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.gwL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C21256gwN.EZpvd(this.copydefault, function0);
                    }
                });
            }
            if (function02 != null) {
                function02.invoke();
            }
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i4 = iArr[1];
            int height = view != null ? view.getHeight() : 0;
            C33584mzH c33584mzH9 = this.AEQbTJ;
            if (c33584mzH9 != null) {
                c33584mzH9.showAtLocation(view, 0, 0, i4 + height);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: o.gwN$LoaderManager */
    public static final class LoaderManager extends AbstractC59533zio<C21261gwS, TaskDescription> {
        public final /* synthetic */ Function1<C21261gwS, Unit> AEQbTJ;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> EZpvd;
        public final /* synthetic */ java.util.List<C21261gwS> KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gwS, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(Function1<? super C21261gwS, Unit> function1, java.util.List<C21261gwS> list, Function1<? super java.lang.Integer, Unit> function12, boolean z, int i) {
            this.AEQbTJ = function1;
            this.KWHzl = list;
            this.EZpvd = function12;
            this.OLrzqt = z;
            this.copydefault = i;
        }

        /* JADX INFO: renamed from: o.gwN$LoaderManager$StateListAnimator */
        public static final class StateListAnimator extends TaskDescription {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(Function1<? super C21261gwS, Unit> function1, java.util.List<C21261gwS> list, Function1<? super java.lang.Integer, Unit> function12, android.view.View view, C33584mzH c33584mzH, C59534zip c59534zip) {
                super(view, c33584mzH, function1, (C43316rmw) c59534zip, list, function12);
                Intrinsics.copydefault(view);
                Intrinsics.copydefault(c59534zip, "");
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new StateListAnimator(this.AEQbTJ, this.KWHzl, this.EZpvd, layoutInflater.inflate(C13754dXa.TaskDescription.OKvQBs, viewGroup, false), C21256gwN.this.AEQbTJ, getAdapter());
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(TaskDescription taskDescription, C21261gwS c21261gwS) {
            java.lang.String strOLrzqt;
            strOLrzqt = "";
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(c21261gwS, "");
            taskDescription.KWHzl().setText(c21261gwS.AEQbTJ());
            android.widget.TextView textViewOLrzqt = taskDescription.OLrzqt();
            if (textViewOLrzqt != null) {
                if (this.OLrzqt) {
                    java.lang.String strCopydefault = c21261gwS.copydefault();
                    if (strCopydefault != null) {
                        strOLrzqt = strCopydefault;
                    }
                } else {
                    C13821dZn c13821dZn = C13821dZn.EZpvd;
                    java.lang.String strCopydefault2 = c21261gwS.copydefault();
                    strOLrzqt = c13821dZn.OLrzqt(strCopydefault2 != null ? strCopydefault2 : "");
                }
                textViewOLrzqt.setText(strOLrzqt);
            }
            java.lang.Object obj = null;
            if (c21261gwS.KWHzl() == Long.MIN_VALUE && c21261gwS.EZpvd().length() == 0) {
                android.widget.ImageView imageViewAEQbTJ = taskDescription.AEQbTJ();
                if (imageViewAEQbTJ != null) {
                    imageViewAEQbTJ.setImageResource(C52761wXj.TaskDescription.SFHvfSaKzXkR);
                    imageViewAEQbTJ.setBackgroundResource(C13754dXa.Activity.copydefault);
                    int i = (int) (8 * imageViewAEQbTJ.getContext().getResources().getDisplayMetrics().density);
                    imageViewAEQbTJ.setPadding(i, i, i, i);
                }
            } else {
                android.widget.ImageView imageViewAEQbTJ2 = taskDescription.AEQbTJ();
                if (imageViewAEQbTJ2 != null) {
                    imageViewAEQbTJ2.setBackground(null);
                    imageViewAEQbTJ2.setPadding(0, 0, 0, 0);
                    java.lang.String strOLrzqt2 = c21261gwS.OLrzqt();
                    if (strOLrzqt2 != null && strOLrzqt2.length() != 0) {
                        Glide.AEQbTJ(imageViewAEQbTJ2.getContext()).EZpvd(c21261gwS.OLrzqt()).OLrzqt((RX<?>) new C5448Sc().gEmmrt()).EZpvd(imageViewAEQbTJ2);
                    }
                }
            }
            java.util.Iterator<T> it = this.KWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C21261gwS) next).AEQbTJ(), (java.lang.Object) c21261gwS.AEQbTJ())) {
                    obj = next;
                    break;
                }
            }
            boolean z = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C21261gwS>) ((java.util.List<? extends java.lang.Object>) this.KWHzl), (C21261gwS) obj) == this.copydefault;
            android.widget.ImageView imageViewEZpvd = taskDescription.EZpvd();
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setVisibility(z ? 0 : 8);
            }
            taskDescription.KWHzl().setSelected(true);
        }
    }

    /* JADX INFO: renamed from: o.gwN$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Application(android.view.View view, android.view.View view2) {
            this.copydefault = view;
            this.OLrzqt = view2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            C21256gwN.this.OLrzqt(recyclerView, this.copydefault, this.OLrzqt);
        }
    }

    public static final void copydefault(C21256gwN c21256gwN, RecyclerView recyclerView, android.view.View view, android.view.View view2) {
        Intrinsics.copydefault(recyclerView);
        c21256gwN.OLrzqt(recyclerView, view, view2);
    }

    /* JADX INFO: renamed from: o.gwN$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ RecyclerView KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(RecyclerView recyclerView, android.view.View view, android.view.View view2) {
            this.KWHzl = recyclerView;
            this.EZpvd = view;
            this.copydefault = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21256gwN c21256gwN = C21256gwN.this;
            RecyclerView recyclerView = this.KWHzl;
            Intrinsics.copydefault(recyclerView);
            c21256gwN.OLrzqt(recyclerView, this.EZpvd, this.copydefault);
        }
    }

    public static final void EZpvd(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        }
    }

    public static final void EZpvd(C21256gwN c21256gwN, Function0 function0) {
        C33584mzH c33584mzH = c21256gwN.AEQbTJ;
        if (c33584mzH != null) {
            c33584mzH.dismiss();
        }
        function0.invoke();
    }

    public final void OLrzqt(final RecyclerView recyclerView, final android.view.View view, final android.view.View view2) {
        if (view == null) {
            return;
        }
        try {
            recyclerView.post(new java.lang.Runnable() { // from class: o.gwM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C21256gwN.AEQbTJ(recyclerView, view, view2, this);
                }
            });
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public static final void AEQbTJ(RecyclerView recyclerView, android.view.View view, android.view.View view2, C21256gwN c21256gwN) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        try {
            int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            if (iComputeVerticalScrollRange <= iComputeVerticalScrollExtent) {
                view.setVisibility(8);
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = (int) (12 * c21256gwN.KWHzl.getResources().getDisplayMetrics().density);
                    }
                    view2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            view.setVisibility(0);
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                }
                view2.setLayoutParams(marginLayoutParams2);
            }
            float height = recyclerView.getHeight();
            float fCopydefault = C56548yJl.copydefault((iComputeVerticalScrollExtent * height) / iComputeVerticalScrollRange, 60.0f);
            float f = height - fCopydefault;
            float fKWHzl = C56548yJl.KWHzl((iComputeVerticalScrollOffset * f) / (iComputeVerticalScrollRange - iComputeVerticalScrollExtent), 0.0f, f);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = (int) fCopydefault;
            }
            view.setLayoutParams(marginLayoutParams);
            view.setTranslationY(fKWHzl);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: o.gwN$TaskDescription */
    public static class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final C43316rmw copydefault;
        public final java.util.List<C21261gwS> djBIcL;
        public final Function1<java.lang.Integer, Unit> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull android.view.View view, final C33584mzH c33584mzH, @NotNull final Function1<? super C21261gwS, Unit> function1, @NotNull C43316rmw c43316rmw, @NotNull java.util.List<C21261gwS> list, Function1<? super java.lang.Integer, Unit> function12) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(c43316rmw, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = c43316rmw;
            this.djBIcL = list;
            this.valueOf = function12;
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.postOrRun);
            this.OLrzqt = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.forceCloseConnection);
            this.KWHzl = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.dPnHjp);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.gwU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C21256gwN.TaskDescription.copydefault(this.AEQbTJ, c33584mzH, function1, view2);
                }
            });
        }

        public static final void copydefault(TaskDescription taskDescription, C33584mzH c33584mzH, Function1 function1, android.view.View view) {
            Function1<java.lang.Integer, Unit> function12;
            C21261gwS c21261gwSAEQbTJ = taskDescription.AEQbTJ(taskDescription.getLayoutPosition());
            if (c33584mzH != null) {
                c33584mzH.dismiss();
            }
            if (c21261gwSAEQbTJ != null) {
                java.util.Iterator<C21261gwS> it = taskDescription.djBIcL.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ(), (java.lang.Object) c21261gwSAEQbTJ.AEQbTJ())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0 && (function12 = taskDescription.valueOf) != null) {
                    function12.invoke(java.lang.Integer.valueOf(i));
                }
            }
            if (function1 == null || c21261gwSAEQbTJ == null) {
                return;
            }
            function1.invoke(c21261gwSAEQbTJ);
        }

        public final C21261gwS AEQbTJ(int i) {
            java.lang.Object objAEQbTJ = this.copydefault.AEQbTJ(i);
            if (objAEQbTJ instanceof C21261gwS) {
                return (C21261gwS) objAEQbTJ;
            }
            return null;
        }
    }
}
