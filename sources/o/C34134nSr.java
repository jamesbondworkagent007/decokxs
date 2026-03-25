package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.core.arch.data.StatefulData;
import com.okinc.okimcore.model.remote.GroupEntryCurrency;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34134nSr extends wXX {
    public C34027nOs AEQbTJ;
    public C43316rmw EZpvd;
    public final boolean KWHzl;
    public Function1<? super GroupEntryCurrency, Unit> OLrzqt;
    public java.util.List<C55276xgr> djBIcL = yDY.AhwBna();
    public int AYXKKw = -1;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nSu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34134nSr.KWHzl(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.nSr$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super GroupEntryCurrency, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(int i) {
        this.AYXKKw = i;
        C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.AkhnZx(AEQbTJ().KWHzl(), i);
        if (c55276xgr != null) {
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            GroupEntryCurrency groupEntryCurrency = objOLrzqt instanceof GroupEntryCurrency ? (GroupEntryCurrency) objOLrzqt : null;
            Function1<? super GroupEntryCurrency, Unit> function1 = this.OLrzqt;
            if (function1 != null) {
                function1.invoke(groupEntryCurrency);
            }
        }
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        EZpvd();
        dismiss();
    }

    public static final Activity KWHzl(C34134nSr c34134nSr) {
        return c34134nSr.new Activity();
    }

    public final Activity AEQbTJ() {
        return (Activity) this.copydefault.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C34027nOs.AEQbTJ(getCustomLayoutInflater(), constraintLayout, false);
        AhwBna();
        OLrzqt();
        EZpvd();
        KWHzl();
        djBIcL();
        C34027nOs c34027nOs = this.AEQbTJ;
        if (c34027nOs == null) {
            Intrinsics.gEmmrt("");
            c34027nOs = null;
        }
        constraintLayout.addView(c34027nOs.getRoot());
        AEQbTJ().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        EZpvd();
        super.onDestroy();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        EZpvd();
        super.onDismiss(dialogInterface);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        EZpvd();
        super.onCancel(dialogInterface);
    }

    public final void EZpvd() {
        C34027nOs c34027nOs = this.AEQbTJ;
        C34027nOs c34027nOs2 = null;
        if (c34027nOs == null) {
            Intrinsics.gEmmrt("");
            c34027nOs = null;
        }
        android.text.Editable text = c34027nOs.copydefault.KWHzl().getText();
        if (text != null) {
            text.clear();
        }
        android.content.Context context = getContext();
        C34027nOs c34027nOs3 = this.AEQbTJ;
        if (c34027nOs3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c34027nOs2 = c34027nOs3;
        }
        C33570myu.AEQbTJ(context, (android.view.View) c34027nOs2.copydefault.KWHzl());
    }

    private final void djBIcL() {
        C34027nOs c34027nOs = this.AEQbTJ;
        if (c34027nOs == null) {
            Intrinsics.gEmmrt("");
            c34027nOs = null;
        }
        RecyclerView recyclerView = c34027nOs.EZpvd;
        recyclerView.setAdapter(this.EZpvd);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addOnItemTouchListener(new TaskDescription(recyclerView, this));
    }

    /* JADX INFO: renamed from: o.nSr$TaskDescription */
    public static final class TaskDescription implements RecyclerView.OnItemTouchListener {
        public final /* synthetic */ C34134nSr EZpvd;
        public final /* synthetic */ RecyclerView OLrzqt;

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
        }

        public TaskDescription(RecyclerView recyclerView, C34134nSr c34134nSr) {
            this.OLrzqt = recyclerView;
            this.EZpvd = c34134nSr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                return false;
            }
            C33570myu.AEQbTJ(this.OLrzqt.getContext(), this.EZpvd.getView());
            return false;
        }
    }

    private final void AhwBna() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.setItems(yDY.AhwBna());
        c43316rmw.register(C55276xgr.class, new StateListAnimator());
        this.EZpvd = c43316rmw;
    }

    /* JADX INFO: renamed from: o.nSr$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59533zio<C55276xgr, Application> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C33930nLc c33930nLcKWHzl = C33930nLc.KWHzl(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c33930nLcKWHzl, "");
            return new Application(C34134nSr.this, c33930nLcKWHzl);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(Application application, C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            application.copydefault(c55276xgr);
        }
    }

    public final void OLrzqt() {
        C34027nOs c34027nOs = this.AEQbTJ;
        if (c34027nOs == null) {
            Intrinsics.gEmmrt("");
            c34027nOs = null;
        }
        C55230xfy c55230xfy = c34027nOs.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        c55230xfy.KWHzl().setHint(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fACtfg));
        c55230xfy.KWHzl().addTextChangedListener(new PendingIntent());
    }

    /* JADX INFO: renamed from: o.nSr$PendingIntent */
    public static final class PendingIntent implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public PendingIntent() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String string;
            C34134nSr c34134nSr = C34134nSr.this;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            c34134nSr.OLrzqt(string);
        }
    }

    public final void KWHzl() {
        java.lang.Object context = getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        if (lifecycleOwner == null) {
            return;
        }
        AEQbTJ().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.nSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34134nSr.copydefault(this.EZpvd, (StatefulData) obj);
            }
        }));
    }

    public static final Unit copydefault(C34134nSr c34134nSr, StatefulData statefulData) {
        java.util.List<C55276xgr> list;
        if (statefulData != null && (list = (java.util.List) statefulData.EZpvd()) != null) {
            c34134nSr.OLrzqt(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nSr$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C34134nSr AEQbTJ;
        public final C33930nLc copydefault;

        /* JADX INFO: renamed from: o.nSr$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C34134nSr KWHzl;
            public final /* synthetic */ Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C34134nSr c34134nSr, Application application) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.KWHzl = c34134nSr;
                this.copydefault = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C33570myu.AEQbTJ(this.KWHzl.getContext(), this.KWHzl.getView());
                    this.KWHzl.AEQbTJ(this.copydefault.getBindingAdapterPosition());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34134nSr c34134nSr, C33930nLc c33930nLc) {
            super(c33930nLc.getRoot());
            Intrinsics.checkNotNullParameter(c33930nLc, "");
            this.AEQbTJ = c34134nSr;
            this.copydefault = c33930nLc;
            android.widget.FrameLayout root = c33930nLc.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, c34134nSr, this));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void copydefault(@NotNull C55276xgr c55276xgr) {
            java.lang.CharSequence charSequenceAhwBna;
            java.lang.CharSequence charSequenceEZpvd;
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            java.lang.String icon = null;
            GroupEntryCurrency groupEntryCurrency = objOLrzqt instanceof GroupEntryCurrency ? (GroupEntryCurrency) objOLrzqt : null;
            java.lang.String strCopydefault = this.AEQbTJ.copydefault();
            android.content.Context context = this.itemView.getContext();
            C55021xcA c55021xcA = this.copydefault.EZpvd;
            C55070xcx c55070xcxValueOf = c55021xcA.valueOf();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                java.lang.CharSequence charSequenceAhwBna2 = c55276xgr.AhwBna();
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                if (StringsKt__StringsKt.AhwBna(charSequenceAhwBna2, (java.lang.CharSequence) strCopydefault, true)) {
                    java.lang.CharSequence charSequenceAhwBna3 = c55276xgr.AhwBna();
                    Intrinsics.copydefault(context);
                    charSequenceAhwBna = C37683oyU.EZpvd(charSequenceAhwBna3, context, strCopydefault, C33070mpX.OLrzqt(C52761wXj.Activity.hUfVAv, context), java.lang.Integer.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.ixgjPv, context)));
                } else {
                    charSequenceAhwBna = c55276xgr.AhwBna();
                }
            }
            c55070xcxValueOf.setText(charSequenceAhwBna);
            android.widget.TextView textViewKWHzl = c55021xcA.KWHzl();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                java.lang.CharSequence charSequenceEZpvd2 = c55276xgr.EZpvd();
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                if (StringsKt__StringsKt.AhwBna(charSequenceEZpvd2, (java.lang.CharSequence) strCopydefault, true)) {
                    java.lang.CharSequence charSequenceEZpvd3 = c55276xgr.EZpvd();
                    Intrinsics.copydefault(context);
                    charSequenceEZpvd = C37683oyU.EZpvd(charSequenceEZpvd3, context, strCopydefault, C33070mpX.OLrzqt(C52761wXj.Activity.hUfVAv, context), java.lang.Integer.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.QwvEab, context)));
                } else {
                    charSequenceEZpvd = c55276xgr.EZpvd();
                }
            }
            textViewKWHzl.setText(charSequenceEZpvd);
            int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
            java.lang.Object objKWHzl = c55276xgr.KWHzl();
            java.lang.String str = objKWHzl instanceof java.lang.String ? (java.lang.String) objKWHzl : null;
            if (str != null) {
                icon = str;
            } else if (groupEntryCurrency != null) {
                icon = groupEntryCurrency.getIcon();
            }
            if (icon != null && icon.length() != 0) {
                c55021xcA.gEmmrt().setVisibility(0);
                Glide.AEQbTJ(context).EZpvd(icon).KWHzl(C52761wXj.TaskDescription.getUriFromString).copydefault(C52761wXj.TaskDescription.getUriFromString).copydefault(iDp2px$default, iDp2px$default).EZpvd((android.widget.ImageView) c55021xcA.gEmmrt());
            } else {
                c55021xcA.gEmmrt().setVisibility(8);
            }
            this.copydefault.OLrzqt.setVisibility(c55276xgr.AEQbTJ() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        AbstractC37675oyM.performFilter$default(AEQbTJ(), str, false, 2, null);
    }

    private final void OLrzqt(java.util.List<C55276xgr> list) {
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.setItems(list);
        }
        C43316rmw c43316rmw2 = this.EZpvd;
        if (c43316rmw2 != null) {
            c43316rmw2.notifyDataSetChanged();
        }
        boolean zGEmmrt = AEQbTJ().gEmmrt();
        boolean zIsEmpty = list.isEmpty();
        C34027nOs c34027nOs = this.AEQbTJ;
        if (c34027nOs == null) {
            Intrinsics.gEmmrt("");
            c34027nOs = null;
        }
        if (zIsEmpty && zGEmmrt) {
            RecyclerView recyclerView = c34027nOs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
            C55173xeu c55173xeu = c34027nOs.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(0);
            return;
        }
        if (zIsEmpty && !zGEmmrt) {
            RecyclerView recyclerView2 = c34027nOs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(8);
            C55173xeu c55173xeu2 = c34027nOs.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(0);
            return;
        }
        RecyclerView recyclerView3 = c34027nOs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
        recyclerView3.setVisibility(0);
        C55173xeu c55173xeu3 = c34027nOs.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
        c55173xeu3.setVisibility(8);
    }

    public final java.lang.String copydefault() {
        return AEQbTJ().AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nSr$Activity */
    public final class Activity extends AbstractC37675oyM<C55276xgr> {
        public java.util.List<C55276xgr> copydefault = yDY.AhwBna();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.util.List<o.xgr>] */
        @Override // o.AbstractC37675oyM
        public void copydefault(java.lang.String str, @NotNull java.util.List<? extends C55276xgr> list) {
            Intrinsics.checkNotNullParameter(list, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        public final void OLrzqt(@NotNull java.util.List<C55276xgr> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            copydefault();
        }

        public final java.util.List<C55276xgr> KWHzl() {
            java.util.List<C55276xgr> list;
            StatefulData value = getValue();
            return (value == null || (list = (java.util.List) value.EZpvd()) == null) ? yDY.AhwBna() : list;
        }

        @Override // o.AbstractC37675oyM
        public AbstractC58185ywX<java.util.List<C55276xgr>> OLrzqt(long j) {
            AbstractC58185ywX<java.util.List<C55276xgr>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(this.copydefault);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.util.List<o.xgr>] */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends o.xgr> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
        @Override // o.AbstractC37675oyM
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.util.List<C55276xgr> KWHzl(java.lang.String str, @NotNull java.util.List<? extends C55276xgr> list) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(list, "");
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                return list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                C55276xgr c55276xgr = (C55276xgr) obj;
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                GroupEntryCurrency groupEntryCurrency = objOLrzqt instanceof GroupEntryCurrency ? (GroupEntryCurrency) objOLrzqt : null;
                if (groupEntryCurrency != null) {
                    java.lang.String currencyCode = groupEntryCurrency.getCurrencyCode();
                    if (currencyCode != null) {
                        Intrinsics.copydefault((java.lang.Object) str);
                        if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currencyCode, (java.lang.CharSequence) str, true)) {
                            java.lang.Integer currencyId = groupEntryCurrency.getCurrencyId();
                            if ((currencyId == null || (string = currencyId.toString()) == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) string, (java.lang.CharSequence) C33129mqd.gEmmrt(str), true)) && !StringsKt__StringsKt.AhwBna(c55276xgr.AhwBna(), (java.lang.CharSequence) C33129mqd.gEmmrt(str), true) && !StringsKt__StringsKt.AhwBna(c55276xgr.EZpvd(), (java.lang.CharSequence) C33129mqd.gEmmrt(str), true)) {
                            }
                        }
                        arrayList.add(obj);
                    }
                }
            }
            return arrayList;
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<C55276xgr> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C55276xgr c55276xgrCopy$default : list) {
            java.lang.Object objOLrzqt = c55276xgrCopy$default.OLrzqt();
            GroupEntryCurrency groupEntryCurrency = objOLrzqt instanceof GroupEntryCurrency ? (GroupEntryCurrency) objOLrzqt : null;
            if (c55276xgrCopy$default.KWHzl() == null) {
                if ((groupEntryCurrency != null ? groupEntryCurrency.getIcon() : null) != null) {
                    c55276xgrCopy$default = C55276xgr.copy$default(c55276xgrCopy$default, null, null, null, false, false, groupEntryCurrency.getIcon(), null, 95, null);
                }
            }
            arrayList.add(c55276xgrCopy$default);
        }
        this.djBIcL = arrayList;
        AEQbTJ().OLrzqt(this.djBIcL);
    }
}
