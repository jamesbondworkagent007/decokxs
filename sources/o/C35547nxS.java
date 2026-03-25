package o;

import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.im.bean.ContactType;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35547nxS extends C35639nzE {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.nxS$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C35547nxS newInstance$default(StateListAnimator stateListAnimator, SelectableDelegate.Mode mode, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mode = SelectableDelegate.Mode.NONE;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return stateListAnimator.AEQbTJ(mode, z);
        }

        public final C35547nxS AEQbTJ(@NotNull SelectableDelegate.Mode mode, boolean z) {
            Intrinsics.checkNotNullParameter(mode, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(OtcExtraKeys.MODE, mode);
            bundle.putBoolean("filterable", z);
            bundle.putBoolean("hide_myself", true);
            bundle.putParcelable("user_type", ContactType.ALL_FRIEND);
            C35547nxS c35547nxS = new C35547nxS();
            c35547nxS.setArguments(bundle);
            return c35547nxS;
        }
    }

    @Override // o.C35639nzE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(C35399nuc.StateListAnimator.zYHWMc);
        if (editText != null) {
            editText.setHint(C33070mpX.AYXKKw(C35399nuc.LoaderManager.iZzfmt));
        }
    }

    @Override // o.C35639nzE
    public void KWHzl(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.KWHzl(c59534zip);
        c59534zip.register(C35692oAd.class, new C33655nAy());
        c59534zip.register(C37735ozT.class, new nAA());
    }

    @Override // o.C35639nzE
    public java.lang.String OLrzqt(int i, java.lang.Object obj) {
        return obj == null ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : ((obj instanceof C37736ozU) || (obj instanceof C35692oAd)) ? "↑" : super.OLrzqt(i, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // o.C35639nzE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list, java.util.List<? extends java.lang.Object> list2) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(list, "");
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                if (obj instanceof RelationInfo) {
                    arrayList.add(obj);
                }
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(arrayList.size());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                strAYXKKw = C33069mpW.copydefault(C35399nuc.LoaderManager.KDccX, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatLocalized$default(java.lang.String.valueOf(numValueOf.intValue()), null, 1, null))));
                if (strAYXKKw == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.gdLjtZ);
                }
            }
        }
        FragmentActivity activity = getActivity();
        ActivityC35669nzi activityC35669nzi = activity instanceof ActivityC35669nzi ? (ActivityC35669nzi) activity : null;
        if (activityC35669nzi != null) {
            activityC35669nzi.KWHzl(strAYXKKw);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
