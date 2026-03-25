package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import o.C57422yiC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57422yiC extends android.widget.LinearLayout {
    public final RecyclerView EZpvd;
    public final C57377yhK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57422yiC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57422yiC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:56) call: o.yiC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57422yiC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57422yiC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57377yhK c57377yhKOLrzqt = C57377yhK.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57377yhKOLrzqt, "");
        this.OLrzqt = c57377yhKOLrzqt;
        RecyclerView recyclerView = c57377yhKOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        this.EZpvd = recyclerView;
        AEQbTJ();
        KWHzl(attributeSet);
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.ImageView KWHzl() {
        android.widget.ImageView imageView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final void AEQbTJ() {
        setOrientation(1);
        this.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        this.EZpvd.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        this.EZpvd.setAdapter(new StateListAnimator(new java.util.ArrayList()));
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void KWHzl(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C57406yhn.Fragment.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.QKVWgx);
        if (string == null) {
            string = "";
        }
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.ORxRYg);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.sSMYrx, false);
        setHeaderTitle(string, "", null);
        setHeaderIcon(z, drawable);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setViewDataBean(@NotNull TransactionHeaderInfoBean transactionHeaderInfoBean) {
        Intrinsics.checkNotNullParameter(transactionHeaderInfoBean, "");
        setHeaderTitle(transactionHeaderInfoBean.getHeaderTitle(), transactionHeaderInfoBean.getSubTitle(), transactionHeaderInfoBean.getTitleClickCallback());
        setHeaderIcon(transactionHeaderInfoBean.isShowHeaderIcon(), transactionHeaderInfoBean.getHeaderIcon());
        setHeaderIconAction(transactionHeaderInfoBean.getHeaderIconCallback());
        RecyclerView.Adapter adapter = this.EZpvd.getAdapter();
        Intrinsics.copydefault(adapter, "");
        StateListAnimator stateListAnimator = (StateListAnimator) adapter;
        stateListAnimator.OLrzqt(transactionHeaderInfoBean.getHeaderDataList());
        stateListAnimator.notifyDataSetChanged();
    }

    public final void setHeaderTitle(@NotNull java.lang.String str, @NotNull java.lang.String str2, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() > 0) {
            this.OLrzqt.AEQbTJ.setVisibility(0);
            C55251xgS c55251xgS = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            C55307xhV.AEQbTJ(c55251xgS, str2);
            if (function0 == null) {
                this.OLrzqt.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                this.OLrzqt.AhwBna.setText(str);
                this.OLrzqt.AhwBna.setOnClickListener(null);
                return;
            }
            this.OLrzqt.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            this.OLrzqt.AhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.widget.TextView textView = this.OLrzqt.AhwBna;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            C57494yjV c57494yjV = new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN), str);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(c57494yjV, length, spannableStringBuilder.length(), 17);
            textView.setText(new android.text.SpannedString(spannableStringBuilder));
            this.OLrzqt.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.yiA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
            return;
        }
        this.OLrzqt.AEQbTJ.setVisibility(8);
    }

    public final void setHeaderIcon(boolean z, android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.OLrzqt.copydefault;
        Intrinsics.copydefault(imageView);
        imageView.setVisibility(z ? 0 : 8);
        if (drawable == null) {
            drawable = C57491yjS.OLrzqt.copydefault(imageView.getContext(), C57406yhn.Activity.dNCPSb, C52761wXj.Activity.aappFQ);
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setHeaderIconAction$default(C57422yiC c57422yiC, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57422yiC.setHeaderIconAction(function0);
    }

    public final void setHeaderIconAction(Function0<Unit> function0) {
        android.widget.LinearLayout linearLayout = this.OLrzqt.AEQbTJ;
        linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.yiC$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator extends RecyclerView.Adapter<Activity> {
        public final java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> KWHzl;

        public StateListAnimator(@NotNull java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }

        public final void OLrzqt(java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> list) {
            this.KWHzl.clear();
            if (list != null) {
                this.KWHzl.addAll(list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (i == 0) {
                android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.OLrzqt, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                android.content.Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return new Application(viewInflate, context);
            }
            if (i == 1) {
                android.view.View viewInflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.EZpvd, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
                android.content.Context context2 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                return new ActionBar(viewInflate2, context2);
            }
            android.view.View viewInflate3 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.OLrzqt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "");
            android.content.Context context3 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            return new Application(viewInflate3, context3);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.KWHzl(this.KWHzl.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.KWHzl.get(i).getViewType();
        }
    }

    /* JADX INFO: renamed from: o.yiC$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends Activity {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.ImageView KWHzl;
        public final android.content.Context copydefault;

        /* JADX INFO: renamed from: o.yiC$ActionBar$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ TransactionHeaderInfoBean.HeaderSimpleDataBean AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ ActionBar OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, ActionBar actionBar, TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
                this.EZpvd = view;
                this.copydefault = j;
                this.OLrzqt = actionBar;
                this.AEQbTJ = headerSimpleDataBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.KWHzl.setRotation(180.0f);
                    Function0<Unit> moreClickCallback = this.AEQbTJ.getMoreClickCallback();
                    if (moreClickCallback != null) {
                        moreClickCallback.invoke();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view, @NotNull android.content.Context context) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.copydefault = context;
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.aUsmxb);
            this.KWHzl = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.AxsJAY);
        }

        @Override // o.C57422yiC.Activity
        public void KWHzl(@NotNull TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            Intrinsics.checkNotNullParameter(headerSimpleDataBean, "");
            android.widget.TextView textView = this.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, headerSimpleDataBean.getArrowText());
            this.KWHzl.setRotation(headerSimpleDataBean.getArrowAngle());
            android.view.View view = this.itemView;
            if (view != null) {
                view.setOnClickListener(new TaskDescription(view, 1000L, this, headerSimpleDataBean));
            }
        }
    }

    /* JADX INFO: renamed from: o.yiC$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application extends Activity {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.ImageView AYXKKw;
        public final android.widget.TextView AhwBna;
        public final android.widget.RelativeLayout EZpvd;
        public final android.content.Context KWHzl;
        public final C57488yjP OLrzqt;
        public final android.widget.RelativeLayout copydefault;

        /* JADX INFO: renamed from: o.yiC$Application$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ TransactionHeaderInfoBean.HeaderSimpleDataBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.copydefault = headerSimpleDataBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    ((android.widget.TextView) this.AEQbTJ).performHapticFeedback(1, 3);
                    Function0<Unit> subTitleClickCallback = this.copydefault.getSubTitleClickCallback();
                    if (subTitleClickCallback != null) {
                        subTitleClickCallback.invoke();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.yiC$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ TransactionHeaderInfoBean.HeaderSimpleDataBean AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
                this.copydefault = view;
                this.EZpvd = j;
                this.AEQbTJ = headerSimpleDataBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Function1<TransactionHeaderInfoBean.HeaderSimpleDataBean, Unit> itemClickCallback = this.AEQbTJ.getItemClickCallback();
                    if (itemClickCallback != null) {
                        itemClickCallback.invoke(this.AEQbTJ);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view, @NotNull android.content.Context context) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = context;
            this.EZpvd = (android.widget.RelativeLayout) view.findViewById(C57406yhn.StateListAnimator.isConnected);
            this.AEQbTJ = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.QfsBiF);
            this.AYXKKw = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.fFgQHt);
            this.copydefault = (android.widget.RelativeLayout) view.findViewById(C57406yhn.StateListAnimator.isConnected);
            this.OLrzqt = (C57488yjP) view.findViewById(C57406yhn.StateListAnimator.DAIeex);
            this.AhwBna = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.QIZEnU);
        }

        @Override // o.C57422yiC.Activity
        public void KWHzl(@NotNull TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            Intrinsics.checkNotNullParameter(headerSimpleDataBean, "");
            if (headerSimpleDataBean.getMainIconImgRes() != null || headerSimpleDataBean.getMainDefaultIcon() != null) {
                this.copydefault.setVisibility(0);
                android.widget.ImageView imageView = this.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                KWHzl(imageView, headerSimpleDataBean.getMainIconImgRes(), headerSimpleDataBean.getMainDefaultIcon(), this.KWHzl, headerSimpleDataBean.getMainIconRoundedRadius());
                if (headerSimpleDataBean.getSubIconImgRes() != null || headerSimpleDataBean.getSubDefaultIcon() != null) {
                    android.widget.ImageView imageView2 = this.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    KWHzl(imageView2, headerSimpleDataBean.getSubIconImgRes(), headerSimpleDataBean.getSubDefaultIcon(), this.KWHzl, headerSimpleDataBean.getSubIconRoundedRadius());
                }
            } else {
                this.copydefault.setVisibility(8);
            }
            AEQbTJ(headerSimpleDataBean);
            EZpvd(headerSimpleDataBean);
            copydefault(headerSimpleDataBean);
            C57483yjK c57483yjKAEQbTJ = this.OLrzqt.AEQbTJ();
            if (c57483yjKAEQbTJ != null) {
                if (headerSimpleDataBean.getNumContent().length() > 0 || headerSimpleDataBean.getUnitContent().length() > 0) {
                    c57483yjKAEQbTJ.setVisibility(0);
                    if (headerSimpleDataBean.isUseDefaultNumUnitStyle()) {
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(headerSimpleDataBean.getNumContent());
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder.length(), 17);
                        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(headerSimpleDataBean.getUnitContent());
                        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 17);
                        Unit unit = Unit.INSTANCE;
                        c57483yjKAEQbTJ.setNumberAndUnitText(spannableStringBuilder, spannableStringBuilder2, true);
                    } else {
                        c57483yjKAEQbTJ.setNumberAndUnitText(headerSimpleDataBean.getNumContent(), headerSimpleDataBean.getUnitContent(), true);
                    }
                } else {
                    c57483yjKAEQbTJ.setVisibility(8);
                }
            }
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, headerSimpleDataBean));
        }

        public final void EZpvd(final TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            int showTagOrBtn = headerSimpleDataBean.getShowTagOrBtn();
            if (showTagOrBtn == 1) {
                if (headerSimpleDataBean.getTitleTagContent().length() > 0) {
                    C55251xgS c55251xgSCopydefault = this.OLrzqt.copydefault();
                    if (c55251xgSCopydefault != null) {
                        c55251xgSCopydefault.setText(headerSimpleDataBean.getTitleTagContent());
                    }
                    this.OLrzqt.setOKTagOrButtonConstraint(1);
                    return;
                }
                this.OLrzqt.setOKTagOrButtonConstraint(0);
                return;
            }
            if (showTagOrBtn == 2) {
                if (headerSimpleDataBean.getTitleIconDrawable() != null) {
                    android.widget.ImageView imageViewKWHzl = this.OLrzqt.KWHzl();
                    if (imageViewKWHzl != null) {
                        imageViewKWHzl.setImageDrawable(headerSimpleDataBean.getTitleIconDrawable());
                    }
                    android.widget.ImageView imageViewKWHzl2 = this.OLrzqt.KWHzl();
                    if (imageViewKWHzl2 != null) {
                        imageViewKWHzl2.setOnClickListener(new View.OnClickListener() { // from class: o.yiB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C57422yiC.Application.EZpvd(headerSimpleDataBean, view);
                            }
                        });
                    }
                    this.OLrzqt.setOKTagOrButtonConstraint(2);
                    return;
                }
                android.widget.ImageView imageViewKWHzl3 = this.OLrzqt.KWHzl();
                if (imageViewKWHzl3 != null) {
                    imageViewKWHzl3.setOnClickListener(null);
                }
                this.OLrzqt.setOKTagOrButtonConstraint(0);
                return;
            }
            this.OLrzqt.setOKTagOrButtonConstraint(0);
        }

        public static final void EZpvd(TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean, android.view.View view) {
            Function0<Unit> titleIconCallback = headerSimpleDataBean.getTitleIconCallback();
            if (titleIconCallback != null) {
                titleIconCallback.invoke();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void copydefault(TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            C57488yjP c57488yjP;
            android.widget.ImageView imageViewKWHzl;
            int measuredWidth;
            int measuredWidth2;
            int measuredWidth3;
            C57488yjP c57488yjP2;
            android.widget.ImageView imageViewKWHzl2;
            android.widget.TextView textViewEZpvd;
            android.widget.TextView textViewEZpvd2;
            C57483yjK c57483yjKAEQbTJ;
            C57483yjK c57483yjKAEQbTJ2;
            android.widget.TextView textViewEZpvd3;
            C55251xgS c55251xgSCopydefault;
            android.widget.ImageView imageViewKWHzl3;
            android.widget.ImageView imageViewKWHzl4;
            android.widget.ImageView imageViewKWHzl5;
            C55251xgS c55251xgSCopydefault2;
            C55251xgS c55251xgSCopydefault3;
            C55251xgS c55251xgSCopydefault4;
            android.widget.TextView textViewEZpvd4;
            android.text.TextPaint paint;
            C55251xgS c55251xgSCopydefault5;
            int iAEQbTJ = C33570myu.AEQbTJ();
            C57488yjP c57488yjP3 = this.OLrzqt;
            int iDp2px$default = C55298xhM.dp2px$default(48.0f, null, 1, null) + C55298xhM.dp2px$default(8.0f, null, 1, null) + C55298xhM.dp2px$default(4.0f, null, 1, null) + (((c57488yjP3 == null || (c55251xgSCopydefault5 = c57488yjP3.copydefault()) == null || c55251xgSCopydefault5.getVisibility() != 0) && ((c57488yjP = this.OLrzqt) == null || (imageViewKWHzl = c57488yjP.KWHzl()) == null || imageViewKWHzl.getVisibility() != 0)) ? 0 : C55298xhM.dp2px$default(4.0f, null, 1, null));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            android.widget.RelativeLayout relativeLayout = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            if (relativeLayout.getVisibility() != 0) {
                measuredWidth = 0;
            } else {
                android.widget.RelativeLayout relativeLayout2 = this.copydefault;
                if (relativeLayout2 != null) {
                    relativeLayout2.measure(iMakeMeasureSpec, 0);
                }
                android.widget.RelativeLayout relativeLayout3 = this.copydefault;
                if (relativeLayout3 != null) {
                    measuredWidth = relativeLayout3.getMeasuredWidth();
                }
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(headerSimpleDataBean.getNumContent());
            if (headerSimpleDataBean.getUnitContent().length() > 0 && headerSimpleDataBean.getNumContent().length() > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) " ").append(C57490yjR.AEQbTJ(headerSimpleDataBean.getUnitContent(), 12));
            } else {
                spannableStringBuilder.append(C57490yjR.AEQbTJ(headerSimpleDataBean.getUnitContent(), 12));
            }
            android.widget.TextView textView = new android.widget.TextView(this.KWHzl);
            textView.setTextSize(18.0f);
            float fMeasureText = textView.getPaint().measureText(spannableStringBuilder.toString());
            C57488yjP c57488yjP4 = this.OLrzqt;
            float fMeasureText2 = (c57488yjP4 == null || (textViewEZpvd4 = c57488yjP4.EZpvd()) == null || (paint = textViewEZpvd4.getPaint()) == null) ? 0.0f : paint.measureText(headerSimpleDataBean.getSubTitleContent().toString());
            C57488yjP c57488yjP5 = this.OLrzqt;
            if (c57488yjP5 == null || (c55251xgSCopydefault2 = c57488yjP5.copydefault()) == null || c55251xgSCopydefault2.getVisibility() != 0) {
                measuredWidth2 = 0;
            } else {
                C57488yjP c57488yjP6 = this.OLrzqt;
                if (c57488yjP6 != null && (c55251xgSCopydefault4 = c57488yjP6.copydefault()) != null) {
                    c55251xgSCopydefault4.measure(iMakeMeasureSpec, 0);
                }
                C57488yjP c57488yjP7 = this.OLrzqt;
                if (c57488yjP7 != null && (c55251xgSCopydefault3 = c57488yjP7.copydefault()) != null) {
                    measuredWidth2 = c55251xgSCopydefault3.getMeasuredWidth();
                }
            }
            C57488yjP c57488yjP8 = this.OLrzqt;
            if (c57488yjP8 == null || (imageViewKWHzl3 = c57488yjP8.KWHzl()) == null || imageViewKWHzl3.getVisibility() != 0) {
                measuredWidth3 = 0;
            } else {
                C57488yjP c57488yjP9 = this.OLrzqt;
                if (c57488yjP9 != null && (imageViewKWHzl5 = c57488yjP9.KWHzl()) != null) {
                    imageViewKWHzl5.measure(iMakeMeasureSpec, 0);
                }
                C57488yjP c57488yjP10 = this.OLrzqt;
                if (c57488yjP10 != null && (imageViewKWHzl4 = c57488yjP10.KWHzl()) != null) {
                    measuredWidth3 = imageViewKWHzl4.getMeasuredWidth();
                }
            }
            C57488yjP c57488yjP11 = this.OLrzqt;
            if ((((c57488yjP11 == null || (c55251xgSCopydefault = c57488yjP11.copydefault()) == null || c55251xgSCopydefault.getVisibility() != 0) && ((c57488yjP2 = this.OLrzqt) == null || (imageViewKWHzl2 = c57488yjP2.KWHzl()) == null || imageViewKWHzl2.getVisibility() != 0)) ? fMeasureText + fMeasureText2 : fMeasureText + measuredWidth2 + fMeasureText2 + measuredWidth3) >= (iAEQbTJ - iDp2px$default) - measuredWidth) {
                C57488yjP c57488yjP12 = this.OLrzqt;
                if (c57488yjP12 != null && (textViewEZpvd3 = c57488yjP12.EZpvd()) != null) {
                    textViewEZpvd3.setVisibility(8);
                }
                C57488yjP c57488yjP13 = this.OLrzqt;
                if (c57488yjP13 != null && (c57483yjKAEQbTJ2 = c57488yjP13.AEQbTJ()) != null) {
                    c57483yjKAEQbTJ2.setWidth((((iAEQbTJ - measuredWidth) - measuredWidth2) - measuredWidth3) - iDp2px$default);
                }
                android.widget.TextView textView2 = this.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                android.widget.TextView textView3 = this.AhwBna;
                textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                Intrinsics.copydefault(textView3);
                C55307xhV.AEQbTJ(textView3, headerSimpleDataBean.getSubTitleContent());
                if (headerSimpleDataBean.getSubTitleClickCallback() != null) {
                    textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, headerSimpleDataBean));
                    return;
                }
                return;
            }
            C57488yjP c57488yjP14 = this.OLrzqt;
            if (c57488yjP14 != null && (c57483yjKAEQbTJ = c57488yjP14.AEQbTJ()) != null) {
                c57483yjKAEQbTJ.setWidth(((((iAEQbTJ - measuredWidth) - ((int) fMeasureText2)) - measuredWidth2) - measuredWidth3) - iDp2px$default);
            }
            C57488yjP c57488yjP15 = this.OLrzqt;
            if (c57488yjP15 != null && (textViewEZpvd2 = c57488yjP15.EZpvd()) != null) {
                textViewEZpvd2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            C57488yjP c57488yjP16 = this.OLrzqt;
            if (c57488yjP16 != null && (textViewEZpvd = c57488yjP16.EZpvd()) != null) {
                C55307xhV.AEQbTJ(textViewEZpvd, headerSimpleDataBean.getSubTitleContent());
            }
            android.widget.TextView textView4 = this.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
        }

        public final void AEQbTJ(TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            int iDpInt$default;
            ViewGroup.LayoutParams layoutParams = this.EZpvd.getLayoutParams();
            if (headerSimpleDataBean.getSubIconImgRes() == null && headerSimpleDataBean.getSubDefaultIcon() == null) {
                iDpInt$default = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
            } else {
                iDpInt$default = C55298xhM.dpInt$default(36, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            layoutParams.width = iDpInt$default;
            layoutParams.height = iDpInt$default;
            this.EZpvd.setLayoutParams(layoutParams);
        }

        public final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.Object obj, android.graphics.drawable.Drawable drawable, @NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.Object obj2 = obj == null ? drawable : obj;
            if (obj2 != null) {
                imageView.setVisibility(0);
                if (!Intrinsics.EZpvd(imageView.getTag(), obj2)) {
                    if (obj instanceof java.lang.String) {
                        java.lang.String str = (java.lang.String) obj;
                        C5448Sc c5448ScOLrzqt = C57491yjS.OLrzqt.OLrzqt(str);
                        java.util.Locale locale = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String lowerCase = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                            str = "SVG:" + obj;
                        }
                        Glide.KWHzl(imageView).EZpvd(str).OLrzqt((RX<?>) c5448ScOLrzqt).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).AEQbTJ(new C5405Ql(), new RoundedCornersTransformation(i, 0)).EZpvd(imageView);
                    } else {
                        Glide.KWHzl(imageView).KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).AEQbTJ(new C5405Ql(), new RoundedCornersTransformation(i, 0)).EZpvd(imageView);
                    }
                }
            } else {
                imageView.setVisibility(8);
            }
            imageView.setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: o.yiC$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final java.util.ArrayList<android.widget.TextView> OLrzqt() {
        java.util.ArrayList<android.widget.TextView> arrayList = new java.util.ArrayList<>();
        RecyclerView.Adapter adapter = this.EZpvd.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.LayoutManager layoutManager = this.EZpvd.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            android.view.View childAt = ((LinearLayoutManager) layoutManager).getChildAt(i);
            C57488yjP c57488yjP = childAt != null ? (C57488yjP) childAt.findViewById(C57406yhn.StateListAnimator.DAIeex) : null;
            android.widget.TextView textView = childAt != null ? (android.widget.TextView) childAt.findViewById(C57406yhn.StateListAnimator.QIZEnU) : null;
            C57483yjK c57483yjK = c57488yjP != null ? (C57483yjK) c57488yjP.findViewById(C57406yhn.StateListAnimator.DGOPHZDGOPHZ) : null;
            if (c57483yjK != null) {
                arrayList.add(c57483yjK);
            }
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.yiC$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static class Activity extends RecyclerView.ViewHolder {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(@NotNull TransactionHeaderInfoBean.HeaderSimpleDataBean headerSimpleDataBean) {
            Intrinsics.checkNotNullParameter(headerSimpleDataBean, "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }
}
