package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTextTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC18127fcY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18189fdh extends AbstractC14584doH<DefiOnboardingTile.TextTile, C16790eqa> {
    public final Function1<InterfaceC18127fcY, Unit> EZpvd;

    /* JADX INFO: renamed from: o.fdh$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DefiOnboardingTile.TextTile.TextStyle.values().length];
            try {
                iArr[DefiOnboardingTile.TextTile.TextStyle.Header.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DefiOnboardingTile.TextTile.TextStyle.Desc.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DefiOnboardingTile.TextTile.TextStyle.TextButton.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DefiOnboardingTile.TextTile.TextStyle.Content.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fcY, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18189fdh(@NotNull Function1<? super InterfaceC18127fcY, Unit> function1) {
        super(DefiOnboardingTextTileBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public static final void EZpvd(C18189fdh c18189fdh, InterfaceC18127fcY.TaskDescription taskDescription, android.view.View view) {
        Function1<InterfaceC18127fcY, Unit> function1 = c18189fdh.EZpvd;
        Intrinsics.copydefault(taskDescription, "");
        function1.invoke(taskDescription);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16790eqa c16790eqa, @NotNull DefiOnboardingTile.TextTile textTile) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(c16790eqa, "");
        Intrinsics.checkNotNullParameter(textTile, "");
        int i = StateListAnimator.OLrzqt[textTile.AEQbTJ().ordinal()];
        if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.LoaderManager.iwGUEr), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        } else if (i == 2) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.LoaderManager.run), java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
        } else if (i == 3) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.LoaderManager.gHZMYf), java.lang.Integer.valueOf(C52761wXj.Activity.DTeKQX));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.LoaderManager.sSMYrx), java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        c16790eqa.KWHzl.setGravity(textTile.OLrzqt());
        TextViewCompat.setTextAppearance(c16790eqa.KWHzl, iIntValue);
        c16790eqa.KWHzl.setTextColor(ContextCompat.getColor(c16790eqa.getRoot().getContext(), iIntValue2));
        final InterfaceC18127fcY.TaskDescription taskDescriptionGEmmrt = textTile.gEmmrt();
        if (taskDescriptionGEmmrt != null) {
            c16790eqa.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.fdf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C18189fdh.EZpvd(this.AEQbTJ, taskDescriptionGEmmrt, view);
                }
            });
        }
        DefiOnboardingTile.TextTile.TaskDescription taskDescriptionKWHzl = textTile.KWHzl();
        c16790eqa.getRoot().setPadding(taskDescriptionKWHzl.OLrzqt(), taskDescriptionKWHzl.EZpvd(), taskDescriptionKWHzl.copydefault(), taskDescriptionKWHzl.KWHzl());
        DefiOnboardingTile.TextTile.Application applicationAhwBna = textTile.AhwBna();
        if (applicationAhwBna != null) {
            c16790eqa.copydefault.setImageDrawable(applicationAhwBna.EZpvd());
        } else {
            c16790eqa.copydefault.setImageDrawable(null);
        }
        java.lang.String strEZpvd = textTile.EZpvd();
        if (strEZpvd != null) {
            c16790eqa.KWHzl.setText(strEZpvd);
            return;
        }
        java.lang.Integer numCopydefault = textTile.copydefault();
        if (numCopydefault != null) {
            c16790eqa.KWHzl.setText(c16790eqa.getRoot().getContext().getString(numCopydefault.intValue()));
        }
    }
}
