package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.data.domain.type.DataTabType;
import com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC34425nbo;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.nbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34412nbb extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34412nbb(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:57) call: o.nbb.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34412nbb(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34412nbb(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34412nbb.KWHzl(context, this);
            }
        });
    }

    private final C36081oOo AEQbTJ() {
        return (C36081oOo) this.AEQbTJ.getValue();
    }

    public static final C36081oOo KWHzl(android.content.Context context, C34412nbb c34412nbb) {
        return C36081oOo.KWHzl(android.view.LayoutInflater.from(context), c34412nbb);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nbb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C34412nbb c34412nbb, C34354naW c34354naW, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c34412nbb.KWHzl(c34354naW, (Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit>) function1);
    }

    public final void KWHzl(@NotNull C34354naW c34354naW, Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1) {
        Intrinsics.checkNotNullParameter(c34354naW, "");
        this.copydefault = function1;
        KWHzl(c34354naW);
        EZpvd();
    }

    private final void EZpvd() {
        final C36081oOo c36081oOoAEQbTJ = AEQbTJ();
        mUO.setOnDoubleCheckClickListener$default(c36081oOoAEQbTJ.valueOf, 0L, new Function1() { // from class: o.nbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.AEQbTJ(c36081oOoAEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C36081oOo c36081oOo, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayoutCompat linearLayoutCompat = c36081oOo.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        if (linearLayoutCompat.getVisibility() == 0) {
            LinearLayoutCompat linearLayoutCompat2 = c36081oOo.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(8);
            c36081oOo.valueOf.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DCUTEIddSDPG));
        } else {
            LinearLayoutCompat linearLayoutCompat3 = c36081oOo.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(0);
            c36081oOo.valueOf.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DNMMPQ));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(C34354naW c34354naW) {
        copydefault(c34354naW);
        EZpvd(c34354naW);
    }

    public final void copydefault(C34354naW c34354naW) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.String strOLrzqt3;
        C36081oOo c36081oOoAEQbTJ = AEQbTJ();
        C34352naU c34352naU = c36081oOoAEQbTJ.KWHzl;
        CoinInfoGridCellId coinInfoGridCellId = CoinInfoGridCellId.LIQUIDITY;
        java.lang.String string = getContext().getString(C35964oKf.Fragment.DzkRMH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strGEmmrt = c34354naW.gEmmrt();
        if (strGEmmrt == null || (strOLrzqt = mRJ.AEQbTJ.OLrzqt(strGEmmrt, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? true : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false)) == null) {
            strOLrzqt = "--";
        }
        android.text.SpannedString spannedStringAEQbTJ = AEQbTJ(strOLrzqt);
        java.lang.Integer numValueOf = C33129mqd.OLrzqt((java.lang.CharSequence) c34354naW.djBIcL()) ? java.lang.Integer.valueOf(C35964oKf.Activity.aKErDB) : null;
        int iCopydefault = mUM.copydefault(C52761wXj.ActionBar.DCUTEI);
        java.lang.String strGEmmrt2 = c34354naW.gEmmrt();
        c34352naU.setData(new C34423nbm(coinInfoGridCellId, string, spannedStringAEQbTJ, null, java.lang.Integer.valueOf(iCopydefault), numValueOf, null, null, (strGEmmrt2 == null || strGEmmrt2.length() == 0) ? null : new InterfaceC34425nbo.StateListAnimator(CoinDetailTabType.DATA.ordinal(), DataTabType.LIQUIDITY_INFO.ordinal()), 200, null));
        c36081oOoAEQbTJ.KWHzl.setOnCellAction(new Function1() { // from class: o.nbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.djBIcL(this.KWHzl, (InterfaceC34425nbo) obj);
            }
        });
        C34352naU c34352naU2 = c36081oOoAEQbTJ.copydefault;
        CoinInfoGridCellId coinInfoGridCellId2 = CoinInfoGridCellId.FDV;
        java.lang.String string2 = getContext().getString(C35964oKf.Fragment.QFTsTN);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String strAhwBna = c34354naW.AhwBna();
        if (strAhwBna == null || (strOLrzqt2 = mRJ.AEQbTJ.OLrzqt(strAhwBna, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? true : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false)) == null) {
            strOLrzqt2 = "--";
        }
        c34352naU2.setData(new C34423nbm(coinInfoGridCellId2, string2, AEQbTJ(strOLrzqt2), null, null, null, null, new InterfaceC34425nbo.Activity(C35964oKf.Fragment.DQYQgr, C35964oKf.Fragment.Swccd), null, 376, null));
        c36081oOoAEQbTJ.copydefault.setOnCellAction(new Function1() { // from class: o.nbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.AYXKKw(this.AEQbTJ, (InterfaceC34425nbo) obj);
            }
        });
        C34352naU c34352naU3 = c36081oOoAEQbTJ.AEQbTJ;
        CoinInfoGridCellId coinInfoGridCellId3 = CoinInfoGridCellId.MCAP;
        java.lang.String string3 = getContext().getString(C35964oKf.Fragment.zzQwtT);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String strValueOf = c34354naW.valueOf();
        if (strValueOf == null || (strOLrzqt3 = mRJ.AEQbTJ.OLrzqt(strValueOf, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? true : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false)) == null) {
            strOLrzqt3 = "--";
        }
        c34352naU3.setData(new C34423nbm(coinInfoGridCellId3, string3, AEQbTJ(strOLrzqt3), null, null, null, null, new InterfaceC34425nbo.Activity(C35964oKf.Fragment.ihnvzI, C35964oKf.Fragment.RvdRAu), null, 376, null));
        c36081oOoAEQbTJ.AEQbTJ.setOnCellAction(new Function1() { // from class: o.nbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.valueOf(this.OLrzqt, (InterfaceC34425nbo) obj);
            }
        });
        C34352naU c34352naU4 = c36081oOoAEQbTJ.EZpvd;
        CoinInfoGridCellId coinInfoGridCellId4 = CoinInfoGridCellId.HOLDERS;
        java.lang.String string4 = getContext().getString(C35964oKf.Fragment.atDTRm);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        android.text.SpannedString spannedStringAEQbTJ2 = AEQbTJ(mRA.getNumberICU$default(c34354naW.values(), RoundingMode.HALF_DOWN, null, null, null, 14, null));
        java.lang.String strValues = c34354naW.values();
        c34352naU4.setData(new C34423nbm(coinInfoGridCellId4, string4, spannedStringAEQbTJ2, null, null, null, null, null, (strValues == null || strValues.length() == 0) ? null : new InterfaceC34425nbo.StateListAnimator(CoinDetailTabType.DATA.ordinal(), DataTabType.HOLDERS_CHANGE.ordinal()), 248, null));
        c36081oOoAEQbTJ.EZpvd.setOnCellAction(new Function1() { // from class: o.nbk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.gEmmrt(this.EZpvd, (InterfaceC34425nbo) obj);
            }
        });
        java.lang.String strOLrzqt4 = c34354naW.OLrzqt();
        if (strOLrzqt4 == null) {
            strOLrzqt4 = "";
        }
        C34352naU c34352naU5 = c36081oOoAEQbTJ.OLrzqt;
        CoinInfoGridCellId coinInfoGridCellId5 = CoinInfoGridCellId.CONTRACT_ADDRESS;
        java.lang.String string5 = getContext().getString(C35964oKf.Fragment.QYvkLl);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        c34352naU5.setData(new C34423nbm(coinInfoGridCellId5, string5, AEQbTJ(strOLrzqt4.length() == 0 ? "--" : mUO.formatAddress$default(strOLrzqt4, 3, 3, null, 4, null)), null, null, null, strOLrzqt4.length() != 0 ? java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZxnNGp) : null, null, new InterfaceC34425nbo.TaskDescription(C35964oKf.Fragment.onComplete, strOLrzqt4), CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, null));
        c36081oOoAEQbTJ.OLrzqt.setOnCellAction(new Function1() { // from class: o.nbp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.values(this.AEQbTJ, (InterfaceC34425nbo) obj);
            }
        });
        c36081oOoAEQbTJ.djBIcL.setData(new C34423nbm(CoinInfoGridCellId.RISK, C33070mpX.AYXKKw(C35964oKf.Fragment.DwQSDd), AEQbTJ("--"), null, null, null, null, null, null, 248, null));
        c36081oOoAEQbTJ.djBIcL.setOnCellAction(new Function1() { // from class: o.nbn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.AkhnZx(this.copydefault, (InterfaceC34425nbo) obj);
            }
        });
    }

    public static final Unit djBIcL(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public static final Unit values(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C34412nbb c34412nbb, InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        c34412nbb.KWHzl(interfaceC34425nbo);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final C34354naW c34354naW) {
        java.lang.String str;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.String address$default;
        C36081oOo c36081oOoAEQbTJ = AEQbTJ();
        java.lang.String strCopydefault = c34354naW.copydefault();
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        java.lang.String numberICU$default = mRA.getNumberICU$default(strCopydefault, roundingMode, null, null, null, 14, null);
        ConstraintLayout constraintLayout = c36081oOoAEQbTJ.isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AppCompatTextView appCompatTextView = c36081oOoAEQbTJ.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        setExpandedCell(numberICU$default, constraintLayout, appCompatTextView);
        mUO.setOnDoubleCheckClickListener$default(c36081oOoAEQbTJ.zsXlph, 0L, new Function1() { // from class: o.nbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        java.lang.String numberICU$default2 = mRA.getNumberICU$default(c34354naW.AYXKKw(), roundingMode, null, null, null, 14, null);
        ConstraintLayout constraintLayout2 = c36081oOoAEQbTJ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        AppCompatTextView appCompatTextView2 = c36081oOoAEQbTJ.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        setExpandedCell(numberICU$default2, constraintLayout2, appCompatTextView2);
        mUO.setOnDoubleCheckClickListener$default(c36081oOoAEQbTJ.AubY, 0L, new Function1() { // from class: o.nbc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34412nbb.AEQbTJ(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
        java.lang.String strAEQbTJ = c34354naW.AEQbTJ();
        if (strAEQbTJ != null) {
            str = "";
            strOLrzqt = mRJ.AEQbTJ.OLrzqt(strAEQbTJ, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : roundingMode, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
        } else {
            str = "";
            strOLrzqt = null;
        }
        ConstraintLayout constraintLayout3 = c36081oOoAEQbTJ.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, str);
        AppCompatTextView appCompatTextView3 = c36081oOoAEQbTJ.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, str);
        setExpandedCell(strOLrzqt, constraintLayout3, appCompatTextView3);
        java.lang.String strKWHzl = c34354naW.KWHzl();
        if (strKWHzl != null) {
            strOLrzqt2 = mRJ.AEQbTJ.OLrzqt(strKWHzl, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : roundingMode, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
        } else {
            strOLrzqt2 = null;
        }
        ConstraintLayout constraintLayout4 = c36081oOoAEQbTJ.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, str);
        AppCompatTextView appCompatTextView4 = c36081oOoAEQbTJ.uzCIH;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, str);
        setExpandedCell(strOLrzqt2, constraintLayout4, appCompatTextView4);
        java.lang.String strDbNXlk = c34354naW.DbNXlk();
        ConstraintLayout constraintLayout5 = c36081oOoAEQbTJ.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, str);
        AppCompatTextView appCompatTextView5 = c36081oOoAEQbTJ.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, str);
        setExpandedCell(strDbNXlk, constraintLayout5, appCompatTextView5);
        ConstraintLayout constraintLayout6 = c36081oOoAEQbTJ.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout6, str);
        if (constraintLayout6.getVisibility() == 0) {
            AppCompatImageView appCompatImageView = c36081oOoAEQbTJ.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, str);
            C33054mpH.loadUrl$default(appCompatImageView, c34354naW.EZpvd(), null, 0, 0, 14, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c34354naW.AkhnZx())) {
            java.lang.String strAkhnZx = c34354naW.AkhnZx();
            address$default = strAkhnZx != null ? mUO.formatAddress$default(strAkhnZx, 4, 4, null, 4, null) : null;
        } else {
            address$default = "--";
        }
        ConstraintLayout constraintLayout7 = c36081oOoAEQbTJ.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout7, str);
        AppCompatTextView appCompatTextView6 = c36081oOoAEQbTJ.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView6, str);
        setExpandedCell(address$default, constraintLayout7, appCompatTextView6);
        java.lang.String strAkhnZx2 = c34354naW.AkhnZx();
        if (strAkhnZx2 != null) {
            AppCompatImageView appCompatImageView2 = c36081oOoAEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, str);
            appCompatImageView2.setVisibility((!C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx2) || Intrinsics.EZpvd((java.lang.Object) strAkhnZx2, (java.lang.Object) "--")) ? 8 : 0);
            mUO.setOnDoubleCheckClickListener$default(c36081oOoAEQbTJ.AYXKKw, 0L, new Function1() { // from class: o.nbe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34412nbb.KWHzl(this.KWHzl, c34354naW, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(C34412nbb c34412nbb, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34412nbb.KWHzl(new InterfaceC34425nbo.Activity(C35964oKf.Fragment.geLlBI, C35964oKf.Fragment.RAQtXZ));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34412nbb c34412nbb, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34412nbb.KWHzl(new InterfaceC34425nbo.Activity(C35964oKf.Fragment.zLAIeZ, C35964oKf.Fragment.fkESqH));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34412nbb c34412nbb, C34354naW c34354naW, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34412nbb.KWHzl(new InterfaceC34425nbo.TaskDescription(C35964oKf.Fragment.onComplete, c34354naW.AkhnZx()));
        return Unit.INSTANCE;
    }

    public final void setExpandedCell(java.lang.String str, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        if (str == null || str.length() == 0) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            appCompatTextView.setText(str);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mUo.copyAddress$default(int, android.content.Context, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void KWHzl(InterfaceC34425nbo interfaceC34425nbo) {
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.Activity) {
            android.content.Context context = getContext();
            if (context != null) {
                InterfaceC34425nbo.Activity activity = (InterfaceC34425nbo.Activity) interfaceC34425nbo;
                java.lang.String string = context.getString(activity.KWHzl());
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = context.getString(activity.AEQbTJ());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                mUO.AEQbTJ(context, string, string2, C35964oKf.Fragment.djSkpj);
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.Application) {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                InterfaceC34425nbo.Application application = (InterfaceC34425nbo.Application) interfaceC34425nbo;
                mUO.AEQbTJ(context2, application.OLrzqt(), application.AEQbTJ(), C35964oKf.Fragment.djSkpj);
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.StateListAnimator) {
            Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1 = this.copydefault;
            if (function1 != null) {
                InterfaceC34425nbo.StateListAnimator stateListAnimator = (InterfaceC34425nbo.StateListAnimator) interfaceC34425nbo;
                function1.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(stateListAnimator.copydefault()), java.lang.Integer.valueOf(stateListAnimator.EZpvd())));
                return;
            }
            return;
        }
        if (interfaceC34425nbo instanceof InterfaceC34425nbo.TaskDescription) {
            InterfaceC34425nbo.TaskDescription taskDescription = (InterfaceC34425nbo.TaskDescription) interfaceC34425nbo;
            int iCopydefault = taskDescription.copydefault();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C32237mUo.copyAddress$default(iCopydefault, context3, taskDescription.OLrzqt(), null, 8, null);
            return;
        }
        if (!(interfaceC34425nbo instanceof InterfaceC34425nbo.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        ((InterfaceC34425nbo.ActionBar) interfaceC34425nbo).AEQbTJ().invoke();
    }

    public final android.text.SpannedString AEQbTJ(java.lang.String str) {
        return copydefault(str, mUM.copydefault(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--") ? C52761wXj.Activity.DCUTEIddSDPG : C52761wXj.Activity.fdOvFl));
    }

    public final void AEQbTJ(@NotNull TokenDetail tokenDetail) {
        Intrinsics.checkNotNullParameter(tokenDetail, "");
        C36081oOo c36081oOoAEQbTJ = AEQbTJ();
        java.lang.String strDjBIcL = tokenDetail.djBIcL();
        if (strDjBIcL != null) {
            c36081oOoAEQbTJ.KWHzl.AEQbTJ(mRJ.AEQbTJ.OLrzqt(strDjBIcL, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? true : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
        }
        java.lang.String strValues = tokenDetail.values();
        if (strValues != null) {
            c36081oOoAEQbTJ.AEQbTJ.AEQbTJ(mRJ.AEQbTJ.OLrzqt(strValues, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? true : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
        }
        java.lang.String strAhwBna = tokenDetail.AhwBna();
        if (strAhwBna != null) {
            c36081oOoAEQbTJ.EZpvd.AEQbTJ(mRA.getNumberICU$default(strAhwBna, RoundingMode.HALF_DOWN, null, null, null, 14, null));
        }
    }

    public final void KWHzl(@NotNull C32299mWw c32299mWw) {
        Triple triple;
        Triple triple2;
        Intrinsics.checkNotNullParameter(c32299mWw, "");
        if (C33129mqd.AhwBna(c32299mWw.AEQbTJ()) == 0 && C33129mqd.AhwBna(c32299mWw.KWHzl()) == 0) {
            triple = new Triple(null, null, C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKDCKfqP));
        } else {
            if (C33129mqd.AhwBna(c32299mWw.AEQbTJ()) > 0) {
                triple2 = new Triple(java.lang.Integer.valueOf(C52761wXj.TaskDescription.zNQIcI), java.lang.Integer.valueOf(C52761wXj.ActionBar.OuxcSI), c32299mWw.AEQbTJ());
            } else if (C33129mqd.AhwBna(c32299mWw.KWHzl()) > 0) {
                triple2 = new Triple(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZqidTP), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq), c32299mWw.KWHzl());
            } else {
                triple = new Triple(null, null, C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKDIADVb));
            }
            triple = triple2;
        }
        java.lang.Integer num = (java.lang.Integer) triple.component1();
        java.lang.Integer num2 = (java.lang.Integer) triple.component2();
        AEQbTJ().djBIcL.setData(new C34423nbm(CoinInfoGridCellId.RISK, C33070mpX.AYXKKw(C35964oKf.Fragment.DwQSDd), AEQbTJ((java.lang.String) triple.component3()), null, num2 != null ? java.lang.Integer.valueOf(mUM.copydefault(num2.intValue())) : null, num, null, null, new InterfaceC34425nbo.StateListAnimator(CoinDetailTabType.ASSESSMENT.ordinal(), 0), 200, null));
    }

    public final android.text.SpannedString copydefault(java.lang.String str, @androidx.annotation.ColorInt int i) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, str.length(), 33);
        return new android.text.SpannedString(spannableStringBuilder);
    }
}
