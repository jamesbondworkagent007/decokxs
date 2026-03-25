package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25049ipQ extends NestedScrollView {
    public boolean AEQbTJ;
    public hBP OLrzqt;
    public C24995ioP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentBinding(@NotNull hBP hbp) {
        Intrinsics.checkNotNullParameter(hbp, "");
        this.OLrzqt = hbp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorStateHandle(@NotNull C24995ioP c24995ioP) {
        Intrinsics.checkNotNullParameter(c24995ioP, "");
        this.copydefault = c24995ioP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScrollingEnabled(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25049ipQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25049ipQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25049ipQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25049ipQ(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView
    public int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect rect) {
        if (this.AEQbTJ) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hrW.getLabelData$default(o.hrW, com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, int, java.lang.Object):o.hrS */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull QuotePriceRes quotePriceRes, @NotNull AbstractC23101hrq abstractC23101hrq, boolean z, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function1<? super AbstractC22408hem, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function12, "");
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            hbp.valueOf.isConnected();
            hbp.valueOf.OLrzqt(str, quotePriceRes, abstractC23101hrq, z, this, fragmentManager, fragmentActivity, function1, function12);
            C24995ioP c24995ioP = this.copydefault;
            if (c24995ioP == null || java.lang.Boolean.valueOf(c24995ioP.OLrzqt(abstractC23101hrq.dNCPSb().valueOf())).booleanValue()) {
                return;
            }
            C23081hrW c23081hrWWlaJM = abstractC23101hrq.wlaJM();
            ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
            Intrinsics.copydefault(value);
            C23077hrS labelData$default = C23081hrW.getLabelData$default(c23081hrWWlaJM, value.getData(), quotePriceRes, null, 4, null);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.CharSequence charSequenceCopydefault = C25287itq.copydefault(labelData$default, context);
            C24461ieK c24461ieKValueOf = hbp.valueOf.valueOf();
            if (c24461ieKValueOf != null) {
                c24461ieKValueOf.copydefault(quotePriceRes, charSequenceCopydefault);
            }
            C24453ieC c24453ieCCopydefault = hbp.valueOf.copydefault();
            if (c24453ieCCopydefault != null) {
                c24453ieCCopydefault.OLrzqt(charSequenceCopydefault);
            }
        }
    }

    public final void copydefault(@NotNull AbstractC23101hrq abstractC23101hrq, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            checkError$default(this, abstractC23101hrq, str, fragmentManager, fragmentActivity, false, function1, 16, null);
            hbp.valueOf.DbNXlk();
        }
    }

    public final void KWHzl() {
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            hbp.valueOf.isConnected();
            hbp.valueOf.fARcdN();
            C24461ieK c24461ieKValueOf = hbp.valueOf.valueOf();
            if (c24461ieKValueOf != null) {
                c24461ieKValueOf.EZpvd();
            }
            C24453ieC c24453ieCCopydefault = hbp.valueOf.copydefault();
            if (c24453ieCCopydefault != null) {
                c24453ieCCopydefault.OLrzqt();
            }
        }
    }

    public static /* synthetic */ void openStandByDishState$default(C25049ipQ c25049ipQ, AbstractC23101hrq abstractC23101hrq, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        c25049ipQ.AEQbTJ(abstractC23101hrq, fragmentManager, fragmentActivity, z, function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ioP.updateErrorState$default(o.ioP, com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState, androidx.fragment.app.FragmentManager, com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView, androidx.fragment.app.FragmentActivity, com.okinc.business.dexlogic.bean.QuoteErrorBean, o.iif, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull AbstractC23101hrq abstractC23101hrq, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            C24995ioP c24995ioP = this.copydefault;
            if (c24995ioP != null) {
                c24995ioP.EZpvd(abstractC23101hrq.QUSxYX().AhwBna());
            }
            if (z) {
                hbp.valueOf.KWHzl(false);
            }
            C24995ioP c24995ioP2 = this.copydefault;
            if (c24995ioP2 != null) {
                SwapState swapState = SwapState.STAND_BY_DISH;
                ErrorNoticeView errorNoticeView = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                C24995ioP.updateErrorState$default(c24995ioP2, swapState, fragmentManager, errorNoticeView, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
    }

    public static /* synthetic */ void openStandByLeverageState$default(C25049ipQ c25049ipQ, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c25049ipQ.EZpvd(fragmentManager, fragmentActivity, z, function1);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            if (z) {
                hbp.valueOf.KWHzl(false);
            }
            C24995ioP c24995ioP = this.copydefault;
            if (c24995ioP != null) {
                SwapState swapState = SwapState.STAND_BY_LEVERAGE;
                ErrorNoticeView errorNoticeView = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                C24995ioP.updateErrorState$default(c24995ioP, swapState, fragmentManager, errorNoticeView, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
    }

    public static /* synthetic */ void checkError$default(C25049ipQ c25049ipQ, AbstractC23101hrq abstractC23101hrq, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c25049ipQ.AEQbTJ(abstractC23101hrq, str, fragmentManager, fragmentActivity, z, function1);
    }

    public final void AEQbTJ(@NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull final java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final FragmentActivity fragmentActivity, boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        QuotePriceRes value;
        QuotePriceRes value2;
        QuotePriceRes value3;
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        hBP hbp = this.OLrzqt;
        if (hbp != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
            java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
            java.lang.String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
            if (chainId2 == null) {
                chainId2 = "";
            }
            SwapState swapStateOLrzqt = C22825hmf.OLrzqt.OLrzqt(str, chainId, chainId2, abstractC23101hrq.UlJrfe());
            C24694iif c24694iifAEQbTJ = C24695iig.AEQbTJ(str, true);
            QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh == null) {
                quotePriceResAxsJAYsNCnLh = new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, (CommonDexInfo) null, false, false, false, (java.lang.String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strOLrzqt = C25081ipw.OLrzqt(quotePriceResAxsJAYsNCnLh, str, abstractC23101hrq, context);
            if (abstractC23101hrq.QVsKAR().isWalletError(str)) {
                C24995ioP c24995ioP = this.copydefault;
                if (c24995ioP != null) {
                    SwapState syncWalletState = abstractC23101hrq.QVsKAR().getSyncWalletState(str);
                    ErrorNoticeView errorNoticeView = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                    C24995ioP.updateErrorState$default(c24995ioP, syncWalletState, fragmentManager, errorNoticeView, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                return;
            }
            Result<DexPresetResultVO> resultOLrzqt = abstractC23101hrq.OLrzqt(abstractC23101hrq.hDKMBd());
            if (resultOLrzqt != null && Result.m7383isFailureimpl(resultOLrzqt.m7386unboximpl())) {
                C24995ioP c24995ioP2 = this.copydefault;
                if (c24995ioP2 != null) {
                    SwapState swapState = SwapState.SWAP_CONFIG_FETCH_FAILED;
                    ErrorNoticeView errorNoticeView2 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView2, "");
                    C24995ioP.updateErrorState$default(c24995ioP2, swapState, fragmentManager, errorNoticeView2, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                return;
            }
            if (abstractC23101hrq.QUSxYX().DbNXlk()) {
                EZpvd(fragmentManager, fragmentActivity, z, function1);
                return;
            }
            if (swapStateOLrzqt.isDAppRedirectState()) {
                C24995ioP c24995ioP3 = this.copydefault;
                if (c24995ioP3 != null) {
                    ErrorNoticeView errorNoticeView3 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView3, "");
                    C24995ioP.updateErrorState$default(c24995ioP3, swapStateOLrzqt, fragmentManager, errorNoticeView3, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                return;
            }
            QuotePriceRes quotePrice = abstractC23101hrq.RlQdEF().getQuotePrice();
            if (quotePrice != null && quotePrice.isOkxDexNotAvailableAnymore() && c24694iifAEQbTJ.OLrzqt() != DexSwapLiquiditySource.All && (value3 = abstractC23101hrq.AubY().getValue()) != null && !value3.isReset()) {
                C24995ioP c24995ioP4 = this.copydefault;
                if (c24995ioP4 != null) {
                    SwapState swapState2 = SwapState.NO_LIQUIDITY_AT_THE_MOMENT;
                    ErrorNoticeView errorNoticeView4 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView4, "");
                    C24995ioP.updateErrorState$default(c24995ioP4, swapState2, fragmentManager, errorNoticeView4, fragmentActivity, null, c24694iifAEQbTJ, new Function0() { // from class: o.ipU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C25049ipQ.OLrzqt(fragmentActivity, str, abstractC23101hrq);
                        }
                    }, function1, 16, null);
                    return;
                }
                return;
            }
            QuotePriceRes quotePrice2 = abstractC23101hrq.RlQdEF().getQuotePrice();
            if (quotePrice2 != null && quotePrice2.isHighPriceDifference() && (value2 = abstractC23101hrq.AubY().getValue()) != null && !value2.isReset()) {
                C24995ioP c24995ioP5 = this.copydefault;
                if (c24995ioP5 != null) {
                    SwapState swapState3 = SwapState.HIGH_PRICE_DIFFERENCE;
                    ErrorNoticeView errorNoticeView5 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView5, "");
                    C24995ioP.updateErrorState$default(c24995ioP5, swapState3, fragmentManager, errorNoticeView5, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                return;
            }
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh2 != null && quotePriceResAxsJAYsNCnLh2.isHoneypotErrorCode() && (value = abstractC23101hrq.AubY().getValue()) != null && !value.isReset()) {
                C24995ioP c24995ioP6 = this.copydefault;
                if (c24995ioP6 != null) {
                    SwapState swapState4 = SwapState.STAND_BY_DISH_WARNING;
                    ErrorNoticeView errorNoticeView6 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView6, "");
                    C24995ioP.updateErrorState$default(c24995ioP6, swapState4, fragmentManager, errorNoticeView6, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                return;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
                C24995ioP c24995ioP7 = this.copydefault;
                if (c24995ioP7 != null) {
                    SwapState swapState5 = SwapState.SLIPPAGE_REMINDER;
                    ErrorNoticeView errorNoticeView7 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView7, "");
                    C24995ioP.updateErrorState$default(c24995ioP7, swapState5, fragmentManager, errorNoticeView7, fragmentActivity, new QuoteErrorBean((java.lang.String) null, strOLrzqt, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 253, (DefaultConstructorMarker) null), null, null, function1, 96, null);
                    return;
                }
                return;
            }
            ApproveStatusGroup approveStatusGroup = abstractC23101hrq.isConnected().getApproveStatusGroup();
            java.lang.Boolean boolValueOf = approveStatusGroup != null ? java.lang.Boolean.valueOf(approveStatusGroup.isNeedCancelApprove(abstractC23101hrq.AkhnZx(), abstractC23101hrq.QUSxYX().copydefault())) : null;
            C24995ioP c24995ioP8 = this.copydefault;
            if (c24995ioP8 != null) {
                ErrorNoticeView errorNoticeView8 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView8, "");
                c24995ioP8.KWHzl(errorNoticeView8, Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE));
            }
        }
    }

    public static final Unit OLrzqt(FragmentActivity fragmentActivity, java.lang.String str, AbstractC23101hrq abstractC23101hrq) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        java.lang.String chainId = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        C25352ivB.OLrzqt((android.content.Context) fragmentActivity, str, chainId, true);
        return Unit.INSTANCE;
    }
}
