package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27167jqA extends ConstraintLayout {
    public ActionBar AEQbTJ;
    public Application EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC23883iMw OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.jqA$ActionBar */
    public interface ActionBar {
        void EZpvd();
    }

    /* JADX INFO: renamed from: o.jqA$Application */
    public interface Application {
        void OLrzqt(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCoinClickCallback(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTipClickCallback(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ = actionBar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27167jqA(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27167jqA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27167jqA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AhwBna();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27167jqA.AEQbTJ();
            }
        });
    }

    private final android.view.animation.RotateAnimation valueOf() {
        return (android.view.animation.RotateAnimation) this.KWHzl.getValue();
    }

    public static final android.view.animation.RotateAnimation AEQbTJ() {
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setDuration(1000L);
        return rotateAnimation;
    }

    private final void AhwBna() {
        this.OLrzqt = (AbstractC23883iMw) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.RgLUBD, this, true);
        OLrzqt();
    }

    public static /* synthetic */ void setData$default(C27167jqA c27167jqA, java.util.List list, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        c27167jqA.setData(list, z, z2, z3);
    }

    public final void setData(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, final boolean z2, boolean z3) {
        ViewDataBinding viewDataBindingInflate;
        char c;
        C55258xgZ c55258xgZ;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
        if (abstractC23883iMw != null && (linearLayout = abstractC23883iMw.EZpvd) != null) {
            linearLayout.removeAllViews();
        }
        AbstractC23883iMw abstractC23883iMw2 = this.OLrzqt;
        if (abstractC23883iMw2 != null && (c55258xgZ = abstractC23883iMw2.OLrzqt) != null) {
            if (z2) {
                c55258xgZ.setHelperLabelType(z3 ? 1 : 0);
                c55258xgZ.setUnderlineStyle(0);
            } else {
                c55258xgZ.setHelperLabelType(2);
            }
            c55258xgZ.setOnClickListener(new View.OnClickListener() { // from class: o.jqE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27167jqA.setData$lambda$3$lambda$2(z2, this, view);
                }
            });
        }
        for (final InvestTokenWithAmount investTokenWithAmount : list) {
            if (z3) {
                int i = C25493ixk.Activity.RkASWs;
                AbstractC23883iMw abstractC23883iMw3 = this.OLrzqt;
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, i, abstractC23883iMw3 != null ? abstractC23883iMw3.EZpvd : null, true);
            } else {
                int i2 = C25493ixk.Activity.RTWSvT;
                AbstractC23883iMw abstractC23883iMw4 = this.OLrzqt;
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, i2, abstractC23883iMw4 != null ? abstractC23883iMw4.EZpvd : null, true);
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
            android.view.View viewFindViewById4 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.fromMediaItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewFindViewById4;
            android.view.View viewFindViewById5 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserServiceCallbackImpl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById5;
            android.view.View viewFindViewById6 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.onShuffleModeChanged);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            android.view.View viewFindViewById7 = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById7;
            textView.setText(C27492jwH.OLrzqt.OLrzqt(false));
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textView2.setText(" " + investTokenWithAmount.getTokenSymbol());
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
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
            viewFindViewById6.setVisibility((!z || z3) ? 8 : 0);
            if (z) {
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.jqB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C27167jqA.setData$lambda$5(this.OLrzqt, investTokenWithAmount, view);
                    }
                });
                imageView.setVisibility(0);
                c = '\b';
            } else {
                linearLayout2.setOnClickListener(null);
                c = '\b';
                imageView.setVisibility(8);
            }
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView2, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        }
    }

    public static final void setData$lambda$3$lambda$2(boolean z, C27167jqA c27167jqA, android.view.View view) {
        ActionBar actionBar;
        if (!z || (actionBar = c27167jqA.AEQbTJ) == null) {
            return;
        }
        actionBar.EZpvd();
    }

    public static final void setData$lambda$5(C27167jqA c27167jqA, InvestTokenWithAmount investTokenWithAmount, android.view.View view) {
        Application application = c27167jqA.EZpvd;
        if (application != null) {
            application.OLrzqt(investTokenWithAmount.getTokenAddress());
        }
    }

    public final void KWHzl() {
        C55258xgZ c55258xgZ;
        AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
        if (abstractC23883iMw == null || (c55258xgZ = abstractC23883iMw.OLrzqt) == null) {
            return;
        }
        c55258xgZ.setVisibility(8);
    }

    public final void OLrzqt(@NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2, boolean z3) {
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
        if (abstractC23883iMw == null || (linearLayout = abstractC23883iMw.EZpvd) == null) {
            return;
        }
        if (list.size() != linearLayout.getChildCount()) {
            setData$default(this, list, z, z2, false, 8, null);
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (list.size() > i) {
                android.view.View childAt = linearLayout.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                EZpvd(childAt, list.get(i), z3);
            }
        }
    }

    public final void EZpvd(android.view.View view, InvestTokenWithAmount investTokenWithAmount, boolean z) {
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaItem);
        Intrinsics.copydefault(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.getDescription);
        Intrinsics.copydefault(viewFindViewById2, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.RidNCX);
        Intrinsics.copydefault(viewFindViewById3, "");
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
            textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
            textView.setText("--");
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
        }
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout;
        Sequence<android.view.View> children;
        if (this.copydefault) {
            return;
        }
        AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
        if (abstractC23883iMw != null && (linearLayout = abstractC23883iMw.EZpvd) != null && (children = ViewGroupKt.getChildren(linearLayout)) != null) {
            for (android.view.View view : children) {
                android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.fromMediaItemList);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
                imageView.setVisibility(0);
                imageView.setAnimation(valueOf());
                imageView.startAnimation(valueOf());
                android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaItem);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                android.widget.TextView textView = (android.widget.TextView) viewFindViewById2;
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
                textView.setVisibility(8);
                android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.getDescription);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById3;
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.xxhdY));
                textView2.setVisibility(8);
            }
        }
        this.copydefault = true;
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout;
        Sequence<android.view.View> children;
        if (this.copydefault) {
            AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
            if (abstractC23883iMw != null && (linearLayout = abstractC23883iMw.EZpvd) != null && (children = ViewGroupKt.getChildren(linearLayout)) != null) {
                for (android.view.View view : children) {
                    android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.fromMediaItemList);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                    android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
                    imageView.setVisibility(8);
                    imageView.clearAnimation();
                    android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.MediaBrowserCompatMediaItem);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                    ((android.widget.TextView) viewFindViewById2).setVisibility(0);
                    android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.getDescription);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                    ((android.widget.TextView) viewFindViewById3).setVisibility(0);
                }
            }
            this.copydefault = false;
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        C55258xgZ c55258xgZ;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23883iMw abstractC23883iMw = this.OLrzqt;
        if (abstractC23883iMw == null || (c55258xgZ = abstractC23883iMw.OLrzqt) == null) {
            return;
        }
        c55258xgZ.setTextValue(str);
    }
}
