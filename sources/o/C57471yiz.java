package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57471yiz extends ConstraintLayout {
    public final C57374yhH KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57471yiz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57471yiz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.yiz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57471yiz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57471yiz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57374yhH c57374yhHEZpvd = C57374yhH.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57374yhHEZpvd, "");
        this.KWHzl = c57374yhHEZpvd;
        OLrzqt();
        AEQbTJ(attributeSet);
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    private final void OLrzqt() {
        setPadding(C57410yhr.AEQbTJ(), C57410yhr.copydefault(), C57410yhr.KWHzl(), C57410yhr.EZpvd());
    }

    public final void AEQbTJ(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C57406yhn.Fragment.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.zLjUOn);
        if (string == null) {
            string = "";
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.AuCTelauCTel, false);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.getNewProxyInstance);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String string3 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.AubY);
        java.lang.String str = string3 != null ? string3 : "";
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.uzCIH);
        android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.hDKMBd);
        android.graphics.drawable.Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.getFieldNames);
        android.graphics.drawable.Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.iwGUEr);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.zsXlph, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.wlaJM, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C57406yhn.Fragment.fIwbmz, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C57406yhn.Fragment.AuCTel, 0.0f);
        setHeaderTitleInfo(string);
        setHeaderTitleUnderLineVisibility(z, null);
        setContentInfo(string2);
        setTagInfo(str);
        setHeaderIcon(drawable);
        setMainIcon(drawable2, drawable3);
        setActionIcon(drawable4);
        setActionIconVisibility(z2);
        setArrowIconVisibility(z3);
        if (dimension != 0.0f && dimension2 != 0.0f) {
            setActionIconSize(dimension, dimension2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setViewDataBean(@NotNull TransactionGeneralInfoBean transactionGeneralInfoBean) {
        Intrinsics.checkNotNullParameter(transactionGeneralInfoBean, "");
        setHeaderTitleInfo(transactionGeneralInfoBean.getHeaderTitle());
        setHeaderTitleUnderLineVisibility(transactionGeneralInfoBean.getShowHeaderTitleUnderLine(), transactionGeneralInfoBean.getHeaderTitleUnderLineClick());
        setHeaderIcon(transactionGeneralInfoBean.getHeaderIconRes());
        setHeaderIconAction(transactionGeneralInfoBean.getHeaderIconCallback());
        setMainIcon(transactionGeneralInfoBean.getContentIconRes(), transactionGeneralInfoBean.getContentIconDefaultRes());
        setContentInfo(transactionGeneralInfoBean.getGeneralContentInfo());
        copydefault(transactionGeneralInfoBean.getTagUIStyle());
        AEQbTJ(transactionGeneralInfoBean.getGeneralContentCallback());
        setTagInfo(transactionGeneralInfoBean.getTagInfo());
        setActionIcon(transactionGeneralInfoBean.getActionIconRes());
        setActionIconAction(transactionGeneralInfoBean.getActionIconCallback());
        if (transactionGeneralInfoBean.getActionIconSize() != 0.0f) {
            setActionIconSize(transactionGeneralInfoBean.getActionIconSize(), transactionGeneralInfoBean.getActionIconSize());
        }
        setEndActionIcon(transactionGeneralInfoBean.getEndActionIconRes());
        setEndActionIconAction(transactionGeneralInfoBean.getEndActionIconCallback());
        if (transactionGeneralInfoBean.getEndActionIconSize() != 0.0f) {
            setEndActionIconSize(transactionGeneralInfoBean.getEndActionIconSize(), transactionGeneralInfoBean.getEndActionIconSize());
        }
        setArrowIconVisibility(transactionGeneralInfoBean.isShowArrowIcon());
        setArrowIconCallback(transactionGeneralInfoBean.getArrowCallback());
    }

    private final void AEQbTJ(Function0<Unit> function0) {
        android.widget.TextView textView = this.KWHzl.valueOf;
        textView.setOnClickListener(new Activity(textView, 1000L, function0));
    }

    public final void setHeaderTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.KWHzl.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setHeaderTitleUnderLineVisibility(boolean z, final Function0<Unit> function0) {
        if (z) {
            this.KWHzl.EZpvd.setVisibility(0);
            this.KWHzl.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.yix
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57471yiz.setHeaderTitleUnderLineVisibility$lambda$1(function0, view);
                }
            });
        } else {
            this.KWHzl.EZpvd.setVisibility(8);
            this.KWHzl.fetchVPNInfo.setOnClickListener(null);
        }
    }

    public static final void setHeaderTitleUnderLineVisibility$lambda$1(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setContentInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.widget.TextView textView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public final void setTagInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55251xgS c55251xgS = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, str);
    }

    private final void copydefault(TransactionGeneralInfoBean.TagUIStyle tagUIStyle) {
        java.lang.Integer tagPaint;
        java.lang.Integer tagType;
        java.lang.Integer tagSize;
        java.lang.Integer tagStyle;
        C55251xgS c55251xgS = this.KWHzl.AkhnZx;
        c55251xgS.setOKDSStyle((tagUIStyle == null || (tagStyle = tagUIStyle.getTagStyle()) == null) ? 0 : tagStyle.intValue());
        c55251xgS.setOKDSSize((tagUIStyle == null || (tagSize = tagUIStyle.getTagSize()) == null) ? -3 : tagSize.intValue());
        c55251xgS.setTagType((tagUIStyle == null || (tagType = tagUIStyle.getTagType()) == null) ? -1 : tagType.intValue());
        c55251xgS.setTagPaint((tagUIStyle == null || (tagPaint = tagUIStyle.getTagPaint()) == null) ? 0 : tagPaint.intValue());
        c55251xgS.setShowIcon(tagUIStyle != null ? tagUIStyle.getShowIcon() : false);
    }

    /* JADX INFO: renamed from: o.yiz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yiz$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yiz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yiz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            android.widget.ImageView imageView = this.KWHzl.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            this.KWHzl.AhwBna.setImageDrawable(drawable);
            return;
        }
        android.widget.ImageView imageView2 = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public final void setMainIcon(java.lang.Object obj, android.graphics.drawable.Drawable drawable) {
        if (obj != null) {
            android.widget.ImageView imageView = this.KWHzl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            Intrinsics.copydefault(Glide.KWHzl(this.KWHzl.djBIcL).KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).EZpvd(this.KWHzl.djBIcL));
            return;
        }
        android.widget.ImageView imageView2 = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public final void setActionIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            setActionIconVisibility(true);
            this.KWHzl.AEQbTJ.setImageDrawable(drawable);
        } else {
            setActionIconVisibility(false);
        }
    }

    public final void setEndActionIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.KWHzl.gEmmrt.setVisibility(0);
            this.KWHzl.KWHzl.setImageDrawable(drawable);
        } else {
            this.KWHzl.gEmmrt.setVisibility(8);
        }
    }

    public static /* synthetic */ void setActionIconSize$default(C57471yiz c57471yiz, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 18.0f;
        }
        if ((i & 2) != 0) {
            f2 = 18.0f;
        }
        c57471yiz.setActionIconSize(f, f2);
    }

    public final void setActionIconSize(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        layoutParams.width = C55298xhM.dp2px$default(f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(f2, null, 1, null);
        this.KWHzl.AEQbTJ.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setHeaderIconAction$default(C57471yiz c57471yiz, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57471yiz.setHeaderIconAction(function0);
    }

    public final void setHeaderIconAction(Function0<Unit> function0) {
        android.widget.ImageView imageView = this.KWHzl.AhwBna;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setActionIconAction$default(C57471yiz c57471yiz, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57471yiz.setActionIconAction(function0);
    }

    public final void setActionIconAction(Function0<Unit> function0) {
        android.widget.ImageView imageView = this.KWHzl.AEQbTJ;
        C57498yjZ c57498yjZ = C57498yjZ.EZpvd;
        Intrinsics.copydefault(imageView);
        c57498yjZ.KWHzl(imageView, 8, 8, 8, 8);
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setEndActionIconAction$default(C57471yiz c57471yiz, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57471yiz.setEndActionIconAction(function0);
    }

    public final void setEndActionIconAction(Function0<Unit> function0) {
        android.widget.LinearLayout linearLayout = this.KWHzl.gEmmrt;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, function0));
    }

    public static /* synthetic */ void setHeaderIconVisibility$default(C57471yiz c57471yiz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57471yiz.setHeaderIconVisibility(z);
    }

    public final void setHeaderIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setActionIconVisibility$default(C57471yiz c57471yiz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57471yiz.setActionIconVisibility(z);
    }

    public final void setActionIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        android.view.View view = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setMainIconVisibility$default(C57471yiz c57471yiz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57471yiz.setMainIconVisibility(z);
    }

    public final void setMainIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setArrowIconVisibility$default(C57471yiz c57471yiz, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57471yiz.setArrowIconVisibility(z);
    }

    public final void setArrowIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void setArrowIconCallback(final Function0<Unit> function0) {
        if (function0 != null) {
            android.widget.ImageView imageView = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            this.KWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.yiv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
            return;
        }
        android.widget.ImageView imageView2 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        this.KWHzl.getRoot().setOnClickListener(null);
    }

    public static /* synthetic */ void setEndActionIconSize$default(C57471yiz c57471yiz, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 20.0f;
        }
        if ((i & 2) != 0) {
            f2 = 20.0f;
        }
        c57471yiz.setEndActionIconSize(f, f2);
    }

    public final void setEndActionIconSize(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        layoutParams.width = C55298xhM.dp2px$default(f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(f2, null, 1, null);
        this.KWHzl.KWHzl.setLayoutParams(layoutParams);
    }
}
