package o;

import com.contrarywind.adapter.WheelAdapter;
import java.text.DateFormatSymbols;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.axC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8140axC implements WheelAdapter<java.lang.String> {
    public java.util.List<java.lang.String> AEQbTJ;
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.contrarywind.adapter.WheelAdapter
    public int getItemsCount() {
        return (this.OLrzqt - this.EZpvd) + 1;
    }

    public C8140axC(int i, int i2) {
        this.EZpvd = i;
        this.OLrzqt = i2;
        java.lang.String[] shortMonths = DateFormatSymbols.getInstance(pSC.AEQbTJ.AEQbTJ()).getShortMonths();
        Intrinsics.checkNotNullExpressionValue(shortMonths, "");
        this.AEQbTJ = yDV.gHZMYf(shortMonths);
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // com.contrarywind.adapter.WheelAdapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i) {
        java.lang.String str = this.AEQbTJ.get((this.EZpvd + i) - 1);
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX DEBUG: Method merged with bridge method: indexOf(Ljava/lang/Object;)I */
    @Override // com.contrarywind.adapter.WheelAdapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int indexOf(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        return (this.AEQbTJ.indexOf(str) - this.EZpvd) + 1;
    }
}
