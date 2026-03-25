package o;

import com.okinc.kline.library.template.TemplateSetting;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oUV {
    public java.lang.Double KWHzl;
    public java.lang.Double OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oUX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oUV.copydefault();
        }
    });
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oUV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final C36246oUr copydefault() {
        return C36246oUr.copydefault();
    }

    public final C36246oUr AEQbTJ() {
        return (C36246oUr) this.copydefault.getValue();
    }

    public void KWHzl(@NotNull C36312oXc c36312oXc, @NotNull java.lang.String str) {
        double dSubD$default;
        int i;
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        Intrinsics.checkNotNullParameter(str, "");
        oWC owc = AEQbTJ().iwGUEr().QVAiDq().get("ds0.m");
        if (owc == null) {
            return;
        }
        if (C33129mqd.gEmmrt(str, java.lang.Double.valueOf(owc.DbNXlk())) && C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(owc.AkhnZx()))) {
            return;
        }
        AEQbTJ().DbNXlk("YScale");
        AEQbTJ().fIwbmz("YMove");
        AEQbTJ().iwGUEr().KWHzl("Move");
        C36250oUv c36250oUvDbNXlk = c36312oXc.DbNXlk();
        int height = c36312oXc.DbNXlk().getHeight() - (AEQbTJ().accept() * ((c36250oUvDbNXlk == null || (templateSettingWlaJM = c36250oUvDbNXlk.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames.size()));
        double dMulD$default = C33129mqd.mulD$default(java.lang.Double.valueOf(C33129mqd.addD$default(java.lang.Double.valueOf(owc.DbNXlk()), java.lang.Double.valueOf(owc.AkhnZx()), null, null, null, 14, null)), java.lang.Double.valueOf(0.5d), null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(owc.DbNXlk()))) {
            dSubD$default = C33129mqd.subD$default(str, java.lang.Double.valueOf(dMulD$default), null, null, null, 14, null);
            i = height / 3;
        } else {
            dSubD$default = C33129mqd.subD$default(java.lang.Double.valueOf(dMulD$default), str, null, null, null, 14, null);
            i = height / 3;
        }
        double d = (((double) height) * (dSubD$default / ((double) i))) / ((double) 2);
        double dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dMulD$default), java.lang.Double.valueOf(d), null, null, null, 14, null);
        double dSubD$default2 = C33129mqd.subD$default(java.lang.Double.valueOf(dMulD$default), java.lang.Double.valueOf(d), null, null, null, 14, null);
        pUU.KWHzl("RangeHelper", "resetScaleForYAxis for range(" + dSubD$default2 + "， " + dAddD$default + ")");
        AEQbTJ().EZpvd(dAddD$default, dSubD$default2, c36312oXc.DbNXlk().isConnected());
        AEQbTJ().Ufzxmz();
        this.OLrzqt = java.lang.Double.valueOf(dSubD$default2);
        this.KWHzl = java.lang.Double.valueOf(dAddD$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull C36312oXc c36312oXc, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        oWC owc = AEQbTJ().iwGUEr().QVAiDq().get("ds0.m");
        if (owc == null) {
            return;
        }
        double dDbNXlk = owc.DbNXlk();
        double dAkhnZx = owc.AkhnZx();
        if (C33129mqd.gEmmrt(str2, java.lang.Double.valueOf(dDbNXlk)) && C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(dAkhnZx))) {
            double dAbs = java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.subS$default(java.lang.Double.valueOf(dDbNXlk), str2, null, null, null, 14, null)));
            double dAbs2 = java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.subS$default(str, java.lang.Double.valueOf(dAkhnZx), null, null, null, 14, null)));
            pUU.KWHzl("RangeHelper", "between range, minPrice " + str + " (gap: " + dAbs2 + "), maxPrice " + str2 + " (gap: " + dAbs + ")");
            if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAbs), java.lang.Double.valueOf(dAbs2))) {
            }
        } else if (C33129mqd.copydefault(str2, java.lang.Double.valueOf(dDbNXlk)) && C33129mqd.valueOf(str, java.lang.Double.valueOf(dAkhnZx))) {
            double dAbs3 = java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.subS$default(java.lang.Double.valueOf(dDbNXlk), str2, null, null, null, 14, null)));
            double dAbs4 = java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.subS$default(str, java.lang.Double.valueOf(dAkhnZx), null, null, null, 14, null)));
            pUU.KWHzl("RangeHelper", "over range, minPrice " + str + " (gap: " + dAbs4 + "), maxPrice " + str2 + " (gap: " + dAbs3 + ")");
            str3 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(dAbs3), java.lang.Double.valueOf(dAbs4)) ? str2 : str;
        } else if (C33129mqd.AEQbTJ(str2, java.lang.Double.valueOf(dDbNXlk))) {
            pUU.KWHzl("RangeHelper", "above range, maxPrice is " + str2 + ", rangeMax is " + dDbNXlk);
        } else if (C33129mqd.gEmmrt(str, java.lang.Double.valueOf(dAkhnZx))) {
            pUU.KWHzl("RangeHelper", "below range, minPrice is " + str + ", rangeMin is " + dAkhnZx);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return;
        }
        KWHzl(c36312oXc, str3);
    }

    public void copydefault(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        if (this.OLrzqt == null || this.KWHzl == null) {
            return;
        }
        AEQbTJ().DbNXlk("YScale");
        AEQbTJ().fIwbmz("YMove");
        AEQbTJ().iwGUEr().KWHzl("Move");
        C36246oUr c36246oUrAEQbTJ = AEQbTJ();
        java.lang.Double d = this.KWHzl;
        Intrinsics.copydefault(d);
        double dDoubleValue = d.doubleValue();
        java.lang.Double d2 = this.OLrzqt;
        Intrinsics.copydefault(d2);
        c36246oUrAEQbTJ.EZpvd(dDoubleValue, d2.doubleValue(), c36312oXc.DbNXlk().isConnected());
        AEQbTJ().Ufzxmz();
    }
}
