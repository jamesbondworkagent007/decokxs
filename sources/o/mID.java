package o;

import android.view.View;
import androidx.databinding.BindingAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mID {
    @BindingAdapter(requireAll = false, value = {"okcr_backAction", "okcr_endIconAction", "showBackIcon", "headerTitle"})
    public static final void EZpvd(@NotNull final mIB mib, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, java.lang.Boolean bool, java.lang.String str) {
        Intrinsics.checkNotNullParameter(mib, "");
        if (onClickListener != null) {
            mib.setBackIconAction(new Function0() { // from class: o.mIG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mID.AEQbTJ(onClickListener, mib);
                }
            });
        }
        if (onClickListener2 != null) {
            mib.setEndIconAction(new Function0() { // from class: o.mIH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mID.copydefault(onClickListener2, mib);
                }
            });
        }
        if (bool != null) {
            mib.copydefault(bool.booleanValue());
        }
        if (str != null) {
            mib.setTitle(str);
        }
    }

    public static final Unit AEQbTJ(View.OnClickListener onClickListener, mIB mib) {
        onClickListener.onClick(mib);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(View.OnClickListener onClickListener, mIB mib) {
        onClickListener.onClick(mib);
        return Unit.INSTANCE;
    }
}
