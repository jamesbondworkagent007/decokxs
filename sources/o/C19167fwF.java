package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19167fwF extends RecyclerView.ViewHolder {
    public final Function0<Unit> KWHzl;
    public final C17171exk OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19167fwF(@NotNull C17171exk c17171exk, @NotNull Function0<Unit> function0) {
        super(c17171exk.getRoot());
        Intrinsics.checkNotNullParameter(c17171exk, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = c17171exk;
        this.KWHzl = function0;
    }

    public final void copydefault(@NotNull C18991fsp c18991fsp) {
        Intrinsics.checkNotNullParameter(c18991fsp, "");
        C17171exk c17171exk = this.OLrzqt;
        c17171exk.valueOf.setText(c18991fsp.KWHzl());
        C55068xcv c55068xcv = c17171exk.AhwBna;
        c55068xcv.setTextColor(ContextCompat.getColor(c55068xcv.getContext(), C52761wXj.Activity.fdOvFl));
        C55068xcv c55068xcv2 = c17171exk.AhwBna;
        android.content.Context context = c55068xcv2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55068xcv2.setText(pTD.EZpvd(context, C13754dXa.Dialog.values, c18991fsp.copydefault().size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(c18991fsp.copydefault().size()))))));
        int size = c18991fsp.copydefault().size();
        if (size == 0) {
            ShapeableImageView shapeableImageView = c17171exk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            shapeableImageView.setVisibility(8);
            ShapeableImageView shapeableImageView2 = c17171exk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
            shapeableImageView2.setVisibility(8);
            android.widget.ImageView imageView = c17171exk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
        } else if (size == 1) {
            ShapeableImageView shapeableImageView3 = c17171exk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
            shapeableImageView3.setVisibility(0);
            ShapeableImageView shapeableImageView4 = c17171exk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView4, "");
            shapeableImageView4.setVisibility(8);
            android.widget.ImageView imageView2 = c17171exk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            ShapeableImageView shapeableImageView5 = c17171exk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView5, "");
            C14725dqq.loadFixSizeBorderImage$default(shapeableImageView5, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(c18991fsp.copydefault()), C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, 0, false, 48, null);
        } else if (size == 2) {
            ShapeableImageView shapeableImageView6 = c17171exk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView6, "");
            shapeableImageView6.setVisibility(0);
            ShapeableImageView shapeableImageView7 = c17171exk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView7, "");
            shapeableImageView7.setVisibility(0);
            android.widget.ImageView imageView3 = c17171exk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            EZpvd(this.OLrzqt, c18991fsp);
        } else {
            ShapeableImageView shapeableImageView8 = c17171exk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView8, "");
            shapeableImageView8.setVisibility(0);
            ShapeableImageView shapeableImageView9 = c17171exk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView9, "");
            shapeableImageView9.setVisibility(0);
            android.widget.ImageView imageView4 = c17171exk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(0);
            EZpvd(this.OLrzqt, c18991fsp);
        }
        ConstraintLayout constraintLayout = c17171exk.copydefault;
        constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
    }

    public final void EZpvd(C17171exk c17171exk, C18991fsp c18991fsp) {
        ShapeableImageView shapeableImageView = c17171exk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(c18991fsp.copydefault()), C52761wXj.TaskDescription.aHXSQp, 2.0f, 32.0f, ContextCompat.getColor(c17171exk.EZpvd.getContext(), C52761wXj.Activity.RcXXUw), false, 32, null);
        ShapeableImageView shapeableImageView2 = c17171exk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, c18991fsp.copydefault().get(1), C52761wXj.TaskDescription.aHXSQp, 2.0f, 32.0f, ContextCompat.getColor(c17171exk.EZpvd.getContext(), C52761wXj.Activity.RcXXUw), false, 32, null);
    }

    /* JADX INFO: renamed from: o.fwF$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C19167fwF AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19167fwF c19167fwF) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c19167fwF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.invoke();
            }
        }
    }
}
