package com.okinc.im.config.page;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ServiceName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ServiceName[] $VALUES;
    private final String serviceName;
    public static final ServiceName GIFT_SERVICE = new ServiceName("GIFT_SERVICE", 0, CustomMessageData.SERVICE_NAME_CRYPTO_GIFT);
    public static final ServiceName P2P = new ServiceName(CustomMessageData.SERVICE_NAME_P2P, 1, CustomMessageData.SERVICE_NAME_P2P);
    public static final ServiceName ONE_TO_ONE_PAYMENT = new ServiceName("ONE_TO_ONE_PAYMENT", 2, CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT);
    public static final ServiceName LIVE_STREAM = new ServiceName("LIVE_STREAM", 3, CustomMessageData.SERVICE_NAME_LIVE_STREAM);
    public static final ServiceName VIP_ACCESS = new ServiceName("VIP_ACCESS", 4, CustomMessageData.SERVICE_NAME_VIP_ACCESS);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ServiceName[] $values() {
        return new ServiceName[]{GIFT_SERVICE, P2P, ONE_TO_ONE_PAYMENT, LIVE_STREAM, VIP_ACCESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ServiceName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceName() {
        return this.serviceName;
    }

    private ServiceName(String str, int i, String str2) {
        this.serviceName = str2;
    }

    static {
        ServiceName[] serviceNameArr$values = $values();
        $VALUES = serviceNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(serviceNameArr$values);
    }

    public static ServiceName valueOf(String str) {
        return (ServiceName) Enum.valueOf(ServiceName.class, str);
    }

    public static ServiceName[] values() {
        return (ServiceName[]) $VALUES.clone();
    }
}
