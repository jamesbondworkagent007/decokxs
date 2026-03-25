package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.picker.OKIMVisualMediaPicker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oBC {
    public static /* synthetic */ OKIMVisualMediaPicker createVisualMediaPicker$default(androidx.fragment.app.Fragment fragment, C35724oBi c35724oBi, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c35724oBi = new C35724oBi(0, false, 0, false, null, 31, null);
        }
        return EZpvd(fragment, c35724oBi);
    }

    public static final OKIMVisualMediaPicker EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull C35724oBi c35724oBi) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(c35724oBi, "");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new OKIMVisualMediaPicker(fragment, fragmentActivityRequireActivity, childFragmentManager, c35724oBi);
    }

    public static /* synthetic */ OKIMVisualMediaPicker createVisualMediaPicker$default(AppCompatActivity appCompatActivity, C35724oBi c35724oBi, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c35724oBi = new C35724oBi(0, false, 0, false, null, 31, null);
        }
        return AEQbTJ(appCompatActivity, c35724oBi);
    }

    public static final OKIMVisualMediaPicker AEQbTJ(@NotNull AppCompatActivity appCompatActivity, @NotNull C35724oBi c35724oBi) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(c35724oBi, "");
        androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        return new OKIMVisualMediaPicker(appCompatActivity, appCompatActivity, supportFragmentManager, c35724oBi);
    }
}
