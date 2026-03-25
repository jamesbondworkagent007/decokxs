package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jFB extends kMD<jFL> {
    public final Function1<jFL, Unit> EZpvd;
    public final Function1<jFL, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jFL, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jFL, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jFB(@NotNull Function1<? super jFL, Unit> function1, @NotNull Function1<? super jFL, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.EZpvd = function12;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCF hcfAEQbTJ = hCF.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcfAEQbTJ, "");
        return hcfAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull final jFL jfl) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(jfl, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hCF hcf = viewBindingAEQbTJ instanceof hCF ? (hCF) viewBindingAEQbTJ : null;
        if (hcf == null) {
            return;
        }
        hcf.EZpvd.setText(jfl.KWHzl());
        if (jfl.AhwBna()) {
            hcf.OLrzqt.setImageDrawable(ContextCompat.getDrawable(hcf.getRoot().getContext(), C52761wXj.TaskDescription.fVjYLc));
        } else {
            hcf.OLrzqt.setImageDrawable(ContextCompat.getDrawable(hcf.getRoot().getContext(), C52761wXj.TaskDescription.dbwnZN));
        }
        hcf.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jFB.AEQbTJ(this.EZpvd, jfl, view);
            }
        });
        AppCompatImageView appCompatImageView = hcf.AEQbTJ;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this, jfl));
        ShapeableImageView shapeableImageView = hcf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C25386ivj.loadWalletProfileImage$default(shapeableImageView, jfl.AEQbTJ(), jfl.copydefault(), jfl.OLrzqt(), 0.0f, 8, null);
        if (jfl.gEmmrt()) {
            hcf.AEQbTJ.setImageResource(C52761wXj.TaskDescription.addPreRequisiteCollector);
            hcf.AEQbTJ.setColorFilter(hcf.getRoot().getContext().getColor(C52761wXj.Activity.gdmIOq));
        } else {
            hcf.AEQbTJ.setImageResource(C52761wXj.TaskDescription.invokespecialhrnhsO);
            hcf.AEQbTJ.setColorFilter(hcf.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void AEQbTJ(jFB jfb, jFL jfl, android.view.View view) {
        jfb.copydefault.invoke(jfl);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jFL OLrzqt;
        public final /* synthetic */ jFB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jFB jfb, jFL jfl) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = jfb;
            this.OLrzqt = jfl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke(this.OLrzqt);
            }
        }
    }
}
