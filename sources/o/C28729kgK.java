package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28729kgK extends AbstractC28747kgc {
    public C23475hyt valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX DEBUG: Possible override for method o.kgc.EZpvd()V */
    public final MemeUnitSelectionBottomSheetParams EZpvd() {
        MemeUnitSelectionBottomSheetParams memeUnitSelectionBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeUnitSelectionBottomSheetParams = (MemeUnitSelectionBottomSheetParams) arguments.getParcelable("key.meme_unit_params")) == null) ? new MemeUnitSelectionBottomSheetParams(null, null, 3, null) : memeUnitSelectionBottomSheetParams;
    }

    /* JADX INFO: renamed from: o.kgK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28729kgK AEQbTJ(@NotNull MemeUnitSelectionBottomSheetParams memeUnitSelectionBottomSheetParams) {
            Intrinsics.checkNotNullParameter(memeUnitSelectionBottomSheetParams, "");
            C28729kgK c28729kgK = new C28729kgK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_unit_params", memeUnitSelectionBottomSheetParams);
            c28729kgK.setArguments(bundle);
            return c28729kgK;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.Object next;
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C23475hyt.OLrzqt(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        java.util.Iterator<T> it = EZpvd().copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((MemeSelection) next).AhwBna()) {
                    break;
                }
            }
        }
        MemeSelection memeSelection = (MemeSelection) next;
        if (memeSelection == null || (strValueOf = memeSelection.KWHzl()) == null) {
            strValueOf = java.lang.String.valueOf(TokenAgeType.m.getValue());
        }
        EZpvd(strValueOf);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        KWHzl(null);
        super.onDestroy();
    }

    public final void EZpvd(java.lang.String str) {
        C28055kNf c28055kNf;
        java.util.List<MemeSelection> listCopydefault = EZpvd().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (MemeSelection memeSelection : listCopydefault) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) memeSelection.djBIcL());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C28060kNk(memeSelection.KWHzl(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        C23475hyt c23475hyt = this.valueOf;
        if (c23475hyt == null || (c28055kNf = c23475hyt.OLrzqt) == null) {
            return;
        }
        c28055kNf.setSpanCount(3);
        c28055kNf.setCallback(new Application());
        c28055kNf.setData(arrayList, str);
        c28055kNf.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.kgK$Application */
    public static final class Application implements InterfaceC28053kNd {
        public Application() {
        }

        @Override // o.InterfaceC28053kNd
        public void OLrzqt(java.lang.String str) {
            java.lang.Object obj;
            java.lang.Object next;
            java.lang.String strValueOf;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.Iterator<T> it = C28729kgK.this.EZpvd().copydefault().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((MemeSelection) next).AhwBna()) {
                        break;
                    }
                }
            }
            MemeSelection memeSelection = (MemeSelection) next;
            if (memeSelection == null || (strValueOf = memeSelection.KWHzl()) == null) {
                strValueOf = java.lang.String.valueOf(TokenAgeType.m.getValue());
            }
            if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) str)) {
                C28729kgK.this.dismissAllowingStateLoss();
                return;
            }
            C28729kgK c28729kgK = C28729kgK.this;
            java.util.Iterator<T> it2 = c28729kgK.EZpvd().copydefault().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((MemeSelection) next2).KWHzl(), (java.lang.Object) str)) {
                    obj = next2;
                    break;
                }
            }
            c28729kgK.KWHzl((MemeSelection) obj);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28728kgJ interfaceC28728kgJ = parentFragment instanceof InterfaceC28728kgJ ? (InterfaceC28728kgJ) parentFragment : null;
        if (interfaceC28728kgJ != null) {
            interfaceC28728kgJ.KWHzl();
        }
    }

    public static /* synthetic */ void onFinish$default(C28729kgK c28729kgK, MemeSelection memeSelection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            memeSelection = null;
        }
        c28729kgK.KWHzl(memeSelection);
    }

    public final void KWHzl(MemeSelection memeSelection) {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28728kgJ interfaceC28728kgJ = parentFragment instanceof InterfaceC28728kgJ ? (InterfaceC28728kgJ) parentFragment : null;
        if (interfaceC28728kgJ != null) {
            interfaceC28728kgJ.EZpvd(memeSelection);
        }
        dismissAllowingStateLoss();
    }
}
