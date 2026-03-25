package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gRL extends AbstractC31189lpN<C19858gRy, hCX> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hCX KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCX hcxOLrzqt = hCX.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcxOLrzqt, "");
        return hcxOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hCX hcx, @NotNull C19858gRy c19858gRy) {
        Intrinsics.checkNotNullParameter(hcx, "");
        Intrinsics.checkNotNullParameter(c19858gRy, "");
        C25352ivB.setOnDoubleCheckClickListener$default(hcx.EZpvd, 0L, new Function1() { // from class: o.gRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRL.copydefault((android.view.View) obj);
            }
        }, 1, null);
        AppCompatImageView appCompatImageView = hcx.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C22361hds.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.WalletOrderEmpty);
    }

    public static final Unit copydefault(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, gKZ.EZpvd.AEQbTJ("dex/advanced/buy"), null, new Function1() { // from class: o.gRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRL.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
