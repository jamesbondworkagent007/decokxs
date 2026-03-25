package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProgressStepperAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42381rQt extends android.widget.FrameLayout {
    public final AbstractC43925ryV EZpvd;
    public ViewStatus KWHzl;
    public final Application OLrzqt;
    public java.lang.String copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42381rQt(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42381rQt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.rQt.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42381rQt(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42381rQt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "";
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.USBtdM, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC43925ryV abstractC43925ryV = (AbstractC43925ryV) viewDataBindingInflate;
        this.EZpvd = abstractC43925ryV;
        Application application = new Application();
        this.OLrzqt = application;
        RecyclerView recyclerView = abstractC43925ryV.copydefault;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(application);
    }

    /* JADX INFO: renamed from: o.rQt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rQt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        ProgressStepperAppModel progressStepperAppModel = uIComponentAppModel instanceof ProgressStepperAppModel ? (ProgressStepperAppModel) uIComponentAppModel : null;
        if (!(abstractC42074rFj instanceof rGL)) {
            if (!(abstractC42074rFj instanceof C42179rJg)) {
                if (abstractC42074rFj instanceof rIM) {
                    java.util.Iterator<T> it = ((rIM) abstractC42074rFj).AubY().iterator();
                    while (it.hasNext()) {
                        rAX rax = (rAX) it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (progressStepperAppModel != null ? progressStepperAppModel.getId() : null))) {
                            C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, null, new Function1() { // from class: o.rQv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C42381rQt.valueOf((java.lang.String) obj);
                                }
                            }, new Function1() { // from class: o.rQz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C42381rQt.djBIcL((java.lang.String) obj);
                                }
                            }, new Function0() { // from class: o.rQw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C42381rQt.copydefault();
                                }
                            }, 4, null);
                        }
                    }
                    return;
                }
                return;
            }
            java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
            while (it2.hasNext()) {
                rAX rax2 = (rAX) it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (progressStepperAppModel != null ? progressStepperAppModel.getId() : null))) {
                    C41959rBc.observeKYCFormField$default(rax2, lifecycleOwner, null, new Function1() { // from class: o.rQr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42381rQt.isConnected((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rQy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42381rQt.values((java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rQx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42381rQt.AhwBna();
                        }
                    }, 4, null);
                }
            }
            return;
        }
        java.util.Iterator<T> it3 = ((rGL) abstractC42074rFj).dNCPSb().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (progressStepperAppModel != null ? progressStepperAppModel.getId() : null))) {
                C41959rBc.observeKYCFormField$default(rax3, lifecycleOwner, null, new Function1() { // from class: o.rQq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42381rQt.AhwBna((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rQs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42381rQt.gEmmrt((java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rQu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42381rQt.EZpvd();
                    }
                }, 4, null);
            }
        }
    }

    public static final Unit AhwBna(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit values(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        ProgressStepperAppModel progressStepperAppModel = uIComponentAppModel instanceof ProgressStepperAppModel ? (ProgressStepperAppModel) uIComponentAppModel : null;
        if (progressStepperAppModel != null) {
            this.copydefault = ((ProgressStepperAppModel) uIComponentAppModel).getId();
            if (Intrinsics.EZpvd(progressStepperAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            java.util.List<java.lang.String> titles = progressStepperAppModel.getTitles();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(titles, 10));
            int i = 0;
            for (java.lang.Object obj : titles) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                boolean z = true;
                boolean z2 = i == progressStepperAppModel.getCurrentStep();
                boolean z3 = i == yDY.AuCTel(progressStepperAppModel.getTitles());
                if (i > progressStepperAppModel.getCurrentStep() - 1) {
                    z = false;
                }
                arrayList.add(new TaskDescription(str, z2, z3, z));
                i++;
            }
            this.OLrzqt.EZpvd(arrayList);
        }
    }

    /* JADX INFO: renamed from: o.rQt$TaskDescription */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                z = taskDescription.OLrzqt;
            }
            if ((i & 4) != 0) {
                z2 = taskDescription.AEQbTJ;
            }
            if ((i & 8) != 0) {
                z3 = taskDescription.KWHzl;
            }
            return taskDescription.OLrzqt(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.OLrzqt == taskDescription.OLrzqt && this.AEQbTJ == taskDescription.AEQbTJ && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StepperItem(title=" + this.EZpvd + ", isCurrent=" + this.OLrzqt + ", isLast=" + this.AEQbTJ + ", isCompleted=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = z;
            this.AEQbTJ = z2;
            this.KWHzl = z3;
        }
    }

    /* JADX INFO: renamed from: o.rQt$Application */
    public final class Application extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        public java.util.List<TaskDescription> EZpvd = yDY.AhwBna();

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        public final void EZpvd(@NotNull java.util.List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (i == 0) {
                AbstractC43991rzi abstractC43991rzi = (AbstractC43991rzi) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C43662rtX.TaskDescription.fjfviF, viewGroup, false);
                Intrinsics.copydefault(abstractC43991rzi);
                return new C0932Application(this, abstractC43991rzi);
            }
            AbstractC43990rzh abstractC43990rzh = (AbstractC43990rzh) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C43662rtX.TaskDescription.fdOvFl, viewGroup, false);
            Intrinsics.copydefault(abstractC43990rzh);
            return new ActionBar(this, abstractC43990rzh);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return !this.EZpvd.get(i).AEQbTJ() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            if (viewHolder instanceof C0932Application) {
                ((C0932Application) viewHolder).OLrzqt(this.EZpvd.get(i));
            } else if (viewHolder instanceof ActionBar) {
                ((ActionBar) viewHolder).AEQbTJ(this.EZpvd.get(i));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        /* JADX INFO: renamed from: o.rQt$Application$ActionBar */
        public final class ActionBar extends RecyclerView.ViewHolder {
            public final /* synthetic */ Application AEQbTJ;
            public final AbstractC43990rzh OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull Application application, AbstractC43990rzh abstractC43990rzh) {
                super(abstractC43990rzh.getRoot());
                Intrinsics.checkNotNullParameter(abstractC43990rzh, "");
                this.AEQbTJ = application;
                this.OLrzqt = abstractC43990rzh;
            }

            public final void AEQbTJ(@NotNull TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                this.OLrzqt.KWHzl(taskDescription.OLrzqt());
                this.OLrzqt.KWHzl(java.lang.Boolean.valueOf(taskDescription.EZpvd()));
                this.OLrzqt.OLrzqt.setSelected(taskDescription.KWHzl());
                if (taskDescription.KWHzl()) {
                    this.OLrzqt.KWHzl.setTextColor(C42381rQt.this.getContext().getColor(C52761wXj.Activity.dvKsVJ));
                } else {
                    this.OLrzqt.KWHzl.setTextColor(C42381rQt.this.getContext().getColor(C52761wXj.Activity.fdOvFl));
                }
            }
        }

        /* JADX INFO: renamed from: o.rQt$Application$Application, reason: collision with other inner class name */
        public final class C0932Application extends RecyclerView.ViewHolder {
            public final AbstractC43991rzi EZpvd;
            public final /* synthetic */ Application KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0932Application(@NotNull Application application, AbstractC43991rzi abstractC43991rzi) {
                super(abstractC43991rzi.getRoot());
                Intrinsics.checkNotNullParameter(abstractC43991rzi, "");
                this.KWHzl = application;
                this.EZpvd = abstractC43991rzi;
            }

            public final void OLrzqt(@NotNull TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                this.EZpvd.OLrzqt(taskDescription.OLrzqt());
                this.EZpvd.KWHzl(java.lang.Boolean.valueOf(taskDescription.EZpvd()));
                this.EZpvd.copydefault.setSelected(taskDescription.KWHzl());
            }
        }
    }
}
