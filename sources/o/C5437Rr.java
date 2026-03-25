package o;

import androidx.core.content.ContextCompat;
import o.InterfaceC5432Rm;

/* JADX INFO: renamed from: o.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5437Rr implements InterfaceC5438Rs {
    @Override // o.InterfaceC5438Rs
    public InterfaceC5432Rm EZpvd(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull InterfaceC5432Rm.ActionBar actionBar) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new C5439Rt(context, actionBar);
        }
        return new RB();
    }
}
