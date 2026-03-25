package o;

import androidx.collection.ArrayMapKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21828hNv extends android.widget.LinearLayout {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public hDL OLrzqt;
    public SwapState copydefault;

    /* JADX INFO: renamed from: o.hNv$Application */
    public static final class Application implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX INFO: renamed from: o.hNv$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.APPROVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.CANCEL_APPROVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.SWAP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.NO_WALLET.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.SA_DISABLED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.SA_NEED_TO_UPDATE_APP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.SA_SERVICE_UPGRADED_ACCOUNT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.SA_NOT_SMART_ACCOUNT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SwapState.INSUFFICIENT_BALANCE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[SwapState.INIT_SUCCESS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[SwapState.SWAP_INPUT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[SwapState.SWAP_AMOUNT_LOW.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SwapState.QUOTE_COIN_ERROR.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[SwapState.FUNCTION_UPGRADE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[SwapState.SWITCH_COIN.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[SwapState.COUNT_ERROR.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[SwapState.APPROVING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[SwapState.APPROVE_ERROR.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[SwapState.WALLET_LEGAL.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[SwapState.COIN_ERROR.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[SwapState.MPC_WALLET_LEGAL.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[SwapState.SWAP_INPUT_FAIL.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[SwapState.LIMIT_REGION.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[SwapState.BLACK_ADDRESS.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[SwapState.SWAP_CONFIG_FETCH_FAILED.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[SwapState.FETCHING_COUNT.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[SwapState.TRACKING_WALLET_SUCCESS.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[SwapState.CANCEL_APPROVING.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SwapState EZpvd() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21828hNv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = SwapState.INIT_SUCCESS;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.identifier);
        this.AEQbTJ = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW)) : null;
        AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21828hNv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21828hNv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21828hNv(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ() {
        if (getContext() == null) {
            return;
        }
        hDL hdlOLrzqt = hDL.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        this.OLrzqt = hdlOLrzqt;
        hDL hdl = null;
        if (hdlOLrzqt == null) {
            Intrinsics.gEmmrt("");
            hdlOLrzqt = null;
        }
        hdlOLrzqt.EZpvd.setContentDescription("web3_dex_trade_submit_button");
        hDL hdl2 = this.OLrzqt;
        if (hdl2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            hdl = hdl2;
        }
        hdl.AEQbTJ.setContentDescription("web3_dex_trade_submit_button");
    }

    public final void setTradeStateButton(@NotNull SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(str, "");
        SwapState swapState2 = SwapState.APPROVE;
        SwapState swapState3 = SwapState.APPROVING;
        SwapState swapState4 = SwapState.CANCEL_APPROVING;
        if (yDY.gEmmrt(swapState2, swapState3, swapState4).contains(this.copydefault) && swapState == SwapState.FETCHING_COUNT) {
            return;
        }
        this.copydefault = swapState;
        hDL hdl = this.OLrzqt;
        if (hdl == null) {
            Intrinsics.gEmmrt("");
            hdl = null;
        }
        if (swapState == swapState2 || swapState == swapState3 || swapState == SwapState.CANCEL_APPROVE || swapState == swapState4) {
            hdl.EZpvd.setVisibility(8);
            hdl.AEQbTJ.setVisibility(0);
        } else {
            hdl.AEQbTJ.setVisibility(8);
            hdl.EZpvd.setVisibility(0);
        }
        setTradeStateButton(swapState, dexMultiTokenInfoBean, str);
        setApproveTradeStateButton(swapState, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final C22495hgT c22495hgT, @NotNull final AbstractC32996moC abstractC32996moC, @NotNull final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(function1, "");
        hDL hdl = this.OLrzqt;
        if (hdl == null) {
            Intrinsics.gEmmrt("");
            hdl = null;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(hdl.AEQbTJ, 0L, new Function1() { // from class: o.hNw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21828hNv.EZpvd(this.OLrzqt, c22495hgT, abstractC32996moC, str, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(final C21828hNv c21828hNv, final C22495hgT c22495hgT, final AbstractC32996moC abstractC32996moC, final java.lang.String str, final Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int i = TaskDescription.OLrzqt[c21828hNv.EZpvd().ordinal()];
        if (i == 1 || i == 2) {
            C25352ivB.startVibrator$default(0L, 1, null);
            c21828hNv.AEQbTJ(c22495hgT);
            final boolean z = c21828hNv.EZpvd() == SwapState.CANCEL_APPROVE;
            java.lang.String str2 = z ? "1" : "0";
            final java.lang.String str3 = str2;
            c22495hgT.KWHzl(str2, new Function1() { // from class: o.hNA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21828hNv.EZpvd(this.AEQbTJ, c22495hgT, abstractC32996moC, str, z, function1, str3, (ApproveSwapData) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C21828hNv c21828hNv, final C22495hgT c22495hgT, AbstractC32996moC abstractC32996moC, java.lang.String str, final boolean z, final Function1 function1, final java.lang.String str2, final ApproveSwapData approveSwapData) {
        InterfaceC9854bdT interfaceC9854bdT;
        ApproveStatusGroup approveStatusGroup;
        Intrinsics.checkNotNullParameter(approveSwapData, "");
        SwapState swapStateEZpvd = c21828hNv.EZpvd();
        SwapState swapState = SwapState.APPROVE;
        if (swapStateEZpvd == swapState) {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, swapState, true, false));
        } else {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.CANCEL_APPROVE, true, false));
        }
        FragmentActivity activity = abstractC32996moC.getActivity();
        if (activity != null && (interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class)) != null) {
            java.lang.String walletId = approveSwapData.getWalletId();
            java.lang.String chainId = approveSwapData.getChainId();
            PlatformItem platForm = approveSwapData.getPlatForm();
            java.lang.String jsonData = approveSwapData.getJsonData();
            java.lang.String orderId = approveSwapData.getOrderId();
            java.lang.String dexContractAddress = approveSwapData.getDexContractAddress();
            UnsignedSwapData unSingedCallData = approveSwapData.getUnSingedCallData();
            java.lang.String bizLoad = unSingedCallData != null ? unSingedCallData.getBizLoad() : null;
            interfaceC9854bdT.AEQbTJ(activity, new DappInteractionArgs(walletId, null, chainId, platForm, jsonData, null, "dex", 3, null, null, dexContractAddress, (c21828hNv.EZpvd() != SwapState.CANCEL_APPROVE || (approveStatusGroup = c22495hgT.ejfBZ().getApproveStatusGroup()) == null) ? null : approveStatusGroup.getApprovedAmount(), z, true, orderId, true, null, null, DexTrackEventParameter.AEQbTJ.OLrzqt(str), null, null, null, null, null, null, null, 1, bizLoad, null, null, null, null, -201653502, null), new Function1() { // from class: o.hNx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21828hNv.AEQbTJ(z, function1, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.hNu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21828hNv.copydefault(c22495hgT, approveSwapData, str2, (NewCallbackBean) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, Function1 function1, android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("extra_universal_1", z);
        }
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(C22495hgT c22495hgT, ApproveSwapData approveSwapData, java.lang.String str, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return c22495hgT.EZpvd(newCallbackBean.getHeaderMap(), newCallbackBean.getBody(), approveSwapData.getOrderId(), str);
    }

    public final void AEQbTJ(C22495hgT c22495hgT) {
        C22877hne.OLrzqt.AEQbTJ((AbstractC23101hrq) null, c22495hgT.gwTjWJ(), "DEX", c22495hgT.AxsJAYaxsJAY());
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final AbstractC32996moC abstractC32996moC, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @NotNull final Function0<Unit> function04, @NotNull final Function0<Unit> function05, @NotNull final Function0<Unit> function06) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        hDL hdl = this.OLrzqt;
        if (hdl == null) {
            Intrinsics.gEmmrt("");
            hdl = null;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(hdl.EZpvd, 0L, new Function1() { // from class: o.hNz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21828hNv.AEQbTJ(this.KWHzl, abstractC32996moC, str, function0, function03, function05, function04, function06, function02, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C21828hNv c21828hNv, AbstractC32996moC abstractC32996moC, java.lang.String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, final Function0 function06, android.view.View view) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(view, "");
        switch (TaskDescription.OLrzqt[c21828hNv.EZpvd().ordinal()]) {
            case 3:
                androidx.fragment.app.FragmentManager childFragmentManager = abstractC32996moC.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C30449lbP.checkLegalDisclaimerAndProceed$default(childFragmentManager, null, new Function0() { // from class: o.hNC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21828hNv.OLrzqt(function06);
                    }
                }, 2, null);
                break;
            case 4:
                C25352ivB.startVibrator$default(0L, 1, null);
                C22877hne.OLrzqt.copydefault(str);
                xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
                if (xwo != null) {
                    androidx.fragment.app.FragmentManager childFragmentManager2 = abstractC32996moC.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    Application application = new Application();
                    if (C22416heu.zLjUOn()) {
                        listAhwBna = yDY.gEmmrt(UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.MPCWallet, UnsupportedWalletType.PrivateKeyWallet);
                    } else {
                        listAhwBna = yDY.AhwBna();
                    }
                    xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager2, application, (java.util.List) null, listAhwBna, (InterfaceC54856xXw) null, 20, (java.lang.Object) null);
                }
                function0.invoke();
                break;
            case 5:
            case 6:
                function02.invoke();
                break;
            case 7:
                function03.invoke();
                break;
            case 8:
                function04.invoke();
                break;
            case 9:
                function05.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0) {
        C25352ivB.startVibrator$default(0L, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setTradeStateButton(SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str) {
        java.lang.String originContractAddress;
        hDL hdl = null;
        if (!C56402yEa.EZpvd(SwapState.APPROVING).contains(swapState)) {
            hDL hdl2 = this.OLrzqt;
            if (hdl2 == null) {
                Intrinsics.gEmmrt("");
                hdl2 = null;
            }
            C52794wYp c52794wYp = hdl2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        }
        hDL hdl3 = this.OLrzqt;
        if (hdl3 == null) {
            Intrinsics.gEmmrt("");
            hdl3 = null;
        }
        hdl3.EZpvd.setOKDSType(257);
        switch (TaskDescription.OLrzqt[swapState.ordinal()]) {
            case 1:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DzOuPm), false, null, 4, null);
                hDL hdl4 = this.OLrzqt;
                if (hdl4 == null) {
                    Intrinsics.gEmmrt("");
                    hdl4 = null;
                }
                hdl4.EZpvd.setOKDSType(257);
                hDL hdl5 = this.OLrzqt;
                if (hdl5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl5;
                }
                hdl.EZpvd.setEnabled(false);
                break;
            case 3:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DzOuPm), false, null, 4, null);
                hDL hdl6 = this.OLrzqt;
                if (hdl6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl6;
                }
                hdl.EZpvd.setEnabled(true);
                break;
            case 4:
                java.lang.String string = getContext().getString(C23274hvD.Fragment.DaRZkR);
                Intrinsics.checkNotNullExpressionValue(string, "");
                setButtonText$default(this, string, false, null, 4, null);
                hDL hdl7 = this.OLrzqt;
                if (hdl7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl7;
                }
                hdl.EZpvd.setEnabled(true);
                break;
            case 5:
            case 6:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.setSessionActivity), false, null, 4, null);
                hDL hdl8 = this.OLrzqt;
                if (hdl8 == null) {
                    Intrinsics.gEmmrt("");
                    hdl8 = null;
                }
                hdl8.EZpvd.setOKDSType(257);
                hDL hdl9 = this.OLrzqt;
                if (hdl9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl9;
                }
                hdl.EZpvd.setEnabled(true);
                break;
            case 7:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.setSessionActivity), false, null, 4, null);
                hDL hdl10 = this.OLrzqt;
                if (hdl10 == null) {
                    Intrinsics.gEmmrt("");
                    hdl10 = null;
                }
                hdl10.EZpvd.setOKDSType(80);
                hDL hdl11 = this.OLrzqt;
                if (hdl11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl11;
                }
                hdl.EZpvd.setEnabled(true);
                break;
            case 8:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat2), false, null, 4, null);
                hDL hdl12 = this.OLrzqt;
                if (hdl12 == null) {
                    Intrinsics.gEmmrt("");
                    hdl12 = null;
                }
                hdl12.EZpvd.setOKDSType(257);
                hDL hdl13 = this.OLrzqt;
                if (hdl13 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl13;
                }
                hdl.EZpvd.setEnabled(true);
                break;
            case 9:
                if ((dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isMainChainCoin()) || dexMultiTokenInfoBean == null || (originContractAddress = dexMultiTokenInfoBean.getOriginContractAddress()) == null) {
                    originContractAddress = "";
                }
                if (dexMultiTokenInfoBean != null && C22380heK.OLrzqt.copydefault("default_trade").fARcdN().copydefault(originContractAddress, C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId()))) {
                    KWHzl(dexMultiTokenInfoBean);
                    hDL hdl14 = this.OLrzqt;
                    if (hdl14 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        hdl = hdl14;
                    }
                    C52794wYp c52794wYp2 = hdl.EZpvd;
                    c52794wYp2.setEnabled(true);
                    c52794wYp2.setOKDSType(259);
                    Intrinsics.copydefault(c52794wYp2);
                } else {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    setButtonText$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))), false, null, 4, null);
                    hDL hdl15 = this.OLrzqt;
                    if (hdl15 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        hdl = hdl15;
                    }
                    hdl.EZpvd.setEnabled(false);
                }
                break;
            case 27:
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DvMhtu), false, null, 4, null);
                hDL hdl16 = this.OLrzqt;
                if (hdl16 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl16;
                }
                hdl.EZpvd.setEnabled(false);
                break;
            case 28:
                setEnabled(false);
                setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.QXDzTk), false, null, 4, null);
                hDL hdl17 = this.OLrzqt;
                if (hdl17 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    hdl = hdl17;
                }
                hdl.EZpvd.setEnabled(false);
                break;
        }
        this.copydefault = swapState;
    }

    private final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setButtonText$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.RAQtXZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))), false, null, 4, null);
    }

    public static /* synthetic */ void setButtonText$default(C21828hNv c21828hNv, java.lang.String str, boolean z, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        c21828hNv.setButtonText(str, z, drawable);
    }

    public final void setButtonText(java.lang.String str, boolean z, android.graphics.drawable.Drawable drawable) {
        hDL hdl = this.OLrzqt;
        if (hdl == null) {
            Intrinsics.gEmmrt("");
            hdl = null;
        }
        if (z) {
            hdl.AEQbTJ.setText(str);
            C52794wYp c52794wYp = hdl.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
            hdl.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            return;
        }
        hdl.EZpvd.setText(str);
        C52794wYp c52794wYp2 = hdl.EZpvd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c52794wYp2.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context2));
        hdl.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public final void setApproveTradeStateButton(SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str) {
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        hDL hdl = null;
        hDL hdl2 = null;
        hDL hdl3 = null;
        if (!yDY.gEmmrt(SwapState.FETCHING_COUNT, SwapState.APPROVING, SwapState.CANCEL_APPROVING).contains(swapState)) {
            hDL hdl4 = this.OLrzqt;
            if (hdl4 == null) {
                Intrinsics.gEmmrt("");
                hdl4 = null;
            }
            C52794wYp c52794wYp = hdl4.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        }
        int i = TaskDescription.OLrzqt[swapState.ordinal()];
        if (i == 1) {
            hDL hdl5 = this.OLrzqt;
            if (hdl5 == null) {
                Intrinsics.gEmmrt("");
                hdl5 = null;
            }
            hdl5.AEQbTJ.setEnabled(true);
            if (dexMultiTokenInfoBean == null || (tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.OTwTPd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("coin", tokenSymbol)));
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.identifier);
            setButtonText(strKWHzl, true, drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW)) : null);
        } else if (i == 2) {
            hDL hdl6 = this.OLrzqt;
            if (hdl6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                hdl3 = hdl6;
            }
            hdl3.AEQbTJ.setEnabled(true);
            if (dexMultiTokenInfoBean == null || (tokenSymbol2 = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol2 = "";
            }
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setButtonText(C33069mpW.KWHzl(context2, C23274hvD.Fragment.BackHandler, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tokenSymbol2))), true, this.AEQbTJ);
        } else if (i == 17) {
            hDL hdl7 = this.OLrzqt;
            if (hdl7 == null) {
                Intrinsics.gEmmrt("");
                hdl7 = null;
            }
            hdl7.AEQbTJ.setEnabled(true);
            if (dexMultiTokenInfoBean2 != null) {
                dexMultiTokenInfoBean2.getChainId();
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.glXhWM), true, null, 4, null);
            hDL hdl8 = this.OLrzqt;
            if (hdl8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                hdl2 = hdl8;
            }
            hdl2.AEQbTJ.OLrzqt(100L);
        } else if (i == 29) {
            hDL hdl9 = this.OLrzqt;
            if (hdl9 == null) {
                Intrinsics.gEmmrt("");
                hdl9 = null;
            }
            hdl9.AEQbTJ.setEnabled(true);
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKt), true, null, 4, null);
            hDL hdl10 = this.OLrzqt;
            if (hdl10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                hdl = hdl10;
            }
            hdl.AEQbTJ.OLrzqt(100L);
        }
        this.copydefault = swapState;
    }
}
