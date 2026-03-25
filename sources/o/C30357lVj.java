package o;

import android.view.View;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30357lVj extends lUN<CryptoListItem.Application, AbstractC31576lwe> {
    public final java.lang.String AEQbTJ;
    public final Function1<CryptoListItem.Application, Unit> KWHzl;

    @Override // o.lUN
    public /* bridge */ /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        EZpvd((CryptoListItem.Application) cryptoListItem, (C43312rms<AbstractC31576lwe>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.CryptoListItem$Application, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30357lVj(@NotNull Function1<? super CryptoListItem.Application, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.hUfVAv);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = function1;
        this.AEQbTJ = str;
    }

    public void EZpvd(@NotNull final CryptoListItem.Application application, @NotNull C43312rms<AbstractC31576lwe> c43312rms) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31576lwe abstractC31576lwe = (AbstractC31576lwe) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC31576lwe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, application.OLrzqt().getIcon(), C52761wXj.TaskDescription.aHXSQp);
        android.widget.ImageView imageView2 = abstractC31576lwe.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C33054mpH.EZpvd(imageView2, application.OLrzqt().getDexInfo().getChainLogo(), C52761wXj.TaskDescription.fERRXa);
        abstractC31576lwe.values.setText(application.OLrzqt().getCurrencyName());
        abstractC31576lwe.OLrzqt.setVisibility(8);
        abstractC31576lwe.isConnected.setText(application.getCryptoName());
        abstractC31576lwe.AkhnZx.setText(application.copydefault());
        android.widget.TextView textView = abstractC31576lwe.valueOf;
        textView.setVisibility(0);
        textView.setText(application.KWHzl());
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.widget.ImageView imageView3 = abstractC31576lwe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(application.OLrzqt().getDexInfo().getCommunityRecognized() ? 0 : 8);
        abstractC31576lwe.EZpvd.setBackground(Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        abstractC31576lwe.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lVk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30357lVj.EZpvd(this.EZpvd, application, view);
            }
        });
    }

    public static final void EZpvd(C30357lVj c30357lVj, CryptoListItem.Application application, android.view.View view) {
        c30357lVj.KWHzl.invoke(application);
    }
}
