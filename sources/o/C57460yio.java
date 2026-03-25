package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3Uilib.bean.MultiTransactionDetailBean;
import com.okinc.web3Uilib.bean.MultiTransactionDetailItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import o.C57456yik;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57460yio extends android.widget.LinearLayout {
    public final java.util.HashMap<java.lang.Integer, java.lang.Boolean> AEQbTJ;
    public int AhwBna;
    public final C57372yhF EZpvd;
    public MultiTransactionDetailBean KWHzl;
    public final int OLrzqt;
    public Function1<? super java.lang.Integer, Unit> copydefault;
    public int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57460yio(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57460yio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteCallback(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.yio.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57460yio(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57460yio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 10;
        this.djBIcL = 10;
        this.OLrzqt = 10;
        this.AEQbTJ = new java.util.HashMap<>();
        C57372yhF c57372yhFKWHzl = C57372yhF.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57372yhFKWHzl, "");
        this.EZpvd = c57372yhFKWHzl;
        setOrientation(1);
        setPadding(C57410yhr.AEQbTJ(), C57410yhr.copydefault(), C57410yhr.KWHzl(), C57410yhr.EZpvd());
        RecyclerView recyclerView = c57372yhFKWHzl.AYXKKw;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw = new C43316rmw();
        int i2 = C57406yhn.TaskDescription.valueOf;
        int i3 = C57409yhq.EZpvd;
        c43316rmw.register(MultiTransactionDetailItem.class, new Activity(i2, i3));
        recyclerView.setAdapter(c43316rmw);
        RecyclerView recyclerView2 = c57372yhFKWHzl.gEmmrt;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw2 = new C43316rmw();
        c43316rmw2.register(MultiTransactionDetailItem.class, new TaskDescription(C57406yhn.TaskDescription.valueOf, i3));
        recyclerView2.setAdapter(c43316rmw2);
        android.widget.LinearLayout linearLayout = c57372yhFKWHzl.OLrzqt;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
        android.widget.LinearLayout linearLayout2 = c57372yhFKWHzl.KWHzl;
        linearLayout2.setOnClickListener(new ActionBar(linearLayout2, 1000L, this));
        android.widget.LinearLayout linearLayout3 = c57372yhFKWHzl.copydefault;
        linearLayout3.setOnClickListener(new StateListAnimator(linearLayout3, 1000L, this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.valueOf);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.AhwBna, true);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            copydefault();
        } else {
            OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.yio$Activity */
    public static final class Activity extends C43318rmy<MultiTransactionDetailItem, AbstractC57415yhw> {
        public Activity(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC57415yhw> c43312rms, MultiTransactionDetailItem multiTransactionDetailItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(multiTransactionDetailItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, multiTransactionDetailItem);
            C57460yio.this.EZpvd(c43312rms, multiTransactionDetailItem);
        }
    }

    /* JADX INFO: renamed from: o.yio$TaskDescription */
    public static final class TaskDescription extends C43318rmy<MultiTransactionDetailItem, AbstractC57415yhw> {
        public TaskDescription(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC57415yhw> c43312rms, MultiTransactionDetailItem multiTransactionDetailItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(multiTransactionDetailItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, multiTransactionDetailItem);
            C57460yio.this.AEQbTJ(c43312rms, multiTransactionDetailItem);
        }
    }

    public final void setBean(@NotNull MultiTransactionDetailBean multiTransactionDetailBean) {
        Intrinsics.checkNotNullParameter(multiTransactionDetailBean, "");
        if (this.AEQbTJ.isEmpty()) {
            int iMax = java.lang.Math.max(multiTransactionDetailBean.getInputList().size(), multiTransactionDetailBean.getOutputList().size());
            for (int i = 0; i < iMax; i++) {
                this.AEQbTJ.put(java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE);
            }
        }
        this.KWHzl = multiTransactionDetailBean;
        android.widget.TextView textView = this.EZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        MultiTransactionDetailBean multiTransactionDetailBean2 = this.KWHzl;
        MultiTransactionDetailBean multiTransactionDetailBean3 = null;
        if (multiTransactionDetailBean2 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean2 = null;
        }
        C55307xhV.AEQbTJ(textView, multiTransactionDetailBean2.getTitle());
        android.widget.TextView textView2 = this.EZpvd.valueOf;
        MultiTransactionDetailBean multiTransactionDetailBean4 = this.KWHzl;
        if (multiTransactionDetailBean4 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean4 = null;
        }
        textView2.setText(multiTransactionDetailBean4.getContent());
        AppCompatTextView appCompatTextView = this.EZpvd.AhwBna;
        MultiTransactionDetailBean multiTransactionDetailBean5 = this.KWHzl;
        if (multiTransactionDetailBean5 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean5 = null;
        }
        appCompatTextView.setText(multiTransactionDetailBean5.getInputTitle());
        AppCompatTextView appCompatTextView2 = this.EZpvd.values;
        MultiTransactionDetailBean multiTransactionDetailBean6 = this.KWHzl;
        if (multiTransactionDetailBean6 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean6 = null;
        }
        appCompatTextView2.setText(multiTransactionDetailBean6.getOutputTitle());
        RecyclerView.Adapter adapter = this.EZpvd.AYXKKw.getAdapter();
        Intrinsics.copydefault(adapter, "");
        C43316rmw c43316rmw = (C43316rmw) adapter;
        MultiTransactionDetailBean multiTransactionDetailBean7 = this.KWHzl;
        if (multiTransactionDetailBean7 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean7 = null;
        }
        java.util.List<MultiTransactionDetailItem> inputList = multiTransactionDetailBean7.getInputList();
        MultiTransactionDetailBean multiTransactionDetailBean8 = this.KWHzl;
        if (multiTransactionDetailBean8 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean8 = null;
        }
        c43316rmw.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) inputList.subList(0, java.lang.Math.min(multiTransactionDetailBean8.getInputList().size(), this.AhwBna))));
        RecyclerView.Adapter adapter2 = this.EZpvd.gEmmrt.getAdapter();
        Intrinsics.copydefault(adapter2, "");
        C43316rmw c43316rmw2 = (C43316rmw) adapter2;
        MultiTransactionDetailBean multiTransactionDetailBean9 = this.KWHzl;
        if (multiTransactionDetailBean9 == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean9 = null;
        }
        java.util.List<MultiTransactionDetailItem> outputList = multiTransactionDetailBean9.getOutputList();
        MultiTransactionDetailBean multiTransactionDetailBean10 = this.KWHzl;
        if (multiTransactionDetailBean10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            multiTransactionDetailBean3 = multiTransactionDetailBean10;
        }
        c43316rmw2.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) outputList.subList(0, java.lang.Math.min(multiTransactionDetailBean3.getOutputList().size(), this.djBIcL))));
        EZpvd();
    }

    public final void OLrzqt() {
        this.EZpvd.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        this.EZpvd.EZpvd.setVisibility(8);
    }

    public final void copydefault() {
        this.EZpvd.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        this.EZpvd.EZpvd.setVisibility(0);
    }

    public final void EZpvd() {
        android.widget.LinearLayout linearLayout = this.EZpvd.KWHzl;
        int i = this.AhwBna;
        MultiTransactionDetailBean multiTransactionDetailBean = this.KWHzl;
        MultiTransactionDetailBean multiTransactionDetailBean2 = null;
        if (multiTransactionDetailBean == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean = null;
        }
        linearLayout.setVisibility(i >= multiTransactionDetailBean.getInputList().size() ? 8 : 0);
        android.widget.LinearLayout linearLayout2 = this.EZpvd.copydefault;
        int i2 = this.djBIcL;
        MultiTransactionDetailBean multiTransactionDetailBean3 = this.KWHzl;
        if (multiTransactionDetailBean3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            multiTransactionDetailBean2 = multiTransactionDetailBean3;
        }
        linearLayout2.setVisibility(i2 < multiTransactionDetailBean2.getOutputList().size() ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.yio$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C57460yio EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C57460yio c57460yio) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c57460yio;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AhwBna += this.EZpvd.OLrzqt;
                RecyclerView.Adapter adapter = this.EZpvd.EZpvd.AYXKKw.getAdapter();
                Intrinsics.copydefault(adapter, "");
                C43316rmw c43316rmw = (C43316rmw) adapter;
                MultiTransactionDetailBean multiTransactionDetailBean = this.EZpvd.KWHzl;
                MultiTransactionDetailBean multiTransactionDetailBean2 = null;
                if (multiTransactionDetailBean == null) {
                    Intrinsics.gEmmrt("");
                    multiTransactionDetailBean = null;
                }
                java.util.List<MultiTransactionDetailItem> inputList = multiTransactionDetailBean.getInputList();
                MultiTransactionDetailBean multiTransactionDetailBean3 = this.EZpvd.KWHzl;
                if (multiTransactionDetailBean3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    multiTransactionDetailBean2 = multiTransactionDetailBean3;
                }
                c43316rmw.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) inputList.subList(0, java.lang.Math.min(multiTransactionDetailBean2.getInputList().size(), this.EZpvd.AhwBna))));
                this.EZpvd.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.yio$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C57460yio KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C57460yio c57460yio) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c57460yio;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.KWHzl.EZpvd.EZpvd.getVisibility() == 0) {
                    this.KWHzl.OLrzqt();
                } else {
                    this.KWHzl.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yio$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C57460yio EZpvd;
        public final /* synthetic */ MultiTransactionDetailItem KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C57460yio c57460yio, MultiTransactionDetailItem multiTransactionDetailItem) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c57460yio;
            this.KWHzl = multiTransactionDetailItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                MultiTransactionDetailBean multiTransactionDetailBean = this.EZpvd.KWHzl;
                Function1 function1 = null;
                if (multiTransactionDetailBean == null) {
                    Intrinsics.gEmmrt("");
                    multiTransactionDetailBean = null;
                }
                int iIndexOf = multiTransactionDetailBean.getInputList().indexOf(this.KWHzl);
                if (iIndexOf != -1) {
                    MultiTransactionDetailBean multiTransactionDetailBean2 = this.EZpvd.KWHzl;
                    if (multiTransactionDetailBean2 == null) {
                        Intrinsics.gEmmrt("");
                        multiTransactionDetailBean2 = null;
                    }
                    if (multiTransactionDetailBean2.getInputList().size() > 1) {
                        Function1 function12 = this.EZpvd.copydefault;
                        if (function12 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            function1 = function12;
                        }
                        function1.invoke(java.lang.Integer.valueOf(iIndexOf));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yio$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C57460yio EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, int i, C57460yio c57460yio) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = i;
            this.EZpvd = c57460yio;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.OLrzqt != -1) {
                    MultiTransactionDetailBean multiTransactionDetailBean = this.EZpvd.KWHzl;
                    Function1 function1 = null;
                    if (multiTransactionDetailBean == null) {
                        Intrinsics.gEmmrt("");
                        multiTransactionDetailBean = null;
                    }
                    if (multiTransactionDetailBean.getOutputList().size() > 1) {
                        this.EZpvd.AEQbTJ.remove(java.lang.Integer.valueOf(this.OLrzqt));
                        Function1 function12 = this.EZpvd.copydefault;
                        if (function12 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            function1 = function12;
                        }
                        function1.invoke(java.lang.Integer.valueOf(this.OLrzqt));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yio$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C57460yio copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C57460yio c57460yio) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c57460yio;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.djBIcL += this.copydefault.OLrzqt;
                RecyclerView.Adapter adapter = this.copydefault.EZpvd.gEmmrt.getAdapter();
                Intrinsics.copydefault(adapter, "");
                C43316rmw c43316rmw = (C43316rmw) adapter;
                MultiTransactionDetailBean multiTransactionDetailBean = this.copydefault.KWHzl;
                MultiTransactionDetailBean multiTransactionDetailBean2 = null;
                if (multiTransactionDetailBean == null) {
                    Intrinsics.gEmmrt("");
                    multiTransactionDetailBean = null;
                }
                java.util.List<MultiTransactionDetailItem> outputList = multiTransactionDetailBean.getOutputList();
                MultiTransactionDetailBean multiTransactionDetailBean3 = this.copydefault.KWHzl;
                if (multiTransactionDetailBean3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    multiTransactionDetailBean2 = multiTransactionDetailBean3;
                }
                c43316rmw.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) outputList.subList(0, java.lang.Math.min(multiTransactionDetailBean2.getOutputList().size(), this.copydefault.djBIcL))));
                this.copydefault.EZpvd();
            }
        }
    }

    public final void EZpvd(C43312rms<AbstractC57415yhw> c43312rms, MultiTransactionDetailItem multiTransactionDetailItem) {
        AppCompatImageView appCompatImageView = ((AbstractC57415yhw) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        MultiTransactionDetailBean multiTransactionDetailBean = this.KWHzl;
        if (multiTransactionDetailBean == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean = null;
        }
        appCompatImageView.setVisibility(multiTransactionDetailBean.getInputList().size() > 1 ? 0 : 8);
        AppCompatImageView appCompatImageView2 = ((AbstractC57415yhw) c43312rms.OLrzqt()).EZpvd;
        appCompatImageView2.setOnClickListener(new Dialog(appCompatImageView2, 1000L, this, multiTransactionDetailItem));
        if (multiTransactionDetailItem.getWarningInfo().length() > 0) {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).copydefault.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setText(multiTransactionDetailItem.getWarningInfo());
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        } else {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).copydefault.setVisibility(8);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setVisibility(8);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setText(multiTransactionDetailItem.getLeftInfo());
        ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw.setText(multiTransactionDetailItem.getRightInfo());
    }

    public final void AEQbTJ(C43312rms<AbstractC57415yhw> c43312rms, MultiTransactionDetailItem multiTransactionDetailItem) {
        MultiTransactionDetailBean multiTransactionDetailBean = this.KWHzl;
        MultiTransactionDetailBean multiTransactionDetailBean2 = null;
        if (multiTransactionDetailBean == null) {
            Intrinsics.gEmmrt("");
            multiTransactionDetailBean = null;
        }
        int iIndexOf = multiTransactionDetailBean.getOutputList().indexOf(multiTransactionDetailItem);
        AppCompatImageView appCompatImageView = ((AbstractC57415yhw) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        MultiTransactionDetailBean multiTransactionDetailBean3 = this.KWHzl;
        if (multiTransactionDetailBean3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            multiTransactionDetailBean2 = multiTransactionDetailBean3;
        }
        appCompatImageView.setVisibility(multiTransactionDetailBean2.getOutputList().size() > 1 ? 0 : 8);
        AppCompatImageView appCompatImageView2 = ((AbstractC57415yhw) c43312rms.OLrzqt()).EZpvd;
        appCompatImageView2.setOnClickListener(new PendingIntent(appCompatImageView2, 1000L, iIndexOf, this));
        if (multiTransactionDetailItem.getWarningInfo().length() > 0) {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).copydefault.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setText(multiTransactionDetailItem.getWarningInfo());
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        } else {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).copydefault.setVisibility(8);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).djBIcL.setVisibility(8);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            AppCompatTextView appCompatTextView = ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw;
            int i = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C55366xib.KWHzl(i, context));
        }
        if (multiTransactionDetailItem.getComment().length() > 0) {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).valueOf.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).valueOf.setText(multiTransactionDetailItem.getCommentTitle());
            C57456yik c57456yik = ((AbstractC57415yhw) c43312rms.OLrzqt()).KWHzl;
            java.lang.String comment = multiTransactionDetailItem.getComment();
            java.lang.Boolean orDefault = this.AEQbTJ.getOrDefault(java.lang.Integer.valueOf(iIndexOf), java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(orDefault, "");
            c57456yik.setContent(comment, orDefault.booleanValue());
            ((AbstractC57415yhw) c43312rms.OLrzqt()).KWHzl.setExpandOrContractClickListener(new Fragment(iIndexOf));
        } else {
            ((AbstractC57415yhw) c43312rms.OLrzqt()).valueOf.setVisibility(8);
            ((AbstractC57415yhw) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
        }
        ((AbstractC57415yhw) c43312rms.OLrzqt()).AhwBna.setText(multiTransactionDetailItem.getLeftInfo());
        ((AbstractC57415yhw) c43312rms.OLrzqt()).AYXKKw.setText(multiTransactionDetailItem.getRightInfo());
    }

    /* JADX INFO: renamed from: o.yio$Fragment */
    public static final class Fragment implements C57456yik.StateListAnimator {
        public final /* synthetic */ int AEQbTJ;

        public Fragment(int i) {
            this.AEQbTJ = i;
        }

        @Override // o.C57456yik.StateListAnimator
        public void EZpvd(boolean z) {
            C57460yio.this.AEQbTJ.put(java.lang.Integer.valueOf(this.AEQbTJ), java.lang.Boolean.valueOf(z));
        }
    }
}
