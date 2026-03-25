package o;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45904tAo extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public tNN EZpvd;
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.tAo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C45904tAo().show(fragmentManager, C45904tAo.class.getSimpleName());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.EZpvd = tNN.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.DKtBnz);
        java.lang.String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.gtdfxv, C56423yEv.EZpvd(C56390yDp.OLrzqt("postContent", strAYXKKw)));
        tNN tnn = this.EZpvd;
        if (tnn != null && (textView3 = tnn.AEQbTJ) != null) {
            textView3.setText(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.tAl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45904tAo.EZpvd(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null));
        }
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47501trL.Fragment.hrjNmC);
        java.lang.String strCopydefault2 = C33069mpW.copydefault(C47501trL.Fragment.gwwfep, C56423yEv.EZpvd(C56390yDp.OLrzqt("createGroups", strAYXKKw2)));
        tNN tnn2 = this.EZpvd;
        if (tnn2 != null && (textView2 = tnn2.KWHzl) != null) {
            textView2.setText(C33061mpO.setupSpanStyles$default(strCopydefault2, new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.tAk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45904tAo.KWHzl(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null));
        }
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C47501trL.Fragment.iKEqwx);
        java.lang.String strCopydefault3 = C33069mpW.copydefault(C47501trL.Fragment.cBPFI, C56423yEv.EZpvd(C56390yDp.OLrzqt("shareTrades", strAYXKKw3)));
        tNN tnn3 = this.EZpvd;
        if (tnn3 != null && (textView = tnn3.AYXKKw) != null) {
            textView.setText(C33061mpO.setupSpanStyles$default(strCopydefault3, new java.lang.String[]{strAYXKKw3}, 0, null, false, new Function1() { // from class: o.tAn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45904tAo.gEmmrt(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{view.getBackground(), C33070mpX.KWHzl(C47501trL.ActionBar.AubY)});
        layerDrawable.setLayerGravity(1, 55);
        view.setBackground(layerDrawable);
    }

    public static final Unit EZpvd(C45904tAo c45904tAo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c45904tAo.getContext(), C52761wXj.LoaderManager.zLjUOn));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C45904tAo c45904tAo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c45904tAo.getContext(), C52761wXj.LoaderManager.zLjUOn));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C45904tAo c45904tAo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c45904tAo.getContext(), C52761wXj.LoaderManager.zLjUOn));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(0);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        wyf.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.dzCpvv));
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.tAo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C45904tAo EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45904tAo c45904tAo) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c45904tAo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
