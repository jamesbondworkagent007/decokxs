package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ClosePositionVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.InitOrderingVo;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wSY {
    public static final wSY OLrzqt = new wSY();

    private wSY() {
    }

    public final boolean KWHzl(java.lang.String str, @NotNull final OKReminder oKReminder, @NotNull final Function0<Unit> function0) {
        java.lang.String strOLrzqt = "";
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!C55935xtN.Companion.AEQbTJ(str)) {
            oKReminder.setVisibility(8);
            return false;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.applyOptions);
        try {
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fromMediaMetadata), C56423yEv.EZpvd(C56390yDp.OLrzqt("viewMore", strAYXKKw)));
            java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(strOLrzqt, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.wTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wSY.copydefault(oKReminder, function0, (java.util.List) obj);
                }
            }, 14, null);
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(2);
            oKReminder.setMessage(charSequence);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("BotReminderViewHelper", "reminder init e=" + e);
            pUU.KWHzl("BotReminderViewHelper", strOLrzqt + "-" + strAYXKKw);
        }
        oKReminder.setVisibility(0);
        return true;
    }

    public static final Unit copydefault(OKReminder oKReminder, Function0 function0, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(oKReminder.getContext(), C32113mPz.Dialog.AuCTelauCTel));
        list.add(new android.text.style.ForegroundColorSpan(oKReminder.getContext().getColor(C52761wXj.Activity.fdOvFl)));
        list.add(new ActionBar(function0));
        return Unit.INSTANCE;
    }

    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public ActionBar(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.invoke();
        }
    }

    public static final Unit AEQbTJ(OKReminder oKReminder, Function0 function0, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(oKReminder.getContext(), C32113mPz.Dialog.AuCTelauCTel));
        list.add(new android.text.style.ForegroundColorSpan(oKReminder.getContext().getColor(C52761wXj.Activity.fdOvFl)));
        list.add(new TaskDescription(function0));
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> EZpvd;

        public TaskDescription(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.invoke();
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    public static /* synthetic */ java.lang.String getSingleGridAmt$default(wSY wsy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return wsy.copydefault(str, str2, str3, str4);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) ? "--" : java.lang.String.valueOf(C56033xvF.getBotAmount$default(str, str2, str3, str4, false, null, 48, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba A[PHI: r16
  0x01ba: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v5 java.lang.String) binds: [B:102:0x01b7, B:97:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168 A[PHI: r10
  0x0168: PHI (r10v22 java.lang.String) = (r10v11 java.lang.String), (r10v24 java.lang.String) binds: [B:79:0x0163, B:74:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, ContractGridVo contractGridVo, TacticsData tacticsData, java.lang.String str2, java.lang.String str3, @NotNull final OKReminder oKReminder, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull Function0<Unit> function0) {
        boolean z3;
        java.lang.String strDivS$default;
        java.lang.String closePosFilled;
        java.lang.String strAYXKKw;
        java.lang.String closePosFilled2;
        java.lang.String str4;
        java.lang.String closePosRemaining;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int i = C55688xof.Application.sFt;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.QhsCdE);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(i);
        java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(strAYXKKw3, new java.lang.String[]{strAYXKKw3}, 0, null, false, new Function1() { // from class: o.wSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wSY.copydefault(oKReminder, (java.util.List) obj);
            }
        }, 14, null);
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.onReceive);
        oKReminder.setTitle((java.lang.CharSequence) null);
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
        oKReminder.setMessage(strAYXKKw4);
        oKReminder.setVisibility(8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") && z2) {
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -1263184552:
                        str3.equals("opening");
                        break;
                    case 866540725:
                        z3 = !str3.equals("closing");
                        break;
                    case 1316806720:
                        str3.equals("starting");
                        break;
                    case 1715648628:
                        if (!str3.equals("stopping")) {
                        }
                        break;
                }
            }
            InitOrderingVo initOrdering = contractGridVo != null ? contractGridVo.getInitOrdering() : null;
            ClosePositionVo closePosition = contractGridVo != null ? contractGridVo.getClosePosition() : null;
            if (z3) {
                strDivS$default = C33129mqd.divS$default(initOrdering != null ? initOrdering.getInitOpenPosFilled() : null, initOrdering != null ? initOrdering.getInitOpenPosTarget() : null, null, null, null, 14, null);
            } else {
                strDivS$default = (closePosition == null || (closePosFilled = closePosition.getClosePosFilled()) == null) ? null : C33129mqd.divS$default(closePosFilled, closePosition.getClosePosTarget(), null, null, null, 14, null);
            }
            java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
            java.lang.String str6 = instType == null ? "" : instType;
            java.lang.String instId = tacticsData != null ? tacticsData.getInstId() : null;
            java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(str6, instId == null ? "" : instId, "", null, 8, null);
            if (z3) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.zSsVtY);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.gtCCJH);
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            xMR xmr = xMR.copydefault;
            if (strDivS$default == null) {
                strDivS$default = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("progressPct", xmr.EZpvd(strDivS$default, 0, 0, RoundingMode.UP));
            wSY wsy = OLrzqt;
            java.lang.String instType2 = tacticsData != null ? tacticsData.getInstType() : null;
            java.lang.String str7 = instType2 == null ? "" : instType2;
            java.lang.String instId2 = tacticsData != null ? tacticsData.getInstId() : null;
            java.lang.String str8 = instId2 == null ? "" : instId2;
            if (z3) {
                closePosFilled2 = initOrdering != null ? initOrdering.getInitOpenPosFilled() : null;
                str4 = closePosFilled2 == null ? "" : closePosFilled2;
            } else {
                closePosFilled2 = closePosition != null ? closePosition.getClosePosFilled() : null;
                if (closePosFilled2 == null) {
                }
            }
            pairArr[1] = C56390yDp.OLrzqt("amt1", getSingleGridAmt$default(wsy, str7, str8, str4, null, 8, null));
            pairArr[2] = C56390yDp.OLrzqt("ccy1", botAmountUnit$default);
            java.lang.String instType3 = tacticsData != null ? tacticsData.getInstType() : null;
            if (instType3 == null) {
                instType3 = "";
            }
            java.lang.String instId3 = tacticsData != null ? tacticsData.getInstId() : null;
            if (instId3 == null) {
                instId3 = "";
            }
            if (z3) {
                closePosRemaining = initOrdering != null ? initOrdering.getInitOpenPosRemaining() : null;
                if (closePosRemaining != null) {
                    str5 = closePosRemaining;
                }
            } else {
                closePosRemaining = closePosition != null ? closePosition.getClosePosRemaining() : null;
                if (closePosRemaining != null) {
                }
            }
            pairArr[3] = C56390yDp.OLrzqt("amt2", getSingleGridAmt$default(wsy, instType3, instId3, str5, null, 8, null));
            pairArr[4] = C56390yDp.OLrzqt("ccy2", botAmountUnit$default);
            oKReminder.setMessage(C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairArr)));
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C48033uCm.Fragment.DGUQLIdZmdUa), function0);
            oKReminder.setVisibility(0);
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "stopped")) {
            return false;
        }
        if ((!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || !z) && (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") || !z || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "no_close_position"))) {
            return false;
        }
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) str2);
        if ((!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || !zOLrzqt) && !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "starting") && !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "stopping") && (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "pending_signal") && !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "pause")))) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 0)) {
                oKReminder.setTitle(charSequence);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") || !arrayList.contains(TacticsForbiddenFunctions.EditParameters.getCode())) {
                oKReminder.setPrimaryAction(strAYXKKw2, function0);
            }
        } else if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i), 0)) {
            oKReminder.setTitle(charSequence);
        }
        oKReminder.setVisibility(0);
        return true;
    }

    public static final Unit copydefault(OKReminder oKReminder, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(oKReminder.getContext(), C52761wXj.LoaderManager.sSMYrx));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean showComplianceStateReminder$default(wSY wsy, java.lang.String str, java.lang.String str2, OKReminder oKReminder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return wsy.copydefault(str, str2, oKReminder, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final boolean copydefault(java.lang.String str, final java.lang.String str2, @NotNull OKReminder oKReminder, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2 = "";
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pause")) {
            return false;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "compliancePause") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "complianceResumeFail")) {
            return false;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "complianceResumeFail")) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.gtdfxv);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OxbLUn);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "compliancePause")) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.ORrpqH);
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "complianceResumeFail")) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.getConnectivityMgr);
        }
        oKReminder.setTitle((java.lang.CharSequence) null);
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
        oKReminder.setMessage(strAYXKKw2);
        oKReminder.setPrimaryAction(strAYXKKw, new Function0() { // from class: o.wTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wSY.KWHzl(function1, str2);
            }
        });
        oKReminder.setVisibility(0);
        return true;
    }

    public static final Unit KWHzl(Function1 function1, java.lang.String str) {
        function1.invoke(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "complianceResumeFail")));
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(@NotNull TacticsData tacticsData, @NotNull OKReminder oKReminder, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GQzpsZsQwTVT);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.fhwtiV);
        boolean zGEmmrt = C33129mqd.gEmmrt(tacticsData.getPerMinProfitRate(), 0);
        oKReminder.setVisibility(zGEmmrt ? 0 : 8);
        if (zGEmmrt) {
            oKReminder.setTitle((java.lang.CharSequence) null);
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(2);
            oKReminder.setMessage((java.lang.CharSequence) strAYXKKw);
            oKReminder.AYXKKw().setText(strAYXKKw2);
            oKReminder.setPrimaryAction(strAYXKKw2, function0);
        }
        return zGEmmrt;
    }

    public final boolean copydefault(@NotNull TacticsData tacticsData, @NotNull OKReminder oKReminder, @NotNull final Function0<Unit> function0) {
        xMV xmvCreateSizeConverterWithIndex$default;
        C54536xML c54536xMLAuCTel;
        ContractGridVo contractGrid;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        BotVo bot = tacticsData.getBot();
        java.lang.String safeString$default = null;
        java.lang.String recommendedMarginTopup = (bot == null || (contractGrid = bot.getContractGrid()) == null) ? null : contractGrid.getRecommendedMarginTopup();
        if (recommendedMarginTopup == null) {
            recommendedMarginTopup = "";
        }
        java.util.List<java.lang.Integer> strategyTags = tacticsData.getStrategyTags();
        boolean z = strategyTags != null && strategyTags.contains(0) && recommendedMarginTopup.length() > 0;
        oKReminder.setVisibility(z ? 0 : 8);
        if (z) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType()) : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null;
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (abstractC54531xLwOLrzqt != null) {
                if (instFamily == null) {
                    instFamily = "";
                }
                xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            } else {
                xmvCreateSizeConverterWithIndex$default = null;
            }
            C54536xML c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default != null ? xmvCreateSizeConverterWithIndex$default.copydefault(recommendedMarginTopup) : null;
            java.lang.String strGEmmrt = c54536xMLCopydefault != null ? c54536xMLCopydefault.gEmmrt() : null;
            java.lang.String str = strGEmmrt != null ? strGEmmrt : "";
            if (c54536xMLCopydefault != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null);
            }
            oKReminder.setMessage((java.lang.CharSequence) C33069mpW.copydefault(C48033uCm.Fragment.tIwhY, C56424yEw.gEmmrt(C56390yDp.OLrzqt("ccy", str), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C53418wlC.KWHzl(safeString$default)))));
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(2);
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C48033uCm.Fragment.glXhWM), new Function0() { // from class: o.wSV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wSY.EZpvd(function0);
                }
            });
        }
        return z;
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean showSyncParamsReminder$default(wSY wsy, TacticsData tacticsData, boolean z, java.lang.String str, OKReminder oKReminder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = "";
        }
        return wsy.AEQbTJ(tacticsData, z2, str, oKReminder, function1);
    }

    public final boolean AEQbTJ(@NotNull TacticsData tacticsData, boolean z, java.lang.String str, @NotNull OKReminder oKReminder, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fZc);
            if (str == null) {
                str = "";
            }
            java.lang.String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("traderName", str)));
            oKReminder.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.Dff));
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(2);
            oKReminder.setMessage(strOLrzqt);
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C48033uCm.Fragment.GiPPlLgiPPlL), new Function0() { // from class: o.wTc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wSY.OLrzqt(function1);
                }
            });
            oKReminder.setVisibility(0);
        } else {
            oKReminder.setVisibility(8);
        }
        return oKReminder.getVisibility() == 0;
    }

    public static final Unit OLrzqt(Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.view.View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.topMargin = C55298xhM.copydefault(f, context);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void KWHzl(@NotNull TacticsData tacticsData, @NotNull OKReminder oKReminder, @NotNull final Function0<Unit> function0) {
        java.util.List<java.lang.Integer> strategyTags;
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_dca")) {
            java.util.List<java.lang.Integer> strategyTags2 = tacticsData.getStrategyTags();
            if (strategyTags2 != null && strategyTags2.contains(1)) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.KDccX);
            } else {
                java.util.List<java.lang.Integer> strategyTags3 = tacticsData.getStrategyTags();
                if (strategyTags3 != null && strategyTags3.contains(0)) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fHqPtx);
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "spot_dca") && (strategyTags = tacticsData.getStrategyTags()) != null && strategyTags.contains(2)) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DcqEDu);
        }
        if (strAYXKKw.length() > 0) {
            oKReminder.setMessage(strAYXKKw);
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(2);
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24Callback), new Function0() { // from class: o.wTe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wSY.OLrzqt(function0);
                }
            });
            oKReminder.setVisibility(0);
            return;
        }
        oKReminder.setVisibility(8);
    }

    public static final Unit OLrzqt(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(@NotNull TacticsData tacticsData, @NotNull OKReminder oKReminder, @NotNull ConstraintLayout constraintLayout, @NotNull final Function0<Unit> function0) {
        C55320xhi c55320xhiKWHzl;
        SmartArbitrageVo smartArbitrage;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "opening")) {
            if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "stopping")) {
                if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "risking")) {
                    if (!tacticsData.isShowTWapTips()) {
                        if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getArbitrageStakingError(), (java.lang.Object) "stake_amount_less_than_min_hold")) {
                            if (tacticsData.getDisplayMinPaybackDays()) {
                                oKReminder.setVisibility(8);
                                constraintLayout.setVisibility(0);
                                BotVo bot = tacticsData.getBot();
                                java.lang.String minimalPaybackDays = (bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null) ? null : smartArbitrage.getMinimalPaybackDays();
                                C55258xgZ c55258xgZ = (C55258xgZ) constraintLayout.findViewById(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi211);
                                if (c55258xgZ != null) {
                                    C55312xha c55312xhaAhwBna = c55258xgZ.AhwBna();
                                    if (c55312xhaAhwBna != null && (c55320xhiKWHzl = c55312xhaAhwBna.KWHzl()) != null) {
                                        c55320xhiKWHzl.setText(C33069mpW.copydefault(C48033uCm.Fragment.XW, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", minimalPaybackDays != null ? minimalPaybackDays : ""))));
                                    }
                                    c55258xgZ.setOnClickListener(new View.OnClickListener() { // from class: o.wTb
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            wSY.AEQbTJ(function0, view);
                                        }
                                    });
                                }
                                constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, function0));
                            } else {
                                oKReminder.setVisibility(8);
                                constraintLayout.setVisibility(8);
                            }
                        } else {
                            oKReminder.setVisibility(0);
                            oKReminder.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKgMxgjU));
                            oKReminder.setMessage(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKffREWX));
                            oKReminder.setCloseIconVisibility(false);
                            oKReminder.setStyle(2);
                            constraintLayout.setVisibility(8);
                        }
                    } else {
                        oKReminder.setVisibility(0);
                        oKReminder.setMessage(C33070mpX.AYXKKw(C48033uCm.Fragment.zEHIKV));
                        oKReminder.setCloseIconVisibility(false);
                        oKReminder.setStyle(0);
                        constraintLayout.setVisibility(8);
                    }
                } else {
                    oKReminder.setVisibility(0);
                    oKReminder.setMessage(C33070mpX.AYXKKw(C55688xof.Application.getSessionToken));
                    oKReminder.setCloseIconVisibility(false);
                    oKReminder.setStyle(0);
                    constraintLayout.setVisibility(8);
                }
            } else {
                oKReminder.setVisibility(0);
                constraintLayout.setVisibility(8);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.QslYrK);
                xMR xmr = xMR.copydefault;
                java.lang.String filledPercentage = tacticsData.getFilledPercentage();
                oKReminder.setTitle(C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr, filledPercentage == null ? "" : filledPercentage, 0, null, 6, null)))));
                oKReminder.setMessage("");
                oKReminder.setCloseIconVisibility(false);
                oKReminder.setStyle(0);
                oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C48033uCm.Fragment.fVjYLc), function0);
                EZpvd(oKReminder, 10.0f);
            }
        } else {
            oKReminder.setVisibility(0);
            constraintLayout.setVisibility(8);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.FHvxmb);
            xMR xmr2 = xMR.copydefault;
            java.lang.String filledPercentage2 = tacticsData.getFilledPercentage();
            oKReminder.setTitle(C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr2, filledPercentage2 == null ? "" : filledPercentage2, 0, null, 6, null)))));
            oKReminder.setMessage("");
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(0);
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C48033uCm.Fragment.dbwnZN), function0);
        }
        return oKReminder.getVisibility() == 0;
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static /* synthetic */ void showAdditionalFundReminder$default(wSY wsy, TacticsData tacticsData, java.lang.String str, java.lang.String str2, OKReminder oKReminder, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        wsy.AEQbTJ(tacticsData, str, str2, oKReminder);
    }

    public final void AEQbTJ(@NotNull TacticsData tacticsData, java.lang.String str, @NotNull java.lang.String str2, @NotNull OKReminder oKReminder) {
        java.lang.String strCopydefault = "";
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "spot_dca")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null;
            java.lang.String tradeQuoteCcy = tacticsData.getTradeQuoteCcy();
            if (tradeQuoteCcy == null) {
                java.lang.String displayQuoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getDisplayQuoteSymbol() : null;
                tradeQuoteCcy = displayQuoteSymbol == null ? "" : displayQuoteSymbol;
            }
            java.lang.String strFmtICUCompactAmountWithSymbol$default = C56033xvF.fmtICUCompactAmountWithSymbol$default(tradeQuoteCcy, C33129mqd.gEmmrt(C33129mqd.EZpvd(str2).abs()), false, null, null, null, 56, null);
            if (C33129mqd.AEQbTJ(str, "0")) {
                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.zblBkD, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.fmtICUCompactAmountWithSymbol$default(tradeQuoteCcy, C33129mqd.gEmmrt(C33129mqd.EZpvd(str).abs()), false, null, null, null, 56, null)), C56390yDp.OLrzqt("ccy", tradeQuoteCcy)));
            } else if (C33129mqd.gEmmrt(str, "0")) {
                if (C33129mqd.AEQbTJ(C33129mqd.EZpvd(str2), "0")) {
                    strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.xxhdY, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strFmtICUCompactAmountWithSymbol$default), C56390yDp.OLrzqt("ccy", tradeQuoteCcy)));
                } else if (C33129mqd.gEmmrt(C33129mqd.EZpvd(str2), "0")) {
                    strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.Dmq, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strFmtICUCompactAmountWithSymbol$default), C56390yDp.OLrzqt("ccy", tradeQuoteCcy)));
                }
            }
        }
        if (strCopydefault.length() > 0) {
            oKReminder.setMessage(strCopydefault);
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(0);
            oKReminder.setVisibility(0);
            return;
        }
        oKReminder.setVisibility(8);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, @NotNull final OKReminder oKReminder, @NotNull final Function0<Unit> function0) {
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        oKReminder.setVisibility(8);
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "stopped")) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
            oKReminder.setVisibility(8);
            return;
        }
        if (z) {
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) str2);
            oKReminder.setVisibility(0);
            if (zOLrzqt || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "starting") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "stopping")) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onReceive);
                oKReminder.setCloseIconVisibility(false);
                oKReminder.setStyle(2);
                oKReminder.setMessage(strAYXKKw);
                return;
            }
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.applyOptions);
            try {
                str4 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21), C56423yEv.EZpvd(C56390yDp.OLrzqt("viewMore", strAYXKKw2))) + "\u200b";
                java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(str4, new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.wTa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return wSY.AEQbTJ(oKReminder, function0, (java.util.List) obj);
                    }
                }, 14, null);
                oKReminder.setCloseIconVisibility(false);
                oKReminder.setStyle(2);
                oKReminder.setMessage(charSequence);
                return;
            } catch (java.lang.Exception e) {
                pUU.KWHzl("BotReminderViewHelper", "reminder init e=" + e);
                pUU.KWHzl("BotReminderViewHelper", str4 + "-" + strAYXKKw2);
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        oKReminder.setVisibility(8);
    }
}
