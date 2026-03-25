package o;

import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C20264gdc<T extends AbstractC8601bFm<?, ?> & InterfaceC9730bbB> extends AbstractC20202gcT<T> {
    @Override // o.AbstractC20202gcT
    public TransactionTopHeaderInfoBean djBIcL() {
        java.lang.Object objKWHzl;
        java.lang.String urlOnlyHost;
        if (((AbstractC8601bFm) ejfBZ()).DCUTEIddSDPG()) {
            objKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.spnCvw);
        } else {
            CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmApprove;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            objKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        }
        java.lang.Object obj = objKWHzl;
        int i = C13754dXa.FragmentManager.GVpNrsfQMcgE;
        java.lang.String strWlaJM = ((AbstractC8601bFm) ejfBZ()).wlaJM();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        if (strWlaJM == null || strWlaJM.length() == 0) {
            strWlaJM = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strWlaJM)));
        java.lang.CharSequence spannedString = strCopydefault;
        if (((AbstractC8601bFm) ejfBZ()).DCUTEIddSDPG()) {
            spannedString = strCopydefault;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((AbstractC8601bFm) ejfBZ()).wlaJM())) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) strCopydefault);
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)), 0, strCopydefault.length(), 17);
                spannedString = new android.text.SpannedString(spannableStringBuilder);
            }
        }
        java.lang.CharSequence charSequence = spannedString;
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        return new TransactionTopHeaderInfoBean(obj, null, charSequence, null, null, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, 218, null);
    }

    @Override // o.AbstractC20202gcT
    public InterfaceC9730bbB.StateListAnimator AEQbTJ() {
        return ejfBZ().EZpvd();
    }

    @Override // o.AbstractC20202gcT
    public java.lang.String OLrzqt(boolean z) {
        return ejfBZ().a_(z);
    }

    @Override // o.AbstractC20202gcT
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ejfBZ().EZpvd(str);
    }

    @Override // o.AbstractC20202gcT
    public java.lang.String EZpvd(boolean z) {
        return Intrinsics.EZpvd((java.lang.Object) ((AbstractC8601bFm) ejfBZ()).W_(), (java.lang.Object) "EDIT_NUM") ? "0" : OLrzqt(z);
    }

    /* JADX DEBUG: Possible override for method o.gaF.EZpvd()V */
    @Override // o.AbstractC20202gcT
    public java.lang.String EZpvd() {
        return ejfBZ().OLrzqt();
    }

    /* JADX DEBUG: Possible override for method o.gaF.OLrzqt()V */
    @Override // o.AbstractC20202gcT
    public java.lang.String OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) ((AbstractC8601bFm) ejfBZ()).W_(), (java.lang.Object) "SKIP_EDIT") ? ((AbstractC8601bFm) ejfBZ()).X_() : "";
    }
}
