package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC30595leC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30756lhE extends C52794wYp {
    public StateListAnimator EZpvd;

    /* JADX INFO: renamed from: o.lhE$StateListAnimator */
    public interface StateListAnimator {
        void hDKMBd();
    }

    /* JADX INFO: renamed from: o.lhE$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[AdvancedApproveState.values().length];
            try {
                iArr2[AdvancedApproveState.NEED_APPROVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdvancedApproveState.CANCEL_APPROVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[AdvancedApproveState.APPROVING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdvancedApproveState.CANCEL_APPROVING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30756lhE(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.wYp.EZpvd()Ljava/util/ArrayList; */
    public final StateListAnimator EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:27) call: o.lhE.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30756lhE(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30756lhE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        setOnClickListener(new ActionBar(this, 1000L, this));
        setEnabled(false);
    }

    public final void KWHzl(AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        int i = TaskDescription.KWHzl[advancedTradeType.ordinal()];
        if (i == 1) {
            setText(C33069mpW.copydefault(C23274hvD.Fragment.accesstrackPipAnimationHintViewpositionInWindow, C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))));
            setOKDSType(261);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setText(C33069mpW.copydefault(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintView2, C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))));
            setOKDSType(262);
        }
    }

    public final void copydefault(@NotNull C30760lhI c30760lhI) {
        Intrinsics.checkNotNullParameter(c30760lhI, "");
        InterfaceC30595leC interfaceC30595leCAEQbTJ = c30760lhI.AEQbTJ();
        AdvancedQuoteUiData advancedQuoteUiDataKWHzl = c30760lhI.KWHzl();
        AdvancedTradeType advancedTradeTypeCopydefault = c30760lhI.copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = c30760lhI.OLrzqt();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = c30760lhI.EZpvd();
        setEnabled(!copydefault(interfaceC30595leCAEQbTJ) && (advancedQuoteUiDataKWHzl != null || AEQbTJ(interfaceC30595leCAEQbTJ)));
        KWHzl(advancedTradeTypeCopydefault, dexMultiTokenInfoBeanOLrzqt, dexMultiTokenInfoBeanEZpvd, interfaceC30595leCAEQbTJ);
    }

    public final void KWHzl(AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, InterfaceC30595leC interfaceC30595leC) {
        java.lang.String strGEmmrt;
        java.lang.String strKWHzl;
        if (interfaceC30595leC instanceof InterfaceC30595leC.ActionBar) {
            copydefault();
            return;
        }
        setCompoundDrawablesRelative(null, null, null, null);
        if (interfaceC30595leC instanceof InterfaceC30595leC.Application) {
            setText(((InterfaceC30595leC.Application) interfaceC30595leC).OLrzqt() ? C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi19 : C23274hvD.Fragment.wlaJM);
            setOKDSType(257);
            return;
        }
        java.lang.String strCopydefault = "";
        if (interfaceC30595leC instanceof InterfaceC30595leC.Activity) {
            InterfaceC30595leC.Activity activity = (InterfaceC30595leC.Activity) interfaceC30595leC;
            boolean z = activity.KWHzl() == AdvancedApproveState.APPROVING || activity.KWHzl() == AdvancedApproveState.CANCEL_APPROVING;
            int i = TaskDescription.AEQbTJ[activity.KWHzl().ordinal()];
            int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : C23274hvD.Fragment.aCSzUz : C23274hvD.Fragment.glXhWM : C23274hvD.Fragment.aGOrKO : C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImpl;
            setOKDSType(259);
            if (i2 != 0) {
                strCopydefault = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null), 0, 1, null))));
            }
            setText(strCopydefault);
            copydefault(z);
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper) {
            gLQ glqOLrzqt = ((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strCopydefault2 = glqOLrzqt.copydefault(context);
            if (strCopydefault2 != null) {
                setText(strCopydefault2);
                setOKDSType(257);
                return;
            } else {
                KWHzl(advancedTradeType, dexMultiTokenInfoBean);
                return;
            }
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Dialog) {
            if (advancedTradeType == AdvancedTradeType.SELL) {
                strGEmmrt = C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null);
            } else {
                strGEmmrt = C33129mqd.gEmmrt(dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null);
            }
            if (((InterfaceC30595leC.Dialog) interfaceC30595leC).EZpvd()) {
                setOKDSType(259);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                strKWHzl = C33069mpW.KWHzl(context2, C23274hvD.Fragment.RAQtXZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(strGEmmrt), 0, 1, null))));
            } else {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                strKWHzl = C33069mpW.KWHzl(context3, C23274hvD.Fragment.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(strGEmmrt), 0, 1, null))));
            }
            setText(strKWHzl);
            return;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.PictureInPictureParams) {
            KWHzl(advancedTradeType, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, ((InterfaceC30595leC.PictureInPictureParams) interfaceC30595leC).AEQbTJ());
        } else {
            copydefault(false);
            KWHzl(advancedTradeType, dexMultiTokenInfoBean);
        }
    }

    private final void copydefault(boolean z) {
        if (z) {
            C52794wYp.startLoading$default(this, 0L, 1, null);
        } else {
            C23302hvf.KWHzl(this, "web3_dex_trade_submit_button");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0073 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(InterfaceC30595leC interfaceC30595leC) {
        if (!(interfaceC30595leC instanceof InterfaceC30595leC.ClipData) && !(interfaceC30595leC instanceof InterfaceC30595leC.StateListAnimator) && !(interfaceC30595leC instanceof InterfaceC30595leC.ContentResolver) && !(interfaceC30595leC instanceof InterfaceC30595leC.ComponentCallbacks2) && !(interfaceC30595leC instanceof InterfaceC30595leC.Fragment) && !(interfaceC30595leC instanceof InterfaceC30595leC.ComponentCallbacks) && !(interfaceC30595leC instanceof InterfaceC30595leC.FragmentManager) && !(interfaceC30595leC instanceof InterfaceC30595leC.TaskStackBuilder) && !(interfaceC30595leC instanceof InterfaceC30595leC.SharedElementCallback) && interfaceC30595leC != null) {
            if (interfaceC30595leC instanceof InterfaceC30595leC.PictureInPictureParams) {
                InterfaceC30595leC.PictureInPictureParams pictureInPictureParams = (InterfaceC30595leC.PictureInPictureParams) interfaceC30595leC;
                if (!pictureInPictureParams.KWHzl() && !copydefault(pictureInPictureParams.AEQbTJ())) {
                    return false;
                }
            } else if (interfaceC30595leC instanceof InterfaceC30595leC.Dialog) {
                if (!((InterfaceC30595leC.Dialog) interfaceC30595leC).EZpvd()) {
                }
            } else {
                if (!(interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper)) {
                    if (interfaceC30595leC instanceof InterfaceC30595leC.Activity) {
                        InterfaceC30595leC.Activity activity = (InterfaceC30595leC.Activity) interfaceC30595leC;
                        if (activity.KWHzl() == AdvancedApproveState.NEED_APPROVE || activity.KWHzl() == AdvancedApproveState.CANCEL_APPROVE) {
                        }
                    }
                    return false;
                }
                if (!((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt().copydefault()) {
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o.lhE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C30756lhE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C30756lhE c30756lhE) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c30756lhE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StateListAnimator stateListAnimatorEZpvd = this.copydefault.EZpvd();
                if (stateListAnimatorEZpvd != null) {
                    stateListAnimatorEZpvd.hDKMBd();
                }
            }
        }
    }

    public final boolean AEQbTJ(InterfaceC30595leC interfaceC30595leC) {
        if (interfaceC30595leC instanceof InterfaceC30595leC.Application) {
            return true;
        }
        if (!(interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper)) {
            return false;
        }
        gLQ glqOLrzqt = ((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) glqOLrzqt.copydefault(context));
    }

    public final void copydefault() {
        setText(C33070mpX.AYXKKw(C23274hvD.Fragment.YFmri));
        setCompoundDrawablePadding(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dNxZaP);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.htlTjW));
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
        } else {
            drawableKWHzl = null;
        }
        setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
        setOKDSType(259);
    }
}
