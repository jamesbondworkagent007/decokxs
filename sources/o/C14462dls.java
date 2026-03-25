package o;

import com.okinc.business.defi.api.bean.SignCheckResponseBean;
import com.okinc.business.defi.api.bean.SignRequestBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC14457dln;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14462dls implements InterfaceC14457dln {
    public final Function1<SignCheckResponseBean, Unit> EZpvd;
    public SignRequestBean KWHzl;
    public android.app.Activity OLrzqt;
    public final android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.SignCheckResponseBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14462dls(android.app.Activity activity, @NotNull android.content.Context context, @NotNull SignRequestBean signRequestBean, @NotNull Function1<? super SignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = activity;
        this.copydefault = context;
        this.KWHzl = signRequestBean;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:android.app.Activity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.app.Activity) : (r1v0 android.app.Activity))
  (r2v0 android.content.Context)
  (r3v0 com.okinc.business.defi.api.bean.SignRequestBean)
  (r4v0 kotlin.jvm.functions.Function1)
 A[MD:(android.app.Activity, android.content.Context, com.okinc.business.defi.api.bean.SignRequestBean, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.SignCheckResponseBean, kotlin.Unit>):void (m)] (LINE:13) call: o.dls.<init>(android.app.Activity, android.content.Context, com.okinc.business.defi.api.bean.SignRequestBean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C14462dls(android.app.Activity activity, android.content.Context context, SignRequestBean signRequestBean, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activity, context, signRequestBean, function1);
    }

    @Override // o.InterfaceC14457dln
    public boolean OLrzqt() {
        return InterfaceC14457dln.Activity.OLrzqt(this);
    }

    @Override // o.InterfaceC14457dln
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Activity activity = this.OLrzqt;
        if (activity != null) {
            activity.finish();
        }
        ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).AEQbTJ(this.copydefault, this.KWHzl, this.EZpvd);
    }
}
