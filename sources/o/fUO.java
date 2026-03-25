package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.tee.converter.ui.item.SmallAssetsConverterItemViewBinding$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUO extends AbstractC19608gIr<fTZ.Application, C16834erR> {
    public final Function1<fTZ.Application, java.lang.Boolean> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fTZ$Application, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fUO(@NotNull Function1<? super fTZ.Application, java.lang.Boolean> function1) {
        super(SmallAssetsConverterItemViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull final C16834erR c16834erR, @NotNull final fTZ.Application application) {
        Intrinsics.checkNotNullParameter(c16834erR, "");
        Intrinsics.checkNotNullParameter(application, "");
        ConstraintLayout root = c16834erR.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c16834erR));
        c16834erR.KWHzl.setCheckedIgnoreListener(application.copydefault());
        c16834erR.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                fUO.KWHzl(application, this, c16834erR, compoundButton, z);
            }
        });
        android.widget.ImageView imageView = c16834erR.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.KWHzl(imageView, application.OLrzqt().DbNXlk());
        c16834erR.AYXKKw.setText(application.OLrzqt().fJNWhG());
        c16834erR.EZpvd.setText(C54870xYj.OLrzqt(application.AEQbTJ(), (249 & 1) != 0 ? 0 : 0, application.OLrzqt().AkhnZx(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null));
        if (application.EZpvd()) {
            c16834erR.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            c16834erR.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            c16834erR.copydefault.setText(C54880xYt.formatValuation$default(C33129mqd.EZpvd(application.KWHzl()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null));
            c16834erR.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            return;
        }
        c16834erR.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        c16834erR.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        c16834erR.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPlaybackToRemote));
        c16834erR.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
    }

    public static final void KWHzl(fTZ.Application application, fUO fuo, C16834erR c16834erR, android.widget.CompoundButton compoundButton, boolean z) {
        application.AEQbTJ(z);
        if (fuo.EZpvd.invoke(application).booleanValue()) {
            return;
        }
        boolean z2 = !z;
        application.AEQbTJ(z2);
        c16834erR.KWHzl.setCheckedIgnoreListener(z2);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C16834erR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C16834erR c16834erR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c16834erR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.toggle();
            }
        }
    }
}
