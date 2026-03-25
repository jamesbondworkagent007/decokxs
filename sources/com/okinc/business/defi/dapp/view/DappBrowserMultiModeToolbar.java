package com.okinc.business.defi.dapp.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.dapp.view.DappBrowserMultiModeToolbar;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC13137dAe;
import o.AbstractC13481dMy;
import o.C15112dyF;
import o.C43251rlk;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.InterfaceC9850bdP;
import o.dAS;
import o.dLX;
import o.pTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DappBrowserMultiModeToolbar extends FrameLayout {
    public AbstractC13481dMy AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public Mode OLrzqt;
    public boolean copydefault;
    public dAS valueOf;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappBrowserMultiModeToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappBrowserMultiModeToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC13481dMy KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: com.okinc.business.defi.dapp.view.DappBrowserMultiModeToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ DappBrowserMultiModeToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappBrowserMultiModeToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), dLX.Fragment.fJNWhG, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC13481dMy) viewDataBindingInflate;
        Mode mode = Mode.BROWSER;
        this.OLrzqt = mode;
        this.KWHzl = true;
        this.copydefault = true;
        AEQbTJ();
        setupClickListeners();
        setMode(mode);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode BROWSER = new Mode("BROWSER", 0);
        public static final Mode HISTORY = new Mode("HISTORY", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{BROWSER, HISTORY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public final void AEQbTJ() {
        this.AEQbTJ.OLrzqt.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.Dff)));
    }

    public final void setupClickListeners() {
        this.AEQbTJ.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.dAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$0(this.OLrzqt, view);
            }
        });
        this.AEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.dAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$1(this.EZpvd, view);
            }
        });
        this.AEQbTJ.values.setOnClickListener(new View.OnClickListener() { // from class: o.dAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$2(this.AEQbTJ, view);
            }
        });
        this.AEQbTJ.fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.dAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$3(this.AEQbTJ, view);
            }
        });
        this.AEQbTJ.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.dAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$4(this.OLrzqt, view);
            }
        });
        this.AEQbTJ.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.dAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$5(this.AEQbTJ, view);
            }
        });
        this.AEQbTJ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$6(this.KWHzl, view);
            }
        });
        this.AEQbTJ.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.dAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DappBrowserMultiModeToolbar.setupClickListeners$lambda$7(this.KWHzl, view);
            }
        });
    }

    public static final void setupClickListeners$lambda$0(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das = dappBrowserMultiModeToolbar.valueOf;
        if (das != null) {
            das.KWHzl(AbstractC13137dAe.Application.copydefault);
        }
    }

    public static final void setupClickListeners$lambda$1(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das;
        if (dappBrowserMultiModeToolbar.EZpvd && (das = dappBrowserMultiModeToolbar.valueOf) != null) {
            das.KWHzl(AbstractC13137dAe.Activity.KWHzl);
        }
    }

    public static final void setupClickListeners$lambda$2(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das = dappBrowserMultiModeToolbar.valueOf;
        if (das != null) {
            das.KWHzl(AbstractC13137dAe.FragmentManager.AEQbTJ);
        }
    }

    public static final void setupClickListeners$lambda$3(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das = dappBrowserMultiModeToolbar.valueOf;
        if (das != null) {
            das.KWHzl(AbstractC13137dAe.Fragment.AEQbTJ);
        }
    }

    public static final void setupClickListeners$lambda$4(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das = dappBrowserMultiModeToolbar.valueOf;
        if (das != null) {
            das.KWHzl(AbstractC13137dAe.Dialog.AEQbTJ);
        }
    }

    public static final void setupClickListeners$lambda$5(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das = dappBrowserMultiModeToolbar.valueOf;
        if (das != null) {
            das.KWHzl(AbstractC13137dAe.StateListAnimator.AEQbTJ);
        }
    }

    public static final void setupClickListeners$lambda$6(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das;
        if (dappBrowserMultiModeToolbar.KWHzl && (das = dappBrowserMultiModeToolbar.valueOf) != null) {
            das.KWHzl(AbstractC13137dAe.ActionBar.EZpvd);
        }
    }

    public static final void setupClickListeners$lambda$7(DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar, View view) {
        dAS das;
        if (dappBrowserMultiModeToolbar.copydefault && (das = dappBrowserMultiModeToolbar.valueOf) != null) {
            das.KWHzl(AbstractC13137dAe.TaskDescription.AEQbTJ);
        }
    }

    public final void setMode(@NotNull Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        this.OLrzqt = mode;
        int i = Application.AEQbTJ[mode.ordinal()];
        if (i == 1) {
            this.AEQbTJ.AuCTel.setVisibility(0);
            this.AEQbTJ.EZpvd.setVisibility(0);
            this.AEQbTJ.djBIcL.setVisibility(8);
            this.AEQbTJ.copydefault.setImageResource(C52761wXj.TaskDescription.dlRikr);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.AEQbTJ.AuCTel.setVisibility(8);
        this.AEQbTJ.EZpvd.setVisibility(8);
        this.AEQbTJ.djBIcL.setVisibility(0);
        this.AEQbTJ.copydefault.setImageResource(C52761wXj.TaskDescription.DAgZj);
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.values.setText(str);
    }

    public final void setWalletWrapperVisible(boolean z) {
        this.AEQbTJ.fIwbmz.setVisibility(z ? 0 : 8);
    }

    public final void setTabCountLayoutVisible(boolean z) {
        this.AEQbTJ.DbNXlk.setVisibility(z ? 0 : 8);
    }

    public final void setMoreOptionsLayoutVisible(boolean z) {
        this.AEQbTJ.AkhnZx.setVisibility(z ? 0 : 8);
    }

    public final void setBackButtonEnabled(boolean z) {
        int color;
        this.AEQbTJ.OLrzqt.setEnabled(z);
        if (z) {
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.DeEinT);
        } else {
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.Dff);
        }
        this.AEQbTJ.OLrzqt.setImageTintList(ColorStateList.valueOf(color));
    }

    public final void setAddTabEnable(boolean z) {
        this.KWHzl = z;
        ImageView imageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        copydefault(imageView, z);
    }

    public final void setGoBackEnable(boolean z) {
        this.EZpvd = z;
        ImageView imageView = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        copydefault(imageView, z);
    }

    public final void setDeleteAllEnable(boolean z) {
        this.copydefault = z;
        ImageView imageView = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        copydefault(imageView, z);
    }

    public final void copydefault(ImageView imageView, boolean z) {
        int color;
        if (z) {
            color = ContextCompat.getColor(imageView.getContext(), C52761wXj.Activity.DeEinT);
        } else {
            color = ContextCompat.getColor(imageView.getContext(), C52761wXj.Activity.Dff);
        }
        imageView.setImageTintList(ColorStateList.valueOf(color));
    }

    public final void OLrzqt() {
        this.AEQbTJ.fetchVPNInfo.setText(InterfaceC9850bdP.StateListAnimator.formatToString$default((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class), pTB.OLrzqt(Integer.valueOf(C15112dyF.AEQbTJ.djBIcL().size())), false, null, null, 14, null));
    }

    public static final class StateListAnimator implements dAS {
        public final /* synthetic */ Function1<AbstractC13137dAe, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.dAe, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super AbstractC13137dAe, Unit> function1) {
            this.copydefault = function1;
        }

        @Override // o.dAS
        public void KWHzl(AbstractC13137dAe abstractC13137dAe) {
            Intrinsics.checkNotNullParameter(abstractC13137dAe, "");
            this.copydefault.invoke(abstractC13137dAe);
        }
    }

    public final void setOnActionClickListener(@NotNull Function1<? super AbstractC13137dAe, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = new StateListAnimator(function1);
    }
}
