package o;

import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;

/* JADX INFO: renamed from: o.ain, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7384ain<U extends UDViewGroup> extends InterfaceC7383aim<U> {
    ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity);

    ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity);

    void bringSubviewToFront(UDView uDView);

    void sendSubviewToBack(UDView uDView);
}
