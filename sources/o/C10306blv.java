package o;

import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetItem;
import com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10306blv {
    public final android.content.Context OLrzqt;

    @yCM
    public C10306blv(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    public final UtxoAssetDisplayItem AEQbTJ(@NotNull UtxoAssetItem utxoAssetItem) {
        Intrinsics.checkNotNullParameter(utxoAssetItem, "");
        return new UtxoAssetDisplayItem(utxoAssetItem.EZpvd(), utxoAssetItem.AhwBna(), EZpvd(utxoAssetItem.AEQbTJ(), utxoAssetItem.KWHzl(), utxoAssetItem.djBIcL(), utxoAssetItem.valueOf()), utxoAssetItem.copydefault(), AEQbTJ(utxoAssetItem.AEQbTJ(), utxoAssetItem.OLrzqt()));
    }

    public final java.lang.String EZpvd(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (i == 2) {
            return str;
        }
        if (str3.length() == 0) {
            return str2;
        }
        return pTB.formatLocalized$default(C33129mqd.formatS$default(str3, null, null, null, 7, null), null, 1, null) + " " + str2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bmi.formatCurrencyData$default(o.bmi, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, int, java.lang.Object):java.lang.String */
    public final java.lang.String AEQbTJ(int i, java.lang.String str) {
        if (i == 2 && str.length() == 0) {
            java.lang.String string = this.OLrzqt.getString(C13754dXa.FragmentManager.fHqPtx);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (C33129mqd.OLrzqt(C33129mqd.EZpvd(str), BigDecimal.ZERO)) {
            java.lang.String string2 = this.OLrzqt.getString(C13754dXa.FragmentManager.fHqPtx);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        return C10346bmi.formatCurrencyData$default(C10346bmi.KWHzl, str, null, null, null, 14, null);
    }
}
