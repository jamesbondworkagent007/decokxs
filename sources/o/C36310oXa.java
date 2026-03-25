package o;

import android.graphics.RectF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.components.track.TrackChannel;
import com.okinc.kline.library.layout.ChartArea;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36310oXa extends oWO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public java.lang.String djBIcL;
    public boolean isConnected;
    public final C36312oXc values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateFullScreenMove";
    }

    public final void KWHzl(java.lang.String str) {
    }

    public C36310oXa(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.values = c36312oXc;
        this.djBIcL = "";
    }

    /* JADX INFO: renamed from: o.oXa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.oWO
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.isConnected = false;
        C36246oUr.copydefault().AEQbTJ();
        if (C36246oUr.copydefault().getNewProxyInstance() == 1 && C36246oUr.copydefault().OLrzqt(motionEvent.getX(), motionEvent.getY()) != null) {
            this.values.DbNXlk().invalidate();
            oWO owo = this.values.AuCTelauCTel;
            Intrinsics.copydefault(owo, "");
            java.lang.String strEZpvd = C36246oUr.copydefault().OLrzqt(motionEvent.getX(), motionEvent.getY()).EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
            ((C36310oXa) owo).OLrzqt(strEZpvd);
        }
        this.values.OLrzqt(motionEvent.getY());
        return super.AhwBna(motionEvent);
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        if (C36246oUr.copydefault().OLrzqt(motionEvent.getX(), motionEvent.getY()) == null) {
            C36246oUr.copydefault().AEQbTJ();
            C36250oUv c36250oUvDbNXlk = this.values.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.EZpvd(false);
            }
            C36312oXc c36312oXc = this.values;
            c36312oXc.EZpvd(c36312oXc.zLjUOn);
            C36250oUv c36250oUvDbNXlk2 = this.values.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.invalidate();
            }
            this.isConnected = false;
            return true;
        }
        C36250oUv c36250oUvDbNXlk3 = this.values.DbNXlk();
        if (c36250oUvDbNXlk3 != null) {
            c36250oUvDbNXlk3.EZpvd(true);
        }
        float y = motionEvent.getY() - this.values.djBIcL();
        KWHzl("======StateFullScreenMove onActionMove========" + y);
        if (!KWHzl(y)) {
            this.values.OLrzqt(motionEvent.getY());
            C36250oUv c36250oUvDbNXlk4 = this.values.DbNXlk();
            if (c36250oUvDbNXlk4 != null) {
                c36250oUvDbNXlk4.invalidate();
            }
            this.isConnected = true;
        }
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        java.util.Collection<ChartArea> collectionValues = C36246oUr.copydefault().zLjUOn().getAreas().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ChartArea) next).EZpvd(), (java.lang.Object) this.djBIcL)) {
                break;
            }
        }
        ChartArea chartArea = (ChartArea) next;
        if (chartArea == null) {
            return true;
        }
        if (new RectF(chartArea.fARcdN().left, chartArea.fARcdN().top - chartArea.EZpvd, chartArea.fARcdN().right, chartArea.fARcdN().bottom + chartArea.EZpvd).contains(motionEvent.getX(), motionEvent.getY())) {
            if (!this.isConnected) {
                return true;
            }
            copydefault();
            return true;
        }
        C36312oXc c36312oXc = this.values;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        C36246oUr.copydefault().AEQbTJ();
        C36250oUv c36250oUvDbNXlk = this.values.DbNXlk();
        if (c36250oUvDbNXlk == null) {
            return false;
        }
        c36250oUvDbNXlk.invalidate();
        return false;
    }

    public final void copydefault() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("KLine_Subindicator_Line_Drag", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl("========setCurrentIndicatorName==========");
        KWHzl(str);
        this.djBIcL = str;
    }

    public final boolean KWHzl(float f) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collection<ChartArea> collectionValues = c36246oUrCopydefault.values().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (ChartArea chartArea : collectionValues) {
            if (chartArea.valueOf() && !chartArea.EZpvd().equals("ds0.mVOLUME")) {
                Intrinsics.copydefault(chartArea);
                arrayList.add(chartArea);
            }
        }
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ChartArea chartArea2 = (ChartArea) obj;
            KWHzl("======handleDragSubIndicator========");
            KWHzl("areaName" + chartArea2.EZpvd());
            java.lang.String strEZpvd = chartArea2.EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
            if (StringsKt__StringsKt.contains$default(strEZpvd, this.djBIcL, z, 2, (java.lang.Object) null)) {
                chartArea2.AEQbTJ(true);
                KWHzl(TtmlNode.RUBY_BEFORE + chartArea2.djBIcL());
                KWHzl("before distanceY " + f);
                int i2 = i + (-1);
                ChartArea chartArea3 = (ChartArea) arrayList.get(i2);
                KWHzl("before miniArea " + chartArea3.isConnected);
                if (i2 == 0) {
                    if (chartArea3.djBIcL() + f <= chartArea3.isConnected) {
                        int iKWHzl = chartArea3.KWHzl();
                        chartArea3.OLrzqt(chartArea3.isConnected + chartArea3.AuCTel());
                        chartArea2.copydefault(chartArea2.AuCTel() + (chartArea3.KWHzl() - iKWHzl));
                        KWHzl("极限" + chartArea2.djBIcL());
                        KWHzl("极限之后记录的差值:" + f);
                        return true;
                    }
                    if (chartArea2.djBIcL() - f <= chartArea3.values) {
                        KWHzl("极限 减少" + chartArea2.djBIcL());
                        KWHzl("极限 减少" + chartArea2.values);
                        KWHzl("极限 减少 distanceY" + f);
                        return true;
                    }
                    chartArea3.OLrzqt((int) (chartArea3.KWHzl() + f));
                    chartArea2.copydefault((int) (chartArea2.AuCTel() + f));
                    chartArea2.EZpvd(chartArea2.KWHzl() - chartArea2.AuCTel());
                    KWHzl("第一幅图：高度" + chartArea2.djBIcL());
                    KWHzl("该图最小限制" + chartArea2.values);
                } else {
                    if (chartArea3.djBIcL() + f <= chartArea3.values) {
                        int iKWHzl2 = chartArea3.KWHzl();
                        chartArea3.OLrzqt(chartArea3.values + chartArea3.AuCTel());
                        chartArea2.copydefault(chartArea2.AuCTel() + (chartArea3.KWHzl() - iKWHzl2));
                        KWHzl("极限" + chartArea2.djBIcL());
                        KWHzl("极限之后记录的差值:" + f);
                        return true;
                    }
                    if (chartArea2.djBIcL() - f <= chartArea3.values) {
                        KWHzl("极限 减少" + chartArea2.djBIcL());
                        KWHzl("极限 减少" + chartArea2.values);
                        KWHzl("极限 减少 distanceY" + f);
                        return true;
                    }
                    chartArea3.OLrzqt((int) (chartArea3.KWHzl() + f));
                    chartArea3.EZpvd(chartArea3.KWHzl() - chartArea3.AuCTel());
                    chartArea2.copydefault((int) (chartArea2.AuCTel() + f));
                    chartArea2.EZpvd(chartArea2.KWHzl() - chartArea2.AuCTel());
                    KWHzl("第" + i + "幅图：高度" + chartArea2.djBIcL());
                    int i3 = chartArea2.values;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("该图最小限制");
                    sb.append(i3);
                    KWHzl(sb.toString());
                }
            }
            i++;
            z = false;
        }
        return z;
    }
}
