package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44078sCn {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sCo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44078sCn.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sCp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44078sCn.OLrzqt();
        }
    });

    @yCM
    public C44078sCn() {
    }

    public final Calendar EZpvd() {
        return (Calendar) this.copydefault.getValue();
    }

    public static final Calendar AEQbTJ() {
        return Calendar.getInstance();
    }

    public final SimpleDateFormat AhwBna() {
        return (SimpleDateFormat) this.OLrzqt.getValue();
    }

    public static final SimpleDateFormat OLrzqt() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZZZZZ", java.util.Locale.getDefault());
    }

    public final kotlin.Pair<FormElementDisplayModel, ElementValue.ElementString> EZpvd(@NotNull FormElementDisplayModel formElementDisplayModel, @NotNull ExtraFormData.DateInfo dateInfo) {
        Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        Intrinsics.checkNotNullParameter(dateInfo, "");
        EZpvd().set(dateInfo.AEQbTJ(), dateInfo.EZpvd(), dateInfo.copydefault(), dateInfo.OLrzqt(), dateInfo.KWHzl(), 0);
        Date time = EZpvd().getTime();
        java.lang.String str = AhwBna().format(time);
        Intrinsics.copydefault(time);
        FormElementDisplayModel formElementDisplayModelCopy$default = FormElementDisplayModel.copy$default(formElementDisplayModel, null, null, false, null, pTA.format$default(time, OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), null, dateInfo, 47, null);
        Intrinsics.copydefault((java.lang.Object) str);
        return C56390yDp.OLrzqt(formElementDisplayModelCopy$default, new ElementValue.ElementString(str));
    }
}
