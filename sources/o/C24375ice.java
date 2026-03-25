package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28108kPe;
import o.C23274hvD;
import o.C31172lox;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ice, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24375ice extends LinearLayoutCompat {
    public final java.util.Set<SwapState> AEQbTJ;
    public final java.util.Set<SwapState> EZpvd;
    public final java.util.Set<SwapState> KWHzl;
    public boolean OLrzqt;
    public SwapState copydefault;
    public final C21506hBx valueOf;

    /* JADX INFO: renamed from: o.ice$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[SwapState.values().length];
            try {
                iArr2[SwapState.NO_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[SwapState.SWAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SwapState.STAND_BY_DISH_WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SwapState.STAND_BY_LEVERAGE_WARNING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SwapState.APPROVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[SwapState.APPROVE_CONFIRMING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[SwapState.APPROVING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[SwapState.CANCEL_APPROVING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[SwapState.INSUFFICIENT_BALANCE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[SwapState.SWITCH_WALLET.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[SwapState.SA_NOT_SMART_ACCOUNT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[SwapState.SA_DISABLED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[SwapState.SA_NEED_TO_UPDATE_APP.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[SwapState.SA_SERVICE_UPGRADED_ACCOUNT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24375ice(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24375ice(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:53) call: o.ice.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24375ice(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24375ice(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        SwapState swapState = SwapState.INIT_SUCCESS;
        SwapState swapState2 = SwapState.SWAP_INPUT;
        SwapState swapState3 = SwapState.APPROVE;
        SwapState swapState4 = SwapState.APPROVING;
        this.KWHzl = yEE.AhwBna(swapState, swapState2, swapState3, swapState4, SwapState.APPROVE_CONFIRMING, SwapState.APPROVE_ERROR, SwapState.FETCHING_NONE, SwapState.FETCHING_ERROR, SwapState.STAND_BY_LEVERAGE, SwapState.STAND_BY_DISH, SwapState.SWITCH_COIN, SwapState.SAFE_MOON_SLIP_ERROR, SwapState.WALLET_LEGAL, SwapState.SWITCH_WALLET, SwapState.MPC_WALLET_LEGAL, SwapState.HETEROGENEOUS_CHAIN_INVALID, SwapState.GAS_DROP_STATE, SwapState.ZERO_FORM_AMOUNT, SwapState.PRE_CHECK_FAIL, SwapState.NEW_ADDRESS, SwapState.LOW_FROM_AMOUNT_FOR_LIMIT, SwapState.LIMIT_REGION);
        this.AEQbTJ = yEE.AhwBna(SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP, SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP, SwapState.SWAP_UNSUPPORTED_FOR_DAPP);
        this.EZpvd = yEE.AhwBna(swapState3, swapState4, SwapState.APPROVED_AND_NEED_CANCEL_APPROVE, SwapState.CANCEL_APPROVING);
        C21506hBx c21506hBxOLrzqt = C21506hBx.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21506hBxOLrzqt, "");
        this.valueOf = c21506hBxOLrzqt;
        this.copydefault = swapState;
        c21506hBxOLrzqt.copydefault.setContentDescription("web3_dex_trade_submit_button");
        c21506hBxOLrzqt.AEQbTJ.setContentDescription("web3_dex_trade_submit_button");
    }

    public final android.graphics.drawable.Drawable AEQbTJ(TransactionType transactionType, int i) {
        int iEZpvd = EZpvd(C52761wXj.Activity.htlTjW, transactionType, i);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.identifier);
        if (drawable != null) {
            return C33057mpK.copydefault(drawable, iEZpvd);
        }
        return null;
    }

    /* JADX INFO: renamed from: setTradeStateButton-rh5Nn64, reason: not valid java name */
    public final void m8626setTradeStateButtonrh5Nn64(@NotNull SwapState swapState, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TransactionType transactionType, boolean z, boolean z2, boolean z3, int i, java.lang.String str3, java.lang.String str4, boolean z4) {
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (this.EZpvd.contains(this.copydefault) && swapState == SwapState.FETCHING_QUOTES) {
            return;
        }
        this.copydefault = swapState;
        m8628setTradeStateButtonQuoteInfokY7h8eo(str, str2, transactionType, z, z2, z3, i, str3, str4, z4);
    }

    /* JADX INFO: renamed from: setTradeStateButtonQuoteInfo-kY7h8eo, reason: not valid java name */
    public final void m8628setTradeStateButtonQuoteInfokY7h8eo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TransactionType transactionType, boolean z, boolean z2, boolean z3, int i, java.lang.String str3, java.lang.String str4, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.OLrzqt = z2;
        boolean zContains = this.EZpvd.contains(this.copydefault);
        C21506hBx c21506hBx = this.valueOf;
        C52794wYp c52794wYp = c21506hBx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(zContains ^ true ? 0 : 8);
        C52794wYp c52794wYp2 = c21506hBx.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(zContains ? 0 : 8);
        m8627setTradeStateButtonMessagekY7h8eo(this.copydefault, str, str2, transactionType, z3, z, i, str3, str4, z4);
        m8623setApproveTradeStateButton5JNcyC8(this.copydefault, str, z, transactionType, i);
    }

    /* JADX INFO: renamed from: o.ice$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ C24375ice AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ androidx.fragment.app.FragmentManager KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28109kPf c28109kPf, C24375ice c24375ice, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c28109kPf;
            this.AYXKKw = c24375ice;
            this.KWHzl = fragmentManager;
            this.AEQbTJ = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C28110kPg c28110kPg = C28110kPg.KWHzl;
                c28110kPg.copydefault(new AbstractC28108kPe.TaskDescription(this.copydefault));
                C25352ivB.startVibrator$default(0L, 1, null);
                SwapState swapStateAEQbTJ = this.AYXKKw.AEQbTJ();
                int i = StateListAnimator.KWHzl[swapStateAEQbTJ.ordinal()];
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 1 || this.AYXKKw.AEQbTJ.contains(swapStateAEQbTJ) || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15) {
                        this.AEQbTJ.invoke(swapStateAEQbTJ);
                        return;
                    }
                    return;
                }
                c28110kPg.copydefault(new AbstractC28108kPe.FragmentManager(this.copydefault));
                C30449lbP.checkLegalDisclaimerAndProceed$default(this.KWHzl, null, new ActionBar(this.AEQbTJ, swapStateAEQbTJ), 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ice$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwapState AEQbTJ() {
        Objects.toString(this.copydefault);
        return this.copydefault;
    }

    /* JADX INFO: renamed from: setBalanceTipMessage-Kubx95w, reason: not valid java name */
    public final void m8624setBalanceTipMessageKubx95w(java.lang.String str, TransactionType transactionType, int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        m8618setButtonTextRwFZ67U$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.RAQtXZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(str), 0, 1, null)))), false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    /* JADX INFO: renamed from: setButtonText-RwFZ67U$default, reason: not valid java name */
    public static /* synthetic */ void m8618setButtonTextRwFZ67U$default(C24375ice c24375ice, java.lang.String str, boolean z, TransactionType transactionType, int i, android.graphics.drawable.Drawable drawable, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        c24375ice.m8625setButtonTextRwFZ67U(str, z, transactionType, i, (i2 & 16) != 0 ? null : drawable, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: setButtonText-RwFZ67U, reason: not valid java name */
    public final void m8625setButtonTextRwFZ67U(java.lang.String str, boolean z, TransactionType transactionType, int i, android.graphics.drawable.Drawable drawable, boolean z2, boolean z3) {
        C21506hBx c21506hBx = this.valueOf;
        if (z) {
            C52794wYp c52794wYp = c21506hBx.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            KWHzl(c52794wYp, transactionType, i);
            c21506hBx.copydefault.setText(str);
            C52794wYp c52794wYp2 = c21506hBx.copydefault;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp2.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
            if (drawable != null && !z3) {
                c21506hBx.copydefault.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
            c21506hBx.copydefault.setButtonGravity(17);
            return;
        }
        C52794wYp c52794wYp3 = c21506hBx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        KWHzl(c52794wYp3, transactionType, i);
        c21506hBx.AEQbTJ.setText(str);
        C52794wYp c52794wYp4 = c21506hBx.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c52794wYp4.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context2));
        if (z2) {
            c21506hBx.AEQbTJ.setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            c21506hBx.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        c21506hBx.AEQbTJ.setButtonGravity(17);
    }

    public final void KWHzl(C52794wYp c52794wYp, TransactionType transactionType, int i) {
        if (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl())) {
            c52794wYp.setOKDSType(259);
            return;
        }
        int i2 = StateListAnimator.KWHzl[this.copydefault.ordinal()];
        if (i2 == 1) {
            c52794wYp.setOKDSType(257);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            int i3 = StateListAnimator.OLrzqt[transactionType.ordinal()];
            if (i3 == 1) {
                c52794wYp.setOKDSType(261);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c52794wYp.setOKDSType(262);
            }
        } else {
            c52794wYp.setOKDSType(259);
        }
        c52794wYp.fARcdN().valueOf(ContextCompat.getColor(c52794wYp.getContext(), C52761wXj.Activity.RkASWs));
        c52794wYp.getNewProxyInstance().KWHzl(c52794wYp, c52794wYp.fARcdN());
    }

    /* JADX INFO: renamed from: setTradeStateButtonMessage-kY7h8eo, reason: not valid java name */
    public final void m8627setTradeStateButtonMessagekY7h8eo(SwapState swapState, java.lang.String str, java.lang.String str2, TransactionType transactionType, boolean z, boolean z2, int i, java.lang.String str3, java.lang.String str4, boolean z3) {
        SwapState swapState2 = SwapState.FETCHING_QUOTES;
        if (!yDY.gEmmrt(swapState2, SwapState.APPROVE_CONFIRMING, SwapState.APPROVING).contains(swapState)) {
            C52794wYp c52794wYp = this.valueOf.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        }
        if (swapState == SwapState.NO_WALLET) {
            java.lang.String string = getContext().getString(C23274hvD.Fragment.DaRZkR);
            Intrinsics.checkNotNullExpressionValue(string, "");
            m8618setButtonTextRwFZ67U$default(this, string, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setEnabled(true);
            return;
        }
        if (swapState == SwapState.SWITCH_WALLET) {
            if (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl())) {
                java.lang.String string2 = getContext().getString(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi181);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                m8618setButtonTextRwFZ67U$default(this, string2, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
                this.valueOf.AEQbTJ.setEnabled(true);
                return;
            }
            m8618setButtonTextRwFZ67U$default(this, KWHzl(transactionType, i, str2, str), false, transactionType, i, EZpvd(ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe)), false, false, 96, null);
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        if (swapState == SwapState.TRACKING_WALLET_SUCCESS) {
            java.lang.String string3 = getContext().getString(C23274hvD.Fragment.QXDzTk);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            m8618setButtonTextRwFZ67U$default(this, string3, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        if (swapState == SwapState.NoSupportTPLS) {
            m8618setButtonTextRwFZ67U$default(this, copydefault(i, str), false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        if (swapState == SwapState.SA_NOT_SMART_ACCOUNT) {
            java.lang.String string4 = getContext().getString(C23274hvD.Fragment.setRatingType);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            m8618setButtonTextRwFZ67U$default(this, string4, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setOKDSType(257);
            this.valueOf.AEQbTJ.setEnabled(true);
            return;
        }
        if (swapState == SwapState.SA_DISABLED) {
            java.lang.String string5 = getContext().getString(C23274hvD.Fragment.MediaSessionCompat1);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            m8618setButtonTextRwFZ67U$default(this, string5, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setOKDSType(257);
            this.valueOf.AEQbTJ.setEnabled(true);
            return;
        }
        if (swapState == SwapState.SA_NEED_TO_UPDATE_APP) {
            java.lang.String string6 = getContext().getString(C23274hvD.Fragment.MediaSessionCompat1);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            m8618setButtonTextRwFZ67U$default(this, string6, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setOKDSType(257);
            this.valueOf.AEQbTJ.setEnabled(true);
            return;
        }
        if (swapState == SwapState.SA_SERVICE_UPGRADED_ACCOUNT) {
            java.lang.String string7 = getContext().getString(C23274hvD.Fragment.MediaSessionCompat1);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            m8618setButtonTextRwFZ67U$default(this, string7, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setOKDSType(257);
            this.valueOf.AEQbTJ.setEnabled(true);
            return;
        }
        SwapState swapState3 = SwapState.NO_QUOTE_FETCHED;
        SwapState swapState4 = SwapState.NO_LIQUIDITY_AT_THE_MOMENT;
        if (yDY.gEmmrt(swapState3, swapState4).contains(swapState)) {
            m8618setButtonTextRwFZ67U$default(this, copydefault(i, str), false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        if (swapState == SwapState.INSUFFICIENT_BALANCE) {
            if (z3) {
                m8624setBalanceTipMessageKubx95w(str, transactionType, i);
                this.valueOf.AEQbTJ.setEnabled(true);
                return;
            } else {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                m8618setButtonTextRwFZ67U$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(str), 0, 1, null)))), false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
                this.valueOf.AEQbTJ.setEnabled(false);
                return;
            }
        }
        if (yDY.gEmmrt(swapState3, swapState4).contains(swapState) || this.KWHzl.contains(swapState) || this.OLrzqt) {
            C31172lox.TaskDescription taskDescription = C31172lox.Companion;
            m8618setButtonTextRwFZ67U$default(this, KWHzl(transactionType, taskDescription.OLrzqt(), str2, str), false, transactionType, i, C31172lox.KWHzl(i, taskDescription.OLrzqt()) ? EZpvd(ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe)) : null, false, false, 96, null);
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        if (swapState == SwapState.SAFEMOON_COIN) {
            KWHzl(transactionType, str2, str3, str4, str, i, z, z2);
            return;
        }
        if (swapState == SwapState.SWAP || swapState == SwapState.STAND_BY_DISH_WARNING || swapState == SwapState.STAND_BY_LEVERAGE_WARNING) {
            KWHzl(transactionType, str2, str3, str4, str, i, z, z2);
            return;
        }
        if (!this.AEQbTJ.contains(swapState)) {
            if (swapState != swapState2 || z2) {
                return;
            }
            this.valueOf.AEQbTJ.setEnabled(false);
            return;
        }
        java.lang.String string8 = getContext().getString(C23274hvD.Fragment.MediaBrowserCompatItemCallback);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dNxZaP);
        if (drawable != null) {
            drawable.setTint(EZpvd(C52761wXj.Activity.DcMfJKffREWX, transactionType, i));
        }
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context2)));
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iAhwBna, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context3))));
        }
        Unit unit = Unit.INSTANCE;
        m8618setButtonTextRwFZ67U$default(this, string8, false, transactionType, i, drawable, true, false, 64, null);
        this.valueOf.AEQbTJ.setEnabled(z2);
    }

    public final void KWHzl(TransactionType transactionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, boolean z, boolean z2) {
        java.lang.String strKWHzl;
        if (transactionType == TransactionType.Buy) {
            strKWHzl = EZpvd(str, str2, str3);
        } else {
            strKWHzl = KWHzl(str4, str2, str, str3);
        }
        m8618setButtonTextRwFZ67U$default(this, strKWHzl, false, transactionType, i, (z || C31172lox.KWHzl(i, C31172lox.Companion.KWHzl())) ? null : EZpvd(EZpvd(C52761wXj.Activity.htlTjW, transactionType, i)), true, false, 64, null);
        this.valueOf.AEQbTJ.setEnabled(z2);
    }

    public final java.lang.String KWHzl(TransactionType transactionType, int i, java.lang.String str, java.lang.String str2) {
        if (transactionType == TransactionType.Buy) {
            return AEQbTJ(i, str);
        }
        return copydefault(i, str2);
    }

    public final android.graphics.drawable.Drawable EZpvd(@androidx.annotation.ColorInt int i) {
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C57406yhn.Activity.aKErDB);
        if (drawable == null) {
            return null;
        }
        drawable.setTint(i);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context)));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        drawable.setBounds(0, 0, iAhwBna, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context2))));
        return drawable;
    }

    public final java.lang.String copydefault(int i, java.lang.String str) {
        if (C31172lox.KWHzl(i, C31172lox.Companion.OLrzqt())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.dispatchMediaButtonEvent, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33069mpW.KWHzl(context2, C23274hvD.Fragment.MediaBrowserCompatSubscriptionCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
    }

    public final java.lang.String AEQbTJ(int i, java.lang.String str) {
        if (C31172lox.KWHzl(i, C31172lox.Companion.OLrzqt())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.getTransportControls, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33069mpW.KWHzl(context2, C23274hvD.Fragment.isEmpty, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 == null || str2.length() == 0 || str.length() == 0 || str3 == null || str3.length() == 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.isEmpty, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int i = C23274hvD.Fragment.getSessionActivity;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C33069mpW.KWHzl(context2, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt", C23271hvA.getShowData$default(c23271hvA, str2, false, roundingMode, false, false, 10, null)), C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt("fiatValue", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str3, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null))));
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.dispatchMediaButtonEvent, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int i = C23274hvD.Fragment.RemoteActionCompatParcelizer;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C33069mpW.KWHzl(context2, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt", C23271hvA.getShowData$default(c23271hvA, str2, false, roundingMode, false, false, 10, null)), C56390yDp.OLrzqt("token", str3), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str4, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null))));
    }

    public final int EZpvd(@androidx.annotation.ColorRes int i, TransactionType transactionType, int i2) {
        if (C31172lox.KWHzl(i2, C31172lox.Companion.KWHzl())) {
            return ContextCompat.getColor(getContext(), i);
        }
        int i3 = StateListAnimator.OLrzqt[transactionType.ordinal()];
        if (i3 == 1) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseHighlightsContent$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallHighlightsContent$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: setApproveTradeStateButton-5JNcyC8$default, reason: not valid java name */
    public static /* synthetic */ void m8617setApproveTradeStateButton5JNcyC8$default(C24375ice c24375ice, SwapState swapState, java.lang.String str, boolean z, TransactionType transactionType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = C31172lox.Companion.KWHzl();
        }
        c24375ice.m8623setApproveTradeStateButton5JNcyC8(swapState, str, z2, transactionType, i);
    }

    /* JADX INFO: renamed from: setApproveTradeStateButton-5JNcyC8, reason: not valid java name */
    public final void m8623setApproveTradeStateButton5JNcyC8(SwapState swapState, java.lang.String str, boolean z, TransactionType transactionType, int i) {
        SwapState swapState2 = SwapState.FETCHING_QUOTES;
        if (!yDY.gEmmrt(swapState2, SwapState.APPROVE_CONFIRMING, SwapState.APPROVING, SwapState.CANCEL_APPROVING).contains(swapState)) {
            C52794wYp c52794wYp = this.valueOf.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        }
        switch (StateListAnimator.KWHzl[swapState.ordinal()]) {
            case 5:
                this.valueOf.copydefault.setEnabled(z);
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                m8618setButtonTextRwFZ67U$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.OTwTPd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("coin", str))), true, transactionType, i, AEQbTJ(transactionType, i), false, false, 96, null);
                break;
            case 6:
                this.valueOf.copydefault.setEnabled(true);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                m8618setButtonTextRwFZ67U$default(this, C33069mpW.KWHzl(context2, C23274hvD.Fragment.BackHandler, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", str))), true, transactionType, i, AEQbTJ(transactionType, i), false, false, 96, null);
                break;
            case 7:
                this.valueOf.copydefault.setEnabled(true);
                this.valueOf.copydefault.OLrzqt(500L);
                java.lang.String string = getContext().getString(C23274hvD.Fragment.DNMMPQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                m8618setButtonTextRwFZ67U$default(this, string, true, transactionType, i, null, false, true, 48, null);
                break;
            case 8:
                this.valueOf.copydefault.setEnabled(true);
                java.lang.String string2 = getContext().getString(C23274hvD.Fragment.glXhWM);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                m8618setButtonTextRwFZ67U$default(this, string2, true, transactionType, i, null, false, true, 48, null);
                this.valueOf.copydefault.OLrzqt(100L);
                break;
            case 9:
                this.valueOf.copydefault.setEnabled(true);
                this.valueOf.copydefault.OLrzqt(100L);
                java.lang.String string3 = getContext().getString(C23274hvD.Fragment.BackHandlerKt);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                m8618setButtonTextRwFZ67U$default(this, string3, true, transactionType, i, null, false, true, 48, null);
                break;
            default:
                if (swapState == swapState2) {
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    m8618setButtonTextRwFZ67U$default(this, C33069mpW.KWHzl(context3, C23274hvD.Fragment.OTwTPd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("coin", str))), true, transactionType, i, AEQbTJ(transactionType, i), false, false, 96, null);
                }
                break;
        }
        this.copydefault = swapState;
        Objects.toString(swapState);
    }

    /* JADX INFO: renamed from: updateButtonLoadingForDAppRedirect-Kubx95w$default, reason: not valid java name */
    public static /* synthetic */ void m8622updateButtonLoadingForDAppRedirectKubx95w$default(C24375ice c24375ice, boolean z, TransactionType transactionType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C31172lox.Companion.KWHzl();
        }
        c24375ice.AEQbTJ(z, transactionType, i);
    }

    public final void AEQbTJ(boolean z, @NotNull TransactionType transactionType, int i) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (z) {
            this.valueOf.AEQbTJ.OLrzqt(100L);
            java.lang.String string = getContext().getString(C23274hvD.Fragment.MediaBrowserCompatItemCallback);
            Intrinsics.checkNotNullExpressionValue(string, "");
            m8618setButtonTextRwFZ67U$default(this, string, false, transactionType, i, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            return;
        }
        C52794wYp c52794wYp = this.valueOf.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dNxZaP);
        java.lang.String string2 = getContext().getString(C23274hvD.Fragment.MediaBrowserCompatItemCallback);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (drawable != null) {
            drawable.setTint(EZpvd(C52761wXj.Activity.DcMfJKffREWX, transactionType, i));
        }
        if (drawable != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context)));
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iAhwBna, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, context2))));
        }
        Unit unit = Unit.INSTANCE;
        m8618setButtonTextRwFZ67U$default(this, string2, false, transactionType, i, drawable, true, false, 64, null);
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C52794wYp c52794wYp = this.valueOf.copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, function0));
    }

    public final void EZpvd(@NotNull Function1<? super SwapState, Unit> function1, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C28109kPf c28109kPf) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c28109kPf, "");
        C52794wYp c52794wYp = this.valueOf.AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, c28109kPf, this, fragmentManager, function1));
    }

    /* JADX INFO: renamed from: o.ice$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ SwapState OLrzqt;
        public final /* synthetic */ Function1<SwapState, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.trade.features.home.ui.meme.statepool.SwapState, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super SwapState, Unit> function1, SwapState swapState) {
            this.copydefault = function1;
            this.OLrzqt = swapState;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            this.copydefault.invoke(this.OLrzqt);
        }
    }
}
