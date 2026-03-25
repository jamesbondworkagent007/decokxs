package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31124loB extends ConstraintLayout {
    public abstract UnitType AEQbTJ();

    public abstract void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2);

    public abstract C55001xbh EZpvd();

    public abstract void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2);

    public abstract boolean KWHzl();

    public abstract void OLrzqt(int i);

    public abstract void copydefault();

    public abstract void copydefault(@NotNull TransactionType transactionType, boolean z);

    public abstract void copydefault(@NotNull Function1<? super java.lang.Integer, Unit> function1);

    public abstract void setInputEditText(@NotNull java.lang.String str);

    public abstract void setInputEnabled(boolean z);

    public abstract void setLevelValue(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull TransactionType transactionType);

    public abstract void setTransactionViewEventTrackCallback(@NotNull Function1<? super java.lang.String, Unit> function1);

    public abstract void setUnit(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    public abstract void setUnitSelectClickListener(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Function1<? super C55276xgr, Unit> function1);

    public abstract void setValueTextColor(@androidx.annotation.ColorRes int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31124loB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31124loB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31124loB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void isShowUnitView$default(AbstractC31124loB abstractC31124loB, TransactionType transactionType, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isShowUnitView");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC31124loB.copydefault(transactionType, z);
    }

    public static /* synthetic */ void setUnit$default(AbstractC31124loB abstractC31124loB, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUnit");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        abstractC31124loB.setUnit(str, str2);
    }
}
