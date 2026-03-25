package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29717kys extends AbstractC29720kyv {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kyt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29717kys.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Possible override for method o.kyv.EZpvd()V */
    public final TagExplanationBottomSheetParams EZpvd() {
        return (TagExplanationBottomSheetParams) this.gEmmrt.getValue();
    }

    public static final TagExplanationBottomSheetParams AEQbTJ(C29717kys c29717kys) {
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams;
        android.os.Bundle arguments = c29717kys.getArguments();
        return (arguments == null || (tagExplanationBottomSheetParams = (TagExplanationBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.params", TagExplanationBottomSheetParams.class))) == null) ? new TagExplanationBottomSheetParams(null, null, false, null, null, false, 63, null) : tagExplanationBottomSheetParams;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.onMultiWindowModeChanged));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        android.view.View frameLayout = new android.widget.FrameLayout(constraintLayout.getContext());
        frameLayout.setId(android.view.View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        frameLayout.setLayoutParams(layoutParams);
        constraintLayout.addView(frameLayout);
        getChildFragmentManager().beginTransaction().replace(frameLayout.getId(), C29721kyw.Companion.copydefault(EZpvd())).commitNow();
    }

    /* JADX INFO: renamed from: o.kys$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kys.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C29717kys EZpvd(@NotNull TagExplanationBottomSheetParams tagExplanationBottomSheetParams) {
            Intrinsics.checkNotNullParameter(tagExplanationBottomSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", tagExplanationBottomSheetParams);
            C29717kys c29717kys = new C29717kys();
            c29717kys.setArguments(bundle);
            return c29717kys;
        }
    }
}
