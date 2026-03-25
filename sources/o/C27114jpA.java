package o;

import com.okinc.business.invest_biz.ui.viewmodel.itembinder.InvestApyDetailInfoBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23943iPb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27114jpA extends AbstractC27119jpF<InterfaceC23943iPb.TaskDescription, iIC> {
    public static final C27114jpA KWHzl = new C27114jpA();

    private C27114jpA() {
        super(InvestApyDetailInfoBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull iIC iic, @NotNull InterfaceC23943iPb.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(iic, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        iic.AEQbTJ.setText(taskDescription.OLrzqt().getSubTitle());
        iic.OLrzqt.setText(taskDescription.OLrzqt().getTotalValue());
        android.widget.ImageView imageView = iic.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(taskDescription.OLrzqt().getHasBonus() ? 0 : 8);
    }
}
