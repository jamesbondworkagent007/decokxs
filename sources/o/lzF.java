package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.view.LegacyBuySellHeader;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lzF<T extends ViewDataBinding> extends AbstractActivityC33041mov {
    public LegacyBuySellHeader AEQbTJ;
    public T EZpvd;
    public final int KWHzl;

    public abstract void EZpvd();

    public abstract void KWHzl();

    public abstract void KWHzl(@NotNull android.content.Intent intent, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LegacyBuySellHeader OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(LegacyBuySellHeader legacyBuySellHeader) {
        this.AEQbTJ = legacyBuySellHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.EZpvd = t;
    }

    public lzF(@androidx.annotation.LayoutRes int i) {
        this.KWHzl = i;
    }

    public final T AEQbTJ() {
        T t = this.EZpvd;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault(DataBindingUtil.setContentView(this, this.KWHzl));
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        KWHzl(intent, bundle);
        KWHzl();
        EZpvd();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class)).AEQbTJ(this, UKBannerType.APPROVED_6OCT23);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.AEQbTJ = null;
        AEQbTJ().unbind();
        super.onDestroy();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
