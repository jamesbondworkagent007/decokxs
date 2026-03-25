package o;

import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsWarningMessageBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24152iWv extends AbstractC27119jpF<iVX.AssistContent, C23780iJa> {
    public static final C24152iWv KWHzl = new C24152iWv();

    private C24152iWv() {
        super(InvestOrderDetailsWarningMessageBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23780iJa c23780iJa, @NotNull iVX.AssistContent assistContent) {
        Intrinsics.checkNotNullParameter(c23780iJa, "");
        Intrinsics.checkNotNullParameter(assistContent, "");
        c23780iJa.getRoot().setText(assistContent.copydefault());
    }
}
