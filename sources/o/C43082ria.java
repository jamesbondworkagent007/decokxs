package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.lt.SIApplication;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.OKSlidingTabLayout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C7325ahh;
import o.C8010aue;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ria, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43082ria implements InterfaceC7340ahw {
    public static int KWHzl;
    public static java.lang.String OLrzqt;
    public static final C43082ria EZpvd = new C43082ria();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rid
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43082ria.KWHzl();
        }
    });
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return OLrzqt;
    }

    private C43082ria() {
    }

    public final java.util.ArrayList<InterfaceC7340ahw> copydefault() {
        return (java.util.ArrayList) AEQbTJ.getValue();
    }

    public static final java.util.ArrayList KWHzl() {
        return new java.util.ArrayList();
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
            OLrzqt = absolutePath;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) absolutePath)) {
                java.lang.String str = OLrzqt;
                Intrinsics.copydefault((java.lang.Object) str);
                if (!C59449zhJ.endsWith$default(str, "/", false, 2, null)) {
                    OLrzqt = OLrzqt + "/";
                }
            }
            OLrzqt = OLrzqt + "MLN/";
        } catch (java.lang.Exception e) {
            C7326ahi.gEmmrt.append(e.getMessage());
            pUU.OLrzqt("MlnInit", "SDCARD_PATH init failed", e);
        }
    }

    public static /* synthetic */ void initMLN$default(android.content.Context context, InterfaceC7340ahw interfaceC7340ahw, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC7340ahw = null;
        }
        copydefault(context, interfaceC7340ahw);
    }

    public static final void copydefault(@NotNull android.content.Context context, InterfaceC7340ahw interfaceC7340ahw) {
        Intrinsics.checkNotNullParameter(context, "");
        if (KWHzl == 2) {
            if (interfaceC7340ahw != null) {
                interfaceC7340ahw.OLrzqt();
            }
        } else {
            if (interfaceC7340ahw != null) {
                EZpvd.copydefault().add(interfaceC7340ahw);
            }
            if (KWHzl == 0) {
                KWHzl = 1;
                EZpvd.copydefault(context);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.asf.trackMlnInit$default(java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final void copydefault(android.content.Context context) {
        try {
            SIApplication.isColdBoot = true;
            boolean z = SPUtils.getBoolean("lua_debug_key_mode", false, "mln");
            if (z) {
                UDView.QKVWgx = z;
                OKSlidingTabLayout.KWHzl = z;
            }
            boolean z2 = SPUtils.getBoolean("lua_debug_mode", false, "mln");
            C43148rjn.KWHzl();
            C7325ahh c7325ahhCopydefault = C7326ahi.copydefault(context, z2);
            C7789aqU c7789aqUAEQbTJ = new C7789aqU(context).copydefault(OLrzqt).OLrzqt(OLrzqt + TtmlNode.TAG_IMAGE).KWHzl(OLrzqt + "cache").EZpvd(OLrzqt + "g_res").AEQbTJ(OLrzqt + "test");
            C43192rke c43192rke = C43192rke.values;
            C7325ahh c7325ahhCopydefault2 = c7325ahhCopydefault.AEQbTJ(c7789aqUAEQbTJ.OLrzqt(c43192rke.isConnected()).copydefault(c43192rke).KWHzl(c43192rke).KWHzl()).AEQbTJ(new C43107riz(context)).copydefault(false);
            C7325ahh.Application[] applicationArrValueOf = C43148rjn.valueOf();
            C7325ahh c7325ahhEZpvd = c7325ahhCopydefault2.EZpvd((C7325ahh.Application[]) java.util.Arrays.copyOf(applicationArrValueOf, applicationArrValueOf.length));
            C8010aue.LoaderManager[] loaderManagerArrDjBIcL = C43148rjn.djBIcL();
            C7325ahh c7325ahhAEQbTJ = c7325ahhEZpvd.AEQbTJ((C8010aue.LoaderManager[]) java.util.Arrays.copyOf(loaderManagerArrDjBIcL, loaderManagerArrDjBIcL.length));
            C8010aue.AssistContent[] assistContentArrGEmmrt = C43148rjn.gEmmrt();
            C7325ahh c7325ahhAEQbTJ2 = c7325ahhAEQbTJ.AEQbTJ((C8010aue.AssistContent[]) java.util.Arrays.copyOf(assistContentArrGEmmrt, assistContentArrGEmmrt.length));
            C7325ahh.TaskDescription[] taskDescriptionArrAEQbTJ = C43148rjn.AEQbTJ();
            C7325ahh c7325ahhEZpvd2 = c7325ahhAEQbTJ2.EZpvd((C7325ahh.TaskDescription[]) java.util.Arrays.copyOf(taskDescriptionArrAEQbTJ, taskDescriptionArrAEQbTJ.length));
            java.lang.Class<?>[] clsArrEZpvd = C43148rjn.EZpvd();
            c7325ahhEZpvd2.KWHzl((java.lang.Class[]) java.util.Arrays.copyOf(clsArrEZpvd, clsArrEZpvd.length)).KWHzl(C43148rjn.copydefault()).AEQbTJ(this).AEQbTJ(false);
            C7324ahg.EZpvd(9801);
            C43043rho c43043rhoOLrzqt = C43047rhs.AEQbTJ.OLrzqt();
            c43043rhoOLrzqt.OLrzqt(context);
            c43043rhoOLrzqt.copydefault(new Function2() { // from class: o.rib
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C43082ria.AEQbTJ((android.content.Context) obj, (java.util.Map) obj2);
                }
            });
            C43292rmY.OLrzqt.copydefault(C7326ahi.gEmmrt());
            C7906asf.trackMlnInit$default("1", null, 2, null);
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("MlnInit", "initMLN failed", e);
            C7906asf.KWHzl("0", C7326ahi.gEmmrt.toString());
            C6777aVl.Companion.OLrzqt(new java.lang.Exception("Mln init exception", e), null, java.lang.Boolean.TRUE);
            EZpvd(e);
        }
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.Map map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ViewOnClickListenerC43076riU.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        intent.putExtras(C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0])));
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC7340ahw
    public void OLrzqt() {
        KWHzl = 2;
        java.util.Iterator<T> it = copydefault().iterator();
        while (it.hasNext()) {
            ((InterfaceC7340ahw) it.next()).OLrzqt();
        }
        copydefault().clear();
    }

    @Override // o.InterfaceC7340ahw
    public void EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        KWHzl = 0;
        java.util.Iterator<T> it = copydefault().iterator();
        while (it.hasNext()) {
            ((InterfaceC7340ahw) it.next()).EZpvd(th);
        }
    }
}
