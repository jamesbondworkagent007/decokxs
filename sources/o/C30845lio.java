package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30845lio extends LinearLayoutCompat {
    public TaskDescription OLrzqt;
    public C23480hyy copydefault;

    /* JADX INFO: renamed from: o.lio$TaskDescription */
    public interface TaskDescription {
        void getNewProxyInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30845lio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30845lio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30845lio(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void OLrzqt() {
        ConstraintLayout constraintLayout;
        C23480hyy c23480hyyCopydefault = C23480hyy.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = c23480hyyCopydefault;
        AppCompatTextView appCompatTextView = c23480hyyCopydefault != null ? c23480hyyCopydefault.values : null;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.Slwtri);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.KWHzl(appCompatTextView, drawableKWHzl, C55298xhM.copydefault(16.0f, context));
        C23480hyy c23480hyy = this.copydefault;
        AppCompatTextView appCompatTextView2 = c23480hyy != null ? c23480hyy.AkhnZx : null;
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.pause);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C25352ivB.KWHzl(appCompatTextView2, drawableKWHzl2, C55298xhM.copydefault(16.0f, context2));
        C23480hyy c23480hyy2 = this.copydefault;
        AppCompatTextView appCompatTextView3 = c23480hyy2 != null ? c23480hyy2.fetchVPNInfo : null;
        android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.dhOYXF);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C25352ivB.KWHzl(appCompatTextView3, drawableKWHzl3, C55298xhM.copydefault(16.0f, context3));
        C23480hyy c23480hyy3 = this.copydefault;
        if (c23480hyy3 != null && (constraintLayout = c23480hyy3.isConnected) != null) {
            constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
        }
        copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPriorityFeeValue(@NotNull C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData) {
        AppCompatTextView appCompatTextView;
        java.lang.String showDataWithPrefix$default;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy == null || (appCompatTextView = c23480hyy.AkhnZx) == null) {
            return;
        }
        if (advancedQuoteUiData == null) {
            int iCopydefault = c30808liD.copydefault();
            if (iCopydefault == AdvancedPriorityFeeType.Market.getValue()) {
                showDataWithPrefix$default = C33070mpX.AYXKKw(C23274hvD.Fragment.DAgZj);
            } else if (iCopydefault == AdvancedPriorityFeeType.Fast.getValue()) {
                showDataWithPrefix$default = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap);
            } else if (iCopydefault == AdvancedPriorityFeeType.Turbo.getValue()) {
                showDataWithPrefix$default = C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance);
            } else if (iCopydefault != AdvancedPriorityFeeType.Custom.getValue() || c30808liD.valueOf().length() <= 0) {
                showDataWithPrefix$default = "--";
            } else {
                showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c30808liD.valueOf(), false, false, null, false, 30, null);
            }
        } else if (c30808liD.values().length() != 0) {
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c30808liD.values(), false, false, null, false, 30, null);
        }
        appCompatTextView.setText(showDataWithPrefix$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSlippageValue(@NotNull C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData) {
        AppCompatTextView appCompatTextView;
        java.lang.String percent$default;
        java.lang.String autoSlippage;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy == null || (appCompatTextView = c23480hyy.values) == null) {
            return;
        }
        if (!c30808liD.isConnected()) {
            java.lang.String strAkhnZx = c30808liD.AkhnZx();
            if (strAkhnZx != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                percent$default = C23311hvo.formatPercent$default(strAkhnZx, false, 0, 0, null, null, 31, null);
            }
        } else if (advancedQuoteUiData == null) {
            percent$default = getContext().getString(C23274hvD.Fragment.MediaDescriptionCompatApi21);
        } else {
            AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl();
            if (!(advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.LegacyLimit)) {
                AutoSlippageInfo autoSlippageInfoAEQbTJ = advancedQuoteAndCallDataKWHzl.AEQbTJ();
                if (autoSlippageInfoAEQbTJ != null) {
                    autoSlippage = autoSlippageInfoAEQbTJ.getAutoSlippage();
                }
                java.lang.String str = autoSlippage;
                if (str != null) {
                }
            } else {
                AutoSlippageInfo autoSlippageInfoAEQbTJ2 = advancedQuoteAndCallDataKWHzl.AEQbTJ();
                autoSlippage = autoSlippageInfoAEQbTJ2 != null ? autoSlippageInfoAEQbTJ2.getReferenceSlippage() : null;
                java.lang.String str2 = autoSlippage;
                percent$default = (str2 != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? "--" : C23311hvo.formatPercent$default(str2, false, 0, 0, null, null, 31, null);
            }
        }
        appCompatTextView.setText(percent$default);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v21, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r11v17, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setMevDisplayForSol(@NotNull C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData, boolean z) {
        AppCompatTextView appCompatTextView;
        android.view.View view;
        AppCompatTextView appCompatTextView2;
        android.view.View view2;
        AppCompatTextView appCompatTextView3;
        android.view.View view3;
        AppCompatTextView appCompatTextView4;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        android.graphics.drawable.Drawable drawable = null;
        if (!z) {
            toggleMevView$default(this, false, 1, null);
            return;
        }
        boolean zIsConnected = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl2.isConnected();
        boolean zValues = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.values();
        byte b = c30808liD.fetchVPNInfo() && zIsConnected;
        byte b2 = c30808liD.fetchVPNInfo() && zValues;
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy == null || (appCompatTextView = c23480hyy.fetchVPNInfo) == null) {
            return;
        }
        java.lang.String strAhwBna = c30808liD.AhwBna();
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            C23480hyy c23480hyy2 = this.copydefault;
            if (c23480hyy2 != null && (appCompatTextView4 = c23480hyy2.fetchVPNInfo) != null) {
                appCompatTextView4.setVisibility(0);
            }
            C23480hyy c23480hyy3 = this.copydefault;
            if (c23480hyy3 != null && (view3 = c23480hyy3.EZpvd) != null) {
                view3.setVisibility(0);
            }
            int i = b != false ? C52761wXj.Activity.DQzvGN : b2 != false ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.QwvEab;
            int i2 = b != false ? C52761wXj.Activity.DQzvGN : b2 != false ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.fdOvFl;
            C23480hyy c23480hyy4 = this.copydefault;
            AppCompatTextView appCompatTextView5 = c23480hyy4 != null ? c23480hyy4.fetchVPNInfo : null;
            android.content.Context context = getContext();
            int i3 = C52761wXj.TaskDescription.dhOYXF;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C33057mpK.EZpvd(i3, context2, i);
            Unit unit = Unit.INSTANCE;
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(context, i3);
            if (b != false || b2 != false) {
                android.content.Context context3 = getContext();
                int i4 = C52761wXj.TaskDescription.UPzgla;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                C33057mpK.EZpvd(i4, context4, i);
                drawable = ContextCompat.getDrawable(context3, i4);
            }
            C25352ivB.KWHzl(appCompatTextView5, drawable2, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, C25382ivf.copydefault(i));
            appCompatTextView.setTextColor(C33070mpX.copydefault(i2));
            appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatCallback));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            C23480hyy c23480hyy5 = this.copydefault;
            if (c23480hyy5 != null && (appCompatTextView3 = c23480hyy5.fetchVPNInfo) != null) {
                appCompatTextView3.setVisibility(0);
            }
            C23480hyy c23480hyy6 = this.copydefault;
            if (c23480hyy6 != null && (view2 = c23480hyy6.EZpvd) != null) {
                view2.setVisibility(0);
            }
            android.content.res.ColorStateList colorStateListCopydefault = C25382ivf.copydefault(C52761wXj.Activity.QwvEab);
            int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            android.graphics.drawable.Drawable drawableKWHzl = c30808liD.fetchVPNInfo() ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dhOYXF) : C33070mpX.KWHzl(C52761wXj.TaskDescription.dtVxwd);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(iKWHzl);
            }
            C23480hyy c23480hyy7 = this.copydefault;
            C25352ivB.KWHzl(c23480hyy7 != null ? c23480hyy7.fetchVPNInfo : null, drawableKWHzl, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateListCopydefault);
            appCompatTextView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
            appCompatTextView.setText(c30808liD.fetchVPNInfo() ? C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatCallback) : C33070mpX.AYXKKw(C23274hvD.Fragment.binderDied));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
            C23480hyy c23480hyy8 = this.copydefault;
            if (c23480hyy8 != null && (appCompatTextView2 = c23480hyy8.fetchVPNInfo) != null) {
                appCompatTextView2.setVisibility(0);
            }
            C23480hyy c23480hyy9 = this.copydefault;
            if (c23480hyy9 != null && (view = c23480hyy9.EZpvd) != null) {
                view.setVisibility(0);
            }
            appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            android.content.res.ColorStateList colorStateListCopydefault2 = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl);
            android.content.res.ColorStateList colorStateListCopydefault3 = C25382ivf.copydefault(C52761wXj.Activity.QwvEab);
            int iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.dtVxwd);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(iKWHzl2);
            }
            C23480hyy c23480hyy10 = this.copydefault;
            C25352ivB.KWHzl(c23480hyy10 != null ? c23480hyy10.fetchVPNInfo : null, drawableKWHzl2, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateListCopydefault3);
            appCompatTextView.setTextColor(colorStateListCopydefault2);
            appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.binderDied));
            return;
        }
        toggleMevView$default(this, false, 1, null);
    }

    /* JADX INFO: renamed from: o.lio$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C30845lio OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C30845lio c30845lio) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c30845lio;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TaskDescription taskDescriptionEZpvd = this.OLrzqt.EZpvd();
                if (taskDescriptionEZpvd != null) {
                    taskDescriptionEZpvd.getNewProxyInstance();
                }
            }
        }
    }

    public final void setMevDisplayForEVM(@NotNull C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData, boolean z) {
        AppCompatTextView appCompatTextView;
        android.view.View view;
        AppCompatTextView appCompatTextView2;
        android.view.View view2;
        AppCompatTextView appCompatTextView3;
        android.view.View view3;
        AppCompatTextView appCompatTextView4;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        android.graphics.drawable.Drawable drawable = null;
        if (!z) {
            toggleMevView$default(this, false, 1, null);
            return;
        }
        boolean zIsConnected = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl2.isConnected();
        boolean zValues = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? false : advancedQuoteAndCallDataKWHzl.values();
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy == null || (appCompatTextView = c23480hyy.fetchVPNInfo) == null) {
            return;
        }
        java.lang.String strAhwBna = c30808liD.AhwBna();
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            C23480hyy c23480hyy2 = this.copydefault;
            if (c23480hyy2 != null && (appCompatTextView4 = c23480hyy2.fetchVPNInfo) != null) {
                appCompatTextView4.setVisibility(0);
            }
            C23480hyy c23480hyy3 = this.copydefault;
            if (c23480hyy3 != null && (view3 = c23480hyy3.EZpvd) != null) {
                view3.setVisibility(0);
            }
            int i = zIsConnected ? C52761wXj.Activity.DQzvGN : zValues ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.QwvEab;
            int i2 = zIsConnected ? C52761wXj.Activity.DQzvGN : zValues ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.fdOvFl;
            C23480hyy c23480hyy4 = this.copydefault;
            AppCompatTextView appCompatTextView5 = c23480hyy4 != null ? c23480hyy4.fetchVPNInfo : null;
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF);
            if (zIsConnected || zValues) {
                android.content.Context context = getContext();
                int i3 = C52761wXj.TaskDescription.UPzgla;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C33057mpK.EZpvd(i3, context2, i);
                Unit unit = Unit.INSTANCE;
                drawable = ContextCompat.getDrawable(context, i3);
            }
            C25352ivB.KWHzl(appCompatTextView5, drawable2, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, C25382ivf.copydefault(i));
            appCompatTextView.setTextColor(C33070mpX.copydefault(i2));
            appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatCallback));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            C23480hyy c23480hyy5 = this.copydefault;
            if (c23480hyy5 != null && (appCompatTextView3 = c23480hyy5.fetchVPNInfo) != null) {
                appCompatTextView3.setVisibility(0);
            }
            C23480hyy c23480hyy6 = this.copydefault;
            if (c23480hyy6 != null && (view2 = c23480hyy6.EZpvd) != null) {
                view2.setVisibility(0);
            }
            android.content.res.ColorStateList colorStateListCopydefault = C25382ivf.copydefault(C52761wXj.Activity.QwvEab);
            int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            android.graphics.drawable.Drawable drawableKWHzl = c30808liD.fetchVPNInfo() ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dhOYXF) : C33070mpX.KWHzl(C52761wXj.TaskDescription.dtVxwd);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(iKWHzl);
            }
            C23480hyy c23480hyy7 = this.copydefault;
            C25352ivB.KWHzl(c23480hyy7 != null ? c23480hyy7.fetchVPNInfo : null, drawableKWHzl, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateListCopydefault);
            appCompatTextView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
            appCompatTextView.setText(c30808liD.fetchVPNInfo() ? C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatCallback) : C33070mpX.AYXKKw(C23274hvD.Fragment.binderDied));
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.dhOYXF);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(iKWHzl);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
            C23480hyy c23480hyy8 = this.copydefault;
            if (c23480hyy8 != null && (appCompatTextView2 = c23480hyy8.fetchVPNInfo) != null) {
                appCompatTextView2.setVisibility(0);
            }
            C23480hyy c23480hyy9 = this.copydefault;
            if (c23480hyy9 != null && (view = c23480hyy9.EZpvd) != null) {
                view.setVisibility(0);
            }
            appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            android.content.res.ColorStateList colorStateListCopydefault2 = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl);
            android.content.res.ColorStateList colorStateListCopydefault3 = C25382ivf.copydefault(C52761wXj.Activity.QwvEab);
            int iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.dtVxwd);
            if (drawableKWHzl3 != null) {
                drawableKWHzl3.setTint(iKWHzl2);
            }
            C23480hyy c23480hyy10 = this.copydefault;
            C25352ivB.KWHzl(c23480hyy10 != null ? c23480hyy10.fetchVPNInfo : null, drawableKWHzl3, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateListCopydefault3);
            appCompatTextView.setTextColor(colorStateListCopydefault2);
            appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.binderDied));
            return;
        }
        toggleMevView$default(this, false, 1, null);
    }

    public static /* synthetic */ void toggleMevView$default(C30845lio c30845lio, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c30845lio.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        android.view.View view;
        AppCompatTextView appCompatTextView;
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null && (appCompatTextView = c23480hyy.fetchVPNInfo) != null) {
            appCompatTextView.setVisibility(z ? 0 : 8);
        }
        C23480hyy c23480hyy2 = this.copydefault;
        if (c23480hyy2 == null || (view = c23480hyy2.EZpvd) == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    public final void KWHzl(C30808liD c30808liD) {
        android.graphics.drawable.Drawable drawableKWHzl;
        AppCompatTextView appCompatTextView;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c30808liD.AhwBna(), (java.lang.Object) PresetRouteType.RouteTypeMev.getValue());
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null && (appCompatTextView = c23480hyy.fetchVPNInfo) != null) {
            appCompatTextView.setText(getContext().getString(zEZpvd ? C23274hvD.Fragment.MediaControllerCompatCallback : C23274hvD.Fragment.binderDied));
        }
        C23480hyy c23480hyy2 = this.copydefault;
        AppCompatTextView appCompatTextView2 = c23480hyy2 != null ? c23480hyy2.fetchVPNInfo : null;
        if (zEZpvd) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dhOYXF);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dtVxwd);
        }
        C25352ivB.KWHzl(appCompatTextView2, drawableKWHzl, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.AkhnZx));
    }

    public final void setInitUI(boolean z, @NotNull C30808liD c30808liD, AdvancedQuoteUiData advancedQuoteUiData) {
        Intrinsics.checkNotNullParameter(c30808liD, "");
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null) {
            setSlippageValue(c30808liD, advancedQuoteUiData);
            setPriorityFeeValue(c30808liD, advancedQuoteUiData);
            KWHzl(z);
            KWHzl(c30808liD);
            c23480hyy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
    }

    public final void copydefault() {
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null) {
            C55113xdn c55113xdn = c23480hyy.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            CDNSourceManager.LottieSource lottieSource = CDNSourceManager.LottieSource.DEX_CEFI_SETTING_LOADING;
            C22361hds.OLrzqt(c55113xdn, lottieSource);
            C55113xdn c55113xdn2 = c23480hyy.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            C22361hds.OLrzqt(c55113xdn2, lottieSource);
            android.view.View view = c23480hyy.djBIcL;
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            view.setBackground(new C30822liR(iCopydefault, C55298xhM.copydefault(4.0f, r4)));
            android.view.View view2 = c23480hyy.valueOf;
            int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            view2.setBackground(new C30822liR(iCopydefault2, C55298xhM.copydefault(4.0f, r3)));
        }
    }

    public final void KWHzl() {
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null) {
            c23480hyy.gEmmrt.KWHzl(0L);
            c23480hyy.AYXKKw.KWHzl(0L);
        }
    }

    public final void AEQbTJ() {
        C23480hyy c23480hyy = this.copydefault;
        if (c23480hyy != null) {
            c23480hyy.gEmmrt.copydefault();
            c23480hyy.AYXKKw.copydefault();
        }
    }
}
