package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3Uilib.bean.MultiTransactionDetailBean;
import com.okinc.web3Uilib.bean.MultiTransactionDetailItem;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.fYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17946fYd {
    public static final C17946fYd AEQbTJ = new C17946fYd();

    private C17946fYd() {
    }

    public final java.lang.String KWHzl(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        if (!(oKWBaseTransaction instanceof AbstractC8564bFB)) {
            return "";
        }
        java.lang.Object objQKudOq = ((AbstractC8564bFB) oKWBaseTransaction).QKudOq();
        if (!(objQKudOq instanceof AbstractC8485bDc)) {
            return "";
        }
        if (objQKudOq instanceof InterfaceC9347bTq) {
            InterfaceC9347bTq interfaceC9347bTq = (InterfaceC9347bTq) objQKudOq;
            if (interfaceC9347bTq.fIwbmz() == 0 || interfaceC9347bTq.fIwbmz() == 1) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.v);
            }
        }
        switch (((AbstractC8485bDc) objQKudOq).DbNXlk()) {
            case 31:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.fdt);
            case 32:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDaTmkG);
            case 33:
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.FYtjSf);
            default:
                return C33070mpX.AYXKKw(((objQKudOq instanceof C9312bTH) && ((C9312bTH) objQKudOq).AubY()) ? C13754dXa.FragmentManager.createIntentactivity_release : C13754dXa.FragmentManager.v);
        }
    }

    public final java.lang.CharSequence copydefault(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9041bOB interfaceC9041bOB, java.lang.String str, java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
        if (interfaceC9041bOB.gHZMYf()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OEsIKP);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV);
            return new android.text.SpannableStringBuilder().append(C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.fYa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17946fYd.copydefault((java.util.List) obj);
                }
            }, 14, null)).append(C33061mpO.setupSpanStyles$default(strAYXKKw2, new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.fYc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17946fYd.AEQbTJ(fragmentManager, (java.util.List) obj);
                }
            }, 14, null));
        }
        if (1 > i || i >= i2) {
            if (str == null || str2 == null) {
                return null;
            }
            return C33069mpW.copydefault(C13754dXa.FragmentManager.FullyDrawnReporterKt, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amount1", str), C56390yDp.OLrzqt("amount2", str2)));
        }
        if (str != null && str2 != null) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.FullyDrawnReporterExternalSyntheticLambda0, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amount1", str), C56390yDp.OLrzqt("amount2", str2)));
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSingleChoiceItems);
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fYd$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ androidx.fragment.app.FragmentManager AEQbTJ;

        public TaskDescription(androidx.fragment.app.FragmentManager fragmentManager) {
            this.AEQbTJ = fragmentManager;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            new C21271gwc().show(this.AEQbTJ);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.linkColor = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            super.updateDrawState(textPaint);
        }
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TaskDescription(fragmentManager));
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull InterfaceC9752bbX interfaceC9752bbX) {
        Intrinsics.checkNotNullParameter(interfaceC9752bbX, "");
        C8394bBr c8394bBr = (C8394bBr) interfaceC9752bbX;
        return KWHzl(c8394bBr.valueOf().QKudOq(), c8394bBr.KWHzl());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C9745bbQ c9745bbQ) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c9745bbQ, "");
        int iOLrzqt = c9745bbQ.OLrzqt();
        if (iOLrzqt == 0) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onOpenSubMenu), C33069mpW.copydefault(C13754dXa.FragmentManager.isPowerSaveMode, C56423yEv.EZpvd(C56390yDp.OLrzqt("times", java.lang.String.valueOf(c9745bbQ.AEQbTJ())))));
        }
        if (iOLrzqt == 1) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionModeCallbackWrapperV91), C33069mpW.copydefault(C13754dXa.FragmentManager.AppCompatDelegateImplApi21Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCW, C33129mqd.EZpvd(c9745bbQ.copydefault()), false, false, 2, null)))));
        }
        if (iOLrzqt == 2) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionModeCallbackWrapperV91), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi24Impl));
        }
        if (iOLrzqt == 3) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionModeCallbackWrapperV91), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSubDecorInstalled));
        }
        if (iOLrzqt == 4) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionModeCallbackWrapperV91), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDestroyActionMode));
        }
        return C56390yDp.OLrzqt("", "");
    }

    public final C9746bbR KWHzl(android.content.Context context, @NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull C9745bbQ c9745bbQ, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(c9745bbQ, "");
        if (c9745bbQ.OLrzqt() == 0) {
            C57304yfr c57304yfr = C57304yfr.copydefault;
            return new C9746bbR(1, c57304yfr.OLrzqt(context, C57406yhn.Activity.OcIXYQ, C52761wXj.Activity.HJWChPRAkuRW), c57304yfr.EZpvd(0, pair.getFirst(), pair.getSecond()));
        }
        if (charSequence != null) {
            return new C9746bbR(0, null, charSequence);
        }
        if (c9745bbQ.OLrzqt() == 1) {
            C57304yfr c57304yfr2 = C57304yfr.copydefault;
            return new C9746bbR(0, c57304yfr2.OLrzqt(context, C57406yhn.Activity.OcIXYQ, C52761wXj.Activity.HJWChPQdUnVm), c57304yfr2.EZpvd(1, pair.getFirst(), pair.getSecond()));
        }
        if (c9745bbQ.OLrzqt() == 2) {
            C57304yfr c57304yfr3 = C57304yfr.copydefault;
            return new C9746bbR(0, c57304yfr3.OLrzqt(context, C57406yhn.Activity.OcIXYQ, C52761wXj.Activity.HJWChPQdUnVm), c57304yfr3.EZpvd(1, pair.getFirst(), pair.getSecond()));
        }
        if (c9745bbQ.OLrzqt() == 3) {
            C57304yfr c57304yfr4 = C57304yfr.copydefault;
            return new C9746bbR(0, c57304yfr4.OLrzqt(context, C57406yhn.Activity.OcIXYQ, C52761wXj.Activity.HJWChPQdUnVm), c57304yfr4.EZpvd(1, pair.getFirst(), pair.getSecond()));
        }
        if (c9745bbQ.OLrzqt() == 4) {
            C57304yfr c57304yfr5 = C57304yfr.copydefault;
            return new C9746bbR(0, c57304yfr5.OLrzqt(context, C57406yhn.Activity.OcIXYQ, C52761wXj.Activity.HJWChPQdUnVm), c57304yfr5.EZpvd(1, pair.getFirst(), pair.getSecond()));
        }
        return new C9746bbR(0, null, null);
    }

    public static /* synthetic */ java.lang.String formatAssetCoinAmount$default(C17946fYd c17946fYd, long j, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c17946fYd.copydefault(j, str, z3, z2);
    }

    public final java.lang.String copydefault(long j, @NotNull java.lang.String str, boolean z, boolean z2) {
        int iFZBcTu;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(j), true);
        if (c10854bwMCopydefault == null) {
            return "";
        }
        java.lang.String strFJNWhG = z ? c10854bwMCopydefault.fJNWhG() : null;
        int iValueOf = c10854bwMCopydefault.valueOf();
        if (z2) {
            iFZBcTu = c10854bwMCopydefault.AkhnZx();
        } else {
            iFZBcTu = c10854bwMCopydefault.fZBcTu();
        }
        return C54870xYj.EZpvd(str, iValueOf, iFZBcTu, strFJNWhG, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(c10854bwMCopydefault.getNewProxyInstance()), (248 & 64) != 0 ? false : z2, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public final java.lang.String AEQbTJ(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, long j, @NotNull java.lang.String str) {
        WalletTickerManager.CoinPrice coinPriceCopydefault;
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(j), true);
        return (c10854bwMCopydefault == null || (coinPriceCopydefault = abstractC8564bFB.DarRvM().copydefault(java.lang.Long.valueOf(j))) == null || !coinPriceCopydefault.getHasPrice()) ? "" : C54880xYt.formatValuationFromAsset$default(C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, c10854bwMCopydefault.valueOf()), coinPriceCopydefault.getRealPrice()), false, null, null, 7, null), abstractC8564bFB.zuWLRA().KWHzl(), true, 0, false, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull AbstractC9832bcy abstractC9832bcy, @NotNull InterfaceC9734bbF interfaceC9734bbF) {
        C10854bwM c10854bwMDHguZz;
        C10854bwM c10854bwMDHguZz2;
        C10854bwM c10854bwMDHguZz3;
        java.lang.String strAYXKKw;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        C8410bCG c8410bCG = (C8410bCG) interfaceC9734bbF;
        OKWBaseTransaction<?> oKWBaseTransactionFIwbmz = c8410bCG.fIwbmz();
        if (abstractC9832bcy instanceof C9868bdh) {
            return ((C9868bdh) abstractC9832bcy).AEQbTJ();
        }
        java.lang.String strFJNWhG = null;
        if (abstractC9832bcy instanceof C9870bdj) {
            C9870bdj c9870bdj = (C9870bdj) abstractC9832bcy;
            if (c9870bdj.gEmmrt()) {
                int i = C13754dXa.FragmentManager.MediaControllerCompatApi23TransportControls;
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                ActionBar actionBar = new ActionBar(context, abstractC9832bcy);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) C14079deg.getAddressStr$default(C14079deg.EZpvd, c9870bdj.copydefault(), false, 2, null));
                spannableStringBuilder.setSpan(actionBar, length, spannableStringBuilder.length(), 17);
                Unit unit = Unit.INSTANCE;
                android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
                Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
                return C33069mpW.copydefault(context, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("contractaddress", spannableStringValueOf)));
            }
            int i2 = C13754dXa.FragmentManager.setIconBitmap;
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            Activity activity = new Activity(context, abstractC9832bcy);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((java.lang.CharSequence) C14079deg.getAddressStr$default(C14079deg.EZpvd, c9870bdj.copydefault(), false, 2, null));
            spannableStringBuilder2.setSpan(activity, length2, spannableStringBuilder2.length(), 17);
            Unit unit2 = Unit.INSTANCE;
            android.text.SpannableString spannableStringValueOf2 = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder2));
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf2, "");
            return C33069mpW.copydefault(context, i2, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, spannableStringValueOf2)));
        }
        if (abstractC9832bcy instanceof C9786bcE) {
            InterfaceC9752bbX interfaceC9752bbXGEmmrt = c8410bCG.gEmmrt();
            if (interfaceC9752bbXGEmmrt == null || (interfaceC9731bbCEZpvd = interfaceC9752bbXGEmmrt.EZpvd()) == null) {
                return null;
            }
            return C33069mpW.copydefault(C13754dXa.FragmentManager.apLTlu, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9731bbCEZpvd.fJNWhG())));
        }
        if (abstractC9832bcy instanceof C9784bcC) {
            InterfaceC9752bbX interfaceC9752bbXGEmmrt2 = c8410bCG.gEmmrt();
            if (interfaceC9752bbXGEmmrt2 == null) {
                return null;
            }
            java.lang.String strFJNWhG2 = interfaceC9752bbXGEmmrt2.EZpvd().fJNWhG();
            C9784bcC c9784bcC = (C9784bcC) abstractC9832bcy;
            java.lang.String strCopydefault = c9784bcC.copydefault();
            if (strCopydefault == null || strCopydefault.length() == 0) {
                if (!interfaceC9752bbXGEmmrt2.h_()) {
                    return C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG2)));
                }
                return C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG2)));
            }
            java.lang.String strCopydefault2 = c9784bcC.copydefault();
            return strCopydefault2 == null ? "" : strCopydefault2;
        }
        if ((abstractC9832bcy instanceof C9808bca) || (abstractC9832bcy instanceof C9754bbZ)) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr);
        }
        if (abstractC9832bcy instanceof C9750bbV) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity);
        }
        if (abstractC9832bcy instanceof C9751bbW) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnItemSelectedListener);
        }
        if (abstractC9832bcy instanceof C9876bdp) {
            C9876bdp c9876bdp = (C9876bdp) abstractC9832bcy;
            int i3 = c9876bdp.OLrzqt() ? C13754dXa.FragmentManager.MediaDescriptionCompat1 : C13754dXa.FragmentManager.setMediaId;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            StateListAnimator stateListAnimator = new StateListAnimator(context, abstractC9832bcy);
            int length3 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((java.lang.CharSequence) C14079deg.getAddressStr$default(C14079deg.EZpvd, c9876bdp.KWHzl(), false, 2, null));
            spannableStringBuilder3.setSpan(stateListAnimator, length3, spannableStringBuilder3.length(), 17);
            Unit unit3 = Unit.INSTANCE;
            android.text.SpannableString spannableStringValueOf3 = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder3));
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf3, "");
            pairArr[0] = C56390yDp.OLrzqt("approved_address", spannableStringValueOf3);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c9876bdp.AEQbTJ())) {
                strAYXKKw = c9876bdp.AEQbTJ();
                Intrinsics.copydefault((java.lang.Object) strAYXKKw);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconUri);
            }
            android.text.SpannableString spannableStringValueOf4 = android.text.SpannableString.valueOf(strAYXKKw);
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf4, "");
            pairArr[1] = C56390yDp.OLrzqt("approved_asset", spannableStringValueOf4);
            return C33069mpW.copydefault(context, i3, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(pairArr));
        }
        if (abstractC9832bcy instanceof C9879bds) {
            int i4 = C13754dXa.FragmentManager.reopenMenu;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            boolean z = oKWBaseTransactionFIwbmz instanceof InterfaceC9462bVz;
            InterfaceC9462bVz interfaceC9462bVz = z ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            java.lang.String strOLrzqt = interfaceC9462bVz != null ? interfaceC9462bVz.OLrzqt(true, false) : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strOLrzqt);
            InterfaceC9462bVz interfaceC9462bVz2 = z ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            if (interfaceC9462bVz2 != null && (c10854bwMDHguZz3 = interfaceC9462bVz2.dHguZz()) != null) {
                strFJNWhG = c10854bwMDHguZz3.fJNWhG();
            }
            pairArr2[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            return C33069mpW.copydefault(i4, C56424yEw.gEmmrt(pairArr2));
        }
        if (abstractC9832bcy instanceof C9878bdr) {
            int i5 = C13754dXa.FragmentManager.onKeyDownPanel;
            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
            boolean z2 = oKWBaseTransactionFIwbmz instanceof InterfaceC9462bVz;
            InterfaceC9462bVz interfaceC9462bVz3 = z2 ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            java.lang.String strCopydefault3 = interfaceC9462bVz3 != null ? interfaceC9462bVz3.copydefault(true, false) : null;
            if (strCopydefault3 == null) {
                strCopydefault3 = "";
            }
            pairArr3[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strCopydefault3);
            InterfaceC9462bVz interfaceC9462bVz4 = z2 ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            if (interfaceC9462bVz4 != null && (c10854bwMDHguZz2 = interfaceC9462bVz4.dHguZz()) != null) {
                strFJNWhG = c10854bwMDHguZz2.fJNWhG();
            }
            pairArr3[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            return C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairArr3));
        }
        if (abstractC9832bcy instanceof C9880bdt) {
            boolean z3 = oKWBaseTransactionFIwbmz instanceof InterfaceC9462bVz;
            InterfaceC9462bVz interfaceC9462bVz5 = z3 ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            java.lang.String strKWHzl = C54870xYj.KWHzl(C54862xYb.convertToBigIntegerString$default(interfaceC9462bVz5 != null ? interfaceC9462bVz5.EZpvd(interfaceC9462bVz5.fJNWhG().KWHzl().getFeeAmount()) : null, false, (RoundingMode) null, 3, (java.lang.Object) null), oKWBaseTransactionFIwbmz.dHguZz().valueOf(), oKWBaseTransactionFIwbmz.dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
            int i6 = C13754dXa.FragmentManager.initializePanelMenu;
            kotlin.Pair[] pairArr4 = new kotlin.Pair[2];
            pairArr4[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strKWHzl);
            InterfaceC9462bVz interfaceC9462bVz6 = z3 ? (InterfaceC9462bVz) oKWBaseTransactionFIwbmz : null;
            if (interfaceC9462bVz6 != null && (c10854bwMDHguZz = interfaceC9462bVz6.dHguZz()) != null) {
                strFJNWhG = c10854bwMDHguZz.fJNWhG();
            }
            pairArr4[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            return C33069mpW.copydefault(i6, C56424yEw.gEmmrt(pairArr4));
        }
        if (abstractC9832bcy instanceof C9885bdy) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.setSupportProgressBarVisibility, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9885bdy) abstractC9832bcy).OLrzqt())));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.fYd$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ AbstractC9832bcy copydefault;

        public ActionBar(android.content.Context context, AbstractC9832bcy abstractC9832bcy) {
            this.OLrzqt = context;
            this.copydefault = abstractC9832bcy;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.Object systemService = this.OLrzqt.getSystemService("clipboard");
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, ((C9870bdj) this.copydefault).copydefault()));
            C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), ((C9870bdj) this.copydefault).copydefault()).KWHzl(this.OLrzqt);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: o.fYd$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ AbstractC9832bcy KWHzl;

        public Activity(android.content.Context context, AbstractC9832bcy abstractC9832bcy) {
            this.AEQbTJ = context;
            this.KWHzl = abstractC9832bcy;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.Object systemService = this.AEQbTJ.getSystemService("clipboard");
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, ((C9870bdj) this.KWHzl).copydefault()));
            C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), ((C9870bdj) this.KWHzl).copydefault()).KWHzl(this.AEQbTJ);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: o.fYd$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ AbstractC9832bcy OLrzqt;

        public StateListAnimator(android.content.Context context, AbstractC9832bcy abstractC9832bcy) {
            this.AEQbTJ = context;
            this.OLrzqt = abstractC9832bcy;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.Object systemService = this.AEQbTJ.getSystemService("clipboard");
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, ((C9876bdp) this.OLrzqt).KWHzl()));
            C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), ((C9876bdp) this.OLrzqt).KWHzl()).KWHzl(this.AEQbTJ);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public final MultiTransactionDetailBean copydefault(@NotNull android.content.Context context, boolean z, @NotNull OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        java.util.List<C9861bda> listCopydefault;
        java.lang.String strAubY;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strAubY2;
        java.lang.String str3;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKWBaseMultiTransfer, "");
        MultiTransferSignData multiTransferSignDataAxsJAY = oKWBaseMultiTransfer.AxsJAY();
        if (z) {
            listCopydefault = EZpvd(oKWBaseMultiTransfer);
        } else {
            listCopydefault = copydefault(oKWBaseMultiTransfer);
        }
        java.util.List<C9861bda> listOLrzqt = OLrzqt(oKWBaseMultiTransfer);
        boolean zAEQbTJ = AEQbTJ(oKWBaseMultiTransfer);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.clearAvailableContext);
        java.lang.String strEZpvd = pTD.EZpvd(context, C13754dXa.Dialog.fetchVPNInfo, oKWBaseMultiTransfer.AwvSrB(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(oKWBaseMultiTransfer.AwvSrB()))));
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(multiTransferSignDataAxsJAY.getFromAddress().size())))));
        java.util.ArrayList<java.lang.String> fromAddress = multiTransferSignDataAxsJAY.getFromAddress();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(fromAddress, 10));
        java.util.Iterator<T> it = fromAddress.iterator();
        int i = 0;
        while (true) {
            java.lang.String str5 = "--";
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str6 = (java.lang.String) next;
            C9861bda c9861bda = (C9861bda) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i);
            java.lang.String str7 = str4;
            java.lang.String addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, str6, false, 2, null);
            if (!z || !zAEQbTJ) {
                if (oKWBaseMultiTransfer.U_()) {
                    strAubY2 = oKWBaseMultiTransfer.AubY();
                } else {
                    strAubY2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(multiTransferSignDataAxsJAY.getTransferAmount(), i);
                    if (strAubY2 == null) {
                        str3 = str7;
                    }
                    str5 = "-" + C54870xYj.EZpvd(str3, oKWBaseMultiTransfer.fHqPtx().valueOf(), oKWBaseMultiTransfer.fHqPtx().AkhnZx(), oKWBaseMultiTransfer.fHqPtx().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(oKWBaseMultiTransfer.fHqPtx().getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                str3 = strAubY2;
                str5 = "-" + C54870xYj.EZpvd(str3, oKWBaseMultiTransfer.fHqPtx().valueOf(), oKWBaseMultiTransfer.fHqPtx().AkhnZx(), oKWBaseMultiTransfer.fHqPtx().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(oKWBaseMultiTransfer.fHqPtx().getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            arrayList.add(new MultiTransactionDetailItem(addressStr$default, str5, (c9861bda == null || c9861bda.OLrzqt()) ? str7 : c9861bda.KWHzl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null));
            i++;
            str4 = str7;
        }
        java.lang.String str8 = str4;
        java.lang.String strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnWhen2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(multiTransferSignDataAxsJAY.getToAddress().size())))));
        java.util.ArrayList<TransferAddressData> toAddress = multiTransferSignDataAxsJAY.getToAddress();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(toAddress, 10));
        java.util.Iterator it2 = toAddress.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            java.lang.Object next2 = it2.next();
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            TransferAddressData transferAddressData = (TransferAddressData) next2;
            C9861bda c9861bda2 = (C9861bda) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, i2);
            java.util.Iterator it3 = it2;
            java.util.List<C9861bda> list = listOLrzqt;
            java.lang.String addressStr$default2 = C14079deg.getAddressStr$default(C14079deg.EZpvd, transferAddressData.getAddress(), false, 2, null);
            if (z && zAEQbTJ) {
                str2 = "--";
            } else {
                if (oKWBaseMultiTransfer.QOLQEE()) {
                    strAubY = oKWBaseMultiTransfer.AubY();
                } else {
                    strAubY = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(multiTransferSignDataAxsJAY.getTransferAmount(), i2);
                    if (strAubY == null) {
                        str = str8;
                    }
                    str2 = Marker.ANY_NON_NULL_MARKER + C54870xYj.EZpvd(str, oKWBaseMultiTransfer.fHqPtx().valueOf(), oKWBaseMultiTransfer.fHqPtx().AkhnZx(), oKWBaseMultiTransfer.fHqPtx().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(oKWBaseMultiTransfer.fHqPtx().getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                str = strAubY;
                str2 = Marker.ANY_NON_NULL_MARKER + C54870xYj.EZpvd(str, oKWBaseMultiTransfer.fHqPtx().valueOf(), oKWBaseMultiTransfer.fHqPtx().AkhnZx(), oKWBaseMultiTransfer.fHqPtx().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : java.lang.Boolean.valueOf(oKWBaseMultiTransfer.fHqPtx().getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            java.lang.String strKWHzl = (c9861bda2 == null || c9861bda2.OLrzqt()) ? str8 : c9861bda2.KWHzl();
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1);
            java.lang.String memo = transferAddressData.getMemo();
            arrayList2.add(new MultiTransactionDetailItem(addressStr$default2, str2, strKWHzl, strAYXKKw2, memo == null ? str8 : memo, (java.lang.String) null, 32, (DefaultConstructorMarker) null));
            i2++;
            it2 = it3;
            listOLrzqt = list;
        }
        return new MultiTransactionDetailBean(strAYXKKw, strEZpvd, strCopydefault, arrayList, strCopydefault2, arrayList2);
    }

    public final boolean AEQbTJ(@NotNull OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        Intrinsics.checkNotNullParameter(oKWBaseMultiTransfer, "");
        return !oKWBaseMultiTransfer.DTwDnp() && ((EZpvd(oKWBaseMultiTransfer).isEmpty() ^ true) || (OLrzqt(oKWBaseMultiTransfer).isEmpty() ^ true));
    }

    public final java.util.List<C9861bda> copydefault(OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        AbstractC9832bcy abstractC9832bcyAEQbTJ = oKWBaseMultiTransfer.UlJrfe().AEQbTJ(1);
        return abstractC9832bcyAEQbTJ instanceof C9801bcT ? ((C9801bcT) abstractC9832bcyAEQbTJ).copydefault() : abstractC9832bcyAEQbTJ instanceof C9806bcY ? ((C9806bcY) abstractC9832bcyAEQbTJ).copydefault() : abstractC9832bcyAEQbTJ instanceof C9803bcV ? ((C9803bcV) abstractC9832bcyAEQbTJ).OLrzqt() : abstractC9832bcyAEQbTJ instanceof C9804bcW ? ((C9804bcW) abstractC9832bcyAEQbTJ).OLrzqt() : abstractC9832bcyAEQbTJ instanceof C9862bdb ? ((C9862bdb) abstractC9832bcyAEQbTJ).copydefault() : yDY.AhwBna();
    }

    public final java.util.List<C9861bda> EZpvd(OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        AbstractC9832bcy abstractC9832bcyAEQbTJ = oKWBaseMultiTransfer.UlJrfe().AEQbTJ(1);
        return abstractC9832bcyAEQbTJ instanceof C9801bcT ? ((C9801bcT) abstractC9832bcyAEQbTJ).copydefault() : abstractC9832bcyAEQbTJ instanceof C9803bcV ? ((C9803bcV) abstractC9832bcyAEQbTJ).OLrzqt() : abstractC9832bcyAEQbTJ instanceof C9804bcW ? ((C9804bcW) abstractC9832bcyAEQbTJ).OLrzqt() : yDY.AhwBna();
    }

    public final java.util.List<C9861bda> OLrzqt(OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        AbstractC9832bcy abstractC9832bcyAEQbTJ = oKWBaseMultiTransfer.UlJrfe().AEQbTJ(1);
        return abstractC9832bcyAEQbTJ instanceof C9799bcR ? ((C9799bcR) abstractC9832bcyAEQbTJ).copydefault() : yDY.AhwBna();
    }
}
