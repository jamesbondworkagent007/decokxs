package o;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_find.data.UnitType;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34831njq extends ValueFormatter {
    public final boolean AEQbTJ;
    public UnitType KWHzl;
    public final java.util.List<java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(UnitType unitType) {
        this.KWHzl = unitType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.util.List<java.lang.Long>, boolean):void (m)] (LINE:9) call: o.njq.<init>(java.util.List, boolean):void type: THIS */
    public /* synthetic */ C34831njq(java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z);
    }

    public C34831njq(@NotNull java.util.List<java.lang.Long> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = z;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
        long jLongValue;
        int i = (int) f;
        if (i < 0 || i >= this.copydefault.size()) {
            return "";
        }
        if (this.AEQbTJ) {
            java.util.List<java.lang.Long> list = this.copydefault;
            jLongValue = list.get((list.size() - 1) - i).longValue();
        } else {
            jLongValue = this.copydefault.get(i).longValue();
        }
        UnitType unitType = this.KWHzl;
        java.lang.Integer type = unitType != null ? unitType.getType() : null;
        return (type != null && type.intValue() == 1) ? pTA.formatTime$default(new Date(jLongValue), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null) : pTA.formatDate$default(new Date(jLongValue), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
    }
}
