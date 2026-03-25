package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.inappbanner.listener.NotificationClickInterceptor$handleNotificationViewed$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.InterfaceC46936tga;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44638sah implements InterfaceC46936tga {
    public final Gson EZpvd;
    public final C46938tgc KWHzl;
    public final C42601rYx OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46936tga
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    @yCM
    public C44638sah(@NotNull C42601rYx c42601rYx, @NotNull C46938tgc c46938tgc, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        Intrinsics.checkNotNullParameter(c46938tgc, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.OLrzqt = c42601rYx;
        this.KWHzl = c46938tgc;
        this.EZpvd = gson;
        this.copydefault = "NotificationClickInterceptor";
    }

    @Override // o.InterfaceC46936tga
    public int KWHzl() {
        return InterfaceC46936tga.Activity.AEQbTJ(this);
    }

    public final void AEQbTJ() {
        this.KWHzl.copydefault(this);
    }

    @Override // o.InterfaceC46936tga
    public boolean OLrzqt(@NotNull C46941tgf c46941tgf) {
        Intrinsics.checkNotNullParameter(c46941tgf, "");
        copydefault(c46941tgf);
        return false;
    }

    public final void copydefault(C46941tgf c46941tgf) {
        try {
            java.lang.String strOptString = c46941tgf.KWHzl().optString(MetricsSQLiteCacheKt.METRICS_PARAMS);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString)) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new NotificationClickInterceptor$handleNotificationViewed$1$1$1(this, c46941tgf, (C44641sak) this.EZpvd.fromJson(strOptString, C44641sak.class), null), 3, null);
            }
        } catch (java.lang.Exception unused) {
            pUU.EZpvd(this.copydefault, "Failed to parse notification data - " + c46941tgf);
        }
    }
}
