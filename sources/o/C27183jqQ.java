package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestSocialShareDateFormat;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import java.util.Calendar;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.jqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27183jqQ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InvestProductDetailResponse EZpvd;
    public final Function0<android.app.Activity> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends android.app.Activity> */
    /* JADX WARN: Multi-variable type inference failed */
    public C27183jqQ(@NotNull InvestProductDetailResponse investProductDetailResponse, @NotNull Function0<? extends android.app.Activity> function0) {
        Intrinsics.checkNotNullParameter(investProductDetailResponse, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = investProductDetailResponse;
        this.KWHzl = function0;
    }

    public final android.view.View KWHzl(int i) {
        C23823iKq c23823iKqOLrzqt = C23823iKq.OLrzqt(this.KWHzl.invoke().getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c23823iKqOLrzqt, "");
        c23823iKqOLrzqt.getRoot().setLayoutDirection(i);
        KWHzl(c23823iKqOLrzqt);
        AEQbTJ(c23823iKqOLrzqt);
        InvestSocialShareDateFormat investSocialShareDateFormatAEQbTJ = AEQbTJ();
        c23823iKqOLrzqt.ejfBZ.setText(C33069mpW.KWHzl(this.KWHzl.invoke(), this.EZpvd.getRate().length() == 0 ? C25493ixk.FragmentManager.aKhcqp : C25493ixk.FragmentManager.dPnHjp, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("apyapr", C27541jxD.KWHzl.KWHzl(this.KWHzl.invoke(), java.lang.Integer.valueOf(this.EZpvd.getRateType()))), C56390yDp.OLrzqt("timezone", investSocialShareDateFormatAEQbTJ.getTimeZone()), C56390yDp.OLrzqt("date", investSocialShareDateFormatAEQbTJ.getDate()))));
        ConstraintLayout root = c23823iKqOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void KWHzl(C23823iKq c23823iKq) {
        java.lang.String platformName;
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.app.Activity activityInvoke = this.KWHzl.invoke();
        C27212jqt c27212jqt = c23823iKq.AYXKKw;
        java.util.List<InvestLogoBaseVo> middleLogoList = this.EZpvd.getMiddleLogoList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = middleLogoList.iterator();
        while (it.hasNext()) {
            java.lang.String tokenLogo = ((InvestLogoBaseVo) it.next()).getTokenLogo();
            if (tokenLogo != null) {
                arrayList.add(tokenLogo);
            }
        }
        InvestLogoBaseVo investLogoBaseVo = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.getTopLeftLogoList());
        java.lang.String tokenLogo2 = investLogoBaseVo != null ? investLogoBaseVo.getTokenLogo() : null;
        if (tokenLogo2 == null) {
            tokenLogo2 = "";
        }
        InvestLogoBaseVo investLogoBaseVo2 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.getTopRightLogoList());
        java.lang.String tokenLogo3 = investLogoBaseVo2 != null ? investLogoBaseVo2.getTokenLogo() : null;
        if (tokenLogo3 == null) {
            tokenLogo3 = "";
        }
        InvestLogoBaseVo investLogoBaseVo3 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.getBottomRightLogoList());
        java.lang.String tokenLogo4 = investLogoBaseVo3 != null ? investLogoBaseVo3.getTokenLogo() : null;
        if (tokenLogo4 == null) {
            tokenLogo4 = "";
        }
        c27538jxA.KWHzl(activityInvoke, c27212jqt, c27538jxA.EZpvd(arrayList, tokenLogo2, tokenLogo3, tokenLogo4), 36.0f, 18.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (96 & 64) != 0 ? 1.0f : 0.0f);
        if (this.EZpvd.getTopLeftLogoList().isEmpty()) {
            C27212jqt c27212jqt2 = c23823iKq.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c27212jqt2, "");
            ViewGroup.LayoutParams layoutParams = c27212jqt2.getLayoutParams();
            if (layoutParams != null) {
                LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
                android.content.Context context = c23823iKq.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams2.setMarginStart(C55298xhM.copydefault(-4.0f, context));
                c27212jqt2.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            }
        }
        c23823iKq.fARcdN.setText(this.EZpvd.getInvestmentName());
        if (this.EZpvd.getInvestmentClassify().length() > 0) {
            android.content.Context context2 = c23823iKq.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            platformName = C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.DsrFlB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("protocolName", this.EZpvd.getPlatformName()), C56390yDp.OLrzqt("protocolType", this.EZpvd.getInvestmentClassify())));
        } else {
            platformName = this.EZpvd.getPlatformName();
        }
        c23823iKq.AuCTel.setText(platformName);
        c23823iKq.fJNWhG.setTextColor(C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null));
        c23823iKq.fJNWhG.setText(this.EZpvd.getRate().length() == 0 ? "--" : C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, this.EZpvd.getRate(), false, 2, null));
        c23823iKq.getNewProxyInstance.setText(C27541jxD.KWHzl.KWHzl(this.KWHzl.invoke(), java.lang.Integer.valueOf(this.EZpvd.getRateType())));
    }

    public final void AEQbTJ(C23823iKq c23823iKq) {
        c23823iKq.iwGUEr.setText(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, this.EZpvd.getTvl(), false, false, 6, null));
        c23823iKq.gEmmrt.setData(C56402yEa.EZpvd(new C27188jqV(C56402yEa.EZpvd(this.EZpvd.getNetworkLogo()), this.EZpvd.getNetwork())));
        c23823iKq.AhwBna.setData(C56402yEa.EZpvd(new C27188jqV(C56402yEa.EZpvd(this.EZpvd.getPlatformLogo()), this.EZpvd.getPlatformName())));
        OLrzqt(c23823iKq);
    }

    public final void OLrzqt(C23823iKq c23823iKq) {
        java.util.List<C27188jqV> listEZpvd;
        int size;
        if (C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(this.EZpvd.getInvestType()))) {
            java.util.List listAhwBna = yDY.AhwBna();
            java.lang.String string = c23823iKq.getRoot().getContext().getString(C25493ixk.FragmentManager.DcMfJKDCKfqP);
            Intrinsics.checkNotNullExpressionValue(string, "");
            listEZpvd = C56402yEa.EZpvd(new C27188jqV(listAhwBna, string));
        } else if (this.EZpvd.getEarnedToken().isEmpty()) {
            listEZpvd = C56402yEa.EZpvd(new C27188jqV(yDY.AhwBna(), "--"));
        } else if (this.EZpvd.getEarnedToken().size() == 2) {
            java.util.List<InvestUnderlyingToken> earnedToken = this.EZpvd.getEarnedToken();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : earnedToken) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((InvestUnderlyingToken) obj).getTokenLogo())) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InvestUnderlyingToken) it.next()).getTokenLogo());
            }
            listEZpvd = C56402yEa.EZpvd(new C27188jqV(arrayList2, CollectionsKt___CollectionsKt.joinToString$default(this.EZpvd.getEarnedToken(), Marker.ANY_NON_NULL_MARKER, null, null, 0, null, new Function1() { // from class: o.jqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C27183jqQ.AEQbTJ((InvestUnderlyingToken) obj2);
                }
            }, 30, null)));
        } else {
            java.util.List<InvestUnderlyingToken> earnedToken2 = this.EZpvd.getEarnedToken();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(earnedToken2, 10));
            for (InvestUnderlyingToken investUnderlyingToken : earnedToken2) {
                arrayList3.add(new C27188jqV(C56402yEa.EZpvd(investUnderlyingToken.getTokenLogo()), investUnderlyingToken.getTokenSymbol()));
            }
            listEZpvd = arrayList3;
        }
        if (KWHzl()) {
            size = listEZpvd.size() + 1;
        } else {
            size = listEZpvd.size();
        }
        if (size > 3) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listEZpvd, 2));
            java.util.List listAhwBna2 = yDY.AhwBna();
            java.lang.String string2 = this.KWHzl.invoke().getString(C25493ixk.FragmentManager.aVhqwO);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listOLrzqt.add(new C27188jqV(listAhwBna2, string2));
            c23823iKq.AEQbTJ.setData(C56402yEa.fARcdN(listOLrzqt));
            return;
        }
        c23823iKq.AEQbTJ.setData(listEZpvd);
        LinearLayoutCompat linearLayoutCompat = c23823iKq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(KWHzl() ? 0 : 8);
    }

    public static final java.lang.CharSequence AEQbTJ(InvestUnderlyingToken investUnderlyingToken) {
        Intrinsics.checkNotNullParameter(investUnderlyingToken, "");
        return investUnderlyingToken.getTokenSymbol();
    }

    public final InvestSocialShareDateFormat AEQbTJ() {
        java.lang.String str;
        java.lang.String standardTime$default = pTA.formatStandardTime$default(new Date(), null, 1, null);
        java.lang.String standardDate$default = pTA.formatStandardDate$default(new Date(), null, 1, null);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 3600000;
        if (rawOffset < 0) {
            str = "(UTC-" + java.lang.Math.abs(rawOffset) + ")";
        } else {
            str = "(UTC+" + rawOffset + ")";
        }
        return new InvestSocialShareDateFormat(standardTime$default + " " + str, standardDate$default);
    }

    public final boolean KWHzl() {
        return this.EZpvd.isExistTradingFee() == 1;
    }

    /* JADX INFO: renamed from: o.jqQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jqQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
