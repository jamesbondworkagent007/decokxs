package o;

import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24745ijd extends AbstractC24712iix {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24745ijd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean AhwBna() {
        return !EZpvd(copydefault().AubY().getValue());
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.fromMediaMetadata);
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return OLrzqt(copydefault().AubY().getValue());
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull final Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (AhwBna()) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags, C23274hvD.Fragment.getMediaItem, 0, 0, new Function0() { // from class: o.ije
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24745ijd.OLrzqt(function0, this);
                }
            }, new Function0() { // from class: o.ija
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24745ijd.AEQbTJ(this.copydefault);
                }
            }, null, null, 408, null);
        }
        return AhwBna();
    }

    public static final Unit AEQbTJ(C24745ijd c24745ijd) {
        c24745ijd.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, C24745ijd c24745ijd) {
        function0.invoke();
        c24745ijd.AYXKKw();
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && C23313hvq.OLrzqt(str, 0);
    }

    public final java.lang.String OLrzqt(@androidx.annotation.StringRes int i, java.lang.String str) {
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        if (str == null) {
            str = "";
        }
        return C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str)));
    }

    public final boolean EZpvd(QuotePriceRes quotePriceRes) {
        CommonDexInfo commonDexInfo;
        if (AEQbTJ((quotePriceRes == null || (commonDexInfo = quotePriceRes.getCommonDexInfo()) == null) ? null : commonDexInfo.getFromTokenPrice())) {
            if (AEQbTJ(quotePriceRes != null ? quotePriceRes.toTokenPrice() : null)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String OLrzqt(QuotePriceRes quotePriceRes) {
        DexMultiTokenInfoBean token;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken2;
        java.lang.String tokenSymbol;
        DexMultiTokenInfoBean token2;
        java.lang.String tokenSymbol2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken3;
        DexMultiTokenInfoBean token3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken4;
        CommonDexInfo commonDexInfo2;
        java.lang.String tokenSymbol3 = null;
        if (!AEQbTJ((quotePriceRes == null || (commonDexInfo2 = quotePriceRes.getCommonDexInfo()) == null) ? null : commonDexInfo2.getFromTokenPrice())) {
            if (!AEQbTJ(quotePriceRes != null ? quotePriceRes.toTokenPrice() : null)) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((quotePriceRes == null || (dexMultiTokenInfoBeanFromToken4 = quotePriceRes.fromToken()) == null) ? null : dexMultiTokenInfoBeanFromToken4.getTokenSymbol()), (java.lang.Object) ((quotePriceRes == null || (token3 = quotePriceRes.toToken()) == null) ? null : token3.getTokenSymbol()))) {
                    android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                    int i = C23274hvD.Fragment.MediaBrowserCompatSubscription;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String str = "";
                    if (quotePriceRes == null || (dexMultiTokenInfoBeanFromToken3 = quotePriceRes.fromToken()) == null || (tokenSymbol = dexMultiTokenInfoBeanFromToken3.getTokenSymbol()) == null) {
                        tokenSymbol = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt("payToken", tokenSymbol);
                    if (quotePriceRes != null && (token2 = quotePriceRes.toToken()) != null && (tokenSymbol2 = token2.getTokenSymbol()) != null) {
                        str = tokenSymbol2;
                    }
                    pairArr[1] = C56390yDp.OLrzqt("receiveToken", str);
                    return C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
                }
                int i2 = C23274hvD.Fragment.unregisterCallbackMessenger;
                if (quotePriceRes != null && (dexMultiTokenInfoBeanFromToken2 = quotePriceRes.fromToken()) != null) {
                    tokenSymbol3 = dexMultiTokenInfoBeanFromToken2.getTokenSymbol();
                }
                return OLrzqt(i2, tokenSymbol3);
            }
        }
        if (!AEQbTJ((quotePriceRes == null || (commonDexInfo = quotePriceRes.getCommonDexInfo()) == null) ? null : commonDexInfo.getFromTokenPrice())) {
            int i3 = C23274hvD.Fragment.unregisterCallbackMessenger;
            if (quotePriceRes != null && (dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken()) != null) {
                tokenSymbol3 = dexMultiTokenInfoBeanFromToken.getTokenSymbol();
            }
            return OLrzqt(i3, tokenSymbol3);
        }
        int i4 = C23274hvD.Fragment.getCallback;
        if (quotePriceRes != null && (token = quotePriceRes.toToken()) != null) {
            tokenSymbol3 = token.getTokenSymbol();
        }
        return OLrzqt(i4, tokenSymbol3);
    }

    private final void AYXKKw() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.GAS_MORE_THAN_RECEIVE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    private final void valueOf() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.GAS_MORE_THAN_RECEIVE.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }
}
