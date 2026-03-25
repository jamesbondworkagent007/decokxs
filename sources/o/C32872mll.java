package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.common.whitelist.RemoteInterceptor;
import com.okinc.rxutils.RxBus;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.C32883mlw;
import o.C32895mmH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32872mll extends AbstractC32875mlo {
    public static InterfaceC32874mln AEQbTJ;
    public static final java.util.ArrayList<TrackChannel> AYXKKw;
    public static final int EZpvd;
    public static android.content.Context KWHzl;
    public static final C32872mll OLrzqt = new C32872mll();
    public static java.util.List<TrackChannel> copydefault;

    private C32872mll() {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    static {
        java.util.ArrayList<TrackChannel> arrayListCopydefault = yDY.copydefault(TrackChannel.OKStatistics, TrackChannel.Appsflyer);
        AYXKKw = arrayListCopydefault;
        copydefault = new CopyOnWriteArrayList(arrayListCopydefault);
        EZpvd = 8;
    }

    @Override // o.AbstractC32875mlo, o.AbstractC32806mkY
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (KWHzl == null) {
            KWHzl = context.getApplicationContext();
            KWHzl();
            KWHzl(C32868mlh.OLrzqt.copydefault());
            super.KWHzl(context);
            AEQbTJ();
            RxBus.KWHzl("analytics_init_end");
        }
    }

    public final void KWHzl() {
        EZpvd("OKStatistics", C6862aXQ.AEQbTJ);
        java.lang.String strFetchVPNInfo = C32864mld.OLrzqt.fetchVPNInfo();
        android.content.Context context = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strFetchVPNInfo)) {
            pUU.EZpvd("track", "appsFlyer Dev Key:" + strFetchVPNInfo);
            android.content.Context context2 = KWHzl;
            if (context2 == null) {
                Intrinsics.gEmmrt("");
                context2 = null;
            }
            C32851mlQ c32851mlQ = new C32851mlQ(strFetchVPNInfo, (android.app.Application) context2);
            AEQbTJ = c32851mlQ;
            OLrzqt.EZpvd("Appsflyer", c32851mlQ);
        } else {
            pUU.valueOf("track", "appsFlyer Dev Key is empty:" + strFetchVPNInfo + ",unable init SDK");
        }
        C32883mlw.TaskDescription taskDescription = C32883mlw.Companion;
        android.content.Context context3 = KWHzl;
        if (context3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            context = context3;
        }
        C32883mlw c32883mlwKWHzl = taskDescription.KWHzl(context);
        if (c32883mlwKWHzl != null) {
            OLrzqt.EZpvd("Amplitude", c32883mlwKWHzl);
        }
        EZpvd("DataFinder", C32859mlY.KWHzl);
    }

    public final void KWHzl(TrackChannel[] trackChannelArr) {
        copydefault.clear();
        C56406yEe.KWHzl(copydefault, trackChannelArr);
    }

    public final void OLrzqt() {
        if (KWHzl != null) {
            C32883mlw.TaskDescription taskDescription = C32883mlw.Companion;
            android.content.Context context = KWHzl;
            android.content.Context context2 = null;
            if (context == null) {
                Intrinsics.gEmmrt("");
                context = null;
            }
            C32883mlw c32883mlwKWHzl = taskDescription.KWHzl(context);
            if (c32883mlwKWHzl == null || !c32883mlwKWHzl.hDKMBd()) {
                return;
            }
            android.content.Context context3 = KWHzl;
            if (context3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                context2 = context3;
            }
            C32883mlw c32883mlwKWHzl2 = taskDescription.KWHzl(context2);
            if (c32883mlwKWHzl2 != null) {
                c32883mlwKWHzl2.DbNXlk();
            }
        }
    }

    public final void AEQbTJ() {
        C32895mmH.TaskDescription taskDescription = C32895mmH.Companion;
        android.content.Context context = KWHzl;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        java.lang.String strAEQbTJ = taskDescription.AEQbTJ(context);
        C32895mmH c32895mmH = new C32895mmH(strAEQbTJ, InterfaceC6941aYq.Companion.EZpvd(), null, 4, null);
        for (TrackChannel trackChannel : yDY.gEmmrt(TrackChannel.Amplitude, TrackChannel.DataFinder, TrackChannel.Appsflyer)) {
            C32872mll c32872mll = OLrzqt;
            InterfaceC32874mln interfaceC32874mlnEZpvd = c32872mll.EZpvd(trackChannel.name());
            if (interfaceC32874mlnEZpvd != null) {
                RemoteInterceptor remoteInterceptor = new RemoteInterceptor(strAEQbTJ, interfaceC32874mlnEZpvd, null, 4, null);
                c32895mmH.KWHzl(trackChannel, remoteInterceptor);
                c32872mll.copydefault(remoteInterceptor);
            }
        }
        C54819xWm.KWHzl().AEQbTJ(c32895mmH);
    }

    public final TrackChannel[] EZpvd() {
        return (TrackChannel[]) copydefault.toArray(new TrackChannel[0]);
    }
}
