package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27176jqJ extends android.widget.FrameLayout {
    public InterfaceC27312jsn AEQbTJ;
    public boolean EZpvd;
    public Activity OLrzqt;
    public Application copydefault;

    /* JADX INFO: renamed from: o.jqJ$Activity */
    public interface Activity {
        void EZpvd();
    }

    /* JADX INFO: renamed from: o.jqJ$Application */
    public interface Application {
        void KWHzl(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27176jqJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27176jqJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCoinClickCallback(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTipClickCallback(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.jqJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27176jqJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27176jqJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    private final InterfaceC27312jsn KWHzl() {
        InterfaceC27312jsn c27310jsl;
        if (this.AEQbTJ == null) {
            if (this.EZpvd) {
                iMK imkAEQbTJ = iMK.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(imkAEQbTJ, "");
                c27310jsl = new C27311jsm(imkAEQbTJ);
            } else {
                iMB imbKWHzl = iMB.KWHzl(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(imbKWHzl, "");
                c27310jsl = new C27310jsl(imbKWHzl);
            }
            this.AEQbTJ = c27310jsl;
        }
        InterfaceC27312jsn interfaceC27312jsn = this.AEQbTJ;
        Intrinsics.copydefault(interfaceC27312jsn);
        return interfaceC27312jsn;
    }

    public final void OLrzqt() {
        removeAllViews();
        addView(KWHzl().copydefault());
    }

    public final void KWHzl(boolean z) {
        if (this.EZpvd != z) {
            this.EZpvd = z;
            this.AEQbTJ = null;
            OLrzqt();
        }
    }

    public static /* synthetic */ void setData$default(C27176jqJ c27176jqJ, java.util.List list, boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z4 = false;
        }
        c27176jqJ.setData(list, z, z2, str, z3, z4);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxf.loadCircleWithBorder$default(o.jxf, android.widget.ImageView, java.lang.String, int, int, float, int, java.lang.Object):void */
    public final void setData(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, final boolean z2, java.lang.String str, boolean z3, boolean z4) {
        float fEZpvd;
        ViewDataBinding viewDataBindingInflate;
        int i;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        KWHzl().EZpvd().removeAllViews();
        C55258xgZ c55258xgZAEQbTJ = KWHzl().AEQbTJ();
        if (z2) {
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            fEZpvd = C33052mpF.EZpvd(36.0f, r11) + 0.0f;
            c55258xgZAEQbTJ.setUnderlineStyle(0);
            c55258xgZAEQbTJ.setHelperLabelType(z3 ? 1 : 0);
        } else {
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            fEZpvd = C33052mpF.EZpvd(16.0f, r11) + 0.0f;
            c55258xgZAEQbTJ.setHelperLabelType(2);
        }
        c55258xgZAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27176jqJ.setData$lambda$1$lambda$0(z2, this, view);
            }
        });
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            final InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) next;
            if (z3) {
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.UccSpe, KWHzl().EZpvd(), true);
            } else {
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.RqmePg, KWHzl().EZpvd(), true);
            }
            android.view.View viewFindViewById = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.getDescription);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.RidNCX);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.sElUiK);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewFindViewById4;
            android.view.View viewFindViewById5 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserServiceCallbackImpl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById5;
            java.util.Iterator it2 = it;
            android.view.View viewFindViewById6 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.onShuffleModeChanged);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            android.view.View viewFindViewById7 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById7;
            textView.setText(C27492jwH.OLrzqt.OLrzqt(false));
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
            java.lang.String tokenSymbol = investTokenWithAmount.getTokenSymbol();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            android.view.LayoutInflater layoutInflater = layoutInflaterFrom;
            sb.append(" ");
            sb.append(tokenSymbol);
            textView2.setText(sb.toString());
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
            if (z4) {
                TextViewCompat.setTextAppearance(textView, C32113mPz.Dialog.getFieldNames);
                TextViewCompat.setTextAppearance(textView2, C32113mPz.Dialog.getFieldNames);
            }
            if (investTokenWithAmount.getDataType() == InvestTokenType.REWARDS) {
                textView3.setVisibility(0);
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                if (c33512mxp.isConnected() == 0) {
                    textView3.setBackgroundResource(C25493ixk.StateListAnimator.AEQbTJ);
                } else {
                    textView3.setBackgroundResource(C25493ixk.StateListAnimator.copydefault);
                }
                z5 = false;
                textView3.setTextColor(C33512mxp.getRiseUpColor$default(c33512mxp, 0.0f, 1, null));
                i = 8;
            } else {
                i = 8;
                z5 = false;
                textView3.setVisibility(8);
            }
            if (z) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.jqG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C27176jqJ.setData$lambda$4$lambda$3(this.copydefault, investTokenWithAmount, view);
                    }
                });
                z6 = false;
                imageView.setVisibility(0);
                viewFindViewById6.setVisibility(0);
            } else {
                z6 = false;
                linearLayout.setOnClickListener(null);
                imageView.setVisibility(i);
                viewFindViewById6.setVisibility(i);
            }
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView2, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
            if (i2 == 0 && !z3 && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ((LinearLayout.LayoutParams) layoutParams).setMarginStart((int) fEZpvd);
            }
            if (z3) {
                imageView.setVisibility(8);
                viewFindViewById6.setVisibility(8);
            }
            i2++;
            it = it2;
            layoutInflaterFrom = layoutInflater;
        }
        android.view.LayoutInflater layoutInflater2 = layoutInflaterFrom;
        if (str != null) {
            ((iMG) DataBindingUtil.inflate(layoutInflater2, C25493ixk.Activity.invokespecialROgMPW, KWHzl().EZpvd(), true)).copydefault.setText(str);
        }
    }

    public static final void setData$lambda$1$lambda$0(boolean z, C27176jqJ c27176jqJ, android.view.View view) {
        Activity activity;
        if (!z || (activity = c27176jqJ.OLrzqt) == null) {
            return;
        }
        activity.EZpvd();
    }

    public static final void setData$lambda$4$lambda$3(C27176jqJ c27176jqJ, InvestTokenWithAmount investTokenWithAmount, android.view.View view) {
        Application application = c27176jqJ.copydefault;
        if (application != null) {
            application.KWHzl(investTokenWithAmount.getTokenAddress());
        }
    }

    public final void OLrzqt(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2, boolean z3, java.lang.String str, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        android.widget.LinearLayout linearLayoutEZpvd = KWHzl().EZpvd();
        if (list.size() != linearLayoutEZpvd.getChildCount()) {
            setData(list, z, z2, str, z4, z5);
        }
        int childCount = linearLayoutEZpvd.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (list.size() > i) {
                android.view.View childAt = linearLayoutEZpvd.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                OLrzqt(childAt, list.get(i), z3);
            }
        }
    }

    public final void OLrzqt(android.view.View view, InvestTokenWithAmount investTokenWithAmount, boolean z) {
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaItem);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.getDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.RidNCX);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById3;
        textView2.setText(" " + investTokenWithAmount.getTokenSymbol());
        if (investTokenWithAmount.getDataType() == InvestTokenType.REWARDS) {
            textView3.setVisibility(0);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            if (c33512mxp.isConnected() == 0) {
                textView3.setBackgroundResource(C25493ixk.StateListAnimator.AEQbTJ);
            } else {
                textView3.setBackgroundResource(C25493ixk.StateListAnimator.copydefault);
            }
            textView3.setTextColor(C33512mxp.getRiseUpColor$default(c33512mxp, 0.0f, 1, null));
        } else {
            textView3.setVisibility(8);
        }
        if (investTokenWithAmount.getCoinAmount().length() > 0 && !z) {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
        } else {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
            textView.setText("--");
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().AEQbTJ().setTextValue(str);
    }
}
