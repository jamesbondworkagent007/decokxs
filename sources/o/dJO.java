package o;

import android.view.View;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJO implements InterfaceC43234rlT {
    public final java.lang.String EZpvd = "DefiWalletCefiBindingHandlerV2";
    public final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (C14728dqt.KWHzl.KWHzl()) {
            java.lang.Object obj = map.get("shortCode");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                return;
            }
            java.util.Map<java.lang.String, ? extends java.lang.Object> mapIsConnected = C56424yEw.isConnected(map);
            mapIsConnected.remove("shortCode");
            Unit unit = Unit.INSTANCE;
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(KWHzl(str, mapIsConnected));
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(this.EZpvd, "OKWallet: showNavigatingToOKXDialog failed: " + thM7380exceptionOrNullimpl.getMessage());
                return;
            }
            return;
        }
        dJJ.copydefault.OLrzqt(context, interfaceC43233rlS.OLrzqt(), map, ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz());
    }

    public final java.lang.Object KWHzl(final java.lang.String str, final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.copydefault.postDelayed(new java.lang.Runnable() { // from class: o.dJR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dJO.AEQbTJ(str, map);
                }
            }, 500L)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void AEQbTJ(final java.lang.String str, final java.util.Map map) {
        final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || activityAEQbTJ.isFinishing() || activityAEQbTJ.isDestroyed()) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityAEQbTJ);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(activityAEQbTJ.getString(C13754dXa.FragmentManager.zuWLRA));
        viewOnClickListenerC54939xaY.EZpvd(activityAEQbTJ.getString(C13754dXa.FragmentManager.ffGIBT));
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DXXBbs, new View.OnClickListener() { // from class: o.dJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dJO.KWHzl(activityAEQbTJ, str, map, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.dJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dJO.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        pUU.EZpvd("DefiWalletCefiBindingHandlerV2", "OKWallet: showNavigatingToOKXDialog show");
    }

    public static final void KWHzl(android.app.Activity activity, java.lang.String str, java.util.Map map, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        pKD pkd = (pKD) C43251rlk.OLrzqt(pKD.class);
        if (pkd != null) {
            dJJ djj = dJJ.copydefault;
            java.lang.String str2 = "https://link.okx.com/ul/" + str;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(C56390yDp.OLrzqt((java.lang.String) entry.getKey(), entry.getValue()));
            }
            kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
            pkd.AEQbTJ(activity, djj.copydefault(str2, (kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]) java.util.Arrays.copyOf(pairArr, pairArr.length)));
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
