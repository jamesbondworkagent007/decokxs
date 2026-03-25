package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import o.C57428yiI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57428yiI extends android.widget.LinearLayout {
    public final RecyclerView AEQbTJ;
    public final C57376yhJ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57428yiI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57428yiI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.yiI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57428yiI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57428yiI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57376yhJ c57376yhJCopydefault = C57376yhJ.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57376yhJCopydefault, "");
        this.OLrzqt = c57376yhJCopydefault;
        RecyclerView recyclerView = c57376yhJCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        this.AEQbTJ = recyclerView;
        EZpvd();
        AEQbTJ(attributeSet);
    }

    public final void EZpvd() {
        setOrientation(1);
        this.AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        this.AEQbTJ.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        this.AEQbTJ.setAdapter(new StateListAnimator(new java.util.ArrayList()));
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int iIndexOfChild;
        int iDpInt$default;
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && (iIndexOfChild = viewGroup.indexOfChild(this) - 1) >= 0) {
            android.view.View childAt = viewGroup.getChildAt(iIndexOfChild);
            if (((childAt instanceof C57428yiI) || (childAt instanceof C57466yiu)) && ((android.widget.LinearLayout) childAt).getPaddingBottom() > (iDpInt$default = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null))) {
                childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), iDpInt$default);
            }
        }
    }

    public final void AEQbTJ(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C57406yhn.Fragment.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.QKVWgx);
        java.lang.String str = string != null ? string : "";
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.ORxRYg);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.sSMYrx, false);
        setHeaderTitle(str);
        setHeaderIcon(z, drawable);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setViewDataBean(@NotNull final TransactionHeaderInfoBeanNew transactionHeaderInfoBeanNew) {
        Intrinsics.checkNotNullParameter(transactionHeaderInfoBeanNew, "");
        setHeaderTitle(transactionHeaderInfoBeanNew.getHeaderTitle());
        setHeaderIcon(transactionHeaderInfoBeanNew.isShowHeaderIcon(), transactionHeaderInfoBeanNew.getHeaderIcon());
        setHeaderIconAction(transactionHeaderInfoBeanNew.getHeaderIconCallback());
        final java.util.List<TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew> headerDataList = transactionHeaderInfoBeanNew.getHeaderDataList();
        if (headerDataList != null && headerDataList.size() > transactionHeaderInfoBeanNew.getAutoFoldCount()) {
            this.OLrzqt.KWHzl.setVisibility(0);
            android.widget.TextView textView = this.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, transactionHeaderInfoBeanNew.getUnfoldText());
            this.OLrzqt.EZpvd.setRotation(0.0f);
            RecyclerView.Adapter adapter = this.AEQbTJ.getAdapter();
            Intrinsics.copydefault(adapter, "");
            StateListAnimator stateListAnimator = (StateListAnimator) adapter;
            stateListAnimator.EZpvd(headerDataList.subList(0, transactionHeaderInfoBeanNew.getAutoFoldCount()));
            stateListAnimator.notifyDataSetChanged();
            this.OLrzqt.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.yiF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57428yiI.setViewDataBean$lambda$3(this.OLrzqt, transactionHeaderInfoBeanNew, headerDataList, view);
                }
            });
            return;
        }
        this.OLrzqt.KWHzl.setVisibility(8);
        RecyclerView.Adapter adapter2 = this.AEQbTJ.getAdapter();
        Intrinsics.copydefault(adapter2, "");
        StateListAnimator stateListAnimator2 = (StateListAnimator) adapter2;
        stateListAnimator2.EZpvd(headerDataList);
        stateListAnimator2.notifyDataSetChanged();
    }

    public static final void setViewDataBean$lambda$3(C57428yiI c57428yiI, TransactionHeaderInfoBeanNew transactionHeaderInfoBeanNew, java.util.List list, android.view.View view) {
        if (c57428yiI.OLrzqt.EZpvd.getRotation() == 0.0f) {
            c57428yiI.OLrzqt.EZpvd.setRotation(180.0f);
            android.widget.TextView textView = c57428yiI.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, transactionHeaderInfoBeanNew.getFoldText());
            RecyclerView.Adapter adapter = c57428yiI.AEQbTJ.getAdapter();
            Intrinsics.copydefault(adapter, "");
            StateListAnimator stateListAnimator = (StateListAnimator) adapter;
            stateListAnimator.EZpvd(list);
            stateListAnimator.notifyDataSetChanged();
            return;
        }
        c57428yiI.OLrzqt.EZpvd.setRotation(0.0f);
        android.widget.TextView textView2 = c57428yiI.OLrzqt.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C55307xhV.AEQbTJ(textView2, transactionHeaderInfoBeanNew.getUnfoldText());
        RecyclerView.Adapter adapter2 = c57428yiI.AEQbTJ.getAdapter();
        Intrinsics.copydefault(adapter2, "");
        StateListAnimator stateListAnimator2 = (StateListAnimator) adapter2;
        stateListAnimator2.EZpvd(list.subList(0, transactionHeaderInfoBeanNew.getAutoFoldCount()));
        stateListAnimator2.notifyDataSetChanged();
    }

    public final void setHeaderTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.OLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
        android.widget.LinearLayout linearLayout = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.widget.TextView textView2 = this.OLrzqt.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            marginLayoutParams.bottomMargin = textView2.getVisibility() == 8 ? 0 : C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            linearLayout.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
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

    /* JADX INFO: renamed from: o.yiI$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C57488yjP AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final android.widget.RelativeLayout EZpvd;
        public final android.content.Context KWHzl;
        public final android.widget.RelativeLayout OLrzqt;
        public final android.widget.ImageView copydefault;
        public final android.widget.ImageView djBIcL;

        /* JADX INFO: renamed from: o.yiI$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
                this.EZpvd = view;
                this.copydefault = j;
                this.AEQbTJ = headerSimpleDataBeanNew;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    ((android.widget.TextView) this.EZpvd).performHapticFeedback(1, 3);
                    Function0<Unit> subTitleClickCallback = this.AEQbTJ.getSubTitleClickCallback();
                    if (subTitleClickCallback != null) {
                        subTitleClickCallback.invoke();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.yiI$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = headerSimpleDataBeanNew;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function1<TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew, Unit> itemClickCallback = this.copydefault.getItemClickCallback();
                    if (itemClickCallback != null) {
                        itemClickCallback.invoke(this.copydefault);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view, @NotNull android.content.Context context) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = context;
            this.OLrzqt = (android.widget.RelativeLayout) view.findViewById(C57406yhn.StateListAnimator.isConnected);
            this.copydefault = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.QfsBiF);
            this.djBIcL = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.fFgQHt);
            this.EZpvd = (android.widget.RelativeLayout) view.findViewById(C57406yhn.StateListAnimator.isConnected);
            this.AEQbTJ = (C57488yjP) view.findViewById(C57406yhn.StateListAnimator.DAIeex);
            this.AYXKKw = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.QIZEnU);
        }

        public final void OLrzqt(@NotNull TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
            Intrinsics.checkNotNullParameter(headerSimpleDataBeanNew, "");
            if (headerSimpleDataBeanNew.getMainIconImgRes() != null || headerSimpleDataBeanNew.getMainDefaultIcon() != null) {
                this.EZpvd.setVisibility(0);
                android.widget.ImageView imageView = this.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                copydefault(imageView, headerSimpleDataBeanNew.getMainIconImgRes(), headerSimpleDataBeanNew.getMainDefaultIcon(), this.KWHzl, headerSimpleDataBeanNew.getMainIconRoundedRadius());
                if (headerSimpleDataBeanNew.getSubIconImgRes() != null || headerSimpleDataBeanNew.getSubDefaultIcon() != null) {
                    android.widget.ImageView imageView2 = this.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    copydefault(imageView2, headerSimpleDataBeanNew.getSubIconImgRes(), headerSimpleDataBeanNew.getSubDefaultIcon(), this.KWHzl, headerSimpleDataBeanNew.getSubIconRoundedRadius());
                }
            } else {
                this.EZpvd.setVisibility(8);
            }
            AEQbTJ(headerSimpleDataBeanNew);
            KWHzl(headerSimpleDataBeanNew);
            EZpvd(headerSimpleDataBeanNew);
            C57483yjK c57483yjKAEQbTJ = this.AEQbTJ.AEQbTJ();
            if (c57483yjKAEQbTJ != null) {
                if (headerSimpleDataBeanNew.getNumContent().length() > 0 || headerSimpleDataBeanNew.getUnitContent().length() > 0) {
                    c57483yjKAEQbTJ.setVisibility(0);
                    if (headerSimpleDataBeanNew.isUseDefaultNumUnitStyle()) {
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(headerSimpleDataBeanNew.getNumContent());
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder.length(), 17);
                        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(headerSimpleDataBeanNew.getUnitContent());
                        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 17);
                        Unit unit = Unit.INSTANCE;
                        c57483yjKAEQbTJ.setNumberAndUnitText(spannableStringBuilder, spannableStringBuilder2, true);
                    } else {
                        c57483yjKAEQbTJ.setNumberAndUnitText(headerSimpleDataBeanNew.getNumContent(), headerSimpleDataBeanNew.getUnitContent(), true);
                    }
                } else {
                    c57483yjKAEQbTJ.setVisibility(8);
                }
            }
            android.view.View view = this.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, headerSimpleDataBeanNew));
        }

        public final void KWHzl(final TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
            int showTagOrBtn = headerSimpleDataBeanNew.getShowTagOrBtn();
            if (showTagOrBtn == 1) {
                if (headerSimpleDataBeanNew.getTitleTagContent().length() > 0) {
                    C55251xgS c55251xgSCopydefault = this.AEQbTJ.copydefault();
                    if (c55251xgSCopydefault != null) {
                        c55251xgSCopydefault.setText(headerSimpleDataBeanNew.getTitleTagContent());
                    }
                    this.AEQbTJ.setOKTagOrButtonConstraint(1);
                    return;
                }
                this.AEQbTJ.setOKTagOrButtonConstraint(0);
                return;
            }
            if (showTagOrBtn == 2) {
                if (headerSimpleDataBeanNew.getTitleIconDrawable() != null) {
                    android.widget.ImageView imageViewKWHzl = this.AEQbTJ.KWHzl();
                    if (imageViewKWHzl != null) {
                        imageViewKWHzl.setImageDrawable(headerSimpleDataBeanNew.getTitleIconDrawable());
                    }
                    android.widget.ImageView imageViewKWHzl2 = this.AEQbTJ.KWHzl();
                    if (imageViewKWHzl2 != null) {
                        imageViewKWHzl2.setOnClickListener(new View.OnClickListener() { // from class: o.yiH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C57428yiI.Activity.KWHzl(headerSimpleDataBeanNew, view);
                            }
                        });
                    }
                    this.AEQbTJ.setOKTagOrButtonConstraint(2);
                    return;
                }
                android.widget.ImageView imageViewKWHzl3 = this.AEQbTJ.KWHzl();
                if (imageViewKWHzl3 != null) {
                    imageViewKWHzl3.setOnClickListener(null);
                }
                this.AEQbTJ.setOKTagOrButtonConstraint(0);
                return;
            }
            this.AEQbTJ.setOKTagOrButtonConstraint(0);
        }

        public static final void KWHzl(TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew, android.view.View view) {
            Function0<Unit> titleIconCallback = headerSimpleDataBeanNew.getTitleIconCallback();
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
        public final void EZpvd(TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
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
            C57488yjP c57488yjP3 = this.AEQbTJ;
            int iDp2px$default = C55298xhM.dp2px$default(48.0f, null, 1, null) + C55298xhM.dp2px$default(8.0f, null, 1, null) + C55298xhM.dp2px$default(4.0f, null, 1, null) + (((c57488yjP3 == null || (c55251xgSCopydefault5 = c57488yjP3.copydefault()) == null || c55251xgSCopydefault5.getVisibility() != 0) && ((c57488yjP = this.AEQbTJ) == null || (imageViewKWHzl = c57488yjP.KWHzl()) == null || imageViewKWHzl.getVisibility() != 0)) ? 0 : C55298xhM.dp2px$default(4.0f, null, 1, null));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            android.widget.RelativeLayout relativeLayout = this.EZpvd;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            if (relativeLayout.getVisibility() != 0) {
                measuredWidth = 0;
            } else {
                android.widget.RelativeLayout relativeLayout2 = this.EZpvd;
                if (relativeLayout2 != null) {
                    relativeLayout2.measure(iMakeMeasureSpec, 0);
                }
                android.widget.RelativeLayout relativeLayout3 = this.EZpvd;
                if (relativeLayout3 != null) {
                    measuredWidth = relativeLayout3.getMeasuredWidth();
                }
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(headerSimpleDataBeanNew.getNumContent());
            if (headerSimpleDataBeanNew.getUnitContent().length() > 0 && headerSimpleDataBeanNew.getNumContent().length() > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) " ").append(C57490yjR.AEQbTJ(headerSimpleDataBeanNew.getUnitContent(), 12));
            } else {
                spannableStringBuilder.append(C57490yjR.AEQbTJ(headerSimpleDataBeanNew.getUnitContent(), 12));
            }
            android.widget.TextView textView = new android.widget.TextView(this.KWHzl);
            textView.setTextSize(18.0f);
            float fMeasureText = textView.getPaint().measureText(spannableStringBuilder.toString());
            C57488yjP c57488yjP4 = this.AEQbTJ;
            float fMeasureText2 = (c57488yjP4 == null || (textViewEZpvd4 = c57488yjP4.EZpvd()) == null || (paint = textViewEZpvd4.getPaint()) == null) ? 0.0f : paint.measureText(headerSimpleDataBeanNew.getSubTitleContent().toString());
            C57488yjP c57488yjP5 = this.AEQbTJ;
            if (c57488yjP5 == null || (c55251xgSCopydefault2 = c57488yjP5.copydefault()) == null || c55251xgSCopydefault2.getVisibility() != 0) {
                measuredWidth2 = 0;
            } else {
                C57488yjP c57488yjP6 = this.AEQbTJ;
                if (c57488yjP6 != null && (c55251xgSCopydefault4 = c57488yjP6.copydefault()) != null) {
                    c55251xgSCopydefault4.measure(iMakeMeasureSpec, 0);
                }
                C57488yjP c57488yjP7 = this.AEQbTJ;
                if (c57488yjP7 != null && (c55251xgSCopydefault3 = c57488yjP7.copydefault()) != null) {
                    measuredWidth2 = c55251xgSCopydefault3.getMeasuredWidth();
                }
            }
            C57488yjP c57488yjP8 = this.AEQbTJ;
            if (c57488yjP8 == null || (imageViewKWHzl3 = c57488yjP8.KWHzl()) == null || imageViewKWHzl3.getVisibility() != 0) {
                measuredWidth3 = 0;
            } else {
                C57488yjP c57488yjP9 = this.AEQbTJ;
                if (c57488yjP9 != null && (imageViewKWHzl5 = c57488yjP9.KWHzl()) != null) {
                    imageViewKWHzl5.measure(iMakeMeasureSpec, 0);
                }
                C57488yjP c57488yjP10 = this.AEQbTJ;
                if (c57488yjP10 != null && (imageViewKWHzl4 = c57488yjP10.KWHzl()) != null) {
                    measuredWidth3 = imageViewKWHzl4.getMeasuredWidth();
                }
            }
            C57488yjP c57488yjP11 = this.AEQbTJ;
            if ((((c57488yjP11 == null || (c55251xgSCopydefault = c57488yjP11.copydefault()) == null || c55251xgSCopydefault.getVisibility() != 0) && ((c57488yjP2 = this.AEQbTJ) == null || (imageViewKWHzl2 = c57488yjP2.KWHzl()) == null || imageViewKWHzl2.getVisibility() != 0)) ? fMeasureText + fMeasureText2 : fMeasureText + measuredWidth2 + fMeasureText2 + measuredWidth3) >= (iAEQbTJ - iDp2px$default) - measuredWidth) {
                C57488yjP c57488yjP12 = this.AEQbTJ;
                if (c57488yjP12 != null && (textViewEZpvd3 = c57488yjP12.EZpvd()) != null) {
                    textViewEZpvd3.setVisibility(8);
                }
                C57488yjP c57488yjP13 = this.AEQbTJ;
                if (c57488yjP13 != null && (c57483yjKAEQbTJ2 = c57488yjP13.AEQbTJ()) != null) {
                    c57483yjKAEQbTJ2.setWidth((((iAEQbTJ - measuredWidth) - measuredWidth2) - measuredWidth3) - iDp2px$default);
                }
                android.widget.TextView textView2 = this.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                android.widget.TextView textView3 = this.AYXKKw;
                textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                Intrinsics.copydefault(textView3);
                C55307xhV.AEQbTJ(textView3, headerSimpleDataBeanNew.getSubTitleContent());
                if (headerSimpleDataBeanNew.getSubTitleClickCallback() != null) {
                    textView3.setOnClickListener(new Application(textView3, 1000L, headerSimpleDataBeanNew));
                    return;
                }
                return;
            }
            C57488yjP c57488yjP14 = this.AEQbTJ;
            if (c57488yjP14 != null && (c57483yjKAEQbTJ = c57488yjP14.AEQbTJ()) != null) {
                c57483yjKAEQbTJ.setWidth(((((iAEQbTJ - measuredWidth) - ((int) fMeasureText2)) - measuredWidth2) - measuredWidth3) - iDp2px$default);
            }
            C57488yjP c57488yjP15 = this.AEQbTJ;
            if (c57488yjP15 != null && (textViewEZpvd2 = c57488yjP15.EZpvd()) != null) {
                textViewEZpvd2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            C57488yjP c57488yjP16 = this.AEQbTJ;
            if (c57488yjP16 != null && (textViewEZpvd = c57488yjP16.EZpvd()) != null) {
                C55307xhV.AEQbTJ(textViewEZpvd, headerSimpleDataBeanNew.getSubTitleContent());
            }
            android.widget.TextView textView4 = this.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
        }

        public final void AEQbTJ(TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew headerSimpleDataBeanNew) {
            int iDpInt$default;
            ViewGroup.LayoutParams layoutParams = this.OLrzqt.getLayoutParams();
            if (headerSimpleDataBeanNew.getSubIconImgRes() == null && headerSimpleDataBeanNew.getSubDefaultIcon() == null) {
                iDpInt$default = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
            } else {
                iDpInt$default = C55298xhM.dpInt$default(36, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            layoutParams.width = iDpInt$default;
            layoutParams.height = iDpInt$default;
            this.OLrzqt.setLayoutParams(layoutParams);
        }

        public final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.Object obj, android.graphics.drawable.Drawable drawable, @NotNull android.content.Context context, int i) {
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

    /* JADX INFO: renamed from: o.yiI$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setHeaderIconAction$default(C57428yiI c57428yiI, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57428yiI.setHeaderIconAction(function0);
    }

    public final void setHeaderIconAction(Function0<Unit> function0) {
        android.widget.LinearLayout linearLayout = this.OLrzqt.OLrzqt;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.yiI$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.Adapter<Activity> {
        public final java.util.List<TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew> AEQbTJ;

        public StateListAnimator(@NotNull java.util.List<TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        public final void EZpvd(java.util.List<TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew> list) {
            this.AEQbTJ.clear();
            if (list != null) {
                this.AEQbTJ.addAll(list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.OLrzqt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return new Activity(viewInflate, context);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.OLrzqt(this.AEQbTJ.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }
    }
}
