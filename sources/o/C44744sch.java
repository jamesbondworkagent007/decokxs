package o;

import com.okinc.account.api.model.banner.Margin;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44744sch extends AbstractC43215rlA implements InterfaceC8101awQ {
    public final java.lang.String OLrzqt = C44744sch.class.getSimpleName();

    /* JADX INFO: renamed from: o.sch$ActionBar */
    public static final class ActionBar extends AbstractC8099awO {
        @Override // o.AbstractC32996moC
        public int getLayoutId() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC32996moC
        public void initView(android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    @Override // o.InterfaceC8101awQ
    public void copydefault(@NotNull android.widget.ImageView imageView, boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageView, "");
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
    }

    @Override // o.InterfaceC8101awQ
    public AbstractC8099awO OLrzqt(boolean z, @NotNull Margin margin) {
        Intrinsics.checkNotNullParameter(margin, "");
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new ActionBar();
    }
}
