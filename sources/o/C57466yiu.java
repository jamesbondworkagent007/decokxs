package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57466yiu extends android.widget.LinearLayout {
    public final RecyclerView AEQbTJ;
    public final C57371yhE EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57466yiu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57466yiu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.yiu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57466yiu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57466yiu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57371yhE c57371yhEAEQbTJ = C57371yhE.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57371yhEAEQbTJ, "");
        this.EZpvd = c57371yhEAEQbTJ;
        RecyclerView recyclerView = c57371yhEAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        this.AEQbTJ = recyclerView;
        setOrientation(1);
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new Activity(new java.util.ArrayList()));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0));
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

    public final void setViewDataBean(@NotNull final TransactionAssetInfoBean transactionAssetInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAssetInfoBean, "");
        if (transactionAssetInfoBean.getTitle().length() > 0) {
            this.EZpvd.AEQbTJ.setVisibility(0);
            android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                java.util.List<TransactionAssetInfoBean.AssetSimpleDataBean> assetDataList = transactionAssetInfoBean.getAssetDataList();
                marginLayoutParams.bottomMargin = (assetDataList == null || assetDataList.isEmpty()) ? 0 : C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
                linearLayout.setLayoutParams(marginLayoutParams);
                C55251xgS c55251xgS = this.EZpvd.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                C55307xhV.AEQbTJ(c55251xgS, transactionAssetInfoBean.getSubTitle());
                if (transactionAssetInfoBean.getTitleClickCallback() == null) {
                    this.EZpvd.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                    this.EZpvd.gEmmrt.setText(transactionAssetInfoBean.getTitle());
                    this.EZpvd.gEmmrt.setOnClickListener(null);
                } else {
                    this.EZpvd.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                    this.EZpvd.gEmmrt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    android.widget.TextView textView = this.EZpvd.gEmmrt;
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    C57494yjV c57494yjV = new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN), transactionAssetInfoBean.getTitle());
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((java.lang.CharSequence) transactionAssetInfoBean.getTitle());
                    spannableStringBuilder.setSpan(c57494yjV, length, spannableStringBuilder.length(), 17);
                    textView.setText(new android.text.SpannedString(spannableStringBuilder));
                    this.EZpvd.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.yiq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C57466yiu.setViewDataBean$lambda$3(transactionAssetInfoBean, view);
                        }
                    });
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            this.EZpvd.AEQbTJ.setVisibility(8);
        }
        final java.util.List<TransactionAssetInfoBean.AssetSimpleDataBean> assetDataList2 = transactionAssetInfoBean.getAssetDataList();
        if (assetDataList2 != null && assetDataList2.size() > transactionAssetInfoBean.getAutoFoldCount()) {
            this.AEQbTJ.setVisibility(0);
            RecyclerView.Adapter adapter = this.AEQbTJ.getAdapter();
            Intrinsics.copydefault(adapter, "");
            Activity activity = (Activity) adapter;
            activity.OLrzqt(assetDataList2.subList(0, transactionAssetInfoBean.getAutoFoldCount()));
            activity.notifyDataSetChanged();
            this.EZpvd.copydefault.setVisibility(0);
            this.EZpvd.AhwBna.setText(transactionAssetInfoBean.getUnfoldText());
            this.EZpvd.OLrzqt.setRotation(0.0f);
            this.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.yir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57466yiu.setViewDataBean$lambda$7(this.OLrzqt, transactionAssetInfoBean, assetDataList2, view);
                }
            });
            return;
        }
        if (assetDataList2 != null && (!assetDataList2.isEmpty())) {
            this.AEQbTJ.setVisibility(0);
            this.EZpvd.copydefault.setVisibility(8);
            RecyclerView.Adapter adapter2 = this.AEQbTJ.getAdapter();
            Intrinsics.copydefault(adapter2, "");
            Activity activity2 = (Activity) adapter2;
            activity2.OLrzqt(assetDataList2);
            activity2.notifyDataSetChanged();
            return;
        }
        this.AEQbTJ.setVisibility(8);
        this.EZpvd.copydefault.setVisibility(8);
    }

    public static final void setViewDataBean$lambda$3(TransactionAssetInfoBean transactionAssetInfoBean, android.view.View view) {
        Function0<Unit> titleClickCallback = transactionAssetInfoBean.getTitleClickCallback();
        if (titleClickCallback != null) {
            titleClickCallback.invoke();
        }
    }

    public static final void setViewDataBean$lambda$7(C57466yiu c57466yiu, TransactionAssetInfoBean transactionAssetInfoBean, java.util.List list, android.view.View view) {
        if (c57466yiu.EZpvd.OLrzqt.getRotation() == 0.0f) {
            c57466yiu.EZpvd.OLrzqt.setRotation(180.0f);
            c57466yiu.EZpvd.AhwBna.setText(transactionAssetInfoBean.getFoldText());
            RecyclerView.Adapter adapter = c57466yiu.AEQbTJ.getAdapter();
            Intrinsics.copydefault(adapter, "");
            Activity activity = (Activity) adapter;
            activity.OLrzqt(list);
            activity.notifyDataSetChanged();
            return;
        }
        c57466yiu.EZpvd.OLrzqt.setRotation(0.0f);
        c57466yiu.EZpvd.AhwBna.setText(transactionAssetInfoBean.getUnfoldText());
        RecyclerView.Adapter adapter2 = c57466yiu.AEQbTJ.getAdapter();
        Intrinsics.copydefault(adapter2, "");
        Activity activity2 = (Activity) adapter2;
        activity2.OLrzqt(list.subList(0, transactionAssetInfoBean.getAutoFoldCount()));
        activity2.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.yiu$Activity */
    public static final class Activity extends RecyclerView.Adapter<StateListAnimator> {
        public final java.util.List<TransactionAssetInfoBean.AssetSimpleDataBean> OLrzqt;

        public Activity(@NotNull java.util.List<TransactionAssetInfoBean.AssetSimpleDataBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        public final void OLrzqt(java.util.List<TransactionAssetInfoBean.AssetSimpleDataBean> list) {
            this.OLrzqt.clear();
            if (list != null) {
                this.OLrzqt.addAll(list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.AhwBna, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return new StateListAnimator(viewInflate, context);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.KWHzl(this.OLrzqt.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }
    }

    /* JADX INFO: renamed from: o.yiu$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.content.Context EZpvd;
        public final android.widget.TextView KWHzl;
        public final C57483yjK OLrzqt;
        public final android.widget.ImageView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view, @NotNull android.content.Context context) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = context;
            this.copydefault = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.RJOkX);
            this.OLrzqt = (C57483yjK) view.findViewById(C57406yhn.StateListAnimator.Ufzxmz);
            this.AEQbTJ = (android.widget.ImageView) view.findViewById(C57406yhn.StateListAnimator.QfsBiF);
            this.KWHzl = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.RKcVTr);
        }

        /* JADX INFO: renamed from: o.yiu$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ TransactionAssetInfoBean.AssetSimpleDataBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, TransactionAssetInfoBean.AssetSimpleDataBean assetSimpleDataBean) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.copydefault = assetSimpleDataBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Function0<Unit> titleIconCallback = this.copydefault.getTitleIconCallback();
                    if (titleIconCallback != null) {
                        titleIconCallback.invoke();
                    }
                }
            }
        }

        public final void KWHzl(@NotNull TransactionAssetInfoBean.AssetSimpleDataBean assetSimpleDataBean) {
            Intrinsics.checkNotNullParameter(assetSimpleDataBean, "");
            android.widget.ImageView imageView = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AEQbTJ(imageView, assetSimpleDataBean.getMainIconImgRes(), assetSimpleDataBean.getMainDefaultIcon(), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
            C57483yjK.setNumberAndUnitText$default(this.OLrzqt, assetSimpleDataBean.getNumContent(), assetSimpleDataBean.getUnitContent(), false, 4, null);
            if (assetSimpleDataBean.getTitleIconDrawable() != null) {
                this.AEQbTJ.setVisibility(0);
                this.AEQbTJ.setImageDrawable(assetSimpleDataBean.getTitleIconDrawable());
                if (assetSimpleDataBean.getTitleIconCallback() == null) {
                    this.AEQbTJ.setOnClickListener(null);
                } else {
                    android.widget.ImageView imageView2 = this.AEQbTJ;
                    imageView2.setOnClickListener(new Application(imageView2, 1000L, assetSimpleDataBean));
                }
            } else {
                this.AEQbTJ.setVisibility(8);
            }
            if (assetSimpleDataBean.getSubTitleContent().length() > 0) {
                this.KWHzl.setVisibility(0);
                this.KWHzl.setText(assetSimpleDataBean.getSubTitleContent());
            } else {
                this.KWHzl.setVisibility(8);
            }
        }

        private final C5448Sc EZpvd(java.lang.String str) {
            C5448Sc c5448Sc;
            C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
            Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
            C5448Sc c5448Sc2 = c5448ScCopydefault;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                    C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                    Intrinsics.copydefault(c5448ScAEQbTJ);
                    c5448Sc = c5448ScAEQbTJ;
                } else {
                    C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                    Intrinsics.copydefault(c5448ScCopydefault2);
                    c5448Sc = c5448ScCopydefault2;
                }
                return c5448Sc;
            }
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
        }

        public final void AEQbTJ(@NotNull android.widget.ImageView imageView, java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i) {
            Intrinsics.checkNotNullParameter(imageView, "");
            java.lang.Object obj2 = obj == null ? drawable : obj;
            if (obj2 != null) {
                imageView.setVisibility(0);
                if (!Intrinsics.EZpvd(imageView.getTag(), obj2)) {
                    if (obj instanceof java.lang.String) {
                        java.lang.String str = (java.lang.String) obj;
                        C5448Sc c5448ScEZpvd = EZpvd(str);
                        java.util.Locale locale = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String lowerCase = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                            str = "SVG:" + obj;
                        }
                        Glide.KWHzl(imageView).EZpvd(str).OLrzqt((RX<?>) c5448ScEZpvd).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).AEQbTJ(new C5405Ql(), new RoundedCornersTransformation(i, 0)).EZpvd(imageView);
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
}
