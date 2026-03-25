package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZM extends AbstractC42594rYq<rZQ, rYA> {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public rZM(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public rYA KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYA ryaAEQbTJ = rYA.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryaAEQbTJ, "");
        return ryaAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<rZQ, rYA>.StateListAnimator<rYA> stateListAnimator, @NotNull rZQ rzq) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(rzq, "");
        rYA rya = (rYA) stateListAnimator.AEQbTJ();
        java.lang.Integer numAEQbTJ = rzq.AEQbTJ();
        if (numAEQbTJ != null) {
            int iIntValue = numAEQbTJ.intValue();
            ConstraintLayout constraintLayout = rya.KWHzl;
            constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this, iIntValue));
        }
        if (rzq.OLrzqt()) {
            rya.EZpvd.setText(rzq.EZpvd());
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) rzq.copydefault());
            android.widget.TextView textView = rya.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(zOLrzqt ? 0 : 8);
            C55068xcv c55068xcv = rya.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55068xcv, "");
            c55068xcv.setVisibility(zOLrzqt ? 0 : 8);
            if (zOLrzqt) {
                rya.AEQbTJ.setText(rzq.copydefault());
                rya.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                rya.EZpvd.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
                rya.copydefault.setText(rzq.KWHzl() ? C33070mpX.AYXKKw(rXV.TaskDescription.djBIcL) : "");
                ViewGroup.LayoutParams layoutParams = rya.copydefault.getLayoutParams();
                layoutParams.width = rzq.KWHzl() ? -2 : C55298xhM.dpInt$default(56, (android.content.Context) null, 1, (java.lang.Object) null);
                rya.copydefault.setLayoutParams(layoutParams);
                rya.KWHzl.setPadding(C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                return;
            }
            rya.EZpvd.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
            rya.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            rya.KWHzl.setPadding(C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            return;
        }
        rya.EZpvd.setText(rzq.EZpvd());
        rya.EZpvd.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        android.widget.TextView textView2 = rya.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        rya.AEQbTJ.setText(rzq.copydefault());
        C55068xcv c55068xcv2 = rya.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55068xcv2, "");
        c55068xcv2.setVisibility(0);
        rya.KWHzl.setPadding(C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ rZM AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rZM rzm, int i) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = rzm;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(java.lang.Integer.valueOf(this.EZpvd));
            }
        }
    }
}
