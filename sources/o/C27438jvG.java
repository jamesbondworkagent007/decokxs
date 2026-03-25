package o;

import android.widget.LinearLayout;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27438jvG extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public iMO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27438jvG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27438jvG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.jvG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27438jvG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27438jvG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        iMO imoKWHzl = iMO.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(imoKWHzl, "");
        this.AEQbTJ = imoKWHzl;
    }

    /* JADX INFO: renamed from: o.jvG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void addTitleColumn$default(C27438jvG c27438jvG, int i, InvestRiskRatingModel investRiskRatingModel, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        c27438jvG.KWHzl(i, investRiskRatingModel, z);
    }

    public final void KWHzl(int i, InvestRiskRatingModel investRiskRatingModel, boolean z) {
        if (investRiskRatingModel == null) {
            return;
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C25493ixk.Activity.invokespecialRuDPQV, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C25493ixk.ActionBar.createFromParcel);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C25493ixk.ActionBar.GQzpsZ);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C55298xhM.copydefault((i * 56.0f) + ((i - 1) * 0.5f), context));
        textView.setText(investRiskRatingModel.getDescription());
        Intrinsics.copydefault(imageView);
        imageView.setVisibility(Intrinsics.EZpvd(investRiskRatingModel.getDisplaySafeTag(), java.lang.Boolean.FALSE) ? 8 : 0);
        this.AEQbTJ.OLrzqt.addView(viewInflate, layoutParams);
        if (z) {
            this.AEQbTJ.OLrzqt.addView(EZpvd());
        }
    }

    public static /* synthetic */ void addContentColumn$default(C27438jvG c27438jvG, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c27438jvG.KWHzl(list, z);
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTextSize(12.0f);
        textView.setTypeface(C55051xce.OLrzqt.OLrzqt());
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final android.view.View EZpvd() {
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, C55298xhM.dp2px$default(0.5f, null, 1, null)));
        view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
        return view;
    }

    public final android.view.View OLrzqt() {
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(C55298xhM.dp2px$default(0.5f, null, 1, null), -1));
        view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE));
        return view;
    }

    public static /* synthetic */ void addContentChild$default(C27438jvG c27438jvG, android.widget.LinearLayout linearLayout, android.widget.TextView textView, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c27438jvG.OLrzqt(linearLayout, textView, z);
    }

    public final void OLrzqt(android.widget.LinearLayout linearLayout, android.widget.TextView textView, boolean z) {
        linearLayout.addView(textView);
        if (linearLayout.getChildCount() < 5 && z) {
            linearLayout.addView(OLrzqt());
        }
    }

    public final void setData(@NotNull java.util.List<InvestRiskRatingModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((InvestRiskRatingModel) obj).getRatingTypeId());
            java.lang.Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        int i = 0;
        for (java.lang.Object obj2 : linkedHashMap.entrySet()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Map.Entry entry = (Map.Entry) obj2;
            boolean z = true;
            KWHzl(((java.util.List) entry.getValue()).size(), (InvestRiskRatingModel) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) entry.getValue()), i != linkedHashMap.size() - 1);
            java.util.List<InvestRiskRatingModel> list2 = (java.util.List) entry.getValue();
            if (i != linkedHashMap.size() - 1) {
                z = false;
            }
            KWHzl(list2, z);
            i++;
        }
    }

    public final void KWHzl(java.util.List<InvestRiskRatingModel> list, boolean z) {
        for (InvestRiskRatingModel investRiskRatingModel : list) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C55298xhM.copydefault(56.0f, context));
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) investRiskRatingModel.getTvl())) {
                android.widget.TextView textViewCopydefault = copydefault();
                textViewCopydefault.setText(investRiskRatingModel.getTvl());
                addContentChild$default(this, linearLayout, textViewCopydefault, false, 2, null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) investRiskRatingModel.getMonthsMin())) {
                android.widget.TextView textViewCopydefault2 = copydefault();
                textViewCopydefault2.setText(investRiskRatingModel.getMonthsMin());
                addContentChild$default(this, linearLayout, textViewCopydefault2, false, 2, null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) investRiskRatingModel.getCreditScoreMin())) {
                android.widget.TextView textViewCopydefault3 = copydefault();
                textViewCopydefault3.setText(investRiskRatingModel.getCreditScoreMin());
                addContentChild$default(this, linearLayout, textViewCopydefault3, false, 2, null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) investRiskRatingModel.getMessageTip())) {
                android.widget.TextView textViewCopydefault4 = copydefault();
                textViewCopydefault4.setText(investRiskRatingModel.getMessageTip());
                OLrzqt(linearLayout, textViewCopydefault4, false);
            }
            this.AEQbTJ.AEQbTJ.addView(linearLayout, layoutParams);
            if (!z) {
                this.AEQbTJ.AEQbTJ.addView(EZpvd());
            }
        }
    }
}
