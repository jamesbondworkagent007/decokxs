package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kCO extends AbstractC52797wYs {
    public static final ActionBar Companion = new ActionBar(null);

    @Override // o.AbstractC52797wYs, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public final java.util.List<TokenGroupActionType> KWHzl() {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "params.actions", TokenGroupActionType.class)) == null) ? yDY.AhwBna() : parcelableArrayList;
    }

    public final CommonGroupUiModel copydefault() {
        CommonGroupUiModel commonGroupUiModel;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (commonGroupUiModel = (CommonGroupUiModel) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "params.selected_group", CommonGroupUiModel.class))) == null) ? (CommonGroupUiModel) C31200lpY.throwIfDebug$default(new CommonGroupUiModel(0, null, 0, 0, 0, false, false, 127, null), null, 2, null) : commonGroupUiModel;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final kCO KWHzl(@NotNull java.util.List<? extends TokenGroupActionType> list, @NotNull CommonGroupUiModel commonGroupUiModel) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
            kCO kco = new kCO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("params.selected_group", commonGroupUiModel);
            bundle.putParcelableArrayList("params.actions", new java.util.ArrayList<>(list));
            kco.setArguments(bundle);
            return kco;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setTitle("");
        wxq.AYXKKw().setVisibility(8);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new C27775kCx());
        java.util.List<TokenGroupActionType> listKWHzl = KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (TokenGroupActionType tokenGroupActionType : listKWHzl) {
            if (tokenGroupActionType == TokenGroupActionType.EDIT) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sEcTXd);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy);
            }
            arrayList.add(new C55276xgr(strAYXKKw, tokenGroupActionType, null, false, false, null, null, 124, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.kCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return kCO.OLrzqt(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(kCO kco, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            ActivityResultCaller parentFragment = kco.getParentFragment();
            kCP kcp = parentFragment instanceof kCP ? (kCP) parentFragment : null;
            if (kcp == null) {
                KeyEventDispatcher.Component activity = kco.getActivity();
                kcp = activity instanceof kCP ? (kCP) activity : null;
            }
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            TokenGroupActionType tokenGroupActionType = objOLrzqt instanceof TokenGroupActionType ? (TokenGroupActionType) objOLrzqt : null;
            if (tokenGroupActionType == null) {
                tokenGroupActionType = TokenGroupActionType.NONE;
            }
            if (kcp != null) {
                kcp.OLrzqt(tokenGroupActionType, kco.copydefault());
            }
        }
        kco.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
