package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pLR implements InterfaceC43236rlV {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC38081pLn AEQbTJ;
    public final kOG KWHzl;
    public final InterfaceC38084pLq OLrzqt;
    public final InterfaceC43294rma copydefault;

    @yCM
    public pLR(@NotNull InterfaceC43294rma interfaceC43294rma, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull kOG kog) {
        Intrinsics.checkNotNullParameter(interfaceC43294rma, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(kog, "");
        this.copydefault = interfaceC43294rma;
        this.AEQbTJ = interfaceC38081pLn;
        this.OLrzqt = interfaceC38084pLq;
        this.KWHzl = kog;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String queryParameter = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.net.Uri uri = android.net.Uri.parse(interfaceC43232rlR.AEQbTJ());
        if (map.containsKey("deeplink") && C33129mqd.OLrzqt((java.lang.CharSequence) map.getOrDefault("deeplink", "").toString())) {
            queryParameter = uri.getQueryParameter("deeplink");
        }
        if (queryParameter != null && C33129mqd.OLrzqt((java.lang.CharSequence) queryParameter)) {
            EZpvd(context, queryParameter, map);
        } else if (this.AEQbTJ.EZpvd()) {
            EZpvd(map);
        } else {
            OLrzqt(context, interfaceC43232rlR.AEQbTJ(), map);
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        InterfaceC43294rma.Application.processDeeplink$default(this.copydefault, context, "okx://app/web?url=" + str, map, LinkSource.DOWNLOAD_HANDLER, false, new Function1() { // from class: o.pLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pLR.KWHzl((AbstractC43238rlX) obj);
            }
        }, 16, null);
    }

    public final void EZpvd(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        InterfaceC43294rma interfaceC43294rma = this.copydefault;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) "deeplink")) {
                linkedHashMap.put(key, value);
            }
        }
        Unit unit = Unit.INSTANCE;
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, str, linkedHashMap, LinkSource.DOWNLOAD_HANDLER, false, new Function1() { // from class: o.pLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pLR.EZpvd((AbstractC43238rlX) obj);
            }
        }, 16, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        if (map.isEmpty()) {
            this.AEQbTJ.OLrzqt(LinkState.SUCCESS);
        } else if (map.containsKey(RemoteMessageConst.Notification.CHANNEL_ID)) {
            pLF.AEQbTJ(map, this.KWHzl);
            this.AEQbTJ.OLrzqt(LinkState.SUCCESS);
        } else {
            this.AEQbTJ.OLrzqt(LinkState.NO_DEEPLINK_PRESENT);
        }
        this.OLrzqt.EZpvd();
        this.AEQbTJ.OLrzqt();
    }
}
