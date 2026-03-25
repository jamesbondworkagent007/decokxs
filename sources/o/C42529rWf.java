package o;

import com.okinc.okapm.okqpl.QPLEvent;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42529rWf extends AbstractC42536rWm {
    public C42530rWg AEQbTJ;
    public final java.util.List<QPLEvent> EZpvd;
    public boolean KWHzl;
    public final InterfaceC42542rWs OLrzqt;

    public C42529rWf(@NotNull InterfaceC42542rWs interfaceC42542rWs) {
        Intrinsics.checkNotNullParameter(interfaceC42542rWs, "");
        this.OLrzqt = interfaceC42542rWs;
        this.EZpvd = Collections.synchronizedList(new java.util.ArrayList());
    }

    @Override // o.AbstractC42536rWm
    public void AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd();
        java.lang.String value = QPLType.LIFE_CYCLE.getValue();
        java.lang.String value2 = QPLMarker.BEGIN.getValue();
        if (str.length() == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            str = AEQbTJ(stackTrace);
        }
        QPLEvent qPLEvent = new QPLEvent(strEZpvd, value, value2, str, j, null, 32, null);
        this.EZpvd.add(qPLEvent);
        pUU.EZpvd("OKQPLReporter", "Queued record for processing " + qPLEvent);
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
        try {
            this.EZpvd.add(qPLEvent);
            pUU.EZpvd("OKQPLReporter", "Queued record for processing " + qPLEvent);
            if (!this.KWHzl && qPLMarker == QPLMarker.PAUSE) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List<QPLEvent> list = this.EZpvd;
                Intrinsics.checkNotNullExpressionValue(list, "");
                synchronized (list) {
                    java.util.Iterator<QPLEvent> it = this.EZpvd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QPLEvent.copy$default(it.next(), null, null, null, null, 0L, null, 63, null));
                    }
                    Unit unit = Unit.INSTANCE;
                }
                this.OLrzqt.AEQbTJ(arrayList, this.AEQbTJ);
                this.KWHzl = true;
            }
            if (this.KWHzl && qPLMarker == QPLMarker.DESTROYED) {
                this.EZpvd.clear();
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl("OKQPLReporter", "exception while adding marker", e);
        }
    }

    @Override // o.AbstractC42536rWm
    public void EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd();
        java.lang.String value = QPLType.LIFE_CYCLE.getValue();
        java.lang.String value2 = QPLMarker.END.getValue();
        if (str.length() == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            str = AEQbTJ(stackTrace);
        }
        QPLEvent qPLEvent = new QPLEvent(strEZpvd, value, value2, str, j, null, 32, null);
        this.EZpvd.add(qPLEvent);
        pUU.EZpvd("OKQPLReporter", "Queued record for processing " + qPLEvent);
    }

    public final void EZpvd(long j, long j2, long j3, long j4, long j5, long j6) {
        this.AEQbTJ = new C42530rWg(j2 + j, j6 + j5, j3, j4);
    }
}
