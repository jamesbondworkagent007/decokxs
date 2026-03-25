package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.mine.bean.BatchCreateRootWalletInformationBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18514fjo extends AbstractC52792wYn {
    public Function1<? super BatchCreateRootWalletInformationBean, Unit> KWHzl;
    public java.lang.String copydefault = "";
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fjo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C18514fjo newInstance$default(ActionBar actionBar, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return actionBar.KWHzl(str, function1);
        }

        public final C18514fjo KWHzl(@NotNull java.lang.String str, @NotNull Function1<? super BatchCreateRootWalletInformationBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C18514fjo c18514fjo = new C18514fjo();
            c18514fjo.KWHzl = function1;
            c18514fjo.copydefault = str;
            return c18514fjo;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        KWHzl(c55198xfS);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        constraintLayout.setPadding(0, 0, 0, C55298xhM.OLrzqt(24, contextRequireContext));
    }

    public static final java.util.List KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final void KWHzl(final C55198xfS c55198xfS) {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null), this);
        final Function1 function1 = new Function1() { // from class: o.fjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18514fjo.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18514fjo.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function12 = new Function1() { // from class: o.fjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18514fjo.AEQbTJ(this.OLrzqt, c55198xfS, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18514fjo.copydefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18514fjo.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18514fjo.AhwBna(function13, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final C18514fjo c18514fjo, C55198xfS c55198xfS, java.util.List list) {
        if (list.isEmpty()) {
            c18514fjo.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            java.lang.String strEZpvd = abstractC12784ctX.EZpvd("opened");
            arrayList.add(new C55276xgr(abstractC12784ctX.AuCTel(), new BatchCreateRootWalletInformationBean(abstractC12784ctX.AuCTel(), abstractC12784ctX.EZpvd(), abstractC12784ctX.fJNWhG()), C13821dZn.EZpvd.OLrzqt(C54880xYt.formatValuationFromAsset$default(strEZpvd, null, false, C14455dll.KWHzl.copydefault(strEZpvd), false, 11, null)), Intrinsics.EZpvd((java.lang.Object) abstractC12784ctX.EZpvd(), (java.lang.Object) c18514fjo.copydefault), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.fjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C18514fjo.OLrzqt(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18514fjo, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C18514fjo c18514fjo, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super BatchCreateRootWalletInformationBean, Unit> function1 = c18514fjo.KWHzl;
        if (function1 != null) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            function1.invoke(objOLrzqt instanceof BatchCreateRootWalletInformationBean ? (BatchCreateRootWalletInformationBean) objOLrzqt : null);
        }
        c18514fjo.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(java.lang.Throwable th) {
        pUU.copydefault("BatchAccountSelectWalletFragment", "error message = " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final java.util.List KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet && abstractC12784ctX.AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
