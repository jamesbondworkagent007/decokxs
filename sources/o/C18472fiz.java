package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.wallet.interaction.view.DappItemFeeView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.uilab.reminder.OKReminder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: o.fiz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18472fiz extends AbstractC18428fiH<C10806bvR> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int fJNWhG = 8;
    public final InterfaceC56387yDm getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.fiF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18472fiz.isConnected();
        }
    });

    public final fXW fetchVPNInfo() {
        return (fXW) this.getNewProxyInstance.getValue();
    }

    public static final fXW isConnected() {
        return new fXW();
    }

    /* JADX INFO: renamed from: o.fiz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fiz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C18472fiz OLrzqt(DappSignArgs dappSignArgs, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
            C18472fiz c18472fiz = new C18472fiz();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("dappSignArgs", dappSignArgs);
            c18472fiz.setArguments(bundle);
            c18472fiz.EZpvd(function1);
            return c18472fiz;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // o.AbstractC18428fiH, o.AbstractC18451fie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void DbNXlk() {
        AbstractC9832bcy abstractC9832bcy;
        C8497bDo c8497bDoAkhnZx;
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault;
        super.DbNXlk();
        C10806bvR c10806bvR = (C10806bvR) djBIcL();
        if (c10806bvR == null || (c8497bDoAkhnZx = c10806bvR.AkhnZx()) == null || (mapCopydefault = c8497bDoAkhnZx.copydefault()) == null) {
            abstractC9832bcy = null;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.Integer, AbstractC9832bcy> entry : mapCopydefault.entrySet()) {
                if (entry.getValue() instanceof C9788bcG) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Collection collectionValues = linkedHashMap.values();
            if (collectionValues != null) {
                abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
            }
        }
        KWHzl(abstractC9832bcy instanceof C9788bcG ? (C9788bcG) abstractC9832bcy : null);
        C10806bvR c10806bvR2 = (C10806bvR) djBIcL();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c10806bvR2 != null ? c10806bvR2.fARcdN() : null))) {
            C10806bvR c10806bvR3 = (C10806bvR) djBIcL();
            AhwBna(c10806bvR3 != null ? c10806bvR3.fARcdN() : null);
        }
        fJNWhG();
    }

    public final void KWHzl(C9788bcG c9788bcG) {
        FragmentActivity activity = getActivity();
        if (activity == null || c9788bcG == null) {
            return;
        }
        fXW fxwFetchVPNInfo = fetchVPNInfo();
        androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        fXW.dealFromAddressRisk$default(fxwFetchVPNInfo, activity, supportFragmentManager, C56402yEa.EZpvd(c9788bcG), false, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        java.lang.String str;
        java.lang.Boolean bool;
        Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> tripleHDKMBd;
        java.lang.String third;
        Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> tripleHDKMBd2;
        Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> tripleHDKMBd3;
        C10806bvR c10806bvR = (C10806bvR) djBIcL();
        java.lang.Boolean second = null;
        java.lang.Boolean first = (c10806bvR == null || (tripleHDKMBd3 = c10806bvR.hDKMBd()) == null) ? null : tripleHDKMBd3.getFirst();
        C10806bvR c10806bvR2 = (C10806bvR) djBIcL();
        if (c10806bvR2 != null && (tripleHDKMBd2 = c10806bvR2.hDKMBd()) != null) {
            second = tripleHDKMBd2.getSecond();
        }
        java.lang.Boolean bool2 = second;
        C10806bvR c10806bvR3 = (C10806bvR) djBIcL();
        java.lang.String str2 = (c10806bvR3 == null || (tripleHDKMBd = c10806bvR3.hDKMBd()) == null || (third = tripleHDKMBd.getThird()) == null) ? "" : third;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(first, bool3)) {
            OKReminder oKReminder = fARcdN().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            str = "";
            bool = bool3;
            AbstractC14664dpi.showReminderInOrder$default(this, oKReminder, 10, 2, getString(C13754dXa.FragmentManager.getThemeUpIndicator), null, null, null, null, null, 496, null);
        } else {
            str = "";
            bool = bool3;
        }
        if (Intrinsics.EZpvd(bool2, bool)) {
            fARcdN().EZpvd.EZpvd.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                DappItemFeeView dappItemFeeView = fARcdN().EZpvd.KWHzl;
                java.lang.String strKWHzl = KWHzl(str2);
                java.lang.String strAkhnZx = AkhnZx();
                java.lang.String strCopydefault = copydefault(str2);
                java.lang.String string = getString(C13754dXa.FragmentManager.getDrawerArrowDrawable);
                Intrinsics.checkNotNullExpressionValue(string, str);
                dappItemFeeView.setFeeText("", strKWHzl, strAkhnZx, strCopydefault, true, false, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? null : "", (MLKEMEngine.KyberPolyBytes & 128) != 0 ? java.lang.Boolean.FALSE : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? DappItemFeeView.FreeGasUIType.TypeCurrencyStrikethrough : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.shouldInheritContext) : string, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
                return;
            }
            DappItemFeeView dappItemFeeView2 = fARcdN().EZpvd.KWHzl;
            java.lang.String string2 = getString(C13754dXa.FragmentManager.getDrawerArrowDrawable);
            Intrinsics.checkNotNullExpressionValue(string2, str);
            dappItemFeeView2.setFeeText("", "", "", "--", true, false, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? null : "", (MLKEMEngine.KyberPolyBytes & 128) != 0 ? java.lang.Boolean.FALSE : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? DappItemFeeView.FreeGasUIType.TypeCurrencyStrikethrough : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.shouldInheritContext) : string2, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
            return;
        }
        fARcdN().EZpvd.EZpvd.setVisibility(8);
    }

    public final void AhwBna(java.lang.String str) {
        OKReminder oKReminder = fARcdN().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        AbstractC14664dpi.showReminderInOrder$default(this, oKReminder, 9, 2, str, null, null, null, null, null, 496, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Possible override for method o.fie.KWHzl(Ljava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(java.lang.String str) {
        C12804ctr c12804ctrIwGUEr;
        java.lang.String strConvertFeeAmount$default;
        C10806bvR c10806bvR = (C10806bvR) djBIcL();
        return (c10806bvR == null || (c12804ctrIwGUEr = c10806bvR.iwGUEr()) == null || (strConvertFeeAmount$default = C12804ctr.convertFeeAmount$default(c12804ctrIwGUEr, str, false, 2, null)) == null) ? "" : strConvertFeeAmount$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String copydefault(java.lang.String str) {
        C12804ctr c12804ctrIwGUEr;
        java.lang.String strAEQbTJ;
        C10806bvR c10806bvR = (C10806bvR) djBIcL();
        return (c10806bvR == null || (c12804ctrIwGUEr = c10806bvR.iwGUEr()) == null || (strAEQbTJ = c12804ctrIwGUEr.AEQbTJ(str)) == null) ? "" : strAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AkhnZx() {
        C12804ctr c12804ctrIwGUEr;
        java.lang.String strOLrzqt;
        C10806bvR c10806bvR = (C10806bvR) djBIcL();
        return (c10806bvR == null || (c12804ctrIwGUEr = c10806bvR.iwGUEr()) == null || (strOLrzqt = c12804ctrIwGUEr.OLrzqt()) == null) ? "" : strOLrzqt;
    }
}
