package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSD implements sSJ {
    @yCM
    public sSD() {
    }

    @Override // o.sSJ
    public boolean OLrzqt(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return sMS.djBIcL.AYXKKw(wSSendMessageDetailData);
    }

    @Override // o.sSJ
    public boolean AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return !(sMS.djBIcL.copydefault(wSSendMessageDetailData) != null ? Intrinsics.EZpvd(r2.AEQbTJ(), java.lang.Boolean.FALSE) : false);
    }

    @Override // o.sSJ
    public boolean copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return wSSendMessageDetailData.getContentType() == InHouseIMContentType.SystemMessage;
    }
}
