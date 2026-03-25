package o;

import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20279gdr extends C20277gdp<AbstractC8601bFm<?, ?>> {
    public C57431yiL gHZMYf;

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20277gdp, o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<AbstractC8601bFm<?, ?>>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        this.gHZMYf = c57431yiLTitleInfoView$default;
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        if (actionBar.OLrzqt(QUSxYX()) != null) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(fvQaOB());
        actionBar.OLrzqt(giSNqX());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View giSNqX() {
        final java.lang.String strAEQbTJ = ((AbstractC8601bFm) ejfBZ()).AEQbTJ(true);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            return AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20279gdr.EZpvd(this.EZpvd, strAEQbTJ, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 3, null);
        }
        return null;
    }

    public static final Unit EZpvd(C20279gdr c20279gdr, java.lang.String str, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (str == null) {
            str = "";
        }
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20279gdr, null, str, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View fvQaOB() throws java.io.IOException {
        java.util.HashSet<java.lang.String> hashSetDcqEDu;
        T tEjfBZ = ejfBZ();
        OKWTronSignContract oKWTronSignContract = tEjfBZ instanceof OKWTronSignContract ? (OKWTronSignContract) tEjfBZ : null;
        if (oKWTronSignContract == null || (hashSetDcqEDu = oKWTronSignContract.DcqEDu()) == null || C33129mqd.valueOf(java.lang.Integer.valueOf(hashSetDcqEDu.size()), 0)) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57453yih c57453yih = new C57453yih(contextRequireContext, null, 0, 6, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = 0;
        for (java.lang.Object obj : hashSetDcqEDu) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(pTD.copydefault(this, C13754dXa.FragmentManager.bypassOnContentChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))))));
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder((java.lang.String) obj);
            spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder3);
            if (i != hashSetDcqEDu.size() - 1) {
                spannableStringBuilder.append('\n');
            }
            c57453yih.setContentInfo(spannableStringBuilder);
            c57453yih.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.startAsSupportActionMode));
            i = i2;
        }
        return c57453yih;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fXW.dealKYSErrors$default(o.fXW, androidx.fragment.app.FragmentActivity, androidx.fragment.app.FragmentManager, java.util.Collection, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction$TransactionType, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20150gbU, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        java.util.ArrayList arrayList;
        java.util.Collection<AbstractC9832bcy> collectionValues;
        Intrinsics.checkNotNullParameter(collection, "");
        fXW fxwAkhnZx = AkhnZx();
        FragmentActivity activity = getActivity();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        java.util.HashMap<java.lang.String, AbstractC9832bcy> mapEZpvd = ((AbstractC8601bFm) ejfBZ()).UlJrfe().EZpvd(3);
        if (mapEZpvd == null || (collectionValues = mapEZpvd.values()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionValues) {
                if (!((AbstractC9832bcy) obj).AhwBna()) {
                    arrayList.add(obj);
                }
            }
        }
        fXW.dealKYSErrors$default(fxwAkhnZx, activity, parentFragmentManager, arrayList, ((AbstractC8601bFm) ejfBZ()).aUsmxb(), false, null, 48, null);
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy instanceof C9838bdD) {
            C57431yiL c57431yiL = this.gHZMYf;
            if (c57431yiL != null) {
                c57431yiL.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts));
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, ((C9838bdD) abstractC9832bcy).copydefault(), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        super.copydefault(collection);
    }
}
