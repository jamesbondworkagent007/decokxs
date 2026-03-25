package o;

import com.okinc.okapm.okqpl.QPLEvent;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42531rWh extends AbstractC42536rWm {
    public final InterfaceC42542rWs OLrzqt;

    public C42531rWh(@NotNull InterfaceC42542rWs interfaceC42542rWs) {
        Intrinsics.checkNotNullParameter(interfaceC42542rWs, "");
        this.OLrzqt = interfaceC42542rWs;
    }

    @Override // o.AbstractC42536rWm
    public void AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC42542rWs interfaceC42542rWs = this.OLrzqt;
        java.lang.String strEZpvd = EZpvd();
        java.lang.String value = QPLType.LIFE_CYCLE.getValue();
        java.lang.String value2 = QPLMarker.BEGIN.getValue();
        if (str.length() == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            str = AEQbTJ(stackTrace);
        }
        interfaceC42542rWs.AEQbTJ(new QPLEvent(strEZpvd, value, value2, str, j, null, 32, null));
    }

    @Override // o.AbstractC42536rWm
    public void copydefault(@NotNull QPLType qPLType, @NotNull QPLMarker qPLMarker, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(qPLType, "");
        Intrinsics.checkNotNullParameter(qPLMarker, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(qPLType, qPLMarker, str, j, null);
    }

    @Override // o.AbstractC42536rWm
    public void OLrzqt(@NotNull QPLType qPLType, @NotNull QPLMarker qPLMarker, @NotNull java.lang.String str, long j, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(qPLType, "");
        Intrinsics.checkNotNullParameter(qPLMarker, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (qPLType == QPLType.NETWORK) {
            return;
        }
        java.lang.String strCopydefault = qPLType == QPLType.NETWORKV2 ? C42549rWz.copydefault() : EZpvd();
        java.lang.String value = qPLType.getValue();
        java.lang.String value2 = qPLMarker.getValue();
        if (str.length() == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            strAEQbTJ = AEQbTJ(stackTrace);
        } else {
            strAEQbTJ = str;
        }
        QPLEvent qPLEvent = new QPLEvent(strCopydefault, value, value2, strAEQbTJ, j, map);
        if (qPLType == QPLType.LIFE_CYCLE) {
            C42543rWt c42543rWt = C42543rWt.KWHzl;
            if (!c42543rWt.DbNXlk()) {
                c42543rWt.fetchVPNInfo();
                java.lang.String strCopydefault2 = c42543rWt.copydefault();
                if (strCopydefault2 != null) {
                    this.OLrzqt.AEQbTJ(QPLEvent.copy$default(qPLEvent, strCopydefault2, null, null, null, 0L, null, 62, null));
                }
            }
        }
        this.OLrzqt.AEQbTJ(qPLEvent);
    }

    @Override // o.AbstractC42536rWm
    public void EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC42542rWs interfaceC42542rWs = this.OLrzqt;
        java.lang.String strEZpvd = EZpvd();
        java.lang.String value = QPLType.LIFE_CYCLE.getValue();
        java.lang.String value2 = QPLMarker.END.getValue();
        if (str.length() == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            str = AEQbTJ(stackTrace);
        }
        interfaceC42542rWs.AEQbTJ(new QPLEvent(strEZpvd, value, value2, str, j, null, 32, null));
    }
}
