package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22408hem;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24467ieQ extends AbstractC24459ieI {
    public android.app.Activity EZpvd;
    public hGY KWHzl;
    public androidx.fragment.app.FragmentManager OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setupDialogReference(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt = fragmentManager;
        this.EZpvd = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24467ieQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24467ieQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24467ieQ(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void copydefault() {
        C55258xgZ c55258xgZ;
        hGY hgyKWHzl = hGY.KWHzl(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        this.KWHzl = hgyKWHzl;
        if (hgyKWHzl == null || (c55258xgZ = hgyKWHzl.AuCTel) == null) {
            return;
        }
        c55258xgZ.setHelperLabelType(1);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        hGY hgy = this.KWHzl;
        if (hgy != null) {
            return hgy.djBIcL;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ieQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initMultiChainRoute$default(C24467ieQ c24467ieQ, QuotePriceRes quotePriceRes, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c24467ieQ.EZpvd(quotePriceRes, str, (Function1<? super AbstractC22408hem, Unit>) function1);
    }

    public final void EZpvd(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, Function1<? super AbstractC22408hem, Unit> function1) {
        java.lang.String chainName;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        setupDialogRoute(false, str, function1);
        setVisibility(0);
        hGY hgy = this.KWHzl;
        if (hgy != null) {
            hgy.DbNXlk.setVisibility(8);
            hgy.OLrzqt.setVisibility(8);
            hgy.gEmmrt.setVisibility(0);
            AppCompatImageView appCompatImageView = hgy.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            DexQuoteBridgeVO dexQuoteBridgeVOBridge = quotePriceRes.bridge();
            java.lang.String bridgeLogoUrl = dexQuoteBridgeVOBridge != null ? dexQuoteBridgeVOBridge.getBridgeLogoUrl() : null;
            if (bridgeLogoUrl == null) {
                bridgeLogoUrl = "";
            }
            C25386ivj.loadImageWithBorder$default(appCompatImageView, bridgeLogoUrl, null, 2, null);
            AppCompatTextView appCompatTextView = hgy.values;
            DexQuoteBridgeVO dexQuoteBridgeVOBridge2 = quotePriceRes.bridge();
            appCompatTextView.setText(dexQuoteBridgeVOBridge2 != null ? dexQuoteBridgeVOBridge2.getBridgeName() : null);
            C55251xgS c55251xgS = hgy.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            DexQuoteBridgeVO dexQuoteBridgeVOBridge3 = quotePriceRes.bridge();
            c55251xgS.setVisibility((dexQuoteBridgeVOBridge3 == null || dexQuoteBridgeVOBridge3.getBridgeType() != 1) ? 8 : 0);
            C55251xgS c55251xgS2 = hgy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            C55251xgS c55251xgS3 = hgy.isConnected;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            C55251xgS c55251xgS4 = hgy.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
            C25352ivB.showRouteTag$default(c55251xgS2, c55251xgS3, c55251xgS4, quotePriceRes.routerLabel(), false, 16, null);
            hgy.AuCTel.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DPhTBN));
            if (quotePriceRes.claimSignatureRequired()) {
                AppCompatTextView appCompatTextView2 = hgy.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                appCompatTextView2.setVisibility(0);
                AppCompatTextView appCompatTextView3 = hgy.DbNXlk;
                int i = C23274hvD.Fragment.ggKfIT;
                DexMultiTokenInfoBean toToken = quotePriceRes.getCommonDexInfo().getToToken();
                if (toToken != null && (chainName = toToken.getChainName()) != null) {
                    str2 = chainName;
                }
                appCompatTextView3.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("toChain", str2))));
                return;
            }
            AppCompatTextView appCompatTextView4 = hgy.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
    }

    public final android.view.View OLrzqt() {
        hGY hgy = this.KWHzl;
        if (hgy != null) {
            return hgy.djBIcL;
        }
        return null;
    }

    /* JADX DEBUG: Possible override for method o.ieI.KWHzl()V */
    public final AppCompatTextView KWHzl() {
        hGY hgy = this.KWHzl;
        if (hgy != null) {
            return hgy.DbNXlk;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ieQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setupDialogRoute$default(C24467ieQ c24467ieQ, boolean z, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c24467ieQ.setupDialogRoute(z, str, function1);
    }

    public final void setupDialogRoute(boolean z, final java.lang.String str, final Function1<? super AbstractC22408hem, Unit> function1) {
        C55258xgZ c55258xgZ;
        C55258xgZ c55258xgZ2;
        if (z) {
            hGY hgy = this.KWHzl;
            if (hgy == null || (c55258xgZ2 = hgy.AuCTel) == null) {
                return;
            }
            C25352ivB.setOnDoubleCheckClickListener$default(c55258xgZ2, 0L, new Function1() { // from class: o.ieR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24467ieQ.EZpvd(this.KWHzl, str, (android.view.View) obj);
                }
            }, 1, null);
            return;
        }
        hGY hgy2 = this.KWHzl;
        if (hgy2 == null || hgy2 == null || (c55258xgZ = hgy2.AuCTel) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c55258xgZ, 0L, new Function1() { // from class: o.ieO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24467ieQ.KWHzl(this.KWHzl, str, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C24467ieQ c24467ieQ, java.lang.String str, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.app.Activity activity = c24467ieQ.EZpvd;
        if (activity != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.onAvailable);
            viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.RjCdvpRjCdvp);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, str, DexSwapFullClick.TOOLTIP_YOU_SAVE.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C24467ieQ c24467ieQ, java.lang.String str, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C24350icF c24350icFKWHzl = C24350icF.Companion.KWHzl();
        androidx.fragment.app.FragmentManager fragmentManager = c24467ieQ.OLrzqt;
        if (fragmentManager != null) {
            c24350icFKWHzl.show(fragmentManager, "javaClass");
        }
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, str, DexSwapFullClick.TOOLTIP_XROUTING.getValue(), false, null, 12, null);
        if (function1 != null) {
            function1.invoke(new AbstractC22408hem.TaskDescription(TrackButtonName.BRIDGE_ROUTER_EXPLAIN.getButtonName(), ButtonType.EXPLAIN.getType()));
        }
        return Unit.INSTANCE;
    }
}
