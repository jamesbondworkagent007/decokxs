package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C24818ikx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24800ikf extends android.widget.LinearLayout {
    public DexTradeInputData AEQbTJ;
    public hGU OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainSelectClick(@NotNull Function1<? super C24800ikf, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    public C24800ikf(android.content.Context context) {
        super(context);
        this.AEQbTJ = new DexTradeInputData(null, null, null, null, 15, null);
        EZpvd(context, null);
    }

    public C24800ikf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AEQbTJ = new DexTradeInputData(null, null, null, null, 15, null);
        EZpvd(context, attributeSet);
    }

    public C24800ikf(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AEQbTJ = new DexTradeInputData(null, null, null, null, 15, null);
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        setOrientation(1);
        if (context == null) {
            return;
        }
        this.OLrzqt = hGU.copydefault(android.view.LayoutInflater.from(context), this);
    }

    public final void setTextSelectCallback(@NotNull final Function1<? super C24800ikf, Unit> function1) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function1, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setTextSelectCallback(new Function1() { // from class: o.ike
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24800ikf.OLrzqt(function1, this, (C24818ikx) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, C24800ikf c24800ikf, C24818ikx c24818ikx) {
        Intrinsics.checkNotNullParameter(c24818ikx, "");
        function1.invoke(c24800ikf);
        return Unit.INSTANCE;
    }

    public final void setDexTradeData(@NotNull DexTradeInputData dexTradeInputData) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.AEQbTJ = dexTradeInputData;
        hGU hgu = this.OLrzqt;
        if (hgu != null) {
            hgu.EZpvd.setSelectData(dexTradeInputData.getImageTextSelectData());
            hgu.EZpvd.setEditData(dexTradeInputData.getVerticalEditTextGroupData());
        }
    }

    public final void setHighRiskVisible(boolean z) {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setHighRiskVisible(z);
    }

    public final DexTradeInputData OLrzqt() {
        DexTradeInputData dexTradeInputData = this.AEQbTJ;
        hGU hgu = this.OLrzqt;
        if (hgu != null) {
            VerticalEditTextGroupData verticalEditTextGroupDataKWHzl = hgu.EZpvd.KWHzl();
            if (verticalEditTextGroupDataKWHzl != null) {
                dexTradeInputData.setVerticalEditTextGroupData(verticalEditTextGroupDataKWHzl);
            }
            ImageTextSelectData imageTextSelectDataAEQbTJ = hgu.EZpvd.AEQbTJ();
            if (imageTextSelectDataAEQbTJ != null) {
                dexTradeInputData.setImageTextSelectData(imageTextSelectDataAEQbTJ);
            }
        }
        return dexTradeInputData;
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function2, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.EZpvd(function2);
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function2, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.AEQbTJ(function2);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function2, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.KWHzl(function2);
    }

    public final void copydefault(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function2, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.OLrzqt(function2);
    }

    public final void EZpvd(@NotNull View.OnFocusChangeListener onFocusChangeListener) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.KWHzl(onFocusChangeListener);
    }

    public final void copydefault() {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.gEmmrt();
    }

    public final void setInputHintContent(boolean z, @NotNull java.lang.String str) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(str, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setInputHintContent(z, str);
    }

    public static /* synthetic */ void setEnableEdit$default(C24800ikf c24800ikf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c24800ikf.setEnableEdit(z);
    }

    public final void setEnableEdit(boolean z) {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setEnableEdit(z);
    }

    public final void setInputConfig(@NotNull Function1<? super C24806ikl, Unit> function1) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function1, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setInputConfig(function1);
    }

    public final void setClickCallback(@NotNull Function0<Unit> function0) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function0, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setClickCallback(function0);
    }

    public final void setClickValueDifferenceCallBack(@NotNull Function0<Unit> function0) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function0, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setClickValueDifferenceCallBack(function0);
    }

    public final void setInputFocusCallBack(@NotNull Function0<Unit> function0) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(function0, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setInputFocusCallBack(function0);
    }

    public final void setLeftRightMargin(int i) {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setStartEndMargin(i);
    }

    public final void setLabelSecondColor(int i) {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setLabelSecondColor(i);
    }

    public final void EZpvd() {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.EZpvd();
    }

    public final void KWHzl() {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.copydefault();
    }

    public final void setHeterogeneousChain(@NotNull DefiChainInfo defiChainInfo) {
        C24801ikg c24801ikg;
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24801ikg = hgu.copydefault) == null) {
            return;
        }
        c24801ikg.setChain(defiChainInfo);
    }

    public final void AhwBna() {
        C24801ikg c24801ikg;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24801ikg = hgu.copydefault) == null) {
            return;
        }
        c24801ikg.copydefault();
    }

    public final void setHeterogeneousAddress(C22947hov c22947hov) {
        C24801ikg c24801ikg;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24801ikg = hgu.copydefault) == null) {
            return;
        }
        c24801ikg.setData(c22947hov);
    }

    public final void setOnHeterogeneousClickListener(@NotNull View.OnClickListener onClickListener) {
        C24801ikg c24801ikg;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24801ikg = hgu.copydefault) == null) {
            return;
        }
        c24801ikg.setOnClickListener(onClickListener);
    }

    public final void setCheckData(@NotNull java.lang.String str) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(str, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setCheckData(str);
    }

    public final void setAccessibilityIds(@NotNull C24818ikx.Activity activity) {
        C24818ikx c24818ikx;
        Intrinsics.checkNotNullParameter(activity, "");
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return;
        }
        c24818ikx.setAccessibilityIds(activity);
    }

    public final C24806ikl AEQbTJ() {
        C24818ikx c24818ikx;
        hGU hgu = this.OLrzqt;
        if (hgu == null || (c24818ikx = hgu.EZpvd) == null) {
            return null;
        }
        return c24818ikx.OLrzqt();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C33050mpD.OLrzqt(this);
    }
}
