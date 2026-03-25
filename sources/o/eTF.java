package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.eTF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eTF extends wXX implements WalletUpdateWorker.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C16616enL KWHzl;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eTF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final eTF AEQbTJ(@NotNull java.util.ArrayList<QuickCopyAddressItemBean> arrayList, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            eTF etf = new eTF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("quickCopyAddresses", arrayList);
            bundle.putString("accountId", str);
            etf.setArguments(bundle);
            return etf;
        }
    }

    public final java.util.ArrayList<QuickCopyAddressItemBean> AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getParcelableArrayList("quickCopyAddresses");
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(this);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(constraintLayout.getContext());
        if (AEQbTJ() == null) {
            dismissAllowingStateLoss();
            return;
        }
        this.KWHzl = C16616enL.KWHzl(layoutInflaterFrom, constraintLayout, false);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        C16616enL c16616enL = this.KWHzl;
        constraintLayout.addView(c16616enL != null ? c16616enL.getRoot() : null);
        java.util.ArrayList<QuickCopyAddressItemBean> arrayListAEQbTJ = AEQbTJ();
        if (arrayListAEQbTJ == null) {
            return;
        }
        AEQbTJ(arrayListAEQbTJ);
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.eTL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eTF.KWHzl(this.KWHzl);
                }
            });
        }
    }

    public static final void KWHzl(eTF etf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) etf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(java.util.ArrayList<QuickCopyAddressItemBean> arrayList) {
        OKAnchorSelection oKAnchorSelection;
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        final C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(quickCopyAddressItemBean != null ? quickCopyAddressItemBean.getCoinId() : -1L);
        C16616enL c16616enL = this.KWHzl;
        if (c16616enL == null || (oKAnchorSelection = c16616enL.AEQbTJ) == null) {
            return;
        }
        oKAnchorSelection.djBIcL().setVisibility(8);
        oKAnchorSelection.OLrzqt().setVisibility(8);
        oKAnchorSelection.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        oKAnchorSelection.setDividerLineVisibility(false);
        oKAnchorSelection.EZpvd();
        oKAnchorSelection.OLrzqt(new C13784dYd(false, null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList), 2, null));
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.eTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eTF.AEQbTJ(this.KWHzl, c10854bwMKWHzl, (C55043xcW) obj, obj2);
            }
        });
    }

    public static final Unit AEQbTJ(final eTF etf, final C10854bwM c10854bwM, C55043xcW c55043xcW, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.zAGdSp);
        if (imageView != null) {
            C57659ymb.loadFixSizeBorderImage$default(imageView, quickCopyAddressItemBean.getCoinUrl(), C14726dqr.OLrzqt.OLrzqt(), 0.0f, 0.0f, 12, null);
        }
        java.lang.String address = quickCopyAddressItemBean.getAddress();
        c55043xcW.EZpvd(C13754dXa.ActionBar.addMenuProvider, quickCopyAddressItemBean.getChainName());
        c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow, address);
        C55251xgS c55251xgS = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
        if (c55251xgS != null) {
            c55251xgS.setVisibility(0);
        }
        C55251xgS c55251xgS2 = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
        if (c55251xgS2 != null) {
            c55251xgS2.setText(quickCopyAddressItemBean.getAddressTypeContent());
        }
        if (quickCopyAddressItemBean.getAddress().length() == 0) {
            android.view.View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow);
            if (viewEZpvd != null) {
                viewEZpvd.setVisibility(8);
            }
            android.view.View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.isInitInProgress);
            if (viewEZpvd2 != null) {
                viewEZpvd2.setVisibility(8);
            }
            android.view.View viewEZpvd3 = c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
            if (viewEZpvd3 != null) {
                viewEZpvd3.setVisibility(0);
            }
            C52794wYp c52794wYp = (C52794wYp) c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
            if (c52794wYp != null) {
                c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getClipDataUrisactivity_release));
            }
        } else {
            android.view.View viewEZpvd4 = c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow);
            if (viewEZpvd4 != null) {
                viewEZpvd4.setVisibility(0);
            }
            android.view.View viewEZpvd5 = c55043xcW.EZpvd(C13754dXa.ActionBar.isInitInProgress);
            if (viewEZpvd5 != null) {
                viewEZpvd5.setVisibility(0);
            }
            android.view.View viewEZpvd6 = c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
            if (viewEZpvd6 != null) {
                viewEZpvd6.setVisibility(8);
            }
        }
        c55043xcW.AEQbTJ(C13754dXa.ActionBar.gBtXYZ, new View.OnClickListener() { // from class: o.eTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eTF.KWHzl(quickCopyAddressItemBean, etf, c10854bwM, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(QuickCopyAddressItemBean quickCopyAddressItemBean, eTF etf, C10854bwM c10854bwM, android.view.View view) {
        if (quickCopyAddressItemBean.getAddress().length() == 0) {
            androidx.fragment.app.FragmentManager childFragmentManager = etf.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "SelectChainCopyAddresst", null, null, null, false, 56, null).EZpvd();
            return;
        }
        etf.copydefault(quickCopyAddressItemBean.getChainName(), quickCopyAddressItemBean.getAddress(), quickCopyAddressItemBean.getAddressTypeContent(), c10854bwM);
    }

    public static /* synthetic */ void showToast$default(eTF etf, java.lang.String str, java.lang.String str2, java.lang.String str3, C10854bwM c10854bwM, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        etf.copydefault(str, str2, str3, c10854bwM);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, C10854bwM c10854bwM) {
        java.lang.String strCopydefault;
        if (str.length() == 0) {
            strCopydefault = getString(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
        } else if (c10854bwM != null && c10854bwM.fHqPtx()) {
            if (c10854bwM.OLrzqt(str2)) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.QhsCdEQhsCdE);
            } else {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hrnhsO);
            }
        } else if (str3.length() > 0) {
            strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getCallbacks, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainName", str), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str3)));
        } else {
            strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getView, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", str)));
        }
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        EZpvd(str2);
        C19595gIe.Companion.AEQbTJ(strCopydefault, str2).KWHzl(getContext());
        dismissAllowingStateLoss();
    }

    private final AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.List<C10854bwM> list) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault;
        java.lang.String address;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C8301bAD c8301bAD = new C8301bAD();
        for (C10854bwM c10854bwM : list) {
            if (c8301bAD.AEQbTJ() == null) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jAhwBna = c10854bwM.AhwBna();
                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AhwBna(), null, 2, null);
                if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
                    address = "";
                }
                abstractC58260yxtCopydefault = c8301bAD.KWHzl(strDbNXlk, jAhwBna, address);
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(c8301bAD.AEQbTJ());
            }
            final Activity activity = new Activity(c8301bAD, c10854bwM);
            arrayList.add(abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.eTE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return eTF.valueOf(activity, obj);
                }
            }));
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final class Activity implements Function1<?, InterfaceC58261yxu<? extends kotlin.Pair<? extends C10854bwM, ? extends java.util.List<? extends AddressData>>>> {
        public final /* synthetic */ C10854bwM EZpvd;
        public final /* synthetic */ C8301bAD OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C8301bAD c8301bAD, C10854bwM c10854bwM) {
            this.OLrzqt = c8301bAD;
            this.EZpvd = c10854bwM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Pair AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends kotlin.Pair<C10854bwM, java.util.List<AddressData>>> invoke(AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtEZpvd = this.OLrzqt.EZpvd();
            final C10854bwM c10854bwM = this.EZpvd;
            final Function1 function1 = new Function1() { // from class: o.eTT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eTF.Activity.AEQbTJ(c10854bwM, (java.util.List) obj);
                }
            };
            return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.eTU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return eTF.Activity.AEQbTJ(function1, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Pair AEQbTJ(C10854bwM c10854bwM, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C56390yDp.OLrzqt(c10854bwM, list);
        }
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    private final void EZpvd(java.lang.String str) {
        try {
            java.lang.Object systemService = requireActivity().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
        } catch (java.lang.Exception e) {
            pUU.copydefault("hanbin", "error message :" + e.getMessage());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(this);
    }

    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void KWHzl() {
        pUU.OLrzqt(">>>btc onSuccess");
        copydefault();
    }

    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public final void copydefault() {
        java.lang.String string;
        QuickCopyAddressItemBean quickCopyAddressItemBean;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("accountId")) == null) {
            return;
        }
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        java.util.ArrayList<QuickCopyAddressItemBean> arrayListAEQbTJ = AEQbTJ();
        final C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl((arrayListAEQbTJ == null || (quickCopyAddressItemBean = (QuickCopyAddressItemBean) CollectionsKt___CollectionsKt.firstOrNull(arrayListAEQbTJ)) == null) ? -1L : quickCopyAddressItemBean.getCoinId());
        if (c10854bwMKWHzl == null) {
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(string, false);
        final Function1 function1 = new Function1() { // from class: o.eTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eTF.OLrzqt(this.KWHzl, c10854bwMKWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.eTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eTF.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eTF.EZpvd(this.KWHzl, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eTN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eTF.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eTF.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eTF.djBIcL(function13, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(eTF etf, final C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOFhtUX) {
            if (((C10854bwM) obj).iRxXKY()) {
                arrayList.add(obj);
            }
        }
        AbstractC58260yxt<java.util.List<kotlin.Pair<C10854bwM, java.util.List<AddressData>>>> abstractC58260yxtKWHzl = etf.KWHzl(abstractC12782ctV, arrayList);
        final Function1 function1 = new Function1() { // from class: o.eTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return eTF.EZpvd(c10854bwM, (java.util.List) obj2);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.eTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return eTF.AYXKKw(function1, obj2);
            }
        });
    }

    public static final java.util.ArrayList AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList EZpvd(C10854bwM c10854bwM, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10854bwM) ((kotlin.Pair) next).getFirst()).AhwBna() == c10854bwM.AhwBna()) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) next;
        java.util.List<AddressData> list2 = pair != null ? (java.util.List) pair.getSecond() : null;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (AddressData addressData : list2) {
                arrayList.add(new QuickCopyAddressItemBean(addressData.getAddress(), 0L, c10854bwM.djBIcL(), c10854bwM.AYXKKw(), c10854bwM.fJNWhG(), false, null, false, 0, false, addressData.getAddress().length() == 0, addressData.getAddressFormat(), addressData.getAddressType(), false, null, 25570, null));
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new java.util.ArrayList());
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return new java.util.ArrayList();
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(eTF etf, java.util.ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        etf.AEQbTJ((java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new java.util.ArrayList()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
