package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.business.defi.wallet.mine.WalletSecurityActivity;
import com.okinc.business.defi.wallet.mine.binder.DefiWalletSecurityTypeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18808fpR extends AbstractC14584doH<WalletSecurityActivity.DefiWalletSecurityBean.Application, C16711epA> {
    public final Function1<WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.WalletSecurityActivity$DefiWalletSecurityBean$SecurityContentType, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18808fpR(@NotNull Function1<? super WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType, Unit> function1) {
        super(DefiWalletSecurityTypeBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16711epA c16711epA, @NotNull final WalletSecurityActivity.DefiWalletSecurityBean.Application application) {
        Intrinsics.checkNotNullParameter(c16711epA, "");
        Intrinsics.checkNotNullParameter(application, "");
        OKRegularCell oKRegularCell = c16711epA.OLrzqt;
        oKRegularCell.setTitle(application.OLrzqt());
        oKRegularCell.setDescription(application.KWHzl());
        WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType securityContentTypeEZpvd = application.EZpvd();
        WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType securityContentType = WalletSecurityActivity.DefiWalletSecurityBean.SecurityContentType.WalletReset;
        if (securityContentTypeEZpvd == securityContentType) {
            oKRegularCell.EZpvd().setTextAppearance(oKRegularCell.getContext(), C52761wXj.LoaderManager.AwvSrB);
            oKRegularCell.EZpvd().setTextColor(ContextCompat.getColor(oKRegularCell.getContext(), C52761wXj.Activity.BVXAa));
        } else {
            oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
            oKRegularCell.EZpvd().setTextColor(ContextCompat.getColor(oKRegularCell.getContext(), C52761wXj.Activity.DeEinT));
            oKRegularCell.AEQbTJ().setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
            oKRegularCell.AEQbTJ().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.fpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18808fpR.EZpvd(this.KWHzl, application, view);
            }
        });
        C55068xcv c55068xcv = c16711epA.AEQbTJ;
        c55068xcv.setText(application.copydefault());
        c55068xcv.setTypeface(ResourcesCompat.getFont(c55068xcv.getContext(), C52761wXj.Dialog.KWHzl));
        c55068xcv.setCompoundDrawablePadding((int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        c55068xcv.setVisibility(application.EZpvd() == securityContentType ? 8 : 0);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c55068xcv.getContext(), C52761wXj.TaskDescription.fiXcQa);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) C55298xhM.dp$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) C55298xhM.dp$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c55068xcv.getContext(), C52761wXj.Activity.Dff));
        }
        c55068xcv.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public static final void EZpvd(C18808fpR c18808fpR, WalletSecurityActivity.DefiWalletSecurityBean.Application application, android.view.View view) {
        c18808fpR.EZpvd.invoke(application.EZpvd());
    }
}
