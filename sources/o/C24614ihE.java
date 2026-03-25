package o;

import androidx.collection.ArrayMapKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.beans.SwapButtonAnalytics;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C24614ihE;
import o.C52761wXj;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ihE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24614ihE extends android.widget.LinearLayout {
    public SwapState KWHzl;
    public final android.graphics.drawable.Drawable OLrzqt;
    public C21506hBx copydefault;

    /* JADX INFO: renamed from: o.ihE$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.APPROVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.REGISTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.SWAP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.NO_WALLET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 8;
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
                iArr[SwapState.APPROVING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SwapState.APPROVE_CONFIRMING.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[SwapState.FETCHING_NONE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[SwapState.FETCHING_ERROR.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[SwapState.APPROVE_ERROR.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[SwapState.STAND_BY_LEVERAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[SwapState.SWITCH_COIN.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[SwapState.WALLET_LEGAL.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[SwapState.SAFE_MOON_SLIP_ERROR.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[SwapState.HETEROGENEOUS_CHAIN_INVALID.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[SwapState.GAS_DROP_STATE.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[SwapState.MPC_WALLET_LEGAL.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[SwapState.LIMIT_REGION.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[SwapState.BLACK_ADDRESS.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[SwapState.SWAP_CONFIG_FETCH_FAILED.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[SwapState.SWITCH_WALLET.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[SwapState.TRACKING_WALLET_SUCCESS.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[SwapState.CANCEL_APPROVING.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr[SwapState.REGISTERING.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SwapState AEQbTJ() {
        return this.KWHzl;
    }

    public C24614ihE(android.content.Context context) {
        super(context);
        this.KWHzl = SwapState.INIT_SUCCESS;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.identifier);
        this.OLrzqt = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW)) : null;
        copydefault(context, (android.util.AttributeSet) null);
    }

    public C24614ihE(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = SwapState.INIT_SUCCESS;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.identifier);
        this.OLrzqt = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW)) : null;
        copydefault(context, attributeSet);
    }

    public C24614ihE(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = SwapState.INIT_SUCCESS;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.identifier);
        this.OLrzqt = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW)) : null;
        copydefault(context, attributeSet);
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        if (context == null) {
            return;
        }
        C21506hBx c21506hBxOLrzqt = C21506hBx.OLrzqt(android.view.LayoutInflater.from(context), this);
        this.copydefault = c21506hBxOLrzqt;
        if (c21506hBxOLrzqt != null && (c52794wYp2 = c21506hBxOLrzqt.AEQbTJ) != null) {
            c52794wYp2.setContentDescription("web3_dex_trade_submit_button");
        }
        C21506hBx c21506hBx = this.copydefault;
        if (c21506hBx == null || (c52794wYp = c21506hBx.copydefault) == null) {
            return;
        }
        c52794wYp.setContentDescription("web3_dex_trade_submit_button");
    }

    public final void setTradeStateButton(@NotNull SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z, boolean z2, DeFiPlatformForSwap deFiPlatformForSwap, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SwapState swapState2 = SwapState.APPROVE;
        SwapState swapState3 = SwapState.APPROVING;
        SwapState swapState4 = SwapState.REGISTER;
        SwapState swapState5 = SwapState.REGISTERING;
        SwapState swapState6 = SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
        SwapState swapState7 = SwapState.CANCEL_APPROVING;
        if (yDY.gEmmrt(swapState2, swapState3, swapState4, swapState5, swapState6, swapState7).contains(this.KWHzl) && swapState == SwapState.FETCHING_QUOTES) {
            return;
        }
        this.KWHzl = swapState;
        C21506hBx c21506hBx = this.copydefault;
        if (c21506hBx != null) {
            if (yDY.gEmmrt(swapState2, swapState3, swapState4, swapState5, swapState6, swapState7).contains(swapState)) {
                c21506hBx.AEQbTJ.setVisibility(8);
                c21506hBx.copydefault.setVisibility(0);
                function1.invoke(java.lang.Boolean.TRUE);
            } else {
                c21506hBx.copydefault.setVisibility(8);
                c21506hBx.AEQbTJ.setVisibility(0);
                function1.invoke(java.lang.Boolean.FALSE);
            }
            setTradeStateButton(swapState, dexMultiTokenInfoBean, z, z2, deFiPlatformForSwap);
            setApproveTradeStateButton(swapState, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z2);
        }
    }

    public static /* synthetic */ void approveConfirm$default(C24614ihE c24614ihE, java.lang.String str, AbstractC23101hrq abstractC23101hrq, AbstractC32996moC abstractC32996moC, java.lang.String str2, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        c24614ihE.KWHzl(str, abstractC23101hrq, abstractC32996moC, str2, function1, function12);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull final AbstractC32996moC abstractC32996moC, final java.lang.String str2, @NotNull final Function1<? super android.os.Bundle, Unit> function1, @NotNull final Function1<? super SwapState, Unit> function12) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        C21506hBx c21506hBx = this.copydefault;
        if (c21506hBx == null || (c52794wYp = c21506hBx.copydefault) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp, 0L, new Function1() { // from class: o.ihD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24614ihE.copydefault(function12, this, abstractC23101hrq, str, abstractC32996moC, str2, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(Function1 function1, final C24614ihE c24614ihE, final AbstractC23101hrq abstractC23101hrq, final java.lang.String str, final AbstractC32996moC abstractC32996moC, java.lang.String str2, final Function1 function12, android.view.View view) {
        DeFiPlatformForSwap selectedDeFiPlatform;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        Intrinsics.checkNotNullParameter(view, "");
        function1.invoke(c24614ihE.AEQbTJ());
        int i = Activity.AEQbTJ[c24614ihE.AEQbTJ().ordinal()];
        if (i == 1 || i == 2) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) != null) {
                java.lang.String defiPlatformId = selectedDeFiPlatform.getDefiPlatformId();
                if (defiPlatformId == null) {
                    defiPlatformId = "";
                }
                java.lang.String name = selectedDeFiPlatform.getName();
                if (name == null) {
                    name = "";
                }
                abstractC23101hrq.EZpvd(defiPlatformId, name);
            }
            C25352ivB.startVibrator$default(0L, 1, null);
            c24614ihE.AEQbTJ(abstractC23101hrq);
            final boolean z = c24614ihE.AEQbTJ() == SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
            final java.lang.String str3 = z ? "1" : "0";
            abstractC23101hrq.OLrzqt(str3, new Function1() { // from class: o.ihR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24614ihE.EZpvd(this.EZpvd, abstractC23101hrq, abstractC32996moC, str, z, function12, str3, (ApproveSwapData) obj);
                }
            });
        } else if (i == 3) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh2 != null && (selectedDeFiPlatform2 = quotePriceResAxsJAYsNCnLh2.getSelectedDeFiPlatform()) != null) {
                java.lang.String defiPlatformId2 = selectedDeFiPlatform2.getDefiPlatformId();
                if (defiPlatformId2 == null) {
                    defiPlatformId2 = "";
                }
                java.lang.String name2 = selectedDeFiPlatform2.getName();
                if (name2 == null) {
                    name2 = "";
                }
                abstractC23101hrq.EZpvd(defiPlatformId2, name2);
            }
            C25352ivB.startVibrator$default(0L, 1, null);
            C22380heK c22380heK = C22380heK.OLrzqt;
            InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str).fARcdN();
            android.content.Context context = c24614ihE.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            long jValueOf = C33129mqd.valueOf(abstractC23101hrq.QUSxYX().AEQbTJ());
            java.lang.String strCopydefault = c22380heK.copydefault(str).fARcdN().copydefault();
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC32996moC.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC23194htdFARcdN.AEQbTJ(context, jValueOf, strCopydefault, childFragmentManager, new Function1() { // from class: o.ihN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24614ihE.OLrzqt(function12, (android.os.Bundle) obj);
                }
            });
        }
        if (str2 != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
            java.lang.String strCopydefault2 = C25295ity.copydefault(C22372heC.EZpvd(abstractC23101hrq.ffGIBT()));
            java.lang.String strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(abstractC23101hrq.ffGIBT());
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            java.lang.String str4 = tokenContractAddress == null ? "" : tokenContractAddress;
            java.lang.String amountNum = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getAmountNum() : null;
            java.lang.String str5 = amountNum == null ? "" : amountNum;
            java.lang.String currencyAmount = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getCurrencyAmount() : null;
            java.lang.String str6 = currencyAmount == null ? "" : currencyAmount;
            java.lang.String tokenContractAddress2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenContractAddress() : null;
            java.lang.String str7 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
            java.lang.String amountNum2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getAmountNum() : null;
            java.lang.String str8 = amountNum2 == null ? "" : amountNum2;
            java.lang.String currencyAmount2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getCurrencyAmount() : null;
            C25295ity.copydefault("swap", str2, strCopydefault2, strOLrzqt, str4, str5, str6, str7, str8, currencyAmount2 == null ? "" : currencyAmount2, C25295ity.EZpvd(c24614ihE.AEQbTJ()), abstractC23101hrq.QUSxYX().OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24614ihE c24614ihE, final AbstractC23101hrq abstractC23101hrq, AbstractC32996moC abstractC32996moC, java.lang.String str, final boolean z, final Function1 function1, final java.lang.String str2, final ApproveSwapData approveSwapData) {
        InterfaceC9854bdT interfaceC9854bdT;
        ApproveStatusGroup approveStatusGroup;
        Intrinsics.checkNotNullParameter(approveSwapData, "");
        SwapState swapStateAEQbTJ = c24614ihE.AEQbTJ();
        SwapState swapState = SwapState.APPROVE;
        if (swapStateAEQbTJ == swapState) {
            abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, swapState, true, false));
        } else {
            abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVED_AND_NEED_CANCEL_APPROVE, true, false));
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
            interfaceC9854bdT.AEQbTJ(activity, new DappInteractionArgs(walletId, null, chainId, platForm, jsonData, null, "dex", 3, null, null, dexContractAddress, (c24614ihE.AEQbTJ() != SwapState.APPROVED_AND_NEED_CANCEL_APPROVE || (approveStatusGroup = abstractC23101hrq.isConnected().getApproveStatusGroup()) == null) ? null : approveStatusGroup.getApprovedAmount(), z, true, orderId, true, null, null, DexTrackEventParameter.AEQbTJ.OLrzqt(str), null, null, null, null, null, null, null, 1, bizLoad, null, null, null, null, -218430718, null), new Function1() { // from class: o.ihM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24614ihE.EZpvd(z, function1, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.ihK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24614ihE.OLrzqt(abstractC23101hrq, approveSwapData, str2, (NewCallbackBean) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(boolean z, Function1 function1, android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("extra_universal_1", z);
        }
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(AbstractC23101hrq abstractC23101hrq, ApproveSwapData approveSwapData, java.lang.String str, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return abstractC23101hrq.OLrzqt(newCallbackBean.getHeaderMap(), newCallbackBean.getBody(), approveSwapData.getOrderId(), str);
    }

    public static final Unit OLrzqt(Function1 function1, android.os.Bundle bundle) {
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractC23101hrq abstractC23101hrq) {
        C22877hne.OLrzqt.AEQbTJ(abstractC23101hrq, abstractC23101hrq.QCjLjM(), "DEX", abstractC23101hrq.ffGIBT());
    }

    public final void KWHzl(@NotNull final C24795ika c24795ika, @NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull final AbstractC32996moC abstractC32996moC, final boolean z, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @NotNull final Function0<Unit> function04, @NotNull final Function0<Unit> function05, @NotNull final Function0<Unit> function06, @NotNull final Function1<? super SwapState, Unit> function1) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(c24795ika, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C21506hBx c21506hBx = this.copydefault;
        if (c21506hBx == null || (c52794wYp = c21506hBx.AEQbTJ) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp, 0L, new Function1() { // from class: o.ihL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24614ihE.OLrzqt(function1, this, abstractC23101hrq, function04, c24795ika, z, function03, abstractC32996moC, function0, function02, function06, function05, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(Function1 function1, C24614ihE c24614ihE, final AbstractC23101hrq abstractC23101hrq, Function0 function0, C24795ika c24795ika, final boolean z, Function0 function02, AbstractC32996moC abstractC32996moC, Function0 function03, Function0 function04, Function0 function05, Function0 function06, android.view.View view) {
        java.lang.String checkData;
        TradeInputGroup data;
        DeFiPlatformForSwap selectedDeFiPlatform;
        Intrinsics.checkNotNullParameter(view, "");
        function1.invoke(c24614ihE.AEQbTJ());
        switch (Activity.AEQbTJ[c24614ihE.AEQbTJ().ordinal()]) {
            case 4:
                QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
                if (quotePriceResAxsJAYsNCnLh != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) != null) {
                    java.lang.String defiPlatformId = selectedDeFiPlatform.getDefiPlatformId();
                    if (defiPlatformId == null) {
                        defiPlatformId = "";
                    }
                    java.lang.String name = selectedDeFiPlatform.getName();
                    abstractC23101hrq.EZpvd(defiPlatformId, name != null ? name : "");
                }
                abstractC23101hrq.dvKsVJ().setValue(java.lang.Boolean.TRUE);
                C25352ivB.startVibrator$default(0L, 1, null);
                if (abstractC23101hrq.run()) {
                    function0.invoke();
                    return Unit.INSTANCE;
                }
                if (abstractC23101hrq.QUSxYX().fetchVPNInfo()) {
                    checkData = ((DexTradeInputData) C22332hdP.EZpvd(c24795ika.copydefault().getToData()).getData()).getVerticalEditTextGroupData().getCheckData();
                } else {
                    checkData = ((DexTradeInputData) C22332hdP.EZpvd(c24795ika.copydefault().getFromData()).getData()).getVerticalEditTextGroupData().getCheckData();
                }
                if (abstractC23101hrq.EZpvd(checkData)) {
                    C55326xho.toast$default(C23274hvD.Fragment.MediaBrowserCompatSearchResultReceiver, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    abstractC23101hrq.dvKsVJ().postValue(java.lang.Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
                if (value != null && (data = value.getData()) != null) {
                    abstractC23101hrq.wlaJM().copydefault(data);
                }
                c24614ihE.AEQbTJ(z, false, abstractC23101hrq);
                function02.invoke();
                C32866mlf.onEvent$default("app_swap_advance_gas_price_and_slippage_tolerance", (TrackChannel[]) null, new Function1() { // from class: o.ihO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24614ihE.OLrzqt(abstractC23101hrq, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                break;
                break;
            case 5:
                C25352ivB.startVibrator$default(0L, 1, null);
                C32866mlf.onEvent$default("DEXSwap_Mid_ConnectWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.ihQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24614ihE.AEQbTJ(z, abstractC23101hrq, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
                if (xwo != null) {
                    androidx.fragment.app.FragmentManager childFragmentManager = abstractC32996moC.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager, new Application(function06), (java.util.List) null, (java.util.List) null, (InterfaceC54856xXw) null, 28, (java.lang.Object) null);
                }
                break;
            case 6:
            case 7:
            case 8:
                c24614ihE.AEQbTJ(abstractC23101hrq, abstractC32996moC, z, function03, function04);
                break;
            case 9:
                function05.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC23101hrq abstractC23101hrq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C22823hmd c22823hmdOLrzqt = abstractC23101hrq.wlaJM().OLrzqt();
        eventParamsList.put("gasprice", c22823hmdOLrzqt.copydefault(c22823hmdOLrzqt.OLrzqt()), false);
        C25416iwM c25416iwMDCUTEI = abstractC23101hrq.DCUTEI();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
        java.lang.String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.autoSlippage() : null);
        eventParamsList.put("Slippagetolerance", strOLrzqt != null ? strOLrzqt : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, AbstractC23101hrq abstractC23101hrq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", "DEX", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", BusinessType.Companion.KWHzl(z), false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", abstractC23101hrq.QCjLjM(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "activity_name", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", C22877hne.OLrzqt.AEQbTJ(abstractC23101hrq.ffGIBT()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ihE$Application */
    public static final class Application implements InterfaceC54859xXz {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public Application(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            final Function0<Unit> function0 = this.OLrzqt;
            C32866mlf.onEvent$default("app_swap_create_wallet", (TrackChannel[]) null, new Function1() { // from class: o.ihP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24614ihE.Application.copydefault(function0, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit copydefault(Function0 function0, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lbP.checkLegalDisclaimerAndProceed$default(androidx.fragment.app.FragmentManager, android.content.DialogInterface$OnDismissListener, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull final AbstractC32996moC abstractC32996moC, final boolean z, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC32996moC.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C30449lbP.checkLegalDisclaimerAndProceed$default(childFragmentManager, null, new Function0() { // from class: o.ihJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24614ihE.AEQbTJ(this.OLrzqt, z, abstractC23101hrq, function0, function02, abstractC32996moC);
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(final C24614ihE c24614ihE, final boolean z, final AbstractC23101hrq abstractC23101hrq, final Function0 function0, final Function0 function02, final AbstractC32996moC abstractC32996moC) {
        java.lang.String tokenContractAddress;
        AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> abstractC58185ywXEZpvd;
        c24614ihE.OLrzqt(true);
        c24614ihE.AEQbTJ(z, true, abstractC23101hrq);
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        abstractC23101hrq.AxsJAYsNCnLh();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        boolean z2 = z && C22825hmf.OLrzqt.OLrzqt(abstractC23101hrq.ffGIBT(), chainId);
        if (z) {
            InterfaceC22672hjl interfaceC22672hjlFetchVPNInfo = C22380heK.OLrzqt.copydefault(abstractC23101hrq.ffGIBT()).fetchVPNInfo();
            java.lang.String tokenContractAddress2 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress2 == null) {
                tokenContractAddress2 = "";
            }
            tokenContractAddress = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenContractAddress() : null;
            abstractC58185ywXEZpvd = interfaceC22672hjlFetchVPNInfo.KWHzl(chainId, chainId2, tokenContractAddress2, tokenContractAddress != null ? tokenContractAddress : "");
        } else {
            InterfaceC22601hiT interfaceC22601hiTOLrzqt = C22380heK.OLrzqt.copydefault(abstractC23101hrq.ffGIBT()).OLrzqt();
            java.lang.String tokenContractAddress3 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress3 == null) {
                tokenContractAddress3 = "";
            }
            tokenContractAddress = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getTokenContractAddress() : null;
            abstractC58185ywXEZpvd = interfaceC22601hiTOLrzqt.EZpvd(chainId, tokenContractAddress3, chainId2, tokenContractAddress != null ? tokenContractAddress : "");
        }
        AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> abstractC58185ywX = abstractC58185ywXEZpvd;
        final boolean z3 = z2;
        C21686hIo.AEQbTJ(abstractC58185ywX, z2 || !Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) chainId2), (Function1<? super hHS, Unit>) new Function1() { // from class: o.ihI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24614ihE.copydefault(this.AEQbTJ, dexMultiTokenInfoBeanCopydefault, abstractC23101hrq, z, z3, dexMultiTokenInfoBeanValueOf, function0, function02, abstractC32996moC, (hHS) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment.Activity.newInstance$default(com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment$Activity, java.util.List, o.hIz, o.hIz, com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom, o.hHS, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, int, int, int, java.lang.Object):com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment */
    public static final Unit copydefault(C24614ihE c24614ihE, DexMultiTokenInfoBean dexMultiTokenInfoBean, AbstractC23101hrq abstractC23101hrq, boolean z, boolean z2, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Function0 function0, Function0 function02, AbstractC32996moC abstractC32996moC, hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        c24614ihE.OLrzqt(false);
        DexDappRedirectListFragment.Activity activity = DexDappRedirectListFragment.Companion;
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        java.lang.String strFfGIBT = abstractC23101hrq.ffGIBT();
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        C21697hIz c21697hIzCopydefault = C24632ihW.copydefault(dexMultiTokenInfoBean, c22825hmf.EZpvd(strFfGIBT, chainId, z), z2);
        java.lang.String strFfGIBT2 = abstractC23101hrq.ffGIBT();
        java.lang.String chainId2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null;
        DexDappRedirectListFragment.Activity.newInstance$default(activity, null, c21697hIzCopydefault, C24632ihW.copydefault(dexMultiTokenInfoBean2, c22825hmf.EZpvd(strFfGIBT2, chainId2 != null ? chainId2 : "", z), z2), z ? DAppRedirectFrom.SWAP : DAppRedirectFrom.BRIDGE, hhs, function0, function02, abstractC23101hrq.ffGIBT(), null, 0, 0, 1792, null).show(abstractC32996moC.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    private final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setButtonText$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.RAQtXZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))), false, null, false, false, 28, null);
    }

    public static /* synthetic */ void setButtonText$default(C24614ihE c24614ihE, java.lang.String str, boolean z, android.graphics.drawable.Drawable drawable, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        c24614ihE.setButtonText(str, z, drawable, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public final void setButtonText(java.lang.String str, boolean z, android.graphics.drawable.Drawable drawable, boolean z2, boolean z3) {
        C21506hBx c21506hBx = this.copydefault;
        if (c21506hBx != null) {
            if (z) {
                c21506hBx.copydefault.setText(str);
                C52794wYp c52794wYp = c21506hBx.copydefault;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c52794wYp.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
                if (drawable == null || z3) {
                    return;
                }
                c21506hBx.copydefault.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                return;
            }
            c21506hBx.AEQbTJ.setText(str);
            C52794wYp c52794wYp2 = c21506hBx.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c52794wYp2.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context2));
            if (z2) {
                c21506hBx.AEQbTJ.setCompoundDrawablesRelative(drawable, null, null, null);
            } else {
                c21506hBx.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
        }
    }

    public static /* synthetic */ void setTradeStateButton$default(C24614ihE c24614ihE, SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, boolean z2, DeFiPlatformForSwap deFiPlatformForSwap, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            deFiPlatformForSwap = null;
        }
        c24614ihE.setTradeStateButton(swapState, dexMultiTokenInfoBean, z, z3, deFiPlatformForSwap);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTradeStateButton(SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, boolean z2, DeFiPlatformForSwap deFiPlatformForSwap) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        java.lang.String originContractAddress;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        C21506hBx c21506hBx;
        C52794wYp c52794wYp9;
        C21506hBx c21506hBx2;
        C52794wYp c52794wYp10;
        SwapState swapState2 = SwapState.FETCHING_QUOTES;
        if (!yDY.gEmmrt(swapState2, SwapState.APPROVE_CONFIRMING, SwapState.APPROVING, SwapState.REGISTERING).contains(swapState) && (c21506hBx2 = this.copydefault) != null && (c52794wYp10 = c21506hBx2.AEQbTJ) != null) {
            C23302hvf.KWHzl(c52794wYp10, "web3_dex_trade_submit_button");
        }
        int i = Activity.AEQbTJ[swapState.ordinal()];
        if (i != 1) {
            switch (i) {
                case 4:
                    setButtonText$default(this, C25352ivB.OLrzqt(z, false, deFiPlatformForSwap), false, null, false, false, 28, null);
                    C21506hBx c21506hBx3 = this.copydefault;
                    if (c21506hBx3 != null && (c52794wYp2 = c21506hBx3.AEQbTJ) != null) {
                        c52794wYp2.setEnabled(true);
                        c52794wYp2.setOKDSType(257);
                    }
                    break;
                case 5:
                    java.lang.String string = getContext().getString(C23274hvD.Fragment.DaRZkR);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    setButtonText$default(this, string, false, null, false, false, 28, null);
                    C21506hBx c21506hBx4 = this.copydefault;
                    if (c21506hBx4 != null && (c52794wYp3 = c21506hBx4.AEQbTJ) != null) {
                        c52794wYp3.setEnabled(true);
                        c52794wYp3.setOKDSType(257);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatItemCallback);
                    android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dNxZaP);
                    if (drawableKWHzl != null) {
                        drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.DcMfJKffREWX));
                    }
                    if (drawableKWHzl != null) {
                        drawableKWHzl.setBounds(0, 0, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))), C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))));
                    }
                    Unit unit = Unit.INSTANCE;
                    setButtonText$default(this, strAYXKKw, false, drawableKWHzl, true, false, 16, null);
                    C21506hBx c21506hBx5 = this.copydefault;
                    if (c21506hBx5 != null && (c52794wYp4 = c21506hBx5.AEQbTJ) != null) {
                        c52794wYp4.setOKDSType(259);
                        c52794wYp4.setEnabled(z2);
                    }
                    break;
                case 9:
                    if ((dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isMainChainCoin()) || dexMultiTokenInfoBean == null || (originContractAddress = dexMultiTokenInfoBean.getOriginContractAddress()) == null) {
                        originContractAddress = "";
                    }
                    if (dexMultiTokenInfoBean != null && C22380heK.OLrzqt.copydefault("default_trade").fARcdN().copydefault(originContractAddress, C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId()))) {
                        KWHzl(dexMultiTokenInfoBean);
                        C21506hBx c21506hBx6 = this.copydefault;
                        if (c21506hBx6 != null && (c52794wYp6 = c21506hBx6.AEQbTJ) != null) {
                            c52794wYp6.setEnabled(true);
                            c52794wYp6.setOKDSType(259);
                        }
                    } else {
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        setButtonText$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C30565ldZ.getFmtSymbol$default(C33129mqd.gEmmrt(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null), 0, 1, null)))), false, null, false, false, 28, null);
                        C21506hBx c21506hBx7 = this.copydefault;
                        if (c21506hBx7 != null && (c52794wYp5 = c21506hBx7.AEQbTJ) != null) {
                            c52794wYp5.setEnabled(false);
                        }
                    }
                    break;
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
                case 27:
                    setButtonText$default(this, C25352ivB.getSwapText$default(z, false, null, 4, null), false, null, false, false, 28, null);
                    C21506hBx c21506hBx8 = this.copydefault;
                    if (c21506hBx8 != null && (c52794wYp = c21506hBx8.AEQbTJ) != null) {
                        c52794wYp.setEnabled(false);
                    }
                    break;
                case 28:
                    java.lang.String string2 = getContext().getString(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi181);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    setButtonText$default(this, string2, false, null, false, false, 28, null);
                    C21506hBx c21506hBx9 = this.copydefault;
                    if (c21506hBx9 != null && (c52794wYp7 = c21506hBx9.AEQbTJ) != null) {
                        c52794wYp7.setEnabled(true);
                    }
                    break;
                case 29:
                    setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.QXDzTk), false, null, false, false, 28, null);
                    C21506hBx c21506hBx10 = this.copydefault;
                    if (c21506hBx10 != null && (c52794wYp8 = c21506hBx10.AEQbTJ) != null) {
                        c52794wYp8.setEnabled(false);
                    }
                    break;
                default:
                    if (swapState == swapState2 && !z2 && (c21506hBx = this.copydefault) != null && (c52794wYp9 = c21506hBx.AEQbTJ) != null) {
                        c52794wYp9.setEnabled(false);
                    }
                    break;
            }
        }
        this.KWHzl = swapState;
    }

    public static /* synthetic */ void setApproveTradeStateButton$default(C24614ihE c24614ihE, SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        c24614ihE.setApproveTradeStateButton(swapState, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z);
    }

    public final void setApproveTradeStateButton(SwapState swapState, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
        java.lang.String tokenSymbol;
        C52794wYp c52794wYp;
        java.lang.String tokenSymbol2;
        C52794wYp c52794wYp2;
        java.lang.String chainName;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        C52794wYp c52794wYp9;
        C52794wYp c52794wYp10;
        java.lang.String tokenSymbol3;
        C21506hBx c21506hBx;
        C52794wYp c52794wYp11;
        SwapState swapState2 = SwapState.FETCHING_QUOTES;
        if (!yDY.gEmmrt(swapState2, SwapState.APPROVE_CONFIRMING, SwapState.APPROVING, SwapState.REGISTERING, SwapState.CANCEL_APPROVING).contains(swapState) && (c21506hBx = this.copydefault) != null && (c52794wYp11 = c21506hBx.copydefault) != null) {
            C23302hvf.KWHzl(c52794wYp11, "web3_dex_trade_submit_button");
        }
        int i = Activity.AEQbTJ[swapState.ordinal()];
        if (i == 1) {
            if (dexMultiTokenInfoBean == null || (tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            C21506hBx c21506hBx2 = this.copydefault;
            if (c21506hBx2 != null && (c52794wYp = c21506hBx2.copydefault) != null) {
                c52794wYp.setEnabled(z);
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setButtonText$default(this, C33069mpW.KWHzl(context, C23274hvD.Fragment.OTwTPd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("coin", tokenSymbol))), true, this.OLrzqt, false, false, 24, null);
        } else if (i == 2) {
            C21506hBx c21506hBx3 = this.copydefault;
            if (c21506hBx3 != null && (c52794wYp2 = c21506hBx3.copydefault) != null) {
                c52794wYp2.setEnabled(true);
            }
            if (dexMultiTokenInfoBean == null || (tokenSymbol2 = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol2 = "";
            }
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setButtonText$default(this, C33069mpW.KWHzl(context2, C23274hvD.Fragment.BackHandler, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tokenSymbol2))), true, this.OLrzqt, false, false, 24, null);
        } else if (i == 3) {
            C21506hBx c21506hBx4 = this.copydefault;
            if (c21506hBx4 != null && (c52794wYp3 = c21506hBx4.copydefault) != null) {
                c52794wYp3.setEnabled(true);
            }
            if (dexMultiTokenInfoBean == null || (chainName = dexMultiTokenInfoBean.getChainName()) == null) {
                chainName = "";
            }
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            setButtonText$default(this, C33069mpW.KWHzl(context3, C23274hvD.Fragment.onSessionReady, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chainName", chainName))), true, this.OLrzqt, false, false, 24, null);
        } else if (i == 12) {
            C21506hBx c21506hBx5 = this.copydefault;
            if (c21506hBx5 != null && (c52794wYp5 = c21506hBx5.copydefault) != null) {
                c52794wYp5.setEnabled(true);
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.glXhWM), true, null, false, true, 12, null);
            C21506hBx c21506hBx6 = this.copydefault;
            if (c21506hBx6 != null && (c52794wYp4 = c21506hBx6.copydefault) != null) {
                c52794wYp4.OLrzqt(100L);
            }
        } else if (i == 13) {
            C21506hBx c21506hBx7 = this.copydefault;
            if (c21506hBx7 != null && (c52794wYp7 = c21506hBx7.copydefault) != null) {
                c52794wYp7.setEnabled(true);
            }
            C21506hBx c21506hBx8 = this.copydefault;
            if (c21506hBx8 != null && (c52794wYp6 = c21506hBx8.copydefault) != null) {
                c52794wYp6.OLrzqt(500L);
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DNMMPQ), true, null, false, true, 12, null);
        } else if (i == 30) {
            C21506hBx c21506hBx9 = this.copydefault;
            if (c21506hBx9 != null && (c52794wYp9 = c21506hBx9.copydefault) != null) {
                c52794wYp9.setEnabled(true);
            }
            C21506hBx c21506hBx10 = this.copydefault;
            if (c21506hBx10 != null && (c52794wYp8 = c21506hBx10.copydefault) != null) {
                c52794wYp8.OLrzqt(100L);
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKt), true, null, false, true, 12, null);
        } else if (i == 31) {
            C21506hBx c21506hBx11 = this.copydefault;
            if (c21506hBx11 != null && (c52794wYp10 = c21506hBx11.copydefault) != null) {
                c52794wYp10.OLrzqt(100L);
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.onShuffleModeChanged), true, null, false, true, 12, null);
        } else if (swapState == swapState2) {
            if (dexMultiTokenInfoBean == null || (tokenSymbol3 = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol3 = "";
            }
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            setButtonText$default(this, C33069mpW.KWHzl(context4, C23274hvD.Fragment.OTwTPd, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("coin", tokenSymbol3))), true, this.OLrzqt, false, false, 24, null);
        }
        this.KWHzl = swapState;
    }

    public final void OLrzqt(boolean z) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        if (z) {
            C21506hBx c21506hBx = this.copydefault;
            if (c21506hBx != null && (c52794wYp2 = c21506hBx.AEQbTJ) != null) {
                c52794wYp2.OLrzqt(100L);
            }
            setButtonText$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatItemCallback), false, null, false, false, 28, null);
            return;
        }
        C21506hBx c21506hBx2 = this.copydefault;
        if (c21506hBx2 != null && (c52794wYp = c21506hBx2.AEQbTJ) != null) {
            C23302hvf.KWHzl(c52794wYp, "web3_dex_trade_submit_button");
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dNxZaP);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatItemCallback);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.DcMfJKffREWX));
        }
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))), C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))));
        }
        Unit unit = Unit.INSTANCE;
        setButtonText$default(this, strAYXKKw, false, drawableKWHzl, true, false, 16, null);
    }

    public final void AEQbTJ(boolean z, boolean z2, final AbstractC23101hrq abstractC23101hrq) {
        final SwapButtonAnalytics swapButtonAnalyticsOLrzqt = C22877hne.OLrzqt.OLrzqt(z, z2, abstractC23101hrq);
        C32866mlf.onEvent$default("DEXSwap_Mid_Swap_Click", (TrackChannel[]) null, new Function1() { // from class: o.ihH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24614ihE.EZpvd(abstractC23101hrq, swapButtonAnalyticsOLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(AbstractC23101hrq abstractC23101hrq, SwapButtonAnalytics swapButtonAnalytics, EventParamsList eventParamsList) {
        DeFiPlatformForSwap selectedDeFiPlatform;
        java.util.List<DeFiPlatformForSwap> defiPlatformInfoList;
        java.lang.String chainName;
        java.lang.String chainName2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        EventParamsList.put$default(eventParamsList, "from_chain", (dexMultiTokenInfoBeanCopydefault == null || (chainName2 = dexMultiTokenInfoBeanCopydefault.getChainName()) == null) ? "" : chainName2, false, 4, null);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        EventParamsList.put$default(eventParamsList, "to_chain", (dexMultiTokenInfoBeanValueOf == null || (chainName = dexMultiTokenInfoBeanValueOf.getChainName()) == null) ? "" : chainName, false, 4, null);
        eventParamsList.put("user_address", abstractC23101hrq.QCjLjM(), false);
        C22877hne c22877hne = C22877hne.OLrzqt;
        eventParamsList.put("business_type", c22877hne.KWHzl(abstractC23101hrq.ffGIBT()), true);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(abstractC23101hrq.ffGIBT()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "activity_name", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_address", swapButtonAnalytics.getFromTokenAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_amount", swapButtonAnalytics.getFromTokenAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_address", swapButtonAnalytics.getToTokenAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_amount_usdt", swapButtonAnalytics.getFromAmountUsdt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_amount", swapButtonAnalytics.getToTokenAmount(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_amount_usdt", swapButtonAnalytics.getToAmountUsdt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "swap_type", swapButtonAnalytics.getSwapType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", "DEX", false, 4, null);
        EventParamsList.put$default(eventParamsList, "balance_bracket", swapButtonAnalytics.getBalanceBracket(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "slippage", C23316hvt.OLrzqt(swapButtonAnalytics.getSlippage()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "liquidity_source", swapButtonAnalytics.getLiquiditySource(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "bridge_selection", swapButtonAnalytics.getBridgeSelection(), false, 4, null);
        QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) != null) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
            java.lang.Integer numValueOf = (quotePriceResAxsJAYsNCnLh2 == null || (defiPlatformInfoList = quotePriceResAxsJAYsNCnLh2.getDefiPlatformInfoList()) == null) ? null : java.lang.Integer.valueOf(defiPlatformInfoList.indexOf(selectedDeFiPlatform));
            int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : -1;
            java.lang.String name = selectedDeFiPlatform.getName();
            EventParamsList.put$default(eventParamsList, "provider_name", name == null ? "" : name, false, 4, null);
            EventParamsList.put$default(eventParamsList, "best_price", (numValueOf != null && numValueOf.intValue() == 0) ? "yes" : "no", false, 4, null);
            java.lang.String reducePercent = selectedDeFiPlatform.getReducePercent();
            if (reducePercent != null) {
                EventParamsList.put$default(eventParamsList, "price_difference", C23311hvo.formatPercent$default(reducePercent, false, 0, 0, null, null, 30, null), false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, "price_ranking", java.lang.String.valueOf(iIntValue), false, 4, null);
        }
        AbstractC22421hez abstractC22421hezOLrzqt = AbstractC22421hez.Companion.OLrzqt();
        AbstractC22421hez.Activity activity = abstractC22421hezOLrzqt instanceof AbstractC22421hez.Activity ? (AbstractC22421hez.Activity) abstractC22421hezOLrzqt : null;
        if (activity != null) {
            EventParamsList.put$default(eventParamsList, "discover_feed_origin", activity.OLrzqt(), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
