package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.IRegisterTransaction;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20268gdg<T extends AbstractC8601bFm<?, ?> & IRegisterTransaction> extends C20150gbU<T> {

    /* JADX INFO: renamed from: o.gdg$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IRegisterTransaction.RegisterType.values().length];
            try {
                iArr[IRegisterTransaction.RegisterType.RegisterToken.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IRegisterTransaction.RegisterType.RegisterAddress.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Activity activityQUSxYX = QUSxYX();
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmRegister;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = activityQUSxYX.AYXKKw();
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, activityQUSxYX.EZpvd(), null, null, 100, null));
        if (activityQUSxYX.AEQbTJ().length() > 0) {
            actionBar.OLrzqt(EZpvd(activityQUSxYX.copydefault(), activityQUSxYX.KWHzl(), activityQUSxYX.OLrzqt(), activityQUSxYX.AEQbTJ(), new Function0() { // from class: o.gdn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20268gdg.OLrzqt(this.EZpvd);
                }
            }));
        } else {
            actionBar.OLrzqt(OLrzqt(activityQUSxYX.copydefault(), "", null, null, activityQUSxYX.KWHzl(), activityQUSxYX.OLrzqt()));
        }
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        java.lang.String strKWHzl2 = ejfBZ().KWHzl();
        if (strKWHzl2 == null || strKWHzl2.length() == 0 || !(true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl2))) {
            return;
        }
        actionBar.OLrzqt(djBIcL(strKWHzl2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C20268gdg c20268gdg) {
        android.content.Context context = c20268gdg.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, ((AbstractC8601bFm) c20268gdg.ejfBZ()).zLjUOn()));
            C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), ((AbstractC8601bFm) c20268gdg.ejfBZ()).zLjUOn()).KWHzl(c20268gdg.getContext());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [o.bCW] */
    @Override // o.C20150gbU, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        if (((AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection)) instanceof C9867bdg) {
            final C10854bwM feeCoinMeta = ((AbstractC8601bFm) ejfBZ()).QKudOq().KWHzl().getFeeCoinMeta();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", feeCoinMeta.fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta.fJNWhG()))), new Function0() { // from class: o.gdk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20268gdg.AEQbTJ(this.AEQbTJ, feeCoinMeta);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final C20268gdg c20268gdg, C10854bwM c10854bwM) {
        c20268gdg.gHZMYf();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20268gdg.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC54829xWw.EZpvd(abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8601bFm) c20268gdg.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.gdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20268gdg.AEQbTJ(this.EZpvd, (WalletRechargeResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C20268gdg c20268gdg, WalletRechargeResult walletRechargeResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        if (walletRechargeResult.isSubmit() && (activity = c20268gdg.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final android.view.View djBIcL(final java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
        java.lang.String string = getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(string, false, str, null, null, null, null, C33070mpX.KWHzl(C52761wXj.TaskDescription.ZxnNGp), 0.0f, null, 0.0f, false, null, null, null, new Function0() { // from class: o.gdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20268gdg.AEQbTJ(c57471yiz, str);
            }
        }, null, null, null, 491386, null));
        return c57471yiz;
    }

    public static final Unit AEQbTJ(C57471yiz c57471yiz, java.lang.String str) {
        android.content.Context context = c57471yiz.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onComplete), str).KWHzl(c57471yiz.getContext());
        return Unit.INSTANCE;
    }

    public final android.view.View EZpvd(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57422yiC.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(str, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, obj, null, c14726dqr.KWHzl(context), null, str2, null, false, str3, null, null, 0, null, function0, null, null, null, 980655, null)), false, null, null, null, null, 124, null));
        return c57422yiC;
    }

    /* JADX INFO: renamed from: o.gdg$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.gEmmrt;
            }
            if ((i & 2) != 0) {
                str2 = activity.OLrzqt;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = activity.EZpvd;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = activity.copydefault;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = activity.KWHzl;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = activity.AEQbTJ;
            }
            return activity.EZpvd(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Activity(str, str2, str3, str4, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.gEmmrt.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TitleAndHeaderInfo(title=" + this.gEmmrt + ", subTitle=" + this.OLrzqt + ", headerTitle=" + this.EZpvd + ", headerIcon=" + this.copydefault + ", headerContent=" + this.KWHzl + ", headerSubContent=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.gEmmrt = str;
            this.OLrzqt = str2;
            this.EZpvd = str3;
            this.copydefault = str4;
            this.KWHzl = str5;
            this.AEQbTJ = str6;
        }
    }

    public final Activity QUSxYX() {
        java.lang.String str;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String str2;
        java.lang.String strDjBIcL;
        java.lang.String strAYXKKw;
        int i = TaskDescription.copydefault[ejfBZ().copydefault().ordinal()];
        if (i == 1) {
            IRegisterTransaction.TaskDescription taskDescriptionEZpvd = ejfBZ().EZpvd();
            java.lang.String strKWHzl = taskDescriptionEZpvd != null ? taskDescriptionEZpvd.KWHzl() : null;
            java.lang.String str3 = strKWHzl == null ? "" : strKWHzl;
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController5);
            java.lang.String strAYXKKw3 = ((AbstractC8601bFm) ejfBZ()).QwvEab() == 3 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaCompanion) : "";
            IRegisterTransaction.TaskDescription taskDescriptionEZpvd2 = ejfBZ().EZpvd();
            java.lang.String strAEQbTJ = taskDescriptionEZpvd2 != null ? taskDescriptionEZpvd2.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setLocalNightMode);
            IRegisterTransaction.TaskDescription taskDescriptionEZpvd3 = ejfBZ().EZpvd();
            java.lang.String strEZpvd = taskDescriptionEZpvd3 != null ? taskDescriptionEZpvd3.EZpvd() : null;
            str = strAYXKKw2;
            strCopydefault = strEZpvd != null ? strEZpvd : "";
            strCopydefault2 = strAYXKKw3;
            str2 = strAEQbTJ;
            strDjBIcL = str3;
            strAYXKKw = strAYXKKw4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepareFromSearch);
            str = strAYXKKw5;
            strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.setSubscription, C56423yEv.EZpvd(C56390yDp.OLrzqt("net", ((AbstractC8601bFm) ejfBZ()).dHguZz().djBIcL())));
            str2 = "";
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregister);
            strCopydefault = ((AbstractC8601bFm) ejfBZ()).dHguZz().copydefault();
            strDjBIcL = ((AbstractC8601bFm) ejfBZ()).dHguZz().djBIcL();
        }
        return new Activity(str, strCopydefault2, strAYXKKw, strCopydefault, strDjBIcL, str2);
    }
}
