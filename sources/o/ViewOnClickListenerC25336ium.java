package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexui.main.swap.widget.SettingItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22408hem;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ium, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class ViewOnClickListenerC25336ium extends AbstractC24459ieI implements View.OnClickListener {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public Function1<? super SettingItemData, Unit> AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public C21502hBt OLrzqt;
    public boolean copydefault;
    public SettingItemData gEmmrt;

    /* JADX INFO: renamed from: o.ium$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SettingItemData.SettingType.values().length];
            try {
                iArr[SettingItemData.SettingType.SLIPPAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SettingItemData.SettingType.MINI_RECEIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingItemData OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSlipPriceFluctuation(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlipSettingTokenType(boolean z, boolean z2, boolean z3) {
        this.EZpvd = z;
        this.AYXKKw = z2;
        this.AEQbTJ = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleCallBack(@NotNull Function1<? super SettingItemData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC25336ium(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = new SettingItemData(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
        this.OLrzqt = C21502hBt.AEQbTJ(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        initData$default(this, false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC25336ium(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = new SettingItemData(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
        this.OLrzqt = C21502hBt.AEQbTJ(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        initData$default(this, false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC25336ium(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = new SettingItemData(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
        this.OLrzqt = C21502hBt.AEQbTJ(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        initData$default(this, false, 1, null);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            return c21502hBt.valueOf;
        }
        return null;
    }

    public static /* synthetic */ void initData$default(ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        viewOnClickListenerC25336ium.copydefault(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(boolean z) {
        C55251xgS c55251xgS;
        int iCopydefault;
        C55251xgS c55251xgS2;
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            c21502hBt.djBIcL.setTextValue(this.gEmmrt.getTitle().getData());
            if (this.gEmmrt.isTitleHintImg().getData().booleanValue()) {
                c21502hBt.djBIcL.setHelperLabelType(0);
            }
            if (this.gEmmrt.isShowUnderLine().getData().booleanValue()) {
                c21502hBt.djBIcL.setHelperLabelType(1);
            } else {
                c21502hBt.djBIcL.setHelperLabelType(2);
            }
            c21502hBt.djBIcL.setOnClickListener(this);
            if (this.gEmmrt.isSingleChain()) {
                C21502hBt c21502hBt2 = this.OLrzqt;
                if (c21502hBt2 != null && (c55251xgS2 = c21502hBt2.AEQbTJ) != null) {
                    c55251xgS2.setTagIcon(null);
                }
            } else if (this.gEmmrt.getMevSupportedChainUrl().length() == 0) {
                C21502hBt c21502hBt3 = this.OLrzqt;
                if (c21502hBt3 != null && (c55251xgS = c21502hBt3.AEQbTJ) != null) {
                    c55251xgS.setTagIcon(null);
                }
            } else {
                copydefault();
            }
            java.lang.String data = this.gEmmrt.getContent().getData();
            int i = ActionBar.OLrzqt[this.gEmmrt.getType().ordinal()];
            if (i == 1) {
                if (z) {
                    android.widget.TextView textView = c21502hBt.KWHzl;
                    int i2 = C52761wXj.Activity.gdmIOq;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setTextColor(C25382ivf.copydefault(i2, context));
                } else if (this.copydefault) {
                    android.widget.TextView textView2 = c21502hBt.KWHzl;
                    int i3 = C52761wXj.Activity.gdmIOq;
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    textView2.setTextColor(C25382ivf.copydefault(i3, context2));
                } else if (this.AEQbTJ) {
                    c21502hBt.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                } else if (this.EZpvd) {
                    android.widget.TextView textView3 = c21502hBt.KWHzl;
                    if (this.AYXKKw) {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
                    } else {
                        iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                    }
                    textView3.setTextColor(iCopydefault);
                } else {
                    RoundingMode roundingMode = RoundingMode.UP;
                    java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(data, "100", 2, null, roundingMode, 4, null);
                    java.lang.String strMulCheckS$default2 = C23313hvq.mulCheckS$default(this.gEmmrt.getAutoSlip().getData(), "100", 2, null, roundingMode, 4, null);
                    if (!C23313hvq.EZpvd(strMulCheckS$default, "10")) {
                        if (C23313hvq.KWHzl(strMulCheckS$default, strMulCheckS$default2) & C23313hvq.EZpvd(strMulCheckS$default, this.gEmmrt.getMinSlip().getData())) {
                            android.widget.TextView textView4 = c21502hBt.KWHzl;
                            int i4 = C52761wXj.Activity.gdmIOq;
                            android.content.Context context3 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "");
                            textView4.setTextColor(C25382ivf.copydefault(i4, context3));
                        } else {
                            c21502hBt.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                            c21502hBt.KWHzl.setContentDescription("web3_dex_transaction_detail_slippage_value_label");
                        }
                    }
                }
                c21502hBt.KWHzl.setText(C23311hvo.formatPercent$default(data, false, 2, 0, RoundingMode.UP, null, 21, null));
            } else if (i == 2) {
                if (this.KWHzl) {
                    android.widget.TextView textView5 = c21502hBt.KWHzl;
                    int i5 = C52761wXj.Activity.gdmIOq;
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    textView5.setTextColor(C25382ivf.copydefault(i5, context4));
                } else {
                    c21502hBt.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                c21502hBt.KWHzl.setText(data);
            } else {
                c21502hBt.KWHzl.setText(data);
            }
            if (this.gEmmrt.isTagImg().getData().booleanValue()) {
                c21502hBt.OLrzqt.setVisibility(0);
            } else {
                c21502hBt.OLrzqt.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: o.ium$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC25336ium AYXKKw;
        public final /* synthetic */ FragmentActivity EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Function1 copydefault;
        public final /* synthetic */ long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, java.lang.String str, java.lang.String str2, FragmentActivity fragmentActivity, Function1 function1) {
            this.AEQbTJ = view;
            this.gEmmrt = j;
            this.AYXKKw = viewOnClickListenerC25336ium;
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.EZpvd = fragmentActivity;
            this.copydefault = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.gEmmrt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.AYXKKw.AEQbTJ(this.OLrzqt, this.KWHzl, this.EZpvd, this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.ium$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ FragmentActivity KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ ViewOnClickListenerC25336ium djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, java.lang.String str, java.lang.String str2, FragmentActivity fragmentActivity, Function1 function1) {
            this.EZpvd = view;
            this.AYXKKw = j;
            this.djBIcL = viewOnClickListenerC25336ium;
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.KWHzl = fragmentActivity;
            this.OLrzqt = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AYXKKw || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.djBIcL.AEQbTJ(this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.ium$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC25336ium AEQbTJ;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, Function1 function1) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = viewOnClickListenerC25336ium;
            this.KWHzl = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.DfrfUJ));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
                this.KWHzl.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.LIQUIDITY_EXPLAIN.getButtonName(), ButtonType.EXPLAIN.getType()));
            }
        }
    }

    public final void copydefault() {
        Glide.KWHzl(this).EZpvd(this.gEmmrt.getMevSupportedChainUrl()).OLrzqt(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ium$TaskDescription */
    public static final class TaskDescription extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            C55251xgS c55251xgS;
            Intrinsics.checkNotNullParameter(drawable, "");
            C21502hBt c21502hBt = ViewOnClickListenerC25336ium.this.OLrzqt;
            if (c21502hBt == null || (c55251xgS = c21502hBt.AEQbTJ) == null) {
                return;
            }
            c55251xgS.setShowIcon(true);
            c55251xgS.setTagIcon(drawable);
            TextViewCompat.setCompoundDrawableTintList(c55251xgS, null);
        }
    }

    public static /* synthetic */ void setSettingItemData$default(ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, SettingItemData settingItemData, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSettingItemData");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        viewOnClickListenerC25336ium.setSettingItemData(settingItemData, z);
    }

    public final void setSettingItemData(@NotNull SettingItemData settingItemData, boolean z) {
        Intrinsics.checkNotNullParameter(settingItemData, "");
        this.gEmmrt = settingItemData;
        copydefault(z);
    }

    public final void setMevProtect(boolean z, boolean z2, boolean z3) {
        int color;
        int color2;
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            C55251xgS c55251xgS = c21502hBt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            int i = 8;
            c55251xgS.setVisibility(z ? 0 : 8);
            C55251xgS c55251xgS2 = c21502hBt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            if (!z && z2) {
                i = 0;
            }
            c55251xgS2.setVisibility(i);
            if (z || !z2) {
                return;
            }
            if (z3) {
                color = getContext().getColor(C52761wXj.Activity.gdmIOq);
            } else {
                color = getContext().getColor(C52761wXj.Activity.Dmq);
            }
            if (z3) {
                color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.gdmIOq);
            } else {
                color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialDPHOMC);
            }
            c21502hBt.EZpvd.setTextColor(color);
            C55280xgv c55280xgv = new C55280xgv();
            C55251xgS c55251xgS3 = c21502hBt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            C55279xgu c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            c55279xgu.OLrzqt(C55298xhM.copydefault(4.0f, r4));
            c55279xgu.isConnected(C33522mxz.OLrzqt(color2, 25.5f));
            Unit unit = Unit.INSTANCE;
            c55280xgv.KWHzl(c55251xgS3, c55279xgu);
            c21502hBt.EZpvd.getBackground().setAlpha(z3 ? yII.EZpvd(25.5d) : 255);
        }
    }

    @Override // o.AbstractC24459ieI
    public android.view.View fetchVPNInfo() {
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            return c21502hBt.OLrzqt;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        Function1<? super SettingItemData, Unit> function1 = this.AhwBna;
        if (function1 != null) {
            function1.invoke(this.gEmmrt);
        }
    }

    public final void setupMinimumReceived(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            c21502hBt.djBIcL.setHelperLabelType(2);
            c21502hBt.djBIcL.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1));
            c21502hBt.AEQbTJ.setVisibility(8);
            c21502hBt.OLrzqt.setVisibility(8);
            c21502hBt.KWHzl.setText((dexMultiTokenInfoBean == null || str.length() == 0) ? "--" : C23271hvA.copydefault.KWHzl(str, dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean.getDecimals()));
        }
    }

    public final void setupLiquiditySelection(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super AbstractC22408hem, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            c21502hBt.djBIcL.setHelperLabelType(2);
            c21502hBt.djBIcL.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.onSetRating));
            c21502hBt.AEQbTJ.setVisibility(8);
            c21502hBt.OLrzqt.setVisibility(0);
            c21502hBt.KWHzl.setText(C24695iig.copydefault(str, C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt().OLrzqt().getValue(), true));
            c21502hBt.djBIcL.setHelperLabelType(1);
            C55258xgZ c55258xgZ = c21502hBt.djBIcL;
            c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this, function1));
            c21502hBt.KWHzl.setContentDescription("web3_dex_swap_transaction_detail_liquidity_row");
            android.widget.ImageView imageView = c21502hBt.OLrzqt;
            imageView.setOnClickListener(new Application(imageView, 1000L, this, str, str2, fragmentActivity, function1));
            android.widget.TextView textView = c21502hBt.KWHzl;
            textView.setOnClickListener(new Activity(textView, 1000L, this, str, str2, fragmentActivity, function1));
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, FragmentActivity fragmentActivity, Function1<? super AbstractC22408hem, Unit> function1) {
        C25352ivB.OLrzqt((android.content.Context) fragmentActivity, str, str2, true);
        function1.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.LIQUIDITY_ENTER.getButtonName(), ButtonType.OTHERS.getType()));
    }

    public final void setupServiceFee(@NotNull java.lang.CharSequence charSequence, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            c21502hBt.djBIcL.setHelperLabelType(2);
            c21502hBt.djBIcL.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged));
            c21502hBt.AEQbTJ.setVisibility(8);
            c21502hBt.OLrzqt.setVisibility(8);
            c21502hBt.KWHzl.setText(charSequence);
            c21502hBt.djBIcL.setHelperLabelType(1);
            C25352ivB.setOnDoubleCheckClickListener$default(c21502hBt.djBIcL, 0L, new Function1() { // from class: o.iuk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC25336ium.AEQbTJ(function0, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit AEQbTJ(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setupEstTime(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C21502hBt c21502hBt = this.OLrzqt;
        if (c21502hBt != null) {
            c21502hBt.djBIcL.setHelperLabelType(2);
            c21502hBt.djBIcL.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.invokespecialaVhqwO));
            c21502hBt.AEQbTJ.setVisibility(8);
            c21502hBt.OLrzqt.setVisibility(8);
            c21502hBt.KWHzl.setText(str);
        }
    }
}
