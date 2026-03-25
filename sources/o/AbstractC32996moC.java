package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.okapm.okqpl.QPLFlavour;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.rxutils.SubHelper;
import kotlin.jvm.internal.Intrinsics;
import o.C60121zwJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32996moC extends androidx.fragment.app.Fragment implements C60121zwJ.Activity, InterfaceC33075mpc, LifecycleOwner, InterfaceC33016moW, InterfaceC33014moU {
    public static final int $stable = 8;
    private java.lang.String TAG;
    private boolean isLoadingAppear;
    private java.lang.Boolean mIsReenter;
    private InterfaceC33014moU mRefreshCommander;
    private java.lang.Object mRefreshToken;
    private final AbstractC42536rWm okQPL;

    public abstract int getLayoutId();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC42536rWm getOkQPL() {
        return this.okQPL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String getTAG() {
        return this.TAG;
    }

    public abstract void initView(@NotNull android.view.View view, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        this.mRefreshToken = obj;
        this.mRefreshCommander = interfaceC33014moU;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onRefreshCompleted(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
    }

    public void setListener() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TAG = str;
    }

    public AbstractC32996moC() {
        java.lang.String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.TAG = simpleName;
        this.okQPL = AbstractC42536rWm.Companion.copydefault(QPLFlavour.FRAGMENT);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(getLayoutId(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        initView(view, bundle);
        setListener();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mIsReenter != null) {
            this.mIsReenter = java.lang.Boolean.TRUE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mIsReenter = java.lang.Boolean.FALSE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        releaseLoading();
        SubHelper.AEQbTJ(this);
    }

    public final boolean isReenter() {
        java.lang.Boolean bool = this.mIsReenter;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void showLoading() {
        try {
            addLoadingAppearQPL();
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading(long j) {
        try {
            addLoadingAppearQPL();
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading(j);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingAtOnce() {
        try {
            addLoadingAppearQPL();
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoadingAtOnce();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingAtOnceCannotCancel() {
        try {
            addLoadingAppearQPL();
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoadingAtOnceCannotCancel();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public void dismissLoading() {
        try {
            addLoadingDisappearQPL();
            FragmentActivity activity = getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void releaseLoading() {
        addLoadingDisappearQPL();
        dismissLoading();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingWithLogo() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoadingWithLogo();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingWithLogo(long j) {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoadingWithLogo(j);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // o.InterfaceC33075mpc
    public void dismissLoadingWithLogo() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).dismissLoadingWithLogo();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C60121zwJ.KWHzl(i, strArr, iArr, this);
    }

    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.onPermissionsGranted(i, list);
        }
    }

    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.onPermissionsDenied(i, list);
        }
    }

    public final void addDisposable(@NotNull InterfaceC58217yxC interfaceC58217yxC) {
        Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        if (getActivity() instanceof AbstractActivityC33041mov) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).addDisposable(interfaceC58217yxC);
        }
    }

    public final void removeDisposable(@NotNull InterfaceC58217yxC interfaceC58217yxC) {
        Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        if (getActivity() instanceof AbstractActivityC33041mov) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).removeDisposable(interfaceC58217yxC);
        }
    }

    public final void markRefreshCompleted() {
        InterfaceC33014moU interfaceC33014moU = this.mRefreshCommander;
        if (interfaceC33014moU != null && this.mRefreshToken != null) {
            Intrinsics.copydefault(interfaceC33014moU);
            java.lang.Object obj = this.mRefreshToken;
            Intrinsics.copydefault(obj);
            interfaceC33014moU.onRefreshCompleted(obj);
            return;
        }
        getTAG();
        getTAG();
    }

    public final boolean setRootViewVisible(boolean z) {
        android.view.View view = getView();
        if (view == null) {
            return false;
        }
        int visibility = view.getVisibility();
        if (z && visibility != 0) {
            view.setVisibility(0);
        } else if (!z && visibility == 0) {
            view.setVisibility(8);
        }
        return true;
    }

    public final boolean isRootViewVisible() {
        android.view.View view = getView();
        return view != null && view.getVisibility() == 0;
    }

    public final android.os.Bundle ensureArguments() {
        if (getArguments() == null) {
            setArguments(new android.os.Bundle());
        }
        android.os.Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        return bundleRequireArguments;
    }

    public java.lang.String getQPLSourceName() {
        java.lang.String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    public final void addLoadingAppearQPL() {
        this.isLoadingAppear = true;
        getOkQPL().copydefault(QPLType.LIFE_CYCLE, QPLMarker.LOADING_APPEAR, getQPLSourceName(), java.lang.System.currentTimeMillis());
    }

    public final void addLoadingDisappearQPL() {
        if (this.isLoadingAppear) {
            this.isLoadingAppear = false;
            getOkQPL().copydefault(QPLType.LIFE_CYCLE, QPLMarker.LOADING_DISAPPEAR, getQPLSourceName(), java.lang.System.currentTimeMillis());
        }
    }
}
