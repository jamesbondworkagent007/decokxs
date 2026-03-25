package o;

import com.okinc.business.invest_biz.ui.viewmodel.itembinder.InvestApyDescriptionBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23943iPb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27116jpC extends AbstractC27119jpF<InterfaceC23943iPb.Activity, iIB> {
    public static final C27116jpC AEQbTJ = new C27116jpC();

    private C27116jpC() {
        super(InvestApyDescriptionBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIB iib, @NotNull InterfaceC23943iPb.Activity activity) {
        Intrinsics.checkNotNullParameter(iib, "");
        Intrinsics.checkNotNullParameter(activity, "");
        iib.KWHzl.setText(activity.KWHzl());
    }
}
