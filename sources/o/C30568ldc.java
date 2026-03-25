package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30568ldc extends LinearLayoutCompat {
    public Function1<? super AdvancedAutoSellStrategy, Unit> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30568ldc(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30568ldc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30568ldc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
    }

    private final Sequence<C30569ldd> OLrzqt() {
        Sequence<C30569ldd> sequenceDbNXlk = C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), Application.KWHzl);
        Intrinsics.copydefault(sequenceDbNXlk, "");
        return sequenceDbNXlk;
    }

    public final void AEQbTJ(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C30569ldd c30569ldd = new C30569ldd(context);
        c30569ldd.setupRemoteStrategy(advancedAutoSellStrategy, z);
        c30569ldd.setOnAddStrategyClickListener(this.copydefault);
        addView(c30569ldd);
    }

    public final void KWHzl(boolean z) {
        java.util.Iterator<C30569ldd> it = OLrzqt().iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(z);
        }
    }

    public final void setOnAddStrategyClickListener(Function1<? super AdvancedAutoSellStrategy, Unit> function1) {
        this.copydefault = function1;
        java.util.Iterator<C30569ldd> it = OLrzqt().iterator();
        while (it.hasNext()) {
            it.next().setOnAddStrategyClickListener(function1);
        }
    }

    /* JADX INFO: renamed from: o.ldc$Application */
    public static final class Application implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof C30569ldd);
        }
    }
}
