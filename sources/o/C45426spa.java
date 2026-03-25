package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.okinc.okex.common.view.ExpandableFlowLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.spa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45426spa extends android.widget.LinearLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super TaskDescription, Unit> AYXKKw;
    public final Application AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public Function1<? super java.lang.Boolean, Unit> DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public boolean djBIcL;
    public float gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45426spa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45426spa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChipClickListener(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModeChangeListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.spa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45426spa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45426spa(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.spb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C45426spa.djBIcL());
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.spf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C45426spa.KWHzl());
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.spd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C45426spa.AYXKKw());
            }
        });
        this.AhwBna = new Application();
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.spc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45426spa.valueOf();
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.spe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45426spa.KWHzl(context, this);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.spk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45426spa.AEQbTJ(context, this);
            }
        });
        setOrientation(0);
        android.widget.ImageView imageViewAkhnZx = AkhnZx();
        imageViewAkhnZx.setOnClickListener(new Activity(imageViewAkhnZx, 250L, this));
        addView(fIwbmz());
        addView(AkhnZx());
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.spi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45426spa.copydefault(this.EZpvd, context);
            }
        });
    }

    private final int values() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int djBIcL() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
    }

    private final int fetchVPNInfo() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int KWHzl() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAY);
    }

    private final int isConnected() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA);
    }

    /* JADX INFO: renamed from: o.spa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.spa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.spa$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final java.lang.Object AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                z = taskDescription.copydefault;
            }
            if ((i & 8) != 0) {
                obj = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(str, str2, z, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2, z, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.Object obj = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChipData(id=" + this.KWHzl + ", text=" + this.EZpvd + ", isSelected=" + this.copydefault + ", data=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = z;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r4v0 java.lang.Object))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.Object):void (m)] (LINE:52) call: o.spa.TaskDescription.<init>(java.lang.String, java.lang.String, boolean, java.lang.Object):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : obj);
        }
    }

    private final ExpandableFlowLayoutManager DbNXlk() {
        return (ExpandableFlowLayoutManager) this.valueOf.getValue();
    }

    public static final ExpandableFlowLayoutManager valueOf() {
        return new ExpandableFlowLayoutManager();
    }

    /* JADX INFO: renamed from: o.spa$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView {
        @Override // android.view.View
        public boolean isPaddingOffsetRequired() {
            return true;
        }

        public StateListAnimator(android.content.Context context) {
            super(context);
        }

        @Override // android.view.View
        public int getLeftPaddingOffset() {
            return -getPaddingLeft();
        }

        @Override // android.view.View
        public int getRightPaddingOffset() {
            return getPaddingRight();
        }
    }

    private final StateListAnimator fIwbmz() {
        return (StateListAnimator) this.AkhnZx.getValue();
    }

    public static final StateListAnimator KWHzl(android.content.Context context, C45426spa c45426spa) {
        StateListAnimator stateListAnimator = new StateListAnimator(context);
        stateListAnimator.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        stateListAnimator.setClipToPadding(false);
        stateListAnimator.setOverScrollMode(2);
        stateListAnimator.setHorizontalFadingEdgeEnabled(true);
        stateListAnimator.setFadingEdgeLength(c45426spa.values());
        stateListAnimator.addItemDecoration(new C45387soo(java.lang.Integer.valueOf(C52761wXj.StateListAnimator.OuxcSI), java.lang.Integer.valueOf(C52761wXj.StateListAnimator.OuxcSI), null, java.lang.Integer.valueOf(C52761wXj.StateListAnimator.ffGIBT), 4, null));
        stateListAnimator.setLayoutManager(c45426spa.DbNXlk());
        stateListAnimator.setAdapter(c45426spa.AhwBna);
        return stateListAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView AkhnZx() {
        return (android.widget.ImageView) this.KWHzl.getValue();
    }

    public static final android.widget.ImageView AEQbTJ(android.content.Context context, C45426spa c45426spa) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        imageView.setLayoutParams(layoutParams);
        if (!C55296xhK.AEQbTJ(imageView)) {
            imageView.setPadding(c45426spa.isConnected(), c45426spa.fetchVPNInfo(), 0, c45426spa.fetchVPNInfo());
        } else {
            imageView.setPadding(0, c45426spa.fetchVPNInfo(), c45426spa.isConnected(), c45426spa.fetchVPNInfo());
        }
        imageView.setImageResource(C47315tni.Application.AEQbTJ);
        return imageView;
    }

    public final boolean gEmmrt() {
        return DbNXlk().valueOf();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DbNXlk().EZpvd(AkhnZx().getWidth());
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(0, i2, 0, i4);
        if (!C55296xhK.AEQbTJ(this)) {
            fIwbmz().setPadding(i, fIwbmz().getPaddingTop(), fIwbmz().getPaddingRight(), fIwbmz().getPaddingBottom());
            AkhnZx().setPadding(AkhnZx().getPaddingLeft(), AkhnZx().getPaddingTop(), i3, AkhnZx().getPaddingBottom());
        } else {
            fIwbmz().setPadding(fIwbmz().getPaddingLeft(), fIwbmz().getPaddingTop(), i3, fIwbmz().getPaddingBottom());
            AkhnZx().setPadding(i, AkhnZx().getPaddingTop(), AkhnZx().getPaddingRight(), AkhnZx().getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: o.spa$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Application extends AbstractC45381soi<TaskDescription, C0951Application> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX INFO: renamed from: o.spa$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public final class C0951Application extends RecyclerView.ViewHolder {
            public final AbstractC47522trg AEQbTJ;
            public final /* synthetic */ Application KWHzl;

            /* JADX INFO: renamed from: o.spa$Application$Application$TaskDescription */
            public static final class TaskDescription implements View.OnClickListener {
                public final /* synthetic */ C45426spa AEQbTJ;
                public final /* synthetic */ android.view.View EZpvd;
                public final /* synthetic */ long OLrzqt;
                public final /* synthetic */ TaskDescription copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public TaskDescription(android.view.View view, long j, C45426spa c45426spa, TaskDescription taskDescription) {
                    this.EZpvd = view;
                    this.OLrzqt = j;
                    this.AEQbTJ = c45426spa;
                    this.copydefault = taskDescription;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                        C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                        Function1 function1 = this.AEQbTJ.AYXKKw;
                        if (function1 != null) {
                            function1.invoke(this.copydefault);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0951Application(@NotNull Application application, AbstractC47522trg abstractC47522trg) {
                super(abstractC47522trg.getRoot());
                Intrinsics.checkNotNullParameter(abstractC47522trg, "");
                this.KWHzl = application;
                this.AEQbTJ = abstractC47522trg;
            }

            public final void copydefault(@NotNull TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                C54989xbV c54989xbV = this.AEQbTJ.KWHzl;
                C45426spa c45426spa = C45426spa.this;
                c54989xbV.setStyle(2);
                c54989xbV.EZpvd().setText(taskDescription.KWHzl());
                c54989xbV.setSelected(taskDescription.OLrzqt());
                c54989xbV.setOnClickListener(new TaskDescription(c54989xbV, 1000L, c45426spa, taskDescription));
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C0951Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC47522trg abstractC47522trgKWHzl = AbstractC47522trg.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47522trgKWHzl, "");
            return new C0951Application(this, abstractC47522trgKWHzl);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0951Application c0951Application, int i) {
            Intrinsics.checkNotNullParameter(c0951Application, "");
            onBindViewHolder(c0951Application, i, yDY.AhwBna());
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0951Application c0951Application, int i, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(c0951Application, "");
            Intrinsics.checkNotNullParameter(list, "");
            TaskDescription taskDescription = copydefault().getCurrentList().get(i);
            Intrinsics.checkNotNullExpressionValue(taskDescription, "");
            c0951Application.copydefault(taskDescription);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // o.AbstractC45381soi
        public boolean KWHzl(@NotNull TaskDescription taskDescription, @NotNull TaskDescription taskDescription2) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(taskDescription2, "");
            return Intrinsics.EZpvd((java.lang.Object) taskDescription.copydefault(), (java.lang.Object) taskDescription2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // o.AbstractC45381soi
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(@NotNull TaskDescription taskDescription, @NotNull TaskDescription taskDescription2) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(taskDescription2, "");
            return taskDescription.OLrzqt() == taskDescription2.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) taskDescription.KWHzl(), (java.lang.Object) taskDescription2.KWHzl()) && Intrinsics.EZpvd(taskDescription.EZpvd(), taskDescription2.EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.spa$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C45426spa AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C45426spa c45426spa) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c45426spa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    public final void AEQbTJ(@NotNull final java.util.List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna.AEQbTJ(list);
        post(new java.lang.Runnable() { // from class: o.soW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45426spa.EZpvd(this.OLrzqt, list);
            }
        });
    }

    public static final void EZpvd(C45426spa c45426spa, java.util.List list) {
        c45426spa.AkhnZx().setVisibility(list.size() < 4 ? 8 : 0);
    }

    private final androidx.transition.ChangeBounds fARcdN() {
        return (androidx.transition.ChangeBounds) this.values.getValue();
    }

    public static final androidx.transition.ChangeBounds copydefault(C45426spa c45426spa, android.content.Context context) {
        androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
        changeBounds.setDuration(250L);
        changeBounds.setInterpolator(new FastOutSlowInInterpolator());
        changeBounds.addListener(c45426spa.new Dialog(context));
        return changeBounds;
    }

    /* JADX INFO: renamed from: o.spa$Dialog */
    public static final class Dialog implements Transition.TransitionListener {
        public final /* synthetic */ android.content.Context OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        public Dialog(android.content.Context context) {
            this.OLrzqt = context;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
            C45426spa.this.djBIcL = true;
            C45426spa.this.AkhnZx().setImageResource(!C45426spa.this.gEmmrt() ? C47315tni.Application.AEQbTJ : C47315tni.Application.EZpvd);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
            android.content.Context context = this.OLrzqt;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.startPostponedEnterTransition();
            }
            C45426spa.this.djBIcL = false;
            Function1 function1 = C45426spa.this.DbNXlk;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C45426spa.this.gEmmrt()));
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
            C45426spa.this.djBIcL = false;
            Function1 function1 = C45426spa.this.DbNXlk;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C45426spa.this.gEmmrt()));
            }
        }
    }

    public final void AhwBna() {
        if (this.djBIcL) {
            return;
        }
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.postponeEnterTransition();
        }
        android.view.ViewParent parent = getParent();
        Intrinsics.copydefault(parent, "");
        androidx.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) parent, fARcdN());
        DbNXlk().EZpvd(!gEmmrt());
    }

    public final void AEQbTJ(int i) {
        fIwbmz().smoothScrollToPosition(i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        EZpvd(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        EZpvd(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void EZpvd(android.view.MotionEvent motionEvent) {
        if (!gEmmrt()) {
            java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.gEmmrt = motionEvent.getX();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                float x = motionEvent.getX() - this.gEmmrt;
                int iAbs = java.lang.Math.abs(fIwbmz().computeHorizontalScrollOffset());
                int iComputeHorizontalScrollRange = fIwbmz().computeHorizontalScrollRange();
                if ((iAbs == 0 && x > 0.0f) || (iAbs == iComputeHorizontalScrollRange && x < 0.0f)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }
}
