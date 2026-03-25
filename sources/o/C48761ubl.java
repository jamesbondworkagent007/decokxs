package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.referral.bean.ReferralFooterInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C48824ucv;
import o.InterfaceC48694uaX;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48761ubl extends AbstractC43215rlA implements InterfaceC48694uaX {
    @Override // o.InterfaceC48694uaX
    public void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        gotoMLNReferralHome$default(this, activity, null, 2, null);
    }

    @Override // o.InterfaceC48694uaX
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        gotoMLNReferralHome$default(this, context, null, 2, null);
    }

    @Override // o.InterfaceC48694uaX
    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(activity, bundle.containsKey("data") ? bundle.getString("data", "") : "");
    }

    public static /* synthetic */ void gotoMLNReferralHome$default(C48761ubl c48761ubl, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c48761ubl.copydefault(context, str);
    }

    public final void copydefault(android.content.Context context, java.lang.String str) {
        if (!C43453rpa.AEQbTJ.KWHzl(context)) {
            C55326xho.toast$default(C48824ucv.Application.OLrzqt, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (!((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().values()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                return;
            }
            return;
        }
        C8136awz.EZpvd.copydefault(context, "/referral/route", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", "OKReferralHomeVC"), C56390yDp.OLrzqt("sourceFrom", "homepage"), C56390yDp.OLrzqt("pageanim", "push"), C56390yDp.OLrzqt("minversion", "6.64.0"), C56390yDp.OLrzqt("data", str)));
    }

    @Override // o.InterfaceC48694uaX
    public void KWHzl(@NotNull android.content.Context context, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().values()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        } else {
            InterfaceC48694uaX.StateListAnimator.gotoRewardCenter$default(this, context, 0, 0, 6, null);
        }
    }

    @Override // o.InterfaceC48694uaX
    public AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C48751ubb.copydefault.AEQbTJ().KWHzl(str, str2);
    }

    @Override // o.InterfaceC48694uaX
    public void EZpvd(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        kOE koe = (kOE) C43251rlk.OLrzqt(kOE.class);
        if (koe != null) {
            koe.AEQbTJ(context, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tab", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))), C56390yDp.OLrzqt("secondTab", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)))));
        }
    }

    @Override // o.InterfaceC48694uaX
    public ReferralFooterInfo OLrzqt() {
        return C48808ucf.copydefault.gEmmrt();
    }
}
