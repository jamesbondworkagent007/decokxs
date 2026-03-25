package o;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.im.biz.group.contacts.GiftContactInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34121nSe extends AbstractC34124nSh {
    public GiftContactInfo copydefault;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final java.lang.String EZpvd = "groupID";

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        wxq.AYXKKw().setText(getString(C35399nuc.LoaderManager.dPkBzA));
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C35399nuc.StateListAnimator.UrRBLY, C34123nSg.class, getArguments());
        fragmentTransactionBeginTransaction.commit();
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTED", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C34121nSe.AEQbTJ(this.EZpvd, str, bundle2);
            }
        });
    }

    public static final void AEQbTJ(C34121nSe c34121nSe, java.lang.String str, android.os.Bundle bundle) {
        GiftContactInfo giftContactInfo;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            giftContactInfo = (GiftContactInfo) bundle.getParcelable("RESULT_KEY_SELECTED", GiftContactInfo.class);
        } else {
            giftContactInfo = (GiftContactInfo) bundle.getParcelable("RESULT_KEY_SELECTED");
        }
        c34121nSe.copydefault = giftContactInfo;
        c34121nSe.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_GIFT_CONTACT_SELECTION", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_GIFT_CONTACT_SELECTION", this.copydefault)));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C33899nJz.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    /* JADX INFO: renamed from: o.nSe$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nSe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
