package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28819khv extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C21499hBq KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public final MemeSelectionParams OLrzqt() {
        MemeSelectionParams memeSelectionParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeSelectionParams = (MemeSelectionParams) arguments.getParcelable("key.meme_selection")) == null) ? new MemeSelectionParams(null, null, 0, 7, null) : memeSelectionParams;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().copydefault())) {
            wxq.setStyle(2);
            wxq.setTitle(OLrzqt().copydefault());
        } else {
            wxq.setStyle(0);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = C21499hBq.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl();
    }

    public final void KWHzl() {
        C21499hBq c21499hBq = this.KWHzl;
        if (c21499hBq != null) {
            c21499hBq.EZpvd.removeAllViews();
            for (final MemeSelection memeSelection : OLrzqt().KWHzl()) {
                final C21537hDa c21537hDaCopydefault = C21537hDa.copydefault(getCustomLayoutInflater(), c21499hBq.EZpvd, true);
                Intrinsics.checkNotNullExpressionValue(c21537hDaCopydefault, "");
                c21537hDaCopydefault.copydefault.setText(memeSelection.djBIcL());
                c21537hDaCopydefault.getRoot().setContentDescription(memeSelection.OLrzqt());
                int i = 8;
                if (memeSelection.copydefault() != null) {
                    android.widget.ImageView imageView = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    c21537hDaCopydefault.KWHzl.setImageDrawable(C33070mpX.KWHzl(memeSelection.copydefault().intValue()));
                } else if (memeSelection.EZpvd().length() > 0) {
                    android.widget.ImageView imageView2 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    android.widget.ImageView imageView3 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C25392ivp.loadImageBitmap$default(imageView3, memeSelection.EZpvd(), new AbstractC5396Qc[0], null, new Function2() { // from class: o.khy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C28819khv.copydefault(memeSelection, c21537hDaCopydefault, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
                        }
                    }, 4, null);
                } else {
                    android.widget.ImageView imageView4 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                }
                android.widget.ImageView imageView5 = c21537hDaCopydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                if (memeSelection.AhwBna()) {
                    i = 0;
                }
                imageView5.setVisibility(i);
                c21537hDaCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.khA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C28819khv.AEQbTJ(this.KWHzl, memeSelection, view);
                    }
                });
            }
        }
    }

    public static final Unit copydefault(MemeSelection memeSelection, C21537hDa c21537hDa, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        boolean z = th == null || memeSelection.AEQbTJ() != null;
        android.widget.ImageView imageView = c21537hDa.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (th != null && memeSelection.AEQbTJ() != null) {
            c21537hDa.KWHzl.setImageResource(memeSelection.AEQbTJ().intValue());
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C28819khv c28819khv, MemeSelection memeSelection, android.view.View view) {
        c28819khv.copydefault(memeSelection);
        c28819khv.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        copydefault(null);
        super.onDismiss(dialogInterface);
    }

    public final void copydefault(MemeSelection memeSelection) {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28773khB interfaceC28773khB = parentFragment instanceof InterfaceC28773khB ? (InterfaceC28773khB) parentFragment : null;
        if (interfaceC28773khB != null) {
            interfaceC28773khB.copydefault(memeSelection, OLrzqt().AEQbTJ());
        }
    }

    /* JADX INFO: renamed from: o.khv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28819khv KWHzl(@NotNull MemeSelectionParams memeSelectionParams) {
            Intrinsics.checkNotNullParameter(memeSelectionParams, "");
            C28819khv c28819khv = new C28819khv();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_selection", memeSelectionParams);
            c28819khv.setArguments(bundle);
            return c28819khv;
        }
    }
}
